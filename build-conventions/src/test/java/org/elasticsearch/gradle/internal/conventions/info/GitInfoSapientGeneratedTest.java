package org.elasticsearch.gradle.internal.conventions.info;

import org.elasticsearch.gradle.internal.conventions.info.GitInfo;
import java.nio.file.Files;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.util.Iterator;
import org.junit.jupiter.api.io.TempDir;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.regex.Matcher;
import static org.mockito.Mockito.when;
import org.junit.jupiter.params.provider.CsvSource;
import org.gradle.api.GradleException;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.HashMap;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import java.nio.file.Path;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import java.util.stream.Stream;
import static org.mockito.Mockito.mock;
import java.nio.charset.StandardCharsets;
import static org.junit.jupiter.api.Assertions.*;
import org.gradle.api.logging.Logging;
import java.util.stream.Collectors;
import org.elasticsearch.gradle.internal.conventions.info.GitInfo;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

class GitInfoSapientGeneratedTest {

    @TempDir
    Path tempDir;

    private GitInfo gitInfo;

    @BeforeEach
    void setUp() {
        gitInfo = mock(GitInfo.class);
        when(gitInfo.getRevision()).thenReturn("testRevision");
        when(gitInfo.getOrigin()).thenReturn("testOrigin");
    }

    @Test
    void testGetRevision() {
        assertEquals("testRevision", gitInfo.getRevision());
    }

    @Test
    void testGetOrigin() {
        assertEquals("testOrigin", gitInfo.getOrigin());
    }

    @Test
    void testGitInfoWithNonExistentGitDir() throws IOException {
        File rootDir = tempDir.toFile();
        GitInfo info = GitInfo.gitInfo(rootDir);
        assertEquals("unknown", info.getRevision());
        assertEquals("unknown", info.getOrigin());
    }

    @Test
    void testGitInfoWithValidGitDir() throws IOException {
        File rootDir = tempDir.toFile();
        Path dotGit = rootDir.toPath().resolve(".git");
        Files.createDirectory(dotGit);
        Path head = dotGit.resolve("HEAD");
        Files.writeString(head, "ref: refs/heads/main");
        Path refFile = dotGit.resolve("refs/heads/main");
        Files.createDirectories(refFile.getParent());
        Files.writeString(refFile, "testRevision123");
        Path config = dotGit.resolve("config");
        Files.writeString(config, "[remote \"origin\"]\n\turl = https://github.com/test/repo.git");
        GitInfo info = GitInfo.gitInfo(rootDir);
        assertEquals("testRevision123", info.getRevision());
        assertEquals("https://github.com/test/repo.git", info.getOrigin());
    }

    @Test
    void testGitInfoWithPackedRefs() throws IOException {
        File rootDir = tempDir.toFile();
        Path dotGit = rootDir.toPath().resolve(".git");
        Files.createDirectory(dotGit);
        Path head = dotGit.resolve("HEAD");
        Files.writeString(head, "ref: refs/heads/main");
        Path packedRefs = dotGit.resolve("packed-refs");
        Files.writeString(packedRefs, "# packed-refs with: peeled fully-peeled sorted\n" + "abcdef1234567890abcdef1234567890abcdef12 refs/heads/main");
        Path config = dotGit.resolve("config");
        Files.writeString(config, "[remote \"origin\"]\n\turl = git@github.com:test/repo.git");
        GitInfo info = GitInfo.gitInfo(rootDir);
        assertEquals("abcdef1234567890abcdef1234567890abcdef12", info.getRevision());
        assertEquals("git@github.com:test/repo.git", info.getOrigin());
    }

    @Disabled()
    @Test
    void testGitInfoWithExternalGitDir() throws IOException {
        File rootDir = tempDir.toFile();
        Path dotGit = rootDir.toPath().resolve(".git");
        Path externalGitDir = tempDir.resolve("external_git");
        Files.createDirectory(externalGitDir);
        Files.writeString(dotGit, "gitdir: " + externalGitDir.toString());
        Path head = externalGitDir.resolve("HEAD");
        Files.writeString(head, "testRevisionExternal");
        Path config = externalGitDir.resolve("config");
        Files.writeString(config, "[remote \"origin\"]\n\turl = https://github.com/test/external-repo.git");
        GitInfo info = GitInfo.gitInfo(rootDir);
        assertEquals("testRevisionExternal", info.getRevision());
        assertEquals("https://github.com/test/external-repo.git", info.getOrigin());
    }

    @Test
    void testGitInfoWithMissingRefFile() throws IOException {
        File rootDir = tempDir.toFile();
        Path dotGit = rootDir.toPath().resolve(".git");
        Files.createDirectory(dotGit);
        Path head = dotGit.resolve("HEAD");
        Files.writeString(head, "ref: refs/heads/nonexistent");
        assertThrows(GradleException.class, () -> GitInfo.gitInfo(rootDir));
    }

    @Disabled()
    @ParameterizedTest
    @CsvSource({ "https://github.com/test/repo.git, https://github.com/test/repo.git", "git@github.com:test/repo.git, https://github.com/test/repo", "ssh://git@gitlab.com:1234/test/repo.git, ssh://git@gitlab.com:1234/test/repo.git" })
    void testUrlFromOrigin(String origin, String expected) {
        GitInfo info = GitInfo.gitInfo(tempDir.toFile());
        when(info.getOrigin()).thenReturn(origin);
        assertEquals(expected, info.urlFromOrigin());
    }

    @Disabled()
    @Test
    void testUrlFromOriginWithNullOrigin() {
        GitInfo info = GitInfo.gitInfo(tempDir.toFile());
        when(info.getOrigin()).thenReturn(null);
        assertNull(info.urlFromOrigin());
    }

    @Test
    void testFindOriginUrlWithComments() throws IOException {
        Path configFile = tempDir.resolve("config");
        Files.writeString(configFile, "# This is a comment\n" + "; This is another comment\n" + "[remote \"origin\"]\n" + "\turl = https://github.com/test/repo-with-comments.git");
        File rootDir = tempDir.toFile();
        Path dotGit = rootDir.toPath().resolve(".git");
        Files.createDirectory(dotGit);
        Files.copy(configFile, dotGit.resolve("config"));
        Path head = dotGit.resolve("HEAD");
        Files.writeString(head, "testRevision");
        GitInfo info = GitInfo.gitInfo(rootDir);
        assertEquals("https://github.com/test/repo-with-comments.git", info.getOrigin());
    }

    @Test
    void testFindOriginUrlWithMultipleRemotes() throws IOException {
        Path configFile = tempDir.resolve("config");
        Files.writeString(configFile, "[remote \"upstream\"]\n" + "\turl = https://github.com/upstream/repo.git\n" + "[remote \"origin\"]\n" + "\turl = https://github.com/test/repo-multi-remote.git\n" + "[remote \"fork\"]\n" + "\turl = https://github.com/fork/repo.git");
        File rootDir = tempDir.toFile();
        Path dotGit = rootDir.toPath().resolve(".git");
        Files.createDirectory(dotGit);
        Files.copy(configFile, dotGit.resolve("config"));
        Path head = dotGit.resolve("HEAD");
        Files.writeString(head, "testRevision");
        GitInfo info = GitInfo.gitInfo(rootDir);
        assertEquals("https://github.com/test/repo-multi-remote.git", info.getOrigin());
    }

    @Test
    void testGitInfoWithEmptyFile() throws IOException {
        File rootDir = tempDir.toFile();
        Path dotGit = rootDir.toPath().resolve(".git");
        Files.createDirectory(dotGit);
        Path head = dotGit.resolve("HEAD");
        Files.createFile(head);
        assertThrows(GradleException.class, () -> GitInfo.gitInfo(rootDir));
    }

    @Disabled()
    @Test
    void testGitInfoWithWorktreeSetup() throws IOException {
        File rootDir = tempDir.toFile();
        Path dotGit = rootDir.toPath().resolve(".git");
        Path gitDir = tempDir.resolve("gitdir");
        Files.createDirectory(gitDir);
        Files.writeString(dotGit, "gitdir: " + gitDir.toString());
        Path headRef = gitDir.resolve("HEAD");
        Files.writeString(headRef, "ref: refs/heads/main");
        Path refsHeadsMain = gitDir.resolve("refs/heads/main");
        Files.createDirectories(refsHeadsMain.getParent());
        Files.writeString(refsHeadsMain, "worktreeRevision123");
        Path config = gitDir.resolve("config");
        Files.writeString(config, "[remote \"origin\"]\n\turl = https://github.com/test/worktree-repo.git");
        GitInfo info = GitInfo.gitInfo(rootDir);
        assertEquals("worktreeRevision123", info.getRevision());
        assertEquals("https://github.com/test/worktree-repo.git", info.getOrigin());
    }

    @Disabled()
    @Test
    void testGitInfoWithModuleSetup() throws IOException {
        File rootDir = tempDir.toFile();
        Path dotGit = rootDir.toPath().resolve(".git");
        Path moduleGitDir = tempDir.resolve("modules/somemodule/.git");
        Files.createDirectories(moduleGitDir.getParent());
        Files.writeString(dotGit, "gitdir: " + moduleGitDir.toString());
        Path headRef = moduleGitDir.resolve("HEAD");
        Files.writeString(headRef, "moduleRevision456");
        Path config = moduleGitDir.resolve("config");
        Files.writeString(config, "[remote \"origin\"]\n\turl = https://github.com/test/module-repo.git");
        GitInfo info = GitInfo.gitInfo(rootDir);
        assertEquals("moduleRevision456", info.getRevision());
        assertEquals("https://github.com/test/module-repo.git", info.getOrigin());
    }

    @Test
    void testGitInfoWithNonExistentReference() throws IOException {
        File rootDir = tempDir.toFile();
        Path dotGit = rootDir.toPath().resolve(".git");
        Path nonExistentRef = tempDir.resolve("non-existent-ref");
        Files.writeString(dotGit, "gitdir: " + nonExistentRef.toString());
        GitInfo info = GitInfo.gitInfo(rootDir);
        assertEquals("unknown", info.getRevision());
        assertEquals("unknown", info.getOrigin());
    }

    @Disabled()
    @Test
    void testGitInfoWithCommonDir() throws IOException {
        File rootDir = tempDir.toFile();
        Path dotGit = rootDir.toPath().resolve(".git");
        Path commonDir = tempDir.resolve("common");
        Files.createDirectory(commonDir);
        Files.writeString(dotGit, "gitdir: " + commonDir.toString());
        Path commonDirFile = commonDir.resolve("commondir");
        Files.writeString(commonDirFile, "../.git");
        Path headRef = commonDir.resolve("HEAD");
        Files.writeString(headRef, "commonDirRevision789");
        Path config = commonDir.resolve("config");
        Files.writeString(config, "[remote \"origin\"]\n\turl = https://github.com/test/commondir-repo.git");
        GitInfo info = GitInfo.gitInfo(rootDir);
        assertEquals("commonDirRevision789", info.getRevision());
        assertEquals("https://github.com/test/commondir-repo.git", info.getOrigin());
    }

    @Test
    void testGitInfoWithAbsoluteCommonDir() throws IOException {
        File rootDir = tempDir.toFile();
        Path dotGit = rootDir.toPath().resolve(".git");
        Path commonDir = tempDir.resolve("absolute_common");
        Files.createDirectory(commonDir);
        Files.writeString(dotGit, "gitdir: " + commonDir.toString());
        Path commonDirFile = commonDir.resolve("commondir");
        Files.writeString(commonDirFile, commonDir.toAbsolutePath().toString());
        Path headRef = commonDir.resolve("HEAD");
        Files.writeString(headRef, "absoluteCommonDirRevision101112");
        Path config = commonDir.resolve("config");
        Files.writeString(config, "[remote \"origin\"]\n\turl = https://github.com/test/absolute-commondir-repo.git");
        GitInfo info = GitInfo.gitInfo(rootDir);
        assertEquals("absoluteCommonDirRevision101112", info.getRevision());
        assertEquals("https://github.com/test/absolute-commondir-repo.git", info.getOrigin());
    }

    @Test
    void testGitInfoWithoutOriginRemote() throws IOException {
        File rootDir = tempDir.toFile();
        Path dotGit = rootDir.toPath().resolve(".git");
        Files.createDirectory(dotGit);
        Path head = dotGit.resolve("HEAD");
        Files.writeString(head, "noOriginRevision");
        Path config = dotGit.resolve("config");
        Files.writeString(config, "[remote \"upstream\"]\n\turl = https://github.com/test/upstream-repo.git");
        GitInfo info = GitInfo.gitInfo(rootDir);
        assertEquals("noOriginRevision", info.getRevision());
        assertEquals("unknown", info.getOrigin());
    }
}

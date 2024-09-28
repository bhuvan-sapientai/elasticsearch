package org.elasticsearch.gradle.internal.conventions.info;

import org.elasticsearch.gradle.internal.conventions.info.GitInfo;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.nio.file.Files;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import java.io.File;
import java.util.stream.Stream;
import java.util.Iterator;
import org.junit.jupiter.api.io.TempDir;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.regex.Matcher;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.params.provider.CsvSource;
import org.gradle.api.GradleException;
import static org.junit.jupiter.api.Assertions.*;
import org.gradle.api.logging.Logging;
import java.util.stream.Collectors;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.HashMap;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

class GitInfoSapientGeneratedTest {

    @TempDir
    Path tempDir;

    private GitInfo gitInfo;

    @BeforeEach
    void setUp() {
        //gitInfo = new GitInfo("testRevision", "testOrigin");
    }

    @Disabled()
    @Test
    void testGetRevision() {
        assertEquals("testRevision", gitInfo.getRevision());
    }

    @Disabled()
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

    @ParameterizedTest
    @CsvSource({ "https://github.com/test/repo.git, https://github.com/test/repo.git", "git@github.com:test/repo.git, https://github.com/test/repo", "ssh://git@gitlab.com:1234/test/repo.git, ssh://git@gitlab.com:1234/test/repo.git" })
    void testUrlFromOrigin(String origin, String expected) {
        //GitInfo info = new GitInfo("testRevision", origin);
        //assertEquals(expected, info.urlFromOrigin());
    }

    @Test
    void testUrlFromOriginWithNullOrigin() {
        //GitInfo info = new GitInfo("testRevision", null);
        //assertNull(info.urlFromOrigin());
    }

    @Disabled()
    @Test
    void testFindOriginUrlWithComments() throws IOException {
        Path configFile = tempDir.resolve("config");
        Files.writeString(configFile, "# This is a comment\n" + "; This is another comment\n" + "[remote \"origin\"]\n" + "\turl = https://github.com/test/repo-with-comments.git");
        GitInfo info = GitInfo.gitInfo(tempDir.toFile());
        assertEquals("https://github.com/test/repo-with-comments.git", info.getOrigin());
    }

    @Disabled()
    @Test
    void testFindOriginUrlWithMultipleRemotes() throws IOException {
        Path configFile = tempDir.resolve("config");
        Files.writeString(configFile, "[remote \"upstream\"]\n" + "\turl = https://github.com/upstream/repo.git\n" + "[remote \"origin\"]\n" + "\turl = https://github.com/test/repo-multi-remote.git\n" + "[remote \"fork\"]\n" + "\turl = https://github.com/fork/repo.git");
        GitInfo info = GitInfo.gitInfo(tempDir.toFile());
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
}

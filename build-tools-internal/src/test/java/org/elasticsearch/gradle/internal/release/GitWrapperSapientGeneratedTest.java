package org.elasticsearch.gradle.internal.release;

import org.elasticsearch.gradle.internal.release.GitWrapper;

import java.util.Map;

import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.gradle.api.Action;
import org.junit.jupiter.api.Timeout;
import org.gradle.process.ExecOperations;
import org.gradle.process.ExecResult;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class GitWrapperSapientGeneratedTest {

    private final ExecOperations execOperationsMock = mock(ExecOperations.class, "execOperations");

    @Test
    void listRemotesTest() {
        GitWrapper target = spy(new GitWrapper(execOperationsMock));
        String[] stringArray = new String[]{"git", "remote", "-v"};
        doReturn("origin\thttps://github.com/elastic/elasticsearch.git (fetch)\n" + "origin\thttps://github.com/elastic/elasticsearch.git (push)\n" + "upstream\thttps://github.com/elastic/elasticsearch.git (fetch)\n" + "upstream\thttps://github.com/elastic/elasticsearch.git (push)").when(target).runCommand(stringArray);
        Map<String, String> result = target.listRemotes();
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(2));
            assertThat(result, hasEntry("origin", "https://github.com/elastic/elasticsearch.git"));
            assertThat(result, hasEntry("upstream", "https://github.com/elastic/elasticsearch.git"));
            verify(target).runCommand(stringArray);
        });
    }

    @Test
    void runCommandTest() {
        ExecResult execResultMock = mock(ExecResult.class);
        doReturn(execResultMock).when(execOperationsMock).exec(any(Action.class));
        GitWrapper target = new GitWrapper(execOperationsMock);
        String[] stringArray = new String[]{"git", "status"};
        String result = target.runCommand(stringArray);
        assertAll("result", () -> {
            assertThat(result, notNullValue());
            assertThat(result, isEmptyString());
            verify(execOperationsMock).exec(any(Action.class));
        });
    }

    @Test
    void updateRemoteTest() {
        GitWrapper target = spy(new GitWrapper(execOperationsMock));
        String[] stringArray = new String[]{"git", "fetch", "origin"};
        doReturn("").when(target).runCommand(stringArray);
        target.updateRemote("origin");
        verify(target).runCommand(stringArray);
    }

    @Test
    void updateTagsTest() {
        GitWrapper target = spy(new GitWrapper(execOperationsMock));
        String[] stringArray = new String[]{"git", "fetch", "--tags", "origin"};
        doReturn("").when(target).runCommand(stringArray);
        target.updateTags("origin");
        verify(target).runCommand(stringArray);
    }

    @Test
    void listVersionsTest() {
        GitWrapper target = spy(new GitWrapper(execOperationsMock));
        String[] stringArray = new String[]{"git", "tag", "-l", "v*"};
        doReturn("v7.10.0\nv7.10.1\nv7.11.0-alpha1").when(target).runCommand(stringArray);
        Stream<QualifiedVersion> result = target.listVersions("v*");
        assertAll("result", () -> {
            assertThat(result, notNullValue());
            assertThat(result.count(), equalTo(3L));
            verify(target).runCommand(stringArray);
        });
    }

    @Test
    void listFilesTest() {
        GitWrapper target = spy(new GitWrapper(execOperationsMock));
        String[] stringArray = new String[]{"git", "ls-tree", "--name-only", "-r", "HEAD", "src"};
        doReturn("src/main/java/File1.java\nsrc/main/java/File2.java").when(target).runCommand(stringArray);
        Stream<String> result = target.listFiles("HEAD", "src");
        assertAll("result", () -> {
            assertThat(result, notNullValue());
            assertThat(result.count(), equalTo(2L));
            verify(target).runCommand(stringArray);
        });
    }

    @ParameterizedTest
    @CsvSource({"origin, https://github.com/elastic/elasticsearch.git", "upstream, https://github.com/elastic/elasticsearch.git"})
    void listRemotesParameterizedTest(String remoteName, String remoteUrl) {
        GitWrapper target = spy(new GitWrapper(execOperationsMock));
        String[] stringArray = new String[]{"git", "remote", "-v"};
        doReturn(remoteName + "\t" + remoteUrl + " (fetch)\n" + remoteName + "\t" + remoteUrl + " (push)").when(target).runCommand(stringArray);
        Map<String, String> result = target.listRemotes();
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(1));
            assertThat(result, hasEntry(remoteName, remoteUrl));
            verify(target).runCommand(stringArray);
        });
    }

    @Test
    void updateRemoteNullTest() {
        GitWrapper target = new GitWrapper(execOperationsMock);
        assertThrows(NullPointerException.class, () -> target.updateRemote(null));
    }

    @Test
    void updateTagsNullTest() {
        GitWrapper target = new GitWrapper(execOperationsMock);
        assertThrows(NullPointerException.class, () -> target.updateTags(null));
    }

    @Test
    void listVersionsEmptyTest() {
        GitWrapper target = spy(new GitWrapper(execOperationsMock));
        String[] stringArray = new String[]{"git", "tag", "-l", "non-existent-pattern"};
        doReturn("").when(target).runCommand(stringArray);
        Stream<QualifiedVersion> result = target.listVersions("non-existent-pattern");
        assertAll("result", () -> {
            assertThat(result, notNullValue());
            assertThat(result.count(), equalTo(0L));
            verify(target).runCommand(stringArray);
        });
    }

    @Test
    void listFilesEmptyTest() {
        GitWrapper target = spy(new GitWrapper(execOperationsMock));
        String[] stringArray = new String[]{"git", "ls-tree", "--name-only", "-r", "HEAD", "non-existent-path"};
        doReturn("").when(target).runCommand(stringArray);
        Stream<String> result = target.listFiles("HEAD", "non-existent-path");
        assertAll("result", () -> {
            assertThat(result, notNullValue());
            assertThat(result.count(), equalTo(0L));
            verify(target).runCommand(stringArray);
        });
    }
}

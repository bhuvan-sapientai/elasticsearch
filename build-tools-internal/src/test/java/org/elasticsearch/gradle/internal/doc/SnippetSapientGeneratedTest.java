package org.elasticsearch.gradle.internal.doc;

import org.elasticsearch.gradle.internal.doc.Snippet;

import static org.mockito.Mockito.mock;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

class SnippetSapientGeneratedTest {

    private final Path pathMock = mock(Path.class);

    @Test
    void toStringWhenSkipIsNotNullAndTestSetupAndCurl() {
        Path pathMock = mock(Path.class, "path");
        List<String> stringList = new ArrayList<>(List.of("warning1"));
        Snippet target = new Snippet(pathMock, 2, 2, "contents1", true, true, true, true, false, "skip1", true, "js", "catch1", "setup1", "teardown1", true, stringList, true, "name1");
        String result = target.toString();
        assertThat(result, equalTo("path[2:2](js)// CONSOLE// TEST[catch: catch1][skip=skip1][continued][setup:setup1][teardown:teardown1][warning:warning1][skip_shard_failures]// TESTRESPONSE[skip=skip1]// TESTSETUP(curl)"));
    }

    @Test
    void isConsoleCandidateWhenTestResponse() {
        List<String> stringList = new ArrayList<>();
        Snippet target = new Snippet(pathMock, 0, 0, "contents1", null, false, true, false, false, "skip1", false, "language1", "catchPart1", "setup1", "teardown1", false, stringList, false, "name1");
        boolean result = target.isConsoleCandidate();
        assertFalse(result);
    }

    @Test
    void isConsoleCandidateWhenCurl() {
        List<String> stringList = new ArrayList<>();
        Snippet target = new Snippet(pathMock, 0, 0, "contents1", null, false, false, false, false, "skip1", false, "A", "catchPart1", "setup1", "teardown1", true, stringList, false, "name1");
        boolean result = target.isConsoleCandidate();
        assertTrue(result);
    }

    @Test
    void isConsoleCandidateWhenLanguageIsJs() {
        List<String> stringList = new ArrayList<>();
        Snippet target = new Snippet(pathMock, 0, 0, "contents1", null, false, false, false, false, "skip1", false, "js", "catchPart1", "setup1", "teardown1", false, stringList, false, "name1");
        boolean result = target.isConsoleCandidate();
        assertTrue(result);
    }

    @Test
    void isConsoleCandidateWhenConsoleIsNotNull() {
        List<String> stringList = new ArrayList<>();
        Snippet target = new Snippet(pathMock, 0, 0, "contents1", false, false, false, false, false, "skip1", false, "js", "catchPart1", "setup1", "teardown1", true, stringList, false, "name1");
        boolean result = target.isConsoleCandidate();
        assertFalse(result);
    }

    @ParameterizedTest
    @CsvSource({"true, false, false, false, 'path[0:0]()// CONSOLE'", "false, true, false, false, 'path[0:0]()// NOTCONSOLE'", "null, true, false, false, 'path[0:0]()// TEST'", "null, false, true, false, 'path[0:0]()// TESTRESPONSE'", "null, false, false, true, 'path[0:0]()// TESTSETUP'"})
    void toStringWithDifferentFlags(Boolean console, boolean test, boolean testResponse, boolean testSetup, String expected) {
        Snippet target = new Snippet(pathMock, 0, 0, "contents", console, test, testResponse, testSetup, false, null, false, null, null, null, null, false, new ArrayList<>(), false, "name");
        String result = target.toString();
        assertThat(result, equalTo(expected));
    }

    @Test
    void toStringWithAllAttributes() {
        List<String> warnings = List.of("warning1", "warning2");
        Snippet target = new Snippet(pathMock, 1, 2, "contents", true, true, true, true, true, "skip", true, "java", "catchPart", "setup", "teardown", true, warnings, true, "name");
        String result = target.toString();
        String expected = "path[1:2](java)// CONSOLE// TEST[catch: catchPart][skip=skip][continued][setup:setup][teardown:teardown][warning:warning1][warning:warning2][skip_shard_failures]// TESTRESPONSE[skip=skip]// TESTSETUP(curl)";
        assertThat(result, equalTo(expected));
    }

    @Test
    void toStringWithMinimalAttributes() {
        Snippet target = new Snippet(pathMock, 1, 2, "contents", null, false, false, false, false, null, false, null, null, null, null, false, new ArrayList<>(), false, "name");
        String result = target.toString();
        assertThat(result, equalTo("path[1:2]"));
    }
}

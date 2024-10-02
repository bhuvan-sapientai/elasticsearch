package org.elasticsearch.gradle.internal.doc;

import org.elasticsearch.gradle.internal.doc.SnippetBuilder;

import org.apache.commons.collections.map.MultiValueMap;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import java.util.Map;

import com.fasterxml.jackson.core.JsonParser;

import static org.mockito.ArgumentMatchers.any;

import java.nio.file.Path;

import org.gradle.api.InvalidUserDataException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.elasticsearch.gradle.internal.doc.SnippetBuilder;
import com.fasterxml.jackson.core.JsonFactory;

import java.util.Set;
import java.util.LinkedHashMap;
import java.util.ArrayList;

import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.core.JsonParseException;

import java.nio.file.Paths;
import java.io.IOException;

import static org.mockito.ArgumentMatchers.any;

class SnippetBuilderSapientGeneratedTest {

    private SnippetBuilder snippetBuilder;

    @BeforeEach
    void setUp() {
        snippetBuilder = new SnippetBuilder();
    }

    @Test
    void testWithPath() {
        Path path = Paths.get("/test/path");
        snippetBuilder.withPath(path);
        snippetBuilder.withLanguage("java");
        Snippet snippet = snippetBuilder.build();
        assertEquals(path, snippet.path());
    }

    @Test
    void testWithLineNumber() {
        int lineNumber = 10;
        snippetBuilder.withLineNumber(lineNumber);
        snippetBuilder.withLanguage("java");
        Snippet snippet = snippetBuilder.build();
        assertEquals(lineNumber, snippet.start());
    }

    @Test
    void testWithName() {
        String name = "TestSnippet";
        snippetBuilder.withName(name);
        snippetBuilder.withLanguage("java");
        Snippet snippet = snippetBuilder.build();
        assertEquals(name, snippet.name());
    }

    @Test
    void testWithLanguage() {
        String language = "java";
        snippetBuilder.withLanguage(language);
        Snippet snippet = snippetBuilder.build();
        assertEquals(language, snippet.language());
    }

    @Test
    void testWithEnd() {
        int end = 20;
        snippetBuilder.withEnd(end);
        snippetBuilder.withLanguage("java");
        Snippet snippet = snippetBuilder.build();
        assertEquals(end, snippet.end());
    }

    @Test
    void testWithTestSetup() {
        snippetBuilder.withTestSetup(true);
        snippetBuilder.withLanguage("java");
        Snippet snippet = snippetBuilder.build();
        assertTrue(snippet.testSetup());
    }

    @Test
    void testWithTestTearDown() {
        snippetBuilder.withTestTearDown(true);
        snippetBuilder.withLanguage("java");
        Snippet snippet = snippetBuilder.build();
        assertTrue(snippet.testTearDown());
    }

    @Test
    void testNotFinished() {
        assertTrue(snippetBuilder.notFinished());
        snippetBuilder.withEnd(10);
        assertFalse(snippetBuilder.notFinished());
    }

    @Test
    void testWithSubstitutions() {
        Map<String, String> substitutions = new LinkedHashMap<>();
        substitutions.put("key1", "value1");
        substitutions.put("key2", "value2");
        snippetBuilder.withSubstitutions(substitutions);
        snippetBuilder.withLanguage("java");
        snippetBuilder.withContent("Content with key1 and key2");
        Snippet snippet = snippetBuilder.build();
        assertEquals("Content with value1 and value2", snippet.contents());
    }

    @Test
    void testWithSubstitution() {
        snippetBuilder.withSubstitution("key", "value");
        snippetBuilder.withLanguage("java");
        snippetBuilder.withContent("Content with key");
        Snippet snippet = snippetBuilder.build();
        assertEquals("Content with value", snippet.contents());
    }

    @Test
    void testWithTest() {
        snippetBuilder.withTest(true);
        snippetBuilder.withLanguage("java");
        Snippet snippet = snippetBuilder.build();
        assertTrue(snippet.test());
    }

    @Test
    void testWithCatchPart() {
        String catchPart = "Exception";
        snippetBuilder.withCatchPart(catchPart);
        snippetBuilder.withLanguage("java");
        Snippet snippet = snippetBuilder.build();
        assertEquals(catchPart, snippet.catchPart());
    }

    @Test
    void testWithSkip() {
        String skip = "Skip this test";
        snippetBuilder.withSkip(skip);
        snippetBuilder.withLanguage("java");
        Snippet snippet = snippetBuilder.build();
        assertEquals(skip, snippet.skip());
    }

    @Test
    void testWithContinued() {
        snippetBuilder.withContinued(true);
        snippetBuilder.withLanguage("java");
        Snippet snippet = snippetBuilder.build();
        assertTrue(snippet.continued());
    }

    @Test
    void testWithSetup() {
        String setup = "Setup code";
        snippetBuilder.withSetup(setup);
        snippetBuilder.withLanguage("java");
        Snippet snippet = snippetBuilder.build();
        assertEquals(setup, snippet.setup());
    }

    @Test
    void testWithTeardown() {
        String teardown = "Teardown code";
        snippetBuilder.withTeardown(teardown);
        snippetBuilder.withLanguage("java");
        Snippet snippet = snippetBuilder.build();
        assertEquals(teardown, snippet.teardown());
    }

    @Test
    void testWithWarning() {
        String warning = "Test warning";
        snippetBuilder.withWarning(warning);
        snippetBuilder.withLanguage("java");
        Snippet snippet = snippetBuilder.build();
        assertTrue(snippet.warnings().contains(warning));
    }

    @Test
    void testWithSkipShardsFailures() {
        snippetBuilder.withSkipShardsFailures(true);
        snippetBuilder.withLanguage("java");
        Snippet snippet = snippetBuilder.build();
        assertTrue(snippet.skipShardsFailures());
    }

    @Test
    void testWithTestResponse() {
        snippetBuilder.withTestResponse(true);
        snippetBuilder.withLanguage("java");
        Snippet snippet = snippetBuilder.build();
        assertTrue(snippet.testResponse());
    }

    @Test
    void testWithContent() {
        String content = "Test content";
        snippetBuilder.withContent(content);
        snippetBuilder.withLanguage("java");
        Snippet snippet = snippetBuilder.build();
        assertEquals(content, snippet.contents());
    }

    @Test
    void testWithContentNewLine() {
        String content = "Test content";
        snippetBuilder.withContent(content, true);
        snippetBuilder.withLanguage("java");
        Snippet snippet = snippetBuilder.build();
        assertEquals(content + "\n", snippet.contents());
    }

    @Test
    void testValidateWithoutLanguage() {
        assertThrows(InvalidUserDataException.class, () -> snippetBuilder.build());
    }

    @ParameterizedTest
    @CsvSource({"sh, true", "shell, true", "java, false"})
    void testAssertValidCurlInput(String language, boolean expectCurl) {
        snippetBuilder.withLanguage(language);
        snippetBuilder.withContent("curl http://example.com");
        Snippet snippet = snippetBuilder.build();
        assertEquals(expectCurl, snippet.curl());
    }

    @Test
    void testAssertValidJsonInput() {
        snippetBuilder.withLanguage("js");
        snippetBuilder.withTestResponse(true);
        snippetBuilder.withContent("{\"key\": \"value\"}");
        assertDoesNotThrow(() -> snippetBuilder.build());
    }

    @Test
    void testAssertInvalidJsonInput() {
        snippetBuilder.withLanguage("js");
        snippetBuilder.withTestResponse(true);
        snippetBuilder.withContent("{\"key\": value}");
        assertThrows(InvalidUserDataException.class, () -> snippetBuilder.build());
    }

    @Test
    void testWithConsole() {
        snippetBuilder.withConsole(true);
        snippetBuilder.withLanguage("java");
        Snippet snippet = snippetBuilder.build();
        assertTrue(snippet.console());
    }

    @Test
    void testConsoleDefined() {
        assertFalse(snippetBuilder.consoleDefined());
        snippetBuilder.withConsole(true);
        assertTrue(snippetBuilder.consoleDefined());
    }

    @Test
    void testEscapeSubstitutions() {
        snippetBuilder.withSubstitution("\\$body", "replaced body");
        snippetBuilder.withSubstitution("\\$_path", "replaced path");
        snippetBuilder.withContent("Content with $body and $_path");
        snippetBuilder.withLanguage("java");
        Snippet snippet = snippetBuilder.build();
        assertEquals("Content with replaced body and replaced path", snippet.contents());
    }

    @Test
    void testMultipleSubstitutions() {
        MultiValueMap substitutions = new MultiValueMap();
        substitutions.put("key", "value1");
        substitutions.put("key", "value2");
        snippetBuilder.withSubstitutions(substitutions);
        snippetBuilder.withLanguage("java");
        snippetBuilder.withContent("Content with key");
        Snippet snippet = snippetBuilder.build();
        assertEquals("Content with value2", snippet.contents());
    }

    @Test
    void testBuildWithAllProperties() {
        Path path = Paths.get("/test/path");
        snippetBuilder.withPath(path).withLineNumber(10).withName("TestSnippet").withLanguage("java").withEnd(20).withTestSetup(true).withTestTearDown(true).withTest(true).withCatchPart("Exception").withSkip("Skip this").withContinued(true).withSetup("Setup code").withTeardown("Teardown code").withWarning("Warning message").withSkipShardsFailures(true).withTestResponse(true).withContent("Test content").withConsole(true);
        Snippet snippet = snippetBuilder.build();
        assertEquals(path, snippet.path());
        assertEquals(10, snippet.start());
        assertEquals("TestSnippet", snippet.name());
        assertEquals("java", snippet.language());
        assertEquals(20, snippet.end());
        assertTrue(snippet.testSetup());
        assertTrue(snippet.testTearDown());
        assertTrue(snippet.test());
        assertEquals("Exception", snippet.catchPart());
        assertEquals("Skip this", snippet.skip());
        assertTrue(snippet.continued());
        assertEquals("Setup code", snippet.setup());
        assertEquals("Teardown code", snippet.teardown());
        assertTrue(snippet.warnings().contains("Warning message"));
        assertTrue(snippet.skipShardsFailures());
        assertTrue(snippet.testResponse());
        assertEquals("Test content", snippet.contents());
        assertTrue(snippet.console());
    }

    @Test
    void testInvalidLanguageThrowsException() {
        assertThrows(InvalidUserDataException.class, () -> {
            snippetBuilder.withLanguage(null).build();
        });
    }

    @Test
    void testCurlDetectionInShellLanguage() {
        snippetBuilder.withLanguage("sh").withContent("curl -X GET http://example.com");
        Snippet snippet = snippetBuilder.build();
        assertTrue(snippet.curl());
    }

    @Test
    void testNoCurlInNonShellLanguage() {
        snippetBuilder.withLanguage("java").withContent("curl -X GET http://example.com");
        Snippet snippet = snippetBuilder.build();
        assertFalse(snippet.curl());
    }

    @Test
    void testJsonValidationForJsLanguage() {
        snippetBuilder.withLanguage("js").withTestResponse(true).withContent("{\"key\": \"value\", \"array\": [1, 2, 3]}");
        assertDoesNotThrow(() -> snippetBuilder.build());
    }

    @Test
    void testInvalidJsonThrowsException() {
        snippetBuilder.withLanguage("js").withTestResponse(true).withContent("{\"key\": value, \"array\": [1, 2, 3]}");
        assertThrows(InvalidUserDataException.class, () -> snippetBuilder.build());
    }

    @Test
    void testConsoleDetectionForJsSnippets() {
        snippetBuilder.withLanguage("js").withContent("var x = 10;");
        Snippet snippet = snippetBuilder.build();
        assertTrue(snippet.isConsoleCandidate());
    }

    @Test
    void testConsoleDetectionForCurlSnippets() {
        snippetBuilder.withLanguage("sh").withContent("curl -X GET http://example.com");
        Snippet snippet = snippetBuilder.build();
        assertTrue(snippet.isConsoleCandidate());
    }

    @Test
    void testNoConsoleForExplicitlyMarkedSnippets() {
        snippetBuilder.withLanguage("js").withConsole(false).withContent("var x = 10;");
        Snippet snippet = snippetBuilder.build();
        assertFalse(snippet.isConsoleCandidate());
    }

    @Test
    void testMultipleWarnings() {
        snippetBuilder.withLanguage("java").withWarning("Warning 1").withWarning("Warning 2");
        Snippet snippet = snippetBuilder.build();
        assertEquals(2, snippet.warnings().size());
        assertTrue(snippet.warnings().contains("Warning 1"));
        assertTrue(snippet.warnings().contains("Warning 2"));
    }
}

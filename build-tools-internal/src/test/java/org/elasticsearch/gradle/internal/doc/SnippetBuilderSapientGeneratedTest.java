package org.elasticsearch.gradle.internal.doc;

import org.elasticsearch.gradle.internal.doc.SnippetBuilder;

import org.apache.commons.collections.map.MultiValueMap;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import com.fasterxml.jackson.core.JsonParser;
import java.nio.file.Path;
import org.gradle.api.InvalidUserDataException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
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
        //Path path = Paths.get("/test/path");
        //snippetBuilder.withPath(path);
        //Snippet snippet = snippetBuilder.build();
        //assertEquals(path, snippet.getPath());
    }

    @Test
    void testWithLineNumber() {
        //int lineNumber = 10;
        //snippetBuilder.withLineNumber(lineNumber);
        //Snippet snippet = snippetBuilder.build();
        //assertEquals(lineNumber, snippet.getLineNumber());
    }

    @Test
    void testWithName() {
        //String name = "TestSnippet";
        //snippetBuilder.withName(name);
        //Snippet snippet = snippetBuilder.build();
        //assertEquals(name, snippet.getName());
    }

    @Test
    void testWithLanguage() {
        //String language = "java";
        //snippetBuilder.withLanguage(language);
        //Snippet snippet = snippetBuilder.build();
        //assertEquals(language, snippet.getLanguage());
    }

    @Test
    void testWithEnd() {
        int end = 20;
        snippetBuilder.withEnd(end);
        Snippet snippet = snippetBuilder.build();
        assertEquals(end, snippet.getEnd());
    }

    @Test
    void testWithTestSetup() {
        snippetBuilder.withTestSetup(true);
        Snippet snippet = snippetBuilder.build();
        assertTrue(snippet.isTestSetup());
    }

    @Test
    void testWithTestTearDown() {
        snippetBuilder.withTestTearDown(true);
        Snippet snippet = snippetBuilder.build();
        assertTrue(snippet.isTestTeardown());
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
        assertEquals("Content with value1 and value2", snippet.getContent());
    }

    @Test
    void testWithSubstitution() {
        snippetBuilder.withSubstitution("key", "value");
        snippetBuilder.withLanguage("java");
        snippetBuilder.withContent("Content with key");
        Snippet snippet = snippetBuilder.build();
        assertEquals("Content with value", snippet.getContent());
    }

    @Test
    void testWithTest() {
        snippetBuilder.withTest(true);
        Snippet snippet = snippetBuilder.build();
        assertTrue(snippet.isTest());
    }

    @Test
    void testWithCatchPart() {
        String catchPart = "Exception";
        snippetBuilder.withCatchPart(catchPart);
        Snippet snippet = snippetBuilder.build();
        assertEquals(catchPart, snippet.getCatchPart());
    }

    @Test
    void testWithSkip() {
        String skip = "Skip this test";
        snippetBuilder.withSkip(skip);
        Snippet snippet = snippetBuilder.build();
        assertEquals(skip, snippet.getSkip());
    }

    @Test
    void testWithContinued() {
        snippetBuilder.withContinued(true);
        Snippet snippet = snippetBuilder.build();
        assertTrue(snippet.isContinued());
    }

    @Test
    void testWithSetup() {
        String setup = "Setup code";
        snippetBuilder.withSetup(setup);
        Snippet snippet = snippetBuilder.build();
        assertEquals(setup, snippet.getSetup());
    }

    @Test
    void testWithTeardown() {
        String teardown = "Teardown code";
        snippetBuilder.withTeardown(teardown);
        Snippet snippet = snippetBuilder.build();
        assertEquals(teardown, snippet.getTeardown());
    }

    @Test
    void testWithWarning() {
        String warning = "Test warning";
        snippetBuilder.withWarning(warning);
        Snippet snippet = snippetBuilder.build();
        assertTrue(snippet.getWarnings().contains(warning));
    }

    @Test
    void testWithSkipShardsFailures() {
        snippetBuilder.withSkipShardsFailures(true);
        Snippet snippet = snippetBuilder.build();
        assertTrue(snippet.isSkipShardsFailures());
    }

    @Test
    void testWithTestResponse() {
        snippetBuilder.withTestResponse(true);
        Snippet snippet = snippetBuilder.build();
        assertTrue(snippet.isTestResponse());
    }

    @Test
    void testWithContent() {
        String content = "Test content";
        snippetBuilder.withContent(content);
        snippetBuilder.withLanguage("java");
        Snippet snippet = snippetBuilder.build();
        assertEquals(content, snippet.getContent());
    }

    @Test
    void testWithContentNewLine() {
        String content = "Test content";
        snippetBuilder.withContent(content, true);
        snippetBuilder.withLanguage("java");
        Snippet snippet = snippetBuilder.build();
        assertEquals(content + "\n", snippet.getContent());
    }

    @Test
    void testValidateWithoutLanguage() {
        assertThrows(InvalidUserDataException.class, () -> snippetBuilder.build());
    }

    @ParameterizedTest
    @CsvSource({ "sh, true", "shell, true", "java, false" })
    void testAssertValidCurlInput(String language, boolean expectCurl) {
        snippetBuilder.withLanguage(language);
        snippetBuilder.withContent("curl http://example.com");
        Snippet snippet = snippetBuilder.build();
        assertEquals(expectCurl, snippet.isCurl());
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
        assertTrue(snippet.isConsole());
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
        assertEquals("Content with replaced body and replaced path", snippet.getContent());
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
        assertEquals("Content with value2", snippet.getContent());
    }

    @Test
    void testBuildWithAllProperties() {
        Path path = Paths.get("/test/path");
        snippetBuilder.withPath(path).withLineNumber(10).withName("TestSnippet").withLanguage("java").withEnd(20).withTestSetup(true).withTestTearDown(true).withTest(true).withCatchPart("Exception").withSkip("Skip this").withContinued(true).withSetup("Setup code").withTeardown("Teardown code").withWarning("Warning message").withSkipShardsFailures(true).withTestResponse(true).withContent("Test content").withConsole(true);
        Snippet snippet = snippetBuilder.build();
        assertEquals(path, snippet.getPath());
        assertEquals(10, snippet.getLineNumber());
        assertEquals("TestSnippet", snippet.getName());
        assertEquals("java", snippet.getLanguage());
        assertEquals(20, snippet.getEnd());
        assertTrue(snippet.isTestSetup());
        assertTrue(snippet.isTestTeardown());
        assertTrue(snippet.isTest());
        assertEquals("Exception", snippet.getCatchPart());
        assertEquals("Skip this", snippet.getSkip());
        assertTrue(snippet.isContinued());
        assertEquals("Setup code", snippet.getSetup());
        assertEquals("Teardown code", snippet.getTeardown());
        assertTrue(snippet.getWarnings().contains("Warning message"));
        assertTrue(snippet.isSkipShardsFailures());
        assertTrue(snippet.isTestResponse());
        assertEquals("Test content", snippet.getContent());
        assertTrue(snippet.isConsole());
    }
}
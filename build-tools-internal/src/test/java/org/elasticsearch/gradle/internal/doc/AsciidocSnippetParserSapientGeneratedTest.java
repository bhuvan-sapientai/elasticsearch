package org.elasticsearch.gradle.internal.doc;

import org.elasticsearch.gradle.internal.doc.AsciidocSnippetParser;

import java.util.regex.Pattern;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;

import org.mockito.InjectMocks;

import java.util.ArrayList;

import static org.hamcrest.Matchers.*;

import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;

import java.util.HashMap;

import static org.mockito.ArgumentMatchers.any;

class AsciidocSnippetParserSapientGeneratedTest {

    @Mock
    private SnippetBuilder snippetBuilderMock;

    @InjectMocks
    private AsciidocSnippetParser target;

    private AutoCloseable autoCloseableMocks;

    @BeforeEach
    void setUp() {
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Map<String, String> defaultSubstitutions = new HashMap<>();
        target = new AsciidocSnippetParser(defaultSubstitutions);
    }

    @AfterEach
    void tearDown() throws Exception {
        if (autoCloseableMocks != null) {
            autoCloseableMocks.close();
        }
    }

    @Test
    void testResponsePatternTest() {
        Pattern result = target.testResponsePattern();
        assertThat(result, is(notNullValue()));
        assertThat(result.pattern(), is(AsciidocSnippetParser.TEST_RESPONSE_PATTERN.pattern()));
    }

    @Test
    void testPatternTest() {
        Pattern result = target.testPattern();
        assertThat(result, is(notNullValue()));
        assertThat(result.pattern(), is("\\/\\/\\s*TEST(\\[(.+)\\])?\\s*"));
    }

    @Test
    void parseLineWhenSourceMatches() {
        /*try (MockedStatic<AsciidocSnippetParser> mockedStatic = mockStatic(AsciidocSnippetParser.class)) {
    Source source = new Source(true, "language1", "name1");
    mockedStatic.when(() -> AsciidocSnippetParser.matchSource("A")).thenReturn(source);
    List<Snippet> snippetList = new ArrayList<>();
    target.parseLine(snippetList, 0, "A");
    mockedStatic.verify(() -> AsciidocSnippetParser.matchSource("A"), times(1));
    assertThat(target.getCurrentName(), is("name1"));
    assertThat(target.getLastLanguage(), is("language1"));
    assertThat(target.getLastLanguageLine(), is(0));
}*/
    }

    @Test
    void parseLineWhenSourceNotMatches() {
        try (MockedStatic<AsciidocSnippetParser> mockedStatic = mockStatic(AsciidocSnippetParser.class)) {
            Source source = new Source(false, null, null);
            mockedStatic.when(() -> AsciidocSnippetParser.matchSource("A")).thenReturn(source);
            AsciidocSnippetParser spyTarget = spy(target);
            List<Snippet> snippetList = new ArrayList<>();
            doNothing().when(spyTarget).handleCommons(snippetList, "A");
            spyTarget.parseLine(snippetList, 0, "A");
            mockedStatic.verify(() -> AsciidocSnippetParser.matchSource("A"), times(1));
            verify(spyTarget).handleCommons(snippetList, "A");
        }
    }

    @Test
    void parseLineWhenLastLanguageLineEqualsLineNumberMinus1() {
        //SnippetBuilder mockBuilder = mock(SnippetBuilder.class);
        //when(mockBuilder.withLineNumber(anyInt())).thenReturn(mockBuilder);
        //when(mockBuilder.withName(any())).thenReturn(mockBuilder);
        //when(mockBuilder.withSubstitutions(any())).thenReturn(mockBuilder);
        //when(mockBuilder.withLanguage(any())).thenReturn(mockBuilder);
        //AsciidocSnippetParser spyTarget = spy(target);
        //doReturn(mockBuilder).when(spyTarget).newSnippetBuilder();
        //spyTarget.setLastLanguageLine(-1);
        //spyTarget.setLastLanguage("testLang");
        //List<Snippet> snippetList = new ArrayList<>();
        //spyTarget.parseLine(snippetList, 0, "----");
        //verify(mockBuilder).withLineNumber(1);
        //verify(mockBuilder).withName(null);
        //verify(mockBuilder).withSubstitutions(any());
        //verify(mockBuilder).withLanguage("testLang");
    }

    @ParameterizedTest
    @CsvSource({"'[source,json]', true, json, ", "'[source,java]', true, java, ", "'[source,js,id=test]', true, js, test", "'not a source', false, , "})
    void matchSourceTest(String input, boolean expectedMatches, String expectedLanguage, String expectedName) {
        //Source result = AsciidocSnippetParser.matchSource(input);
        //assertThat(result.matches(), is(expectedMatches));
        //assertThat(result.language(), is(expectedLanguage));
        //assertThat(result.name(), is(expectedName));
    }

    @Test
    void testGetTestSetupRegex() {
        assertThat(target.getTestSetupRegex(), is(AsciidocSnippetParser.TESTSETUP_REGEX));
    }

    @Test
    void testGetTeardownRegex() {
        assertThat(target.getTeardownRegex(), is(AsciidocSnippetParser.TEARDOWN_REGEX));
    }

    @Test
    void testGetNotconsoleRegex() {
        assertThat(target.getNotconsoleRegex(), is(AsciidocSnippetParser.NOTCONSOLE_REGEX));
    }

    @Test
    void testGetConsoleRegex() {
        assertThat(target.getConsoleRegex(), is(AsciidocSnippetParser.CONSOLE_REGEX));
    }
}
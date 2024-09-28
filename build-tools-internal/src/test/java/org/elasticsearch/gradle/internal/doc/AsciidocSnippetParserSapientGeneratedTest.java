package org.elasticsearch.gradle.internal.doc;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.regex.Pattern;
import org.mockito.MockitoAnnotations;
import java.util.Map;
import java.util.HashMap;
import org.mockito.MockedStatic;
import java.util.ArrayList;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class AsciidocSnippetParserSapientGeneratedTest {

    private final SnippetBuilder snippetBuilderMock = mock(SnippetBuilder.class, "snippetBuilder");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private AsciidocSnippetParser target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${testResponsePatternTest}, hash: 958C528B4CF4450813B71AE1FDE3FF5C
    @Test()
    void testResponsePatternTest() {
        //Arrange Statement(s)
        Map<String, String> stringStringMap = new HashMap<>();
        target = new AsciidocSnippetParser(stringStringMap);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        Pattern result = target.testResponsePattern();
        //Assert statement(s)
        //TODO: Please implement equals method in Pattern for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${testPatternTest}, hash: 8E623CAB82F98DFBC9170714924DA1F4
    @Test()
    void testPatternTest() {
        //Arrange Statement(s)
        Map<String, String> stringStringMap = new HashMap<>();
        target = new AsciidocSnippetParser(stringStringMap);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        Pattern result = target.testPattern();
        //Assert statement(s)
        //TODO: Please implement equals method in Pattern for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${parseLineWhenSourceMatches}, hash: 0B1DD281B0729328F32EDD830868FCFF
    @Test()
    void parseLineWhenSourceMatches() {
        /* Branches:
         * (SNIPPET_PATTERN.matcher(line).matches()) : false
         * (source.matches) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<AsciidocSnippetParser> asciidocSnippetParser = mockStatic(AsciidocSnippetParser.class)) {
            Source source = new Source(true, "language1", "name1");
            asciidocSnippetParser.when(() -> AsciidocSnippetParser.matchSource("A")).thenReturn(source);
            Map<String, String> stringStringMap = new HashMap<>();
            target = new AsciidocSnippetParser(stringStringMap);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Snippet> snippetList = new ArrayList<>();
            //Act Statement(s)
            target.parseLine(snippetList, 0, "A");
            //Assert statement(s)
            assertAll("result", () -> asciidocSnippetParser.verify(() -> AsciidocSnippetParser.matchSource("A"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${parseLineWhenSourceNotMatches}, hash: 317A2FD208AA9537BF9EE37EB22F4FC4
    @Test()
    void parseLineWhenSourceNotMatches() {
        /* Branches:
         * (SNIPPET_PATTERN.matcher(line).matches()) : false
         * (source.matches) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<AsciidocSnippetParser> asciidocSnippetParser = mockStatic(AsciidocSnippetParser.class)) {
            Source source = new Source(false, "language1", "name1");
            asciidocSnippetParser.when(() -> AsciidocSnippetParser.matchSource("A")).thenReturn(source);
            Map<String, String> stringStringMap = new HashMap<>();
            target = spy(new AsciidocSnippetParser(stringStringMap));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Snippet> snippetList = new ArrayList<>();
            doNothing().when(target).handleCommons(snippetList, "A");
            //Act Statement(s)
            target.parseLine(snippetList, 0, "A");
            //Assert statement(s)
            assertAll("result", () -> {
                asciidocSnippetParser.verify(() -> AsciidocSnippetParser.matchSource("A"), atLeast(1));
                verify(target).handleCommons(snippetList, "A");
            });
        }
    }

    //Sapient generated method id: ${parseLineWhenLastLanguageLineEqualsLineNumberMinus1}, hash: 1978C69EA9AFE94AE6D8EC816C35B0C1
    @Disabled()
    @Test()
    void parseLineWhenLastLanguageLineEqualsLineNumberMinus1() {
        /* Branches:
         * (SNIPPET_PATTERN.matcher(line).matches()) : true
         * (snippetBuilder == null) : true
         * (lastLanguageLine == lineNumber - 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SnippetBuilder snippetBuilderMock2 = mock(SnippetBuilder.class);
        doReturn(snippetBuilderMock2).when(snippetBuilderMock).withLanguage((String) null);
        Map<String, String> stringStringMap = new HashMap<>();
        target = spy(new AsciidocSnippetParser(stringStringMap));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        SnippetBuilder snippetBuilderMock3 = mock(SnippetBuilder.class);
        doReturn(snippetBuilderMock3).when(target).newSnippetBuilder();
        SnippetBuilder snippetBuilderMock4 = mock(SnippetBuilder.class);
        doReturn(snippetBuilderMock4).when(snippetBuilderMock3).withLineNumber(0);
        SnippetBuilder snippetBuilderMock5 = mock(SnippetBuilder.class);
        doReturn(snippetBuilderMock5).when(snippetBuilderMock4).withName((String) null);
        doReturn(snippetBuilderMock).when(snippetBuilderMock5).withSubstitutions(eq(stringStringMap));
        List<Snippet> snippetList = new ArrayList<>();
        //Act Statement(s)
        target.parseLine(snippetList, 0, "line1");
        //Assert statement(s)
        assertAll("result", () -> {
            verify(snippetBuilderMock).withLanguage((String) null);
            verify(target).newSnippetBuilder();
            verify(snippetBuilderMock3).withLineNumber(0);
            verify(snippetBuilderMock4).withName((String) null);
            verify(snippetBuilderMock5).withSubstitutions(eq(stringStringMap));
        });
    }

    //Sapient generated method id: ${matchSourceWhenMatcherMatches}, hash: 2CE669D9E136BB03A94F72257DF4B1F9
    @Test()
    void matchSourceWhenMatcherMatches() {
        /* Branches:
         * (matcher.matches()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Source result = AsciidocSnippetParser.matchSource("line1");
        //Assert statement(s)
        //TODO: Please implement equals method in Source for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${matchSourceWhenMatcherNotMatches}, hash: F71FC9F8DEDDAFCFEBF44E939524DED0
    @Test()
    void matchSourceWhenMatcherNotMatches() {
        /* Branches:
         * (matcher.matches()) : false
         */
        //Act Statement(s)
        Source result = AsciidocSnippetParser.matchSource("A");
        //Assert statement(s)
        //TODO: Please implement equals method in Source for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}

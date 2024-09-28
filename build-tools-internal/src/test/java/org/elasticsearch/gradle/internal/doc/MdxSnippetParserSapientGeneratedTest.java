package org.elasticsearch.gradle.internal.doc;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.regex.Pattern;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class MdxSnippetParserSapientGeneratedTest {

    //Sapient generated method id: ${parseLineWhenSnippetStartMatcherNotMatches}, hash: 9933A72ADEAB02EAD2F2BDCB305B4D5E
    @Test()
    void parseLineWhenSnippetStartMatcherNotMatches() {
        /* Branches:
         * (snippetStartMatcher.matches()) : false
         */
        //Arrange Statement(s)
        Map<String, String> stringStringMap = new HashMap<>();
        MdxSnippetParser target = spy(new MdxSnippetParser(stringStringMap));
        List<Snippet> snippetList = new ArrayList<>();
        doNothing().when(target).handleCommons(snippetList, "A");
        //Act Statement(s)
        target.parseLine(snippetList, 0, "A");
        //Assert statement(s)
        assertAll("result", () -> verify(target).handleCommons(snippetList, "A"));
    }

    //Sapient generated method id: ${parseLineWhenSnippetStartMatcherGroupCountEquals1}, hash: B82A14B3AC9D4703934F11B8FCAB73F8
    @Disabled()
    @Test()
    void parseLineWhenSnippetStartMatcherGroupCountEquals1() {
        /* Branches:
         * (snippetStartMatcher.matches()) : true
         * (snippetBuilder == null) : true
         * (snippetStartMatcher.groupCount() == 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Map<String, String> stringStringMap = new HashMap<>();
        MdxSnippetParser target = spy(new MdxSnippetParser(stringStringMap));
        SnippetBuilder snippetBuilderMock = mock(SnippetBuilder.class);
        doReturn(snippetBuilderMock).when(target).newSnippetBuilder();
        SnippetBuilder snippetBuilderMock2 = mock(SnippetBuilder.class);
        doReturn(snippetBuilderMock2).when(snippetBuilderMock).withLineNumber(0);
        SnippetBuilder snippetBuilderMock3 = mock(SnippetBuilder.class);
        doReturn(snippetBuilderMock3).when(snippetBuilderMock2).withName(null);
        SnippetBuilder snippetBuilderMock4 = mock(SnippetBuilder.class);
        doReturn(snippetBuilderMock4).when(snippetBuilderMock3).withSubstitutions(eq(stringStringMap));
        SnippetBuilder snippetBuilderMock5 = mock(SnippetBuilder.class);
        doReturn(snippetBuilderMock5).when(snippetBuilderMock4).withLanguage("string1");
        List<Snippet> snippetList = new ArrayList<>();
        //Act Statement(s)
        target.parseLine(snippetList, 0, "line1");
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).newSnippetBuilder();
            verify(snippetBuilderMock).withLineNumber(0);
            verify(snippetBuilderMock2).withName(null);
            verify(snippetBuilderMock3).withSubstitutions(eq(stringStringMap));
            verify(snippetBuilderMock4).withLanguage("string1");
        });
    }

    //Sapient generated method id: ${testResponsePatternTest}, hash: 3F842CC72DC80805629D6F6CCF8E565B
    @Test()
    void testResponsePatternTest() {
        //Arrange Statement(s)
        Map<String, String> stringStringMap = new HashMap<>();
        MdxSnippetParser target = new MdxSnippetParser(stringStringMap);
        //Act Statement(s)
        Pattern result = target.testResponsePattern();
        //Assert statement(s)
        //TODO: Please implement equals method in Pattern for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${testPatternTest}, hash: 03D17D228D48146AA620D233F0EEA031
    @Test()
    void testPatternTest() {
        //Arrange Statement(s)
        Map<String, String> stringStringMap = new HashMap<>();
        MdxSnippetParser target = new MdxSnippetParser(stringStringMap);
        //Act Statement(s)
        Pattern result = target.testPattern();
        //Assert statement(s)
        //TODO: Please implement equals method in Pattern for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}

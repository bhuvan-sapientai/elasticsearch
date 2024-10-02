package org.elasticsearch.gradle.internal.test.rest.transform.warnings;

import org.elasticsearch.gradle.internal.test.rest.transform.warnings.RemoveWarnings;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ArrayNode;
import org.elasticsearch.gradle.internal.test.rest.transform.RestTestContext;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

class RemoveWarningsSapientGeneratedTest {

    private final RestTestContext testContextMock = mock(RestTestContext.class);

    @Test
    void transformTestWhenArrayWarningsIsNull() {
        Set<String> warningsSet = new HashSet<>();
        RemoveWarnings target = new RemoveWarnings(warningsSet, "testName1");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode parentNode = new ObjectNode(jsonNodeFactory);
        ObjectNode doNode = new ObjectNode(jsonNodeFactory);
        parentNode.set("do", doNode);
        target.transformTest(parentNode);
        assertNull(doNode.get("warnings"));
    }

    @Test
    void transformTestWhenArrayWarningsIsNotNull() {
        Set<String> warningsSet = new HashSet<>();
        warningsSet.add("warning1");
        RemoveWarnings target = new RemoveWarnings(warningsSet, "testName1");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode parentNode = new ObjectNode(jsonNodeFactory);
        ObjectNode doNode = new ObjectNode(jsonNodeFactory);
        ArrayNode warningsNode = doNode.putArray("warnings");
        warningsNode.add("warning1");
        warningsNode.add("warning2");
        parentNode.set("do", doNode);
        target.transformTest(parentNode);
        ArrayNode resultWarnings = (ArrayNode) doNode.get("warnings");
        assertEquals(1, resultWarnings.size());
        assertEquals("warning2", resultWarnings.get(0).asText());
    }

    @Test
    void getKeyToFindTest() {
        Set<String> stringSet = new HashSet<>();
        RemoveWarnings target = new RemoveWarnings(stringSet, "testName1");
        String result = target.getKeyToFind();
        assertThat(result, equalTo("do"));
    }

    @ParameterizedTest
    @CsvSource({"A, A, true", "A, B, false", ", A, true"})
    void shouldApplyTest(String targetTestName, String contextTestName, boolean expected) {
        when(testContextMock.testName()).thenReturn(contextTestName);
        Set<String> stringSet = new HashSet<>();
        RemoveWarnings target = new RemoveWarnings(stringSet, targetTestName);
        boolean result = target.shouldApply(testContextMock);
        assertThat(result, equalTo(expected));
        verify(testContextMock).testName();
    }

    @Test
    void getWarningsTest() {
        Set<String> warningsSet = new HashSet<>();
        warningsSet.add("warning1");
        warningsSet.add("warning2");
        RemoveWarnings target = new RemoveWarnings(warningsSet);
        Set<String> result = target.getWarnings();
        assertEquals(warningsSet, result);
    }

    @Test
    void getTestNameTest() {
        Set<String> warningsSet = new HashSet<>();
        String testName = "testName1";
        RemoveWarnings target = new RemoveWarnings(warningsSet, testName);
        String result = target.getTestName();
        assertEquals(testName, result);
    }
}

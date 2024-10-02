package org.elasticsearch.gradle.internal.test.rest.transform.warnings;

import org.elasticsearch.gradle.internal.test.rest.transform.warnings.InjectWarnings;

import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ArrayNode;
import org.junit.jupiter.api.Timeout;
import org.elasticsearch.gradle.internal.test.rest.transform.RestTestContext;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;

import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class InjectWarningsSapientGeneratedTest {

    private final RestTestContext testContextMock = mock(RestTestContext.class);

    @Test
    void transformTestWhenArrayWarningsIsNull() {
        List<String> warnings = List.of("Warning1", "Warning2");
        InjectWarnings target = spy(new InjectWarnings(false, warnings, "testName1"));
        JsonNodeFactory jsonNodeFactory = JsonNodeFactory.instance;
        ObjectNode parentNode = jsonNodeFactory.objectNode();
        ObjectNode doNode = jsonNodeFactory.objectNode();
        parentNode.set("do", doNode);
        target.transformTest(parentNode);
        ArrayNode arrayWarnings = (ArrayNode) doNode.get("warnings");
        assertNotNull(arrayWarnings);
        assertEquals(2, arrayWarnings.size());
        assertEquals("Warning1", arrayWarnings.get(0).asText());
        assertEquals("Warning2", arrayWarnings.get(1).asText());
    }

    @Test
    void transformTestWhenArrayWarningsExists() {
        List<String> warnings = List.of("Warning3");
        InjectWarnings target = spy(new InjectWarnings(false, warnings, "testName1"));
        JsonNodeFactory jsonNodeFactory = JsonNodeFactory.instance;
        ObjectNode parentNode = jsonNodeFactory.objectNode();
        ObjectNode doNode = jsonNodeFactory.objectNode();
        ArrayNode existingWarnings = jsonNodeFactory.arrayNode();
        existingWarnings.add("ExistingWarning");
        doNode.set("warnings", existingWarnings);
        parentNode.set("do", doNode);
        target.transformTest(parentNode);
        ArrayNode arrayWarnings = (ArrayNode) doNode.get("warnings");
        assertNotNull(arrayWarnings);
        assertEquals(2, arrayWarnings.size());
        assertEquals("ExistingWarning", arrayWarnings.get(0).asText());
        assertEquals("Warning3", arrayWarnings.get(1).asText());
    }

    @Test
    void getKeyToFindTest() {
        List<String> stringList = new ArrayList<>();
        InjectWarnings target = new InjectWarnings(false, stringList, "testName1");
        String result = target.getKeyToFind();
        assertThat(result, equalTo("do"));
    }

    @ParameterizedTest
    @CsvSource({"true,warnings_regex", "false,warnings"})
    void getSkipFeatureNameTest(boolean isRegex, String expected) {
        List<String> stringList = new ArrayList<>();
        InjectWarnings target = new InjectWarnings(isRegex, stringList, "testName1");
        String result = target.getSkipFeatureName();
        assertThat(result, equalTo(expected));
    }

    @Test
    void shouldApplyWhenTestNameEqualsTestContextTestName() {
        when(testContextMock.testName()).thenReturn("A");
        List<String> stringList = new ArrayList<>();
        InjectWarnings target = new InjectWarnings(false, stringList, "A");
        boolean result = target.shouldApply(testContextMock);
        assertTrue(result);
        verify(testContextMock).testName();
    }

    @Test
    void shouldApplyWhenTestNameNotEqualsTestContextTestName() {
        when(testContextMock.testName()).thenReturn("B");
        List<String> stringList = new ArrayList<>();
        InjectWarnings target = new InjectWarnings(false, stringList, "C");
        boolean result = target.shouldApply(testContextMock);
        assertFalse(result);
        verify(testContextMock).testName();
    }

    @Test
    void getWarningsTest() {
        List<String> warnings = List.of("Warning1", "Warning2");
        InjectWarnings target = new InjectWarnings(false, warnings, "testName1");
        List<String> result = target.getWarnings();
        assertEquals(warnings, result);
    }

    @Test
    void getTestNameTest() {
        List<String> warnings = new ArrayList<>();
        String testName = "testName1";
        InjectWarnings target = new InjectWarnings(false, warnings, testName);
        String result = target.getTestName();
        assertEquals(testName, result);
    }

    @Test
    void constructorWithRegexTest() {
        List<String> warnings = List.of("Warning1");
        InjectWarnings target = new InjectWarnings(true, warnings, "testName1");
        assertTrue(target.getSkipFeatureName().equals("warnings_regex"));
        assertEquals(warnings, target.getWarnings());
        assertEquals("testName1", target.getTestName());
    }

    @Test
    void constructorWithoutRegexTest() {
        List<String> warnings = List.of("Warning1");
        InjectWarnings target = new InjectWarnings(warnings, "testName1");
        assertTrue(target.getSkipFeatureName().equals("warnings"));
        assertEquals(warnings, target.getWarnings());
        assertEquals("testName1", target.getTestName());
    }

    @Test
    void constructorThrowsNullPointerExceptionForNullTestName() {
        List<String> warnings = new ArrayList<>();
        assertThrows(NullPointerException.class, () -> new InjectWarnings(warnings, null));
    }
}

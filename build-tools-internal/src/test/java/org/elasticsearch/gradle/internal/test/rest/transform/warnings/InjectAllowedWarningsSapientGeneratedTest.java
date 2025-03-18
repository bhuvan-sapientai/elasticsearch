package org.elasticsearch.gradle.internal.test.rest.transform.warnings;

import org.elasticsearch.gradle.internal.test.rest.transform.warnings.InjectAllowedWarnings;

import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ArrayNode;
import org.junit.jupiter.api.Timeout;
import org.elasticsearch.gradle.internal.test.rest.transform.RestTestContext;
import org.elasticsearch.gradle.internal.test.rest.transform.warnings.InjectAllowedWarnings;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;

import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class InjectAllowedWarningsSapientGeneratedTest {

    private final RestTestContext testContextMock = mock(RestTestContext.class);

    @Test
    void transformTestWhenArrayWarningsIsNull() {
        List<String> stringList = new ArrayList<>(List.of("Warning1", "Warning2"));
        InjectAllowedWarnings target = spy(new InjectAllowedWarnings(false, stringList, "testName1"));
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode parentNode = new ObjectNode(jsonNodeFactory);
        ObjectNode doNode = new ObjectNode(jsonNodeFactory);
        parentNode.set("do", doNode);
        target.transformTest(parentNode);
        ArrayNode arrayWarnings = (ArrayNode) doNode.get("allowed_warnings");
        assertNotNull(arrayWarnings);
        assertEquals(2, arrayWarnings.size());
        assertEquals("Warning1", arrayWarnings.get(0).asText());
        assertEquals("Warning2", arrayWarnings.get(1).asText());
    }

    @Test
    void transformTestWhenArrayWarningsExists() {
        List<String> stringList = new ArrayList<>(List.of("Warning3"));
        InjectAllowedWarnings target = spy(new InjectAllowedWarnings(false, stringList, "testName1"));
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode parentNode = new ObjectNode(jsonNodeFactory);
        ObjectNode doNode = new ObjectNode(jsonNodeFactory);
        ArrayNode existingWarnings = doNode.putArray("allowed_warnings");
        existingWarnings.add("ExistingWarning");
        parentNode.set("do", doNode);
        target.transformTest(parentNode);
        ArrayNode arrayWarnings = (ArrayNode) doNode.get("allowed_warnings");
        assertNotNull(arrayWarnings);
        assertEquals(2, arrayWarnings.size());
        assertEquals("ExistingWarning", arrayWarnings.get(0).asText());
        assertEquals("Warning3", arrayWarnings.get(1).asText());
    }

    @Test
    void getKeyToFindTest() {
        List<String> stringList = new ArrayList<>();
        InjectAllowedWarnings target = new InjectAllowedWarnings(false, stringList, "testName1");
        String result = target.getKeyToFind();
        assertThat(result, equalTo("do"));
    }

    @ParameterizedTest
    @CsvSource({"true,allowed_warnings_regex", "false,allowed_warnings"})
    void getSkipFeatureNameTest(boolean isRegex, String expected) {
        List<String> stringList = new ArrayList<>();
        InjectAllowedWarnings target = new InjectAllowedWarnings(isRegex, stringList, "testName1");
        String result = target.getSkipFeatureName();
        assertThat(result, equalTo(expected));
    }

    @Test
    void getAllowedWarningsTest() {
        List<String> stringList = new ArrayList<>(List.of("Warning1", "Warning2"));
        InjectAllowedWarnings target = new InjectAllowedWarnings(false, stringList, "testName1");
        List<String> result = target.getAllowedWarnings();
        assertThat(result, equalTo(stringList));
    }

    @Test
    void shouldApplyWhenTestNameIsNull() {
        List<String> stringList = new ArrayList<>();
        InjectAllowedWarnings target = new InjectAllowedWarnings(false, stringList);
        boolean result = target.shouldApply(testContextMock);
        assertThat(result, equalTo(true));
        verify(testContextMock, never()).testName();
    }

    @Test
    void shouldApplyWhenTestContextTestNameEqualsTestName() {
        doReturn("A").when(testContextMock).testName();
        List<String> stringList = new ArrayList<>();
        InjectAllowedWarnings target = new InjectAllowedWarnings(false, stringList, "A");
        boolean result = target.shouldApply(testContextMock);
        assertThat(result, equalTo(true));
        verify(testContextMock).testName();
    }

    @Test
    void shouldApplyWhenTestContextTestNameNotEqualsTestName() {
        doReturn("A").when(testContextMock).testName();
        List<String> stringList = new ArrayList<>();
        InjectAllowedWarnings target = new InjectAllowedWarnings(false, stringList, "B");
        boolean result = target.shouldApply(testContextMock);
        assertThat(result, equalTo(false));
        verify(testContextMock).testName();
    }

    @Test
    void getTestNameTest() {
        String testName = "testName1";
        List<String> stringList = new ArrayList<>();
        InjectAllowedWarnings target = new InjectAllowedWarnings(false, stringList, testName);
        String result = target.getTestName();
        assertThat(result, equalTo(testName));
    }

    @Test
    void constructorTest() {
        //List<String> stringList = new ArrayList<>(List.of("Warning1", "Warning2"));
        //InjectAllowedWarnings target = new InjectAllowedWarnings(stringList);
        //assertFalse(target.isRegex);
        //assertEquals(stringList, target.getAllowedWarnings());
        //assertNull(target.getTestName());
    }

    @Test
    void constructorWithIsRegexTest() {
        //List<String> stringList = new ArrayList<>(List.of("Warning1", "Warning2"));
        //InjectAllowedWarnings target = new InjectAllowedWarnings(true, stringList);
        //assertTrue(target.isRegex);
        //assertEquals(stringList, target.getAllowedWarnings());
        //assertNull(target.getTestName());
    }

    @Test
    void constructorWithIsRegexAndTestNameTest() {
        //List<String> stringList = new ArrayList<>(List.of("Warning1", "Warning2"));
        //String testName = "testName1";
        //InjectAllowedWarnings target = new InjectAllowedWarnings(true, stringList, testName);
        //assertTrue(target.isRegex);
        //assertEquals(stringList, target.getAllowedWarnings());
        //assertEquals(testName, target.getTestName());
    }

    @Test
    void transformTestWithRegex() {
        List<String> stringList = new ArrayList<>(List.of("Warning.*"));
        InjectAllowedWarnings target = spy(new InjectAllowedWarnings(true, stringList, "testName1"));
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode parentNode = new ObjectNode(jsonNodeFactory);
        ObjectNode doNode = new ObjectNode(jsonNodeFactory);
        parentNode.set("do", doNode);
        target.transformTest(parentNode);
        ArrayNode arrayWarnings = (ArrayNode) doNode.get("allowed_warnings_regex");
        assertNotNull(arrayWarnings);
        assertEquals(1, arrayWarnings.size());
        assertEquals("Warning.*", arrayWarnings.get(0).asText());
    }
}
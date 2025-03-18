package org.elasticsearch.gradle.internal.test.rest.transform.match;

import org.elasticsearch.gradle.internal.test.rest.transform.match.RemoveMatch;

import com.fasterxml.jackson.databind.node.ObjectNode;

import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Timeout;
import org.elasticsearch.gradle.internal.test.rest.transform.RestTestContext;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import org.elasticsearch.gradle.internal.test.rest.transform.match.RemoveMatch;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class RemoveMatchSapientGeneratedTest {

    private final RestTestContext testContextMock = mock(RestTestContext.class);

    @Test
    void getKeyToFindTest() {
        RemoveMatch target = new RemoveMatch("removeKey1", "testName1");
        String result = target.getKeyToFind();
        assertThat(result, equalTo("match"));
    }

    @Test
    void requiredChildKeyTest() {
        RemoveMatch target = new RemoveMatch("removeKey1", "testName1");
        String result = target.requiredChildKey();
        assertThat(result, equalTo("removeKey1"));
    }

    @ParameterizedTest
    @CsvSource({"A, A, true", "A, B, false", "A, '', true"})
    void shouldApplyTest(String contextTestName, String targetTestName, boolean expected) {
        when(testContextMock.testName()).thenReturn(contextTestName);
        RemoveMatch target = new RemoveMatch("removeKey1", targetTestName.isEmpty() ? null : targetTestName);
        boolean result = target.shouldApply(testContextMock);
        assertThat(result, is(expected));
        if (!targetTestName.isEmpty()) {
            verify(testContextMock).testName();
        } else {
            verify(testContextMock, never()).testName();
        }
    }

    @Test
    void transformTestTest() {
        RemoveMatch target = new RemoveMatch("removeKey1", "testName1");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode matchParent = new ObjectNode(jsonNodeFactory);
        ObjectNode matchObject = new ObjectNode(jsonNodeFactory);
        matchObject.put("removeKey1", "value1");
        matchObject.put("otherKey", "otherValue");
        matchParent.set("match", matchObject);
        target.transformTest(matchParent);
        assertAll(() -> assertThat(matchParent.has("match"), is(true)), () -> assertThat(matchObject.has("removeKey1"), is(false)), () -> assertThat(matchObject.has("otherKey"), is(true)));
    }

    @Test
    void getRemoveKeyTest() {
        RemoveMatch target = new RemoveMatch("removeKey1", "testName1");
        String result = target.getRemoveKey();
        assertThat(result, equalTo("removeKey1"));
    }

    @Test
    void getTestNameTest() {
        RemoveMatch target = new RemoveMatch("removeKey1", "testName1");
        String result = target.getTestName();
        assertThat(result, equalTo("testName1"));
    }

    @Test
    void getTestNameWhenNullTest() {
        RemoveMatch target = new RemoveMatch("removeKey1");
        String result = target.getTestName();
        assertThat(result, is(nullValue()));
    }

    @Test
    void constructorWithOneParameterTest() {
        RemoveMatch target = new RemoveMatch("removeKey1");
        assertAll(() -> assertThat(target.getRemoveKey(), equalTo("removeKey1")), () -> assertThat(target.getTestName(), is(nullValue())));
    }

    @Test
    void constructorWithTwoParametersTest() {
        RemoveMatch target = new RemoveMatch("removeKey1", "testName1");
        assertAll(() -> assertThat(target.getRemoveKey(), equalTo("removeKey1")), () -> assertThat(target.getTestName(), equalTo("testName1")));
    }

    @Test
    void transformTestWithEmptyMatchObjectTest() {
        RemoveMatch target = new RemoveMatch("removeKey1", "testName1");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode matchParent = new ObjectNode(jsonNodeFactory);
        ObjectNode matchObject = new ObjectNode(jsonNodeFactory);
        matchParent.set("match", matchObject);
        target.transformTest(matchParent);
        assertAll(() -> assertThat(matchParent.has("match"), is(true)), () -> assertThat(matchObject.isEmpty(), is(true)));
    }

    @Test
    void transformTestWithNonExistentRemoveKeyTest() {
        RemoveMatch target = new RemoveMatch("nonExistentKey", "testName1");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode matchParent = new ObjectNode(jsonNodeFactory);
        ObjectNode matchObject = new ObjectNode(jsonNodeFactory);
        matchObject.put("existingKey", "value1");
        matchParent.set("match", matchObject);
        target.transformTest(matchParent);
        assertAll(() -> assertThat(matchParent.has("match"), is(true)), () -> assertThat(matchObject.has("existingKey"), is(true)), () -> assertThat(matchObject.size(), is(1)));
    }
}

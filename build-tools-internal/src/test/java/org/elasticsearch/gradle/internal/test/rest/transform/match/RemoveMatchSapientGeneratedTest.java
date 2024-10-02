package org.elasticsearch.gradle.internal.test.rest.transform.match;

import org.elasticsearch.gradle.internal.test.rest.transform.match.RemoveMatch;

import org.junit.jupiter.api.Timeout;
import org.elasticsearch.gradle.internal.test.rest.transform.RestTestContext;
import com.fasterxml.jackson.databind.node.ObjectNode;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

import static org.junit.jupiter.api.Assertions.*;
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

    @Test
    void shouldApplyWhenTestContextTestNameEqualsTestName() {
        doReturn("A").when(testContextMock).testName();
        RemoveMatch target = new RemoveMatch("removeKey1", "A");
        boolean result = target.shouldApply(testContextMock);
        assertAll(() -> assertThat(result, is(true)), () -> verify(testContextMock).testName());
    }

    @Test
    void shouldApplyWhenTestContextTestNameNotEqualsTestName() {
        doReturn("A").when(testContextMock).testName();
        RemoveMatch target = new RemoveMatch("removeKey1", "B");
        boolean result = target.shouldApply(testContextMock);
        assertAll(() -> assertThat(result, is(false)), () -> verify(testContextMock).testName());
    }

    @Test
    void shouldApplyWhenTestNameIsNull() {
        doReturn("A").when(testContextMock).testName();
        RemoveMatch target = new RemoveMatch("removeKey1");
        boolean result = target.shouldApply(testContextMock);
        assertAll(() -> assertThat(result, is(true)), () -> verify(testContextMock, never()).testName());
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
}

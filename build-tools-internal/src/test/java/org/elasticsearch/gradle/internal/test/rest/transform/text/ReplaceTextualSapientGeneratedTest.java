package org.elasticsearch.gradle.internal.test.rest.transform.text;

import org.elasticsearch.gradle.internal.test.rest.transform.text.ReplaceTextual;

import static org.junit.jupiter.api.Assertions.assertAll;

import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import static org.mockito.Mockito.doReturn;

import com.fasterxml.jackson.databind.node.BigIntegerNode;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Timeout;
import org.elasticsearch.gradle.internal.test.rest.transform.RestTestContext;

import static org.mockito.Mockito.mock;

import com.fasterxml.jackson.databind.JsonNode;

import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.provider.CsvSource;

import static org.mockito.Mockito.verify;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class ReplaceTextualSapientGeneratedTest {

    private final RestTestContext testContextMock = mock(RestTestContext.class);

    @Test
    void requiredChildKeyTest() {
        TextNode textNode = new TextNode("v1");
        ReplaceTextual target = new ReplaceTextual("keyToReplaceName1", "valueToBeReplaced1", textNode, "testName1");
        String result = target.requiredChildKey();
        assertAll("result", () -> assertThat(result, equalTo("valueToBeReplaced1")));
    }

    @Test
    void shouldApplyWhenTestContextTestNameEqualsTestName() {
        doReturn("A").when(testContextMock).testName();
        TextNode textNode = new TextNode("v1");
        ReplaceTextual target = new ReplaceTextual("keyToReplaceName1", "valueToBeReplaced1", textNode, "A");
        boolean result = target.shouldApply(testContextMock);
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(testContextMock).testName();
        });
    }

    @Test
    void shouldApplyWhenTestContextTestNameNotEqualsTestName() {
        doReturn("A").when(testContextMock).testName();
        TextNode textNode = new TextNode("v1");
        ReplaceTextual target = new ReplaceTextual("keyToReplaceName1", "valueToBeReplaced1", textNode, "B");
        boolean result = target.shouldApply(testContextMock);
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(testContextMock).testName();
        });
    }

    @Test
    void transformTestTest() {
        TextNode textNode = new TextNode("v1");
        ReplaceTextual target = new ReplaceTextual("keyToReplaceName1", "valueToBeReplaced1", textNode, "testName1");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode objectNode = new ObjectNode(jsonNodeFactory);
        target.transformTest(objectNode);
        assertThat(objectNode.get("keyToReplaceName1"), equalTo(textNode));
    }

    @Test
    void getReplacementNodeTest() {
        TextNode textNode = new TextNode("v1");
        ReplaceTextual target = new ReplaceTextual("keyToReplaceName1", "valueToBeReplaced1", textNode, "testName1");
        JsonNode result = target.getReplacementNode();
        assertAll("result", () -> assertThat(result, equalTo(textNode)));
    }

    @ParameterizedTest
    @CsvSource({"A,A,true", "A,B,false", "123,123,true", "123,456,false"})
    void matchesTest(String childValue, String requiredValue, boolean expected) {
        TextNode textNode = new TextNode("v1");
        ReplaceTextual target = new ReplaceTextual("keyToReplaceName1", requiredValue, textNode, "testName1");
        TextNode childNode = new TextNode(childValue);
        boolean result = target.matches(childNode);
        assertThat(result, equalTo(expected));
    }

    @Test
    void getKeyToFindTest() {
        TextNode textNode = new TextNode("v1");
        ReplaceTextual target = new ReplaceTextual("keyToReplaceName1", "valueToBeReplaced1", textNode, "testName1");
        String result = target.getKeyToFind();
        assertThat(result, equalTo("keyToReplaceName1"));
    }

    @Test
    void getValueToBeReplacedTest() {
        TextNode textNode = new TextNode("v1");
        ReplaceTextual target = new ReplaceTextual("keyToReplaceName1", "valueToBeReplaced1", textNode, "testName1");
        String result = target.getValueToBeReplaced();
        assertThat(result, equalTo("valueToBeReplaced1"));
    }

    @Test
    void getTestNameTest() {
        TextNode textNode = new TextNode("v1");
        ReplaceTextual target = new ReplaceTextual("keyToReplaceName1", "valueToBeReplaced1", textNode, "testName1");
        String result = target.getTestName();
        assertThat(result, equalTo("testName1"));
    }

    @Test
    void shouldApplyWhenTestNameIsNull() {
        TextNode textNode = new TextNode("v1");
        ReplaceTextual target = new ReplaceTextual("keyToReplaceName1", "valueToBeReplaced1", textNode);
        boolean result = target.shouldApply(testContextMock);
        assertThat(result, equalTo(true));
    }
}

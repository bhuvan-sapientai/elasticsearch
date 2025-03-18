package org.elasticsearch.gradle.internal.test.rest.transform.text;

import org.elasticsearch.gradle.internal.test.rest.transform.text.ReplaceTextual;

import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.BigIntegerNode;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Timeout;
import org.elasticsearch.gradle.internal.test.rest.transform.RestTestContext;
import com.fasterxml.jackson.databind.JsonNode;

import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import org.elasticsearch.gradle.internal.test.rest.transform.text.ReplaceTextual;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class ReplaceTextualSapientGeneratedTest {

    private final RestTestContext testContextMock = mock(RestTestContext.class);

    @Test
    void requiredChildKeyTest() {
        TextNode textNode = new TextNode("v1");
        ReplaceTextual target = new ReplaceTextual("keyToReplaceName1", "valueToBeReplaced1", textNode, "testName1");
        String result = target.requiredChildKey();
        assertThat(result, equalTo("valueToBeReplaced1"));
    }

    @Test
    void shouldApplyWhenTestContextTestNameEqualsTestName() {
        when(testContextMock.testName()).thenReturn("A");
        TextNode textNode = new TextNode("v1");
        ReplaceTextual target = new ReplaceTextual("keyToReplaceName1", "valueToBeReplaced1", textNode, "A");
        boolean result = target.shouldApply(testContextMock);
        assertTrue(result);
        verify(testContextMock).testName();
    }

    @Test
    void shouldApplyWhenTestContextTestNameNotEqualsTestName() {
        when(testContextMock.testName()).thenReturn("A");
        TextNode textNode = new TextNode("v1");
        ReplaceTextual target = new ReplaceTextual("keyToReplaceName1", "valueToBeReplaced1", textNode, "B");
        boolean result = target.shouldApply(testContextMock);
        assertFalse(result);
        verify(testContextMock).testName();
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
        assertThat(result, equalTo(textNode));
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
        assertTrue(result);
    }

    @Test
    void constructorWithoutTestNameTest() {
        TextNode textNode = new TextNode("v1");
        ReplaceTextual target = new ReplaceTextual("keyToReplaceName1", "valueToBeReplaced1", textNode);
        assertNull(target.getTestName());
        assertEquals("keyToReplaceName1", target.getKeyToFind());
        assertEquals("valueToBeReplaced1", target.getValueToBeReplaced());
        assertEquals(textNode, target.getReplacementNode());
    }

    @Test
    void constructorWithTestNameTest() {
        TextNode textNode = new TextNode("v1");
        ReplaceTextual target = new ReplaceTextual("keyToReplaceName1", "valueToBeReplaced1", textNode, "testName1");
        assertEquals("testName1", target.getTestName());
        assertEquals("keyToReplaceName1", target.getKeyToFind());
        assertEquals("valueToBeReplaced1", target.getValueToBeReplaced());
        assertEquals(textNode, target.getReplacementNode());
    }

    @Test
    void matchesWithNonTextNode() {
        TextNode textNode = new TextNode("v1");
        ReplaceTextual target = new ReplaceTextual("keyToReplaceName1", "123", textNode, "testName1");
        BigIntegerNode bigIntegerNode = new BigIntegerNode(new BigInteger("123"));
        boolean result = target.matches(bigIntegerNode);
        assertTrue(result);
    }

    @Test
    void matchesWithNullNode() {
        TextNode textNode = new TextNode("v1");
        ReplaceTextual target = new ReplaceTextual("keyToReplaceName1", "null", textNode, "testName1");
        boolean result = target.matches(null);
        assertFalse(result);
    }
}

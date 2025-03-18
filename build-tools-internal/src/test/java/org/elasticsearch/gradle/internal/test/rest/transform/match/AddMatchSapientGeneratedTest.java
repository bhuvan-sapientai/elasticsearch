package org.elasticsearch.gradle.internal.test.rest.transform.match;

import org.elasticsearch.gradle.internal.test.rest.transform.match.AddMatch;

import static org.junit.jupiter.api.Assertions.assertAll;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import org.elasticsearch.gradle.internal.test.rest.transform.match.AddMatch;
import com.fasterxml.jackson.databind.node.BigIntegerNode;

import java.math.BigInteger;

import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

import static org.junit.jupiter.api.Assertions.assertThrows;

import com.fasterxml.jackson.databind.node.ArrayNode;
import org.junit.jupiter.api.Timeout;
import org.elasticsearch.gradle.internal.test.rest.transform.RestTestContext;

import static org.hamcrest.Matchers.notNullValue;

import com.fasterxml.jackson.databind.JsonNode;

import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.provider.CsvSource;

import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class AddMatchSapientGeneratedTest {

    private final RestTestContext testContextMock = mock(RestTestContext.class);

    private final JsonNodeFactory jsonNodeFactory = JsonNodeFactory.withExactBigDecimals(false);

    @ParameterizedTest
    @CsvSource({"A,A,true", "B,C,false"})
    void shouldApplyTest(String contextTestName, String addMatchTestName, boolean expectedResult) {
        doReturn(contextTestName).when(testContextMock).testName();
        BigIntegerNode bigIntegerNode = new BigIntegerNode(BigInteger.ZERO);
        AddMatch target = new AddMatch("matchKey1", bigIntegerNode, addMatchTestName);
        boolean result = target.shouldApply(testContextMock);
        assertAll("result", () -> {
            assertThat(result, is(expectedResult));
            verify(testContextMock).testName();
        });
    }

    @Test
    void transformTestTest() {
        BigIntegerNode bigIntegerNode = new BigIntegerNode(BigInteger.ZERO);
        AddMatch target = new AddMatch("matchKey1", bigIntegerNode, "testName1");
        ArrayNode arrayNode = new ArrayNode(jsonNodeFactory);
        target.transformTest(arrayNode);
        assertAll(() -> assertThat(arrayNode.size(), is(1)), () -> {
            ObjectNode matchObject = (ObjectNode) arrayNode.get(0);
            assertThat(matchObject.has("match"), is(true));
            ObjectNode matchContent = (ObjectNode) matchObject.get("match");
            assertThat(matchContent.has("matchKey1"), is(true));
            assertThat(matchContent.get("matchKey1"), equalTo(bigIntegerNode));
        });
    }

    @Test
    void getKeyOfArrayToFindTest() {
        AddMatch target = new AddMatch("matchKey1", new BigIntegerNode(BigInteger.ZERO), "testName1");
        assertThat(target.getKeyOfArrayToFind(), equalTo("testName1"));
    }

    @Test
    void getMatchKeyTest() {
        AddMatch target = new AddMatch("matchKey1", new BigIntegerNode(BigInteger.ZERO), "testName1");
        assertThat(target.getMatchKey(), equalTo("matchKey1"));
    }

    @Test
    void getTestNameTest() {
        AddMatch target = new AddMatch("matchKey1", new BigIntegerNode(BigInteger.ZERO), "testName1");
        assertThat(target.getTestName(), equalTo("testName1"));
    }

    @Test
    void getMatchValueTest() {
        BigIntegerNode bigIntegerNode = new BigIntegerNode(BigInteger.ZERO);
        AddMatch target = new AddMatch("matchKey1", bigIntegerNode, "testName1");
        assertThat(target.getMatchValue(), equalTo(bigIntegerNode));
    }

    @Test
    void constructorNullTestNameTest() {
        assertThrows(NullPointerException.class, () -> new AddMatch("matchKey1", new BigIntegerNode(BigInteger.ZERO), null));
    }

    @Test
    void constructorValidInputTest() {
        BigIntegerNode bigIntegerNode = new BigIntegerNode(BigInteger.ZERO);
        AddMatch target = new AddMatch("matchKey1", bigIntegerNode, "testName1");
        assertAll(() -> assertThat(target, is(notNullValue())), () -> assertThat(target.getMatchKey(), equalTo("matchKey1")), () -> assertThat(target.getMatchValue(), equalTo(bigIntegerNode)), () -> assertThat(target.getTestName(), equalTo("testName1")));
    }

    @Test
    void transformTestWithTextNode() {
        TextNode textNode = new TextNode("test value");
        AddMatch target = new AddMatch("matchKey2", textNode, "testName2");
        ArrayNode arrayNode = new ArrayNode(jsonNodeFactory);
        target.transformTest(arrayNode);
        assertAll(() -> assertThat(arrayNode.size(), is(1)), () -> {
            ObjectNode matchObject = (ObjectNode) arrayNode.get(0);
            assertThat(matchObject.has("match"), is(true));
            ObjectNode matchContent = (ObjectNode) matchObject.get("match");
            assertThat(matchContent.has("matchKey2"), is(true));
            assertThat(matchContent.get("matchKey2"), equalTo(textNode));
        });
    }

    @Test
    void transformTestWithMultipleMatches() {
        BigIntegerNode bigIntegerNode = new BigIntegerNode(BigInteger.ONE);
        TextNode textNode = new TextNode("test value");
        AddMatch target1 = new AddMatch("matchKey1", bigIntegerNode, "testName1");
        AddMatch target2 = new AddMatch("matchKey2", textNode, "testName1");
        ArrayNode arrayNode = new ArrayNode(jsonNodeFactory);
        target1.transformTest(arrayNode);
        target2.transformTest(arrayNode);
        assertAll(() -> assertThat(arrayNode.size(), is(2)), () -> {
            ObjectNode matchObject1 = (ObjectNode) arrayNode.get(0);
            ObjectNode matchObject2 = (ObjectNode) arrayNode.get(1);
            assertThat(matchObject1.has("match"), is(true));
            assertThat(matchObject2.has("match"), is(true));
            ObjectNode matchContent1 = (ObjectNode) matchObject1.get("match");
            ObjectNode matchContent2 = (ObjectNode) matchObject2.get("match");
            assertThat(matchContent1.has("matchKey1"), is(true));
            assertThat(matchContent2.has("matchKey2"), is(true));
            assertThat(matchContent1.get("matchKey1"), equalTo(bigIntegerNode));
            assertThat(matchContent2.get("matchKey2"), equalTo(textNode));
        });
    }

    @Test
    void shouldApplyWithNullContext() {
        BigIntegerNode bigIntegerNode = new BigIntegerNode(BigInteger.ZERO);
        AddMatch target = new AddMatch("matchKey1", bigIntegerNode, "testName1");
        assertThrows(NullPointerException.class, () -> target.shouldApply(null));
    }

    @ParameterizedTest
    @CsvSource({"matchKey1, testName1", "matchKey2, testName2", "matchKey3, testName3"})
    void testGettersWithDifferentInputs(String matchKey, String testName) {
        JsonNode matchValue = new TextNode("test value");
        AddMatch target = new AddMatch(matchKey, matchValue, testName);
        assertAll(() -> assertThat(target.getMatchKey(), equalTo(matchKey)), () -> assertThat(target.getTestName(), equalTo(testName)), () -> assertThat(target.getMatchValue(), equalTo(matchValue)));
    }
}

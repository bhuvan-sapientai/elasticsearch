package org.elasticsearch.gradle.internal.test.rest.transform.match;

import org.elasticsearch.gradle.internal.test.rest.transform.match.ReplaceValueInMatch;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import org.gradle.api.tasks.Internal;

import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.JsonNode;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import org.elasticsearch.gradle.internal.test.rest.transform.match.ReplaceValueInMatch;
import org.elasticsearch.gradle.internal.test.rest.transform.ReplaceByKey;

import static org.mockito.ArgumentMatchers.any;

class ReplaceValueInMatchSapientGeneratedTest {

    @Test
    void getKeyToFindTest() {
        ReplaceValueInMatch target = new ReplaceValueInMatch("replaceKey", new TextNode("value"));
        String result = target.getKeyToFind();
        assertThat(result, equalTo("match"));
    }

    @ParameterizedTest
    @CsvSource({"replaceKey,newValue,testName", "anotherKey,anotherValue,", "yetAnotherKey,yetAnotherValue,someTestName"})
    void constructorTest(String replaceKey, String replacementValue, String testName) {
        JsonNode replacementNode = new TextNode(replacementValue);
        ReplaceValueInMatch target = (testName == null) ? new ReplaceValueInMatch(replaceKey, replacementNode) : new ReplaceValueInMatch(replaceKey, replacementNode, testName);
        assertAll(() -> assertThat(target.getKeyToFind(), equalTo("match")), () -> assertThat(target.requiredChildKey(), equalTo(replaceKey)), () -> assertThat(target.getReplacementNode(), equalTo(replacementNode)), () -> assertThat(target.getTestName(), equalTo(testName)));
    }

    @Test
    void transformTestSuccessTest() {
        JsonNodeFactory factory = JsonNodeFactory.instance;
        ObjectNode matchParent = factory.objectNode();
        ObjectNode matchNode = factory.objectNode();
        matchNode.put("oldKey", "oldValue");
        matchParent.set("match", matchNode);
        ReplaceValueInMatch target = new ReplaceValueInMatch("oldKey", new TextNode("newValue"));
        target.transformTest(matchParent);
        assertAll(() -> assertThat(matchParent.has("match"), is(true)), () -> assertThat(matchParent.get("match").has("oldKey"), is(false)), () -> assertThat(matchParent.get("match").has("oldKey"), is(true)), () -> assertThat(matchParent.get("match").get("oldKey").asText(), equalTo("newValue")));
    }

    @Test
    void transformTestMissingMatchNodeTest() {
        JsonNodeFactory factory = JsonNodeFactory.instance;
        ObjectNode matchParent = factory.objectNode();
        ReplaceValueInMatch target = new ReplaceValueInMatch("oldKey", new TextNode("newValue"));
        assertThrows(NullPointerException.class, () -> target.transformTest(matchParent));
    }

    @Test
    void transformTestMissingKeyToReplaceTest() {
        JsonNodeFactory factory = JsonNodeFactory.instance;
        ObjectNode matchParent = factory.objectNode();
        ObjectNode matchNode = factory.objectNode();
        matchNode.put("someOtherKey", "someValue");
        matchParent.set("match", matchNode);
        ReplaceValueInMatch target = new ReplaceValueInMatch("nonExistentKey", new TextNode("newValue"));
        target.transformTest(matchParent);
        assertAll(() -> assertThat(matchParent.has("match"), is(true)), () -> assertThat(matchParent.get("match").has("someOtherKey"), is(true)), () -> assertThat(matchParent.get("match").has("nonExistentKey"), is(true)), () -> assertThat(matchParent.get("match").get("nonExistentKey").asText(), equalTo("newValue")));
    }

    @Test
    void getNewChildKeyTest() {
        String replaceKey = "testKey";
        JsonNode replacementNode = new TextNode("testValue");
        ReplaceValueInMatch target = new ReplaceValueInMatch(replaceKey, replacementNode);
        assertThat(target.getNewChildKey(), equalTo(replaceKey));
    }

    @Test
    void transformTestWithComplexReplacementNode() {
        JsonNodeFactory factory = JsonNodeFactory.instance;
        ObjectNode matchParent = factory.objectNode();
        ObjectNode matchNode = factory.objectNode();
        matchNode.put("oldKey", "oldValue");
        matchParent.set("match", matchNode);
        ObjectNode complexReplacementNode = factory.objectNode();
        complexReplacementNode.put("nestedKey", "nestedValue");
        complexReplacementNode.put("anotherKey", 42);
        ReplaceValueInMatch target = new ReplaceValueInMatch("oldKey", complexReplacementNode);
        target.transformTest(matchParent);
        assertAll(() -> assertThat(matchParent.has("match"), is(true)), () -> assertThat(matchParent.get("match").has("oldKey"), is(true)), () -> assertThat(matchParent.get("match").get("oldKey"), instanceOf(ObjectNode.class)), () -> assertThat(matchParent.get("match").get("oldKey").get("nestedKey").asText(), equalTo("nestedValue")), () -> assertThat(matchParent.get("match").get("oldKey").get("anotherKey").asInt(), equalTo(42)));
    }

    @Test
    void transformTestWithMultipleKeys() {
        JsonNodeFactory factory = JsonNodeFactory.instance;
        ObjectNode matchParent = factory.objectNode();
        ObjectNode matchNode = factory.objectNode();
        matchNode.put("key1", "value1");
        matchNode.put("key2", "value2");
        matchParent.set("match", matchNode);
        ReplaceValueInMatch target1 = new ReplaceValueInMatch("key1", new TextNode("newValue1"));
        ReplaceValueInMatch target2 = new ReplaceValueInMatch("key2", new TextNode("newValue2"));
        target1.transformTest(matchParent);
        target2.transformTest(matchParent);
        assertAll(() -> assertThat(matchParent.has("match"), is(true)), () -> assertThat(matchParent.get("match").has("key1"), is(true)), () -> assertThat(matchParent.get("match").has("key2"), is(true)), () -> assertThat(matchParent.get("match").get("key1").asText(), equalTo("newValue1")), () -> assertThat(matchParent.get("match").get("key2").asText(), equalTo("newValue2")));
    }
}

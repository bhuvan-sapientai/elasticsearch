package org.elasticsearch.gradle.internal.test.rest.transform.match;

import org.elasticsearch.gradle.internal.test.rest.transform.match.ReplaceValueInMatch;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.JsonNode;

import static org.hamcrest.MatcherAssert.assertThat;

import org.gradle.api.tasks.Internal;

import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

import static org.junit.jupiter.api.Assertions.*;

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
}

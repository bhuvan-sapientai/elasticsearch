package org.elasticsearch.gradle.internal.test.rest.transform.match;

import org.elasticsearch.gradle.internal.test.rest.transform.match.ReplaceKeyInMatch;

import static org.junit.jupiter.api.Assertions.assertAll;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import org.gradle.api.tasks.Internal;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Timeout;

import static org.hamcrest.Matchers.notNullValue;

import com.fasterxml.jackson.databind.JsonNode;

import static org.hamcrest.MatcherAssert.assertThat;

import org.elasticsearch.gradle.internal.test.rest.transform.ReplaceByKey;

import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class ReplaceKeyInMatchSapientGeneratedTest {

    @Test
    void getKeyToFindTest() {
        ReplaceKeyInMatch target = new ReplaceKeyInMatch("replaceKey1", "newKeyName1", "testName1");
        String result = target.getKeyToFind();
        assertThat(result, equalTo("match"));
    }

    @Test
    void transformTestTest() {
        ReplaceKeyInMatch target = new ReplaceKeyInMatch("oldKey", "newKey", "testName");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode matchParent = new ObjectNode(jsonNodeFactory);
        ObjectNode matchNode = new ObjectNode(jsonNodeFactory);
        matchNode.set("oldKey", new TextNode("value"));
        matchParent.set("match", matchNode);
        target.transformTest(matchParent);
        assertAll(() -> assertThat(matchParent.has("match"), is(true)), () -> assertThat(matchParent.get("match").has("oldKey"), is(false)), () -> assertThat(matchParent.get("match").has("newKey"), is(true)), () -> assertThat(matchParent.get("match").get("newKey").asText(), equalTo("value")));
    }

    @Test
    void transformTestWithMissingMatchNodeTest() {
        ReplaceKeyInMatch target = new ReplaceKeyInMatch("oldKey", "newKey", "testName");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode matchParent = new ObjectNode(jsonNodeFactory);
        NullPointerException exception = assertThrows(NullPointerException.class, () -> {
            target.transformTest(matchParent);
        });
        assertThat(exception, is(notNullValue()));
    }

    @Test
    void transformTestWithMissingChildKeyTest() {
        ReplaceKeyInMatch target = new ReplaceKeyInMatch("nonExistentKey", "newKey", "testName");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode matchParent = new ObjectNode(jsonNodeFactory);
        ObjectNode matchNode = new ObjectNode(jsonNodeFactory);
        matchParent.set("match", matchNode);
        NullPointerException exception = assertThrows(NullPointerException.class, () -> {
            target.transformTest(matchParent);
        });
        assertThat(exception, is(notNullValue()));
    }

    @Test
    void constructorTest() {
        ReplaceKeyInMatch target = new ReplaceKeyInMatch("oldKey", "newKey", "testName");
        assertAll(() -> assertThat(target.requiredChildKey(), equalTo("oldKey")), () -> assertThat(target.getNewChildKey(), equalTo("newKey")), () -> assertThat(target.getTestName(), equalTo("testName")));
    }
}

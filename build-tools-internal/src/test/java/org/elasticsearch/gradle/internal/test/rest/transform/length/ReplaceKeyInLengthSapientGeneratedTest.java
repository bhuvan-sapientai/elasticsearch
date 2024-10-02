package org.elasticsearch.gradle.internal.test.rest.transform.length;

import org.elasticsearch.gradle.internal.test.rest.transform.length.ReplaceKeyInLength;

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
class ReplaceKeyInLengthSapientGeneratedTest {

    @Test
    void getKeyToFindTest() {
        ReplaceKeyInLength target = new ReplaceKeyInLength("replaceKey1", "newKeyName1", "testName1");
        String result = target.getKeyToFind();
        assertThat(result, equalTo("length"));
    }

    @Test
    void transformTestTest() {
        ReplaceKeyInLength target = new ReplaceKeyInLength("oldKey", "newKey", "testName");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode lengthParent = new ObjectNode(jsonNodeFactory);
        ObjectNode lengthNode = new ObjectNode(jsonNodeFactory);
        lengthNode.set("oldKey", new TextNode("value"));
        lengthParent.set("length", lengthNode);
        target.transformTest(lengthParent);
        assertAll(() -> assertThat(lengthParent.has("length"), is(true)), () -> assertThat(lengthParent.get("length").has("oldKey"), is(false)), () -> assertThat(lengthParent.get("length").has("newKey"), is(true)), () -> assertThat(lengthParent.get("length").get("newKey").asText(), equalTo("value")));
    }

    @Test
    void transformTestWithMissingLengthNodeTest() {
        ReplaceKeyInLength target = new ReplaceKeyInLength("oldKey", "newKey", "testName");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode lengthParent = new ObjectNode(jsonNodeFactory);
        NullPointerException exception = assertThrows(NullPointerException.class, () -> {
            target.transformTest(lengthParent);
        });
        assertThat(exception, is(notNullValue()));
    }

    @Test
    void transformTestWithMissingRequiredChildKeyTest() {
        ReplaceKeyInLength target = new ReplaceKeyInLength("oldKey", "newKey", "testName");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode lengthParent = new ObjectNode(jsonNodeFactory);
        ObjectNode lengthNode = new ObjectNode(jsonNodeFactory);
        lengthParent.set("length", lengthNode);
        NullPointerException exception = assertThrows(NullPointerException.class, () -> {
            target.transformTest(lengthParent);
        });
        assertThat(exception, is(notNullValue()));
    }

    @Test
    void constructorTest() {
        ReplaceKeyInLength target = new ReplaceKeyInLength("oldKey", "newKey", "testName");
        assertAll(() -> assertThat(target.requiredChildKey(), equalTo("oldKey")), () -> assertThat(target.getNewChildKey(), equalTo("newKey")), () -> assertThat(target.getTestName(), equalTo("testName")));
    }
}

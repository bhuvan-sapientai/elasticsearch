package org.elasticsearch.gradle.internal.test.rest.transform.do_;

import org.elasticsearch.gradle.internal.test.rest.transform.do_.ReplaceKeyInDo;

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
class ReplaceKeyInDoSapientGeneratedTest {

    @Test
    void getKeyToFindTest() {
        ReplaceKeyInDo target = new ReplaceKeyInDo("replaceKey1", "newKeyName1", "testName1");
        String result = target.getKeyToFind();
        assertThat(result, equalTo("do"));
    }

    @Test
    void transformTestSuccess() {
        ReplaceKeyInDo target = new ReplaceKeyInDo("oldKey", "newKey", "testName");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode doParent = new ObjectNode(jsonNodeFactory);
        ObjectNode doNode = new ObjectNode(jsonNodeFactory);
        doNode.set("oldKey", new TextNode("value"));
        doParent.set("do", doNode);
        target.transformTest(doParent);
        assertAll(() -> assertThat(doParent.has("do"), is(true)), () -> assertThat(doParent.get("do").has("oldKey"), is(false)), () -> assertThat(doParent.get("do").has("newKey"), is(true)), () -> assertThat(doParent.get("do").get("newKey").asText(), equalTo("value")));
    }

    @Test
    void transformTestMissingDoNode() {
        ReplaceKeyInDo target = new ReplaceKeyInDo("oldKey", "newKey", "testName");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode doParent = new ObjectNode(jsonNodeFactory);
        NullPointerException exception = assertThrows(NullPointerException.class, () -> target.transformTest(doParent));
        assertThat(exception, is(notNullValue()));
    }

    @Test
    void transformTestMissingOldKey() {
        ReplaceKeyInDo target = new ReplaceKeyInDo("oldKey", "newKey", "testName");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode doParent = new ObjectNode(jsonNodeFactory);
        ObjectNode doNode = new ObjectNode(jsonNodeFactory);
        doParent.set("do", doNode);
        NullPointerException exception = assertThrows(NullPointerException.class, () -> target.transformTest(doParent));
        assertThat(exception, is(notNullValue()));
    }

    @Test
    void constructorTest() {
        ReplaceKeyInDo target = new ReplaceKeyInDo("replaceKey", "newKeyName", "testName");
        assertAll(() -> assertThat(target.requiredChildKey(), equalTo("replaceKey")), () -> assertThat(target.getNewChildKey(), equalTo("newKeyName")), () -> assertThat(target.getTestName(), equalTo("testName")));
    }
}

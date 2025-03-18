package org.elasticsearch.gradle.internal.test.rest.transform.do_;

import org.elasticsearch.gradle.internal.test.rest.transform.do_.ReplaceKeyInDo;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import org.gradle.api.tasks.Internal;
import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.elasticsearch.gradle.internal.test.rest.transform.do_.ReplaceKeyInDo;
import org.junit.jupiter.api.Timeout;
import com.fasterxml.jackson.databind.JsonNode;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import org.elasticsearch.gradle.internal.test.rest.transform.ReplaceByKey;

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

    @ParameterizedTest
    @CsvSource({"oldKey,newKey,testName", "key1,key2,test1", "from,to,replaceTest"})
    void parameterizedConstructorTest(String replaceKey, String newKeyName, String testName) {
        ReplaceKeyInDo target = new ReplaceKeyInDo(replaceKey, newKeyName, testName);
        assertAll(() -> assertThat(target.requiredChildKey(), equalTo(replaceKey)), () -> assertThat(target.getNewChildKey(), equalTo(newKeyName)), () -> assertThat(target.getTestName(), equalTo(testName)));
    }

    @Test
    void transformTestWithMultipleKeys() {
        ReplaceKeyInDo target = new ReplaceKeyInDo("oldKey", "newKey", "testName");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode doParent = new ObjectNode(jsonNodeFactory);
        ObjectNode doNode = new ObjectNode(jsonNodeFactory);
        doNode.set("oldKey", new TextNode("value1"));
        doNode.set("anotherKey", new TextNode("value2"));
        doParent.set("do", doNode);
        target.transformTest(doParent);
        assertAll(() -> assertThat(doParent.has("do"), is(true)), () -> assertThat(doParent.get("do").has("oldKey"), is(false)), () -> assertThat(doParent.get("do").has("newKey"), is(true)), () -> assertThat(doParent.get("do").get("newKey").asText(), equalTo("value1")), () -> assertThat(doParent.get("do").has("anotherKey"), is(true)), () -> assertThat(doParent.get("do").get("anotherKey").asText(), equalTo("value2")));
    }

    @Test
    void transformTestWithEmptyDoNode() {
        ReplaceKeyInDo target = new ReplaceKeyInDo("oldKey", "newKey", "testName");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode doParent = new ObjectNode(jsonNodeFactory);
        ObjectNode doNode = new ObjectNode(jsonNodeFactory);
        doParent.set("do", doNode);
        NullPointerException exception = assertThrows(NullPointerException.class, () -> target.transformTest(doParent));
        assertThat(exception, is(notNullValue()));
    }

    @Test
    void getKeyToFindOverrideTest() {
        ReplaceKeyInDo target = new ReplaceKeyInDo("replaceKey", "newKeyName", "testName") {

            @Override
            @Internal
            public String getKeyToFind() {
                return "customKey";
            }
        };
        String result = target.getKeyToFind();
        assertThat(result, equalTo("customKey"));
    }
}

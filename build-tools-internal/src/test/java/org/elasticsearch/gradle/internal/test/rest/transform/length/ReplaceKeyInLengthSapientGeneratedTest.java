package org.elasticsearch.gradle.internal.test.rest.transform.length;

import org.elasticsearch.gradle.internal.test.rest.transform.length.ReplaceKeyInLength;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import org.gradle.api.tasks.Internal;
import org.elasticsearch.gradle.internal.test.rest.transform.length.ReplaceKeyInLength;
import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Timeout;
import com.fasterxml.jackson.databind.JsonNode;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import org.elasticsearch.gradle.internal.test.rest.transform.ReplaceByKey;

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

    @ParameterizedTest
    @CsvSource({"oldKey,newKey,testName", "replaceKey,newKeyName,anotherTest", "key1,key2,test3"})
    void constructorTest(String oldKey, String newKey, String testName) {
        ReplaceKeyInLength target = new ReplaceKeyInLength(oldKey, newKey, testName);
        assertAll(() -> assertThat(target.requiredChildKey(), equalTo(oldKey)), () -> assertThat(target.getNewChildKey(), equalTo(newKey)), () -> assertThat(target.getTestName(), equalTo(testName)));
    }

    @Test
    void transformTestWithNonExistentKeyTest() {
        ReplaceKeyInLength target = new ReplaceKeyInLength("nonExistentKey", "newKey", "testName");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode lengthParent = new ObjectNode(jsonNodeFactory);
        ObjectNode lengthNode = new ObjectNode(jsonNodeFactory);
        lengthNode.set("existingKey", new TextNode("value"));
        lengthParent.set("length", lengthNode);
        NullPointerException exception = assertThrows(NullPointerException.class, () -> {
            target.transformTest(lengthParent);
        });
        assertThat(exception, is(notNullValue()));
    }

    @Test
    void transformTestWithMultipleKeysTest() {
        ReplaceKeyInLength target = new ReplaceKeyInLength("oldKey", "newKey", "testName");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode lengthParent = new ObjectNode(jsonNodeFactory);
        ObjectNode lengthNode = new ObjectNode(jsonNodeFactory);
        lengthNode.set("oldKey", new TextNode("value1"));
        lengthNode.set("anotherKey", new TextNode("value2"));
        lengthParent.set("length", lengthNode);
        target.transformTest(lengthParent);
        assertAll(() -> assertThat(lengthParent.has("length"), is(true)), () -> assertThat(lengthParent.get("length").has("oldKey"), is(false)), () -> assertThat(lengthParent.get("length").has("newKey"), is(true)), () -> assertThat(lengthParent.get("length").get("newKey").asText(), equalTo("value1")), () -> assertThat(lengthParent.get("length").has("anotherKey"), is(true)), () -> assertThat(lengthParent.get("length").get("anotherKey").asText(), equalTo("value2")));
    }

    @Test
    void getKeyToFindIsInternalTest() {
        ReplaceKeyInLength target = new ReplaceKeyInLength("replaceKey", "newKeyName", "testName");
        java.lang.reflect.Method method;
        try {
            method = ReplaceKeyInLength.class.getMethod("getKeyToFind");
            Internal annotation = method.getAnnotation(Internal.class);
            assertNotNull(annotation, "getKeyToFind method should be annotated with @Internal");
        } catch (NoSuchMethodException e) {
            fail("getKeyToFind method not found");
        }
    }
}

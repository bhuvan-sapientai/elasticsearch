package org.elasticsearch.gradle.internal.test.rest.transform.match;

import org.elasticsearch.gradle.internal.test.rest.transform.match.ReplaceKeyInMatch;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import org.gradle.api.tasks.Internal;
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

    @ParameterizedTest
    @CsvSource({"oldKey,newKey,testName", "key1,key2,test1", "original,replacement,unittest"})
    void constructorParameterizedTest(String replaceKey, String newKeyName, String testName) {
        ReplaceKeyInMatch target = new ReplaceKeyInMatch(replaceKey, newKeyName, testName);
        assertAll(() -> assertThat(target.requiredChildKey(), equalTo(replaceKey)), () -> assertThat(target.getNewChildKey(), equalTo(newKeyName)), () -> assertThat(target.getTestName(), equalTo(testName)));
    }

    @Test
    void transformTestWithMultipleKeysTest() {
        ReplaceKeyInMatch target = new ReplaceKeyInMatch("oldKey", "newKey", "testName");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode matchParent = new ObjectNode(jsonNodeFactory);
        ObjectNode matchNode = new ObjectNode(jsonNodeFactory);
        matchNode.set("oldKey", new TextNode("value1"));
        matchNode.set("anotherKey", new TextNode("value2"));
        matchParent.set("match", matchNode);
        target.transformTest(matchParent);
        assertAll(() -> assertThat(matchParent.get("match").has("oldKey"), is(false)), () -> assertThat(matchParent.get("match").has("newKey"), is(true)), () -> assertThat(matchParent.get("match").get("newKey").asText(), equalTo("value1")), () -> assertThat(matchParent.get("match").has("anotherKey"), is(true)), () -> assertThat(matchParent.get("match").get("anotherKey").asText(), equalTo("value2")));
    }

    @Test
    void getKeyToFindInternalAnnotationTest() throws NoSuchMethodException {
        Internal annotation = ReplaceKeyInMatch.class.getMethod("getKeyToFind").getAnnotation(Internal.class);
        assertNotNull(annotation, "getKeyToFind method should have @Internal annotation");
    }

    @Test
    void extendsReplaceByKeyTest() {
        ReplaceKeyInMatch target = new ReplaceKeyInMatch("oldKey", "newKey", "testName");
        assertThat(target, instanceOf(ReplaceByKey.class));
    }
}

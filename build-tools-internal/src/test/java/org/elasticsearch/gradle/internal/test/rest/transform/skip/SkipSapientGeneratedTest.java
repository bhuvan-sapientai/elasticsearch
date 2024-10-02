package org.elasticsearch.gradle.internal.test.rest.transform.skip;

import org.elasticsearch.gradle.internal.test.rest.transform.skip.Skip;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import org.elasticsearch.gradle.internal.test.rest.transform.RestTestTransformByParentObject;
import org.elasticsearch.gradle.internal.test.rest.transform.RestTestTransform;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ArrayNode;
import org.junit.jupiter.api.Timeout;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.Iterator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.gradle.api.tasks.Input;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import org.elasticsearch.gradle.internal.test.rest.transform.RestTestTransformGlobalSetup;

import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class SkipSapientGeneratedTest {

    @Test
    void transformSetupWhenTestNameIsBlank() {
        Skip target = new Skip("skipReason1");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode setupNodeParent = new ObjectNode(jsonNodeFactory);
        ObjectNode result = target.transformSetup(setupNodeParent);
        assertAll(() -> assertThat(result, notNullValue()), () -> assertThat(result.has("setup"), is(true)), () -> assertThat(result.get("setup"), instanceOf(ArrayNode.class)), () -> assertThat(result.get("setup").size(), is(1)), () -> assertThat(result.get("setup").get(0).has("skip"), is(true)), () -> assertThat(result.get("setup").get(0).get("skip").get("awaits_fix").asText(), is("skipReason1")));
    }

    @Test
    void transformSetupWhenTestNameIsNotBlank() {
        Skip target = new Skip("testName1", "skipReason1");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode setupNodeParent = new ObjectNode(jsonNodeFactory);
        ObjectNode result = target.transformSetup(setupNodeParent);
        assertThat(result, equalTo(setupNodeParent));
    }

    @Test
    void transformSetupWhenSetupNodeParentIsNull() {
        Skip target = new Skip("skipReason1");
        ObjectNode result = target.transformSetup(null);
        assertAll(() -> assertThat(result, notNullValue()), () -> assertThat(result.has("setup"), is(true)), () -> assertThat(result.get("setup"), instanceOf(ArrayNode.class)), () -> assertThat(result.get("setup").size(), is(1)), () -> assertThat(result.get("setup").get(0).has("skip"), is(true)), () -> assertThat(result.get("setup").get(0).get("skip").get("awaits_fix").asText(), is("skipReason1")));
    }

    @Test
    void transformSetupWhenSkipAlreadyExists() {
        Skip target = new Skip("skipReason1");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode setupNodeParent = new ObjectNode(jsonNodeFactory);
        ArrayNode setupNode = setupNodeParent.putArray("setup");
        ObjectNode existingSkip = setupNode.addObject();
        existingSkip.putObject("skip").put("awaits_fix", "oldReason");
        ObjectNode result = target.transformSetup(setupNodeParent);
        assertAll(() -> assertThat(result, notNullValue()), () -> assertThat(result.has("setup"), is(true)), () -> assertThat(result.get("setup"), instanceOf(ArrayNode.class)), () -> assertThat(result.get("setup").size(), is(1)), () -> assertThat(result.get("setup").get(0).has("skip"), is(true)), () -> assertThat(result.get("setup").get(0).get("skip").get("awaits_fix").asText(), is("skipReason1")));
    }

    @Test
    void transformTestWhenTestNameIsNotBlank() {
        Skip target = new Skip("testName1", "skipReason1");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode parent = new ObjectNode(jsonNodeFactory);
        parent.set("testName1", new ArrayNode(jsonNodeFactory));
        target.transformTest(parent);
        assertAll(() -> assertThat(parent.has("testName1"), is(true)), () -> assertThat(parent.get("testName1"), instanceOf(ArrayNode.class)), () -> assertThat(parent.get("testName1").size(), is(1)), () -> assertThat(parent.get("testName1").get(0).has("skip"), is(true)), () -> assertThat(parent.get("testName1").get(0).get("skip").get("awaits_fix").asText(), is("skipReason1")));
    }

    @Test
    void transformTestWhenTestNameIsBlank() {
        Skip target = new Skip("skipReason1");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode parent = new ObjectNode(jsonNodeFactory);
        target.transformTest(parent);
        assertThat(parent.size(), is(0));
    }

    @Test
    void transformTestWhenParentDoesNotContainTestName() {
        Skip target = new Skip("testName1", "skipReason1");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode parent = new ObjectNode(jsonNodeFactory);
        assertThrows(AssertionError.class, () -> target.transformTest(parent));
    }

    @ParameterizedTest
    @CsvSource({"testName1,skipReason1", ",skipReason2"})
    void gettersTest(String testName, String skipReason) {
        Skip target = new Skip(testName, skipReason);
        assertAll(() -> assertThat(target.getTestName(), is(testName == null ? "" : testName)), () -> assertThat(target.getSkipReason(), is(skipReason)));
    }

    @Test
    void getKeyToFindTest() {
        Skip target = new Skip("testName1", "skipReason1");
        assertThat(target.getKeyToFind(), is("testName1"));
    }
}

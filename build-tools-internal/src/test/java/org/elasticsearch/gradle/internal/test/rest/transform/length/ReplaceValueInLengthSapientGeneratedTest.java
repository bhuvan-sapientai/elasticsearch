package org.elasticsearch.gradle.internal.test.rest.transform.length;

import org.elasticsearch.gradle.internal.test.rest.transform.length.ReplaceValueInLength;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.BigIntegerNode;
import org.gradle.api.tasks.Internal;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NumericNode;
import com.fasterxml.jackson.databind.node.LongNode;

import static org.hamcrest.MatcherAssert.assertThat;

import com.fasterxml.jackson.databind.node.DoubleNode;

import static org.hamcrest.Matchers.*;

import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.databind.node.IntNode;
import org.elasticsearch.gradle.internal.test.rest.transform.ReplaceByKey;

import static org.mockito.ArgumentMatchers.any;

class ReplaceValueInLengthSapientGeneratedTest {

    @Test
    void getKeyToFindTest() {
        ReplaceValueInLength target = new ReplaceValueInLength("replaceKey", new IntNode(0));
        String result = target.getKeyToFind();
        assertThat(result, equalTo("length"));
    }

    @ParameterizedTest
    @CsvSource({"replaceKey, 0", "anotherKey, 100", "testKey, -1"})
    void constructorTest(String replaceKey, int value) {
        NumericNode replacementNode = new IntNode(value);
        ReplaceValueInLength target = new ReplaceValueInLength(replaceKey, replacementNode);
        assertAll(() -> assertThat(target.requiredChildKey(), equalTo(replaceKey)), () -> assertThat(target.getNewChildKey(), equalTo(replaceKey)), () -> assertThat(target.getReplacementNode(), equalTo(replacementNode)));
    }

    @Test
    void constructorWithTestNameTest() {
        NumericNode replacementNode = new LongNode(1000L);
        String testName = "testCase1";
        ReplaceValueInLength target = new ReplaceValueInLength("replaceKey", replacementNode, testName);
        assertAll(() -> assertThat(target.requiredChildKey(), equalTo("replaceKey")), () -> assertThat(target.getNewChildKey(), equalTo("replaceKey")), () -> assertThat(target.getReplacementNode(), equalTo(replacementNode)), () -> assertThat(target.getTestName(), equalTo(testName)));
    }

    @Test
    void transformTestWithIntNode() {
        ReplaceValueInLength target = new ReplaceValueInLength("oldKey", new IntNode(42));
        ObjectNode matchParent = JsonNodeFactory.instance.objectNode();
        ObjectNode lengthNode = matchParent.putObject("length");
        lengthNode.put("oldKey", 10);
        target.transformTest(matchParent);
        assertAll(() -> assertThat(matchParent.has("length"), is(true)), () -> assertThat(matchParent.get("length").has("oldKey"), is(false)), () -> assertThat(matchParent.get("length").get("oldKey"), is(nullValue())), () -> assertThat(matchParent.get("length").get("oldKey"), equalTo(new IntNode(42))));
    }

    @Test
    void transformTestWithDoubleNode() {
        ReplaceValueInLength target = new ReplaceValueInLength("floatKey", new DoubleNode(3.14));
        ObjectNode matchParent = JsonNodeFactory.instance.objectNode();
        ObjectNode lengthNode = matchParent.putObject("length");
        lengthNode.put("floatKey", 2.71);
        target.transformTest(matchParent);
        assertAll(() -> assertThat(matchParent.has("length"), is(true)), () -> assertThat(matchParent.get("length").has("floatKey"), is(true)), () -> assertThat(matchParent.get("length").get("floatKey").asDouble(), closeTo(3.14, 0.001)));
    }

    @Test
    void transformTestWithBigIntegerNode() {
        BigInteger bigInt = new BigInteger("123456789012345678901234567890");
        ReplaceValueInLength target = new ReplaceValueInLength("bigIntKey", new BigIntegerNode(bigInt));
        ObjectNode matchParent = JsonNodeFactory.instance.objectNode();
        ObjectNode lengthNode = matchParent.putObject("length");
        lengthNode.put("bigIntKey", 100);
        target.transformTest(matchParent);
        assertAll(() -> assertThat(matchParent.has("length"), is(true)), () -> assertThat(matchParent.get("length").has("bigIntKey"), is(true)), () -> assertThat(matchParent.get("length").get("bigIntKey").bigIntegerValue(), equalTo(bigInt)));
    }

    @Test
    void transformTestWithMissingLengthNode() {
        ReplaceValueInLength target = new ReplaceValueInLength("key", new IntNode(1));
        ObjectNode matchParent = JsonNodeFactory.instance.objectNode();
        assertThrows(NullPointerException.class, () -> target.transformTest(matchParent));
    }

    @Test
    void transformTestWithEmptyLengthNode() {
        ReplaceValueInLength target = new ReplaceValueInLength("key", new IntNode(1));
        ObjectNode matchParent = JsonNodeFactory.instance.objectNode();
        matchParent.putObject("length");
        target.transformTest(matchParent);
        assertAll(() -> assertThat(matchParent.has("length"), is(true)), () -> assertThat(matchParent.get("length").has("key"), is(true)), () -> assertThat(matchParent.get("length").get("key").asInt(), equalTo(1)));
    }
}

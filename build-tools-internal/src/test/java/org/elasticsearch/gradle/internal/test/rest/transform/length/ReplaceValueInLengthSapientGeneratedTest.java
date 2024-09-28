package org.elasticsearch.gradle.internal.test.rest.transform.length;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import java.math.BigInteger;
import com.fasterxml.jackson.databind.node.BigIntegerNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5)
class ReplaceValueInLengthSapientGeneratedTest {

    //Sapient generated method id: ${getKeyToFindTest}, hash: 1D8A145C7BC6023E9BD8FE5EEE7AFE28
    @Test()
    void getKeyToFindTest() {
        //Arrange Statement(s)
        BigIntegerNode bigIntegerNode = new BigIntegerNode(new BigInteger("0"));
        ReplaceValueInLength target = new ReplaceValueInLength("replaceKey1", bigIntegerNode, "testName1");
        
        //Act Statement(s)
        String result = target.getKeyToFind();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("length")));
    }

    //Sapient generated method id: ${transformTestTest}, hash: C7E336D1C8D259F4D65809600591E37C
    @Test()
    void transformTestTest() {
        //Arrange Statement(s)
        BigIntegerNode bigIntegerNode = new BigIntegerNode(new BigInteger("0"));
        ReplaceValueInLength target = new ReplaceValueInLength("replaceKey1", bigIntegerNode, "testName1");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode objectNode = new ObjectNode(jsonNodeFactory);
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            target.transformTest(objectNode);
        });
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}

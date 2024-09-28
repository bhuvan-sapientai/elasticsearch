package org.elasticsearch.gradle.internal.test.rest.transform.match;

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
class ReplaceValueInMatchSapientGeneratedTest {

    //Sapient generated method id: ${getKeyToFindTest}, hash: 4042B271D520E65F2FD341CC78D2278F
    @Test()
    void getKeyToFindTest() {
        //Arrange Statement(s)
        BigIntegerNode bigIntegerNode = new BigIntegerNode(new BigInteger("0"));
        ReplaceValueInMatch target = new ReplaceValueInMatch("replaceKey1", bigIntegerNode, "testName1");
        
        //Act Statement(s)
        String result = target.getKeyToFind();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("match")));
    }

    //Sapient generated method id: ${transformTestTest}, hash: D8E28B68F72821FA7EDC7DC8F17C2839
    @Test()
    void transformTestTest() {
        //Arrange Statement(s)
        BigIntegerNode bigIntegerNode = new BigIntegerNode(new BigInteger("0"));
        ReplaceValueInMatch target = new ReplaceValueInMatch("replaceKey1", bigIntegerNode, "testName1");
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

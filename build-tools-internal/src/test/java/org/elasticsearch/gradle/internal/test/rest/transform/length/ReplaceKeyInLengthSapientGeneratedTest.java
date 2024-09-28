package org.elasticsearch.gradle.internal.test.rest.transform.length;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5)
class ReplaceKeyInLengthSapientGeneratedTest {

    //Sapient generated method id: ${getKeyToFindTest}, hash: 6BF4934337CBBC8E6863197C4553CC2E
    @Test()
    void getKeyToFindTest() {
        //Arrange Statement(s)
        ReplaceKeyInLength target = new ReplaceKeyInLength("replaceKey1", "newKeyName1", "testName1");
        
        //Act Statement(s)
        String result = target.getKeyToFind();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("length")));
    }

    //Sapient generated method id: ${transformTestTest}, hash: A1812663241F2A7AC5231141AEF01BA4
    @Test()
    void transformTestTest() {
        //Arrange Statement(s)
        ReplaceKeyInLength target = new ReplaceKeyInLength("replaceKey1", "newKeyName1", "testName1");
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

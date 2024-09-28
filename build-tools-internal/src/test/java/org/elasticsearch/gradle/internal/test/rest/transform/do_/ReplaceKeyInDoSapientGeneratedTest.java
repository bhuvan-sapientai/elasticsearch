package org.elasticsearch.gradle.internal.test.rest.transform.do_;

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
class ReplaceKeyInDoSapientGeneratedTest {

    //Sapient generated method id: ${getKeyToFindTest}, hash: D2050F2D242652251B490F18AADD40D6
    @Test()
    void getKeyToFindTest() {
        //Arrange Statement(s)
        ReplaceKeyInDo target = new ReplaceKeyInDo("replaceKey1", "newKeyName1", "testName1");
        
        //Act Statement(s)
        String result = target.getKeyToFind();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("do")));
    }

    //Sapient generated method id: ${transformTestTest}, hash: 1095F82D3D449EEF0701049BF93A07D5
    @Test()
    void transformTestTest() {
        //Arrange Statement(s)
        ReplaceKeyInDo target = new ReplaceKeyInDo("replaceKey1", "newKeyName1", "testName1");
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

package org.elasticsearch.gradle.internal.test.rest.transform.match;

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
class ReplaceKeyInMatchSapientGeneratedTest {

    //Sapient generated method id: ${getKeyToFindTest}, hash: 13F3D7474E470E0623303D457AE3F6DA
    @Test()
    void getKeyToFindTest() {
        //Arrange Statement(s)
        ReplaceKeyInMatch target = new ReplaceKeyInMatch("replaceKey1", "newKeyName1", "testName1");
        
        //Act Statement(s)
        String result = target.getKeyToFind();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("match")));
    }

    //Sapient generated method id: ${transformTestTest}, hash: E0434A94F93FAEBEC943FED4F0DF4A8A
    @Test()
    void transformTestTest() {
        //Arrange Statement(s)
        ReplaceKeyInMatch target = new ReplaceKeyInMatch("replaceKey1", "newKeyName1", "testName1");
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

package org.elasticsearch.gradle.internal.test.rest.transform.text;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import java.math.BigInteger;
import com.fasterxml.jackson.databind.node.BigIntegerNode;
import org.elasticsearch.gradle.internal.test.rest.transform.RestTestContext;
import com.fasterxml.jackson.databind.node.ObjectNode;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class ReplaceTextualSapientGeneratedTest {

    private final RestTestContext testContextMock = mock(RestTestContext.class);

    //Sapient generated method id: ${requiredChildKeyTest}, hash: 5339033A53E0E714014EE82A5E995170
    @Test()
    void requiredChildKeyTest() {
        //Arrange Statement(s)
        TextNode textNode = new TextNode("v1");
        ReplaceTextual target = new ReplaceTextual("keyToReplaceName1", "valueToBeReplaced1", textNode, "testName1");
        //Act Statement(s)
        String result = target.requiredChildKey();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("valueToBeReplaced1")));
    }

    //Sapient generated method id: ${shouldApplyWhenTestContextTestNameEqualsTestName}, hash: 5D070E112628F50F7D098EEB2E7D2E69
    @Test()
    void shouldApplyWhenTestContextTestNameEqualsTestName() {
        /* Branches:
         * (testName == null) : false
         * (testContext.testName().equals(testName)) : true
         */
        //Arrange Statement(s)
        doReturn("A").when(testContextMock).testName();
        TextNode textNode = new TextNode("v1");
        ReplaceTextual target = new ReplaceTextual("keyToReplaceName1", "valueToBeReplaced1", textNode, "A");
        //Act Statement(s)
        boolean result = target.shouldApply(testContextMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(testContextMock).testName();
        });
    }

    //Sapient generated method id: ${shouldApplyWhenTestContextTestNameNotEqualsTestName}, hash: CBEFAA9BFE37EDEEABA9CED45EAFB427
    @Test()
    void shouldApplyWhenTestContextTestNameNotEqualsTestName() {
        /* Branches:
         * (testName == null) : false
         * (testContext.testName().equals(testName)) : false
         */
        //Arrange Statement(s)
        doReturn("A").when(testContextMock).testName();
        TextNode textNode = new TextNode("v1");
        ReplaceTextual target = new ReplaceTextual("keyToReplaceName1", "valueToBeReplaced1", textNode, "B");
        //Act Statement(s)
        boolean result = target.shouldApply(testContextMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(testContextMock).testName();
        });
    }

    //Sapient generated method id: ${transformTestTest}, hash: DB0FE3A932EA2793BF107551A522BF85
    @Test()
    void transformTestTest() {
        //Arrange Statement(s)
        TextNode textNode = new TextNode("v1");
        ReplaceTextual target = new ReplaceTextual("keyToReplaceName1", "valueToBeReplaced1", textNode, "testName1");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode objectNode = new ObjectNode(jsonNodeFactory);
        //Act Statement(s)
        target.transformTest(objectNode);
    }

    //Sapient generated method id: ${getReplacementNodeTest}, hash: D5ADCF0D1707C392D6A6541E3A25E8A4
    @Test()
    void getReplacementNodeTest() {
        //Arrange Statement(s)
        TextNode textNode = new TextNode("v1");
        ReplaceTextual target = new ReplaceTextual("keyToReplaceName1", "valueToBeReplaced1", textNode, "testName1");
        //Act Statement(s)
        JsonNode result = target.getReplacementNode();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(textNode)));
    }

    //Sapient generated method id: ${matchesWhenChildAsTextEqualsRequiredChildKey}, hash: 3FAD4CA1CD0146D8630C7E46B44218D0
    @Disabled()
    @Test()
    void matchesWhenChildAsTextEqualsRequiredChildKey() {
        /* Branches:
         * (child.asText().equals(requiredChildKey())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TextNode textNode = new TextNode("v1");
        ReplaceTextual target = new ReplaceTextual("keyToReplaceName1", "A", textNode, "testName1");
        BigIntegerNode bigIntegerNode = new BigIntegerNode(new BigInteger("0"));
        //Act Statement(s)
        boolean result = target.matches(bigIntegerNode);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${matchesWhenChildAsTextNotEqualsRequiredChildKey}, hash: 7284AA563A081A6D0565403BDAE910DE
    @Test()
    void matchesWhenChildAsTextNotEqualsRequiredChildKey() {
        /* Branches:
         * (child.asText().equals(requiredChildKey())) : false
         */
        //Arrange Statement(s)
        TextNode textNode = new TextNode("v1");
        ReplaceTextual target = new ReplaceTextual("keyToReplaceName1", "B", textNode, "testName1");
        BigIntegerNode bigIntegerNode = new BigIntegerNode(new BigInteger("0"));
        //Act Statement(s)
        boolean result = target.matches(bigIntegerNode);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }
}

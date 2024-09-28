package org.elasticsearch.gradle.internal.test.rest.transform.match;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import java.math.BigInteger;
import com.fasterxml.jackson.databind.node.BigIntegerNode;
import org.elasticsearch.gradle.internal.test.rest.transform.RestTestContext;
import com.fasterxml.jackson.databind.node.ArrayNode;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5)
class AddMatchSapientGeneratedTest {

    private final RestTestContext testContextMock = mock(RestTestContext.class);

    //Sapient generated method id: ${shouldApplyWhenTestContextTestNameEqualsTestName}, hash: 3E22D604EF5262F87CAAE789FA68C5A3
    @Test()
    void shouldApplyWhenTestContextTestNameEqualsTestName() {
        /* Branches:
         * (testContext.testName().equals(testName)) : true
         */
         //Arrange Statement(s)
        doReturn("A").when(testContextMock).testName();
        BigIntegerNode bigIntegerNode = new BigIntegerNode(new BigInteger("0"));
        AddMatch target = new AddMatch("matchKey1", bigIntegerNode, "A");
        
        //Act Statement(s)
        boolean result = target.shouldApply(testContextMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(testContextMock).testName();
        });
    }

    //Sapient generated method id: ${shouldApplyWhenTestContextTestNameNotEqualsTestName}, hash: C336BE8B055ABCCE9174F5900D1D8161
    @Test()
    void shouldApplyWhenTestContextTestNameNotEqualsTestName() {
        /* Branches:
         * (testContext.testName().equals(testName)) : false
         */
         //Arrange Statement(s)
        doReturn("B").when(testContextMock).testName();
        BigIntegerNode bigIntegerNode = new BigIntegerNode(new BigInteger("0"));
        AddMatch target = new AddMatch("matchKey1", bigIntegerNode, "C");
        
        //Act Statement(s)
        boolean result = target.shouldApply(testContextMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(testContextMock).testName();
        });
    }

    //Sapient generated method id: ${transformTestTest}, hash: DF48D5A8C1E87D6E9A7E4D29C6990206
    @Test()
    void transformTestTest() {
        //Arrange Statement(s)
        BigIntegerNode bigIntegerNode = new BigIntegerNode(new BigInteger("0"));
        AddMatch target = new AddMatch("matchKey1", bigIntegerNode, "testName1");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ArrayNode arrayNode = new ArrayNode(jsonNodeFactory);
        
        //Act Statement(s)
        target.transformTest(arrayNode);
    }
}

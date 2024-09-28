package org.elasticsearch.gradle.internal.test.rest.transform.match;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import org.elasticsearch.gradle.internal.test.rest.transform.RestTestContext;
import com.fasterxml.jackson.databind.node.ObjectNode;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5)
class RemoveMatchSapientGeneratedTest {

    private final RestTestContext testContextMock = mock(RestTestContext.class);

    //Sapient generated method id: ${getKeyToFindTest}, hash: 568FB8BDFC3F7C06A958C6947A768154
    @Test()
    void getKeyToFindTest() {
        //Arrange Statement(s)
        RemoveMatch target = new RemoveMatch("removeKey1", "testName1");
        
        //Act Statement(s)
        String result = target.getKeyToFind();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("match")));
    }

    //Sapient generated method id: ${requiredChildKeyTest}, hash: CBDD7D6A01E6A37498E51FD42DEA3145
    @Test()
    void requiredChildKeyTest() {
        //Arrange Statement(s)
        RemoveMatch target = new RemoveMatch("removeKey1", "testName1");
        
        //Act Statement(s)
        String result = target.requiredChildKey();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("removeKey1")));
    }

    //Sapient generated method id: ${shouldApplyWhenTestContextTestNameEqualsTestName}, hash: 1DF595446CFCE8DACBEF572EF6DA3B44
    @Test()
    void shouldApplyWhenTestContextTestNameEqualsTestName() {
        /* Branches:
         * (testName == null) : false
         * (testContext.testName().equals(testName)) : true
         */
         //Arrange Statement(s)
        doReturn("A").when(testContextMock).testName();
        RemoveMatch target = new RemoveMatch("removeKey1", "A");
        
        //Act Statement(s)
        boolean result = target.shouldApply(testContextMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(testContextMock).testName();
        });
    }

    //Sapient generated method id: ${shouldApplyWhenTestContextTestNameNotEqualsTestName}, hash: 648C635A88DDC52AE37E68C6D425797A
    @Test()
    void shouldApplyWhenTestContextTestNameNotEqualsTestName() {
        /* Branches:
         * (testName == null) : false
         * (testContext.testName().equals(testName)) : false
         */
         //Arrange Statement(s)
        doReturn("A").when(testContextMock).testName();
        RemoveMatch target = new RemoveMatch("removeKey1", "B");
        
        //Act Statement(s)
        boolean result = target.shouldApply(testContextMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(testContextMock).testName();
        });
    }

    //Sapient generated method id: ${transformTestTest}, hash: 01C7D7E9B68BB8CC994D6000DF5D17BC
    @Test()
    void transformTestTest() {
        //Arrange Statement(s)
        RemoveMatch target = new RemoveMatch("removeKey1", "testName1");
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

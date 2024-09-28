package org.elasticsearch.gradle.internal.test.rest.transform.warnings;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import org.elasticsearch.gradle.internal.test.rest.transform.RestTestContext;
import java.util.Set;
import com.fasterxml.jackson.databind.node.ObjectNode;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class RemoveWarningsSapientGeneratedTest {

    private final RestTestContext testContextMock = mock(RestTestContext.class);

    //Sapient generated method id: ${transformTestWhenArrayWarningsIsNull}, hash: 6B50128AC91854023DA5E0ACB280D0A9
    @Disabled()
    @Test()
    void transformTestWhenArrayWarningsIsNull() {
        /* Branches:
         * (arrayWarnings == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Set<String> stringSet = new HashSet<>();
        RemoveWarnings target = new RemoveWarnings(stringSet, "testName1");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode objectNode = new ObjectNode(jsonNodeFactory);
        //Act Statement(s)
        target.transformTest(objectNode);
    }

    //Sapient generated method id: ${transformTestWhenArrayWarningsIsNotNull}, hash: 240F504F0A0F4185996724210C688C18
    @Disabled()
    @Test()
    void transformTestWhenArrayWarningsIsNotNull() {
        /* Branches:
         * (arrayWarnings == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Set<String> stringSet = new HashSet<>();
        RemoveWarnings target = new RemoveWarnings(stringSet, "testName1");
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode objectNode = new ObjectNode(jsonNodeFactory);
        //Act Statement(s)
        target.transformTest(objectNode);
    }

    //Sapient generated method id: ${getKeyToFindTest}, hash: 07437AB5BB3B9A2BCD4BE43439DFAD57
    @Test()
    void getKeyToFindTest() {
        //Arrange Statement(s)
        Set<String> stringSet = new HashSet<>();
        RemoveWarnings target = new RemoveWarnings(stringSet, "testName1");
        //Act Statement(s)
        String result = target.getKeyToFind();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("do")));
    }

    //Sapient generated method id: ${shouldApplyWhenTestContextTestNameEqualsTestName}, hash: FB0000140D076286FDC0EE60A0E3A564
    @Test()
    void shouldApplyWhenTestContextTestNameEqualsTestName() {
        /* Branches:
         * (testName == null) : false
         * (testContext.testName().equals(testName)) : true
         */
        //Arrange Statement(s)
        doReturn("A").when(testContextMock).testName();
        Set<String> stringSet = new HashSet<>();
        RemoveWarnings target = new RemoveWarnings(stringSet, "A");
        //Act Statement(s)
        boolean result = target.shouldApply(testContextMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(testContextMock).testName();
        });
    }

    //Sapient generated method id: ${shouldApplyWhenTestContextTestNameNotEqualsTestName}, hash: 46AFE14D9DF7B62AD64C941D47E1F833
    @Test()
    void shouldApplyWhenTestContextTestNameNotEqualsTestName() {
        /* Branches:
         * (testName == null) : false
         * (testContext.testName().equals(testName)) : false
         */
        //Arrange Statement(s)
        doReturn("A").when(testContextMock).testName();
        Set<String> stringSet = new HashSet<>();
        RemoveWarnings target = new RemoveWarnings(stringSet, "B");
        //Act Statement(s)
        boolean result = target.shouldApply(testContextMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(testContextMock).testName();
        });
    }
}

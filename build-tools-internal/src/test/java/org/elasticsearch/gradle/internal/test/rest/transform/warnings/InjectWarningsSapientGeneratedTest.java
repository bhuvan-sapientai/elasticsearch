package org.elasticsearch.gradle.internal.test.rest.transform.warnings;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import org.elasticsearch.gradle.internal.test.rest.transform.RestTestContext;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.node.ObjectNode;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class InjectWarningsSapientGeneratedTest {

    private final RestTestContext testContextMock = mock(RestTestContext.class);

    //Sapient generated method id: ${transformTestWhenArrayWarningsIsNull}, hash: BA9B92C2250731D519BD96AAA607E58D
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
        List<String> stringList = new ArrayList<>(List.of("A"));
        InjectWarnings target = spy(new InjectWarnings(false, stringList, "testName1"));
        doReturn("return_of_getSkipFeatureName1").when(target).getSkipFeatureName();
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode objectNode = new ObjectNode(jsonNodeFactory);
        //Act Statement(s)
        target.transformTest(objectNode);
        //Assert statement(s)
        assertAll("result", () -> verify(target, times(2)).getSkipFeatureName());
    }

    //Sapient generated method id: ${getKeyToFindTest}, hash: 8278232CB9693C15171F67D107EDF36D
    @Test()
    void getKeyToFindTest() {
        //Arrange Statement(s)
        List<String> stringList = new ArrayList<>();
        InjectWarnings target = new InjectWarnings(false, stringList, "testName1");
        //Act Statement(s)
        String result = target.getKeyToFind();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("do")));
    }

    //Sapient generated method id: ${getSkipFeatureNameWhenIsRegex}, hash: 78F3027FAAD23921F98B2015995BE830
    @Test()
    void getSkipFeatureNameWhenIsRegex() {
        /* Branches:
         * (isRegex) : true
         */
        //Arrange Statement(s)
        List<String> stringList = new ArrayList<>();
        InjectWarnings target = new InjectWarnings(true, stringList, "testName1");
        //Act Statement(s)
        String result = target.getSkipFeatureName();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("warnings_regex")));
    }

    //Sapient generated method id: ${getSkipFeatureNameWhenNotIsRegex}, hash: BDF2112187CF2CCB8EB5594040C9C24A
    @Test()
    void getSkipFeatureNameWhenNotIsRegex() {
        /* Branches:
         * (isRegex) : false
         */
        //Arrange Statement(s)
        List<String> stringList = new ArrayList<>();
        InjectWarnings target = new InjectWarnings(false, stringList, "testName1");
        //Act Statement(s)
        String result = target.getSkipFeatureName();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("warnings")));
    }

    //Sapient generated method id: ${shouldApplyWhenTestNameEqualsTestContextTestName}, hash: 50B23E3F084F49AEBA7F335001217272
    @Test()
    void shouldApplyWhenTestNameEqualsTestContextTestName() {
        /* Branches:
         * (testName.equals(testContext.testName())) : true
         */
        //Arrange Statement(s)
        doReturn("A").when(testContextMock).testName();
        List<String> stringList = new ArrayList<>();
        InjectWarnings target = new InjectWarnings(false, stringList, "A");
        //Act Statement(s)
        boolean result = target.shouldApply(testContextMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(testContextMock).testName();
        });
    }

    //Sapient generated method id: ${shouldApplyWhenTestNameNotEqualsTestContextTestName}, hash: 178E4FA5AF0633DEDDABC6BAD626A5F8
    @Test()
    void shouldApplyWhenTestNameNotEqualsTestContextTestName() {
        /* Branches:
         * (testName.equals(testContext.testName())) : false
         */
        //Arrange Statement(s)
        doReturn("B").when(testContextMock).testName();
        List<String> stringList = new ArrayList<>();
        InjectWarnings target = new InjectWarnings(false, stringList, "C");
        //Act Statement(s)
        boolean result = target.shouldApply(testContextMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(testContextMock).testName();
        });
    }
}

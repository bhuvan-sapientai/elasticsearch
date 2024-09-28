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
class InjectAllowedWarningsSapientGeneratedTest {

    private final RestTestContext testContextMock = mock(RestTestContext.class);

    //Sapient generated method id: ${transformTestWhenArrayWarningsIsNull}, hash: 63AAB0FE2EA28155DBFA8A0D465AE30E
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
        InjectAllowedWarnings target = spy(new InjectAllowedWarnings(false, stringList, "testName1"));
        doReturn("return_of_getSkipFeatureName1").when(target).getSkipFeatureName();
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode objectNode = new ObjectNode(jsonNodeFactory);
        //Act Statement(s)
        target.transformTest(objectNode);
        //Assert statement(s)
        assertAll("result", () -> verify(target, times(2)).getSkipFeatureName());
    }

    //Sapient generated method id: ${getKeyToFindTest}, hash: 33BB6378CC647C402B377A68914D7733
    @Test()
    void getKeyToFindTest() {
        //Arrange Statement(s)
        List<String> stringList = new ArrayList<>();
        InjectAllowedWarnings target = new InjectAllowedWarnings(false, stringList, "testName1");
        //Act Statement(s)
        String result = target.getKeyToFind();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("do")));
    }

    //Sapient generated method id: ${getSkipFeatureNameWhenIsRegex}, hash: 9623E05B016A2929C562458B0D5BAB44
    @Test()
    void getSkipFeatureNameWhenIsRegex() {
        /* Branches:
         * (isRegex) : true
         */
        //Arrange Statement(s)
        List<String> stringList = new ArrayList<>();
        InjectAllowedWarnings target = new InjectAllowedWarnings(true, stringList, "testName1");
        //Act Statement(s)
        String result = target.getSkipFeatureName();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("allowed_warnings_regex")));
    }

    //Sapient generated method id: ${getSkipFeatureNameWhenNotIsRegex}, hash: 78786E876DAC82E3AFF82559D4810991
    @Test()
    void getSkipFeatureNameWhenNotIsRegex() {
        /* Branches:
         * (isRegex) : false
         */
        //Arrange Statement(s)
        List<String> stringList = new ArrayList<>();
        InjectAllowedWarnings target = new InjectAllowedWarnings(false, stringList, "testName1");
        //Act Statement(s)
        String result = target.getSkipFeatureName();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("allowed_warnings")));
    }

    //Sapient generated method id: ${shouldApplyWhenTestContextTestNameEqualsTestName}, hash: C33E96A56C1E73CDFFB2446889BD73BB
    @Test()
    void shouldApplyWhenTestContextTestNameEqualsTestName() {
        /* Branches:
         * (testName == null) : false
         * (testContext.testName().equals(testName)) : true
         */
        //Arrange Statement(s)
        doReturn("A").when(testContextMock).testName();
        List<String> stringList = new ArrayList<>();
        InjectAllowedWarnings target = new InjectAllowedWarnings(false, stringList, "A");
        //Act Statement(s)
        boolean result = target.shouldApply(testContextMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(testContextMock).testName();
        });
    }

    //Sapient generated method id: ${shouldApplyWhenTestContextTestNameNotEqualsTestName}, hash: 16585E96CB706ECC3930DB89857D45A2
    @Test()
    void shouldApplyWhenTestContextTestNameNotEqualsTestName() {
        /* Branches:
         * (testName == null) : false
         * (testContext.testName().equals(testName)) : false
         */
        //Arrange Statement(s)
        doReturn("A").when(testContextMock).testName();
        List<String> stringList = new ArrayList<>();
        InjectAllowedWarnings target = new InjectAllowedWarnings(false, stringList, "B");
        //Act Statement(s)
        boolean result = target.shouldApply(testContextMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(testContextMock).testName();
        });
    }
}

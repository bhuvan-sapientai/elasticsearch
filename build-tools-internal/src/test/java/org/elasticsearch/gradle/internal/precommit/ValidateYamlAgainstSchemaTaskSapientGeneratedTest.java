package org.elasticsearch.gradle.internal.precommit;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class ValidateYamlAgainstSchemaTaskSapientGeneratedTest {

    //Sapient generated method id: ${getFileTypeTest}, hash: 5620A113C53F7D913A6A7311DA8D07E5
    @Disabled()
    @Test()
    void getFileTypeTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ValidateYamlAgainstSchemaTask target = new ValidateYamlAgainstSchemaTask();
        //Act Statement(s)
        String result = target.getFileType();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("YAML")));
    }

    //Sapient generated method id: ${getMapperTest}, hash: 248FE760184B9FF3C72B526AAB536258
    @Disabled()
    @Test()
    void getMapperTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ValidateYamlAgainstSchemaTask target = new ValidateYamlAgainstSchemaTask();
        //Act Statement(s)
        ObjectMapper result = target.getMapper();
        //Assert statement(s)
        //TODO: Please implement equals method in ObjectMapper for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}

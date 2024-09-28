package org.elasticsearch.gradle.internal.release;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class TemplateUtilsSapientGeneratedTest {

    //Sapient generated method id: ${renderTest}, hash: B8906781D6AAF812FF979231841EDBEE
    @Disabled()
    @Test()
    void renderTest() throws IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: engine - Method: createTemplate
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Map<String, Object> stringObjectMap = new HashMap<>();
        //Act Statement(s)
        String result = TemplateUtils.render("template1", stringObjectMap);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("")));
    }

    //Sapient generated method id: ${renderWhenCaughtClassNotFoundExceptionThrowsRuntimeException}, hash: 4C3C3990F5A3B8DD1D68D8AF696C486F
    @Disabled()
    @Test()
    void renderWhenCaughtClassNotFoundExceptionThrowsRuntimeException() throws IOException {
        /* Branches:
         * (catch-exception (ClassNotFoundException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: engine - Method: createTemplate
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Map<String, Object> stringObjectMap = new HashMap<>();
        ClassNotFoundException classNotFoundException = new ClassNotFoundException();
        //Act Statement(s)
        final RuntimeException result = assertThrows(RuntimeException.class, () -> {
            TemplateUtils.render("template1", stringObjectMap);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getCause(), is(instanceOf(classNotFoundException.getClass())));
        });
    }
}

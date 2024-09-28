package org.elasticsearch.gradle;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class ArchitectureSapientGeneratedTest {

    //Sapient generated method id: ${currentWhenSwitchArchitectureCaseAarch64}, hash: EB84C8B038E1782CC89A818A0EC08488
    @Test()
    void currentWhenSwitchArchitectureCaseAarch64() {
        /* Branches:
         * (switch(architecture) = "aarch64") : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Architecture result = Architecture.current();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Architecture.AARCH64)));
    }

    //Sapient generated method id: ${currentWhenSwitchArchitectureCaseAmd64}, hash: E8535EBADB3ABB219E3A28170B84D982
    @Disabled()
    @Test()
    void currentWhenSwitchArchitectureCaseAmd64() {
        /* Branches:
         * (switch(architecture) = "amd64" or switch(architecture) = "x86_64") : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Architecture result = Architecture.current();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Architecture.X64)));
    }

    //Sapient generated method id: ${currentWhenSwitchArchitectureCaseDefaultThrowsIllegalArgumentException}, hash: 06F8593B4E24522D25E5904058B3B742
    @Disabled()
    @Test()
    void currentWhenSwitchArchitectureCaseDefaultThrowsIllegalArgumentException() {
        /* Branches:
         * (switch(architecture) = default) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("can not determine architecture from [A]");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Architecture.current();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }
}

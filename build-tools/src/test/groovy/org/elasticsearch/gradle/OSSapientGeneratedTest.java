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
class OSSapientGeneratedTest {

    //Sapient generated method id: ${currentWhenOsStartsWithWindows}, hash: 91B24A5E3367B4B127E226B4651CC572
    @Disabled()
    @Test()
    void currentWhenOsStartsWithWindows() {
        /* Branches:
         * (os.startsWith("Windows")) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        OS result = OS.current();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(OS.WINDOWS)));
    }

    //Sapient generated method id: ${currentWhenOsStartsWithLINUX}, hash: E41F83A26C671C8C17FC60F55F753F6C
    @Disabled()
    @Test()
    void currentWhenOsStartsWithLINUX() {
        /* Branches:
         * (os.startsWith("Windows")) : false
         * (os.startsWith("Linux")) : false
         * (os.startsWith("LINUX")) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        OS result = OS.current();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(OS.LINUX)));
    }

    //Sapient generated method id: ${currentWhenOsStartsWithMac}, hash: 8F8A15DECD028A52120ADE114B631A08
    @Test()
    void currentWhenOsStartsWithMac() {
        /* Branches:
         * (os.startsWith("Windows")) : false
         * (os.startsWith("Linux")) : false
         * (os.startsWith("LINUX")) : false
         * (os.startsWith("Mac")) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        OS result = OS.current();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(OS.MAC)));
    }

    //Sapient generated method id: ${currentWhenOsNotStartsWithMacThrowsIllegalStateException}, hash: 5A8BD56559533E407D474AC8673C4316
    @Disabled()
    @Test()
    void currentWhenOsNotStartsWithMacThrowsIllegalStateException() {
        /* Branches:
         * (os.startsWith("Windows")) : false
         * (os.startsWith("Linux")) : false
         * (os.startsWith("LINUX")) : false
         * (os.startsWith("Mac")) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Can't determine OS from: A");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            OS.current();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${conditionalTest}, hash: C732D209291F68406031C1BF39F56566
    @Test()
    void conditionalTest() {
        //Act Statement(s)
        OS.Conditional result = OS.conditional();
        //Assert statement(s)
        //TODO: Please implement equals method in Conditional for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${conditionalStringTest}, hash: 24F05D73F755E034046FFCEAFBC17381
    @Test()
    void conditionalStringTest() {
        //Act Statement(s)
        OS.Conditional<String> result = OS.conditionalString();
        //Assert statement(s)
        //TODO: Please implement equals method in Conditional for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}

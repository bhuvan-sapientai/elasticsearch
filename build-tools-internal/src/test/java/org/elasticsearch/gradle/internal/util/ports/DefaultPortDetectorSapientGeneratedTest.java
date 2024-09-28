package org.elasticsearch.gradle.internal.util.ports;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class DefaultPortDetectorSapientGeneratedTest {

    //Sapient generated method id: ${isAvailableTest}, hash: 2AE26835D53FB0413D4CCF1F45650330
    @Test()
    void isAvailableTest() {
        //Arrange Statement(s)
        DefaultPortDetector target = new DefaultPortDetector();
        //Act Statement(s)
        boolean result = target.isAvailable(0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isAvailableWhenCaughtIOException}, hash: F689755ACB42454875FF32BD6AF19FBC
    @Disabled()
    @Test()
    void isAvailableWhenCaughtIOException() {
        /* Branches:
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DefaultPortDetector target = new DefaultPortDetector();
        //Act Statement(s)
        boolean result = target.isAvailable(0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }
}

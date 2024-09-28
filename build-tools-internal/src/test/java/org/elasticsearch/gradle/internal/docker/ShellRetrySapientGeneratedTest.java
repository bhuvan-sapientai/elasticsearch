package org.elasticsearch.gradle.internal.docker;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class ShellRetrySapientGeneratedTest {

    //Sapient generated method id: ${loopTest}, hash: AC43ADE6261AF4D91084D3B1254286C5
    @Test()
    void loopTest() {
        //Arrange Statement(s)
        try (MockedStatic<ShellRetry> shellRetry = mockStatic(ShellRetry.class, CALLS_REAL_METHODS)) {
            shellRetry.when(() -> ShellRetry.loop("name1", "command1", 4, "exit")).thenReturn("return_of_loop1");
            //Act Statement(s)
            String result = ShellRetry.loop("name1", "command1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_loop1"));
                shellRetry.verify(() -> ShellRetry.loop("name1", "command1", 4, "exit"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${loop1Test}, hash: D0967CBEB802604B1207E766AB568715
    @Disabled()
    @Test()
    void loop1Test() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: object of type IntStream - Method: mapToObj
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = ShellRetry.loop("test", "echo 'Hello World'", 2, "exit");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("for iter in A; do \\\n    echo 'Hello World' && \\\n    exit_code=0 && break || \\\n      exit_code=$? && echo \"test error: retry $iter in 10s\" && sleep 10; \\\n  done; \\\n  exit $exit_code")));
    }
}

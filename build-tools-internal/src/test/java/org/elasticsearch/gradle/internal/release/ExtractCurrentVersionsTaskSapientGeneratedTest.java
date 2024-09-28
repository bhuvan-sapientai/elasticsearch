package org.elasticsearch.gradle.internal.release;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import org.gradle.initialization.layout.BuildLayout;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class ExtractCurrentVersionsTaskSapientGeneratedTest {

    private final BuildLayout buildLayoutMock = mock(BuildLayout.class);

    //Sapient generated method id: ${outputFileTest}, hash: C219221D9131E5FE965EAD998E6616CA
    @Disabled()
    @Test()
    void outputFileTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ExtractCurrentVersionsTask target = new ExtractCurrentVersionsTask(buildLayoutMock);
        //Act Statement(s)
        target.outputFile("A");
    }

    //Sapient generated method id: ${executeTaskWhenOutputFileIsNullThrowsIllegalArgumentException}, hash: 0F243424400A2D7EEEB90DC885AC1F36
    @Disabled()
    @Test()
    void executeTaskWhenOutputFileIsNullThrowsIllegalArgumentException() throws IOException {
        /* Branches:
         * (outputFile == null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ExtractCurrentVersionsTask target = new ExtractCurrentVersionsTask(buildLayoutMock);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Output file not specified");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            target.executeTask();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }
}

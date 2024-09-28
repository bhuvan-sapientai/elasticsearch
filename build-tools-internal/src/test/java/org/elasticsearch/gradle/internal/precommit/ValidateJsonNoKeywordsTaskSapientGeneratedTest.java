package org.elasticsearch.gradle.internal.precommit;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.GradleException;
import org.gradle.api.file.FileCollection;
import java.io.IOException;
import java.util.ArrayList;
import org.gradle.api.logging.Logger;
import org.gradle.work.InputChanges;
import org.gradle.work.FileChange;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class ValidateJsonNoKeywordsTaskSapientGeneratedTest {

    private final InputChanges inputChangesMock = mock(InputChanges.class);

    private final Logger loggerMock = mock(Logger.class);

    //Sapient generated method id: ${validateWhenErrorsIsEmpty}, hash: F2B0FA17F92425BAB9A8E51929719382
    @Disabled()
    @Test()
    void validateWhenErrorsIsEmpty() {
        /* Branches:
         * (errors.isEmpty()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Iterable<FileChange> iterable = new ArrayList<>();
        doReturn(iterable).when(inputChangesMock).getFileChanges((FileCollection) null);
        ValidateJsonNoKeywordsTask target = spy(new ValidateJsonNoKeywordsTask());
        doReturn(loggerMock).when(target).getLogger();
        doNothing().when(loggerMock).debug("Loading keywords from {}", "string5");
        //Act Statement(s)
        target.validate(inputChangesMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(inputChangesMock).getFileChanges((FileCollection) null);
            verify(target).getLogger();
            verify(loggerMock).debug("Loading keywords from {}", "string5");
        });
    }

    //Sapient generated method id: ${validateWhenCaughtIOExceptionThrowsGradleException}, hash: CC640117EE56234F3D22BA755CF9FB12
    @Disabled()
    @Test()
    void validateWhenCaughtIOExceptionThrowsGradleException() {
        /* Branches:
         * (catch-exception (IOException)) : true  #  inside loadKeywords method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ValidateJsonNoKeywordsTask target = spy(new ValidateJsonNoKeywordsTask());
        doReturn(loggerMock).when(target).getLogger();
        doNothing().when(loggerMock).debug("Loading keywords from {}", "string5");
        IOException iOException = new IOException("B");
        GradleException gradleException = new GradleException("Failed to load keywords JSON from A - B", iOException);
        //Act Statement(s)
        final GradleException result = assertThrows(GradleException.class, () -> {
            target.validate(inputChangesMock);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(gradleException.getMessage()));
            assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
            verify(target).getLogger();
            verify(loggerMock).debug("Loading keywords from {}", "string5");
        });
    }
}

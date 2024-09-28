package org.elasticsearch.gradle.internal.test;

import org.junit.jupiter.api.Timeout;
import java.util.List;
import org.gradle.api.tasks.testing.TestResult;
import org.gradle.api.tasks.testing.TestDescriptor;
import org.gradle.api.tasks.testing.TestOutputEvent;
import java.io.UncheckedIOException;
import org.gradle.api.tasks.testing.logging.TestLoggingContainer;
import org.gradle.api.tasks.testing.Test;
import org.mockito.MockedStatic;
import java.io.File;
import java.io.IOException;
import org.gradle.api.logging.Logger;
import java.util.ArrayList;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class ErrorReportingTestListenerSapientGeneratedTest {

    private final ErrorReportingTestListener.Descriptor errorReportingTestListenerDescriptorMock = mock(ErrorReportingTestListener.Descriptor.class);

    private final ErrorReportingTestListener.Descriptor errorReportingTestListenerDescriptorMock2 = mock(ErrorReportingTestListener.Descriptor.class);

    private final Logger loggerMock = mock(Logger.class);

    private final TestResult resultMock = mock(TestResult.class);

    private final TestDescriptor suiteMock = mock(TestDescriptor.class);

    private final TestDescriptor testDescriptorMock = mock(TestDescriptor.class);

    private final TestDescriptor testDescriptorMock2 = mock(TestDescriptor.class);

    private final TestLoggingContainer testLoggingContainerMock = mock(TestLoggingContainer.class);

    private final Test testTaskMock = mock(Test.class);

    //Sapient generated method id: ${onOutputWhenOutputEventGetMessageStartsWithREPRODUCE_WITH_PREFIX}, hash: 336BCA76291002BF231402CD63021F9A
    @Disabled()
    @org.junit.jupiter.api.Test()
    void onOutputWhenOutputEventGetMessageStartsWithREPRODUCE_WITH_PREFIX() {
        /* Branches:
         * (testDescriptor.isComposite()) : true
         * (outputEvent.getMessage().startsWith(REPRODUCE_WITH_PREFIX)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TestOutputEvent outputEventMock = mock(TestOutputEvent.class);
        try (MockedStatic<ErrorReportingTestListener.Descriptor> errorReportingTestListenerDescriptor = mockStatic(ErrorReportingTestListener.Descriptor.class)) {
            doReturn(testDescriptorMock2).when(testDescriptorMock).getParent();
            doReturn(true).when(testDescriptorMock).isComposite();
            doReturn("REPRODUCE WITHA", "return_of_getMessage1").when(outputEventMock).getMessage();
            doReturn(testLoggingContainerMock).when(testTaskMock).getTestLogging();
            doReturn(loggerMock).when(testTaskMock).getLogger();
            errorReportingTestListenerDescriptor.when(() -> ErrorReportingTestListener.Descriptor.of(testDescriptorMock)).thenReturn(errorReportingTestListenerDescriptorMock).thenReturn(errorReportingTestListenerDescriptorMock2);
            File file = new File("pathname1");
            ErrorReportingTestListener target = new ErrorReportingTestListener(testTaskMock, file);
            //Act Statement(s)
            target.onOutput(testDescriptorMock, outputEventMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(testDescriptorMock).getParent();
                verify(testDescriptorMock).isComposite();
                verify(outputEventMock, times(2)).getMessage();
                verify(testTaskMock).getTestLogging();
                verify(testTaskMock).getLogger();
                errorReportingTestListenerDescriptor.verify(() -> ErrorReportingTestListener.Descriptor.of(testDescriptorMock), atLeast(2));
            });
        }
    }

    //Sapient generated method id: ${afterSuiteWhenGetFailedTestsSizeNotGreaterThan0AndCaughtIOExceptionThrowsUncheckedIOException}, hash: 1A7564694B2A686D8883176844DAA450
    @Disabled()
    @org.junit.jupiter.api.Test()
    void afterSuiteWhenGetFailedTestsSizeNotGreaterThan0AndCaughtIOExceptionThrowsUncheckedIOException() {
        /* Branches:
         * (dumpOutputOnFailure) : true
         * (result.getResultType().equals(TestResult.ResultType.FAILURE)) : true
         * (eventWriter != null) : false
         * (suite.getParent() == null) : true
         * (getFailedTests().size() > 0) : false
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ErrorReportingTestListener.Descriptor> errorReportingTestListenerDescriptor = mockStatic(ErrorReportingTestListener.Descriptor.class)) {
            doReturn(null).when(suiteMock).getParent();
            doReturn(TestResult.ResultType.FAILURE).when(resultMock).getResultType();
            doReturn(testLoggingContainerMock).when(testTaskMock).getTestLogging();
            doReturn(loggerMock).when(testTaskMock).getLogger();
            errorReportingTestListenerDescriptor.when(() -> ErrorReportingTestListener.Descriptor.of(suiteMock)).thenReturn(errorReportingTestListenerDescriptorMock);
            File file = new File("pathname1");
            ErrorReportingTestListener target = new ErrorReportingTestListener(testTaskMock, file);
            //Act Statement(s)
            final UncheckedIOException result = assertThrows(UncheckedIOException.class, () -> {
                target.afterSuite(suiteMock, resultMock);
            });
            IOException iOException = new IOException();
            UncheckedIOException uncheckedIOException = new UncheckedIOException("Error reading test suite output", iOException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(uncheckedIOException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
                verify(suiteMock).getParent();
                verify(resultMock).getResultType();
                verify(testTaskMock).getTestLogging();
                verify(testTaskMock).getLogger();
                errorReportingTestListenerDescriptor.verify(() -> ErrorReportingTestListener.Descriptor.of(suiteMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${afterSuiteWhenSuiteGetParentIsNullAndGetFailedTestsSizeNotGreaterThan0AndWriterIsNull}, hash: 8A92E41A78FCB9C1FD896E5D1A89E7C8
    @org.junit.jupiter.api.Test()
    void afterSuiteWhenSuiteGetParentIsNullAndGetFailedTestsSizeNotGreaterThan0AndWriterIsNull() {
        /* Branches:
         * (dumpOutputOnFailure) : true
         * (result.getResultType().equals(TestResult.ResultType.FAILURE)) : true
         * (eventWriter != null) : false
         * (suite.getParent() == null) : true
         * (getFailedTests().size() > 0) : false
         * (writer != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<ErrorReportingTestListener.Descriptor> errorReportingTestListenerDescriptor = mockStatic(ErrorReportingTestListener.Descriptor.class)) {
            doReturn(null).when(suiteMock).getParent();
            doReturn(TestResult.ResultType.FAILURE).when(resultMock).getResultType();
            doReturn(testLoggingContainerMock).when(testTaskMock).getTestLogging();
            doReturn(loggerMock).when(testTaskMock).getLogger();
            errorReportingTestListenerDescriptor.when(() -> ErrorReportingTestListener.Descriptor.of(suiteMock)).thenReturn(errorReportingTestListenerDescriptorMock);
            File file = new File("pathname1");
            ErrorReportingTestListener target = new ErrorReportingTestListener(testTaskMock, file);
            //Act Statement(s)
            target.afterSuite(suiteMock, resultMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(suiteMock).getParent();
                verify(resultMock).getResultType();
                verify(testTaskMock).getTestLogging();
                verify(testTaskMock).getLogger();
                errorReportingTestListenerDescriptor.verify(() -> ErrorReportingTestListener.Descriptor.of(suiteMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${afterSuiteWhenDefaultBranchAndSuiteGetParentIsNullAndGetFailedTestsSizeNotGreaterThan0AndWriterIsNull}, hash: 1DBA2239796507CA6AA3EF2982F57E5F
    @org.junit.jupiter.api.Test()
    void afterSuiteWhenDefaultBranchAndSuiteGetParentIsNullAndGetFailedTestsSizeNotGreaterThan0AndWriterIsNull() {
        /* Branches:
         * (dumpOutputOnFailure) : true
         * (result.getResultType().equals(TestResult.ResultType.FAILURE)) : true
         * (eventWriter != null) : false
         * (branch expression (line 103)) : true
         * (suite.getParent() == null) : true
         * (getFailedTests().size() > 0) : false
         * (writer != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ErrorReportingTestListener.Descriptor> errorReportingTestListenerDescriptor = mockStatic(ErrorReportingTestListener.Descriptor.class)) {
            doReturn(null).when(suiteMock).getParent();
            doReturn(TestResult.ResultType.FAILURE).when(resultMock).getResultType();
            doReturn(testLoggingContainerMock).when(testTaskMock).getTestLogging();
            doReturn(loggerMock).when(testTaskMock).getLogger();
            errorReportingTestListenerDescriptor.when(() -> ErrorReportingTestListener.Descriptor.of(suiteMock)).thenReturn(errorReportingTestListenerDescriptorMock);
            File file = new File("pathname1");
            ErrorReportingTestListener target = new ErrorReportingTestListener(testTaskMock, file);
            //Act Statement(s)
            target.afterSuite(suiteMock, resultMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(suiteMock).getParent();
                verify(resultMock).getResultType();
                verify(testTaskMock).getTestLogging();
                verify(testTaskMock).getLogger();
                errorReportingTestListenerDescriptor.verify(() -> ErrorReportingTestListener.Descriptor.of(suiteMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${afterTestWhenResultGetExceptionsSizeGreaterThan0}, hash: 3773DBDA861167004998FC0262EC0C8A
    @Disabled()
    @org.junit.jupiter.api.Test()
    void afterTestWhenResultGetExceptionsSizeGreaterThan0() {
        /* Branches:
         * (result.getResultType() == TestResult.ResultType.FAILURE) : true
         * (testDescriptor.getParent() != null) : true
         * (lines != null) : false
         * (result.getExceptions().size() > 0) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: formatter - Method: format
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TestDescriptor testDescriptorMock3 = mock(TestDescriptor.class);
        TestDescriptor testDescriptorMock4 = mock(TestDescriptor.class);
        ErrorReportingTestListener.Descriptor errorReportingTestListenerDescriptorMock3 = mock(ErrorReportingTestListener.Descriptor.class);
        try (MockedStatic<ErrorReportingTestListener.Descriptor> errorReportingTestListenerDescriptor = mockStatic(ErrorReportingTestListener.Descriptor.class)) {
            doReturn(testDescriptorMock2, testDescriptorMock3, testDescriptorMock4).when(testDescriptorMock).getParent();
            doReturn(TestResult.ResultType.FAILURE).when(resultMock).getResultType();
            Throwable throwable = new Throwable();
            List<Throwable> throwableList = new ArrayList<>();
            throwableList.add(throwable);
            List<Throwable> throwableList2 = new ArrayList<>();
            doReturn(throwableList, throwableList2).when(resultMock).getExceptions();
            doReturn(testLoggingContainerMock).when(testTaskMock).getTestLogging();
            doReturn(loggerMock).when(testTaskMock).getLogger();
            errorReportingTestListenerDescriptor.when(() -> ErrorReportingTestListener.Descriptor.of(testDescriptorMock)).thenReturn(errorReportingTestListenerDescriptorMock);
            errorReportingTestListenerDescriptor.when(() -> ErrorReportingTestListener.Descriptor.of(testDescriptorMock3)).thenReturn(errorReportingTestListenerDescriptorMock2);
            errorReportingTestListenerDescriptor.when(() -> ErrorReportingTestListener.Descriptor.of(testDescriptorMock4)).thenReturn(errorReportingTestListenerDescriptorMock3);
            File file = new File("pathname1");
            ErrorReportingTestListener target = new ErrorReportingTestListener(testTaskMock, file);
            //Act Statement(s)
            target.afterTest(testDescriptorMock, resultMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(testDescriptorMock, times(3)).getParent();
                verify(resultMock).getResultType();
                verify(resultMock, times(2)).getExceptions();
                verify(testTaskMock).getTestLogging();
                verify(testTaskMock).getLogger();
                errorReportingTestListenerDescriptor.verify(() -> ErrorReportingTestListener.Descriptor.of(testDescriptorMock), atLeast(1));
                errorReportingTestListenerDescriptor.verify(() -> ErrorReportingTestListener.Descriptor.of(testDescriptorMock3), atLeast(1));
                errorReportingTestListenerDescriptor.verify(() -> ErrorReportingTestListener.Descriptor.of(testDescriptorMock4), atLeast(1));
            });
        }
    }
}

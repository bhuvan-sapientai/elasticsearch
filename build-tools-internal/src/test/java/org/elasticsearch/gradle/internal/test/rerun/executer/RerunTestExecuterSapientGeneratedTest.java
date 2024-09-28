package org.elasticsearch.gradle.internal.test.rerun.executer;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.gradle.api.internal.tasks.testing.TestDescriptorInternal;
import org.gradle.api.provider.Property;
import org.gradle.api.internal.tasks.testing.TestResultProcessor;
import org.gradle.api.internal.tasks.testing.JvmTestExecutionSpec;
import org.gradle.api.internal.tasks.testing.TestExecuter;
import java.util.ArrayList;
import org.elasticsearch.gradle.internal.test.rerun.TestRerunTaskExtension;
import org.gradle.internal.id.CompositeIdGenerator;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class RerunTestExecuterSapientGeneratedTest {

    private final TestRerunTaskExtension extensionMock = mock(TestRerunTaskExtension.class, "extension");

    private final TestExecuter<JvmTestExecutionSpec> delegateMock = mock(TestExecuter.class, "delegate");

    private final TestDescriptorInternal dMock = mock(TestDescriptorInternal.class);

    private final JvmTestExecutionSpec jvmTestExecutionSpecMock = mock(JvmTestExecutionSpec.class);

    private final Property<Integer> propertyMock = mock(Property.class);

    private final TestResultProcessor testResultProcessorMock = mock(TestResultProcessor.class);

    //Sapient generated method id: ${executeWhenMaxRetriesLessThanOrEqualsTo0}, hash: EF512DFE3DA36E994292C41C64AE444B
    @Test()
    void executeWhenMaxRetriesLessThanOrEqualsTo0() {
        /* Branches:
         * (maxRetries <= 0) : true
         */
        //Arrange Statement(s)
        doReturn(propertyMock).when(extensionMock).getMaxReruns();
        doReturn(-1).when(propertyMock).get();
        doNothing().when(delegateMock).execute(jvmTestExecutionSpecMock, testResultProcessorMock);
        RerunTestExecuter target = new RerunTestExecuter(extensionMock, delegateMock);
        //Act Statement(s)
        target.execute(jvmTestExecutionSpecMock, testResultProcessorMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(extensionMock).getMaxReruns();
            verify(propertyMock).get();
            verify(delegateMock).execute(jvmTestExecutionSpecMock, testResultProcessorMock);
        });
    }

    //Sapient generated method id: ${executeWhenMaxRetriesGreaterThan0}, hash: 5FE060585879C23915E8A82903D884CE
    @Test()
    void executeWhenMaxRetriesGreaterThan0() {
        /* Branches:
         * (maxRetries <= 0) : false
         */
        //Arrange Statement(s)
        doReturn(propertyMock).when(extensionMock).getMaxReruns();
        doReturn(1).when(propertyMock).get();
        doNothing().when(delegateMock).execute(eq(jvmTestExecutionSpecMock), (RerunTestResultProcessor) any());
        RerunTestExecuter target = new RerunTestExecuter(extensionMock, delegateMock);
        //Act Statement(s)
        target.execute(jvmTestExecutionSpecMock, testResultProcessorMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(extensionMock).getMaxReruns();
            verify(propertyMock).get();
            verify(delegateMock).execute(eq(jvmTestExecutionSpecMock), (RerunTestResultProcessor) any());
        });
    }

    //Sapient generated method id: ${executeWhenRetryCountNotEqualsMaxRetries}, hash: CC4D820DAA294BCD8C81272726661B82
    @Disabled()
    @Test()
    void executeWhenRetryCountNotEqualsMaxRetries() {
        /* Branches:
         * (maxRetries <= 0) : false
         * (catch-exception (ExecException)) : true
         * (branch expression (line 75)) : true
         * (retryCount++ == maxRetries) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: retryTestResultProcessor - Method: getActiveDescriptors
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(propertyMock).when(extensionMock).getMaxReruns();
        doReturn(1).when(propertyMock).get();
        Property<Boolean> propertyMock2 = mock(Property.class);
        doReturn(propertyMock2).when(extensionMock).getDidRerun();
        doNothing().when(propertyMock2).set(true);
        doNothing().when(delegateMock).execute(eq(jvmTestExecutionSpecMock), (RerunTestResultProcessor) any());
        RerunTestExecuter target = new RerunTestExecuter(extensionMock, delegateMock);
        //Act Statement(s)
        target.execute(jvmTestExecutionSpecMock, testResultProcessorMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(extensionMock).getMaxReruns();
            verify(propertyMock).get();
            verify(extensionMock, times(2)).getDidRerun();
            verify(propertyMock2, times(2)).set(true);
            verify(delegateMock, atLeast(2)).execute(eq(jvmTestExecutionSpecMock), (RerunTestResultProcessor) any());
        });
    }

    //Sapient generated method id: ${stopNowTest}, hash: A8247E8DE3A2C91EFA5E1402C407C35D
    @Test()
    void stopNowTest() {
        //Arrange Statement(s)
        doNothing().when(delegateMock).stopNow();
        RerunTestExecuter target = new RerunTestExecuter(extensionMock, delegateMock);
        //Act Statement(s)
        target.stopNow();
        //Assert statement(s)
        assertAll("result", () -> verify(delegateMock).stopNow());
    }

    //Sapient generated method id: ${reportWhenDefaultBranch}, hash: 2C8A05458C49A212735A8F72CF5EE312
    @Test()
    void reportWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 75)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CompositeIdGenerator.CompositeId compositeIdGeneratorCompositeIdMock = mock(CompositeIdGenerator.CompositeId.class);
        doReturn(compositeIdGeneratorCompositeIdMock).when(dMock).getId();
        RerunTestExecuter target = new RerunTestExecuter(extensionMock, delegateMock);
        List<TestDescriptorInternal> testDescriptorInternalList = new ArrayList<>();
        testDescriptorInternalList.add(dMock);
        //Act Statement(s)
        target.report(2, testDescriptorInternalList);
        //Assert statement(s)
        assertAll("result", () -> verify(dMock).getId());
    }

    //Sapient generated method id: ${reportWhenDefaultBranch2}, hash: 0C3BB34F29514CBC95CCCBA7CAB3EAF3
    @Test()
    void reportWhenDefaultBranch2() {
        /* Branches:
         * (branch expression (line 75)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        doReturn(object).when(dMock).getId();
        RerunTestExecuter target = new RerunTestExecuter(extensionMock, delegateMock);
        List<TestDescriptorInternal> testDescriptorInternalList = new ArrayList<>();
        testDescriptorInternalList.add(dMock);
        //Act Statement(s)
        target.report(2, testDescriptorInternalList);
        //Assert statement(s)
        assertAll("result", () -> verify(dMock).getId());
    }
}

package org.elasticsearch.gradle.internal.test.rerun.executer;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.gradle.api.tasks.testing.TestFailure;
import org.gradle.api.internal.tasks.testing.TestResultProcessor;
import org.gradle.api.internal.tasks.testing.TestDescriptorInternal;
import org.gradle.api.internal.tasks.testing.TestStartEvent;
import org.mockito.MockitoAnnotations;
import org.gradle.api.tasks.testing.TestOutputEvent;
import org.gradle.api.internal.tasks.testing.TestCompleteEvent;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class RerunTestResultProcessorSapientGeneratedTest {

    private final TestResultProcessor delegateMock = mock(TestResultProcessor.class, "delegate");

    private final TestDescriptorInternal rootTestDescriptorMock = mock(TestDescriptorInternal.class, "rootTestDescriptor");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private RerunTestResultProcessor target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${startedWhenRootTestDescriptorIsNull}, hash: D63E8443B69A878903D2B4DEA2497CFB
    @Disabled()
    @Test()
    void startedWhenRootTestDescriptorIsNull() {
        /* Branches:
         * (rootTestDescriptor == null) : true
         */
        //Arrange Statement(s)
        TestDescriptorInternal descriptorMock = mock(TestDescriptorInternal.class);
        Object object = new Object();
        doReturn(object).when(descriptorMock).getId();
        TestStartEvent testStartEventMock = mock(TestStartEvent.class);
        doNothing().when(delegateMock).started(descriptorMock, testStartEventMock);
        target = new RerunTestResultProcessor(delegateMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        target.started(descriptorMock, testStartEventMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(descriptorMock).getId();
            verify(delegateMock).started(descriptorMock, testStartEventMock);
        });
    }

    //Sapient generated method id: ${startedWhenActiveDescriptorsByIdEntrySetIsNotEmpty}, hash: 2A93445FAD320476C37F1CD36F61D069
    @Disabled()
    @Test()
    void startedWhenActiveDescriptorsByIdEntrySetIsNotEmpty() {
        /* Branches:
         * (rootTestDescriptor == null) : true
         * (catch-exception (IllegalArgumentException)) : true
         * (for-each(activeDescriptorsById.entrySet())) : true  #  inside logTracing method
         */
        //Arrange Statement(s)
        TestDescriptorInternal descriptorMock = mock(TestDescriptorInternal.class);
        Object objectMock = mock(Object.class, "object");
        Object objectMock2 = mock(Object.class, "object2");
        doReturn(objectMock, objectMock2).when(descriptorMock).getId();
        doReturn("A").when(descriptorMock).getDisplayName();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        TestStartEvent testStartEventMock = mock(TestStartEvent.class);
        doThrow(illegalArgumentException).when(delegateMock).started(descriptorMock, testStartEventMock);
        target = new RerunTestResultProcessor(delegateMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        target.started(descriptorMock, testStartEventMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(descriptorMock, times(2)).getId();
            verify(descriptorMock).getDisplayName();
            verify(delegateMock).started(descriptorMock, testStartEventMock);
        });
    }

    //Sapient generated method id: ${completedWhenActiveDescriptorsByIdSizeNotEquals1}, hash: 8374A8E70835549C95E72C16D99E83A4
    @Test()
    void completedWhenActiveDescriptorsByIdSizeNotEquals1() {
        /* Branches:
         * (testId.equals(rootTestDescriptor.getId())) : true
         * (activeDescriptorsById.size() != 1) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        doReturn(object).when(rootTestDescriptorMock).getId();
        target = new RerunTestResultProcessor(delegateMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        TestCompleteEvent testCompleteEventMock = mock(TestCompleteEvent.class);
        //Act Statement(s)
        target.completed(object, testCompleteEventMock);
        //Assert statement(s)
        assertAll("result", () -> verify(rootTestDescriptorMock).getId());
    }

    //Sapient generated method id: ${completedWhenNotActive}, hash: F13F0F5EDAC324E9435F62E1610A47FE
    @Test()
    void completedWhenNotActive() {
        /* Branches:
         * (testId.equals(rootTestDescriptor.getId())) : false
         * (active) : false
         */
        //Arrange Statement(s)
        Object object = new Object();
        doReturn(object).when(rootTestDescriptorMock).getId();
        target = new RerunTestResultProcessor(delegateMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Object object2 = new Object();
        TestCompleteEvent testCompleteEventMock = mock(TestCompleteEvent.class);
        //Act Statement(s)
        target.completed(object2, testCompleteEventMock);
        //Assert statement(s)
        assertAll("result", () -> verify(rootTestDescriptorMock).getId());
    }

    //Sapient generated method id: ${outputWhenActiveDescriptorsByIdNotContainsKeyTestId}, hash: 87763A86A2D582501C4C5F9B58CE312A
    @Test()
    void outputWhenActiveDescriptorsByIdNotContainsKeyTestId() {
        /* Branches:
         * (activeDescriptorsById.containsKey(testId)) : false
         */
        //Arrange Statement(s)
        target = new RerunTestResultProcessor(delegateMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Object object = new Object();
        TestOutputEvent testOutputEventMock = mock(TestOutputEvent.class);
        //Act Statement(s)
        target.output(object, testOutputEventMock);
    }

    //Sapient generated method id: ${failureWhenActiveDescriptorsByIdNotContainsKeyTestId}, hash: 1E8869D7BA5BEABF7257FE30458395A8
    @Test()
    void failureWhenActiveDescriptorsByIdNotContainsKeyTestId() {
        /* Branches:
         * (activeDescriptorsById.containsKey(testId)) : false
         */
        //Arrange Statement(s)
        target = new RerunTestResultProcessor(delegateMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Object object = new Object();
        TestFailure testFailureMock = mock(TestFailure.class);
        //Act Statement(s)
        target.failure(object, testFailureMock);
    }

    //Sapient generated method id: ${resetTest}, hash: 120995B8F49E0B74940CD110989891E8
    @Test()
    void resetTest() {
        //Arrange Statement(s)
        Object object = new Object();
        doReturn(object).when(rootTestDescriptorMock).getId();
        target = new RerunTestResultProcessor(delegateMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        target.reset();
        //Assert statement(s)
        assertAll("result", () -> verify(rootTestDescriptorMock).getId());
    }

    //Sapient generated method id: ${getActiveDescriptorsTest}, hash: 76E400098CD71F3283F402722F4EB2EC
    @Test()
    void getActiveDescriptorsTest() {
        //Arrange Statement(s)
        target = new RerunTestResultProcessor(delegateMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        List<TestDescriptorInternal> result = target.getActiveDescriptors();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }
}

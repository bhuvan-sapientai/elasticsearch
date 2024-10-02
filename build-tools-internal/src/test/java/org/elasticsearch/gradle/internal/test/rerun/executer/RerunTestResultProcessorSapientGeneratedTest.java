package org.elasticsearch.gradle.internal.test.rerun.executer;

import org.elasticsearch.gradle.internal.test.rerun.executer.RerunTestResultProcessor;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.gradle.api.tasks.testing.TestOutputEvent;
import org.junit.jupiter.api.Timeout;
import org.gradle.api.tasks.testing.TestFailure;
import org.gradle.api.internal.tasks.testing.TestDescriptorInternal;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;

import org.gradle.api.internal.tasks.testing.TestResultProcessor;
import org.mockito.InjectMocks;

import static org.hamcrest.Matchers.*;

import java.util.ArrayList;

import org.gradle.api.internal.tasks.testing.TestCompleteEvent;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.internal.tasks.testing.TestStartEvent;

import static org.mockito.Mockito.*;

import java.util.HashMap;

import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class RerunTestResultProcessorSapientGeneratedTest {

    private TestResultProcessor delegateMock;

    private TestDescriptorInternal rootTestDescriptorMock;

    private AutoCloseable autoCloseableMocks;

    @InjectMocks
    private RerunTestResultProcessor target;

    @BeforeEach
    public void setUp() {
        delegateMock = mock(TestResultProcessor.class);
        rootTestDescriptorMock = mock(TestDescriptorInternal.class);
        target = new RerunTestResultProcessor(delegateMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    @Test
    void startedWhenRootTestDescriptorIsNull() {
        TestDescriptorInternal descriptorMock = mock(TestDescriptorInternal.class);
        Object object = new Object();
        when(descriptorMock.getId()).thenReturn(object);
        TestStartEvent testStartEventMock = mock(TestStartEvent.class);
        doNothing().when(delegateMock).started(descriptorMock, testStartEventMock);
        target.started(descriptorMock, testStartEventMock);
        verify(descriptorMock).getId();
        verify(delegateMock).started(descriptorMock, testStartEventMock);
    }

    @Test
    void startedWhenRootTestDescriptorIsNotNull() {
        TestDescriptorInternal descriptorMock = mock(TestDescriptorInternal.class);
        Object object = new Object();
        when(descriptorMock.getId()).thenReturn(object);
        TestStartEvent testStartEventMock = mock(TestStartEvent.class);
        when(testStartEventMock.getParentId()).thenReturn(object);
        target.started(rootTestDescriptorMock, mock(TestStartEvent.class));
        target.started(descriptorMock, testStartEventMock);
        verify(delegateMock).started(descriptorMock, testStartEventMock);
    }

    @Test
    void startedWhenIllegalArgumentExceptionOccurs() {
        TestDescriptorInternal descriptorMock = mock(TestDescriptorInternal.class);
        Object object = new Object();
        when(descriptorMock.getId()).thenReturn(object);
        TestStartEvent testStartEventMock = mock(TestStartEvent.class);
        doThrow(new IllegalArgumentException()).when(delegateMock).started(descriptorMock, testStartEventMock);
        target.started(descriptorMock, testStartEventMock);
        verify(delegateMock).started(descriptorMock, testStartEventMock);
    }

    @Test
    void completedWhenTestIdEqualsRootTestDescriptorId() {
        Object object = new Object();
        when(rootTestDescriptorMock.getId()).thenReturn(object);
        target.started(rootTestDescriptorMock, mock(TestStartEvent.class));
        TestCompleteEvent testCompleteEventMock = mock(TestCompleteEvent.class);
        target.completed(object, testCompleteEventMock);
        verify(delegateMock).completed(object, testCompleteEventMock);
    }

    @Test
    void completedWhenTestIdDoesNotEqualRootTestDescriptorId() {
        Object object = new Object();
        Object testId = new Object();
        when(rootTestDescriptorMock.getId()).thenReturn(object);
        target.started(rootTestDescriptorMock, mock(TestStartEvent.class));
        TestCompleteEvent testCompleteEventMock = mock(TestCompleteEvent.class);
        target.completed(testId, testCompleteEventMock);
        verify(delegateMock, never()).completed(testId, testCompleteEventMock);
    }

    @Test
    void outputWhenTestIdIsActive() {
        Object testId = new Object();
        TestDescriptorInternal descriptorMock = mock(TestDescriptorInternal.class);
        when(descriptorMock.getId()).thenReturn(testId);
        target.started(descriptorMock, mock(TestStartEvent.class));
        TestOutputEvent testOutputEventMock = mock(TestOutputEvent.class);
        target.output(testId, testOutputEventMock);
        verify(delegateMock).output(testId, testOutputEventMock);
    }

    @Test
    void outputWhenTestIdIsNotActive() {
        Object testId = new Object();
        TestOutputEvent testOutputEventMock = mock(TestOutputEvent.class);
        target.output(testId, testOutputEventMock);
        verify(delegateMock, never()).output(testId, testOutputEventMock);
    }

    @Test
    void failureWhenTestIdIsActive() {
        Object testId = new Object();
        TestDescriptorInternal descriptorMock = mock(TestDescriptorInternal.class);
        when(descriptorMock.getId()).thenReturn(testId);
        target.started(descriptorMock, mock(TestStartEvent.class));
        TestFailure testFailureMock = mock(TestFailure.class);
        target.failure(testId, testFailureMock);
        verify(delegateMock).failure(testId, testFailureMock);
    }

    @Test
    void failureWhenTestIdIsNotActive() {
        Object testId = new Object();
        TestFailure testFailureMock = mock(TestFailure.class);
        target.failure(testId, testFailureMock);
        verify(delegateMock, never()).failure(testId, testFailureMock);
    }

    @Test
    void resetTest() {
        Object object = new Object();
        when(rootTestDescriptorMock.getId()).thenReturn(object);
        target.started(rootTestDescriptorMock, mock(TestStartEvent.class));
        target.started(mock(TestDescriptorInternal.class), mock(TestStartEvent.class));
        target.reset();
        List<TestDescriptorInternal> activeDescriptors = target.getActiveDescriptors();
        assertThat(activeDescriptors.size(), equalTo(1));
        assertThat(activeDescriptors.get(0), equalTo(rootTestDescriptorMock));
    }

    @Test
    void getActiveDescriptorsTest() {
        Object object1 = new Object();
        Object object2 = new Object();
        TestDescriptorInternal descriptor1 = mock(TestDescriptorInternal.class);
        TestDescriptorInternal descriptor2 = mock(TestDescriptorInternal.class);
        when(descriptor1.getId()).thenReturn(object1);
        when(descriptor2.getId()).thenReturn(object2);
        target.started(descriptor1, mock(TestStartEvent.class));
        target.started(descriptor2, mock(TestStartEvent.class));
        List<TestDescriptorInternal> result = target.getActiveDescriptors();
        assertThat(result.size(), equalTo(2));
        assertThat(result, containsInAnyOrder(descriptor1, descriptor2));
    }
}

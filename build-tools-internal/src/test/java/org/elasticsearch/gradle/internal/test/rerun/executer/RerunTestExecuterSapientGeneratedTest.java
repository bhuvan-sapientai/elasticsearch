package org.elasticsearch.gradle.internal.test.rerun.executer;

import org.elasticsearch.gradle.internal.test.rerun.executer.RerunTestExecuter;

import org.elasticsearch.gradle.internal.test.rerun.TestRerunTaskExtension;
import org.gradle.internal.id.CompositeIdGenerator;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import static org.mockito.ArgumentMatchers.any;

import org.gradle.api.provider.Property;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.mockito.ArgumentMatchers.eq;

import org.gradle.api.internal.tasks.testing.TestExecuter;
import org.gradle.api.internal.tasks.testing.TestDescriptorInternal;

import java.util.Comparator;

import org.gradle.api.internal.tasks.testing.TestResultProcessor;

import java.util.ArrayList;

import org.gradle.api.GradleException;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Collectors;

import static org.mockito.ArgumentMatchers.anyBoolean;

import org.gradle.api.internal.tasks.testing.JvmTestExecutionSpec;

import static org.mockito.Mockito.*;

import org.gradle.process.internal.ExecException;

import static org.mockito.ArgumentMatchers.any;

class RerunTestExecuterSapientGeneratedTest {

    private TestRerunTaskExtension extensionMock;

    private TestExecuter<JvmTestExecutionSpec> delegateMock;

    private TestDescriptorInternal descriptorMock;

    private JvmTestExecutionSpec specMock;

    private Property<Integer> maxRerunsPropertyMock;

    private Property<Boolean> didRerunPropertyMock;

    private TestResultProcessor resultProcessorMock;

    private RerunTestExecuter testExecuter;

    @BeforeEach
    void setUp() {
        extensionMock = mock(TestRerunTaskExtension.class);
        delegateMock = mock(TestExecuter.class);
        descriptorMock = mock(TestDescriptorInternal.class);
        specMock = mock(JvmTestExecutionSpec.class);
        maxRerunsPropertyMock = mock(Property.class);
        didRerunPropertyMock = mock(Property.class);
        resultProcessorMock = mock(TestResultProcessor.class);
        when(extensionMock.getMaxReruns()).thenReturn(maxRerunsPropertyMock);
        when(extensionMock.getDidRerun()).thenReturn(didRerunPropertyMock);
        testExecuter = new RerunTestExecuter(extensionMock, delegateMock);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0})
    void executeWhenMaxRetriesLessThanOrEqualsTo0(int maxRetries) {
        when(maxRerunsPropertyMock.get()).thenReturn(maxRetries);
        testExecuter.execute(specMock, resultProcessorMock);
        verify(delegateMock).execute(specMock, resultProcessorMock);
        verify(didRerunPropertyMock, never()).set(anyBoolean());
    }

    @Test
    void executeWhenMaxRetriesGreaterThan0AndNoExceptions() {
        when(maxRerunsPropertyMock.get()).thenReturn(1);
        testExecuter.execute(specMock, resultProcessorMock);
        verify(delegateMock).execute(eq(specMock), any(RerunTestResultProcessor.class));
        verify(didRerunPropertyMock, never()).set(anyBoolean());
    }

    @Test
    void executeWhenMaxRetriesGreaterThan0AndExceptionOccurs() {
        when(maxRerunsPropertyMock.get()).thenReturn(2);
        doThrow(ExecException.class).doNothing().when(delegateMock).execute(eq(specMock), any(RerunTestResultProcessor.class));
        testExecuter.execute(specMock, resultProcessorMock);
        verify(delegateMock, times(2)).execute(eq(specMock), any(RerunTestResultProcessor.class));
        verify(didRerunPropertyMock).set(true);
    }

    @Test
    void executeWhenMaxRetriesReachedThrowsGradleException() {
        when(maxRerunsPropertyMock.get()).thenReturn(1);
        doThrow(ExecException.class).when(delegateMock).execute(eq(specMock), any(RerunTestResultProcessor.class));
        assertThrows(GradleException.class, () -> testExecuter.execute(specMock, resultProcessorMock));
        verify(delegateMock, times(2)).execute(eq(specMock), any(RerunTestResultProcessor.class));
        verify(didRerunPropertyMock).set(true);
    }

    @Test
    void stopNowTest() {
        testExecuter.stopNow();
        verify(delegateMock).stopNow();
    }

    @Test
    void reportWithCompositeIdDescriptors() {
        List<TestDescriptorInternal> descriptors = new ArrayList<>();
        TestDescriptorInternal descriptor1 = mock(TestDescriptorInternal.class);
        TestDescriptorInternal descriptor2 = mock(TestDescriptorInternal.class);
        CompositeIdGenerator.CompositeId id1 = mock(CompositeIdGenerator.CompositeId.class);
        CompositeIdGenerator.CompositeId id2 = mock(CompositeIdGenerator.CompositeId.class);
        when(descriptor1.getId()).thenReturn(id1);
        when(descriptor2.getId()).thenReturn(id2);
        when(descriptor1.getName()).thenReturn("Test1");
        when(descriptor2.getName()).thenReturn("Test2");
        when(id1.toString()).thenReturn("1");
        when(id2.toString()).thenReturn("2");
        descriptors.add(descriptor1);
        descriptors.add(descriptor2);
        testExecuter.report(1, descriptors);
        verify(descriptor1).getId();
        verify(descriptor2).getId();
        verify(descriptor1).getName();
        verify(descriptor2).getName();
    }

    @Test
    void reportWithNonCompositeIdDescriptors() {
        List<TestDescriptorInternal> descriptors = new ArrayList<>();
        TestDescriptorInternal descriptor = mock(TestDescriptorInternal.class);
        Object nonCompositeId = new Object();
        when(descriptor.getId()).thenReturn(nonCompositeId);
        descriptors.add(descriptor);
        testExecuter.report(1, descriptors);
        verify(descriptor).getId();
        verify(descriptor, never()).getName();
    }

    @Test
    void executeWithMultipleRetries() {
        when(maxRerunsPropertyMock.get()).thenReturn(3);
        doThrow(ExecException.class).doThrow(ExecException.class).doNothing().when(delegateMock).execute(eq(specMock), any(RerunTestResultProcessor.class));
        testExecuter.execute(specMock, resultProcessorMock);
        verify(delegateMock, times(3)).execute(eq(specMock), any(RerunTestResultProcessor.class));
        verify(didRerunPropertyMock, times(2)).set(true);
    }

    @Test
    void reportWithEmptyDescriptorList() {
        List<TestDescriptorInternal> descriptors = new ArrayList<>();
        testExecuter.report(1, descriptors);
        // No exceptions should be thrown
    }

    @Test
    void executeWithZeroMaxRetries() {
        when(maxRerunsPropertyMock.get()).thenReturn(0);
        testExecuter.execute(specMock, resultProcessorMock);
        verify(delegateMock, times(1)).execute(specMock, resultProcessorMock);
        verify(didRerunPropertyMock, never()).set(anyBoolean());
    }
}

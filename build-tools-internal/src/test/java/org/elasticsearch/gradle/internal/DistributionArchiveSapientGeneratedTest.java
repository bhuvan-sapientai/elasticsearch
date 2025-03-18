package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.DistributionArchive;

import org.gradle.api.file.CopySpec;
import org.gradle.api.tasks.Sync;
import org.elasticsearch.gradle.internal.DistributionArchive;
import org.gradle.api.tasks.bundling.AbstractArchiveTask;
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.ArgumentMatchers.any;

import org.gradle.api.provider.Property;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import org.gradle.api.Action;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.tasks.TaskProvider;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

class DistributionArchiveSapientGeneratedTest {

    private TaskProvider<AbstractArchiveTask> archiveTaskMock;

    private TaskProvider<Sync> expandedDistTaskMock;

    private AbstractArchiveTask abstractArchiveTaskMock;

    private Sync syncTaskMock;

    private Property<String> classifierPropertyMock;

    private DistributionArchive target;

    @BeforeEach
    void setUp() {
        //archiveTaskMock = mock(TaskProvider.class);
        //expandedDistTaskMock = mock(TaskProvider.class);
        //abstractArchiveTaskMock = mock(AbstractArchiveTask.class);
        //syncTaskMock = mock(Sync.class);
        //classifierPropertyMock = mock(Property.class);
        //when(archiveTaskMock.configure(any())).thenReturn(abstractArchiveTaskMock);
        //when(expandedDistTaskMock.configure(any())).thenReturn(syncTaskMock);
        //when(abstractArchiveTaskMock.getArchiveClassifier()).thenReturn(classifierPropertyMock);
        //target = new DistributionArchive(archiveTaskMock, expandedDistTaskMock, "testName");
    }

    @Test
    void setArchiveClassifierTest() {
        target.setArchiveClassifier("classifier1");
        verify(archiveTaskMock).configure(any());
        verify(classifierPropertyMock).set("classifier1");
    }

    @Test
    void contentTest() {
        Supplier<CopySpec> pMock = mock(Supplier.class);
        CopySpec copySpecMock = mock(CopySpec.class);
        when(pMock.get()).thenReturn(copySpecMock);
        target.content(pMock);
        verify(pMock, times(2)).get();
        verify(archiveTaskMock).configure(any());
        verify(expandedDistTaskMock).configure(any());
        verify(abstractArchiveTaskMock).with(copySpecMock);
        verify(syncTaskMock).with(copySpecMock);
    }

    @Test
    void getNameTest() {
        String result = target.getName();
        assertEquals("testName", result);
    }

    @Test
    void getArchiveTaskTest() {
        TaskProvider<? extends AbstractArchiveTask> result = target.getArchiveTask();
        assertEquals(archiveTaskMock, result);
    }

    @Test
    void getExpandedDistTaskTest() {
        TaskProvider<Sync> result = target.getExpandedDistTask();
        assertEquals(expandedDistTaskMock, result);
    }

    @Test
    void constructorTest() {
        assertNotNull(target);
        assertEquals("testName", target.getName());
        assertEquals(archiveTaskMock, target.getArchiveTask());
        assertEquals(expandedDistTaskMock, target.getExpandedDistTask());
    }
}
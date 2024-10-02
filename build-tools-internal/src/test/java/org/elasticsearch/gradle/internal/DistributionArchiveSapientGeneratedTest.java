package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.DistributionArchive;

import org.gradle.api.file.CopySpec;
import org.gradle.api.tasks.Sync;
import org.gradle.api.tasks.bundling.AbstractArchiveTask;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.tasks.TaskProvider;

import java.util.function.Supplier;

import static org.mockito.Mockito.*;

import org.gradle.api.Action;

import static org.mockito.ArgumentMatchers.any;

class DistributionArchiveSapientGeneratedTest {

    private final TaskProvider<AbstractArchiveTask> archiveTaskMock = mock(TaskProvider.class, "archiveTask");

    private final TaskProvider<Sync> expandedDistTaskMock = mock(TaskProvider.class, "expandedDistTask");

    private final AbstractArchiveTask abstractArchiveTaskMock = mock(AbstractArchiveTask.class);

    private final Sync syncTaskMock = mock(Sync.class);

    @Test
    void setArchiveClassifierTest() {
        doReturn(abstractArchiveTaskMock).when(archiveTaskMock).configure(any());
        DistributionArchive target = new DistributionArchive(archiveTaskMock, expandedDistTaskMock, "name1");
        target.setArchiveClassifier("classifier1");
        verify(archiveTaskMock).configure(any());
    }

    @Test
    void contentTest() {
        Supplier<CopySpec> pMock = mock(Supplier.class);
        CopySpec copySpecMock = mock(CopySpec.class);
        doReturn(copySpecMock).when(pMock).get();
        doReturn(abstractArchiveTaskMock).when(archiveTaskMock).configure(any());
        doReturn(syncTaskMock).when(expandedDistTaskMock).configure(any());
        DistributionArchive target = new DistributionArchive(archiveTaskMock, expandedDistTaskMock, "name1");
        target.content(pMock);
        verify(pMock, times(2)).get();
        verify(archiveTaskMock).configure(any());
        verify(expandedDistTaskMock).configure(any());
    }

    @Test
    void getNameTest() {
        DistributionArchive target = new DistributionArchive(archiveTaskMock, expandedDistTaskMock, "testName");
        String result = target.getName();
        assertEquals("testName", result);
    }

    @Test
    void getArchiveTaskTest() {
        DistributionArchive target = new DistributionArchive(archiveTaskMock, expandedDistTaskMock, "name1");
        TaskProvider<? extends AbstractArchiveTask> result = target.getArchiveTask();
        assertEquals(archiveTaskMock, result);
    }

    @Test
    void getExpandedDistTaskTest() {
        DistributionArchive target = new DistributionArchive(archiveTaskMock, expandedDistTaskMock, "name1");
        TaskProvider<Sync> result = target.getExpandedDistTask();
        assertEquals(expandedDistTaskMock, result);
    }
}

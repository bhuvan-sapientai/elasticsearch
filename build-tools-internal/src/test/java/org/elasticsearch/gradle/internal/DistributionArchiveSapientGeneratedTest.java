package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.tasks.TaskProvider;
import java.util.function.Supplier;
import org.gradle.api.Action;
import org.gradle.api.tasks.Sync;
import org.gradle.api.file.CopySpec;
import org.gradle.api.tasks.bundling.AbstractArchiveTask;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class DistributionArchiveSapientGeneratedTest {

    private final TaskProvider<AbstractArchiveTask> archiveTaskMock = mock(TaskProvider.class, "archiveTask");

    private final TaskProvider<Sync> expandedDistTaskMock = mock(TaskProvider.class, "expandedDistTask");

    //Sapient generated method id: ${setArchiveClassifierTest}, hash: 4E6D1DF67C1A260B9F83966312F117BB
    @Test()
    void setArchiveClassifierTest() {
        //Arrange Statement(s)
        doNothing().when(archiveTaskMock).configure((Action) any());
        DistributionArchive target = new DistributionArchive(archiveTaskMock, expandedDistTaskMock, "name1");
        //Act Statement(s)
        target.setArchiveClassifier("classifier1");
        //Assert statement(s)
        assertAll("result", () -> verify(archiveTaskMock).configure((Action) any()));
    }

    //Sapient generated method id: ${contentTest}, hash: 4F0241E07E711055A9EF1038F0534E12
    @Disabled()
    @Test()
    void contentTest() {
        //Arrange Statement(s)
        Supplier pMock = mock(Supplier.class);
        CopySpec copySpecMock = mock(CopySpec.class);
        CopySpec copySpecMock2 = mock(CopySpec.class);
        doReturn(copySpecMock, copySpecMock2).when(pMock).get();
        doNothing().when(archiveTaskMock).configure((Action) any());
        doNothing().when(expandedDistTaskMock).configure((Action) any());
        DistributionArchive target = new DistributionArchive(archiveTaskMock, expandedDistTaskMock, "name1");
        //Act Statement(s)
        target.content(pMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(pMock, times(2)).get();
            verify(archiveTaskMock).configure((Action) any());
            verify(expandedDistTaskMock).configure((Action) any());
        });
    }
}

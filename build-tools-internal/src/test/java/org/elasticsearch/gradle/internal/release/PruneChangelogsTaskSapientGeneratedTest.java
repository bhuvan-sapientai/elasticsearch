package org.elasticsearch.gradle.internal.release;

import org.elasticsearch.gradle.internal.release.PruneChangelogsTask;

import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.gradle.api.Project;

import java.io.File;

import org.elasticsearch.gradle.VersionProperties;
import org.junit.jupiter.api.Timeout;
import org.gradle.process.ExecOperations;

import java.util.stream.Stream;
import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.params.provider.CsvSource;
import org.gradle.api.GradleException;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Collectors;

import org.gradle.api.file.FileCollection;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;

import org.gradle.api.model.ObjectFactory;

import java.util.TreeSet;

import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class PruneChangelogsTaskSapientGeneratedTest {

    private final PruneChangelogsTask.DeleteHelper deleteHelperMock = mock(PruneChangelogsTask.DeleteHelper.class);

    private final GitWrapper gitWrapperMock = mock(GitWrapper.class);

    private final Path pathMock = mock(Path.class);

    private final QualifiedVersion qualifiedVersionMock = mock(QualifiedVersion.class);

    @Test
    void executeTaskTest() {
        Project projectMock = mock(Project.class);
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        ExecOperations execOperationsMock = mock(ExecOperations.class);
        FileCollection fileCollectionMock = mock(FileCollection.class);
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            versionProperties.when(VersionProperties::getElasticsearch).thenReturn("8.0.0");
            PruneChangelogsTask task = new PruneChangelogsTask(projectMock, objectFactoryMock, execOperationsMock);
            task.setChangelogs(fileCollectionMock);
            when(fileCollectionMock.getFiles()).thenReturn(new HashSet<>());
            when(projectMock.getRootDir()).thenReturn(new File("/root"));
            task.executeTask();
            verify(fileCollectionMock).getFiles();
            verify(projectMock).getRootDir();
        }
    }

    @ParameterizedTest
    @CsvSource({"true, false, false", "false, true, false", "false, false, true", "false, false, false"})
    void findAndDeleteFilesTest(boolean allFilesEmpty, boolean earlierFilesEmpty, boolean filesToDeleteEmpty) {
        Set<File> allFiles = allFilesEmpty ? new HashSet<>() : Set.of(new File("test.file"));
        Set<String> earlierFiles = earlierFilesEmpty ? new HashSet<>() : Set.of("test.file");
        when(gitWrapperMock.listFiles(anyString(), anyString())).thenReturn(Stream.of("docs/changelog/test.file"));
        when(gitWrapperMock.listVersions(anyString())).thenReturn(Stream.of(qualifiedVersionMock));
        when(qualifiedVersionMock.isBefore(any())).thenReturn(true);
        if (!filesToDeleteEmpty) {
            when(deleteHelperMock.deleteFiles(any())).thenReturn(new HashSet<>());
        }
        PruneChangelogsTask.findAndDeleteFiles(gitWrapperMock, deleteHelperMock, qualifiedVersionMock, allFiles, pathMock);
        if (!allFilesEmpty && !earlierFilesEmpty && !filesToDeleteEmpty) {
            verify(deleteHelperMock).deleteFiles(any());
        }
    }

    @Test
    void findAndDeleteFilesThrowsExceptionTest() {
        Set<File> allFiles = Set.of(new File("test.file"));
        when(gitWrapperMock.listFiles(anyString(), anyString())).thenReturn(Stream.of("docs/changelog/test.file"));
        when(gitWrapperMock.listVersions(anyString())).thenReturn(Stream.of(qualifiedVersionMock));
        when(qualifiedVersionMock.isBefore(any())).thenReturn(true);
        when(deleteHelperMock.deleteFiles(any())).thenReturn(Set.of(new File("failed.file")));
        when(pathMock.relativize(any())).thenReturn(Path.of("relative/failed.file"));
        assertThrows(GradleException.class, () -> PruneChangelogsTask.findAndDeleteFiles(gitWrapperMock, deleteHelperMock, qualifiedVersionMock, allFiles, pathMock));
    }

    @Test
    void findPreviousVersionTest() {
        //QualifiedVersion version = QualifiedVersion.of("8.0.0");
        //when(gitWrapperMock.listVersions("v8.*")).thenReturn(Stream.of(QualifiedVersion.of("8.0.0-alpha1"), QualifiedVersion.of("8.0.0-beta1")));
        //when(gitWrapperMock.listVersions("v7.*")).thenReturn(Stream.of(QualifiedVersion.of("7.17.0"), QualifiedVersion.of("7.16.0")));
        //Stream<QualifiedVersion> result = PruneChangelogsTask.findPreviousVersion(gitWrapperMock, version);
        //List<QualifiedVersion> resultList = result.collect(Collectors.toList());
        //assertThat(resultList, hasSize(2));
        //assertThat(resultList, containsInAnyOrder(QualifiedVersion.of("7.17.0"), QualifiedVersion.of("7.16.0")));
    }
}
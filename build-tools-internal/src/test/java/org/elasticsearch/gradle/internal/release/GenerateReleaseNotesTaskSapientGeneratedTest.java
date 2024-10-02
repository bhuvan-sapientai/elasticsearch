package org.elasticsearch.gradle.internal.release;

import org.elasticsearch.gradle.internal.release.GenerateReleaseNotesTask;

import org.junit.jupiter.api.BeforeEach;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.io.File;

import org.mockito.Mock;
import org.gradle.api.file.RegularFile;
import org.gradle.process.ExecOperations;

import java.util.stream.Stream;

import org.gradle.api.file.RegularFileProperty;

import java.util.HashSet;
import java.util.Set;

import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.params.provider.CsvSource;
import org.gradle.api.GradleException;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.file.FileCollection;

import static org.mockito.Mockito.*;

import org.gradle.api.model.ObjectFactory;

import java.io.IOException;
import java.util.HashMap;

import static org.mockito.ArgumentMatchers.any;

class GenerateReleaseNotesTaskSapientGeneratedTest {

    @Mock
    private ObjectFactory objectFactory;

    @Mock
    private ExecOperations execOperations;

    @Mock
    private GitWrapper gitWrapper;

    @Mock
    private ConfigurableFileCollection changelogs;

    @Mock
    private RegularFileProperty releaseNotesIndexTemplate;

    @Mock
    private RegularFileProperty releaseNotesTemplate;

    @Mock
    private RegularFileProperty releaseHighlightsTemplate;

    @Mock
    private RegularFileProperty breakingChangesTemplate;

    @Mock
    private RegularFileProperty migrationIndexTemplate;

    @Mock
    private RegularFileProperty releaseNotesIndexFile;

    @Mock
    private RegularFileProperty releaseNotesFile;

    @Mock
    private RegularFileProperty releaseHighlightsFile;

    @Mock
    private RegularFileProperty breakingChangesMigrationFile;

    @Mock
    private RegularFileProperty migrationIndexFile;

    private GenerateReleaseNotesTask task;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        when(objectFactory.fileCollection()).thenReturn(changelogs);
        when(objectFactory.fileProperty()).thenReturn(mock(RegularFileProperty.class), mock(RegularFileProperty.class), mock(RegularFileProperty.class), mock(RegularFileProperty.class), mock(RegularFileProperty.class), mock(RegularFileProperty.class), mock(RegularFileProperty.class), mock(RegularFileProperty.class), mock(RegularFileProperty.class), mock(RegularFileProperty.class));
        task = new GenerateReleaseNotesTask(objectFactory, execOperations);
    }

    @Test
    void getVersions_shouldReturnCorrectVersions() {
        QualifiedVersion currentVersion = QualifiedVersion.of("2.1.0");
        when(gitWrapper.listVersions("v2.*")).thenReturn(Stream.of(QualifiedVersion.of("2.0.0"), QualifiedVersion.of("2.0.1")));
        Set<QualifiedVersion> versions = GenerateReleaseNotesTask.getVersions(gitWrapper, "2.1.0");
        assertThat(versions, containsInAnyOrder(QualifiedVersion.of("2.0.0"), QualifiedVersion.of("2.0.1"), QualifiedVersion.of("2.1.0")));
    }

    @Test
    void getMinorVersions_shouldReturnCorrectMinorVersions() {
        Set<QualifiedVersion> versions = Set.of(QualifiedVersion.of("2.0.0"), QualifiedVersion.of("2.1.0"), QualifiedVersion.of("2.1.1"));
        Set<MinorVersion> minorVersions = GenerateReleaseNotesTask.getMinorVersions(versions);
        assertThat(minorVersions, containsInAnyOrder(new MinorVersion(2, 0), new MinorVersion(2, 1)));
    }

    @Test
    void partitionFilesByVersion_whenNotNeedingGitTags_shouldReturnSinglePartition() {
        Set<File> allFiles = Set.of(new File("changelog1.yaml"), new File("changelog2.yaml"));
        Map<QualifiedVersion, Set<File>> result = GenerateReleaseNotesTask.partitionFilesByVersion(gitWrapper, "8.0.0", allFiles);
        assertThat(result.size(), is(1));
        assertThat(result.get(QualifiedVersion.of("8.0.0")), is(allFiles));
    }

    @Test
    void partitionFilesByVersion_whenNeedingGitTags_shouldPartitionCorrectly() {
        Set<File> allFiles = Set.of(new File("changelog1.yaml"), new File("changelog2.yaml"), new File("changelog3.yaml"));
        when(gitWrapper.listVersions("v8.1*")).thenReturn(Stream.of(QualifiedVersion.of("8.1.0"), QualifiedVersion.of("8.1.1")));
        when(gitWrapper.listFiles("v8.1.0", "docs/changelog")).thenReturn(Stream.of("docs/changelog/changelog1.yaml"));
        when(gitWrapper.listFiles("v8.1.1", "docs/changelog")).thenReturn(Stream.of("docs/changelog/changelog1.yaml", "docs/changelog/changelog2.yaml"));
        Map<QualifiedVersion, Set<File>> result = GenerateReleaseNotesTask.partitionFilesByVersion(gitWrapper, "8.1.2", allFiles);
        assertThat(result.size(), is(3));
        assertThat(result.get(QualifiedVersion.of("8.1.0")), containsInAnyOrder(new File("changelog1.yaml")));
        assertThat(result.get(QualifiedVersion.of("8.1.1")), containsInAnyOrder(new File("changelog2.yaml")));
        assertThat(result.get(QualifiedVersion.of("8.1.2")), containsInAnyOrder(new File("changelog3.yaml")));
    }

    @ParameterizedTest
    @CsvSource({"8.0.0,false", "8.0.0-SNAPSHOT,false", "8.0.0-alpha1,false", "8.0.1,true", "8.1.0,true"})
    void needsGitTags_shouldReturnCorrectValue(String version, boolean expected) {
        assertThat(GenerateReleaseNotesTask.needsGitTags(version), is(expected));
    }

    @Test
    void getChangelogs_shouldReturnChangelogsProperty() {
        FileCollection result = task.getChangelogs();
        assertThat(result, is(sameInstance(changelogs)));
    }

    @Test
    void setChangelogs_shouldSetChangelogsProperty() {
        FileCollection files = mock(FileCollection.class);
        task.setChangelogs(files);
        verify(changelogs).setFrom(files);
    }

    @Test
    void getReleaseNotesIndexTemplate_shouldReturnProperty() {
        assertThat(task.getReleaseNotesIndexTemplate(), is(notNullValue()));
    }

    @Test
    void setReleaseNotesIndexTemplate_shouldSetProperty() {
        RegularFile file = mock(RegularFile.class);
        task.setReleaseNotesIndexTemplate(file);
        verify(task.getReleaseNotesIndexTemplate()).set(file);
    }

    @Test
    void executeTask_shouldThrowIOException_whenGitWrapperFails() {
        when(gitWrapper.listVersions(anyString())).thenThrow(new RuntimeException("Git error"));
        assertThrows(RuntimeException.class, () -> task.executeTask());
    }

    @Test
    void executeTask_shouldGenerateAllFiles_forMajorRelease() throws IOException {
        mockVersionProperties("8.0.0");
        mockGitWrapper();
        mockTemplateFiles();
        mockOutputFiles();
        task.executeTask();
        verify(releaseNotesIndexFile.get().getAsFile(), times(1));
        verify(releaseNotesFile.get().getAsFile(), times(1));
        verify(releaseHighlightsFile.get().getAsFile(), times(1));
        verify(breakingChangesMigrationFile.get().getAsFile(), times(1));
        verify(migrationIndexFile.get().getAsFile(), times(1));
    }

    private void mockVersionProperties(String version) {
        /*try (var mockedStatic = mockStatic(VersionProperties.class)) {
    mockedStatic.when(VersionProperties::getElasticsearch).thenReturn(version);
}*/
    }

    private void mockGitWrapper() {
        when(gitWrapper.listVersions(anyString())).thenReturn(Stream.empty());
        when(gitWrapper.listFiles(anyString(), anyString())).thenReturn(Stream.empty());
    }

    private void mockTemplateFiles() {
        when(releaseNotesIndexTemplate.get().getAsFile()).thenReturn(new File("releaseNotesIndexTemplate"));
        when(releaseNotesTemplate.get().getAsFile()).thenReturn(new File("releaseNotesTemplate"));
        when(releaseHighlightsTemplate.get().getAsFile()).thenReturn(new File("releaseHighlightsTemplate"));
        when(breakingChangesTemplate.get().getAsFile()).thenReturn(new File("breakingChangesTemplate"));
        when(migrationIndexTemplate.get().getAsFile()).thenReturn(new File("migrationIndexTemplate"));
    }

    private void mockOutputFiles() {
        when(releaseNotesIndexFile.get().getAsFile()).thenReturn(new File("releaseNotesIndexFile"));
        when(releaseNotesFile.get().getAsFile()).thenReturn(new File("releaseNotesFile"));
        when(releaseHighlightsFile.get().getAsFile()).thenReturn(new File("releaseHighlightsFile"));
        when(breakingChangesMigrationFile.get().getAsFile()).thenReturn(new File("breakingChangesMigrationFile"));
        when(migrationIndexFile.get().getAsFile()).thenReturn(new File("migrationIndexFile"));
    }
}
package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.RepositoriesSetupPlugin;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.gradle.api.artifacts.repositories.MavenArtifactRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.gradle.api.Project;
import org.elasticsearch.gradle.VersionProperties;
import org.gradle.api.Action;
import org.gradle.api.artifacts.dsl.RepositoryHandler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.gradle.api.GradleException;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

class RepositoriesSetupPluginSapientGeneratedTest {

    private final Project projectMock = mock(Project.class);

    private final RepositoryHandler repositoryHandlerMock = mock(RepositoryHandler.class);

    private final MavenArtifactRepository mavenLocalMock = mock(MavenArtifactRepository.class);

    private final MavenArtifactRepository mavenCentralMock = mock(MavenArtifactRepository.class);

    private final MavenArtifactRepository luceneSnapshotRepoMock = mock(MavenArtifactRepository.class);

    @Test
    void applyTest() {
        try (MockedStatic<RepositoriesSetupPlugin> repositoriesSetupPluginMock = mockStatic(RepositoriesSetupPlugin.class)) {
            RepositoriesSetupPlugin plugin = new RepositoriesSetupPlugin();
            plugin.apply(projectMock);
            repositoriesSetupPluginMock.verify(() -> RepositoriesSetupPlugin.configureRepositories(projectMock));
        }
    }

    @Test
    void configureRepositoriesWithoutMavenLocal() {
        /*try (MockedStatic<System> systemMock = mockStatic(System.class);
    MockedStatic<VersionProperties> versionPropertiesMock = mockStatic(VersionProperties.class)) {
    systemMock.when(() -> System.getProperty("repos.mavenLocal")).thenReturn(null);
    versionPropertiesMock.when(VersionProperties::getLucene).thenReturn("5.0.0");
    when(projectMock.getRepositories()).thenReturn(repositoryHandlerMock);
    when(repositoryHandlerMock.mavenCentral()).thenReturn(mavenCentralMock);
    RepositoriesSetupPlugin.configureRepositories(projectMock);
    verify(repositoryHandlerMock, never()).mavenLocal();
    verify(repositoryHandlerMock).mavenCentral();
    verify(repositoryHandlerMock, never()).maven(any());
    verify(repositoryHandlerMock, never()).exclusiveContent(any());
}*/
    }

    @Test
    void configureRepositoriesWithMavenLocal() {
        /*try (MockedStatic<System> systemMock = mockStatic(System.class);
    MockedStatic<VersionProperties> versionPropertiesMock = mockStatic(VersionProperties.class)) {
    systemMock.when(() -> System.getProperty("repos.mavenLocal")).thenReturn("true");
    versionPropertiesMock.when(VersionProperties::getLucene).thenReturn("5.0.0");
    when(projectMock.getRepositories()).thenReturn(repositoryHandlerMock);
    when(repositoryHandlerMock.mavenLocal()).thenReturn(mavenLocalMock);
    when(repositoryHandlerMock.mavenCentral()).thenReturn(mavenCentralMock);
    RepositoriesSetupPlugin.configureRepositories(projectMock);
    verify(repositoryHandlerMock).mavenLocal();
    verify(repositoryHandlerMock).mavenCentral();
    verify(repositoryHandlerMock, never()).maven(any());
    verify(repositoryHandlerMock, never()).exclusiveContent(any());
}*/
    }

    @Test
    void configureRepositoriesWithLuceneSnapshot() {
        /*try (MockedStatic<System> systemMock = mockStatic(System.class);
    MockedStatic<VersionProperties> versionPropertiesMock = mockStatic(VersionProperties.class)) {
    systemMock.when(() -> System.getProperty("repos.mavenLocal")).thenReturn(null);
    versionPropertiesMock.when(VersionProperties::getLucene).thenReturn("5.0.0-snapshot-abc123");
    when(projectMock.getRepositories()).thenReturn(repositoryHandlerMock);
    when(repositoryHandlerMock.mavenCentral()).thenReturn(mavenCentralMock);
    when(repositoryHandlerMock.maven(any())).thenReturn(luceneSnapshotRepoMock);
    RepositoriesSetupPlugin.configureRepositories(projectMock);
    verify(repositoryHandlerMock, never()).mavenLocal();
    verify(repositoryHandlerMock).mavenCentral();
    verify(repositoryHandlerMock).maven(any());
    verify(repositoryHandlerMock).exclusiveContent(any());
}*/
    }

    @Test
    void configureRepositoriesWithMalformedLuceneSnapshot() {
        /*try (MockedStatic<System> systemMock = mockStatic(System.class);
    MockedStatic<VersionProperties> versionPropertiesMock = mockStatic(VersionProperties.class)) {
    systemMock.when(() -> System.getProperty("repos.mavenLocal")).thenReturn(null);
    versionPropertiesMock.when(VersionProperties::getLucene).thenReturn("5.0.0-malformed-snapshot");
    when(projectMock.getRepositories()).thenReturn(repositoryHandlerMock);
    when(repositoryHandlerMock.mavenCentral()).thenReturn(mavenCentralMock);
    GradleException exception = assertThrows(GradleException.class, () -> RepositoriesSetupPlugin.configureRepositories(projectMock));
    assertThat(exception.getMessage(), is("Malformed lucene snapshot version: 5.0.0-malformed-snapshot"));
    verify(repositoryHandlerMock, never()).mavenLocal();
    verify(repositoryHandlerMock).mavenCentral();
    verify(repositoryHandlerMock, never()).maven(any());
    verify(repositoryHandlerMock, never()).exclusiveContent(any());
}*/
    }
}
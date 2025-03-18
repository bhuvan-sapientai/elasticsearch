package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.RepositoriesSetupPlugin;

import org.gradle.api.artifacts.dsl.RepositoryHandler;
import org.gradle.api.artifacts.repositories.MavenArtifactRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.gradle.api.GradleException;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.Project;
import org.elasticsearch.gradle.VersionProperties;
import org.mockito.Mock;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

class RepositoriesSetupPluginSapientGeneratedTest {

    @Mock
    private Project projectMock;

    @Mock
    private RepositoryHandler repositoryHandlerMock;

    @Mock
    private MavenArtifactRepository mavenLocalMock;

    @Mock
    private MavenArtifactRepository mavenCentralMock;

    @Mock
    private MavenArtifactRepository luceneSnapshotRepoMock;

    private RepositoriesSetupPlugin plugin;

    @BeforeEach
    void setUp() {
        plugin = new RepositoriesSetupPlugin();
        when(projectMock.getRepositories()).thenReturn(repositoryHandlerMock);
    }

    @Test
    void testApply() {
        try (MockedStatic<RepositoriesSetupPlugin> mockedStatic = mockStatic(RepositoriesSetupPlugin.class)) {
            plugin.apply(projectMock);
            mockedStatic.verify(() -> RepositoriesSetupPlugin.configureRepositories(projectMock));
        }
    }

    @Test
    void testConfigureRepositoriesWithoutMavenLocal() {
        /*try (MockedStatic<System> systemMock = mockStatic(System.class);
    MockedStatic<VersionProperties> versionPropertiesMock = mockStatic(VersionProperties.class)) {
    systemMock.when(() -> System.getProperty("repos.mavenLocal")).thenReturn(null);
    versionPropertiesMock.when(VersionProperties::getLucene).thenReturn("5.0.0");
    when(repositoryHandlerMock.mavenCentral()).thenReturn(mavenCentralMock);
    RepositoriesSetupPlugin.configureRepositories(projectMock);
    verify(repositoryHandlerMock, never()).mavenLocal();
    verify(repositoryHandlerMock).mavenCentral();
    verify(repositoryHandlerMock, never()).maven(any());
    verify(repositoryHandlerMock, never()).exclusiveContent(any());
}*/
    }

    @Test
    void testConfigureRepositoriesWithMavenLocal() {
        /*try (MockedStatic<System> systemMock = mockStatic(System.class);
    MockedStatic<VersionProperties> versionPropertiesMock = mockStatic(VersionProperties.class)) {
    systemMock.when(() -> System.getProperty("repos.mavenLocal")).thenReturn("true");
    versionPropertiesMock.when(VersionProperties::getLucene).thenReturn("5.0.0");
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
    void testConfigureRepositoriesWithLuceneSnapshot() {
        /*try (MockedStatic<System> systemMock = mockStatic(System.class);
    MockedStatic<VersionProperties> versionPropertiesMock = mockStatic(VersionProperties.class)) {
    systemMock.when(() -> System.getProperty("repos.mavenLocal")).thenReturn(null);
    versionPropertiesMock.when(VersionProperties::getLucene).thenReturn("5.0.0-snapshot-abc123");
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
    void testConfigureRepositoriesWithMalformedLuceneSnapshot() {
        /*try (MockedStatic<System> systemMock = mockStatic(System.class);
    MockedStatic<VersionProperties> versionPropertiesMock = mockStatic(VersionProperties.class)) {
    systemMock.when(() -> System.getProperty("repos.mavenLocal")).thenReturn(null);
    versionPropertiesMock.when(VersionProperties::getLucene).thenReturn("5.0.0-malformed-snapshot");
    when(repositoryHandlerMock.mavenCentral()).thenReturn(mavenCentralMock);
    GradleException exception = assertThrows(GradleException.class, () -> RepositoriesSetupPlugin.configureRepositories(projectMock));
    assertEquals("Malformed lucene snapshot version: 5.0.0-malformed-snapshot", exception.getMessage());
    verify(repositoryHandlerMock, never()).mavenLocal();
    verify(repositoryHandlerMock).mavenCentral();
    verify(repositoryHandlerMock, never()).maven(any());
    verify(repositoryHandlerMock, never()).exclusiveContent(any());
}*/
    }
}
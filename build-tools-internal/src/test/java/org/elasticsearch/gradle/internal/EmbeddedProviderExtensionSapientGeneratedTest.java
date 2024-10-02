package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.EmbeddedProviderExtension;

import org.gradle.api.tasks.SourceSetOutput;
import org.gradle.api.tasks.Sync;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.file.DirectoryProperty;

import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.Configuration;

import static org.mockito.ArgumentMatchers.eq;

import org.gradle.api.Project;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.file.ProjectLayout;
import org.elasticsearch.gradle.util.GradleUtils;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.gradle.api.file.Directory;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.artifacts.Dependency;
import org.gradle.api.tasks.TaskProvider;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;

import org.gradle.api.Task;
import org.gradle.api.provider.Provider;

import static org.mockito.ArgumentMatchers.any;

class EmbeddedProviderExtensionSapientGeneratedTest {

    @Test
    void implTest() {
        // Arrange
        Project projectMock = mock(Project.class);
        TaskProvider<Task> metaTaskMock = mock(TaskProvider.class);
        Project implProjectMock = mock(Project.class);
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        Configuration configurationMock = mock(Configuration.class);
        DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        Dependency dependencyMock = mock(Dependency.class);
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        DirectoryProperty directoryPropertyMock = mock(DirectoryProperty.class);
        Provider<Directory> providerMock = mock(Provider.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider<GenerateProviderManifest> generateProviderManifestTaskProviderMock = mock(TaskProvider.class);
        TaskProvider<Sync> syncTaskProviderMock = mock(TaskProvider.class);
        SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        SourceSet sourceSetMock = mock(SourceSet.class);
        SourceSetOutput sourceSetOutputMock = mock(SourceSetOutput.class);
        // Mocking behavior
        when(projectMock.getConfigurations()).thenReturn(configurationContainerMock);
        when(configurationContainerMock.detachedConfiguration(any(Dependency.class))).thenReturn(configurationMock);
        when(projectMock.getDependencies()).thenReturn(dependencyHandlerMock);
        when(dependencyHandlerMock.create(any(Project.class))).thenReturn(dependencyMock);
        when(projectMock.getLayout()).thenReturn(projectLayoutMock);
        when(projectLayoutMock.getBuildDirectory()).thenReturn(directoryPropertyMock);
        when(directoryPropertyMock.dir(anyString())).thenReturn(providerMock);
        when(providerMock.map(any())).thenReturn(mock(Provider.class));
        when(projectMock.getTasks()).thenReturn(taskContainerMock);
        when(taskContainerMock.register(eq("generateAProviderManifest"), eq(GenerateProviderManifest.class))).thenReturn(generateProviderManifestTaskProviderMock);
        when(taskContainerMock.register(eq("generateAProviderImpl"), eq(Sync.class))).thenReturn(syncTaskProviderMock);
        when(implProjectMock.getName()).thenReturn("A");
        try (MockedStatic<GradleUtils> gradleUtilsMock = mockStatic(GradleUtils.class)) {
            gradleUtilsMock.when(() -> GradleUtils.getJavaSourceSets(projectMock)).thenReturn(sourceSetContainerMock);
            when(sourceSetContainerMock.findByName("main")).thenReturn(sourceSetMock);
            when(sourceSetMock.getOutput()).thenReturn(sourceSetOutputMock);
            // Act
            EmbeddedProviderExtension extension = new EmbeddedProviderExtension(projectMock, metaTaskMock);
            extension.impl("B", implProjectMock);
            // Assert
            verify(projectMock).getConfigurations();
            verify(configurationContainerMock).detachedConfiguration(any(Dependency.class));
            verify(configurationMock).attributes(any());
            verify(projectMock).getDependencies();
            verify(dependencyHandlerMock).create(implProjectMock);
            verify(projectMock).getLayout();
            verify(projectLayoutMock).getBuildDirectory();
            verify(directoryPropertyMock).dir("generated-resources");
            verify(providerMock, times(2)).map(any());
            verify(projectMock, times(2)).getTasks();
            verify(taskContainerMock).register(eq("generateAProviderManifest"), eq(GenerateProviderManifest.class));
            verify(generateProviderManifestTaskProviderMock).configure(any());
            verify(taskContainerMock).register(eq("generateAProviderImpl"), eq(Sync.class));
            verify(syncTaskProviderMock).configure(any());
            verify(metaTaskMock).configure(any());
            gradleUtilsMock.verify(() -> GradleUtils.getJavaSourceSets(projectMock));
            verify(sourceSetContainerMock).findByName("main");
            verify(sourceSetMock).getOutput();
            verify(sourceSetOutputMock).dir(syncTaskProviderMock);
        }
    }
}

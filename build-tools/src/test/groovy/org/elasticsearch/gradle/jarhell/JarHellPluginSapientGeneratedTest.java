package org.elasticsearch.gradle.jarhell;

import org.elasticsearch.gradle.jarhell.JarHellPlugin;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.plugins.PluginManager;
import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.Project;
import org.gradle.language.base.plugins.LifecycleBasePlugin;
import org.elasticsearch.gradle.VersionProperties;
import org.gradle.api.Plugin;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.Action;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.tasks.TaskContainer;
import org.elasticsearch.gradle.util.GradleUtils;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import static org.junit.jupiter.api.Assertions.*;
import org.gradle.api.artifacts.Dependency;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.file.FileCollection;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.*;
import org.gradle.api.Task;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

class JarHellPluginSapientGeneratedTest {

    @Disabled()
    @Test
    void applyTest() {
        // Arrange
        Project projectMock = mock(Project.class);
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        Configuration configurationMock = mock(Configuration.class);
        DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        Dependency dependencyMock = mock(Dependency.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider<JarHellTask> taskProviderMock = mock(TaskProvider.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        TaskContainer taskContainerMock2 = mock(TaskContainer.class);
        TaskProvider taskProviderMock2 = mock(TaskProvider.class);
        SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        SourceSet sourceSetMock = mock(SourceSet.class);
        FileCollection fileCollectionMock = mock(FileCollection.class);
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            when(projectMock.getConfigurations()).thenReturn(configurationContainerMock);
            when(configurationContainerMock.create("jarHell")).thenReturn(configurationMock);
            when(projectMock.getDependencies()).thenReturn(dependencyHandlerMock);
            when(dependencyHandlerMock.create("org.elasticsearch:elasticsearch-core:testVersion")).thenReturn(dependencyMock);
            when(projectMock.getTasks()).thenReturn(taskContainerMock).thenReturn(taskContainerMock2);
            when(taskContainerMock.register(eq("jarHell"), eq(JarHellTask.class))).thenReturn(taskProviderMock);
            when(projectMock.getPluginManager()).thenReturn(pluginManagerMock);
            when(taskContainerMock2.named("check")).thenReturn(taskProviderMock2);
            when(sourceSetContainerMock.findByName("test")).thenReturn(sourceSetMock);
            when(sourceSetMock.getRuntimeClasspath()).thenReturn(fileCollectionMock);
            versionProperties.when(VersionProperties::getElasticsearch).thenReturn("testVersion");
            gradleUtils.when(() -> GradleUtils.getJavaSourceSets(projectMock)).thenReturn(sourceSetContainerMock);
            // Act
            JarHellPlugin plugin = new JarHellPlugin();
            plugin.apply(projectMock);
            // Assert
            verify(configurationContainerMock).create("jarHell");
            verify(configurationMock).defaultDependencies(any());
            verify(dependencyHandlerMock).create("org.elasticsearch:elasticsearch-core:testVersion");
            verify(taskContainerMock).register(eq("jarHell"), eq(JarHellTask.class));
            verify(pluginManagerMock).withPlugin(eq("java"), any());
            verify(pluginManagerMock).withPlugin(eq("lifecycle-base"), any());
            verify(taskContainerMock2).named("check");
            verify(taskProviderMock2).configure(any());
            verify(sourceSetContainerMock).findByName("test");
            verify(sourceSetMock).getRuntimeClasspath();
            versionProperties.verify(VersionProperties::getElasticsearch);
            gradleUtils.verify(() -> GradleUtils.getJavaSourceSets(projectMock));
        }
    }

    @Disabled()
    @Test
    void applyTestWithoutJavaPlugin() {
        // Arrange
        Project projectMock = mock(Project.class);
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        Configuration configurationMock = mock(Configuration.class);
        DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        Dependency dependencyMock = mock(Dependency.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider<JarHellTask> taskProviderMock = mock(TaskProvider.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            when(projectMock.getConfigurations()).thenReturn(configurationContainerMock);
            when(configurationContainerMock.create("jarHell")).thenReturn(configurationMock);
            when(projectMock.getDependencies()).thenReturn(dependencyHandlerMock);
            when(dependencyHandlerMock.create("org.elasticsearch:elasticsearch-core:testVersion")).thenReturn(dependencyMock);
            when(projectMock.getTasks()).thenReturn(taskContainerMock);
            when(taskContainerMock.register(eq("jarHell"), eq(JarHellTask.class))).thenReturn(taskProviderMock);
            when(projectMock.getPluginManager()).thenReturn(pluginManagerMock);
            versionProperties.when(VersionProperties::getElasticsearch).thenReturn("testVersion");
            // Act
            JarHellPlugin plugin = new JarHellPlugin();
            plugin.apply(projectMock);
            // Assert
            verify(configurationContainerMock).create("jarHell");
            verify(configurationMock).defaultDependencies(any());
            verify(dependencyHandlerMock).create("org.elasticsearch:elasticsearch-core:testVersion");
            verify(taskContainerMock).register(eq("jarHell"), eq(JarHellTask.class));
            verify(pluginManagerMock).withPlugin(eq("java"), any());
            verify(pluginManagerMock).withPlugin(eq("lifecycle-base"), any());
            versionProperties.verify(VersionProperties::getElasticsearch);
        }
    }
}

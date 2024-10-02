package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.InternalTestArtifactExtension;

import org.gradle.api.tasks.SourceSet;
import org.gradle.api.plugins.JavaPluginExtension;

import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.Configuration;

import static org.mockito.ArgumentMatchers.eq;

import org.gradle.api.Project;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.plugins.BasePluginExtension;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.api.artifacts.Dependency;
import org.gradle.api.tasks.TaskProvider;

import static org.mockito.Mockito.*;

import org.gradle.jvm.tasks.Jar;
import org.gradle.api.provider.Provider;

import static org.mockito.ArgumentMatchers.any;

class InternalTestArtifactExtensionSapientGeneratedTest {

    @Test
    void registerTestArtifactFromSourceSet() {
        // Arrange
        //Project projectMock = mock(Project.class);
        //ProviderFactory providerFactoryMock = mock(ProviderFactory.class);
        //SourceSet sourceSetMock = mock(SourceSet.class);
        //when(sourceSetMock.getName()).thenReturn("testSourceSet");
        //when(sourceSetMock.getApiElementsConfigurationName()).thenReturn("testApiElements");
        //when(sourceSetMock.getApiConfigurationName()).thenReturn("testApi");
        //when(sourceSetMock.getRuntimeElementsConfigurationName()).thenReturn("testRuntimeElements");
        //JavaPluginExtension javaPluginExtensionMock = mock(JavaPluginExtension.class);
        //when(projectMock.getExtensions().getByType(JavaPluginExtension.class)).thenReturn(javaPluginExtensionMock);
        //DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        //when(projectMock.getDependencies()).thenReturn(dependencyHandlerMock);
        //Configuration apiElementsConfigMock = mock(Configuration.class);
        //Configuration apiConfigTestArtifactsMock = mock(Configuration.class);
        //Configuration runtimeElementsConfigMock = mock(Configuration.class);
        //Configuration runtimeElementsTestArtifactsMock = mock(Configuration.class);
        //when(projectMock.getConfigurations().getByName("testApiElements")).thenReturn(apiElementsConfigMock);
        //when(projectMock.getConfigurations().create("testApiTestArtifacts")).thenReturn(apiConfigTestArtifactsMock);
        //when(projectMock.getConfigurations().getByName("testRuntimeElements")).thenReturn(runtimeElementsConfigMock);
        //when(projectMock.getConfigurations().create("testRuntimeElementsTestArtifacts")).thenReturn(runtimeElementsTestArtifactsMock);
        //BasePluginExtension basePluginExtensionMock = mock(BasePluginExtension.class);
        //when(projectMock.getExtensions().getByType(BasePluginExtension.class)).thenReturn(basePluginExtensionMock);
        //when(basePluginExtensionMock.getArchivesName()).thenReturn(mock(Provider.class));
        //TaskContainer taskContainerMock = mock(TaskContainer.class);
        //when(projectMock.getTasks()).thenReturn(taskContainerMock);
        //TaskProvider<Jar> jarTaskProviderMock = mock(TaskProvider.class);
        //when(taskContainerMock.named(eq("testSourceSetJar"), eq(Jar.class))).thenReturn(jarTaskProviderMock);
        //InternalTestArtifactExtension extension = new InternalTestArtifactExtension(projectMock, providerFactoryMock);
        // Act
        //extension.registerTestArtifactFromSourceSet(sourceSetMock);
        // Assert
        //verify(javaPluginExtensionMock).registerFeature(eq("testSourceSetArtifacts"), any());
        //verify(projectMock.getPlugins()).withType(eq(JavaPlugin.class), any());
        //verify(apiElementsConfigMock).extendsFrom(apiConfigTestArtifactsMock);
        //verify(runtimeElementsConfigMock).extendsFrom(runtimeElementsTestArtifactsMock);
        //verify(dependencyHandlerMock, times(2)).create(projectMock);
        //verify(dependencyHandlerMock).add(eq("testApiTestArtifacts"), any(Dependency.class));
        //verify(dependencyHandlerMock).add(eq("testRuntimeElementsTestArtifacts"), any(Dependency.class));
        //verify(jarTaskProviderMock).configure(any());
    }
}
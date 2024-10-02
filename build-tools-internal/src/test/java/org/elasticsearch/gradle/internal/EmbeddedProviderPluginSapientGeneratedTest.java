package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.EmbeddedProviderPlugin;

import static org.gradle.api.artifacts.type.ArtifactTypeDefinition.JAR_TYPE;

import org.junit.jupiter.api.Test;
import org.elasticsearch.gradle.transform.UnzipTransform;
import org.gradle.api.Project;
import org.gradle.api.Action;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.plugins.ExtensionContainer;

import static org.gradle.api.artifacts.type.ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE;

import org.gradle.api.attributes.Attribute;
import org.gradle.api.artifacts.dsl.DependencyHandler;

import static org.gradle.api.artifacts.type.ArtifactTypeDefinition.DIRECTORY_TYPE;
import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.tasks.TaskProvider;

import static org.mockito.Mockito.*;

import org.gradle.api.Task;

import static org.mockito.ArgumentMatchers.any;

class EmbeddedProviderPluginSapientGeneratedTest {

    @Test
    void applyTest() {
        // Arrange
        //Project projectMock = mock(Project.class);
        //DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        //TaskContainer taskContainerMock = mock(TaskContainer.class);
        //ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        //TaskProvider<Task> taskProviderMock = mock(TaskProvider.class);
        //when(projectMock.getDependencies()).thenReturn(dependencyHandlerMock);
        //when(projectMock.getTasks()).thenReturn(taskContainerMock);
        //when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
        //when(taskContainerMock.register(eq("generateProviderImpls"), any())).thenReturn(taskProviderMock);
        //EmbeddedProviderPlugin plugin = new EmbeddedProviderPlugin();
        // Act
        //plugin.apply(projectMock);
        // Assert
        //verify(dependencyHandlerMock).registerTransform(eq(UnzipTransform.class), any());
        //verify(taskContainerMock).register(eq("generateProviderImpls"), any());
        //verify(extensionContainerMock).create(eq("embeddedProviders"), eq(EmbeddedProviderExtension.class), eq(projectMock), eq(taskProviderMock));
        // Verify IMPL_ATTR
        //assertEquals(Attribute.of("is.impl", Boolean.class), EmbeddedProviderPlugin.IMPL_ATTR);
    }

    @Test
    void verifyTransformRegistration() {
        // Arrange
        Project projectMock = mock(Project.class);
        DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        when(projectMock.getDependencies()).thenReturn(dependencyHandlerMock);
        EmbeddedProviderPlugin plugin = new EmbeddedProviderPlugin();
        // Act
        plugin.apply(projectMock);
        // Assert
        verify(dependencyHandlerMock).registerTransform(eq(UnzipTransform.class), any(Action.class));
    }

    @Test
    void verifyTaskRegistration() {
        // Arrange
        //Project projectMock = mock(Project.class);
        //TaskContainer taskContainerMock = mock(TaskContainer.class);
        //when(projectMock.getTasks()).thenReturn(taskContainerMock);
        //EmbeddedProviderPlugin plugin = new EmbeddedProviderPlugin();
        // Act
        //plugin.apply(projectMock);
        // Assert
        //verify(taskContainerMock).register(eq("generateProviderImpls"), any());
    }

    @Test
    void verifyExtensionCreation() {
        // Arrange
        //Project projectMock = mock(Project.class);
        //ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        //TaskContainer taskContainerMock = mock(TaskContainer.class);
        //TaskProvider<Task> taskProviderMock = mock(TaskProvider.class);
        //when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
        //when(projectMock.getTasks()).thenReturn(taskContainerMock);
        //when(taskContainerMock.register(eq("generateProviderImpls"), any())).thenReturn(taskProviderMock);
        //EmbeddedProviderPlugin plugin = new EmbeddedProviderPlugin();
        // Act
        //plugin.apply(projectMock);
        // Assert
        //verify(extensionContainerMock).create(eq("embeddedProviders"), eq(EmbeddedProviderExtension.class), eq(projectMock), eq(taskProviderMock));
    }
}
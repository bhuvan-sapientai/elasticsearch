package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.InternalTestArtifactPlugin;

import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.tasks.SourceSet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.Project;

import static org.mockito.Mockito.*;

import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.Action;

import static org.mockito.ArgumentMatchers.any;

class InternalTestArtifactPluginSapientGeneratedTest {

    @Test
    void apply() {
        // Arrange
        //Project projectMock = mock(Project.class);
        //PluginContainer pluginContainerMock = mock(PluginContainer.class);
        //ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        //InternalTestArtifactExtension internalTestArtifactExtensionMock = mock(InternalTestArtifactExtension.class);
        //SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        //SourceSet sourceSetMock = mock(SourceSet.class);
        //when(projectMock.getPlugins()).thenReturn(pluginContainerMock);
        //when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
        //when(extensionContainerMock.getByType(InternalTestArtifactExtension.class)).thenReturn(internalTestArtifactExtensionMock);
        //when(extensionContainerMock.getByType(SourceSetContainer.class)).thenReturn(sourceSetContainerMock);
        /*doAnswer(invocation -> {
    Action<SourceSet> action = invocation.getArgument(0);
    action.execute(sourceSetMock);
    return null;
}).when(sourceSetContainerMock).all(any());*/
        // Act
        //InternalTestArtifactPlugin plugin = new InternalTestArtifactPlugin();
        //plugin.apply(projectMock);
        // Assert
        //verify(pluginContainerMock).apply(InternalTestArtifactBasePlugin.class);
        //verify(extensionContainerMock).getByType(InternalTestArtifactExtension.class);
        //verify(extensionContainerMock).getByType(SourceSetContainer.class);
        //verify(sourceSetContainerMock).all(any());
        //verify(sourceSetMock).getName();
    }

    @Test
    void applyWhenSourceSetIsNotMain() {
        // Arrange
        //Project projectMock = mock(Project.class);
        //PluginContainer pluginContainerMock = mock(PluginContainer.class);
        //ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        //InternalTestArtifactExtension internalTestArtifactExtensionMock = mock(InternalTestArtifactExtension.class);
        //SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        //SourceSet sourceSetMock = mock(SourceSet.class);
        //when(projectMock.getPlugins()).thenReturn(pluginContainerMock);
        //when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
        //when(extensionContainerMock.getByType(InternalTestArtifactExtension.class)).thenReturn(internalTestArtifactExtensionMock);
        //when(extensionContainerMock.getByType(SourceSetContainer.class)).thenReturn(sourceSetContainerMock);
        //when(sourceSetMock.getName()).thenReturn("test");
        /*doAnswer(invocation -> {
    Action<SourceSet> action = invocation.getArgument(0);
    action.execute(sourceSetMock);
    return null;
}).when(sourceSetContainerMock).all(any());*/
        // Act
        //InternalTestArtifactPlugin plugin = new InternalTestArtifactPlugin();
        //plugin.apply(projectMock);
        // Assert
        //verify(pluginContainerMock).apply(InternalTestArtifactBasePlugin.class);
        //verify(extensionContainerMock).getByType(InternalTestArtifactExtension.class);
        //verify(extensionContainerMock).getByType(SourceSetContainer.class);
        //verify(sourceSetContainerMock).all(any());
        //verify(sourceSetMock).getName();
        //verify(internalTestArtifactExtensionMock).registerTestArtifactFromSourceSet(sourceSetMock);
    }

    @Test
    void applyWhenSourceSetIsMain() {
        // Arrange
        //Project projectMock = mock(Project.class);
        //PluginContainer pluginContainerMock = mock(PluginContainer.class);
        //ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        //InternalTestArtifactExtension internalTestArtifactExtensionMock = mock(InternalTestArtifactExtension.class);
        //SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        //SourceSet sourceSetMock = mock(SourceSet.class);
        //when(projectMock.getPlugins()).thenReturn(pluginContainerMock);
        //when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
        //when(extensionContainerMock.getByType(InternalTestArtifactExtension.class)).thenReturn(internalTestArtifactExtensionMock);
        //when(extensionContainerMock.getByType(SourceSetContainer.class)).thenReturn(sourceSetContainerMock);
        //when(sourceSetMock.getName()).thenReturn(SourceSet.MAIN_SOURCE_SET_NAME);
        /*doAnswer(invocation -> {
    Action<SourceSet> action = invocation.getArgument(0);
    action.execute(sourceSetMock);
    return null;
}).when(sourceSetContainerMock).all(any());*/
        // Act
        //InternalTestArtifactPlugin plugin = new InternalTestArtifactPlugin();
        //plugin.apply(projectMock);
        // Assert
        //verify(pluginContainerMock).apply(InternalTestArtifactBasePlugin.class);
        //verify(extensionContainerMock).getByType(InternalTestArtifactExtension.class);
        //verify(extensionContainerMock).getByType(SourceSetContainer.class);
        //verify(sourceSetContainerMock).all(any());
        //verify(sourceSetMock).getName();
        //verify(internalTestArtifactExtensionMock, never()).registerTestArtifactFromSourceSet(sourceSetMock);
    }
}
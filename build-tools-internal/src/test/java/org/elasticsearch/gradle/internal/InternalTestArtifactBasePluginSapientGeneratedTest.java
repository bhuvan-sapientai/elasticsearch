package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.InternalTestArtifactBasePlugin;

import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.provider.ProviderFactory;
import org.elasticsearch.gradle.internal.InternalTestArtifactBasePlugin;

import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.Project;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

class InternalTestArtifactBasePluginSapientGeneratedTest {

    @Test
    void applyTest() {
        // Arrange
        Project projectMock = mock(Project.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        ProviderFactory providerFactoryMock = mock(ProviderFactory.class);
        when(projectMock.getPlugins()).thenReturn(pluginContainerMock);
        when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
        InternalTestArtifactBasePlugin plugin = new InternalTestArtifactBasePlugin(providerFactoryMock);
        // Act
        plugin.apply(projectMock);
        // Assert
        verify(pluginContainerMock).apply(ElasticsearchJavaBasePlugin.class);
        verify(extensionContainerMock).create(eq("testArtifacts"), eq(InternalTestArtifactExtension.class), eq(projectMock), eq(providerFactoryMock));
    }

    @Test
    void constructorTest() {
        // Arrange
        ProviderFactory providerFactoryMock = mock(ProviderFactory.class);
        // Act
        InternalTestArtifactBasePlugin plugin = new InternalTestArtifactBasePlugin(providerFactoryMock);
        // Assert
        assertNotNull(plugin);
    }

    @Test
    void applyWithNullProjectTest() {
        // Arrange
        ProviderFactory providerFactoryMock = mock(ProviderFactory.class);
        InternalTestArtifactBasePlugin plugin = new InternalTestArtifactBasePlugin(providerFactoryMock);
        // Act & Assert
        assertThrows(NullPointerException.class, () -> plugin.apply(null));
    }

    @Test
    void constructorWithNullProviderFactoryTest() {
        // Act & Assert
        assertThrows(NullPointerException.class, () -> new InternalTestArtifactBasePlugin(null));
    }

    @Test
    void applyMultipleTimesTest() {
        // Arrange
        Project projectMock = mock(Project.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        ProviderFactory providerFactoryMock = mock(ProviderFactory.class);
        when(projectMock.getPlugins()).thenReturn(pluginContainerMock);
        when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
        InternalTestArtifactBasePlugin plugin = new InternalTestArtifactBasePlugin(providerFactoryMock);
        // Act
        plugin.apply(projectMock);
        plugin.apply(projectMock);
        // Assert
        verify(pluginContainerMock, times(2)).apply(ElasticsearchJavaBasePlugin.class);
        verify(extensionContainerMock, times(2)).create(eq("testArtifacts"), eq(InternalTestArtifactExtension.class), eq(projectMock), eq(providerFactoryMock));
    }
}

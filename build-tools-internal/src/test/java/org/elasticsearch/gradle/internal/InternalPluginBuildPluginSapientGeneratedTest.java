package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.InternalPluginBuildPlugin;

import org.junit.jupiter.api.Timeout;
import org.gradle.api.plugins.PluginManager;
import org.elasticsearch.gradle.internal.InternalPluginBuildPlugin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.Project;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

@Timeout(5)
class InternalPluginBuildPluginSapientGeneratedTest {

    @Test
    void applyTest() {
        // Arrange
        Project projectMock = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        when(projectMock.getPluginManager()).thenReturn(pluginManagerMock);
        InternalPluginBuildPlugin target = new InternalPluginBuildPlugin();
        // Act
        target.apply(projectMock);
        // Assert
        assertAll("Plugin application", () -> verify(projectMock, times(1)).getPluginManager(), () -> verify(pluginManagerMock).apply(BuildPlugin.class), () -> verify(pluginManagerMock).apply(BaseInternalPluginBuildPlugin.class), () -> verifyNoMoreInteractions(pluginManagerMock));
    }

    @Test
    void applyTestWithNullProject() {
        // Arrange
        InternalPluginBuildPlugin target = new InternalPluginBuildPlugin();
        // Act & Assert
        assertThrows(NullPointerException.class, () -> target.apply(null));
    }
}

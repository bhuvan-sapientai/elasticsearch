package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.InternalPluginBuildPlugin;

import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.gradle.api.plugins.PluginManager;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class InternalPluginBuildPluginSapientGeneratedTest {

    @Test
    void applyTest() {
        // Arrange
        Project projectMock = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        doReturn(pluginManagerMock).when(projectMock).getPluginManager();
        InternalPluginBuildPlugin target = new InternalPluginBuildPlugin();
        // Act
        target.apply(projectMock);
        // Assert
        assertAll("result", () -> {
            verify(projectMock, times(1)).getPluginManager();
            verify(pluginManagerMock).apply(BuildPlugin.class);
            verify(pluginManagerMock).apply(BaseInternalPluginBuildPlugin.class);
        });
    }
}

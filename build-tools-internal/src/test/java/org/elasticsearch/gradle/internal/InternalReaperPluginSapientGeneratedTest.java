package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.InternalReaperPlugin;

import org.junit.jupiter.api.Timeout;
import org.gradle.api.file.ProjectLayout;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;

import org.elasticsearch.gradle.ReaperPlugin;

import static org.mockito.ArgumentMatchers.any;

@Timeout(5)
class InternalReaperPluginSapientGeneratedTest {

    @Test
    void applyTest() {
        // Arrange
        Project projectMock = mock(Project.class);
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        try (MockedStatic<ReaperPlugin> reaperPlugin = mockStatic(ReaperPlugin.class)) {
            InternalReaperPlugin target = new InternalReaperPlugin(projectLayoutMock);
            // Act
            target.apply(projectMock);
            // Assert
            reaperPlugin.verify(() -> ReaperPlugin.registerReaperService(projectMock, projectLayoutMock, true), times(1));
        }
    }

    @Test
    void constructorTest() {
        // Arrange
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        // Act
        InternalReaperPlugin plugin = new InternalReaperPlugin(projectLayoutMock);
        // Assert
        verifyNoMoreInteractions(projectLayoutMock);
    }

    @Test
    void applyWithNullProjectTest() {
        // Arrange
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        InternalReaperPlugin target = new InternalReaperPlugin(projectLayoutMock);
        // Act & Assert
        org.junit.jupiter.api.Assertions.assertThrows(NullPointerException.class, () -> target.apply(null));
    }

    @Test
    void constructorWithNullProjectLayoutTest() {
        // Act & Assert
        org.junit.jupiter.api.Assertions.assertThrows(NullPointerException.class, () -> new InternalReaperPlugin(null));
    }
}

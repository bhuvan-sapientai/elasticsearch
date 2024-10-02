package org.elasticsearch.gradle.internal.distribution;

import org.elasticsearch.gradle.internal.distribution.ElasticsearchDistributionPlugin;

import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.gradle.api.plugins.ExtensionContainer;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.eq;

import org.gradle.api.Project;
import org.gradle.api.Plugin;

import static org.mockito.Mockito.verify;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class ElasticsearchDistributionPluginSapientGeneratedTest {

    @Test
    void applyTest() {
        // Arrange
        Project projectMock = mock(Project.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        ElasticsearchDistributionPlugin target = new ElasticsearchDistributionPlugin();
        // Act
        target.apply(projectMock);
        // Assert
        assertAll("result", () -> {
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).create(eq("distro"), eq(ElasticsearchDistributionExtension.class), eq(projectMock));
        });
    }

    @Test
    void applyTestWithNullProject() {
        // Arrange
        ElasticsearchDistributionPlugin target = new ElasticsearchDistributionPlugin();
        // Act & Assert
        org.junit.jupiter.api.Assertions.assertThrows(NullPointerException.class, () -> {
            target.apply(null);
        });
    }

    @Test
    void applyTestWithMultipleCalls() {
        // Arrange
        Project projectMock = mock(Project.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        ElasticsearchDistributionPlugin target = new ElasticsearchDistributionPlugin();
        // Act
        target.apply(projectMock);
        target.apply(projectMock);
        // Assert
        assertAll("result", () -> {
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).create(eq("distro"), eq(ElasticsearchDistributionExtension.class), eq(projectMock));
        });
    }

    @Test
    void applyTestWithDifferentProjects() {
        // Arrange
        Project projectMock1 = mock(Project.class);
        Project projectMock2 = mock(Project.class);
        ExtensionContainer extensionContainerMock1 = mock(ExtensionContainer.class);
        ExtensionContainer extensionContainerMock2 = mock(ExtensionContainer.class);
        doReturn(extensionContainerMock1).when(projectMock1).getExtensions();
        doReturn(extensionContainerMock2).when(projectMock2).getExtensions();
        ElasticsearchDistributionPlugin target = new ElasticsearchDistributionPlugin();
        // Act
        target.apply(projectMock1);
        target.apply(projectMock2);
        // Assert
        assertAll("result", () -> {
            verify(projectMock1).getExtensions();
            verify(extensionContainerMock1).create(eq("distro"), eq(ElasticsearchDistributionExtension.class), eq(projectMock1));
            verify(projectMock2).getExtensions();
            verify(extensionContainerMock2).create(eq("distro"), eq(ElasticsearchDistributionExtension.class), eq(projectMock2));
        });
    }
}

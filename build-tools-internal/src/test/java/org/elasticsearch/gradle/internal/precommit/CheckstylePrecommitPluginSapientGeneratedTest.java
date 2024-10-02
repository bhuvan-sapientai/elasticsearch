package org.elasticsearch.gradle.internal.precommit;

import org.elasticsearch.gradle.internal.precommit.CheckstylePrecommitPlugin;

import org.gradle.api.plugins.quality.CheckstyleExtension;
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.ArgumentMatchers.any;

import org.gradle.api.plugins.quality.Checkstyle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.eq;

import org.gradle.api.Project;

import java.io.File;

import org.mockito.Mock;

import java.net.URL;

import org.gradle.api.Action;
import org.gradle.api.tasks.SourceSetContainer;

import java.net.JarURLConnection;

import static org.mockito.ArgumentMatchers.anyString;

import org.gradle.api.artifacts.VersionCatalogsExtension;
import org.gradle.api.plugins.JavaBasePlugin;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.gradle.api.tasks.TaskProvider;

import static org.mockito.Mockito.*;

import java.io.IOException;

import org.gradle.api.Task;
import org.gradle.api.provider.Provider;

import static org.mockito.ArgumentMatchers.any;

class CheckstylePrecommitPluginSapientGeneratedTest {

    @Mock
    private Project project;

    @Mock
    private TaskProvider<Task> taskProvider;

    @Mock
    private CheckstyleExtension checkstyleExtension;

    @Mock
    private DependencyHandler dependencyHandler;

    @Mock
    private VersionCatalogsExtension versionCatalogsExtension;

    private CheckstylePrecommitPlugin plugin;

    @BeforeEach
    void setUp() {
        plugin = new CheckstylePrecommitPlugin();
    }

    @Test
    void createTask_shouldConfigureCheckstyleTask() throws IOException {
        // Arrange
        File buildDir = new File("build");
        when(project.getBuildDir()).thenReturn(buildDir);
        when(project.getTasks()).thenReturn(mock(org.gradle.api.tasks.TaskContainer.class));
        when(project.getPluginManager()).thenReturn(mock(org.gradle.api.plugins.PluginManager.class));
        when(project.getExtensions()).thenReturn(mock(org.gradle.api.plugins.ExtensionContainer.class));
        when(project.getDependencies()).thenReturn(dependencyHandler);
        when(project.getPlugins()).thenReturn(mock(org.gradle.api.plugins.PluginContainer.class));
        when(project.getObjects()).thenReturn(mock(org.gradle.api.model.ObjectFactory.class));
        when(project.getTasks().register(anyString(), any(Action.class))).thenReturn(taskProvider);
        when(project.getExtensions().getByType(CheckstyleExtension.class)).thenReturn(checkstyleExtension);
        when(project.getExtensions().getByType(VersionCatalogsExtension.class)).thenReturn(versionCatalogsExtension);
        when(project.provider(any())).thenReturn(mock(Provider.class));
        // Act
        TaskProvider<? extends Task> result = plugin.createTask(project);
        // Assert
        assertEquals(taskProvider, result);
        verify(project.getPluginManager()).apply("checkstyle");
        verify(checkstyleExtension).getConfigDirectory();
        verify(dependencyHandler, times(2)).addProvider(eq("checkstyle"), any(Provider.class));
        verify(project.getTasks(), atLeastOnce()).withType(Checkstyle.class);
        verify(project.getPlugins()).withType(eq(JavaBasePlugin.class), any(Action.class));
    }

    @Test
    void createTask_shouldHandleJarProtocol() throws IOException {
        // Arrange
        URL mockUrl = new URL("jar:file:/path/to/jar!/resource");
        JarURLConnection mockConnection = mock(JarURLConnection.class);
        when(mockConnection.getJarFileURL()).thenReturn(new URL("file:/path/to/jar"));
        // Use reflection to set the static field
        java.lang.reflect.Field field = CheckstylePrecommitPlugin.class.getDeclaredField("checkstyleConfUrl");
        field.setAccessible(true);
        field.set(null, mockUrl);
        // Mock other necessary dependencies
        when(project.getBuildDir()).thenReturn(new File("build"));
        when(project.getTasks()).thenReturn(mock(org.gradle.api.tasks.TaskContainer.class));
        when(project.getPluginManager()).thenReturn(mock(org.gradle.api.plugins.PluginManager.class));
        when(project.getExtensions()).thenReturn(mock(org.gradle.api.plugins.ExtensionContainer.class));
        when(project.getDependencies()).thenReturn(dependencyHandler);
        when(project.getPlugins()).thenReturn(mock(org.gradle.api.plugins.PluginContainer.class));
        when(project.getObjects()).thenReturn(mock(org.gradle.api.model.ObjectFactory.class));
        when(project.getTasks().register(anyString(), any(Action.class))).thenReturn(taskProvider);
        when(project.getExtensions().getByType(CheckstyleExtension.class)).thenReturn(checkstyleExtension);
        when(project.getExtensions().getByType(VersionCatalogsExtension.class)).thenReturn(versionCatalogsExtension);
        when(project.provider(any())).thenReturn(mock(Provider.class));
        // Act
        TaskProvider<? extends Task> result = plugin.createTask(project);
        // Assert
        assertEquals(taskProvider, result);
        verify(project.getPluginManager()).apply("checkstyle");
        verify(checkstyleExtension).getConfigDirectory();
        verify(dependencyHandler, times(2)).addProvider(eq("checkstyle"), any(Provider.class));
        verify(project.getTasks(), atLeastOnce()).withType(Checkstyle.class);
        verify(project.getPlugins()).withType(eq(JavaBasePlugin.class), any(Action.class));
    }

    @Test
    void createTask_shouldHandleFileProtocol() throws IOException {
        // Arrange
        URL mockUrl = new File("/path/to/file").toURI().toURL();
        // Use reflection to set the static field
        java.lang.reflect.Field field = CheckstylePrecommitPlugin.class.getDeclaredField("checkstyleConfUrl");
        field.setAccessible(true);
        field.set(null, mockUrl);
        // Mock other necessary dependencies
        when(project.getBuildDir()).thenReturn(new File("build"));
        when(project.getTasks()).thenReturn(mock(org.gradle.api.tasks.TaskContainer.class));
        when(project.getPluginManager()).thenReturn(mock(org.gradle.api.plugins.PluginManager.class));
        when(project.getExtensions()).thenReturn(mock(org.gradle.api.plugins.ExtensionContainer.class));
        when(project.getDependencies()).thenReturn(dependencyHandler);
        when(project.getPlugins()).thenReturn(mock(org.gradle.api.plugins.PluginContainer.class));
        when(project.getObjects()).thenReturn(mock(org.gradle.api.model.ObjectFactory.class));
        when(project.getTasks().register(anyString(), any(Action.class))).thenReturn(taskProvider);
        when(project.getExtensions().getByType(CheckstyleExtension.class)).thenReturn(checkstyleExtension);
        when(project.getExtensions().getByType(VersionCatalogsExtension.class)).thenReturn(versionCatalogsExtension);
        when(project.provider(any())).thenReturn(mock(Provider.class));
        // Act
        TaskProvider<? extends Task> result = plugin.createTask(project);
        // Assert
        assertEquals(taskProvider, result);
        verify(project.getPluginManager()).apply("checkstyle");
        verify(checkstyleExtension).getConfigDirectory();
        verify(dependencyHandler, times(2)).addProvider(eq("checkstyle"), any(Provider.class));
        verify(project.getTasks(), atLeastOnce()).withType(Checkstyle.class);
        verify(project.getPlugins()).withType(eq(JavaBasePlugin.class), any(Action.class));
    }
}

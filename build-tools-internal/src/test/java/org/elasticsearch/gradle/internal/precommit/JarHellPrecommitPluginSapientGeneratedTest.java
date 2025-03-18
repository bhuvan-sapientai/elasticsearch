package org.elasticsearch.gradle.internal.precommit;

import org.elasticsearch.gradle.internal.precommit.JarHellPrecommitPlugin;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.elasticsearch.gradle.jarhell.JarHellTask;
import org.gradle.api.plugins.PluginManager;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.gradle.api.Project;
import org.gradle.api.tasks.TaskCollection;
import org.gradle.api.tasks.TaskContainer;
import org.junit.jupiter.api.Timeout;
import org.gradle.api.UnknownTaskException;

import static org.hamcrest.MatcherAssert.assertThat;

import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.elasticsearch.gradle.internal.precommit.JarHellPrecommitPlugin;
import org.elasticsearch.gradle.jarhell.JarHellPlugin;
import org.gradle.api.tasks.TaskProvider;

import static org.mockito.Mockito.*;

import org.gradle.api.Task;

import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class JarHellPrecommitPluginSapientGeneratedTest {

    @Test
    void createTaskWhenElasticsearchCoreProjectIsNotNull() throws UnknownTaskException {
        // Arrange
        Project projectMock = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskCollection<JarHellTask> taskCollectionMock = mock(TaskCollection.class);
        TaskProvider<JarHellTask> taskProviderMock = mock(TaskProvider.class);
        Project elasticsearchCoreProjectMock = mock(Project.class);
        when(projectMock.getPluginManager()).thenReturn(pluginManagerMock);
        when(projectMock.getPath()).thenReturn("A");
        when(projectMock.findProject(":libs:elasticsearch-core")).thenReturn(elasticsearchCoreProjectMock);
        when(projectMock.getDependencies()).thenReturn(dependencyHandlerMock);
        when(projectMock.getTasks()).thenReturn(taskContainerMock);
        when(taskContainerMock.withType(JarHellTask.class)).thenReturn(taskCollectionMock);
        when(taskCollectionMock.named("jarHell")).thenReturn(taskProviderMock);
        JarHellPrecommitPlugin target = new JarHellPrecommitPlugin();
        // Act
        TaskProvider<? extends Task> result = target.createTask(projectMock);
        // Assert
        assertAll("result", () -> {
            assertThat(result, equalTo(taskProviderMock));
            verify(projectMock).getPluginManager();
            verify(pluginManagerMock).apply(JarHellPlugin.class);
            verify(projectMock).getPath();
            verify(projectMock).findProject(":libs:elasticsearch-core");
            verify(projectMock).getDependencies();
            verify(dependencyHandlerMock).add("jarHell", elasticsearchCoreProjectMock);
            verify(projectMock).getTasks();
            verify(taskContainerMock).withType(JarHellTask.class);
            verify(taskCollectionMock).named("jarHell");
        });
    }

    @Test
    void createTaskWhenElasticsearchCoreProjectIsNull() throws UnknownTaskException {
        // Arrange
        Project projectMock = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskCollection<JarHellTask> taskCollectionMock = mock(TaskCollection.class);
        TaskProvider<JarHellTask> taskProviderMock = mock(TaskProvider.class);
        when(projectMock.getPluginManager()).thenReturn(pluginManagerMock);
        when(projectMock.getPath()).thenReturn("A");
        when(projectMock.findProject(":libs:elasticsearch-core")).thenReturn(null);
        when(projectMock.getTasks()).thenReturn(taskContainerMock);
        when(taskContainerMock.withType(JarHellTask.class)).thenReturn(taskCollectionMock);
        when(taskCollectionMock.named("jarHell")).thenReturn(taskProviderMock);
        JarHellPrecommitPlugin target = new JarHellPrecommitPlugin();
        // Act
        TaskProvider<? extends Task> result = target.createTask(projectMock);
        // Assert
        assertAll("result", () -> {
            assertThat(result, equalTo(taskProviderMock));
            verify(projectMock).getPluginManager();
            verify(pluginManagerMock).apply(JarHellPlugin.class);
            verify(projectMock).getPath();
            verify(projectMock).findProject(":libs:elasticsearch-core");
            verify(projectMock, never()).getDependencies();
            verify(projectMock).getTasks();
            verify(taskContainerMock).withType(JarHellTask.class);
            verify(taskCollectionMock).named("jarHell");
        });
    }

    @Test
    void createTaskWhenProjectPathIsElasticsearchCore() throws UnknownTaskException {
        // Arrange
        Project projectMock = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskCollection<JarHellTask> taskCollectionMock = mock(TaskCollection.class);
        TaskProvider<JarHellTask> taskProviderMock = mock(TaskProvider.class);
        when(projectMock.getPluginManager()).thenReturn(pluginManagerMock);
        when(projectMock.getPath()).thenReturn(":libs:elasticsearch-core");
        when(projectMock.getTasks()).thenReturn(taskContainerMock);
        when(taskContainerMock.withType(JarHellTask.class)).thenReturn(taskCollectionMock);
        when(taskCollectionMock.named("jarHell")).thenReturn(taskProviderMock);
        JarHellPrecommitPlugin target = new JarHellPrecommitPlugin();
        // Act
        TaskProvider<? extends Task> result = target.createTask(projectMock);
        // Assert
        assertAll("result", () -> {
            assertThat(result, equalTo(taskProviderMock));
            verify(projectMock).getPluginManager();
            verify(pluginManagerMock).apply(JarHellPlugin.class);
            verify(projectMock).getPath();
            verify(projectMock, never()).findProject(":libs:elasticsearch-core");
            verify(projectMock, never()).getDependencies();
            verify(projectMock).getTasks();
            verify(taskContainerMock).withType(JarHellTask.class);
            verify(taskCollectionMock).named("jarHell");
        });
    }

    @Test
    void createTaskThrowsUnknownTaskException() {
        // Arrange
        Project projectMock = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskCollection<JarHellTask> taskCollectionMock = mock(TaskCollection.class);
        when(projectMock.getPluginManager()).thenReturn(pluginManagerMock);
        when(projectMock.getPath()).thenReturn("A");
        when(projectMock.getTasks()).thenReturn(taskContainerMock);
        when(taskContainerMock.withType(JarHellTask.class)).thenReturn(taskCollectionMock);
        when(taskCollectionMock.named("jarHell")).thenThrow(new UnknownTaskException("Task with name 'jarHell' not found"));
        JarHellPrecommitPlugin target = new JarHellPrecommitPlugin();
        // Act & Assert
        assertThrows(UnknownTaskException.class, () -> target.createTask(projectMock));
    }
}

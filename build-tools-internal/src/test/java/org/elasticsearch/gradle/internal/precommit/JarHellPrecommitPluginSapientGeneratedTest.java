package org.elasticsearch.gradle.internal.precommit;

import org.elasticsearch.gradle.internal.precommit.JarHellPrecommitPlugin;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.elasticsearch.gradle.jarhell.JarHellTask;
import org.gradle.api.plugins.PluginManager;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.gradle.api.Project;
import org.junit.jupiter.api.Timeout;
import org.gradle.api.tasks.TaskCollection;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.UnknownTaskException;

import static org.hamcrest.MatcherAssert.assertThat;

import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.gradle.api.artifacts.Dependency;
import org.gradle.api.tasks.TaskProvider;
import org.elasticsearch.gradle.jarhell.JarHellPlugin;

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
        doReturn(pluginManagerMock).when(projectMock).getPluginManager();
        doReturn("A").when(projectMock).getPath();
        doReturn(elasticsearchCoreProjectMock).when(projectMock).findProject(":libs:elasticsearch-core");
        doReturn(dependencyHandlerMock).when(projectMock).getDependencies();
        doReturn(taskContainerMock).when(projectMock).getTasks();
        doReturn(taskCollectionMock).when(taskContainerMock).withType(JarHellTask.class);
        doReturn(taskProviderMock).when(taskCollectionMock).named("jarHell");
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
        doReturn(pluginManagerMock).when(projectMock).getPluginManager();
        doReturn("A").when(projectMock).getPath();
        doReturn(null).when(projectMock).findProject(":libs:elasticsearch-core");
        doReturn(taskContainerMock).when(projectMock).getTasks();
        doReturn(taskCollectionMock).when(taskContainerMock).withType(JarHellTask.class);
        doReturn(taskProviderMock).when(taskCollectionMock).named("jarHell");
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
        doReturn(pluginManagerMock).when(projectMock).getPluginManager();
        doReturn(":libs:elasticsearch-core").when(projectMock).getPath();
        doReturn(taskContainerMock).when(projectMock).getTasks();
        doReturn(taskCollectionMock).when(taskContainerMock).withType(JarHellTask.class);
        doReturn(taskProviderMock).when(taskCollectionMock).named("jarHell");
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
        doReturn(pluginManagerMock).when(projectMock).getPluginManager();
        doReturn("A").when(projectMock).getPath();
        doReturn(taskContainerMock).when(projectMock).getTasks();
        doReturn(taskCollectionMock).when(taskContainerMock).withType(JarHellTask.class);
        doThrow(new UnknownTaskException("Task with name 'jarHell' not found")).when(taskCollectionMock).named("jarHell");
        JarHellPrecommitPlugin target = new JarHellPrecommitPlugin();
        // Act & Assert
        assertThrows(UnknownTaskException.class, () -> target.createTask(projectMock));
    }
}

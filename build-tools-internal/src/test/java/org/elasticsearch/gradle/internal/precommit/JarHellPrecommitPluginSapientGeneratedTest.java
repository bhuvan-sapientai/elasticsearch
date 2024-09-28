package org.elasticsearch.gradle.internal.precommit;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.UnknownTaskException;
import org.elasticsearch.gradle.jarhell.JarHellTask;
import org.gradle.api.artifacts.Dependency;
import org.gradle.api.tasks.TaskContainer;
import org.elasticsearch.gradle.jarhell.JarHellPlugin;
import org.gradle.api.Project;
import org.gradle.api.tasks.TaskCollection;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.Task;
import org.gradle.api.plugins.PluginManager;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5)
class JarHellPrecommitPluginSapientGeneratedTest {

    //Sapient generated method id: ${createTaskWhenElasticsearchCoreProjectIsNotNull}, hash: B3E3410129DDEDD7D8E1D86FBF09978F
    @Test()
    void createTaskWhenElasticsearchCoreProjectIsNotNull() throws UnknownTaskException {
        /* Branches:
         * (project.getPath().equals(":libs:elasticsearch-core") == false) : true
         * (elasticsearchCoreProject != null) : true
         */
         //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        doReturn(pluginManagerMock).when(projectMock).getPluginManager();
        doNothing().when(pluginManagerMock).apply(JarHellPlugin.class);
        doReturn("A").when(projectMock).getPath();
        Project projectMock2 = mock(Project.class);
        doReturn(projectMock2).when(projectMock).findProject(":libs:elasticsearch-core");
        DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        doReturn(dependencyHandlerMock).when(projectMock).getDependencies();
        Dependency dependencyMock = mock(Dependency.class);
        doReturn(dependencyMock).when(dependencyHandlerMock).add("jarHell", projectMock2);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        doReturn(taskContainerMock).when(projectMock).getTasks();
        TaskCollection taskCollectionMock = mock(TaskCollection.class);
        doReturn(taskCollectionMock).when(taskContainerMock).withType(JarHellTask.class);
        TaskProvider<Task> taskProviderMock = mock(TaskProvider.class);
        doReturn(taskProviderMock).when(taskCollectionMock).named("jarHell");
        JarHellPrecommitPlugin target = new JarHellPrecommitPlugin();
        
        //Act Statement(s)
        TaskProvider<? extends Task> result = target.createTask(projectMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(taskProviderMock));
            verify(projectMock).getPluginManager();
            verify(pluginManagerMock).apply(JarHellPlugin.class);
            verify(projectMock).getPath();
            verify(projectMock).findProject(":libs:elasticsearch-core");
            verify(projectMock).getDependencies();
            verify(dependencyHandlerMock).add("jarHell", projectMock2);
            verify(projectMock).getTasks();
            verify(taskContainerMock).withType(JarHellTask.class);
            verify(taskCollectionMock).named("jarHell");
        });
    }
}

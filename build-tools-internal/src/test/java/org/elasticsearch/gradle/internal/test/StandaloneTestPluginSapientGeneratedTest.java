package org.elasticsearch.gradle.internal.test;

import org.junit.jupiter.api.Timeout;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.UnknownProjectException;
import org.gradle.api.UnknownTaskException;
import org.mockito.stubbing.Answer;
import org.gradle.api.artifacts.Dependency;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.gradle.api.file.FileCollection;
import org.elasticsearch.gradle.internal.ElasticsearchTestBasePlugin;
import org.gradle.api.Project;
import org.elasticsearch.gradle.internal.ElasticsearchJavaBasePlugin;
import org.gradle.api.tasks.testing.Test;
import org.gradle.api.tasks.TaskCollection;
import org.elasticsearch.gradle.internal.precommit.InternalPrecommitTasks;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.Task;
import org.mockito.MockedStatic;
import org.elasticsearch.gradle.internal.info.GlobalBuildInfoPlugin;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.tasks.SourceSetOutput;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.plugins.PluginManager;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class StandaloneTestPluginSapientGeneratedTest {

    //Sapient generated method id: ${applyTest}, hash: 0FEE9480187E9D6AC2A4B82CD82CB42B
    @Disabled()
    @org.junit.jupiter.api.Test()
    void applyTest() throws UnknownDomainObjectException, InvalidUserDataException, UnknownProjectException, UnknownTaskException {
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        Project projectMock2 = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        PluginManager pluginManagerMock2 = mock(PluginManager.class);
        PluginManager pluginManagerMock3 = mock(PluginManager.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        SourceSet sourceSetMock = mock(SourceSet.class);
        SourceSetOutput sourceSetOutputMock = mock(SourceSetOutput.class);
        FileCollection fileCollectionMock = mock(FileCollection.class);
        FileCollection fileCollectionMock2 = mock(FileCollection.class);
        DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        Dependency dependencyMock = mock(Dependency.class);
        Project projectMock3 = mock(Project.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskCollection taskCollectionMock = mock(TaskCollection.class);
        TaskContainer taskContainerMock2 = mock(TaskContainer.class);
        TaskProvider<Test> taskProviderMock = mock(TaskProvider.class);
        TaskContainer taskContainerMock3 = mock(TaskContainer.class);
        Task taskMock = mock(Task.class);
        TaskContainer taskContainerMock4 = mock(TaskContainer.class);
        TaskProvider taskProviderMock2 = mock(TaskProvider.class);
        try (MockedStatic<InternalPrecommitTasks> internalPrecommitTasks = mockStatic(InternalPrecommitTasks.class)) {
            doReturn(projectMock2).when(projectMock).getRootProject();
            doReturn(pluginManagerMock).when(projectMock2).getPluginManager();
            doNothing().when(pluginManagerMock).apply(GlobalBuildInfoPlugin.class);
            doNothing().when(pluginManagerMock2).apply(ElasticsearchJavaBasePlugin.class);
            doReturn(pluginManagerMock2, pluginManagerMock3).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock3).apply(ElasticsearchTestBasePlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(sourceSetContainerMock).when(extensionContainerMock).getByType(SourceSetContainer.class);
            doReturn(sourceSetMock).when(sourceSetContainerMock).create("test");
            doReturn("return_of_getImplementationConfigurationName1").when(sourceSetMock).getImplementationConfigurationName();
            doReturn(sourceSetOutputMock).when(sourceSetMock).getOutput();
            doReturn(fileCollectionMock).when(sourceSetOutputMock).getClassesDirs();
            doReturn(fileCollectionMock2).when(sourceSetMock).getRuntimeClasspath();
            doReturn(dependencyHandlerMock).when(projectMock).getDependencies();
            doReturn(dependencyMock).when(dependencyHandlerMock).add("return_of_getImplementationConfigurationName1", projectMock3);
            doReturn(projectMock3).when(projectMock).project(":test:framework");
            doReturn(taskCollectionMock).when(taskContainerMock).withType(Test.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            doReturn(taskProviderMock).when(taskContainerMock2).register("test", Test.class);
            doNothing().when(taskProviderMock).configure((Action) any());
            doReturn(taskMock).when(taskContainerMock3).getByName("precommit");
            doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3, taskContainerMock4).when(projectMock).getTasks();
            doReturn(taskProviderMock2).when(taskContainerMock4).named("check");
            doNothing().when(taskProviderMock2).configure((Action) any());
            internalPrecommitTasks.when(() -> InternalPrecommitTasks.create(projectMock, false)).thenAnswer((Answer<Void>) invocation -> null);
            StandaloneTestPlugin target = new StandaloneTestPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).getRootProject();
                verify(projectMock2).getPluginManager();
                verify(pluginManagerMock).apply(GlobalBuildInfoPlugin.class);
                verify(projectMock, times(2)).getPluginManager();
                verify(pluginManagerMock2).apply(ElasticsearchJavaBasePlugin.class);
                verify(pluginManagerMock3).apply(ElasticsearchTestBasePlugin.class);
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByType(SourceSetContainer.class);
                verify(sourceSetContainerMock).create("test");
                verify(sourceSetMock).getImplementationConfigurationName();
                verify(sourceSetMock).getOutput();
                verify(sourceSetOutputMock).getClassesDirs();
                verify(sourceSetMock).getRuntimeClasspath();
                verify(projectMock).getDependencies();
                verify(dependencyHandlerMock).add("return_of_getImplementationConfigurationName1", projectMock3);
                verify(projectMock).project(":test:framework");
                verify(projectMock, times(4)).getTasks();
                verify(taskContainerMock).withType(Test.class);
                verify(taskCollectionMock).configureEach((Action) any());
                verify(taskContainerMock2).register("test", Test.class);
                verify(taskProviderMock).configure((Action) any());
                verify(taskContainerMock3).getByName("precommit");
                verify(taskContainerMock4).named("check");
                verify(taskProviderMock2).configure((Action) any());
                internalPrecommitTasks.verify(() -> InternalPrecommitTasks.create(projectMock, false), atLeast(1));
            });
        }
    }
}

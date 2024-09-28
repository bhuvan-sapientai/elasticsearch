package org.elasticsearch.gradle.internal.conventions.precommit;

import org.junit.jupiter.api.Timeout;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.UnknownTaskException;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.gradle.api.plugins.JavaPluginExtension;
import org.gradle.api.Project;
import org.gradle.api.tasks.testing.Test;
import org.gradle.api.tasks.TaskCollection;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.Task;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.plugins.PluginManager;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PrecommitTaskPluginSapientGeneratedTest {

    //Sapient generated method id: ${applyTest}, hash: 09AC3DA3A007CD9454799BB1E95AB120
    @Disabled()
    @org.junit.jupiter.api.Test()
    void applyTest() throws UnknownDomainObjectException, InvalidUserDataException, UnknownTaskException {
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider<Task> taskProviderMock = mock(TaskProvider.class);
        doReturn(taskProviderMock).when(taskContainerMock).register(eq("precommit"), (Action) any());
        doNothing().when(taskProviderMock).configure((Action) any());
        PluginManager pluginManagerMock = mock(PluginManager.class);
        doNothing().when(pluginManagerMock).withPlugin(eq("lifecycle-base"), (Action) any());
        TaskContainer taskContainerMock2 = mock(TaskContainer.class);
        TaskProvider taskProviderMock2 = mock(TaskProvider.class);
        doReturn(taskProviderMock2).when(taskContainerMock2).named("check");
        doNothing().when(taskProviderMock2).configure((Action) any());
        PluginManager pluginManagerMock2 = mock(PluginManager.class);
        doReturn(pluginManagerMock, pluginManagerMock2).when(projectMock).getPluginManager();
        doNothing().when(pluginManagerMock2).withPlugin(eq("java-base"), (Action) any());
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        JavaPluginExtension javaPluginExtensionMock = mock(JavaPluginExtension.class);
        doReturn(javaPluginExtensionMock).when(extensionContainerMock).getByType(JavaPluginExtension.class);
        SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        doReturn(sourceSetContainerMock).when(javaPluginExtensionMock).getSourceSets();
        doNothing().when(sourceSetContainerMock).all((Action) any());
        TaskContainer taskContainerMock3 = mock(TaskContainer.class);
        doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3).when(projectMock).getTasks();
        TaskCollection taskCollectionMock = mock(TaskCollection.class);
        doReturn(taskCollectionMock).when(taskContainerMock3).withType(Test.class);
        doNothing().when(taskCollectionMock).configureEach((Action) any());
        PrecommitTaskPlugin target = new PrecommitTaskPlugin();
        //Act Statement(s)
        target.apply(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock, times(3)).getTasks();
            verify(taskContainerMock).register(eq("precommit"), (Action) any());
            verify(taskProviderMock).configure((Action) any());
            verify(projectMock, times(2)).getPluginManager();
            verify(pluginManagerMock).withPlugin(eq("lifecycle-base"), (Action) any());
            verify(taskContainerMock2).named("check");
            verify(taskProviderMock2).configure((Action) any());
            verify(pluginManagerMock2).withPlugin(eq("java-base"), (Action) any());
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).getByType(JavaPluginExtension.class);
            verify(javaPluginExtensionMock).getSourceSets();
            verify(sourceSetContainerMock).all((Action) any());
            verify(taskContainerMock3).withType(Test.class);
            verify(taskCollectionMock).configureEach((Action) any());
        });
    }
}

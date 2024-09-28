package org.elasticsearch.gradle.jarhell;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.UnknownTaskException;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.artifacts.Configuration;
import org.elasticsearch.gradle.VersionProperties;
import org.gradle.api.artifacts.Dependency;
import org.gradle.api.Action;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.file.FileCollection;
import org.elasticsearch.gradle.util.GradleUtils;
import org.gradle.api.Project;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.tasks.SourceSetContainer;
import org.mockito.MockedStatic;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.plugins.PluginManager;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class JarHellPluginSapientGeneratedTest {

    //Sapient generated method id: ${applyTest}, hash: 4B2608FA9BB742E92B47117278681AFE
    @Disabled()
    @Test()
    void applyTest() throws InvalidUserDataException, UnknownTaskException {
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        Configuration configurationMock = mock(Configuration.class);
        Configuration configurationMock2 = mock(Configuration.class);
        DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        Dependency dependencyMock = mock(Dependency.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider<JarHellTask> taskProviderMock = mock(TaskProvider.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        PluginManager pluginManagerMock2 = mock(PluginManager.class);
        TaskContainer taskContainerMock2 = mock(TaskContainer.class);
        TaskProvider taskProviderMock2 = mock(TaskProvider.class);
        SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        SourceSet sourceSetMock = mock(SourceSet.class);
        FileCollection fileCollectionMock = mock(FileCollection.class);
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            doReturn(configurationContainerMock).when(projectMock).getConfigurations();
            doReturn(configurationMock).when(configurationContainerMock).create("jarHell");
            doReturn(configurationMock2).when(configurationMock).defaultDependencies((Action) any());
            doReturn(dependencyHandlerMock).when(projectMock).getDependencies();
            doReturn(dependencyMock).when(dependencyHandlerMock).create("org.elasticsearch:elasticsearch-core:A");
            doReturn(taskProviderMock).when(taskContainerMock).register("jarHell", JarHellTask.class);
            doNothing().when(taskProviderMock).configure((Action) any());
            doNothing().when(pluginManagerMock).withPlugin(eq("java"), (Action) any());
            doReturn(pluginManagerMock, pluginManagerMock2).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock2).withPlugin(eq("lifecycle-base"), (Action) any());
            doReturn(taskContainerMock, taskContainerMock2).when(projectMock).getTasks();
            doReturn(taskProviderMock2).when(taskContainerMock2).named("check");
            doNothing().when(taskProviderMock2).configure((Action) any());
            gradleUtils.when(() -> GradleUtils.getJavaSourceSets(projectMock)).thenReturn(sourceSetContainerMock);
            doReturn(sourceSetMock).when(sourceSetContainerMock).findByName("test");
            doReturn(fileCollectionMock).when(sourceSetMock).getRuntimeClasspath();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("A");
            JarHellPlugin target = new JarHellPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).getConfigurations();
                verify(configurationContainerMock).create("jarHell");
                verify(configurationMock).defaultDependencies((Action) any());
                verify(projectMock).getDependencies();
                verify(dependencyHandlerMock).create("org.elasticsearch:elasticsearch-core:A");
                verify(projectMock, times(2)).getTasks();
                verify(taskContainerMock).register("jarHell", JarHellTask.class);
                verify(taskProviderMock, atLeast(2)).configure((Action) any());
                verify(projectMock, times(2)).getPluginManager();
                verify(pluginManagerMock).withPlugin(eq("java"), (Action) any());
                verify(pluginManagerMock2).withPlugin(eq("lifecycle-base"), (Action) any());
                verify(taskContainerMock2).named("check");
                verify(taskProviderMock2).configure((Action) any());
                gradleUtils.verify(() -> GradleUtils.getJavaSourceSets(projectMock), atLeast(1));
                verify(sourceSetContainerMock).findByName("test");
                verify(sourceSetMock).getRuntimeClasspath();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }
}

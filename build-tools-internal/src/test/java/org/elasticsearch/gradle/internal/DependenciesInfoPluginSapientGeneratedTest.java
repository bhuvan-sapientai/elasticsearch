package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.UnknownConfigurationException;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.reflect.ObjectInstantiationException;
import org.gradle.api.UnknownTaskException;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.attributes.Category;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.artifacts.Configuration;
import org.elasticsearch.gradle.internal.precommit.DependencyLicensesTask;
import java.util.LinkedHashMap;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.gradle.api.Project;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.artifacts.dsl.ArtifactHandler;
import org.gradle.api.artifacts.PublishArtifact;
import org.elasticsearch.gradle.dependencies.CompileOnlyResolvePlugin;
import org.gradle.api.Plugin;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class DependenciesInfoPluginSapientGeneratedTest {

    //Sapient generated method id: ${applyTest}, hash: BD77189F09FF3A6AD3EC8D98A9509FD4
    @Disabled()
    @Test()
    void applyTest() throws UnknownConfigurationException, InvalidUserDataException, ObjectInstantiationException, UnknownTaskException {
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        doReturn(pluginContainerMock).when(projectMock).getPlugins();
        Plugin pluginMock = mock(Plugin.class);
        doReturn(pluginMock).when(pluginContainerMock).apply(CompileOnlyResolvePlugin.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider<DependenciesInfoTask> taskProviderMock = mock(TaskProvider.class);
        doReturn(taskProviderMock).when(taskContainerMock).register("dependenciesInfo", DependenciesInfoTask.class);
        doNothing().when(taskProviderMock).configure((Action) any());
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        Configuration configurationMock = mock(Configuration.class);
        doReturn(configurationMock).when(configurationContainerMock).getByName("runtimeClasspath");
        ConfigurationContainer configurationContainerMock2 = mock(ConfigurationContainer.class);
        Configuration configurationMock2 = mock(Configuration.class);
        doReturn(configurationMock2).when(configurationContainerMock2).getByName("resolveableCompileOnly");
        TaskContainer taskContainerMock2 = mock(TaskContainer.class);
        doReturn(taskContainerMock, taskContainerMock2).when(projectMock).getTasks();
        TaskProvider<DependencyLicensesTask> taskProviderMock2 = mock(TaskProvider.class);
        doReturn(taskProviderMock2).when(taskContainerMock2).named("dependencyLicenses", DependencyLicensesTask.class);
        DependencyLicensesTask dependencyLicensesTaskMock = mock(DependencyLicensesTask.class);
        doReturn(dependencyLicensesTaskMock).when(taskProviderMock2).get();
        LinkedHashMap<String, String> stringStringMap = new LinkedHashMap<>();
        doReturn(stringStringMap).when(dependencyLicensesTaskMock).getMappings();
        ConfigurationContainer configurationContainerMock3 = mock(ConfigurationContainer.class);
        doReturn(configurationContainerMock, configurationContainerMock2, configurationContainerMock3).when(projectMock).getConfigurations();
        Configuration configurationMock3 = mock(Configuration.class);
        doReturn(configurationMock3).when(configurationContainerMock3).create("dependenciesInfoFiles");
        doNothing().when(configurationMock3).setCanBeResolved(false);
        doNothing().when(configurationMock3).setCanBeConsumed(true);
        Object object = new Object();
        doReturn(object).when(configurationMock3).attributes((Action) any());
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        Category categoryMock = mock(Category.class);
        doReturn(categoryMock).when(objectFactoryMock).named(Category.class, "documentation");
        ArtifactHandler artifactHandlerMock = mock(ArtifactHandler.class);
        doReturn(artifactHandlerMock).when(projectMock).getArtifacts();
        PublishArtifact publishArtifactMock = mock(PublishArtifact.class);
        doReturn(publishArtifactMock).when(artifactHandlerMock).add("dependenciesInfoFiles", taskProviderMock);
        DependenciesInfoPlugin target = new DependenciesInfoPlugin();
        //Act Statement(s)
        target.apply(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).getPlugins();
            verify(pluginContainerMock).apply(CompileOnlyResolvePlugin.class);
            verify(projectMock, times(2)).getTasks();
            verify(taskContainerMock).register("dependenciesInfo", DependenciesInfoTask.class);
            verify(taskProviderMock).configure((Action) any());
            verify(projectMock, times(3)).getConfigurations();
            verify(configurationContainerMock).getByName("runtimeClasspath");
            verify(configurationContainerMock2).getByName("resolveableCompileOnly");
            verify(taskContainerMock2).named("dependencyLicenses", DependencyLicensesTask.class);
            verify(taskProviderMock2).get();
            verify(dependencyLicensesTaskMock).getMappings();
            verify(configurationContainerMock3).create("dependenciesInfoFiles");
            verify(configurationMock3).setCanBeResolved(false);
            verify(configurationMock3).setCanBeConsumed(true);
            verify(configurationMock3).attributes((Action) any());
            verify(projectMock).getObjects();
            verify(objectFactoryMock).named(Category.class, "documentation");
            verify(projectMock).getArtifacts();
            verify(artifactHandlerMock).add("dependenciesInfoFiles", taskProviderMock);
        });
    }
}

package org.elasticsearch.gradle.internal.precommit;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.UnknownConfigurationException;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.gradle.api.Project;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.Task;
import org.gradle.api.Plugin;
import org.elasticsearch.gradle.dependencies.CompileOnlyResolvePlugin;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class DependencyLicensesPrecommitPluginSapientGeneratedTest {

    private final ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);

    private final ConfigurationContainer configurationContainerMock2 = mock(ConfigurationContainer.class);

    private final Configuration configurationMock = mock(Configuration.class);

    private final Configuration configurationMock2 = mock(Configuration.class);

    private final PluginContainer pluginContainerMock = mock(PluginContainer.class);

    private final Plugin pluginMock = mock(Plugin.class);

    private final Project projectMock = mock(Project.class);

    private final TaskContainer taskContainerMock = mock(TaskContainer.class);

    private final TaskProvider<DependencyLicensesTask> taskProviderMock = mock(TaskProvider.class);

    //Sapient generated method id: ${createTaskWhenDefaultBranch}, hash: 452B13593C0109B931225AB09B279A8E
    @Disabled()
    @Test()
    void createTaskWhenDefaultBranch() throws UnknownConfigurationException, InvalidUserDataException {
        /* Branches:
         * (branch expression (line 23)) : true  #  inside lambda$static$0 method
         * (branch expression (line 24)) : true  #  inside lambda$static$0 method
         */
        //Arrange Statement(s)
        doReturn(pluginContainerMock).when(projectMock).getPlugins();
        doReturn(pluginMock).when(pluginContainerMock).apply(CompileOnlyResolvePlugin.class);
        doReturn(taskContainerMock).when(projectMock).getTasks();
        doReturn(taskProviderMock).when(taskContainerMock).register(eq("dependencyLicenses"), eq(DependencyLicensesTask.class), (Action) any());
        doReturn(configurationMock).when(configurationContainerMock).getByName("runtimeClasspath");
        doReturn(configurationContainerMock, configurationContainerMock2).when(projectMock).getConfigurations();
        doReturn(configurationMock2).when(configurationContainerMock2).getByName("resolveableCompileOnly");
        DependencyLicensesPrecommitPlugin target = new DependencyLicensesPrecommitPlugin();
        //Act Statement(s)
        TaskProvider<? extends Task> result = target.createTask(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(taskProviderMock));
            verify(projectMock).getPlugins();
            verify(pluginContainerMock).apply(CompileOnlyResolvePlugin.class);
            verify(projectMock).getTasks();
            verify(taskContainerMock).register(eq("dependencyLicenses"), eq(DependencyLicensesTask.class), (Action) any());
            verify(projectMock, times(2)).getConfigurations();
            verify(configurationContainerMock).getByName("runtimeClasspath");
            verify(configurationContainerMock2).getByName("resolveableCompileOnly");
        });
    }

    //Sapient generated method id: ${createTaskWhenDefaultBranchAndDefaultBranch}, hash: 0799D1764842A8871ECD1900866223CD
    @Disabled()
    @Test()
    void createTaskWhenDefaultBranchAndDefaultBranch() throws UnknownConfigurationException, InvalidUserDataException {
        /* Branches:
         * (branch expression (line 23)) : true  #  inside lambda$static$0 method
         * (branch expression (line 24)) : false  #  inside lambda$static$0 method
         */
        //Arrange Statement(s)
        doReturn(pluginContainerMock).when(projectMock).getPlugins();
        doReturn(pluginMock).when(pluginContainerMock).apply(CompileOnlyResolvePlugin.class);
        doReturn(taskContainerMock).when(projectMock).getTasks();
        doReturn(taskProviderMock).when(taskContainerMock).register(eq("dependencyLicenses"), eq(DependencyLicensesTask.class), (Action) any());
        doReturn(configurationMock).when(configurationContainerMock).getByName("runtimeClasspath");
        doReturn(configurationContainerMock, configurationContainerMock2).when(projectMock).getConfigurations();
        doReturn(configurationMock2).when(configurationContainerMock2).getByName("resolveableCompileOnly");
        DependencyLicensesPrecommitPlugin target = new DependencyLicensesPrecommitPlugin();
        //Act Statement(s)
        TaskProvider<? extends Task> result = target.createTask(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(taskProviderMock));
            verify(projectMock).getPlugins();
            verify(pluginContainerMock).apply(CompileOnlyResolvePlugin.class);
            verify(projectMock).getTasks();
            verify(taskContainerMock).register(eq("dependencyLicenses"), eq(DependencyLicensesTask.class), (Action) any());
            verify(projectMock, times(2)).getConfigurations();
            verify(configurationContainerMock).getByName("runtimeClasspath");
            verify(configurationContainerMock2).getByName("resolveableCompileOnly");
        });
    }
}

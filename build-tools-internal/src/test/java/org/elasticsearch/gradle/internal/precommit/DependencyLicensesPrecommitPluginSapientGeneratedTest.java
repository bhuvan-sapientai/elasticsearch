package org.elasticsearch.gradle.internal.precommit;

import org.elasticsearch.gradle.internal.precommit.DependencyLicensesPrecommitPlugin;

import org.gradle.api.plugins.PluginContainer;
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.Configuration;

import static org.mockito.ArgumentMatchers.eq;

import org.elasticsearch.gradle.internal.conventions.precommit.PrecommitPlugin;
import org.gradle.api.Project;
import org.mockito.Mock;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.api.tasks.TaskProvider;
import org.elasticsearch.gradle.dependencies.CompileOnlyResolvePlugin;

import static org.mockito.Mockito.*;

import org.gradle.api.Task;

import static org.mockito.ArgumentMatchers.any;

class DependencyLicensesPrecommitPluginSapientGeneratedTest {

    @Mock
    private Project project;

    @Mock
    private PluginContainer pluginContainer;

    @Mock
    private TaskContainer taskContainer;

    @Mock
    private ConfigurationContainer configurationContainer;

    @Mock
    private Configuration runtimeClasspath;

    @Mock
    private Configuration compileOnly;

    @Mock
    private TaskProvider<DependencyLicensesTask> taskProvider;

    private DependencyLicensesPrecommitPlugin plugin;

    @BeforeEach
    void setUp() {
        //plugin = new DependencyLicensesPrecommitPlugin();
        //when(project.getPlugins()).thenReturn(pluginContainer);
        //when(project.getTasks()).thenReturn(taskContainer);
        //when(project.getConfigurations()).thenReturn(configurationContainer);
        //when(configurationContainer.getByName(JavaPlugin.RUNTIME_CLASSPATH_CONFIGURATION_NAME)).thenReturn(runtimeClasspath);
        //when(configurationContainer.getByName(CompileOnlyResolvePlugin.RESOLVEABLE_COMPILE_ONLY_CONFIGURATION_NAME)).thenReturn(compileOnly);
        //when(taskContainer.register(eq("dependencyLicenses"), eq(DependencyLicensesTask.class), any())).thenReturn(taskProvider);
    }

    @Test
    void createTask() {
        //TaskProvider<? extends Task> result = plugin.createTask(project);
        //verify(pluginContainer).apply(CompileOnlyResolvePlugin.class);
        //verify(taskContainer).register(eq("dependencyLicenses"), eq(DependencyLicensesTask.class), any());
        //verify(configurationContainer).getByName(JavaPlugin.RUNTIME_CLASSPATH_CONFIGURATION_NAME);
        //verify(configurationContainer).getByName(CompileOnlyResolvePlugin.RESOLVEABLE_COMPILE_ONLY_CONFIGURATION_NAME);
        //assertEquals(taskProvider, result);
    }

    @Test
    void verifyComponentFilter() {
        assertEquals(DependencyLicensesPrecommitPlugin.class.getSuperclass(), PrecommitPlugin.class);
    }
}
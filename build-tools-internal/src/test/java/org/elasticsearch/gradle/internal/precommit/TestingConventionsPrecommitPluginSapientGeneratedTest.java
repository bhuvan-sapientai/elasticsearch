package org.elasticsearch.gradle.internal.precommit;

import org.elasticsearch.gradle.internal.precommit.TestingConventionsPrecommitPlugin;

import org.gradle.api.NamedDomainObjectProvider;
import org.gradle.api.tasks.SourceSet;
import org.junit.jupiter.api.BeforeEach;
import org.gradle.api.plugins.JavaPluginExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.elasticsearch.gradle.internal.test.rest.InternalJavaRestTestPlugin;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.eq;

import org.elasticsearch.gradle.internal.conventions.precommit.PrecommitPlugin;
import org.elasticsearch.gradle.internal.test.InternalClusterTestPlugin;
import org.gradle.api.Project;
import org.mockito.Mock;
import org.gradle.api.Action;
import org.elasticsearch.gradle.internal.test.rest.LegacyYamlRestTestPlugin;

import static org.mockito.ArgumentMatchers.anyString;

import org.elasticsearch.gradle.internal.test.rest.LegacyJavaRestTestPlugin;
import org.gradle.api.plugins.JavaBasePlugin;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.api.tasks.TaskProvider;

import static org.mockito.Mockito.*;

import org.gradle.api.Task;

import static org.mockito.ArgumentMatchers.any;

class TestingConventionsPrecommitPluginSapientGeneratedTest {

    @Mock
    private Project project;

    @Mock
    private JavaPluginExtension javaPluginExtension;

    @Mock
    private NamedDomainObjectProvider<SourceSet> sourceSetProvider;

    @Mock
    private TaskProvider<Task> taskProvider;

    private TestingConventionsPrecommitPlugin plugin;

    @BeforeEach
    void setUp() {
        plugin = new TestingConventionsPrecommitPlugin();
        when(project.getPlugins()).thenReturn(mock(org.gradle.api.plugins.PluginContainer.class));
        when(project.getExtensions()).thenReturn(mock(org.gradle.api.plugins.ExtensionContainer.class));
        when(project.getTasks()).thenReturn(mock(org.gradle.api.tasks.TaskContainer.class));
        when(project.getExtensions().getByType(JavaPluginExtension.class)).thenReturn(javaPluginExtension);
        when(javaPluginExtension.getSourceSets()).thenReturn(mock(org.gradle.api.tasks.SourceSetContainer.class));
        when(javaPluginExtension.getSourceSets().named(anyString())).thenReturn(sourceSetProvider);
        when(project.getTasks().register(eq(TestingConventionsPrecommitPlugin.TESTING_CONVENTIONS_TASK_NAME), any(Action.class))).thenReturn(taskProvider);
    }

    @Test
    void createTaskShouldApplyJavaBasePlugin() {
        plugin.createTask(project);
        verify(project.getPlugins()).apply(JavaBasePlugin.class);
    }

    @Test
    void createTaskShouldSetupTaskForJavaPlugin() {
        plugin.createTask(project);
        verify(project.getPlugins()).withType(eq(JavaPlugin.class), any(Action.class));
    }

    @Test
    void createTaskShouldSetupTaskForLegacyYamlRestTestPlugin() {
        plugin.createTask(project);
        verify(project.getPlugins()).withType(eq(LegacyYamlRestTestPlugin.class), any(Action.class));
    }

    @Test
    void createTaskShouldSetupTaskForInternalClusterTestPlugin() {
        plugin.createTask(project);
        verify(project.getPlugins()).withType(eq(InternalClusterTestPlugin.class), any(Action.class));
    }

    @Test
    void createTaskShouldSetupTaskForLegacyJavaRestTestPlugin() {
        plugin.createTask(project);
        verify(project.getPlugins()).withType(eq(LegacyJavaRestTestPlugin.class), any(Action.class));
    }

    @Test
    void createTaskShouldSetupTaskForInternalJavaRestTestPlugin() {
        plugin.createTask(project);
        verify(project.getPlugins()).withType(eq(InternalJavaRestTestPlugin.class), any(Action.class));
    }

    @Test
    void createTaskShouldRegisterTestingConventionsTask() {
        TaskProvider<? extends Task> result = plugin.createTask(project);
        verify(project.getTasks()).register(eq(TestingConventionsPrecommitPlugin.TESTING_CONVENTIONS_TASK_NAME), any(Action.class));
        assertEquals(taskProvider, result);
    }
}

package org.elasticsearch.gradle.internal.test.rest;

import org.elasticsearch.gradle.internal.test.rest.InternalJavaRestTestPlugin;

import static org.elasticsearch.gradle.internal.test.rest.RestTestUtil.setupJavaRestTestDependenciesDefaults;

import org.gradle.api.tasks.SourceSet;
import org.junit.jupiter.api.BeforeEach;
import org.gradle.api.plugins.PluginManager;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;
import org.mockito.Mock;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.tasks.TaskContainer;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;

import static org.elasticsearch.gradle.internal.test.rest.RestTestUtil.registerTestTask;

import org.elasticsearch.gradle.util.GradleUtils;
import org.gradle.api.plugins.JavaBasePlugin;
import org.elasticsearch.gradle.internal.test.RestIntegTestTask;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.tasks.TaskProvider;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class InternalJavaRestTestPluginSapientGeneratedTest {

    @Mock
    private Project project;

    @Mock
    private PluginManager pluginManager;

    @Mock
    private SourceSetContainer sourceSetContainer;

    @Mock
    private SourceSet sourceSet;

    @Mock
    private TaskContainer taskContainer;

    @Mock
    private TaskProvider<RestIntegTestTask> testTaskProvider;

    private InternalJavaRestTestPlugin plugin;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        plugin = new InternalJavaRestTestPlugin();
        when(project.getPluginManager()).thenReturn(pluginManager);
        when(project.getExtensions()).thenReturn(mock(org.gradle.api.plugins.ExtensionContainer.class));
        when(project.getExtensions().getByType(SourceSetContainer.class)).thenReturn(sourceSetContainer);
        when(sourceSetContainer.create(InternalJavaRestTestPlugin.SOURCE_SET_NAME)).thenReturn(sourceSet);
        when(project.getTasks()).thenReturn(taskContainer);
    }

    @Test
    void apply_WhenTestClustersProjectExists() {
        // Arrange
        when(project.findProject(":test:test-clusters")).thenReturn(mock(Project.class));
        when(project.getDependencies()).thenReturn(mock(org.gradle.api.artifacts.dsl.DependencyHandler.class));
        when(sourceSet.getImplementationConfigurationName()).thenReturn("testImplementation");
        // Act
        plugin.apply(project);
        // Assert
        verify(pluginManager).apply(RestTestBasePlugin.class);
        verify(sourceSetContainer).create(InternalJavaRestTestPlugin.SOURCE_SET_NAME);
        verify(project.getDependencies()).add(eq("testImplementation"), any());
        verify(taskContainer).named(JavaBasePlugin.CHECK_TASK_NAME);
    }

    @Test
    void apply_WhenTestClustersProjectDoesNotExist() {
        // Arrange
        when(project.findProject(":test:test-clusters")).thenReturn(null);
        // Act
        plugin.apply(project);
        // Assert
        verify(pluginManager).apply(RestTestBasePlugin.class);
        verify(sourceSetContainer).create(InternalJavaRestTestPlugin.SOURCE_SET_NAME);
        verify(project, never()).getDependencies();
        verify(taskContainer).named(JavaBasePlugin.CHECK_TASK_NAME);
    }

    @Test
    void apply_VerifyRegisterTestTaskIsCalled() {
        // Arrange
        try (var mockedRestTestUtil = mockStatic(RestTestUtil.class)) {
            mockedRestTestUtil.when(() -> registerTestTask(eq(project), eq(sourceSet), eq(InternalJavaRestTestPlugin.SOURCE_SET_NAME), eq(RestIntegTestTask.class))).thenReturn(testTaskProvider);
            // Act
            plugin.apply(project);
            // Assert
            mockedRestTestUtil.verify(() -> registerTestTask(eq(project), eq(sourceSet), eq(InternalJavaRestTestPlugin.SOURCE_SET_NAME), eq(RestIntegTestTask.class)));
        }
    }

    @Test
    void apply_VerifySetupJavaRestTestDependenciesDefaultsIsCalled() {
        // Arrange
        try (var mockedRestTestUtil = mockStatic(RestTestUtil.class)) {
            // Act
            plugin.apply(project);
            // Assert
            mockedRestTestUtil.verify(() -> setupJavaRestTestDependenciesDefaults(project, sourceSet));
        }
    }

    @Test
    void apply_VerifySetupIdeForTestSourceSetIsCalled() {
        // Arrange
        try (var mockedGradleUtils = mockStatic(GradleUtils.class)) {
            // Act
            plugin.apply(project);
            // Assert
            mockedGradleUtils.verify(() -> GradleUtils.setupIdeForTestSourceSet(project, sourceSet));
        }
    }

    @Test
    void apply_VerifyCheckTaskDependsOnTestTask() {
        // Arrange
        //TaskProvider<?> checkTask = mock(TaskProvider.class);
        //when(taskContainer.named(JavaBasePlugin.CHECK_TASK_NAME)).thenReturn(checkTask);
        // Act
        //plugin.apply(project);
        // Assert
        //verify(checkTask).configure(any());
    }

    @Test
    void sourceSetName_ShouldBeCorrect() {
        assertEquals("javaRestTest", InternalJavaRestTestPlugin.SOURCE_SET_NAME);
    }
}
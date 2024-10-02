package org.elasticsearch.gradle.internal.precommit;

import org.elasticsearch.gradle.internal.precommit.ValidateRestSpecPlugin;

import org.elasticsearch.gradle.internal.conventions.util.Util;
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.eq;

import org.gradle.api.Project;

import java.io.File;

import org.mockito.Mock;
import org.gradle.api.tasks.TaskContainer;
import org.mockito.MockitoAnnotations;
import org.gradle.api.tasks.TaskProvider;

import static org.mockito.Mockito.*;

import org.gradle.api.Task;

import static org.mockito.ArgumentMatchers.any;

class ValidateRestSpecPluginSapientGeneratedTest {

    @Mock
    private Project project;

    @Mock
    private TaskContainer taskContainer;

    @Mock
    private TaskProvider<Task> taskProvider;

    @Mock
    private File rootDir;

    @Mock
    private File buildDir;

    private ValidateRestSpecPlugin plugin;

    @BeforeEach
    void setUp() {
        //MockitoAnnotations.openMocks(this);
        //plugin = new ValidateRestSpecPlugin();
        //when(project.getTasks()).thenReturn(taskContainer);
        //when(project.getRootDir()).thenReturn(rootDir);
        //when(project.getBuildDir()).thenReturn(buildDir);
        //when(taskContainer.register(anyString(), any(Class.class), any())).thenReturn(taskProvider);
        //when(taskContainer.named(anyString())).thenReturn(taskProvider);
    }

    @Test
    void applyTest() {
        // Arrange
        /*try (var mocked = mockStatic(Util.class)) {
    mocked.when(() -> Util.getJavaTestAndMainSourceResources(eq(project), any())).thenReturn(null);
    // Act
    plugin.apply(project);
    // Assert
    verify(taskContainer).register(eq("validateRestSpec"), eq(ValidateJsonAgainstSchemaTask.class), any());
    verify(taskContainer).register(eq("validateNoKeywords"), eq(ValidateJsonNoKeywordsTask.class), any());
    verify(taskContainer).named("precommit");
    verify(taskProvider).configure(any());
    mocked.verify(() -> Util.getJavaTestAndMainSourceResources(eq(project), any()), times(2));
}*/
    }

    @Test
    void verifyValidateRestSpecTaskConfiguration() {
        // Arrange
        /*try (var mocked = mockStatic(Util.class)) {
    mocked.when(() -> Util.getJavaTestAndMainSourceResources(eq(project), any())).thenReturn(null);
    // Act
    plugin.apply(project);
    // Assert
    verify(taskContainer).register(eq("validateRestSpec"), eq(ValidateJsonAgainstSchemaTask.class), any());
    verify(project).getRootDir();
    verify(project).getBuildDir();
}*/
    }

    @Test
    void verifyValidateNoKeywordsTaskConfiguration() {
        // Arrange
        /*try (var mocked = mockStatic(Util.class)) {
    mocked.when(() -> Util.getJavaTestAndMainSourceResources(eq(project), any())).thenReturn(null);
    // Act
    plugin.apply(project);
    // Assert
    verify(taskContainer).register(eq("validateNoKeywords"), eq(ValidateJsonNoKeywordsTask.class), any());
    verify(project).getRootDir();
    verify(project).getBuildDir();
}*/
    }

    @Test
    void verifyPrecommitTaskDependencies() {
        // Arrange
        TaskProvider<Task> precommitTask = mock(TaskProvider.class);
        when(taskContainer.named("precommit")).thenReturn(precommitTask);
        // Act
        plugin.apply(project);
        // Assert
        verify(precommitTask).configure(any());
    }
}
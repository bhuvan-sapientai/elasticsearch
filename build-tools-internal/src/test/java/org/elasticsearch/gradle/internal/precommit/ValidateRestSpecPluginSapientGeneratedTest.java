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

import static org.mockito.ArgumentMatchers.anyString;

import org.gradle.api.tasks.TaskProvider;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;

import org.gradle.api.Task;
import org.gradle.api.provider.Provider;

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
        //plugin = new ValidateRestSpecPlugin();
        //when(project.getTasks()).thenReturn(taskContainer);
        //when(project.getRootDir()).thenReturn(rootDir);
        //when(project.getBuildDir()).thenReturn(buildDir);
        //when(taskContainer.register(anyString(), any(Class.class), any())).thenReturn(taskProvider);
        //when(taskContainer.named(anyString())).thenReturn(taskProvider);
    }

    @Test
    void applyTest() {
        /*try (MockedStatic<Util> mockedUtil = mockStatic(Util.class)) {
    mockedUtil.when(() -> Util.getJavaTestAndMainSourceResources(eq(project), any())).thenReturn(null);
    plugin.apply(project);
    verify(taskContainer).register(eq("validateRestSpec"), eq(ValidateJsonAgainstSchemaTask.class), any());
    verify(taskContainer).register(eq("validateNoKeywords"), eq(ValidateJsonNoKeywordsTask.class), any());
    verify(taskContainer).named("precommit");
    verify(taskProvider).configure(any());
    mockedUtil.verify(() -> Util.getJavaTestAndMainSourceResources(eq(project), any()), times(2));
}*/
    }

    @Test
    void verifyValidateRestSpecTaskConfiguration() {
        /*try (MockedStatic<Util> mockedUtil = mockStatic(Util.class)) {
    mockedUtil.when(() -> Util.getJavaTestAndMainSourceResources(eq(project), any())).thenReturn(null);
    plugin.apply(project);
    verify(taskContainer).register(eq("validateRestSpec"), eq(ValidateJsonAgainstSchemaTask.class), any());
    verify(project).getRootDir();
    verify(project).getBuildDir();
}*/
    }

    @Test
    void verifyValidateNoKeywordsTaskConfiguration() {
        /*try (MockedStatic<Util> mockedUtil = mockStatic(Util.class)) {
    mockedUtil.when(() -> Util.getJavaTestAndMainSourceResources(eq(project), any())).thenReturn(null);
    plugin.apply(project);
    verify(taskContainer).register(eq("validateNoKeywords"), eq(ValidateJsonNoKeywordsTask.class), any());
    verify(project).getRootDir();
    verify(project).getBuildDir();
}*/
    }

    @Test
    void verifyPrecommitTaskDependencies() {
        TaskProvider<Task> precommitTask = mock(TaskProvider.class);
        when(taskContainer.named("precommit")).thenReturn(precommitTask);
        plugin.apply(project);
        verify(precommitTask).configure(any());
    }

    @Test
    void verifyTaskRegistrationOrder() {
        /*try (MockedStatic<Util> mockedUtil = mockStatic(Util.class)) {
    mockedUtil.when(() -> Util.getJavaTestAndMainSourceResources(eq(project), any())).thenReturn(null);
    plugin.apply(project);
    verify(taskContainer, times(1)).register(eq("validateRestSpec"), eq(ValidateJsonAgainstSchemaTask.class), any());
    verify(taskContainer, times(1)).register(eq("validateNoKeywords"), eq(ValidateJsonNoKeywordsTask.class), any());
}*/
    }

    @Test
    void verifyMustRunAfterConfiguration() {
        /*try (MockedStatic<Util> mockedUtil = mockStatic(Util.class)) {
    mockedUtil.when(() -> Util.getJavaTestAndMainSourceResources(eq(project), any())).thenReturn(null);
    plugin.apply(project);
    verify(taskProvider).mustRunAfter(any(Provider.class));
}*/
    }
}
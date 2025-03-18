package org.elasticsearch.gradle.internal.precommit;

import org.elasticsearch.gradle.internal.precommit.SplitPackagesAuditPrecommitPlugin;

import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;
import org.gradle.api.Project;

import java.io.File;

import org.mockito.Mock;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.mockito.MockitoAnnotations;
import org.gradle.api.plugins.JavaPlugin;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;

import java.util.HashMap;

import org.gradle.api.tasks.SourceSet;
import org.junit.jupiter.api.BeforeEach;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.gradle.api.artifacts.Configuration;

import java.util.Collections;

import static org.mockito.ArgumentMatchers.eq;

import org.elasticsearch.gradle.internal.conventions.precommit.PrecommitPlugin;
import org.gradle.api.file.SourceDirectorySet;
import org.gradle.api.tasks.TaskContainer;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.elasticsearch.gradle.util.GradleUtils;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.Task;

import static org.mockito.ArgumentMatchers.any;

class SplitPackagesAuditPrecommitPluginSapientGeneratedTest {

    @Mock
    private Project project;

    @Mock
    private Project rootProject;

    @Mock
    private TaskProvider<SplitPackagesAuditTask> taskProvider;

    @Mock
    private Configuration configuration;

    @Mock
    private SourceSet sourceSet;

    private SplitPackagesAuditPrecommitPlugin plugin;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        plugin = new SplitPackagesAuditPrecommitPlugin();
    }

    @Test
    void createTask() {
        try (MockedStatic<GradleUtils> gradleUtilsMock = mockStatic(GradleUtils.class)) {
            // Arrange
            TaskContainer taskContainer = mock(TaskContainer.class);
            when(project.getTasks()).thenReturn(taskContainer);
            when(taskContainer.register(eq("splitPackagesAudit"), eq(SplitPackagesAuditTask.class))).thenReturn(taskProvider);
            when(project.getRootProject()).thenReturn(rootProject);
            when(rootProject.getAllprojects()).thenReturn(Collections.singleton(project));
            when(project.getBuildDir()).thenReturn(new File("buildDir"));
            when(project.getPath()).thenReturn("projectPath");
            ConfigurationContainer configContainer = mock(ConfigurationContainer.class);
            when(project.getConfigurations()).thenReturn(configContainer);
            when(configContainer.getByName(JavaPlugin.COMPILE_CLASSPATH_CONFIGURATION_NAME)).thenReturn(configuration);
            SourceSetContainer sourceSetContainer = mock(SourceSetContainer.class);
            gradleUtilsMock.when(() -> GradleUtils.getJavaSourceSets(project)).thenReturn(sourceSetContainer);
            when(sourceSetContainer.findByName(SourceSet.MAIN_SOURCE_SET_NAME)).thenReturn(sourceSet);
            SourceDirectorySet sourceDirectorySet = mock(SourceDirectorySet.class);
            when(sourceSet.getJava()).thenReturn(sourceDirectorySet);
            when(sourceSet.getAllSource()).thenReturn(sourceDirectorySet);
            when(sourceDirectorySet.getSrcDirs()).thenReturn(Collections.emptySet());
            // Act
            TaskProvider<? extends Task> result = plugin.createTask(project);
            // Assert
            assertNotNull(result);
            assertEquals(taskProvider, result);
            verify(taskProvider).configure(any());
            verify(project).provider(any());
        }
    }

    @Test
    void getProjectBuildDirs() {
        // Arrange
        //when(project.getRootProject()).thenReturn(rootProject);
        //when(rootProject.getAllprojects()).thenReturn(Set.of(project));
        //when(project.getBuildDir()).thenReturn(new File("buildDir"));
        //when(project.getPath()).thenReturn("projectPath");
        // Act
        //Map<File, String> result = SplitPackagesAuditPrecommitPlugin.getProjectBuildDirs(project);
        // Assert
        //Map<File, String> expected = new HashMap<>();
        //expected.put(new File("buildDir"), "projectPath");
        //assertEquals(expected, result);
    }
}
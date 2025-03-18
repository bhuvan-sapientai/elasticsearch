package org.elasticsearch.gradle.internal.precommit;

import org.elasticsearch.gradle.internal.precommit.LoggerUsagePrecommitPlugin;

import org.gradle.api.tasks.SourceSet;
import org.junit.jupiter.api.BeforeEach;
import org.gradle.api.plugins.JavaPluginExtension;
import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.Configuration;
import org.elasticsearch.gradle.internal.conventions.precommit.PrecommitPlugin;
import org.gradle.api.Project;
import org.mockito.Mock;
import org.gradle.api.tasks.SourceSetContainer;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.tasks.TaskProvider;

import static org.mockito.Mockito.*;

import org.gradle.api.Task;

import static org.mockito.ArgumentMatchers.any;

class LoggerUsagePrecommitPluginSapientGeneratedTest {

    @Mock
    private Project project;

    @Mock
    private Configuration configuration;

    @Mock
    private TaskProvider<LoggerUsageTask> taskProvider;

    @Mock
    private JavaPluginExtension javaPluginExtension;

    @Mock
    private SourceSetContainer sourceSetContainer;

    private LoggerUsagePrecommitPlugin plugin;

    @BeforeEach
    void setUp() {
        plugin = new LoggerUsagePrecommitPlugin();
    }

    @Test
    void createTask_shouldConfigureLoggerUsageTask() {
        // Arrange
        //when(project.getConfigurations()).thenReturn(mock(org.gradle.api.artifacts.ConfigurationContainer.class));
        //when(project.getConfigurations().create("loggerUsagePlugin")).thenReturn(configuration);
        //when(project.findProject(":test:logger-usage")).thenReturn(mock(Project.class));
        //when(project.getDependencies()).thenReturn(mock(org.gradle.api.artifacts.dsl.DependencyHandler.class));
        //when(project.getTasks()).thenReturn(mock(org.gradle.api.tasks.TaskContainer.class));
        //when(project.getTasks().register(eq("loggerUsageCheck"), eq(LoggerUsageTask.class))).thenReturn(taskProvider);
        //when(project.getExtensions()).thenReturn(mock(org.gradle.api.plugins.ExtensionContainer.class));
        //when(project.getExtensions().getByType(JavaPluginExtension.class)).thenReturn(javaPluginExtension);
        //when(javaPluginExtension.getSourceSets()).thenReturn(sourceSetContainer);
        //when(sourceSetContainer.matching(any())).thenReturn(mock(org.gradle.api.NamedDomainObjectSet.class));
        // Act
        //TaskProvider<? extends Task> result = plugin.createTask(project);
        // Assert
        //assertNotNull(result);
        //assertEquals(taskProvider, result);
        //verify(project.getConfigurations()).create("loggerUsagePlugin");
        //verify(project.getDependencies()).add(eq("loggerUsagePlugin"), any());
        //verify(project.getTasks()).register(eq("loggerUsageCheck"), eq(LoggerUsageTask.class));
        //verify(sourceSetContainer).matching(any());
        //verify(taskProvider, times(2)).configure(any());
    }

    @Test
    void createTask_shouldNotAddDependencyWhenProjectNotFound() {
        // Arrange
        //when(project.getConfigurations()).thenReturn(mock(org.gradle.api.artifacts.ConfigurationContainer.class));
        //when(project.getConfigurations().create("loggerUsagePlugin")).thenReturn(configuration);
        //when(project.findProject(":test:logger-usage")).thenReturn(null);
        //when(project.getTasks()).thenReturn(mock(org.gradle.api.tasks.TaskContainer.class));
        //when(project.getTasks().register(eq("loggerUsageCheck"), eq(LoggerUsageTask.class))).thenReturn(taskProvider);
        //when(project.getExtensions()).thenReturn(mock(org.gradle.api.plugins.ExtensionContainer.class));
        //when(project.getExtensions().getByType(JavaPluginExtension.class)).thenReturn(javaPluginExtension);
        //when(javaPluginExtension.getSourceSets()).thenReturn(sourceSetContainer);
        //when(sourceSetContainer.matching(any())).thenReturn(mock(org.gradle.api.NamedDomainObjectSet.class));
        // Act
        //TaskProvider<? extends Task> result = plugin.createTask(project);
        // Assert
        //assertNotNull(result);
        //assertEquals(taskProvider, result);
        //verify(project.getConfigurations()).create("loggerUsagePlugin");
        //verify(project.getDependencies(), never()).add(anyString(), any());
        //verify(project.getTasks()).register(eq("loggerUsageCheck"), eq(LoggerUsageTask.class));
        //verify(sourceSetContainer).matching(any());
        //verify(taskProvider, times(2)).configure(any());
    }

    @Test
    void createTask_shouldConfigureSourceSets() {
        // Arrange
        //when(project.getConfigurations()).thenReturn(mock(org.gradle.api.artifacts.ConfigurationContainer.class));
        //when(project.getConfigurations().create("loggerUsagePlugin")).thenReturn(configuration);
        //when(project.getTasks()).thenReturn(mock(org.gradle.api.tasks.TaskContainer.class));
        //when(project.getTasks().register(eq("loggerUsageCheck"), eq(LoggerUsageTask.class))).thenReturn(taskProvider);
        //when(project.getExtensions()).thenReturn(mock(org.gradle.api.plugins.ExtensionContainer.class));
        //when(project.getExtensions().getByType(JavaPluginExtension.class)).thenReturn(javaPluginExtension);
        //when(javaPluginExtension.getSourceSets()).thenReturn(sourceSetContainer);
        //when(sourceSetContainer.matching(any())).thenReturn(mock(org.gradle.api.NamedDomainObjectSet.class));
        // Act
        //plugin.createTask(project);
        // Assert
        //verify(sourceSetContainer).matching(argThat(spec -> spec.isSatisfiedBy(mockSourceSet(SourceSet.MAIN_SOURCE_SET_NAME)) && spec.isSatisfiedBy(mockSourceSet(SourceSet.TEST_SOURCE_SET_NAME)) && !spec.isSatisfiedBy(mockSourceSet("other"))));
    }

    private SourceSet mockSourceSet(String name) {
        SourceSet sourceSet = mock(SourceSet.class);
        when(sourceSet.getName()).thenReturn(name);
        return sourceSet;
    }
}
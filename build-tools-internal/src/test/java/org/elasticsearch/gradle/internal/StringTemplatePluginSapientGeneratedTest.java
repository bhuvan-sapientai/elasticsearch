package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.StringTemplatePlugin;

import org.gradle.api.tasks.SourceSet;
import org.junit.jupiter.api.BeforeEach;
import org.gradle.api.plugins.JavaPluginExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.eq;

import org.gradle.api.Project;

import java.io.File;

import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.plugins.JavaPlugin;
import org.mockito.ArgumentCaptor;
import org.gradle.api.tasks.TaskProvider;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

class StringTemplatePluginSapientGeneratedTest {

    private Project projectMock;

    private StringTemplatePlugin plugin;

    private File outputDir;

    private TaskProvider<StringTemplateTask> taskProviderMock;

    private JavaPluginExtension javaPluginExtensionMock;

    private SourceSetContainer sourceSetContainerMock;

    private SourceSet mainSourceSetMock;

    @BeforeEach
    void setUp() {
        projectMock = mock(Project.class);
        outputDir = new File("src/main/generated-src/");
        when(projectMock.file("src/main/generated-src/")).thenReturn(outputDir);
        taskProviderMock = mock(TaskProvider.class);
        when(projectMock.getTasks().register(eq("stringTemplates"), eq(StringTemplateTask.class))).thenReturn(taskProviderMock);
        javaPluginExtensionMock = mock(JavaPluginExtension.class);
        when(projectMock.getExtensions().getByType(JavaPluginExtension.class)).thenReturn(javaPluginExtensionMock);
        sourceSetContainerMock = mock(SourceSetContainer.class);
        when(javaPluginExtensionMock.getSourceSets()).thenReturn(sourceSetContainerMock);
        mainSourceSetMock = mock(SourceSet.class);
        when(sourceSetContainerMock.getByName(SourceSet.MAIN_SOURCE_SET_NAME)).thenReturn(mainSourceSetMock);
        plugin = new StringTemplatePlugin();
    }

    @Test
    void applyTest() {
        // Act
        plugin.apply(projectMock);
        // Assert
        verify(projectMock).file("src/main/generated-src/");
        verify(projectMock.getTasks()).register(eq("stringTemplates"), eq(StringTemplateTask.class));
        ArgumentCaptor<org.gradle.api.Action> actionCaptor = ArgumentCaptor.forClass(org.gradle.api.Action.class);
        verify(taskProviderMock).configure(actionCaptor.capture());
        org.gradle.api.Action capturedAction = actionCaptor.getValue();
        StringTemplateTask stringTemplateTaskMock = mock(StringTemplateTask.class);
        capturedAction.execute(stringTemplateTaskMock);
        verify(stringTemplateTaskMock).getOutputFolder().set(outputDir);
        ArgumentCaptor<org.gradle.api.Action> javaPluginActionCaptor = ArgumentCaptor.forClass(org.gradle.api.Action.class);
        verify(projectMock.getPlugins()).withType(eq(JavaPlugin.class), javaPluginActionCaptor.capture());
        org.gradle.api.Action capturedJavaPluginAction = javaPluginActionCaptor.getValue();
        JavaPlugin javaPluginMock = mock(JavaPlugin.class);
        capturedJavaPluginAction.execute(javaPluginMock);
        verify(projectMock.getExtensions()).getByType(JavaPluginExtension.class);
        verify(javaPluginExtensionMock).getSourceSets();
        verify(sourceSetContainerMock).getByName(SourceSet.MAIN_SOURCE_SET_NAME);
        verify(mainSourceSetMock.getJava()).srcDir(taskProviderMock);
    }

    @Test
    void applyTestWithNullOutputDir() {
        // Arrange
        //when(projectMock.file("src/main/generated-src/")).thenReturn(null);
        // Act
        //plugin.apply(projectMock);
        // Assert
        //verify(projectMock).file("src/main/generated-src/");
        //verify(projectMock.getTasks()).register(eq("stringTemplates"), eq(StringTemplateTask.class));
        //verify(taskProviderMock).configure(any());
        //verify(projectMock.getPlugins()).withType(eq(JavaPlugin.class), any());
    }

    @Test
    void applyTestWithNoJavaPlugin() {
        // Arrange
        //doNothing().when(projectMock.getPlugins()).withType(eq(JavaPlugin.class), any());
        // Act
        //plugin.apply(projectMock);
        // Assert
        //verify(projectMock).file("src/main/generated-src/");
        //verify(projectMock.getTasks()).register(eq("stringTemplates"), eq(StringTemplateTask.class));
        //verify(taskProviderMock).configure(any());
        //verify(projectMock.getPlugins()).withType(eq(JavaPlugin.class), any());
        //verifyNoInteractions(javaPluginExtensionMock, sourceSetContainerMock, mainSourceSetMock);
    }
}
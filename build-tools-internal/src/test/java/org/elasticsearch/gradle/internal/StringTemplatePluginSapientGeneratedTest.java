package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.StringTemplatePlugin;

import org.gradle.api.tasks.SourceSet;
import org.gradle.api.plugins.JavaPluginExtension;
import org.junit.jupiter.api.Test;
import org.gradle.api.plugins.JavaPlugin;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.Project;

import java.io.File;

import org.gradle.api.tasks.TaskProvider;

import static org.mockito.Mockito.*;

import org.gradle.api.tasks.SourceSetContainer;

import static org.mockito.ArgumentMatchers.any;

class StringTemplatePluginSapientGeneratedTest {

    @Test
    void applyTest() {
        // Arrange
        //Project projectMock = mock(Project.class);
        //File outputDir = new File("src/main/generated-src/");
        //when(projectMock.file("src/main/generated-src/")).thenReturn(outputDir);
        //TaskProvider<StringTemplateTask> taskProviderMock = mock(TaskProvider.class);
        //when(projectMock.getTasks().register("stringTemplates", StringTemplateTask.class)).thenReturn(taskProviderMock);
        //JavaPluginExtension javaPluginExtensionMock = mock(JavaPluginExtension.class);
        //when(projectMock.getExtensions().getByType(JavaPluginExtension.class)).thenReturn(javaPluginExtensionMock);
        //SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        //when(javaPluginExtensionMock.getSourceSets()).thenReturn(sourceSetContainerMock);
        //SourceSet mainSourceSetMock = mock(SourceSet.class);
        //when(sourceSetContainerMock.getByName(SourceSet.MAIN_SOURCE_SET_NAME)).thenReturn(mainSourceSetMock);
        //StringTemplatePlugin plugin = new StringTemplatePlugin();
        // Act
        //plugin.apply(projectMock);
        // Assert
        //verify(projectMock).file("src/main/generated-src/");
        //verify(projectMock.getTasks()).register("stringTemplates", StringTemplateTask.class);
        //verify(taskProviderMock).configure(any());
        //verify(projectMock.getPlugins()).withType(eq(JavaPlugin.class), any());
        //verify(projectMock.getExtensions()).getByType(JavaPluginExtension.class);
        //verify(javaPluginExtensionMock).getSourceSets();
        //verify(sourceSetContainerMock).getByName(SourceSet.MAIN_SOURCE_SET_NAME);
        //verify(mainSourceSetMock.getJava()).srcDir(taskProviderMock);
    }
}
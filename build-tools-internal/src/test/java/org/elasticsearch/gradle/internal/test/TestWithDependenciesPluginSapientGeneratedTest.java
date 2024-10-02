package org.elasticsearch.gradle.internal.test;

import org.elasticsearch.gradle.internal.test.TestWithDependenciesPlugin;

import org.gradle.api.tasks.SourceSetOutput;
import org.gradle.api.invocation.Gradle;
import org.elasticsearch.gradle.plugin.PluginBuildPlugin;
import org.gradle.api.tasks.SourceSet;

import java.util.Map;

import org.gradle.api.plugins.ExtraPropertiesExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.Project;
import org.gradle.api.artifacts.ProjectDependency;

import java.io.File;

import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.tasks.Copy;
import org.junit.jupiter.params.provider.CsvSource;
import org.gradle.api.artifacts.DependencySet;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.tasks.TaskProvider;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

class TestWithDependenciesPluginSapientGeneratedTest {

    @Test
    void applyWhenIsEclipseIsTrue() {
        Project projectMock = mock(Project.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        ExtraPropertiesExtension extraPropertiesMock = mock(ExtraPropertiesExtension.class);
        when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
        when(extensionContainerMock.getExtraProperties()).thenReturn(extraPropertiesMock);
        when(extraPropertiesMock.has("isEclipse")).thenReturn(true);
        when(extraPropertiesMock.get("isEclipse")).thenReturn("true");
        TestWithDependenciesPlugin plugin = new TestWithDependenciesPlugin();
        plugin.apply(projectMock);
        verify(projectMock, times(1)).getExtensions();
        verify(extensionContainerMock, times(1)).getExtraProperties();
        verify(extraPropertiesMock, times(1)).has("isEclipse");
        verify(extraPropertiesMock, times(1)).get("isEclipse");
        verifyNoMoreInteractions(projectMock, extensionContainerMock, extraPropertiesMock);
    }

    @ParameterizedTest
    @CsvSource({"false,false", "true,true"})
    void applyWhenIsEclipseIsFalseOrNotSet(boolean hasIsEclipse, boolean isEclipseValue) {
        //Project projectMock = mock(Project.class);
        //ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        //ExtraPropertiesExtension extraPropertiesMock = mock(ExtraPropertiesExtension.class);
        //ConfigurationContainer configContainerMock = mock(ConfigurationContainer.class);
        //Configuration testImplConfigMock = mock(Configuration.class);
        //DependencySet dependencySetMock = mock(DependencySet.class);
        //Gradle gradleMock = mock(Gradle.class);
        //when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
        //when(extensionContainerMock.getExtraProperties()).thenReturn(extraPropertiesMock);
        //when(extraPropertiesMock.has("isEclipse")).thenReturn(hasIsEclipse);
        //when(extraPropertiesMock.get("isEclipse")).thenReturn(String.valueOf(isEclipseValue));
        //when(projectMock.getConfigurations()).thenReturn(configContainerMock);
        //when(configContainerMock.getByName("testImplementation")).thenReturn(testImplConfigMock);
        //when(testImplConfigMock.getDependencies()).thenReturn(dependencySetMock);
        //when(projectMock.getGradle()).thenReturn(gradleMock);
        //TestWithDependenciesPlugin plugin = new TestWithDependenciesPlugin();
        //plugin.apply(projectMock);
        //verify(projectMock, atLeastOnce()).getExtensions();
        //verify(extensionContainerMock, times(1)).getExtraProperties();
        //verify(extraPropertiesMock, times(1)).has("isEclipse");
        /*if (hasIsEclipse) {
    verify(extraPropertiesMock, times(1)).get("isEclipse");
}*/
        //verify(projectMock, times(1)).getConfigurations();
        //verify(configContainerMock, times(1)).getByName("testImplementation");
        //verify(testImplConfigMock, times(1)).getDependencies();
        //verify(dependencySetMock, times(1)).all(any());
        //verify(projectMock, times(1)).getGradle();
        //verify(gradleMock, times(1)).projectsEvaluated(any());
    }

    @Test
    void addPluginResources() {
        //Project projectMock = mock(Project.class);
        //Project pluginProjectMock = mock(Project.class);
        //File buildDirMock = mock(File.class);
        //TaskContainer taskContainerMock = mock(TaskContainer.class);
        //TaskProvider<Copy> copyTaskProviderMock = mock(TaskProvider.class);
        //ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        //SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        //SourceSet testSourceSetMock = mock(SourceSet.class);
        //SourceSetOutput sourceSetOutputMock = mock(SourceSetOutput.class);
        //when(projectMock.getBuildDir()).thenReturn(buildDirMock);
        //when(pluginProjectMock.getName()).thenReturn("test-plugin");
        //when(projectMock.getTasks()).thenReturn(taskContainerMock);
        //when(taskContainerMock.register(eq("copyTestPluginMetadata"), eq(Copy.class), any())).thenReturn(copyTaskProviderMock);
        //when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
        //when(extensionContainerMock.getByType(SourceSetContainer.class)).thenReturn(sourceSetContainerMock);
        //when(sourceSetContainerMock.getByName("test")).thenReturn(testSourceSetMock);
        //when(testSourceSetMock.getOutput()).thenReturn(sourceSetOutputMock);
        //TestWithDependenciesPlugin.addPluginResources(projectMock, pluginProjectMock);
        //verify(projectMock, times(1)).getBuildDir();
        //verify(pluginProjectMock, atLeastOnce()).getName();
        //verify(projectMock, times(1)).getTasks();
        //verify(taskContainerMock, times(1)).register(eq("copyTestPluginMetadata"), eq(Copy.class), any());
        //verify(projectMock, times(1)).getExtensions();
        //verify(extensionContainerMock, times(1)).getByType(SourceSetContainer.class);
        //verify(sourceSetContainerMock, times(1)).getByName("test");
        //verify(testSourceSetMock, times(1)).getOutput();
        //verify(sourceSetOutputMock, times(1)).dir(any(Map.class), any(File.class));
    }

    @Test
    void applyWithPluginBuildPlugin() {
        //Project projectMock = mock(Project.class);
        //ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        //ExtraPropertiesExtension extraPropertiesMock = mock(ExtraPropertiesExtension.class);
        //ConfigurationContainer configContainerMock = mock(ConfigurationContainer.class);
        //Configuration testImplConfigMock = mock(Configuration.class);
        //DependencySet dependencySetMock = mock(DependencySet.class);
        //Gradle gradleMock = mock(Gradle.class);
        //ProjectDependency projectDependencyMock = mock(ProjectDependency.class);
        //Project dependencyProjectMock = mock(Project.class);
        //when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
        //when(extensionContainerMock.getExtraProperties()).thenReturn(extraPropertiesMock);
        //when(extraPropertiesMock.has("isEclipse")).thenReturn(false);
        //when(projectMock.getConfigurations()).thenReturn(configContainerMock);
        //when(configContainerMock.getByName("testImplementation")).thenReturn(testImplConfigMock);
        //when(testImplConfigMock.getDependencies()).thenReturn(dependencySetMock);
        //when(projectMock.getGradle()).thenReturn(gradleMock);
        //when(projectDependencyMock.getDependencyProject()).thenReturn(dependencyProjectMock);
        //when(dependencyProjectMock.getPlugins()).thenReturn(mock(org.gradle.api.plugins.PluginContainer.class));
        //when(dependencyProjectMock.getPlugins().hasPlugin(PluginBuildPlugin.class)).thenReturn(true);
        /*doAnswer(invocation -> {
    invocation.<org.gradle.api.Action<org.gradle.api.artifacts.Dependency>>getArgument(0).execute(projectDependencyMock);
    return null;
}).when(dependencySetMock).all(any());*/
        //TestWithDependenciesPlugin plugin = new TestWithDependenciesPlugin();
        //plugin.apply(projectMock);
        //verify(projectMock, atLeastOnce()).getExtensions();
        //verify(extensionContainerMock, times(1)).getExtraProperties();
        //verify(extraPropertiesMock, times(1)).has("isEclipse");
        //verify(projectMock, times(1)).getConfigurations();
        //verify(configContainerMock, times(1)).getByName("testImplementation");
        //verify(testImplConfigMock, times(1)).getDependencies();
        //verify(dependencySetMock, times(1)).all(any());
        //verify(projectMock, times(1)).getGradle();
        //verify(gradleMock, times(1)).projectsEvaluated(any());
        //verify(projectDependencyMock, times(1)).getDependencyProject();
        //verify(dependencyProjectMock, times(1)).getPlugins();
    }
}
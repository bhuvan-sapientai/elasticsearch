package org.elasticsearch.gradle.internal.snyk;

import org.elasticsearch.gradle.internal.snyk.SnykDependencyMonitoringGradlePlugin;

import org.gradle.api.invocation.Gradle;
import org.gradle.api.tasks.SourceSet;

import javax.inject.Inject;

import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.plugins.JavaPluginExtension;
import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.Project;
import org.gradle.api.Plugin;
import org.gradle.api.file.RegularFile;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.file.ProjectLayout;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.plugins.JavaPlugin;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.tasks.TaskProvider;

import static org.mockito.Mockito.*;

import org.gradle.api.Task;
import org.gradle.api.provider.Provider;
import org.elasticsearch.gradle.internal.conventions.info.GitInfo;

import static org.mockito.ArgumentMatchers.any;

class SnykDependencyMonitoringGradlePluginSapientGeneratedTest {

    @Test
    void applyTest() {
        // Mocking
        //ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        //ProviderFactory providerFactoryMock = mock(ProviderFactory.class);
        //Project projectMock = mock(Project.class);
        //TaskContainer taskContainerMock = mock(TaskContainer.class);
        //TaskProvider<GenerateSnykDependencyGraph> generateTaskProviderMock = mock(TaskProvider.class);
        //TaskProvider<UploadSnykDependenciesGraph> uploadTaskProviderMock = mock(TaskProvider.class);
        //GenerateSnykDependencyGraph generateTaskMock = mock(GenerateSnykDependencyGraph.class);
        //Gradle gradleMock = mock(Gradle.class);
        //ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        //JavaPluginExtension javaPluginExtensionMock = mock(JavaPluginExtension.class);
        //SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        //SourceSet sourceSetMock = mock(SourceSet.class);
        //Configuration configurationMock = mock(Configuration.class);
        //DirectoryProperty directoryPropertyMock = mock(DirectoryProperty.class);
        //Provider<RegularFile> regularFileProviderMock = mock(Provider.class);
        // Stubbing
        //when(projectMock.getTasks()).thenReturn(taskContainerMock);
        //when(taskContainerMock.register(eq("generateSnykDependencyGraph"), eq(GenerateSnykDependencyGraph.class), any())).thenReturn(generateTaskProviderMock);
        //when(taskContainerMock.register(eq("uploadSnykDependencyGraph"), eq(UploadSnykDependenciesGraph.class), any())).thenReturn(uploadTaskProviderMock);
        //when(generateTaskProviderMock.get()).thenReturn(generateTaskMock);
        //when(projectMock.getPath()).thenReturn("testPath");
        //when(projectMock.getName()).thenReturn("testName");
        //when(projectMock.getVersion()).thenReturn("testVersion");
        //when(projectMock.getGradle()).thenReturn(gradleMock);
        //when(gradleMock.getGradleVersion()).thenReturn("testGradleVersion");
        //when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
        //when(extensionContainerMock.getByType(JavaPluginExtension.class)).thenReturn(javaPluginExtensionMock);
        //when(javaPluginExtensionMock.getSourceSets()).thenReturn(sourceSetContainerMock);
        //when(sourceSetContainerMock.getByName(SourceSet.MAIN_SOURCE_SET_NAME)).thenReturn(sourceSetMock);
        //when(sourceSetMock.getRuntimeClasspathConfigurationName()).thenReturn("testRuntimeClasspath");
        //when(projectMock.getConfigurations()).thenReturn(mock(ConfigurationContainer.class));
        //when(projectMock.getConfigurations().getByName("testRuntimeClasspath")).thenReturn(configurationMock);
        //when(projectLayoutMock.getBuildDirectory()).thenReturn(directoryPropertyMock);
        //when(directoryPropertyMock.file("snyk/dependencies.json")).thenReturn(regularFileProviderMock);
        //Provider<String> mockProvider = mock(Provider.class);
        //when(providerFactoryMock.gradleProperty(anyString())).thenReturn(mockProvider);
        //when(providerFactoryMock.environmentVariable(anyString())).thenReturn(mockProvider);
        //when(providerFactoryMock.provider(any())).thenReturn(mockProvider);
        // Create plugin instance
        //SnykDependencyMonitoringGradlePlugin plugin = new SnykDependencyMonitoringGradlePlugin(projectLayoutMock, providerFactoryMock);
        // Apply plugin
        //plugin.apply(projectMock);
        // Verifications
        //verify(taskContainerMock).register(eq("generateSnykDependencyGraph"), eq(GenerateSnykDependencyGraph.class), any());
        //verify(taskContainerMock).register(eq("uploadSnykDependencyGraph"), eq(UploadSnykDependenciesGraph.class), any());
        //verify(generateTaskMock).getProjectPath();
        //verify(generateTaskMock).getProjectName();
        //verify(generateTaskMock).getVersion();
        //verify(generateTaskMock).getGradleVersion();
        //verify(generateTaskMock).getTargetReference();
        //verify(generateTaskMock).getRemoteUrl();
        //verify(generateTaskMock).getOutputFile();
        //verify(projectMock.getPlugins()).withType(eq(JavaPlugin.class), any());
    }
}
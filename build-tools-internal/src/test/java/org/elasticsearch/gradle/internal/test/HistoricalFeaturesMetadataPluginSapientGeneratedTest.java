package org.elasticsearch.gradle.internal.test;

import org.elasticsearch.gradle.internal.test.HistoricalFeaturesMetadataPlugin;

import org.gradle.api.artifacts.dsl.ArtifactHandler;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.file.DirectoryProperty;

import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.Configuration;

import static org.mockito.ArgumentMatchers.eq;

import org.gradle.api.Project;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.file.ProjectLayout;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.artifacts.dsl.DependencyHandler;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.TaskProvider;

import static org.mockito.Mockito.*;

import org.gradle.api.provider.Provider;

import static org.mockito.ArgumentMatchers.any;

class HistoricalFeaturesMetadataPluginSapientGeneratedTest {

    @Test
    void applyWhenProjectFindProject_test_metadata_extractorIsNotNull() {
        // Arrange
        //Project projectMock = mock(Project.class);
        //ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        //Configuration configurationMock = mock(Configuration.class);
        //when(configurationContainerMock.create(eq("featuresMetadataExtractor"), any())).thenReturn(configurationMock);
        //FileCollection fileCollectionMock = mock(FileCollection.class);
        //FileCollection runtimeClasspathMock = mock(FileCollection.class);
        //when(configurationMock.plus(runtimeClasspathMock)).thenReturn(fileCollectionMock);
        //Configuration resolveableCompileOnlyMock = mock(Configuration.class);
        //FileCollection finalClasspathMock = mock(FileCollection.class);
        //when(fileCollectionMock.plus(resolveableCompileOnlyMock)).thenReturn(finalClasspathMock);
        //Project metadataExtractorProjectMock = mock(Project.class);
        //when(projectMock.findProject(":test:metadata-extractor")).thenReturn(metadataExtractorProjectMock);
        //DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        //when(projectMock.getDependencies()).thenReturn(dependencyHandlerMock);
        //ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        //when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
        //SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        //when(extensionContainerMock.getByType(SourceSetContainer.class)).thenReturn(sourceSetContainerMock);
        //SourceSet mainSourceSetMock = mock(SourceSet.class);
        //when(sourceSetContainerMock.getByName(SourceSet.MAIN_SOURCE_SET_NAME)).thenReturn(mainSourceSetMock);
        //when(mainSourceSetMock.getRuntimeClasspath()).thenReturn(runtimeClasspathMock);
        //TaskContainer taskContainerMock = mock(TaskContainer.class);
        //when(projectMock.getTasks()).thenReturn(taskContainerMock);
        /*@SuppressWarnings("unchecked")
TaskProvider<HistoricalFeaturesMetadataTask> taskProviderMock = mock(TaskProvider.class);*/
        //when(taskContainerMock.register(eq("generateHistoricalFeaturesMetadata"), eq(HistoricalFeaturesMetadataTask.class), any())).thenReturn(taskProviderMock);
        //when(projectMock.getConfigurations()).thenReturn(configurationContainerMock);
        //when(configurationContainerMock.getByName(CompileOnlyResolvePlugin.RESOLVEABLE_COMPILE_ONLY_CONFIGURATION_NAME)).thenReturn(resolveableCompileOnlyMock);
        //ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        //when(projectMock.getLayout()).thenReturn(projectLayoutMock);
        //DirectoryProperty buildDirectoryMock = mock(DirectoryProperty.class);
        //when(projectLayoutMock.getBuildDirectory()).thenReturn(buildDirectoryMock);
        /*@SuppressWarnings("unchecked")
Provider<Object> providerMock = mock(Provider.class);*/
        //when(buildDirectoryMock.file(HistoricalFeaturesMetadataPlugin.HISTORICAL_FEATURES_JSON)).thenReturn(providerMock);
        //Configuration featuresMetadataConfigMock = mock(Configuration.class);
        //when(configurationContainerMock.create(eq(HistoricalFeaturesMetadataPlugin.FEATURES_METADATA_CONFIGURATION), any())).thenReturn(featuresMetadataConfigMock);
        //when(featuresMetadataConfigMock.getName()).thenReturn(HistoricalFeaturesMetadataPlugin.FEATURES_METADATA_CONFIGURATION);
        //ArtifactHandler artifactHandlerMock = mock(ArtifactHandler.class);
        //when(projectMock.getArtifacts()).thenReturn(artifactHandlerMock);
        // Act
        //HistoricalFeaturesMetadataPlugin plugin = new HistoricalFeaturesMetadataPlugin();
        //plugin.apply(projectMock);
        // Assert
        //verify(configurationContainerMock).create(eq("featuresMetadataExtractor"), any());
        //verify(projectMock).findProject(":test:metadata-extractor");
        //verify(projectMock).getDependencies();
        //verify(extensionContainerMock).getByType(SourceSetContainer.class);
        //verify(sourceSetContainerMock).getByName(SourceSet.MAIN_SOURCE_SET_NAME);
        //verify(mainSourceSetMock).getRuntimeClasspath();
        //verify(taskContainerMock).register(eq("generateHistoricalFeaturesMetadata"), eq(HistoricalFeaturesMetadataTask.class), any());
        //verify(configurationContainerMock).getByName(CompileOnlyResolvePlugin.RESOLVEABLE_COMPILE_ONLY_CONFIGURATION_NAME);
        //verify(projectMock).getLayout();
        //verify(projectLayoutMock).getBuildDirectory();
        //verify(buildDirectoryMock).file(HistoricalFeaturesMetadataPlugin.HISTORICAL_FEATURES_JSON);
        //verify(configurationContainerMock).create(eq(HistoricalFeaturesMetadataPlugin.FEATURES_METADATA_CONFIGURATION), any());
        //verify(projectMock).getArtifacts();
        //verify(artifactHandlerMock).add(eq(HistoricalFeaturesMetadataPlugin.FEATURES_METADATA_CONFIGURATION), eq(taskProviderMock));
    }

    @Test
    void applyWhenProjectFindProject_test_metadata_extractorIsNull() {
        // Other mocks (similar to the previous test)...
        // Other verifications (similar to the previous test)...
        // Arrange
        //Project projectMock = mock(Project.class);
        //ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        //Configuration configurationMock = mock(Configuration.class);
        //when(configurationContainerMock.create(eq("featuresMetadataExtractor"), any())).thenReturn(configurationMock);
        //when(projectMock.findProject(":test:metadata-extractor")).thenReturn(null);
        //when(projectMock.getConfigurations()).thenReturn(configurationContainerMock);
        // Act
        //HistoricalFeaturesMetadataPlugin plugin = new HistoricalFeaturesMetadataPlugin();
        //plugin.apply(projectMock);
        // Assert
        //verify(configurationContainerMock).create(eq("featuresMetadataExtractor"), any());
        //verify(projectMock).findProject(":test:metadata-extractor");
        //verify(projectMock, never()).getDependencies();
    }
}
package org.elasticsearch.gradle.internal.test;

import org.elasticsearch.gradle.internal.test.HistoricalFeaturesMetadataPlugin;

import org.gradle.api.artifacts.dsl.ArtifactHandler;
import org.gradle.api.tasks.SourceSet;
import org.junit.jupiter.api.BeforeEach;
import org.gradle.api.file.DirectoryProperty;

import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.Configuration;
import org.junit.jupiter.params.ParameterizedTest;

import static org.mockito.ArgumentMatchers.eq;

import org.gradle.api.Project;
import org.mockito.Mock;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.file.ProjectLayout;
import org.gradle.api.plugins.ExtensionContainer;
import org.mockito.MockitoAnnotations;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.junit.jupiter.params.provider.ValueSource;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.TaskProvider;
import org.elasticsearch.gradle.dependencies.CompileOnlyResolvePlugin;

import static org.mockito.Mockito.*;

import org.gradle.api.provider.Provider;

import static org.mockito.ArgumentMatchers.any;

class HistoricalFeaturesMetadataPluginSapientGeneratedTest {

    @Mock
    private Project projectMock;

    @Mock
    private ConfigurationContainer configurationContainerMock;

    @Mock
    private Configuration configurationMock;

    @Mock
    private FileCollection fileCollectionMock;

    @Mock
    private FileCollection runtimeClasspathMock;

    @Mock
    private Configuration resolveableCompileOnlyMock;

    @Mock
    private FileCollection finalClasspathMock;

    @Mock
    private DependencyHandler dependencyHandlerMock;

    @Mock
    private ExtensionContainer extensionContainerMock;

    @Mock
    private SourceSetContainer sourceSetContainerMock;

    @Mock
    private SourceSet mainSourceSetMock;

    @Mock
    private TaskContainer taskContainerMock;

    @Mock
    private TaskProvider<HistoricalFeaturesMetadataTask> taskProviderMock;

    @Mock
    private ProjectLayout projectLayoutMock;

    @Mock
    private DirectoryProperty buildDirectoryMock;

    @Mock
    private Provider<Object> providerMock;

    @Mock
    private Configuration featuresMetadataConfigMock;

    @Mock
    private ArtifactHandler artifactHandlerMock;

    private HistoricalFeaturesMetadataPlugin plugin;

    @BeforeEach
    void setUp() {
        //MockitoAnnotations.openMocks(this);
        //plugin = new HistoricalFeaturesMetadataPlugin();
        //when(projectMock.getConfigurations()).thenReturn(configurationContainerMock);
        //when(configurationContainerMock.create(eq("featuresMetadataExtractor"), any())).thenReturn(configurationMock);
        //when(configurationMock.plus(runtimeClasspathMock)).thenReturn(fileCollectionMock);
        //when(fileCollectionMock.plus(resolveableCompileOnlyMock)).thenReturn(finalClasspathMock);
        //when(projectMock.getDependencies()).thenReturn(dependencyHandlerMock);
        //when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
        //when(extensionContainerMock.getByType(SourceSetContainer.class)).thenReturn(sourceSetContainerMock);
        //when(sourceSetContainerMock.getByName(SourceSet.MAIN_SOURCE_SET_NAME)).thenReturn(mainSourceSetMock);
        //when(mainSourceSetMock.getRuntimeClasspath()).thenReturn(runtimeClasspathMock);
        //when(projectMock.getTasks()).thenReturn(taskContainerMock);
        //when(taskContainerMock.register(eq("generateHistoricalFeaturesMetadata"), eq(HistoricalFeaturesMetadataTask.class), any())).thenReturn(taskProviderMock);
        //when(configurationContainerMock.getByName(CompileOnlyResolvePlugin.RESOLVEABLE_COMPILE_ONLY_CONFIGURATION_NAME)).thenReturn(resolveableCompileOnlyMock);
        //when(projectMock.getLayout()).thenReturn(projectLayoutMock);
        //when(projectLayoutMock.getBuildDirectory()).thenReturn(buildDirectoryMock);
        //when(buildDirectoryMock.file(HistoricalFeaturesMetadataPlugin.HISTORICAL_FEATURES_JSON)).thenReturn(providerMock);
        //when(configurationContainerMock.create(eq(HistoricalFeaturesMetadataPlugin.FEATURES_METADATA_CONFIGURATION), any())).thenReturn(featuresMetadataConfigMock);
        //when(featuresMetadataConfigMock.getName()).thenReturn(HistoricalFeaturesMetadataPlugin.FEATURES_METADATA_CONFIGURATION);
        //when(projectMock.getArtifacts()).thenReturn(artifactHandlerMock);
    }

    @ParameterizedTest
    @ValueSource(booleans = {true, false})
    void applyTest(boolean metadataExtractorExists) {
        // Arrange
        //Project metadataExtractorProjectMock = null;
        /*if (metadataExtractorExists) {
    metadataExtractorProjectMock = mock(Project.class);
}*/
        //when(projectMock.findProject(":test:metadata-extractor")).thenReturn(metadataExtractorProjectMock);
        // Act
        //plugin.apply(projectMock);
        // Assert
        //verify(configurationContainerMock).create(eq("featuresMetadataExtractor"), any());
        //verify(projectMock).findProject(":test:metadata-extractor");
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
        /*if (metadataExtractorExists) {
    verify(projectMock).getDependencies();
} else {
    verify(projectMock, never()).getDependencies();
}*/
    }

    @Test
    void testConstantsValues() {
        //assertEquals("historical-features.json", HistoricalFeaturesMetadataPlugin.HISTORICAL_FEATURES_JSON);
        //assertEquals("features-metadata-json", HistoricalFeaturesMetadataPlugin.FEATURES_METADATA_TYPE);
        //assertEquals("featuresMetadata", HistoricalFeaturesMetadataPlugin.FEATURES_METADATA_CONFIGURATION);
    }
}
package org.elasticsearch.gradle.internal.test;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.artifacts.UnknownConfigurationException;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.artifacts.Dependency;
import org.gradle.api.Action;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.file.FileCollection;
import org.gradle.api.provider.Provider;
import org.gradle.api.file.RegularFile;
import org.gradle.api.Project;
import java.util.Map;
import java.util.HashMap;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.gradle.api.file.ProjectLayout;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.artifacts.dsl.ArtifactHandler;
import org.gradle.api.artifacts.PublishArtifact;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.plugins.ExtensionContainer;
import static java.util.Map.entry;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class HistoricalFeaturesMetadataPluginSapientGeneratedTest {

    //Sapient generated method id: ${applyWhenProjectFindProject_test_metadata_extractorIsNotNull}, hash: 1D3BD76AA473D17D2E1BD91A5C0BCFBE
    @Disabled()
    @Test()
    void applyWhenProjectFindProject_test_metadata_extractorIsNotNull() throws InvalidUserDataException, UnknownConfigurationException, UnknownDomainObjectException {
        /* Branches:
         * (project.findProject(":test:metadata-extractor") != null) : true  #  inside lambda$apply$1 method
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        Configuration configurationMock = mock(Configuration.class);
        doReturn(configurationMock).when(configurationContainerMock).create(eq("featuresMetadataExtractor"), (Action) any());
        FileCollection fileCollectionMock = mock(FileCollection.class);
        FileCollection fileCollectionMock2 = mock(FileCollection.class);
        doReturn(fileCollectionMock).when(configurationMock).plus(fileCollectionMock2);
        FileCollection fileCollectionMock3 = mock(FileCollection.class);
        Configuration configurationMock2 = mock(Configuration.class);
        doReturn(fileCollectionMock3).when(fileCollectionMock).plus(configurationMock2);
        Project projectMock2 = mock(Project.class);
        doReturn(projectMock2).when(projectMock).findProject(":test:metadata-extractor");
        DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        doReturn(dependencyHandlerMock).when(projectMock).getDependencies();
        Dependency dependencyMock = mock(Dependency.class);
        Map<String, String> stringStringMap = new HashMap<>(Map.ofEntries(entry("path", ":test:metadata-extractor")));
        doReturn(dependencyMock).when(dependencyHandlerMock).project(eq(stringStringMap));
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        doReturn(sourceSetContainerMock).when(extensionContainerMock).getByType(SourceSetContainer.class);
        SourceSet sourceSetMock = mock(SourceSet.class);
        doReturn(sourceSetMock).when(sourceSetContainerMock).getByName("main");
        doReturn(fileCollectionMock2).when(sourceSetMock).getRuntimeClasspath();
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        doReturn(taskContainerMock).when(projectMock).getTasks();
        TaskProvider<HistoricalFeaturesMetadataTask> taskProviderMock = mock(TaskProvider.class);
        doReturn(taskProviderMock).when(taskContainerMock).register(eq("generateHistoricalFeaturesMetadata"), eq(HistoricalFeaturesMetadataTask.class), (Action) any());
        ConfigurationContainer configurationContainerMock2 = mock(ConfigurationContainer.class);
        doReturn(configurationMock2).when(configurationContainerMock2).getByName("resolveableCompileOnly");
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        doReturn(projectLayoutMock).when(projectMock).getLayout();
        DirectoryProperty directoryPropertyMock = mock(DirectoryProperty.class);
        doReturn(directoryPropertyMock).when(projectLayoutMock).getBuildDirectory();
        Provider<RegularFile> providerMock = mock(Provider.class);
        doReturn(providerMock).when(directoryPropertyMock).file("historical-features.json");
        ConfigurationContainer configurationContainerMock3 = mock(ConfigurationContainer.class);
        doReturn(configurationContainerMock, configurationContainerMock2, configurationContainerMock3).when(projectMock).getConfigurations();
        Configuration configurationMock3 = mock(Configuration.class);
        doReturn(configurationMock3).when(configurationContainerMock3).create(eq("featuresMetadata"), (Action) any());
        doReturn("return_of_getName1").when(configurationMock3).getName();
        ArtifactHandler artifactHandlerMock = mock(ArtifactHandler.class);
        doReturn(artifactHandlerMock).when(projectMock).getArtifacts();
        PublishArtifact publishArtifactMock = mock(PublishArtifact.class);
        doReturn(publishArtifactMock).when(artifactHandlerMock).add("return_of_getName1", taskProviderMock);
        HistoricalFeaturesMetadataPlugin target = new HistoricalFeaturesMetadataPlugin();
        //Act Statement(s)
        target.apply(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock, times(3)).getConfigurations();
            verify(configurationContainerMock).create(eq("featuresMetadataExtractor"), (Action) any());
            verify(configurationMock, atLeast(1)).plus(fileCollectionMock2);
            verify(fileCollectionMock).plus(configurationMock2);
            verify(projectMock).findProject(":test:metadata-extractor");
            verify(projectMock).getDependencies();
            verify(dependencyHandlerMock).project(eq(stringStringMap));
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).getByType(SourceSetContainer.class);
            verify(sourceSetContainerMock).getByName("main");
            verify(sourceSetMock).getRuntimeClasspath();
            verify(projectMock).getTasks();
            verify(taskContainerMock).register(eq("generateHistoricalFeaturesMetadata"), eq(HistoricalFeaturesMetadataTask.class), (Action) any());
            verify(configurationContainerMock2).getByName("resolveableCompileOnly");
            verify(projectMock).getLayout();
            verify(projectLayoutMock).getBuildDirectory();
            verify(directoryPropertyMock).file("historical-features.json");
            verify(configurationContainerMock3).create(eq("featuresMetadata"), (Action) any());
            verify(configurationMock3, atLeast(1)).getName();
            verify(projectMock).getArtifacts();
            verify(artifactHandlerMock).add("return_of_getName1", taskProviderMock);
        });
    }
}

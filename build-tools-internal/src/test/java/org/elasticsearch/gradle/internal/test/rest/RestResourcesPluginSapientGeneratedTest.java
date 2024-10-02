package org.elasticsearch.gradle.internal.test.rest;

import org.elasticsearch.gradle.internal.test.rest.RestResourcesPlugin;

import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.provider.ListProperty;
import org.junit.jupiter.api.Test;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.Project;

import java.io.File;

import org.gradle.api.reflect.ObjectInstantiationException;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.Action;

import static java.util.Map.entry;

import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.attributes.Usage;
import org.gradle.api.file.ProjectLayout;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.gradle.api.artifacts.Dependency;

import static org.mockito.Mockito.*;

import java.util.HashMap;

import org.gradle.api.model.ObjectFactory;
import org.gradle.api.tasks.SourceSetOutput;
import org.gradle.api.tasks.SourceSet;

import java.util.Map;

import org.gradle.api.artifacts.Configuration;
import org.gradle.api.file.SourceDirectorySet;
import org.gradle.api.tasks.TaskContainer;

import java.util.HashSet;
import java.util.Set;

import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.file.Directory;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.Transformer;
import org.gradle.api.provider.Provider;

import static org.mockito.ArgumentMatchers.any;

class RestResourcesPluginSapientGeneratedTest {

    @Test
    void applyWhenProjectGetPathEquals_rest_api_specNotEqualsFalseAndNotRestApiSpecProjectAvailableAndFNotIsDirectory() throws InvalidUserDataException, UnknownDomainObjectException, ObjectInstantiationException {
        Project projectMock = mock(Project.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        RestResourcesExtension restResourcesExtensionMock = mock(RestResourcesExtension.class);
        RestResourcesExtension.XpackRestResourcesSpec restResourcesExtensionXpackRestResourcesSpecMock = mock(RestResourcesExtension.XpackRestResourcesSpec.class);
        RestResourcesExtension.RestResourcesSpec restResourcesExtensionRestResourcesSpecMock = mock(RestResourcesExtension.RestResourcesSpec.class);
        SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        SourceSet sourceSetMock = mock(SourceSet.class);
        SourceDirectorySet sourceDirectorySetMock = mock(SourceDirectorySet.class);
        File fileMock = mock(File.class);
        SourceSetOutput sourceSetOutputMock = mock(SourceSetOutput.class);
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        Configuration configurationMock = mock(Configuration.class);
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        Usage usageMock = mock(Usage.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider taskProviderMock = mock(TaskProvider.class);
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        DirectoryProperty directoryPropertyMock = mock(DirectoryProperty.class);
        Provider providerMock = mock(Provider.class);
        ListProperty<String> listPropertyMock = mock(ListProperty.class);
        when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
        when(extensionContainerMock.create(eq("restResources"), eq(RestResourcesExtension.class), any())).thenReturn(restResourcesExtensionMock);
        when(restResourcesExtensionMock.getRestTests()).thenReturn(restResourcesExtensionXpackRestResourcesSpecMock);
        when(restResourcesExtensionXpackRestResourcesSpecMock.getIncludeXpack()).thenReturn(listPropertyMock);
        when(restResourcesExtensionMock.getRestApi()).thenReturn(restResourcesExtensionRestResourcesSpecMock);
        when(restResourcesExtensionRestResourcesSpecMock.getInclude()).thenReturn(listPropertyMock);
        when(extensionContainerMock.getByType(SourceSetContainer.class)).thenReturn(sourceSetContainerMock);
        when(sourceSetContainerMock.maybeCreate("test")).thenReturn(sourceSetMock);
        when(sourceSetMock.getResources()).thenReturn(sourceDirectorySetMock);
        Set<File> fileSet = new HashSet<>();
        fileSet.add(fileMock);
        when(sourceDirectorySetMock.getSrcDirs()).thenReturn(fileSet);
        when(fileMock.isDirectory()).thenReturn(false);
        when(sourceSetMock.getOutput()).thenReturn(sourceSetOutputMock);
        when(projectMock.getConfigurations()).thenReturn(configurationContainerMock);
        when(configurationContainerMock.create(anyString(), any(Action.class))).thenReturn(configurationMock);
        when(projectMock.getObjects()).thenReturn(objectFactoryMock);
        when(objectFactoryMock.named(eq(Usage.class), anyString())).thenReturn(usageMock);
        when(projectMock.findProject(":rest-api-spec")).thenReturn(null);
        when(projectMock.findProject(":x-pack:plugin")).thenReturn(null);
        when(projectMock.getTasks()).thenReturn(taskContainerMock);
        when(taskContainerMock.register(eq("copyYamlTestsTask"), eq(CopyRestTestsTask.class), any(Action.class))).thenReturn(taskProviderMock);
        when(taskProviderMock.flatMap(any(Transformer.class))).thenReturn(providerMock);
        when(taskProviderMock.map(any(Transformer.class))).thenReturn(providerMock);
        when(projectMock.getPath()).thenReturn(":rest-api-spec");
        when(projectMock.getLayout()).thenReturn(projectLayoutMock);
        when(projectLayoutMock.getBuildDirectory()).thenReturn(directoryPropertyMock);
        when(directoryPropertyMock.dir(anyString())).thenReturn(providerMock);
        RestResourcesPlugin target = new RestResourcesPlugin();
        target.apply(projectMock);
        verify(projectMock, times(2)).getExtensions();
        verify(extensionContainerMock).create(eq("restResources"), eq(RestResourcesExtension.class), any());
        verify(restResourcesExtensionMock).getRestTests();
        verify(restResourcesExtensionXpackRestResourcesSpecMock).getIncludeXpack();
        verify(restResourcesExtensionMock).getRestApi();
        verify(restResourcesExtensionRestResourcesSpecMock).getInclude();
        verify(sourceSetContainerMock).maybeCreate("test");
        verify(sourceSetMock).getResources();
        verify(sourceDirectorySetMock).getSrcDirs();
        verify(fileMock).isDirectory();
        verify(sourceSetMock, times(2)).getOutput();
        verify(sourceSetOutputMock, times(2)).dir(any(Provider.class));
        verify(projectMock, times(6)).getConfigurations();
        verify(configurationContainerMock, times(6)).create(anyString(), any(Action.class));
        verify(projectMock, times(6)).getObjects();
        verify(objectFactoryMock, times(6)).named(eq(Usage.class), anyString());
        verify(projectMock).findProject(":rest-api-spec");
        verify(projectMock).findProject(":x-pack:plugin");
        verify(projectMock, times(2)).getTasks();
        verify(taskContainerMock).register(eq("copyYamlTestsTask"), eq(CopyRestTestsTask.class), any(Action.class));
        verify(taskContainerMock).register(eq("copyRestApiSpecsTask"), eq(CopyRestApiTask.class), any(Action.class));
        verify(taskProviderMock).flatMap(any(Transformer.class));
        verify(taskProviderMock).map(any(Transformer.class));
        verify(projectMock).getPath();
        verify(projectMock, times(2)).getLayout();
        verify(projectLayoutMock, times(2)).getBuildDirectory();
        verify(directoryPropertyMock, times(2)).dir(anyString());
    }

    @Test
    void applyWhenFGetNameEqualsResources() throws InvalidUserDataException, UnknownDomainObjectException, ObjectInstantiationException {
        Project projectMock = mock(Project.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        RestResourcesExtension restResourcesExtensionMock = mock(RestResourcesExtension.class);
        RestResourcesExtension.XpackRestResourcesSpec restResourcesExtensionXpackRestResourcesSpecMock = mock(RestResourcesExtension.XpackRestResourcesSpec.class);
        RestResourcesExtension.RestResourcesSpec restResourcesExtensionRestResourcesSpecMock = mock(RestResourcesExtension.RestResourcesSpec.class);
        SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        SourceSet sourceSetMock = mock(SourceSet.class);
        SourceDirectorySet sourceDirectorySetMock = mock(SourceDirectorySet.class);
        File fileMock = mock(File.class);
        SourceSetOutput sourceSetOutputMock = mock(SourceSetOutput.class);
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        Configuration configurationMock = mock(Configuration.class);
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        Usage usageMock = mock(Usage.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider taskProviderMock = mock(TaskProvider.class);
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        DirectoryProperty directoryPropertyMock = mock(DirectoryProperty.class);
        Provider providerMock = mock(Provider.class);
        ListProperty<String> listPropertyMock = mock(ListProperty.class);
        DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
        when(extensionContainerMock.create(eq("restResources"), eq(RestResourcesExtension.class), any())).thenReturn(restResourcesExtensionMock);
        when(restResourcesExtensionMock.getRestTests()).thenReturn(restResourcesExtensionXpackRestResourcesSpecMock);
        when(restResourcesExtensionXpackRestResourcesSpecMock.getIncludeCore()).thenReturn(listPropertyMock);
        when(restResourcesExtensionXpackRestResourcesSpecMock.getIncludeXpack()).thenReturn(listPropertyMock);
        when(restResourcesExtensionMock.getRestApi()).thenReturn(restResourcesExtensionRestResourcesSpecMock);
        when(restResourcesExtensionRestResourcesSpecMock.getInclude()).thenReturn(listPropertyMock);
        when(extensionContainerMock.getByType(SourceSetContainer.class)).thenReturn(sourceSetContainerMock);
        when(sourceSetContainerMock.maybeCreate("test")).thenReturn(sourceSetMock);
        when(sourceSetMock.getResources()).thenReturn(sourceDirectorySetMock);
        Set<File> fileSet = new HashSet<>();
        fileSet.add(fileMock);
        when(sourceDirectorySetMock.getSrcDirs()).thenReturn(fileSet);
        when(fileMock.isDirectory()).thenReturn(true);
        when(fileMock.getName()).thenReturn("resources");
        when(sourceSetMock.getOutput()).thenReturn(sourceSetOutputMock);
        when(projectMock.getConfigurations()).thenReturn(configurationContainerMock);
        when(configurationContainerMock.create(anyString(), any(Action.class))).thenReturn(configurationMock);
        when(configurationMock.getName()).thenReturn("configName");
        when(projectMock.getObjects()).thenReturn(objectFactoryMock);
        when(objectFactoryMock.named(eq(Usage.class), anyString())).thenReturn(usageMock);
        when(projectMock.findProject(":rest-api-spec")).thenReturn(mock(Project.class));
        when(projectMock.findProject(":x-pack:plugin")).thenReturn(mock(Project.class));
        when(projectMock.getDependencies()).thenReturn(dependencyHandlerMock);
        when(dependencyHandlerMock.project(any(Map.class))).thenReturn(mock(Dependency.class));
        when(projectMock.getTasks()).thenReturn(taskContainerMock);
        when(taskContainerMock.register(anyString(), any(), any(Action.class))).thenReturn(taskProviderMock);
        when(taskProviderMock.flatMap(any(Transformer.class))).thenReturn(providerMock);
        when(taskProviderMock.map(any(Transformer.class))).thenReturn(providerMock);
        when(projectMock.getPath()).thenReturn("A");
        when(projectMock.getLayout()).thenReturn(projectLayoutMock);
        when(projectLayoutMock.getBuildDirectory()).thenReturn(directoryPropertyMock);
        when(directoryPropertyMock.dir(anyString())).thenReturn(providerMock);
        RestResourcesPlugin target = new RestResourcesPlugin();
        target.apply(projectMock);
        verify(projectMock, times(2)).getExtensions();
        verify(extensionContainerMock).create(eq("restResources"), eq(RestResourcesExtension.class), any());
        verify(restResourcesExtensionMock, times(2)).getRestTests();
        verify(restResourcesExtensionXpackRestResourcesSpecMock).getIncludeCore();
        verify(restResourcesExtensionXpackRestResourcesSpecMock).getIncludeXpack();
        verify(restResourcesExtensionMock).getRestApi();
        verify(restResourcesExtensionRestResourcesSpecMock).getInclude();
        verify(sourceSetContainerMock).maybeCreate("test");
        verify(sourceSetMock).getResources();
        verify(sourceDirectorySetMock).getSrcDirs();
        verify(fileMock).isDirectory();
        verify(fileMock).getName();
        verify(sourceSetMock, times(2)).getOutput();
        verify(sourceSetOutputMock, times(2)).dir(any(Provider.class));
        verify(projectMock, times(6)).getConfigurations();
        verify(configurationContainerMock, times(6)).create(anyString(), any(Action.class));
        verify(configurationMock, atLeast(1)).getName();
        verify(projectMock, times(6)).getObjects();
        verify(objectFactoryMock, times(6)).named(eq(Usage.class), anyString());
        verify(projectMock).findProject(":rest-api-spec");
        verify(projectMock).findProject(":x-pack:plugin");
        verify(projectMock, times(6)).getDependencies();
        verify(dependencyHandlerMock, times(3)).project(any(Map.class));
        verify(dependencyHandlerMock, times(3)).add(anyString(), any(Dependency.class));
        verify(projectMock, times(2)).getTasks();
        verify(taskContainerMock).register(eq("copyYamlTestsTask"), eq(CopyRestTestsTask.class), any(Action.class));
        verify(taskContainerMock).register(eq("copyRestApiSpecsTask"), eq(CopyRestApiTask.class), any(Action.class));
        verify(taskProviderMock).flatMap(any(Transformer.class));
        verify(taskProviderMock, times(2)).map(any(Transformer.class));
        verify(projectMock).getPath();
        verify(projectMock, times(2)).getLayout();
        verify(projectLayoutMock, times(2)).getBuildDirectory();
        verify(directoryPropertyMock, times(2)).dir(anyString());
    }
}

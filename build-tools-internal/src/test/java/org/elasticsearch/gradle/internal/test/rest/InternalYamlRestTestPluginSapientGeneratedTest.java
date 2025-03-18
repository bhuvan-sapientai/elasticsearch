package org.elasticsearch.gradle.internal.test.rest;

import org.elasticsearch.gradle.internal.test.rest.InternalYamlRestTestPlugin;

import org.gradle.api.plugins.PluginManager;

import static org.mockito.ArgumentMatchers.any;

import org.gradle.api.InvalidUserDataException;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;

import java.io.File;

import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.plugins.ExtensionContainer;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.anyBoolean;

import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;

import org.gradle.api.tasks.SourceSetOutput;
import org.gradle.api.tasks.SourceSet;

import static org.mockito.ArgumentMatchers.eq;

import org.gradle.api.tasks.TaskCollection;
import org.gradle.api.tasks.TaskContainer;
import org.junit.jupiter.api.Timeout;
import org.gradle.api.UnknownTaskException;

import java.util.HashSet;
import java.util.Set;

import org.gradle.api.UnknownDomainObjectException;
import org.elasticsearch.gradle.util.GradleUtils;
import org.elasticsearch.gradle.internal.test.RestIntegTestTask;

import static org.junit.jupiter.api.Assertions.*;

import org.elasticsearch.gradle.internal.test.rest.InternalYamlRestTestPlugin;
import org.gradle.api.tasks.TaskProvider;

import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class InternalYamlRestTestPluginSapientGeneratedTest {

    @Test
    void testApply() throws UnknownDomainObjectException, InvalidUserDataException, UnknownTaskException {
        // Setup
        Project projectMock = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        SourceSet sourceSetMock = mock(SourceSet.class);
        SourceSetOutput sourceSetOutputMock = mock(SourceSetOutput.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskCollection taskCollectionMock = mock(TaskCollection.class);
        TaskProvider taskProviderMock = mock(TaskProvider.class);
        File fileMock = mock(File.class);
        when(projectMock.getPluginManager()).thenReturn(pluginManagerMock);
        when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
        when(extensionContainerMock.getByType(SourceSetContainer.class)).thenReturn(sourceSetContainerMock);
        when(sourceSetContainerMock.create(anyString())).thenReturn(sourceSetMock);
        when(sourceSetMock.getOutput()).thenReturn(sourceSetOutputMock);
        when(projectMock.getTasks()).thenReturn(taskContainerMock);
        when(taskContainerMock.withType(any())).thenReturn(taskCollectionMock);
        when(taskCollectionMock.named(anyString())).thenReturn(taskProviderMock);
        Set<File> fileSet = new HashSet<>();
        fileSet.add(fileMock);
        when(sourceSetMock.getResources()).thenReturn(mock(org.gradle.api.file.SourceDirectorySet.class));
        when(sourceSetMock.getResources().getSrcDirs()).thenReturn(fileSet);
        when(fileMock.isDirectory()).thenReturn(true);
        when(fileMock.getName()).thenReturn("resources");
        try (MockedStatic<RestTestUtil> restTestUtilMock = mockStatic(RestTestUtil.class);
             MockedStatic<GradleUtils> gradleUtilsMock = mockStatic(GradleUtils.class)) {
            // Execute
            InternalYamlRestTestPlugin plugin = new InternalYamlRestTestPlugin();
            plugin.apply(projectMock);
            // Verify
            verify(pluginManagerMock).apply(RestTestBasePlugin.class);
            verify(pluginManagerMock).apply(RestResourcesPlugin.class);
            verify(sourceSetContainerMock).create(InternalYamlRestTestPlugin.SOURCE_SET_NAME);
            verify(taskContainerMock).named(eq("check"));
            verify(taskCollectionMock).configureEach(any());
            restTestUtilMock.verify(() -> RestTestUtil.registerTestTask(eq(projectMock), eq(sourceSetMock), eq(InternalYamlRestTestPlugin.SOURCE_SET_NAME), eq(RestIntegTestTask.class)));
            restTestUtilMock.verify(() -> RestTestUtil.setupYamlRestTestDependenciesDefaults(eq(projectMock), eq(sourceSetMock), anyBoolean()));
            gradleUtilsMock.verify(() -> GradleUtils.setupIdeForTestSourceSet(eq(projectMock), eq(sourceSetMock)));
        }
    }

    @Test
    void testApplyWithNonResourcesDirectory() throws UnknownDomainObjectException, InvalidUserDataException, UnknownTaskException {
        // Setup (similar to previous test)
        Project projectMock = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        SourceSet sourceSetMock = mock(SourceSet.class);
        SourceSetOutput sourceSetOutputMock = mock(SourceSetOutput.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskCollection taskCollectionMock = mock(TaskCollection.class);
        TaskProvider taskProviderMock = mock(TaskProvider.class);
        File fileMock = mock(File.class);
        when(projectMock.getPluginManager()).thenReturn(pluginManagerMock);
        when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
        when(extensionContainerMock.getByType(SourceSetContainer.class)).thenReturn(sourceSetContainerMock);
        when(sourceSetContainerMock.create(anyString())).thenReturn(sourceSetMock);
        when(sourceSetMock.getOutput()).thenReturn(sourceSetOutputMock);
        when(projectMock.getTasks()).thenReturn(taskContainerMock);
        when(taskContainerMock.withType(any())).thenReturn(taskCollectionMock);
        when(taskCollectionMock.named(anyString())).thenReturn(taskProviderMock);
        Set<File> fileSet = new HashSet<>();
        fileSet.add(fileMock);
        when(sourceSetMock.getResources()).thenReturn(mock(org.gradle.api.file.SourceDirectorySet.class));
        when(sourceSetMock.getResources().getSrcDirs()).thenReturn(fileSet);
        when(fileMock.isDirectory()).thenReturn(true);
        when(fileMock.getName()).thenReturn("not_resources");
        try (MockedStatic<RestTestUtil> restTestUtilMock = mockStatic(RestTestUtil.class);
             MockedStatic<GradleUtils> gradleUtilsMock = mockStatic(GradleUtils.class)) {
            // Execute
            InternalYamlRestTestPlugin plugin = new InternalYamlRestTestPlugin();
            plugin.apply(projectMock);
            // Verify
            verify(pluginManagerMock).apply(RestTestBasePlugin.class);
            verify(pluginManagerMock).apply(RestResourcesPlugin.class);
            verify(sourceSetContainerMock).create(InternalYamlRestTestPlugin.SOURCE_SET_NAME);
            verify(taskContainerMock).named(eq("check"));
            verify(taskCollectionMock).configureEach(any());
            restTestUtilMock.verify(() -> RestTestUtil.registerTestTask(eq(projectMock), eq(sourceSetMock), eq(InternalYamlRestTestPlugin.SOURCE_SET_NAME), eq(RestIntegTestTask.class)));
            restTestUtilMock.verify(() -> RestTestUtil.setupYamlRestTestDependenciesDefaults(eq(projectMock), eq(sourceSetMock), anyBoolean()));
            gradleUtilsMock.verify(() -> GradleUtils.setupIdeForTestSourceSet(eq(projectMock), eq(sourceSetMock)));
        }
    }
}

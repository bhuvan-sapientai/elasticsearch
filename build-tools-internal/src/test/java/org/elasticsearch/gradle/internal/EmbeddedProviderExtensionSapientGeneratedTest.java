package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.EmbeddedProviderExtension;

import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;
import org.gradle.api.Project;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.file.ProjectLayout;

import static org.mockito.ArgumentMatchers.anyString;

import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.gradle.api.artifacts.Dependency;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;

import org.gradle.api.tasks.SourceSetOutput;
import org.gradle.api.tasks.Sync;
import org.gradle.api.tasks.SourceSet;
import org.junit.jupiter.api.BeforeEach;
import org.gradle.api.artifacts.Configuration;
import org.junit.jupiter.params.ParameterizedTest;

import static org.mockito.ArgumentMatchers.eq;

import org.elasticsearch.gradle.internal.EmbeddedProviderExtension;
import org.gradle.api.tasks.TaskContainer;
import org.elasticsearch.gradle.util.GradleUtils;
import org.gradle.api.file.Directory;
import org.junit.jupiter.params.provider.ValueSource;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.Task;
import org.gradle.api.provider.Provider;

import static org.mockito.ArgumentMatchers.any;

class EmbeddedProviderExtensionSapientGeneratedTest {

    private Project projectMock;

    private TaskProvider<Task> metaTaskMock;

    private Project implProjectMock;

    private EmbeddedProviderExtension extension;

    @BeforeEach
    void setUp() {
        //projectMock = mock(Project.class);
        //metaTaskMock = mock(TaskProvider.class);
        //implProjectMock = mock(Project.class);
        //extension = new EmbeddedProviderExtension(projectMock, metaTaskMock);
        //ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        //Configuration configurationMock = mock(Configuration.class);
        //DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        //Dependency dependencyMock = mock(Dependency.class);
        //ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        //Provider<Directory> providerMock = mock(Provider.class);
        //TaskContainer taskContainerMock = mock(TaskContainer.class);
        //TaskProvider<GenerateProviderManifest> generateProviderManifestTaskProviderMock = mock(TaskProvider.class);
        //TaskProvider<Sync> syncTaskProviderMock = mock(TaskProvider.class);
        //SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        //SourceSet sourceSetMock = mock(SourceSet.class);
        //SourceSetOutput sourceSetOutputMock = mock(SourceSetOutput.class);
        //when(projectMock.getConfigurations()).thenReturn(configurationContainerMock);
        //when(configurationContainerMock.detachedConfiguration(any(Dependency.class))).thenReturn(configurationMock);
        //when(projectMock.getDependencies()).thenReturn(dependencyHandlerMock);
        //when(dependencyHandlerMock.create(any(Project.class))).thenReturn(dependencyMock);
        //when(projectMock.getLayout()).thenReturn(projectLayoutMock);
        //when(projectLayoutMock.getBuildDirectory()).thenReturn(mock(Provider.class));
        //when(projectLayoutMock.getBuildDirectory().dir(anyString())).thenReturn(providerMock);
        //when(providerMock.map(any())).thenReturn(mock(Provider.class));
        //when(projectMock.getTasks()).thenReturn(taskContainerMock);
        //when(taskContainerMock.register(anyString(), eq(GenerateProviderManifest.class))).thenReturn(generateProviderManifestTaskProviderMock);
        //when(taskContainerMock.register(anyString(), eq(Sync.class))).thenReturn(syncTaskProviderMock);
        //when(implProjectMock.getName()).thenReturn("TestImpl");
        //when(sourceSetContainerMock.findByName(SourceSet.MAIN_SOURCE_SET_NAME)).thenReturn(sourceSetMock);
        //when(sourceSetMock.getOutput()).thenReturn(sourceSetOutputMock);
    }

    @ParameterizedTest
    @ValueSource(strings = {"impl1", "impl2", "impl3"})
    void testImplWithDifferentNames(String implName) {
        try (MockedStatic<GradleUtils> gradleUtilsMock = mockStatic(GradleUtils.class)) {
            gradleUtilsMock.when(() -> GradleUtils.getJavaSourceSets(projectMock)).thenReturn(mock(SourceSetContainer.class));
            extension.impl(implName, implProjectMock);
            verify(projectMock).getConfigurations();
            verify(projectMock).getDependencies();
            verify(projectMock).getLayout();
            verify(projectMock, times(2)).getTasks();
            verify(metaTaskMock).configure(any());
            gradleUtilsMock.verify(() -> GradleUtils.getJavaSourceSets(projectMock));
        }
    }

    @Test
    void testImplConfiguresGenerateProviderManifestTask() {
        TaskProvider<GenerateProviderManifest> generateProviderManifestTaskProviderMock = mock(TaskProvider.class);
        when(projectMock.getTasks().register(eq("generateTestImplProviderManifest"), eq(GenerateProviderManifest.class))).thenReturn(generateProviderManifestTaskProviderMock);
        extension.impl("testImpl", implProjectMock);
        verify(generateProviderManifestTaskProviderMock).configure(any());
    }

    @Test
    void testImplConfiguresSyncTask() {
        TaskProvider<Sync> syncTaskProviderMock = mock(TaskProvider.class);
        when(projectMock.getTasks().register(eq("generateTestImplProviderImpl"), eq(Sync.class))).thenReturn(syncTaskProviderMock);
        extension.impl("testImpl", implProjectMock);
        verify(syncTaskProviderMock).configure(any());
    }

    @Test
    void testImplConfiguresMetaTask() {
        extension.impl("testImpl", implProjectMock);
        verify(metaTaskMock).configure(any());
    }

    @Test
    void testImplConfiguresSourceSetOutput() {
        SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        SourceSet mainSourceSetMock = mock(SourceSet.class);
        SourceSetOutput sourceSetOutputMock = mock(SourceSetOutput.class);
        try (MockedStatic<GradleUtils> gradleUtilsMock = mockStatic(GradleUtils.class)) {
            gradleUtilsMock.when(() -> GradleUtils.getJavaSourceSets(projectMock)).thenReturn(sourceSetContainerMock);
            when(sourceSetContainerMock.findByName(SourceSet.MAIN_SOURCE_SET_NAME)).thenReturn(mainSourceSetMock);
            when(mainSourceSetMock.getOutput()).thenReturn(sourceSetOutputMock);
            extension.impl("testImpl", implProjectMock);
            verify(sourceSetOutputMock).dir(any(TaskProvider.class));
        }
    }
}
package org.elasticsearch.gradle.internal.test.rest;

import org.elasticsearch.gradle.internal.test.rest.LegacyYamlRestTestPlugin;

import org.gradle.api.plugins.PluginManager;
import org.junit.jupiter.api.Test;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.Project;

import java.io.File;

import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.Action;
import org.gradle.api.plugins.ExtensionContainer;
import org.elasticsearch.gradle.internal.test.LegacyRestTestBasePlugin;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;

import org.gradle.api.tasks.SourceSetOutput;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.file.SourceDirectorySet;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.tasks.TaskCollection;
import org.gradle.api.UnknownTaskException;

import java.util.HashSet;
import java.util.Set;

import org.gradle.api.UnknownDomainObjectException;
import org.mockito.stubbing.Answer;
import org.elasticsearch.gradle.util.GradleUtils;
import org.elasticsearch.gradle.internal.test.RestIntegTestTask;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.Transformer;
import org.gradle.api.provider.Provider;

import static org.mockito.ArgumentMatchers.any;

class LegacyYamlRestTestPluginSapientGeneratedTest {

    private final ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);

    private final File fileMock = mock(File.class);

    private final PluginManager pluginManagerMock = mock(PluginManager.class);

    private final Project projectMock = mock(Project.class);

    private final Provider providerMock = mock(Provider.class);

    private final Provider<RestIntegTestTask> providerMock3 = mock(Provider.class);

    private final SourceDirectorySet sourceDirectorySetMock = mock(SourceDirectorySet.class);

    private final SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);

    private final SourceSet sourceSetMock = mock(SourceSet.class);

    private final SourceSetOutput sourceSetOutputMock = mock(SourceSetOutput.class);

    private final TaskCollection taskCollectionMock = mock(TaskCollection.class);

    private final TaskContainer taskContainerMock = mock(TaskContainer.class);

    private final TaskProvider taskProviderMock = mock(TaskProvider.class);

    @Test
    void applyWhenFGetNameEqualsResources() throws UnknownDomainObjectException, InvalidUserDataException, UnknownTaskException {
        try (MockedStatic<RestTestUtil> restTestUtil = mockStatic(RestTestUtil.class);
             MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            // Arrange
            doReturn(pluginManagerMock).when(projectMock).getPluginManager();
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(sourceSetContainerMock).when(extensionContainerMock).getByType(SourceSetContainer.class);
            doReturn(sourceSetMock).when(sourceSetContainerMock).create("yamlRestTest");
            doReturn(sourceDirectorySetMock).when(sourceSetMock).getResources();
            Set<File> fileSet = new HashSet<>();
            fileSet.add(fileMock);
            doReturn(fileSet).when(sourceDirectorySetMock).getSrcDirs();
            doReturn(true).when(fileMock).isDirectory();
            doReturn("resources").when(fileMock).getName();
            doReturn(sourceSetOutputMock).when(sourceSetMock).getOutput();
            doReturn(taskContainerMock).when(projectMock).getTasks();
            doReturn(taskCollectionMock).when(taskContainerMock).withType(CopyRestApiTask.class);
            doReturn(taskProviderMock).when(taskCollectionMock).named(RestResourcesPlugin.COPY_REST_API_SPECS_TASK);
            doReturn(providerMock).when(taskProviderMock).flatMap(any(Transformer.class));
            restTestUtil.when(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock)).thenReturn(providerMock3);
            LegacyYamlRestTestPlugin target = new LegacyYamlRestTestPlugin();
            // Act
            target.apply(projectMock);
            // Assert
            verify(pluginManagerMock).apply(LegacyRestTestBasePlugin.class);
            verify(pluginManagerMock).apply(RestResourcesPlugin.class);
            verify(sourceSetContainerMock).create("yamlRestTest");
            verify(sourceSetOutputMock, times(2)).dir(any(Provider.class));
            verify(taskCollectionMock).configureEach(any(Action.class));
            gradleUtils.verify(() -> GradleUtils.setupIdeForTestSourceSet(projectMock, sourceSetMock));
            restTestUtil.verify(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock));
            restTestUtil.verify(() -> RestTestUtil.setupYamlRestTestDependenciesDefaults(projectMock, sourceSetMock));
        }
    }

    @Test
    void applyWhenFGetNameNotEqualsResources() throws UnknownDomainObjectException, InvalidUserDataException, UnknownTaskException {
        try (MockedStatic<RestTestUtil> restTestUtil = mockStatic(RestTestUtil.class);
             MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            // Arrange
            doReturn(pluginManagerMock).when(projectMock).getPluginManager();
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(sourceSetContainerMock).when(extensionContainerMock).getByType(SourceSetContainer.class);
            doReturn(sourceSetMock).when(sourceSetContainerMock).create("yamlRestTest");
            doReturn(sourceDirectorySetMock).when(sourceSetMock).getResources();
            Set<File> fileSet = new HashSet<>();
            fileSet.add(fileMock);
            doReturn(fileSet).when(sourceDirectorySetMock).getSrcDirs();
            doReturn(true).when(fileMock).isDirectory();
            doReturn("not_resources").when(fileMock).getName();
            doReturn(sourceSetOutputMock).when(sourceSetMock).getOutput();
            doReturn(taskContainerMock).when(projectMock).getTasks();
            doReturn(taskCollectionMock).when(taskContainerMock).withType(CopyRestApiTask.class);
            doReturn(taskProviderMock).when(taskCollectionMock).named(RestResourcesPlugin.COPY_REST_API_SPECS_TASK);
            doReturn(providerMock).when(taskProviderMock).flatMap(any(Transformer.class));
            restTestUtil.when(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock)).thenReturn(providerMock3);
            LegacyYamlRestTestPlugin target = new LegacyYamlRestTestPlugin();
            // Act
            target.apply(projectMock);
            // Assert
            verify(pluginManagerMock).apply(LegacyRestTestBasePlugin.class);
            verify(pluginManagerMock).apply(RestResourcesPlugin.class);
            verify(sourceSetContainerMock).create("yamlRestTest");
            verify(sourceSetOutputMock, times(2)).dir(any(Provider.class));
            verify(taskCollectionMock).configureEach(any(Action.class));
            gradleUtils.verify(() -> GradleUtils.setupIdeForTestSourceSet(projectMock, sourceSetMock));
            restTestUtil.verify(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock));
            restTestUtil.verify(() -> RestTestUtil.setupYamlRestTestDependenciesDefaults(projectMock, sourceSetMock));
        }
    }
}

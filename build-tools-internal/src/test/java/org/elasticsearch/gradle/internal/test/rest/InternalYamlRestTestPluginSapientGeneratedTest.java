package org.elasticsearch.gradle.internal.test.rest;

import org.elasticsearch.gradle.internal.test.rest.InternalYamlRestTestPlugin;

import org.gradle.api.plugins.PluginManager;
import org.junit.jupiter.api.Test;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.Project;

import java.io.File;

import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.Action;
import org.gradle.api.plugins.ExtensionContainer;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;

import org.gradle.api.tasks.SourceSetOutput;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.gradle.api.tasks.SourceSet;
import org.gradle.api.file.SourceDirectorySet;
import org.junit.jupiter.api.Timeout;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.tasks.TaskCollection;
import org.gradle.api.UnknownTaskException;

import java.util.HashSet;
import java.util.Set;

import org.gradle.api.UnknownDomainObjectException;
import org.mockito.stubbing.Answer;
import org.elasticsearch.gradle.util.GradleUtils;
import org.elasticsearch.gradle.internal.test.RestIntegTestTask;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.Transformer;
import org.gradle.api.provider.Provider;

import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class InternalYamlRestTestPluginSapientGeneratedTest {

    private final ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);

    private final File fileMock = mock(File.class);

    private final PluginManager pluginManagerMock = mock(PluginManager.class);

    private final PluginManager pluginManagerMock2 = mock(PluginManager.class);

    private final Project projectMock = mock(Project.class);

    private final Provider providerMock = mock(Provider.class);

    private final Provider providerMock2 = mock(Provider.class);

    private final SourceDirectorySet sourceDirectorySetMock = mock(SourceDirectorySet.class);

    private final SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);

    private final SourceSet sourceSetMock = mock(SourceSet.class);

    private final SourceSetOutput sourceSetOutputMock = mock(SourceSetOutput.class);

    private final SourceSetOutput sourceSetOutputMock2 = mock(SourceSetOutput.class);

    private final TaskCollection taskCollectionMock = mock(TaskCollection.class);

    private final TaskCollection taskCollectionMock2 = mock(TaskCollection.class);

    private final TaskCollection taskCollectionMock3 = mock(TaskCollection.class);

    private final TaskContainer taskContainerMock = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock2 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock3 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock4 = mock(TaskContainer.class);

    private final TaskProvider taskProviderMock = mock(TaskProvider.class);

    private final TaskProvider taskProviderMock2 = mock(TaskProvider.class);

    private final TaskProvider taskProviderMock3 = mock(TaskProvider.class);

    private final TaskProvider<RestIntegTestTask> taskProviderMock4 = mock(TaskProvider.class);

    @Test
    void applyWhenFGetNameEqualsResources() throws UnknownDomainObjectException, InvalidUserDataException, UnknownTaskException {
        try (MockedStatic<RestTestUtil> restTestUtil = mockStatic(RestTestUtil.class);
             MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            doNothing().when(pluginManagerMock).apply(RestTestBasePlugin.class);
            doReturn(pluginManagerMock, pluginManagerMock2).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock2).apply(RestResourcesPlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(sourceSetContainerMock).when(extensionContainerMock).getByType(SourceSetContainer.class);
            doReturn(sourceSetMock).when(sourceSetContainerMock).create("yamlRestTest");
            doReturn(sourceDirectorySetMock).when(sourceSetMock).getResources();
            Set<File> fileSet = new HashSet<>();
            fileSet.add(fileMock);
            doReturn(fileSet).when(sourceDirectorySetMock).getSrcDirs();
            doReturn(true).when(fileMock).isDirectory();
            doReturn("resources").when(fileMock).getName();
            doNothing().when(sourceSetOutputMock).dir(providerMock);
            doReturn(sourceSetOutputMock, sourceSetOutputMock2).when(sourceSetMock).getOutput();
            doNothing().when(sourceSetOutputMock2).dir(providerMock2);
            doReturn(taskProviderMock).when(taskContainerMock).named("check");
            doNothing().when(taskProviderMock).configure(any(Action.class));
            doReturn(taskCollectionMock).when(taskContainerMock2).withType(CopyRestApiTask.class);
            doNothing().when(taskCollectionMock).configureEach(any(Action.class));
            doReturn(taskCollectionMock2).when(taskContainerMock3).withType(CopyRestApiTask.class);
            doReturn(taskProviderMock2).when(taskCollectionMock2).named("copyRestApiSpecsTask");
            doReturn(providerMock).when(taskProviderMock2).flatMap(any(Transformer.class));
            doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3, taskContainerMock4).when(projectMock).getTasks();
            doReturn(taskCollectionMock3).when(taskContainerMock4).withType(CopyRestTestsTask.class);
            doReturn(taskProviderMock3).when(taskCollectionMock3).named("copyYamlTestsTask");
            doReturn(providerMock2).when(taskProviderMock3).flatMap(any(Transformer.class));
            gradleUtils.when(() -> GradleUtils.setupIdeForTestSourceSet(projectMock, sourceSetMock)).thenAnswer((Answer<Void>) invocation -> null);
            restTestUtil.when(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock, "yamlRestTest", RestIntegTestTask.class)).thenReturn(taskProviderMock4);
            restTestUtil.when(() -> RestTestUtil.setupYamlRestTestDependenciesDefaults(projectMock, sourceSetMock, true)).thenAnswer((Answer<Void>) invocation -> null);
            InternalYamlRestTestPlugin target = new InternalYamlRestTestPlugin();
            target.apply(projectMock);
            assertAll("result", () -> {
                verify(projectMock, times(2)).getPluginManager();
                verify(pluginManagerMock).apply(RestTestBasePlugin.class);
                verify(pluginManagerMock2).apply(RestResourcesPlugin.class);
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByType(SourceSetContainer.class);
                verify(sourceSetContainerMock).create("yamlRestTest");
                verify(sourceSetMock).getResources();
                verify(sourceDirectorySetMock).getSrcDirs();
                verify(fileMock).isDirectory();
                verify(fileMock).getName();
                verify(sourceSetMock, times(2)).getOutput();
                verify(sourceSetOutputMock).dir(providerMock);
                verify(sourceSetOutputMock2).dir(providerMock2);
                verify(projectMock, times(4)).getTasks();
                verify(taskContainerMock).named("check");
                verify(taskProviderMock).configure(any(Action.class));
                verify(taskContainerMock2).withType(CopyRestApiTask.class);
                verify(taskCollectionMock).configureEach(any(Action.class));
                verify(taskContainerMock3).withType(CopyRestApiTask.class);
                verify(taskCollectionMock2).named("copyRestApiSpecsTask");
                verify(taskProviderMock2).flatMap(any(Transformer.class));
                verify(taskContainerMock4).withType(CopyRestTestsTask.class);
                verify(taskCollectionMock3).named("copyYamlTestsTask");
                verify(taskProviderMock3).flatMap(any(Transformer.class));
                gradleUtils.verify(() -> GradleUtils.setupIdeForTestSourceSet(projectMock, sourceSetMock), atLeast(1));
                restTestUtil.verify(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock, "yamlRestTest", RestIntegTestTask.class), atLeast(1));
                restTestUtil.verify(() -> RestTestUtil.setupYamlRestTestDependenciesDefaults(projectMock, sourceSetMock, true), atLeast(1));
            });
        }
    }

    @Test
    void applyWhenFGetNameNotEqualsResources() throws UnknownDomainObjectException, InvalidUserDataException, UnknownTaskException {
        try (MockedStatic<RestTestUtil> restTestUtil = mockStatic(RestTestUtil.class);
             MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            doNothing().when(pluginManagerMock).apply(RestTestBasePlugin.class);
            doReturn(pluginManagerMock, pluginManagerMock2).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock2).apply(RestResourcesPlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(sourceSetContainerMock).when(extensionContainerMock).getByType(SourceSetContainer.class);
            doReturn(sourceSetMock).when(sourceSetContainerMock).create("yamlRestTest");
            doReturn(sourceDirectorySetMock).when(sourceSetMock).getResources();
            Set<File> fileSet = new HashSet<>();
            fileSet.add(fileMock);
            doReturn(fileSet).when(sourceDirectorySetMock).getSrcDirs();
            doReturn(true).when(fileMock).isDirectory();
            doReturn("A").when(fileMock).getName();
            doNothing().when(sourceSetOutputMock).dir(providerMock);
            doReturn(sourceSetOutputMock, sourceSetOutputMock2).when(sourceSetMock).getOutput();
            doNothing().when(sourceSetOutputMock2).dir(providerMock2);
            doReturn(taskProviderMock).when(taskContainerMock).named("check");
            doNothing().when(taskProviderMock).configure(any(Action.class));
            doReturn(taskCollectionMock).when(taskContainerMock2).withType(CopyRestApiTask.class);
            doNothing().when(taskCollectionMock).configureEach(any(Action.class));
            doReturn(taskCollectionMock2).when(taskContainerMock3).withType(CopyRestApiTask.class);
            doReturn(taskProviderMock2).when(taskCollectionMock2).named("copyRestApiSpecsTask");
            doReturn(providerMock).when(taskProviderMock2).flatMap(any(Transformer.class));
            doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3, taskContainerMock4).when(projectMock).getTasks();
            doReturn(taskCollectionMock3).when(taskContainerMock4).withType(CopyRestTestsTask.class);
            doReturn(taskProviderMock3).when(taskCollectionMock3).named("copyYamlTestsTask");
            doReturn(providerMock2).when(taskProviderMock3).flatMap(any(Transformer.class));
            gradleUtils.when(() -> GradleUtils.setupIdeForTestSourceSet(projectMock, sourceSetMock)).thenAnswer((Answer<Void>) invocation -> null);
            restTestUtil.when(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock, "yamlRestTest", RestIntegTestTask.class)).thenReturn(taskProviderMock4);
            restTestUtil.when(() -> RestTestUtil.setupYamlRestTestDependenciesDefaults(projectMock, sourceSetMock, true)).thenAnswer((Answer<Void>) invocation -> null);
            InternalYamlRestTestPlugin target = new InternalYamlRestTestPlugin();
            target.apply(projectMock);
            assertAll("result", () -> {
                verify(projectMock, times(2)).getPluginManager();
                verify(pluginManagerMock).apply(RestTestBasePlugin.class);
                verify(pluginManagerMock2).apply(RestResourcesPlugin.class);
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByType(SourceSetContainer.class);
                verify(sourceSetContainerMock).create("yamlRestTest");
                verify(sourceSetMock).getResources();
                verify(sourceDirectorySetMock).getSrcDirs();
                verify(fileMock).isDirectory();
                verify(fileMock).getName();
                verify(sourceSetMock, times(2)).getOutput();
                verify(sourceSetOutputMock).dir(providerMock);
                verify(sourceSetOutputMock2).dir(providerMock2);
                verify(projectMock, times(4)).getTasks();
                verify(taskContainerMock).named("check");
                verify(taskProviderMock).configure(any(Action.class));
                verify(taskContainerMock2).withType(CopyRestApiTask.class);
                verify(taskCollectionMock).configureEach(any(Action.class));
                verify(taskContainerMock3).withType(CopyRestApiTask.class);
                verify(taskCollectionMock2).named("copyRestApiSpecsTask");
                verify(taskProviderMock2).flatMap(any(Transformer.class));
                verify(taskContainerMock4).withType(CopyRestTestsTask.class);
                verify(taskCollectionMock3).named("copyYamlTestsTask");
                verify(taskProviderMock3).flatMap(any(Transformer.class));
                gradleUtils.verify(() -> GradleUtils.setupIdeForTestSourceSet(projectMock, sourceSetMock), atLeast(1));
                restTestUtil.verify(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock, "yamlRestTest", RestIntegTestTask.class), atLeast(1));
                restTestUtil.verify(() -> RestTestUtil.setupYamlRestTestDependenciesDefaults(projectMock, sourceSetMock, true), atLeast(1));
            });
        }
    }
}

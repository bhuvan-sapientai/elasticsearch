package org.elasticsearch.gradle.internal.test.rest;

import org.elasticsearch.gradle.internal.test.rest.InternalJavaRestTestPlugin;

import org.gradle.api.tasks.SourceSet;
import org.gradle.api.plugins.PluginManager;
import org.junit.jupiter.api.Test;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.Project;
import org.gradle.api.Action;
import org.gradle.api.tasks.SourceSetContainer;
import org.junit.jupiter.api.Timeout;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.UnknownTaskException;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.UnknownProjectException;
import org.mockito.stubbing.Answer;
import org.elasticsearch.gradle.util.GradleUtils;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.elasticsearch.gradle.internal.test.RestIntegTestTask;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.artifacts.Dependency;
import org.gradle.api.tasks.TaskProvider;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class InternalJavaRestTestPluginSapientGeneratedTest {

    @Test
    void applyWhenProjectFindProject_test_test_clustersIsNotNull() throws UnknownDomainObjectException, InvalidUserDataException, UnknownProjectException, UnknownTaskException {
        // Arrange
        Project projectMock = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        SourceSet sourceSetMock = mock(SourceSet.class);
        Project projectMock2 = mock(Project.class);
        DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        Dependency dependencyMock = mock(Dependency.class);
        Project projectMock3 = mock(Project.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider taskProviderMock = mock(TaskProvider.class);
        TaskProvider<RestIntegTestTask> taskProviderMock2 = mock(TaskProvider.class);
        try (MockedStatic<RestTestUtil> restTestUtil = mockStatic(RestTestUtil.class);
             MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            doReturn(pluginManagerMock).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock).apply(RestTestBasePlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(sourceSetContainerMock).when(extensionContainerMock).getByType(SourceSetContainer.class);
            doReturn(sourceSetMock).when(sourceSetContainerMock).create("javaRestTest");
            doReturn("return_of_getImplementationConfigurationName1").when(sourceSetMock).getImplementationConfigurationName();
            doReturn(projectMock2).when(projectMock).findProject(":test:test-clusters");
            doReturn(dependencyHandlerMock).when(projectMock).getDependencies();
            doReturn(dependencyMock).when(dependencyHandlerMock).add("return_of_getImplementationConfigurationName1", projectMock3);
            doReturn(projectMock3).when(projectMock).project(":test:test-clusters");
            doReturn(taskContainerMock).when(projectMock).getTasks();
            doReturn(taskProviderMock).when(taskContainerMock).named("check");
            doNothing().when(taskProviderMock).configure(any(Action.class));
            gradleUtils.when(() -> GradleUtils.setupIdeForTestSourceSet(projectMock, sourceSetMock)).thenAnswer((Answer<Void>) invocation -> null);
            restTestUtil.when(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock, "javaRestTest", RestIntegTestTask.class)).thenReturn(taskProviderMock2);
            restTestUtil.when(() -> RestTestUtil.setupJavaRestTestDependenciesDefaults(projectMock, sourceSetMock)).thenAnswer((Answer<Void>) invocation -> null);
            InternalJavaRestTestPlugin target = new InternalJavaRestTestPlugin();
            // Act
            target.apply(projectMock);
            // Assert
            assertAll("result", () -> {
                verify(projectMock).getPluginManager();
                verify(pluginManagerMock).apply(RestTestBasePlugin.class);
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByType(SourceSetContainer.class);
                verify(sourceSetContainerMock).create("javaRestTest");
                verify(sourceSetMock).getImplementationConfigurationName();
                verify(projectMock).findProject(":test:test-clusters");
                verify(projectMock).getDependencies();
                verify(dependencyHandlerMock).add("return_of_getImplementationConfigurationName1", projectMock3);
                verify(projectMock).project(":test:test-clusters");
                verify(projectMock).getTasks();
                verify(taskContainerMock).named("check");
                verify(taskProviderMock).configure(any(Action.class));
                gradleUtils.verify(() -> GradleUtils.setupIdeForTestSourceSet(projectMock, sourceSetMock), atLeast(1));
                restTestUtil.verify(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock, "javaRestTest", RestIntegTestTask.class), atLeast(1));
                restTestUtil.verify(() -> RestTestUtil.setupJavaRestTestDependenciesDefaults(projectMock, sourceSetMock), atLeast(1));
            });
        }
    }

    @Test
    void applyWhenProjectFindProject_test_test_clustersIsNull() throws UnknownDomainObjectException, InvalidUserDataException, UnknownProjectException, UnknownTaskException {
        // Arrange
        Project projectMock = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        SourceSet sourceSetMock = mock(SourceSet.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider taskProviderMock = mock(TaskProvider.class);
        TaskProvider<RestIntegTestTask> taskProviderMock2 = mock(TaskProvider.class);
        try (MockedStatic<RestTestUtil> restTestUtil = mockStatic(RestTestUtil.class);
             MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            doReturn(pluginManagerMock).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock).apply(RestTestBasePlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(sourceSetContainerMock).when(extensionContainerMock).getByType(SourceSetContainer.class);
            doReturn(sourceSetMock).when(sourceSetContainerMock).create("javaRestTest");
            doReturn(null).when(projectMock).findProject(":test:test-clusters");
            doReturn(taskContainerMock).when(projectMock).getTasks();
            doReturn(taskProviderMock).when(taskContainerMock).named("check");
            doNothing().when(taskProviderMock).configure(any(Action.class));
            gradleUtils.when(() -> GradleUtils.setupIdeForTestSourceSet(projectMock, sourceSetMock)).thenAnswer((Answer<Void>) invocation -> null);
            restTestUtil.when(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock, "javaRestTest", RestIntegTestTask.class)).thenReturn(taskProviderMock2);
            restTestUtil.when(() -> RestTestUtil.setupJavaRestTestDependenciesDefaults(projectMock, sourceSetMock)).thenAnswer((Answer<Void>) invocation -> null);
            InternalJavaRestTestPlugin target = new InternalJavaRestTestPlugin();
            // Act
            target.apply(projectMock);
            // Assert
            assertAll("result", () -> {
                verify(projectMock).getPluginManager();
                verify(pluginManagerMock).apply(RestTestBasePlugin.class);
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByType(SourceSetContainer.class);
                verify(sourceSetContainerMock).create("javaRestTest");
                verify(projectMock).findProject(":test:test-clusters");
                verify(projectMock, never()).getDependencies();
                verify(projectMock).getTasks();
                verify(taskContainerMock).named("check");
                verify(taskProviderMock).configure(any(Action.class));
                gradleUtils.verify(() -> GradleUtils.setupIdeForTestSourceSet(projectMock, sourceSetMock), atLeast(1));
                restTestUtil.verify(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock, "javaRestTest", RestIntegTestTask.class), atLeast(1));
                restTestUtil.verify(() -> RestTestUtil.setupJavaRestTestDependenciesDefaults(projectMock, sourceSetMock), atLeast(1));
            });
        }
    }
}

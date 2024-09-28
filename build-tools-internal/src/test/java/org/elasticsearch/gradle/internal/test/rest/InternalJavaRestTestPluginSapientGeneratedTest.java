package org.elasticsearch.gradle.internal.test.rest;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.UnknownProjectException;
import org.gradle.api.UnknownTaskException;
import org.mockito.stubbing.Answer;
import org.gradle.api.artifacts.Dependency;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.elasticsearch.gradle.util.GradleUtils;
import org.gradle.api.Project;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.tasks.SourceSetContainer;
import org.elasticsearch.gradle.internal.test.RestIntegTestTask;
import org.mockito.MockedStatic;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.plugins.PluginManager;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5)
class InternalJavaRestTestPluginSapientGeneratedTest {

    //Sapient generated method id: ${applyWhenProjectFindProject_test_test_clustersIsNotNull}, hash: E6DD2354677045693ECDEAD8D9C19BD0
    @Test()
    void applyWhenProjectFindProject_test_test_clustersIsNotNull() throws UnknownDomainObjectException, InvalidUserDataException, UnknownProjectException, UnknownTaskException {
        /* Branches:
         * (project.findProject(":test:test-clusters") != null) : true
         */
         //Arrange Statement(s)
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
            doNothing().when(taskProviderMock).configure((Action) any());
            gradleUtils.when(() -> GradleUtils.setupIdeForTestSourceSet(projectMock, sourceSetMock)).thenAnswer((Answer<Void>) invocation -> null);
            restTestUtil.when(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock, "javaRestTest", RestIntegTestTask.class)).thenReturn(taskProviderMock2);
            restTestUtil.when(() -> RestTestUtil.setupJavaRestTestDependenciesDefaults(projectMock, sourceSetMock)).thenAnswer((Answer<Void>) invocation -> null);
            InternalJavaRestTestPlugin target = new InternalJavaRestTestPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
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
                verify(taskProviderMock).configure((Action) any());
                gradleUtils.verify(() -> GradleUtils.setupIdeForTestSourceSet(projectMock, sourceSetMock), atLeast(1));
                restTestUtil.verify(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock, "javaRestTest", RestIntegTestTask.class), atLeast(1));
                restTestUtil.verify(() -> RestTestUtil.setupJavaRestTestDependenciesDefaults(projectMock, sourceSetMock), atLeast(1));
            });
        }
    }
}

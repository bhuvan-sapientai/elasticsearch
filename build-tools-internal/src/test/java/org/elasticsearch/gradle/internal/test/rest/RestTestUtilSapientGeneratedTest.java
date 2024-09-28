package org.elasticsearch.gradle.internal.test.rest;

import org.junit.jupiter.api.Timeout;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.UnknownTaskException;
import org.gradle.api.UnknownProjectException;
import org.gradle.api.plugins.PluginContainer;
import org.mockito.stubbing.Answer;
import org.gradle.api.artifacts.Dependency;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.gradle.api.file.FileCollection;
import org.gradle.api.provider.Provider;
import org.gradle.api.Project;
import org.gradle.api.tasks.testing.Test;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.api.DomainObjectCollection;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.gradle.api.tasks.TaskProvider;
import org.elasticsearch.gradle.internal.test.RestIntegTestTask;
import org.mockito.MockedStatic;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.tasks.SourceSetOutput;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class RestTestUtilSapientGeneratedTest {

    private final DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);

    private final Dependency dependencyMock = mock(Dependency.class);

    private final DomainObjectCollection domainObjectCollectionMock = mock(DomainObjectCollection.class);

    private final FileCollection fileCollectionMock = mock(FileCollection.class);

    private final FileCollection fileCollectionMock2 = mock(FileCollection.class);

    private final PluginContainer pluginContainerMock = mock(PluginContainer.class);

    private final Project projectMock = mock(Project.class);

    private final Project projectMock2 = mock(Project.class);

    private final SourceSet sourceSetMock = mock(SourceSet.class);

    private final SourceSetOutput sourceSetOutputMock = mock(SourceSetOutput.class);

    private final TaskContainer taskContainerMock = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock2 = mock(TaskContainer.class);

    private final TaskProvider<RestIntegTestTask> taskProviderMock = mock(TaskProvider.class);

    private final TaskProvider taskProviderMock2 = mock(TaskProvider.class);

    //Sapient generated method id: ${registerTestTaskTest}, hash: FCAC99E82CBA13A685C156FFA79C3213
    @org.junit.jupiter.api.Test()
    void registerTestTaskTest() {
        //Arrange Statement(s)
        try (MockedStatic<RestTestUtil> restTestUtil = mockStatic(RestTestUtil.class, CALLS_REAL_METHODS)) {
            doReturn("return_of_getName1").when(sourceSetMock).getName();
            restTestUtil.when(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock, "return_of_getName1")).thenReturn(taskProviderMock);
            //Act Statement(s)
            Provider<RestIntegTestTask> result = RestTestUtil.registerTestTask(projectMock, sourceSetMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(taskProviderMock));
                verify(sourceSetMock, atLeast(1)).getName();
                restTestUtil.verify(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock, "return_of_getName1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${registerTestTask1Test}, hash: 7CFBD547E4494BF774079219304D4DB4
    @Disabled()
    @org.junit.jupiter.api.Test()
    void registerTestTask1Test() throws InvalidUserDataException, UnknownTaskException {
        doReturn(taskProviderMock).when(taskContainerMock).register(eq("taskName1"), eq(Test.class), (Action) any());
        doReturn(pluginContainerMock).when(projectMock).getPlugins();
        doReturn(domainObjectCollectionMock).when(pluginContainerMock).withType(eq(JavaPlugin.class), (Action) any());
        doReturn(taskContainerMock, taskContainerMock2).when(projectMock).getTasks();
        doReturn(taskProviderMock2).when(taskContainerMock2).named("test");
        doReturn(sourceSetOutputMock).when(sourceSetMock).getOutput();
        doReturn(fileCollectionMock).when(sourceSetOutputMock).getClassesDirs();
        doReturn(fileCollectionMock2).when(sourceSetMock).getRuntimeClasspath();
        //Act Statement(s)
        TaskProvider<RestIntegTestTask> result = RestTestUtil.registerTestTask(projectMock, sourceSetMock, "taskName1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(taskProviderMock));
            verify(projectMock, times(2)).getTasks();
            verify(taskContainerMock).register(eq("taskName1"), eq(Test.class), (Action) any());
            verify(projectMock).getPlugins();
            verify(pluginContainerMock).withType(eq(JavaPlugin.class), (Action) any());
            verify(taskContainerMock2).named("test");
            verify(sourceSetMock).getOutput();
            verify(sourceSetOutputMock).getClassesDirs();
            verify(sourceSetMock).getRuntimeClasspath();
        });
    }

    //Sapient generated method id: ${registerTestTask2Test}, hash: 6480B415EBEA57CB3BA6D4B16FFB3022
    @Disabled()
    @org.junit.jupiter.api.Test()
    void registerTestTask2Test() throws InvalidUserDataException, UnknownTaskException {
        TaskProvider taskProviderMock = mock(TaskProvider.class);
        doReturn(taskProviderMock).when(taskContainerMock).register(eq("taskName1"), eq(Test.class), (Action) any());
        doReturn(pluginContainerMock).when(projectMock).getPlugins();
        doReturn(domainObjectCollectionMock).when(pluginContainerMock).withType(eq(JavaPlugin.class), (Action) any());
        doReturn(taskContainerMock, taskContainerMock2).when(projectMock).getTasks();
        doReturn(taskProviderMock2).when(taskContainerMock2).named("test");
        doReturn(sourceSetOutputMock).when(sourceSetMock).getOutput();
        doReturn(fileCollectionMock).when(sourceSetOutputMock).getClassesDirs();
        doReturn(fileCollectionMock2).when(sourceSetMock).getRuntimeClasspath();
        //Act Statement(s)
        TaskProvider result = RestTestUtil.registerTestTask(projectMock, sourceSetMock, "taskName1", Test.class);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(taskProviderMock));
            verify(projectMock, times(2)).getTasks();
            verify(taskContainerMock).register(eq("taskName1"), eq(Test.class), (Action) any());
            verify(projectMock).getPlugins();
            verify(pluginContainerMock).withType(eq(JavaPlugin.class), (Action) any());
            verify(taskContainerMock2).named("test");
            verify(sourceSetMock).getOutput();
            verify(sourceSetOutputMock).getClassesDirs();
            verify(sourceSetMock).getRuntimeClasspath();
        });
    }

    //Sapient generated method id: ${setupYamlRestTestDependenciesDefaultsTest}, hash: 95F8FE27E8F7AAA200D5B2B355F016ED
    @org.junit.jupiter.api.Test()
    void setupYamlRestTestDependenciesDefaultsTest() {
        //Arrange Statement(s)
        try (MockedStatic<RestTestUtil> restTestUtil = mockStatic(RestTestUtil.class, CALLS_REAL_METHODS)) {
            restTestUtil.when(() -> RestTestUtil.setupYamlRestTestDependenciesDefaults(projectMock, sourceSetMock, false)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            RestTestUtil.setupYamlRestTestDependenciesDefaults(projectMock, sourceSetMock);
            //Assert statement(s)
            assertAll("result", () -> restTestUtil.verify(() -> RestTestUtil.setupYamlRestTestDependenciesDefaults(projectMock, sourceSetMock, false), atLeast(1)));
        }
    }

    //Sapient generated method id: ${setupYamlRestTestDependenciesDefaults1WhenUseNewTestClusters}, hash: 1872C77EB62A0F5FD0D0A8248F407218
    @org.junit.jupiter.api.Test()
    void setupYamlRestTestDependenciesDefaults1WhenUseNewTestClusters() throws UnknownProjectException {
        /* Branches:
         * (yamlTestRunnerProject != null) : true
         * (useNewTestClusters) : true
         */
        //Arrange Statement(s)
        doReturn(projectMock2).when(projectMock).findProject(":test:yaml-rest-runner");
        doReturn(dependencyMock).when(dependencyHandlerMock).add("return_of_getImplementationConfigurationName1", projectMock2);
        DependencyHandler dependencyHandlerMock2 = mock(DependencyHandler.class);
        doReturn(dependencyHandlerMock, dependencyHandlerMock2).when(projectMock).getDependencies();
        Dependency dependencyMock2 = mock(Dependency.class);
        Project projectMock3 = mock(Project.class);
        doReturn(dependencyMock2).when(dependencyHandlerMock2).add("return_of_getImplementationConfigurationName1", projectMock3);
        doReturn(projectMock3).when(projectMock).project(":test:test-clusters");
        doReturn("return_of_getImplementationConfigurationName1").when(sourceSetMock).getImplementationConfigurationName();
        //Act Statement(s)
        RestTestUtil.setupYamlRestTestDependenciesDefaults(projectMock, sourceSetMock, true);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).findProject(":test:yaml-rest-runner");
            verify(projectMock, times(2)).getDependencies();
            verify(dependencyHandlerMock).add("return_of_getImplementationConfigurationName1", projectMock2);
            verify(dependencyHandlerMock2).add("return_of_getImplementationConfigurationName1", projectMock3);
            verify(projectMock).project(":test:test-clusters");
            verify(sourceSetMock, times(2)).getImplementationConfigurationName();
        });
    }

    //Sapient generated method id: ${setupJavaRestTestDependenciesDefaultsWhenYamlTestRunnerProjectIsNotNull}, hash: A0C632C8286BDEF774C336D5EFB7C760
    @org.junit.jupiter.api.Test()
    void setupJavaRestTestDependenciesDefaultsWhenYamlTestRunnerProjectIsNotNull() {
        /* Branches:
         * (yamlTestRunnerProject != null) : true
         */
        //Arrange Statement(s)
        doReturn(projectMock2).when(projectMock).findProject(":test:yaml-rest-runner");
        doReturn(dependencyHandlerMock).when(projectMock).getDependencies();
        doReturn(dependencyMock).when(dependencyHandlerMock).add("return_of_getImplementationConfigurationName1", projectMock2);
        doReturn("return_of_getImplementationConfigurationName1").when(sourceSetMock).getImplementationConfigurationName();
        //Act Statement(s)
        RestTestUtil.setupJavaRestTestDependenciesDefaults(projectMock, sourceSetMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).findProject(":test:yaml-rest-runner");
            verify(projectMock).getDependencies();
            verify(dependencyHandlerMock).add("return_of_getImplementationConfigurationName1", projectMock2);
            verify(sourceSetMock).getImplementationConfigurationName();
        });
    }
}

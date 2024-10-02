package org.elasticsearch.gradle.internal.test.rest;

// import org.elasticsearch.gradle.internal.test.rest.RestTestUtil;
// import org.gradle.api.DomainObjectCollection;
// import static org.mockito.ArgumentMatchers.any;
// import org.junit.jupiter.api.Test;
// import org.gradle.api.InvalidUserDataException;
// import org.gradle.api.Project;
// import org.gradle.api.Action;
// import org.gradle.api.UnknownProjectException;
// import static org.hamcrest.MatcherAssert.assertThat;
// import org.junit.jupiter.params.provider.CsvSource;
// import org.gradle.api.plugins.JavaPlugin;
// import org.gradle.api.artifacts.dsl.DependencyHandler;
// import org.gradle.api.artifacts.Dependency;
// import org.mockito.MockedStatic;
// import static org.mockito.Mockito.*;
// import org.gradle.api.tasks.SourceSetOutput;
// import static org.junit.jupiter.api.Assertions.assertAll;
// import org.gradle.api.plugins.PluginContainer;
// import org.gradle.api.tasks.SourceSet;
// import static org.hamcrest.Matchers.equalTo;
// import org.junit.jupiter.params.ParameterizedTest;
// import static org.mockito.ArgumentMatchers.eq;
// import static org.junit.jupiter.api.Assertions.assertThrows;
// import org.junit.jupiter.api.Timeout;
// import org.gradle.api.tasks.TaskContainer;
// import org.gradle.api.UnknownTaskException;
// import org.gradle.api.tasks.testing.Test;
// import org.mockito.stubbing.Answer;
// import org.elasticsearch.gradle.internal.test.RestIntegTestTask;
// import org.gradle.api.file.FileCollection;
// import org.gradle.api.tasks.TaskProvider;
// import org.gradle.api.provider.Provider;
// import static org.mockito.ArgumentMatchers.any;

// @Timeout(value = 5)
class RestTestUtilSapientGeneratedTest {

//     private final DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);

//     private final Dependency dependencyMock = mock(Dependency.class);

//     private final DomainObjectCollection domainObjectCollectionMock = mock(DomainObjectCollection.class);

//     private final FileCollection fileCollectionMock = mock(FileCollection.class);

//     private final FileCollection fileCollectionMock2 = mock(FileCollection.class);

//     private final PluginContainer pluginContainerMock = mock(PluginContainer.class);

//     private final Project projectMock = mock(Project.class);

//     private final Project projectMock2 = mock(Project.class);

//     private final SourceSet sourceSetMock = mock(SourceSet.class);

//     private final SourceSetOutput sourceSetOutputMock = mock(SourceSetOutput.class);

//     private final TaskContainer taskContainerMock = mock(TaskContainer.class);

//     private final TaskContainer taskContainerMock2 = mock(TaskContainer.class);

//     private final TaskProvider<RestIntegTestTask> taskProviderMock = mock(TaskProvider.class);

//     private final TaskProvider taskProviderMock2 = mock(TaskProvider.class);

//     @Test
//     void registerTestTaskTest() {
//         try (MockedStatic<RestTestUtil> restTestUtil = mockStatic(RestTestUtil.class, CALLS_REAL_METHODS)) {
//             doReturn("return_of_getName1").when(sourceSetMock).getName();
//             restTestUtil.when(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock, "return_of_getName1")).thenReturn(taskProviderMock);
//             Provider<RestIntegTestTask> result = RestTestUtil.registerTestTask(projectMock, sourceSetMock);
//             assertAll("result", () -> {
//                 assertThat(result, equalTo(taskProviderMock));
//                 verify(sourceSetMock, atLeast(1)).getName();
//                 restTestUtil.verify(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock, "return_of_getName1"), atLeast(1));
//             });
//         }
//     }

//     @Test
//     void registerTestTask1Test() throws InvalidUserDataException, UnknownTaskException {
//         doReturn(taskProviderMock).when(taskContainerMock).register(eq("taskName1"), eq(RestIntegTestTask.class), any(Action.class));
//         doReturn(pluginContainerMock).when(projectMock).getPlugins();
//         doReturn(domainObjectCollectionMock).when(pluginContainerMock).withType(eq(JavaPlugin.class), any(Action.class));
//         doReturn(taskContainerMock).when(projectMock).getTasks();
//         doReturn(taskProviderMock2).when(taskContainerMock).named("test");
//         doReturn(sourceSetOutputMock).when(sourceSetMock).getOutput();
//         doReturn(fileCollectionMock).when(sourceSetOutputMock).getClassesDirs();
//         doReturn(fileCollectionMock2).when(sourceSetMock).getRuntimeClasspath();
//         TaskProvider<RestIntegTestTask> result = RestTestUtil.registerTestTask(projectMock, sourceSetMock, "taskName1");
//         assertAll("result", () -> {
//             assertThat(result, equalTo(taskProviderMock));
//             verify(projectMock, times(1)).getTasks();
//             verify(taskContainerMock).register(eq("taskName1"), eq(RestIntegTestTask.class), any(Action.class));
//             verify(projectMock).getPlugins();
//             verify(pluginContainerMock).withType(eq(JavaPlugin.class), any(Action.class));
//             verify(taskContainerMock).named("test");
//             verify(sourceSetMock).getOutput();
//             verify(sourceSetOutputMock).getClassesDirs();
//             verify(sourceSetMock).getRuntimeClasspath();
//         });
//     }

//     @Test
//     void registerTestTask2Test() throws InvalidUserDataException, UnknownTaskException {
//         TaskProvider taskProviderMock = mock(TaskProvider.class);
//         doReturn(taskProviderMock).when(taskContainerMock).register(eq("taskName1"), eq(Test.class), any(Action.class));
//         doReturn(pluginContainerMock).when(projectMock).getPlugins();
//         doReturn(domainObjectCollectionMock).when(pluginContainerMock).withType(eq(JavaPlugin.class), any(Action.class));
//         doReturn(taskContainerMock).when(projectMock).getTasks();
//         doReturn(taskProviderMock2).when(taskContainerMock).named("test");
//         doReturn(sourceSetOutputMock).when(sourceSetMock).getOutput();
//         doReturn(fileCollectionMock).when(sourceSetOutputMock).getClassesDirs();
//         doReturn(fileCollectionMock2).when(sourceSetMock).getRuntimeClasspath();
//         TaskProvider result = RestTestUtil.registerTestTask(projectMock, sourceSetMock, "taskName1", Test.class);
//         assertAll("result", () -> {
//             assertThat(result, equalTo(taskProviderMock));
//             verify(projectMock, times(1)).getTasks();
//             verify(taskContainerMock).register(eq("taskName1"), eq(Test.class), any(Action.class));
//             verify(projectMock).getPlugins();
//             verify(pluginContainerMock).withType(eq(JavaPlugin.class), any(Action.class));
//             verify(taskContainerMock).named("test");
//             verify(sourceSetMock).getOutput();
//             verify(sourceSetOutputMock).getClassesDirs();
//             verify(sourceSetMock).getRuntimeClasspath();
//         });
//     }

//     @Test
//     void setupYamlRestTestDependenciesDefaultsTest() {
//         try (MockedStatic<RestTestUtil> restTestUtil = mockStatic(RestTestUtil.class, CALLS_REAL_METHODS)) {
//             restTestUtil.when(() -> RestTestUtil.setupYamlRestTestDependenciesDefaults(projectMock, sourceSetMock, false)).thenAnswer((Answer<Void>) invocation -> null);
//             RestTestUtil.setupYamlRestTestDependenciesDefaults(projectMock, sourceSetMock);
//             assertAll("result", () -> restTestUtil.verify(() -> RestTestUtil.setupYamlRestTestDependenciesDefaults(projectMock, sourceSetMock, false), atLeast(1)));
//         }
//     }

//     @ParameterizedTest
//     @CsvSource({ "true,true", "true,false", "false,true", "false,false" })
//     void setupYamlRestTestDependenciesDefaults1Test(boolean yamlTestRunnerProjectExists, boolean useNewTestClusters) throws UnknownProjectException {
//         if (yamlTestRunnerProjectExists) {
//             doReturn(projectMock2).when(projectMock).findProject(":test:yaml-rest-runner");
//             doReturn(dependencyMock).when(dependencyHandlerMock).add("return_of_getImplementationConfigurationName1", projectMock2);
//         } else {
//             doReturn(null).when(projectMock).findProject(":test:yaml-rest-runner");
//         }
//         DependencyHandler dependencyHandlerMock2 = mock(DependencyHandler.class);
//         doReturn(dependencyHandlerMock, dependencyHandlerMock2).when(projectMock).getDependencies();
//         if (useNewTestClusters && yamlTestRunnerProjectExists) {
//             Dependency dependencyMock2 = mock(Dependency.class);
//             Project projectMock3 = mock(Project.class);
//             doReturn(dependencyMock2).when(dependencyHandlerMock2).add("return_of_getImplementationConfigurationName1", projectMock3);
//             doReturn(projectMock3).when(projectMock).project(":test:test-clusters");
//         }
//         doReturn("return_of_getImplementationConfigurationName1").when(sourceSetMock).getImplementationConfigurationName();
//         RestTestUtil.setupYamlRestTestDependenciesDefaults(projectMock, sourceSetMock, useNewTestClusters);
//         verify(projectMock).findProject(":test:yaml-rest-runner");
//         if (yamlTestRunnerProjectExists) {
//             verify(projectMock, atLeast(1)).getDependencies();
//             verify(dependencyHandlerMock).add("return_of_getImplementationConfigurationName1", projectMock2);
//             verify(sourceSetMock, atLeast(1)).getImplementationConfigurationName();
//             if (useNewTestClusters) {
//                 verify(dependencyHandlerMock2).add("return_of_getImplementationConfigurationName1", projectMock.project(":test:test-clusters"));
//                 verify(projectMock).project(":test:test-clusters");
//                 verify(sourceSetMock, times(2)).getImplementationConfigurationName();
//             }
//         } else {
//             verify(projectMock, never()).getDependencies();
//             verify(sourceSetMock, never()).getImplementationConfigurationName();
//         }
//     }

//     @ParameterizedTest
//     @CsvSource({ "true", "false" })
//     void setupJavaRestTestDependenciesDefaultsTest(boolean yamlTestRunnerProjectExists) {
//         if (yamlTestRunnerProjectExists) {
//             doReturn(projectMock2).when(projectMock).findProject(":test:yaml-rest-runner");
//             doReturn(dependencyHandlerMock).when(projectMock).getDependencies();
//             doReturn(dependencyMock).when(dependencyHandlerMock).add("return_of_getImplementationConfigurationName1", projectMock2);
//             doReturn("return_of_getImplementationConfigurationName1").when(sourceSetMock).getImplementationConfigurationName();
//         } else {
//             doReturn(null).when(projectMock).findProject(":test:yaml-rest-runner");
//         }
//         RestTestUtil.setupJavaRestTestDependenciesDefaults(projectMock, sourceSetMock);
//         verify(projectMock).findProject(":test:yaml-rest-runner");
//         if (yamlTestRunnerProjectExists) {
//             verify(projectMock).getDependencies();
//             verify(dependencyHandlerMock).add("return_of_getImplementationConfigurationName1", projectMock2);
//             verify(sourceSetMock).getImplementationConfigurationName();
//         } else {
//             verify(projectMock, never()).getDependencies();
//             verify(sourceSetMock, never()).getImplementationConfigurationName();
//         }
//     }

//     @Test
//     void constructorTest() {
//         assertThrows(IllegalAccessException.class, () -> {
//             Class<?> clazz = RestTestUtil.class;
//             clazz.getDeclaredConstructor().newInstance();
//         });
//     }
}
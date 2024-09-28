package org.elasticsearch.gradle.testclusters;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.file.FileSystemOperations;
import org.gradle.api.attributes.AttributesSchema;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.internal.jvm.Jvm;
import org.gradle.api.invocation.Gradle;
import org.gradle.api.provider.Provider;
import org.elasticsearch.gradle.util.GradleUtils;
import org.gradle.api.attributes.Attribute;
import java.util.concurrent.Callable;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.Task;
import org.elasticsearch.gradle.transform.UnzipTransform;
import org.gradle.api.services.BuildServiceRegistry;
import java.util.function.Consumer;
import org.gradle.api.services.BuildService;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.StartParameter;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.elasticsearch.gradle.ReaperService;
import org.gradle.api.NamedDomainObjectFactory;
import org.gradle.api.attributes.AttributeMatchingStrategy;
import org.gradle.api.Project;
import org.elasticsearch.gradle.DistributionDownloadPlugin;
import org.gradle.process.ExecOperations;
import org.gradle.api.artifacts.type.ArtifactTypeContainer;
import org.gradle.api.tasks.TaskCollection;
import org.elasticsearch.gradle.ReaperPlugin;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.gradle.api.internal.file.FileOperations;
import org.mockito.MockedStatic;
import java.io.File;
import org.gradle.api.Plugin;
import org.gradle.api.file.ArchiveOperations;
import org.gradle.api.plugins.PluginManager;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.atLeast;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class TestClustersPluginSapientGeneratedTest {

    private final ProviderFactory providerFactoryMock = mock(ProviderFactory.class, "providerFactory");

    private final ArchiveOperations archiveOperationsMock = mock(ArchiveOperations.class);

    private final ArtifactTypeContainer artifactTypeContainerMock = mock(ArtifactTypeContainer.class);

    private final AttributeMatchingStrategy attributeMatchingStrategyMock = mock(AttributeMatchingStrategy.class);

    private final AttributesSchema attributesSchemaMock = mock(AttributesSchema.class);

    private final BuildServiceRegistry buildServiceRegistryMock = mock(BuildServiceRegistry.class);

    private final BuildServiceRegistry buildServiceRegistryMock2 = mock(BuildServiceRegistry.class);

    private final BuildServiceRegistry buildServiceRegistryMock3 = mock(BuildServiceRegistry.class);

    private final DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);

    private final DependencyHandler dependencyHandlerMock2 = mock(DependencyHandler.class);

    private final DependencyHandler dependencyHandlerMock3 = mock(DependencyHandler.class);

    private final ExecOperations execOperationsMock = mock(ExecOperations.class);

    private final ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);

    private final FileOperations fileOperationsMock = mock(FileOperations.class);

    private final FileSystemOperations fileSystemOperationsMock = mock(FileSystemOperations.class);

    private final Gradle gradleMock = mock(Gradle.class);

    private final Gradle gradleMock2 = mock(Gradle.class);

    private final Gradle gradleMock3 = mock(Gradle.class);

    private final Gradle gradleMock4 = mock(Gradle.class);

    private final NamedDomainObjectContainer<ElasticsearchCluster> namedDomainObjectContainerMock = mock(NamedDomainObjectContainer.class);

    private final PluginContainer pluginContainerMock = mock(PluginContainer.class);

    private final PluginManager pluginManagerMock = mock(PluginManager.class);

    private final PluginManager pluginManagerMock2 = mock(PluginManager.class);

    private final Plugin pluginMock = mock(Plugin.class);

    private final Project projectMock = mock(Project.class);

    private final Project projectMock2 = mock(Project.class);

    private final Project projectMock3 = mock(Project.class);

    private final Provider providerMock = mock(Provider.class);

    private final Provider<BuildService<?>> providerMock2 = mock(Provider.class);

    private final Provider<File> providerMock3 = mock(Provider.class);

    private final Provider<ReaperService> providerMock4 = mock(Provider.class);

    private final StartParameter startParameterMock = mock(StartParameter.class);

    private final TaskCollection taskCollectionMock = mock(TaskCollection.class);

    private final TaskContainer taskContainerMock = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock2 = mock(TaskContainer.class);

    private final TaskProvider<Task> taskProviderMock = mock(TaskProvider.class);

    //Sapient generated method id: ${getFileSystemOperationsThrowsUnsupportedOperationException}, hash: 5865A8D54FF209CAC0C375E526D8DF7D
    @Test()
    void getFileSystemOperationsThrowsUnsupportedOperationException() {
        //Arrange Statement(s)
        TestClustersPlugin target = new TestClustersPlugin(providerFactoryMock);
        //Act Statement(s)
        final UnsupportedOperationException result = assertThrows(UnsupportedOperationException.class, () -> {
            target.getFileSystemOperations();
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getArchiveOperationsThrowsUnsupportedOperationException}, hash: B8FA0DD230DDB74E6D59BC5306FEFE88
    @Test()
    void getArchiveOperationsThrowsUnsupportedOperationException() {
        //Arrange Statement(s)
        TestClustersPlugin target = new TestClustersPlugin(providerFactoryMock);
        //Act Statement(s)
        final UnsupportedOperationException result = assertThrows(UnsupportedOperationException.class, () -> {
            target.getArchiveOperations();
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getExecOperationsThrowsUnsupportedOperationException}, hash: 970D55F240C30A6F0E49A0455ECB89E9
    @Test()
    void getExecOperationsThrowsUnsupportedOperationException() {
        //Arrange Statement(s)
        TestClustersPlugin target = new TestClustersPlugin(providerFactoryMock);
        //Act Statement(s)
        final UnsupportedOperationException result = assertThrows(UnsupportedOperationException.class, () -> {
            target.getExecOperations();
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getFileOperationsThrowsUnsupportedOperationException}, hash: DAA1E563E55B7E45494A9B3F95C37AB5
    @Test()
    void getFileOperationsThrowsUnsupportedOperationException() {
        //Arrange Statement(s)
        TestClustersPlugin target = new TestClustersPlugin(providerFactoryMock);
        //Act Statement(s)
        final UnsupportedOperationException result = assertThrows(UnsupportedOperationException.class, () -> {
            target.getFileOperations();
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${applyWhenSystemGetenvRUNTIME_JAVA_HOMEIsNull}, hash: 4819794D5C0C13367C2E8A0D25DFE9F3
    @Disabled()
    @Test()
    void applyWhenSystemGetenvRUNTIME_JAVA_HOMEIsNull() throws InvalidUserDataException {
        /* Branches:
         * (System.getenv("RUNTIME_JAVA_HOME") == null) : true  #  inside lambda$apply$1 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class, CALLS_REAL_METHODS)) {
            doReturn(pluginContainerMock).when(projectMock).getPlugins();
            doReturn(pluginMock).when(pluginContainerMock).apply(DistributionDownloadPlugin.class);
            doReturn(pluginManagerMock).when(projectMock2).getPluginManager();
            doNothing().when(pluginManagerMock).apply(ReaperPlugin.class);
            doReturn(buildServiceRegistryMock).when(gradleMock).getSharedServices();
            doReturn("return_of_getPath1").when(projectMock).getPath();
            File file = new File("pathname1");
            doReturn(file).when(projectMock).getBuildDir();
            doReturn(namedDomainObjectContainerMock).when(projectMock).container(eq(ElasticsearchCluster.class), (NamedDomainObjectFactory) any());
            doNothing().when(namedDomainObjectContainerMock).configureEach((Action) any());
            doNothing().when(namedDomainObjectContainerMock).forEach((Consumer) any());
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doNothing().when(extensionContainerMock).add("testClusters", namedDomainObjectContainerMock);
            doReturn(taskProviderMock).when(taskContainerMock).register(eq("listTestClusters"), (Action) any());
            doReturn(buildServiceRegistryMock2).when(gradleMock2).getSharedServices();
            doReturn(providerMock).when(buildServiceRegistryMock2).registerIfAbsent(eq("testClustersRegistry"), eq(TestClustersRegistry.class), (Action) any());
            doReturn(buildServiceRegistryMock3).when(gradleMock3).getSharedServices();
            doReturn(providerMock2).when(buildServiceRegistryMock3).registerIfAbsent(eq("testClustersThrottle"), eq(TestClustersThrottle.class), (Action) any());
            doReturn(gradleMock, gradleMock2, gradleMock3, gradleMock4).when(projectMock).getGradle();
            doReturn(startParameterMock).when(gradleMock4).getStartParameter();
            doReturn(4).when(startParameterMock).getMaxWorkerCount();
            doReturn(taskContainerMock, taskContainerMock2).when(projectMock).getTasks();
            doReturn(taskCollectionMock).when(taskContainerMock2).withType(TestClustersAware.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            doReturn(projectMock2, projectMock3).when(projectMock).getRootProject();
            doReturn(pluginManagerMock2).when(projectMock3).getPluginManager();
            doNothing().when(pluginManagerMock2).apply(TestClustersPlugin.TestClustersHookPlugin.class);
            doReturn(attributesSchemaMock).when(dependencyHandlerMock).getAttributesSchema();
            doReturn(attributeMatchingStrategyMock).when(attributesSchemaMock).attribute((Attribute) any());
            doReturn(artifactTypeContainerMock).when(dependencyHandlerMock2).getArtifactTypes();
            Object object = new Object();
            doReturn(object).when(artifactTypeContainerMock).maybeCreate("zip");
            doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3).when(projectMock).getDependencies();
            doNothing().when(dependencyHandlerMock3).registerTransform(eq(UnzipTransform.class), (Action) any());
            doReturn(providerMock3).when(providerFactoryMock).provider((Callable) any());
            gradleUtils.when(() -> GradleUtils.getBuildService(buildServiceRegistryMock, "reaper")).thenReturn(providerMock4);
            TestClustersPlugin target = spy(new TestClustersPlugin(providerFactoryMock));
            doReturn(fileSystemOperationsMock).when(target).getFileSystemOperations();
            doReturn(archiveOperationsMock).when(target).getArchiveOperations();
            doReturn(execOperationsMock).when(target).getExecOperations();
            doReturn(fileOperationsMock).when(target).getFileOperations();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, atLeast(1)).getPlugins();
                verify(pluginContainerMock, atLeast(1)).apply(DistributionDownloadPlugin.class);
                verify(projectMock, times(2)).getRootProject();
                verify(projectMock2, atLeast(1)).getPluginManager();
                verify(pluginManagerMock, atLeast(1)).apply(ReaperPlugin.class);
                verify(projectMock, times(4)).getGradle();
                verify(gradleMock, atLeast(1)).getSharedServices();
                verify(projectMock, atLeast(1)).getPath();
                verify(projectMock, atLeast(1)).getBuildDir();
                verify(projectMock, atLeast(1)).container(eq(ElasticsearchCluster.class), (NamedDomainObjectFactory) any());
                verify(namedDomainObjectContainerMock, atLeast(1)).configureEach((Action) any());
                verify(namedDomainObjectContainerMock, atLeast(1)).forEach((Consumer) any());
                verify(projectMock, atLeast(1)).getExtensions();
                verify(extensionContainerMock, atLeast(1)).add("testClusters", namedDomainObjectContainerMock);
                verify(projectMock, times(2)).getTasks();
                verify(taskContainerMock, atLeast(1)).register(eq("listTestClusters"), (Action) any());
                verify(gradleMock2, atLeast(1)).getSharedServices();
                verify(buildServiceRegistryMock2, atLeast(1)).registerIfAbsent(eq("testClustersRegistry"), eq(TestClustersRegistry.class), (Action) any());
                verify(gradleMock3, atLeast(1)).getSharedServices();
                verify(buildServiceRegistryMock3, atLeast(1)).registerIfAbsent(eq("testClustersThrottle"), eq(TestClustersThrottle.class), (Action) any());
                verify(gradleMock4, atLeast(1)).getStartParameter();
                verify(startParameterMock, atLeast(1)).getMaxWorkerCount();
                verify(taskContainerMock2, atLeast(1)).withType(TestClustersAware.class);
                verify(taskCollectionMock, atLeast(1)).configureEach((Action) any());
                verify(projectMock3, atLeast(1)).getPluginManager();
                verify(pluginManagerMock2, atLeast(1)).apply(TestClustersPlugin.TestClustersHookPlugin.class);
                verify(projectMock, times(3)).getDependencies();
                verify(dependencyHandlerMock, atLeast(1)).getAttributesSchema();
                verify(attributesSchemaMock, atLeast(1)).attribute((Attribute) any());
                verify(dependencyHandlerMock2, atLeast(1)).getArtifactTypes();
                verify(artifactTypeContainerMock, atLeast(1)).maybeCreate("zip");
                verify(dependencyHandlerMock3, atLeast(1)).registerTransform(eq(UnzipTransform.class), (Action) any());
                verify(providerFactoryMock, atLeast(1)).provider((Callable) any());
                gradleUtils.verify(() -> GradleUtils.getBuildService(buildServiceRegistryMock, "reaper"), atLeast(1));
                verify(target, atLeast(1)).getFileSystemOperations();
                verify(target, atLeast(1)).getArchiveOperations();
                verify(target, atLeast(1)).getExecOperations();
                verify(target, atLeast(1)).getFileOperations();
            });
        }
    }

    //Sapient generated method id: ${applyWhenSystemGetenvRUNTIME_JAVA_HOMEIsNotNull}, hash: FED328D2FE9E508095053AF38F9F21C6
    @Disabled()
    @Test()
    void applyWhenSystemGetenvRUNTIME_JAVA_HOMEIsNotNull() throws InvalidUserDataException {
        /* Branches:
         * (System.getenv("RUNTIME_JAVA_HOME") == null) : false  #  inside lambda$apply$1 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class, CALLS_REAL_METHODS)) {
            doReturn(pluginContainerMock).when(projectMock).getPlugins();
            doReturn(pluginMock).when(pluginContainerMock).apply(DistributionDownloadPlugin.class);
            doReturn(pluginManagerMock).when(projectMock2).getPluginManager();
            doNothing().when(pluginManagerMock).apply(ReaperPlugin.class);
            doReturn(buildServiceRegistryMock).when(gradleMock).getSharedServices();
            doReturn("return_of_getPath1").when(projectMock).getPath();
            File file = new File("pathname1");
            doReturn(file).when(projectMock).getBuildDir();
            doReturn(namedDomainObjectContainerMock).when(projectMock).container(eq(ElasticsearchCluster.class), (NamedDomainObjectFactory) any());
            doNothing().when(namedDomainObjectContainerMock).configureEach((Action) any());
            doNothing().when(namedDomainObjectContainerMock).forEach((Consumer) any());
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doNothing().when(extensionContainerMock).add("testClusters", namedDomainObjectContainerMock);
            doReturn(taskProviderMock).when(taskContainerMock).register(eq("listTestClusters"), (Action) any());
            doReturn(buildServiceRegistryMock2).when(gradleMock2).getSharedServices();
            doReturn(providerMock).when(buildServiceRegistryMock2).registerIfAbsent(eq("testClustersRegistry"), eq(TestClustersRegistry.class), (Action) any());
            doReturn(buildServiceRegistryMock3).when(gradleMock3).getSharedServices();
            doReturn(providerMock2).when(buildServiceRegistryMock3).registerIfAbsent(eq("testClustersThrottle"), eq(TestClustersThrottle.class), (Action) any());
            doReturn(gradleMock, gradleMock2, gradleMock3, gradleMock4).when(projectMock).getGradle();
            doReturn(startParameterMock).when(gradleMock4).getStartParameter();
            doReturn(4).when(startParameterMock).getMaxWorkerCount();
            doReturn(taskContainerMock, taskContainerMock2).when(projectMock).getTasks();
            doReturn(taskCollectionMock).when(taskContainerMock2).withType(TestClustersAware.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            doReturn(projectMock2, projectMock3).when(projectMock).getRootProject();
            doReturn(pluginManagerMock2).when(projectMock3).getPluginManager();
            doNothing().when(pluginManagerMock2).apply(TestClustersPlugin.TestClustersHookPlugin.class);
            doReturn(attributesSchemaMock).when(dependencyHandlerMock).getAttributesSchema();
            doReturn(attributeMatchingStrategyMock).when(attributesSchemaMock).attribute((Attribute) any());
            doReturn(artifactTypeContainerMock).when(dependencyHandlerMock2).getArtifactTypes();
            Object object = new Object();
            doReturn(object).when(artifactTypeContainerMock).maybeCreate("zip");
            doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3).when(projectMock).getDependencies();
            doNothing().when(dependencyHandlerMock3).registerTransform(eq(UnzipTransform.class), (Action) any());
            doReturn(providerMock3).when(providerFactoryMock).provider((Callable) any());
            gradleUtils.when(() -> GradleUtils.getBuildService(buildServiceRegistryMock, "reaper")).thenReturn(providerMock4);
            TestClustersPlugin target = spy(new TestClustersPlugin(providerFactoryMock));
            doReturn(fileSystemOperationsMock).when(target).getFileSystemOperations();
            doReturn(archiveOperationsMock).when(target).getArchiveOperations();
            doReturn(execOperationsMock).when(target).getExecOperations();
            doReturn(fileOperationsMock).when(target).getFileOperations();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, atLeast(1)).getPlugins();
                verify(pluginContainerMock, atLeast(1)).apply(DistributionDownloadPlugin.class);
                verify(projectMock, times(2)).getRootProject();
                verify(projectMock2, atLeast(1)).getPluginManager();
                verify(pluginManagerMock, atLeast(1)).apply(ReaperPlugin.class);
                verify(projectMock, times(4)).getGradle();
                verify(gradleMock, atLeast(1)).getSharedServices();
                verify(projectMock, atLeast(1)).getPath();
                verify(projectMock, atLeast(1)).getBuildDir();
                verify(projectMock, atLeast(1)).container(eq(ElasticsearchCluster.class), (NamedDomainObjectFactory) any());
                verify(namedDomainObjectContainerMock, atLeast(1)).configureEach((Action) any());
                verify(namedDomainObjectContainerMock, atLeast(1)).forEach((Consumer) any());
                verify(projectMock, atLeast(1)).getExtensions();
                verify(extensionContainerMock, atLeast(1)).add("testClusters", namedDomainObjectContainerMock);
                verify(projectMock, times(2)).getTasks();
                verify(taskContainerMock, atLeast(1)).register(eq("listTestClusters"), (Action) any());
                verify(gradleMock2, atLeast(1)).getSharedServices();
                verify(buildServiceRegistryMock2, atLeast(1)).registerIfAbsent(eq("testClustersRegistry"), eq(TestClustersRegistry.class), (Action) any());
                verify(gradleMock3, atLeast(1)).getSharedServices();
                verify(buildServiceRegistryMock3, atLeast(1)).registerIfAbsent(eq("testClustersThrottle"), eq(TestClustersThrottle.class), (Action) any());
                verify(gradleMock4, atLeast(1)).getStartParameter();
                verify(startParameterMock, atLeast(1)).getMaxWorkerCount();
                verify(taskContainerMock2, atLeast(1)).withType(TestClustersAware.class);
                verify(taskCollectionMock, atLeast(1)).configureEach((Action) any());
                verify(projectMock3, atLeast(1)).getPluginManager();
                verify(pluginManagerMock2, atLeast(1)).apply(TestClustersPlugin.TestClustersHookPlugin.class);
                verify(projectMock, times(3)).getDependencies();
                verify(dependencyHandlerMock, atLeast(1)).getAttributesSchema();
                verify(attributesSchemaMock, atLeast(1)).attribute((Attribute) any());
                verify(dependencyHandlerMock2, atLeast(1)).getArtifactTypes();
                verify(artifactTypeContainerMock, atLeast(1)).maybeCreate("zip");
                verify(dependencyHandlerMock3, atLeast(1)).registerTransform(eq(UnzipTransform.class), (Action) any());
                verify(providerFactoryMock, atLeast(1)).provider((Callable) any());
                gradleUtils.verify(() -> GradleUtils.getBuildService(buildServiceRegistryMock, "reaper"), atLeast(1));
                verify(target, atLeast(1)).getFileSystemOperations();
                verify(target, atLeast(1)).getArchiveOperations();
                verify(target, atLeast(1)).getExecOperations();
                verify(target, atLeast(1)).getFileOperations();
            });
        }
    }
}

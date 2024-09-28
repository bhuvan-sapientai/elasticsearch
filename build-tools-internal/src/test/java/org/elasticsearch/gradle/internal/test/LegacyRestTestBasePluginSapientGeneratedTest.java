package org.elasticsearch.gradle.internal.test;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.UnknownTaskException;
import java.util.List;
import org.gradle.api.NamedDomainObjectContainer;
import org.elasticsearch.gradle.internal.InternalTestClustersPlugin;
import org.gradle.api.invocation.Gradle;
import org.gradle.api.provider.Provider;
import org.elasticsearch.gradle.util.GradleUtils;
import org.elasticsearch.gradle.internal.ElasticsearchTestBasePlugin;
import org.elasticsearch.gradle.testclusters.ElasticsearchCluster;
import org.elasticsearch.gradle.internal.ElasticsearchJavaBasePlugin;
import org.gradle.api.provider.ProviderFactory;
import org.elasticsearch.gradle.internal.precommit.InternalPrecommitTasks;
import org.gradle.api.tasks.TaskProvider;
import java.util.ArrayList;
import org.elasticsearch.gradle.internal.FixtureStop;
import org.gradle.api.services.BuildServiceRegistry;
import org.gradle.api.plugins.ExtensionContainer;
import org.mockito.stubbing.Answer;
import org.gradle.api.tasks.bundling.Zip;
import org.gradle.api.Action;
import org.gradle.api.tasks.TaskContainer;
import org.elasticsearch.gradle.internal.RestrictedBuildApiService;
import org.gradle.api.Project;
import org.gradle.api.tasks.TaskCollection;
import org.mockito.MockedStatic;
import org.gradle.api.tasks.Sync;
import org.elasticsearch.gradle.testclusters.StandaloneRestIntegTestTask;
import org.gradle.api.plugins.PluginManager;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class LegacyRestTestBasePluginSapientGeneratedTest {

    private final ProviderFactory providerFactoryMock = mock(ProviderFactory.class, "providerFactory");

    private final BuildServiceRegistry buildServiceRegistryMock = mock(BuildServiceRegistry.class);

    private final ElasticsearchCluster elasticsearchClusterMock = mock(ElasticsearchCluster.class);

    private final ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);

    private final Gradle gradleMock = mock(Gradle.class);

    private final NamedDomainObjectContainer namedDomainObjectContainerMock = mock(NamedDomainObjectContainer.class);

    private final PluginManager pluginManagerMock = mock(PluginManager.class);

    private final PluginManager pluginManagerMock2 = mock(PluginManager.class);

    private final PluginManager pluginManagerMock3 = mock(PluginManager.class);

    private final PluginManager pluginManagerMock4 = mock(PluginManager.class);

    private final Project projectMock = mock(Project.class);

    private final Provider<RestrictedBuildApiService> providerMock = mock(Provider.class);

    private final Provider<String> providerMock2 = mock(Provider.class);

    private final Provider<String> providerMock3 = mock(Provider.class);

    private final Provider<String> providerMock4 = mock(Provider.class);

    private final RestrictedBuildApiService restrictedBuildApiServiceMock = mock(RestrictedBuildApiService.class);

    private final TaskCollection taskCollectionMock = mock(TaskCollection.class);

    private final TaskCollection taskCollectionMock2 = mock(TaskCollection.class);

    private final TaskCollection taskCollectionMock3 = mock(TaskCollection.class);

    private final TaskCollection taskCollectionMock4 = mock(TaskCollection.class);

    private final TaskCollection taskCollectionMock5 = mock(TaskCollection.class);

    private final TaskCollection taskCollectionMock6 = mock(TaskCollection.class);

    private final TaskContainer taskContainerMock = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock2 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock3 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock4 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock5 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock6 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock7 = mock(TaskContainer.class);

    private final TaskProvider taskProviderMock = mock(TaskProvider.class);

    //Sapient generated method id: ${applyWhenSystemPropertyTESTS_CLUSTER_NAMEIsNotNullThrowsIllegalArgumentException}, hash: 478219CA7414B897105A7F84FB2F7351
    @Disabled()
    @Test()
    void applyWhenSystemPropertyTESTS_CLUSTER_NAMEIsNotNullThrowsIllegalArgumentException() throws UnknownDomainObjectException {
        /* Branches:
         * (systemProperty(TESTS_REST_CLUSTER) == null) : true  #  inside lambda$apply$5 method
         * (systemProperty(TESTS_CLUSTER) != null) : false  #  inside lambda$apply$5 method
         * (systemProperty(TESTS_CLUSTER_NAME) != null) : true  #  inside lambda$apply$5 method
         */
        //Arrange Statement(s)
        try (MockedStatic<InternalPrecommitTasks> internalPrecommitTasks = mockStatic(InternalPrecommitTasks.class)) {
            doReturn(gradleMock).when(projectMock).getGradle();
            doReturn(buildServiceRegistryMock).when(gradleMock).getSharedServices();
            doReturn(providerMock).when(buildServiceRegistryMock).registerIfAbsent(eq("restrictedBuildAPI"), eq(RestrictedBuildApiService.class), (Action) any());
            doReturn(restrictedBuildApiServiceMock).when(providerMock).get();
            doNothing().when(restrictedBuildApiServiceMock).failOnUsageRestriction(LegacyRestTestBasePlugin.class, projectMock);
            doNothing().when(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
            doNothing().when(pluginManagerMock2).apply(ElasticsearchTestBasePlugin.class);
            doReturn(pluginManagerMock, pluginManagerMock2, pluginManagerMock3).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock3).apply(InternalTestClustersPlugin.class);
            doReturn(taskContainerMock).when(projectMock).getTasks();
            doReturn(taskCollectionMock).when(taskContainerMock).withType(RestIntegTestTask.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(namedDomainObjectContainerMock).when(extensionContainerMock).getByName("testClusters");
            doReturn(elasticsearchClusterMock).when(namedDomainObjectContainerMock).maybeCreate("return_of_getName1");
            doReturn(providerMock2).when(providerFactoryMock).systemProperty("tests.rest.cluster");
            doReturn(null).when(providerMock2).getOrNull();
            doReturn(providerMock3).when(providerFactoryMock).systemProperty("tests.cluster");
            doReturn(null).when(providerMock3).getOrNull();
            doReturn(providerMock4).when(providerFactoryMock).systemProperty("tests.clustername");
            doReturn("return_of_getOrNull1").when(providerMock4).getOrNull();
            internalPrecommitTasks.when(() -> InternalPrecommitTasks.create(projectMock, false)).thenAnswer((Answer<Void>) invocation -> null);
            LegacyRestTestBasePlugin target = new LegacyRestTestBasePlugin(providerFactoryMock);
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                target.apply(projectMock);
            });
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("tests.rest.cluster, tests.cluster, and tests.clustername must all be null or non-null");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
                verify(projectMock).getGradle();
                verify(gradleMock).getSharedServices();
                verify(buildServiceRegistryMock).registerIfAbsent(eq("restrictedBuildAPI"), eq(RestrictedBuildApiService.class), (Action) any());
                verify(providerMock, atLeast(1)).get();
                verify(restrictedBuildApiServiceMock).failOnUsageRestriction(LegacyRestTestBasePlugin.class, projectMock);
                verify(projectMock, times(3)).getPluginManager();
                verify(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
                verify(pluginManagerMock2).apply(ElasticsearchTestBasePlugin.class);
                verify(pluginManagerMock3).apply(InternalTestClustersPlugin.class);
                verify(projectMock).getTasks();
                verify(taskContainerMock).withType(RestIntegTestTask.class);
                verify(taskCollectionMock).configureEach((Action) any());
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByName("testClusters");
                verify(namedDomainObjectContainerMock).maybeCreate("return_of_getName1");
                verify(providerFactoryMock).systemProperty("tests.rest.cluster");
                verify(providerMock2).getOrNull();
                verify(providerFactoryMock).systemProperty("tests.cluster");
                verify(providerMock3).getOrNull();
                verify(providerFactoryMock).systemProperty("tests.clustername");
                verify(providerMock4).getOrNull();
                internalPrecommitTasks.verify(() -> InternalPrecommitTasks.create(projectMock, false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenSystemPropertyTESTS_CLUSTER_NAMEIsNullThrowsIllegalArgumentException}, hash: 4AB0B316D279F29F98EEFF42FB2B3922
    @Disabled()
    @Test()
    void applyWhenSystemPropertyTESTS_CLUSTER_NAMEIsNullThrowsIllegalArgumentException() throws UnknownDomainObjectException {
        /* Branches:
         * (systemProperty(TESTS_REST_CLUSTER) == null) : false  #  inside lambda$apply$5 method
         * (systemProperty(TESTS_CLUSTER) == null) : false  #  inside lambda$apply$5 method
         * (systemProperty(TESTS_CLUSTER_NAME) == null) : true  #  inside lambda$apply$5 method
         */
        //Arrange Statement(s)
        try (MockedStatic<InternalPrecommitTasks> internalPrecommitTasks = mockStatic(InternalPrecommitTasks.class)) {
            doReturn(gradleMock).when(projectMock).getGradle();
            doReturn(buildServiceRegistryMock).when(gradleMock).getSharedServices();
            doReturn(providerMock).when(buildServiceRegistryMock).registerIfAbsent(eq("restrictedBuildAPI"), eq(RestrictedBuildApiService.class), (Action) any());
            doReturn(restrictedBuildApiServiceMock).when(providerMock).get();
            doNothing().when(restrictedBuildApiServiceMock).failOnUsageRestriction(LegacyRestTestBasePlugin.class, projectMock);
            doNothing().when(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
            doNothing().when(pluginManagerMock2).apply(ElasticsearchTestBasePlugin.class);
            doReturn(pluginManagerMock, pluginManagerMock2, pluginManagerMock3).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock3).apply(InternalTestClustersPlugin.class);
            doReturn(taskContainerMock).when(projectMock).getTasks();
            doReturn(taskCollectionMock).when(taskContainerMock).withType(RestIntegTestTask.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(namedDomainObjectContainerMock).when(extensionContainerMock).getByName("testClusters");
            doReturn(elasticsearchClusterMock).when(namedDomainObjectContainerMock).maybeCreate("return_of_getName1");
            doReturn(providerMock2).when(providerFactoryMock).systemProperty("tests.rest.cluster");
            doReturn("return_of_getOrNull1").when(providerMock2).getOrNull();
            doReturn(providerMock3).when(providerFactoryMock).systemProperty("tests.cluster");
            doReturn("return_of_getOrNull1").when(providerMock3).getOrNull();
            doReturn(providerMock4).when(providerFactoryMock).systemProperty("tests.clustername");
            doReturn(null).when(providerMock4).getOrNull();
            internalPrecommitTasks.when(() -> InternalPrecommitTasks.create(projectMock, false)).thenAnswer((Answer<Void>) invocation -> null);
            LegacyRestTestBasePlugin target = new LegacyRestTestBasePlugin(providerFactoryMock);
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                target.apply(projectMock);
            });
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("tests.rest.cluster, tests.cluster, and tests.clustername must all be null or non-null");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
                verify(projectMock).getGradle();
                verify(gradleMock).getSharedServices();
                verify(buildServiceRegistryMock).registerIfAbsent(eq("restrictedBuildAPI"), eq(RestrictedBuildApiService.class), (Action) any());
                verify(providerMock, atLeast(1)).get();
                verify(restrictedBuildApiServiceMock).failOnUsageRestriction(LegacyRestTestBasePlugin.class, projectMock);
                verify(projectMock, times(3)).getPluginManager();
                verify(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
                verify(pluginManagerMock2).apply(ElasticsearchTestBasePlugin.class);
                verify(pluginManagerMock3).apply(InternalTestClustersPlugin.class);
                verify(projectMock).getTasks();
                verify(taskContainerMock).withType(RestIntegTestTask.class);
                verify(taskCollectionMock).configureEach((Action) any());
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByName("testClusters");
                verify(namedDomainObjectContainerMock).maybeCreate("return_of_getName1");
                verify(providerFactoryMock).systemProperty("tests.rest.cluster");
                verify(providerMock2).getOrNull();
                verify(providerFactoryMock).systemProperty("tests.cluster");
                verify(providerMock3).getOrNull();
                verify(providerFactoryMock).systemProperty("tests.clustername");
                verify(providerMock4).getOrNull();
                internalPrecommitTasks.verify(() -> InternalPrecommitTasks.create(projectMock, false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenGradleUtilsIsModuleProjectProjectGetPath}, hash: FEBF71ABB21A03CDEDF4E385677B2858
    @Disabled()
    @Test()
    void applyWhenGradleUtilsIsModuleProjectProjectGetPath() throws UnknownDomainObjectException, UnknownTaskException {
        /* Branches:
         * (systemProperty(TESTS_REST_CLUSTER) == null) : true  #  inside lambda$apply$5 method
         * (systemProperty(TESTS_CLUSTER) != null) : false  #  inside lambda$apply$5 method
         * (systemProperty(TESTS_CLUSTER_NAME) != null) : false  #  inside lambda$apply$5 method
         * (GradleUtils.isModuleProject(project.getPath())) : true  #  inside lambda$apply$10 method
         */
        //Arrange Statement(s)
        TaskProvider<Sync> taskProviderMock2 = mock(TaskProvider.class);
        try (MockedStatic<InternalPrecommitTasks> internalPrecommitTasks = mockStatic(InternalPrecommitTasks.class);
            MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            doReturn(gradleMock).when(projectMock).getGradle();
            doReturn(buildServiceRegistryMock).when(gradleMock).getSharedServices();
            doReturn(providerMock).when(buildServiceRegistryMock).registerIfAbsent(eq("restrictedBuildAPI"), eq(RestrictedBuildApiService.class), (Action) any());
            doReturn(restrictedBuildApiServiceMock).when(providerMock).get();
            doNothing().when(restrictedBuildApiServiceMock).failOnUsageRestriction(LegacyRestTestBasePlugin.class, projectMock);
            doNothing().when(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
            doNothing().when(pluginManagerMock2).apply(ElasticsearchTestBasePlugin.class);
            doNothing().when(pluginManagerMock3).apply(InternalTestClustersPlugin.class);
            doReturn(taskCollectionMock).when(taskContainerMock).withType(RestIntegTestTask.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(namedDomainObjectContainerMock).when(extensionContainerMock).getByName("testClusters");
            doReturn(elasticsearchClusterMock).when(namedDomainObjectContainerMock).maybeCreate("return_of_getName1");
            List<String> stringList = new ArrayList<>();
            doReturn(stringList).when(elasticsearchClusterMock).getAllHttpSocketURI();
            List<String> stringList2 = new ArrayList<>();
            doReturn(stringList2).when(elasticsearchClusterMock).getAllTransportPortURI();
            doReturn("return_of_getName1").when(elasticsearchClusterMock).getName();
            List<String> stringList3 = new ArrayList<>();
            doReturn(stringList3).when(elasticsearchClusterMock).getAllReadinessPortURI();
            List<String> stringList4 = new ArrayList<>();
            doReturn(stringList4).when(elasticsearchClusterMock).getAllRemoteAccessPortURI();
            doReturn(taskProviderMock).when(taskContainerMock2).named("check");
            doNothing().when(taskProviderMock).configure((Action) any());
            doReturn(taskCollectionMock2).when(taskContainerMock3).withType(RestIntegTestTask.class);
            doReturn(taskCollectionMock3).when(taskContainerMock4).withType(StandaloneRestIntegTestTask.class);
            doNothing().when(taskCollectionMock3).configureEach((Action) any());
            doReturn(taskCollectionMock4).when(taskContainerMock5).withType(FixtureStop.class);
            doReturn(taskCollectionMock5).when(taskContainerMock6).withType(StandaloneRestIntegTestTask.class);
            doNothing().when(taskCollectionMock5).configureEach((Action) any());
            doReturn(pluginManagerMock, pluginManagerMock2, pluginManagerMock3, pluginManagerMock4).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock4).withPlugin(eq("elasticsearch.esplugin"), (Action) any());
            doReturn("").when(projectMock).getPath();
            doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3, taskContainerMock4, taskContainerMock5, taskContainerMock6, taskContainerMock7).when(projectMock).getTasks();
            doReturn(taskCollectionMock6).when(taskContainerMock7).withType(Sync.class);
            doReturn(taskProviderMock2).when(taskCollectionMock6).named("explodedBundlePlugin");
            doReturn(providerMock2).when(providerFactoryMock).systemProperty("tests.rest.cluster");
            doReturn(null).when(providerMock2).getOrNull();
            doReturn(providerMock3).when(providerFactoryMock).systemProperty("tests.cluster");
            doReturn(null).when(providerMock3).getOrNull();
            doReturn(providerMock4).when(providerFactoryMock).systemProperty("tests.clustername");
            doReturn(null).when(providerMock4).getOrNull();
            gradleUtils.when(() -> GradleUtils.isModuleProject("")).thenReturn(true);
            internalPrecommitTasks.when(() -> InternalPrecommitTasks.create(projectMock, false)).thenAnswer((Answer<Void>) invocation -> null);
            LegacyRestTestBasePlugin target = new LegacyRestTestBasePlugin(providerFactoryMock);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).getGradle();
                verify(gradleMock).getSharedServices();
                verify(buildServiceRegistryMock).registerIfAbsent(eq("restrictedBuildAPI"), eq(RestrictedBuildApiService.class), (Action) any());
                verify(providerMock, atLeast(1)).get();
                verify(restrictedBuildApiServiceMock).failOnUsageRestriction(LegacyRestTestBasePlugin.class, projectMock);
                verify(projectMock, times(4)).getPluginManager();
                verify(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
                verify(pluginManagerMock2).apply(ElasticsearchTestBasePlugin.class);
                verify(pluginManagerMock3).apply(InternalTestClustersPlugin.class);
                verify(projectMock, times(7)).getTasks();
                verify(taskContainerMock).withType(RestIntegTestTask.class);
                verify(taskCollectionMock).configureEach((Action) any());
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByName("testClusters");
                verify(namedDomainObjectContainerMock).maybeCreate("return_of_getName1");
                verify(elasticsearchClusterMock).getAllHttpSocketURI();
                verify(elasticsearchClusterMock).getAllTransportPortURI();
                verify(elasticsearchClusterMock).getName();
                verify(elasticsearchClusterMock).getAllReadinessPortURI();
                verify(elasticsearchClusterMock).getAllRemoteAccessPortURI();
                verify(taskContainerMock2).named("check");
                verify(taskProviderMock).configure((Action) any());
                verify(taskContainerMock3).withType(RestIntegTestTask.class);
                verify(taskContainerMock4).withType(StandaloneRestIntegTestTask.class);
                verify(taskCollectionMock3).configureEach((Action) any());
                verify(taskContainerMock5).withType(FixtureStop.class);
                verify(taskContainerMock6).withType(StandaloneRestIntegTestTask.class);
                verify(taskCollectionMock5).configureEach((Action) any());
                verify(pluginManagerMock4).withPlugin(eq("elasticsearch.esplugin"), (Action) any());
                verify(projectMock).getPath();
                verify(taskContainerMock7).withType(Sync.class);
                verify(taskCollectionMock6).named("explodedBundlePlugin");
                verify(providerFactoryMock).systemProperty("tests.rest.cluster");
                verify(providerMock2).getOrNull();
                verify(providerFactoryMock).systemProperty("tests.cluster");
                verify(providerMock3).getOrNull();
                verify(providerFactoryMock).systemProperty("tests.clustername");
                verify(providerMock4).getOrNull();
                gradleUtils.verify(() -> GradleUtils.isModuleProject(""), atLeast(1));
                internalPrecommitTasks.verify(() -> InternalPrecommitTasks.create(projectMock, false), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenGradleUtilsNotIsModuleProjectProjectGetPath}, hash: 06D23E9B45E21531F446F8B587A11D60
    @Disabled()
    @Test()
    void applyWhenGradleUtilsNotIsModuleProjectProjectGetPath() throws UnknownDomainObjectException, UnknownTaskException {
        /* Branches:
         * (systemProperty(TESTS_REST_CLUSTER) == null) : true  #  inside lambda$apply$5 method
         * (systemProperty(TESTS_CLUSTER) != null) : false  #  inside lambda$apply$5 method
         * (systemProperty(TESTS_CLUSTER_NAME) != null) : false  #  inside lambda$apply$5 method
         * (GradleUtils.isModuleProject(project.getPath())) : false  #  inside lambda$apply$10 method
         */
        //Arrange Statement(s)
        TaskProvider taskProviderMock2 = mock(TaskProvider.class);
        try (MockedStatic<InternalPrecommitTasks> internalPrecommitTasks = mockStatic(InternalPrecommitTasks.class)) {
            doReturn(gradleMock).when(projectMock).getGradle();
            doReturn(buildServiceRegistryMock).when(gradleMock).getSharedServices();
            doReturn(providerMock).when(buildServiceRegistryMock).registerIfAbsent(eq("restrictedBuildAPI"), eq(RestrictedBuildApiService.class), (Action) any());
            doReturn(restrictedBuildApiServiceMock).when(providerMock).get();
            doNothing().when(restrictedBuildApiServiceMock).failOnUsageRestriction(LegacyRestTestBasePlugin.class, projectMock);
            doNothing().when(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
            doNothing().when(pluginManagerMock2).apply(ElasticsearchTestBasePlugin.class);
            doNothing().when(pluginManagerMock3).apply(InternalTestClustersPlugin.class);
            doReturn(taskCollectionMock).when(taskContainerMock).withType(RestIntegTestTask.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(namedDomainObjectContainerMock).when(extensionContainerMock).getByName("testClusters");
            doReturn(elasticsearchClusterMock).when(namedDomainObjectContainerMock).maybeCreate("return_of_getName1");
            List<String> stringList = new ArrayList<>();
            doReturn(stringList).when(elasticsearchClusterMock).getAllHttpSocketURI();
            List<String> stringList2 = new ArrayList<>();
            doReturn(stringList2).when(elasticsearchClusterMock).getAllTransportPortURI();
            doReturn("return_of_getName1").when(elasticsearchClusterMock).getName();
            List<String> stringList3 = new ArrayList<>();
            doReturn(stringList3).when(elasticsearchClusterMock).getAllReadinessPortURI();
            List<String> stringList4 = new ArrayList<>();
            doReturn(stringList4).when(elasticsearchClusterMock).getAllRemoteAccessPortURI();
            doReturn(taskProviderMock).when(taskContainerMock2).named("check");
            doNothing().when(taskProviderMock).configure((Action) any());
            doReturn(taskCollectionMock2).when(taskContainerMock3).withType(RestIntegTestTask.class);
            doReturn(taskCollectionMock3).when(taskContainerMock4).withType(StandaloneRestIntegTestTask.class);
            doNothing().when(taskCollectionMock3).configureEach((Action) any());
            doReturn(taskCollectionMock4).when(taskContainerMock5).withType(FixtureStop.class);
            doReturn(taskCollectionMock5).when(taskContainerMock6).withType(StandaloneRestIntegTestTask.class);
            doNothing().when(taskCollectionMock5).configureEach((Action) any());
            doReturn(pluginManagerMock, pluginManagerMock2, pluginManagerMock3, pluginManagerMock4).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock4).withPlugin(eq("elasticsearch.esplugin"), (Action) any());
            doReturn("").when(projectMock).getPath();
            doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3, taskContainerMock4, taskContainerMock5, taskContainerMock6, taskContainerMock7).when(projectMock).getTasks();
            doReturn(taskCollectionMock6).when(taskContainerMock7).withType(Zip.class);
            doReturn(taskProviderMock2).when(taskCollectionMock6).named("bundlePlugin");
            doReturn(providerMock2).when(providerFactoryMock).systemProperty("tests.rest.cluster");
            doReturn(null).when(providerMock2).getOrNull();
            doReturn(providerMock3).when(providerFactoryMock).systemProperty("tests.cluster");
            doReturn(null).when(providerMock3).getOrNull();
            doReturn(providerMock4).when(providerFactoryMock).systemProperty("tests.clustername");
            doReturn(null).when(providerMock4).getOrNull();
            internalPrecommitTasks.when(() -> InternalPrecommitTasks.create(projectMock, false)).thenAnswer((Answer<Void>) invocation -> null);
            LegacyRestTestBasePlugin target = new LegacyRestTestBasePlugin(providerFactoryMock);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).getGradle();
                verify(gradleMock).getSharedServices();
                verify(buildServiceRegistryMock).registerIfAbsent(eq("restrictedBuildAPI"), eq(RestrictedBuildApiService.class), (Action) any());
                verify(providerMock, atLeast(1)).get();
                verify(restrictedBuildApiServiceMock).failOnUsageRestriction(LegacyRestTestBasePlugin.class, projectMock);
                verify(projectMock, times(4)).getPluginManager();
                verify(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
                verify(pluginManagerMock2).apply(ElasticsearchTestBasePlugin.class);
                verify(pluginManagerMock3).apply(InternalTestClustersPlugin.class);
                verify(projectMock, times(7)).getTasks();
                verify(taskContainerMock).withType(RestIntegTestTask.class);
                verify(taskCollectionMock).configureEach((Action) any());
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByName("testClusters");
                verify(namedDomainObjectContainerMock).maybeCreate("return_of_getName1");
                verify(elasticsearchClusterMock).getAllHttpSocketURI();
                verify(elasticsearchClusterMock).getAllTransportPortURI();
                verify(elasticsearchClusterMock).getName();
                verify(elasticsearchClusterMock).getAllReadinessPortURI();
                verify(elasticsearchClusterMock).getAllRemoteAccessPortURI();
                verify(taskContainerMock2).named("check");
                verify(taskProviderMock).configure((Action) any());
                verify(taskContainerMock3).withType(RestIntegTestTask.class);
                verify(taskContainerMock4).withType(StandaloneRestIntegTestTask.class);
                verify(taskCollectionMock3).configureEach((Action) any());
                verify(taskContainerMock5).withType(FixtureStop.class);
                verify(taskContainerMock6).withType(StandaloneRestIntegTestTask.class);
                verify(taskCollectionMock5).configureEach((Action) any());
                verify(pluginManagerMock4).withPlugin(eq("elasticsearch.esplugin"), (Action) any());
                verify(projectMock).getPath();
                verify(taskContainerMock7).withType(Zip.class);
                verify(taskCollectionMock6).named("bundlePlugin");
                verify(providerFactoryMock).systemProperty("tests.rest.cluster");
                verify(providerMock2).getOrNull();
                verify(providerFactoryMock).systemProperty("tests.cluster");
                verify(providerMock3).getOrNull();
                verify(providerFactoryMock).systemProperty("tests.clustername");
                verify(providerMock4).getOrNull();
                internalPrecommitTasks.verify(() -> InternalPrecommitTasks.create(projectMock, false), atLeast(1));
            });
        }
    }
}

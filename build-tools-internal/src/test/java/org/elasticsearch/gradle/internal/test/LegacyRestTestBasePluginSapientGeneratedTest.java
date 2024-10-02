package org.elasticsearch.gradle.internal.test;

import org.elasticsearch.gradle.internal.test.LegacyRestTestBasePlugin;

import org.gradle.api.invocation.Gradle;
import org.elasticsearch.gradle.internal.precommit.InternalPrecommitTasks;
import org.elasticsearch.gradle.internal.ElasticsearchTestBasePlugin;
import org.gradle.api.plugins.PluginManager;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;
import org.mockito.Mock;
import org.elasticsearch.gradle.testclusters.ElasticsearchCluster;
import org.elasticsearch.gradle.internal.RestrictedBuildApiService;
import org.elasticsearch.gradle.internal.InternalTestClustersPlugin;
import org.elasticsearch.gradle.internal.ElasticsearchJavaBasePlugin;
import org.mockito.MockitoAnnotations;
import org.gradle.api.provider.ProviderFactory;
import org.elasticsearch.gradle.testclusters.StandaloneRestIntegTestTask;
import org.gradle.api.tasks.bundling.Zip;

import static org.mockito.Mockito.*;

import org.elasticsearch.gradle.testclusters.TestClustersPlugin;
import org.elasticsearch.gradle.internal.FixtureStop;
import org.gradle.api.tasks.Sync;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.gradle.api.tasks.TaskCollection;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.UnknownTaskException;
import org.gradle.api.UnknownDomainObjectException;
import org.elasticsearch.gradle.util.GradleUtils;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.services.BuildServiceRegistry;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.Task;
import org.gradle.api.provider.Provider;

import static org.mockito.ArgumentMatchers.any;

class LegacyRestTestBasePluginSapientGeneratedTest {

    @Mock
    private ProviderFactory providerFactory;

    @Mock
    private Project project;

    @Mock
    private Gradle gradle;

    @Mock
    private BuildServiceRegistry buildServiceRegistry;

    @Mock
    private Provider<RestrictedBuildApiService> restrictedBuildApiServiceProvider;

    @Mock
    private RestrictedBuildApiService restrictedBuildApiService;

    @Mock
    private PluginManager pluginManager;

    @Mock
    private TaskContainer taskContainer;

    @Mock
    private TaskCollection<RestIntegTestTask> restIntegTestTaskCollection;

    @Mock
    private TaskCollection<StandaloneRestIntegTestTask> standaloneRestIntegTestTaskCollection;

    @Mock
    private TaskCollection<FixtureStop> fixtureStopTaskCollection;

    @Mock
    private TaskProvider<Task> checkTaskProvider;

    @Mock
    private ElasticsearchCluster elasticsearchCluster;

    private LegacyRestTestBasePlugin plugin;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        plugin = new LegacyRestTestBasePlugin(providerFactory);
        when(project.getGradle()).thenReturn(gradle);
        when(gradle.getSharedServices()).thenReturn(buildServiceRegistry);
        when(buildServiceRegistry.registerIfAbsent(eq("restrictedBuildAPI"), eq(RestrictedBuildApiService.class), any())).thenReturn(restrictedBuildApiServiceProvider);
        when(restrictedBuildApiServiceProvider.get()).thenReturn(restrictedBuildApiService);
        when(project.getPluginManager()).thenReturn(pluginManager);
        when(project.getTasks()).thenReturn(taskContainer);
        when(taskContainer.withType(RestIntegTestTask.class)).thenReturn(restIntegTestTaskCollection);
        when(taskContainer.withType(StandaloneRestIntegTestTask.class)).thenReturn(standaloneRestIntegTestTaskCollection);
        when(taskContainer.withType(FixtureStop.class)).thenReturn(fixtureStopTaskCollection);
        when(taskContainer.named("check")).thenReturn(checkTaskProvider);
    }

    @Test
    void apply_appliesNecessaryPlugins() {
        plugin.apply(project);
        verify(pluginManager).apply(ElasticsearchJavaBasePlugin.class);
        verify(pluginManager).apply(ElasticsearchTestBasePlugin.class);
        verify(pluginManager).apply(InternalTestClustersPlugin.class);
    }

    @Test
    void apply_configuresRestIntegTestTasks() {
        when(project.getExtensions().getByName(TestClustersPlugin.EXTENSION_NAME)).thenReturn(mock(ElasticsearchCluster.class));
        when(providerFactory.systemProperty("tests.rest.cluster")).thenReturn(mock(Provider.class));
        when(providerFactory.systemProperty("tests.cluster")).thenReturn(mock(Provider.class));
        when(providerFactory.systemProperty("tests.clustername")).thenReturn(mock(Provider.class));
        plugin.apply(project);
        verify(restIntegTestTaskCollection).configureEach(any());
    }

    @Test
    void apply_configuresCheckTask() {
        plugin.apply(project);
        verify(checkTaskProvider).configure(any());
    }

    @Test
    void apply_configuresStandaloneRestIntegTestTasks() {
        plugin.apply(project);
        verify(standaloneRestIntegTestTaskCollection, times(2)).configureEach(any());
    }

    @Test
    void apply_configuresPluginTasks_whenEspluginApplied() throws UnknownTaskException {
        when(project.getPath()).thenReturn("test-path");
        when(taskContainer.withType(Sync.class)).thenReturn(mock(TaskCollection.class));
        when(taskContainer.withType(Zip.class)).thenReturn(mock(TaskCollection.class));
        plugin.apply(project);
        verify(pluginManager).withPlugin(eq("elasticsearch.esplugin"), any());
    }

    @Test
    void apply_throwsIllegalArgumentException_whenTestsRestClusterIsNotNullButOthersAreNull() {
        when(providerFactory.systemProperty("tests.rest.cluster")).thenReturn(mock(Provider.class));
        when(providerFactory.systemProperty("tests.cluster")).thenReturn(mock(Provider.class));
        when(providerFactory.systemProperty("tests.clustername")).thenReturn(mock(Provider.class));
        when(providerFactory.systemProperty("tests.rest.cluster").getOrNull()).thenReturn("non-null");
        when(providerFactory.systemProperty("tests.cluster").getOrNull()).thenReturn(null);
        when(providerFactory.systemProperty("tests.clustername").getOrNull()).thenReturn(null);
        assertThrows(IllegalArgumentException.class, () -> plugin.apply(project));
    }

    @Test
    void apply_throwsIllegalArgumentException_whenTestsClusterIsNotNullButOthersAreNull() {
        when(providerFactory.systemProperty("tests.rest.cluster")).thenReturn(mock(Provider.class));
        when(providerFactory.systemProperty("tests.cluster")).thenReturn(mock(Provider.class));
        when(providerFactory.systemProperty("tests.clustername")).thenReturn(mock(Provider.class));
        when(providerFactory.systemProperty("tests.rest.cluster").getOrNull()).thenReturn(null);
        when(providerFactory.systemProperty("tests.cluster").getOrNull()).thenReturn("non-null");
        when(providerFactory.systemProperty("tests.clustername").getOrNull()).thenReturn(null);
        assertThrows(IllegalArgumentException.class, () -> plugin.apply(project));
    }

    @Test
    void apply_throwsIllegalArgumentException_whenTestsClusterNameIsNotNullButOthersAreNull() {
        when(providerFactory.systemProperty("tests.rest.cluster")).thenReturn(mock(Provider.class));
        when(providerFactory.systemProperty("tests.cluster")).thenReturn(mock(Provider.class));
        when(providerFactory.systemProperty("tests.clustername")).thenReturn(mock(Provider.class));
        when(providerFactory.systemProperty("tests.rest.cluster").getOrNull()).thenReturn(null);
        when(providerFactory.systemProperty("tests.cluster").getOrNull()).thenReturn(null);
        when(providerFactory.systemProperty("tests.clustername").getOrNull()).thenReturn("non-null");
        assertThrows(IllegalArgumentException.class, () -> plugin.apply(project));
    }
}

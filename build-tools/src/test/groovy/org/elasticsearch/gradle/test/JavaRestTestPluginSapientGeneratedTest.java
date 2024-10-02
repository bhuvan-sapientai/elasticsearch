package org.elasticsearch.gradle.test;

import org.elasticsearch.gradle.test.JavaRestTestPlugin;
import org.elasticsearch.gradle.plugin.PluginBuildPlugin;
import org.gradle.api.plugins.PluginManager;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.Project;
import org.gradle.language.base.plugins.LifecycleBasePlugin;
import org.mockito.Mock;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.Action;
import org.elasticsearch.gradle.testclusters.ElasticsearchCluster;
import org.gradle.api.plugins.ExtensionContainer;
import org.elasticsearch.gradle.testclusters.StandaloneRestIntegTestTask;
import static org.mockito.ArgumentMatchers.anyString;
import org.gradle.api.plugins.JavaBasePlugin;
import org.gradle.api.tasks.bundling.Zip;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.*;
import org.elasticsearch.gradle.testclusters.TestClustersPlugin;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.tasks.SourceSet;
import org.junit.jupiter.api.BeforeEach;
import org.gradle.api.NamedDomainObjectProvider;
import org.gradle.api.artifacts.Configuration;
import static org.mockito.ArgumentMatchers.eq;
import org.elasticsearch.gradle.VersionProperties;
import org.gradle.api.Plugin;
import org.elasticsearch.gradle.test.JavaRestTestPlugin;
import org.gradle.api.tasks.TaskContainer;
import static org.elasticsearch.gradle.plugin.BasePluginBuildPlugin.BUNDLE_PLUGIN_TASK_NAME;
import org.gradle.api.tasks.TaskProvider;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

class JavaRestTestPluginSapientGeneratedTest {

    @Mock
    private Project project;

    @Mock
    private PluginManager pluginManager;

    @Mock
    private ExtensionContainer extensionContainer;

    @Mock
    private SourceSetContainer sourceSetContainer;

    @Mock
    private SourceSet sourceSet;

    @Mock
    private Configuration configuration;

    @Mock
    private NamedDomainObjectContainer<ElasticsearchCluster> testClusters;

    @Mock
    private TaskContainer taskContainer;

    @Mock
    private PluginContainer pluginContainer;

    @Mock
    private TaskProvider<StandaloneRestIntegTestTask> taskProvider;

    @Mock
    private TaskProvider<Zip> zipTaskProvider;

    private JavaRestTestPlugin plugin;

    @BeforeEach
    void setUp() {
        plugin = new JavaRestTestPlugin();
        when(project.getPluginManager()).thenReturn(pluginManager);
        when(project.getExtensions()).thenReturn(extensionContainer);
        when(project.getTasks()).thenReturn(taskContainer);
        when(project.getPlugins()).thenReturn(pluginContainer);
    }

    @Disabled()
    @Test
    void testApply() throws Exception {
        try (MockedStatic<VersionProperties> versionPropertiesMock = mockStatic(VersionProperties.class)) {
            versionPropertiesMock.when(VersionProperties::getElasticsearch).thenReturn("7.10.0");
            when(extensionContainer.getByType(SourceSetContainer.class)).thenReturn(sourceSetContainer);
            when(sourceSetContainer.maybeCreate(anyString())).thenReturn(sourceSet);
            when(project.getConfigurations()).thenReturn(mock(org.gradle.api.artifacts.ConfigurationContainer.class));
            when(project.getConfigurations().getByName(anyString())).thenReturn(configuration);
            when(project.getDependencies()).thenReturn(mock(org.gradle.api.artifacts.dsl.DependencyHandler.class));
            when(extensionContainer.getByName(TestClustersPlugin.EXTENSION_NAME)).thenReturn(testClusters);
            when(testClusters.register(anyString())).thenReturn(mock(NamedDomainObjectProvider.class));
            when(taskContainer.register(eq(JavaRestTestPlugin.JAVA_REST_TEST), eq(StandaloneRestIntegTestTask.class), any(Action.class))).thenReturn(taskProvider);
            when(taskContainer.withType(Zip.class)).thenReturn(mock(org.gradle.api.tasks.TaskCollection.class));
            when(taskContainer.withType(Zip.class).named(BUNDLE_PLUGIN_TASK_NAME)).thenReturn(zipTaskProvider);
            plugin.apply(project);
            verify(pluginManager).apply(GradleTestPolicySetupPlugin.class);
            verify(pluginManager).apply(TestClustersPlugin.class);
            verify(pluginManager).apply(JavaBasePlugin.class);
            verify(sourceSetContainer).maybeCreate(JavaRestTestPlugin.JAVA_REST_TEST);
            verify(configuration).defaultDependencies(any());
            verify(testClusters).register(JavaRestTestPlugin.JAVA_REST_TEST);
            verify(taskContainer).register(eq(JavaRestTestPlugin.JAVA_REST_TEST), eq(StandaloneRestIntegTestTask.class), any(Action.class));
            verify(pluginContainer).withType(eq(PluginBuildPlugin.class), any(Action.class));
            verify(taskContainer).named(eq(LifecycleBasePlugin.CHECK_TASK_NAME), any(Action.class));
        }
    }
}

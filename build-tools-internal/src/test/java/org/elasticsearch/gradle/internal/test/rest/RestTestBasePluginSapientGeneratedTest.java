package org.elasticsearch.gradle.internal.test.rest;

import org.elasticsearch.gradle.internal.test.rest.RestTestBasePlugin;
import org.elasticsearch.gradle.DistributionDownloadPlugin;
import java.util.Collection;
import java.util.LinkedHashSet;
import org.elasticsearch.gradle.plugin.PluginBuildPlugin;
import javax.inject.Inject;
import org.elasticsearch.gradle.internal.test.HistoricalFeaturesMetadataPlugin;
import org.gradle.api.NamedDomainObjectContainer;
import org.elasticsearch.gradle.testclusters.StandaloneRestIntegTestTask;
import static org.hamcrest.MatcherAssert.assertThat;
import org.gradle.testfixtures.ProjectBuilder;
import static org.mockito.Mockito.*;
import org.gradle.api.tasks.PathSensitivity;
import org.elasticsearch.gradle.Version;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import org.elasticsearch.gradle.plugin.BasePluginBuildPlugin;
import org.elasticsearch.gradle.transform.UnzipTransform;
import org.junit.jupiter.params.ParameterizedTest;
import org.elasticsearch.gradle.internal.ElasticsearchJavaPlugin;
import org.gradle.api.artifacts.ProjectDependency;
import org.elasticsearch.gradle.internal.info.BuildParams;
import java.util.Set;
import org.elasticsearch.gradle.plugin.PluginPropertiesExtension;
import org.elasticsearch.gradle.internal.test.ErrorReportingTestListener;
import static org.hamcrest.Matchers.*;
import org.gradle.api.attributes.Attribute;
import org.gradle.api.artifacts.DependencySet;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.Task;
import org.gradle.api.provider.Provider;
import groovy.lang.Closure;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;
import java.io.File;
import org.gradle.api.Action;
import org.gradle.api.tasks.util.PatternFilterable;
import org.elasticsearch.gradle.internal.InternalDistributionDownloadPlugin;
import java.util.Iterator;
import org.gradle.api.provider.ProviderFactory;
import org.junit.jupiter.params.provider.CsvSource;
import org.gradle.api.tasks.ClasspathNormalizer;
import org.gradle.api.artifacts.Dependency;
import java.util.List;
import org.elasticsearch.gradle.ElasticsearchDistributionType;
import org.gradle.api.artifacts.type.ArtifactTypeDefinition;
import org.elasticsearch.gradle.ElasticsearchDistribution;
import java.util.Optional;
import org.gradle.api.file.FileTree;
import org.gradle.api.artifacts.Configuration;
import org.elasticsearch.gradle.VersionProperties;
import org.gradle.api.Plugin;
import org.elasticsearch.gradle.test.SystemPropertyCommandLineArgumentProvider;
import org.elasticsearch.gradle.distribution.ElasticsearchDistributionTypes;
import org.elasticsearch.gradle.util.GradleUtils;
import static org.junit.jupiter.api.Assertions.*;
import org.gradle.api.file.ConfigurableFileCollection;
import org.elasticsearch.gradle.Architecture;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

class RestTestBasePluginSapientGeneratedTest {

    private Project project;

    private RestTestBasePlugin plugin;

    @BeforeEach
    void setUp() {
        project = ProjectBuilder.builder().build();
        plugin = new RestTestBasePlugin(project.getProviders());
        plugin.apply(project);
    }

    @Disabled()
    @Test
    void testPluginApplied() {
        assertTrue(project.getPlugins().hasPlugin(RestTestBasePlugin.class));
    }

    @Disabled()
    @Test
    void testDefaultDistributionCreated() {
        ElasticsearchDistribution defaultDistro = project.getExtensions().getByType(ElasticsearchDistribution.class);
        assertNotNull(defaultDistro);
        assertEquals(VersionProperties.getElasticsearch(), defaultDistro.getVersion());
        assertEquals(Architecture.current(), defaultDistro.getArchitecture());
    }

    @Disabled()
    @Test
    void testIntegTestDistributionCreated() {
        ElasticsearchDistribution integTestDistro = project.getExtensions().getByType(ElasticsearchDistribution.class);
        assertNotNull(integTestDistro);
        assertEquals(VersionProperties.getElasticsearch(), integTestDistro.getVersion());
        assertEquals(ElasticsearchDistributionTypes.INTEG_TEST_ZIP, integTestDistro.getType());
    }

    @Disabled()
    @Test
    void testModulesConfigurationCreated() {
        Configuration modulesConfig = project.getConfigurations().findByName("clusterModules");
        assertNotNull(modulesConfig);
        assertTrue(modulesConfig.isCanBeResolved());
        assertFalse(modulesConfig.isCanBeConsumed());
    }

    @Disabled()
    @Test
    void testPluginsConfigurationCreated() {
        Configuration pluginsConfig = project.getConfigurations().findByName("clusterPlugins");
        assertNotNull(pluginsConfig);
        assertTrue(pluginsConfig.isCanBeResolved());
        assertFalse(pluginsConfig.isCanBeConsumed());
    }

    @Disabled()
    @Test
    void testExtractedPluginsConfigurationCreated() {
        Configuration extractedPluginsConfig = project.getConfigurations().findByName("extractedPlugins");
        assertNotNull(extractedPluginsConfig);
        assertTrue(extractedPluginsConfig.isCanBeResolved());
        assertFalse(extractedPluginsConfig.isCanBeConsumed());
        assertTrue(extractedPluginsConfig.getExtendsFrom().contains(project.getConfigurations().getByName("clusterPlugins")));
    }

    @Disabled()
    @Test
    void testFeaturesMetadataConfigurationCreated() {
        Configuration featuresMetadataConfig = project.getConfigurations().findByName("featuresMetadataDeps");
        assertNotNull(featuresMetadataConfig);
        assertFalse(featuresMetadataConfig.isCanBeConsumed());
        assertTrue(featuresMetadataConfig.isCanBeResolved());
    }

    @Disabled()
    @Test
    void testDefaultDistroFeaturesMetadataConfigurationCreated() {
        Configuration defaultDistroFeaturesMetadataConfig = project.getConfigurations().findByName("defaultDistrofeaturesMetadataDeps");
        assertNotNull(defaultDistroFeaturesMetadataConfig);
        assertFalse(defaultDistroFeaturesMetadataConfig.isCanBeConsumed());
        assertTrue(defaultDistroFeaturesMetadataConfig.isCanBeResolved());
    }

    @Disabled()
    @ParameterizedTest
    @CsvSource({ "7.10.0,true", "8.0.0,false" })
    void testUsesBwcDistribution(String versionString, boolean expectMinimumWireVersion) {
        //Project mockProject = mock(Project.class);
        //Task mockTask = mock(Task.class);
        //when(mockTask.getProject()).thenReturn(mockProject);
        //Version version = Version.fromString(versionString);
        //plugin.apply(mockProject);
        // Mock the necessary methods and properties
        //when(mockProject.getProviders()).thenReturn(mock(ProviderFactory.class));
        //when(mockProject.files(any())).thenReturn(mock(FileCollection.class));
        // Call the usesBwcDistribution method
        //plugin.usesBwcDistribution(mockTask, version);
        // Verify that the task depends on the BWC distribution
        //verify(mockTask).dependsOn(any(ElasticsearchDistribution.class));
        // Verify that the correct system property is set
        //verify(mockTask).systemProperty(matches("tests\\.(snapshot|release)\\.distribution\\." + version), any(Provider.class));
        // Verify if the minimum wire compatible version is set when necessary
        /*if (expectMinimumWireVersion) {
    verify(mockTask).systemProperty(eq("tests.minimum.wire.compatible"), any(Provider.class));
} else {
    verify(mockTask, never()).systemProperty(eq("tests.minimum.wire.compatible"), any(Provider.class));
}*/
    }

    @Disabled()
    @Test
    void testStandaloneRestIntegTestTaskConfiguration() {
        TaskProvider<StandaloneRestIntegTestTask> taskProvider = project.getTasks().register("testTask", StandaloneRestIntegTestTask.class);
        StandaloneRestIntegTestTask task = taskProvider.get();
        // Verify task configuration
        assertEquals(project.getGradle().getStartParameter().getMaxWorkerCount() / 2, task.getMaxParallelForks());
        assertFalse(task.getSystemProperties().containsKey("tests.security.manager"));
        assertEquals("false", task.getSystemProperties().get("tests.system_call_filter"));
        // Verify system properties
        assertTrue(task.getSystemProperties().containsKey("tests.cluster.modules.path"));
        assertTrue(task.getSystemProperties().containsKey("tests.cluster.plugins.path"));
        assertTrue(task.getSystemProperties().containsKey("tests.features.metadata.path"));
        assertTrue(task.getSystemProperties().containsKey("tests.minimum.wire.compatible"));
    }

    @Disabled()
    @Test
    void testCreateDistribution() {
        //ElasticsearchDistribution distribution = plugin.createDistribution(project, "testDistro", "7.10.0", ElasticsearchDistributionTypes.ARCHIVE);
        //assertNotNull(distribution);
        //assertEquals("testDistro", distribution.getName());
        //assertEquals("7.10.0", distribution.getVersion());
        //assertEquals(ElasticsearchDistributionTypes.ARCHIVE, distribution.getType());
    }

    @Disabled()
    @Test
    void testRegisterDistributionInputs() {
        //Task task = project.getTasks().create("testTask");
        //ElasticsearchDistribution distribution = mock(ElasticsearchDistribution.class);
        //when(distribution.getName()).thenReturn("testDistro");
        //plugin.registerDistributionInputs(task, distribution);
        //verify(task, times(2)).getInputs();
    }

    @Disabled()
    @Test
    void testFindModulePath() {
        //Project rootProject = ProjectBuilder.builder().withName("root").build();
        //Project moduleProject = ProjectBuilder.builder().withName("module").withParent(rootProject).build();
        //moduleProject.getPluginManager().apply("elasticsearch.esplugin");
        //moduleProject.getExtensions().getByType(PluginPropertiesExtension.class).setName("testModule");
        //project.setParent(rootProject);
        //Optional<String> modulePath = plugin.findModulePath(project, "testModule");
        //assertTrue(modulePath.isPresent());
        //assertEquals(":module", modulePath.get());
    }

    @Disabled()
    @Test
    void testCreatePluginConfiguration() {
        //Configuration config = plugin.createPluginConfiguration(project, "testConfig", true, false);
        //assertNotNull(config);
        //assertEquals("testConfig", config.getName());
        //assertTrue(config.isCanBeResolved());
        //assertFalse(config.isCanBeConsumed());
    }

    @Disabled()
    @Test
    void testGetExplodedBundleDependency() {
        //Dependency dependency = plugin.getExplodedBundleDependency(project, ":testModule");
        //assertNotNull(dependency);
        //assertTrue(dependency instanceof ProjectDependency);
        //assertEquals(":testModule", ((ProjectDependency) dependency).getDependencyProject().getPath());
        //assertEquals("explodedBundleElements", ((ProjectDependency) dependency).getTargetConfiguration());
    }

    @Disabled()
    @Test
    void testGetBundleZipTaskDependency() {
        //Project dependencyProject = ProjectBuilder.builder().withName("testModule").withParent(project).build();
        //TaskProvider<Task> bundleTask = dependencyProject.getTasks().register("bundlePlugin");
        //Dependency dependency = plugin.getBundleZipTaskDependency(project, ":testModule");
        //assertNotNull(dependency);
        //assertTrue(dependency instanceof FileCollection);
        //assertEquals(Set.of(new File(project.getRootDir(), "testModule/build/distributions/testModule-0.1.zip")), ((FileCollection) dependency).getFiles());
    }
}

package org.elasticsearch.gradle.internal.test.rest;

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
import org.junit.jupiter.api.Timeout;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.UnknownTaskException;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.plugins.PluginContainer;
import java.util.concurrent.Callable;
import org.gradle.api.specs.Spec;
import java.util.HashSet;
import java.util.HashMap;
import org.gradle.api.plugins.ExtensionContainer;
import org.elasticsearch.gradle.internal.BwcVersions;
import org.gradle.api.tasks.TaskContainer;
import java.util.stream.Stream;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.tasks.TaskCollection;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.mockito.MockedStatic;
import org.gradle.api.plugins.PluginManager;
import static java.util.Map.entry;
import static org.mockito.ArgumentMatchers.eq;

@Timeout(value = 5)
class RestTestBasePluginSapientGeneratedTest {

    private Project project;

    private RestTestBasePlugin plugin;

    private final ProviderFactory providerFactoryMock = mock(ProviderFactory.class, "providerFactory");

    private final BwcVersions bwcVersionsMock = mock(BwcVersions.class);

    private final ConfigurableFileCollection configurableFileCollectionMock = mock(ConfigurableFileCollection.class);

    private final ConfigurableFileCollection configurableFileCollectionMock2 = mock(ConfigurableFileCollection.class);

    private final ConfigurableFileCollection configurableFileCollectionMock3 = mock(ConfigurableFileCollection.class);

    private final ConfigurableFileCollection configurableFileCollectionMock4 = mock(ConfigurableFileCollection.class);

    private final ConfigurableFileCollection configurableFileCollectionMock5 = mock(ConfigurableFileCollection.class);

    private final ConfigurableFileCollection configurableFileCollectionMock6 = mock(ConfigurableFileCollection.class);

    private final ConfigurableFileCollection configurableFileCollectionMock7 = mock(ConfigurableFileCollection.class);

    private final ConfigurableFileCollection configurableFileCollectionMock8 = mock(ConfigurableFileCollection.class);

    private final ConfigurableFileCollection configurableFileCollectionMock9 = mock(ConfigurableFileCollection.class);

    private final ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);

    private final ConfigurationContainer configurationContainerMock2 = mock(ConfigurationContainer.class);

    private final ConfigurationContainer configurationContainerMock3 = mock(ConfigurationContainer.class);

    private final ConfigurationContainer configurationContainerMock4 = mock(ConfigurationContainer.class);

    private final ConfigurationContainer configurationContainerMock5 = mock(ConfigurationContainer.class);

    private final Configuration configurationMock = mock(Configuration.class);

    private final Configuration configurationMock2 = mock(Configuration.class);

    private final Configuration configurationMock3 = mock(Configuration.class);

    private final Configuration configurationMock4 = mock(Configuration.class);

    private final DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);

    private final DependencyHandler dependencyHandlerMock2 = mock(DependencyHandler.class);

    private final DependencyHandler dependencyHandlerMock3 = mock(DependencyHandler.class);

    private final DependencyHandler dependencyHandlerMock4 = mock(DependencyHandler.class);

    private final DependencyHandler dependencyHandlerMock5 = mock(DependencyHandler.class);

    private final DependencyHandler dependencyHandlerMock6 = mock(DependencyHandler.class);

    private final DependencyHandler dependencyHandlerMock7 = mock(DependencyHandler.class);

    private final DependencyHandler dependencyHandlerMock8 = mock(DependencyHandler.class);

    private final DependencyHandler dependencyHandlerMock9 = mock(DependencyHandler.class);

    private final Dependency dependencyMock = mock(Dependency.class);

    private final Dependency dependencyMock2 = mock(Dependency.class);

    private final Dependency dependencyMock3 = mock(Dependency.class);

    private final Dependency dependencyMock4 = mock(Dependency.class);

    private final Dependency dependencyMock5 = mock(Dependency.class);

    private final Dependency dependencyMock6 = mock(Dependency.class);

    private final Dependency dependencyMock7 = mock(Dependency.class);

    private final Dependency dependencyMock8 = mock(Dependency.class);

    private final DependencySet dependencySetMock = mock(DependencySet.class);

    private final DependencySet dependencySetMock2 = mock(DependencySet.class);

    private final ElasticsearchDistribution elasticsearchDistributionMock = mock(ElasticsearchDistribution.class);

    private final ElasticsearchDistribution elasticsearchDistributionMock2 = mock(ElasticsearchDistribution.class);

    private final ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);

    private final ExtensionContainer extensionContainerMock2 = mock(ExtensionContainer.class);

    private final FileCollection fileCollectionMock = mock(FileCollection.class);

    private final FileCollection fileCollectionMock2 = mock(FileCollection.class);

    private final FileCollection fileCollectionMock3 = mock(FileCollection.class);

    private final FileCollection fileCollectionMock4 = mock(FileCollection.class);

    private final FileCollection fileCollectionMock5 = mock(FileCollection.class);

    private final FileCollection fileCollectionMock6 = mock(FileCollection.class);

    private final FileTree fileTreeMock = mock(FileTree.class);

    private final FileTree fileTreeMock2 = mock(FileTree.class);

    private final FileTree fileTreeMock3 = mock(FileTree.class);

    private final FileTree fileTreeMock4 = mock(FileTree.class);

    private final FileTree fileTreeMock5 = mock(FileTree.class);

    private final FileTree fileTreeMock6 = mock(FileTree.class);

    private final FileTree fileTreeMock7 = mock(FileTree.class);

    private final FileTree fileTreeMock8 = mock(FileTree.class);

    private final NamedDomainObjectContainer<ElasticsearchDistribution> namedDomainObjectContainerMock = mock(NamedDomainObjectContainer.class);

    private final NamedDomainObjectContainer<ElasticsearchDistribution> namedDomainObjectContainerMock2 = mock(NamedDomainObjectContainer.class);

    private final ObjectFactory objectFactoryMock = mock(ObjectFactory.class);

    private final ObjectFactory objectFactoryMock2 = mock(ObjectFactory.class);

    private final ObjectFactory objectFactoryMock3 = mock(ObjectFactory.class);

    private final PluginContainer pluginContainerMock = mock(PluginContainer.class);

    private final PluginContainer pluginContainerMock2 = mock(PluginContainer.class);

    private final PluginManager pluginManagerMock = mock(PluginManager.class);

    private final PluginManager pluginManagerMock2 = mock(PluginManager.class);

    private final PluginManager pluginManagerMock3 = mock(PluginManager.class);

    private final Project projectMock = mock(Project.class);

    private final Project projectMock2 = mock(Project.class);

    private final Project projectMock3 = mock(Project.class);

    private final Project projectMock4 = mock(Project.class);

    private final Project projectMock5 = mock(Project.class);

    private final Project projectMock6 = mock(Project.class);

    private final Project projectMock7 = mock(Project.class);

    private final Project projectMock8 = mock(Project.class);

    private final Project projectMock9 = mock(Project.class);

    private final Provider providerMock = mock(Provider.class);

    private final Provider providerMock2 = mock(Provider.class);

    private final Provider providerMock3 = mock(Provider.class);

    private final Provider providerMock4 = mock(Provider.class);

    private final Provider providerMock5 = mock(Provider.class);

    private final Provider providerMock6 = mock(Provider.class);

    private final TaskCollection taskCollectionMock = mock(TaskCollection.class);

    private final TaskContainer taskContainerMock = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock2 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock3 = mock(TaskContainer.class);

    private final TaskProvider taskProviderMock = mock(TaskProvider.class);

    private final TaskProvider taskProviderMock2 = mock(TaskProvider.class);

    private final Version versionMock = mock(Version.class);

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

    //Sapient generated method id: ${applyWhenDefaultBranch}, hash: 6CA0590541DB0592D444468935D515ED
    @Test()
    void applyWhenDefaultBranch() throws InvalidUserDataException, UnknownDomainObjectException, IllegalStateException, UnknownTaskException {
        /* Branches:
         * (maybeDistro == null) : false  #  inside createDistribution method
         * (useExploded) : true  #  inside lambda$createPluginConfiguration$31 method
         * (isExtended == false) : true  #  inside lambda$createPluginConfiguration$31 method
         * (iterator.hasNext()) : false  #  inside lambda$createPluginConfiguration$30 method
         * (GradleUtils.isModuleProject(project.getPath())) : false  #  inside lambda$apply$7 method
         * (f.getName().endsWith(".jar") == false) : false  #  inside lambda$registerConfigurationInputs$15 method
         * (branch expression (line 287)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<DistributionDownloadPlugin> distributionDownloadPlugin = mockStatic(DistributionDownloadPlugin.class);
            MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            doNothing().when(pluginManagerMock).apply(ElasticsearchJavaPlugin.class);
            doNothing().when(pluginManagerMock2).apply(InternalDistributionDownloadPlugin.class);
            doReturn(configurationMock).when(configurationContainerMock).create(eq("clusterModules"), (Action) any());
            doReturn(dependencySetMock).when(configurationMock).getDependencies();
            Stream stream = Stream.empty();
            doReturn(stream).when(dependencySetMock).stream();
            doReturn("").when(configurationMock).getName();
            doReturn(configurationMock2).when(configurationContainerMock2).create(eq("clusterPlugins"), (Action) any());
            doReturn(dependencySetMock2).when(configurationMock2).getDependencies();
            Stream stream2 = Stream.empty();
            doReturn(stream2).when(dependencySetMock2).stream();
            doReturn(configurationMock3).when(configurationContainerMock3).create(eq("extractedPlugins"), (Action) any());
            Configuration[] configurationArray = new Configuration[] { configurationMock2 };
            doReturn(configurationMock4).when(configurationMock3).extendsFrom(configurationArray);
            doReturn("").when(configurationMock3).getName();
            doNothing().when(dependencyHandlerMock).registerTransform(eq(UnzipTransform.class), (Action) any());
            doReturn(fileCollectionMock).when(configurationContainerMock4).create(eq("featuresMetadataDeps"), (Action) any());
            doReturn("return_of_getAsPath1").when(fileCollectionMock).getAsPath();
            Map<String, String> stringStringMap = new HashMap<>(Map.ofEntries(entry("path", ":server")));
            doReturn(dependencyMock).when(dependencyHandlerMock2).project(eq(stringStringMap));
            doReturn(configurationContainerMock, configurationContainerMock2, configurationContainerMock3, configurationContainerMock4, configurationContainerMock5).when(projectMock).getConfigurations();
            doReturn(fileCollectionMock2).when(configurationContainerMock5).create(eq("defaultDistrofeaturesMetadataDeps"), (Action) any());
            Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("path", ":distribution"), entry("configuration", "featuresMetadata")));
            doReturn(dependencyMock2).when(dependencyHandlerMock3).project(eq(stringStringMap2));
            doReturn(pluginManagerMock, pluginManagerMock2, pluginManagerMock3).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock3).withPlugin(eq("elasticsearch.esplugin"), (Action) any());
            doReturn(dependencyMock3).when(dependencyHandlerMock4).add("clusterPlugins", dependencyMock4);
            doReturn("", "return_of_getPath1").when(projectMock).getPath();
            doReturn(projectMock2).when(projectMock).findProject("return_of_getPath1");
            doReturn(taskContainerMock).when(projectMock2).getTasks();
            doReturn(taskProviderMock).when(taskContainerMock).named("bundlePlugin");
            doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3, dependencyHandlerMock4, dependencyHandlerMock5).when(projectMock).getDependencies();
            doReturn(dependencyMock4).when(dependencyHandlerMock5).create(configurableFileCollectionMock);
            Object[] objectArray = new Object[] { taskProviderMock };
            doReturn(configurableFileCollectionMock).when(projectMock).files(objectArray);
            doReturn(taskContainerMock2).when(projectMock).getTasks();
            doReturn(taskCollectionMock).when(taskContainerMock2).withType(StandaloneRestIntegTestTask.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            doReturn(configurableFileCollectionMock2).when(objectFactoryMock).fileCollection();
            Object[] objectArray2 = new Object[] { configurationMock };
            doReturn(configurableFileCollectionMock3).when(configurableFileCollectionMock2).from(objectArray2);
            doReturn("return_of_getAsPath1").when(configurableFileCollectionMock3).getAsPath();
            doReturn(fileCollectionMock3).when(fileTreeMock).filter((Spec) any());
            doReturn(fileTreeMock, fileTreeMock2).when(configurableFileCollectionMock3).getAsFileTree();
            doReturn(fileCollectionMock4).when(fileTreeMock2).filter((Spec) any());
            doReturn(configurableFileCollectionMock4).when(objectFactoryMock2).fileCollection();
            Object[] objectArray3 = new Object[] { configurationMock2 };
            doReturn(configurableFileCollectionMock5).when(configurableFileCollectionMock4).from(objectArray3);
            doReturn("return_of_getAsPath1").when(configurableFileCollectionMock5).getAsPath();
            doReturn(objectFactoryMock, objectFactoryMock2, objectFactoryMock3).when(projectMock).getObjects();
            doReturn(configurableFileCollectionMock6).when(objectFactoryMock3).fileCollection();
            Object[] objectArray4 = new Object[] { configurationMock3 };
            doReturn(configurableFileCollectionMock7).when(configurableFileCollectionMock6).from(objectArray4);
            doReturn(fileCollectionMock5).when(fileTreeMock3).filter((Spec) any());
            doReturn(fileTreeMock3, fileTreeMock4).when(configurableFileCollectionMock7).getAsFileTree();
            doReturn(fileCollectionMock6).when(fileTreeMock4).filter((Spec) any());
            doReturn(providerMock, providerMock2, providerMock3, providerMock4, providerMock5, providerMock6).when(providerFactoryMock).provider((Callable) any());
            buildParams.when(() -> BuildParams.getBwcVersions()).thenReturn(bwcVersionsMock);
            doReturn(versionMock).when(bwcVersionsMock).getMinimumWireCompatibleVersion();
            doReturn(elasticsearchDistributionMock).when(namedDomainObjectContainerMock).findByName("default_distro");
            distributionDownloadPlugin.when(() -> DistributionDownloadPlugin.getContainer(projectMock)).thenReturn(namedDomainObjectContainerMock).thenReturn(namedDomainObjectContainerMock2);
            doReturn(elasticsearchDistributionMock2).when(namedDomainObjectContainerMock2).findByName("integ_test_distro");
            doReturn(configurableFileCollectionMock8).when(elasticsearchDistributionMock2).getExtracted();
            doReturn(fileTreeMock6).when(fileTreeMock5).matching((Action) any());
            doReturn(fileTreeMock5, fileTreeMock7).when(configurableFileCollectionMock8).getAsFileTree();
            doReturn(fileTreeMock8).when(fileTreeMock7).matching((Action) any());
            File file = new File("pathname1");
            doReturn(file).when(configurableFileCollectionMock8).getSingleFile();
            doReturn("").when(elasticsearchDistributionMock2).getName();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            RestTestBasePlugin target = new RestTestBasePlugin(providerFactoryMock);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(3)).getPluginManager();
                verify(pluginManagerMock).apply(ElasticsearchJavaPlugin.class);
                verify(pluginManagerMock2).apply(InternalDistributionDownloadPlugin.class);
                verify(projectMock, times(5)).getConfigurations();
                verify(configurationContainerMock).create(eq("clusterModules"), (Action) any());
                verify(configurationMock, atLeast(1)).getDependencies();
                verify(dependencySetMock).stream();
                verify(configurationMock, atLeast(1)).getName();
                verify(configurationContainerMock2).create(eq("clusterPlugins"), (Action) any());
                verify(configurationMock2, atLeast(1)).getDependencies();
                verify(dependencySetMock2).stream();
                verify(configurationContainerMock3).create(eq("extractedPlugins"), (Action) any());
                verify(configurationMock3, atLeast(1)).extendsFrom(configurationArray);
                verify(configurationMock3, atLeast(1)).getName();
                verify(projectMock, times(5)).getDependencies();
                verify(dependencyHandlerMock).registerTransform(eq(UnzipTransform.class), (Action) any());
                verify(configurationContainerMock4).create(eq("featuresMetadataDeps"), (Action) any());
                verify(fileCollectionMock, atLeast(1)).getAsPath();
                verify(dependencyHandlerMock2).project(eq(stringStringMap));
                verify(configurationContainerMock5).create(eq("defaultDistrofeaturesMetadataDeps"), (Action) any());
                verify(dependencyHandlerMock3).project(eq(stringStringMap2));
                verify(pluginManagerMock3).withPlugin(eq("elasticsearch.esplugin"), (Action) any());
                verify(projectMock, times(2)).getPath();
                verify(dependencyHandlerMock4).add("clusterPlugins", dependencyMock4);
                verify(projectMock).findProject("return_of_getPath1");
                verify(projectMock2).getTasks();
                verify(taskContainerMock).named("bundlePlugin");
                verify(dependencyHandlerMock5).create(configurableFileCollectionMock);
                verify(projectMock).files(objectArray);
                verify(projectMock).getTasks();
                verify(taskContainerMock2).withType(StandaloneRestIntegTestTask.class);
                verify(taskCollectionMock).configureEach((Action) any());
                verify(projectMock, times(3)).getObjects();
                verify(objectFactoryMock).fileCollection();
                verify(configurableFileCollectionMock2).from(objectArray2);
                verify(configurableFileCollectionMock3).getAsPath();
                verify(configurableFileCollectionMock3, times(2)).getAsFileTree();
                verify(fileTreeMock).filter((Spec) any());
                verify(fileTreeMock2).filter((Spec) any());
                verify(objectFactoryMock2).fileCollection();
                verify(configurableFileCollectionMock4).from(objectArray3);
                verify(configurableFileCollectionMock5).getAsPath();
                verify(objectFactoryMock3).fileCollection();
                verify(configurableFileCollectionMock6).from(objectArray4);
                verify(configurableFileCollectionMock7, times(2)).getAsFileTree();
                verify(fileTreeMock3).filter((Spec) any());
                verify(fileTreeMock4).filter((Spec) any());
                verify(providerFactoryMock, atLeast(6)).provider((Callable) any());
                buildParams.verify(() -> BuildParams.getBwcVersions(), atLeast(1));
                verify(bwcVersionsMock).getMinimumWireCompatibleVersion();
                distributionDownloadPlugin.verify(() -> DistributionDownloadPlugin.getContainer(projectMock), atLeast(2));
                verify(namedDomainObjectContainerMock).findByName("default_distro");
                verify(namedDomainObjectContainerMock2).findByName("integ_test_distro");
                verify(elasticsearchDistributionMock2, times(3)).getExtracted();
                verify(configurableFileCollectionMock8, times(2)).getAsFileTree();
                verify(fileTreeMock5).matching((Action) any());
                verify(fileTreeMock7).matching((Action) any());
                verify(configurableFileCollectionMock8).getSingleFile();
                verify(elasticsearchDistributionMock2, times(2)).getName();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(2));
            });
        }
    }

    //Sapient generated method id: ${applyWhenGradleUtilsNotIsModuleProjectProjectGetPathAndFGetNameEndsWith_jarNotEqualsFalseAndDefaultBranch3}, hash: A298985C56DE04DF225F84421362BF2E
    @Test()
    void applyWhenGradleUtilsNotIsModuleProjectProjectGetPathAndFGetNameEndsWith_jarNotEqualsFalseAndDefaultBranch3() throws InvalidUserDataException, UnknownDomainObjectException, IllegalStateException, UnknownTaskException {
        /* Branches:
         * (maybeDistro == null) : true  #  inside createDistribution method
         * (type != null) : false  #  inside lambda$createDistribution$14 method
         * (useExploded) : true  #  inside lambda$createPluginConfiguration$31 method
         * (isExtended == false) : true  #  inside lambda$createPluginConfiguration$31 method
         * (iterator.hasNext()) : true  #  inside lambda$createPluginConfiguration$30 method
         * (dependency instanceof ProjectDependency projectDependency) : true  #  inside lambda$createPluginConfiguration$30 method
         * (projectDependency.getTargetConfiguration() == null) : true  #  inside lambda$createPluginConfiguration$30 method
         * (useExploded) : true  #  inside lambda$createPluginConfiguration$30 method
         * (for-each(extendedPlugins)) : true  #  inside lambda$createPluginConfiguration$30 method
         * (branch expression (line 308)) : false
         * (GradleUtils.isModuleProject(project.getPath())) : false  #  inside lambda$apply$7 method
         * (f.getName().endsWith(".jar") == false) : false  #  inside lambda$registerConfigurationInputs$15 method
         * (branch expression (line 287)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<DistributionDownloadPlugin> distributionDownloadPlugin = mockStatic(DistributionDownloadPlugin.class);
            MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            doNothing().when(pluginManagerMock).apply(ElasticsearchJavaPlugin.class);
            doNothing().when(pluginManagerMock2).apply(InternalDistributionDownloadPlugin.class);
            doReturn(configurationMock).when(configurationContainerMock).create(eq("clusterModules"), (Action) any());
            doReturn(dependencySetMock).when(configurationMock).getDependencies();
            Stream stream = Stream.empty();
            doReturn(stream).when(dependencySetMock).stream();
            doReturn("BN").when(configurationMock).getName();
            Map<String, String> stringStringMap = new HashMap<>(Map.ofEntries(entry("path", "return_of_getPath1"), entry("configuration", "explodedBundleZip")));
            doReturn(dependencyMock).when(dependencyHandlerMock).project(eq(stringStringMap));
            doReturn(projectMock2).when(projectMock).getRootProject();
            Set<Project> projectSet = new HashSet<>();
            projectSet.add(projectMock3);
            doReturn(projectSet).when(projectMock2).getAllprojects();
            doReturn("EM").when(projectMock3).getPath();
            doReturn(configurationMock2).when(configurationContainerMock2).create(eq("clusterPlugins"), (Action) any());
            doReturn(dependencySetMock2).when(configurationMock2).getDependencies();
            Stream stream2 = Stream.empty();
            doReturn(stream2).when(dependencySetMock2).stream();
            doReturn(configurationMock3).when(configurationContainerMock3).create(eq("extractedPlugins"), (Action) any());
            Configuration[] configurationArray = new Configuration[] { configurationMock2 };
            doReturn(configurationMock4).when(configurationMock3).extendsFrom(configurationArray);
            doReturn("CO").when(configurationMock3).getName();
            doNothing().when(dependencyHandlerMock2).registerTransform(eq(UnzipTransform.class), (Action) any());
            doReturn(fileCollectionMock).when(configurationContainerMock4).create(eq("featuresMetadataDeps"), (Action) any());
            doReturn("return_of_getAsPath1").when(fileCollectionMock).getAsPath();
            Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("path", ":server")));
            doReturn(dependencyMock2).when(dependencyHandlerMock3).project(eq(stringStringMap2));
            doReturn(configurationContainerMock, configurationContainerMock2, configurationContainerMock3, configurationContainerMock4, configurationContainerMock5).when(projectMock).getConfigurations();
            doReturn(fileCollectionMock2).when(configurationContainerMock5).create(eq("defaultDistrofeaturesMetadataDeps"), (Action) any());
            Map<String, String> stringStringMap3 = new HashMap<>(Map.ofEntries(entry("path", ":distribution"), entry("configuration", "featuresMetadata")));
            doReturn(dependencyMock3).when(dependencyHandlerMock4).project(eq(stringStringMap3));
            doReturn(pluginManagerMock, pluginManagerMock2, pluginManagerMock3).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock3).withPlugin(eq("elasticsearch.esplugin"), (Action) any());
            doReturn(dependencyMock4).when(dependencyHandlerMock5).add("clusterPlugins", dependencyMock5);
            doReturn("AL", "return_of_getPath1").when(projectMock).getPath();
            doReturn(projectMock4).when(projectMock).findProject("return_of_getPath1");
            doReturn(taskContainerMock).when(projectMock4).getTasks();
            doReturn(taskProviderMock).when(taskContainerMock).named("bundlePlugin");
            doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3, dependencyHandlerMock4, dependencyHandlerMock5, dependencyHandlerMock6).when(projectMock).getDependencies();
            doReturn(dependencyMock5).when(dependencyHandlerMock6).create(configurableFileCollectionMock);
            Object[] objectArray = new Object[] { taskProviderMock };
            doReturn(configurableFileCollectionMock).when(projectMock).files(objectArray);
            doReturn(taskContainerMock2).when(projectMock).getTasks();
            doReturn(taskCollectionMock).when(taskContainerMock2).withType(StandaloneRestIntegTestTask.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            doReturn(configurableFileCollectionMock2).when(objectFactoryMock).fileCollection();
            Object[] objectArray2 = new Object[] { configurationMock };
            doReturn(configurableFileCollectionMock3).when(configurableFileCollectionMock2).from(objectArray2);
            doReturn("return_of_getAsPath1").when(configurableFileCollectionMock3).getAsPath();
            doReturn(fileCollectionMock3).when(fileTreeMock).filter((Spec) any());
            doReturn(fileTreeMock, fileTreeMock2).when(configurableFileCollectionMock3).getAsFileTree();
            doReturn(fileCollectionMock4).when(fileTreeMock2).filter((Spec) any());
            doReturn(configurableFileCollectionMock4).when(objectFactoryMock2).fileCollection();
            Object[] objectArray3 = new Object[] { configurationMock2 };
            doReturn(configurableFileCollectionMock5).when(configurableFileCollectionMock4).from(objectArray3);
            doReturn("return_of_getAsPath1").when(configurableFileCollectionMock5).getAsPath();
            doReturn(objectFactoryMock, objectFactoryMock2, objectFactoryMock3).when(projectMock).getObjects();
            doReturn(configurableFileCollectionMock6).when(objectFactoryMock3).fileCollection();
            Object[] objectArray4 = new Object[] { configurationMock3 };
            doReturn(configurableFileCollectionMock7).when(configurableFileCollectionMock6).from(objectArray4);
            doReturn(fileCollectionMock5).when(fileTreeMock3).filter((Spec) any());
            doReturn(fileTreeMock3, fileTreeMock4).when(configurableFileCollectionMock7).getAsFileTree();
            doReturn(fileCollectionMock6).when(fileTreeMock4).filter((Spec) any());
            doReturn(providerMock, providerMock2, providerMock3, providerMock4, providerMock5, providerMock6).when(providerFactoryMock).provider((Callable) any());
            buildParams.when(() -> BuildParams.getBwcVersions()).thenReturn(bwcVersionsMock);
            doReturn(versionMock).when(bwcVersionsMock).getMinimumWireCompatibleVersion();
            doReturn(null).when(namedDomainObjectContainerMock).findByName("default_distro");
            doReturn(elasticsearchDistributionMock).when(namedDomainObjectContainerMock).create(eq("default_distro"), (Action) any());
            distributionDownloadPlugin.when(() -> DistributionDownloadPlugin.getContainer(projectMock)).thenReturn(namedDomainObjectContainerMock).thenReturn(namedDomainObjectContainerMock2);
            doReturn(null).when(namedDomainObjectContainerMock2).findByName("integ_test_distro");
            doReturn(elasticsearchDistributionMock2).when(namedDomainObjectContainerMock2).create(eq("integ_test_distro"), (Action) any());
            doReturn(configurableFileCollectionMock8).when(elasticsearchDistributionMock2).getExtracted();
            doReturn(fileTreeMock6).when(fileTreeMock5).matching((Action) any());
            doReturn(fileTreeMock5, fileTreeMock7).when(configurableFileCollectionMock8).getAsFileTree();
            doReturn(fileTreeMock8).when(fileTreeMock7).matching((Action) any());
            File file = new File("pathname1");
            doReturn(file).when(configurableFileCollectionMock8).getSingleFile();
            doReturn("").when(elasticsearchDistributionMock2).getName();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            RestTestBasePlugin target = new RestTestBasePlugin(providerFactoryMock);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(3)).getPluginManager();
                verify(pluginManagerMock).apply(ElasticsearchJavaPlugin.class);
                verify(pluginManagerMock2).apply(InternalDistributionDownloadPlugin.class);
                verify(projectMock, times(5)).getConfigurations();
                verify(configurationContainerMock).create(eq("clusterModules"), (Action) any());
                verify(configurationMock, atLeast(1)).getDependencies();
                verify(dependencySetMock).stream();
                verify(configurationMock, atLeast(1)).getName();
                verify(projectMock, times(6)).getDependencies();
                verify(dependencyHandlerMock).project(eq(stringStringMap));
                verify(projectMock).getRootProject();
                verify(projectMock2).getAllprojects();
                verify(projectMock3).getPath();
                verify(configurationContainerMock2).create(eq("clusterPlugins"), (Action) any());
                verify(configurationMock2, atLeast(1)).getDependencies();
                verify(dependencySetMock2).stream();
                verify(configurationContainerMock3).create(eq("extractedPlugins"), (Action) any());
                verify(configurationMock3, atLeast(1)).extendsFrom(configurationArray);
                verify(configurationMock3, atLeast(1)).getName();
                verify(dependencyHandlerMock2).registerTransform(eq(UnzipTransform.class), (Action) any());
                verify(configurationContainerMock4).create(eq("featuresMetadataDeps"), (Action) any());
                verify(fileCollectionMock, atLeast(1)).getAsPath();
                verify(dependencyHandlerMock3).project(eq(stringStringMap2));
                verify(configurationContainerMock5).create(eq("defaultDistrofeaturesMetadataDeps"), (Action) any());
                verify(dependencyHandlerMock4).project(eq(stringStringMap3));
                verify(pluginManagerMock3).withPlugin(eq("elasticsearch.esplugin"), (Action) any());
                verify(projectMock, times(2)).getPath();
                verify(dependencyHandlerMock5).add("clusterPlugins", dependencyMock5);
                verify(projectMock).findProject("return_of_getPath1");
                verify(projectMock4).getTasks();
                verify(taskContainerMock).named("bundlePlugin");
                verify(dependencyHandlerMock6).create(configurableFileCollectionMock);
                verify(projectMock).files(objectArray);
                verify(projectMock).getTasks();
                verify(taskContainerMock2).withType(StandaloneRestIntegTestTask.class);
                verify(taskCollectionMock).configureEach((Action) any());
                verify(projectMock, times(3)).getObjects();
                verify(objectFactoryMock).fileCollection();
                verify(configurableFileCollectionMock2).from(objectArray2);
                verify(configurableFileCollectionMock3).getAsPath();
                verify(configurableFileCollectionMock3, times(2)).getAsFileTree();
                verify(fileTreeMock).filter((Spec) any());
                verify(fileTreeMock2).filter((Spec) any());
                verify(objectFactoryMock2).fileCollection();
                verify(configurableFileCollectionMock4).from(objectArray3);
                verify(configurableFileCollectionMock5).getAsPath();
                verify(objectFactoryMock3).fileCollection();
                verify(configurableFileCollectionMock6).from(objectArray4);
                verify(configurableFileCollectionMock7, times(2)).getAsFileTree();
                verify(fileTreeMock3).filter((Spec) any());
                verify(fileTreeMock4).filter((Spec) any());
                verify(providerFactoryMock, atLeast(6)).provider((Callable) any());
                buildParams.verify(() -> BuildParams.getBwcVersions(), atLeast(1));
                verify(bwcVersionsMock).getMinimumWireCompatibleVersion();
                distributionDownloadPlugin.verify(() -> DistributionDownloadPlugin.getContainer(projectMock), atLeast(2));
                verify(namedDomainObjectContainerMock).findByName("default_distro");
                verify(namedDomainObjectContainerMock).create(eq("default_distro"), (Action) any());
                verify(namedDomainObjectContainerMock2).findByName("integ_test_distro");
                verify(namedDomainObjectContainerMock2).create(eq("integ_test_distro"), (Action) any());
                verify(elasticsearchDistributionMock2, atLeast(3)).getExtracted();
                verify(configurableFileCollectionMock8, times(2)).getAsFileTree();
                verify(fileTreeMock5).matching((Action) any());
                verify(fileTreeMock7).matching((Action) any());
                verify(configurableFileCollectionMock8).getSingleFile();
                verify(elasticsearchDistributionMock2, atLeast(2)).getName();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(2));
            });
        }
    }

    //Sapient generated method id: ${applyWhenGradleUtilsNotIsModuleProjectProjectGetPathAndFGetNameEndsWith_jarNotEqualsFalseAndDefaultBranch4}, hash: 071199BE2BD95F2254457933895EC5E0
    @Test()
    void applyWhenGradleUtilsNotIsModuleProjectProjectGetPathAndFGetNameEndsWith_jarNotEqualsFalseAndDefaultBranch4() throws InvalidUserDataException, UnknownDomainObjectException, IllegalStateException, UnknownTaskException {
        /* Branches:
         * (maybeDistro == null) : true  #  inside createDistribution method
         * (type != null) : false  #  inside lambda$createDistribution$14 method
         * (useExploded) : true  #  inside lambda$createPluginConfiguration$31 method
         * (isExtended == false) : true  #  inside lambda$createPluginConfiguration$31 method
         * (iterator.hasNext()) : true  #  inside lambda$createPluginConfiguration$30 method
         * (dependency instanceof ProjectDependency projectDependency) : true  #  inside lambda$createPluginConfiguration$30 method
         * (projectDependency.getTargetConfiguration() == null) : true  #  inside lambda$createPluginConfiguration$30 method
         * (useExploded) : true  #  inside lambda$createPluginConfiguration$30 method
         * (for-each(extendedPlugins)) : true  #  inside lambda$createPluginConfiguration$30 method
         * (branch expression (line 308)) : true
         * (branch expression (line 309)) : false
         * (GradleUtils.isModuleProject(project.getPath())) : false  #  inside lambda$apply$7 method
         * (f.getName().endsWith(".jar") == false) : false  #  inside lambda$registerConfigurationInputs$15 method
         * (branch expression (line 287)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class);
            MockedStatic<DistributionDownloadPlugin> distributionDownloadPlugin = mockStatic(DistributionDownloadPlugin.class);
            MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            doNothing().when(pluginManagerMock).apply(ElasticsearchJavaPlugin.class);
            doNothing().when(pluginManagerMock2).apply(InternalDistributionDownloadPlugin.class);
            doReturn(configurationMock).when(configurationContainerMock).create(eq("clusterModules"), (Action) any());
            doReturn(dependencySetMock).when(configurationMock).getDependencies();
            Stream stream = Stream.empty();
            doReturn(stream).when(dependencySetMock).stream();
            doReturn("CO").when(configurationMock).getName();
            Map<String, String> stringStringMap = new HashMap<>(Map.ofEntries(entry("path", "return_of_getPath1"), entry("configuration", "explodedBundleZip")));
            doReturn(dependencyMock).when(dependencyHandlerMock).project(eq(stringStringMap));
            doReturn(projectMock2).when(projectMock).getRootProject();
            Set<Project> projectSet = new HashSet<>();
            projectSet.add(projectMock3);
            doReturn(projectSet).when(projectMock2).getAllprojects();
            doReturn("EM").when(projectMock3).getPath();
            doReturn(pluginContainerMock).when(projectMock3).getPlugins();
            doReturn(false).when(pluginContainerMock).hasPlugin(PluginBuildPlugin.class);
            doReturn(configurationMock2).when(configurationContainerMock2).create(eq("clusterPlugins"), (Action) any());
            doReturn(dependencySetMock2).when(configurationMock2).getDependencies();
            Stream stream2 = Stream.empty();
            doReturn(stream2).when(dependencySetMock2).stream();
            doReturn(configurationMock3).when(configurationContainerMock3).create(eq("extractedPlugins"), (Action) any());
            Configuration[] configurationArray = new Configuration[] { configurationMock2 };
            doReturn(configurationMock4).when(configurationMock3).extendsFrom(configurationArray);
            doReturn("DP").when(configurationMock3).getName();
            doNothing().when(dependencyHandlerMock2).registerTransform(eq(UnzipTransform.class), (Action) any());
            doReturn(fileCollectionMock).when(configurationContainerMock4).create(eq("featuresMetadataDeps"), (Action) any());
            doReturn("return_of_getAsPath1").when(fileCollectionMock).getAsPath();
            Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("path", ":server")));
            doReturn(dependencyMock2).when(dependencyHandlerMock3).project(eq(stringStringMap2));
            doReturn(configurationContainerMock, configurationContainerMock2, configurationContainerMock3, configurationContainerMock4, configurationContainerMock5).when(projectMock).getConfigurations();
            doReturn(fileCollectionMock2).when(configurationContainerMock5).create(eq("defaultDistrofeaturesMetadataDeps"), (Action) any());
            Map<String, String> stringStringMap3 = new HashMap<>(Map.ofEntries(entry("path", ":distribution"), entry("configuration", "featuresMetadata")));
            doReturn(dependencyMock3).when(dependencyHandlerMock4).project(eq(stringStringMap3));
            doReturn(pluginManagerMock, pluginManagerMock2, pluginManagerMock3).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock3).withPlugin(eq("elasticsearch.esplugin"), (Action) any());
            doReturn(dependencyMock4).when(dependencyHandlerMock5).add("clusterPlugins", dependencyMock5);
            doReturn("BNS", "return_of_getPath1").when(projectMock).getPath();
            doReturn(projectMock4).when(projectMock).findProject("return_of_getPath1");
            doReturn(taskContainerMock).when(projectMock4).getTasks();
            doReturn(taskProviderMock).when(taskContainerMock).named("bundlePlugin");
            doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3, dependencyHandlerMock4, dependencyHandlerMock5, dependencyHandlerMock6).when(projectMock).getDependencies();
            doReturn(dependencyMock5).when(dependencyHandlerMock6).create(configurableFileCollectionMock);
            Object[] objectArray = new Object[] { taskProviderMock };
            doReturn(configurableFileCollectionMock).when(projectMock).files(objectArray);
            doReturn(taskContainerMock2).when(projectMock).getTasks();
            doReturn(taskCollectionMock).when(taskContainerMock2).withType(StandaloneRestIntegTestTask.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            doReturn(configurableFileCollectionMock2).when(objectFactoryMock).fileCollection();
            Object[] objectArray2 = new Object[] { configurationMock };
            doReturn(configurableFileCollectionMock3).when(configurableFileCollectionMock2).from(objectArray2);
            doReturn("return_of_getAsPath1").when(configurableFileCollectionMock3).getAsPath();
            doReturn(fileCollectionMock3).when(fileTreeMock).filter((Spec) any());
            doReturn(fileTreeMock, fileTreeMock2).when(configurableFileCollectionMock3).getAsFileTree();
            doReturn(fileCollectionMock4).when(fileTreeMock2).filter((Spec) any());
            doReturn(configurableFileCollectionMock4).when(objectFactoryMock2).fileCollection();
            Object[] objectArray3 = new Object[] { configurationMock2 };
            doReturn(configurableFileCollectionMock5).when(configurableFileCollectionMock4).from(objectArray3);
            doReturn("return_of_getAsPath1").when(configurableFileCollectionMock5).getAsPath();
            doReturn(objectFactoryMock, objectFactoryMock2, objectFactoryMock3).when(projectMock).getObjects();
            doReturn(configurableFileCollectionMock6).when(objectFactoryMock3).fileCollection();
            Object[] objectArray4 = new Object[] { configurationMock3 };
            doReturn(configurableFileCollectionMock7).when(configurableFileCollectionMock6).from(objectArray4);
            doReturn(fileCollectionMock5).when(fileTreeMock3).filter((Spec) any());
            doReturn(fileTreeMock3, fileTreeMock4).when(configurableFileCollectionMock7).getAsFileTree();
            doReturn(fileCollectionMock6).when(fileTreeMock4).filter((Spec) any());
            doReturn(providerMock, providerMock2, providerMock3, providerMock4, providerMock5, providerMock6).when(providerFactoryMock).provider((Callable) any());
            buildParams.when(() -> BuildParams.getBwcVersions()).thenReturn(bwcVersionsMock);
            doReturn(versionMock).when(bwcVersionsMock).getMinimumWireCompatibleVersion();
            doReturn(null).when(namedDomainObjectContainerMock).findByName("default_distro");
            doReturn(elasticsearchDistributionMock).when(namedDomainObjectContainerMock).create(eq("default_distro"), (Action) any());
            distributionDownloadPlugin.when(() -> DistributionDownloadPlugin.getContainer(projectMock)).thenReturn(namedDomainObjectContainerMock).thenReturn(namedDomainObjectContainerMock2);
            doReturn(null).when(namedDomainObjectContainerMock2).findByName("integ_test_distro");
            doReturn(elasticsearchDistributionMock2).when(namedDomainObjectContainerMock2).create(eq("integ_test_distro"), (Action) any());
            doReturn(configurableFileCollectionMock8).when(elasticsearchDistributionMock2).getExtracted();
            doReturn(fileTreeMock6).when(fileTreeMock5).matching((Action) any());
            doReturn(fileTreeMock5, fileTreeMock7).when(configurableFileCollectionMock8).getAsFileTree();
            doReturn(fileTreeMock8).when(fileTreeMock7).matching((Action) any());
            File file = new File("pathname1");
            doReturn(file).when(configurableFileCollectionMock8).getSingleFile();
            doReturn("").when(elasticsearchDistributionMock2).getName();
            gradleUtils.when(() -> GradleUtils.isModuleProject("EM")).thenReturn(true);
            gradleUtils.when(() -> GradleUtils.isModuleProject("BNS")).thenReturn(false);
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            RestTestBasePlugin target = new RestTestBasePlugin(providerFactoryMock);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(3)).getPluginManager();
                verify(pluginManagerMock).apply(ElasticsearchJavaPlugin.class);
                verify(pluginManagerMock2).apply(InternalDistributionDownloadPlugin.class);
                verify(projectMock, times(5)).getConfigurations();
                verify(configurationContainerMock).create(eq("clusterModules"), (Action) any());
                verify(configurationMock, atLeast(1)).getDependencies();
                verify(dependencySetMock).stream();
                verify(configurationMock, atLeast(1)).getName();
                verify(projectMock, times(6)).getDependencies();
                verify(dependencyHandlerMock).project(eq(stringStringMap));
                verify(projectMock).getRootProject();
                verify(projectMock2).getAllprojects();
                verify(projectMock3).getPath();
                verify(projectMock3).getPlugins();
                verify(pluginContainerMock).hasPlugin(PluginBuildPlugin.class);
                verify(configurationContainerMock2).create(eq("clusterPlugins"), (Action) any());
                verify(configurationMock2, atLeast(1)).getDependencies();
                verify(dependencySetMock2).stream();
                verify(configurationContainerMock3).create(eq("extractedPlugins"), (Action) any());
                verify(configurationMock3, atLeast(1)).extendsFrom(configurationArray);
                verify(configurationMock3, atLeast(1)).getName();
                verify(dependencyHandlerMock2).registerTransform(eq(UnzipTransform.class), (Action) any());
                verify(configurationContainerMock4).create(eq("featuresMetadataDeps"), (Action) any());
                verify(fileCollectionMock, atLeast(1)).getAsPath();
                verify(dependencyHandlerMock3).project(eq(stringStringMap2));
                verify(configurationContainerMock5).create(eq("defaultDistrofeaturesMetadataDeps"), (Action) any());
                verify(dependencyHandlerMock4).project(eq(stringStringMap3));
                verify(pluginManagerMock3).withPlugin(eq("elasticsearch.esplugin"), (Action) any());
                verify(projectMock, times(2)).getPath();
                verify(dependencyHandlerMock5).add("clusterPlugins", dependencyMock5);
                verify(projectMock).findProject("return_of_getPath1");
                verify(projectMock4).getTasks();
                verify(taskContainerMock).named("bundlePlugin");
                verify(dependencyHandlerMock6).create(configurableFileCollectionMock);
                verify(projectMock).files(objectArray);
                verify(projectMock).getTasks();
                verify(taskContainerMock2).withType(StandaloneRestIntegTestTask.class);
                verify(taskCollectionMock).configureEach((Action) any());
                verify(projectMock, times(3)).getObjects();
                verify(objectFactoryMock).fileCollection();
                verify(configurableFileCollectionMock2).from(objectArray2);
                verify(configurableFileCollectionMock3).getAsPath();
                verify(configurableFileCollectionMock3, times(2)).getAsFileTree();
                verify(fileTreeMock).filter((Spec) any());
                verify(fileTreeMock2).filter((Spec) any());
                verify(objectFactoryMock2).fileCollection();
                verify(configurableFileCollectionMock4).from(objectArray3);
                verify(configurableFileCollectionMock5).getAsPath();
                verify(objectFactoryMock3).fileCollection();
                verify(configurableFileCollectionMock6).from(objectArray4);
                verify(configurableFileCollectionMock7, times(2)).getAsFileTree();
                verify(fileTreeMock3).filter((Spec) any());
                verify(fileTreeMock4).filter((Spec) any());
                verify(providerFactoryMock, atLeast(6)).provider((Callable) any());
                buildParams.verify(() -> BuildParams.getBwcVersions(), atLeast(1));
                verify(bwcVersionsMock).getMinimumWireCompatibleVersion();
                distributionDownloadPlugin.verify(() -> DistributionDownloadPlugin.getContainer(projectMock), atLeast(2));
                verify(namedDomainObjectContainerMock).findByName("default_distro");
                verify(namedDomainObjectContainerMock).create(eq("default_distro"), (Action) any());
                verify(namedDomainObjectContainerMock2).findByName("integ_test_distro");
                verify(namedDomainObjectContainerMock2).create(eq("integ_test_distro"), (Action) any());
                verify(elasticsearchDistributionMock2, atLeast(3)).getExtracted();
                verify(configurableFileCollectionMock8, times(2)).getAsFileTree();
                verify(fileTreeMock5).matching((Action) any());
                verify(fileTreeMock7).matching((Action) any());
                verify(configurableFileCollectionMock8).getSingleFile();
                verify(elasticsearchDistributionMock2, atLeast(2)).getName();
                gradleUtils.verify(() -> GradleUtils.isModuleProject("EM"), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.isModuleProject("BNS"), atLeast(1));
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(2));
            });
        }
    }

    //Sapient generated method id: ${applyWhenGradleUtilsNotIsModuleProjectProjectGetPathAndFGetNameEndsWith_jarNotEqualsFalseAndDefaultBranch5}, hash: D0BF3BB493345938732D353AE75FDC2B
    @Test()
    void applyWhenGradleUtilsNotIsModuleProjectProjectGetPathAndFGetNameEndsWith_jarNotEqualsFalseAndDefaultBranch5() throws InvalidUserDataException, UnknownDomainObjectException, IllegalStateException, UnknownTaskException {
        /* Branches:
         * (maybeDistro == null) : true  #  inside createDistribution method
         * (type != null) : false  #  inside lambda$createDistribution$14 method
         * (useExploded) : true  #  inside lambda$createPluginConfiguration$31 method
         * (isExtended == false) : true  #  inside lambda$createPluginConfiguration$31 method
         * (iterator.hasNext()) : true  #  inside lambda$createPluginConfiguration$30 method
         * (dependency instanceof ProjectDependency projectDependency) : true  #  inside lambda$createPluginConfiguration$30 method
         * (projectDependency.getTargetConfiguration() == null) : true  #  inside lambda$createPluginConfiguration$30 method
         * (useExploded) : true  #  inside lambda$createPluginConfiguration$30 method
         * (for-each(extendedPlugins)) : true  #  inside lambda$createPluginConfiguration$30 method
         * (branch expression (line 308)) : true
         * (branch expression (line 309)) : true
         * (branch expression (line 310)) : false
         * (GradleUtils.isModuleProject(project.getPath())) : false  #  inside lambda$apply$7 method
         * (f.getName().endsWith(".jar") == false) : false  #  inside lambda$registerConfigurationInputs$15 method
         * (branch expression (line 287)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class);
            MockedStatic<DistributionDownloadPlugin> distributionDownloadPlugin = mockStatic(DistributionDownloadPlugin.class);
            MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            doNothing().when(pluginManagerMock).apply(ElasticsearchJavaPlugin.class);
            doNothing().when(pluginManagerMock2).apply(InternalDistributionDownloadPlugin.class);
            doReturn(configurationMock).when(configurationContainerMock).create(eq("clusterModules"), (Action) any());
            doReturn(dependencySetMock).when(configurationMock).getDependencies();
            Stream stream = Stream.empty();
            doReturn(stream).when(dependencySetMock).stream();
            doReturn("").when(configurationMock).getName();
            Map<String, String> stringStringMap = new HashMap<>(Map.ofEntries(entry("path", "return_of_getPath1"), entry("configuration", "explodedBundleZip")));
            doReturn(dependencyMock).when(dependencyHandlerMock).project(eq(stringStringMap));
            doReturn(projectMock2).when(projectMock).getRootProject();
            Set<Project> projectSet = new HashSet<>();
            projectSet.add(projectMock3);
            doReturn(projectSet).when(projectMock2).getAllprojects();
            doReturn("EO").when(projectMock3).getPath();
            doReturn(pluginContainerMock).when(projectMock3).getPlugins();
            doReturn(true).when(pluginContainerMock).hasPlugin(PluginBuildPlugin.class);
            doReturn(extensionContainerMock).when(projectMock3).getExtensions();
            PluginPropertiesExtension pluginPropertiesExtension = new PluginPropertiesExtension(projectMock4);
            pluginPropertiesExtension.setName("");
            doReturn(pluginPropertiesExtension).when(extensionContainerMock).getByType(PluginPropertiesExtension.class);
            doReturn(configurationMock2).when(configurationContainerMock2).create(eq("clusterPlugins"), (Action) any());
            doReturn(dependencySetMock2).when(configurationMock2).getDependencies();
            Stream stream2 = Stream.empty();
            doReturn(stream2).when(dependencySetMock2).stream();
            doReturn(configurationMock3).when(configurationContainerMock3).create(eq("extractedPlugins"), (Action) any());
            Configuration[] configurationArray = new Configuration[] { configurationMock2 };
            doReturn(configurationMock4).when(configurationMock3).extendsFrom(configurationArray);
            doReturn("CGT[").when(configurationMock3).getName();
            doNothing().when(dependencyHandlerMock2).registerTransform(eq(UnzipTransform.class), (Action) any());
            doReturn(fileCollectionMock).when(configurationContainerMock4).create(eq("featuresMetadataDeps"), (Action) any());
            doReturn("return_of_getAsPath1").when(fileCollectionMock).getAsPath();
            Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("path", ":server")));
            doReturn(dependencyMock2).when(dependencyHandlerMock3).project(eq(stringStringMap2));
            doReturn(configurationContainerMock, configurationContainerMock2, configurationContainerMock3, configurationContainerMock4, configurationContainerMock5).when(projectMock).getConfigurations();
            doReturn(fileCollectionMock2).when(configurationContainerMock5).create(eq("defaultDistrofeaturesMetadataDeps"), (Action) any());
            Map<String, String> stringStringMap3 = new HashMap<>(Map.ofEntries(entry("path", ":distribution"), entry("configuration", "featuresMetadata")));
            doReturn(dependencyMock3).when(dependencyHandlerMock4).project(eq(stringStringMap3));
            doReturn(pluginManagerMock, pluginManagerMock2, pluginManagerMock3).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock3).withPlugin(eq("elasticsearch.esplugin"), (Action) any());
            doReturn(dependencyMock4).when(dependencyHandlerMock5).add("clusterPlugins", dependencyMock5);
            doReturn("AIWY", "return_of_getPath1").when(projectMock).getPath();
            doReturn(projectMock5).when(projectMock).findProject("return_of_getPath1");
            doReturn(taskContainerMock).when(projectMock5).getTasks();
            doReturn(taskProviderMock).when(taskContainerMock).named("bundlePlugin");
            doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3, dependencyHandlerMock4, dependencyHandlerMock5, dependencyHandlerMock6).when(projectMock).getDependencies();
            doReturn(dependencyMock5).when(dependencyHandlerMock6).create(configurableFileCollectionMock);
            Object[] objectArray = new Object[] { taskProviderMock };
            doReturn(configurableFileCollectionMock).when(projectMock).files(objectArray);
            doReturn(taskContainerMock2).when(projectMock).getTasks();
            doReturn(taskCollectionMock).when(taskContainerMock2).withType(StandaloneRestIntegTestTask.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            doReturn(configurableFileCollectionMock2).when(objectFactoryMock).fileCollection();
            Object[] objectArray2 = new Object[] { configurationMock };
            doReturn(configurableFileCollectionMock3).when(configurableFileCollectionMock2).from(objectArray2);
            doReturn("return_of_getAsPath1").when(configurableFileCollectionMock3).getAsPath();
            doReturn(fileCollectionMock3).when(fileTreeMock).filter((Spec) any());
            doReturn(fileTreeMock, fileTreeMock2).when(configurableFileCollectionMock3).getAsFileTree();
            doReturn(fileCollectionMock4).when(fileTreeMock2).filter((Spec) any());
            doReturn(configurableFileCollectionMock4).when(objectFactoryMock2).fileCollection();
            Object[] objectArray3 = new Object[] { configurationMock2 };
            doReturn(configurableFileCollectionMock5).when(configurableFileCollectionMock4).from(objectArray3);
            doReturn("return_of_getAsPath1").when(configurableFileCollectionMock5).getAsPath();
            doReturn(objectFactoryMock, objectFactoryMock2, objectFactoryMock3).when(projectMock).getObjects();
            doReturn(configurableFileCollectionMock6).when(objectFactoryMock3).fileCollection();
            Object[] objectArray4 = new Object[] { configurationMock3 };
            doReturn(configurableFileCollectionMock7).when(configurableFileCollectionMock6).from(objectArray4);
            doReturn(fileCollectionMock5).when(fileTreeMock3).filter((Spec) any());
            doReturn(fileTreeMock3, fileTreeMock4).when(configurableFileCollectionMock7).getAsFileTree();
            doReturn(fileCollectionMock6).when(fileTreeMock4).filter((Spec) any());
            doReturn(providerMock, providerMock2, providerMock3, providerMock4, providerMock5, providerMock6).when(providerFactoryMock).provider((Callable) any());
            buildParams.when(() -> BuildParams.getBwcVersions()).thenReturn(bwcVersionsMock);
            doReturn(versionMock).when(bwcVersionsMock).getMinimumWireCompatibleVersion();
            doReturn(null).when(namedDomainObjectContainerMock).findByName("default_distro");
            doReturn(elasticsearchDistributionMock).when(namedDomainObjectContainerMock).create(eq("default_distro"), (Action) any());
            distributionDownloadPlugin.when(() -> DistributionDownloadPlugin.getContainer(projectMock)).thenReturn(namedDomainObjectContainerMock).thenReturn(namedDomainObjectContainerMock2);
            doReturn(null).when(namedDomainObjectContainerMock2).findByName("integ_test_distro");
            doReturn(elasticsearchDistributionMock2).when(namedDomainObjectContainerMock2).create(eq("integ_test_distro"), (Action) any());
            doReturn(configurableFileCollectionMock8).when(elasticsearchDistributionMock2).getExtracted();
            doReturn(fileTreeMock6).when(fileTreeMock5).matching((Action) any());
            doReturn(fileTreeMock5, fileTreeMock7).when(configurableFileCollectionMock8).getAsFileTree();
            doReturn(fileTreeMock8).when(fileTreeMock7).matching((Action) any());
            File file = new File("pathname1");
            doReturn(file).when(configurableFileCollectionMock8).getSingleFile();
            doReturn("BJXZ").when(elasticsearchDistributionMock2).getName();
            gradleUtils.when(() -> GradleUtils.isModuleProject("EO")).thenReturn(true);
            gradleUtils.when(() -> GradleUtils.isModuleProject("AIWY")).thenReturn(false);
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            RestTestBasePlugin target = new RestTestBasePlugin(providerFactoryMock);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(3)).getPluginManager();
                verify(pluginManagerMock).apply(ElasticsearchJavaPlugin.class);
                verify(pluginManagerMock2).apply(InternalDistributionDownloadPlugin.class);
                verify(projectMock, times(5)).getConfigurations();
                verify(configurationContainerMock).create(eq("clusterModules"), (Action) any());
                verify(configurationMock, atLeast(1)).getDependencies();
                verify(dependencySetMock).stream();
                verify(configurationMock, atLeast(1)).getName();
                verify(projectMock, times(6)).getDependencies();
                verify(dependencyHandlerMock).project(eq(stringStringMap));
                verify(projectMock).getRootProject();
                verify(projectMock2).getAllprojects();
                verify(projectMock3).getPath();
                verify(projectMock3).getPlugins();
                verify(pluginContainerMock).hasPlugin(PluginBuildPlugin.class);
                verify(projectMock3).getExtensions();
                verify(extensionContainerMock).getByType(PluginPropertiesExtension.class);
                verify(configurationContainerMock2).create(eq("clusterPlugins"), (Action) any());
                verify(configurationMock2, atLeast(1)).getDependencies();
                verify(dependencySetMock2).stream();
                verify(configurationContainerMock3).create(eq("extractedPlugins"), (Action) any());
                verify(configurationMock3, atLeast(1)).extendsFrom(configurationArray);
                verify(configurationMock3, atLeast(1)).getName();
                verify(dependencyHandlerMock2).registerTransform(eq(UnzipTransform.class), (Action) any());
                verify(configurationContainerMock4).create(eq("featuresMetadataDeps"), (Action) any());
                verify(fileCollectionMock, atLeast(1)).getAsPath();
                verify(dependencyHandlerMock3).project(eq(stringStringMap2));
                verify(configurationContainerMock5).create(eq("defaultDistrofeaturesMetadataDeps"), (Action) any());
                verify(dependencyHandlerMock4).project(eq(stringStringMap3));
                verify(pluginManagerMock3).withPlugin(eq("elasticsearch.esplugin"), (Action) any());
                verify(projectMock, times(2)).getPath();
                verify(dependencyHandlerMock5).add("clusterPlugins", dependencyMock5);
                verify(projectMock).findProject("return_of_getPath1");
                verify(projectMock5).getTasks();
                verify(taskContainerMock).named("bundlePlugin");
                verify(dependencyHandlerMock6).create(configurableFileCollectionMock);
                verify(projectMock).files(objectArray);
                verify(projectMock).getTasks();
                verify(taskContainerMock2).withType(StandaloneRestIntegTestTask.class);
                verify(taskCollectionMock).configureEach((Action) any());
                verify(projectMock, times(3)).getObjects();
                verify(objectFactoryMock).fileCollection();
                verify(configurableFileCollectionMock2).from(objectArray2);
                verify(configurableFileCollectionMock3).getAsPath();
                verify(configurableFileCollectionMock3, times(2)).getAsFileTree();
                verify(fileTreeMock).filter((Spec) any());
                verify(fileTreeMock2).filter((Spec) any());
                verify(objectFactoryMock2).fileCollection();
                verify(configurableFileCollectionMock4).from(objectArray3);
                verify(configurableFileCollectionMock5).getAsPath();
                verify(objectFactoryMock3).fileCollection();
                verify(configurableFileCollectionMock6).from(objectArray4);
                verify(configurableFileCollectionMock7, times(2)).getAsFileTree();
                verify(fileTreeMock3).filter((Spec) any());
                verify(fileTreeMock4).filter((Spec) any());
                verify(providerFactoryMock, atLeast(6)).provider((Callable) any());
                buildParams.verify(() -> BuildParams.getBwcVersions(), atLeast(1));
                verify(bwcVersionsMock).getMinimumWireCompatibleVersion();
                distributionDownloadPlugin.verify(() -> DistributionDownloadPlugin.getContainer(projectMock), atLeast(2));
                verify(namedDomainObjectContainerMock).findByName("default_distro");
                verify(namedDomainObjectContainerMock).create(eq("default_distro"), (Action) any());
                verify(namedDomainObjectContainerMock2).findByName("integ_test_distro");
                verify(namedDomainObjectContainerMock2).create(eq("integ_test_distro"), (Action) any());
                verify(elasticsearchDistributionMock2, atLeast(3)).getExtracted();
                verify(configurableFileCollectionMock8, times(2)).getAsFileTree();
                verify(fileTreeMock5).matching((Action) any());
                verify(fileTreeMock7).matching((Action) any());
                verify(configurableFileCollectionMock8).getSingleFile();
                verify(elasticsearchDistributionMock2, atLeast(2)).getName();
                gradleUtils.verify(() -> GradleUtils.isModuleProject("EO"), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.isModuleProject("AIWY"), atLeast(1));
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(2));
            });
        }
    }

    //Sapient generated method id: ${applyWhenFGetNameEndsWith_jarEqualsFalseAndDefaultBranch}, hash: A8AEF4BED9E0358C6A980D5DD8B21913
    @Test()
    void applyWhenFGetNameEndsWith_jarEqualsFalseAndDefaultBranch() throws InvalidUserDataException, UnknownDomainObjectException, IllegalStateException, UnknownTaskException {
        /* Branches:
         * (maybeDistro == null) : true  #  inside createDistribution method
         * (type != null) : false  #  inside lambda$createDistribution$14 method
         * (useExploded) : true  #  inside lambda$createPluginConfiguration$31 method
         * (isExtended == false) : true  #  inside lambda$createPluginConfiguration$31 method
         * (iterator.hasNext()) : true  #  inside lambda$createPluginConfiguration$30 method
         * (dependency instanceof ProjectDependency projectDependency) : true  #  inside lambda$createPluginConfiguration$30 method
         * (projectDependency.getTargetConfiguration() == null) : true  #  inside lambda$createPluginConfiguration$30 method
         * (useExploded) : true  #  inside lambda$createPluginConfiguration$30 method
         * (for-each(extendedPlugins)) : true  #  inside lambda$createPluginConfiguration$30 method
         * (branch expression (line 308)) : true
         * (branch expression (line 309)) : true
         * (branch expression (line 310)) : true
         * (useExploded) : true  #  inside lambda$createPluginConfiguration$29 method
         * (GradleUtils.isModuleProject(project.getPath())) : true  #  inside lambda$apply$7 method
         * (f.getName().endsWith(".jar") == false) : true  #  inside lambda$registerConfigurationInputs$15 method
         * (branch expression (line 287)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class);
            MockedStatic<DistributionDownloadPlugin> distributionDownloadPlugin = mockStatic(DistributionDownloadPlugin.class);
            MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            doNothing().when(pluginManagerMock).apply(ElasticsearchJavaPlugin.class);
            doNothing().when(pluginManagerMock2).apply(InternalDistributionDownloadPlugin.class);
            doReturn(configurationMock).when(configurationContainerMock).create(eq("clusterModules"), (Action) any());
            doReturn(dependencySetMock).when(configurationMock).getDependencies();
            Stream stream = Stream.empty();
            doReturn(stream).when(dependencySetMock).stream();
            doReturn("DR").when(configurationMock).getName();
            Map<String, String> stringStringMap = new HashMap<>(Map.ofEntries(entry("path", "return_of_getPath1"), entry("configuration", "explodedBundleZip")));
            doReturn(dependencyMock).when(dependencyHandlerMock).project(eq(stringStringMap));
            Set<Project> projectSet = new HashSet<>();
            projectSet.add(projectMock3);
            doReturn(projectSet).when(projectMock2).getAllprojects();
            doReturn(pluginContainerMock).when(projectMock3).getPlugins();
            doReturn(true).when(pluginContainerMock).hasPlugin(PluginBuildPlugin.class);
            doReturn(extensionContainerMock).when(projectMock3).getExtensions();
            PluginPropertiesExtension pluginPropertiesExtension = new PluginPropertiesExtension(projectMock4);
            pluginPropertiesExtension.setName("");
            doReturn(pluginPropertiesExtension).when(extensionContainerMock).getByType(PluginPropertiesExtension.class);
            doReturn("FT", "return_of_getPath1").when(projectMock3).getPath();
            Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("path", "return_of_getPath1"), entry("configuration", "explodedBundleZip")));
            doReturn(dependencyMock2).when(dependencyHandlerMock2).project(eq(stringStringMap2));
            doReturn(configurationMock2).when(configurationContainerMock2).create(eq("clusterPlugins"), (Action) any());
            doReturn(dependencySetMock2).when(configurationMock2).getDependencies();
            Stream stream2 = Stream.empty();
            doReturn(stream2).when(dependencySetMock2).stream();
            doReturn(taskContainerMock).when(projectMock5).getTasks();
            doReturn(taskProviderMock).when(taskContainerMock).named("bundlePlugin");
            doReturn(dependencyMock3).when(dependencyHandlerMock3).create(configurableFileCollectionMock);
            Object[] objectArray = new Object[] { taskProviderMock };
            doReturn(configurableFileCollectionMock).when(projectMock).files(objectArray);
            doReturn(projectMock2, projectMock6).when(projectMock).getRootProject();
            Set<Project> projectSet2 = new HashSet<>();
            projectSet2.add(projectMock7);
            doReturn(projectSet2).when(projectMock6).getAllprojects();
            doReturn(pluginContainerMock2).when(projectMock7).getPlugins();
            doReturn(true).when(pluginContainerMock2).hasPlugin(PluginBuildPlugin.class);
            doReturn(extensionContainerMock2).when(projectMock7).getExtensions();
            PluginPropertiesExtension pluginPropertiesExtension2 = new PluginPropertiesExtension(projectMock8);
            pluginPropertiesExtension2.setName("IC");
            doReturn(pluginPropertiesExtension2).when(extensionContainerMock2).getByType(PluginPropertiesExtension.class);
            doReturn("BQ", "return_of_getPath1").when(projectMock7).getPath();
            doReturn(projectMock5, projectMock9).when(projectMock).findProject("return_of_getPath1");
            doReturn(taskContainerMock2).when(projectMock9).getTasks();
            doReturn(taskProviderMock2).when(taskContainerMock2).named("bundlePlugin");
            doReturn(dependencyMock4).when(dependencyHandlerMock4).create(configurableFileCollectionMock2);
            Object[] objectArray2 = new Object[] { taskProviderMock2 };
            doReturn(configurableFileCollectionMock2).when(projectMock).files(objectArray2);
            doReturn(configurationMock3).when(configurationContainerMock3).create(eq("extractedPlugins"), (Action) any());
            Configuration[] configurationArray = new Configuration[] { configurationMock2 };
            doReturn(configurationMock4).when(configurationMock3).extendsFrom(configurationArray);
            doReturn("EJ").when(configurationMock3).getName();
            doNothing().when(dependencyHandlerMock5).registerTransform(eq(UnzipTransform.class), (Action) any());
            doReturn(fileCollectionMock).when(configurationContainerMock4).create(eq("featuresMetadataDeps"), (Action) any());
            doReturn("return_of_getAsPath1").when(fileCollectionMock).getAsPath();
            Map<String, String> stringStringMap3 = new HashMap<>(Map.ofEntries(entry("path", ":server")));
            doReturn(dependencyMock5).when(dependencyHandlerMock6).project(eq(stringStringMap3));
            doReturn(configurationContainerMock, configurationContainerMock2, configurationContainerMock3, configurationContainerMock4, configurationContainerMock5).when(projectMock).getConfigurations();
            doReturn(fileCollectionMock2).when(configurationContainerMock5).create(eq("defaultDistrofeaturesMetadataDeps"), (Action) any());
            Map<String, String> stringStringMap4 = new HashMap<>(Map.ofEntries(entry("path", ":distribution"), entry("configuration", "featuresMetadata")));
            doReturn(dependencyMock6).when(dependencyHandlerMock7).project(eq(stringStringMap4));
            doReturn(pluginManagerMock, pluginManagerMock2, pluginManagerMock3).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock3).withPlugin(eq("elasticsearch.esplugin"), (Action) any());
            doReturn(dependencyMock7).when(dependencyHandlerMock8).add("clusterModules", dependencyMock8);
            doReturn("", "return_of_getPath1").when(projectMock).getPath();
            doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3, dependencyHandlerMock4, dependencyHandlerMock5, dependencyHandlerMock6, dependencyHandlerMock7, dependencyHandlerMock8, dependencyHandlerMock9).when(projectMock).getDependencies();
            Map<String, String> stringStringMap5 = new HashMap<>(Map.ofEntries(entry("path", "return_of_getPath1"), entry("configuration", "explodedBundleZip")));
            doReturn(dependencyMock8).when(dependencyHandlerMock9).project(eq(stringStringMap5));
            doReturn(taskContainerMock3).when(projectMock).getTasks();
            doReturn(taskCollectionMock).when(taskContainerMock3).withType(StandaloneRestIntegTestTask.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            doReturn(configurableFileCollectionMock3).when(objectFactoryMock).fileCollection();
            Object[] objectArray3 = new Object[] { configurationMock };
            doReturn(configurableFileCollectionMock4).when(configurableFileCollectionMock3).from(objectArray3);
            doReturn("return_of_getAsPath1").when(configurableFileCollectionMock4).getAsPath();
            doReturn(fileCollectionMock3).when(fileTreeMock).filter((Spec) any());
            doReturn(fileTreeMock, fileTreeMock2).when(configurableFileCollectionMock4).getAsFileTree();
            doReturn(fileCollectionMock4).when(fileTreeMock2).filter((Spec) any());
            doReturn(configurableFileCollectionMock5).when(objectFactoryMock2).fileCollection();
            Object[] objectArray4 = new Object[] { configurationMock2 };
            doReturn(configurableFileCollectionMock6).when(configurableFileCollectionMock5).from(objectArray4);
            doReturn("return_of_getAsPath1").when(configurableFileCollectionMock6).getAsPath();
            doReturn(objectFactoryMock, objectFactoryMock2, objectFactoryMock3).when(projectMock).getObjects();
            doReturn(configurableFileCollectionMock7).when(objectFactoryMock3).fileCollection();
            Object[] objectArray5 = new Object[] { configurationMock3 };
            doReturn(configurableFileCollectionMock8).when(configurableFileCollectionMock7).from(objectArray5);
            doReturn(fileCollectionMock5).when(fileTreeMock3).filter((Spec) any());
            doReturn(fileTreeMock3, fileTreeMock4).when(configurableFileCollectionMock8).getAsFileTree();
            doReturn(fileCollectionMock6).when(fileTreeMock4).filter((Spec) any());
            doReturn(providerMock, providerMock2, providerMock3, providerMock4, providerMock5, providerMock6).when(providerFactoryMock).provider((Callable) any());
            buildParams.when(() -> BuildParams.getBwcVersions()).thenReturn(bwcVersionsMock);
            doReturn(versionMock).when(bwcVersionsMock).getMinimumWireCompatibleVersion();
            doReturn(null).when(namedDomainObjectContainerMock).findByName("default_distro");
            doReturn(elasticsearchDistributionMock).when(namedDomainObjectContainerMock).create(eq("default_distro"), (Action) any());
            distributionDownloadPlugin.when(() -> DistributionDownloadPlugin.getContainer(projectMock)).thenReturn(namedDomainObjectContainerMock).thenReturn(namedDomainObjectContainerMock2);
            doReturn(null).when(namedDomainObjectContainerMock2).findByName("integ_test_distro");
            doReturn(elasticsearchDistributionMock2).when(namedDomainObjectContainerMock2).create(eq("integ_test_distro"), (Action) any());
            doReturn(configurableFileCollectionMock9).when(elasticsearchDistributionMock2).getExtracted();
            doReturn(fileTreeMock6).when(fileTreeMock5).matching((Action) any());
            doReturn(fileTreeMock5, fileTreeMock7).when(configurableFileCollectionMock9).getAsFileTree();
            doReturn(fileTreeMock8).when(fileTreeMock7).matching((Action) any());
            File file = new File("pathname1");
            doReturn(file).when(configurableFileCollectionMock9).getSingleFile();
            doReturn("").when(elasticsearchDistributionMock2).getName();
            gradleUtils.when(() -> GradleUtils.isModuleProject("FT")).thenReturn(true);
            gradleUtils.when(() -> GradleUtils.isModuleProject("BQ")).thenReturn(true);
            gradleUtils.when(() -> GradleUtils.isModuleProject("")).thenReturn(true);
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            RestTestBasePlugin target = new RestTestBasePlugin(providerFactoryMock);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(3)).getPluginManager();
                verify(pluginManagerMock).apply(ElasticsearchJavaPlugin.class);
                verify(pluginManagerMock2).apply(InternalDistributionDownloadPlugin.class);
                verify(projectMock, times(5)).getConfigurations();
                verify(configurationContainerMock).create(eq("clusterModules"), (Action) any());
                verify(configurationMock, atLeast(1)).getDependencies();
                verify(dependencySetMock).stream();
                verify(configurationMock, atLeast(1)).getName();
                verify(projectMock, times(9)).getDependencies();
                verify(dependencyHandlerMock).project(eq(stringStringMap));
                verify(projectMock, times(2)).getRootProject();
                verify(projectMock2).getAllprojects();
                verify(projectMock3, times(2)).getPath();
                verify(projectMock3).getPlugins();
                verify(pluginContainerMock).hasPlugin(PluginBuildPlugin.class);
                verify(projectMock3).getExtensions();
                verify(extensionContainerMock).getByType(PluginPropertiesExtension.class);
                verify(dependencyHandlerMock2).project(eq(stringStringMap2));
                verify(configurationContainerMock2).create(eq("clusterPlugins"), (Action) any());
                verify(configurationMock2, atLeast(1)).getDependencies();
                verify(dependencySetMock2).stream();
                verify(projectMock, times(2)).findProject("return_of_getPath1");
                verify(projectMock5).getTasks();
                verify(taskContainerMock).named("bundlePlugin");
                verify(dependencyHandlerMock3).create(configurableFileCollectionMock);
                verify(projectMock).files(objectArray);
                verify(projectMock6).getAllprojects();
                verify(projectMock7, times(2)).getPath();
                verify(projectMock7).getPlugins();
                verify(pluginContainerMock2).hasPlugin(PluginBuildPlugin.class);
                verify(projectMock7).getExtensions();
                verify(extensionContainerMock2).getByType(PluginPropertiesExtension.class);
                verify(projectMock9).getTasks();
                verify(taskContainerMock2).named("bundlePlugin");
                verify(dependencyHandlerMock4).create(configurableFileCollectionMock2);
                verify(projectMock).files(objectArray2);
                verify(configurationContainerMock3).create(eq("extractedPlugins"), (Action) any());
                verify(configurationMock3, atLeast(1)).extendsFrom(configurationArray);
                verify(configurationMock3, atLeast(1)).getName();
                verify(dependencyHandlerMock5).registerTransform(eq(UnzipTransform.class), (Action) any());
                verify(configurationContainerMock4).create(eq("featuresMetadataDeps"), (Action) any());
                verify(fileCollectionMock, atLeast(1)).getAsPath();
                verify(dependencyHandlerMock6).project(eq(stringStringMap3));
                verify(configurationContainerMock5).create(eq("defaultDistrofeaturesMetadataDeps"), (Action) any());
                verify(dependencyHandlerMock7).project(eq(stringStringMap4));
                verify(pluginManagerMock3).withPlugin(eq("elasticsearch.esplugin"), (Action) any());
                verify(projectMock, times(2)).getPath();
                verify(dependencyHandlerMock8).add("clusterModules", dependencyMock8);
                verify(dependencyHandlerMock9).project(eq(stringStringMap5));
                verify(projectMock).getTasks();
                verify(taskContainerMock3).withType(StandaloneRestIntegTestTask.class);
                verify(taskCollectionMock).configureEach((Action) any());
                verify(projectMock, times(3)).getObjects();
                verify(objectFactoryMock).fileCollection();
                verify(configurableFileCollectionMock3).from(objectArray3);
                verify(configurableFileCollectionMock4).getAsPath();
                verify(configurableFileCollectionMock4, times(2)).getAsFileTree();
                verify(fileTreeMock).filter((Spec) any());
                verify(fileTreeMock2).filter((Spec) any());
                verify(objectFactoryMock2).fileCollection();
                verify(configurableFileCollectionMock5).from(objectArray4);
                verify(configurableFileCollectionMock6).getAsPath();
                verify(objectFactoryMock3).fileCollection();
                verify(configurableFileCollectionMock7).from(objectArray5);
                verify(configurableFileCollectionMock8, times(2)).getAsFileTree();
                verify(fileTreeMock3).filter((Spec) any());
                verify(fileTreeMock4).filter((Spec) any());
                verify(providerFactoryMock, atLeast(6)).provider((Callable) any());
                buildParams.verify(() -> BuildParams.getBwcVersions(), atLeast(1));
                verify(bwcVersionsMock).getMinimumWireCompatibleVersion();
                distributionDownloadPlugin.verify(() -> DistributionDownloadPlugin.getContainer(projectMock), atLeast(2));
                verify(namedDomainObjectContainerMock).findByName("default_distro");
                verify(namedDomainObjectContainerMock).create(eq("default_distro"), (Action) any());
                verify(namedDomainObjectContainerMock2).findByName("integ_test_distro");
                verify(namedDomainObjectContainerMock2).create(eq("integ_test_distro"), (Action) any());
                verify(elasticsearchDistributionMock2, atLeast(3)).getExtracted();
                verify(configurableFileCollectionMock9, times(2)).getAsFileTree();
                verify(fileTreeMock5).matching((Action) any());
                verify(fileTreeMock7).matching((Action) any());
                verify(configurableFileCollectionMock9).getSingleFile();
                verify(elasticsearchDistributionMock2, atLeast(2)).getName();
                gradleUtils.verify(() -> GradleUtils.isModuleProject("FT"), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.isModuleProject("BQ"), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.isModuleProject(""), atLeast(1));
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(2));
            });
        }
    }

    //Sapient generated method id: ${applyWhenUseExplodedAndGradleUtilsNotIsModuleProjectProjectGetPathAndFGetNameEndsWith_jarNotEqualsFalseAndDefaultBranch}, hash: 8972864AC199A5A10F39D328BF2E48EF
    @Test()
    void applyWhenUseExplodedAndGradleUtilsNotIsModuleProjectProjectGetPathAndFGetNameEndsWith_jarNotEqualsFalseAndDefaultBranch() throws InvalidUserDataException, UnknownDomainObjectException, IllegalStateException, UnknownTaskException {
        /* Branches:
         * (maybeDistro == null) : true  #  inside createDistribution method
         * (type != null) : false  #  inside lambda$createDistribution$14 method
         * (useExploded) : true  #  inside lambda$createPluginConfiguration$31 method
         * (isExtended == false) : true  #  inside lambda$createPluginConfiguration$31 method
         * (iterator.hasNext()) : true  #  inside lambda$createPluginConfiguration$30 method
         * (dependency instanceof ProjectDependency projectDependency) : true  #  inside lambda$createPluginConfiguration$30 method
         * (projectDependency.getTargetConfiguration() == null) : true  #  inside lambda$createPluginConfiguration$30 method
         * (useExploded) : true  #  inside lambda$createPluginConfiguration$30 method
         * (for-each(extendedPlugins)) : true  #  inside lambda$createPluginConfiguration$30 method
         * (branch expression (line 308)) : true
         * (branch expression (line 309)) : true
         * (branch expression (line 310)) : true
         * (useExploded) : true  #  inside lambda$createPluginConfiguration$29 method
         * (GradleUtils.isModuleProject(project.getPath())) : false  #  inside lambda$apply$7 method
         * (f.getName().endsWith(".jar") == false) : false  #  inside lambda$registerConfigurationInputs$15 method
         * (branch expression (line 287)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Project projectMock10 = mock(Project.class);
        TaskProvider taskProviderMock3 = mock(TaskProvider.class);
        TaskContainer taskContainerMock4 = mock(TaskContainer.class);
        ConfigurableFileCollection configurableFileCollectionMock10 = mock(ConfigurableFileCollection.class);
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class);
            MockedStatic<DistributionDownloadPlugin> distributionDownloadPlugin = mockStatic(DistributionDownloadPlugin.class);
            MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            doNothing().when(pluginManagerMock).apply(ElasticsearchJavaPlugin.class);
            doNothing().when(pluginManagerMock2).apply(InternalDistributionDownloadPlugin.class);
            doReturn(configurationMock).when(configurationContainerMock).create(eq("clusterModules"), (Action) any());
            doReturn(dependencySetMock).when(configurationMock).getDependencies();
            Stream stream = Stream.empty();
            doReturn(stream).when(dependencySetMock).stream();
            doReturn("BS").when(configurationMock).getName();
            Map<String, String> stringStringMap = new HashMap<>(Map.ofEntries(entry("path", "return_of_getPath1"), entry("configuration", "explodedBundleZip")));
            doReturn(dependencyMock).when(dependencyHandlerMock).project(eq(stringStringMap));
            Set<Project> projectSet = new HashSet<>();
            projectSet.add(projectMock3);
            doReturn(projectSet).when(projectMock2).getAllprojects();
            doReturn(pluginContainerMock).when(projectMock3).getPlugins();
            doReturn(true).when(pluginContainerMock).hasPlugin(PluginBuildPlugin.class);
            doReturn(extensionContainerMock).when(projectMock3).getExtensions();
            PluginPropertiesExtension pluginPropertiesExtension = new PluginPropertiesExtension(projectMock4);
            pluginPropertiesExtension.setName("");
            doReturn(pluginPropertiesExtension).when(extensionContainerMock).getByType(PluginPropertiesExtension.class);
            doReturn("FP", "return_of_getPath1").when(projectMock3).getPath();
            Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("path", "return_of_getPath1"), entry("configuration", "explodedBundleZip")));
            doReturn(dependencyMock2).when(dependencyHandlerMock2).project(eq(stringStringMap2));
            doReturn(configurationMock2).when(configurationContainerMock2).create(eq("clusterPlugins"), (Action) any());
            doReturn(dependencySetMock2).when(configurationMock2).getDependencies();
            Stream stream2 = Stream.empty();
            doReturn(stream2).when(dependencySetMock2).stream();
            doReturn(taskContainerMock).when(projectMock5).getTasks();
            doReturn(taskProviderMock).when(taskContainerMock).named("bundlePlugin");
            doReturn(dependencyMock3).when(dependencyHandlerMock3).create(configurableFileCollectionMock);
            Object[] objectArray = new Object[] { taskProviderMock };
            doReturn(configurableFileCollectionMock).when(projectMock).files(objectArray);
            doReturn(projectMock2, projectMock6).when(projectMock).getRootProject();
            Set<Project> projectSet2 = new HashSet<>();
            projectSet2.add(projectMock7);
            doReturn(projectSet2).when(projectMock6).getAllprojects();
            doReturn(pluginContainerMock2).when(projectMock7).getPlugins();
            doReturn(true).when(pluginContainerMock2).hasPlugin(PluginBuildPlugin.class);
            doReturn(extensionContainerMock2).when(projectMock7).getExtensions();
            PluginPropertiesExtension pluginPropertiesExtension2 = new PluginPropertiesExtension(projectMock8);
            pluginPropertiesExtension2.setName("");
            doReturn(pluginPropertiesExtension2).when(extensionContainerMock2).getByType(PluginPropertiesExtension.class);
            doReturn("EO", "return_of_getPath1").when(projectMock7).getPath();
            doReturn(taskContainerMock2).when(projectMock9).getTasks();
            doReturn(taskProviderMock2).when(taskContainerMock2).named("bundlePlugin");
            doReturn(dependencyMock4).when(dependencyHandlerMock4).create(configurableFileCollectionMock2);
            Object[] objectArray2 = new Object[] { taskProviderMock2 };
            doReturn(configurableFileCollectionMock2).when(projectMock).files(objectArray2);
            doReturn(configurationMock3).when(configurationContainerMock3).create(eq("extractedPlugins"), (Action) any());
            Configuration[] configurationArray = new Configuration[] { configurationMock2 };
            doReturn(configurationMock4).when(configurationMock3).extendsFrom(configurationArray);
            doReturn("CK").when(configurationMock3).getName();
            doNothing().when(dependencyHandlerMock5).registerTransform(eq(UnzipTransform.class), (Action) any());
            doReturn(fileCollectionMock).when(configurationContainerMock4).create(eq("featuresMetadataDeps"), (Action) any());
            doReturn("return_of_getAsPath1").when(fileCollectionMock).getAsPath();
            Map<String, String> stringStringMap3 = new HashMap<>(Map.ofEntries(entry("path", ":server")));
            doReturn(dependencyMock5).when(dependencyHandlerMock6).project(eq(stringStringMap3));
            doReturn(configurationContainerMock, configurationContainerMock2, configurationContainerMock3, configurationContainerMock4, configurationContainerMock5).when(projectMock).getConfigurations();
            doReturn(fileCollectionMock2).when(configurationContainerMock5).create(eq("defaultDistrofeaturesMetadataDeps"), (Action) any());
            Map<String, String> stringStringMap4 = new HashMap<>(Map.ofEntries(entry("path", ":distribution"), entry("configuration", "featuresMetadata")));
            doReturn(dependencyMock6).when(dependencyHandlerMock7).project(eq(stringStringMap4));
            doReturn(pluginManagerMock, pluginManagerMock2, pluginManagerMock3).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock3).withPlugin(eq("elasticsearch.esplugin"), (Action) any());
            doReturn(dependencyMock7).when(dependencyHandlerMock8).add("clusterPlugins", dependencyMock8);
            doReturn("", "return_of_getPath1").when(projectMock).getPath();
            doReturn(projectMock5, projectMock9, projectMock10).when(projectMock).findProject("return_of_getPath1");
            doReturn(taskContainerMock3).when(projectMock10).getTasks();
            doReturn(taskProviderMock3).when(taskContainerMock3).named("bundlePlugin");
            doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3, dependencyHandlerMock4, dependencyHandlerMock5, dependencyHandlerMock6, dependencyHandlerMock7, dependencyHandlerMock8, dependencyHandlerMock9).when(projectMock).getDependencies();
            doReturn(dependencyMock8).when(dependencyHandlerMock9).create(configurableFileCollectionMock3);
            Object[] objectArray3 = new Object[] { taskProviderMock3 };
            doReturn(configurableFileCollectionMock3).when(projectMock).files(objectArray3);
            doReturn(taskContainerMock4).when(projectMock).getTasks();
            doReturn(taskCollectionMock).when(taskContainerMock4).withType(StandaloneRestIntegTestTask.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            doReturn(configurableFileCollectionMock4).when(objectFactoryMock).fileCollection();
            Object[] objectArray4 = new Object[] { configurationMock };
            doReturn(configurableFileCollectionMock5).when(configurableFileCollectionMock4).from(objectArray4);
            doReturn("return_of_getAsPath1").when(configurableFileCollectionMock5).getAsPath();
            doReturn(fileCollectionMock3).when(fileTreeMock).filter((Spec) any());
            doReturn(fileTreeMock, fileTreeMock2).when(configurableFileCollectionMock5).getAsFileTree();
            doReturn(fileCollectionMock4).when(fileTreeMock2).filter((Spec) any());
            doReturn(configurableFileCollectionMock6).when(objectFactoryMock2).fileCollection();
            Object[] objectArray5 = new Object[] { configurationMock2 };
            doReturn(configurableFileCollectionMock7).when(configurableFileCollectionMock6).from(objectArray5);
            doReturn("return_of_getAsPath1").when(configurableFileCollectionMock7).getAsPath();
            doReturn(objectFactoryMock, objectFactoryMock2, objectFactoryMock3).when(projectMock).getObjects();
            doReturn(configurableFileCollectionMock8).when(objectFactoryMock3).fileCollection();
            Object[] objectArray6 = new Object[] { configurationMock3 };
            doReturn(configurableFileCollectionMock9).when(configurableFileCollectionMock8).from(objectArray6);
            doReturn(fileCollectionMock5).when(fileTreeMock3).filter((Spec) any());
            doReturn(fileTreeMock3, fileTreeMock4).when(configurableFileCollectionMock9).getAsFileTree();
            doReturn(fileCollectionMock6).when(fileTreeMock4).filter((Spec) any());
            doReturn(providerMock, providerMock2, providerMock3, providerMock4, providerMock5, providerMock6).when(providerFactoryMock).provider((Callable) any());
            buildParams.when(() -> BuildParams.getBwcVersions()).thenReturn(bwcVersionsMock);
            doReturn(versionMock).when(bwcVersionsMock).getMinimumWireCompatibleVersion();
            doReturn(null).when(namedDomainObjectContainerMock).findByName("default_distro");
            doReturn(elasticsearchDistributionMock).when(namedDomainObjectContainerMock).create(eq("default_distro"), (Action) any());
            distributionDownloadPlugin.when(() -> DistributionDownloadPlugin.getContainer(projectMock)).thenReturn(namedDomainObjectContainerMock).thenReturn(namedDomainObjectContainerMock2);
            doReturn(null).when(namedDomainObjectContainerMock2).findByName("integ_test_distro");
            doReturn(elasticsearchDistributionMock2).when(namedDomainObjectContainerMock2).create(eq("integ_test_distro"), (Action) any());
            doReturn(configurableFileCollectionMock10).when(elasticsearchDistributionMock2).getExtracted();
            doReturn(fileTreeMock6).when(fileTreeMock5).matching((Action) any());
            doReturn(fileTreeMock5, fileTreeMock7).when(configurableFileCollectionMock10).getAsFileTree();
            doReturn(fileTreeMock8).when(fileTreeMock7).matching((Action) any());
            File file = new File("pathname1");
            doReturn(file).when(configurableFileCollectionMock10).getSingleFile();
            doReturn("AJ").when(elasticsearchDistributionMock2).getName();
            gradleUtils.when(() -> GradleUtils.isModuleProject("FP")).thenReturn(true);
            gradleUtils.when(() -> GradleUtils.isModuleProject("EO")).thenReturn(true);
            gradleUtils.when(() -> GradleUtils.isModuleProject("")).thenReturn(false);
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            RestTestBasePlugin target = new RestTestBasePlugin(providerFactoryMock);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(3)).getPluginManager();
                verify(pluginManagerMock).apply(ElasticsearchJavaPlugin.class);
                verify(pluginManagerMock2).apply(InternalDistributionDownloadPlugin.class);
                verify(projectMock, times(5)).getConfigurations();
                verify(configurationContainerMock).create(eq("clusterModules"), (Action) any());
                verify(configurationMock, atLeast(1)).getDependencies();
                verify(dependencySetMock).stream();
                verify(configurationMock, atLeast(1)).getName();
                verify(projectMock, times(9)).getDependencies();
                verify(dependencyHandlerMock).project(eq(stringStringMap));
                verify(projectMock, times(2)).getRootProject();
                verify(projectMock2).getAllprojects();
                verify(projectMock3, times(2)).getPath();
                verify(projectMock3).getPlugins();
                verify(pluginContainerMock).hasPlugin(PluginBuildPlugin.class);
                verify(projectMock3).getExtensions();
                verify(extensionContainerMock).getByType(PluginPropertiesExtension.class);
                verify(dependencyHandlerMock2).project(eq(stringStringMap2));
                verify(configurationContainerMock2).create(eq("clusterPlugins"), (Action) any());
                verify(configurationMock2, atLeast(1)).getDependencies();
                verify(dependencySetMock2).stream();
                verify(projectMock, times(3)).findProject("return_of_getPath1");
                verify(projectMock5).getTasks();
                verify(taskContainerMock).named("bundlePlugin");
                verify(dependencyHandlerMock3).create(configurableFileCollectionMock);
                verify(projectMock).files(objectArray);
                verify(projectMock6).getAllprojects();
                verify(projectMock7, times(2)).getPath();
                verify(projectMock7).getPlugins();
                verify(pluginContainerMock2).hasPlugin(PluginBuildPlugin.class);
                verify(projectMock7).getExtensions();
                verify(extensionContainerMock2).getByType(PluginPropertiesExtension.class);
                verify(projectMock9).getTasks();
                verify(taskContainerMock2).named("bundlePlugin");
                verify(dependencyHandlerMock4).create(configurableFileCollectionMock2);
                verify(projectMock).files(objectArray2);
                verify(configurationContainerMock3).create(eq("extractedPlugins"), (Action) any());
                verify(configurationMock3, atLeast(1)).extendsFrom(configurationArray);
                verify(configurationMock3, atLeast(1)).getName();
                verify(dependencyHandlerMock5).registerTransform(eq(UnzipTransform.class), (Action) any());
                verify(configurationContainerMock4).create(eq("featuresMetadataDeps"), (Action) any());
                verify(fileCollectionMock, atLeast(1)).getAsPath();
                verify(dependencyHandlerMock6).project(eq(stringStringMap3));
                verify(configurationContainerMock5).create(eq("defaultDistrofeaturesMetadataDeps"), (Action) any());
                verify(dependencyHandlerMock7).project(eq(stringStringMap4));
                verify(pluginManagerMock3).withPlugin(eq("elasticsearch.esplugin"), (Action) any());
                verify(projectMock, times(2)).getPath();
                verify(dependencyHandlerMock8).add("clusterPlugins", dependencyMock8);
                verify(projectMock10).getTasks();
                verify(taskContainerMock3).named("bundlePlugin");
                verify(dependencyHandlerMock9).create(configurableFileCollectionMock3);
                verify(projectMock).files(objectArray3);
                verify(projectMock).getTasks();
                verify(taskContainerMock4).withType(StandaloneRestIntegTestTask.class);
                verify(taskCollectionMock).configureEach((Action) any());
                verify(projectMock, times(3)).getObjects();
                verify(objectFactoryMock).fileCollection();
                verify(configurableFileCollectionMock4).from(objectArray4);
                verify(configurableFileCollectionMock5).getAsPath();
                verify(configurableFileCollectionMock5, times(2)).getAsFileTree();
                verify(fileTreeMock).filter((Spec) any());
                verify(fileTreeMock2).filter((Spec) any());
                verify(objectFactoryMock2).fileCollection();
                verify(configurableFileCollectionMock6).from(objectArray5);
                verify(configurableFileCollectionMock7).getAsPath();
                verify(objectFactoryMock3).fileCollection();
                verify(configurableFileCollectionMock8).from(objectArray6);
                verify(configurableFileCollectionMock9, times(2)).getAsFileTree();
                verify(fileTreeMock3).filter((Spec) any());
                verify(fileTreeMock4).filter((Spec) any());
                verify(providerFactoryMock, atLeast(6)).provider((Callable) any());
                buildParams.verify(() -> BuildParams.getBwcVersions(), atLeast(1));
                verify(bwcVersionsMock).getMinimumWireCompatibleVersion();
                distributionDownloadPlugin.verify(() -> DistributionDownloadPlugin.getContainer(projectMock), atLeast(2));
                verify(namedDomainObjectContainerMock).findByName("default_distro");
                verify(namedDomainObjectContainerMock).create(eq("default_distro"), (Action) any());
                verify(namedDomainObjectContainerMock2).findByName("integ_test_distro");
                verify(namedDomainObjectContainerMock2).create(eq("integ_test_distro"), (Action) any());
                verify(elasticsearchDistributionMock2, atLeast(3)).getExtracted();
                verify(configurableFileCollectionMock10, times(2)).getAsFileTree();
                verify(fileTreeMock5).matching((Action) any());
                verify(fileTreeMock7).matching((Action) any());
                verify(configurableFileCollectionMock10).getSingleFile();
                verify(elasticsearchDistributionMock2, atLeast(2)).getName();
                gradleUtils.verify(() -> GradleUtils.isModuleProject("FP"), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.isModuleProject("EO"), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.isModuleProject(""), atLeast(1));
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(2));
            });
        }
    }

    //Sapient generated method id: ${applyWhenGradleUtilsNotIsModuleProjectProjectGetPathAndFGetNameEndsWith_jarNotEqualsFalseAndDefaultBranch9}, hash: CF9772B5D250DF09BB41CFDB0B844134
    @Test()
    void applyWhenGradleUtilsNotIsModuleProjectProjectGetPathAndFGetNameEndsWith_jarNotEqualsFalseAndDefaultBranch9() throws InvalidUserDataException, UnknownDomainObjectException, IllegalStateException, UnknownTaskException {
        /* Branches:
         * (maybeDistro == null) : true  #  inside createDistribution method
         * (type != null) : false  #  inside lambda$createDistribution$14 method
         * (useExploded) : true  #  inside lambda$createPluginConfiguration$31 method
         * (isExtended == false) : true  #  inside lambda$createPluginConfiguration$31 method
         * (iterator.hasNext()) : true  #  inside lambda$createPluginConfiguration$30 method
         * (dependency instanceof ProjectDependency projectDependency) : true  #  inside lambda$createPluginConfiguration$30 method
         * (projectDependency.getTargetConfiguration() == null) : true  #  inside lambda$createPluginConfiguration$30 method
         * (useExploded) : true  #  inside lambda$createPluginConfiguration$30 method
         * (for-each(extendedPlugins)) : true  #  inside lambda$createPluginConfiguration$30 method
         * (branch expression (line 308)) : true
         * (branch expression (line 309)) : true
         * (branch expression (line 310)) : true
         * (useExploded) : true  #  inside lambda$createPluginConfiguration$29 method
         * (GradleUtils.isModuleProject(project.getPath())) : false  #  inside lambda$apply$7 method
         * (f.getName().endsWith(".jar") == false) : false  #  inside lambda$registerConfigurationInputs$15 method
         * (branch expression (line 287)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class);
            MockedStatic<DistributionDownloadPlugin> distributionDownloadPlugin = mockStatic(DistributionDownloadPlugin.class);
            MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            doNothing().when(pluginManagerMock).apply(ElasticsearchJavaPlugin.class);
            doNothing().when(pluginManagerMock2).apply(InternalDistributionDownloadPlugin.class);
            doReturn(configurationMock).when(configurationContainerMock).create(eq("clusterModules"), (Action) any());
            doReturn(dependencySetMock).when(configurationMock).getDependencies();
            Stream stream = Stream.empty();
            doReturn(stream).when(dependencySetMock).stream();
            doReturn("").when(configurationMock).getName();
            Map<String, String> stringStringMap = new HashMap<>(Map.ofEntries(entry("path", "return_of_getPath1"), entry("configuration", "explodedBundleZip")));
            doReturn(dependencyMock).when(dependencyHandlerMock).project(eq(stringStringMap));
            Set<Project> projectSet = new HashSet<>();
            projectSet.add(projectMock3);
            doReturn(projectSet).when(projectMock2).getAllprojects();
            doReturn(pluginContainerMock).when(projectMock3).getPlugins();
            doReturn(true).when(pluginContainerMock).hasPlugin(PluginBuildPlugin.class);
            doReturn(extensionContainerMock).when(projectMock3).getExtensions();
            PluginPropertiesExtension pluginPropertiesExtension = new PluginPropertiesExtension(projectMock4);
            pluginPropertiesExtension.setName("GA");
            doReturn(pluginPropertiesExtension).when(extensionContainerMock).getByType(PluginPropertiesExtension.class);
            doReturn("BQ", "return_of_getPath1").when(projectMock3).getPath();
            Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("path", "return_of_getPath1"), entry("configuration", "explodedBundleZip")));
            doReturn(dependencyMock2).when(dependencyHandlerMock2).project(eq(stringStringMap2));
            doReturn(configurationMock2).when(configurationContainerMock2).create(eq("clusterPlugins"), (Action) any());
            doReturn(dependencySetMock2).when(configurationMock2).getDependencies();
            Stream stream2 = Stream.empty();
            doReturn(stream2).when(dependencySetMock2).stream();
            doReturn(taskContainerMock).when(projectMock5).getTasks();
            doReturn(taskProviderMock).when(taskContainerMock).named("bundlePlugin");
            doReturn(dependencyMock3).when(dependencyHandlerMock3).create(configurableFileCollectionMock);
            Object[] objectArray = new Object[] { taskProviderMock };
            doReturn(configurableFileCollectionMock).when(projectMock).files(objectArray);
            doReturn(projectMock2, projectMock6).when(projectMock).getRootProject();
            Set<Project> projectSet2 = new HashSet<>();
            projectSet2.add(projectMock7);
            doReturn(projectSet2).when(projectMock6).getAllprojects();
            doReturn("ES").when(projectMock7).getPath();
            doReturn(pluginContainerMock2).when(projectMock7).getPlugins();
            doReturn(true).when(pluginContainerMock2).hasPlugin(PluginBuildPlugin.class);
            doReturn(extensionContainerMock2).when(projectMock7).getExtensions();
            PluginPropertiesExtension pluginPropertiesExtension2 = new PluginPropertiesExtension(projectMock8);
            pluginPropertiesExtension2.setName("CT");
            doReturn(pluginPropertiesExtension2).when(extensionContainerMock2).getByType(PluginPropertiesExtension.class);
            doReturn(configurationMock3).when(configurationContainerMock3).create(eq("extractedPlugins"), (Action) any());
            Configuration[] configurationArray = new Configuration[] { configurationMock2 };
            doReturn(configurationMock4).when(configurationMock3).extendsFrom(configurationArray);
            doReturn("").when(configurationMock3).getName();
            doNothing().when(dependencyHandlerMock4).registerTransform(eq(UnzipTransform.class), (Action) any());
            doReturn(fileCollectionMock).when(configurationContainerMock4).create(eq("featuresMetadataDeps"), (Action) any());
            doReturn("return_of_getAsPath1").when(fileCollectionMock).getAsPath();
            Map<String, String> stringStringMap3 = new HashMap<>(Map.ofEntries(entry("path", ":server")));
            doReturn(dependencyMock4).when(dependencyHandlerMock5).project(eq(stringStringMap3));
            doReturn(configurationContainerMock, configurationContainerMock2, configurationContainerMock3, configurationContainerMock4, configurationContainerMock5).when(projectMock).getConfigurations();
            doReturn(fileCollectionMock2).when(configurationContainerMock5).create(eq("defaultDistrofeaturesMetadataDeps"), (Action) any());
            Map<String, String> stringStringMap4 = new HashMap<>(Map.ofEntries(entry("path", ":distribution"), entry("configuration", "featuresMetadata")));
            doReturn(dependencyMock5).when(dependencyHandlerMock6).project(eq(stringStringMap4));
            doReturn(pluginManagerMock, pluginManagerMock2, pluginManagerMock3).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock3).withPlugin(eq("elasticsearch.esplugin"), (Action) any());
            doReturn(dependencyMock6).when(dependencyHandlerMock7).add("clusterPlugins", dependencyMock7);
            doReturn("", "return_of_getPath1").when(projectMock).getPath();
            doReturn(projectMock5, projectMock9).when(projectMock).findProject("return_of_getPath1");
            doReturn(taskContainerMock2).when(projectMock9).getTasks();
            doReturn(taskProviderMock2).when(taskContainerMock2).named("bundlePlugin");
            doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3, dependencyHandlerMock4, dependencyHandlerMock5, dependencyHandlerMock6, dependencyHandlerMock7, dependencyHandlerMock8).when(projectMock).getDependencies();
            doReturn(dependencyMock7).when(dependencyHandlerMock8).create(configurableFileCollectionMock2);
            Object[] objectArray2 = new Object[] { taskProviderMock2 };
            doReturn(configurableFileCollectionMock2).when(projectMock).files(objectArray2);
            doReturn(taskContainerMock3).when(projectMock).getTasks();
            doReturn(taskCollectionMock).when(taskContainerMock3).withType(StandaloneRestIntegTestTask.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            doReturn(configurableFileCollectionMock3).when(objectFactoryMock).fileCollection();
            Object[] objectArray3 = new Object[] { configurationMock };
            doReturn(configurableFileCollectionMock4).when(configurableFileCollectionMock3).from(objectArray3);
            doReturn("return_of_getAsPath1").when(configurableFileCollectionMock4).getAsPath();
            doReturn(fileCollectionMock3).when(fileTreeMock).filter((Spec) any());
            doReturn(fileTreeMock, fileTreeMock2).when(configurableFileCollectionMock4).getAsFileTree();
            doReturn(fileCollectionMock4).when(fileTreeMock2).filter((Spec) any());
            doReturn(configurableFileCollectionMock5).when(objectFactoryMock2).fileCollection();
            Object[] objectArray4 = new Object[] { configurationMock2 };
            doReturn(configurableFileCollectionMock6).when(configurableFileCollectionMock5).from(objectArray4);
            doReturn("return_of_getAsPath1").when(configurableFileCollectionMock6).getAsPath();
            doReturn(objectFactoryMock, objectFactoryMock2, objectFactoryMock3).when(projectMock).getObjects();
            doReturn(configurableFileCollectionMock7).when(objectFactoryMock3).fileCollection();
            Object[] objectArray5 = new Object[] { configurationMock3 };
            doReturn(configurableFileCollectionMock8).when(configurableFileCollectionMock7).from(objectArray5);
            doReturn(fileCollectionMock5).when(fileTreeMock3).filter((Spec) any());
            doReturn(fileTreeMock3, fileTreeMock4).when(configurableFileCollectionMock8).getAsFileTree();
            doReturn(fileCollectionMock6).when(fileTreeMock4).filter((Spec) any());
            doReturn(providerMock, providerMock2, providerMock3, providerMock4, providerMock5, providerMock6).when(providerFactoryMock).provider((Callable) any());
            buildParams.when(() -> BuildParams.getBwcVersions()).thenReturn(bwcVersionsMock);
            doReturn(versionMock).when(bwcVersionsMock).getMinimumWireCompatibleVersion();
            doReturn(null).when(namedDomainObjectContainerMock).findByName("default_distro");
            doReturn(elasticsearchDistributionMock).when(namedDomainObjectContainerMock).create(eq("default_distro"), (Action) any());
            distributionDownloadPlugin.when(() -> DistributionDownloadPlugin.getContainer(projectMock)).thenReturn(namedDomainObjectContainerMock).thenReturn(namedDomainObjectContainerMock2);
            doReturn(null).when(namedDomainObjectContainerMock2).findByName("integ_test_distro");
            doReturn(elasticsearchDistributionMock2).when(namedDomainObjectContainerMock2).create(eq("integ_test_distro"), (Action) any());
            doReturn(configurableFileCollectionMock9).when(elasticsearchDistributionMock2).getExtracted();
            doReturn(fileTreeMock6).when(fileTreeMock5).matching((Action) any());
            doReturn(fileTreeMock5, fileTreeMock7).when(configurableFileCollectionMock9).getAsFileTree();
            doReturn(fileTreeMock8).when(fileTreeMock7).matching((Action) any());
            File file = new File("pathname1");
            doReturn(file).when(configurableFileCollectionMock9).getSingleFile();
            doReturn("FK").when(elasticsearchDistributionMock2).getName();
            gradleUtils.when(() -> GradleUtils.isModuleProject("BQ")).thenReturn(true);
            gradleUtils.when(() -> GradleUtils.isModuleProject("ES")).thenReturn(true);
            gradleUtils.when(() -> GradleUtils.isModuleProject("")).thenReturn(false);
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            RestTestBasePlugin target = new RestTestBasePlugin(providerFactoryMock);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(3)).getPluginManager();
                verify(pluginManagerMock).apply(ElasticsearchJavaPlugin.class);
                verify(pluginManagerMock2).apply(InternalDistributionDownloadPlugin.class);
                verify(projectMock, times(5)).getConfigurations();
                verify(configurationContainerMock).create(eq("clusterModules"), (Action) any());
                verify(configurationMock, atLeast(1)).getDependencies();
                verify(dependencySetMock).stream();
                verify(configurationMock, atLeast(1)).getName();
                verify(projectMock, times(8)).getDependencies();
                verify(dependencyHandlerMock).project(eq(stringStringMap));
                verify(projectMock, times(2)).getRootProject();
                verify(projectMock2).getAllprojects();
                verify(projectMock3, times(2)).getPath();
                verify(projectMock3).getPlugins();
                verify(pluginContainerMock).hasPlugin(PluginBuildPlugin.class);
                verify(projectMock3).getExtensions();
                verify(extensionContainerMock).getByType(PluginPropertiesExtension.class);
                verify(dependencyHandlerMock2).project(eq(stringStringMap2));
                verify(configurationContainerMock2).create(eq("clusterPlugins"), (Action) any());
                verify(configurationMock2, atLeast(1)).getDependencies();
                verify(dependencySetMock2).stream();
                verify(projectMock, times(2)).findProject("return_of_getPath1");
                verify(projectMock5).getTasks();
                verify(taskContainerMock).named("bundlePlugin");
                verify(dependencyHandlerMock3).create(configurableFileCollectionMock);
                verify(projectMock).files(objectArray);
                verify(projectMock6).getAllprojects();
                verify(projectMock7).getPath();
                verify(projectMock7).getPlugins();
                verify(pluginContainerMock2).hasPlugin(PluginBuildPlugin.class);
                verify(projectMock7).getExtensions();
                verify(extensionContainerMock2).getByType(PluginPropertiesExtension.class);
                verify(configurationContainerMock3).create(eq("extractedPlugins"), (Action) any());
                verify(configurationMock3, atLeast(1)).extendsFrom(configurationArray);
                verify(configurationMock3, atLeast(1)).getName();
                verify(dependencyHandlerMock4).registerTransform(eq(UnzipTransform.class), (Action) any());
                verify(configurationContainerMock4).create(eq("featuresMetadataDeps"), (Action) any());
                verify(fileCollectionMock, atLeast(1)).getAsPath();
                verify(dependencyHandlerMock5).project(eq(stringStringMap3));
                verify(configurationContainerMock5).create(eq("defaultDistrofeaturesMetadataDeps"), (Action) any());
                verify(dependencyHandlerMock6).project(eq(stringStringMap4));
                verify(pluginManagerMock3).withPlugin(eq("elasticsearch.esplugin"), (Action) any());
                verify(projectMock, times(2)).getPath();
                verify(dependencyHandlerMock7).add("clusterPlugins", dependencyMock7);
                verify(projectMock9).getTasks();
                verify(taskContainerMock2).named("bundlePlugin");
                verify(dependencyHandlerMock8).create(configurableFileCollectionMock2);
                verify(projectMock).files(objectArray2);
                verify(projectMock).getTasks();
                verify(taskContainerMock3).withType(StandaloneRestIntegTestTask.class);
                verify(taskCollectionMock).configureEach((Action) any());
                verify(projectMock, times(3)).getObjects();
                verify(objectFactoryMock).fileCollection();
                verify(configurableFileCollectionMock3).from(objectArray3);
                verify(configurableFileCollectionMock4).getAsPath();
                verify(configurableFileCollectionMock4, times(2)).getAsFileTree();
                verify(fileTreeMock).filter((Spec) any());
                verify(fileTreeMock2).filter((Spec) any());
                verify(objectFactoryMock2).fileCollection();
                verify(configurableFileCollectionMock5).from(objectArray4);
                verify(configurableFileCollectionMock6).getAsPath();
                verify(objectFactoryMock3).fileCollection();
                verify(configurableFileCollectionMock7).from(objectArray5);
                verify(configurableFileCollectionMock8, times(2)).getAsFileTree();
                verify(fileTreeMock3).filter((Spec) any());
                verify(fileTreeMock4).filter((Spec) any());
                verify(providerFactoryMock, atLeast(6)).provider((Callable) any());
                buildParams.verify(() -> BuildParams.getBwcVersions(), atLeast(1));
                verify(bwcVersionsMock).getMinimumWireCompatibleVersion();
                distributionDownloadPlugin.verify(() -> DistributionDownloadPlugin.getContainer(projectMock), atLeast(2));
                verify(namedDomainObjectContainerMock).findByName("default_distro");
                verify(namedDomainObjectContainerMock).create(eq("default_distro"), (Action) any());
                verify(namedDomainObjectContainerMock2).findByName("integ_test_distro");
                verify(namedDomainObjectContainerMock2).create(eq("integ_test_distro"), (Action) any());
                verify(elasticsearchDistributionMock2, atLeast(3)).getExtracted();
                verify(configurableFileCollectionMock9, times(2)).getAsFileTree();
                verify(fileTreeMock5).matching((Action) any());
                verify(fileTreeMock7).matching((Action) any());
                verify(configurableFileCollectionMock9).getSingleFile();
                verify(elasticsearchDistributionMock2, atLeast(2)).getName();
                gradleUtils.verify(() -> GradleUtils.isModuleProject("BQ"), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.isModuleProject("ES"), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.isModuleProject(""), atLeast(1));
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(2));
            });
        }
    }

    //Sapient generated method id: ${applyWhenGradleUtilsNotIsModuleProjectProjectGetPathAndFGetNameEndsWith_jarNotEqualsFalseAndDefaultBranch10}, hash: F029213A04E3B883841753C4DFE36AC7
    @Test()
    void applyWhenGradleUtilsNotIsModuleProjectProjectGetPathAndFGetNameEndsWith_jarNotEqualsFalseAndDefaultBranch10() throws InvalidUserDataException, UnknownDomainObjectException, IllegalStateException, UnknownTaskException {
        /* Branches:
         * (maybeDistro == null) : true  #  inside createDistribution method
         * (type != null) : false  #  inside lambda$createDistribution$14 method
         * (useExploded) : true  #  inside lambda$createPluginConfiguration$31 method
         * (isExtended == false) : true  #  inside lambda$createPluginConfiguration$31 method
         * (iterator.hasNext()) : true  #  inside lambda$createPluginConfiguration$30 method
         * (dependency instanceof ProjectDependency projectDependency) : true  #  inside lambda$createPluginConfiguration$30 method
         * (projectDependency.getTargetConfiguration() == null) : true  #  inside lambda$createPluginConfiguration$30 method
         * (useExploded) : true  #  inside lambda$createPluginConfiguration$30 method
         * (for-each(extendedPlugins)) : true  #  inside lambda$createPluginConfiguration$30 method
         * (branch expression (line 308)) : true
         * (branch expression (line 309)) : true
         * (branch expression (line 310)) : true
         * (useExploded) : true  #  inside lambda$createPluginConfiguration$29 method
         * (GradleUtils.isModuleProject(project.getPath())) : false  #  inside lambda$apply$7 method
         * (f.getName().endsWith(".jar") == false) : false  #  inside lambda$registerConfigurationInputs$15 method
         * (branch expression (line 287)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class);
            MockedStatic<DistributionDownloadPlugin> distributionDownloadPlugin = mockStatic(DistributionDownloadPlugin.class);
            MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            doNothing().when(pluginManagerMock).apply(ElasticsearchJavaPlugin.class);
            doNothing().when(pluginManagerMock2).apply(InternalDistributionDownloadPlugin.class);
            doReturn(configurationMock).when(configurationContainerMock).create(eq("clusterModules"), (Action) any());
            doReturn(dependencySetMock).when(configurationMock).getDependencies();
            Stream stream = Stream.empty();
            doReturn(stream).when(dependencySetMock).stream();
            doReturn("CD").when(configurationMock).getName();
            Map<String, String> stringStringMap = new HashMap<>(Map.ofEntries(entry("path", "return_of_getPath1"), entry("configuration", "explodedBundleZip")));
            doReturn(dependencyMock).when(dependencyHandlerMock).project(eq(stringStringMap));
            Set<Project> projectSet = new HashSet<>();
            projectSet.add(projectMock3);
            doReturn(projectSet).when(projectMock2).getAllprojects();
            doReturn(pluginContainerMock).when(projectMock3).getPlugins();
            doReturn(true).when(pluginContainerMock).hasPlugin(PluginBuildPlugin.class);
            doReturn(extensionContainerMock).when(projectMock3).getExtensions();
            PluginPropertiesExtension pluginPropertiesExtension = new PluginPropertiesExtension(projectMock4);
            pluginPropertiesExtension.setName("TM");
            doReturn(pluginPropertiesExtension).when(extensionContainerMock).getByType(PluginPropertiesExtension.class);
            doReturn("GL", "return_of_getPath1").when(projectMock3).getPath();
            Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("path", "return_of_getPath1"), entry("configuration", "explodedBundleZip")));
            doReturn(dependencyMock2).when(dependencyHandlerMock2).project(eq(stringStringMap2));
            doReturn(configurationMock2).when(configurationContainerMock2).create(eq("clusterPlugins"), (Action) any());
            doReturn(dependencySetMock2).when(configurationMock2).getDependencies();
            Stream stream2 = Stream.empty();
            doReturn(stream2).when(dependencySetMock2).stream();
            doReturn(taskContainerMock).when(projectMock5).getTasks();
            doReturn(taskProviderMock).when(taskContainerMock).named("bundlePlugin");
            doReturn(dependencyMock3).when(dependencyHandlerMock3).create(configurableFileCollectionMock);
            Object[] objectArray = new Object[] { taskProviderMock };
            doReturn(configurableFileCollectionMock).when(projectMock).files(objectArray);
            doReturn(projectMock2, projectMock6).when(projectMock).getRootProject();
            Set<Project> projectSet2 = new HashSet<>();
            projectSet2.add(projectMock7);
            doReturn(projectSet2).when(projectMock6).getAllprojects();
            doReturn("").when(projectMock7).getPath();
            doReturn(pluginContainerMock2).when(projectMock7).getPlugins();
            doReturn(false).when(pluginContainerMock2).hasPlugin(PluginBuildPlugin.class);
            doReturn(configurationMock3).when(configurationContainerMock3).create(eq("extractedPlugins"), (Action) any());
            Configuration[] configurationArray = new Configuration[] { configurationMock2 };
            doReturn(configurationMock4).when(configurationMock3).extendsFrom(configurationArray);
            doReturn("FP").when(configurationMock3).getName();
            doNothing().when(dependencyHandlerMock4).registerTransform(eq(UnzipTransform.class), (Action) any());
            doReturn(fileCollectionMock).when(configurationContainerMock4).create(eq("featuresMetadataDeps"), (Action) any());
            doReturn("return_of_getAsPath1").when(fileCollectionMock).getAsPath();
            Map<String, String> stringStringMap3 = new HashMap<>(Map.ofEntries(entry("path", ":server")));
            doReturn(dependencyMock4).when(dependencyHandlerMock5).project(eq(stringStringMap3));
            doReturn(configurationContainerMock, configurationContainerMock2, configurationContainerMock3, configurationContainerMock4, configurationContainerMock5).when(projectMock).getConfigurations();
            doReturn(fileCollectionMock2).when(configurationContainerMock5).create(eq("defaultDistrofeaturesMetadataDeps"), (Action) any());
            Map<String, String> stringStringMap4 = new HashMap<>(Map.ofEntries(entry("path", ":distribution"), entry("configuration", "featuresMetadata")));
            doReturn(dependencyMock5).when(dependencyHandlerMock6).project(eq(stringStringMap4));
            doReturn(pluginManagerMock, pluginManagerMock2, pluginManagerMock3).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock3).withPlugin(eq("elasticsearch.esplugin"), (Action) any());
            doReturn(dependencyMock6).when(dependencyHandlerMock7).add("clusterPlugins", dependencyMock7);
            doReturn("AN", "return_of_getPath1").when(projectMock).getPath();
            doReturn(projectMock5, projectMock8).when(projectMock).findProject("return_of_getPath1");
            doReturn(taskContainerMock2).when(projectMock8).getTasks();
            doReturn(taskProviderMock2).when(taskContainerMock2).named("bundlePlugin");
            doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3, dependencyHandlerMock4, dependencyHandlerMock5, dependencyHandlerMock6, dependencyHandlerMock7, dependencyHandlerMock8).when(projectMock).getDependencies();
            doReturn(dependencyMock7).when(dependencyHandlerMock8).create(configurableFileCollectionMock2);
            Object[] objectArray2 = new Object[] { taskProviderMock2 };
            doReturn(configurableFileCollectionMock2).when(projectMock).files(objectArray2);
            doReturn(taskContainerMock3).when(projectMock).getTasks();
            doReturn(taskCollectionMock).when(taskContainerMock3).withType(StandaloneRestIntegTestTask.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            doReturn(configurableFileCollectionMock3).when(objectFactoryMock).fileCollection();
            Object[] objectArray3 = new Object[] { configurationMock };
            doReturn(configurableFileCollectionMock4).when(configurableFileCollectionMock3).from(objectArray3);
            doReturn("return_of_getAsPath1").when(configurableFileCollectionMock4).getAsPath();
            doReturn(fileCollectionMock3).when(fileTreeMock).filter((Spec) any());
            doReturn(fileTreeMock, fileTreeMock2).when(configurableFileCollectionMock4).getAsFileTree();
            doReturn(fileCollectionMock4).when(fileTreeMock2).filter((Spec) any());
            doReturn(configurableFileCollectionMock5).when(objectFactoryMock2).fileCollection();
            Object[] objectArray4 = new Object[] { configurationMock2 };
            doReturn(configurableFileCollectionMock6).when(configurableFileCollectionMock5).from(objectArray4);
            doReturn("return_of_getAsPath1").when(configurableFileCollectionMock6).getAsPath();
            doReturn(objectFactoryMock, objectFactoryMock2, objectFactoryMock3).when(projectMock).getObjects();
            doReturn(configurableFileCollectionMock7).when(objectFactoryMock3).fileCollection();
            Object[] objectArray5 = new Object[] { configurationMock3 };
            doReturn(configurableFileCollectionMock8).when(configurableFileCollectionMock7).from(objectArray5);
            doReturn(fileCollectionMock5).when(fileTreeMock3).filter((Spec) any());
            doReturn(fileTreeMock3, fileTreeMock4).when(configurableFileCollectionMock8).getAsFileTree();
            doReturn(fileCollectionMock6).when(fileTreeMock4).filter((Spec) any());
            doReturn(providerMock, providerMock2, providerMock3, providerMock4, providerMock5, providerMock6).when(providerFactoryMock).provider((Callable) any());
            buildParams.when(() -> BuildParams.getBwcVersions()).thenReturn(bwcVersionsMock);
            doReturn(versionMock).when(bwcVersionsMock).getMinimumWireCompatibleVersion();
            doReturn(null).when(namedDomainObjectContainerMock).findByName("default_distro");
            doReturn(elasticsearchDistributionMock).when(namedDomainObjectContainerMock).create(eq("default_distro"), (Action) any());
            distributionDownloadPlugin.when(() -> DistributionDownloadPlugin.getContainer(projectMock)).thenReturn(namedDomainObjectContainerMock).thenReturn(namedDomainObjectContainerMock2);
            doReturn(null).when(namedDomainObjectContainerMock2).findByName("integ_test_distro");
            doReturn(elasticsearchDistributionMock2).when(namedDomainObjectContainerMock2).create(eq("integ_test_distro"), (Action) any());
            doReturn(configurableFileCollectionMock9).when(elasticsearchDistributionMock2).getExtracted();
            doReturn(fileTreeMock6).when(fileTreeMock5).matching((Action) any());
            doReturn(fileTreeMock5, fileTreeMock7).when(configurableFileCollectionMock9).getAsFileTree();
            doReturn(fileTreeMock8).when(fileTreeMock7).matching((Action) any());
            File file = new File("pathname1");
            doReturn(file).when(configurableFileCollectionMock9).getSingleFile();
            doReturn("BO").when(elasticsearchDistributionMock2).getName();
            gradleUtils.when(() -> GradleUtils.isModuleProject("GL")).thenReturn(true);
            gradleUtils.when(() -> GradleUtils.isModuleProject("")).thenReturn(true);
            gradleUtils.when(() -> GradleUtils.isModuleProject("AN")).thenReturn(false);
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            RestTestBasePlugin target = new RestTestBasePlugin(providerFactoryMock);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(3)).getPluginManager();
                verify(pluginManagerMock).apply(ElasticsearchJavaPlugin.class);
                verify(pluginManagerMock2).apply(InternalDistributionDownloadPlugin.class);
                verify(projectMock, times(5)).getConfigurations();
                verify(configurationContainerMock).create(eq("clusterModules"), (Action) any());
                verify(configurationMock, atLeast(1)).getDependencies();
                verify(dependencySetMock).stream();
                verify(configurationMock, atLeast(1)).getName();
                verify(projectMock, times(8)).getDependencies();
                verify(dependencyHandlerMock).project(eq(stringStringMap));
                verify(projectMock, times(2)).getRootProject();
                verify(projectMock2).getAllprojects();
                verify(projectMock3, times(2)).getPath();
                verify(projectMock3).getPlugins();
                verify(pluginContainerMock).hasPlugin(PluginBuildPlugin.class);
                verify(projectMock3).getExtensions();
                verify(extensionContainerMock).getByType(PluginPropertiesExtension.class);
                verify(dependencyHandlerMock2).project(eq(stringStringMap2));
                verify(configurationContainerMock2).create(eq("clusterPlugins"), (Action) any());
                verify(configurationMock2, atLeast(1)).getDependencies();
                verify(dependencySetMock2).stream();
                verify(projectMock, times(2)).findProject("return_of_getPath1");
                verify(projectMock5).getTasks();
                verify(taskContainerMock).named("bundlePlugin");
                verify(dependencyHandlerMock3).create(configurableFileCollectionMock);
                verify(projectMock).files(objectArray);
                verify(projectMock6).getAllprojects();
                verify(projectMock7).getPath();
                verify(projectMock7).getPlugins();
                verify(pluginContainerMock2).hasPlugin(PluginBuildPlugin.class);
                verify(configurationContainerMock3).create(eq("extractedPlugins"), (Action) any());
                verify(configurationMock3, atLeast(1)).extendsFrom(configurationArray);
                verify(configurationMock3, atLeast(1)).getName();
                verify(dependencyHandlerMock4).registerTransform(eq(UnzipTransform.class), (Action) any());
                verify(configurationContainerMock4).create(eq("featuresMetadataDeps"), (Action) any());
                verify(fileCollectionMock, atLeast(1)).getAsPath();
                verify(dependencyHandlerMock5).project(eq(stringStringMap3));
                verify(configurationContainerMock5).create(eq("defaultDistrofeaturesMetadataDeps"), (Action) any());
                verify(dependencyHandlerMock6).project(eq(stringStringMap4));
                verify(pluginManagerMock3).withPlugin(eq("elasticsearch.esplugin"), (Action) any());
                verify(projectMock, times(2)).getPath();
                verify(dependencyHandlerMock7).add("clusterPlugins", dependencyMock7);
                verify(projectMock8).getTasks();
                verify(taskContainerMock2).named("bundlePlugin");
                verify(dependencyHandlerMock8).create(configurableFileCollectionMock2);
                verify(projectMock).files(objectArray2);
                verify(projectMock).getTasks();
                verify(taskContainerMock3).withType(StandaloneRestIntegTestTask.class);
                verify(taskCollectionMock).configureEach((Action) any());
                verify(projectMock, times(3)).getObjects();
                verify(objectFactoryMock).fileCollection();
                verify(configurableFileCollectionMock3).from(objectArray3);
                verify(configurableFileCollectionMock4).getAsPath();
                verify(configurableFileCollectionMock4, times(2)).getAsFileTree();
                verify(fileTreeMock).filter((Spec) any());
                verify(fileTreeMock2).filter((Spec) any());
                verify(objectFactoryMock2).fileCollection();
                verify(configurableFileCollectionMock5).from(objectArray4);
                verify(configurableFileCollectionMock6).getAsPath();
                verify(objectFactoryMock3).fileCollection();
                verify(configurableFileCollectionMock7).from(objectArray5);
                verify(configurableFileCollectionMock8, times(2)).getAsFileTree();
                verify(fileTreeMock3).filter((Spec) any());
                verify(fileTreeMock4).filter((Spec) any());
                verify(providerFactoryMock, atLeast(6)).provider((Callable) any());
                buildParams.verify(() -> BuildParams.getBwcVersions(), atLeast(1));
                verify(bwcVersionsMock).getMinimumWireCompatibleVersion();
                distributionDownloadPlugin.verify(() -> DistributionDownloadPlugin.getContainer(projectMock), atLeast(2));
                verify(namedDomainObjectContainerMock).findByName("default_distro");
                verify(namedDomainObjectContainerMock).create(eq("default_distro"), (Action) any());
                verify(namedDomainObjectContainerMock2).findByName("integ_test_distro");
                verify(namedDomainObjectContainerMock2).create(eq("integ_test_distro"), (Action) any());
                verify(elasticsearchDistributionMock2, atLeast(3)).getExtracted();
                verify(configurableFileCollectionMock9, times(2)).getAsFileTree();
                verify(fileTreeMock5).matching((Action) any());
                verify(fileTreeMock7).matching((Action) any());
                verify(configurableFileCollectionMock9).getSingleFile();
                verify(elasticsearchDistributionMock2, atLeast(2)).getName();
                gradleUtils.verify(() -> GradleUtils.isModuleProject("GL"), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.isModuleProject(""), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.isModuleProject("AN"), atLeast(1));
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(2));
            });
        }
    }

    //Sapient generated method id: ${applyWhenGradleUtilsNotIsModuleProjectProjectGetPathAndFGetNameEndsWith_jarNotEqualsFalseAndDefaultBranch11}, hash: 5E2BABF0AF46821A062C6E13259DC767
    @Test()
    void applyWhenGradleUtilsNotIsModuleProjectProjectGetPathAndFGetNameEndsWith_jarNotEqualsFalseAndDefaultBranch11() throws InvalidUserDataException, UnknownDomainObjectException, IllegalStateException, UnknownTaskException {
        /* Branches:
         * (maybeDistro == null) : true  #  inside createDistribution method
         * (type != null) : false  #  inside lambda$createDistribution$14 method
         * (useExploded) : true  #  inside lambda$createPluginConfiguration$31 method
         * (isExtended == false) : true  #  inside lambda$createPluginConfiguration$31 method
         * (iterator.hasNext()) : true  #  inside lambda$createPluginConfiguration$30 method
         * (dependency instanceof ProjectDependency projectDependency) : true  #  inside lambda$createPluginConfiguration$30 method
         * (projectDependency.getTargetConfiguration() == null) : true  #  inside lambda$createPluginConfiguration$30 method
         * (useExploded) : true  #  inside lambda$createPluginConfiguration$30 method
         * (for-each(extendedPlugins)) : true  #  inside lambda$createPluginConfiguration$30 method
         * (branch expression (line 308)) : true
         * (branch expression (line 309)) : true
         * (branch expression (line 310)) : true
         * (useExploded) : true  #  inside lambda$createPluginConfiguration$29 method
         * (GradleUtils.isModuleProject(project.getPath())) : false  #  inside lambda$apply$7 method
         * (f.getName().endsWith(".jar") == false) : false  #  inside lambda$registerConfigurationInputs$15 method
         * (branch expression (line 287)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class);
            MockedStatic<DistributionDownloadPlugin> distributionDownloadPlugin = mockStatic(DistributionDownloadPlugin.class);
            MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            doNothing().when(pluginManagerMock).apply(ElasticsearchJavaPlugin.class);
            doNothing().when(pluginManagerMock2).apply(InternalDistributionDownloadPlugin.class);
            doReturn(configurationMock).when(configurationContainerMock).create(eq("clusterModules"), (Action) any());
            doReturn(dependencySetMock).when(configurationMock).getDependencies();
            Stream stream = Stream.empty();
            doReturn(stream).when(dependencySetMock).stream();
            doReturn("CD").when(configurationMock).getName();
            Map<String, String> stringStringMap = new HashMap<>(Map.ofEntries(entry("path", "return_of_getPath1"), entry("configuration", "explodedBundleZip")));
            doReturn(dependencyMock).when(dependencyHandlerMock).project(eq(stringStringMap));
            Set<Project> projectSet = new HashSet<>();
            projectSet.add(projectMock3);
            doReturn(projectSet).when(projectMock2).getAllprojects();
            doReturn(pluginContainerMock).when(projectMock3).getPlugins();
            doReturn(true).when(pluginContainerMock).hasPlugin(PluginBuildPlugin.class);
            doReturn(extensionContainerMock).when(projectMock3).getExtensions();
            PluginPropertiesExtension pluginPropertiesExtension = new PluginPropertiesExtension(projectMock4);
            pluginPropertiesExtension.setName("TM");
            doReturn(pluginPropertiesExtension).when(extensionContainerMock).getByType(PluginPropertiesExtension.class);
            doReturn("GL", "return_of_getPath1").when(projectMock3).getPath();
            Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("path", "return_of_getPath1"), entry("configuration", "explodedBundleZip")));
            doReturn(dependencyMock2).when(dependencyHandlerMock2).project(eq(stringStringMap2));
            doReturn(configurationMock2).when(configurationContainerMock2).create(eq("clusterPlugins"), (Action) any());
            doReturn(dependencySetMock2).when(configurationMock2).getDependencies();
            Stream stream2 = Stream.empty();
            doReturn(stream2).when(dependencySetMock2).stream();
            doReturn(taskContainerMock).when(projectMock5).getTasks();
            doReturn(taskProviderMock).when(taskContainerMock).named("bundlePlugin");
            doReturn(dependencyMock3).when(dependencyHandlerMock3).create(configurableFileCollectionMock);
            Object[] objectArray = new Object[] { taskProviderMock };
            doReturn(configurableFileCollectionMock).when(projectMock).files(objectArray);
            doReturn(projectMock2, projectMock6).when(projectMock).getRootProject();
            Set<Project> projectSet2 = new HashSet<>();
            projectSet2.add(projectMock7);
            doReturn(projectSet2).when(projectMock6).getAllprojects();
            doReturn("").when(projectMock7).getPath();
            doReturn(configurationMock3).when(configurationContainerMock3).create(eq("extractedPlugins"), (Action) any());
            Configuration[] configurationArray = new Configuration[] { configurationMock2 };
            doReturn(configurationMock4).when(configurationMock3).extendsFrom(configurationArray);
            doReturn("FP").when(configurationMock3).getName();
            doNothing().when(dependencyHandlerMock4).registerTransform(eq(UnzipTransform.class), (Action) any());
            doReturn(fileCollectionMock).when(configurationContainerMock4).create(eq("featuresMetadataDeps"), (Action) any());
            doReturn("return_of_getAsPath1").when(fileCollectionMock).getAsPath();
            Map<String, String> stringStringMap3 = new HashMap<>(Map.ofEntries(entry("path", ":server")));
            doReturn(dependencyMock4).when(dependencyHandlerMock5).project(eq(stringStringMap3));
            doReturn(configurationContainerMock, configurationContainerMock2, configurationContainerMock3, configurationContainerMock4, configurationContainerMock5).when(projectMock).getConfigurations();
            doReturn(fileCollectionMock2).when(configurationContainerMock5).create(eq("defaultDistrofeaturesMetadataDeps"), (Action) any());
            Map<String, String> stringStringMap4 = new HashMap<>(Map.ofEntries(entry("path", ":distribution"), entry("configuration", "featuresMetadata")));
            doReturn(dependencyMock5).when(dependencyHandlerMock6).project(eq(stringStringMap4));
            doReturn(pluginManagerMock, pluginManagerMock2, pluginManagerMock3).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock3).withPlugin(eq("elasticsearch.esplugin"), (Action) any());
            doReturn(dependencyMock6).when(dependencyHandlerMock7).add("clusterPlugins", dependencyMock7);
            doReturn("AN", "return_of_getPath1").when(projectMock).getPath();
            doReturn(projectMock5, projectMock8).when(projectMock).findProject("return_of_getPath1");
            doReturn(taskContainerMock2).when(projectMock8).getTasks();
            doReturn(taskProviderMock2).when(taskContainerMock2).named("bundlePlugin");
            doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3, dependencyHandlerMock4, dependencyHandlerMock5, dependencyHandlerMock6, dependencyHandlerMock7, dependencyHandlerMock8).when(projectMock).getDependencies();
            doReturn(dependencyMock7).when(dependencyHandlerMock8).create(configurableFileCollectionMock2);
            Object[] objectArray2 = new Object[] { taskProviderMock2 };
            doReturn(configurableFileCollectionMock2).when(projectMock).files(objectArray2);
            doReturn(taskContainerMock3).when(projectMock).getTasks();
            doReturn(taskCollectionMock).when(taskContainerMock3).withType(StandaloneRestIntegTestTask.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            doReturn(configurableFileCollectionMock3).when(objectFactoryMock).fileCollection();
            Object[] objectArray3 = new Object[] { configurationMock };
            doReturn(configurableFileCollectionMock4).when(configurableFileCollectionMock3).from(objectArray3);
            doReturn("return_of_getAsPath1").when(configurableFileCollectionMock4).getAsPath();
            doReturn(fileCollectionMock3).when(fileTreeMock).filter((Spec) any());
            doReturn(fileTreeMock, fileTreeMock2).when(configurableFileCollectionMock4).getAsFileTree();
            doReturn(fileCollectionMock4).when(fileTreeMock2).filter((Spec) any());
            doReturn(configurableFileCollectionMock5).when(objectFactoryMock2).fileCollection();
            Object[] objectArray4 = new Object[] { configurationMock2 };
            doReturn(configurableFileCollectionMock6).when(configurableFileCollectionMock5).from(objectArray4);
            doReturn("return_of_getAsPath1").when(configurableFileCollectionMock6).getAsPath();
            doReturn(objectFactoryMock, objectFactoryMock2, objectFactoryMock3).when(projectMock).getObjects();
            doReturn(configurableFileCollectionMock7).when(objectFactoryMock3).fileCollection();
            Object[] objectArray5 = new Object[] { configurationMock3 };
            doReturn(configurableFileCollectionMock8).when(configurableFileCollectionMock7).from(objectArray5);
            doReturn(fileCollectionMock5).when(fileTreeMock3).filter((Spec) any());
            doReturn(fileTreeMock3, fileTreeMock4).when(configurableFileCollectionMock8).getAsFileTree();
            doReturn(fileCollectionMock6).when(fileTreeMock4).filter((Spec) any());
            doReturn(providerMock, providerMock2, providerMock3, providerMock4, providerMock5, providerMock6).when(providerFactoryMock).provider((Callable) any());
            buildParams.when(() -> BuildParams.getBwcVersions()).thenReturn(bwcVersionsMock);
            doReturn(versionMock).when(bwcVersionsMock).getMinimumWireCompatibleVersion();
            doReturn(null).when(namedDomainObjectContainerMock).findByName("default_distro");
            doReturn(elasticsearchDistributionMock).when(namedDomainObjectContainerMock).create(eq("default_distro"), (Action) any());
            distributionDownloadPlugin.when(() -> DistributionDownloadPlugin.getContainer(projectMock)).thenReturn(namedDomainObjectContainerMock).thenReturn(namedDomainObjectContainerMock2);
            doReturn(null).when(namedDomainObjectContainerMock2).findByName("integ_test_distro");
            doReturn(elasticsearchDistributionMock2).when(namedDomainObjectContainerMock2).create(eq("integ_test_distro"), (Action) any());
            doReturn(configurableFileCollectionMock9).when(elasticsearchDistributionMock2).getExtracted();
            doReturn(fileTreeMock6).when(fileTreeMock5).matching((Action) any());
            doReturn(fileTreeMock5, fileTreeMock7).when(configurableFileCollectionMock9).getAsFileTree();
            doReturn(fileTreeMock8).when(fileTreeMock7).matching((Action) any());
            File file = new File("pathname1");
            doReturn(file).when(configurableFileCollectionMock9).getSingleFile();
            doReturn("BO").when(elasticsearchDistributionMock2).getName();
            gradleUtils.when(() -> GradleUtils.isModuleProject("GL")).thenReturn(true);
            gradleUtils.when(() -> GradleUtils.isModuleProject("")).thenReturn(false);
            gradleUtils.when(() -> GradleUtils.isModuleProject("AN")).thenReturn(false);
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            RestTestBasePlugin target = new RestTestBasePlugin(providerFactoryMock);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(3)).getPluginManager();
                verify(pluginManagerMock).apply(ElasticsearchJavaPlugin.class);
                verify(pluginManagerMock2).apply(InternalDistributionDownloadPlugin.class);
                verify(projectMock, times(5)).getConfigurations();
                verify(configurationContainerMock).create(eq("clusterModules"), (Action) any());
                verify(configurationMock, atLeast(1)).getDependencies();
                verify(dependencySetMock).stream();
                verify(configurationMock, atLeast(1)).getName();
                verify(projectMock, times(8)).getDependencies();
                verify(dependencyHandlerMock).project(eq(stringStringMap));
                verify(projectMock, times(2)).getRootProject();
                verify(projectMock2).getAllprojects();
                verify(projectMock3, times(2)).getPath();
                verify(projectMock3).getPlugins();
                verify(pluginContainerMock).hasPlugin(PluginBuildPlugin.class);
                verify(projectMock3).getExtensions();
                verify(extensionContainerMock).getByType(PluginPropertiesExtension.class);
                verify(dependencyHandlerMock2).project(eq(stringStringMap2));
                verify(configurationContainerMock2).create(eq("clusterPlugins"), (Action) any());
                verify(configurationMock2, atLeast(1)).getDependencies();
                verify(dependencySetMock2).stream();
                verify(projectMock, times(2)).findProject("return_of_getPath1");
                verify(projectMock5).getTasks();
                verify(taskContainerMock).named("bundlePlugin");
                verify(dependencyHandlerMock3).create(configurableFileCollectionMock);
                verify(projectMock).files(objectArray);
                verify(projectMock6).getAllprojects();
                verify(projectMock7).getPath();
                verify(configurationContainerMock3).create(eq("extractedPlugins"), (Action) any());
                verify(configurationMock3, atLeast(1)).extendsFrom(configurationArray);
                verify(configurationMock3, atLeast(1)).getName();
                verify(dependencyHandlerMock4).registerTransform(eq(UnzipTransform.class), (Action) any());
                verify(configurationContainerMock4).create(eq("featuresMetadataDeps"), (Action) any());
                verify(fileCollectionMock, atLeast(1)).getAsPath();
                verify(dependencyHandlerMock5).project(eq(stringStringMap3));
                verify(configurationContainerMock5).create(eq("defaultDistrofeaturesMetadataDeps"), (Action) any());
                verify(dependencyHandlerMock6).project(eq(stringStringMap4));
                verify(pluginManagerMock3).withPlugin(eq("elasticsearch.esplugin"), (Action) any());
                verify(projectMock, times(2)).getPath();
                verify(dependencyHandlerMock7).add("clusterPlugins", dependencyMock7);
                verify(projectMock8).getTasks();
                verify(taskContainerMock2).named("bundlePlugin");
                verify(dependencyHandlerMock8).create(configurableFileCollectionMock2);
                verify(projectMock).files(objectArray2);
                verify(projectMock).getTasks();
                verify(taskContainerMock3).withType(StandaloneRestIntegTestTask.class);
                verify(taskCollectionMock).configureEach((Action) any());
                verify(projectMock, times(3)).getObjects();
                verify(objectFactoryMock).fileCollection();
                verify(configurableFileCollectionMock3).from(objectArray3);
                verify(configurableFileCollectionMock4).getAsPath();
                verify(configurableFileCollectionMock4, times(2)).getAsFileTree();
                verify(fileTreeMock).filter((Spec) any());
                verify(fileTreeMock2).filter((Spec) any());
                verify(objectFactoryMock2).fileCollection();
                verify(configurableFileCollectionMock5).from(objectArray4);
                verify(configurableFileCollectionMock6).getAsPath();
                verify(objectFactoryMock3).fileCollection();
                verify(configurableFileCollectionMock7).from(objectArray5);
                verify(configurableFileCollectionMock8, times(2)).getAsFileTree();
                verify(fileTreeMock3).filter((Spec) any());
                verify(fileTreeMock4).filter((Spec) any());
                verify(providerFactoryMock, atLeast(6)).provider((Callable) any());
                buildParams.verify(() -> BuildParams.getBwcVersions(), atLeast(1));
                verify(bwcVersionsMock).getMinimumWireCompatibleVersion();
                distributionDownloadPlugin.verify(() -> DistributionDownloadPlugin.getContainer(projectMock), atLeast(2));
                verify(namedDomainObjectContainerMock).findByName("default_distro");
                verify(namedDomainObjectContainerMock).create(eq("default_distro"), (Action) any());
                verify(namedDomainObjectContainerMock2).findByName("integ_test_distro");
                verify(namedDomainObjectContainerMock2).create(eq("integ_test_distro"), (Action) any());
                verify(elasticsearchDistributionMock2, atLeast(3)).getExtracted();
                verify(configurableFileCollectionMock9, times(2)).getAsFileTree();
                verify(fileTreeMock5).matching((Action) any());
                verify(fileTreeMock7).matching((Action) any());
                verify(configurableFileCollectionMock9).getSingleFile();
                verify(elasticsearchDistributionMock2, atLeast(2)).getName();
                gradleUtils.verify(() -> GradleUtils.isModuleProject("GL"), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.isModuleProject(""), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.isModuleProject("AN"), atLeast(1));
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(2));
            });
        }
    }
}

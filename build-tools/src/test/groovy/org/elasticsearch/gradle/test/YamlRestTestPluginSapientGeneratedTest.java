package org.elasticsearch.gradle.test;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.artifacts.UnknownConfigurationException;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.UnknownTaskException;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.artifacts.type.ArtifactTypeDefinition;
import org.gradle.api.attributes.AttributesSchema;
import org.gradle.api.Transformer;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.artifacts.Dependency;
import org.gradle.api.attributes.AttributeContainer;
import org.gradle.api.provider.Provider;
import org.elasticsearch.gradle.util.GradleUtils;
import org.gradle.api.attributes.Attribute;
import org.elasticsearch.gradle.testclusters.ElasticsearchCluster;
import org.gradle.api.plugins.JavaBasePlugin;
import org.elasticsearch.gradle.testclusters.TestClustersPlugin;
import org.gradle.api.tasks.Copy;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.tasks.SourceSetContainer;
import org.elasticsearch.gradle.transform.UnzipTransform;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.tasks.SourceSetOutput;
import org.gradle.api.plugins.ExtensionContainer;
import org.elasticsearch.gradle.VersionProperties;
import org.elasticsearch.gradle.plugin.BasePluginBuildPlugin;
import org.gradle.api.tasks.bundling.Zip;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.gradle.api.file.FileCollection;
import org.gradle.api.attributes.AttributeMatchingStrategy;
import org.gradle.api.Project;
import org.gradle.api.artifacts.type.ArtifactTypeContainer;
import org.gradle.api.DomainObjectCollection;
import org.gradle.api.tasks.TaskCollection;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.mockito.MockedStatic;
import java.io.File;
import org.gradle.api.NamedDomainObjectProvider;
import org.gradle.api.tasks.Sync;
import org.elasticsearch.gradle.testclusters.StandaloneRestIntegTestTask;
import org.gradle.api.plugins.PluginManager;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class YamlRestTestPluginSapientGeneratedTest {

    private final ArtifactTypeContainer artifactTypeContainerMock = mock(ArtifactTypeContainer.class);

    private final AttributeContainer attributeContainerMock = mock(AttributeContainer.class);

    private final AttributeContainer attributeContainerMock2 = mock(AttributeContainer.class);

    private final AttributeContainer attributeContainerMock3 = mock(AttributeContainer.class);

    private final AttributeContainer attributeContainerMock4 = mock(AttributeContainer.class);

    private final AttributeMatchingStrategy attributeMatchingStrategyMock = mock(AttributeMatchingStrategy.class);

    private final AttributesSchema attributesSchemaMock = mock(AttributesSchema.class);

    private final ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);

    private final Configuration configurationMock = mock(Configuration.class);

    private final Configuration configurationMock2 = mock(Configuration.class);

    private final Configuration configurationMock3 = mock(Configuration.class);

    private final Configuration configurationMock4 = mock(Configuration.class);

    private final DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);

    private final DependencyHandler dependencyHandlerMock2 = mock(DependencyHandler.class);

    private final DependencyHandler dependencyHandlerMock3 = mock(DependencyHandler.class);

    private final DependencyHandler dependencyHandlerMock4 = mock(DependencyHandler.class);

    private final Dependency dependencyMock = mock(Dependency.class);

    private final Dependency dependencyMock2 = mock(Dependency.class);

    private final DomainObjectCollection domainObjectCollectionMock = mock(DomainObjectCollection.class);

    private final ElasticsearchCluster elasticsearchClusterMock = mock(ElasticsearchCluster.class);

    private final ElasticsearchCluster elasticsearchClusterMock2 = mock(ElasticsearchCluster.class);

    private final ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);

    private final ExtensionContainer extensionContainerMock2 = mock(ExtensionContainer.class);

    private final FileCollection fileCollectionMock = mock(FileCollection.class);

    private final FileCollection fileCollectionMock2 = mock(FileCollection.class);

    private final NamedDomainObjectContainer namedDomainObjectContainerMock = mock(NamedDomainObjectContainer.class);

    private final NamedDomainObjectProvider<ElasticsearchCluster> namedDomainObjectProviderMock = mock(NamedDomainObjectProvider.class);

    private final PluginContainer pluginContainerMock = mock(PluginContainer.class);

    private final PluginManager pluginManagerMock = mock(PluginManager.class);

    private final PluginManager pluginManagerMock2 = mock(PluginManager.class);

    private final PluginManager pluginManagerMock3 = mock(PluginManager.class);

    private final Project projectMock = mock(Project.class);

    private final Provider providerMock = mock(Provider.class);

    private final SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);

    private final SourceSet sourceSetMock = mock(SourceSet.class);

    private final SourceSetOutput sourceSetOutputMock = mock(SourceSetOutput.class);

    private final SourceSetOutput sourceSetOutputMock2 = mock(SourceSetOutput.class);

    private final TaskCollection taskCollectionMock = mock(TaskCollection.class);

    private final TaskContainer taskContainerMock = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock2 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock3 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock4 = mock(TaskContainer.class);

    private final TaskProvider<Copy> taskProviderMock = mock(TaskProvider.class);

    private final TaskProvider<StandaloneRestIntegTestTask> taskProviderMock2 = mock(TaskProvider.class);

    private final TaskProvider taskProviderMock4 = mock(TaskProvider.class);

    //Sapient generated method id: ${applyWhenGradleUtilsIsModuleProjectProjectGetPath}, hash: 23655D958D87E207831A4366CCDF2E21
    @Disabled()
    @Test()
    void applyWhenGradleUtilsIsModuleProjectProjectGetPath() throws InvalidUserDataException, UnknownConfigurationException, UnknownDomainObjectException, UnknownTaskException {
        /* Branches:
         * (GradleUtils.isModuleProject(project.getPath())) : true  #  inside lambda$apply$4 method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.File
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TaskProvider<Sync> taskProviderMock3 = mock(TaskProvider.class);
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            doNothing().when(pluginManagerMock).apply(GradleTestPolicySetupPlugin.class);
            doNothing().when(pluginManagerMock2).apply(TestClustersPlugin.class);
            doReturn(pluginManagerMock, pluginManagerMock2, pluginManagerMock3).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock3).apply(JavaBasePlugin.class);
            doReturn(attributesSchemaMock).when(dependencyHandlerMock).getAttributesSchema();
            doReturn(attributeMatchingStrategyMock).when(attributesSchemaMock).attribute((Attribute) any());
            doReturn(artifactTypeContainerMock).when(dependencyHandlerMock2).getArtifactTypes();
            Object object = new Object();
            doReturn(object).when(artifactTypeContainerMock).maybeCreate("jar");
            doNothing().when(dependencyHandlerMock3).registerTransform(eq(UnzipTransform.class), (Action) any());
            doReturn(configurationContainerMock).when(projectMock).getConfigurations();
            doReturn(configurationMock).when(configurationContainerMock).create("restTestSpecs");
            Attribute attribute = ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE;
            doReturn(attributeContainerMock2).when(attributeContainerMock).attribute(attribute, "directory");
            doReturn(attributeContainerMock, attributeContainerMock3).when(configurationMock).getAttributes();
            doReturn(attributeContainerMock4).when(attributeContainerMock3).attribute((Attribute) any(), eq(true));
            doReturn(configurationMock2).when(configurationMock).defaultDependencies((Action) any());
            doReturn(configurationMock3).when(configurationContainerMock).getByName("return_of_getImplementationConfigurationName1");
            doReturn(configurationMock4).when(configurationMock3).defaultDependencies((Action) any());
            doReturn(taskProviderMock).when(taskContainerMock).register(eq("copyRestTestSpecs"), eq(Copy.class), (Action) any());
            doReturn(providerMock).when(taskProviderMock).map((Transformer) any());
            File file = new File("pathname1");
            doReturn(file).when(projectMock).getBuildDir();
            doReturn(sourceSetContainerMock).when(extensionContainerMock).getByType(SourceSetContainer.class);
            doReturn(sourceSetMock).when(sourceSetContainerMock).maybeCreate("yamlRestTest");
            doNothing().when(sourceSetOutputMock).dir(providerMock);
            doReturn("return_of_getImplementationConfigurationName1").when(sourceSetMock).getImplementationConfigurationName();
            doReturn(sourceSetOutputMock, sourceSetOutputMock2).when(sourceSetMock).getOutput();
            doReturn(fileCollectionMock).when(sourceSetOutputMock2).getClassesDirs();
            doReturn(fileCollectionMock2).when(sourceSetMock).getRuntimeClasspath();
            doReturn(extensionContainerMock, extensionContainerMock2).when(projectMock).getExtensions();
            doReturn(namedDomainObjectContainerMock).when(extensionContainerMock2).getByName("testClusters");
            doReturn(namedDomainObjectProviderMock).when(namedDomainObjectContainerMock).register("yamlRestTest");
            doReturn(elasticsearchClusterMock, elasticsearchClusterMock2).when(namedDomainObjectProviderMock).get();
            doNothing().when(namedDomainObjectProviderMock).configure((Action) any());
            doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3, dependencyHandlerMock4).when(projectMock).getDependencies();
            doReturn(dependencyMock).when(dependencyHandlerMock4).create("org.elasticsearch.test:yaml-rest-runner:A");
            doReturn(dependencyMock2).when(dependencyHandlerMock4).create("org.elasticsearch:rest-api-spec:A");
            doReturn(taskProviderMock2).when(taskContainerMock2).register(eq("yamlRestTest"), eq(StandaloneRestIntegTestTask.class), (Action) any());
            doReturn(pluginContainerMock).when(projectMock).getPlugins();
            doReturn(domainObjectCollectionMock).when(pluginContainerMock).withType(eq(BasePluginBuildPlugin.class), (Action) any());
            doReturn("B").when(projectMock).getPath();
            doReturn(taskCollectionMock).when(taskContainerMock3).withType(Sync.class);
            doReturn(taskProviderMock3).when(taskCollectionMock).named("explodedBundlePlugin");
            doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3, taskContainerMock4).when(projectMock).getTasks();
            doReturn(taskProviderMock4).when(taskContainerMock4).named("check");
            doNothing().when(taskProviderMock4).configure((Action) any());
            gradleUtils.when(() -> GradleUtils.isModuleProject("B")).thenReturn(true);
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("A");
            YamlRestTestPlugin target = new YamlRestTestPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(3)).getPluginManager();
                verify(pluginManagerMock).apply(GradleTestPolicySetupPlugin.class);
                verify(pluginManagerMock2).apply(TestClustersPlugin.class);
                verify(pluginManagerMock3).apply(JavaBasePlugin.class);
                verify(projectMock, times(4)).getDependencies();
                verify(dependencyHandlerMock).getAttributesSchema();
                verify(attributesSchemaMock).attribute((Attribute) any());
                verify(dependencyHandlerMock2).getArtifactTypes();
                verify(artifactTypeContainerMock).maybeCreate("jar");
                verify(dependencyHandlerMock3).registerTransform(eq(UnzipTransform.class), (Action) any());
                verify(projectMock).getConfigurations();
                verify(configurationContainerMock).create("restTestSpecs");
                verify(configurationMock, times(2)).getAttributes();
                verify(attributeContainerMock).attribute(attribute, "directory");
                verify(attributeContainerMock3).attribute((Attribute) any(), eq(true));
                verify(configurationMock).defaultDependencies((Action) any());
                verify(configurationContainerMock).getByName("return_of_getImplementationConfigurationName1");
                verify(configurationMock3).defaultDependencies((Action) any());
                verify(projectMock, times(4)).getTasks();
                verify(taskContainerMock).register(eq("copyRestTestSpecs"), eq(Copy.class), (Action) any());
                verify(taskProviderMock).map((Transformer) any());
                verify(projectMock).getBuildDir();
                verify(projectMock, times(2)).getExtensions();
                verify(extensionContainerMock).getByType(SourceSetContainer.class);
                verify(sourceSetContainerMock).maybeCreate("yamlRestTest");
                verify(sourceSetMock, times(2)).getOutput();
                verify(sourceSetOutputMock).dir(providerMock);
                verify(sourceSetMock).getImplementationConfigurationName();
                verify(sourceSetOutputMock2).getClassesDirs();
                verify(sourceSetMock).getRuntimeClasspath();
                verify(extensionContainerMock2).getByName("testClusters");
                verify(namedDomainObjectContainerMock).register("yamlRestTest");
                verify(namedDomainObjectProviderMock, times(2)).get();
                verify(namedDomainObjectProviderMock).configure((Action) any());
                verify(dependencyHandlerMock4).create("org.elasticsearch.test:yaml-rest-runner:A");
                verify(dependencyHandlerMock4).create("org.elasticsearch:rest-api-spec:A");
                verify(taskContainerMock2).register(eq("yamlRestTest"), eq(StandaloneRestIntegTestTask.class), (Action) any());
                verify(projectMock).getPlugins();
                verify(pluginContainerMock).withType(eq(BasePluginBuildPlugin.class), (Action) any());
                verify(projectMock).getPath();
                verify(taskContainerMock3).withType(Sync.class);
                verify(taskCollectionMock).named("explodedBundlePlugin");
                verify(taskContainerMock4).named("check");
                verify(taskProviderMock4).configure((Action) any());
                gradleUtils.verify(() -> GradleUtils.isModuleProject("B"), atLeast(1));
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenGradleUtilsNotIsModuleProjectProjectGetPath}, hash: B4AE4BD58978BB82B3C54F0E183A5715
    @Disabled()
    @Test()
    void applyWhenGradleUtilsNotIsModuleProjectProjectGetPath() throws InvalidUserDataException, UnknownConfigurationException, UnknownDomainObjectException, UnknownTaskException {
        /* Branches:
         * (GradleUtils.isModuleProject(project.getPath())) : false  #  inside lambda$apply$4 method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.File
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        TaskProvider taskProviderMock3 = mock(TaskProvider.class);
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doNothing().when(pluginManagerMock).apply(GradleTestPolicySetupPlugin.class);
            doNothing().when(pluginManagerMock2).apply(TestClustersPlugin.class);
            doReturn(pluginManagerMock, pluginManagerMock2, pluginManagerMock3).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock3).apply(JavaBasePlugin.class);
            doReturn(attributesSchemaMock).when(dependencyHandlerMock).getAttributesSchema();
            doReturn(attributeMatchingStrategyMock).when(attributesSchemaMock).attribute((Attribute) any());
            doReturn(artifactTypeContainerMock).when(dependencyHandlerMock2).getArtifactTypes();
            Object object = new Object();
            doReturn(object).when(artifactTypeContainerMock).maybeCreate("jar");
            doNothing().when(dependencyHandlerMock3).registerTransform(eq(UnzipTransform.class), (Action) any());
            doReturn(configurationContainerMock).when(projectMock).getConfigurations();
            doReturn(configurationMock).when(configurationContainerMock).create("restTestSpecs");
            Attribute attribute = ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE;
            doReturn(attributeContainerMock2).when(attributeContainerMock).attribute(attribute, "directory");
            doReturn(attributeContainerMock, attributeContainerMock3).when(configurationMock).getAttributes();
            doReturn(attributeContainerMock4).when(attributeContainerMock3).attribute((Attribute) any(), eq(true));
            doReturn(configurationMock2).when(configurationMock).defaultDependencies((Action) any());
            doReturn(configurationMock3).when(configurationContainerMock).getByName("return_of_getImplementationConfigurationName1");
            doReturn(configurationMock4).when(configurationMock3).defaultDependencies((Action) any());
            doReturn(taskProviderMock).when(taskContainerMock).register(eq("copyRestTestSpecs"), eq(Copy.class), (Action) any());
            doReturn(providerMock).when(taskProviderMock).map((Transformer) any());
            File file = new File("pathname1");
            doReturn(file).when(projectMock).getBuildDir();
            doReturn(sourceSetContainerMock).when(extensionContainerMock).getByType(SourceSetContainer.class);
            doReturn(sourceSetMock).when(sourceSetContainerMock).maybeCreate("yamlRestTest");
            doNothing().when(sourceSetOutputMock).dir(providerMock);
            doReturn("return_of_getImplementationConfigurationName1").when(sourceSetMock).getImplementationConfigurationName();
            doReturn(sourceSetOutputMock, sourceSetOutputMock2).when(sourceSetMock).getOutput();
            doReturn(fileCollectionMock).when(sourceSetOutputMock2).getClassesDirs();
            doReturn(fileCollectionMock2).when(sourceSetMock).getRuntimeClasspath();
            doReturn(extensionContainerMock, extensionContainerMock2).when(projectMock).getExtensions();
            doReturn(namedDomainObjectContainerMock).when(extensionContainerMock2).getByName("testClusters");
            doReturn(namedDomainObjectProviderMock).when(namedDomainObjectContainerMock).register("yamlRestTest");
            doReturn(elasticsearchClusterMock, elasticsearchClusterMock2).when(namedDomainObjectProviderMock).get();
            doNothing().when(namedDomainObjectProviderMock).configure((Action) any());
            doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3, dependencyHandlerMock4).when(projectMock).getDependencies();
            doReturn(dependencyMock).when(dependencyHandlerMock4).create("org.elasticsearch.test:yaml-rest-runner:A");
            doReturn(dependencyMock2).when(dependencyHandlerMock4).create("org.elasticsearch:rest-api-spec:A");
            doReturn(taskProviderMock2).when(taskContainerMock2).register(eq("yamlRestTest"), eq(StandaloneRestIntegTestTask.class), (Action) any());
            doReturn(pluginContainerMock).when(projectMock).getPlugins();
            doReturn(domainObjectCollectionMock).when(pluginContainerMock).withType(eq(BasePluginBuildPlugin.class), (Action) any());
            doReturn("B").when(projectMock).getPath();
            doReturn(taskCollectionMock).when(taskContainerMock3).withType(Zip.class);
            doReturn(taskProviderMock3).when(taskCollectionMock).named("bundlePlugin");
            doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3, taskContainerMock4).when(projectMock).getTasks();
            doReturn(taskProviderMock4).when(taskContainerMock4).named("check");
            doNothing().when(taskProviderMock4).configure((Action) any());
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("A");
            YamlRestTestPlugin target = new YamlRestTestPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(3)).getPluginManager();
                verify(pluginManagerMock).apply(GradleTestPolicySetupPlugin.class);
                verify(pluginManagerMock2).apply(TestClustersPlugin.class);
                verify(pluginManagerMock3).apply(JavaBasePlugin.class);
                verify(projectMock, times(4)).getDependencies();
                verify(dependencyHandlerMock).getAttributesSchema();
                verify(attributesSchemaMock).attribute((Attribute) any());
                verify(dependencyHandlerMock2).getArtifactTypes();
                verify(artifactTypeContainerMock).maybeCreate("jar");
                verify(dependencyHandlerMock3).registerTransform(eq(UnzipTransform.class), (Action) any());
                verify(projectMock).getConfigurations();
                verify(configurationContainerMock).create("restTestSpecs");
                verify(configurationMock, times(2)).getAttributes();
                verify(attributeContainerMock).attribute(attribute, "directory");
                verify(attributeContainerMock3).attribute((Attribute) any(), eq(true));
                verify(configurationMock).defaultDependencies((Action) any());
                verify(configurationContainerMock).getByName("return_of_getImplementationConfigurationName1");
                verify(configurationMock3).defaultDependencies((Action) any());
                verify(projectMock, times(4)).getTasks();
                verify(taskContainerMock).register(eq("copyRestTestSpecs"), eq(Copy.class), (Action) any());
                verify(taskProviderMock).map((Transformer) any());
                verify(projectMock).getBuildDir();
                verify(projectMock, times(2)).getExtensions();
                verify(extensionContainerMock).getByType(SourceSetContainer.class);
                verify(sourceSetContainerMock).maybeCreate("yamlRestTest");
                verify(sourceSetMock, times(2)).getOutput();
                verify(sourceSetOutputMock).dir(providerMock);
                verify(sourceSetMock).getImplementationConfigurationName();
                verify(sourceSetOutputMock2).getClassesDirs();
                verify(sourceSetMock).getRuntimeClasspath();
                verify(extensionContainerMock2).getByName("testClusters");
                verify(namedDomainObjectContainerMock).register("yamlRestTest");
                verify(namedDomainObjectProviderMock, times(2)).get();
                verify(namedDomainObjectProviderMock).configure((Action) any());
                verify(dependencyHandlerMock4).create("org.elasticsearch.test:yaml-rest-runner:A");
                verify(dependencyHandlerMock4).create("org.elasticsearch:rest-api-spec:A");
                verify(taskContainerMock2).register(eq("yamlRestTest"), eq(StandaloneRestIntegTestTask.class), (Action) any());
                verify(projectMock).getPlugins();
                verify(pluginContainerMock).withType(eq(BasePluginBuildPlugin.class), (Action) any());
                verify(projectMock).getPath();
                verify(taskContainerMock3).withType(Zip.class);
                verify(taskCollectionMock).named("bundlePlugin");
                verify(taskContainerMock4).named("check");
                verify(taskProviderMock4).configure((Action) any());
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }
}

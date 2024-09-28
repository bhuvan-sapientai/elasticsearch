package org.elasticsearch.gradle.plugin;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.UnknownConfigurationException;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.UnknownTaskException;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.artifacts.type.ArtifactTypeDefinition;
import org.gradle.api.Transformer;
import org.gradle.api.attributes.AttributeContainer;
import org.elasticsearch.gradle.util.GradleUtils;
import org.gradle.api.attributes.Attribute;
import org.elasticsearch.gradle.testclusters.ElasticsearchCluster;
import java.util.concurrent.Callable;
import org.elasticsearch.gradle.testclusters.TestClustersPlugin;
import org.gradle.api.provider.ProviderFactory;
import java.util.HashMap;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.JavaVersion;
import org.gradle.api.tasks.SourceSetContainer;
import org.elasticsearch.gradle.testclusters.RunTask;
import java.util.ArrayList;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.tasks.SourceSetOutput;
import org.gradle.api.plugins.ExtensionContainer;
import org.elasticsearch.gradle.Version;
import org.gradle.api.tasks.bundling.Zip;
import org.gradle.api.tasks.TaskContainer;
import org.elasticsearch.gradle.jarhell.JarHellPlugin;
import org.gradle.api.Project;
import org.elasticsearch.gradle.test.GradleTestPolicySetupPlugin;
import java.io.File;
import org.gradle.api.artifacts.PublishArtifact;
import org.gradle.api.plugins.PluginManager;
import java.util.List;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.file.CopySpec;
import org.gradle.api.provider.Provider;
import org.gradle.api.plugins.JavaPlugin;
import java.util.Map;
import org.gradle.api.artifacts.dsl.ArtifactHandler;
import org.elasticsearch.gradle.dependencies.CompileOnlyResolvePlugin;
import org.elasticsearch.gradle.VersionProperties;
import org.gradle.api.Action;
import org.gradle.api.plugins.JavaPluginExtension;
import org.gradle.api.file.SourceDirectorySet;
import org.gradle.api.file.FileCollection;
import org.gradle.api.file.RegularFile;
import org.mockito.MockedStatic;
import org.gradle.api.file.FileTree;
import org.gradle.api.tasks.Sync;
import org.gradle.api.NamedDomainObjectProvider;
import static java.util.Map.entry;
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
class BasePluginBuildPluginSapientGeneratedTest {

    private final ProviderFactory providerFactoryMock = mock(ProviderFactory.class, "providerFactory");

    private final ArtifactHandler artifactHandlerMock = mock(ArtifactHandler.class);

    private final ArtifactHandler artifactHandlerMock2 = mock(ArtifactHandler.class);

    private final AttributeContainer attributeContainerMock = mock(AttributeContainer.class);

    private final AttributeContainer attributeContainerMock2 = mock(AttributeContainer.class);

    private final AttributeContainer attributeContainerMock3 = mock(AttributeContainer.class);

    private final AttributeContainer attributeContainerMock4 = mock(AttributeContainer.class);

    private final Callable callableMock = mock(Callable.class);

    private final ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);

    private final ConfigurationContainer configurationContainerMock2 = mock(ConfigurationContainer.class);

    private final ConfigurationContainer configurationContainerMock3 = mock(ConfigurationContainer.class);

    private final ConfigurationContainer configurationContainerMock4 = mock(ConfigurationContainer.class);

    private final ConfigurationContainer configurationContainerMock5 = mock(ConfigurationContainer.class);

    private final ConfigurationContainer configurationContainerMock6 = mock(ConfigurationContainer.class);

    private final Configuration configurationMock = mock(Configuration.class);

    private final Configuration configurationMock2 = mock(Configuration.class);

    private final Configuration configurationMock3 = mock(Configuration.class);

    private final Configuration configurationMock4 = mock(Configuration.class);

    private final Configuration configurationMock5 = mock(Configuration.class);

    private final Configuration configurationMock6 = mock(Configuration.class);

    private final Configuration configurationMock7 = mock(Configuration.class);

    private final CopySpec copySpecMock = mock(CopySpec.class);

    private final CopySpec copySpecMock2 = mock(CopySpec.class);

    private final CopySpec copySpecMock3 = mock(CopySpec.class);

    private final CopySpec copySpecMock4 = mock(CopySpec.class);

    private final CopySpec copySpecMock5 = mock(CopySpec.class);

    private final CopySpec copySpecMock6 = mock(CopySpec.class);

    private final CopySpec copySpecMock7 = mock(CopySpec.class);

    private final ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);

    private final ExtensionContainer extensionContainerMock2 = mock(ExtensionContainer.class);

    private final ExtensionContainer extensionContainerMock3 = mock(ExtensionContainer.class);

    private final ExtensionContainer extensionContainerMock4 = mock(ExtensionContainer.class);

    private final ExtensionContainer extensionContainerMock5 = mock(ExtensionContainer.class);

    private final FileCollection fileCollectionMock = mock(FileCollection.class);

    private final FileTree fileTreeMock = mock(FileTree.class);

    private final FileTree fileTreeMock2 = mock(FileTree.class);

    private final JavaPluginExtension javaPluginExtensionMock = mock(JavaPluginExtension.class);

    private final NamedDomainObjectContainer namedDomainObjectContainerMock = mock(NamedDomainObjectContainer.class);

    private final NamedDomainObjectProvider<ElasticsearchCluster> namedDomainObjectProviderMock = mock(NamedDomainObjectProvider.class);

    private final PluginManager pluginManagerMock = mock(PluginManager.class);

    private final PluginManager pluginManagerMock2 = mock(PluginManager.class);

    private final PluginManager pluginManagerMock3 = mock(PluginManager.class);

    private final PluginManager pluginManagerMock4 = mock(PluginManager.class);

    private final PluginManager pluginManagerMock5 = mock(PluginManager.class);

    private final PluginManager pluginManagerMock6 = mock(PluginManager.class);

    private final PluginManager pluginManagerMock7 = mock(PluginManager.class);

    private final PluginPropertiesExtension pluginPropertiesExtensionMock = mock(PluginPropertiesExtension.class);

    private final Project projectMock = mock(Project.class);

    private final Provider<RegularFile> providerMock = mock(Provider.class);

    private final Provider providerMock2 = mock(Provider.class);

    private final Provider providerMock3 = mock(Provider.class);

    private final Provider providerMock4 = mock(Provider.class);

    private final Provider providerMock5 = mock(Provider.class);

    private final Provider providerMock6 = mock(Provider.class);

    private final Provider providerMock7 = mock(Provider.class);

    private final Provider providerMock8 = mock(Provider.class);

    private final Provider providerMock9 = mock(Provider.class);

    private final PublishArtifact publishArtifactMock = mock(PublishArtifact.class);

    private final PublishArtifact publishArtifactMock2 = mock(PublishArtifact.class);

    private final SourceDirectorySet sourceDirectorySetMock = mock(SourceDirectorySet.class);

    private final SourceDirectorySet sourceDirectorySetMock2 = mock(SourceDirectorySet.class);

    private final SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);

    private final SourceSetContainer sourceSetContainerMock2 = mock(SourceSetContainer.class);

    private final SourceSet sourceSetMock = mock(SourceSet.class);

    private final SourceSet sourceSetMock2 = mock(SourceSet.class);

    private final SourceSetOutput sourceSetOutputMock = mock(SourceSetOutput.class);

    private final SourceSetOutput sourceSetOutputMock2 = mock(SourceSetOutput.class);

    private final TaskContainer taskContainerMock = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock2 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock3 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock4 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock5 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock6 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock7 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock8 = mock(TaskContainer.class);

    private final TaskProvider<GeneratePluginPropertiesTask> taskProviderMock = mock(TaskProvider.class);

    private final TaskProvider taskProviderMock2 = mock(TaskProvider.class);

    private final TaskProvider taskProviderMock3 = mock(TaskProvider.class);

    private final TaskProvider<Zip> taskProviderMock4 = mock(TaskProvider.class);

    private final TaskProvider taskProviderMock5 = mock(TaskProvider.class);

    private final TaskProvider<Sync> taskProviderMock6 = mock(TaskProvider.class);

    private final TaskProvider taskProviderMock7 = mock(TaskProvider.class);

    private final TaskProvider taskProviderMock8 = mock(TaskProvider.class);

    private final Version versionMock = mock(Version.class, "version2");

    //Sapient generated method id: ${applyWhenGradleUtilsIsModuleProjectProjectGetPath}, hash: 37ADF718FB98D491C463E01FAD67A176
    @Disabled()
    @Test()
    void applyWhenGradleUtilsIsModuleProjectProjectGetPath() throws UnknownConfigurationException, InvalidUserDataException, UnknownDomainObjectException, UnknownTaskException {
        /* Branches:
         * (project.getPluginManager().hasPlugin("com.github.johnrengelman.shadow")) : true  #  inside lambda$createBundleSpec$11 method
         * (GradleUtils.isModuleProject(project.getPath())) : true  #  inside lambda$apply$2 method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.File
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<Version> version = mockStatic(Version.class);
            MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            doNothing().when(pluginManagerMock).apply(JavaPlugin.class);
            doNothing().when(pluginManagerMock2).apply(TestClustersPlugin.class);
            doNothing().when(pluginManagerMock3).apply(CompileOnlyResolvePlugin.class);
            doNothing().when(pluginManagerMock4).apply(JarHellPlugin.class);
            doNothing().when(pluginManagerMock5).apply(GradleTestPolicySetupPlugin.class);
            Object[] objectArray = new Object[] { projectMock };
            doReturn(pluginPropertiesExtensionMock).when(extensionContainerMock).create("esplugin", PluginPropertiesExtension.class, objectArray);
            doReturn("return_of_getDescription1").when(pluginPropertiesExtensionMock).getDescription();
            doReturn("return_of_getVersion1").when(pluginPropertiesExtensionMock).getVersion();
            List<String> stringList = new ArrayList<>();
            doReturn(stringList).when(pluginPropertiesExtensionMock).getExtendedPlugins();
            doReturn(false).when(pluginPropertiesExtensionMock).isHasNativeController();
            doReturn(false).when(pluginPropertiesExtensionMock).isRequiresKeystore();
            doReturn(false).when(pluginPropertiesExtensionMock).isLicensed();
            doNothing().when(pluginPropertiesExtensionMock).setBundleSpec(copySpecMock);
            Object[] objectArray2 = new Object[] { taskProviderMock };
            doReturn(copySpecMock2).when(copySpecMock).from(objectArray2);
            File file = new File("pathname1");
            doReturn(copySpecMock3).when(copySpecMock).from(eq(file), (Action) any());
            Object[] objectArray3 = new Object[] { callableMock };
            doReturn(copySpecMock4).when(copySpecMock).from(objectArray3);
            Object[] objectArray4 = new Object[] { fileCollectionMock };
            doReturn(copySpecMock5).when(copySpecMock).from(objectArray4);
            Object[] objectArray5 = new Object[] { "src/main/packaging" };
            doReturn(copySpecMock6).when(copySpecMock).from(objectArray5);
            doReturn(copySpecMock7).when(copySpecMock).from(eq("src/main"), (Action) any());
            doReturn("return_of_getName1", "C").when(pluginPropertiesExtensionMock).getName();
            doReturn(file).when(projectMock).file("src/main/plugin-metadata");
            doReturn(taskProviderMock).when(taskContainerMock).register(eq("pluginProperties"), eq(GeneratePluginPropertiesTask.class), (Action) any());
            doReturn(javaPluginExtensionMock).when(extensionContainerMock2).getByType(JavaPluginExtension.class);
            doReturn(JavaVersion.VERSION_1_9).when(javaPluginExtensionMock).getTargetCompatibility();
            doReturn(sourceSetContainerMock).when(extensionContainerMock3).getByType(SourceSetContainer.class);
            doReturn(sourceSetMock).when(sourceSetContainerMock).getByName("main");
            doReturn(sourceSetOutputMock).when(sourceSetMock).getOutput();
            doReturn(fileTreeMock).when(sourceSetOutputMock).getAsFileTree();
            doReturn(fileTreeMock2).when(fileTreeMock).matching((Action) any());
            doReturn(sourceSetContainerMock2).when(extensionContainerMock4).getByType(SourceSetContainer.class);
            doReturn(sourceSetMock2).when(sourceSetContainerMock2).getByName("test");
            doReturn(sourceSetOutputMock2).when(sourceSetMock2).getOutput();
            Map<String, Object> stringObjectMap = new HashMap<>(Map.ofEntries(entry("builtBy", taskProviderMock)));
            doNothing().when(sourceSetOutputMock2).dir(eq(stringObjectMap), (File) any());
            doReturn(sourceDirectorySetMock).when(sourceSetMock2).getResources();
            doReturn(sourceDirectorySetMock2).when(sourceDirectorySetMock).srcDir(file);
            File file2 = new File("pathname1");
            doReturn(copySpecMock).when(projectMock).copySpec();
            doReturn(true).when(pluginManagerMock6).hasPlugin("com.github.johnrengelman.shadow");
            doReturn(taskProviderMock2).when(taskContainerMock2).named("shadowJar");
            doReturn(configurationMock).when(configurationContainerMock).getByName("runtimeClasspath");
            doReturn(fileCollectionMock).when(configurationMock).minus(configurationMock2);
            doReturn(configurationMock2).when(configurationContainerMock2).getByName("resolveableCompileOnly");
            doReturn(pluginManagerMock, pluginManagerMock2, pluginManagerMock3, pluginManagerMock4, pluginManagerMock5, pluginManagerMock6, pluginManagerMock7).when(projectMock).getPluginManager();
            doReturn(true).when(pluginManagerMock7).hasPlugin("com.github.johnrengelman.shadow");
            doReturn(taskProviderMock3).when(taskContainerMock3).named("shadowJar");
            doReturn(taskProviderMock4).when(taskContainerMock4).register(eq("bundlePlugin"), eq(Zip.class), (Action) any());
            doReturn(providerMock).when(taskProviderMock4).flatMap((Transformer) any());
            doReturn(taskProviderMock5).when(taskContainerMock5).named("assemble");
            doNothing().when(taskProviderMock5).configure((Action) any());
            doReturn(configurationMock3).when(configurationContainerMock3).create("zip");
            doReturn(attributeContainerMock).when(configurationMock3).getAttributes();
            Attribute attribute = ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE;
            doReturn(attributeContainerMock2).when(attributeContainerMock).attribute(attribute, "zip");
            doReturn(publishArtifactMock).when(artifactHandlerMock).add("zip", taskProviderMock4);
            doReturn(taskProviderMock6).when(taskContainerMock6).register(eq("explodedBundlePlugin"), eq(Sync.class), (Action) any());
            File file3 = new File("pathname1");
            doReturn(file2, file3).when(projectMock).getBuildDir();
            doReturn(configurationMock4).when(configurationContainerMock4).create("explodedBundleZip");
            doNothing().when(configurationMock4).setCanBeResolved(false);
            doNothing().when(configurationMock4).setCanBeConsumed(true);
            doReturn(attributeContainerMock3).when(configurationMock4).getAttributes();
            doReturn(attributeContainerMock4).when(attributeContainerMock3).attribute(attribute, "directory");
            doReturn(artifactHandlerMock, artifactHandlerMock2).when(projectMock).getArtifacts();
            doReturn(publishArtifactMock2).when(artifactHandlerMock2).add("explodedBundleZip", taskProviderMock6);
            doReturn(configurationMock5).when(configurationContainerMock5).getByName("default");
            Configuration[] configurationArray = new Configuration[] { configurationMock7 };
            doReturn(configurationMock6).when(configurationMock5).extendsFrom(configurationArray);
            doReturn(configurationContainerMock, configurationContainerMock2, configurationContainerMock3, configurationContainerMock4, configurationContainerMock5, configurationContainerMock6).when(projectMock).getConfigurations();
            doReturn(configurationMock7).when(configurationContainerMock6).getByName("runtimeClasspath");
            doReturn(extensionContainerMock, extensionContainerMock2, extensionContainerMock3, extensionContainerMock4, extensionContainerMock5).when(projectMock).getExtensions();
            doReturn(namedDomainObjectContainerMock).when(extensionContainerMock5).getByName("testClusters");
            doReturn(namedDomainObjectProviderMock).when(namedDomainObjectContainerMock).register(eq("runTask"), (Action) any());
            doReturn("D").when(projectMock).getPath();
            doReturn(taskProviderMock7).when(taskContainerMock7).register(eq("run"), eq(RunTask.class), (Action) any());
            doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3, taskContainerMock4, taskContainerMock5, taskContainerMock6, taskContainerMock7, taskContainerMock8).when(projectMock).getTasks();
            doReturn(taskProviderMock8).when(taskContainerMock8).named("bundlePlugin");
            doReturn(providerMock2, providerMock3, providerMock4, providerMock5, providerMock6, providerMock7, providerMock8, providerMock9).when(providerFactoryMock).provider((Callable) any());
            gradleUtils.when(() -> GradleUtils.isModuleProject("D")).thenReturn(true);
            version.when(() -> Version.fromString("return_of_getElasticsearch1")).thenReturn(versionMock);
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            BasePluginBuildPlugin target = new BasePluginBuildPlugin(providerFactoryMock);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(7)).getPluginManager();
                verify(pluginManagerMock).apply(JavaPlugin.class);
                verify(pluginManagerMock2).apply(TestClustersPlugin.class);
                verify(pluginManagerMock3).apply(CompileOnlyResolvePlugin.class);
                verify(pluginManagerMock4).apply(JarHellPlugin.class);
                verify(pluginManagerMock5).apply(GradleTestPolicySetupPlugin.class);
                verify(projectMock, times(5)).getExtensions();
                verify(extensionContainerMock).create("esplugin", PluginPropertiesExtension.class, objectArray);
                verify(pluginPropertiesExtensionMock, times(2)).getName();
                verify(pluginPropertiesExtensionMock).getDescription();
                verify(pluginPropertiesExtensionMock).getVersion();
                verify(pluginPropertiesExtensionMock).getExtendedPlugins();
                verify(pluginPropertiesExtensionMock).isHasNativeController();
                verify(pluginPropertiesExtensionMock).isRequiresKeystore();
                verify(pluginPropertiesExtensionMock).isLicensed();
                verify(pluginPropertiesExtensionMock).setBundleSpec(copySpecMock);
                verify(copySpecMock).from(objectArray2);
                verify(copySpecMock).from(eq(file), (Action) any());
                verify(copySpecMock).from(objectArray3);
                verify(copySpecMock).from(objectArray4);
                verify(copySpecMock).from(objectArray5);
                verify(copySpecMock).from(eq("src/main"), (Action) any());
                verify(projectMock).file("src/main/plugin-metadata");
                verify(projectMock, times(8)).getTasks();
                verify(taskContainerMock).register(eq("pluginProperties"), eq(GeneratePluginPropertiesTask.class), (Action) any());
                verify(extensionContainerMock2).getByType(JavaPluginExtension.class);
                verify(javaPluginExtensionMock).getTargetCompatibility();
                verify(extensionContainerMock3).getByType(SourceSetContainer.class);
                verify(sourceSetContainerMock).getByName("main");
                verify(sourceSetMock).getOutput();
                verify(sourceSetOutputMock).getAsFileTree();
                verify(fileTreeMock).matching((Action) any());
                verify(extensionContainerMock4).getByType(SourceSetContainer.class);
                verify(sourceSetContainerMock2).getByName("test");
                verify(sourceSetMock2).getOutput();
                verify(sourceSetOutputMock2).dir(eq(stringObjectMap), (File) any());
                verify(sourceSetMock2).getResources();
                verify(sourceDirectorySetMock).srcDir(file);
                verify(projectMock, times(2)).getBuildDir();
                verify(projectMock).copySpec();
                verify(pluginManagerMock6).hasPlugin("com.github.johnrengelman.shadow");
                verify(taskContainerMock2).named("shadowJar");
                verify(projectMock, times(6)).getConfigurations();
                verify(configurationContainerMock).getByName("runtimeClasspath");
                verify(configurationMock).minus(configurationMock2);
                verify(configurationContainerMock2).getByName("resolveableCompileOnly");
                verify(pluginManagerMock7).hasPlugin("com.github.johnrengelman.shadow");
                verify(taskContainerMock3).named("shadowJar");
                verify(taskContainerMock4).register(eq("bundlePlugin"), eq(Zip.class), (Action) any());
                verify(taskProviderMock4).flatMap((Transformer) any());
                verify(taskContainerMock5).named("assemble");
                verify(taskProviderMock5).configure((Action) any());
                verify(configurationContainerMock3).create("zip");
                verify(configurationMock3).getAttributes();
                verify(attributeContainerMock).attribute(attribute, "zip");
                verify(projectMock, times(2)).getArtifacts();
                verify(artifactHandlerMock).add("zip", taskProviderMock4);
                verify(taskContainerMock6).register(eq("explodedBundlePlugin"), eq(Sync.class), (Action) any());
                verify(configurationContainerMock4).create("explodedBundleZip");
                verify(configurationMock4).setCanBeResolved(false);
                verify(configurationMock4).setCanBeConsumed(true);
                verify(configurationMock4).getAttributes();
                verify(attributeContainerMock3).attribute(attribute, "directory");
                verify(artifactHandlerMock2).add("explodedBundleZip", taskProviderMock6);
                verify(configurationContainerMock5).getByName("default");
                verify(configurationMock5).extendsFrom(configurationArray);
                verify(configurationContainerMock6).getByName("runtimeClasspath");
                verify(extensionContainerMock5).getByName("testClusters");
                verify(namedDomainObjectContainerMock).register(eq("runTask"), (Action) any());
                verify(projectMock).getPath();
                verify(taskContainerMock7).register(eq("run"), eq(RunTask.class), (Action) any());
                verify(taskContainerMock8).named("bundlePlugin");
                verify(providerFactoryMock, atLeast(8)).provider((Callable) any());
                gradleUtils.verify(() -> GradleUtils.isModuleProject("D"), atLeast(1));
                version.verify(() -> Version.fromString("return_of_getElasticsearch1"), atLeast(1));
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenProjectGetPluginManagerNotHasPluginCom_github_johnrengelman_shadowAndGradleUtilsNotIsModuleProjectProjectGetPa}, hash: 702BECA421B6E0E71328CF341E26B220
    @Disabled()
    @Test()
    void applyWhenProjectGetPluginManagerNotHasPluginCom_github_johnrengelman_shadowAndGradleUtilsNotIsModuleProjectProjectGetPa() throws UnknownConfigurationException, InvalidUserDataException, UnknownDomainObjectException, UnknownTaskException {
        /* Branches:
         * (project.getPluginManager().hasPlugin("com.github.johnrengelman.shadow")) : false  #  inside lambda$createBundleSpec$11 method
         * (GradleUtils.isModuleProject(project.getPath())) : false  #  inside lambda$apply$2 method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.File
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<Version> version = mockStatic(Version.class)) {
            doNothing().when(pluginManagerMock).apply(JavaPlugin.class);
            doNothing().when(pluginManagerMock2).apply(TestClustersPlugin.class);
            doNothing().when(pluginManagerMock3).apply(CompileOnlyResolvePlugin.class);
            doNothing().when(pluginManagerMock4).apply(JarHellPlugin.class);
            doNothing().when(pluginManagerMock5).apply(GradleTestPolicySetupPlugin.class);
            Object[] objectArray = new Object[] { projectMock };
            doReturn(pluginPropertiesExtensionMock).when(extensionContainerMock).create("esplugin", PluginPropertiesExtension.class, objectArray);
            doReturn("return_of_getDescription1").when(pluginPropertiesExtensionMock).getDescription();
            doReturn("return_of_getVersion1").when(pluginPropertiesExtensionMock).getVersion();
            List<String> stringList = new ArrayList<>();
            doReturn(stringList).when(pluginPropertiesExtensionMock).getExtendedPlugins();
            doReturn(false).when(pluginPropertiesExtensionMock).isHasNativeController();
            doReturn(false).when(pluginPropertiesExtensionMock).isRequiresKeystore();
            doReturn(false).when(pluginPropertiesExtensionMock).isLicensed();
            doNothing().when(pluginPropertiesExtensionMock).setBundleSpec(copySpecMock);
            Object[] objectArray2 = new Object[] { taskProviderMock };
            doReturn(copySpecMock2).when(copySpecMock).from(objectArray2);
            File file = new File("pathname1");
            doReturn(copySpecMock3).when(copySpecMock).from(eq(file), (Action) any());
            Object[] objectArray3 = new Object[] { callableMock };
            doReturn(copySpecMock4).when(copySpecMock).from(objectArray3);
            Object[] objectArray4 = new Object[] { fileCollectionMock };
            doReturn(copySpecMock5).when(copySpecMock).from(objectArray4);
            Object[] objectArray5 = new Object[] { "src/main/packaging" };
            doReturn(copySpecMock6).when(copySpecMock).from(objectArray5);
            doReturn(copySpecMock7).when(copySpecMock).from(eq("src/main"), (Action) any());
            doReturn("return_of_getName1", "C").when(pluginPropertiesExtensionMock).getName();
            doReturn(file).when(projectMock).file("src/main/plugin-metadata");
            doReturn(taskProviderMock).when(taskContainerMock).register(eq("pluginProperties"), eq(GeneratePluginPropertiesTask.class), (Action) any());
            doReturn(javaPluginExtensionMock).when(extensionContainerMock2).getByType(JavaPluginExtension.class);
            doReturn(JavaVersion.VERSION_1_9).when(javaPluginExtensionMock).getTargetCompatibility();
            doReturn(sourceSetContainerMock).when(extensionContainerMock3).getByType(SourceSetContainer.class);
            doReturn(sourceSetMock).when(sourceSetContainerMock).getByName("main");
            doReturn(sourceSetOutputMock).when(sourceSetMock).getOutput();
            doReturn(fileTreeMock).when(sourceSetOutputMock).getAsFileTree();
            doReturn(fileTreeMock2).when(fileTreeMock).matching((Action) any());
            doReturn(sourceSetContainerMock2).when(extensionContainerMock4).getByType(SourceSetContainer.class);
            doReturn(sourceSetMock2).when(sourceSetContainerMock2).getByName("test");
            doReturn(sourceSetOutputMock2).when(sourceSetMock2).getOutput();
            Map<String, Object> stringObjectMap = new HashMap<>(Map.ofEntries(entry("builtBy", taskProviderMock)));
            doNothing().when(sourceSetOutputMock2).dir(eq(stringObjectMap), (File) any());
            doReturn(sourceDirectorySetMock).when(sourceSetMock2).getResources();
            doReturn(sourceDirectorySetMock2).when(sourceDirectorySetMock).srcDir(file);
            File file2 = new File("pathname1");
            doReturn(copySpecMock).when(projectMock).copySpec();
            doReturn(false).when(pluginManagerMock6).hasPlugin("com.github.johnrengelman.shadow");
            doReturn(taskProviderMock2).when(taskContainerMock2).named("jar");
            doReturn(configurationMock).when(configurationContainerMock).getByName("runtimeClasspath");
            doReturn(fileCollectionMock).when(configurationMock).minus(configurationMock2);
            doReturn(configurationMock2).when(configurationContainerMock2).getByName("resolveableCompileOnly");
            doReturn(pluginManagerMock, pluginManagerMock2, pluginManagerMock3, pluginManagerMock4, pluginManagerMock5, pluginManagerMock6, pluginManagerMock7).when(projectMock).getPluginManager();
            doReturn(false).when(pluginManagerMock7).hasPlugin("com.github.johnrengelman.shadow");
            doReturn(taskProviderMock3).when(taskContainerMock3).named("jar");
            doReturn(taskProviderMock4).when(taskContainerMock4).register(eq("bundlePlugin"), eq(Zip.class), (Action) any());
            doReturn(providerMock).when(taskProviderMock4).flatMap((Transformer) any());
            doReturn(taskProviderMock5).when(taskContainerMock5).named("assemble");
            doNothing().when(taskProviderMock5).configure((Action) any());
            doReturn(configurationMock3).when(configurationContainerMock3).create("zip");
            doReturn(attributeContainerMock).when(configurationMock3).getAttributes();
            Attribute attribute = ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE;
            doReturn(attributeContainerMock2).when(attributeContainerMock).attribute(attribute, "zip");
            doReturn(publishArtifactMock).when(artifactHandlerMock).add("zip", taskProviderMock4);
            doReturn(taskProviderMock6).when(taskContainerMock6).register(eq("explodedBundlePlugin"), eq(Sync.class), (Action) any());
            File file3 = new File("pathname1");
            doReturn(file2, file3).when(projectMock).getBuildDir();
            doReturn(configurationMock4).when(configurationContainerMock4).create("explodedBundleZip");
            doNothing().when(configurationMock4).setCanBeResolved(false);
            doNothing().when(configurationMock4).setCanBeConsumed(true);
            doReturn(attributeContainerMock3).when(configurationMock4).getAttributes();
            doReturn(attributeContainerMock4).when(attributeContainerMock3).attribute(attribute, "directory");
            doReturn(artifactHandlerMock, artifactHandlerMock2).when(projectMock).getArtifacts();
            doReturn(publishArtifactMock2).when(artifactHandlerMock2).add("explodedBundleZip", taskProviderMock6);
            doReturn(configurationMock5).when(configurationContainerMock5).getByName("default");
            Configuration[] configurationArray = new Configuration[] { configurationMock7 };
            doReturn(configurationMock6).when(configurationMock5).extendsFrom(configurationArray);
            doReturn(configurationContainerMock, configurationContainerMock2, configurationContainerMock3, configurationContainerMock4, configurationContainerMock5, configurationContainerMock6).when(projectMock).getConfigurations();
            doReturn(configurationMock7).when(configurationContainerMock6).getByName("runtimeClasspath");
            doReturn(extensionContainerMock, extensionContainerMock2, extensionContainerMock3, extensionContainerMock4, extensionContainerMock5).when(projectMock).getExtensions();
            doReturn(namedDomainObjectContainerMock).when(extensionContainerMock5).getByName("testClusters");
            doReturn(namedDomainObjectProviderMock).when(namedDomainObjectContainerMock).register(eq("runTask"), (Action) any());
            doReturn("D").when(projectMock).getPath();
            doReturn(taskProviderMock7).when(taskContainerMock7).register(eq("run"), eq(RunTask.class), (Action) any());
            doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3, taskContainerMock4, taskContainerMock5, taskContainerMock6, taskContainerMock7, taskContainerMock8).when(projectMock).getTasks();
            doReturn(taskProviderMock8).when(taskContainerMock8).named("bundlePlugin");
            doReturn(providerMock2, providerMock3, providerMock4, providerMock5, providerMock6, providerMock7, providerMock8, providerMock9).when(providerFactoryMock).provider((Callable) any());
            version.when(() -> Version.fromString("return_of_getElasticsearch1")).thenReturn(versionMock);
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            BasePluginBuildPlugin target = new BasePluginBuildPlugin(providerFactoryMock);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(7)).getPluginManager();
                verify(pluginManagerMock).apply(JavaPlugin.class);
                verify(pluginManagerMock2).apply(TestClustersPlugin.class);
                verify(pluginManagerMock3).apply(CompileOnlyResolvePlugin.class);
                verify(pluginManagerMock4).apply(JarHellPlugin.class);
                verify(pluginManagerMock5).apply(GradleTestPolicySetupPlugin.class);
                verify(projectMock, times(5)).getExtensions();
                verify(extensionContainerMock).create("esplugin", PluginPropertiesExtension.class, objectArray);
                verify(pluginPropertiesExtensionMock, times(2)).getName();
                verify(pluginPropertiesExtensionMock).getDescription();
                verify(pluginPropertiesExtensionMock).getVersion();
                verify(pluginPropertiesExtensionMock).getExtendedPlugins();
                verify(pluginPropertiesExtensionMock).isHasNativeController();
                verify(pluginPropertiesExtensionMock).isRequiresKeystore();
                verify(pluginPropertiesExtensionMock).isLicensed();
                verify(pluginPropertiesExtensionMock).setBundleSpec(copySpecMock);
                verify(copySpecMock).from(objectArray2);
                verify(copySpecMock).from(eq(file), (Action) any());
                verify(copySpecMock).from(objectArray3);
                verify(copySpecMock).from(objectArray4);
                verify(copySpecMock).from(objectArray5);
                verify(copySpecMock).from(eq("src/main"), (Action) any());
                verify(projectMock).file("src/main/plugin-metadata");
                verify(projectMock, times(8)).getTasks();
                verify(taskContainerMock).register(eq("pluginProperties"), eq(GeneratePluginPropertiesTask.class), (Action) any());
                verify(extensionContainerMock2).getByType(JavaPluginExtension.class);
                verify(javaPluginExtensionMock).getTargetCompatibility();
                verify(extensionContainerMock3).getByType(SourceSetContainer.class);
                verify(sourceSetContainerMock).getByName("main");
                verify(sourceSetMock).getOutput();
                verify(sourceSetOutputMock).getAsFileTree();
                verify(fileTreeMock).matching((Action) any());
                verify(extensionContainerMock4).getByType(SourceSetContainer.class);
                verify(sourceSetContainerMock2).getByName("test");
                verify(sourceSetMock2).getOutput();
                verify(sourceSetOutputMock2).dir(eq(stringObjectMap), (File) any());
                verify(sourceSetMock2).getResources();
                verify(sourceDirectorySetMock).srcDir(file);
                verify(projectMock, times(2)).getBuildDir();
                verify(projectMock).copySpec();
                verify(pluginManagerMock6).hasPlugin("com.github.johnrengelman.shadow");
                verify(taskContainerMock2).named("jar");
                verify(projectMock, times(6)).getConfigurations();
                verify(configurationContainerMock).getByName("runtimeClasspath");
                verify(configurationMock).minus(configurationMock2);
                verify(configurationContainerMock2).getByName("resolveableCompileOnly");
                verify(pluginManagerMock7).hasPlugin("com.github.johnrengelman.shadow");
                verify(taskContainerMock3).named("jar");
                verify(taskContainerMock4).register(eq("bundlePlugin"), eq(Zip.class), (Action) any());
                verify(taskProviderMock4).flatMap((Transformer) any());
                verify(taskContainerMock5).named("assemble");
                verify(taskProviderMock5).configure((Action) any());
                verify(configurationContainerMock3).create("zip");
                verify(configurationMock3).getAttributes();
                verify(attributeContainerMock).attribute(attribute, "zip");
                verify(projectMock, times(2)).getArtifacts();
                verify(artifactHandlerMock).add("zip", taskProviderMock4);
                verify(taskContainerMock6).register(eq("explodedBundlePlugin"), eq(Sync.class), (Action) any());
                verify(configurationContainerMock4).create("explodedBundleZip");
                verify(configurationMock4).setCanBeResolved(false);
                verify(configurationMock4).setCanBeConsumed(true);
                verify(configurationMock4).getAttributes();
                verify(attributeContainerMock3).attribute(attribute, "directory");
                verify(artifactHandlerMock2).add("explodedBundleZip", taskProviderMock6);
                verify(configurationContainerMock5).getByName("default");
                verify(configurationMock5).extendsFrom(configurationArray);
                verify(configurationContainerMock6).getByName("runtimeClasspath");
                verify(extensionContainerMock5).getByName("testClusters");
                verify(namedDomainObjectContainerMock).register(eq("runTask"), (Action) any());
                verify(projectMock).getPath();
                verify(taskContainerMock7).register(eq("run"), eq(RunTask.class), (Action) any());
                verify(taskContainerMock8).named("bundlePlugin");
                verify(providerFactoryMock, atLeast(8)).provider((Callable) any());
                version.verify(() -> Version.fromString("return_of_getElasticsearch1"), atLeast(1));
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }
}

package org.elasticsearch.gradle.internal;

// import org.elasticsearch.gradle.internal.ElasticsearchJavaBasePlugin;
// import org.elasticsearch.gradle.internal.conventions.precommit.PrecommitTaskPlugin;
// import org.gradle.api.tasks.compile.JavaCompile;
// import org.gradle.api.plugins.JavaPluginExtension;
// import org.gradle.api.plugins.PluginManager;
// import org.gradle.api.plugins.ExtraPropertiesExtension;
// import org.junit.jupiter.api.Test;
// import org.gradle.api.InvalidUserDataException;
// import org.gradle.api.Project;
// import org.gradle.api.tasks.SourceSetContainer;
// import org.gradle.api.Action;
// import static java.util.Map.entry;
// import org.gradle.api.artifacts.ConfigurationContainer;
// import org.gradle.api.JavaVersion;
// import org.gradle.api.NamedDomainObjectSet;
// import org.gradle.api.plugins.ExtensionContainer;
// import org.elasticsearch.gradle.internal.test.TestUtil;
// import org.gradle.api.plugins.JavaBasePlugin;
// import org.gradle.api.tasks.compile.GroovyCompile;
// import org.gradle.api.artifacts.dsl.DependencyHandler;
// import org.gradle.api.artifacts.Dependency;
// import org.mockito.MockedStatic;
// import org.elasticsearch.gradle.internal.info.GlobalBuildInfoPlugin;
// import static org.mockito.Mockito.*;
// import java.util.HashMap;
// import org.gradle.jvm.toolchain.JavaToolchainSpec;
// import java.util.Map;
// import org.gradle.normalization.RuntimeClasspathNormalization;
// import org.gradle.api.artifacts.Configuration;
// import org.elasticsearch.gradle.VersionProperties;
// import org.elasticsearch.gradle.internal.info.BuildParams;
// import org.gradle.api.tasks.TaskContainer;
// import org.gradle.api.tasks.TaskCollection;
// import org.gradle.api.tasks.testing.Test;
// import org.gradle.api.UnknownDomainObjectException;
// import org.gradle.normalization.InputNormalizationHandler;
// import org.mockito.stubbing.Answer;
// import org.elasticsearch.gradle.internal.test.MutedTestPlugin;
// import org.elasticsearch.gradle.util.GradleUtils;
// import org.gradle.jvm.toolchain.JavaCompiler;
// import org.gradle.jvm.toolchain.JavaToolchainService;
// import static org.junit.jupiter.api.Assertions.*;
// import org.gradle.jvm.toolchain.JavaLanguageVersion;
// import org.gradle.api.provider.Provider;
// import static org.mockito.ArgumentMatchers.any;

class ElasticsearchJavaBasePluginSapientGeneratedTest {

//     private final JavaToolchainService javaToolchainsMock = mock(JavaToolchainService.class);

//     private final Project projectMock = mock(Project.class);

//     @Test
//     void applyTest() throws InvalidUserDataException, UnknownDomainObjectException {
//         Project rootProjectMock = mock(Project.class);
//         PluginManager pluginManagerMock = mock(PluginManager.class);
//         ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
//         Configuration configurationMock = mock(Configuration.class);
//         ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
//         ExtraPropertiesExtension extraPropertiesMock = mock(ExtraPropertiesExtension.class);
//         TaskContainer taskContainerMock = mock(TaskContainer.class);
//         TaskCollection taskCollectionMock = mock(TaskCollection.class);
//         InputNormalizationHandler inputNormalizationHandlerMock = mock(InputNormalizationHandler.class);
//         RuntimeClasspathNormalization runtimeClasspathNormalizationMock = mock(RuntimeClasspathNormalization.class);
//         DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
//         when(projectMock.getRootProject()).thenReturn(rootProjectMock);
//         when(rootProjectMock.getPluginManager()).thenReturn(pluginManagerMock);
//         when(projectMock.getPluginManager()).thenReturn(pluginManagerMock);
//         when(projectMock.getConfigurations()).thenReturn(configurationContainerMock);
//         when(configurationContainerMock.create("nativeLibs")).thenReturn(configurationMock);
//         when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
//         when(extensionContainerMock.getExtraProperties()).thenReturn(extraPropertiesMock);
//         when(projectMock.getTasks()).thenReturn(taskContainerMock);
//         when(taskContainerMock.withType(Test.class)).thenReturn(taskCollectionMock);
//         when(projectMock.getNormalization()).thenReturn(inputNormalizationHandlerMock);
//         when(inputNormalizationHandlerMock.getRuntimeClasspath()).thenReturn(runtimeClasspathNormalizationMock);
//         when(projectMock.getDependencies()).thenReturn(dependencyHandlerMock);
//         try (MockedStatic<VersionProperties> versionPropertiesMock = mockStatic(VersionProperties.class);
//             MockedStatic<ElasticsearchJavaBasePlugin> elasticsearchJavaBasePluginMock = mockStatic(ElasticsearchJavaBasePlugin.class, CALLS_REAL_METHODS)) {
//             versionPropertiesMock.when(VersionProperties::getVersions).thenReturn(new HashMap<>());
//             elasticsearchJavaBasePluginMock.when(() -> ElasticsearchJavaBasePlugin.configureConfigurations(projectMock)).thenAnswer((Answer<Void>) invocation -> null);
//             ElasticsearchJavaBasePlugin plugin = spy(new ElasticsearchJavaBasePlugin(javaToolchainsMock));
//             doNothing().when(plugin).configureCompile(projectMock);
//             plugin.apply(projectMock);
//             verify(rootProjectMock.getPluginManager()).apply(GlobalBuildInfoPlugin.class);
//             verify(pluginManagerMock).apply(JavaBasePlugin.class);
//             verify(pluginManagerMock).apply(RepositoriesSetupPlugin.class);
//             verify(pluginManagerMock).apply(ElasticsearchTestBasePlugin.class);
//             verify(pluginManagerMock).apply(PrecommitTaskPlugin.class);
//             verify(pluginManagerMock).apply(MutedTestPlugin.class);
//             verify(runtimeClasspathNormalizationMock).ignore("META-INF/MANIFEST.MF");
//             verify(runtimeClasspathNormalizationMock).ignore("IMPL-JARS/**/META-INF/MANIFEST.MF");
//             verify(configurationContainerMock).create("nativeLibs");
//             verify(taskCollectionMock).configureEach(any());
//             verify(extraPropertiesMock).set(eq("versions"), any());
//             verify(plugin).configureCompile(projectMock);
//         }
//     }

//     @Test
//     void configureConfigurationsTest() {
//         SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
//         ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
//         ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
//         NamedDomainObjectSet namedDomainObjectSetMock = mock(NamedDomainObjectSet.class);
//         when(projectMock.getPath()).thenReturn("someNonMatchingPath");
//         when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
//         when(extensionContainerMock.getByType(SourceSetContainer.class)).thenReturn(sourceSetContainerMock);
//         when(projectMock.getConfigurations()).thenReturn(configurationContainerMock);
//         when(configurationContainerMock.matching(any())).thenReturn(namedDomainObjectSetMock);
//         try (MockedStatic<GradleUtils> gradleUtilsMock = mockStatic(GradleUtils.class)) {
//             ElasticsearchJavaBasePlugin.configureConfigurations(projectMock);
//             verify(configurationContainerMock).all(any());
//             verify(sourceSetContainerMock).all(any());
//             verify(namedDomainObjectSetMock).configureEach(any());
//         }
//     }

//     @Test
//     void configureCompileTest() throws UnknownDomainObjectException {
//         ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
//         ExtraPropertiesExtension extraPropertiesMock = mock(ExtraPropertiesExtension.class);
//         JavaPluginExtension javaPluginExtensionMock = mock(JavaPluginExtension.class);
//         TaskContainer taskContainerMock = mock(TaskContainer.class);
//         TaskCollection taskCollectionMock = mock(TaskCollection.class);
//         when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
//         when(extensionContainerMock.getExtraProperties()).thenReturn(extraPropertiesMock);
//         when(extensionContainerMock.getByType(JavaPluginExtension.class)).thenReturn(javaPluginExtensionMock);
//         when(projectMock.getTasks()).thenReturn(taskContainerMock);
//         when(taskContainerMock.withType(JavaCompile.class)).thenReturn(taskCollectionMock);
//         when(taskContainerMock.withType(GroovyCompile.class)).thenReturn(taskCollectionMock);
//         try (MockedStatic<BuildParams> buildParamsMock = mockStatic(BuildParams.class);
//             MockedStatic<JavaVersion> javaVersionMock = mockStatic(JavaVersion.class);
//             MockedStatic<JavaLanguageVersion> javaLanguageVersionMock = mockStatic(JavaLanguageVersion.class)) {
//             buildParamsMock.when(BuildParams::getJavaToolChainSpec).thenReturn(mock(Provider.class));
//             buildParamsMock.when(BuildParams::getMinimumRuntimeVersion).thenReturn(JavaVersion.VERSION_11);
//             buildParamsMock.when(BuildParams::isCi).thenReturn(false);
//             javaVersionMock.when(() -> JavaVersion.toVersion(anyString())).thenReturn(JavaVersion.VERSION_11);
//             javaLanguageVersionMock.when(() -> JavaLanguageVersion.of(anyString())).thenReturn(mock(JavaLanguageVersion.class));
//             ElasticsearchJavaBasePlugin plugin = new ElasticsearchJavaBasePlugin(javaToolchainsMock);
//             plugin.configureCompile(projectMock);
//             verify(extraPropertiesMock).set("compactProfile", "full");
//             verify(javaPluginExtensionMock).setSourceCompatibility(any(JavaVersion.class));
//             verify(javaPluginExtensionMock).setTargetCompatibility(any(JavaVersion.class));
//             verify(taskCollectionMock, times(2)).configureEach(any());
//         }
//     }

//     @Test
//     void configureInputNormalizationTest() {
//         InputNormalizationHandler inputNormalizationHandlerMock = mock(InputNormalizationHandler.class);
//         RuntimeClasspathNormalization runtimeClasspathNormalizationMock = mock(RuntimeClasspathNormalization.class);
//         when(projectMock.getNormalization()).thenReturn(inputNormalizationHandlerMock);
//         when(inputNormalizationHandlerMock.getRuntimeClasspath()).thenReturn(runtimeClasspathNormalizationMock);
//         ElasticsearchJavaBasePlugin.configureInputNormalization(projectMock);
//         verify(runtimeClasspathNormalizationMock).ignore("META-INF/MANIFEST.MF");
//         verify(runtimeClasspathNormalizationMock).ignore("IMPL-JARS/**/META-INF/MANIFEST.MF");
//     }
}
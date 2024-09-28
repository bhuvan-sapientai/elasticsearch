package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.artifacts.Dependency;
import org.gradle.normalization.InputNormalizationHandler;
import org.gradle.jvm.toolchain.JavaToolchainService;
import org.gradle.normalization.RuntimeClasspathNormalization;
import org.gradle.api.provider.Provider;
import org.elasticsearch.gradle.util.GradleUtils;
import org.elasticsearch.gradle.internal.conventions.precommit.PrecommitTaskPlugin;
import org.gradle.api.plugins.ExtraPropertiesExtension;
import org.elasticsearch.gradle.internal.test.TestUtil;
import java.util.concurrent.Callable;
import org.gradle.api.plugins.JavaBasePlugin;
import org.gradle.api.specs.Spec;
import org.gradle.jvm.toolchain.JavaToolchainSpec;
import org.gradle.api.tasks.testing.Test;
import java.util.Map;
import java.util.HashMap;
import org.gradle.api.JavaVersion;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.NamedDomainObjectSet;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.jvm.toolchain.JavaLanguageVersion;
import org.mockito.stubbing.Answer;
import org.elasticsearch.gradle.VersionProperties;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.gradle.api.plugins.JavaPluginExtension;
import org.gradle.api.tasks.compile.GroovyCompile;
import org.elasticsearch.gradle.internal.test.MutedTestPlugin;
import org.gradle.api.Project;
import org.gradle.api.tasks.TaskCollection;
import org.gradle.api.tasks.compile.JavaCompile;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.mockito.MockedStatic;
import org.elasticsearch.gradle.internal.info.GlobalBuildInfoPlugin;
import org.gradle.jvm.toolchain.JavaCompiler;
import org.elasticsearch.gradle.internal.info.BuildParams;
import org.gradle.api.plugins.PluginManager;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static java.util.Map.entry;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.atLeast;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class ElasticsearchJavaBasePluginSapientGeneratedTest {

    private final JavaToolchainService javaToolchainsMock = mock(JavaToolchainService.class, "javaToolchains");

    private final Action actionMock = mock(Action.class);

    private final ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);

    private final ConfigurationContainer configurationContainerMock2 = mock(ConfigurationContainer.class);

    private final Configuration configurationMock = mock(Configuration.class);

    private final ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);

    private final ExtensionContainer extensionContainerMock2 = mock(ExtensionContainer.class);

    private final ExtraPropertiesExtension extraPropertiesExtensionMock = mock(ExtraPropertiesExtension.class);

    private final InputNormalizationHandler inputNormalizationHandlerMock = mock(InputNormalizationHandler.class);

    private final InputNormalizationHandler inputNormalizationHandlerMock2 = mock(InputNormalizationHandler.class);

    private final JavaLanguageVersion javaLanguageVersionMock = mock(JavaLanguageVersion.class);

    private final JavaPluginExtension javaPluginExtensionMock = mock(JavaPluginExtension.class);

    private final JavaToolchainSpec javaToolchainSpecMock = mock(JavaToolchainSpec.class);

    private final NamedDomainObjectSet namedDomainObjectSetMock = mock(NamedDomainObjectSet.class);

    private final Project projectMock = mock(Project.class);

    private final Provider<Integer> providerMock = mock(Provider.class);

    private final Provider<Integer> providerMock2 = mock(Provider.class);

    private final Provider<JavaCompiler> providerMock3 = mock(Provider.class);

    private final Provider<Action<JavaToolchainSpec>> providerMock4 = mock(Provider.class);

    private final Provider<Action<JavaToolchainSpec>> providerMock5 = mock(Provider.class);

    private final RuntimeClasspathNormalization runtimeClasspathNormalizationMock = mock(RuntimeClasspathNormalization.class);

    private final RuntimeClasspathNormalization runtimeClasspathNormalizationMock2 = mock(RuntimeClasspathNormalization.class);

    private final SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);

    private final TaskCollection taskCollectionMock = mock(TaskCollection.class);

    private final TaskCollection taskCollectionMock2 = mock(TaskCollection.class);

    private final TaskContainer taskContainerMock = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock2 = mock(TaskContainer.class);

    //Sapient generated method id: ${applyTest}, hash: C9F846813E99FCEEA278115FAAC4B9C0
    @Disabled()
    @org.junit.jupiter.api.Test()
    void applyTest() throws InvalidUserDataException, UnknownDomainObjectException {
        //Arrange Statement(s)
        Project projectMock2 = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        PluginManager pluginManagerMock2 = mock(PluginManager.class);
        PluginManager pluginManagerMock3 = mock(PluginManager.class);
        PluginManager pluginManagerMock4 = mock(PluginManager.class);
        PluginManager pluginManagerMock5 = mock(PluginManager.class);
        PluginManager pluginManagerMock6 = mock(PluginManager.class);
        Configuration configurationMock2 = mock(Configuration.class);
        DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        Dependency dependencyMock = mock(Dependency.class);
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<ElasticsearchJavaBasePlugin> elasticsearchJavaBasePlugin = mockStatic(ElasticsearchJavaBasePlugin.class, CALLS_REAL_METHODS)) {
            doReturn(projectMock2).when(projectMock).getRootProject();
            doReturn(pluginManagerMock).when(projectMock2).getPluginManager();
            doNothing().when(pluginManagerMock).apply(GlobalBuildInfoPlugin.class);
            doNothing().when(pluginManagerMock2).apply(JavaBasePlugin.class);
            doNothing().when(pluginManagerMock3).apply(RepositoriesSetupPlugin.class);
            doNothing().when(pluginManagerMock4).apply(ElasticsearchTestBasePlugin.class);
            doNothing().when(pluginManagerMock5).apply(PrecommitTaskPlugin.class);
            doReturn(pluginManagerMock2, pluginManagerMock3, pluginManagerMock4, pluginManagerMock5, pluginManagerMock6).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock6).apply(MutedTestPlugin.class);
            doReturn(runtimeClasspathNormalizationMock).when(inputNormalizationHandlerMock).getRuntimeClasspath();
            doNothing().when(runtimeClasspathNormalizationMock).ignore("META-INF/MANIFEST.MF");
            doReturn(inputNormalizationHandlerMock, inputNormalizationHandlerMock2).when(projectMock).getNormalization();
            doReturn(runtimeClasspathNormalizationMock2).when(inputNormalizationHandlerMock2).getRuntimeClasspath();
            doNothing().when(runtimeClasspathNormalizationMock2).ignore("IMPL-JARS/**/META-INF/MANIFEST.MF");
            doReturn(configurationContainerMock).when(projectMock).getConfigurations();
            doReturn(configurationMock).when(configurationContainerMock).create("nativeLibs");
            doReturn(configurationMock2).when(configurationMock).defaultDependencies((Action) any());
            doReturn("A").when(configurationMock).getAsPath();
            doReturn(dependencyHandlerMock).when(projectMock).getDependencies();
            Map<String, String> stringStringMap = new HashMap<>(Map.ofEntries(entry("path", ":libs:elasticsearch-native:elasticsearch-native-libraries"), entry("configuration", "default")));
            doReturn(dependencyMock).when(dependencyHandlerMock).project(eq(stringStringMap));
            doReturn(taskContainerMock).when(projectMock).getTasks();
            doReturn(taskCollectionMock).when(taskContainerMock).withType(Test.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(extraPropertiesExtensionMock).when(extensionContainerMock).getExtraProperties();
            Map<String, String> stringStringMap2 = new HashMap<>();
            doNothing().when(extraPropertiesExtensionMock).set(eq("versions"), eq(stringStringMap2));
            elasticsearchJavaBasePlugin.when(() -> ElasticsearchJavaBasePlugin.configureConfigurations(projectMock)).thenAnswer((Answer<Void>) invocation -> null);
            versionProperties.when(() -> VersionProperties.getVersions()).thenReturn(stringStringMap2);
            ElasticsearchJavaBasePlugin target = spy(new ElasticsearchJavaBasePlugin(javaToolchainsMock));
            doNothing().when(target).configureCompile(projectMock);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, atLeast(1)).getRootProject();
                verify(projectMock2, atLeast(1)).getPluginManager();
                verify(pluginManagerMock, atLeast(1)).apply(GlobalBuildInfoPlugin.class);
                verify(projectMock, times(5)).getPluginManager();
                verify(pluginManagerMock2, atLeast(1)).apply(JavaBasePlugin.class);
                verify(pluginManagerMock3, atLeast(1)).apply(RepositoriesSetupPlugin.class);
                verify(pluginManagerMock4, atLeast(1)).apply(ElasticsearchTestBasePlugin.class);
                verify(pluginManagerMock5, atLeast(1)).apply(PrecommitTaskPlugin.class);
                verify(pluginManagerMock6, atLeast(1)).apply(MutedTestPlugin.class);
                verify(projectMock, times(2)).getNormalization();
                verify(inputNormalizationHandlerMock, atLeast(1)).getRuntimeClasspath();
                verify(runtimeClasspathNormalizationMock, atLeast(1)).ignore("META-INF/MANIFEST.MF");
                verify(inputNormalizationHandlerMock2, atLeast(1)).getRuntimeClasspath();
                verify(runtimeClasspathNormalizationMock2, atLeast(1)).ignore("IMPL-JARS/**/META-INF/MANIFEST.MF");
                verify(projectMock, atLeast(1)).getConfigurations();
                verify(configurationContainerMock, atLeast(1)).create("nativeLibs");
                verify(configurationMock, atLeast(1)).defaultDependencies((Action) any());
                verify(configurationMock, atLeast(1)).getAsPath();
                verify(projectMock, atLeast(1)).getDependencies();
                verify(dependencyHandlerMock, atLeast(1)).project(eq(stringStringMap));
                verify(projectMock, atLeast(1)).getTasks();
                verify(taskContainerMock, atLeast(1)).withType(Test.class);
                verify(taskCollectionMock, atLeast(1)).configureEach((Action) any());
                verify(projectMock, atLeast(1)).getExtensions();
                verify(extensionContainerMock, atLeast(1)).getExtraProperties();
                verify(extraPropertiesExtensionMock, atLeast(1)).set(eq("versions"), eq(stringStringMap2));
                elasticsearchJavaBasePlugin.verify(() -> ElasticsearchJavaBasePlugin.configureConfigurations(projectMock), atLeast(1));
                versionProperties.verify(() -> VersionProperties.getVersions(), atLeast(1));
                verify(target, atLeast(1)).configureCompile(projectMock);
            });
        }
    }

    //Sapient generated method id: ${configureConfigurationsWhenProjectGetPathEquals_build_tools}, hash: DEEC57255FF6813E838BCB76638D22D1
    @org.junit.jupiter.api.Test()
    void configureConfigurationsWhenProjectGetPathEquals_build_tools() {
        /* Branches:
         * (project.getPath().startsWith(":test:fixtures")) : false
         * (project.getPath().equals(":build-tools")) : true
         */
        doReturn("A", ":build-tools").when(projectMock).getPath();
        //Act Statement(s)
        ElasticsearchJavaBasePlugin.configureConfigurations(projectMock);
        //Assert statement(s)
        assertAll("result", () -> verify(projectMock, times(2)).getPath());
    }

    //Sapient generated method id: ${configureConfigurationsWhenDefaultBranch}, hash: 28FFB3AE355EB3D4B65DD7D774DC5D83
    @Disabled()
    @org.junit.jupiter.api.Test()
    void configureConfigurationsWhenDefaultBranch() throws UnknownDomainObjectException {
        /* Branches:
         * (project.getPath().startsWith(":test:fixtures")) : false
         * (project.getPath().equals(":build-tools")) : false
         * (configuration.getName().endsWith("Fixture")) : true  #  inside lambda$configureConfigurations$0 method
         * (branch expression (line 122)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            doReturn("A", "B").when(projectMock).getPath();
            doNothing().when(configurationContainerMock).all((Action) any());
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(sourceSetContainerMock).when(extensionContainerMock).getByType(SourceSetContainer.class);
            doNothing().when(sourceSetContainerMock).all((Action) any());
            doReturn(configurationContainerMock, configurationContainerMock2).when(projectMock).getConfigurations();
            doReturn(namedDomainObjectSetMock).when(configurationContainerMock2).matching((Spec) any());
            doNothing().when(namedDomainObjectSetMock).configureEach((Action) any());
            gradleUtils.when(() -> GradleUtils.disableTransitiveDependencies(configurationMock)).thenAnswer((Answer<Void>) invocation -> null);
            //Act Statement(s)
            ElasticsearchJavaBasePlugin.configureConfigurations(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(2)).getPath();
                verify(projectMock, times(2)).getConfigurations();
                verify(configurationContainerMock).all((Action) any());
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByType(SourceSetContainer.class);
                verify(sourceSetContainerMock).all((Action) any());
                verify(configurationContainerMock2).matching((Spec) any());
                verify(namedDomainObjectSetMock).configureEach((Action) any());
                gradleUtils.verify(() -> GradleUtils.disableTransitiveDependencies(configurationMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${configureConfigurationsWhenConfigurationGetNameNotEndsWithFixtureAndDefaultBranch}, hash: 1B423916C312B8BE82F3E7495ACB09CE
    @Disabled()
    @org.junit.jupiter.api.Test()
    void configureConfigurationsWhenConfigurationGetNameNotEndsWithFixtureAndDefaultBranch() throws UnknownDomainObjectException {
        /* Branches:
         * (project.getPath().startsWith(":test:fixtures")) : false
         * (project.getPath().equals(":build-tools")) : false
         * (configuration.getName().endsWith("Fixture")) : false  #  inside lambda$configureConfigurations$0 method
         * (branch expression (line 122)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            doReturn("NS", "CR").when(projectMock).getPath();
            doNothing().when(configurationContainerMock).all((Action) any());
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(sourceSetContainerMock).when(extensionContainerMock).getByType(SourceSetContainer.class);
            doNothing().when(sourceSetContainerMock).all((Action) any());
            doReturn(configurationContainerMock, configurationContainerMock2).when(projectMock).getConfigurations();
            doReturn(namedDomainObjectSetMock).when(configurationContainerMock2).matching((Spec) any());
            doNothing().when(namedDomainObjectSetMock).configureEach((Action) any());
            gradleUtils.when(() -> GradleUtils.disableTransitiveDependencies(configurationMock)).thenAnswer((Answer<Void>) invocation -> null);
            doReturn("DQ").when(configurationMock).getName();
            //Act Statement(s)
            ElasticsearchJavaBasePlugin.configureConfigurations(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(2)).getPath();
                verify(projectMock, times(2)).getConfigurations();
                verify(configurationContainerMock).all((Action) any());
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByType(SourceSetContainer.class);
                verify(sourceSetContainerMock).all((Action) any());
                verify(configurationContainerMock2).matching((Spec) any());
                verify(namedDomainObjectSetMock).configureEach((Action) any());
                gradleUtils.verify(() -> GradleUtils.disableTransitiveDependencies(configurationMock), atLeast(1));
                verify(configurationMock).getName();
            });
        }
    }

    //Sapient generated method id: ${configureCompileWhenBuildParamsIsCiEqualsFalse}, hash: 654EE5CAAFBC794FECF39598C29CBD49
    @Disabled()
    @org.junit.jupiter.api.Test()
    void configureCompileWhenBuildParamsIsCiEqualsFalse() throws UnknownDomainObjectException {
        /* Branches:
         * (BuildParams.getJavaToolChainSpec().isPresent()) : true
         * (BuildParams.isCi() == false) : true  #  inside lambda$configureCompile$6 method
         */
        //Arrange Statement(s)
        try (MockedStatic<JavaVersion> javaVersion = mockStatic(JavaVersion.class, CALLS_REAL_METHODS);
            MockedStatic<JavaLanguageVersion> javaLanguageVersion = mockStatic(JavaLanguageVersion.class);
            MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            doReturn(extraPropertiesExtensionMock).when(extensionContainerMock).getExtraProperties();
            doNothing().when(extraPropertiesExtensionMock).set("compactProfile", "full");
            doReturn(extensionContainerMock, extensionContainerMock2).when(projectMock).getExtensions();
            doReturn(javaPluginExtensionMock).when(extensionContainerMock2).getByType(JavaPluginExtension.class);
            doReturn(javaToolchainSpecMock).when(javaPluginExtensionMock).toolchain(actionMock);
            doNothing().when(javaPluginExtensionMock).setSourceCompatibility(JavaVersion.VERSION_1_1);
            doNothing().when(javaPluginExtensionMock).setTargetCompatibility(JavaVersion.VERSION_1_1);
            doReturn(JavaVersion.VERSION_1_9).when(javaPluginExtensionMock).getSourceCompatibility();
            doReturn(JavaVersion.VERSION_1_9).when(javaPluginExtensionMock).getTargetCompatibility();
            doReturn(taskCollectionMock).when(taskContainerMock).withType(JavaCompile.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            doReturn(taskContainerMock, taskContainerMock2).when(projectMock).getTasks();
            doReturn(taskCollectionMock2).when(taskContainerMock2).withType(GroovyCompile.class);
            doNothing().when(taskCollectionMock2).configureEach((Action) any());
            doReturn(providerMock, providerMock2).when(projectMock).provider((Callable) any());
            doReturn(providerMock3).when(javaToolchainsMock).compilerFor((Action) any());
            doReturn(true).when(providerMock4).isPresent();
            buildParams.when(() -> BuildParams.getJavaToolChainSpec()).thenReturn(providerMock4).thenReturn(providerMock5);
            doReturn(actionMock).when(providerMock5).get();
            buildParams.when(() -> BuildParams.getMinimumRuntimeVersion()).thenReturn(JavaVersion.VERSION_1_1).thenReturn(JavaVersion.VERSION_1_1).thenReturn(JavaVersion.VERSION_1_7);
            buildParams.when(() -> BuildParams.isCi()).thenReturn(false);
            javaLanguageVersion.when(() -> JavaLanguageVersion.of("7")).thenReturn(javaLanguageVersionMock);
            javaVersion.when(() -> JavaVersion.toVersion("C")).thenReturn(JavaVersion.VERSION_1_8);
            javaVersion.when(() -> JavaVersion.toVersion("D")).thenReturn(JavaVersion.VERSION_1_2);
            ElasticsearchJavaBasePlugin target = new ElasticsearchJavaBasePlugin(javaToolchainsMock);
            //Act Statement(s)
            target.configureCompile(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(2)).getExtensions();
                verify(extensionContainerMock, atLeast(1)).getExtraProperties();
                verify(extraPropertiesExtensionMock, atLeast(1)).set("compactProfile", "full");
                verify(extensionContainerMock2, atLeast(1)).getByType(JavaPluginExtension.class);
                verify(javaPluginExtensionMock, atLeast(1)).toolchain(actionMock);
                verify(javaPluginExtensionMock, atLeast(1)).setSourceCompatibility(JavaVersion.VERSION_1_1);
                verify(javaPluginExtensionMock, atLeast(1)).setTargetCompatibility(JavaVersion.VERSION_1_1);
                verify(javaPluginExtensionMock, atLeast(1)).getSourceCompatibility();
                verify(javaPluginExtensionMock, atLeast(1)).getTargetCompatibility();
                verify(projectMock, times(2)).getTasks();
                verify(taskContainerMock, atLeast(1)).withType(JavaCompile.class);
                verify(taskCollectionMock, atLeast(1)).configureEach((Action) any());
                verify(projectMock, atLeast(2)).provider((Callable) any());
                verify(taskContainerMock2, atLeast(1)).withType(GroovyCompile.class);
                verify(taskCollectionMock2, atLeast(1)).configureEach((Action) any());
                verify(javaToolchainsMock, atLeast(1)).compilerFor((Action) any());
                buildParams.verify(() -> BuildParams.getJavaToolChainSpec(), atLeast(2));
                verify(providerMock4, atLeast(1)).isPresent();
                verify(providerMock5, atLeast(1)).get();
                buildParams.verify(() -> BuildParams.getMinimumRuntimeVersion(), atLeast(3));
                buildParams.verify(() -> BuildParams.isCi(), atLeast(1));
                javaLanguageVersion.verify(() -> JavaLanguageVersion.of("7"), atLeast(1));
                javaVersion.verify(() -> JavaVersion.toVersion("C"), atLeast(1));
                javaVersion.verify(() -> JavaVersion.toVersion("D"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${configureCompileWhenBuildParamsIsCiNotEqualsFalse}, hash: 4F81E6042116D9E1EEE40D6960FD4A13
    @Disabled()
    @org.junit.jupiter.api.Test()
    void configureCompileWhenBuildParamsIsCiNotEqualsFalse() throws UnknownDomainObjectException {
        /* Branches:
         * (BuildParams.getJavaToolChainSpec().isPresent()) : true
         * (BuildParams.isCi() == false) : false  #  inside lambda$configureCompile$6 method
         */
        //Arrange Statement(s)
        try (MockedStatic<JavaVersion> javaVersion = mockStatic(JavaVersion.class, CALLS_REAL_METHODS);
            MockedStatic<JavaLanguageVersion> javaLanguageVersion = mockStatic(JavaLanguageVersion.class);
            MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            doReturn(extraPropertiesExtensionMock).when(extensionContainerMock).getExtraProperties();
            doNothing().when(extraPropertiesExtensionMock).set("compactProfile", "full");
            doReturn(extensionContainerMock, extensionContainerMock2).when(projectMock).getExtensions();
            doReturn(javaPluginExtensionMock).when(extensionContainerMock2).getByType(JavaPluginExtension.class);
            doReturn(javaToolchainSpecMock).when(javaPluginExtensionMock).toolchain(actionMock);
            doNothing().when(javaPluginExtensionMock).setSourceCompatibility(JavaVersion.VERSION_1_1);
            doNothing().when(javaPluginExtensionMock).setTargetCompatibility(JavaVersion.VERSION_1_1);
            doReturn(JavaVersion.VERSION_1_9).when(javaPluginExtensionMock).getSourceCompatibility();
            doReturn(JavaVersion.VERSION_1_9).when(javaPluginExtensionMock).getTargetCompatibility();
            doReturn(taskCollectionMock).when(taskContainerMock).withType(JavaCompile.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            doReturn(taskContainerMock, taskContainerMock2).when(projectMock).getTasks();
            doReturn(taskCollectionMock2).when(taskContainerMock2).withType(GroovyCompile.class);
            doNothing().when(taskCollectionMock2).configureEach((Action) any());
            doReturn(providerMock, providerMock2).when(projectMock).provider((Callable) any());
            doReturn(providerMock3).when(javaToolchainsMock).compilerFor((Action) any());
            doReturn(true).when(providerMock4).isPresent();
            buildParams.when(() -> BuildParams.getJavaToolChainSpec()).thenReturn(providerMock4).thenReturn(providerMock5);
            doReturn(actionMock).when(providerMock5).get();
            buildParams.when(() -> BuildParams.getMinimumRuntimeVersion()).thenReturn(JavaVersion.VERSION_1_1).thenReturn(JavaVersion.VERSION_1_1).thenReturn(JavaVersion.VERSION_1_7);
            buildParams.when(() -> BuildParams.isCi()).thenReturn(true);
            javaLanguageVersion.when(() -> JavaLanguageVersion.of("7")).thenReturn(javaLanguageVersionMock);
            javaVersion.when(() -> JavaVersion.toVersion("C")).thenReturn(JavaVersion.VERSION_1_8);
            javaVersion.when(() -> JavaVersion.toVersion("D")).thenReturn(JavaVersion.VERSION_1_2);
            ElasticsearchJavaBasePlugin target = new ElasticsearchJavaBasePlugin(javaToolchainsMock);
            //Act Statement(s)
            target.configureCompile(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(2)).getExtensions();
                verify(extensionContainerMock, atLeast(1)).getExtraProperties();
                verify(extraPropertiesExtensionMock, atLeast(1)).set("compactProfile", "full");
                verify(extensionContainerMock2, atLeast(1)).getByType(JavaPluginExtension.class);
                verify(javaPluginExtensionMock, atLeast(1)).toolchain(actionMock);
                verify(javaPluginExtensionMock, atLeast(1)).setSourceCompatibility(JavaVersion.VERSION_1_1);
                verify(javaPluginExtensionMock, atLeast(1)).setTargetCompatibility(JavaVersion.VERSION_1_1);
                verify(javaPluginExtensionMock, atLeast(1)).getSourceCompatibility();
                verify(javaPluginExtensionMock, atLeast(1)).getTargetCompatibility();
                verify(projectMock, times(2)).getTasks();
                verify(taskContainerMock, atLeast(1)).withType(JavaCompile.class);
                verify(taskCollectionMock, atLeast(1)).configureEach((Action) any());
                verify(projectMock, atLeast(2)).provider((Callable) any());
                verify(taskContainerMock2, atLeast(1)).withType(GroovyCompile.class);
                verify(taskCollectionMock2, atLeast(1)).configureEach((Action) any());
                verify(javaToolchainsMock, atLeast(1)).compilerFor((Action) any());
                buildParams.verify(() -> BuildParams.getJavaToolChainSpec(), atLeast(2));
                verify(providerMock4, atLeast(1)).isPresent();
                verify(providerMock5, atLeast(1)).get();
                buildParams.verify(() -> BuildParams.getMinimumRuntimeVersion(), atLeast(3));
                buildParams.verify(() -> BuildParams.isCi(), atLeast(1));
                javaLanguageVersion.verify(() -> JavaLanguageVersion.of("7"), atLeast(1));
                javaVersion.verify(() -> JavaVersion.toVersion("C"), atLeast(1));
                javaVersion.verify(() -> JavaVersion.toVersion("D"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${configureInputNormalizationTest}, hash: 3BF894BC81177CF491963D8B9C67BE00
    @org.junit.jupiter.api.Test()
    void configureInputNormalizationTest() {
        doReturn(runtimeClasspathNormalizationMock).when(inputNormalizationHandlerMock).getRuntimeClasspath();
        doNothing().when(runtimeClasspathNormalizationMock).ignore("META-INF/MANIFEST.MF");
        doReturn(inputNormalizationHandlerMock, inputNormalizationHandlerMock2).when(projectMock).getNormalization();
        doReturn(runtimeClasspathNormalizationMock2).when(inputNormalizationHandlerMock2).getRuntimeClasspath();
        doNothing().when(runtimeClasspathNormalizationMock2).ignore("IMPL-JARS/**/META-INF/MANIFEST.MF");
        //Act Statement(s)
        ElasticsearchJavaBasePlugin.configureInputNormalization(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock, times(2)).getNormalization();
            verify(inputNormalizationHandlerMock).getRuntimeClasspath();
            verify(runtimeClasspathNormalizationMock).ignore("META-INF/MANIFEST.MF");
            verify(inputNormalizationHandlerMock2).getRuntimeClasspath();
            verify(runtimeClasspathNormalizationMock2).ignore("IMPL-JARS/**/META-INF/MANIFEST.MF");
        });
    }
}

package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.UnknownConfigurationException;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.NamedDomainObjectContainer;
import org.elasticsearch.gradle.plugin.PluginPropertiesExtension;
import org.gradle.api.file.CopySpec;
import org.elasticsearch.gradle.util.GradleUtils;
import org.gradle.api.plugins.ExtraPropertiesExtension;
import org.elasticsearch.gradle.internal.conventions.util.Util;
import java.util.HashSet;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.artifacts.DependencySet;
import java.util.Optional;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.plugins.ExtensionContainer;
import org.mockito.stubbing.Answer;
import org.gradle.api.Action;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.file.SourceDirectorySet;
import java.util.Set;
import org.gradle.api.Project;
import org.elasticsearch.gradle.internal.precommit.JarHellPrecommitPlugin;
import org.mockito.MockedStatic;
import org.elasticsearch.gradle.plugin.PluginBuildPlugin;
import org.elasticsearch.gradle.internal.test.HistoricalFeaturesMetadataPlugin;
import java.io.File;
import org.gradle.api.plugins.PluginManager;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class BaseInternalPluginBuildPluginSapientGeneratedTest {

    private final ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);

    private final ConfigurationContainer configurationContainerMock2 = mock(ConfigurationContainer.class);

    private final Configuration configurationMock = mock(Configuration.class);

    private final Configuration configurationMock2 = mock(Configuration.class);

    private final DependencySet dependencySetMock = mock(DependencySet.class);

    private final DependencySet dependencySetMock2 = mock(DependencySet.class);

    private final ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);

    private final ExtensionContainer extensionContainerMock2 = mock(ExtensionContainer.class);

    private final ExtensionContainer extensionContainerMock3 = mock(ExtensionContainer.class);

    private final ExtensionContainer extensionContainerMock4 = mock(ExtensionContainer.class);

    private final ExtraPropertiesExtension extraPropertiesExtensionMock = mock(ExtraPropertiesExtension.class);

    private final NamedDomainObjectContainer namedDomainObjectContainerMock = mock(NamedDomainObjectContainer.class);

    private final PluginContainer pluginContainerMock = mock(PluginContainer.class);

    private final PluginManager pluginManagerMock = mock(PluginManager.class);

    private final PluginManager pluginManagerMock2 = mock(PluginManager.class);

    private final PluginManager pluginManagerMock3 = mock(PluginManager.class);

    private final PluginManager pluginManagerMock4 = mock(PluginManager.class);

    private final PluginPropertiesExtension pluginPropertiesExtensionMock = mock(PluginPropertiesExtension.class);

    private final Project projectMock = mock(Project.class);

    private final Project projectMock2 = mock(Project.class);

    private final Project projectMock3 = mock(Project.class);

    private final Project projectMock4 = mock(Project.class);

    //Sapient generated method id: ${applyWhenNotIsXPackModuleAndDefaultBranch}, hash: 82D5E14368CE69B5EAB1F603442D17FD
    @Disabled()
    @Test()
    void applyWhenNotIsXPackModuleAndDefaultBranch() throws UnknownConfigurationException, UnknownDomainObjectException {
        /* Branches:
         * (isModule) : true
         * (project.getPath().startsWith(":x-pack")) : false
         * (isModule == false) : false
         * (isXPackModule) : false
         * (branch expression (line 101)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            doNothing().when(pluginManagerMock).apply(PluginBuildPlugin.class);
            doNothing().when(pluginManagerMock2).apply(JarHellPrecommitPlugin.class);
            doNothing().when(pluginManagerMock3).apply(ElasticsearchJavaPlugin.class);
            doReturn(pluginManagerMock, pluginManagerMock2, pluginManagerMock3, pluginManagerMock4).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock4).apply(HistoricalFeaturesMetadataPlugin.class);
            doReturn(configurationMock).when(configurationContainerMock).getByName("compileOnly");
            doReturn(dependencySetMock).when(configurationMock).getDependencies();
            doNothing().when(dependencySetMock).clear();
            doReturn(configurationContainerMock, configurationContainerMock2).when(projectMock).getConfigurations();
            doReturn(configurationMock2).when(configurationContainerMock2).getByName("testImplementation");
            doReturn(dependencySetMock2).when(configurationMock2).getDependencies();
            doNothing().when(dependencySetMock2).clear();
            doReturn(pluginPropertiesExtensionMock).when(extensionContainerMock).getByType(PluginPropertiesExtension.class);
            doReturn(extraPropertiesExtensionMock).when(extensionContainerMock2).getExtraProperties();
            doNothing().when(extraPropertiesExtensionMock).set(eq("addQaCheckDependencies"), (Object) any());
            doReturn("").when(projectMock).getPath();
            doReturn(extensionContainerMock, extensionContainerMock2, extensionContainerMock3).when(projectMock).getExtensions();
            doReturn(namedDomainObjectContainerMock).when(extensionContainerMock3).getByName("testClusters");
            doReturn(projectMock2).when(projectMock).getRootProject();
            Set<Project> projectSet = new HashSet<>();
            projectSet.add(projectMock3);
            doReturn(projectSet).when(projectMock2).getAllprojects();
            doReturn("").when(projectMock3).getPath();
            doNothing().when(projectMock).afterEvaluate((Action) any());
            gradleUtils.when(() -> GradleUtils.isModuleProject("")).thenReturn(true).thenReturn(false);
            BaseInternalPluginBuildPlugin target = new BaseInternalPluginBuildPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(4)).getPluginManager();
                verify(pluginManagerMock).apply(PluginBuildPlugin.class);
                verify(pluginManagerMock2).apply(JarHellPrecommitPlugin.class);
                verify(pluginManagerMock3).apply(ElasticsearchJavaPlugin.class);
                verify(pluginManagerMock4).apply(HistoricalFeaturesMetadataPlugin.class);
                verify(projectMock, times(2)).getConfigurations();
                verify(configurationContainerMock).getByName("compileOnly");
                verify(configurationMock).getDependencies();
                verify(dependencySetMock).clear();
                verify(configurationContainerMock2).getByName("testImplementation");
                verify(configurationMock2).getDependencies();
                verify(dependencySetMock2).clear();
                verify(projectMock, times(3)).getExtensions();
                verify(extensionContainerMock).getByType(PluginPropertiesExtension.class);
                verify(extensionContainerMock2).getExtraProperties();
                verify(extraPropertiesExtensionMock).set(eq("addQaCheckDependencies"), (Object) any());
                verify(projectMock, times(2)).getPath();
                verify(extensionContainerMock3).getByName("testClusters");
                verify(projectMock).getRootProject();
                verify(projectMock2).getAllprojects();
                verify(projectMock3).getPath();
                verify(projectMock).afterEvaluate((Action) any());
                gradleUtils.verify(() -> GradleUtils.isModuleProject(""), atLeast(2));
            });
        }
    }

    //Sapient generated method id: ${applyWhenDefaultBranchAndDefaultBranch}, hash: E7CC7E4AC595793F1276B868061A0BF1
    @Disabled()
    @Test()
    void applyWhenDefaultBranchAndDefaultBranch() throws UnknownConfigurationException, UnknownDomainObjectException {
        /* Branches:
         * (isModule) : true
         * (project.getPath().startsWith(":x-pack")) : true
         * (isModule == false) : false
         * (isXPackModule) : true
         * (branch expression (line 101)) : true
         * (branch expression (line 102)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class);
            MockedStatic<BaseInternalPluginBuildPlugin> baseInternalPluginBuildPlugin = mockStatic(BaseInternalPluginBuildPlugin.class)) {
            doNothing().when(pluginManagerMock).apply(PluginBuildPlugin.class);
            doNothing().when(pluginManagerMock2).apply(JarHellPrecommitPlugin.class);
            doNothing().when(pluginManagerMock3).apply(ElasticsearchJavaPlugin.class);
            doReturn(pluginManagerMock, pluginManagerMock2, pluginManagerMock3, pluginManagerMock4).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock4).apply(HistoricalFeaturesMetadataPlugin.class);
            doReturn(configurationMock).when(configurationContainerMock).getByName("compileOnly");
            doReturn(dependencySetMock).when(configurationMock).getDependencies();
            doNothing().when(dependencySetMock).clear();
            doReturn(configurationContainerMock, configurationContainerMock2).when(projectMock).getConfigurations();
            doReturn(configurationMock2).when(configurationContainerMock2).getByName("testImplementation");
            doReturn(dependencySetMock2).when(configurationMock2).getDependencies();
            doNothing().when(dependencySetMock2).clear();
            doReturn(pluginPropertiesExtensionMock).when(extensionContainerMock).getByType(PluginPropertiesExtension.class);
            doReturn(extraPropertiesExtensionMock).when(extensionContainerMock2).getExtraProperties();
            doNothing().when(extraPropertiesExtensionMock).set(eq("addQaCheckDependencies"), (Object) any());
            doReturn("", ":x-pack").when(projectMock).getPath();
            doReturn(extensionContainerMock, extensionContainerMock2, extensionContainerMock3).when(projectMock).getExtensions();
            doReturn(namedDomainObjectContainerMock).when(extensionContainerMock3).getByName("testClusters");
            doReturn(projectMock2).when(projectMock).getRootProject();
            Set<Project> projectSet = new HashSet<>();
            projectSet.add(projectMock3);
            doReturn(projectSet).when(projectMock2).getAllprojects();
            doReturn("DE").when(projectMock3).getPath();
            doReturn(pluginContainerMock).when(projectMock3).getPlugins();
            doReturn(false).when(pluginContainerMock).hasPlugin(PluginBuildPlugin.class);
            doNothing().when(projectMock).afterEvaluate((Action) any());
            baseInternalPluginBuildPlugin.when(() -> BaseInternalPluginBuildPlugin.addNoticeGeneration(projectMock, pluginPropertiesExtensionMock)).thenAnswer((Answer<Void>) invocation -> null);
            gradleUtils.when(() -> GradleUtils.isModuleProject("")).thenReturn(true);
            gradleUtils.when(() -> GradleUtils.isModuleProject("DE")).thenReturn(true);
            BaseInternalPluginBuildPlugin target = new BaseInternalPluginBuildPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(4)).getPluginManager();
                verify(pluginManagerMock).apply(PluginBuildPlugin.class);
                verify(pluginManagerMock2).apply(JarHellPrecommitPlugin.class);
                verify(pluginManagerMock3).apply(ElasticsearchJavaPlugin.class);
                verify(pluginManagerMock4).apply(HistoricalFeaturesMetadataPlugin.class);
                verify(projectMock, times(2)).getConfigurations();
                verify(configurationContainerMock).getByName("compileOnly");
                verify(configurationMock).getDependencies();
                verify(dependencySetMock).clear();
                verify(configurationContainerMock2).getByName("testImplementation");
                verify(configurationMock2).getDependencies();
                verify(dependencySetMock2).clear();
                verify(projectMock, times(3)).getExtensions();
                verify(extensionContainerMock).getByType(PluginPropertiesExtension.class);
                verify(extensionContainerMock2).getExtraProperties();
                verify(extraPropertiesExtensionMock).set(eq("addQaCheckDependencies"), (Object) any());
                verify(projectMock, times(2)).getPath();
                verify(extensionContainerMock3).getByName("testClusters");
                verify(projectMock).getRootProject();
                verify(projectMock2).getAllprojects();
                verify(projectMock3).getPath();
                verify(projectMock3).getPlugins();
                verify(pluginContainerMock).hasPlugin(PluginBuildPlugin.class);
                verify(projectMock).afterEvaluate((Action) any());
                baseInternalPluginBuildPlugin.verify(() -> BaseInternalPluginBuildPlugin.addNoticeGeneration(projectMock, pluginPropertiesExtensionMock), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.isModuleProject(""), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.isModuleProject("DE"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenDefaultBranchAndDefaultBranchAndDefaultBranch}, hash: F71A227D64ADCD396EE656434282C2C6
    @Disabled()
    @Test()
    void applyWhenDefaultBranchAndDefaultBranchAndDefaultBranch() throws UnknownConfigurationException, UnknownDomainObjectException {
        /* Branches:
         * (isModule) : true
         * (project.getPath().startsWith(":x-pack")) : true
         * (isModule == false) : false
         * (isXPackModule) : true
         * (branch expression (line 101)) : true
         * (branch expression (line 102)) : true
         * (branch expression (line 103)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class);
            MockedStatic<BaseInternalPluginBuildPlugin> baseInternalPluginBuildPlugin = mockStatic(BaseInternalPluginBuildPlugin.class)) {
            doNothing().when(pluginManagerMock).apply(PluginBuildPlugin.class);
            doNothing().when(pluginManagerMock2).apply(JarHellPrecommitPlugin.class);
            doNothing().when(pluginManagerMock3).apply(ElasticsearchJavaPlugin.class);
            doReturn(pluginManagerMock, pluginManagerMock2, pluginManagerMock3, pluginManagerMock4).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock4).apply(HistoricalFeaturesMetadataPlugin.class);
            doReturn(configurationMock).when(configurationContainerMock).getByName("compileOnly");
            doReturn(dependencySetMock).when(configurationMock).getDependencies();
            doNothing().when(dependencySetMock).clear();
            doReturn(configurationContainerMock, configurationContainerMock2).when(projectMock).getConfigurations();
            doReturn(configurationMock2).when(configurationContainerMock2).getByName("testImplementation");
            doReturn(dependencySetMock2).when(configurationMock2).getDependencies();
            doNothing().when(dependencySetMock2).clear();
            doReturn(pluginPropertiesExtensionMock).when(extensionContainerMock).getByType(PluginPropertiesExtension.class);
            doReturn(extraPropertiesExtensionMock).when(extensionContainerMock2).getExtraProperties();
            doNothing().when(extraPropertiesExtensionMock).set(eq("addQaCheckDependencies"), (Object) any());
            doReturn("", ":x-pack").when(projectMock).getPath();
            doReturn(extensionContainerMock, extensionContainerMock2, extensionContainerMock3).when(projectMock).getExtensions();
            doReturn(namedDomainObjectContainerMock).when(extensionContainerMock3).getByName("testClusters");
            doNothing().when(namedDomainObjectContainerMock).configureEach((Action) any());
            doReturn(projectMock2).when(projectMock).getRootProject();
            Set<Project> projectSet = new HashSet<>();
            projectSet.add(projectMock3);
            doReturn(projectSet).when(projectMock2).getAllprojects();
            doReturn(pluginContainerMock).when(projectMock3).getPlugins();
            doReturn(true).when(pluginContainerMock).hasPlugin(PluginBuildPlugin.class);
            doReturn(extensionContainerMock4).when(projectMock3).getExtensions();
            PluginPropertiesExtension pluginPropertiesExtension = new PluginPropertiesExtension(projectMock4);
            pluginPropertiesExtension.setName("EG");
            doReturn(pluginPropertiesExtension).when(extensionContainerMock4).getByType(PluginPropertiesExtension.class);
            doReturn("CF", "return_of_getPath1").when(projectMock3).getPath();
            doNothing().when(projectMock).afterEvaluate((Action) any());
            baseInternalPluginBuildPlugin.when(() -> BaseInternalPluginBuildPlugin.addNoticeGeneration(projectMock, pluginPropertiesExtensionMock)).thenAnswer((Answer<Void>) invocation -> null);
            gradleUtils.when(() -> GradleUtils.isModuleProject("")).thenReturn(true);
            gradleUtils.when(() -> GradleUtils.isModuleProject("CF")).thenReturn(true);
            BaseInternalPluginBuildPlugin target = new BaseInternalPluginBuildPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(4)).getPluginManager();
                verify(pluginManagerMock).apply(PluginBuildPlugin.class);
                verify(pluginManagerMock2).apply(JarHellPrecommitPlugin.class);
                verify(pluginManagerMock3).apply(ElasticsearchJavaPlugin.class);
                verify(pluginManagerMock4).apply(HistoricalFeaturesMetadataPlugin.class);
                verify(projectMock, times(2)).getConfigurations();
                verify(configurationContainerMock).getByName("compileOnly");
                verify(configurationMock).getDependencies();
                verify(dependencySetMock).clear();
                verify(configurationContainerMock2).getByName("testImplementation");
                verify(configurationMock2).getDependencies();
                verify(dependencySetMock2).clear();
                verify(projectMock, times(3)).getExtensions();
                verify(extensionContainerMock).getByType(PluginPropertiesExtension.class);
                verify(extensionContainerMock2).getExtraProperties();
                verify(extraPropertiesExtensionMock).set(eq("addQaCheckDependencies"), (Object) any());
                verify(projectMock, times(2)).getPath();
                verify(extensionContainerMock3).getByName("testClusters");
                verify(namedDomainObjectContainerMock).configureEach((Action) any());
                verify(projectMock).getRootProject();
                verify(projectMock2).getAllprojects();
                verify(projectMock3, times(2)).getPath();
                verify(projectMock3).getPlugins();
                verify(pluginContainerMock).hasPlugin(PluginBuildPlugin.class);
                verify(projectMock3).getExtensions();
                verify(extensionContainerMock4).getByType(PluginPropertiesExtension.class);
                verify(projectMock).afterEvaluate((Action) any());
                baseInternalPluginBuildPlugin.verify(() -> BaseInternalPluginBuildPlugin.addNoticeGeneration(projectMock, pluginPropertiesExtensionMock), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.isModuleProject(""), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.isModuleProject("CF"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenIsXPackModuleAndDefaultBranchAndDefaultBranchAndDefaultBranch}, hash: BF2894FDCC338CB601E5F938C920367C
    @Disabled()
    @Test()
    void applyWhenIsXPackModuleAndDefaultBranchAndDefaultBranchAndDefaultBranch() throws UnknownConfigurationException, UnknownDomainObjectException {
        /* Branches:
         * (isModule) : true
         * (project.getPath().startsWith(":x-pack")) : true
         * (isModule == false) : false
         * (isXPackModule) : true
         * (branch expression (line 101)) : true
         * (branch expression (line 102)) : true
         * (branch expression (line 103)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class);
            MockedStatic<BaseInternalPluginBuildPlugin> baseInternalPluginBuildPlugin = mockStatic(BaseInternalPluginBuildPlugin.class)) {
            doNothing().when(pluginManagerMock).apply(PluginBuildPlugin.class);
            doNothing().when(pluginManagerMock2).apply(JarHellPrecommitPlugin.class);
            doNothing().when(pluginManagerMock3).apply(ElasticsearchJavaPlugin.class);
            doReturn(pluginManagerMock, pluginManagerMock2, pluginManagerMock3, pluginManagerMock4).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock4).apply(HistoricalFeaturesMetadataPlugin.class);
            doReturn(configurationMock).when(configurationContainerMock).getByName("compileOnly");
            doReturn(dependencySetMock).when(configurationMock).getDependencies();
            doNothing().when(dependencySetMock).clear();
            doReturn(configurationContainerMock, configurationContainerMock2).when(projectMock).getConfigurations();
            doReturn(configurationMock2).when(configurationContainerMock2).getByName("testImplementation");
            doReturn(dependencySetMock2).when(configurationMock2).getDependencies();
            doNothing().when(dependencySetMock2).clear();
            doReturn(pluginPropertiesExtensionMock).when(extensionContainerMock).getByType(PluginPropertiesExtension.class);
            doReturn(extraPropertiesExtensionMock).when(extensionContainerMock2).getExtraProperties();
            doNothing().when(extraPropertiesExtensionMock).set(eq("addQaCheckDependencies"), (Object) any());
            doReturn("", ":x-pack").when(projectMock).getPath();
            doReturn(extensionContainerMock, extensionContainerMock2, extensionContainerMock3).when(projectMock).getExtensions();
            doReturn(namedDomainObjectContainerMock).when(extensionContainerMock3).getByName("testClusters");
            doReturn(projectMock2).when(projectMock).getRootProject();
            Set<Project> projectSet = new HashSet<>();
            projectSet.add(projectMock3);
            doReturn(projectSet).when(projectMock2).getAllprojects();
            doReturn("FG").when(projectMock3).getPath();
            doReturn(pluginContainerMock).when(projectMock3).getPlugins();
            doReturn(true).when(pluginContainerMock).hasPlugin(PluginBuildPlugin.class);
            doReturn(extensionContainerMock4).when(projectMock3).getExtensions();
            PluginPropertiesExtension pluginPropertiesExtension = new PluginPropertiesExtension(projectMock4);
            pluginPropertiesExtension.setName("CH");
            doReturn(pluginPropertiesExtension).when(extensionContainerMock4).getByType(PluginPropertiesExtension.class);
            doNothing().when(projectMock).afterEvaluate((Action) any());
            baseInternalPluginBuildPlugin.when(() -> BaseInternalPluginBuildPlugin.addNoticeGeneration(projectMock, pluginPropertiesExtensionMock)).thenAnswer((Answer<Void>) invocation -> null);
            gradleUtils.when(() -> GradleUtils.isModuleProject("")).thenReturn(true);
            gradleUtils.when(() -> GradleUtils.isModuleProject("FG")).thenReturn(true);
            BaseInternalPluginBuildPlugin target = new BaseInternalPluginBuildPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(4)).getPluginManager();
                verify(pluginManagerMock).apply(PluginBuildPlugin.class);
                verify(pluginManagerMock2).apply(JarHellPrecommitPlugin.class);
                verify(pluginManagerMock3).apply(ElasticsearchJavaPlugin.class);
                verify(pluginManagerMock4).apply(HistoricalFeaturesMetadataPlugin.class);
                verify(projectMock, times(2)).getConfigurations();
                verify(configurationContainerMock).getByName("compileOnly");
                verify(configurationMock).getDependencies();
                verify(dependencySetMock).clear();
                verify(configurationContainerMock2).getByName("testImplementation");
                verify(configurationMock2).getDependencies();
                verify(dependencySetMock2).clear();
                verify(projectMock, times(3)).getExtensions();
                verify(extensionContainerMock).getByType(PluginPropertiesExtension.class);
                verify(extensionContainerMock2).getExtraProperties();
                verify(extraPropertiesExtensionMock).set(eq("addQaCheckDependencies"), (Object) any());
                verify(projectMock, times(2)).getPath();
                verify(extensionContainerMock3).getByName("testClusters");
                verify(projectMock).getRootProject();
                verify(projectMock2).getAllprojects();
                verify(projectMock3).getPath();
                verify(projectMock3).getPlugins();
                verify(pluginContainerMock).hasPlugin(PluginBuildPlugin.class);
                verify(projectMock3).getExtensions();
                verify(extensionContainerMock4).getByType(PluginPropertiesExtension.class);
                verify(projectMock).afterEvaluate((Action) any());
                baseInternalPluginBuildPlugin.verify(() -> BaseInternalPluginBuildPlugin.addNoticeGeneration(projectMock, pluginPropertiesExtensionMock), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.isModuleProject(""), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.isModuleProject("FG"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${findModulePathWhenDefaultBranch}, hash: 4B6D991E51A592F5BFA99C12681F8E96
    @Test()
    void findModulePathWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 101)) : false
         */
        //Arrange Statement(s)
        doReturn(projectMock2).when(projectMock).getRootProject();
        Set<Project> projectSet = new HashSet<>();
        projectSet.add(projectMock3);
        doReturn(projectSet).when(projectMock2).getAllprojects();
        doReturn("A").when(projectMock3).getPath();
        BaseInternalPluginBuildPlugin target = new BaseInternalPluginBuildPlugin();
        //Act Statement(s)
        Optional<String> result = target.findModulePath(projectMock, "pluginName1");
        Optional<String> stringOptional = Optional.empty();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(stringOptional));
            verify(projectMock).getRootProject();
            verify(projectMock2).getAllprojects();
            verify(projectMock3).getPath();
        });
    }

    //Sapient generated method id: ${findModulePathWhenDefaultBranchAndDefaultBranch}, hash: 347DE58A30505C1CF00BEAF18F81FBAC
    @Test()
    void findModulePathWhenDefaultBranchAndDefaultBranch() {
        /* Branches:
         * (branch expression (line 101)) : true
         * (branch expression (line 102)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            doReturn(projectMock2).when(projectMock).getRootProject();
            Set<Project> projectSet = new HashSet<>();
            projectSet.add(projectMock3);
            doReturn(projectSet).when(projectMock2).getAllprojects();
            doReturn("A").when(projectMock3).getPath();
            doReturn(pluginContainerMock).when(projectMock3).getPlugins();
            doReturn(false).when(pluginContainerMock).hasPlugin(PluginBuildPlugin.class);
            gradleUtils.when(() -> GradleUtils.isModuleProject("A")).thenReturn(true);
            BaseInternalPluginBuildPlugin target = new BaseInternalPluginBuildPlugin();
            //Act Statement(s)
            Optional<String> result = target.findModulePath(projectMock, "pluginName1");
            Optional<String> stringOptional = Optional.empty();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(stringOptional));
                verify(projectMock).getRootProject();
                verify(projectMock2).getAllprojects();
                verify(projectMock3).getPath();
                verify(projectMock3).getPlugins();
                verify(pluginContainerMock).hasPlugin(PluginBuildPlugin.class);
                gradleUtils.verify(() -> GradleUtils.isModuleProject("A"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${findModulePathWhenDefaultBranchAndDefaultBranchAndDefaultBranch}, hash: 5F0E3E23C16A08D38F4ACEC94930D987
    @Disabled()
    @Test()
    void findModulePathWhenDefaultBranchAndDefaultBranchAndDefaultBranch() throws UnknownDomainObjectException {
        /* Branches:
         * (branch expression (line 101)) : true
         * (branch expression (line 102)) : true
         * (branch expression (line 103)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            doReturn(projectMock2).when(projectMock).getRootProject();
            Set<Project> projectSet = new HashSet<>();
            projectSet.add(projectMock3);
            doReturn(projectSet).when(projectMock2).getAllprojects();
            doReturn(pluginContainerMock).when(projectMock3).getPlugins();
            doReturn(true).when(pluginContainerMock).hasPlugin(PluginBuildPlugin.class);
            doReturn(extensionContainerMock).when(projectMock3).getExtensions();
            PluginPropertiesExtension pluginPropertiesExtension = new PluginPropertiesExtension(projectMock4);
            pluginPropertiesExtension.setName("B");
            doReturn(pluginPropertiesExtension).when(extensionContainerMock).getByType(PluginPropertiesExtension.class);
            doReturn("A", "return_of_getPath1").when(projectMock3).getPath();
            gradleUtils.when(() -> GradleUtils.isModuleProject("A")).thenReturn(true);
            BaseInternalPluginBuildPlugin target = new BaseInternalPluginBuildPlugin();
            //Act Statement(s)
            Optional<String> result = target.findModulePath(projectMock, "B");
            Optional<String> stringOptional = Optional.of("return_of_getPath1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(stringOptional));
                verify(projectMock).getRootProject();
                verify(projectMock2).getAllprojects();
                verify(projectMock3, times(2)).getPath();
                verify(projectMock3).getPlugins();
                verify(pluginContainerMock).hasPlugin(PluginBuildPlugin.class);
                verify(projectMock3).getExtensions();
                verify(extensionContainerMock).getByType(PluginPropertiesExtension.class);
                gradleUtils.verify(() -> GradleUtils.isModuleProject("A"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${findModulePathWhenDefaultBranchAndDefaultBranchAndDefaultBranch2}, hash: 4D4C2D4327C06E7834F8D2B371D8C691
    @Disabled()
    @Test()
    void findModulePathWhenDefaultBranchAndDefaultBranchAndDefaultBranch2() throws UnknownDomainObjectException {
        /* Branches:
         * (branch expression (line 101)) : true
         * (branch expression (line 102)) : true
         * (branch expression (line 103)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            doReturn(projectMock2).when(projectMock).getRootProject();
            Set<Project> projectSet = new HashSet<>();
            projectSet.add(projectMock3);
            doReturn(projectSet).when(projectMock2).getAllprojects();
            doReturn("A").when(projectMock3).getPath();
            doReturn(pluginContainerMock).when(projectMock3).getPlugins();
            doReturn(true).when(pluginContainerMock).hasPlugin(PluginBuildPlugin.class);
            doReturn(extensionContainerMock).when(projectMock3).getExtensions();
            PluginPropertiesExtension pluginPropertiesExtension = new PluginPropertiesExtension(projectMock4);
            pluginPropertiesExtension.setName("B");
            doReturn(pluginPropertiesExtension).when(extensionContainerMock).getByType(PluginPropertiesExtension.class);
            gradleUtils.when(() -> GradleUtils.isModuleProject("A")).thenReturn(true);
            BaseInternalPluginBuildPlugin target = new BaseInternalPluginBuildPlugin();
            //Act Statement(s)
            Optional<String> result = target.findModulePath(projectMock, "C");
            Optional<String> stringOptional = Optional.empty();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(stringOptional));
                verify(projectMock).getRootProject();
                verify(projectMock2).getAllprojects();
                verify(projectMock3).getPath();
                verify(projectMock3).getPlugins();
                verify(pluginContainerMock).hasPlugin(PluginBuildPlugin.class);
                verify(projectMock3).getExtensions();
                verify(extensionContainerMock).getByType(PluginPropertiesExtension.class);
                gradleUtils.verify(() -> GradleUtils.isModuleProject("A"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${addNoticeGenerationWhenNoticeFileIsNotNull}, hash: 54595F8B1452F1C7A219D897CF30C9A4
    @Disabled()
    @Test()
    void addNoticeGenerationWhenNoticeFileIsNotNull() throws InvalidUserDataException {
        /* Branches:
         * (licenseFile != null) : true
         * (noticeFile != null) : true
         */
        //Arrange Statement(s)
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider<NoticeTask> taskProviderMock = mock(TaskProvider.class);
        CopySpec bundleSpecMock = mock(CopySpec.class);
        CopySpec copySpecMock = mock(CopySpec.class);
        CopySpec copySpecMock2 = mock(CopySpec.class);
        SourceSet sourceSetMock = mock(SourceSet.class);
        SourceDirectorySet sourceDirectorySetMock = mock(SourceDirectorySet.class);
        try (MockedStatic<Util> util = mockStatic(Util.class)) {
            doReturn(taskContainerMock).when(projectMock).getTasks();
            doReturn(taskProviderMock).when(taskContainerMock).register(eq("generateNotice"), eq(NoticeTask.class), (Action) any());
            doReturn(copySpecMock).when(bundleSpecMock).from(eq((File) null), (Action) any());
            Object[] objectArray = new Object[] { taskProviderMock };
            doReturn(copySpecMock2).when(bundleSpecMock).from(objectArray);
            util.when(() -> Util.getJavaMainSourceSet(projectMock)).thenReturn(Optional.of(sourceSetMock));
            doReturn(sourceDirectorySetMock).when(sourceSetMock).getAllJava();
            File file = new File("pathname1");
            File file2 = new File("pathname1");
            PluginPropertiesExtension pluginPropertiesExtension = new PluginPropertiesExtension(projectMock2);
            pluginPropertiesExtension.setNoticeFile(file);
            pluginPropertiesExtension.setBundleSpec(bundleSpecMock);
            pluginPropertiesExtension.setLicenseFile(file2);
            //Act Statement(s)
            BaseInternalPluginBuildPlugin.addNoticeGeneration(projectMock, pluginPropertiesExtension);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).getTasks();
                verify(taskContainerMock).register(eq("generateNotice"), eq(NoticeTask.class), (Action) any());
                verify(bundleSpecMock).from(eq((File) null), (Action) any());
                verify(bundleSpecMock).from(objectArray);
                util.verify(() -> Util.getJavaMainSourceSet(projectMock), atLeast(1));
                verify(sourceSetMock).getAllJava();
            });
        }
    }
}

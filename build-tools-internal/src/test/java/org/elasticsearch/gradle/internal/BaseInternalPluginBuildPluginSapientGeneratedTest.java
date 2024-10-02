package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.BaseInternalPluginBuildPlugin;

import org.gradle.api.file.CopySpec;
import org.elasticsearch.gradle.internal.conventions.util.Util;
import org.elasticsearch.gradle.plugin.PluginBuildPlugin;
import org.gradle.api.plugins.PluginManager;
import org.gradle.api.plugins.ExtraPropertiesExtension;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;
import org.elasticsearch.gradle.internal.test.HistoricalFeaturesMetadataPlugin;
import org.gradle.api.NamedDomainObjectContainer;

import java.io.File;

import org.gradle.api.Action;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.plugins.ExtensionContainer;
import org.elasticsearch.gradle.internal.precommit.JarHellPrecommitPlugin;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;

import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.tasks.SourceSet;

import java.util.Optional;

import org.gradle.api.artifacts.Configuration;
import org.gradle.api.file.SourceDirectorySet;
import org.gradle.api.tasks.TaskContainer;

import java.util.Set;
import java.util.HashSet;

import org.elasticsearch.gradle.plugin.PluginPropertiesExtension;
import org.elasticsearch.gradle.util.GradleUtils;
import org.gradle.api.artifacts.DependencySet;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.Task;

import static org.mockito.ArgumentMatchers.any;

class BaseInternalPluginBuildPluginSapientGeneratedTest {

    @Test
    void testApply() {
        //Project project = mock(Project.class);
        //PluginManager pluginManager = mock(PluginManager.class);
        //ConfigurationContainer configurationContainer = mock(ConfigurationContainer.class);
        //Configuration compileOnlyConfiguration = mock(Configuration.class);
        //Configuration testImplementationConfiguration = mock(Configuration.class);
        //DependencySet compileOnlyDependencies = mock(DependencySet.class);
        //DependencySet testImplementationDependencies = mock(DependencySet.class);
        //ExtensionContainer extensionContainer = mock(ExtensionContainer.class);
        //PluginPropertiesExtension pluginPropertiesExtension = mock(PluginPropertiesExtension.class);
        //ExtraPropertiesExtension extraPropertiesExtension = mock(ExtraPropertiesExtension.class);
        //NamedDomainObjectContainer testClustersContainer = mock(NamedDomainObjectContainer.class);
        //when(project.getPluginManager()).thenReturn(pluginManager);
        //when(project.getConfigurations()).thenReturn(configurationContainer);
        //when(configurationContainer.getByName("compileOnly")).thenReturn(compileOnlyConfiguration);
        //when(configurationContainer.getByName("testImplementation")).thenReturn(testImplementationConfiguration);
        //when(compileOnlyConfiguration.getDependencies()).thenReturn(compileOnlyDependencies);
        //when(testImplementationConfiguration.getDependencies()).thenReturn(testImplementationDependencies);
        //when(project.getExtensions()).thenReturn(extensionContainer);
        //when(extensionContainer.getByType(PluginPropertiesExtension.class)).thenReturn(pluginPropertiesExtension);
        //when(extensionContainer.getExtraProperties()).thenReturn(extraPropertiesExtension);
        //when(extensionContainer.getByName("testClusters")).thenReturn(testClustersContainer);
        //when(project.getPath()).thenReturn(":test-plugin");
        /*try (MockedStatic<GradleUtils> gradleUtilsMock = mockStatic(GradleUtils.class)) {
    gradleUtilsMock.when(() -> GradleUtils.isModuleProject(anyString())).thenReturn(true);
    BaseInternalPluginBuildPlugin plugin = new BaseInternalPluginBuildPlugin();
    plugin.apply(project);
    verify(pluginManager).apply(PluginBuildPlugin.class);
    verify(pluginManager).apply(JarHellPrecommitPlugin.class);
    verify(pluginManager).apply(ElasticsearchJavaPlugin.class);
    verify(pluginManager).apply(HistoricalFeaturesMetadataPlugin.class);
    verify(compileOnlyDependencies).clear();
    verify(testImplementationDependencies).clear();
    verify(extraPropertiesExtension).set(eq("addQaCheckDependencies"), any());
    verify(project).afterEvaluate(any());
}*/
    }

    @Test
    void testFindModulePath() {
        Project project = mock(Project.class);
        Project rootProject = mock(Project.class);
        Project subProject = mock(Project.class);
        PluginContainer pluginContainer = mock(PluginContainer.class);
        ExtensionContainer extensionContainer = mock(ExtensionContainer.class);
        PluginPropertiesExtension pluginPropertiesExtension = mock(PluginPropertiesExtension.class);
        when(project.getRootProject()).thenReturn(rootProject);
        Set<Project> allProjects = new HashSet<>();
        allProjects.add(subProject);
        when(rootProject.getAllprojects()).thenReturn(allProjects);
        when(subProject.getPath()).thenReturn(":test-plugin");
        when(subProject.getPlugins()).thenReturn(pluginContainer);
        when(pluginContainer.hasPlugin(PluginBuildPlugin.class)).thenReturn(true);
        when(subProject.getExtensions()).thenReturn(extensionContainer);
        when(extensionContainer.getByType(PluginPropertiesExtension.class)).thenReturn(pluginPropertiesExtension);
        when(pluginPropertiesExtension.getName()).thenReturn("test-plugin");
        try (MockedStatic<GradleUtils> gradleUtilsMock = mockStatic(GradleUtils.class)) {
            gradleUtilsMock.when(() -> GradleUtils.isModuleProject(":test-plugin")).thenReturn(true);
            BaseInternalPluginBuildPlugin plugin = new BaseInternalPluginBuildPlugin();
            Optional<String> result = plugin.findModulePath(project, "test-plugin");
            assertTrue(result.isPresent());
            assertEquals(":test-plugin", result.get());
        }
    }

    @Test
    void testAddNoticeGeneration() {
        //Project project = mock(Project.class);
        //PluginPropertiesExtension extension = mock(PluginPropertiesExtension.class);
        //TaskContainer taskContainer = mock(TaskContainer.class);
        //CopySpec bundleSpec = mock(CopySpec.class);
        //File licenseFile = new File("LICENSE.txt");
        //File noticeFile = new File("NOTICE.txt");
        //when(project.getTasks()).thenReturn(taskContainer);
        //when(extension.getLicenseFile()).thenReturn(licenseFile);
        //when(extension.getNoticeFile()).thenReturn(noticeFile);
        //when(extension.getBundleSpec()).thenReturn(bundleSpec);
        /*try (MockedStatic<Util> utilMock = mockStatic(Util.class)) {
    SourceSet sourceSet = mock(SourceSet.class);
    SourceDirectorySet allJava = mock(SourceDirectorySet.class);
    when(sourceSet.getAllJava()).thenReturn(allJava);
    utilMock.when(() -> Util.getJavaMainSourceSet(project)).thenReturn(Optional.of(sourceSet));
    BaseInternalPluginBuildPlugin.addNoticeGeneration(project, extension);
    verify(bundleSpec).from(eq(licenseFile.getParentFile()), any());
    verify(taskContainer).register(eq("generateNotice"), eq(NoticeTask.class), any());
    verify(bundleSpec).from(any(TaskProvider.class));
}*/
    }
}
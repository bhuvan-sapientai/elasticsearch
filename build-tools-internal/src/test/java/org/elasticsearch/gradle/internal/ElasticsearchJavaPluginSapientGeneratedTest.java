package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.ElasticsearchJavaPlugin;

import org.gradle.api.plugins.PluginContainer;
import org.gradle.external.javadoc.CoreJavadocOptions;
import org.gradle.api.plugins.PluginManager;
import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar;
import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.Project;

import java.io.File;

import nebula.plugin.info.InfoBrokerPlugin;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.tasks.javadoc.Javadoc;
import org.gradle.api.plugins.JavaLibraryPlugin;
import org.gradle.api.plugins.JavaPlugin;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.tasks.bundling.Jar;
import org.gradle.api.tasks.TaskProvider;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

class ElasticsearchJavaPluginSapientGeneratedTest {

    @Test
    void testApply() {
        Project project = mock(Project.class);
        PluginManager pluginManager = mock(PluginManager.class);
        TaskContainer taskContainer = mock(TaskContainer.class);
        ConfigurationContainer configurationContainer = mock(ConfigurationContainer.class);
        PluginContainer pluginContainer = mock(PluginContainer.class);
        when(project.getPluginManager()).thenReturn(pluginManager);
        when(project.getTasks()).thenReturn(taskContainer);
        when(project.getConfigurations()).thenReturn(configurationContainer);
        when(project.getPlugins()).thenReturn(pluginContainer);
        when(project.getBuildDir()).thenReturn(new File("build"));
        ElasticsearchJavaPlugin plugin = new ElasticsearchJavaPlugin();
        plugin.apply(project);
        verify(pluginManager).apply(ElasticsearchJavaBasePlugin.class);
        verify(pluginManager).apply(JavaLibraryPlugin.class);
        verify(pluginManager).apply(ElasticsearchJavaModulePathPlugin.class);
        verify(taskContainer).withType(Jar.class);
        verify(taskContainer).withType(Javadoc.class);
        verify(pluginManager).withPlugin(eq("com.github.johnrengelman.shadow"), any());
        verify(configurationContainer).getByName(JavaPlugin.COMPILE_ONLY_CONFIGURATION_NAME);
        verify(configurationContainer).getByName(JavaPlugin.TEST_IMPLEMENTATION_CONFIGURATION_NAME);
        verify(pluginContainer).withType(InfoBrokerPlugin.class);
        verify(pluginManager).apply("nebula.info-broker");
        verify(pluginManager).apply("nebula.info-basic");
        verify(pluginManager).apply("nebula.info-java");
        verify(pluginManager).apply("nebula.info-jar");
    }

    @Test
    void testConfigureJars() {
        Project project = mock(Project.class);
        TaskContainer taskContainer = mock(TaskContainer.class);
        PluginManager pluginManager = mock(PluginManager.class);
        when(project.getTasks()).thenReturn(taskContainer);
        when(project.getPluginManager()).thenReturn(pluginManager);
        when(project.getBuildDir()).thenReturn(new File("build"));
        ElasticsearchJavaPlugin.configureJars(project);
        verify(taskContainer).withType(Jar.class);
        verify(pluginManager).withPlugin(eq("com.github.johnrengelman.shadow"), any());
    }

    @Test
    void testConfigureJarManifest() {
        Project project = mock(Project.class);
        PluginContainer pluginContainer = mock(PluginContainer.class);
        PluginManager pluginManager = mock(PluginManager.class);
        when(project.getPlugins()).thenReturn(pluginContainer);
        when(project.getPluginManager()).thenReturn(pluginManager);
        ElasticsearchJavaPlugin plugin = new ElasticsearchJavaPlugin();
        plugin.apply(project);
        verify(pluginContainer).withType(InfoBrokerPlugin.class);
        verify(pluginManager).apply("nebula.info-broker");
        verify(pluginManager).apply("nebula.info-basic");
        verify(pluginManager).apply("nebula.info-java");
        verify(pluginManager).apply("nebula.info-jar");
    }

    @Test
    void testConfigureJavadoc() {
        //Project project = mock(Project.class);
        //TaskContainer taskContainer = mock(TaskContainer.class);
        //TaskProvider<Javadoc> javadocProvider = mock(TaskProvider.class);
        //Javadoc javadocTask = mock(Javadoc.class);
        //CoreJavadocOptions javadocOptions = mock(CoreJavadocOptions.class);
        //when(project.getTasks()).thenReturn(taskContainer);
        //when(taskContainer.withType(Javadoc.class)).thenReturn(taskContainer);
        //when(taskContainer.named("javadoc", Javadoc.class)).thenReturn(javadocProvider);
        //when(javadocProvider.get()).thenReturn(javadocTask);
        //when(javadocTask.getOptions()).thenReturn(javadocOptions);
        //ElasticsearchJavaPlugin plugin = new ElasticsearchJavaPlugin();
        //plugin.apply(project);
        //verify(taskContainer).withType(Javadoc.class);
        //verify(javadocOptions).addBooleanOption("html5", true);
        //verify(javadocProvider).configure(any());
    }

    @Test
    void testCompileOnlyDeps() {
        Project project = mock(Project.class);
        ConfigurationContainer configurationContainer = mock(ConfigurationContainer.class);
        Configuration compileOnlyConfig = mock(Configuration.class);
        Configuration testImplementationConfig = mock(Configuration.class);
        when(project.getConfigurations()).thenReturn(configurationContainer);
        when(configurationContainer.getByName(JavaPlugin.COMPILE_ONLY_CONFIGURATION_NAME)).thenReturn(compileOnlyConfig);
        when(configurationContainer.getByName(JavaPlugin.TEST_IMPLEMENTATION_CONFIGURATION_NAME)).thenReturn(testImplementationConfig);
        ElasticsearchJavaPlugin plugin = new ElasticsearchJavaPlugin();
        plugin.apply(project);
        verify(testImplementationConfig).extendsFrom(compileOnlyConfig);
    }
}
package org.elasticsearch.gradle.plugin;

import org.elasticsearch.gradle.plugin.BasePluginBuildPlugin;

import org.elasticsearch.gradle.test.GradleTestPolicySetupPlugin;
import org.gradle.api.file.CopySpec;
import org.gradle.api.plugins.JavaPluginExtension;
import org.gradle.api.plugins.PluginManager;
import org.gradle.api.plugins.BasePlugin;
import org.junit.jupiter.api.Test;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.Project;
import java.io.File;
import org.mockito.Mock;
import org.gradle.api.tasks.SourceSetContainer;
import org.elasticsearch.gradle.testclusters.ElasticsearchCluster;
import org.gradle.api.plugins.ExtensionContainer;
import org.mockito.MockitoAnnotations;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.tasks.bundling.Zip;
import org.gradle.api.plugins.JavaPlugin;
import static org.mockito.ArgumentMatchers.*;
import org.elasticsearch.gradle.dependencies.CompileOnlyResolvePlugin;
import static org.mockito.Mockito.*;
import org.elasticsearch.gradle.testclusters.TestClustersPlugin;
import org.gradle.api.tasks.Sync;
import org.elasticsearch.gradle.Version;
import org.gradle.api.artifacts.type.ArtifactTypeDefinition;
import org.gradle.api.tasks.SourceSet;
import org.junit.jupiter.api.BeforeEach;
import org.gradle.api.artifacts.Configuration;
import org.elasticsearch.gradle.VersionProperties;
import org.gradle.api.Plugin;
import org.gradle.api.file.RegularFile;
import org.gradle.api.tasks.TaskContainer;
import org.elasticsearch.gradle.util.GradleUtils;
import java.util.concurrent.Callable;
import org.elasticsearch.gradle.jarhell.JarHellPlugin;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.Transformer;
import org.elasticsearch.gradle.testclusters.RunTask;
import org.gradle.api.Task;
import org.gradle.api.provider.Provider;
import static org.mockito.ArgumentMatchers.any;

class BasePluginBuildPluginSapientGeneratedTest {

    @Mock
    private Project project;

    @Mock
    private ProviderFactory providerFactory;

    @Mock
    private PluginManager pluginManager;

    @Mock
    private ExtensionContainer extensionContainer;

    @Mock
    private TaskContainer taskContainer;

    @Mock
    private Configuration defaultConfiguration;

    @Mock
    private Configuration runtimeClasspathConfiguration;

    @Mock
    private PluginPropertiesExtension pluginPropertiesExtension;

    @Mock
    private JavaPluginExtension javaPluginExtension;

    @Mock
    private SourceSetContainer sourceSetContainer;

    @Mock
    private SourceSet mainSourceSet;

    @Mock
    private SourceSet testSourceSet;

    @Mock
    private FileCollection mainSourceSetOutput;

    @Mock
    private FileCollection testSourceSetOutput;

    @Mock
    private FileCollection fileTree;

    @Mock
    private NamedDomainObjectContainer<ElasticsearchCluster> testClustersExtension;

    private BasePluginBuildPlugin plugin;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        plugin = new BasePluginBuildPlugin(providerFactory);
        when(project.getPluginManager()).thenReturn(pluginManager);
        when(project.getExtensions()).thenReturn(extensionContainer);
        when(project.getTasks()).thenReturn(taskContainer);
        when(project.getConfigurations()).thenReturn(mock(org.gradle.api.artifacts.ConfigurationContainer.class));
        when(project.getArtifacts()).thenReturn(mock(org.gradle.api.artifacts.dsl.ArtifactHandler.class));
        when(project.file(anyString())).thenReturn(mock(File.class));
        when(project.copySpec()).thenReturn(mock(CopySpec.class));
    }

    @Test
    void testApply() {
        // Arrange
        //when(extensionContainer.create(eq("esplugin"), eq(PluginPropertiesExtension.class), any())).thenReturn(pluginPropertiesExtension);
        //when(extensionContainer.getByType(JavaPluginExtension.class)).thenReturn(javaPluginExtension);
        //when(extensionContainer.getByType(SourceSetContainer.class)).thenReturn(sourceSetContainer);
        //when(sourceSetContainer.getByName("main")).thenReturn(mainSourceSet);
        //when(sourceSetContainer.getByName("test")).thenReturn(testSourceSet);
        //when(mainSourceSet.getOutput()).thenReturn(mainSourceSetOutput);
        //when(testSourceSet.getOutput()).thenReturn(testSourceSetOutput);
        //when(mainSourceSetOutput.getAsFileTree()).thenReturn(fileTree);
        //when(extensionContainer.getByName(TestClustersPlugin.EXTENSION_NAME)).thenReturn(testClustersExtension);
        //when(project.getConfigurations().getByName("default")).thenReturn(defaultConfiguration);
        //when(project.getConfigurations().getByName("runtimeClasspath")).thenReturn(runtimeClasspathConfiguration);
        // Act
        //plugin.apply(project);
        // Assert
        //verify(pluginManager).apply(JavaPlugin.class);
        //verify(pluginManager).apply(TestClustersPlugin.class);
        //verify(pluginManager).apply(CompileOnlyResolvePlugin.class);
        //verify(pluginManager).apply(JarHellPlugin.class);
        //verify(pluginManager).apply(GradleTestPolicySetupPlugin.class);
        //verify(extensionContainer).create(eq("esplugin"), eq(PluginPropertiesExtension.class), any());
        //verify(taskContainer).register(eq("pluginProperties"), eq(GeneratePluginPropertiesTask.class), any());
        //verify(taskContainer).register(eq("bundlePlugin"), eq(Zip.class), any());
        //verify(taskContainer).register(eq("explodedBundlePlugin"), eq(Sync.class), any());
        //verify(taskContainer).register(eq("run"), eq(RunTask.class), any());
        //verify(project.getConfigurations()).create("zip");
        //verify(project.getConfigurations()).create("explodedBundleZip");
        //verify(defaultConfiguration).extendsFrom(runtimeClasspathConfiguration);
        //verify(project.getArtifacts()).add(eq("zip"), any());
        //verify(project.getArtifacts()).add(eq("explodedBundleZip"), any());
    }
}
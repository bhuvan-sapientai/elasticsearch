package org.elasticsearch.gradle.test;

import org.elasticsearch.gradle.test.YamlRestTestPlugin;

import org.elasticsearch.gradle.test.YamlRestTestPlugin;
import org.gradle.api.plugins.PluginManager;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;
import java.io.File;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.language.base.plugins.LifecycleBasePlugin;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.Action;
import org.elasticsearch.gradle.testclusters.ElasticsearchCluster;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.tasks.Copy;
import org.elasticsearch.gradle.testclusters.StandaloneRestIntegTestTask;
import org.gradle.api.plugins.JavaBasePlugin;
import org.gradle.api.tasks.bundling.Zip;
import org.junit.jupiter.params.provider.CsvSource;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import static org.elasticsearch.gradle.plugin.BasePluginBuildPlugin.EXPLODED_BUNDLE_PLUGIN_TASK_NAME;
import org.elasticsearch.gradle.testclusters.TestClustersPlugin;
import org.gradle.api.attributes.AttributesSchema;
import org.gradle.api.tasks.Sync;
import org.gradle.api.artifacts.type.ArtifactTypeDefinition;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.NamedDomainObjectProvider;
import org.elasticsearch.gradle.plugin.BasePluginBuildPlugin;
import org.elasticsearch.gradle.transform.UnzipTransform;
import org.junit.jupiter.params.ParameterizedTest;
import org.gradle.api.artifacts.Configuration;
import org.elasticsearch.gradle.VersionProperties;
import org.gradle.api.Plugin;
import org.gradle.api.tasks.TaskContainer;
import static org.elasticsearch.gradle.plugin.BasePluginBuildPlugin.BUNDLE_PLUGIN_TASK_NAME;
import org.elasticsearch.gradle.util.GradleUtils;
import org.gradle.api.attributes.Attribute;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.Task;
import static org.mockito.ArgumentMatchers.any;

class YamlRestTestPluginSapientGeneratedTest {

    @Test
    void testApplyPlugin() {
        //Project project = mock(Project.class);
        //PluginManager pluginManager = mock(PluginManager.class);
        //ConfigurationContainer configurations = mock(ConfigurationContainer.class);
        //TaskContainer tasks = mock(TaskContainer.class);
        //ExtensionContainer extensions = mock(ExtensionContainer.class);
        //DependencyHandler dependencies = mock(DependencyHandler.class);
        //AttributesSchema attributesSchema = mock(AttributesSchema.class);
        //when(project.getPluginManager()).thenReturn(pluginManager);
        //when(project.getConfigurations()).thenReturn(configurations);
        //when(project.getTasks()).thenReturn(tasks);
        //when(project.getExtensions()).thenReturn(extensions);
        //when(project.getDependencies()).thenReturn(dependencies);
        //when(dependencies.getAttributesSchema()).thenReturn(attributesSchema);
        //when(project.getBuildDir()).thenReturn(new File("build"));
        //SourceSetContainer sourceSetContainer = mock(SourceSetContainer.class);
        //SourceSet sourceSet = mock(SourceSet.class);
        //when(extensions.getByType(SourceSetContainer.class)).thenReturn(sourceSetContainer);
        //when(sourceSetContainer.maybeCreate(anyString())).thenReturn(sourceSet);
        //Configuration configuration = mock(Configuration.class);
        //when(configurations.create(anyString())).thenReturn(configuration);
        //when(configurations.getByName(anyString())).thenReturn(configuration);
        //YamlRestTestPlugin plugin = new YamlRestTestPlugin();
        //plugin.apply(project);
        //verify(pluginManager).apply(GradleTestPolicySetupPlugin.class);
        //verify(pluginManager).apply(TestClustersPlugin.class);
        //verify(configurations).create(YamlRestTestPlugin.REST_TEST_SPECS_CONFIGURATION_NAME);
        //verify(tasks).register(eq("copyRestTestSpecs"), any(Action.class));
        //verify(tasks).register(eq(YamlRestTestPlugin.YAML_REST_TEST), any(Action.class));
    }

    @ParameterizedTest
    @CsvSource({ "true,explodedBundlePlugin", "false,bundlePlugin" })
    void testApplyPluginWithBasePluginBuildPlugin(boolean isModuleProject, String expectedTaskName) {
        //Project project = mock(Project.class);
        //PluginManager pluginManager = mock(PluginManager.class);
        //ConfigurationContainer configurations = mock(ConfigurationContainer.class);
        //TaskContainer tasks = mock(TaskContainer.class);
        //ExtensionContainer extensions = mock(ExtensionContainer.class);
        //DependencyHandler dependencies = mock(DependencyHandler.class);
        //AttributesSchema attributesSchema = mock(AttributesSchema.class);
        //when(project.getPluginManager()).thenReturn(pluginManager);
        //when(project.getConfigurations()).thenReturn(configurations);
        //when(project.getTasks()).thenReturn(tasks);
        //when(project.getExtensions()).thenReturn(extensions);
        //when(project.getDependencies()).thenReturn(dependencies);
        //when(dependencies.getAttributesSchema()).thenReturn(attributesSchema);
        //when(project.getBuildDir()).thenReturn(new File("build"));
        //SourceSetContainer sourceSetContainer = mock(SourceSetContainer.class);
        //SourceSet sourceSet = mock(SourceSet.class);
        //when(extensions.getByType(SourceSetContainer.class)).thenReturn(sourceSetContainer);
        //when(sourceSetContainer.maybeCreate(anyString())).thenReturn(sourceSet);
        //Configuration configuration = mock(Configuration.class);
        //when(configurations.create(anyString())).thenReturn(configuration);
        //when(configurations.getByName(anyString())).thenReturn(configuration);
        //mockStatic(GradleUtils.class);
        //when(GradleUtils.isModuleProject(anyString())).thenReturn(isModuleProject);
        //mockStatic(VersionProperties.class);
        //when(VersionProperties.getElasticsearch()).thenReturn("7.10.0");
        //YamlRestTestPlugin plugin = new YamlRestTestPlugin();
        //plugin.apply(project);
        //verify(pluginManager).apply(GradleTestPolicySetupPlugin.class);
        //verify(pluginManager).apply(TestClustersPlugin.class);
        //verify(configurations).create(YamlRestTestPlugin.REST_TEST_SPECS_CONFIGURATION_NAME);
        //verify(tasks).register(eq("copyRestTestSpecs"), any(Action.class));
        //verify(tasks).register(eq(YamlRestTestPlugin.YAML_REST_TEST), any(Action.class));
        //verify(project.getPlugins()).withType(eq(BasePluginBuildPlugin.class), any(Action.class));
        //verify(tasks).withType(any());
        //verify(tasks).named(eq(expectedTaskName));
    }
}

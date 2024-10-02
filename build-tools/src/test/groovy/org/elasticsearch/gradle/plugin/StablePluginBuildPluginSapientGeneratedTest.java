package org.elasticsearch.gradle.plugin;

import org.elasticsearch.gradle.plugin.StablePluginBuildPlugin;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.plugins.PluginManager;
import static org.mockito.ArgumentMatchers.any;
import org.elasticsearch.gradle.plugin.StablePluginBuildPlugin;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;
import org.mockito.Mock;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.Action;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.file.ProjectLayout;
import org.gradle.api.plugins.ExtensionContainer;
import org.mockito.MockitoAnnotations;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.api.artifacts.Dependency;
import static org.mockito.Mockito.*;
import org.gradle.api.tasks.SourceSetOutput;
import org.gradle.api.tasks.SourceSet;
import org.junit.jupiter.api.BeforeEach;
import org.gradle.api.artifacts.Configuration;
import org.elasticsearch.gradle.VersionProperties;
import org.gradle.api.Plugin;
import org.gradle.api.file.RegularFile;
import org.gradle.api.tasks.TaskCollection;
import org.gradle.api.tasks.TaskContainer;
import org.elasticsearch.gradle.util.GradleUtils;
import static org.junit.jupiter.api.Assertions.*;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.provider.Provider;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

class StablePluginBuildPluginSapientGeneratedTest {

    @Mock
    private Project project;

    @Mock
    private PluginManager pluginManager;

    @Mock
    private TaskContainer taskContainer;

    @Mock
    private TaskCollection<GeneratePluginPropertiesTask> taskCollection;

    @Mock
    private TaskProvider<GeneratePluginPropertiesTask> taskProvider;

    @Mock
    private ProjectLayout projectLayout;

    @Mock
    private DirectoryProperty directoryProperty;

    @Mock
    private Provider<RegularFile> regularFileProvider;

    @Mock
    private TaskProvider<GenerateNamedComponentsTask> namedComponentsTaskProvider;

    @Mock
    private ConfigurationContainer configurationContainer;

    @Mock
    private Configuration compileClasspathConfiguration;

    @Mock
    private Configuration pluginScannerConfiguration;

    @Mock
    private DependencyHandler dependencyHandler;

    @Mock
    private ExtensionContainer extensionContainer;

    @Mock
    private PluginPropertiesExtension pluginPropertiesExtension;

    @Mock
    private SourceSetContainer sourceSetContainer;

    @Mock
    private SourceSet mainSourceSet;

    @Mock
    private SourceSetOutput sourceSetOutput;

    @Mock
    private FileCollection classesDirs;

    @Mock
    private FileCollection dependencyJars;

    @Mock
    private FileCollection classPath;

    private StablePluginBuildPlugin plugin;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        plugin = new StablePluginBuildPlugin();
        when(project.getPluginManager()).thenReturn(pluginManager);
        when(project.getTasks()).thenReturn(taskContainer);
        when(project.getLayout()).thenReturn(projectLayout);
        when(project.getConfigurations()).thenReturn(configurationContainer);
        when(project.getDependencies()).thenReturn(dependencyHandler);
        when(project.getExtensions()).thenReturn(extensionContainer);
        when(taskContainer.withType(GeneratePluginPropertiesTask.class)).thenReturn(taskCollection);
        when(taskCollection.named("pluginProperties")).thenReturn(taskProvider);
        when(projectLayout.getBuildDirectory()).thenReturn(directoryProperty);
        when(directoryProperty.file(anyString())).thenReturn(regularFileProvider);
        when(taskContainer.register(eq("pluginNamedComponents"), eq(GenerateNamedComponentsTask.class), any(Action.class))).thenReturn(namedComponentsTaskProvider);
        when(configurationContainer.getByName("compileClasspath")).thenReturn(compileClasspathConfiguration);
        when(configurationContainer.create("pluginScannerConfig")).thenReturn(pluginScannerConfiguration);
        when(extensionContainer.getByType(PluginPropertiesExtension.class)).thenReturn(pluginPropertiesExtension);
    }

    @Disabled()
    @Test
    void testApply() {
        try (var gradleUtilsMockedStatic = mockStatic(GradleUtils.class);
            var versionPropertiesMockedStatic = mockStatic(VersionProperties.class)) {
            gradleUtilsMockedStatic.when(() -> GradleUtils.getJavaSourceSets(project)).thenReturn(sourceSetContainer);
            when(sourceSetContainer.findByName(SourceSet.MAIN_SOURCE_SET_NAME)).thenReturn(mainSourceSet);
            when(mainSourceSet.getOutput()).thenReturn(sourceSetOutput);
            when(sourceSetOutput.getClassesDirs()).thenReturn(classesDirs);
            when(compileClasspathConfiguration.plus(classesDirs)).thenReturn(classPath);
            versionPropertiesMockedStatic.when(VersionProperties::getElasticsearch).thenReturn("7.10.0");
            plugin.apply(project);
            verify(pluginManager).apply(BasePluginBuildPlugin.class);
            verify(taskProvider).configure(any());
            verify(namedComponentsTaskProvider).configure(any());
            verify(pluginScannerConfiguration).defaultDependencies(any());
            verify(pluginPropertiesExtension).getBundleSpec();
            gradleUtilsMockedStatic.verify(() -> GradleUtils.getJavaSourceSets(project));
            versionPropertiesMockedStatic.verify(VersionProperties::getElasticsearch);
        }
    }

    @Disabled()
    @Test
    void testPluginPropertiesTaskConfiguration() {
        plugin.apply(project);
        verify(taskProvider).configure(argThat(action -> {
            GeneratePluginPropertiesTask task = mock(GeneratePluginPropertiesTask.class);
            action.execute(task);
            verify(task).getIsStable();
            verify(task).getOutputFile();
            return true;
        }));
    }

    @Disabled()
    @Test
    void testPluginNamedComponentsTaskConfiguration() {
        plugin.apply(project);
        verify(namedComponentsTaskProvider).configure(argThat(action -> {
            GenerateNamedComponentsTask task = mock(GenerateNamedComponentsTask.class);
            action.execute(task);
            verify(task).setClasspath(any(FileCollection.class));
            verify(task).setPluginScannerClasspath(pluginScannerConfiguration);
            return true;
        }));
    }

    @Disabled()
    @Test
    void testPluginScannerConfigurationSetup() {
        when(dependencyHandler.create("org.elasticsearch:elasticsearch-plugin-scanner:7.10.0")).thenReturn(mock(Dependency.class));
        plugin.apply(project);
        verify(configurationContainer).create("pluginScannerConfig");
        verify(pluginScannerConfiguration).defaultDependencies(any());
    }

    @Disabled()
    @Test
    void testPluginExtensionConfiguration() {
        plugin.apply(project);
        verify(extensionContainer).getByType(PluginPropertiesExtension.class);
        verify(pluginPropertiesExtension).getBundleSpec();
    }
}

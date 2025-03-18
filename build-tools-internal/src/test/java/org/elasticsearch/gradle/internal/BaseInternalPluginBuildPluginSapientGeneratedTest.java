package org.elasticsearch.gradle.internal;

// import org.elasticsearch.gradle.internal.BaseInternalPluginBuildPlugin;
// import org.elasticsearch.gradle.internal.BaseInternalPluginBuildPlugin;
// import org.gradle.api.file.CopySpec;
// import org.elasticsearch.gradle.internal.conventions.util.Util;
// import org.elasticsearch.gradle.plugin.PluginBuildPlugin;
// import org.gradle.api.plugins.PluginManager;
// import org.gradle.api.plugins.ExtraPropertiesExtension;
// import org.junit.jupiter.api.Test;
// import org.elasticsearch.gradle.internal.test.HistoricalFeaturesMetadataPlugin;
// import org.gradle.api.Project;
// import java.io.File;
// import org.mockito.Mock;
// import org.gradle.api.plugins.ExtensionContainer;
// import org.mockito.MockitoAnnotations;
// import org.elasticsearch.gradle.internal.precommit.JarHellPrecommitPlugin;
// import static org.mockito.ArgumentMatchers.*;
// import static org.mockito.Mockito.*;
// import org.gradle.api.plugins.PluginContainer;
// import org.gradle.api.tasks.SourceSet;
// import org.junit.jupiter.api.BeforeEach;
// import java.util.Optional;
// import org.gradle.api.artifacts.Configuration;
// import org.gradle.api.file.SourceDirectorySet;
// import org.gradle.api.tasks.TaskContainer;
// import org.elasticsearch.gradle.plugin.PluginPropertiesExtension;
// import org.elasticsearch.gradle.util.GradleUtils;
// import org.gradle.api.artifacts.DependencySet;
// import static org.junit.jupiter.api.Assertions.*;
// import org.gradle.api.tasks.TaskProvider;
// import org.gradle.api.Task;
// import static org.mockito.ArgumentMatchers.any;

class BaseInternalPluginBuildPluginSapientGeneratedTest {

//     @Mock
//     private Project project;

//     @Mock
//     private PluginManager pluginManager;

//     @Mock
//     private ConfigurationContainer configurationContainer;

//     @Mock
//     private Configuration compileOnlyConfiguration;

//     @Mock
//     private Configuration testImplementationConfiguration;

//     @Mock
//     private DependencySet compileOnlyDependencies;

//     @Mock
//     private DependencySet testImplementationDependencies;

//     @Mock
//     private ExtensionContainer extensionContainer;

//     @Mock
//     private PluginPropertiesExtension pluginPropertiesExtension;

//     @Mock
//     private ExtraPropertiesExtension extraPropertiesExtension;

//     @Mock
//     private TaskContainer taskContainer;

//     @Mock
//     private CopySpec bundleSpec;

//     private BaseInternalPluginBuildPlugin plugin;

//     @BeforeEach
//     void setUp() {
//         MockitoAnnotations.openMocks(this);
//         plugin = new BaseInternalPluginBuildPlugin();
//         when(project.getPluginManager()).thenReturn(pluginManager);
//         when(project.getConfigurations()).thenReturn(configurationContainer);
//         when(configurationContainer.getByName("compileOnly")).thenReturn(compileOnlyConfiguration);
//         when(configurationContainer.getByName("testImplementation")).thenReturn(testImplementationConfiguration);
//         when(compileOnlyConfiguration.getDependencies()).thenReturn(compileOnlyDependencies);
//         when(testImplementationConfiguration.getDependencies()).thenReturn(testImplementationDependencies);
//         when(project.getExtensions()).thenReturn(extensionContainer);
//         when(extensionContainer.getByType(PluginPropertiesExtension.class)).thenReturn(pluginPropertiesExtension);
//         when(extensionContainer.getExtraProperties()).thenReturn(extraPropertiesExtension);
//         when(project.getTasks()).thenReturn(taskContainer);
//     }

//     @Test
//     void testApply() {
//         plugin.apply(project);
//         verify(pluginManager).apply(PluginBuildPlugin.class);
//         verify(pluginManager).apply(JarHellPrecommitPlugin.class);
//         verify(pluginManager).apply(ElasticsearchJavaPlugin.class);
//         verify(pluginManager).apply(HistoricalFeaturesMetadataPlugin.class);
//         verify(compileOnlyDependencies).clear();
//         verify(testImplementationDependencies).clear();
//         verify(extraPropertiesExtension).set(eq("addQaCheckDependencies"), any());
//         verify(project).afterEvaluate(any());
//     }

//     @Test
//     void testFindModulePath() {
//         Project rootProject = mock(Project.class);
//         Project subProject = mock(Project.class);
//         PluginContainer pluginContainer = mock(PluginContainer.class);
//         when(project.getRootProject()).thenReturn(rootProject);
//         when(rootProject.getAllprojects()).thenReturn(Set.of(subProject));
//         when(subProject.getPath()).thenReturn(":test-plugin");
//         when(subProject.getPlugins()).thenReturn(pluginContainer);
//         when(pluginContainer.hasPlugin(PluginBuildPlugin.class)).thenReturn(true);
//         when(subProject.getExtensions()).thenReturn(extensionContainer);
//         when(extensionContainer.getByType(PluginPropertiesExtension.class)).thenReturn(pluginPropertiesExtension);
//         when(pluginPropertiesExtension.getName()).thenReturn("test-plugin");
//         try (var gradleUtilsMock = mockStatic(GradleUtils.class)) {
//             gradleUtilsMock.when(() -> GradleUtils.isModuleProject(":test-plugin")).thenReturn(true);
//             Optional<String> result = plugin.findModulePath(project, "test-plugin");
//             assertTrue(result.isPresent());
//             assertEquals(":test-plugin", result.get());
//         }
//     }

//     @Test
//     void testAddNoticeGeneration() {
//         File licenseFile = new File("LICENSE.txt");
//         File noticeFile = new File("NOTICE.txt");
//         when(pluginPropertiesExtension.getLicenseFile()).thenReturn(licenseFile);
//         when(pluginPropertiesExtension.getNoticeFile()).thenReturn(noticeFile);
//         when(pluginPropertiesExtension.getBundleSpec()).thenReturn(bundleSpec);
//         try (var utilMock = mockStatic(Util.class)) {
//             SourceSet sourceSet = mock(SourceSet.class);
//             SourceDirectorySet allJava = mock(SourceDirectorySet.class);
//             when(sourceSet.getAllJava()).thenReturn(allJava);
//             utilMock.when(() -> Util.getJavaMainSourceSet(project)).thenReturn(Optional.of(sourceSet));
//             TaskProvider<Task> taskProvider = mock(TaskProvider.class);
//             when(taskContainer.register(eq("generateNotice"), eq(NoticeTask.class), any())).thenReturn(taskProvider);
//             BaseInternalPluginBuildPlugin.addNoticeGeneration(project, pluginPropertiesExtension);
//             verify(bundleSpec).from(eq(licenseFile.getParentFile()), any());
//             verify(taskContainer).register(eq("generateNotice"), eq(NoticeTask.class), any());
//             verify(bundleSpec).from(taskProvider);
//         }
//     }
}
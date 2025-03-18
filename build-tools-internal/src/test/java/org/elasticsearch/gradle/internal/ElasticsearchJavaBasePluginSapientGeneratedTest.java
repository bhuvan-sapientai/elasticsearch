package org.elasticsearch.gradle.internal;

// import org.elasticsearch.gradle.internal.ElasticsearchJavaBasePlugin;
// import org.elasticsearch.gradle.internal.conventions.precommit.PrecommitTaskPlugin;
// import org.gradle.api.tasks.compile.JavaCompile;
// import org.gradle.api.plugins.JavaPluginExtension;
// import org.gradle.api.plugins.PluginManager;
// import org.gradle.api.tasks.compile.AbstractCompile;
// import org.junit.jupiter.api.Test;
// import org.gradle.api.Project;
// import java.util.function.Supplier;
// import org.mockito.Mock;
// import org.gradle.api.tasks.SourceSetContainer;
// import org.gradle.api.JavaVersion;
// import org.gradle.api.artifacts.ConfigurationContainer;
// import org.gradle.api.plugins.ExtensionContainer;
// import org.gradle.api.artifacts.ResolutionStrategy;
// import org.mockito.MockitoAnnotations;
// import org.gradle.api.plugins.JavaBasePlugin;
// import org.gradle.api.tasks.compile.GroovyCompile;
// import static org.mockito.ArgumentMatchers.*;
// import org.elasticsearch.gradle.internal.info.GlobalBuildInfoPlugin;
// import org.gradle.api.tasks.compile.CompileOptions;
// import static org.mockito.Mockito.*;
// import java.util.HashMap;
// import java.util.List;
// import org.gradle.api.tasks.SourceSet;
// import org.junit.jupiter.api.BeforeEach;
// import java.util.Map;
// import org.gradle.normalization.RuntimeClasspathNormalization;
// import org.gradle.api.artifacts.Configuration;
// import org.elasticsearch.gradle.VersionProperties;
// import org.elasticsearch.gradle.test.SystemPropertyCommandLineArgumentProvider;
// import org.elasticsearch.gradle.internal.info.BuildParams;
// import org.gradle.api.tasks.TaskContainer;
// import org.gradle.api.tasks.testing.Test;
// import org.elasticsearch.gradle.internal.test.MutedTestPlugin;
// import org.elasticsearch.gradle.util.GradleUtils;
// import org.gradle.jvm.toolchain.JavaToolchainService;
// import org.gradle.jvm.toolchain.JavaLanguageVersion;
// import org.gradle.api.file.FileCollection;
// import org.gradle.api.provider.Provider;
// import static org.mockito.ArgumentMatchers.any;

class ElasticsearchJavaBasePluginSapientGeneratedTest {

//     @Mock
//     private Project project;

//     @Mock
//     private PluginManager pluginManager;

//     @Mock
//     private ExtensionContainer extensionContainer;

//     @Mock
//     private JavaPluginExtension javaPluginExtension;

//     @Mock
//     private TaskContainer taskContainer;

//     @Mock
//     private ConfigurationContainer configurationContainer;

//     @Mock
//     private JavaToolchainService javaToolchainService;

//     @Mock
//     private RuntimeClasspathNormalization runtimeClasspathNormalization;

//     private ElasticsearchJavaBasePlugin plugin;

//     @BeforeEach
//     void setUp() {
//         MockitoAnnotations.openMocks(this);
//         plugin = new ElasticsearchJavaBasePlugin(javaToolchainService);
//         when(project.getPluginManager()).thenReturn(pluginManager);
//         when(project.getExtensions()).thenReturn(extensionContainer);
//         when(project.getTasks()).thenReturn(taskContainer);
//         when(project.getConfigurations()).thenReturn(configurationContainer);
//         when(extensionContainer.getByType(JavaPluginExtension.class)).thenReturn(javaPluginExtension);
//         when(project.getNormalization()).thenReturn(mock(org.gradle.api.normalization.Normalization.class));
//         when(project.getNormalization().getRuntimeClasspath()).thenReturn(runtimeClasspathNormalization);
//     }

//     @Test
//     void testApply() {
//         plugin.apply(project);
//         verify(pluginManager).apply(JavaBasePlugin.class);
//         verify(pluginManager).apply(RepositoriesSetupPlugin.class);
//         verify(pluginManager).apply(ElasticsearchTestBasePlugin.class);
//         verify(pluginManager).apply(PrecommitTaskPlugin.class);
//         verify(pluginManager).apply(MutedTestPlugin.class);
//         verify(runtimeClasspathNormalization).ignore("META-INF/MANIFEST.MF");
//         verify(runtimeClasspathNormalization).ignore("IMPL-JARS/**/META-INF/MANIFEST.MF");
//         verify(extensionContainer.getExtraProperties()).set(eq("versions"), any());
//     }

//     @Test
//     void testConfigureConfigurations() {
//         when(project.getPath()).thenReturn("someNonMatchingPath");
//         SourceSetContainer sourceSetContainer = mock(SourceSetContainer.class);
//         when(extensionContainer.getByType(SourceSetContainer.class)).thenReturn(sourceSetContainer);
//         ElasticsearchJavaBasePlugin.configureConfigurations(project);
//         verify(configurationContainer).all(any());
//         verify(sourceSetContainer).all(any());
//     }

//     @Test
//     void testConfigureCompile() {
//         when(BuildParams.getJavaToolChainSpec()).thenReturn(Optional.empty());
//         when(BuildParams.getMinimumRuntimeVersion()).thenReturn(JavaVersion.VERSION_11);
//         when(BuildParams.isCi()).thenReturn(false);
//         JavaCompile javaCompile = mock(JavaCompile.class);
//         when(taskContainer.withType(JavaCompile.class)).thenReturn(mockTaskCollection(javaCompile));
//         when(javaCompile.getOptions()).thenReturn(mock(CompileOptions.class));
//         GroovyCompile groovyCompile = mock(GroovyCompile.class);
//         when(taskContainer.withType(GroovyCompile.class)).thenReturn(mockTaskCollection(groovyCompile));
//         when(groovyCompile.getOptions()).thenReturn(mock(CompileOptions.class));
//         plugin.configureCompile(project);
//         verify(extensionContainer.getExtraProperties()).set("compactProfile", "full");
//         verify(javaPluginExtension).setSourceCompatibility(JavaVersion.VERSION_11);
//         verify(javaPluginExtension).setTargetCompatibility(JavaVersion.VERSION_11);
//         verify(javaCompile.getOptions()).setEncoding("UTF-8");
//         verify(javaCompile.getOptions()).setIncremental(true);
//     }

//     @Test
//     void testConfigureInputNormalization() {
//         ElasticsearchJavaBasePlugin.configureInputNormalization(project);
//         verify(runtimeClasspathNormalization).ignore("META-INF/MANIFEST.MF");
//         verify(runtimeClasspathNormalization).ignore("IMPL-JARS/**/META-INF/MANIFEST.MF");
//     }

//     private <T> TaskCollection<T> mockTaskCollection(T... tasks) {
//         TaskCollection<T> collection = mock(TaskCollection.class);
//         doAnswer(invocation -> {
//             ((Action<T>) invocation.getArgument(0)).execute(tasks[0]);
//             return null;
//         }).when(collection).configureEach(any());
//         return collection;
//     }
}
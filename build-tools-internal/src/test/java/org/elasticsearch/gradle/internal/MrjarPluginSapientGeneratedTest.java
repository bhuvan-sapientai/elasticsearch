package org.elasticsearch.gradle.internal;

// import org.elasticsearch.gradle.internal.MrjarPlugin;
// import org.gradle.api.tasks.compile.JavaCompile;
// import java.nio.file.Files;
// import org.gradle.external.javadoc.CoreJavadocOptions;
// import org.gradle.api.plugins.JavaPluginExtension;
// import org.junit.jupiter.api.Test;
// import org.gradle.api.Project;
// import java.io.File;
// import org.gradle.api.tasks.SourceSetContainer;
// import org.gradle.api.JavaVersion;
// import org.elasticsearch.gradle.internal.ElasticsearchJavaBasePlugin;
// import org.gradle.api.plugins.JavaPlugin;
// import org.junit.jupiter.params.provider.CsvSource;
// import org.gradle.api.tasks.compile.CompileOptions;
// import static org.mockito.Mockito.*;
// import java.io.IOException;
// import java.util.List;
// import org.gradle.api.tasks.SourceSet;
// import org.junit.jupiter.api.BeforeEach;
// import java.util.Map;
// import org.elasticsearch.gradle.internal.MrjarPlugin;
// import java.nio.file.Path;
// import org.junit.jupiter.params.ParameterizedTest;
// import org.gradle.api.Plugin;
// import org.elasticsearch.gradle.internal.info.BuildParams;
// import java.util.stream.Stream;
// import org.gradle.api.tasks.testing.Test;
// import org.gradle.api.tasks.javadoc.Javadoc;
// import org.elasticsearch.gradle.util.GradleUtils;
// import java.util.ArrayList;
// import org.gradle.jvm.toolchain.JavaToolchainService;
// import static org.junit.jupiter.api.Assertions.*;
// import org.mockito.ArgumentCaptor;
// import org.gradle.jvm.toolchain.JavaLanguageVersion;
// import org.gradle.api.file.FileCollection;
// import org.gradle.jvm.tasks.Jar;
// import static org.mockito.ArgumentMatchers.any;

class MrjarPluginSapientGeneratedTest {

//     private Project project;

//     private JavaToolchainService javaToolchains;

//     private MrjarPlugin plugin;

//     private JavaPluginExtension javaExtension;

//     private SourceSetContainer sourceSetContainer;

//     @BeforeEach
//     void setUp() {
//         project = mock(Project.class);
//         javaToolchains = mock(JavaToolchainService.class);
//         plugin = new MrjarPlugin(javaToolchains);
//         javaExtension = mock(JavaPluginExtension.class);
//         sourceSetContainer = mock(SourceSetContainer.class);
//         when(project.getExtensions()).thenReturn(mock(org.gradle.api.plugins.ExtensionContainer.class));
//         when(project.getExtensions().getByType(JavaPluginExtension.class)).thenReturn(javaExtension);
//         when(javaExtension.getSourceSets()).thenReturn(sourceSetContainer);
//         when(project.getPluginManager()).thenReturn(mock(org.gradle.api.plugins.PluginManager.class));
//         when(project.getTasks()).thenReturn(mock(org.gradle.api.tasks.TaskContainer.class));
//     }

//     @Test
//     void testApply() {
//         when(project.hasProperty("org.gradle.mrjar.idea.enabled")).thenReturn(true);
//         when(project.property("org.gradle.mrjar.idea.enabled")).thenReturn("true");
//         SourceSet mainSourceSet = mock(SourceSet.class);
//         when(sourceSetContainer.getByName(SourceSet.MAIN_SOURCE_SET_NAME)).thenReturn(mainSourceSet);
//         SourceSet testSourceSet = mock(SourceSet.class);
//         when(sourceSetContainer.getByName(SourceSet.TEST_SOURCE_SET_NAME)).thenReturn(testSourceSet);
//         plugin.apply(project);
//         verify(project.getPluginManager()).apply(ElasticsearchJavaBasePlugin.class);
//         verify(project).getExtensions();
//         verify(project.getExtensions()).getByType(JavaPluginExtension.class);
//         verify(javaExtension).getSourceSets();
//         verify(sourceSetContainer).getByName(SourceSet.MAIN_SOURCE_SET_NAME);
//         verify(sourceSetContainer).getByName(SourceSet.TEST_SOURCE_SET_NAME);
//     }

//     @ParameterizedTest
//     @CsvSource({ "true, true", "true, false", "false, true", "false, false" })
//     void testApplyWithDifferentPropertyValues(boolean hasProperty, boolean propertyValue) {
//         when(project.hasProperty("org.gradle.mrjar.idea.enabled")).thenReturn(hasProperty);
//         when(project.property("org.gradle.mrjar.idea.enabled")).thenReturn(String.valueOf(propertyValue));
//         plugin.apply(project);
//         verify(project).hasProperty("org.gradle.mrjar.idea.enabled");
//         if (hasProperty) {
//             verify(project).property("org.gradle.mrjar.idea.enabled");
//         }
//     }

//     @Test
//     void testConfigureMrjar() throws Exception {
//         Jar jarTask = mock(Jar.class);
//         when(project.getTasks().withType(Jar.class)).thenReturn(mock(org.gradle.api.tasks.TaskCollection.class));
//         when(project.getTasks().withType(Jar.class).named(JavaPlugin.JAR_TASK_NAME)).thenReturn(jarTask);
//         Test testTask = mock(Test.class);
//         when(project.getTasks().withType(Test.class)).thenReturn(mock(org.gradle.api.tasks.TaskCollection.class));
//         when(project.getTasks().withType(Test.class).named(JavaPlugin.TEST_TASK_NAME)).thenReturn(testTask);
//         SourceSetContainer sourceSets = mock(SourceSetContainer.class);
//         when(GradleUtils.getJavaSourceSets(project)).thenReturn(sourceSets);
//         SourceSet mainSourceSet = mock(SourceSet.class);
//         when(sourceSets.getByName(SourceSet.MAIN_SOURCE_SET_NAME)).thenReturn(mainSourceSet);
//         SourceSet testSourceSet = mock(SourceSet.class);
//         when(sourceSets.getByName(SourceSet.TEST_SOURCE_SET_NAME)).thenReturn(testSourceSet);
//         FileCollection mainRuntime = mock(FileCollection.class);
//         when(mainSourceSet.getOutput()).thenReturn(mainRuntime);
//         FileCollection testRuntime = mock(FileCollection.class);
//         when(testSourceSet.getRuntimeClasspath()).thenReturn(testRuntime);
//         when(testRuntime.minus(mainRuntime)).thenReturn(testRuntime);
//         when(testRuntime.plus(any())).thenReturn(testRuntime);
//         plugin.configureMrjar(project);
//         verify(jarTask).configure(any());
//         verify(testTask).configure(any());
//     }

//     @Test
//     void testFindSourceVersions() throws IOException {
//         File projectDir = mock(File.class);
//         when(project.getProjectDir()).thenReturn(projectDir);
//         Path projectPath = mock(Path.class);
//         when(projectDir.toPath()).thenReturn(projectPath);
//         Path srcDir = mock(Path.class);
//         when(projectPath.resolve("src")).thenReturn(srcDir);
//         Path main11 = mock(Path.class);
//         when(main11.getFileName()).thenReturn(Path.of("main11"));
//         Path main17 = mock(Path.class);
//         when(main17.getFileName()).thenReturn(Path.of("main17"));
//         try (var mockedFiles = mockStatic(Files.class)) {
//             mockedFiles.when(() -> Files.isDirectory(any())).thenReturn(true);
//             mockedFiles.when(() -> Files.list(srcDir)).thenReturn(Stream.of(main11, main17));
//             List<Integer> versions = MrjarPlugin.findSourceVersions(project);
//             assertEquals(2, versions.size());
//             assertTrue(versions.contains(11));
//             assertTrue(versions.contains(17));
//         }
//     }

//     @Test
//     void testStripPreviewFromFiles() throws IOException {
//         Path compileDir = mock(Path.class);
//         Path classFile = mock(Path.class);
//         when(classFile.toString()).thenReturn("TestClass.class");
//         try (var mockedFiles = mockStatic(Files.class)) {
//             mockedFiles.when(() -> Files.walk(eq(compileDir))).thenReturn(Stream.of(classFile));
//             mockedFiles.when(() -> Files.newInputStream(classFile)).thenReturn(mock(java.io.InputStream.class));
//             mockedFiles.when(() -> Files.newOutputStream(classFile)).thenReturn(mock(java.io.OutputStream.class));
//             MrjarPlugin.stripPreviewFromFiles(compileDir);
//             mockedFiles.verify(() -> Files.walk(eq(compileDir)));
//             mockedFiles.verify(() -> Files.newInputStream(classFile));
//             mockedFiles.verify(() -> Files.newOutputStream(classFile));
//         }
//     }
}
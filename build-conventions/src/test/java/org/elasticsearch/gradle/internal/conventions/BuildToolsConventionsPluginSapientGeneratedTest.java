package org.elasticsearch.gradle.internal.conventions;

// import org.elasticsearch.gradle.internal.conventions.BuildToolsConventionsPlugin;
// import org.elasticsearch.gradle.internal.conventions.util.Util;
// import org.gradle.api.plugins.PluginContainer;
// import static org.mockito.ArgumentMatchers.any;
// import org.junit.jupiter.api.Test;
// import org.elasticsearch.gradle.internal.conventions.precommit.LicenseHeadersPrecommitPlugin;
// import org.gradle.api.Project;
// import java.io.File;
// import org.gradle.api.Plugin;
// import org.gradle.api.Action;
// import org.elasticsearch.gradle.internal.conventions.info.ParallelDetector;
// import org.junit.jupiter.api.Timeout;
// import org.gradle.api.tasks.TaskContainer;
// import org.gradle.api.tasks.TaskCollection;
// import org.gradle.api.tasks.testing.Test;
// import org.elasticsearch.gradle.internal.conventions.BuildToolsConventionsPlugin;
// import static org.junit.jupiter.api.Assertions.*;
// import org.gradle.api.tasks.bundling.Jar;
// import org.mockito.MockedStatic;
// import static org.mockito.Mockito.*;
// import static org.mockito.ArgumentMatchers.any;

// @Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BuildToolsConventionsPluginSapientGeneratedTest {

//     @Test
//     void applyWhenUtilGetBooleanPropertyTests_fips_enabledFalseEqualsFalse() {
//         Project projectMock = mock(Project.class);
//         PluginContainer pluginContainerMock = mock(PluginContainer.class);
//         TaskContainer taskContainerMock = mock(TaskContainer.class);
//         TaskCollection<Test> testTaskCollectionMock = mock(TaskCollection.class);
//         TaskCollection<Jar> jarTaskCollectionMock = mock(TaskCollection.class);
//         File buildDirMock = mock(File.class);
//         when(projectMock.getPlugins()).thenReturn(pluginContainerMock);
//         when(projectMock.getTasks()).thenReturn(taskContainerMock);
//         when(taskContainerMock.withType(Test.class)).thenReturn(testTaskCollectionMock);
//         when(taskContainerMock.withType(Jar.class)).thenReturn(jarTaskCollectionMock);
//         when(projectMock.getBuildDir()).thenReturn(buildDirMock);
//         try (MockedStatic<ParallelDetector> parallelDetectorMock = mockStatic(ParallelDetector.class);
//             MockedStatic<Util> utilMock = mockStatic(Util.class)) {
//             parallelDetectorMock.when(() -> ParallelDetector.findDefaultParallel(projectMock)).thenReturn(4);
//             utilMock.when(() -> Util.getBooleanProperty("tests.fips.enabled", false)).thenReturn(false);
//             BuildToolsConventionsPlugin plugin = new BuildToolsConventionsPlugin();
//             plugin.apply(projectMock);
//             verify(pluginContainerMock).apply(LicenseHeadersPrecommitPlugin.class);
//             verify(taskContainerMock).withType(Test.class);
//             verify(taskContainerMock).withType(Jar.class);
//             verify(testTaskCollectionMock).configureEach(any());
//             verify(jarTaskCollectionMock).configureEach(any());
//             parallelDetectorMock.verify(() -> ParallelDetector.findDefaultParallel(projectMock));
//             utilMock.verify(() -> Util.getBooleanProperty("tests.fips.enabled", false));
//         }
//     }

//     @Test
//     void applyWhenUtilGetBooleanPropertyTests_fips_enabledTrueEqualsTrue() {
//         Project projectMock = mock(Project.class);
//         PluginContainer pluginContainerMock = mock(PluginContainer.class);
//         TaskContainer taskContainerMock = mock(TaskContainer.class);
//         TaskCollection<Test> testTaskCollectionMock = mock(TaskCollection.class);
//         TaskCollection<Jar> jarTaskCollectionMock = mock(TaskCollection.class);
//         File buildDirMock = mock(File.class);
//         when(projectMock.getPlugins()).thenReturn(pluginContainerMock);
//         when(projectMock.getTasks()).thenReturn(taskContainerMock);
//         when(taskContainerMock.withType(Test.class)).thenReturn(testTaskCollectionMock);
//         when(taskContainerMock.withType(Jar.class)).thenReturn(jarTaskCollectionMock);
//         when(projectMock.getBuildDir()).thenReturn(buildDirMock);
//         try (MockedStatic<ParallelDetector> parallelDetectorMock = mockStatic(ParallelDetector.class);
//             MockedStatic<Util> utilMock = mockStatic(Util.class)) {
//             parallelDetectorMock.when(() -> ParallelDetector.findDefaultParallel(projectMock)).thenReturn(4);
//             utilMock.when(() -> Util.getBooleanProperty("tests.fips.enabled", false)).thenReturn(true);
//             BuildToolsConventionsPlugin plugin = new BuildToolsConventionsPlugin();
//             plugin.apply(projectMock);
//             verify(pluginContainerMock).apply(LicenseHeadersPrecommitPlugin.class);
//             verify(taskContainerMock).withType(Test.class);
//             verify(taskContainerMock).withType(Jar.class);
//             verify(testTaskCollectionMock).configureEach(any());
//             verify(jarTaskCollectionMock).configureEach(any());
//             parallelDetectorMock.verify(() -> ParallelDetector.findDefaultParallel(projectMock));
//             utilMock.verify(() -> Util.getBooleanProperty("tests.fips.enabled", false));
//         }
//     }

//     @Test
//     void applyWithDifferentParallelValues() {
//         Project projectMock = mock(Project.class);
//         PluginContainer pluginContainerMock = mock(PluginContainer.class);
//         TaskContainer taskContainerMock = mock(TaskContainer.class);
//         TaskCollection<Test> testTaskCollectionMock = mock(TaskCollection.class);
//         TaskCollection<Jar> jarTaskCollectionMock = mock(TaskCollection.class);
//         File buildDirMock = mock(File.class);
//         when(projectMock.getPlugins()).thenReturn(pluginContainerMock);
//         when(projectMock.getTasks()).thenReturn(taskContainerMock);
//         when(taskContainerMock.withType(Test.class)).thenReturn(testTaskCollectionMock);
//         when(taskContainerMock.withType(Jar.class)).thenReturn(jarTaskCollectionMock);
//         when(projectMock.getBuildDir()).thenReturn(buildDirMock);
//         try (MockedStatic<ParallelDetector> parallelDetectorMock = mockStatic(ParallelDetector.class);
//             MockedStatic<Util> utilMock = mockStatic(Util.class)) {
//             parallelDetectorMock.when(() -> ParallelDetector.findDefaultParallel(projectMock)).thenReturn(8);
//             utilMock.when(() -> Util.getBooleanProperty("tests.fips.enabled", false)).thenReturn(false);
//             BuildToolsConventionsPlugin plugin = new BuildToolsConventionsPlugin();
//             plugin.apply(projectMock);
//             verify(pluginContainerMock).apply(LicenseHeadersPrecommitPlugin.class);
//             verify(taskContainerMock).withType(Test.class);
//             verify(taskContainerMock).withType(Jar.class);
//             verify(testTaskCollectionMock).configureEach(any());
//             verify(jarTaskCollectionMock).configureEach(any());
//             parallelDetectorMock.verify(() -> ParallelDetector.findDefaultParallel(projectMock));
//             utilMock.verify(() -> Util.getBooleanProperty("tests.fips.enabled", false));
//         }
//     }

//     @Test
//     void applyWithNullProject() {
//         BuildToolsConventionsPlugin plugin = new BuildToolsConventionsPlugin();
//         assertThrows(NullPointerException.class, () -> plugin.apply(null));
//     }

//     @Test
//     void applyVerifyJarTaskConfiguration() {
//         Project projectMock = mock(Project.class);
//         PluginContainer pluginContainerMock = mock(PluginContainer.class);
//         TaskContainer taskContainerMock = mock(TaskContainer.class);
//         TaskCollection<Test> testTaskCollectionMock = mock(TaskCollection.class);
//         TaskCollection<Jar> jarTaskCollectionMock = mock(TaskCollection.class);
//         File buildDirMock = mock(File.class);
//         when(projectMock.getPlugins()).thenReturn(pluginContainerMock);
//         when(projectMock.getTasks()).thenReturn(taskContainerMock);
//         when(taskContainerMock.withType(Test.class)).thenReturn(testTaskCollectionMock);
//         when(taskContainerMock.withType(Jar.class)).thenReturn(jarTaskCollectionMock);
//         when(projectMock.getBuildDir()).thenReturn(buildDirMock);
//         try (MockedStatic<ParallelDetector> parallelDetectorMock = mockStatic(ParallelDetector.class);
//             MockedStatic<Util> utilMock = mockStatic(Util.class)) {
//             parallelDetectorMock.when(() -> ParallelDetector.findDefaultParallel(projectMock)).thenReturn(4);
//             utilMock.when(() -> Util.getBooleanProperty("tests.fips.enabled", false)).thenReturn(false);
//             BuildToolsConventionsPlugin plugin = new BuildToolsConventionsPlugin();
//             plugin.apply(projectMock);
//             verify(jarTaskCollectionMock).configureEach(any());
//             verify(projectMock).getBuildDir();
//         }
//     }
}
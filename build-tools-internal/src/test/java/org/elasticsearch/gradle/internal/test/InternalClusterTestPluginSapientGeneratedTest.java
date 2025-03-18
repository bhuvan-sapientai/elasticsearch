package org.elasticsearch.gradle.internal.test;

// import org.elasticsearch.gradle.internal.test.InternalClusterTestPlugin;
// import org.gradle.api.tasks.SourceSet;
// import org.junit.jupiter.api.BeforeEach;
// import static org.mockito.ArgumentMatchers.any;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;
// import org.gradle.api.Project;
// import org.elasticsearch.gradle.internal.info.BuildParams;
// import org.gradle.api.JavaVersion;
// import org.gradle.api.tasks.testing.Test;
// import org.elasticsearch.gradle.util.GradleUtils;
// import static org.mockito.ArgumentMatchers.argThat;
// import org.gradle.api.tasks.TaskProvider;
// import org.mockito.MockedStatic;
// import static org.mockito.Mockito.*;
// import static org.mockito.ArgumentMatchers.any;

class InternalClusterTestPluginSapientGeneratedTest {

//     private Project projectMock;

//     private TaskProvider<Test> taskProviderMock;

//     private InternalClusterTestPlugin plugin;

//     @BeforeEach
//     void setUp() {
//         projectMock = mock(Project.class);
//         taskProviderMock = mock(TaskProvider.class);
//         plugin = new InternalClusterTestPlugin();
//     }

//     @Test
//     void applyWhenBuildParamsGetRuntimeJavaVersionCompareToJavaVersionVERSION_14LessThan0() {
//         try (MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class);
//             MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
//             buildParams.when(BuildParams::getRuntimeJavaVersion).thenReturn(JavaVersion.VERSION_13);
//             gradleUtils.when(() -> GradleUtils.addTestSourceSet(projectMock, "internalClusterTest")).thenReturn(taskProviderMock);
//             gradleUtils.when(() -> GradleUtils.extendSourceSet(any(), any(), any())).thenReturn(null);
//             plugin.apply(projectMock);
//             verify(taskProviderMock).configure(argThat((org.gradle.api.Action<Test> action) -> {
//                 Test testMock = mock(Test.class);
//                 action.execute(testMock);
//                 verify(testMock).jvmArgs("-XX:+UseConcMarkSweepGC", "-XX:CMSInitiatingOccupancyFraction=75", "-XX:+UseCMSInitiatingOccupancyOnly");
//                 return true;
//             }));
//             gradleUtils.verify(() -> GradleUtils.addTestSourceSet(projectMock, "internalClusterTest"));
//             gradleUtils.verify(() -> GradleUtils.extendSourceSet(projectMock, SourceSet.TEST_SOURCE_SET_NAME, "internalClusterTest"));
//         }
//     }

//     @Test
//     void applyWhenBuildParamsGetRuntimeJavaVersionCompareToJavaVersionVERSION_14NotLessThan0() {
//         try (MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class);
//             MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
//             buildParams.when(BuildParams::getRuntimeJavaVersion).thenReturn(JavaVersion.VERSION_14);
//             gradleUtils.when(() -> GradleUtils.addTestSourceSet(projectMock, "internalClusterTest")).thenReturn(taskProviderMock);
//             gradleUtils.when(() -> GradleUtils.extendSourceSet(any(), any(), any())).thenReturn(null);
//             plugin.apply(projectMock);
//             verify(taskProviderMock).configure(argThat((org.gradle.api.Action<Test> action) -> {
//                 Test testMock = mock(Test.class);
//                 action.execute(testMock);
//                 verify(testMock).jvmArgs("-XX:+UseG1GC");
//                 return true;
//             }));
//             gradleUtils.verify(() -> GradleUtils.addTestSourceSet(projectMock, "internalClusterTest"));
//             gradleUtils.verify(() -> GradleUtils.extendSourceSet(projectMock, SourceSet.TEST_SOURCE_SET_NAME, "internalClusterTest"));
//         }
//     }

//     @Test
//     void applySourceSetNameConstant() {
//         assertEquals("internalClusterTest", InternalClusterTestPlugin.SOURCE_SET_NAME);
//     }
}
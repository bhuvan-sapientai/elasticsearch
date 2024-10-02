package org.elasticsearch.gradle.test;

// import org.elasticsearch.gradle.test.GradleTestPolicySetupPlugin;
// import org.gradle.api.invocation.Gradle;
// import org.gradle.api.DomainObjectSet;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.params.ParameterizedTest;
// import org.gradle.api.Project;
// import java.io.File;
// import org.gradle.api.Plugin;
// import org.mockito.Mock;
// import org.gradle.api.tasks.TaskContainer;
// import org.gradle.api.tasks.testing.Test;
// import java.util.Set;
// import org.mockito.MockitoAnnotations;
// import org.junit.jupiter.params.provider.ValueSource;
// import static org.junit.jupiter.api.Assertions.*;
// import static org.mockito.Mockito.*;
// import static org.mockito.ArgumentMatchers.any;

class GradleTestPolicySetupPluginSapientGeneratedTest {

//     @Mock
//     private Project project;

//     @Mock
//     private Gradle gradle;

//     @Mock
//     private Test testTask;

//     @Mock
//     private TaskContainer taskContainer;

//     @Mock
//     private DomainObjectSet<Test> testTasks;

//     private GradleTestPolicySetupPlugin plugin;

//     @BeforeEach
//     void setUp() {
//         MockitoAnnotations.openMocks(this);
//         plugin = new GradleTestPolicySetupPlugin();
//         when(project.getGradle()).thenReturn(gradle);
//         when(project.getTasks()).thenReturn(taskContainer);
//         when(taskContainer.withType(Test.class)).thenReturn(testTasks);
//     }

//     @Test
//     void testApply() {
//         plugin.apply(project);
//         verify(project).getGradle();
//         verify(project.getTasks()).withType(Test.class);
//     }

//     @Test
//     void testSystemPropertiesSet() {
//         when(testTasks.iterator()).thenReturn(Set.of(testTask).iterator());
//         plugin.apply(project);
//         verify(testTask).systemProperty("tests.gradle", true);
//         verify(testTask).systemProperty(eq("tests.task"), any());
//     }

//     @Test
//     void testJvmArgsSet() {
//         when(testTasks.iterator()).thenReturn(Set.of(testTask).iterator());
//         plugin.apply(project);
//         verify(testTask).jvmArgs("-Djava.security.manager=allow");
//     }

//     @ParameterizedTest
//     @ValueSource(strings = { "/home/gradle", "/Users/gradle", "C:\\Gradle" })
//     void testGradleHomeSystemPropertySet(String gradleHome) {
//         when(testTasks.iterator()).thenReturn(Set.of(testTask).iterator());
//         when(gradle.getGradleHomeDir()).thenReturn(new File(gradleHome));
//         plugin.apply(project);
//         verify(testTask).getJvmArgumentProviders();
//     }

//     @ParameterizedTest
//     @ValueSource(strings = { "7.4.2", "8.0.1", "8.1.0" })
//     void testGradleWorkerJarSystemPropertySet(String gradleVersion) {
//         when(testTasks.iterator()).thenReturn(Set.of(testTask).iterator());
//         when(gradle.getGradleUserHomeDir()).thenReturn(new File("/home/user/.gradle"));
//         when(gradle.getGradleVersion()).thenReturn(gradleVersion);
//         plugin.apply(project);
//         verify(testTask).getJvmArgumentProviders();
//     }

//     @Test
//     void testNonInputPropertiesAdded() {
//         when(testTasks.iterator()).thenReturn(Set.of(testTask).iterator());
//         when(gradle.getGradleHomeDir()).thenReturn(new File("/home/gradle"));
//         when(gradle.getGradleUserHomeDir()).thenReturn(new File("/home/user/.gradle"));
//         when(gradle.getGradleVersion()).thenReturn("7.4.2");
//         plugin.apply(project);
//         verify(testTask).getJvmArgumentProviders();
//     }

//     @Test
//     void testSystemPropertyCommandLineArgumentProviderCreated() {
//         when(testTasks.iterator()).thenReturn(Set.of(testTask).iterator());
//         when(gradle.getGradleHomeDir()).thenReturn(new File("/home/gradle"));
//         when(gradle.getGradleUserHomeDir()).thenReturn(new File("/home/user/.gradle"));
//         when(gradle.getGradleVersion()).thenReturn("7.4.2");
//         plugin.apply(project);
//         verify(testTask).getJvmArgumentProviders();
//     }

//     @Test
//     void testMultipleTestTasks() {
//         Test testTask2 = mock(Test.class);
//         when(testTasks.iterator()).thenReturn(Set.of(testTask, testTask2).iterator());
//         plugin.apply(project);
//         verify(testTask).systemProperty("tests.gradle", true);
//         verify(testTask2).systemProperty("tests.gradle", true);
//         verify(testTask).jvmArgs("-Djava.security.manager=allow");
//         verify(testTask2).jvmArgs("-Djava.security.manager=allow");
//     }

//     @Test
//     void testExceptionHandling() {
//         when(testTasks.iterator()).thenThrow(new RuntimeException("Test Exception"));
//         assertThrows(RuntimeException.class, () -> plugin.apply(project));
//     }

//     @Test
//     void testEmptyTestTasks() {
//         when(testTasks.iterator()).thenReturn(Set.<Test>of().iterator());
//         plugin.apply(project);
//         verify(testTasks).configureEach(any());
//     }

//     @Test
//     void testNullGradleHomeDir() {
//         when(testTasks.iterator()).thenReturn(Set.of(testTask).iterator());
//         when(gradle.getGradleHomeDir()).thenReturn(null);
//         when(gradle.getGradleUserHomeDir()).thenReturn(new File("/home/user/.gradle"));
//         when(gradle.getGradleVersion()).thenReturn("7.4.2");
//         plugin.apply(project);
//         verify(testTask).getJvmArgumentProviders();
//     }

//     @Test
//     void testNullGradleUserHomeDir() {
//         when(testTasks.iterator()).thenReturn(Set.of(testTask).iterator());
//         when(gradle.getGradleHomeDir()).thenReturn(new File("/home/gradle"));
//         when(gradle.getGradleUserHomeDir()).thenReturn(null);
//         when(gradle.getGradleVersion()).thenReturn("7.4.2");
//         plugin.apply(project);
//         verify(testTask).getJvmArgumentProviders();
//     }
}
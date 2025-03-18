package org.elasticsearch.gradle.internal.test.rest.compat.compat;

// import org.elasticsearch.gradle.internal.test.rest.compat.compat.LegacyYamlRestCompatTestPlugin;
// import org.gradle.api.tasks.SourceSet;
// import org.junit.jupiter.api.BeforeEach;
// import javax.inject.Inject;
// import org.junit.jupiter.api.Test;
// import org.gradle.api.Project;
// import org.gradle.api.Plugin;
// import org.elasticsearch.gradle.internal.test.rest.RestTestUtil;
// import org.mockito.Mock;
// import org.gradle.api.file.ProjectLayout;
// import org.gradle.api.tasks.testing.Test;
// import org.elasticsearch.gradle.internal.test.rest.LegacyYamlRestTestPlugin;
// import org.mockito.MockitoAnnotations;
// import org.elasticsearch.gradle.internal.test.rest.compat.compat.LegacyYamlRestCompatTestPlugin;
// import org.elasticsearch.gradle.internal.test.RestIntegTestTask;
// import static org.junit.jupiter.api.Assertions.*;
// import org.gradle.api.tasks.TaskProvider;
// import org.mockito.MockedStatic;
// import static org.mockito.Mockito.*;
// import org.gradle.api.internal.file.FileOperations;
// import static org.mockito.ArgumentMatchers.any;

class LegacyYamlRestCompatTestPluginSapientGeneratedTest {

//     @Mock
//     private ProjectLayout projectLayoutMock;

//     @Mock
//     private FileOperations fileOperationsMock;

//     @Mock
//     private Project projectMock;

//     @Mock
//     private SourceSet sourceSetMock;

//     @Mock
//     private TaskProvider<RestIntegTestTask> taskProviderMock;

//     private LegacyYamlRestCompatTestPlugin plugin;

//     @BeforeEach
//     void setUp() {
//         MockitoAnnotations.openMocks(this);
//         plugin = new LegacyYamlRestCompatTestPlugin(projectLayoutMock, fileOperationsMock);
//     }

//     @Test
//     void testRegisterTestTask() {
//         try (MockedStatic<RestTestUtil> restTestUtilMock = mockStatic(RestTestUtil.class)) {
//             when(sourceSetMock.getName()).thenReturn("testSourceSet");
//             restTestUtilMock.when(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock, "testSourceSet")).thenReturn(taskProviderMock);
//             TaskProvider<? extends Test> result = plugin.registerTestTask(projectMock, sourceSetMock);
//             assertSame(taskProviderMock, result);
//             verify(sourceSetMock).getName();
//             restTestUtilMock.verify(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock, "testSourceSet"));
//         }
//     }

//     @Test
//     void testGetBasePlugin() {
//         Class<? extends Plugin<Project>> result = plugin.getBasePlugin();
//         assertEquals(LegacyYamlRestTestPlugin.class, result);
//     }

//     @Test
//     void testConstructor() {
//         assertNotNull(plugin);
//         assertTrue(plugin.getClass().isAnnotationPresent(Deprecated.class));
//     }

//     @Test
//     void testInheritance() {
//         assertTrue(plugin instanceof AbstractYamlRestCompatTestPlugin);
//     }

//     @Test
//     void testRegisterTestTaskWithNullProject() {
//         assertThrows(NullPointerException.class, () -> plugin.registerTestTask(null, sourceSetMock));
//     }

//     @Test
//     void testRegisterTestTaskWithNullSourceSet() {
//         assertThrows(NullPointerException.class, () -> plugin.registerTestTask(projectMock, null));
//     }
}
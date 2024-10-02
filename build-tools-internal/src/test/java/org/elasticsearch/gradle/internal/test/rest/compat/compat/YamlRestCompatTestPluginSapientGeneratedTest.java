package org.elasticsearch.gradle.internal.test.rest.compat.compat;

// import org.elasticsearch.gradle.internal.test.rest.compat.compat.YamlRestCompatTestPlugin;
// import static org.junit.jupiter.api.Assertions.assertAll;
// import org.junit.jupiter.api.BeforeEach;
// import org.gradle.api.tasks.SourceSet;
// import javax.inject.Inject;
// import org.junit.jupiter.api.Test;
// import static org.hamcrest.Matchers.equalTo;
// import org.gradle.api.Project;
// import org.gradle.api.Plugin;
// import org.elasticsearch.gradle.internal.test.rest.RestTestUtil;
// import org.junit.jupiter.api.Timeout;
// import org.gradle.api.file.ProjectLayout;
// import org.gradle.api.tasks.testing.Test;
// import org.elasticsearch.gradle.testclusters.StandaloneRestIntegTestTask;
// import static org.hamcrest.MatcherAssert.assertThat;
// import org.elasticsearch.gradle.internal.test.rest.InternalYamlRestTestPlugin;
// import org.gradle.api.tasks.TaskProvider;
// import org.mockito.MockedStatic;
// import static org.mockito.Mockito.*;
// import org.gradle.api.internal.file.FileOperations;
// import static org.mockito.ArgumentMatchers.any;

// @Timeout(value = 5)
class YamlRestCompatTestPluginSapientGeneratedTest {

//     private FileOperations fileOperationsMock;

//     private ProjectLayout projectLayoutMock;

//     private YamlRestCompatTestPlugin target;

//     @BeforeEach
//     void setUp() {
//         fileOperationsMock = mock(FileOperations.class);
//         projectLayoutMock = mock(ProjectLayout.class);
//         target = new YamlRestCompatTestPlugin(projectLayoutMock, fileOperationsMock);
//     }

//     @Test
//     void registerTestTaskTest() {
//         SourceSet sourceSetMock = mock(SourceSet.class);
//         TaskProvider<Test> taskProviderMock = mock(TaskProvider.class);
//         Project projectMock = mock(Project.class);
//         try (MockedStatic<RestTestUtil> restTestUtil = mockStatic(RestTestUtil.class)) {
//             when(sourceSetMock.getName()).thenReturn("testSourceSet");
//             restTestUtil.when(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock, "testSourceSet", StandaloneRestIntegTestTask.class)).thenReturn(taskProviderMock);
//             TaskProvider<? extends Test> result = target.registerTestTask(projectMock, sourceSetMock);
//             assertAll("result", () -> {
//                 assertThat(result, equalTo(taskProviderMock));
//                 verify(sourceSetMock).getName();
//                 restTestUtil.verify(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock, "testSourceSet", StandaloneRestIntegTestTask.class), times(1));
//             });
//         }
//     }

//     @Test
//     void getBasePluginTest() {
//         Class<? extends Plugin<Project>> result = target.getBasePlugin();
//         assertThat(result, equalTo(InternalYamlRestTestPlugin.class));
//     }

//     @Test
//     void constructorTest() {
//         assertAll(() -> assertThat(target.getClass(), equalTo(YamlRestCompatTestPlugin.class)), () -> verify(projectLayoutMock, never()).getProjectDirectory(), () -> verify(fileOperationsMock, never()).file(any()));
//     }

//     @Test
//     void registerTestTaskWithNullProjectTest() {
//         SourceSet sourceSetMock = mock(SourceSet.class);
//         try (MockedStatic<RestTestUtil> restTestUtil = mockStatic(RestTestUtil.class)) {
//             when(sourceSetMock.getName()).thenReturn("testSourceSet");
//             restTestUtil.when(() -> RestTestUtil.registerTestTask(null, sourceSetMock, "testSourceSet", StandaloneRestIntegTestTask.class)).thenThrow(NullPointerException.class);
//             assertThrows(NullPointerException.class, () -> target.registerTestTask(null, sourceSetMock));
//         }
//     }

//     @Test
//     void registerTestTaskWithNullSourceSetTest() {
//         Project projectMock = mock(Project.class);
//         assertThrows(NullPointerException.class, () -> target.registerTestTask(projectMock, null));
//     }
}
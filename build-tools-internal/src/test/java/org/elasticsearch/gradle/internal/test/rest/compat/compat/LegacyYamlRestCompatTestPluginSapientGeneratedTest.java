package org.elasticsearch.gradle.internal.test.rest.compat.compat;

// import org.elasticsearch.gradle.internal.test.rest.compat.compat.LegacyYamlRestCompatTestPlugin;
// import static org.junit.jupiter.api.Assertions.assertAll;
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
// import org.elasticsearch.gradle.internal.test.rest.LegacyYamlRestTestPlugin;
// import static org.hamcrest.MatcherAssert.assertThat;
// import org.elasticsearch.gradle.internal.test.RestIntegTestTask;
// import org.gradle.api.tasks.TaskProvider;
// import org.mockito.MockedStatic;
// import static org.mockito.Mockito.*;
// import org.gradle.api.internal.file.FileOperations;
// import static org.mockito.ArgumentMatchers.any;

// @Timeout(value = 5)
class LegacyYamlRestCompatTestPluginSapientGeneratedTest {

//     private final FileOperations fileOperationsMock = mock(FileOperations.class);

//     private final ProjectLayout projectLayoutMock = mock(ProjectLayout.class);

//     @Test
//     void registerTestTaskTest() {
//         SourceSet sourceSetMock = mock(SourceSet.class);
//         TaskProvider<RestIntegTestTask> taskProviderMock = mock(TaskProvider.class);
//         Project projectMock = mock(Project.class);
//         try (MockedStatic<RestTestUtil> restTestUtil = mockStatic(RestTestUtil.class)) {
//             when(sourceSetMock.getName()).thenReturn("return_of_getName1");
//             restTestUtil.when(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock, "return_of_getName1")).thenReturn(taskProviderMock);
//             LegacyYamlRestCompatTestPlugin target = new LegacyYamlRestCompatTestPlugin(projectLayoutMock, fileOperationsMock);
//             TaskProvider<? extends Test> result = target.registerTestTask(projectMock, sourceSetMock);
//             assertAll("result", () -> {
//                 assertThat(result, equalTo(taskProviderMock));
//                 verify(sourceSetMock).getName();
//                 restTestUtil.verify(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock, "return_of_getName1"), atLeast(1));
//             });
//         }
//     }

//     @Test
//     void getBasePluginTest() {
//         LegacyYamlRestCompatTestPlugin target = new LegacyYamlRestCompatTestPlugin(projectLayoutMock, fileOperationsMock);
//         Class<? extends Plugin<Project>> result = target.getBasePlugin();
//         assertAll("result", () -> assertThat(result, equalTo(LegacyYamlRestTestPlugin.class)));
//     }

//     @Test
//     void constructorTest() {
//         LegacyYamlRestCompatTestPlugin plugin = new LegacyYamlRestCompatTestPlugin(projectLayoutMock, fileOperationsMock);
//         assertAll(() -> assertThat(plugin.getClass().getSuperclass().getSimpleName(), equalTo("AbstractYamlRestCompatTestPlugin")), () -> assertThat(plugin.getClass().getAnnotation(Deprecated.class), equalTo(Deprecated.class.getAnnotation(Deprecated.class))));
//     }
}
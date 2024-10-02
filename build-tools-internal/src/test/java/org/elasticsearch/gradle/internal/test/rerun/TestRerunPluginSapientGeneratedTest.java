package org.elasticsearch.gradle.internal.test.rerun;

// import org.elasticsearch.gradle.internal.test.rerun.TestRerunPlugin;
// import static org.elasticsearch.gradle.internal.test.rerun.TestTaskConfigurer.configureTestTask;
// import javax.inject.Inject;
// import org.junit.jupiter.api.Test;
// import org.gradle.api.Project;
// import org.gradle.api.Plugin;
// import org.gradle.api.Action;
// import org.junit.jupiter.api.Timeout;
// import org.gradle.api.tasks.TaskCollection;
// import org.gradle.api.tasks.TaskContainer;
// import org.gradle.api.tasks.testing.Test;
// import org.mockito.stubbing.Answer;
// import static org.junit.jupiter.api.Assertions.*;
// import org.mockito.MockedStatic;
// import static org.mockito.Mockito.*;
// import org.gradle.api.model.ObjectFactory;
// import static org.mockito.ArgumentMatchers.any;

// @Timeout(value = 5)
class TestRerunPluginSapientGeneratedTest {

//     @Test
//     void applyTest() {
//         // Arrange
//         Project projectMock = mock(Project.class);
//         TaskContainer taskContainerMock = mock(TaskContainer.class);
//         TaskCollection<Test> taskCollectionMock = mock(TaskCollection.class);
//         Test testMock = mock(Test.class);
//         ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
//         try (MockedStatic<TestTaskConfigurer> testTaskConfigurer = mockStatic(TestTaskConfigurer.class)) {
//             when(projectMock.getTasks()).thenReturn(taskContainerMock);
//             when(taskContainerMock.withType(Test.class)).thenReturn(taskCollectionMock);
//             doNothing().when(taskCollectionMock).configureEach(any(Action.class));
//             testTaskConfigurer.when(() -> TestTaskConfigurer.configureTestTask(any(Test.class), any(ObjectFactory.class))).thenAnswer((Answer<Void>) invocation -> null);
//             TestRerunPlugin target = new TestRerunPlugin(objectFactoryMock);
//             // Act
//             target.apply(projectMock);
//             // Assert
//             assertAll("result", () -> {
//                 verify(projectMock).getTasks();
//                 verify(taskContainerMock).withType(Test.class);
//                 verify(taskCollectionMock).configureEach(any(Action.class));
//                 testTaskConfigurer.verify(() -> TestTaskConfigurer.configureTestTask(any(Test.class), eq(objectFactoryMock)), atLeastOnce());
//             });
//         }
//     }

//     @Test
//     void constructorTest() {
//         // Arrange
//         ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
//         // Act
//         TestRerunPlugin plugin = new TestRerunPlugin(objectFactoryMock);
//         // Assert
//         assertNotNull(plugin);
//     }

//     @Test
//     void applyWithNullProjectTest() {
//         // Arrange
//         ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
//         TestRerunPlugin plugin = new TestRerunPlugin(objectFactoryMock);
//         // Act & Assert
//         assertThrows(NullPointerException.class, () -> plugin.apply(null));
//     }

//     @Test
//     void applyWithNoTestTasksTest() {
//         // Arrange
//         Project projectMock = mock(Project.class);
//         TaskContainer taskContainerMock = mock(TaskContainer.class);
//         TaskCollection<Test> emptyTaskCollectionMock = mock(TaskCollection.class);
//         ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
//         when(projectMock.getTasks()).thenReturn(taskContainerMock);
//         when(taskContainerMock.withType(Test.class)).thenReturn(emptyTaskCollectionMock);
//         doNothing().when(emptyTaskCollectionMock).configureEach(any(Action.class));
//         TestRerunPlugin plugin = new TestRerunPlugin(objectFactoryMock);
//         // Act
//         plugin.apply(projectMock);
//         // Assert
//         verify(projectMock).getTasks();
//         verify(taskContainerMock).withType(Test.class);
//         verify(emptyTaskCollectionMock).configureEach(any(Action.class));
//     }
}
package org.elasticsearch.gradle.internal.test.rerun;

import org.junit.jupiter.api.Timeout;
import org.gradle.api.tasks.testing.Test;
import org.gradle.api.tasks.TaskCollection;
import org.mockito.stubbing.Answer;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.mockito.MockedStatic;
import org.gradle.api.Project;
import org.gradle.api.model.ObjectFactory;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class TestRerunPluginSapientGeneratedTest {

    //Sapient generated method id: ${applyTest}, hash: 7E928148C90663A672E96B931BA22CC6
    @Disabled()
    @org.junit.jupiter.api.Test()
    void applyTest() {
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskCollection taskCollectionMock = mock(TaskCollection.class);
        Test testMock = mock(Test.class);
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        try (MockedStatic<TestTaskConfigurer> testTaskConfigurer = mockStatic(TestTaskConfigurer.class)) {
            doReturn(taskContainerMock).when(projectMock).getTasks();
            doReturn(taskCollectionMock).when(taskContainerMock).withType(Test.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            testTaskConfigurer.when(() -> TestTaskConfigurer.configureTestTask(testMock, objectFactoryMock)).thenAnswer((Answer<Void>) invocation -> null);
            TestRerunPlugin target = new TestRerunPlugin(objectFactoryMock);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).getTasks();
                verify(taskContainerMock).withType(Test.class);
                verify(taskCollectionMock).configureEach((Action) any());
                testTaskConfigurer.verify(() -> TestTaskConfigurer.configureTestTask(testMock, objectFactoryMock), atLeast(1));
            });
        }
    }
}

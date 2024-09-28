package org.elasticsearch.gradle.internal.precommit;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.UnknownTaskException;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.gradle.api.Project;
import org.elasticsearch.gradle.internal.conventions.util.Util;
import org.gradle.api.tasks.TaskProvider;
import org.mockito.MockedStatic;
import java.io.File;
import org.gradle.api.file.FileTree;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class ValidateRestSpecPluginSapientGeneratedTest {

    //Sapient generated method id: ${applyTest}, hash: C44BE65549F3054DCEF6A33FB1211FE1
    @Disabled()
    @Test()
    void applyTest() throws InvalidUserDataException, UnknownTaskException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.File
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider taskProviderMock = mock(TaskProvider.class);
        TaskContainer taskContainerMock2 = mock(TaskContainer.class);
        TaskProvider taskProviderMock2 = mock(TaskProvider.class);
        TaskContainer taskContainerMock3 = mock(TaskContainer.class);
        TaskProvider taskProviderMock3 = mock(TaskProvider.class);
        FileTree fileTreeMock = mock(FileTree.class);
        FileTree fileTreeMock2 = mock(FileTree.class);
        try (MockedStatic<Util> util = mockStatic(Util.class)) {
            doReturn(taskProviderMock).when(taskContainerMock).register(eq("validateRestSpec"), eq(ValidateJsonAgainstSchemaTask.class), (Action) any());
            File file = new File("pathname1");
            File file2 = new File("pathname1");
            doReturn(taskProviderMock2).when(taskContainerMock2).register(eq("validateNoKeywords"), eq(ValidateJsonNoKeywordsTask.class), (Action) any());
            File file3 = new File("pathname1");
            doReturn(file, file3).when(projectMock).getRootDir();
            File file4 = new File("pathname1");
            doReturn(file2, file4).when(projectMock).getBuildDir();
            doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3).when(projectMock).getTasks();
            doReturn(taskProviderMock3).when(taskContainerMock3).named("precommit");
            doNothing().when(taskProviderMock3).configure((Action) any());
            util.when(() -> Util.getJavaTestAndMainSourceResources(eq(projectMock), (Action) any())).thenReturn(fileTreeMock).thenReturn(fileTreeMock2);
            ValidateRestSpecPlugin target = new ValidateRestSpecPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(3)).getTasks();
                verify(taskContainerMock).register(eq("validateRestSpec"), eq(ValidateJsonAgainstSchemaTask.class), (Action) any());
                verify(projectMock, times(2)).getRootDir();
                verify(projectMock, times(2)).getBuildDir();
                verify(taskContainerMock2).register(eq("validateNoKeywords"), eq(ValidateJsonNoKeywordsTask.class), (Action) any());
                verify(taskContainerMock3).named("precommit");
                verify(taskProviderMock3).configure((Action) any());
                util.verify(() -> Util.getJavaTestAndMainSourceResources(eq(projectMock), (Action) any()), atLeast(2));
            });
        }
    }
}

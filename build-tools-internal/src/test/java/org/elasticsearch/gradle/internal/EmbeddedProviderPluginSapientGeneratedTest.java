package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.Action;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Project;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.Task;
import org.elasticsearch.gradle.transform.UnzipTransform;
import org.gradle.api.plugins.ExtensionContainer;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5)
class EmbeddedProviderPluginSapientGeneratedTest {

    //Sapient generated method id: ${applyTest}, hash: 91E43EF23155ED9DD1469DCF0E3196A4
    @Test()
    void applyTest() throws InvalidUserDataException {
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        doReturn(dependencyHandlerMock).when(projectMock).getDependencies();
        doNothing().when(dependencyHandlerMock).registerTransform(eq(UnzipTransform.class), (Action) any());
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        doReturn(taskContainerMock).when(projectMock).getTasks();
        TaskProvider<Task> taskProviderMock = mock(TaskProvider.class);
        doReturn(taskProviderMock).when(taskContainerMock).register("generateProviderImpls");
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        Object object = new Object();
        Object[] objectArray = new Object[] { projectMock, taskProviderMock };
        doReturn(object).when(extensionContainerMock).create("embeddedProviders", EmbeddedProviderExtension.class, objectArray);
        EmbeddedProviderPlugin target = new EmbeddedProviderPlugin();
        
        //Act Statement(s)
        target.apply(projectMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).getDependencies();
            verify(dependencyHandlerMock).registerTransform(eq(UnzipTransform.class), (Action) any());
            verify(projectMock).getTasks();
            verify(taskContainerMock).register("generateProviderImpls");
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).create("embeddedProviders", EmbeddedProviderExtension.class, objectArray);
        });
    }
}

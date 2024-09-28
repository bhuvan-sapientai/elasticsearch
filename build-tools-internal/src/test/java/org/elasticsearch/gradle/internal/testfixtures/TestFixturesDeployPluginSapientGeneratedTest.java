package org.elasticsearch.gradle.internal.testfixtures;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.Action;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Project;
import org.gradle.api.tasks.TaskCollection;
import org.elasticsearch.gradle.Architecture;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.Task;
import org.mockito.MockedStatic;
import org.elasticsearch.gradle.internal.info.BuildParams;
import org.gradle.api.plugins.ExtensionContainer;
import org.elasticsearch.gradle.internal.docker.DockerBuildTask;
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
class TestFixturesDeployPluginSapientGeneratedTest {

    //Sapient generated method id: ${applyWhenBaseImagesIsEmptyEqualsFalse}, hash: 95C3EFB98DAA2A6409F17E3FF85B81BF
    @Disabled()
    @Test()
    void applyWhenBaseImagesIsEmptyEqualsFalse() throws InvalidUserDataException {
        /* Branches:
         * (baseImages.isEmpty() == false) : true  #  inside lambda$registerDeployTaskPerFixture$2 method
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        NamedDomainObjectContainer<TestFixtureDeployment> namedDomainObjectContainerMock = mock(NamedDomainObjectContainer.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider taskProviderMock = mock(TaskProvider.class);
        TaskContainer taskContainerMock2 = mock(TaskContainer.class);
        TaskProvider<Task> taskProviderMock2 = mock(TaskProvider.class);
        TaskContainer taskContainerMock3 = mock(TaskContainer.class);
        TaskCollection taskCollectionMock = mock(TaskCollection.class);
        try (MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            doReturn(namedDomainObjectContainerMock).when(projectMock).container(TestFixtureDeployment.class);
            doNothing().when(namedDomainObjectContainerMock).all((Action) any());
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doNothing().when(extensionContainerMock).add("dockerFixtures", namedDomainObjectContainerMock);
            doReturn(taskProviderMock).when(taskContainerMock).register(eq("deployEDockerImage"), eq(DockerBuildTask.class), (Action) any());
            doReturn(taskProviderMock2).when(taskContainerMock2).register(eq("deployFixtureDockerImages"), (Action) any());
            doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3).when(projectMock).getTasks();
            doReturn(taskCollectionMock).when(taskContainerMock3).withType(DockerBuildTask.class);
            buildParams.when(() -> BuildParams.isCi()).thenReturn(false);
            TestFixturesDeployPlugin target = new TestFixturesDeployPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).container(TestFixtureDeployment.class);
                verify(namedDomainObjectContainerMock).all((Action) any());
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).add("dockerFixtures", namedDomainObjectContainerMock);
                verify(projectMock, times(3)).getTasks();
                verify(taskContainerMock).register(eq("deployEDockerImage"), eq(DockerBuildTask.class), (Action) any());
                verify(taskContainerMock2).register(eq("deployFixtureDockerImages"), (Action) any());
                verify(taskContainerMock3).withType(DockerBuildTask.class);
                buildParams.verify(() -> BuildParams.isCi(), atLeast(2));
            });
        }
    }
}

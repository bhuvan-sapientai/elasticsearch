package org.elasticsearch.gradle.internal.docker;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.gradle.api.execution.TaskExecutionGraph;
import org.gradle.api.Action;
import org.gradle.api.invocation.Gradle;
import org.gradle.api.provider.Provider;
import org.gradle.api.Project;
import java.io.File;
import java.util.ArrayList;
import org.gradle.api.services.BuildServiceRegistry;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class DockerSupportPluginSapientGeneratedTest {

    private final BuildServiceRegistry buildServiceRegistryMock = mock(BuildServiceRegistry.class);

    private final DockerSupportService dockerSupportServiceMock = mock(DockerSupportService.class);

    private final Gradle gradleMock = mock(Gradle.class);

    private final Gradle gradleMock2 = mock(Gradle.class);

    private final Project projectMock = mock(Project.class);

    private final Provider<DockerSupportService> providerMock = mock(Provider.class);

    private final TaskExecutionGraph taskExecutionGraphMock = mock(TaskExecutionGraph.class);

    //Sapient generated method id: ${applyWhenProjectNotEqualsProjectGetRootProjectThrowsIllegalStateException}, hash: 2E558B9AF33FBFC725A78DD071351594
    @Test()
    void applyWhenProjectNotEqualsProjectGetRootProjectThrowsIllegalStateException() {
        /* Branches:
         * (project != project.getRootProject()) : true
         */
        //Arrange Statement(s)
        Project projectMock2 = mock(Project.class);
        doReturn(projectMock2).when(projectMock).getRootProject();
        DockerSupportPlugin target = new DockerSupportPlugin();
        IllegalStateException illegalStateException = new IllegalStateException("org.elasticsearch.gradle.internal.docker.DockerSupportPlugin can only be applied to the root project.");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.apply(projectMock);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
            verify(projectMock).getRootProject();
        });
    }

    //Sapient generated method id: ${applyWhenDockerTasksIsEmptyEqualsFalse}, hash: CD1D49B12AAD7DDEFE3EB30EBCA3E63E
    @Disabled()
    @Test()
    void applyWhenDockerTasksIsEmptyEqualsFalse() {
        /* Branches:
         * (project != project.getRootProject()) : false
         * (branch expression (line 44)) : true
         * (dockerTasks.isEmpty() == false) : true  #  inside lambda$apply$3 method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.File
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(projectMock).when(projectMock).getRootProject();
        doReturn(buildServiceRegistryMock).when(gradleMock).getSharedServices();
        doReturn(providerMock).when(buildServiceRegistryMock).registerIfAbsent(eq("dockerSupportService"), eq(DockerSupportService.class), (Action) any());
        doReturn(dockerSupportServiceMock).when(providerMock).get();
        List<String> stringList = new ArrayList<>(List.of("return_of_getPath1"));
        doNothing().when(dockerSupportServiceMock).failIfDockerUnavailable(stringList);
        File file = new File("pathname1");
        doReturn(file).when(projectMock).getRootDir();
        doReturn(gradleMock, gradleMock2).when(projectMock).getGradle();
        doReturn(taskExecutionGraphMock).when(gradleMock2).getTaskGraph();
        doNothing().when(taskExecutionGraphMock).whenReady((Action) any());
        DockerSupportPlugin target = new DockerSupportPlugin();
        //Act Statement(s)
        target.apply(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).getRootProject();
            verify(projectMock, times(2)).getGradle();
            verify(gradleMock).getSharedServices();
            verify(buildServiceRegistryMock).registerIfAbsent(eq("dockerSupportService"), eq(DockerSupportService.class), (Action) any());
            verify(providerMock, atLeast(1)).get();
            verify(dockerSupportServiceMock).failIfDockerUnavailable(stringList);
            verify(projectMock).getRootDir();
            verify(gradleMock2).getTaskGraph();
            verify(taskExecutionGraphMock).whenReady((Action) any());
        });
    }

    //Sapient generated method id: ${applyWhenDefaultBranchAndDockerTasksIsEmptyEqualsFalse}, hash: DCF4A2D7DF9B4AF994B57F7219BE52E2
    @Disabled()
    @Test()
    void applyWhenDefaultBranchAndDockerTasksIsEmptyEqualsFalse() {
        /* Branches:
         * (project != project.getRootProject()) : false
         * (branch expression (line 44)) : false
         * (dockerTasks.isEmpty() == false) : true  #  inside lambda$apply$3 method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.File
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(projectMock).when(projectMock).getRootProject();
        doReturn(buildServiceRegistryMock).when(gradleMock).getSharedServices();
        doReturn(providerMock).when(buildServiceRegistryMock).registerIfAbsent(eq("dockerSupportService"), eq(DockerSupportService.class), (Action) any());
        doReturn(dockerSupportServiceMock).when(providerMock).get();
        List<String> stringList = new ArrayList<>(List.of("objectItem1"));
        doNothing().when(dockerSupportServiceMock).failIfDockerUnavailable(stringList);
        File file = new File("pathname1");
        doReturn(file).when(projectMock).getRootDir();
        doReturn(gradleMock, gradleMock2).when(projectMock).getGradle();
        doReturn(taskExecutionGraphMock).when(gradleMock2).getTaskGraph();
        doNothing().when(taskExecutionGraphMock).whenReady((Action) any());
        DockerSupportPlugin target = new DockerSupportPlugin();
        //Act Statement(s)
        target.apply(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).getRootProject();
            verify(projectMock, times(2)).getGradle();
            verify(gradleMock).getSharedServices();
            verify(buildServiceRegistryMock).registerIfAbsent(eq("dockerSupportService"), eq(DockerSupportService.class), (Action) any());
            verify(providerMock, atLeast(1)).get();
            verify(dockerSupportServiceMock).failIfDockerUnavailable(stringList);
            verify(projectMock).getRootDir();
            verify(gradleMock2).getTaskGraph();
            verify(taskExecutionGraphMock).whenReady((Action) any());
        });
    }
}

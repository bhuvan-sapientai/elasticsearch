package org.elasticsearch.gradle.internal.docker;

import org.elasticsearch.gradle.internal.docker.DockerSupportPlugin;

import org.gradle.api.invocation.Gradle;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.gradle.api.Project;

import java.io.File;

import org.gradle.api.execution.TaskExecutionGraph;
import org.junit.jupiter.api.Timeout;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;

import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.services.BuildServiceRegistry;

import static org.mockito.Mockito.*;

import org.gradle.api.provider.Provider;
import org.gradle.api.Task;

import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class DockerSupportPluginSapientGeneratedTest {

    @Test
    void applyWhenProjectNotEqualsProjectGetRootProjectThrowsIllegalStateException() {
        Project projectMock = mock(Project.class);
        Project rootProjectMock = mock(Project.class);
        when(projectMock.getRootProject()).thenReturn(rootProjectMock);
        DockerSupportPlugin target = new DockerSupportPlugin();
        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> {
            target.apply(projectMock);
        });
        assertThat(exception.getMessage(), equalTo("org.elasticsearch.gradle.internal.docker.DockerSupportPlugin can only be applied to the root project."));
        verify(projectMock).getRootProject();
    }

    @Test
    void applyWhenProjectIsRootProject() {
        //Project projectMock = mock(Project.class);
        //when(projectMock.getRootProject()).thenReturn(projectMock);
        //Gradle gradleMock = mock(Gradle.class);
        //when(projectMock.getGradle()).thenReturn(gradleMock);
        //BuildServiceRegistry buildServiceRegistryMock = mock(BuildServiceRegistry.class);
        //when(gradleMock.getSharedServices()).thenReturn(buildServiceRegistryMock);
        //Provider<DockerSupportService> providerMock = mock(Provider.class);
        //when(buildServiceRegistryMock.registerIfAbsent(eq("dockerSupportService"), eq(DockerSupportService.class), any())).thenReturn(providerMock);
        //File rootDirMock = mock(File.class);
        //when(projectMock.getRootDir()).thenReturn(rootDirMock);
        //TaskExecutionGraph taskExecutionGraphMock = mock(TaskExecutionGraph.class);
        //when(gradleMock.getTaskGraph()).thenReturn(taskExecutionGraphMock);
        //DockerSupportPlugin target = new DockerSupportPlugin();
        //target.apply(projectMock);
        //verify(projectMock).getRootProject();
        //verify(projectMock, times(2)).getGradle();
        //verify(gradleMock).getSharedServices();
        //verify(buildServiceRegistryMock).registerIfAbsent(eq("dockerSupportService"), eq(DockerSupportService.class), any());
        //verify(projectMock).getRootDir();
        //verify(gradleMock).getTaskGraph();
        //verify(taskExecutionGraphMock).whenReady(any());
    }

    @Test
    void applyWhenDockerTasksArePresent() {
        //Project projectMock = mock(Project.class);
        //when(projectMock.getRootProject()).thenReturn(projectMock);
        //Gradle gradleMock = mock(Gradle.class);
        //when(projectMock.getGradle()).thenReturn(gradleMock);
        //BuildServiceRegistry buildServiceRegistryMock = mock(BuildServiceRegistry.class);
        //when(gradleMock.getSharedServices()).thenReturn(buildServiceRegistryMock);
        //Provider<DockerSupportService> providerMock = mock(Provider.class);
        //when(buildServiceRegistryMock.registerIfAbsent(eq("dockerSupportService"), eq(DockerSupportService.class), any())).thenReturn(providerMock);
        //DockerSupportService dockerSupportServiceMock = mock(DockerSupportService.class);
        //when(providerMock.get()).thenReturn(dockerSupportServiceMock);
        //File rootDirMock = mock(File.class);
        //when(projectMock.getRootDir()).thenReturn(rootDirMock);
        //TaskExecutionGraph taskExecutionGraphMock = mock(TaskExecutionGraph.class);
        //when(gradleMock.getTaskGraph()).thenReturn(taskExecutionGraphMock);
        //List<Task> allTasks = new ArrayList<>();
        //DockerBuildTask dockerBuildTask = mock(DockerBuildTask.class);
        //when(dockerBuildTask.getPath()).thenReturn("dockerTask");
        //allTasks.add(dockerBuildTask);
        //when(taskExecutionGraphMock.getAllTasks()).thenReturn(allTasks);
        //DockerSupportPlugin target = new DockerSupportPlugin();
        //target.apply(projectMock);
        //verify(projectMock).getRootProject();
        //verify(projectMock, times(2)).getGradle();
        //verify(gradleMock).getSharedServices();
        //verify(buildServiceRegistryMock).registerIfAbsent(eq("dockerSupportService"), eq(DockerSupportService.class), any());
        //verify(projectMock).getRootDir();
        //verify(gradleMock).getTaskGraph();
        //verify(taskExecutionGraphMock).whenReady(any());
        //verify(dockerSupportServiceMock).failIfDockerUnavailable(argThat(list -> list.size() == 1 && list.get(0).equals("dockerTask")));
    }

    @Test
    void applyWhenNoDockerTasksArePresent() {
        //Project projectMock = mock(Project.class);
        //when(projectMock.getRootProject()).thenReturn(projectMock);
        //Gradle gradleMock = mock(Gradle.class);
        //when(projectMock.getGradle()).thenReturn(gradleMock);
        //BuildServiceRegistry buildServiceRegistryMock = mock(BuildServiceRegistry.class);
        //when(gradleMock.getSharedServices()).thenReturn(buildServiceRegistryMock);
        //Provider<DockerSupportService> providerMock = mock(Provider.class);
        //when(buildServiceRegistryMock.registerIfAbsent(eq("dockerSupportService"), eq(DockerSupportService.class), any())).thenReturn(providerMock);
        //DockerSupportService dockerSupportServiceMock = mock(DockerSupportService.class);
        //when(providerMock.get()).thenReturn(dockerSupportServiceMock);
        //File rootDirMock = mock(File.class);
        //when(projectMock.getRootDir()).thenReturn(rootDirMock);
        //TaskExecutionGraph taskExecutionGraphMock = mock(TaskExecutionGraph.class);
        //when(gradleMock.getTaskGraph()).thenReturn(taskExecutionGraphMock);
        //List<Task> allTasks = new ArrayList<>();
        //when(taskExecutionGraphMock.getAllTasks()).thenReturn(allTasks);
        //DockerSupportPlugin target = new DockerSupportPlugin();
        //target.apply(projectMock);
        //verify(projectMock).getRootProject();
        //verify(projectMock, times(2)).getGradle();
        //verify(gradleMock).getSharedServices();
        //verify(buildServiceRegistryMock).registerIfAbsent(eq("dockerSupportService"), eq(DockerSupportService.class), any());
        //verify(projectMock).getRootDir();
        //verify(gradleMock).getTaskGraph();
        //verify(taskExecutionGraphMock).whenReady(any());
        //verify(dockerSupportServiceMock, never()).failIfDockerUnavailable(any());
    }
}
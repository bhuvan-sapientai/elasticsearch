package org.elasticsearch.gradle.internal.precommit;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.UnknownConfigurationException;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.gradle.api.file.SourceDirectorySet;
import org.gradle.api.file.FileCollection;
import org.gradle.api.provider.Provider;
import org.elasticsearch.gradle.util.GradleUtils;
import java.util.Set;
import java.util.concurrent.Callable;
import org.gradle.api.Project;
import java.util.HashSet;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.Task;
import org.mockito.MockedStatic;
import java.io.File;
import org.gradle.api.tasks.SourceSet;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class SplitPackagesAuditPrecommitPluginSapientGeneratedTest {

    //Sapient generated method id: ${createTaskWhenProjectGetRootProjectGetAllprojectsIsNotEmpty}, hash: 385FB5E9009FD2DF32119BD97FFD997E
    @Disabled()
    @Test()
    void createTaskWhenProjectGetRootProjectGetAllprojectsIsNotEmpty() throws UnknownConfigurationException, InvalidUserDataException {
        /* Branches:
         * (for-each(project.getRootProject().getAllprojects())) : true  #  inside getProjectBuildDirs method
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider<SplitPackagesAuditTask> taskProviderMock = mock(TaskProvider.class);
        Project projectMock2 = mock(Project.class);
        Project projectMock3 = mock(Project.class);
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        Configuration configurationMock = mock(Configuration.class);
        Provider providerMock = mock(Provider.class);
        SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        SourceSet sourceSetMock = mock(SourceSet.class);
        SourceDirectorySet sourceDirectorySetMock = mock(SourceDirectorySet.class);
        FileCollection fileCollectionMock = mock(FileCollection.class);
        SourceDirectorySet sourceDirectorySetMock2 = mock(SourceDirectorySet.class);
        try (MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            doReturn(taskContainerMock).when(projectMock).getTasks();
            doReturn(taskProviderMock).when(taskContainerMock).register("splitPackagesAudit", SplitPackagesAuditTask.class);
            doNothing().when(taskProviderMock).configure((Action) any());
            doReturn(projectMock2).when(projectMock).getRootProject();
            Set<Project> projectSet = new HashSet<>();
            projectSet.add(projectMock3);
            doReturn(projectSet).when(projectMock2).getAllprojects();
            File file = new File("pathname1");
            doReturn(file).when(projectMock3).getBuildDir();
            doReturn("return_of_getPath1").when(projectMock3).getPath();
            doReturn(configurationContainerMock).when(projectMock).getConfigurations();
            doReturn(configurationMock).when(configurationContainerMock).getByName("compileClasspath");
            doReturn(providerMock).when(projectMock).provider((Callable) any());
            gradleUtils.when(() -> GradleUtils.getJavaSourceSets(projectMock)).thenReturn(sourceSetContainerMock);
            doReturn(sourceSetMock).when(sourceSetContainerMock).findByName("main");
            doReturn(sourceDirectorySetMock).when(sourceSetMock).getJava();
            doReturn(fileCollectionMock).when(sourceDirectorySetMock).getSourceDirectories();
            doReturn(sourceDirectorySetMock2).when(sourceSetMock).getAllSource();
            Set<File> fileSet = new HashSet<>();
            doReturn(fileSet).when(sourceDirectorySetMock2).getSrcDirs();
            SplitPackagesAuditPrecommitPlugin target = new SplitPackagesAuditPrecommitPlugin();
            //Act Statement(s)
            TaskProvider<? extends Task> result = target.createTask(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(taskProviderMock));
                verify(projectMock).getTasks();
                verify(taskContainerMock).register("splitPackagesAudit", SplitPackagesAuditTask.class);
                verify(taskProviderMock).configure((Action) any());
                verify(projectMock).getRootProject();
                verify(projectMock2).getAllprojects();
                verify(projectMock3).getBuildDir();
                verify(projectMock3).getPath();
                verify(projectMock).getConfigurations();
                verify(configurationContainerMock).getByName("compileClasspath");
                verify(projectMock).provider((Callable) any());
                gradleUtils.verify(() -> GradleUtils.getJavaSourceSets(projectMock), atLeast(1));
                verify(sourceSetContainerMock).findByName("main");
                verify(sourceSetMock).getJava();
                verify(sourceDirectorySetMock).getSourceDirectories();
                verify(sourceSetMock).getAllSource();
                verify(sourceDirectorySetMock2).getSrcDirs();
            });
        }
    }
}

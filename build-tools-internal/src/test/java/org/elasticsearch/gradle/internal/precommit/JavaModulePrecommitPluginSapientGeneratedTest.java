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
import org.gradle.api.tasks.SourceSetOutput;
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
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class JavaModulePrecommitPluginSapientGeneratedTest {

    //Sapient generated method id: ${createTaskTest}, hash: 3E0CBDA40CD37B30BB321E3369E94ADE
    @Disabled()
    @Test()
    void createTaskTest() throws UnknownConfigurationException, InvalidUserDataException {
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider<JavaModulePrecommitTask> taskProviderMock = mock(TaskProvider.class);
        Provider providerMock = mock(Provider.class);
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        Configuration configurationMock = mock(Configuration.class);
        SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        SourceSet sourceSetMock = mock(SourceSet.class);
        SourceDirectorySet sourceDirectorySetMock = mock(SourceDirectorySet.class);
        SourceSetOutput sourceSetOutputMock = mock(SourceSetOutput.class);
        FileCollection fileCollectionMock = mock(FileCollection.class);
        SourceSetOutput sourceSetOutputMock2 = mock(SourceSetOutput.class);
        try (MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            doReturn(taskContainerMock).when(projectMock).getTasks();
            doReturn(taskProviderMock).when(taskContainerMock).register("validateModule", JavaModulePrecommitTask.class);
            doNothing().when(taskProviderMock).configure((Action) any());
            doReturn(providerMock).when(projectMock).provider((Callable) any());
            doReturn(configurationContainerMock).when(projectMock).getConfigurations();
            doReturn(configurationMock).when(configurationContainerMock).getByName("compileClasspath");
            gradleUtils.when(() -> GradleUtils.getJavaSourceSets(projectMock)).thenReturn(sourceSetContainerMock);
            doReturn(sourceSetMock).when(sourceSetContainerMock).findByName("main");
            doReturn("return_of_getClassesTaskName1").when(sourceSetMock).getClassesTaskName();
            doReturn(sourceDirectorySetMock).when(sourceSetMock).getAllSource();
            Set<File> fileSet = new HashSet<>();
            doReturn(fileSet).when(sourceDirectorySetMock).getSrcDirs();
            doReturn(fileCollectionMock).when(sourceSetOutputMock).getClassesDirs();
            doReturn(sourceSetOutputMock, sourceSetOutputMock2).when(sourceSetMock).getOutput();
            File file = new File("pathname1");
            doReturn(file).when(sourceSetOutputMock2).getResourcesDir();
            JavaModulePrecommitPlugin target = new JavaModulePrecommitPlugin();
            //Act Statement(s)
            TaskProvider<? extends Task> result = target.createTask(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(taskProviderMock));
                verify(projectMock).getTasks();
                verify(taskContainerMock).register("validateModule", JavaModulePrecommitTask.class);
                verify(taskProviderMock).configure((Action) any());
                verify(projectMock).provider((Callable) any());
                verify(projectMock).getConfigurations();
                verify(configurationContainerMock).getByName("compileClasspath");
                gradleUtils.verify(() -> GradleUtils.getJavaSourceSets(projectMock), atLeast(1));
                verify(sourceSetContainerMock).findByName("main");
                verify(sourceSetMock).getClassesTaskName();
                verify(sourceSetMock).getAllSource();
                verify(sourceDirectorySetMock).getSrcDirs();
                verify(sourceSetMock, times(2)).getOutput();
                verify(sourceSetOutputMock).getClassesDirs();
                verify(sourceSetOutputMock2).getResourcesDir();
            });
        }
    }
}

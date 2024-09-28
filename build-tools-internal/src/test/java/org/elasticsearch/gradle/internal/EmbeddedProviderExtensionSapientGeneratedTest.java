package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.Transformer;
import org.gradle.api.artifacts.Dependency;
import org.gradle.api.provider.Provider;
import org.elasticsearch.gradle.util.GradleUtils;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.Task;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.tasks.SourceSetOutput;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.Action;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.file.Directory;
import org.gradle.api.Project;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.gradle.api.file.ProjectLayout;
import org.mockito.MockedStatic;
import org.gradle.api.tasks.Sync;
import org.elasticsearch.gradle.internal.conventions.GUtils;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class EmbeddedProviderExtensionSapientGeneratedTest {

    private final Project projectMock = mock(Project.class, "project");

    private final TaskProvider<Task> metaTaskMock = mock(TaskProvider.class, "metaTask");

    //Sapient generated method id: ${implTest}, hash: D724BEFB58FF99EF5FD369DA3ABF3EDD
    @Disabled()
    @Test()
    void implTest() throws InvalidUserDataException {
        //Arrange Statement(s)
        Project implProjectMock = mock(Project.class);
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        Configuration configurationMock = mock(Configuration.class);
        Dependency dependencyMock = mock(Dependency.class);
        DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        DirectoryProperty directoryPropertyMock = mock(DirectoryProperty.class);
        Provider<Directory> providerMock = mock(Provider.class);
        Provider providerMock2 = mock(Provider.class);
        Provider providerMock3 = mock(Provider.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider<GenerateProviderManifest> taskProviderMock = mock(TaskProvider.class);
        TaskContainer taskContainerMock2 = mock(TaskContainer.class);
        TaskProvider<Sync> taskProviderMock2 = mock(TaskProvider.class);
        SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        SourceSet sourceSetMock = mock(SourceSet.class);
        SourceSetOutput sourceSetOutputMock = mock(SourceSetOutput.class);
        try (MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            doReturn("A").when(implProjectMock).getName();
            doReturn(configurationContainerMock).when(projectMock).getConfigurations();
            Dependency[] dependencyArray = new Dependency[] { dependencyMock };
            doReturn(configurationMock).when(configurationContainerMock).detachedConfiguration(dependencyArray);
            Object object = new Object();
            doReturn(object).when(configurationMock).attributes((Action) any());
            doReturn(dependencyHandlerMock).when(projectMock).getDependencies();
            doReturn(dependencyMock).when(dependencyHandlerMock).create(implProjectMock);
            doReturn(projectLayoutMock).when(projectMock).getLayout();
            doReturn(directoryPropertyMock).when(projectLayoutMock).getBuildDirectory();
            doReturn(providerMock).when(directoryPropertyMock).dir("generated-resources");
            doReturn(providerMock2, providerMock3).when(providerMock).map((Transformer) any());
            doReturn(taskProviderMock).when(taskContainerMock).register("generateAProviderManifest", GenerateProviderManifest.class);
            doNothing().when(taskProviderMock).configure((Action) any());
            doReturn(taskContainerMock, taskContainerMock2).when(projectMock).getTasks();
            doReturn(taskProviderMock2).when(taskContainerMock2).register("generateAProviderImpl", Sync.class);
            doNothing().when(taskProviderMock2).configure((Action) any());
            doNothing().when(metaTaskMock).configure((Action) any());
            gradleUtils.when(() -> GradleUtils.getJavaSourceSets(projectMock)).thenReturn(sourceSetContainerMock);
            doReturn(sourceSetMock).when(sourceSetContainerMock).findByName("main");
            doReturn(sourceSetOutputMock).when(sourceSetMock).getOutput();
            doNothing().when(sourceSetOutputMock).dir(taskProviderMock2);
            EmbeddedProviderExtension target = new EmbeddedProviderExtension(projectMock, metaTaskMock);
            //Act Statement(s)
            target.impl("B", implProjectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(implProjectMock).getName();
                verify(projectMock).getConfigurations();
                verify(configurationContainerMock).detachedConfiguration(dependencyArray);
                verify(configurationMock).attributes((Action) any());
                verify(projectMock).getDependencies();
                verify(dependencyHandlerMock).create(implProjectMock);
                verify(projectMock).getLayout();
                verify(projectLayoutMock).getBuildDirectory();
                verify(directoryPropertyMock).dir("generated-resources");
                verify(providerMock, atLeast(2)).map((Transformer) any());
                verify(projectMock, times(2)).getTasks();
                verify(taskContainerMock).register("generateAProviderManifest", GenerateProviderManifest.class);
                verify(taskProviderMock).configure((Action) any());
                verify(taskContainerMock2).register("generateAProviderImpl", Sync.class);
                verify(taskProviderMock2).configure((Action) any());
                verify(metaTaskMock).configure((Action) any());
                gradleUtils.verify(() -> GradleUtils.getJavaSourceSets(projectMock), atLeast(1));
                verify(sourceSetContainerMock).findByName("main");
                verify(sourceSetMock).getOutput();
                verify(sourceSetOutputMock).dir(taskProviderMock2);
            });
        }
    }
}

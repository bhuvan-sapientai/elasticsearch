package org.elasticsearch.gradle.internal.conventions.precommit;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.UnknownTaskException;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.Transformer;
import org.gradle.api.publish.PublicationContainer;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.gradle.api.provider.Provider;
import org.gradle.api.Project;
import org.gradle.api.tasks.TaskCollection;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.Task;
import org.gradle.api.publish.PublishingExtension;
import org.gradle.api.publish.maven.tasks.GenerateMavenPom;
import java.io.File;
import org.gradle.api.plugins.ExtensionContainer;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PomValidationPrecommitPluginSapientGeneratedTest {

    //Sapient generated method id: ${createTaskTest}, hash: B6F296610B7936EAD864889F928B0828
    @Disabled()
    @Test()
    void createTaskTest() throws UnknownDomainObjectException, UnknownTaskException, InvalidUserDataException {
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider<Task> taskProviderMock = mock(TaskProvider.class);
        doReturn(taskProviderMock).when(taskContainerMock).register("validatePom");
        doNothing().when(taskProviderMock).configure((Action) any());
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        PublishingExtension publishingExtensionMock = mock(PublishingExtension.class);
        doReturn(publishingExtensionMock).when(extensionContainerMock).getByType(PublishingExtension.class);
        PublicationContainer publicationContainerMock = mock(PublicationContainer.class);
        doReturn(publicationContainerMock).when(publishingExtensionMock).getPublications();
        doNothing().when(publicationContainerMock).configureEach((Action) any());
        TaskContainer taskContainerMock2 = mock(TaskContainer.class);
        TaskProvider<PomValidationTask> taskProviderMock2 = mock(TaskProvider.class);
        doReturn(taskProviderMock2).when(taskContainerMock2).register("validateAPom", PomValidationTask.class);
        doNothing().when(taskProviderMock2).configure((Action) any());
        TaskContainer taskContainerMock3 = mock(TaskContainer.class);
        doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3).when(projectMock).getTasks();
        TaskCollection taskCollectionMock = mock(TaskCollection.class);
        doReturn(taskCollectionMock).when(taskContainerMock3).withType(GenerateMavenPom.class);
        TaskProvider<GenerateMavenPom> taskProviderMock3 = mock(TaskProvider.class);
        doReturn(taskProviderMock3).when(taskCollectionMock).named("generatePomFileForAPublication");
        Provider<File> providerMock = mock(Provider.class);
        doReturn(providerMock).when(taskProviderMock3).map((Transformer) any());
        PomValidationPrecommitPlugin target = new PomValidationPrecommitPlugin();
        //Act Statement(s)
        TaskProvider<? extends Task> result = target.createTask(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(taskProviderMock));
            verify(projectMock, times(3)).getTasks();
            verify(taskContainerMock).register("validatePom");
            verify(taskProviderMock).configure((Action) any());
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).getByType(PublishingExtension.class);
            verify(publishingExtensionMock).getPublications();
            verify(publicationContainerMock).configureEach((Action) any());
            verify(taskContainerMock2).register("validateAPom", PomValidationTask.class);
            verify(taskProviderMock2).configure((Action) any());
            verify(taskContainerMock3).withType(GenerateMavenPom.class);
            verify(taskCollectionMock).named("generatePomFileForAPublication");
            verify(taskProviderMock3).map((Transformer) any());
        });
    }
}

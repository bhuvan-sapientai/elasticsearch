package org.elasticsearch.gradle.internal.conventions.precommit;

import org.elasticsearch.gradle.internal.conventions.precommit.PomValidationPrecommitPlugin;
import org.gradle.api.publish.Publication;
import static org.mockito.ArgumentMatchers.any;
import org.gradle.api.InvalidUserDataException;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;
import java.io.File;
import org.gradle.api.Action;
import org.elasticsearch.gradle.internal.conventions.GUtils;
import org.gradle.api.plugins.ExtensionContainer;
import static org.hamcrest.MatcherAssert.assertThat;
import org.gradle.api.publish.maven.tasks.GenerateMavenPom;
import org.junit.jupiter.params.provider.CsvSource;
import org.gradle.api.publish.PublicationContainer;
import static org.mockito.Mockito.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.tasks.TaskCollection;
import org.junit.jupiter.api.Timeout;
import org.gradle.api.UnknownTaskException;
import org.gradle.api.publish.PublishingExtension;
import org.gradle.api.UnknownDomainObjectException;
import org.elasticsearch.gradle.internal.conventions.precommit.PomValidationPrecommitPlugin;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.ArgumentCaptor;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.Transformer;
import org.gradle.api.Task;
import org.gradle.api.provider.Provider;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PomValidationPrecommitPluginSapientGeneratedTest {

    @Test
    void createTaskTest() throws UnknownDomainObjectException, UnknownTaskException, InvalidUserDataException {
        // Arrange
        Project projectMock = mock(Project.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider<Task> validatePomTaskProvider = mock(TaskProvider.class);
        PublishingExtension publishingExtensionMock = mock(PublishingExtension.class);
        PublicationContainer publicationContainerMock = mock(PublicationContainer.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        when(projectMock.getTasks()).thenReturn(taskContainerMock);
        when(taskContainerMock.register("validatePom")).thenReturn(validatePomTaskProvider);
        when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
        when(extensionContainerMock.getByType(PublishingExtension.class)).thenReturn(publishingExtensionMock);
        when(publishingExtensionMock.getPublications()).thenReturn(publicationContainerMock);
        PomValidationPrecommitPlugin plugin = new PomValidationPrecommitPlugin();
        // Act
        TaskProvider<? extends Task> result = plugin.createTask(projectMock);
        // Assert
        assertNotNull(result);
        assertEquals(validatePomTaskProvider, result);
        verify(taskContainerMock).register("validatePom");
        verify(projectMock).getExtensions();
        verify(extensionContainerMock).getByType(PublishingExtension.class);
        verify(publishingExtensionMock).getPublications();
        verify(publicationContainerMock).configureEach(any(Action.class));
    }

    @Disabled()
    @ParameterizedTest
    @CsvSource({ "test, Test", "main, Main", "custom, Custom" })
    void createTaskWithDifferentPublicationNamesTest(String publicationName, String capitalizedName) {
        // Arrange
        Project projectMock = mock(Project.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider<Task> validatePomTaskProvider = mock(TaskProvider.class);
        PublishingExtension publishingExtensionMock = mock(PublishingExtension.class);
        PublicationContainer publicationContainerMock = mock(PublicationContainer.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        Publication publicationMock = mock(Publication.class);
        TaskProvider<PomValidationTask> validateTaskProvider = mock(TaskProvider.class);
        TaskCollection<GenerateMavenPom> generateMavenPomTasks = mock(TaskCollection.class);
        TaskProvider<GenerateMavenPom> generateMavenPomTaskProvider = mock(TaskProvider.class);
        when(projectMock.getTasks()).thenReturn(taskContainerMock);
        when(taskContainerMock.register("validatePom")).thenReturn(validatePomTaskProvider);
        when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
        when(extensionContainerMock.getByType(PublishingExtension.class)).thenReturn(publishingExtensionMock);
        when(publishingExtensionMock.getPublications()).thenReturn(publicationContainerMock);
        when(publicationMock.getName()).thenReturn(publicationName);
        when(taskContainerMock.register("validate" + capitalizedName + "Pom", PomValidationTask.class)).thenReturn(validateTaskProvider);
        when(taskContainerMock.withType(GenerateMavenPom.class)).thenReturn(generateMavenPomTasks);
        when(generateMavenPomTasks.named("generatePomFileFor" + capitalizedName + "Publication")).thenReturn(generateMavenPomTaskProvider);
        PomValidationPrecommitPlugin plugin = new PomValidationPrecommitPlugin();
        // Act
        TaskProvider<? extends Task> result = plugin.createTask(projectMock);
        // Assert
        assertNotNull(result);
        assertEquals(validatePomTaskProvider, result);
        verify(taskContainerMock).register("validatePom");
        verify(projectMock).getExtensions();
        verify(extensionContainerMock).getByType(PublishingExtension.class);
        verify(publishingExtensionMock).getPublications();
        verify(publicationContainerMock).configureEach(any(Action.class));
        // Simulate the configureEach action
        Action<Publication> configureEachAction = extractConfigureEachAction(publicationContainerMock);
        configureEachAction.execute(publicationMock);
        verify(taskContainerMock).register("validate" + capitalizedName + "Pom", PomValidationTask.class);
        verify(validatePomTaskProvider).configure(any(Action.class));
        verify(validateTaskProvider).configure(any(Action.class));
        verify(taskContainerMock).withType(GenerateMavenPom.class);
        verify(generateMavenPomTasks).named("generatePomFileFor" + capitalizedName + "Publication");
    }

    @SuppressWarnings("unchecked")
    private Action<Publication> extractConfigureEachAction(PublicationContainer publicationContainerMock) {
        ArgumentCaptor<Action<Publication>> actionCaptor = ArgumentCaptor.forClass(Action.class);
        verify(publicationContainerMock).configureEach(actionCaptor.capture());
        return actionCaptor.getValue();
    }
}

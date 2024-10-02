package org.elasticsearch.gradle.internal.conventions.precommit;

import org.elasticsearch.gradle.internal.conventions.precommit.PrecommitTask;
import java.nio.file.StandardOpenOption;
import java.nio.file.Files;
import javax.inject.Inject;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.tasks.OutputFile;
import org.junit.jupiter.api.Test;
import java.io.File;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.file.ProjectLayout;
import org.junit.jupiter.api.io.TempDir;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.io.IOException;
import org.gradle.api.provider.Provider;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

class PrecommitTaskSapientGeneratedTest {

    @Disabled()
    @Test
    void getSuccessMarkerTest() {
        // Arrange
        PrecommitTask target = spy(new PrecommitTask());
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        doReturn(projectLayoutMock).when(target).getProjectLayout();
        DirectoryProperty directoryPropertyMock = mock(DirectoryProperty.class);
        doReturn(directoryPropertyMock).when(projectLayoutMock).getBuildDirectory();
        Provider<File> providerMock = mock(Provider.class);
        doReturn(providerMock).when(directoryPropertyMock).getAsFile();
        File buildDir = new File("build");
        doReturn(buildDir).when(providerMock).get();
        doReturn("testTask").when(target).getName();
        // Act
        File result = target.getSuccessMarker();
        // Assert
        File expected = new File(buildDir, "markers/testTask");
        assertAll(() -> assertThat(result, equalTo(expected)), () -> verify(target).getProjectLayout(), () -> verify(projectLayoutMock).getBuildDirectory(), () -> verify(directoryPropertyMock).getAsFile(), () -> verify(providerMock).get(), () -> verify(target).getName());
    }

    @Disabled()
    @Test
    void writeMarkerTest(@TempDir File tempDir) throws IOException {
        // Arrange
        PrecommitTask target = spy(new PrecommitTask());
        File markerFile = new File(tempDir, "testMarker");
        doReturn(markerFile).when(target).getSuccessMarker();
        // Act
        target.writeMarker();
        // Assert
        assertAll(() -> verify(target).getSuccessMarker(), () -> assertTrue(markerFile.exists(), "Marker file should be created"), () -> assertThat(Files.size(markerFile.toPath()), is(0L)));
    }

    @Disabled()
    @Test
    void getProjectLayoutThrowsUnsupportedOperationException() {
        // Arrange
        PrecommitTask target = new PrecommitTask();
        // Act & Assert
        UnsupportedOperationException exception = assertThrows(UnsupportedOperationException.class, target::getProjectLayout);
        assertThat(exception, is(notNullValue()));
    }
}

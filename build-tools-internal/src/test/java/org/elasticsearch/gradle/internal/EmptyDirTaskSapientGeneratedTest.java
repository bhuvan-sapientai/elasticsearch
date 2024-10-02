package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.EmptyDirTask;

import org.gradle.internal.file.FileException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import static org.mockito.Mockito.*;

import org.gradle.internal.file.Chmod;

import static org.mockito.ArgumentMatchers.any;

class EmptyDirTaskSapientGeneratedTest {

    @Test
    void createTest() throws FileException {
        // Arrange
        EmptyDirTask target = spy(new EmptyDirTask());
        Chmod chmodMock = mock(Chmod.class);
        doReturn(chmodMock).when(target).getChmod();
        File file = new File("testDir");
        target.setDir(file);
        target.setDirMode(0755);
        // Act
        target.create();
        // Assert
        verify(chmodMock).chmod(file, 0755);
        assertTrue(file.exists());
        assertTrue(file.isDirectory());
    }

    @Test
    void getChmodThrowsUnsupportedOperationException() {
        // Arrange
        EmptyDirTask target = new EmptyDirTask();
        // Act & Assert
        assertThrows(UnsupportedOperationException.class, target::getChmod);
    }

    @Test
    void getDirPathTest() {
        // Arrange
        EmptyDirTask target = new EmptyDirTask();
        File testDir = new File("testDir");
        target.setDir(testDir);
        // Act
        String result = target.getDirPath();
        // Assert
        assertThat(result, equalTo(testDir.getPath()));
    }

    @Test
    void setAndGetDirTest() {
        // Arrange
        EmptyDirTask target = new EmptyDirTask();
        File testDir = new File("testDir");
        // Act
        target.setDir(testDir);
        File result = target.getDir();
        // Assert
        assertThat(result, equalTo(testDir));
    }

    @Test
    void setAndGetDirModeTest() {
        // Arrange
        EmptyDirTask target = new EmptyDirTask();
        int testMode = 0644;
        // Act
        target.setDirMode(testMode);
        int result = target.getDirMode();
        // Assert
        assertThat(result, equalTo(testMode));
    }
}

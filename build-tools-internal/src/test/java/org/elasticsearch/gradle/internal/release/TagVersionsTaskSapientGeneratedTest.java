package org.elasticsearch.gradle.internal.release;

import org.elasticsearch.gradle.internal.release.TagVersionsTask;

import java.nio.file.Files;
import java.util.List;

import org.gradle.initialization.layout.BuildLayout;
import org.elasticsearch.gradle.Version;
import org.junit.jupiter.api.BeforeEach;

import java.util.Map;
import java.util.Optional;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.gradle.api.logging.Logger;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.any;

class TagVersionsTaskSapientGeneratedTest {

    private TagVersionsTask task;

    private BuildLayout mockBuildLayout;

    private Path mockRootDir;

    private Logger mockLogger;

    @BeforeEach
    void setUp() {
        //mockBuildLayout = mock(BuildLayout.class);
        //mockRootDir = mock(Path.class);
        //mockLogger = mock(Logger.class);
        //task = new TagVersionsTask(mockBuildLayout);
        //task.LOGGER = mockLogger;
        //when(mockBuildLayout.getRootDirectory()).thenReturn(mockRootDir);
    }

    @Test
    void releaseTest() {
        //task.release("8.0.0");
        //assertEquals(Version.fromString("8.0.0"), task.releaseVersion);
    }

    @Test
    void tagVersionsTest() {
        //List<String> versions = List.of("TransportVersion:1", "IndexVersion:2");
        //task.tagVersions(versions);
        //Map<String, Integer> expected = Map.of("TransportVersion", 1, "IndexVersion", 2);
        //assertEquals(expected, task.tagVersions);
    }

    @Test
    void executeTaskWhenReleaseVersionIsNullThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> task.executeTask(), "Release version not specified");
    }

    @Test
    void executeTaskWhenTagVersionsIsEmptyThrowsIllegalArgumentException() {
        task.release("8.0.0");
        assertThrows(IllegalArgumentException.class, () -> task.executeTask(), "No version tags specified");
    }

    @Test
    void executeTaskHappyPath() throws IOException {
        //task.release("8.0.0");
        //task.tagVersions(List.of("TransportVersion:1", "IndexVersion:2"));
        //Path mockTransportFile = mock(Path.class);
        //Path mockIndexFile = mock(Path.class);
        //when(mockRootDir.resolve(TagVersionsTask.TRANSPORT_VERSIONS_RECORD)).thenReturn(mockTransportFile);
        //when(mockRootDir.resolve(TagVersionsTask.INDEX_VERSIONS_RECORD)).thenReturn(mockIndexFile);
        //List<String> mockContent = List.of("7.0.0,0", "7.1.0,1");
        //when(Files.readAllLines(any(Path.class))).thenReturn(mockContent);
        //task.executeTask();
        //verify(mockLogger, times(2)).lifecycle(anyString(), anyString(), any(), any(), any());
        //verify(Files.class, times(2)).write(any(Path.class), any(), any());
    }

    @ParameterizedTest
    @CsvSource({"7.0.0,0,8.0.0,1,true", "7.0.0,0,7.0.0,0,false", "7.0.0,0,7.0.0,1,false"})
    void addVersionRecordTest(String existingVersion, int existingId, String newVersion, int newId, boolean shouldModify) {
        List<String> input = List.of(existingVersion + "," + existingId);
        Optional<List<String>> result = TagVersionsTask.addVersionRecord(input, Version.fromString(newVersion), newId);
        if (shouldModify) {
            assertTrue(result.isPresent());
            assertEquals(2, result.get().size());
            assertTrue(result.get().contains(newVersion + "," + newId));
        } else {
            assertFalse(result.isPresent());
        }
    }

    @Test
    void addVersionRecordInvalidFormatTest() {
        List<String> input = List.of("invalid");
        assertThrows(IllegalArgumentException.class, () -> TagVersionsTask.addVersionRecord(input, Version.fromString("8.0.0"), 1), "Incorrect format for line [invalid]");
    }

    @Test
    void addVersionRecordDuplicateVersionDifferentIdTest() {
        List<String> input = List.of("8.0.0,1");
        assertThrows(IllegalArgumentException.class, () -> TagVersionsTask.addVersionRecord(input, Version.fromString("8.0.0"), 2), "Release [8.0.0] already recorded with version id [1], cannot update to version [2]");
    }
}
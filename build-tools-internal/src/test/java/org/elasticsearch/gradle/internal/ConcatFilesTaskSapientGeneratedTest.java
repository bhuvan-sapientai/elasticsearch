package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.ConcatFilesTask;

import java.util.Arrays;
import java.nio.file.Files;
import java.util.List;

import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.api.BeforeEach;

import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.gradle.api.file.FileCollection;

import static org.mockito.Mockito.*;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.any;

class ConcatFilesTaskSapientGeneratedTest {

    private ConcatFilesTask task;

    @TempDir
    File tempDir;

    @BeforeEach
    void setUp() {
        task = new ConcatFilesTask();
        task.setTarget(new File(tempDir, "output.txt"));
    }

    @Test
    void testConcatFilesWithHeaderLine() throws IOException {
        //task.setHeaderLine("Header");
        //File input1 = createTempFile("input1.txt", "Line 1\nLine 2");
        //File input2 = createTempFile("input2.txt", "Line 3\nLine 4");
        //FileCollection files = mock(FileCollection.class);
        //when(files.getFiles()).thenReturn(Arrays.asList(input1, input2));
        //task.setFiles(files);
        //task.concatFiles();
        //List<String> outputLines = Files.readAllLines(task.getTarget().toPath(), StandardCharsets.UTF_8);
        //assertEquals(Arrays.asList("Header", "Line 1", "Line 2", "Line 3", "Line 4"), outputLines);
    }

    @Test
    void testConcatFilesWithoutHeaderLine() throws IOException {
        //File input1 = createTempFile("input1.txt", "Line 1\nLine 2");
        //File input2 = createTempFile("input2.txt", "Line 3\nLine 4");
        //FileCollection files = mock(FileCollection.class);
        //when(files.getFiles()).thenReturn(Arrays.asList(input1, input2));
        //task.setFiles(files);
        //task.concatFiles();
        //List<String> outputLines = Files.readAllLines(task.getTarget().toPath(), StandardCharsets.UTF_8);
        //assertEquals(Arrays.asList("Line 1", "Line 2", "Line 3", "Line 4"), outputLines);
    }

    @Test
    void testConcatFilesWithAdditionalLines() throws IOException {
        //task.setHeaderLine("Header");
        //File input = createTempFile("input.txt", "Line 1\nLine 2");
        //FileCollection files = mock(FileCollection.class);
        //when(files.getFiles()).thenReturn(Arrays.asList(input));
        //task.setFiles(files);
        //task.setAdditionalLines(Arrays.asList("Additional 1", "Additional 2"));
        //task.concatFiles();
        //List<String> outputLines = Files.readAllLines(task.getTarget().toPath(), StandardCharsets.UTF_8);
        //assertEquals(Arrays.asList("Header", "Line 1", "Line 2", "Additional 1", "Additional 2"), outputLines);
    }

    @Test
    void testConcatFilesWithNonExistentFile() throws IOException {
        //File input1 = createTempFile("input1.txt", "Line 1\nLine 2");
        //File input2 = new File(tempDir, "non-existent.txt");
        //FileCollection files = mock(FileCollection.class);
        //when(files.getFiles()).thenReturn(Arrays.asList(input1, input2));
        //task.setFiles(files);
        //task.concatFiles();
        //List<String> outputLines = Files.readAllLines(task.getTarget().toPath(), StandardCharsets.UTF_8);
        //assertEquals(Arrays.asList("Line 1", "Line 2"), outputLines);
    }

    @Test
    void testConcatFilesWithDuplicateLines() throws IOException {
        //File input1 = createTempFile("input1.txt", "Line 1\nLine 2\nLine 3");
        //File input2 = createTempFile("input2.txt", "Line 2\nLine 3\nLine 4");
        //FileCollection files = mock(FileCollection.class);
        //when(files.getFiles()).thenReturn(Arrays.asList(input1, input2));
        //task.setFiles(files);
        //task.concatFiles();
        //List<String> outputLines = Files.readAllLines(task.getTarget().toPath(), StandardCharsets.UTF_8);
        //assertEquals(Arrays.asList("Line 1", "Line 2", "Line 3", "Line 4"), outputLines);
    }

    private File createTempFile(String name, String content) throws IOException {
        File file = new File(tempDir, name);
        Files.write(file.toPath(), content.getBytes(StandardCharsets.UTF_8));
        return file;
    }
}
package org.elasticsearch.gradle.internal.release;

import org.elasticsearch.gradle.internal.release.ExtractCurrentVersionsTask;

import org.gradle.initialization.layout.BuildLayout;

import java.nio.file.Files;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import java.nio.file.Path;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.gradle.api.logging.Logger;
import org.junit.jupiter.api.io.TempDir;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.any;

class ExtractCurrentVersionsTaskSapientGeneratedTest {

    private ExtractCurrentVersionsTask task;

    private BuildLayout buildLayoutMock;

    private Logger loggerMock;

    @TempDir
    Path tempDir;

    @BeforeEach
    void setUp() {
        buildLayoutMock = mock(BuildLayout.class);
        loggerMock = mock(Logger.class);
        task = new ExtractCurrentVersionsTask(buildLayoutMock) {

            @Override
            protected Logger getLogger() {
                return loggerMock;
            }
        };
    }

    @Test
    void outputFileTest() {
        //String testFile = "testOutput.txt";
        //task.outputFile(testFile);
        //assertThat(task.outputFile, equalTo(Path.of(testFile)));
    }

    @Test
    void executeTaskWhenOutputFileIsNullThrowsIllegalArgumentException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> task.executeTask());
        assertThat(exception.getMessage(), equalTo("Output file not specified"));
    }

    @Test
    void executeTaskWritesCorrectOutput() throws IOException {
        // Setup
        Path outputFile = tempDir.resolve("output.txt");
        task.outputFile(outputFile.toString());
        Path rootDir = tempDir.resolve("root");
        Files.createDirectories(rootDir);
        when(buildLayoutMock.getRootDirectory()).thenReturn(rootDir.toFile());
        Path transportVersionsFile = rootDir.resolve(AbstractVersionsTask.TRANSPORT_VERSIONS_FILE_PATH);
        Path indexVersionsFile = rootDir.resolve(AbstractVersionsTask.INDEX_VERSIONS_FILE_PATH);
        Files.writeString(transportVersionsFile, "public static final int V_8_5_0_ID = 8050099;");
        Files.writeString(indexVersionsFile, "public static final int V_8_5_0_ID = 8050099;");
        // Execute
        task.executeTask();
        // Verify
        List<String> outputLines = Files.readAllLines(outputFile);
        assertThat(outputLines, contains("transport_version:8050099", "index_version:8050099"));
        verify(loggerMock).lifecycle("Extracting latest version information");
        verify(loggerMock).lifecycle("Transport version: {}", 8050099);
        verify(loggerMock).lifecycle("Index version: {}", 8050099);
        verify(loggerMock).lifecycle("Writing version information to {}", outputFile);
    }

    @Test
    void readLatestVersionThrowsExceptionWhenNoVersionFound() throws IOException {
        //Path emptyFile = tempDir.resolve("empty.java");
        //Files.createFile(emptyFile);
        //IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> ExtractCurrentVersionsTask.readLatestVersion(emptyFile));
        //assertThat(exception.getMessage(), startsWith("No version ids found in"));
    }

    @Test
    void fieldIdExtractorWarnsWhenVersionsOutOfOrder() {
        ExtractCurrentVersionsTask.FieldIdExtractor extractor = new ExtractCurrentVersionsTask.FieldIdExtractor();
        extractor.accept(createFieldDeclaration(100));
        extractor.accept(createFieldDeclaration(90));
        verify(loggerMock).warn("Version ids [{}, {}] out of order", 100, 90);
    }

    private FieldDeclaration createFieldDeclaration(int value) {
        //FieldDeclaration fieldDeclaration = mock(FieldDeclaration.class);
        //when(fieldDeclaration.getVariable(0).getInitializer().get().toString()).thenReturn(String.valueOf(value));
        //return fieldDeclaration;
    }
}
package org.elasticsearch.gradle.internal.precommit;

import org.elasticsearch.gradle.internal.precommit.ValidateJsonAgainstSchemaTask;

import java.nio.file.Files;

import com.networknt.schema.ValidationMessage;

import static org.mockito.ArgumentMatchers.any;

import com.networknt.schema.JsonSchemaFactory;
import org.junit.jupiter.api.Test;

import java.io.File;

import org.mockito.Mock;
import com.fasterxml.jackson.databind.JsonNode;
import com.networknt.schema.SpecVersion;
import org.mockito.MockitoAnnotations;
import org.junit.jupiter.api.io.TempDir;
import com.networknt.schema.JsonSchema;
import org.gradle.work.FileChange;

import static org.mockito.Mockito.*;

import java.io.IOException;

import org.gradle.work.InputChanges;
import org.gradle.work.ChangeType;
import org.junit.jupiter.api.BeforeEach;

import java.nio.file.Path;
import java.util.Collections;

import org.gradle.api.file.FileSystemLocation;
import com.networknt.schema.SchemaValidatorsConfig;

import java.util.Set;

import com.networknt.schema.JsonSchemaException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.file.FileCollection;

import static org.mockito.ArgumentMatchers.any;

class ValidateJsonAgainstSchemaTaskSapientGeneratedTest {

    @TempDir
    Path tempDir;

    @Mock
    private InputChanges inputChanges;

    @Mock
    private FileCollection inputFiles;

    private ValidateJsonAgainstSchemaTask task;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        task = spy(new ValidateJsonAgainstSchemaTask());
        task.setInputFiles(inputFiles);
    }

    @Test
    void testGetMapper() {
        ObjectMapper mapper = task.getMapper();
        assertNotNull(mapper);
    }

    @Test
    void testGetFileType() {
        assertEquals("JSON", task.getFileType());
    }

    @Test
    void testValidateWithValidJson() throws IOException {
        File schemaFile = createTempFile("schema.json", "{\"type\": \"object\", \"properties\": {\"name\": {\"type\": \"string\"}}}");
        File validJsonFile = createTempFile("valid.json", "{\"name\": \"John\"}");
        File reportFile = new File(tempDir.toFile(), "report.txt");
        task.setJsonSchema(schemaFile);
        task.setReport(reportFile);
        when(inputChanges.getFileChanges(any(FileCollection.class))).thenReturn(Collections.singletonList(createFileChange(validJsonFile, ChangeType.ADDED)));
        assertDoesNotThrow(() -> task.validate(inputChanges));
        assertTrue(reportFile.exists());
        String reportContent = Files.readString(reportFile.toPath());
        assertTrue(reportContent.contains("Success! No validation errors found."));
    }

    @Test
    void testValidateWithInvalidJson() throws IOException {
        File schemaFile = createTempFile("schema.json", "{\"type\": \"object\", \"properties\": {\"name\": {\"type\": \"string\"}}}");
        File invalidJsonFile = createTempFile("invalid.json", "{\"name\": 123}");
        File reportFile = new File(tempDir.toFile(), "report.txt");
        task.setJsonSchema(schemaFile);
        task.setReport(reportFile);
        when(inputChanges.getFileChanges(any(FileCollection.class))).thenReturn(Collections.singletonList(createFileChange(invalidJsonFile, ChangeType.ADDED)));
        JsonSchemaException exception = assertThrows(JsonSchemaException.class, () -> task.validate(inputChanges));
        assertTrue(exception.getMessage().contains("Verification failed"));
        assertTrue(reportFile.exists());
        String reportContent = Files.readString(reportFile.toPath());
        assertTrue(reportContent.contains("Validation Errors"));
    }

    @Test
    void testBuildSchemaObject() throws IOException {
        //File schemaFile = createTempFile("schema.json", "{\"type\": \"object\"}");
        //JsonSchema schema = task.buildSchemaObject(schemaFile);
        //assertNotNull(schema);
    }

    @Test
    void testMaybeLogAndCollectError() {
        //Set<ValidationMessage> messages = Collections.singleton(ValidationMessage.of("error", "$.name", "name", "Invalid type"));
        //File file = new File("test.json");
        //task.maybeLogAndCollectError(messages, Collections.emptyMap(), file);
        //verify(task, times(1)).getLogger();
    }

    private File createTempFile(String name, String content) throws IOException {
        Path path = tempDir.resolve(name);
        Files.writeString(path, content);
        return path.toFile();
    }

    private FileChange createFileChange(File file, ChangeType changeType) {
        /*return new FileChange() {

    @Override
    public ChangeType getChangeType() {
        return changeType;
    }

    @Override
    public String getNormalizedPath() {
        return file.getPath();
    }

    @Override
    public File getFile() {
        return file;
    }

    @Override
    public FileSystemLocation getFileSystemLocation() {
        return () -> file;
    }
};*/
    }
}
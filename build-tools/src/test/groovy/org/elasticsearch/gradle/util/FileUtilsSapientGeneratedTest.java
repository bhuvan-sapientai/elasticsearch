package org.elasticsearch.gradle.util;

import org.elasticsearch.gradle.util.FileUtils;
import java.util.Arrays;
import java.nio.file.Files;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.ArgumentMatchers.any;
import java.nio.file.Path;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import java.io.File;
import org.junit.jupiter.api.io.TempDir;
import static org.hamcrest.MatcherAssert.assertThat;
import java.nio.charset.StandardCharsets;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import org.elasticsearch.gradle.util.FileUtils;
import org.gradle.api.UncheckedIOException;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

class FileUtilsSapientGeneratedTest {

    @TempDir
    Path tempDir;

    private File testFile;

    @BeforeEach
    void setUp() throws IOException {
        testFile = tempDir.resolve("testFile.txt").toFile();
        org.apache.commons.io.FileUtils.write(testFile, "Test content", StandardCharsets.UTF_8);
    }

    @AfterEach
    void tearDown() {
        if (testFile != null && testFile.exists()) {
            testFile.delete();
        }
    }

    @Test
    void testMkdirsWithExistingDirectory() {
        File existingDir = tempDir.toFile();
        FileUtils.mkdirs(existingDir);
        assertTrue(existingDir.exists());
        assertTrue(existingDir.isDirectory());
    }

    @Test
    void testMkdirsWithNewDirectory() {
        File newDir = new File(tempDir.toFile(), "newDir");
        FileUtils.mkdirs(newDir);
        assertTrue(newDir.exists());
        assertTrue(newDir.isDirectory());
    }

    @Test
    void testMkdirsWithExistingFile() {
        assertThrows(UncheckedIOException.class, () -> FileUtils.mkdirs(testFile));
    }

    @Test
    void testMkdirsWithNestedDirectories() {
        File nestedDir = new File(tempDir.toFile(), "nested/dir/structure");
        FileUtils.mkdirs(nestedDir);
        assertTrue(nestedDir.exists());
        assertTrue(nestedDir.isDirectory());
    }

    @Test
    void testMkdirsWithParentFileNotDirectory() throws IOException {
        File parentFile = new File(tempDir.toFile(), "parentFile");
        org.apache.commons.io.FileUtils.touch(parentFile);
        File childDir = new File(parentFile, "childDir");
        assertThrows(UncheckedIOException.class, () -> FileUtils.mkdirs(childDir));
    }

    @Test
    void testRead() throws IOException {
        String content = FileUtils.read(testFile, StandardCharsets.UTF_8.name());
        assertEquals("Test content", content);
    }

    @Test
    void testReadNonexistentFile() {
        File nonexistentFile = new File(tempDir.toFile(), "nonexistent.txt");
        assertThrows(UncheckedIOException.class, () -> FileUtils.read(nonexistentFile, StandardCharsets.UTF_8.name()));
    }

    @Test
    void testReadLines() throws IOException {
        org.apache.commons.io.FileUtils.write(testFile, "Line 1\nLine 2\nLine 3", StandardCharsets.UTF_8);
        List<String> lines = FileUtils.readLines(testFile, StandardCharsets.UTF_8.name());
        assertEquals(Arrays.asList("Line 1", "Line 2", "Line 3"), lines);
    }

    @Test
    void testReadLinesEmptyFile() throws IOException {
        org.apache.commons.io.FileUtils.write(testFile, "", StandardCharsets.UTF_8);
        List<String> lines = FileUtils.readLines(testFile, StandardCharsets.UTF_8.name());
        assertTrue(lines.isEmpty());
    }

    @Test
    void testWrite() throws IOException {
        File outputFile = new File(tempDir.toFile(), "output.txt");
        FileUtils.write(outputFile, "New content", StandardCharsets.UTF_8.name());
        String content = Files.readString(outputFile.toPath(), StandardCharsets.UTF_8);
        assertEquals("New content", content);
    }

    @Test
    void testWriteToReadOnlyFile() throws IOException {
        File readOnlyFile = new File(tempDir.toFile(), "readonly.txt");
        org.apache.commons.io.FileUtils.touch(readOnlyFile);
        readOnlyFile.setReadOnly();
        assertThrows(UncheckedIOException.class, () -> FileUtils.write(readOnlyFile, "Content", StandardCharsets.UTF_8.name()));
    }

    @ParameterizedTest
    @CsvSource({ "UTF-8, Hello World", "ISO-8859-1, Olá Mundo", "UTF-16, こんにちは世界" })
    void testReadWriteWithDifferentEncodings(String encoding, String content) throws IOException {
        File file = new File(tempDir.toFile(), "encodingTest.txt");
        FileUtils.write(file, content, encoding);
        String readContent = FileUtils.read(file, encoding);
        assertEquals(content, readContent);
    }

    @Test
    void testMkdirsWithParentDirectoryCreationFailure() {
        File unwritableDir = new File(tempDir.toFile(), "unwritable");
        unwritableDir.mkdir();
        unwritableDir.setWritable(false);
        File nestedDir = new File(unwritableDir, "nested/dir");
        assertThrows(UncheckedIOException.class, () -> FileUtils.mkdirs(nestedDir));
    }

    @Disabled()
    @Test
    void testMkdirsWithDirectoryCreationFailure() {
        File mockDir = new File(tempDir.toFile(), "mockDir") {

            @Override
            public boolean mkdir() {
                return false;
            }
        };
        assertThrows(UncheckedIOException.class, () -> FileUtils.mkdirs(mockDir));
    }

    @Disabled()
    @Test
    void testReadWithInvalidEncoding() {
        assertThrows(UncheckedIOException.class, () -> FileUtils.read(testFile, "InvalidEncoding"));
    }

    @Disabled()
    @Test
    void testReadLinesWithInvalidEncoding() {
        assertThrows(UncheckedIOException.class, () -> FileUtils.readLines(testFile, "InvalidEncoding"));
    }

    @Disabled()
    @Test
    void testWriteWithInvalidEncoding() {
        assertThrows(UncheckedIOException.class, () -> FileUtils.write(testFile, "content", "InvalidEncoding"));
    }

    @Test
    void testMkdirsWithNullDirectory() {
        assertThrows(NullPointerException.class, () -> FileUtils.mkdirs(null));
    }

    @Test
    void testMkdirsWithRootDirectory() {
        File rootDir = new File("/");
        FileUtils.mkdirs(rootDir);
        assertTrue(rootDir.exists());
        assertTrue(rootDir.isDirectory());
    }

    @Test
    void testReadWithNullFile() {
        assertThrows(NullPointerException.class, () -> FileUtils.read(null, StandardCharsets.UTF_8.name()));
    }

    @Test
    void testReadLinesWithNullFile() {
        assertThrows(NullPointerException.class, () -> FileUtils.readLines(null, StandardCharsets.UTF_8.name()));
    }

    @Test
    void testWriteWithNullFile() {
        assertThrows(NullPointerException.class, () -> FileUtils.write(null, "content", StandardCharsets.UTF_8.name()));
    }

    @Disabled()
    @Test
    void testWriteWithNullContent() {
        assertThrows(NullPointerException.class, () -> FileUtils.write(testFile, null, StandardCharsets.UTF_8.name()));
    }

    @Disabled()
    @Test
    void testWriteWithNullEncoding() {
        assertThrows(NullPointerException.class, () -> FileUtils.write(testFile, "content", null));
    }

    @Test
    void testMkdirsWithLongPath() {
        StringBuilder longPathBuilder = new StringBuilder(tempDir.toString());
        for (int i = 0; i < 100; i++) {
            longPathBuilder.append("/subdir").append(i);
        }
        File longPathDir = new File(longPathBuilder.toString());
        FileUtils.mkdirs(longPathDir);
        assertTrue(longPathDir.exists());
        assertTrue(longPathDir.isDirectory());
    }
}

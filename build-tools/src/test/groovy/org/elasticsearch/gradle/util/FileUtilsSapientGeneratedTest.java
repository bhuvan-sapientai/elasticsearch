package org.elasticsearch.gradle.util;

// import org.elasticsearch.gradle.util.FileUtils;
// import java.util.Arrays;
// import java.util.LinkedList;
// import java.nio.file.Files;
// import java.util.List;
// import org.junit.jupiter.api.BeforeEach;
// import java.nio.file.Path;
// import org.junit.jupiter.api.AfterEach;
// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.params.ParameterizedTest;
// import java.util.Collections;
// import java.io.File;
// import org.apache.commons.io.FileUtils;
// import org.junit.jupiter.api.io.TempDir;
// import static org.hamcrest.MatcherAssert.assertThat;
// import java.nio.charset.StandardCharsets;
// import static org.hamcrest.Matchers.*;
// import org.junit.jupiter.params.provider.CsvSource;
// import static org.junit.jupiter.api.Assertions.*;
// import java.io.IOException;
// import org.gradle.api.UncheckedIOException;
// import static org.mockito.ArgumentMatchers.any;

class FileUtilsSapientGeneratedTest {

//     @TempDir
//     Path tempDir;

//     private File testFile;

//     @BeforeEach
//     void setUp() throws IOException {
//         testFile = tempDir.resolve("testFile.txt").toFile();
//         FileUtils.write(testFile, "Test content", StandardCharsets.UTF_8);
//     }

//     @AfterEach
//     void tearDown() {
//         if (testFile != null && testFile.exists()) {
//             testFile.delete();
//         }
//     }

//     @Test
//     void testMkdirsWithExistingDirectory() {
//         File existingDir = tempDir.toFile();
//         org.elasticsearch.gradle.util.FileUtils.mkdirs(existingDir);
//         assertTrue(existingDir.exists());
//         assertTrue(existingDir.isDirectory());
//     }

//     @Test
//     void testMkdirsWithNewDirectory() {
//         File newDir = new File(tempDir.toFile(), "newDir");
//         org.elasticsearch.gradle.util.FileUtils.mkdirs(newDir);
//         assertTrue(newDir.exists());
//         assertTrue(newDir.isDirectory());
//     }

//     @Test
//     void testMkdirsWithExistingFile() {
//         assertThrows(UncheckedIOException.class, () -> org.elasticsearch.gradle.util.FileUtils.mkdirs(testFile));
//     }

//     @Test
//     void testMkdirsWithNestedDirectories() {
//         File nestedDir = new File(tempDir.toFile(), "nested/dir/structure");
//         org.elasticsearch.gradle.util.FileUtils.mkdirs(nestedDir);
//         assertTrue(nestedDir.exists());
//         assertTrue(nestedDir.isDirectory());
//     }

//     @Test
//     void testMkdirsWithParentFileNotDirectory() throws IOException {
//         File parentFile = new File(tempDir.toFile(), "parentFile");
//         FileUtils.touch(parentFile);
//         File childDir = new File(parentFile, "childDir");
//         assertThrows(UncheckedIOException.class, () -> org.elasticsearch.gradle.util.FileUtils.mkdirs(childDir));
//     }

//     @Test
//     void testRead() throws IOException {
//         String content = org.elasticsearch.gradle.util.FileUtils.read(testFile, StandardCharsets.UTF_8.name());
//         assertEquals("Test content", content);
//     }

//     @Test
//     void testReadNonexistentFile() {
//         File nonexistentFile = new File(tempDir.toFile(), "nonexistent.txt");
//         assertThrows(UncheckedIOException.class, () -> org.elasticsearch.gradle.util.FileUtils.read(nonexistentFile, StandardCharsets.UTF_8.name()));
//     }

//     @Test
//     void testReadLines() throws IOException {
//         FileUtils.write(testFile, "Line 1\nLine 2\nLine 3", StandardCharsets.UTF_8);
//         List<String> lines = org.elasticsearch.gradle.util.FileUtils.readLines(testFile, StandardCharsets.UTF_8.name());
//         assertEquals(Arrays.asList("Line 1", "Line 2", "Line 3"), lines);
//     }

//     @Test
//     void testReadLinesEmptyFile() throws IOException {
//         FileUtils.write(testFile, "", StandardCharsets.UTF_8);
//         List<String> lines = org.elasticsearch.gradle.util.FileUtils.readLines(testFile, StandardCharsets.UTF_8.name());
//         assertTrue(lines.isEmpty());
//     }

//     @Test
//     void testWrite() throws IOException {
//         File outputFile = new File(tempDir.toFile(), "output.txt");
//         org.elasticsearch.gradle.util.FileUtils.write(outputFile, "New content", StandardCharsets.UTF_8.name());
//         String content = Files.readString(outputFile.toPath(), StandardCharsets.UTF_8);
//         assertEquals("New content", content);
//     }

//     @Test
//     void testWriteToReadOnlyFile() throws IOException {
//         File readOnlyFile = new File(tempDir.toFile(), "readonly.txt");
//         FileUtils.touch(readOnlyFile);
//         readOnlyFile.setReadOnly();
//         assertThrows(UncheckedIOException.class, () -> org.elasticsearch.gradle.util.FileUtils.write(readOnlyFile, "Content", StandardCharsets.UTF_8.name()));
//     }

//     @ParameterizedTest
//     @CsvSource({ "UTF-8, Hello World", "ISO-8859-1, Olá Mundo", "UTF-16, こんにちは世界" })
//     void testReadWriteWithDifferentEncodings(String encoding, String content) throws IOException {
//         File file = new File(tempDir.toFile(), "encodingTest.txt");
//         org.elasticsearch.gradle.util.FileUtils.write(file, content, encoding);
//         String readContent = org.elasticsearch.gradle.util.FileUtils.read(file, encoding);
//         assertEquals(content, readContent);
//     }
}
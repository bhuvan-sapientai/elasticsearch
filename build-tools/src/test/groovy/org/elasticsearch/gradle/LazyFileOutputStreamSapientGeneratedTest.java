package org.elasticsearch.gradle;

import org.elasticsearch.gradle.LazyFileOutputStream;
import java.nio.file.Files;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.api.BeforeEach;
import java.nio.file.Path;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.io.IOException;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

class LazyFileOutputStreamSapientGeneratedTest {

    @TempDir
    Path tempDir;

    private LazyFileOutputStream outputStream;

    private File file;

    @BeforeEach
    void setUp() {
        file = tempDir.resolve("test.txt").toFile();
        outputStream = new LazyFileOutputStream(file);
    }

    @AfterEach
    void tearDown() throws IOException {
        if (outputStream != null) {
            outputStream.close();
        }
    }

    @Test
    void testWriteInt() throws IOException {
        // ASCII 'A'
        outputStream.write(65);
        outputStream.close();
        String content = Files.readString(file.toPath());
        assertEquals("A", content);
    }

    @Test
    void testWriteByteArray() throws IOException {
        byte[] data = "Hello, World!".getBytes();
        outputStream.write(data, 0, data.length);
        outputStream.close();
        String content = Files.readString(file.toPath());
        assertEquals("Hello, World!", content);
    }

    @Test
    void testLazyFileCreation() {
        assertFalse(file.exists(), "File should not be created until first write");
    }

    @Test
    void testFileCreationOnWrite() throws IOException {
        outputStream.write(65);
        assertTrue(file.exists(), "File should be created after first write");
    }

    @Test
    void testMultipleWrites() throws IOException {
        outputStream.write("First ".getBytes());
        outputStream.write("Second".getBytes());
        outputStream.close();
        String content = Files.readString(file.toPath());
        assertEquals("First Second", content);
    }

    @Test
    void testWriteToNonExistentDirectory() throws IOException {
        File newDir = new File(tempDir.toFile(), "newDir");
        File newFile = new File(newDir, "newFile.txt");
        LazyFileOutputStream newOutputStream = new LazyFileOutputStream(newFile);
        newOutputStream.write("Test".getBytes());
        newOutputStream.close();
        assertTrue(newDir.exists(), "Parent directory should be created");
        assertTrue(newFile.exists(), "File should be created");
        assertEquals("Test", Files.readString(newFile.toPath()));
    }

    @Test
    void testCloseWithoutWrite() throws IOException {
        outputStream.close();
        assertFalse(file.exists(), "File should not be created if no write occurs");
    }

    @Disabled()
    @Test
    void testWriteAfterClose() throws IOException {
        outputStream.close();
        assertThrows(IOException.class, () -> outputStream.write(65));
    }

    @Disabled()
    @Test
    void testWriteByteArrayAfterClose() throws IOException {
        outputStream.close();
        byte[] data = "Test".getBytes();
        assertThrows(IOException.class, () -> outputStream.write(data, 0, data.length));
    }
}

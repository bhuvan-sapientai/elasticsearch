package org.elasticsearch.gradle.internal.util;

import org.elasticsearch.gradle.internal.util.SourceDirectoryCommandLineArgumentProvider;

import org.gradle.api.tasks.InputDirectory;

import java.util.Arrays;

import org.gradle.api.tasks.PathSensitive;
import org.gradle.process.CommandLineArgumentProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.io.File;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.params.provider.CsvSource;
import org.gradle.api.file.Directory;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.gradle.api.tasks.PathSensitivity;

import static org.mockito.ArgumentMatchers.any;

class SourceDirectoryCommandLineArgumentProviderSapientGeneratedTest {

    private SourceDirectoryCommandLineArgumentProvider provider;

    private Directory mockDirectory;

    @BeforeEach
    void setUp() {
        mockDirectory = mock(Directory.class);
        provider = new SourceDirectoryCommandLineArgumentProvider(mockDirectory);
    }

    @Test
    void testAsArguments() {
        File mockFile = new File("/path/to/source");
        when(mockDirectory.getAsFile()).thenReturn(mockFile);
        Iterable<String> arguments = provider.asArguments();
        assertThat(arguments, contains("-s", "/path/to/source"));
    }

    @Test
    void testGetSourceDirectory() {
        Directory result = provider.getSourceDirectory();
        assertSame(mockDirectory, result);
    }

    @ParameterizedTest
    @CsvSource({"/path/to/source, -s, /path/to/source", "/another/path, -s, /another/path", "C:\\Windows\\Path, -s, C:\\Windows\\Path"})
    void testAsArgumentsWithDifferentPaths(String path, String expectedFlag, String expectedPath) {
        File mockFile = new File(path);
        when(mockDirectory.getAsFile()).thenReturn(mockFile);
        Iterable<String> arguments = provider.asArguments();
        assertThat(arguments, contains(expectedFlag, expectedPath));
    }

    @Test
    void testAsArgumentsWithNullDirectory() {
        provider = new SourceDirectoryCommandLineArgumentProvider(null);
        assertThrows(NullPointerException.class, () -> provider.asArguments());
    }

    @Test
    void testConstructorWithNullDirectory() {
        assertThrows(NullPointerException.class, () -> new SourceDirectoryCommandLineArgumentProvider(null));
    }

    @Test
    void testAsArgumentsReturnsSameInstanceOnMultipleCalls() {
        when(mockDirectory.getAsFile()).thenReturn(new File("/path/to/source"));
        Iterable<String> arguments1 = provider.asArguments();
        Iterable<String> arguments2 = provider.asArguments();
        assertNotSame(arguments1, arguments2);
        assertThat(arguments1, contains("-s", "/path/to/source"));
        assertThat(arguments2, contains("-s", "/path/to/source"));
    }

    @Test
    void testGetSourceDirectoryAnnotations() throws NoSuchMethodException {
        java.lang.reflect.Method method = SourceDirectoryCommandLineArgumentProvider.class.getMethod("getSourceDirectory");
        assertNotNull(method.getAnnotation(InputDirectory.class));
        assertEquals(PathSensitivity.RELATIVE, method.getAnnotation(PathSensitive.class).value());
    }

    @Test
    void testImplementsCommandLineArgumentProvider() {
        assertTrue(CommandLineArgumentProvider.class.isAssignableFrom(SourceDirectoryCommandLineArgumentProvider.class));
    }

    @Test
    void testAsArgumentsReturnsIterable() {
        when(mockDirectory.getAsFile()).thenReturn(new File("/test/path"));
        Iterable<String> result = provider.asArguments();
        assertTrue(result instanceof Iterable);
        assertThat(result, instanceOf(Iterable.class));
    }

    @Test
    void testAsArgumentsReturnsCorrectNumberOfArguments() {
        when(mockDirectory.getAsFile()).thenReturn(new File("/test/path"));
        Iterable<String> result = provider.asArguments();
        assertThat(result, iterableWithSize(2));
    }

    @Test
    void testAsArgumentsFirstArgumentIsAlwaysDashS() {
        when(mockDirectory.getAsFile()).thenReturn(new File("/any/path"));
        Iterable<String> result = provider.asArguments();
        assertThat(result, hasItem("-s"));
        assertThat(Arrays.asList(result).get(0), is("-s"));
    }
}

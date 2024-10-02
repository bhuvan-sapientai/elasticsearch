package org.elasticsearch.gradle.internal.release;

import org.elasticsearch.gradle.internal.release.MigrationIndexGenerator;

import static org.junit.jupiter.api.Assertions.assertAll;

import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;

import org.junit.jupiter.api.Timeout;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.mockito.ArgumentMatchers.anySet;

import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class MigrationIndexGeneratorSapientGeneratedTest {

    @Test
    void updateTest() throws IOException {
        Set<MinorVersion> minorVersionSet = new HashSet<>();
        File indexTemplate = mock(File.class);
        File indexFile = mock(File.class);
        Path mockPath = mock(Path.class);
        when(indexTemplate.toPath()).thenReturn(mockPath);
        try (MockedStatic<Files> mockedFiles = mockStatic(Files.class);
             MockedStatic<MigrationIndexGenerator> mockedGenerator = mockStatic(MigrationIndexGenerator.class, CALLS_REAL_METHODS)) {
            mockedFiles.when(() -> Files.readString(any(Path.class))).thenReturn("template content");
            mockedGenerator.when(() -> MigrationIndexGenerator.generateFile(anySet(), anyString())).thenReturn("generated content");
            MigrationIndexGenerator.update(minorVersionSet, indexTemplate, indexFile);
            mockedFiles.verify(() -> Files.readString(mockPath));
            mockedGenerator.verify(() -> MigrationIndexGenerator.generateFile(eq(minorVersionSet), eq("template content")));
        }
    }

    @Test
    void updateWhenDefaultBranchThrowsIOException() throws IOException {
        Set<MinorVersion> minorVersionSet = new HashSet<>();
        File indexTemplate = mock(File.class);
        File indexFile = mock(File.class);
        Path mockPath = mock(Path.class);
        when(indexTemplate.toPath()).thenReturn(mockPath);
        try (MockedStatic<Files> mockedFiles = mockStatic(Files.class)) {
            mockedFiles.when(() -> Files.readString(any(Path.class))).thenThrow(new IOException("Test exception"));
            assertThrows(IOException.class, () -> MigrationIndexGenerator.update(minorVersionSet, indexTemplate, indexFile));
            mockedFiles.verify(() -> Files.readString(mockPath));
        }
    }

    @Test
    void generateFileTest() throws IOException {
        Set<MinorVersion> versions = new HashSet<>();
        versions.add(new MinorVersion(8, 0));
        versions.add(new MinorVersion(7, 17));
        String template = "Template with ${versions} and ${includeVersions}";
        try (MockedStatic<TemplateUtils> mockedTemplateUtils = mockStatic(TemplateUtils.class)) {
            mockedTemplateUtils.when(() -> TemplateUtils.render(eq(template), anyMap())).thenReturn("Rendered template");
            String result = MigrationIndexGenerator.generateFile(versions, template);
            assertThat(result, is("Rendered template"));
            mockedTemplateUtils.verify(() -> TemplateUtils.render(eq(template), argThat(map -> map.containsKey("versions") && map.containsKey("includeVersions"))));
        }
    }

    @Test
    void generateFileWithEmptyVersionsSet() throws IOException {
        Set<MinorVersion> versions = new HashSet<>();
        String template = "Empty template ${versions} ${includeVersions}";
        try (MockedStatic<TemplateUtils> mockedTemplateUtils = mockStatic(TemplateUtils.class)) {
            mockedTemplateUtils.when(() -> TemplateUtils.render(eq(template), anyMap())).thenReturn("Empty rendered template");
            String result = MigrationIndexGenerator.generateFile(versions, template);
            assertThat(result, is("Empty rendered template"));
            mockedTemplateUtils.verify(() -> TemplateUtils.render(eq(template), argThat(map -> map.containsKey("versions") && ((Set<?>) map.get("versions")).isEmpty() && map.containsKey("includeVersions") && ((Set<?>) map.get("includeVersions")).isEmpty())));
        }
    }

    @Test
    void generateFileWithNullTemplate() {
        Set<MinorVersion> versions = new HashSet<>();
        versions.add(new MinorVersion(8, 0));
        assertThrows(NullPointerException.class, () -> MigrationIndexGenerator.generateFile(versions, null));
    }
}

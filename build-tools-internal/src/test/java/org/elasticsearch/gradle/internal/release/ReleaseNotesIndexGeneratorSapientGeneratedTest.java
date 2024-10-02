package org.elasticsearch.gradle.internal.release;

import org.elasticsearch.gradle.internal.release.ReleaseNotesIndexGenerator;

import static org.junit.jupiter.api.Assertions.assertAll;

import java.nio.file.Files;
import java.io.FileWriter;
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
class ReleaseNotesIndexGeneratorSapientGeneratedTest {

    @Test
    void updateTest() throws IOException {
        Set<QualifiedVersion> qualifiedVersionSet = new HashSet<>();
        File indexTemplate = mock(File.class);
        File indexFile = mock(File.class);
        Path mockPath = mock(Path.class);
        try (MockedStatic<Files> filesMock = mockStatic(Files.class);
             MockedStatic<ReleaseNotesIndexGenerator> generatorMock = mockStatic(ReleaseNotesIndexGenerator.class, CALLS_REAL_METHODS);
             MockedStatic<FileWriter> writerMock = mockStatic(FileWriter.class)) {
            when(indexTemplate.toPath()).thenReturn(mockPath);
            filesMock.when(() -> Files.readString(mockPath)).thenReturn("template content");
            generatorMock.when(() -> ReleaseNotesIndexGenerator.generateFile(anySet(), eq("template content"))).thenReturn("generated content");
            FileWriter mockWriter = mock(FileWriter.class);
            writerMock.when(() -> new FileWriter(indexFile)).thenReturn(mockWriter);
            ReleaseNotesIndexGenerator.update(qualifiedVersionSet, indexTemplate, indexFile);
            verify(mockWriter).write("generated content");
            verify(mockWriter).close();
        }
    }

    @Test
    void updateWhenIOExceptionOccurs() throws IOException {
        Set<QualifiedVersion> qualifiedVersionSet = new HashSet<>();
        File indexTemplate = mock(File.class);
        File indexFile = mock(File.class);
        Path mockPath = mock(Path.class);
        try (MockedStatic<Files> filesMock = mockStatic(Files.class)) {
            when(indexTemplate.toPath()).thenReturn(mockPath);
            filesMock.when(() -> Files.readString(mockPath)).thenThrow(new IOException("Test exception"));
            assertThrows(IOException.class, () -> ReleaseNotesIndexGenerator.update(qualifiedVersionSet, indexTemplate, indexFile));
        }
    }

    @Test
    void generateFileWhenVIsSnapshot() throws IOException {
        QualifiedVersion snapshotVersion = mock(QualifiedVersion.class);
        QualifiedVersion withoutQualifier = mock(QualifiedVersion.class);
        Set<QualifiedVersion> versions = new HashSet<>();
        versions.add(snapshotVersion);
        when(snapshotVersion.isSnapshot()).thenReturn(true);
        when(snapshotVersion.withoutQualifier()).thenReturn(withoutQualifier);
        when(withoutQualifier.toString()).thenReturn("1.0.0");
        try (MockedStatic<TemplateUtils> templateUtilsMock = mockStatic(TemplateUtils.class)) {
            templateUtilsMock.when(() -> TemplateUtils.render(eq("template"), anyMap())).thenReturn("rendered content");
            String result = ReleaseNotesIndexGenerator.generateFile(versions, "template");
            assertThat(result, is("rendered content"));
            verify(snapshotVersion).isSnapshot();
            verify(snapshotVersion).withoutQualifier();
            templateUtilsMock.verify(() -> TemplateUtils.render(eq("template"), anyMap()));
        }
    }

    @Test
    void generateFileWhenVNotIsSnapshot() throws IOException {
        QualifiedVersion version = mock(QualifiedVersion.class);
        Set<QualifiedVersion> versions = new HashSet<>();
        versions.add(version);
        when(version.isSnapshot()).thenReturn(false);
        when(version.toString()).thenReturn("1.0.0");
        try (MockedStatic<TemplateUtils> templateUtilsMock = mockStatic(TemplateUtils.class)) {
            templateUtilsMock.when(() -> TemplateUtils.render(eq("template"), anyMap())).thenReturn("rendered content");
            String result = ReleaseNotesIndexGenerator.generateFile(versions, "template");
            assertThat(result, is("rendered content"));
            verify(version).isSnapshot();
            templateUtilsMock.verify(() -> TemplateUtils.render(eq("template"), anyMap()));
        }
    }

    @Test
    void generateFileWithMultipleVersions() throws IOException {
        QualifiedVersion version1 = mock(QualifiedVersion.class);
        QualifiedVersion version2 = mock(QualifiedVersion.class);
        Set<QualifiedVersion> versions = new HashSet<>();
        versions.add(version1);
        versions.add(version2);
        when(version1.isSnapshot()).thenReturn(false);
        when(version2.isSnapshot()).thenReturn(false);
        when(version1.toString()).thenReturn("1.0.0");
        when(version2.toString()).thenReturn("2.0.0");
        try (MockedStatic<TemplateUtils> templateUtilsMock = mockStatic(TemplateUtils.class)) {
            templateUtilsMock.when(() -> TemplateUtils.render(eq("template"), anyMap())).thenReturn("rendered content");
            String result = ReleaseNotesIndexGenerator.generateFile(versions, "template");
            assertThat(result, is("rendered content"));
            verify(version1).isSnapshot();
            verify(version2).isSnapshot();
            templateUtilsMock.verify(() -> TemplateUtils.render(eq("template"), anyMap()));
        }
    }
}

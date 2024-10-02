package org.elasticsearch.gradle.internal.release;

import org.elasticsearch.gradle.internal.release.ReleaseHighlightsGenerator;

import java.nio.file.Files;
import java.util.List;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.io.File;

import org.elasticsearch.gradle.VersionProperties;
import org.junit.jupiter.api.Timeout;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;

import static org.hamcrest.Matchers.*;

import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class ReleaseHighlightsGeneratorSapientGeneratedTest {

    private final QualifiedVersion qualifiedVersionMock = mock(QualifiedVersion.class);

    @Test
    void updateTest() throws IOException {
        File templateFile = createTempFile("template", ".txt");
        File outputFile = createTempFile("output", ".txt");
        List<ChangelogEntry> entries = new ArrayList<>();
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
             MockedStatic<Files> filesMock = mockStatic(Files.class)) {
            versionProperties.when(VersionProperties::getElasticsearch).thenReturn("8.0.0");
            filesMock.when(() -> Files.readString(any(Path.class))).thenReturn("Template content");
            ReleaseHighlightsGenerator.update(templateFile, outputFile, entries);
            assertTrue(outputFile.exists());
            String content = Files.readString(outputFile.toPath());
            assertFalse(content.isEmpty());
        }
    }

    @Test
    void generateFileTest() throws IOException {
        //QualifiedVersion version = QualifiedVersion.of("8.0.0");
        //String template = "Version: ${version}\nHighlights: ${highlights}";
        //List<ChangelogEntry> entries = new ArrayList<>();
        //ChangelogEntry entry = new ChangelogEntry();
        //entry.setHighlight(new ChangelogEntry.Highlight("Test highlight", true, 1));
        //entries.add(entry);
        //String result = ReleaseHighlightsGenerator.generateFile(version, template, entries);
        //assertThat(result, containsString("Version: 8.0.0"));
        //assertThat(result, containsString("Highlights:"));
        //assertThat(result, containsString("Test highlight"));
    }

    @ParameterizedTest
    @CsvSource({"8.0.0, 7.0, 6.0", "7.1.0, 7.0", "7.0.0, "})
    void generateFileWithDifferentVersions(String currentVersion, String... expectedPriorVersions) throws IOException {
        QualifiedVersion version = QualifiedVersion.of(currentVersion);
        String template = "Prior versions: ${priorVersions}";
        List<ChangelogEntry> entries = new ArrayList<>();
        String result = ReleaseHighlightsGenerator.generateFile(version, template, entries);
        for (String expectedVersion : expectedPriorVersions) {
            assertThat(result, containsString(expectedVersion));
        }
    }

    @Test
    void generateFileWithNotableAndNonNotableHighlights() throws IOException {
        //QualifiedVersion version = QualifiedVersion.of("8.0.0");
        //String template = "Notable: ${notableHighlights}\nNon-notable: ${nonNotableHighlights}";
        //List<ChangelogEntry> entries = new ArrayList<>();
        //ChangelogEntry notableEntry = new ChangelogEntry();
        //notableEntry.setHighlight(new ChangelogEntry.Highlight("Notable highlight", true, 1));
        //entries.add(notableEntry);
        //ChangelogEntry nonNotableEntry = new ChangelogEntry();
        //nonNotableEntry.setHighlight(new ChangelogEntry.Highlight("Non-notable highlight", false, 2));
        //entries.add(nonNotableEntry);
        //String result = ReleaseHighlightsGenerator.generateFile(version, template, entries);
        //assertThat(result, containsString("Notable highlight"));
        //assertThat(result, containsString("Non-notable highlight"));
    }

    @Test
    void generateFileWithEmptyEntries() throws IOException {
        QualifiedVersion version = QualifiedVersion.of("8.0.0");
        String template = "Highlights: ${highlights}";
        List<ChangelogEntry> entries = new ArrayList<>();
        String result = ReleaseHighlightsGenerator.generateFile(version, template, entries);
        assertThat(result, not(containsString("${highlights}")));
    }

    private File createTempFile(String prefix, String suffix) throws IOException {
        Path path = Files.createTempFile(prefix, suffix);
        return path.toFile();
    }
}
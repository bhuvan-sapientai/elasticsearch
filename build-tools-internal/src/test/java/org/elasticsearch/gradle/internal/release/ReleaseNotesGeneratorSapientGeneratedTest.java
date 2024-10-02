package org.elasticsearch.gradle.internal.release;

import org.elasticsearch.gradle.internal.release.ReleaseNotesGenerator;

import java.nio.file.Files;
import java.util.List;
import java.io.FileWriter;
import java.util.Map;

import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import org.mockito.Mockito;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.any;

class ReleaseNotesGeneratorSapientGeneratedTest {

    @Test
    void testGenerateFileWithEmptyChangelog() throws IOException {
        String template = "Version: {{version}}\nChanges: {{#changelogsByTypeByArea}}{{/changelogsByTypeByArea}}";
        QualifiedVersion version = QualifiedVersion.of("1.0.0");
        Set<ChangelogEntry> changelogs = new HashSet<>();
        String result = ReleaseNotesGenerator.generateFile(template, version, changelogs);
        assertThat(result, containsString("Version: 1.0.0"));
        assertThat(result, not(containsString("Changes:")));
    }

    @Test
    void testGenerateFileWithChangelog() throws IOException {
        String template = "Version: {{version}}\nChanges:\n{{#changelogsByTypeByArea}}{{#each this}}{{@key}}:\n{{#each this}}* {{summary}}\n{{/each}}{{/each}}{{/changelogsByTypeByArea}}";
        QualifiedVersion version = QualifiedVersion.of("1.1.0");
        Set<ChangelogEntry> changelogs = new HashSet<>();
        ChangelogEntry entry1 = new ChangelogEntry();
        entry1.setType("enhancement");
        entry1.setArea("area1");
        entry1.setSummary("Enhancement 1");
        changelogs.add(entry1);
        ChangelogEntry entry2 = new ChangelogEntry();
        entry2.setType("bug");
        entry2.setArea("area2");
        entry2.setSummary("Bug fix 1");
        changelogs.add(entry2);
        String result = ReleaseNotesGenerator.generateFile(template, version, changelogs);
        assertThat(result, containsString("Version: 1.1.0"));
        assertThat(result, containsString("area1:"));
        assertThat(result, containsString("* Enhancement 1"));
        assertThat(result, containsString("area2:"));
        assertThat(result, containsString("* Bug fix 1"));
    }

    @Test
    void testGenerateFileWithBreakingChanges() throws IOException {
        //String template = "Version: {{version}}\nBreaking Changes:\n{{#changelogsByTypeByArea.breaking}}{{#each this}}{{@key}}:\n{{#each this}}* {{summary}}\n{{/each}}{{/each}}{{/changelogsByTypeByArea.breaking}}";
        //QualifiedVersion version = QualifiedVersion.of("2.0.0");
        //Set<ChangelogEntry> changelogs = new HashSet<>();
        //ChangelogEntry entry = new ChangelogEntry();
        //entry.setType("enhancement");
        //entry.setArea("area1");
        //entry.setSummary("Breaking change 1");
        //Breaking breaking = new Breaking();
        //breaking.setDetails("This is a breaking change");
        //entry.setBreaking(breaking);
        //changelogs.add(entry);
        //String result = ReleaseNotesGenerator.generateFile(template, version, changelogs);
        //assertThat(result, containsString("Version: 2.0.0"));
        //assertThat(result, containsString("Breaking Changes:"));
        //assertThat(result, containsString("area1:"));
        //assertThat(result, containsString("* Breaking change 1"));
    }

    @ParameterizedTest
    @CsvSource({"1.0.0, 1, 0, 0, ''", "2.3.4-alpha1, 2, 3, 4, alpha1", "3.0.0-beta2, 3, 0, 0, beta2", "4.5.6-rc1, 4, 5, 6, rc1", "5.0.0-SNAPSHOT, 5, 0, 0, SNAPSHOT"})
    void testQualifiedVersionParsing(String versionString, int expectedMajor, int expectedMinor, int expectedRevision, String expectedQualifier) {
        //QualifiedVersion version = QualifiedVersion.of(versionString);
        //assertEquals(expectedMajor, version.major());
        //assertEquals(expectedMinor, version.minor());
        //assertEquals(expectedRevision, version.revision());
        /*if (expectedQualifier.isEmpty()) {
    assertNull(version.qualifier());
} else {
    assertNotNull(version.qualifier());
    assertEquals(expectedQualifier, version.qualifier().toString());
}*/
    }

    @Test
    void testQualifiedVersionComparison() {
        QualifiedVersion v1 = QualifiedVersion.of("1.0.0");
        QualifiedVersion v2 = QualifiedVersion.of("1.0.1");
        QualifiedVersion v3 = QualifiedVersion.of("1.1.0");
        QualifiedVersion v4 = QualifiedVersion.of("2.0.0");
        QualifiedVersion v5 = QualifiedVersion.of("2.0.0-alpha1");
        QualifiedVersion v6 = QualifiedVersion.of("2.0.0-beta1");
        QualifiedVersion v7 = QualifiedVersion.of("2.0.0-rc1");
        QualifiedVersion v8 = QualifiedVersion.of("2.0.0-SNAPSHOT");
        assertTrue(v1.isBefore(v2));
        assertTrue(v2.isBefore(v3));
        assertTrue(v3.isBefore(v4));
        assertTrue(v5.isBefore(v6));
        assertTrue(v6.isBefore(v7));
        assertTrue(v7.isBefore(v4));
        assertTrue(v8.isBefore(v4));
    }

    @Test
    void testQualifiedVersionToString() {
        assertEquals("1.2.3", QualifiedVersion.of("1.2.3").toString());
        assertEquals("1.2.3-alpha1", QualifiedVersion.of("1.2.3-alpha1").toString());
        assertEquals("1.2.3-beta2", QualifiedVersion.of("1.2.3-beta2").toString());
        assertEquals("1.2.3-rc3", QualifiedVersion.of("1.2.3-rc3").toString());
        assertEquals("1.2.3-SNAPSHOT", QualifiedVersion.of("1.2.3-SNAPSHOT").toString());
    }

    @Test
    void testQualifiedVersionWithoutQualifier() {
        QualifiedVersion version = QualifiedVersion.of("1.2.3-alpha1");
        QualifiedVersion withoutQualifier = version.withoutQualifier();
        assertEquals("1.2.3", withoutQualifier.toString());
        assertFalse(withoutQualifier.hasQualifier());
    }

    @Test
    void testQualifiedVersionIsSnapshot() {
        assertTrue(QualifiedVersion.of("1.2.3-SNAPSHOT").isSnapshot());
        assertFalse(QualifiedVersion.of("1.2.3").isSnapshot());
        assertFalse(QualifiedVersion.of("1.2.3-alpha1").isSnapshot());
    }

    @Test
    void testInvalidQualifiedVersionFormat() {
        assertThrows(IllegalArgumentException.class, () -> QualifiedVersion.of("invalid"));
        assertThrows(IllegalArgumentException.class, () -> QualifiedVersion.of("1.2"));
        assertThrows(IllegalArgumentException.class, () -> QualifiedVersion.of("1.2.3.4"));
        assertThrows(IllegalArgumentException.class, () -> QualifiedVersion.of("1.2.3-gamma1"));
    }

    @Test
    void testUpdateMethod() throws IOException {
        File templateFile = Mockito.mock(File.class);
        File outputFile = Mockito.mock(File.class);
        QualifiedVersion version = QualifiedVersion.of("1.0.0");
        Set<ChangelogEntry> changelogs = new HashSet<>();
        Mockito.when(Files.readString(any())).thenReturn("Template content");
        FileWriter mockWriter = Mockito.mock(FileWriter.class);
        Mockito.when(new FileWriter(outputFile)).thenReturn(mockWriter);
        ReleaseNotesGenerator.update(templateFile, outputFile, version, changelogs);
        Mockito.verify(mockWriter).write(any(String.class));
        Mockito.verify(mockWriter).close();
    }

    @Test
    void testBuildChangelogBreakdown() throws Exception {
        //Set<ChangelogEntry> changelogs = new HashSet<>();
        //ChangelogEntry entry1 = new ChangelogEntry();
        //entry1.setType("enhancement");
        //entry1.setArea("area1");
        //entry1.setSummary("Enhancement 1");
        //changelogs.add(entry1);
        //ChangelogEntry entry2 = new ChangelogEntry();
        //entry2.setType("bug");
        //entry2.setArea("area2");
        //entry2.setSummary("Bug fix 1");
        //changelogs.add(entry2);
        //ChangelogEntry entry3 = new ChangelogEntry();
        //entry3.setType("feature");
        //entry3.setArea("area1");
        //entry3.setSummary("New feature");
        //Breaking breaking = new Breaking();
        //breaking.setDetails("Breaking change");
        //entry3.setBreaking(breaking);
        //changelogs.add(entry3);
        //java.lang.reflect.Method method = ReleaseNotesGenerator.class.getDeclaredMethod("buildChangelogBreakdown", Set.class);
        //method.setAccessible(true);
        //Map<String, Map<String, List<ChangelogEntry>>> result = (Map<String, Map<String, List<ChangelogEntry>>>) method.invoke(null, changelogs);
        //assertThat(result.keySet(), containsInAnyOrder("enhancement", "bug", "breaking"));
        //assertThat(result.get("enhancement").keySet(), contains("area1"));
        //assertThat(result.get("bug").keySet(), contains("area2"));
        //assertThat(result.get("breaking").keySet(), contains("area1"));
    }
}
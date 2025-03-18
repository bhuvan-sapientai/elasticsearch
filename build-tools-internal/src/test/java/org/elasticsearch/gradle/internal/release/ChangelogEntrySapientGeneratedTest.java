package org.elasticsearch.gradle.internal.release;

import org.elasticsearch.gradle.internal.release.ChangelogEntry;

import org.elasticsearch.gradle.internal.release.ChangelogEntry;

import java.util.List;
import java.io.UncheckedIOException;

import org.junit.jupiter.api.BeforeEach;

import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.io.File;

import static org.hamcrest.MatcherAssert.assertThat;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

import static org.hamcrest.Matchers.*;

import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.any;

class ChangelogEntrySapientGeneratedTest {

    private ChangelogEntry changelogEntry;

    private ObjectMapper yamlMapper;

    @BeforeEach
    void setUp() {
        changelogEntry = new ChangelogEntry();
        yamlMapper = new ObjectMapper(new YAMLFactory());
    }

    @Test
    void parseTest() throws IOException {
        File file = mock(File.class);
        ChangelogEntry mockEntry = mock(ChangelogEntry.class);
        ObjectMapper mockMapper = mock(ObjectMapper.class);
        when(mockMapper.readValue(any(File.class), eq(ChangelogEntry.class))).thenReturn(mockEntry);
        ChangelogEntry result = ChangelogEntry.parse(file);
        assertThat(result, is(notNullValue()));
    }

    @Test
    void parseWhenCaughtIOExceptionThrowsUncheckedIOException() throws IOException {
        File file = mock(File.class);
        when(file.getAbsolutePath()).thenReturn("/mock/path");
        ObjectMapper mockMapper = mock(ObjectMapper.class);
        when(mockMapper.readValue(any(File.class), eq(ChangelogEntry.class))).thenThrow(new IOException("Test exception"));
        assertThrows(UncheckedIOException.class, () -> ChangelogEntry.parse(file));
    }

    @Test
    void setHighlightWhenThisHighlightIsNotNull() {
        ChangelogEntry target = new ChangelogEntry();
        target.setPr(123);
        ChangelogEntry.Highlight highlight = new ChangelogEntry.Highlight();
        target.setHighlight(highlight);
        assertThat(target.getHighlight(), is(notNullValue()));
        assertThat(target.getHighlight().getPr(), equalTo(123));
    }

    @Test
    void toStringTest() {
        ChangelogEntry target = new ChangelogEntry();
        target.setArea("testArea");
        target.setSummary("testSummary");
        target.setPr(123);
        target.setType("testType");
        target.setIssues(List.of(456, 789));
        String result = target.toString();
        assertThat(result, containsString("ChangelogEntry{pr=123"));
        assertThat(result, containsString("area='testArea'"));
        assertThat(result, containsString("type='testType'"));
        assertThat(result, containsString("summary='testSummary'"));
        assertThat(result, containsString("issues=[456, 789]"));
    }

    @Test
    void testSetterAndGetterMethods() {
        ChangelogEntry entry = new ChangelogEntry();
        entry.setPr(123);
        entry.setIssues(List.of(456, 789));
        entry.setArea("testArea");
        entry.setType("testType");
        entry.setSummary("testSummary");
        ChangelogEntry.Highlight highlight = new ChangelogEntry.Highlight();
        entry.setHighlight(highlight);
        ChangelogEntry.Breaking breaking = new ChangelogEntry.Breaking();
        entry.setBreaking(breaking);
        ChangelogEntry.Deprecation deprecation = new ChangelogEntry.Deprecation();
        entry.setDeprecation(deprecation);
        assertThat(entry.getPr(), equalTo(123));
        assertThat(entry.getIssues(), contains(456, 789));
        assertThat(entry.getArea(), equalTo("testArea"));
        assertThat(entry.getType(), equalTo("testType"));
        assertThat(entry.getSummary(), equalTo("testSummary"));
        assertThat(entry.getHighlight(), equalTo(highlight));
        assertThat(entry.getBreaking(), equalTo(breaking));
        assertThat(entry.getDeprecation(), equalTo(deprecation));
    }

    @Test
    void testEqualsAndHashCode() {
        ChangelogEntry entry1 = new ChangelogEntry();
        entry1.setPr(123);
        entry1.setIssues(List.of(456, 789));
        entry1.setArea("testArea");
        entry1.setType("testType");
        entry1.setSummary("testSummary");
        ChangelogEntry entry2 = new ChangelogEntry();
        entry2.setPr(123);
        entry2.setIssues(List.of(456, 789));
        entry2.setArea("testArea");
        entry2.setType("testType");
        entry2.setSummary("testSummary");
        ChangelogEntry entry3 = new ChangelogEntry();
        entry3.setPr(321);
        entry3.setIssues(List.of(654, 987));
        entry3.setArea("differentArea");
        entry3.setType("differentType");
        entry3.setSummary("differentSummary");
        assertThat(entry1, equalTo(entry2));
        assertThat(entry1.hashCode(), equalTo(entry2.hashCode()));
        assertThat(entry1, not(equalTo(entry3)));
        assertThat(entry1.hashCode(), not(equalTo(entry3.hashCode())));
    }

    @ParameterizedTest
    @CsvSource({"The title, the_title", "This is a test, this_test", "And now that, and_now", "Test with 'apostrophe', test_with_apostrophe"})
    void testGeneratedAnchor(String input, String expected) {
        ChangelogEntry.Highlight highlight = new ChangelogEntry.Highlight();
        highlight.setTitle(input);
        String result = highlight.getAnchor();
        assertThat(result, equalTo(expected));
    }

    @Test
    void testHighlightClass() {
        ChangelogEntry.Highlight highlight = new ChangelogEntry.Highlight();
        highlight.setNotable(true);
        highlight.setTitle("Test Title");
        highlight.setBody("Test Body");
        assertThat(highlight.isNotable(), is(true));
        assertThat(highlight.getTitle(), equalTo("Test Title"));
        assertThat(highlight.getBody(), equalTo("Test Body"));
        assertThat(highlight.getAnchor(), equalTo("test_title"));
        ChangelogEntry.Highlight highlight2 = new ChangelogEntry.Highlight();
        highlight2.setNotable(true);
        highlight2.setTitle("Test Title");
        highlight2.setBody("Test Body");
        assertThat(highlight, equalTo(highlight2));
        assertThat(highlight.hashCode(), equalTo(highlight2.hashCode()));
        String expectedToString = "Highlight{notable=true, title='Test Title', body='Test Body'}";
        assertThat(highlight.toString(), equalTo(expectedToString));
    }

    @Test
    void testCompatibilityChangeClass() {
        ChangelogEntry.Breaking breaking = new ChangelogEntry.Breaking();
        breaking.setArea("Test Area");
        breaking.setTitle("Test Title");
        breaking.setDetails("Test Details");
        breaking.setImpact("Test Impact");
        breaking.setNotable(true);
        breaking.setEssSettingChange(true);
        assertThat(breaking.getArea(), equalTo("Test Area"));
        assertThat(breaking.getTitle(), equalTo("Test Title"));
        assertThat(breaking.getDetails(), equalTo("Test Details"));
        assertThat(breaking.getImpact(), equalTo("Test Impact"));
        assertThat(breaking.isNotable(), is(true));
        assertThat(breaking.isEssSettingChange(), is(true));
        assertThat(breaking.getAnchor(), equalTo("test_title"));
        ChangelogEntry.Breaking breaking2 = new ChangelogEntry.Breaking();
        breaking2.setArea("Test Area");
        breaking2.setTitle("Test Title");
        breaking2.setDetails("Test Details");
        breaking2.setImpact("Test Impact");
        breaking2.setNotable(true);
        breaking2.setEssSettingChange(true);
        assertThat(breaking, equalTo(breaking2));
        assertThat(breaking.hashCode(), equalTo(breaking2.hashCode()));
        String expectedToString = "Breaking{area='Test Area', title='Test Title', details='Test Details', impact='Test Impact', notable=true, essSettingChange=true}";
        assertThat(breaking.toString(), equalTo(expectedToString));
    }

    @Test
    void testDeprecationClass() {
        ChangelogEntry.Deprecation deprecation = new ChangelogEntry.Deprecation();
        deprecation.setArea("Test Area");
        deprecation.setTitle("Test Title");
        deprecation.setDetails("Test Details");
        deprecation.setImpact("Test Impact");
        deprecation.setNotable(true);
        deprecation.setEssSettingChange(true);
        assertThat(deprecation.getArea(), equalTo("Test Area"));
        assertThat(deprecation.getTitle(), equalTo("Test Title"));
        assertThat(deprecation.getDetails(), equalTo("Test Details"));
        assertThat(deprecation.getImpact(), equalTo("Test Impact"));
        assertThat(deprecation.isNotable(), is(true));
        assertThat(deprecation.isEssSettingChange(), is(true));
        assertThat(deprecation.getAnchor(), equalTo("test_title"));
        ChangelogEntry.Deprecation deprecation2 = new ChangelogEntry.Deprecation();
        deprecation2.setArea("Test Area");
        deprecation2.setTitle("Test Title");
        deprecation2.setDetails("Test Details");
        deprecation2.setImpact("Test Impact");
        deprecation2.setNotable(true);
        deprecation2.setEssSettingChange(true);
        assertThat(deprecation, equalTo(deprecation2));
        assertThat(deprecation.hashCode(), equalTo(deprecation2.hashCode()));
        String expectedToString = "Deprecation{area='Test Area', title='Test Title', details='Test Details', impact='Test Impact', notable=true, essSettingChange=true}";
        assertThat(deprecation.toString(), equalTo(expectedToString));
    }
}

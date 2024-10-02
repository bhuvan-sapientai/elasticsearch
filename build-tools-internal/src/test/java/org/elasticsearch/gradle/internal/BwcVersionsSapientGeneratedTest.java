package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.BwcVersions;

import java.util.Arrays;
import java.util.List;

import org.elasticsearch.gradle.internal.BwcVersions;
import org.elasticsearch.gradle.Version;
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.elasticsearch.gradle.VersionProperties;
import org.mockito.Mock;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import static org.hamcrest.Matchers.*;

import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

class BwcVersionsSapientGeneratedTest {

    private BwcVersions bwcVersions;

    private List<String> versionLines;

    @Mock
    private VersionProperties versionProperties;

    @BeforeEach
    void setUp() {
        versionLines = Arrays.asList("    public static final Version V_7_0_0 = new Version(7, 0, 0);", "    public static final Version V_7_0_1 = new Version(7, 0, 1);", "    public static final Version V_7_1_0 = new Version(7, 1, 0);", "    public static final Version V_7_1_1 = new Version(7, 1, 1);", "    public static final Version V_8_0_0 = new Version(8, 0, 0);", "    public static final Version V_8_0_1 = new Version(8, 0, 1);", "    public static final Version V_8_1_0 = new Version(8, 1, 0);", "    public static final Version V_8_2_0 = new Version(8, 2, 0);");
        when(versionProperties.getElasticsearch()).thenReturn("8.2.0");
        bwcVersions = new BwcVersions(versionLines);
    }

    @Test
    void testConstructorWithVersionLines() {
        assertNotNull(bwcVersions);
        assertEquals(Version.fromString("8.2.0"), bwcVersions.getCurrentVersion());
    }

    @Test
    void testConstructorWithCurrentVersionAndAllVersions() {
        List<Version> allVersions = Arrays.asList(Version.fromString("7.0.0"), Version.fromString("7.0.1"), Version.fromString("7.1.0"), Version.fromString("7.1.1"), Version.fromString("8.0.0"), Version.fromString("8.0.1"), Version.fromString("8.1.0"), Version.fromString("8.2.0"));
        BwcVersions bwcVersions = new BwcVersions(Version.fromString("8.2.0"), allVersions);
        assertNotNull(bwcVersions);
        assertEquals(Version.fromString("8.2.0"), bwcVersions.getCurrentVersion());
    }

    @Test
    void testGetUnreleased() {
        List<Version> unreleased = bwcVersions.getUnreleased();
        assertThat(unreleased, hasSize(3));
        assertThat(unreleased, hasItems(Version.fromString("8.2.0"), Version.fromString("8.1.0"), Version.fromString("7.1.1")));
    }

    @Test
    void testGetIndexCompatible() {
        List<Version> indexCompatible = bwcVersions.getIndexCompatible();
        assertThat(indexCompatible, hasSize(8));
        assertTrue(indexCompatible.contains(Version.fromString("7.0.0")));
        assertTrue(indexCompatible.contains(Version.fromString("8.2.0")));
    }

    @Test
    void testGetWireCompatible() {
        List<Version> wireCompatible = bwcVersions.getWireCompatible();
        assertThat(wireCompatible, hasSize(5));
        assertTrue(wireCompatible.contains(Version.fromString("7.1.0")));
        assertTrue(wireCompatible.contains(Version.fromString("8.2.0")));
    }

    @Test
    void testGetUnreleasedIndexCompatible() {
        List<Version> unreleasedIndexCompatible = bwcVersions.getUnreleasedIndexCompatible();
        assertThat(unreleasedIndexCompatible, hasSize(3));
        assertTrue(unreleasedIndexCompatible.contains(Version.fromString("7.1.1")));
        assertTrue(unreleasedIndexCompatible.contains(Version.fromString("8.1.0")));
        assertTrue(unreleasedIndexCompatible.contains(Version.fromString("8.2.0")));
    }

    @Test
    void testGetUnreleasedWireCompatible() {
        List<Version> unreleasedWireCompatible = bwcVersions.getUnreleasedWireCompatible();
        assertThat(unreleasedWireCompatible, hasSize(3));
        assertTrue(unreleasedWireCompatible.contains(Version.fromString("7.1.1")));
        assertTrue(unreleasedWireCompatible.contains(Version.fromString("8.1.0")));
        assertTrue(unreleasedWireCompatible.contains(Version.fromString("8.2.0")));
    }

    @Test
    void testGetMinimumWireCompatibleVersion() {
        Version minWireCompatible = bwcVersions.getMinimumWireCompatibleVersion();
        assertEquals(Version.fromString("7.1.0"), minWireCompatible);
    }

    @ParameterizedTest
    @CsvSource({"7.17.4, true", "7.17.5, true", "8.0.0, false", "8.2.1, false", "8.2.2, true", "8.3.0, true"})
    void testIsMlCompatible(String versionString, boolean expected) {
        Version version = Version.fromString(versionString);
        assertEquals(expected, BwcVersions.isMlCompatible(version));
    }

    @Test
    void testUnreleasedInfo() {
        BwcVersions.UnreleasedVersionInfo info = bwcVersions.unreleasedInfo(Version.fromString("8.2.0"));
        assertNotNull(info);
        assertEquals("main", info.branch());
        assertEquals(":distribution", info.gradleProjectPath());
    }

    @Test
    void testForPreviousUnreleased() {
        List<BwcVersions.UnreleasedVersionInfo> previousUnreleased = new ArrayList<>();
        bwcVersions.forPreviousUnreleased(previousUnreleased::add);
        assertThat(previousUnreleased, hasSize(2));
        assertTrue(previousUnreleased.stream().anyMatch(info -> info.version().equals(Version.fromString("8.1.0"))));
        assertTrue(previousUnreleased.stream().anyMatch(info -> info.version().equals(Version.fromString("7.1.1"))));
    }

    @Test
    void testCompareToAuthoritative() {
        List<Version> authoritativeReleased = Arrays.asList(Version.fromString("7.0.0"), Version.fromString("7.0.1"), Version.fromString("7.1.0"), Version.fromString("8.0.0"), Version.fromString("8.0.1"));
        assertDoesNotThrow(() -> bwcVersions.compareToAuthoritative(authoritativeReleased));
    }

    @Test
    void testCompareToAuthoritativeWithMismatch() {
        List<Version> mismatchedAuthoritative = Arrays.asList(Version.fromString("7.0.0"), Version.fromString("7.0.1"), Version.fromString("7.1.0"), Version.fromString("7.1.1"), Version.fromString("8.0.0"), Version.fromString("8.0.1"), Version.fromString("8.1.0"));
        assertThrows(IllegalStateException.class, () -> bwcVersions.compareToAuthoritative(mismatchedAuthoritative));
    }

    @Test
    void testWithIndexCompatible() {
        List<Version> processedVersions = new ArrayList<>();
        bwcVersions.withIndexCompatible((version, versionString) -> {
            processedVersions.add(version);
            assertThat(versionString, startsWith("v"));
        });
        assertThat(processedVersions, hasSize(8));
    }

    @Test
    void testWithWireCompatible() {
        List<Version> processedVersions = new ArrayList<>();
        bwcVersions.withWireCompatible((version, versionString) -> {
            processedVersions.add(version);
            assertThat(versionString, startsWith("v"));
        });
        assertThat(processedVersions, hasSize(5));
    }

    @Test
    void testWithIndexCompatibleWithFilter() {
        List<Version> processedVersions = new ArrayList<>();
        bwcVersions.withIndexCompatible(version -> version.getMajor() == 8, (version, versionString) -> {
            processedVersions.add(version);
            assertThat(versionString, startsWith("v"));
        });
        assertThat(processedVersions, hasSize(4));
        assertTrue(processedVersions.stream().allMatch(v -> v.getMajor() == 8));
    }

    @Test
    void testWithWireCompatibleWithFilter() {
        List<Version> processedVersions = new ArrayList<>();
        bwcVersions.withWireCompatible(version -> version.getMinor() == 0, (version, versionString) -> {
            processedVersions.add(version);
            assertThat(versionString, startsWith("v"));
        });
        assertThat(processedVersions, hasSize(2));
        assertTrue(processedVersions.stream().allMatch(v -> v.getMinor() == 0));
    }
}

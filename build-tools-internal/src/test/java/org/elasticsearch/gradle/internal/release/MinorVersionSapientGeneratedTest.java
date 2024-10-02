package org.elasticsearch.gradle.internal.release;

import org.elasticsearch.gradle.internal.release.MinorVersion;

import org.junit.jupiter.api.Timeout;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class MinorVersionSapientGeneratedTest {

    @Test
    void ofTest() {
        QualifiedVersion qualifiedVersion = new QualifiedVersion(2, 3, 0, null);
        MinorVersion result = MinorVersion.of(qualifiedVersion);
        assertAll(() -> assertThat(result.major(), equalTo(2)), () -> assertThat(result.minor(), equalTo(3)));
    }

    @ParameterizedTest
    @CsvSource({"2, 3, 2.3", "10, 0, 10.0", "0, 15, 0.15"})
    void toStringTest(int major, int minor, String expected) {
        MinorVersion version = new MinorVersion(major, minor);
        assertThat(version.toString(), equalTo(expected));
    }

    @ParameterizedTest
    @CsvSource({"2, 3, 2_3", "10, 0, 10_0", "0, 15, 0_15"})
    void underscoreTest(int major, int minor, String expected) {
        MinorVersion version = new MinorVersion(major, minor);
        assertThat(version.underscore(), equalTo(expected));
    }

    @Test
    void compareToTest() {
        MinorVersion v1 = new MinorVersion(2, 3);
        MinorVersion v2 = new MinorVersion(2, 4);
        MinorVersion v3 = new MinorVersion(3, 0);
        assertAll(() -> assertThat(v1.compareTo(v2), lessThan(0)), () -> assertThat(v2.compareTo(v1), greaterThan(0)), () -> assertThat(v1.compareTo(v1), equalTo(0)), () -> assertThat(v2.compareTo(v3), lessThan(0)), () -> assertThat(v3.compareTo(v2), greaterThan(0)));
    }

    @Test
    void isBeforeTest() {
        MinorVersion v1 = new MinorVersion(2, 3);
        MinorVersion v2 = new MinorVersion(2, 4);
        MinorVersion v3 = new MinorVersion(3, 0);
        assertAll(() -> assertTrue(v1.isBefore(v2)), () -> assertTrue(v1.isBefore(v3)), () -> assertTrue(v2.isBefore(v3)), () -> assertFalse(v2.isBefore(v1)), () -> assertFalse(v3.isBefore(v1)), () -> assertFalse(v3.isBefore(v2)), () -> assertFalse(v1.isBefore(v1)));
    }

    @Test
    void testEqualsAndHashCode() {
        MinorVersion v1 = new MinorVersion(2, 3);
        MinorVersion v2 = new MinorVersion(2, 3);
        MinorVersion v3 = new MinorVersion(2, 4);
        assertAll(() -> assertEquals(v1, v2), () -> assertNotEquals(v1, v3), () -> assertEquals(v1.hashCode(), v2.hashCode()), () -> assertNotEquals(v1.hashCode(), v3.hashCode()));
    }

    @Test
    void testNullCheck() {
        assertThrows(NullPointerException.class, () -> MinorVersion.of(null));
    }
}

package org.elasticsearch.gradle;

import org.elasticsearch.gradle.Architecture;

import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;

import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

class ArchitectureSapientGeneratedTest {

    private String originalOsArch;

    @BeforeEach
    void setUp() {
        originalOsArch = System.getProperty("os.arch");
    }

    @Test
    void testArchitectureValues() {
        assertAll(() -> assertEquals("x86_64", Architecture.X64.classifier), () -> assertEquals("linux/amd64", Architecture.X64.dockerPlatform), () -> assertEquals("aarch64", Architecture.AARCH64.classifier), () -> assertEquals("linux/arm64", Architecture.AARCH64.dockerPlatform));
    }

    @ParameterizedTest
    @CsvSource({"amd64, X64", "x86_64, X64", "aarch64, AARCH64"})
    void testCurrent(String osArch, Architecture expected) {
        System.setProperty("os.arch", osArch);
        assertEquals(expected, Architecture.current());
    }

    @Test
    void testCurrentWithUnsupportedArchitecture() {
        System.setProperty("os.arch", "unsupported");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, Architecture::current);
        assertThat(exception.getMessage(), containsString("can not determine architecture from [unsupported]"));
    }

    @Test
    void testToString() {
        assertAll(() -> assertEquals("X64", Architecture.X64.toString()), () -> assertEquals("AARCH64", Architecture.AARCH64.toString()));
    }

    @Test
    void testEqualsAndHashCode() {
        assertEquals(Architecture.X64, Architecture.X64);
        assertNotEquals(Architecture.X64, Architecture.AARCH64);
        assertEquals(Architecture.X64.hashCode(), Architecture.X64.hashCode());
        assertNotEquals(Architecture.X64.hashCode(), Architecture.AARCH64.hashCode());
    }
}

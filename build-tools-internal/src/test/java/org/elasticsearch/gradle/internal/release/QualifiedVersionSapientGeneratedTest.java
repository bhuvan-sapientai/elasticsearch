package org.elasticsearch.gradle.internal.release;

import org.elasticsearch.gradle.internal.release.QualifiedVersion;

import org.junit.jupiter.api.Timeout;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class QualifiedVersionSapientGeneratedTest {

    @Test
    void ofWhenMatcherMatchesEqualsFalseThrowsIllegalArgumentException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            QualifiedVersion.of("B");
        });
        assertThat(exception.getMessage(), equalTo("Invalid version format: 'B'. Should be ^v? (\\d+) \\. (\\d+) \\. (\\d+) (?: - (alpha\\d+ | beta\\d+ | rc\\d+ | SNAPSHOT ) )? $"));
    }

    @ParameterizedTest
    @CsvSource({"1.2.3, 1, 2, 3, ", "v1.2.3, 1, 2, 3, ", "1.2.3-alpha1, 1, 2, 3, alpha1", "1.2.3-beta2, 1, 2, 3, beta2", "1.2.3-rc3, 1, 2, 3, rc3", "1.2.3-SNAPSHOT, 1, 2, 3, SNAPSHOT"})
    void ofValidVersions(String input, int major, int minor, int revision, String qualifier) {
        //QualifiedVersion version = QualifiedVersion.of(input);
        //assertAll(() -> assertEquals(major, version.major()), () -> assertEquals(minor, version.minor()), () -> assertEquals(revision, version.revision()), () -> assertEquals(qualifier, version.qualifier() == null ? null : version.qualifier().toString()));
    }

    @Test
    void toStringTest() {
        //assertEquals("1.2.3", new QualifiedVersion(1, 2, 3, null).toString());
        //assertEquals("1.2.3-alpha1", new QualifiedVersion(1, 2, 3, QualifiedVersion.Qualifier.of("alpha1")).toString());
    }

    @Test
    void hasQualifierTest() {
        //assertFalse(new QualifiedVersion(1, 2, 3, null).hasQualifier());
        //assertTrue(new QualifiedVersion(1, 2, 3, QualifiedVersion.Qualifier.of("alpha1")).hasQualifier());
    }

    @Test
    void isSnapshotTest() {
        //assertFalse(new QualifiedVersion(1, 2, 3, null).isSnapshot());
        //assertFalse(new QualifiedVersion(1, 2, 3, QualifiedVersion.Qualifier.of("alpha1")).isSnapshot());
        //assertTrue(new QualifiedVersion(1, 2, 3, QualifiedVersion.Qualifier.of("SNAPSHOT")).isSnapshot());
    }

    @Test
    void withoutQualifierTest() {
        //QualifiedVersion version = new QualifiedVersion(1, 2, 3, QualifiedVersion.Qualifier.of("alpha1"));
        //QualifiedVersion withoutQualifier = version.withoutQualifier();
        //assertEquals(new QualifiedVersion(1, 2, 3, null), withoutQualifier);
    }

    @Test
    void compareToTest() {
        //QualifiedVersion v1 = new QualifiedVersion(1, 2, 3, null);
        //QualifiedVersion v2 = new QualifiedVersion(1, 2, 3, QualifiedVersion.Qualifier.of("alpha1"));
        //QualifiedVersion v3 = new QualifiedVersion(1, 2, 4, null);
        //assertTrue(v1.compareTo(v2) > 0);
        //assertTrue(v2.compareTo(v3) < 0);
        //assertEquals(0, v1.compareTo(new QualifiedVersion(1, 2, 3, null)));
    }

    @Test
    void isBeforeTest() {
        QualifiedVersion v1 = new QualifiedVersion(1, 2, 3, null);
        QualifiedVersion v2 = new QualifiedVersion(1, 2, 4, null);
        assertTrue(v1.isBefore(v2));
        assertFalse(v2.isBefore(v1));
        assertFalse(v1.isBefore(v1));
    }

    @Test
    void qualifierComparisonTest() {
        //QualifiedVersion.Qualifier alpha1 = QualifiedVersion.Qualifier.of("alpha1");
        //QualifiedVersion.Qualifier alpha2 = QualifiedVersion.Qualifier.of("alpha2");
        //QualifiedVersion.Qualifier beta1 = QualifiedVersion.Qualifier.of("beta1");
        //QualifiedVersion.Qualifier rc1 = QualifiedVersion.Qualifier.of("rc1");
        //QualifiedVersion.Qualifier snapshot = QualifiedVersion.Qualifier.of("SNAPSHOT");
        //assertTrue(alpha1.compareTo(alpha2) < 0);
        //assertTrue(alpha2.compareTo(beta1) < 0);
        //assertTrue(beta1.compareTo(rc1) < 0);
        //assertTrue(rc1.compareTo(snapshot) < 0);
    }

    @Test
    void invalidQualifierTest() {
        //assertThrows(IllegalArgumentException.class, () -> QualifiedVersion.Qualifier.of("invalid"));
    }
}
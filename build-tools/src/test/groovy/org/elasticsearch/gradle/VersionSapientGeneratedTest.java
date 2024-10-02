package org.elasticsearch.gradle;

import org.elasticsearch.gradle.Version;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class VersionSapientGeneratedTest {

    private final Version compareToMock = mock(Version.class);

    private final Version versionMock = mock(Version.class);

    @Test
    void fromStringTest() {
        try (MockedStatic<Version> version = mockStatic(Version.class, CALLS_REAL_METHODS)) {
            version.when(() -> Version.fromString("s1", Version.Mode.STRICT)).thenReturn(versionMock);
            Version result = Version.fromString("s1");
            assertAll("result", () -> {
                assertThat(result, equalTo(versionMock));
                version.verify(() -> Version.fromString("s1", Version.Mode.STRICT), atLeast(1));
            });
        }
    }

    @Test
    void fromString1WhenModeEqualsModeSTRICTThrowsIllegalArgumentException() {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid version format: ''. Should be major.minor.revision[-(alpha|beta|rc)Number|-SNAPSHOT]");
        IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> Version.fromString("", Version.Mode.STRICT));
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    @Test
    void fromString1WhenRevisionIsNull() {
        Version result = Version.fromString("1.2", Version.Mode.RELAXED);
        Version expected = new Version(1, 2, 0, null);
        assertThat(result, equalTo(expected));
    }

    @Test
    void fromString1WhenRevisionIsNotNull() {
        Version result = Version.fromString("1.2.3-alpha1", Version.Mode.STRICT);
        Version version = new Version(1, 2, 3, "alpha1");
        assertThat(result, equalTo(version));
    }

    @Test
    void fromString1WhenModeNotEqualsModeSTRICTThrowsIllegalArgumentException() {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid version format: ''. Should be major.minor.revision[-extra]");
        IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> Version.fromString("", Version.Mode.RELAXED));
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    @Test
    void toStringTest() {
        Version target = new Version(2, 2, 2, "qualifier1");
        String result = target.toString();
        assertThat(result, equalTo("2.2.2"));
    }

    @ParameterizedTest
    @CsvSource({ "1,1,1,10101001,true", "2,0,0,1000000,false" })
    void beforeTest(int major, int minor, int revision, int compareToId, boolean expected) {
        when(compareToMock.getId()).thenReturn(compareToId);
        Version target = new Version(major, minor, revision, null);
        boolean result = target.before(compareToMock);
        assertThat(result, equalTo(expected));
        verify(compareToMock).getId();
    }

    @Test
    void before1Test() {
        try (MockedStatic<Version> version = mockStatic(Version.class)) {
            version.when(() -> Version.fromString("compareTo1")).thenReturn(versionMock);
            Version target = spy(new Version(1, 1, 1, "qualifier1"));
            doReturn(true).when(target).before(versionMock);
            boolean result = target.before("compareTo1");
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                version.verify(() -> Version.fromString("compareTo1"), atLeast(1));
                verify(target).before(versionMock);
            });
        }
    }

    @ParameterizedTest
    @CsvSource({ "1,1,1,10101000,true", "2,0,0,1000000,false" })
    void onOrBeforeTest(int major, int minor, int revision, int compareToId, boolean expected) {
        when(compareToMock.getId()).thenReturn(compareToId);
        Version target = new Version(major, minor, revision, null);
        boolean result = target.onOrBefore(compareToMock);
        assertThat(result, equalTo(expected));
        verify(compareToMock).getId();
    }

    @Test
    void onOrBefore1Test() {
        try (MockedStatic<Version> version = mockStatic(Version.class)) {
            version.when(() -> Version.fromString("compareTo1")).thenReturn(versionMock);
            Version target = spy(new Version(1, 1, 1, "qualifier1"));
            doReturn(true).when(target).onOrBefore(versionMock);
            boolean result = target.onOrBefore("compareTo1");
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                version.verify(() -> Version.fromString("compareTo1"), atLeast(1));
                verify(target).onOrBefore(versionMock);
            });
        }
    }

    @ParameterizedTest
    @CsvSource({ "1,1,1,1000000,true", "1,0,0,10101001,false" })
    void onOrAfterTest(int major, int minor, int revision, int compareToId, boolean expected) {
        when(compareToMock.getId()).thenReturn(compareToId);
        Version target = new Version(major, minor, revision, null);
        boolean result = target.onOrAfter(compareToMock);
        assertThat(result, equalTo(expected));
        verify(compareToMock).getId();
    }

    @Test
    void onOrAfter1Test() {
        try (MockedStatic<Version> version = mockStatic(Version.class)) {
            version.when(() -> Version.fromString("compareTo1")).thenReturn(versionMock);
            Version target = spy(new Version(1, 1, 1, "qualifier1"));
            doReturn(true).when(target).onOrAfter(versionMock);
            boolean result = target.onOrAfter("compareTo1");
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                version.verify(() -> Version.fromString("compareTo1"), atLeast(1));
                verify(target).onOrAfter(versionMock);
            });
        }
    }

    @ParameterizedTest
    @CsvSource({ "2,0,0,1000000,true", "1,0,0,10101000,false" })
    void afterTest(int major, int minor, int revision, int compareToId, boolean expected) {
        when(compareToMock.getId()).thenReturn(compareToId);
        Version target = new Version(major, minor, revision, null);
        boolean result = target.after(compareToMock);
        assertThat(result, equalTo(expected));
        verify(compareToMock).getId();
    }

    @Test
    void after1Test() {
        try (MockedStatic<Version> version = mockStatic(Version.class)) {
            version.when(() -> Version.fromString("compareTo1")).thenReturn(versionMock);
            Version target = spy(new Version(1, 1, 1, "qualifier1"));
            doReturn(true).when(target).after(versionMock);
            boolean result = target.after("compareTo1");
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                version.verify(() -> Version.fromString("compareTo1"), atLeast(1));
                verify(target).after(versionMock);
            });
        }
    }

    @Test
    void compareToTest() {
        Version otherMock = mock(Version.class);
        when(otherMock.getId()).thenReturn(1000000);
        Version target = new Version(1, 1, 1, "qualifier1");
        int result = target.compareTo(otherMock);
        assertThat(result, equalTo(1));
        verify(otherMock).getId();
    }

    @Test
    void equalsTest() {
        Version v1 = new Version(1, 2, 3, null);
        Version v2 = new Version(1, 2, 3, null);
        Version v3 = new Version(1, 2, 4, null);
        assertTrue(v1.equals(v2));
        assertFalse(v1.equals(v3));
        assertFalse(v1.equals(null));
        assertFalse(v1.equals("1.2.3"));
    }

    @Test
    void hashCodeTest() {
        Version v1 = new Version(1, 2, 3, null);
        Version v2 = new Version(1, 2, 3, null);
        Version v3 = new Version(1, 2, 4, null);
        assertEquals(v1.hashCode(), v2.hashCode());
        assertNotEquals(v1.hashCode(), v3.hashCode());
    }

    @Disabled()
    @Test
    void gettersTest() {
        Version v = new Version(1, 2, 3, "alpha");
        assertEquals(1, v.getMajor());
        assertEquals(2, v.getMinor());
        assertEquals(3, v.getRevision());
        assertEquals(1020003000, v.getId());
        assertEquals("alpha", v.getQualifier());
    }
}

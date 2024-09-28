package org.elasticsearch.gradle;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class VersionSapientGeneratedTest {

    private final Version compareToMock = mock(Version.class);

    private final Version versionMock = mock(Version.class);

    //Sapient generated method id: ${fromStringTest}, hash: 71E1FFB844E0217DDB86896E4008D681
    @Test()
    void fromStringTest() {
        //Arrange Statement(s)
        try (MockedStatic<Version> version = mockStatic(Version.class, CALLS_REAL_METHODS)) {
            version.when(() -> Version.fromString("s1", Version.Mode.STRICT)).thenReturn(versionMock);
            //Act Statement(s)
            Version result = Version.fromString("s1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(versionMock));
                version.verify(() -> Version.fromString("s1", Version.Mode.STRICT), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${fromString1WhenModeEqualsModeSTRICTThrowsIllegalArgumentException}, hash: A84FFD080EBD31BDC14A6910F7CDEF33
    @Test()
    void fromString1WhenModeEqualsModeSTRICTThrowsIllegalArgumentException() {
        /* Branches:
         * (mode == Mode.STRICT) : true
         * (matcher.matches() == false) : true
         * (mode == Mode.STRICT) : true
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid version format: ''. Should be major.minor.revision[-(alpha|beta|rc)Number|-SNAPSHOT]");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Version.fromString("", Version.Mode.STRICT);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${fromString1WhenRevisionIsNull}, hash: 474280C6C76DD247867D1C3295F0CA77
    @Disabled()
    @Test()
    void fromString1WhenRevisionIsNull() {
        /* Branches:
         * (mode == Mode.STRICT) : true
         * (matcher.matches() == false) : false
         * (revision == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Version result = Version.fromString("s1", Version.Mode.STRICT);
        Version version = new Version(0, 0, 0, "qualifier1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(version)));
    }

    //Sapient generated method id: ${fromString1WhenRevisionIsNotNull}, hash: D6FA410487FB58E88C738490C8187E96
    @Disabled()
    @Test()
    void fromString1WhenRevisionIsNotNull() {
        /* Branches:
         * (mode == Mode.STRICT) : true
         * (matcher.matches() == false) : false
         * (revision == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Version result = Version.fromString("s1", Version.Mode.STRICT);
        Version version = new Version(0, 0, 0, "qualifier1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(version)));
    }

    //Sapient generated method id: ${fromString1WhenModeNotEqualsModeSTRICTThrowsIllegalArgumentException}, hash: BA1B85481A67AAEC1540D413DAB3F0B9
    @Test()
    void fromString1WhenModeNotEqualsModeSTRICTThrowsIllegalArgumentException() {
        /* Branches:
         * (mode == Mode.STRICT) : false
         * (matcher.matches() == false) : true
         * (mode == Mode.STRICT) : false
         */
        //Arrange Statement(s)
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid version format: ''. Should be major.minor.revision[-extra]");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            Version.fromString("", Version.Mode.RELAXED);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${toStringTest}, hash: A565190465099EAB0A23504DDC96148F
    @Test()
    void toStringTest() {
        //Arrange Statement(s)
        Version target = new Version(2, 2, 2, "qualifier1");
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("2.2.2")));
    }

    //Sapient generated method id: ${beforeWhenIdLessThanCompareToGetId}, hash: 3A0FE582D622CCAC226C772A0C8C5AE7
    @Test()
    void beforeWhenIdLessThanCompareToGetId() {
        /* Branches:
         * (id < compareTo.getId()) : true
         */
        //Arrange Statement(s)
        doReturn(10101001).when(compareToMock).getId();
        Version target = new Version(1, 1, 1, "qualifier1");
        //Act Statement(s)
        boolean result = target.before(compareToMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(compareToMock).getId();
        });
    }

    //Sapient generated method id: ${beforeWhenIdNotLessThanCompareToGetId}, hash: E118DE502DF291D86EF38F5262DA0F1A
    @Test()
    void beforeWhenIdNotLessThanCompareToGetId() {
        /* Branches:
         * (id < compareTo.getId()) : false
         */
        //Arrange Statement(s)
        doReturn(1).when(compareToMock).getId();
        Version target = new Version(1, 1, 1, "qualifier1");
        //Act Statement(s)
        boolean result = target.before(compareToMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(compareToMock).getId();
        });
    }

    //Sapient generated method id: ${before1WhenBeforeFromStringCompareTo}, hash: DE3B4BF144C27A5BE8BC617B6EBD0E3C
    @Test()
    void before1WhenBeforeFromStringCompareTo() {
        /* Branches:
         * (before(fromString(compareTo))) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Version> version = mockStatic(Version.class)) {
            version.when(() -> Version.fromString("compareTo1")).thenReturn(versionMock);
            Version target = spy(new Version(1, 1, 1, "qualifier1"));
            doReturn(true).when(target).before(versionMock);
            //Act Statement(s)
            boolean result = target.before("compareTo1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                version.verify(() -> Version.fromString("compareTo1"), atLeast(1));
                verify(target).before(versionMock);
            });
        }
    }

    //Sapient generated method id: ${before1WhenBeforeNotFromStringCompareTo}, hash: 2B87E8FB9423D2CB1B6C1477B057061C
    @Test()
    void before1WhenBeforeNotFromStringCompareTo() {
        /* Branches:
         * (before(fromString(compareTo))) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Version> version = mockStatic(Version.class)) {
            version.when(() -> Version.fromString("compareTo1")).thenReturn(versionMock);
            Version target = spy(new Version(1, 1, 1, "qualifier1"));
            doReturn(false).when(target).before(versionMock);
            //Act Statement(s)
            boolean result = target.before("compareTo1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                version.verify(() -> Version.fromString("compareTo1"), atLeast(1));
                verify(target).before(versionMock);
            });
        }
    }

    //Sapient generated method id: ${onOrBeforeWhenIdLessThanOrEqualsToCompareToGetId}, hash: FD99994C5AD22ECDEB4CB36DAE265909
    @Test()
    void onOrBeforeWhenIdLessThanOrEqualsToCompareToGetId() {
        /* Branches:
         * (id <= compareTo.getId()) : true
         */
        //Arrange Statement(s)
        doReturn(10101000).when(compareToMock).getId();
        Version target = new Version(1, 1, 1, "qualifier1");
        //Act Statement(s)
        boolean result = target.onOrBefore(compareToMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(compareToMock).getId();
        });
    }

    //Sapient generated method id: ${onOrBeforeWhenIdGreaterThanCompareToGetId}, hash: 2FA74BCF375F05B7653FEF967A58B000
    @Test()
    void onOrBeforeWhenIdGreaterThanCompareToGetId() {
        /* Branches:
         * (id <= compareTo.getId()) : false
         */
        //Arrange Statement(s)
        doReturn(1).when(compareToMock).getId();
        Version target = new Version(1, 1, 1, "qualifier1");
        //Act Statement(s)
        boolean result = target.onOrBefore(compareToMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(compareToMock).getId();
        });
    }

    //Sapient generated method id: ${onOrBefore1WhenOnOrBeforeFromStringCompareTo}, hash: E9120F1887F9C07500C6F4E70CF34517
    @Test()
    void onOrBefore1WhenOnOrBeforeFromStringCompareTo() {
        /* Branches:
         * (onOrBefore(fromString(compareTo))) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Version> version = mockStatic(Version.class)) {
            version.when(() -> Version.fromString("compareTo1")).thenReturn(versionMock);
            Version target = spy(new Version(1, 1, 1, "qualifier1"));
            doReturn(true).when(target).onOrBefore(versionMock);
            //Act Statement(s)
            boolean result = target.onOrBefore("compareTo1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                version.verify(() -> Version.fromString("compareTo1"), atLeast(1));
                verify(target).onOrBefore(versionMock);
            });
        }
    }

    //Sapient generated method id: ${onOrBefore1WhenOnOrBeforeNotFromStringCompareTo}, hash: 6709BA1B256E01AEF4F2E569EE66B660
    @Test()
    void onOrBefore1WhenOnOrBeforeNotFromStringCompareTo() {
        /* Branches:
         * (onOrBefore(fromString(compareTo))) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Version> version = mockStatic(Version.class)) {
            version.when(() -> Version.fromString("compareTo1")).thenReturn(versionMock);
            Version target = spy(new Version(1, 1, 1, "qualifier1"));
            doReturn(false).when(target).onOrBefore(versionMock);
            //Act Statement(s)
            boolean result = target.onOrBefore("compareTo1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                version.verify(() -> Version.fromString("compareTo1"), atLeast(1));
                verify(target).onOrBefore(versionMock);
            });
        }
    }

    //Sapient generated method id: ${onOrAfterWhenIdGreaterThanOrEqualsToCompareToGetId}, hash: 07AD942C0D35A1C91FD138A8F4676B65
    @Test()
    void onOrAfterWhenIdGreaterThanOrEqualsToCompareToGetId() {
        /* Branches:
         * (id >= compareTo.getId()) : true
         */
        //Arrange Statement(s)
        doReturn(1).when(compareToMock).getId();
        Version target = new Version(1, 1, 1, "qualifier1");
        //Act Statement(s)
        boolean result = target.onOrAfter(compareToMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(compareToMock).getId();
        });
    }

    //Sapient generated method id: ${onOrAfterWhenIdLessThanCompareToGetId}, hash: 540FF7C3D206611CF81EEA4064D67D37
    @Test()
    void onOrAfterWhenIdLessThanCompareToGetId() {
        /* Branches:
         * (id >= compareTo.getId()) : false
         */
        //Arrange Statement(s)
        doReturn(10101001).when(compareToMock).getId();
        Version target = new Version(1, 1, 1, "qualifier1");
        //Act Statement(s)
        boolean result = target.onOrAfter(compareToMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(compareToMock).getId();
        });
    }

    //Sapient generated method id: ${onOrAfter1WhenOnOrAfterFromStringCompareTo}, hash: 887C46B1E88A9A1E368A922394525299
    @Test()
    void onOrAfter1WhenOnOrAfterFromStringCompareTo() {
        /* Branches:
         * (onOrAfter(fromString(compareTo))) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Version> version = mockStatic(Version.class)) {
            version.when(() -> Version.fromString("compareTo1")).thenReturn(versionMock);
            Version target = spy(new Version(1, 1, 1, "qualifier1"));
            doReturn(true).when(target).onOrAfter(versionMock);
            //Act Statement(s)
            boolean result = target.onOrAfter("compareTo1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                version.verify(() -> Version.fromString("compareTo1"), atLeast(1));
                verify(target).onOrAfter(versionMock);
            });
        }
    }

    //Sapient generated method id: ${onOrAfter1WhenOnOrAfterNotFromStringCompareTo}, hash: 8804039C41711FAF7A57E3C5B2943004
    @Test()
    void onOrAfter1WhenOnOrAfterNotFromStringCompareTo() {
        /* Branches:
         * (onOrAfter(fromString(compareTo))) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Version> version = mockStatic(Version.class)) {
            version.when(() -> Version.fromString("compareTo1")).thenReturn(versionMock);
            Version target = spy(new Version(1, 1, 1, "qualifier1"));
            doReturn(false).when(target).onOrAfter(versionMock);
            //Act Statement(s)
            boolean result = target.onOrAfter("compareTo1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                version.verify(() -> Version.fromString("compareTo1"), atLeast(1));
                verify(target).onOrAfter(versionMock);
            });
        }
    }

    //Sapient generated method id: ${afterWhenIdGreaterThanCompareToGetId}, hash: 3EA57DAEA4FCFA03EFEEB102347C991E
    @Test()
    void afterWhenIdGreaterThanCompareToGetId() {
        /* Branches:
         * (id > compareTo.getId()) : true
         */
        //Arrange Statement(s)
        doReturn(1).when(compareToMock).getId();
        Version target = new Version(1, 1, 1, "qualifier1");
        //Act Statement(s)
        boolean result = target.after(compareToMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(compareToMock).getId();
        });
    }

    //Sapient generated method id: ${afterWhenIdNotGreaterThanCompareToGetId}, hash: 126D7423BF511121D38B32FFFC28D734
    @Test()
    void afterWhenIdNotGreaterThanCompareToGetId() {
        /* Branches:
         * (id > compareTo.getId()) : false
         */
        //Arrange Statement(s)
        doReturn(10101000).when(compareToMock).getId();
        Version target = new Version(1, 1, 1, "qualifier1");
        //Act Statement(s)
        boolean result = target.after(compareToMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(compareToMock).getId();
        });
    }

    //Sapient generated method id: ${after1WhenAfterFromStringCompareTo}, hash: 91D6F214E00C6713333D95F012680191
    @Test()
    void after1WhenAfterFromStringCompareTo() {
        /* Branches:
         * (after(fromString(compareTo))) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<Version> version = mockStatic(Version.class)) {
            version.when(() -> Version.fromString("compareTo1")).thenReturn(versionMock);
            Version target = spy(new Version(1, 1, 1, "qualifier1"));
            doReturn(true).when(target).after(versionMock);
            //Act Statement(s)
            boolean result = target.after("compareTo1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                version.verify(() -> Version.fromString("compareTo1"), atLeast(1));
                verify(target).after(versionMock);
            });
        }
    }

    //Sapient generated method id: ${after1WhenAfterNotFromStringCompareTo}, hash: 181F0634EAE2D1659479EF94C2FB5D40
    @Test()
    void after1WhenAfterNotFromStringCompareTo() {
        /* Branches:
         * (after(fromString(compareTo))) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<Version> version = mockStatic(Version.class)) {
            version.when(() -> Version.fromString("compareTo1")).thenReturn(versionMock);
            Version target = spy(new Version(1, 1, 1, "qualifier1"));
            doReturn(false).when(target).after(versionMock);
            //Act Statement(s)
            boolean result = target.after("compareTo1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                version.verify(() -> Version.fromString("compareTo1"), atLeast(1));
                verify(target).after(versionMock);
            });
        }
    }

    //Sapient generated method id: ${compareToTest}, hash: 440EE7669EAE80C934224DC3BC860DAC
    @Test()
    void compareToTest() {
        //Arrange Statement(s)
        Version otherMock = mock(Version.class);
        doReturn(1).when(otherMock).getId();
        Version target = new Version(1, 1, 1, "qualifier1");
        //Act Statement(s)
        int result = target.compareTo(otherMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(1));
            verify(otherMock).getId();
        });
    }
}

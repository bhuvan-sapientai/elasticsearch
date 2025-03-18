package org.elasticsearch.gradle.internal.info;

import org.elasticsearch.gradle.internal.info.JavaHome;

import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.elasticsearch.gradle.internal.info.JavaHome;
import org.gradle.api.provider.Provider;

import static org.mockito.ArgumentMatchers.any;

class JavaHomeSapientGeneratedTest {

    @Test
    void ofTest() {
        Provider<File> providerMock = mock(Provider.class);
        JavaHome result = JavaHome.of(1, providerMock);
        assertAll("result", () -> assertThat(result, is(notNullValue())), () -> assertThat(result.getVersion(), is(1)), () -> assertThat(result.getJavaHome(), is(providerMock)));
    }

    @ParameterizedTest
    @ValueSource(ints = {8, 11, 17})
    void ofTestWithDifferentVersions(int version) {
        Provider<File> providerMock = mock(Provider.class);
        JavaHome result = JavaHome.of(version, providerMock);
        assertAll("result", () -> assertThat(result, is(notNullValue())), () -> assertThat(result.getVersion(), is(version)), () -> assertThat(result.getJavaHome(), is(providerMock)));
    }

    @Test
    void getVersionTest() {
        Provider<File> providerMock = mock(Provider.class);
        JavaHome javaHome = JavaHome.of(11, providerMock);
        Integer version = javaHome.getVersion();
        assertThat(version, is(11));
    }

    @Test
    void getJavaHomeTest() {
        Provider<File> providerMock = mock(Provider.class);
        JavaHome javaHome = JavaHome.of(11, providerMock);
        Provider<File> result = javaHome.getJavaHome();
        assertThat(result, is(providerMock));
    }

    @Test
    void constructorTest() {
        Provider<File> providerMock = mock(Provider.class);
        JavaHome javaHome = JavaHome.of(11, providerMock);
        assertAll("javaHome", () -> assertThat(javaHome.getVersion(), is(11)), () -> assertThat(javaHome.getJavaHome(), is(providerMock)));
    }

    @ParameterizedTest
    @CsvSource({"0, true", "-1, true", "1, true", "8, true", "11, true", "17, true", "Integer.MAX_VALUE, true"})
    void ofTestWithEdgeCases(int version, boolean shouldPass) {
        Provider<File> providerMock = mock(Provider.class);
        if (shouldPass) {
            JavaHome result = JavaHome.of(version, providerMock);
            assertAll("result", () -> assertThat(result, is(notNullValue())), () -> assertThat(result.getVersion(), is(version)), () -> assertThat(result.getJavaHome(), is(providerMock)));
        } else {
            assertThrows(IllegalArgumentException.class, () -> JavaHome.of(version, providerMock));
        }
    }

    @Test
    void ofTestWithNullProvider() {
        assertThrows(NullPointerException.class, () -> JavaHome.of(11, null));
    }

    @Test
    void getVersionTestWithZeroVersion() {
        Provider<File> providerMock = mock(Provider.class);
        JavaHome javaHome = JavaHome.of(0, providerMock);
        Integer version = javaHome.getVersion();
        assertThat(version, is(0));
    }

    @Test
    void getVersionTestWithNegativeVersion() {
        Provider<File> providerMock = mock(Provider.class);
        JavaHome javaHome = JavaHome.of(-1, providerMock);
        Integer version = javaHome.getVersion();
        assertThat(version, is(-1));
    }

    @Test
    void getJavaHomeTestWithNullProvider() {
        Provider<File> providerMock = null;
        JavaHome javaHome = JavaHome.of(11, providerMock);
        Provider<File> result = javaHome.getJavaHome();
        assertThat(result, is(nullValue()));
    }
}

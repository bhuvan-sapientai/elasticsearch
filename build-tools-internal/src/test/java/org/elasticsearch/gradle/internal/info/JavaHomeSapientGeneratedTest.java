package org.elasticsearch.gradle.internal.info;

import org.elasticsearch.gradle.internal.info.JavaHome;

import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

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
}

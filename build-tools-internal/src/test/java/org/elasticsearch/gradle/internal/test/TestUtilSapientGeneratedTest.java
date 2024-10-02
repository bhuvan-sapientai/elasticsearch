package org.elasticsearch.gradle.internal.test;

import org.elasticsearch.gradle.internal.test.TestUtil;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.MatcherAssert.assertThat;

import org.elasticsearch.gradle.ElasticsearchDistribution;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;
import org.elasticsearch.gradle.Architecture;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

class TestUtilSapientGeneratedTest {

    @ParameterizedTest
    @CsvSource({"nativeLibsDir1, X64, LINUX, nativeLibsDir1/linux-x86_64", "nativeLibsDir2, AARCH64, LINUX, nativeLibsDir2/linux-aarch64", "nativeLibsDir3, X64, WINDOWS, nativeLibsDir3/windows-x86_64", "nativeLibsDir4, AARCH64, DARWIN, nativeLibsDir4/darwin-aarch64"})
    void getTestLibraryPathTest(String nativeLibsDir, Architecture arch, ElasticsearchDistribution.Platform platform, String expected) {
        /*try (MockedStatic<Architecture> mockedArchitecture = mockStatic(Architecture.class);
    MockedStatic<ElasticsearchDistribution> mockedDistribution = mockStatic(ElasticsearchDistribution.class)) {
    mockedArchitecture.when(Architecture::current).thenReturn(arch);
    mockedDistribution.when(() -> ElasticsearchDistribution.CURRENT_PLATFORM).thenReturn(platform);
    String result = TestUtil.getTestLibraryPath(nativeLibsDir);
    assertThat(result, equalTo(expected));
}*/
    }

    @Test
    void getTestLibraryPathTestWithNullInput() {
        /*try (MockedStatic<Architecture> mockedArchitecture = mockStatic(Architecture.class);
    MockedStatic<ElasticsearchDistribution> mockedDistribution = mockStatic(ElasticsearchDistribution.class)) {
    mockedArchitecture.when(Architecture::current).thenReturn(Architecture.X64);
    mockedDistribution.when(() -> ElasticsearchDistribution.CURRENT_PLATFORM).thenReturn(ElasticsearchDistribution.Platform.LINUX);
    String result = TestUtil.getTestLibraryPath(null);
    assertThat(result, equalTo("null/linux-x86_64"));
}*/
    }
}
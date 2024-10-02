package org.elasticsearch.gradle.distribution;

import org.elasticsearch.gradle.distribution.ArchiveElasticsearchDistributionType;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.elasticsearch.gradle.Version;
import static org.hamcrest.MatcherAssert.assertThat;
import org.elasticsearch.gradle.ElasticsearchDistribution;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;
import org.elasticsearch.gradle.Architecture;
import static org.mockito.Mockito.*;
import org.elasticsearch.gradle.distribution.ArchiveElasticsearchDistributionType;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

class ArchiveElasticsearchDistributionTypeSapientGeneratedTest {

    @Test
    void getNameTest() {
        ArchiveElasticsearchDistributionType target = new ArchiveElasticsearchDistributionType();
        String result = target.getName();
        assertThat(result, equalTo("archive"));
    }

    @ParameterizedTest
    @CsvSource({ "WINDOWS,zip", "LINUX,tar.gz", "DARWIN,tar.gz" })
    void getExtensionTest(ElasticsearchDistribution.Platform platform, String expected) {
        ArchiveElasticsearchDistributionType target = new ArchiveElasticsearchDistributionType();
        String result = target.getExtension(platform);
        assertThat(result, equalTo(expected));
    }

    @Disabled()
    @ParameterizedTest
    @CsvSource({ "WINDOWS,7.0.0,true,:windows-x86_64", "LINUX,7.0.0,true,:linux-x86_64", "DARWIN,7.0.0,true,:darwin-x86_64", "WINDOWS,6.8.0,false,", "LINUX,6.8.0,false,", "DARWIN,6.8.0,false," })
    void getClassifierTest(ElasticsearchDistribution.Platform platform, String versionStr, boolean onOrAfter, String expected) {
        Version versionMock = mock(Version.class);
        when(versionMock.onOrAfter("7.0.0")).thenReturn(onOrAfter);
        ArchiveElasticsearchDistributionType target = new ArchiveElasticsearchDistributionType();
        try (var mockedArchitecture = mockStatic(Architecture.class)) {
            mockedArchitecture.when(Architecture::current).thenReturn(Architecture.X64);
            String result = target.getClassifier(platform, versionMock);
            assertThat(result, equalTo(expected));
        }
        verify(versionMock).onOrAfter("7.0.0");
    }

    @Test
    void shouldExtractTest() {
        ArchiveElasticsearchDistributionType target = new ArchiveElasticsearchDistributionType();
        boolean result = target.shouldExtract();
        assertThat(result, equalTo(true));
    }
}

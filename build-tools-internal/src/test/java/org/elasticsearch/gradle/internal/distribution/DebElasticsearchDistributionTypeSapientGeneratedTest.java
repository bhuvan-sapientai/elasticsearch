package org.elasticsearch.gradle.internal.distribution;

import org.elasticsearch.gradle.internal.distribution.DebElasticsearchDistributionType;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.elasticsearch.gradle.Version;
import org.junit.jupiter.params.provider.MethodSource;
import org.elasticsearch.gradle.ElasticsearchDistribution;

import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.util.stream.Stream;

import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.params.provider.Arguments;
import org.elasticsearch.gradle.internal.distribution.DebElasticsearchDistributionType;

import static org.mockito.ArgumentMatchers.any;

class DebElasticsearchDistributionTypeSapientGeneratedTest {

    @Test
    void getNameTest() {
        DebElasticsearchDistributionType target = new DebElasticsearchDistributionType();
        String result = target.getName();
        assertThat(result, equalTo("deb"));
    }

    @ParameterizedTest
    @EnumSource(ElasticsearchDistribution.Platform.class)
    void getClassifierTest(ElasticsearchDistribution.Platform platform) {
        DebElasticsearchDistributionType target = new DebElasticsearchDistributionType();
        Version versionMock = mock(Version.class);
        String result = target.getClassifier(platform, versionMock);
        assertThat(result, equalTo(":amd64"));
    }

    @Test
    void constructorTest() {
        DebElasticsearchDistributionType target = new DebElasticsearchDistributionType();
        assertAll(() -> assertThat(target.getName(), equalTo("deb")), () -> assertThat(target.getClassifier(ElasticsearchDistribution.Platform.LINUX, mock(Version.class)), equalTo(":amd64")));
    }

    @ParameterizedTest
    @MethodSource("provideVersionsForClassifierTest")
    void getClassifierWithDifferentVersionsTest(Version version) {
        DebElasticsearchDistributionType target = new DebElasticsearchDistributionType();
        String result = target.getClassifier(ElasticsearchDistribution.Platform.LINUX, version);
        assertThat(result, equalTo(":amd64"));
    }

    private static Stream<Arguments> provideVersionsForClassifierTest() {
        return Stream.of(Arguments.of(new Version(7, 10, 0)), Arguments.of(new Version(8, 0, 0)), Arguments.of(new Version(8, 5, 1)));
    }

    @Test
    void getClassifierNullPlatformTest() {
        DebElasticsearchDistributionType target = new DebElasticsearchDistributionType();
        Version versionMock = mock(Version.class);
        String result = target.getClassifier(null, versionMock);
        assertThat(result, equalTo(":amd64"));
    }

    @Test
    void getClassifierNullVersionTest() {
        DebElasticsearchDistributionType target = new DebElasticsearchDistributionType();
        String result = target.getClassifier(ElasticsearchDistribution.Platform.LINUX, null);
        assertThat(result, equalTo(":amd64"));
    }
}

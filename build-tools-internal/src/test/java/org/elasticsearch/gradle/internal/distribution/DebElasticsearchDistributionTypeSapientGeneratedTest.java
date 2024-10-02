package org.elasticsearch.gradle.internal.distribution;

import org.elasticsearch.gradle.internal.distribution.DebElasticsearchDistributionType;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;

import org.elasticsearch.gradle.Version;

import static org.hamcrest.MatcherAssert.assertThat;

import org.elasticsearch.gradle.ElasticsearchDistribution;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.mockito.ArgumentMatchers.any;

class DebElasticsearchDistributionTypeSapientGeneratedTest {

    @Test
    void getNameTest() {
        DebElasticsearchDistributionType target = new DebElasticsearchDistributionType();
        String result = target.getName();
        assertAll("result", () -> assertThat(result, equalTo("deb")));
    }

    @ParameterizedTest
    @EnumSource(ElasticsearchDistribution.Platform.class)
    void getClassifierTest(ElasticsearchDistribution.Platform platform) {
        DebElasticsearchDistributionType target = new DebElasticsearchDistributionType();
        Version versionMock = mock(Version.class);
        String result = target.getClassifier(platform, versionMock);
        assertAll("result", () -> assertThat(result, equalTo(":amd64")));
    }

    @Test
    void constructorTest() {
        DebElasticsearchDistributionType target = new DebElasticsearchDistributionType();
        assertAll(() -> assertThat(target.getName(), equalTo("deb")), () -> assertThat(target.getClassifier(ElasticsearchDistribution.Platform.LINUX, mock(Version.class)), equalTo(":amd64")));
    }
}

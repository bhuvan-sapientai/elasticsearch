package org.elasticsearch.gradle.internal.distribution;

import org.elasticsearch.gradle.internal.distribution.DockerUbiElasticsearchDistributionType;

import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.MatcherAssert.assertThat;

import org.elasticsearch.gradle.ElasticsearchDistributionType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;

import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class DockerUbiElasticsearchDistributionTypeSapientGeneratedTest {

    @Test
    void getNameTest() {
        DockerUbiElasticsearchDistributionType target = new DockerUbiElasticsearchDistributionType();
        String result = target.getName();
        assertAll("result", () -> assertThat(result, equalTo("dockerUbi")), () -> assertThat(result.length(), is(9)));
    }

    @Test
    void isDockerTest() {
        DockerUbiElasticsearchDistributionType target = new DockerUbiElasticsearchDistributionType();
        boolean result = target.isDocker();
        assertAll("result", () -> assertThat(result, is(true)), () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    @ParameterizedTest
    @CsvSource({"dockerUbi, true", "docker, true", "ubi, true"})
    void testConsistency(String name, boolean isDocker) {
        DockerUbiElasticsearchDistributionType target = new DockerUbiElasticsearchDistributionType();
        assertAll("Consistency check", () -> assertThat(target.getName(), equalTo("dockerUbi")), () -> assertThat(target.isDocker(), is(true)));
    }

    @Test
    void testConstructor() {
        DockerUbiElasticsearchDistributionType target = new DockerUbiElasticsearchDistributionType();
        assertAll("Constructor test", () -> assertThat(target.getName(), equalTo("dockerUbi")), () -> assertThat(target.isDocker(), is(true)));
    }
}

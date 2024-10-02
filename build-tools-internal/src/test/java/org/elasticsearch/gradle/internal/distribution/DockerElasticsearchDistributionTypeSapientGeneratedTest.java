package org.elasticsearch.gradle.internal.distribution;

import org.elasticsearch.gradle.internal.distribution.DockerElasticsearchDistributionType;

import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.MatcherAssert.assertThat;

import org.elasticsearch.gradle.ElasticsearchDistributionType;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class DockerElasticsearchDistributionTypeSapientGeneratedTest {

    @Test
    void getNameTest() {
        DockerElasticsearchDistributionType target = new DockerElasticsearchDistributionType();
        String result = target.getName();
        assertAll("getName", () -> assertThat(result, equalTo("docker")), () -> assertThat(result.length(), is(6)));
    }

    @Test
    void isDockerTest() {
        DockerElasticsearchDistributionType target = new DockerElasticsearchDistributionType();
        boolean result = target.isDocker();
        assertThat(result, is(true));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void multipleInstanceTest(int instance) {
        DockerElasticsearchDistributionType target = new DockerElasticsearchDistributionType();
        assertAll("multiple instances", () -> assertThat(target.getName(), equalTo("docker")), () -> assertThat(target.isDocker(), is(true)));
    }

    @Test
    void constructorTest() {
        DockerElasticsearchDistributionType target = new DockerElasticsearchDistributionType();
        assertAll("constructor", () -> assertThat(target.getName(), equalTo("docker")), () -> assertThat(target.isDocker(), is(true)));
    }
}

package org.elasticsearch.gradle.internal.distribution;

import org.elasticsearch.gradle.internal.distribution.DockerCloudElasticsearchDistributionType;

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
class DockerCloudElasticsearchDistributionTypeSapientGeneratedTest {

    @Test
    void getNameTest() {
        DockerCloudElasticsearchDistributionType target = new DockerCloudElasticsearchDistributionType();
        String result = target.getName();
        assertAll("result", () -> assertThat(result, equalTo("dockerCloud")), () -> assertThat(result.length(), is(11)));
    }

    @Test
    void isDockerTest() {
        DockerCloudElasticsearchDistributionType target = new DockerCloudElasticsearchDistributionType();
        boolean result = target.isDocker();
        assertAll("result", () -> assertThat(result, is(true)), () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void multipleInstanceTest(int instance) {
        DockerCloudElasticsearchDistributionType target = new DockerCloudElasticsearchDistributionType();
        assertAll("Multiple instances should behave the same", () -> assertThat(target.getName(), equalTo("dockerCloud")), () -> assertThat(target.isDocker(), is(true)));
    }

    @Test
    void constructorTest() {
        DockerCloudElasticsearchDistributionType target = new DockerCloudElasticsearchDistributionType();
        assertAll("Constructor should initialize object correctly", () -> assertThat(target.getName(), equalTo("dockerCloud")), () -> assertThat(target.isDocker(), is(true)));
    }
}

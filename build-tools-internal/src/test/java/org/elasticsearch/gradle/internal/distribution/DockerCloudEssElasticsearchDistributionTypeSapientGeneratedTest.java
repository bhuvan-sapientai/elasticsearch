package org.elasticsearch.gradle.internal.distribution;

import org.elasticsearch.gradle.internal.distribution.DockerCloudEssElasticsearchDistributionType;

import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.MatcherAssert.assertThat;

import org.elasticsearch.gradle.ElasticsearchDistributionType;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class DockerCloudEssElasticsearchDistributionTypeSapientGeneratedTest {

    @Test
    void getNameTest() {
        DockerCloudEssElasticsearchDistributionType target = new DockerCloudEssElasticsearchDistributionType();
        String result = target.getName();
        assertAll("result", () -> assertThat(result, equalTo("dockerCloudEss")));
    }

    @Test
    void isDockerTest() {
        DockerCloudEssElasticsearchDistributionType target = new DockerCloudEssElasticsearchDistributionType();
        boolean result = target.isDocker();
        assertAll("result", () -> assertThat(result, equalTo(true)));
    }

    @Test
    void constructorTest() {
        DockerCloudEssElasticsearchDistributionType target = new DockerCloudEssElasticsearchDistributionType();
        assertAll(() -> assertThat(target.getName(), equalTo("dockerCloudEss")), () -> assertThat(target.isDocker(), equalTo(true)));
    }
}

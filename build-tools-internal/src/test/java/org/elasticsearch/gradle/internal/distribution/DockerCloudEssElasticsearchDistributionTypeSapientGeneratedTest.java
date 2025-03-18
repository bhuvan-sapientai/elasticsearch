package org.elasticsearch.gradle.internal.distribution;

import org.elasticsearch.gradle.internal.distribution.DockerCloudEssElasticsearchDistributionType;

import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;

import org.elasticsearch.gradle.ElasticsearchDistributionType;
import org.elasticsearch.gradle.internal.distribution.DockerCloudEssElasticsearchDistributionType;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class DockerCloudEssElasticsearchDistributionTypeSapientGeneratedTest {

    @Test
    void getNameTest() {
        DockerCloudEssElasticsearchDistributionType target = new DockerCloudEssElasticsearchDistributionType();
        String result = target.getName();
        assertAll("result", () -> assertThat(result, equalTo("dockerCloudEss")), () -> assertNotNull(result));
    }

    @Test
    void isDockerTest() {
        DockerCloudEssElasticsearchDistributionType target = new DockerCloudEssElasticsearchDistributionType();
        boolean result = target.isDocker();
        assertAll("result", () -> assertThat(result, is(true)));
    }

    @Test
    void constructorTest() {
        DockerCloudEssElasticsearchDistributionType target = new DockerCloudEssElasticsearchDistributionType();
        assertAll(() -> assertThat(target.getName(), equalTo("dockerCloudEss")), () -> assertThat(target.isDocker(), is(true)), () -> assertNotNull(target));
    }

    @Test
    void implementsElasticsearchDistributionTypeTest() {
        DockerCloudEssElasticsearchDistributionType target = new DockerCloudEssElasticsearchDistributionType();
        assertThat(target instanceof ElasticsearchDistributionType, is(true));
    }

    @Test
    void multipleInstancesTest() {
        DockerCloudEssElasticsearchDistributionType instance1 = new DockerCloudEssElasticsearchDistributionType();
        DockerCloudEssElasticsearchDistributionType instance2 = new DockerCloudEssElasticsearchDistributionType();
        assertAll(() -> assertThat(instance1.getName(), equalTo(instance2.getName())), () -> assertThat(instance1.isDocker(), is(instance2.isDocker())));
    }
}

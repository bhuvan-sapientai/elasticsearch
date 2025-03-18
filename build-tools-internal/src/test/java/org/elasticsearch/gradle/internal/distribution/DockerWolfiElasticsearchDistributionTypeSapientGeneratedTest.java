package org.elasticsearch.gradle.internal.distribution;

import org.elasticsearch.gradle.internal.distribution.DockerWolfiElasticsearchDistributionType;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.elasticsearch.gradle.ElasticsearchDistributionType;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;
import org.elasticsearch.gradle.internal.distribution.DockerWolfiElasticsearchDistributionType;

import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class DockerWolfiElasticsearchDistributionTypeSapientGeneratedTest {

    @Test
    void getNameTest() {
        DockerWolfiElasticsearchDistributionType target = new DockerWolfiElasticsearchDistributionType();
        String result = target.getName();
        assertAll("result", () -> assertNotNull(result), () -> assertThat(result, equalTo("dockerWolfi")));
    }

    @Test
    void isDockerTest() {
        DockerWolfiElasticsearchDistributionType target = new DockerWolfiElasticsearchDistributionType();
        boolean result = target.isDocker();
        assertThat(result, is(true));
    }

    @ParameterizedTest
    @CsvSource({"dockerWolfi, true", "dockerWolfi, true"})
    void testAllMethods(String expectedName, boolean expectedDocker) {
        DockerWolfiElasticsearchDistributionType target = new DockerWolfiElasticsearchDistributionType();
        assertAll(() -> assertThat(target.getName(), equalTo(expectedName)), () -> assertThat(target.isDocker(), is(expectedDocker)));
    }

    @Test
    void testConstructor() {
        DockerWolfiElasticsearchDistributionType target = new DockerWolfiElasticsearchDistributionType();
        assertNotNull(target);
    }

    @Test
    void testImplementsElasticsearchDistributionType() {
        DockerWolfiElasticsearchDistributionType target = new DockerWolfiElasticsearchDistributionType();
        assertThat(target instanceof ElasticsearchDistributionType, is(true));
    }

    @ParameterizedTest
    @CsvSource({"dockerWolfi, true", "dockerWolfi, true", "dockerWolfi, true"})
    void testMultipleInstances(String expectedName, boolean expectedDocker) {
        DockerWolfiElasticsearchDistributionType instance1 = new DockerWolfiElasticsearchDistributionType();
        DockerWolfiElasticsearchDistributionType instance2 = new DockerWolfiElasticsearchDistributionType();
        DockerWolfiElasticsearchDistributionType instance3 = new DockerWolfiElasticsearchDistributionType();
        assertAll(() -> assertThat(instance1.getName(), equalTo(expectedName)), () -> assertThat(instance1.isDocker(), is(expectedDocker)), () -> assertThat(instance2.getName(), equalTo(expectedName)), () -> assertThat(instance2.isDocker(), is(expectedDocker)), () -> assertThat(instance3.getName(), equalTo(expectedName)), () -> assertThat(instance3.isDocker(), is(expectedDocker)));
    }
}

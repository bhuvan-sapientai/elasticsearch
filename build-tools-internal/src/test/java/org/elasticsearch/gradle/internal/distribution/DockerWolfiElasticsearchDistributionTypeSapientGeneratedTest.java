package org.elasticsearch.gradle.internal.distribution;

import org.elasticsearch.gradle.internal.distribution.DockerWolfiElasticsearchDistributionType;

import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;

import org.elasticsearch.gradle.ElasticsearchDistributionType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;

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
}

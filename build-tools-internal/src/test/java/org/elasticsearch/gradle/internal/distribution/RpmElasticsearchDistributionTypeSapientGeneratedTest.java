package org.elasticsearch.gradle.internal.distribution;

import org.elasticsearch.gradle.internal.distribution.RpmElasticsearchDistributionType;

import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.MatcherAssert.assertThat;

import org.elasticsearch.gradle.ElasticsearchDistributionType;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class RpmElasticsearchDistributionTypeSapientGeneratedTest {

    @Test
    void getNameTest() {
        RpmElasticsearchDistributionType target = new RpmElasticsearchDistributionType();
        String result = target.getName();
        assertAll("result", () -> assertThat(result, equalTo("rpm")));
    }

    @Test
    void shouldExtractTest() {
        RpmElasticsearchDistributionType target = new RpmElasticsearchDistributionType();
        boolean result = target.shouldExtract();
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    @Test
    void isDockerTest() {
        RpmElasticsearchDistributionType target = new RpmElasticsearchDistributionType();
        boolean result = target.isDocker();
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    @Test
    void constructorTest() {
        RpmElasticsearchDistributionType target = new RpmElasticsearchDistributionType();
        assertAll(() -> assertThat(target.getName(), equalTo("rpm")), () -> assertThat(target.shouldExtract(), equalTo(false)), () -> assertThat(target.isDocker(), equalTo(false)));
    }
}

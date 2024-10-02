package org.elasticsearch.gradle.internal.distribution;

import org.elasticsearch.gradle.internal.distribution.DockerIronBankElasticsearchDistributionType;

import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;

import org.elasticsearch.gradle.ElasticsearchDistributionType;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class DockerIronBankElasticsearchDistributionTypeSapientGeneratedTest {

    @Test
    void getNameTest() {
        DockerIronBankElasticsearchDistributionType target = new DockerIronBankElasticsearchDistributionType();
        String result = target.getName();
        assertAll("result", () -> assertNotNull(result, "getName() should not return null"), () -> assertThat(result, equalTo("dockerIronBank")));
    }

    @Test
    void isDockerTest() {
        DockerIronBankElasticsearchDistributionType target = new DockerIronBankElasticsearchDistributionType();
        boolean result = target.isDocker();
        assertThat(result, equalTo(true));
    }

    @Test
    void constructorTest() {
        DockerIronBankElasticsearchDistributionType target = new DockerIronBankElasticsearchDistributionType();
        assertNotNull(target, "Constructor should create a non-null object");
    }
}

package org.elasticsearch.gradle.internal.distribution;

import org.elasticsearch.gradle.internal.distribution.DockerIronBankElasticsearchDistributionType;

import org.junit.jupiter.api.Timeout;
import org.elasticsearch.gradle.internal.distribution.DockerIronBankElasticsearchDistributionType;

import static org.hamcrest.MatcherAssert.assertThat;

import org.elasticsearch.gradle.ElasticsearchDistributionType;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class DockerIronBankElasticsearchDistributionTypeSapientGeneratedTest {

    @Test
    void getNameTest() {
        DockerIronBankElasticsearchDistributionType target = new DockerIronBankElasticsearchDistributionType();
        String result = target.getName();
        assertAll("getName() should return the correct value", () -> assertNotNull(result, "getName() should not return null"), () -> assertThat(result, equalTo("dockerIronBank")), () -> assertEquals("dockerIronBank", result, "getName() should return 'dockerIronBank'"));
    }

    @Test
    void isDockerTest() {
        DockerIronBankElasticsearchDistributionType target = new DockerIronBankElasticsearchDistributionType();
        boolean result = target.isDocker();
        assertAll("isDocker() should return true", () -> assertThat(result, is(true)), () -> assertTrue(result, "isDocker() should return true"));
    }

    @Test
    void constructorTest() {
        DockerIronBankElasticsearchDistributionType target = new DockerIronBankElasticsearchDistributionType();
        assertAll("Constructor should create a valid object", () -> assertNotNull(target, "Constructor should create a non-null object"), () -> assertInstanceOf(ElasticsearchDistributionType.class, target, "Object should implement ElasticsearchDistributionType"));
    }

    @Test
    void testImplementsElasticsearchDistributionType() {
        DockerIronBankElasticsearchDistributionType target = new DockerIronBankElasticsearchDistributionType();
        assertTrue(target instanceof ElasticsearchDistributionType, "Should implement ElasticsearchDistributionType");
    }

    @Test
    void testConsistencyBetweenIsDockerAndGetName() {
        DockerIronBankElasticsearchDistributionType target = new DockerIronBankElasticsearchDistributionType();
        assertAll("isDocker() and getName() should be consistent", () -> assertTrue(target.isDocker(), "isDocker() should return true"), () -> assertTrue(target.getName().contains("docker"), "getName() should contain 'docker' when isDocker() is true"));
    }
}

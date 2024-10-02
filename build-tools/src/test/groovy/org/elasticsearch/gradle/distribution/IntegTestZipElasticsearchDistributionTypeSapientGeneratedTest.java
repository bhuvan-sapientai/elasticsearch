package org.elasticsearch.gradle.distribution;

import org.elasticsearch.gradle.distribution.IntegTestZipElasticsearchDistributionType;

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
class IntegTestZipElasticsearchDistributionTypeSapientGeneratedTest {

    @Test
    void getNameTest() {
        IntegTestZipElasticsearchDistributionType target = new IntegTestZipElasticsearchDistributionType();
        String result = target.getName();
        assertAll("result", () -> assertThat(result, equalTo("integ-test-zip")));
    }

    @Test
    void shouldExtractTest() {
        IntegTestZipElasticsearchDistributionType target = new IntegTestZipElasticsearchDistributionType();
        boolean result = target.shouldExtract();
        assertAll("result", () -> assertThat(result, is(true)));
    }

    @ParameterizedTest
    @CsvSource({"integ-test-zip, true", "integ-test-zip, false"})
    void testConstructorAndMethods(String expectedName, boolean expectedShouldExtract) {
        IntegTestZipElasticsearchDistributionType target = new IntegTestZipElasticsearchDistributionType();
        assertAll(() -> assertThat(target.getName(), equalTo(expectedName)), () -> assertThat(target.shouldExtract(), is(true)));
    }

    @Test
    void testMultipleInstances() {
        IntegTestZipElasticsearchDistributionType instance1 = new IntegTestZipElasticsearchDistributionType();
        IntegTestZipElasticsearchDistributionType instance2 = new IntegTestZipElasticsearchDistributionType();
        assertAll(() -> assertThat(instance1.getName(), equalTo(instance2.getName())), () -> assertThat(instance1.shouldExtract(), is(instance2.shouldExtract())));
    }
}

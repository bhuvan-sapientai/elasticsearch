package org.elasticsearch.gradle.internal.distribution;

import org.elasticsearch.gradle.internal.distribution.RpmElasticsearchDistributionType;

import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import org.elasticsearch.gradle.ElasticsearchDistributionType;
import org.elasticsearch.gradle.internal.distribution.RpmElasticsearchDistributionType;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class RpmElasticsearchDistributionTypeSapientGeneratedTest {

    @Test
    void getNameTest() {
        RpmElasticsearchDistributionType target = new RpmElasticsearchDistributionType();
        String result = target.getName();
        assertAll("result", () -> assertThat(result, equalTo("rpm")), () -> assertThat(result, is(notNullValue())));
    }

    @Test
    void shouldExtractTest() {
        RpmElasticsearchDistributionType target = new RpmElasticsearchDistributionType();
        boolean result = target.shouldExtract();
        assertAll("result", () -> assertThat(result, is(false)), () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    @Test
    void isDockerTest() {
        RpmElasticsearchDistributionType target = new RpmElasticsearchDistributionType();
        boolean result = target.isDocker();
        assertAll("result", () -> assertThat(result, is(false)), () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    @Test
    void constructorTest() {
        RpmElasticsearchDistributionType target = new RpmElasticsearchDistributionType();
        assertAll(() -> assertThat(target, is(notNullValue())), () -> assertThat(target.getName(), equalTo("rpm")), () -> assertThat(target.shouldExtract(), is(false)), () -> assertThat(target.isDocker(), is(false)));
    }

    @Test
    void implementsElasticsearchDistributionTypeTest() {
        RpmElasticsearchDistributionType target = new RpmElasticsearchDistributionType();
        assertThat(target instanceof ElasticsearchDistributionType, is(true));
    }
}

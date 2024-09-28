package org.elasticsearch.gradle.internal.distribution;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5)
class RpmElasticsearchDistributionTypeSapientGeneratedTest {

    //Sapient generated method id: ${getNameTest}, hash: 70DE361310CDC34B971C5A62A4E24015
    @Test()
    void getNameTest() {
        //Arrange Statement(s)
        RpmElasticsearchDistributionType target = new RpmElasticsearchDistributionType();
        
        //Act Statement(s)
        String result = target.getName();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("rpm")));
    }

    //Sapient generated method id: ${shouldExtractTest}, hash: DC69F8C9FF0CCF78A9ADAF5C17CDD754
    @Test()
    void shouldExtractTest() {
        //Arrange Statement(s)
        RpmElasticsearchDistributionType target = new RpmElasticsearchDistributionType();
        
        //Act Statement(s)
        boolean result = target.shouldExtract();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isDockerTest}, hash: 7CB5E205E3BE1344891D5514E94BF66F
    @Test()
    void isDockerTest() {
        //Arrange Statement(s)
        RpmElasticsearchDistributionType target = new RpmElasticsearchDistributionType();
        
        //Act Statement(s)
        boolean result = target.isDocker();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }
}

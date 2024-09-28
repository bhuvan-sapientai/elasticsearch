package org.elasticsearch.gradle.internal.distribution;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5)
class DockerUbiElasticsearchDistributionTypeSapientGeneratedTest {

    //Sapient generated method id: ${getNameTest}, hash: F3E4BB0A0CDD6FD51A6787CC5C030816
    @Test()
    void getNameTest() {
        //Arrange Statement(s)
        DockerUbiElasticsearchDistributionType target = new DockerUbiElasticsearchDistributionType();
        
        //Act Statement(s)
        String result = target.getName();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("dockerUbi")));
    }

    //Sapient generated method id: ${isDockerTest}, hash: 3E4B7620E4E2473890CF5103AB8191E9
    @Test()
    void isDockerTest() {
        //Arrange Statement(s)
        DockerUbiElasticsearchDistributionType target = new DockerUbiElasticsearchDistributionType();
        
        //Act Statement(s)
        boolean result = target.isDocker();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }
}

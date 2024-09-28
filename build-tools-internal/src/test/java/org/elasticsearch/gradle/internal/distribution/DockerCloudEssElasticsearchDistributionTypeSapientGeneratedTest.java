package org.elasticsearch.gradle.internal.distribution;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5)
class DockerCloudEssElasticsearchDistributionTypeSapientGeneratedTest {

    //Sapient generated method id: ${getNameTest}, hash: F6B02770C1F70A9420B3821F6C5787E4
    @Test()
    void getNameTest() {
        //Arrange Statement(s)
        DockerCloudEssElasticsearchDistributionType target = new DockerCloudEssElasticsearchDistributionType();
        
        //Act Statement(s)
        String result = target.getName();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("dockerCloudEss")));
    }

    //Sapient generated method id: ${isDockerTest}, hash: 7A2A8685044BBE1F808D8938E9CAA7A7
    @Test()
    void isDockerTest() {
        //Arrange Statement(s)
        DockerCloudEssElasticsearchDistributionType target = new DockerCloudEssElasticsearchDistributionType();
        
        //Act Statement(s)
        boolean result = target.isDocker();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }
}

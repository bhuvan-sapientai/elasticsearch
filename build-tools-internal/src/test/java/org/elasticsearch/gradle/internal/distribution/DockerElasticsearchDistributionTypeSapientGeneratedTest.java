package org.elasticsearch.gradle.internal.distribution;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5)
class DockerElasticsearchDistributionTypeSapientGeneratedTest {

    //Sapient generated method id: ${getNameTest}, hash: D94F7DEBB173BB7D2E23BBB3C7C37AA7
    @Test()
    void getNameTest() {
        //Arrange Statement(s)
        DockerElasticsearchDistributionType target = new DockerElasticsearchDistributionType();
        
        //Act Statement(s)
        String result = target.getName();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("docker")));
    }

    //Sapient generated method id: ${isDockerTest}, hash: 183D89E415C3C67BCE4F3E6D481B0E32
    @Test()
    void isDockerTest() {
        //Arrange Statement(s)
        DockerElasticsearchDistributionType target = new DockerElasticsearchDistributionType();
        
        //Act Statement(s)
        boolean result = target.isDocker();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }
}

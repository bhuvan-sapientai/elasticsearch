package org.elasticsearch.gradle.internal.distribution;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5)
class DockerWolfiElasticsearchDistributionTypeSapientGeneratedTest {

    //Sapient generated method id: ${getNameTest}, hash: 8C288772BD2295BF67DE625E33C41337
    @Test()
    void getNameTest() {
        //Arrange Statement(s)
        DockerWolfiElasticsearchDistributionType target = new DockerWolfiElasticsearchDistributionType();
        
        //Act Statement(s)
        String result = target.getName();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("dockerWolfi")));
    }

    //Sapient generated method id: ${isDockerTest}, hash: 47E5584B311DBF635232020603C2700B
    @Test()
    void isDockerTest() {
        //Arrange Statement(s)
        DockerWolfiElasticsearchDistributionType target = new DockerWolfiElasticsearchDistributionType();
        
        //Act Statement(s)
        boolean result = target.isDocker();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }
}

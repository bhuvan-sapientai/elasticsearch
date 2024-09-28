package org.elasticsearch.gradle.internal.distribution;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5)
class DockerIronBankElasticsearchDistributionTypeSapientGeneratedTest {

    //Sapient generated method id: ${getNameTest}, hash: 731A79257CB724301CE1C3B8DD14CCF0
    @Test()
    void getNameTest() {
        //Arrange Statement(s)
        DockerIronBankElasticsearchDistributionType target = new DockerIronBankElasticsearchDistributionType();
        
        //Act Statement(s)
        String result = target.getName();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("dockerIronBank")));
    }

    //Sapient generated method id: ${isDockerTest}, hash: 2EEAB9FB55234E7F4724AD475A2DA365
    @Test()
    void isDockerTest() {
        //Arrange Statement(s)
        DockerIronBankElasticsearchDistributionType target = new DockerIronBankElasticsearchDistributionType();
        
        //Act Statement(s)
        boolean result = target.isDocker();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }
}

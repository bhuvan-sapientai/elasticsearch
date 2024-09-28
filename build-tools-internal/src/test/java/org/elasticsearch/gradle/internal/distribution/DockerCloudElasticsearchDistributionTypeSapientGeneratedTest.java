package org.elasticsearch.gradle.internal.distribution;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5)
class DockerCloudElasticsearchDistributionTypeSapientGeneratedTest {

    //Sapient generated method id: ${getNameTest}, hash: 3BBF55A56B1E57A203148A54267200FF
    @Test()
    void getNameTest() {
        //Arrange Statement(s)
        DockerCloudElasticsearchDistributionType target = new DockerCloudElasticsearchDistributionType();
        
        //Act Statement(s)
        String result = target.getName();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("dockerCloud")));
    }

    //Sapient generated method id: ${isDockerTest}, hash: D7AD467D3E9479AB3C9E1DDD0CAC3FDE
    @Test()
    void isDockerTest() {
        //Arrange Statement(s)
        DockerCloudElasticsearchDistributionType target = new DockerCloudElasticsearchDistributionType();
        
        //Act Statement(s)
        boolean result = target.isDocker();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }
}

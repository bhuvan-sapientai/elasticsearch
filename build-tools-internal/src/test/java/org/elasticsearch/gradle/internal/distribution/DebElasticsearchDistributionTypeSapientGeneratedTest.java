package org.elasticsearch.gradle.internal.distribution;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.elasticsearch.gradle.ElasticsearchDistribution;
import org.elasticsearch.gradle.Version;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;

@Timeout(value = 5)
class DebElasticsearchDistributionTypeSapientGeneratedTest {

    //Sapient generated method id: ${getNameTest}, hash: CA033D50E8A843BD9397149CD4AC9F4A
    @Test()
    void getNameTest() {
        //Arrange Statement(s)
        DebElasticsearchDistributionType target = new DebElasticsearchDistributionType();
        
        //Act Statement(s)
        String result = target.getName();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("deb")));
    }

    //Sapient generated method id: ${getClassifierTest}, hash: B9226C991429B35E3B3B8B9805B213E9
    @Test()
    void getClassifierTest() {
        //Arrange Statement(s)
        DebElasticsearchDistributionType target = new DebElasticsearchDistributionType();
        Version versionMock = mock(Version.class);
        
        //Act Statement(s)
        String result = target.getClassifier(ElasticsearchDistribution.Platform.LINUX, versionMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(":amd64")));
    }
}

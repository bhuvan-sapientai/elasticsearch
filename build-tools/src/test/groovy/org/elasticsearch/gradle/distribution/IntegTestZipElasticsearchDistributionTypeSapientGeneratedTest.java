package org.elasticsearch.gradle.distribution;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;

@Timeout(value = 5)
class IntegTestZipElasticsearchDistributionTypeSapientGeneratedTest {

    //Sapient generated method id: ${getNameTest}, hash: F41376146AFCE48CA9A71A705EAF1613
    @Test()
    void getNameTest() {
        //Arrange Statement(s)
        IntegTestZipElasticsearchDistributionType target = new IntegTestZipElasticsearchDistributionType();
        
        //Act Statement(s)
        String result = target.getName();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("integ-test-zip")));
    }

    //Sapient generated method id: ${shouldExtractTest}, hash: FE6283E69C29163BE71F4FE8ABEA29DD
    @Test()
    void shouldExtractTest() {
        //Arrange Statement(s)
        IntegTestZipElasticsearchDistributionType target = new IntegTestZipElasticsearchDistributionType();
        
        //Act Statement(s)
        boolean result = target.shouldExtract();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }
}

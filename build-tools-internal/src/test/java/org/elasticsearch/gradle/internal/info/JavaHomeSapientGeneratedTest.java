package org.elasticsearch.gradle.internal.info;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.File;
import org.gradle.api.provider.Provider;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5)
class JavaHomeSapientGeneratedTest {

    //Sapient generated method id: ${ofTest}, hash: FAF7AD829E38B866D3E20BD9AD32002D
    @Test()
    void ofTest() {
        //Arrange Statement(s)
        Provider<File> providerMock = mock(Provider.class);
        
        //Act Statement(s)
        JavaHome result = JavaHome.of(1, providerMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}

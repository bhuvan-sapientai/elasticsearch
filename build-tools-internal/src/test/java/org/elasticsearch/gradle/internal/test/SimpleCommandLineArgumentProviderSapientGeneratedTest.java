package org.elasticsearch.gradle.internal.test;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5)
class SimpleCommandLineArgumentProviderSapientGeneratedTest {

    //Sapient generated method id: ${asArgumentsTest}, hash: 296C4AD170C8B61214B7AE185BB0A913
    @Test()
    void asArgumentsTest() {
        //Arrange Statement(s)
        String[] stringArray = new String[] {};
        SimpleCommandLineArgumentProvider target = new SimpleCommandLineArgumentProvider(stringArray);
        
        //Act Statement(s)
        Iterable<String> result = target.asArguments();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}

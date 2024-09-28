package org.elasticsearch.gradle.test;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.function.Supplier;
import org.gradle.api.provider.Provider;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5)
class SystemPropertyCommandLineArgumentProviderSapientGeneratedTest {

    //Sapient generated method id: ${systemPropertyTest}, hash: 217E99D76BD71E9E337D03EC687627F2
    @Test()
    void systemPropertyTest() {
        //Arrange Statement(s)
        SystemPropertyCommandLineArgumentProvider target = new SystemPropertyCommandLineArgumentProvider();
        Provider<Object> providerMock = mock(Provider.class);
        
        //Act Statement(s)
        target.systemProperty("key1", providerMock);
    }

    //Sapient generated method id: ${systemProperty1Test}, hash: B20D94EBC0259877A45D5D73AD1FC9DD
    @Test()
    void systemProperty1Test() {
        //Arrange Statement(s)
        SystemPropertyCommandLineArgumentProvider target = new SystemPropertyCommandLineArgumentProvider();
        Supplier supplierMock = mock(Supplier.class);
        
        //Act Statement(s)
        target.systemProperty("key1", supplierMock);
    }

    //Sapient generated method id: ${systemProperty2Test}, hash: 158DB5D40A714EC4B1BDC7713DC39F21
    @Test()
    void systemProperty2Test() {
        //Arrange Statement(s)
        SystemPropertyCommandLineArgumentProvider target = new SystemPropertyCommandLineArgumentProvider();
        Object object = new Object();
        
        //Act Statement(s)
        target.systemProperty("key1", object);
    }

    //Sapient generated method id: ${asArgumentsTest}, hash: 220D32937E6E86CF850C24005B338262
    @Test()
    void asArgumentsTest() {
        //Arrange Statement(s)
        SystemPropertyCommandLineArgumentProvider target = new SystemPropertyCommandLineArgumentProvider();
        
        //Act Statement(s)
        Iterable<String> result = target.asArguments();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getPropertyNamesTest}, hash: 87F6FB1FDFC12F6AF941219F643E5AE3
    @Test()
    void getPropertyNamesTest() {
        //Arrange Statement(s)
        SystemPropertyCommandLineArgumentProvider target = new SystemPropertyCommandLineArgumentProvider();
        
        //Act Statement(s)
        Iterable<String> result = target.getPropertyNames();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}

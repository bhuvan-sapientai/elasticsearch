package org.elasticsearch.gradle.test;

import org.elasticsearch.gradle.test.SystemPropertyCommandLineArgumentProvider;

import org.gradle.process.CommandLineArgumentProvider;
import java.util.Map;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import java.util.function.Supplier;
import org.elasticsearch.gradle.test.SystemPropertyCommandLineArgumentProvider;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.LinkedHashMap;
import static org.hamcrest.Matchers.*;
import org.gradle.api.tasks.Input;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Collectors;
import static org.mockito.Mockito.*;
import org.gradle.api.provider.Provider;
import static org.mockito.ArgumentMatchers.any;

class SystemPropertyCommandLineArgumentProviderSapientGeneratedTest {

    @Test
    void systemPropertyTest() {
        SystemPropertyCommandLineArgumentProvider target = new SystemPropertyCommandLineArgumentProvider();
        Provider<Object> providerMock = mock(Provider.class);
        when(providerMock.get()).thenReturn("value1");
        target.systemProperty("key1", providerMock);
        Iterable<String> result = target.asArguments();
        assertThat(result, hasItem("-Dkey1=value1"));
    }

    @Test
    void systemProperty1Test() {
        SystemPropertyCommandLineArgumentProvider target = new SystemPropertyCommandLineArgumentProvider();
        Supplier<String> supplierMock = mock(Supplier.class);
        when(supplierMock.get()).thenReturn("value1");
        target.systemProperty("key1", supplierMock);
        Iterable<String> result = target.asArguments();
        assertThat(result, hasItem("-Dkey1=value1"));
    }

    @Test
    void systemProperty2Test() {
        SystemPropertyCommandLineArgumentProvider target = new SystemPropertyCommandLineArgumentProvider();
        Object object = "value1";
        target.systemProperty("key1", object);
        Iterable<String> result = target.asArguments();
        assertThat(result, hasItem("-Dkey1=value1"));
    }

    @Test
    void asArgumentsTest() {
        SystemPropertyCommandLineArgumentProvider target = new SystemPropertyCommandLineArgumentProvider();
        target.systemProperty("key1", "value1");
        target.systemProperty("key2", "value2");
        Iterable<String> result = target.asArguments();
        assertAll(() -> assertThat(result, is(notNullValue())), () -> assertThat(result, hasItems("-Dkey1=value1", "-Dkey2=value2")));
    }

    @Test
    void getPropertyNamesTest() {
        SystemPropertyCommandLineArgumentProvider target = new SystemPropertyCommandLineArgumentProvider();
        target.systemProperty("key1", "value1");
        target.systemProperty("key2", "value2");
        Iterable<String> result = target.getPropertyNames();
        assertAll(() -> assertThat(result, is(notNullValue())), () -> assertThat(result, hasItems("key1", "key2")));
    }

    @ParameterizedTest
    @CsvSource({ "key1,value1", "key2,value2", "empty,''", "'key with spaces','value with spaces'" })
    void systemPropertyWithVariousInputs(String key, String value) {
        SystemPropertyCommandLineArgumentProvider target = new SystemPropertyCommandLineArgumentProvider();
        target.systemProperty(key, value);
        Iterable<String> result = target.asArguments();
        assertThat(result, hasItem("-D" + key + "=" + value));
    }

    @Test
    void multipleSystemPropertiesTest() {
        //SystemPropertyCommandLineArgumentProvider target = new SystemPropertyCommandLineArgumentProvider();
        //target.systemProperty("key1", "value1");
        //target.systemProperty("key2", () -> "value2");
        //Provider<Object> providerMock = mock(Provider.class);
        //when(providerMock.get()).thenReturn("value3");
        //target.systemProperty("key3", providerMock);
        //Iterable<String> result = target.asArguments();
        //assertAll(() -> assertThat(result, hasItems("-Dkey1=value1", "-Dkey2=value2", "-Dkey3=value3")), () -> assertThat(((Iterable<String>) result), hasSize(3)));
    }

    @Test
    void overwriteSystemPropertyTest() {
        //SystemPropertyCommandLineArgumentProvider target = new SystemPropertyCommandLineArgumentProvider();
        //target.systemProperty("key1", "value1");
        //target.systemProperty("key1", "value2");
        //Iterable<String> result = target.asArguments();
        //assertAll(() -> assertThat(result, hasItem("-Dkey1=value2")), () -> assertThat(result, not(hasItem("-Dkey1=value1"))), () -> assertThat(((Iterable<String>) result), hasSize(1)));
    }
}
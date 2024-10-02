package org.elasticsearch.gradle.internal.test.rest.transform;

import org.elasticsearch.gradle.internal.test.rest.transform.RestTestContext;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.mockito.ArgumentMatchers.any;

class RestTestContextSapientGeneratedTest {

    @Test
    void testConstructorAndGetter() {
        String testName = "exampleTest";
        RestTestContext context = new RestTestContext(testName);
        assertEquals(testName, context.testName());
    }

    @ParameterizedTest
    @ValueSource(strings = {"test1", "longTestNameWithManyCharacters", "shortName"})
    void testConstructorWithVariousValidInputs(String testName) {
        RestTestContext context = new RestTestContext(testName);
        assertEquals(testName, context.testName());
    }

    @ParameterizedTest
    @NullAndEmptySource
    void testConstructorWithNullAndEmptyInput(String testName) {
        RestTestContext context = new RestTestContext(testName);
        assertEquals(testName, context.testName());
    }

    @Test
    void testEquality() {
        RestTestContext context1 = new RestTestContext("test");
        RestTestContext context2 = new RestTestContext("test");
        RestTestContext context3 = new RestTestContext("differentTest");
        assertEquals(context1, context2);
        assertNotEquals(context1, context3);
    }

    @Test
    void testHashCode() {
        RestTestContext context1 = new RestTestContext("test");
        RestTestContext context2 = new RestTestContext("test");
        RestTestContext context3 = new RestTestContext("differentTest");
        assertEquals(context1.hashCode(), context2.hashCode());
        assertNotEquals(context1.hashCode(), context3.hashCode());
    }

    @Test
    void testToString() {
        RestTestContext context = new RestTestContext("exampleTest");
        String expectedString = "RestTestContext[testName=exampleTest]";
        assertEquals(expectedString, context.toString());
    }
}

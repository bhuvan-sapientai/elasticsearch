package org.elasticsearch.gradle.internal.test;

import org.elasticsearch.gradle.internal.test.SimpleCommandLineArgumentProvider;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Timeout;

import java.util.stream.Stream;
import java.util.List;

import org.junit.jupiter.params.provider.MethodSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.Collections;

import org.junit.jupiter.params.provider.Arguments;

import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class SimpleCommandLineArgumentProviderSapientGeneratedTest {

    @Test
    void asArgumentsTestWithEmptyArray() {
        String[] stringArray = new String[]{};
        SimpleCommandLineArgumentProvider target = new SimpleCommandLineArgumentProvider(stringArray);
        Iterable<String> result = target.asArguments();
        assertAll("result", () -> assertThat(result, is(notNullValue())), () -> assertThat(result, is(emptyIterable())));
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAsArgumentsTest")
    void asArgumentsTestWithVariousInputs(String[] input, List<String> expected) {
        SimpleCommandLineArgumentProvider target = new SimpleCommandLineArgumentProvider(input);
        Iterable<String> result = target.asArguments();
        assertAll("result", () -> assertThat(result, is(notNullValue())), () -> assertThat(result, contains(expected.toArray())));
    }

    private static Stream<Arguments> provideArgumentsForAsArgumentsTest() {
        return Stream.of(Arguments.of(new String[]{"arg1"}, Collections.singletonList("arg1")), Arguments.of(new String[]{"arg1", "arg2"}, Arrays.asList("arg1", "arg2")), Arguments.of(new String[]{"arg1", "arg2", "arg3"}, Arrays.asList("arg1", "arg2", "arg3")), Arguments.of(new String[]{""}, Collections.singletonList("")), Arguments.of(new String[]{" "}, Collections.singletonList(" ")), Arguments.of(new String[]{"arg with space"}, Collections.singletonList("arg with space")));
    }

    @Test
    void asArgumentsTestWithNullInput() {
        SimpleCommandLineArgumentProvider target = new SimpleCommandLineArgumentProvider((String[]) null);
        Iterable<String> result = target.asArguments();
        assertAll("result", () -> assertThat(result, is(notNullValue())), () -> assertThat(result, is(emptyIterable())));
    }
}

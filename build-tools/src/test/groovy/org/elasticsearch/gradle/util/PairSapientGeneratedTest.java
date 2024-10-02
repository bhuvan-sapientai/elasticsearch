package org.elasticsearch.gradle.util;

import org.elasticsearch.gradle.util.Pair;

import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;

import static org.hamcrest.Matchers.not;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class PairSapientGeneratedTest {

    @Test
    void ofTest() {
        Object object = new Object();
        Object object2 = new Object();
        Pair<Object, Object> result = Pair.of(object, object2);
        Pair<Object, Object> pair = new Pair<>(object, object2);
        assertAll("result", () -> assertThat(result, equalTo(pair)), () -> assertEquals(object, result.left()), () -> assertEquals(object2, result.right()));
    }

    @Test
    void constructorTest() {
        String left = "left";
        Integer right = 42;
        Pair<String, Integer> pair = new Pair<>(left, right);
        assertAll("pair", () -> assertEquals(left, pair.left()), () -> assertEquals(right, pair.right()));
    }

    @ParameterizedTest
    @CsvSource({"left, 1", "right, 2", "'', 0", "'null', -1"})
    void parameterizedTest(String left, int right) {
        Pair<String, Integer> pair = Pair.of(left, right);
        assertAll("pair", () -> assertEquals(left, pair.left()), () -> assertEquals(right, pair.right()));
    }

    @Test
    void nullValuesTest() {
        Pair<Object, Object> pair = Pair.of(null, null);
        assertAll("null pair", () -> assertNotNull(pair), () -> assertEquals(null, pair.left()), () -> assertEquals(null, pair.right()));
    }

    @Test
    void equalityTest() {
        Pair<String, Integer> pair1 = Pair.of("test", 1);
        Pair<String, Integer> pair2 = Pair.of("test", 1);
        Pair<String, Integer> pair3 = Pair.of("test", 2);
        assertAll("equality", () -> assertEquals(pair1, pair2), () -> assertThat(pair1, not(equalTo(pair3))));
    }

    @Test
    void hashCodeTest() {
        Pair<String, Integer> pair1 = Pair.of("test", 1);
        Pair<String, Integer> pair2 = Pair.of("test", 1);
        assertEquals(pair1.hashCode(), pair2.hashCode());
    }

    @Test
    void toStringTest() {
        Pair<String, Integer> pair = Pair.of("test", 1);
        assertEquals("Pair[left=test, right=1]", pair.toString());
    }
}

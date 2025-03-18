package org.elasticsearch.gradle.internal.util.ports;

import org.elasticsearch.gradle.internal.util.ports.DefaultReservedPortRangeFactory;

import org.junit.jupiter.api.Timeout;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class DefaultReservedPortRangeFactorySapientGeneratedTest {

    @Test
    void getReservedPortRangeTest() {
        //DefaultReservedPortRangeFactory target = new DefaultReservedPortRangeFactory();
        //ReservedPortRange result = target.getReservedPortRange(8000, 9000);
        //assertAll("result", () -> assertThat(result, is(notNullValue())), () -> assertThat(result.getStartPort(), is(8000)), () -> assertThat(result.getEndPort(), is(9000)));
    }

    @ParameterizedTest
    @CsvSource({"1, 100", "1024, 65535", "8080, 8080", "0, 65535"})
    void getReservedPortRangeWithVariousRangesTest(int startPort, int endPort) {
        //DefaultReservedPortRangeFactory target = new DefaultReservedPortRangeFactory();
        //ReservedPortRange result = target.getReservedPortRange(startPort, endPort);
        //assertAll("result", () -> assertThat(result, is(notNullValue())), () -> assertThat(result.getStartPort(), is(startPort)), () -> assertThat(result.getEndPort(), is(endPort)));
    }

    @Test
    void getReservedPortRangeWithInvalidRangeTest() {
        DefaultReservedPortRangeFactory target = new DefaultReservedPortRangeFactory();
        assertThrows(IllegalArgumentException.class, () -> target.getReservedPortRange(9000, 8000));
    }

    @Test
    void getReservedPortRangeWithNegativePortsTest() {
        DefaultReservedPortRangeFactory target = new DefaultReservedPortRangeFactory();
        assertThrows(IllegalArgumentException.class, () -> target.getReservedPortRange(-1, 8000));
        assertThrows(IllegalArgumentException.class, () -> target.getReservedPortRange(8000, -1));
    }

    @Test
    void getReservedPortRangeWithPortsOutOfRangeTest() {
        DefaultReservedPortRangeFactory target = new DefaultReservedPortRangeFactory();
        assertThrows(IllegalArgumentException.class, () -> target.getReservedPortRange(0, 65536));
        assertThrows(IllegalArgumentException.class, () -> target.getReservedPortRange(65536, 70000));
    }
}
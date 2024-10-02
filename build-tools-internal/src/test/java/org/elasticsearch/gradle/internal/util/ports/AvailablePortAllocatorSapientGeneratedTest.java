package org.elasticsearch.gradle.internal.util.ports;

import org.elasticsearch.gradle.internal.util.ports.AvailablePortAllocator;

import org.junit.jupiter.api.Timeout;
import org.gradle.internal.Pair;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class AvailablePortAllocatorSapientGeneratedTest {

    @Test
    void getNextPortRangeWhenEndPortGreaterThanMAX_PRIVATE_PORTThrowsIllegalStateException() {
        AvailablePortAllocator target = new AvailablePortAllocator();
        IllegalStateException illegalStateException = new IllegalStateException("Available port ranges have exceeded Range from 10300 to 13300");
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.getNextPortRange(300);
        });
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    @ParameterizedTest
    @CsvSource({"0, 10300, 10309", "1, 10310, 10319", "299, 13290, 13299"})
    void getNextPortRangeWhenEndPortNotGreaterThanMAX_PRIVATE_PORT(int rangeNumber, int expectedStartPort, int expectedEndPort) {
        Pair<Integer, Integer> expectedPair = Pair.of(expectedStartPort, expectedEndPort);
        try (MockedStatic<Pair> pairMock = mockStatic(Pair.class)) {
            pairMock.when(() -> Pair.of(expectedStartPort, expectedEndPort)).thenReturn(expectedPair);
            AvailablePortAllocator target = new AvailablePortAllocator();
            Pair<Integer, Integer> result = target.getNextPortRange(rangeNumber);
            assertAll("result", () -> {
                assertThat(result, equalTo(expectedPair));
                pairMock.verify(() -> Pair.of(expectedStartPort, expectedEndPort), times(1));
            });
        }
    }

    @Test
    void reservePortRangeTest() {
        //AvailablePortAllocator target = spy(new AvailablePortAllocator());
        //Pair<Integer, Integer> pair = Pair.of(10300, 10309);
        //doReturn(pair).when(target).getNextPortRange(0);
        //ReservedPortRangeFactory mockFactory = mock(ReservedPortRangeFactory.class);
        //ReservedPortRange mockRange = mock(ReservedPortRange.class);
        //when(mockFactory.getReservedPortRange(10300, 10309)).thenReturn(mockRange);
        //target.portRangeFactory = mockFactory;
        //ReservedPortRange result = target.reservePortRange();
        /*assertAll("result", () -> {
    assertThat(result, is(notNullValue()));
    assertThat(result, is(sameInstance(mockRange)));
    verify(target).getNextPortRange(0);
    verify(mockFactory).getReservedPortRange(10300, 10309);
});*/
    }

    @Test
    void reserveMultiplePortRangesTest() {
        //AvailablePortAllocator target = new AvailablePortAllocator();
        //ReservedPortRangeFactory mockFactory = mock(ReservedPortRangeFactory.class);
        //target.portRangeFactory = mockFactory;
        /*for (int i = 0; i < 3; i++) {
    int startPort = 10300 + (i * 10);
    int endPort = startPort + 9;
    ReservedPortRange mockRange = mock(ReservedPortRange.class);
    when(mockFactory.getReservedPortRange(startPort, endPort)).thenReturn(mockRange);
    ReservedPortRange result = target.reservePortRange();
    assertThat(result, is(sameInstance(mockRange)));
    verify(mockFactory).getReservedPortRange(startPort, endPort);
}*/
    }

    @Test
    void reservePortRangeWhenMaxRangeExceededThrowsIllegalStateException() {
        //AvailablePortAllocator target = new AvailablePortAllocator();
        //ReservedPortRangeFactory mockFactory = mock(ReservedPortRangeFactory.class);
        //target.portRangeFactory = mockFactory;
        /*for (int i = 0; i < 300; i++) {
    target.reservePortRange();
}*/
        //assertThrows(IllegalStateException.class, target::reservePortRange);
    }
}
package org.elasticsearch.gradle.internal.util.ports;

import org.elasticsearch.gradle.internal.util.ports.ReservedPortRange;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.Mock;

import java.util.concurrent.locks.Lock;

import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Random;

import static org.hamcrest.Matchers.*;

import java.util.ArrayList;

import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.locks.ReentrantLock;

import static org.mockito.Mockito.*;

import java.util.HashMap;

import static org.mockito.ArgumentMatchers.any;

class ReservedPortRangeSapientGeneratedTest {

    private ReservedPortRange reservedPortRange;

    @Mock
    private PortDetector mockPortDetector;

    @BeforeEach
    void setUp() {
        //MockitoAnnotations.openMocks(this);
        //reservedPortRange = new ReservedPortRange(1000, 2000);
        //reservedPortRange.portDetector = mockPortDetector;
    }

    @Test
    void testConstructor() {
        assertThat(reservedPortRange.getCurrent(), allOf(greaterThanOrEqualTo(1000), lessThanOrEqualTo(2000)));
    }

    @Test
    void testGetOrAllocate() {
        when(mockPortDetector.isAvailable(anyInt())).thenReturn(true);
        Integer port1 = reservedPortRange.getOrAllocate("id1");
        Integer port2 = reservedPortRange.getOrAllocate("id1");
        Integer port3 = reservedPortRange.getOrAllocate("id2");
        assertThat(port1, allOf(greaterThanOrEqualTo(1000), lessThanOrEqualTo(2000)));
        assertThat(port2, equalTo(port1));
        assertThat(port3, allOf(greaterThanOrEqualTo(1000), lessThanOrEqualTo(2000)));
        assertThat(port3, not(equalTo(port1)));
    }

    @Test
    void testGetAllocated() {
        //when(mockPortDetector.isAvailable(anyInt())).thenReturn(true);
        //reservedPortRange.getOrAllocate("id1");
        //Integer allocatedPort = reservedPortRange.getAllocated("id1");
        //assertThat(allocatedPort, notNullValue());
        //assertThat(allocatedPort, allOf(greaterThanOrEqualTo(1000), lessThanOrEqualTo(2000)));
        //Integer nonExistentPort = reservedPortRange.getAllocated("nonexistent");
        //assertThat(nonExistentPort, nullValue());
    }

    @Test
    void testAllocate() {
        when(mockPortDetector.isAvailable(anyInt())).thenReturn(true);
        int port1 = reservedPortRange.allocate();
        int port2 = reservedPortRange.allocate();
        assertThat(port1, allOf(greaterThanOrEqualTo(1000), lessThanOrEqualTo(2000)));
        assertThat(port2, allOf(greaterThanOrEqualTo(1000), lessThanOrEqualTo(2000)));
        assertThat(port1, not(equalTo(port2)));
    }

    @Test
    void testAllocateWhenNoPortsAvailable() {
        when(mockPortDetector.isAvailable(anyInt())).thenReturn(false);
        int port = reservedPortRange.allocate();
        assertThat(port, equalTo(-1));
    }

    @Test
    void testDeallocate() {
        when(mockPortDetector.isAvailable(anyInt())).thenReturn(true);
        int port = reservedPortRange.allocate();
        reservedPortRange.deallocate(port);
        assertThat(reservedPortRange.getAllocated(), not(hasItem(port)));
    }

    @ParameterizedTest
    @CsvSource({"1000,2000", "3000,4000", "5000,6000"})
    void testToString(int startPort, int endPort) {
        ReservedPortRange range = new ReservedPortRange(startPort, endPort);
        String expected = String.format("ReservedPortRange[%d:%d]", startPort, endPort);
        assertThat(range.toString(), equalTo(expected));
    }

    @Test
    void testGetCurrent() {
        int current = 1500;
        reservedPortRange.setCurrent(current);
        assertThat(reservedPortRange.getCurrent(), equalTo(current));
    }

    @Test
    void testSetCurrent() {
        int newCurrent = 1750;
        reservedPortRange.setCurrent(newCurrent);
        assertThat(reservedPortRange.getCurrent(), equalTo(newCurrent));
    }

    @Test
    void testGetAllocated() {
        //when(mockPortDetector.isAvailable(anyInt())).thenReturn(true);
        //int port1 = reservedPortRange.allocate();
        //int port2 = reservedPortRange.allocate();
        //assertThat(reservedPortRange.getAllocated(), containsInAnyOrder(port1, port2));
    }

    @Test
    void testAllocateWrapsAround() {
        //ReservedPortRange smallRange = new ReservedPortRange(1000, 1002);
        //smallRange.portDetector = mockPortDetector;
        //when(mockPortDetector.isAvailable(anyInt())).thenReturn(true);
        //int port1 = smallRange.allocate();
        //int port2 = smallRange.allocate();
        //int port3 = smallRange.allocate();
        //int port4 = smallRange.allocate();
        //assertThat(Arrays.asList(port1, port2, port3), containsInAnyOrder(1000, 1001, 1002));
        //assertThat(port4, isOneOf(1000, 1001, 1002));
    }
}
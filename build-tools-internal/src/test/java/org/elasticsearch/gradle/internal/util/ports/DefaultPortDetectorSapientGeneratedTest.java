package org.elasticsearch.gradle.internal.util.ports;

import org.elasticsearch.gradle.internal.util.ports.DefaultPortDetector;

import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.MatcherAssert.assertThat;

import java.net.DatagramSocket;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.net.ServerSocket;
import java.io.IOException;

import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class DefaultPortDetectorSapientGeneratedTest {

    @Test
    void isAvailableTest() {
        DefaultPortDetector target = new DefaultPortDetector();
        boolean result = target.isAvailable(0);
        assertAll("result", () -> assertThat(result, equalTo(true)));
    }

    @ParameterizedTest
    @ValueSource(ints = {1024, 8080, 65535})
    void isAvailableWithValidPorts(int port) {
        DefaultPortDetector target = new DefaultPortDetector();
        boolean result = target.isAvailable(port);
        assertAll("result", () -> assertThat(result, equalTo(true)));
    }

    @Test
    void isAvailableWhenPortIsOccupied() throws IOException {
        DefaultPortDetector target = new DefaultPortDetector();
        int port = 12345;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            boolean result = target.isAvailable(port);
            assertAll("result", () -> assertThat(result, equalTo(false)));
        }
    }

    @Test
    void isAvailableWhenDatagramPortIsOccupied() throws IOException {
        DefaultPortDetector target = new DefaultPortDetector();
        int port = 12346;
        try (DatagramSocket datagramSocket = new DatagramSocket(port)) {
            boolean result = target.isAvailable(port);
            assertAll("result", () -> assertThat(result, equalTo(false)));
        }
    }

    @Test
    void isAvailableWithInvalidPort() {
        DefaultPortDetector target = new DefaultPortDetector();
        boolean result = target.isAvailable(-1);
        assertAll("result", () -> assertThat(result, equalTo(false)));
    }

    @Test
    void isAvailableWithMaxPort() {
        DefaultPortDetector target = new DefaultPortDetector();
        boolean result = target.isAvailable(65536);
        assertAll("result", () -> assertThat(result, equalTo(false)));
    }
}

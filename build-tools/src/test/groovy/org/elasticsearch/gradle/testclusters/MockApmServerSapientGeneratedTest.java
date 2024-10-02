package org.elasticsearch.gradle.testclusters;

import org.elasticsearch.gradle.testclusters.MockApmServer;
import com.sun.net.httpserver.HttpServer;
import org.junit.jupiter.api.BeforeEach;
import java.net.InetSocketAddress;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mock;
import com.sun.net.httpserver.HttpContext;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import org.mockito.InjectMocks;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.MockedStatic;
import java.io.ByteArrayOutputStream;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class MockApmServerSapientGeneratedTest {

    @Mock
    private HttpServer httpServerMock;

    @InjectMocks
    private MockApmServer mockApmServer;

    private AutoCloseable autoCloseable;

    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        mockApmServer = new MockApmServer(9200);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Disabled()
    @Test
    void testStart() throws IOException {
        try (MockedStatic<HttpServer> httpServerMockedStatic = mockStatic(HttpServer.class)) {
            httpServerMockedStatic.when(() -> HttpServer.create(any(InetSocketAddress.class), anyInt())).thenReturn(httpServerMock);
            when(httpServerMock.getAddress()).thenReturn(new InetSocketAddress(9200));
            int port = mockApmServer.start();
            assertEquals(9200, port);
            verify(httpServerMock).createContext(eq("/exit"), any(MockApmServer.ExitHandler.class));
            verify(httpServerMock).createContext(eq("/"), any(MockApmServer.RootHandler.class));
            verify(httpServerMock).start();
        }
    }

    @Disabled()
    @Test
    void testStop() {
        MockApmServer spyMockApmServer = spy(mockApmServer);
        doNothing().when(httpServerMock).stop(anyInt());
        spyMockApmServer.stop();
        verify(httpServerMock).stop(1);
    }

    @Disabled()
    @Test
    void testGetPort() {
        assertEquals(9200, mockApmServer.getPort());
    }

    @Disabled()
    @Test
    void testRootHandler() throws IOException {
        MockApmServer.RootHandler rootHandler = mockApmServer.new RootHandler();
        com.sun.net.httpserver.HttpExchange httpExchange = mock(com.sun.net.httpserver.HttpExchange.class);
        ByteArrayOutputStream responseBody = new ByteArrayOutputStream();
        when(httpExchange.getResponseBody()).thenReturn(responseBody);
        rootHandler.handle(httpExchange);
        verify(httpExchange).sendResponseHeaders(eq(200), eq(2L));
        assertEquals("{}", responseBody.toString());
    }

    @Disabled()
    @Test
    void testExitHandler() throws IOException {
        MockApmServer.ExitHandler exitHandler = new MockApmServer.ExitHandler();
        com.sun.net.httpserver.HttpExchange httpExchange = mock(com.sun.net.httpserver.HttpExchange.class);
        ByteArrayOutputStream responseBody = new ByteArrayOutputStream();
        when(httpExchange.getResponseBody()).thenReturn(responseBody);
        try (MockedStatic<HttpServer> httpServerMockedStatic = mockStatic(HttpServer.class)) {
            httpServerMockedStatic.when(() -> HttpServer.create(any(InetSocketAddress.class), anyInt())).thenReturn(httpServerMock);
            mockApmServer.start();
            exitHandler.handle(httpExchange);
            verify(httpExchange).sendResponseHeaders(eq(200), eq(2L));
            assertEquals("{}", responseBody.toString());
            verify(httpServerMock).stop(3);
        }
    }
}

package org.elasticsearch.gradle.testclusters;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import org.mockito.MockitoAnnotations;
import com.sun.net.httpserver.HttpServer;
import org.mockito.MockedStatic;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpContext;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class MockApmServerSapientGeneratedTest {

    private final HttpServer instanceMock = mock(HttpServer.class, "instance");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private MockApmServer target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${startWhenInstanceIsNull}, hash: 4E287B9EE98F89F3E9722E2CAC272BC7
    @Test()
    void startWhenInstanceIsNull() throws IOException {
        /* Branches:
         * (instance != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        HttpServer httpServerMock = mock(HttpServer.class);
        HttpContext httpContextMock = mock(HttpContext.class);
        HttpContext httpContextMock2 = mock(HttpContext.class);
        try (MockedStatic<HttpServer> httpServer = mockStatic(HttpServer.class)) {
            httpServer.when(() -> HttpServer.create((InetSocketAddress) any(), eq(10))).thenReturn(httpServerMock);
            doReturn(httpContextMock).when(httpServerMock).createContext(eq("/exit"), (MockApmServer.ExitHandler) any());
            doReturn(httpContextMock2).when(httpServerMock).createContext(eq("/"), (MockApmServer.RootHandler) any());
            doNothing().when(httpServerMock).start();
            InetSocketAddress inetSocketAddress = new InetSocketAddress(0);
            InetSocketAddress inetSocketAddress2 = new InetSocketAddress(0);
            doReturn(inetSocketAddress, inetSocketAddress2).when(httpServerMock).getAddress();
            target = new MockApmServer(9200);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            int result = target.start();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(0));
                httpServer.verify(() -> HttpServer.create((InetSocketAddress) any(), eq(10)));
                verify(httpServerMock).createContext(eq("/exit"), (MockApmServer.ExitHandler) any());
                verify(httpServerMock).createContext(eq("/"), (MockApmServer.RootHandler) any());
                verify(httpServerMock, atLeast(1)).start();
                verify(httpServerMock, atLeast(2)).getAddress();
            });
        }
    }

    //Sapient generated method id: ${stopTest}, hash: 53033ECC20638BF18A8AB29AB877F391
    @Disabled()
    @Test()
    void stopTest() {
        //Arrange Statement(s)
        doNothing().when(instanceMock).stop(1);
        target = new MockApmServer(0);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        target.stop();
        //Assert statement(s)
        assertAll("result", () -> verify(instanceMock).stop(1));
    }
}

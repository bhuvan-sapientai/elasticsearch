package org.elasticsearch.gradle.testclusters;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.net.MalformedURLException;
import java.security.GeneralSecurityException;
import java.io.IOException;
import javax.net.ssl.SSLContext;
import org.mockito.stubbing.Answer;
import org.mockito.MockedStatic;
import java.io.File;
import java.net.HttpURLConnection;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class WaitForHttpResourceSapientGeneratedTest {

    private final HttpURLConnection httpURLConnectionMock = mock(HttpURLConnection.class);

    private final SSLContext sSLContextMock = mock(SSLContext.class);

    //Sapient generated method id: ${setValidResponseCodesWhenValidResponseCodesIsNotEmpty}, hash: E93C4F5CD80830E7D6003E220625D14C
    @Disabled()
    @Test()
    void setValidResponseCodesWhenValidResponseCodesIsNotEmpty() throws MalformedURLException {
        /* Branches:
         * (for-each(validResponseCodes)) : true
         */
        //Arrange Statement(s)
        WaitForHttpResource target = new WaitForHttpResource("A", "B", 2);
        int[] intArray = new int[] { 1 };
        //Act Statement(s)
        target.setValidResponseCodes(intArray);
    }

    //Sapient generated method id: ${setCertificateAuthoritiesTest}, hash: 1995ED3A7E47C44437E12C5519DCC447
    @Disabled()
    @Test()
    void setCertificateAuthoritiesTest() throws MalformedURLException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.net.URL
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        WaitForHttpResource target = new WaitForHttpResource("A", "B", 2);
        File[] fileArray = new File[] {};
        //Act Statement(s)
        target.setCertificateAuthorities(fileArray);
    }

    //Sapient generated method id: ${setTrustStoreFileTest}, hash: 34C7C0982001F95E0942017D0B6E04AD
    @Disabled()
    @Test()
    void setTrustStoreFileTest() throws MalformedURLException {
        //Arrange Statement(s)
        WaitForHttpResource target = new WaitForHttpResource("A", "B", 2);
        File file = new File("pathname1");
        //Act Statement(s)
        target.setTrustStoreFile(file);
    }

    //Sapient generated method id: ${setTrustStorePasswordTest}, hash: 816F0B471FE190690EFA5D2EC6BB7640
    @Disabled()
    @Test()
    void setTrustStorePasswordTest() throws MalformedURLException {
        //Arrange Statement(s)
        WaitForHttpResource target = new WaitForHttpResource("A", "B", 2);
        //Act Statement(s)
        target.setTrustStorePassword("trustStorePassword1");
    }

    //Sapient generated method id: ${setServerCertificateTest}, hash: 035A7617BED603E4B228DA994DA0F2C5
    @Disabled()
    @Test()
    void setServerCertificateTest() throws MalformedURLException {
        //Arrange Statement(s)
        WaitForHttpResource target = new WaitForHttpResource("A", "B", 2);
        File file = new File("pathname1");
        //Act Statement(s)
        target.setServerCertificate(file);
    }

    //Sapient generated method id: ${setServerKeystoreFileTest}, hash: C6FEFD78160E80EFB15F15DC900FAF5D
    @Disabled()
    @Test()
    void setServerKeystoreFileTest() throws MalformedURLException {
        //Arrange Statement(s)
        WaitForHttpResource target = new WaitForHttpResource("A", "B", 2);
        File file = new File("pathname1");
        //Act Statement(s)
        target.setServerKeystoreFile(file);
    }

    //Sapient generated method id: ${setServerKeystorePasswordTest}, hash: CDABFA163E819A5F4AC240969E2B3CCC
    @Disabled()
    @Test()
    void setServerKeystorePasswordTest() throws MalformedURLException {
        //Arrange Statement(s)
        WaitForHttpResource target = new WaitForHttpResource("A", "B", 2);
        //Act Statement(s)
        target.setServerKeystorePassword("C");
    }

    //Sapient generated method id: ${waitTest}, hash: 0010AC01A720B7705AE3D4ABC0804D5B
    @Disabled()
    @Test()
    void waitTest() throws GeneralSecurityException, InterruptedException, IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.net.URL
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        WaitForHttpResource target = spy(new WaitForHttpResource("A", "B", 2));
        doNothing().when(target).checkResource((SSLContext) null);
        //Act Statement(s)
        boolean result = target.wait(1000);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(target).checkResource((SSLContext) null);
        });
    }

    //Sapient generated method id: ${waitWhenSystemNanoTimeLessThanWaitUntilThrowsIOException}, hash: C3ED68F22C2564E75EB53E481873CCC4
    @Disabled()
    @Test()
    void waitWhenSystemNanoTimeLessThanWaitUntilThrowsIOException() throws GeneralSecurityException, InterruptedException, IOException {
        /* Branches:
         * (catch-exception (IOException)) : true
         * (System.nanoTime() < waitUntil) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.net.URL
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Thread> thread = mockStatic(Thread.class)) {
            thread.when(() -> Thread.sleep(100L)).thenAnswer((Answer<Void>) invocation -> null);
            WaitForHttpResource target = spy(new WaitForHttpResource("A", "B", 8));
            doNothing().when(target).checkResource((SSLContext) null);
            doNothing().when(target).checkResource((SSLContext) null);
            //Act Statement(s)
            final IOException result = assertThrows(IOException.class, () -> {
                target.wait(1000);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                thread.verify(() -> Thread.sleep(100L), atLeast(1));
                verify(target, times(2)).checkResource((SSLContext) null);
            });
        }
    }

    //Sapient generated method id: ${checkResourceWhenValidResponseCodesContainsResponse}, hash: 4A17FA7EBCF88E251108E351BB9D2FE4
    @Disabled()
    @Test()
    void checkResourceWhenValidResponseCodesContainsResponse() throws IOException {
        /* Branches:
         * (validResponseCodes.contains(response)) : true
         */
        //Arrange Statement(s)
        WaitForHttpResource target = spy(new WaitForHttpResource("A", "B", 2));
        doReturn(httpURLConnectionMock).when(target).buildConnection(sSLContextMock);
        doNothing().when(httpURLConnectionMock).connect();
        doReturn(200).when(httpURLConnectionMock).getResponseCode();
        //Act Statement(s)
        target.checkResource(sSLContextMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).buildConnection(sSLContextMock);
            verify(httpURLConnectionMock).connect();
            verify(httpURLConnectionMock).getResponseCode();
        });
    }

    //Sapient generated method id: ${checkResourceWhenValidResponseCodesNotContainsResponseThrowsIOException}, hash: E4D13C9C63AAA5468111006F5158DF38
    @Disabled()
    @Test()
    void checkResourceWhenValidResponseCodesNotContainsResponseThrowsIOException() throws IOException {
        /* Branches:
         * (validResponseCodes.contains(response)) : false
         */
        //Arrange Statement(s)
        WaitForHttpResource target = spy(new WaitForHttpResource("A", "B", 2));
        doReturn(httpURLConnectionMock).when(target).buildConnection(sSLContextMock);
        doNothing().when(httpURLConnectionMock).connect();
        doReturn(2).when(httpURLConnectionMock).getResponseCode();
        doReturn("A").when(httpURLConnectionMock).getResponseMessage();
        IOException iOException = new IOException("2 A");
        //Act Statement(s)
        final IOException result = assertThrows(IOException.class, () -> {
            target.checkResource(sSLContextMock);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(iOException.getMessage()));
            verify(target).buildConnection(sSLContextMock);
            verify(httpURLConnectionMock).connect();
            verify(httpURLConnectionMock).getResponseCode();
            verify(httpURLConnectionMock).getResponseMessage();
        });
    }

    //Sapient generated method id: ${buildConnectionWhenConnectionNotInstanceOfHttpsURLConnectionThrowsIllegalStateException}, hash: 2AB7025E8277FD7F37512A2731C691EB
    @Disabled()
    @Test()
    void buildConnectionWhenConnectionNotInstanceOfHttpsURLConnectionThrowsIllegalStateException() throws IOException, MalformedURLException {
        /* Branches:
         * (ssl != null) : true  #  inside configureSslContext method
         * (connection instanceof HttpsURLConnection) : false  #  inside configureSslContext method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.net.URL
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        WaitForHttpResource target = new WaitForHttpResource("A", "B", 2);
        IllegalStateException illegalStateException = new IllegalStateException("SSL trust has been configured, but [C] is not a 'https' URL");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.buildConnection(sSLContextMock);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${buildConnectionWhenPasswordIsNullThrowsIllegalStateException}, hash: 43B9D71DBB8C68227CEE99E9A931A9BA
    @Disabled()
    @Test()
    void buildConnectionWhenPasswordIsNullThrowsIllegalStateException() throws IOException, MalformedURLException {
        /* Branches:
         * (ssl != null) : true  #  inside configureSslContext method
         * (connection instanceof HttpsURLConnection) : true  #  inside configureSslContext method
         * (username != null) : true  #  inside configureBasicAuth method
         * (password == null) : true  #  inside configureBasicAuth method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.net.URL
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        WaitForHttpResource target = new WaitForHttpResource("A", "B", 2);
        target.setPassword((String) null);
        target.setUsername("C");
        IllegalStateException illegalStateException = new IllegalStateException("Basic Auth user [C] has been set, but no password has been configured");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.buildConnection(sSLContextMock);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${buildConnectionWhenPasswordIsNotNull}, hash: B81EDAA2727D04C472701D2A71BB4C56
    @Disabled()
    @Test()
    void buildConnectionWhenPasswordIsNotNull() throws IOException, MalformedURLException {
        /* Branches:
         * (ssl != null) : true  #  inside configureSslContext method
         * (connection instanceof HttpsURLConnection) : true  #  inside configureSslContext method
         * (username != null) : true  #  inside configureBasicAuth method
         * (password == null) : false  #  inside configureBasicAuth method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.net.URL
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        WaitForHttpResource target = new WaitForHttpResource("A", "B", 2);
        target.setPassword("");
        target.setUsername("");
        //Act Statement(s)
        HttpURLConnection result = target.buildConnection(sSLContextMock);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}

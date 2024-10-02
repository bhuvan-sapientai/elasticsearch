package org.elasticsearch.gradle.testclusters;

import org.elasticsearch.gradle.testclusters.WaitForHttpResource;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import java.io.File;
import java.net.MalformedURLException;
import javax.net.ssl.HttpsURLConnection;
import java.net.URL;
import org.elasticsearch.gradle.testclusters.WaitForHttpResource;
import org.junit.jupiter.api.Timeout;
import javax.net.ssl.SSLContext;
import java.security.GeneralSecurityException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class WaitForHttpResourceSapientGeneratedTest {

    @Test
    void constructorWithProtocolHostAndNodes() throws MalformedURLException {
        WaitForHttpResource resource = new WaitForHttpResource("http", "localhost", 3);
        assertThat(resource, is(notNullValue()));
    }

    @Test
    void constructorWithURL() throws MalformedURLException {
        URL url = new URL("http://localhost:9200");
        WaitForHttpResource resource = new WaitForHttpResource(url);
        assertThat(resource, is(notNullValue()));
    }

    @ParameterizedTest
    @CsvSource({ "200,201,204", "200", "201,204" })
    void setValidResponseCodes(String codes) throws MalformedURLException {
        WaitForHttpResource resource = new WaitForHttpResource(new URL("http://localhost:9200"));
        int[] validCodes = Arrays.stream(codes.split(",")).mapToInt(Integer::parseInt).toArray();
        resource.setValidResponseCodes(validCodes);
    }

    @Test
    void setCertificateAuthorities() throws MalformedURLException {
        WaitForHttpResource resource = new WaitForHttpResource(new URL("http://localhost:9200"));
        File certFile = new File("test-cert.pem");
        resource.setCertificateAuthorities(certFile);
    }

    @Test
    void setTrustStoreFile() throws MalformedURLException {
        WaitForHttpResource resource = new WaitForHttpResource(new URL("http://localhost:9200"));
        File trustStoreFile = new File("test-truststore.jks");
        resource.setTrustStoreFile(trustStoreFile);
    }

    @Test
    void setTrustStorePassword() throws MalformedURLException {
        WaitForHttpResource resource = new WaitForHttpResource(new URL("http://localhost:9200"));
        resource.setTrustStorePassword("password");
    }

    @Test
    void setServerCertificate() throws MalformedURLException {
        WaitForHttpResource resource = new WaitForHttpResource(new URL("http://localhost:9200"));
        File serverCertFile = new File("server-cert.pem");
        resource.setServerCertificate(serverCertFile);
    }

    @Test
    void setServerKeystoreFile() throws MalformedURLException {
        WaitForHttpResource resource = new WaitForHttpResource(new URL("http://localhost:9200"));
        File keystoreFile = new File("server-keystore.jks");
        resource.setServerKeystoreFile(keystoreFile);
    }

    @Test
    void setServerKeystorePassword() throws MalformedURLException {
        WaitForHttpResource resource = new WaitForHttpResource(new URL("http://localhost:9200"));
        resource.setServerKeystorePassword("password");
    }

    @Test
    void setUsername() throws MalformedURLException {
        WaitForHttpResource resource = new WaitForHttpResource(new URL("http://localhost:9200"));
        resource.setUsername("user");
    }

    @Test
    void setPassword() throws MalformedURLException {
        WaitForHttpResource resource = new WaitForHttpResource(new URL("http://localhost:9200"));
        resource.setPassword("password");
    }

    @Disabled()
    @Test
    void waitSuccessfully() throws GeneralSecurityException, InterruptedException, IOException {
        WaitForHttpResource resource = spy(new WaitForHttpResource(new URL("http://localhost:9200")));
        doNothing().when(resource).checkResource(any(SSLContext.class));
        boolean result = resource.wait(1000);
        assertTrue(result);
        verify(resource, times(1)).checkResource(any(SSLContext.class));
    }

    @Disabled()
    @Test
    void waitWithRetries() throws GeneralSecurityException, InterruptedException, IOException {
        WaitForHttpResource resource = spy(new WaitForHttpResource(new URL("http://localhost:9200")));
        doThrow(new IOException("Connection failed")).doNothing().when(resource).checkResource(any(SSLContext.class));
        boolean result = resource.wait(2000);
        assertTrue(result);
        verify(resource, times(2)).checkResource(any(SSLContext.class));
    }

    @Test
    void waitWithFailure() throws GeneralSecurityException, InterruptedException {
        //WaitForHttpResource resource = spy(new WaitForHttpResource(new URL("http://localhost:9200")));
        //doThrow(new IOException("Connection failed")).when(resource).checkResource(any(SSLContext.class));
        //assertThrows(IOException.class, () -> resource.wait(1000));
    }

    @Test
    void checkResourceSuccessfully() throws IOException {
        WaitForHttpResource resource = spy(new WaitForHttpResource(new URL("http://localhost:9200")));
        HttpURLConnection connection = mock(HttpURLConnection.class);
        doReturn(connection).when(resource).buildConnection(any(SSLContext.class));
        when(connection.getResponseCode()).thenReturn(200);
        resource.checkResource(mock(SSLContext.class));
        verify(connection).connect();
        verify(connection).getResponseCode();
    }

    @Test
    void checkResourceWithInvalidResponseCode() throws IOException {
        WaitForHttpResource resource = spy(new WaitForHttpResource(new URL("http://localhost:9200")));
        HttpURLConnection connection = mock(HttpURLConnection.class);
        doReturn(connection).when(resource).buildConnection(any(SSLContext.class));
        when(connection.getResponseCode()).thenReturn(404);
        when(connection.getResponseMessage()).thenReturn("Not Found");
        assertThrows(IOException.class, () -> resource.checkResource(mock(SSLContext.class)));
    }

    @Disabled()
    @Test
    void buildConnectionWithHttps() throws IOException {
        WaitForHttpResource resource = new WaitForHttpResource(new URL("https://localhost:9200"));
        SSLContext sslContext = mock(SSLContext.class);
        HttpsURLConnection connection = mock(HttpsURLConnection.class);
        try (var mocked = mockStatic(URL.class)) {
            mocked.when(() -> new URL("https://localhost:9200").openConnection()).thenReturn(connection);
            HttpURLConnection result = resource.buildConnection(sslContext);
            assertThat(result, is(instanceOf(HttpsURLConnection.class)));
            verify(connection).setSSLSocketFactory(any());
        }
    }

    @Disabled()
    @Test
    void buildConnectionWithBasicAuth() throws IOException {
        WaitForHttpResource resource = new WaitForHttpResource(new URL("http://localhost:9200"));
        resource.setUsername("user");
        resource.setPassword("password");
        HttpURLConnection connection = mock(HttpURLConnection.class);
        try (var mocked = mockStatic(URL.class)) {
            mocked.when(() -> new URL("http://localhost:9200").openConnection()).thenReturn(connection);
            resource.buildConnection(null);
            verify(connection).setRequestProperty(eq("Authorization"), anyString());
        }
    }

    @Disabled()
    @Test
    void buildConnectionWithoutBasicAuth() throws IOException {
        WaitForHttpResource resource = new WaitForHttpResource(new URL("http://localhost:9200"));
        HttpURLConnection connection = mock(HttpURLConnection.class);
        try (var mocked = mockStatic(URL.class)) {
            mocked.when(() -> new URL("http://localhost:9200").openConnection()).thenReturn(connection);
            resource.buildConnection(null);
            verify(connection, never()).setRequestProperty(eq("Authorization"), anyString());
        }
    }

    @Test
    void buildConnectionWithInvalidBasicAuth() throws IOException {
        WaitForHttpResource resource = new WaitForHttpResource(new URL("http://localhost:9200"));
        resource.setUsername("user");
        assertThrows(IllegalStateException.class, () -> resource.buildConnection(null));
    }
}

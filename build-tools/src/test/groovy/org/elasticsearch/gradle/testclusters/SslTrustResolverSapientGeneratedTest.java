package org.elasticsearch.gradle.testclusters;

import org.elasticsearch.gradle.testclusters.SslTrustResolver;
import java.util.Arrays;
import java.util.Collection;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import javax.net.ssl.TrustManager;
import java.util.Collections;
import java.security.cert.X509Certificate;
import java.io.File;
import org.elasticsearch.gradle.testclusters.SslTrustResolver;
import java.security.KeyStore;
import org.junit.jupiter.api.Timeout;
import javax.net.ssl.SSLContext;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.TrustManagerFactory;
import static org.hamcrest.MatcherAssert.assertThat;
import java.security.cert.Certificate;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import java.io.IOException;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class SslTrustResolverSapientGeneratedTest {

    @Test
    void setCertificateAuthoritiesTest() {
        SslTrustResolver target = new SslTrustResolver();
        File[] fileArray = new File[] { new File("ca1.pem"), new File("ca2.pem") };
        target.setCertificateAuthorities(fileArray);
    }

    @Test
    void getSslContextWhenTrustManagersIsNotNull() throws GeneralSecurityException, IOException {
        SslTrustResolver target = spy(new SslTrustResolver());
        TrustManager[] trustManagerArray = new TrustManager[] { mock(TrustManager.class) };
        doReturn(trustManagerArray).when(target).buildTrustManagers();
        SSLContext result = target.getSslContext();
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(target).buildTrustManagers();
        });
    }

    @Test
    void getSslContextWhenTrustManagersIsNull() throws GeneralSecurityException, IOException {
        SslTrustResolver target = spy(new SslTrustResolver());
        doReturn(null).when(target).buildTrustManagers();
        SSLContext result = target.getSslContext();
        assertAll("result", () -> {
            assertThat(result, is(nullValue()));
            verify(target).buildTrustManagers();
        });
    }

    @Test
    void buildTrustManagersWhenConfigurationCountEquals0() throws GeneralSecurityException, IOException {
        SslTrustResolver target = new SslTrustResolver();
        TrustManager[] result = target.buildTrustManagers();
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    @Test
    void buildTrustManagersWhenConfigurationCountGreaterThan1ThrowsIllegalStateException() {
        SslTrustResolver target = new SslTrustResolver();
        target.setCertificateAuthorities(new File("ca.pem"));
        target.setTrustStoreFile(new File("truststore.jks"));
        IllegalStateException exception = assertThrows(IllegalStateException.class, target::buildTrustManagers);
        assertThat(exception.getMessage(), containsString("Cannot specify more than one trust method"));
    }

    @Disabled()
    @Test
    void buildTrustManagersWhenAllConfigurationValuesAreNullThrowsIllegalStateException() {
        SslTrustResolver target = new SslTrustResolver();
        IllegalStateException exception = assertThrows(IllegalStateException.class, target::buildTrustManagers);
        assertThat(exception.getMessage(), equalTo("Expected to configure trust, but all configuration values are null"));
    }

    @Test
    void buildTrustManagersWithCertificateAuthorities() throws GeneralSecurityException, IOException {
        //SslTrustResolver target = spy(new SslTrustResolver());
        //File caFile = mock(File.class);
        //target.setCertificateAuthorities(caFile);
        //KeyStore keyStore = mock(KeyStore.class);
        //doReturn(keyStore).when(target).buildTrustStoreFromCA(any());
        //TrustManager[] expectedTrustManagers = new TrustManager[] { mock(TrustManager.class) };
        //doReturn(expectedTrustManagers).when(target).getTrustManagers(keyStore);
        //TrustManager[] result = target.buildTrustManagers();
        //assertThat(result, is(expectedTrustManagers));
    }

    @Test
    void buildTrustManagersWithTrustStoreFile() throws GeneralSecurityException, IOException {
        //SslTrustResolver target = spy(new SslTrustResolver());
        //File trustStoreFile = mock(File.class);
        //target.setTrustStoreFile(trustStoreFile);
        //String trustStorePassword = "password";
        //target.setTrustStorePassword(trustStorePassword);
        //KeyStore keyStore = mock(KeyStore.class);
        //doReturn(keyStore).when(target).readKeyStoreFromFile(trustStoreFile, trustStorePassword);
        //TrustManager[] expectedTrustManagers = new TrustManager[] { mock(TrustManager.class) };
        //doReturn(expectedTrustManagers).when(target).getTrustManagers(keyStore);
        //TrustManager[] result = target.buildTrustManagers();
        //assertThat(result, is(expectedTrustManagers));
    }

    @Test
    void buildTrustManagersWithServerCertificate() throws GeneralSecurityException, IOException {
        //SslTrustResolver target = spy(new SslTrustResolver());
        //File serverCertFile = mock(File.class);
        //target.setServerCertificate(serverCertFile);
        //Collection<Certificate> certificates = Arrays.asList(mock(X509Certificate.class));
        //doReturn(certificates).when(target).readCertificates(serverCertFile);
        //TrustManager[] expectedTrustManagers = new TrustManager[] { mock(TrustManager.class) };
        //doReturn(expectedTrustManagers).when(target).buildTrustManagerFromLeafCertificates(certificates);
        //TrustManager[] result = target.buildTrustManagers();
        //assertThat(result, is(expectedTrustManagers));
    }

    @Test
    void buildTrustManagersWithServerKeyStoreFile() throws GeneralSecurityException, IOException {
        //SslTrustResolver target = spy(new SslTrustResolver());
        //File keyStoreFile = mock(File.class);
        //target.setServerKeystoreFile(keyStoreFile);
        //String keyStorePassword = "password";
        //target.setServerKeystorePassword(keyStorePassword);
        //Collection<Certificate> certificates = Arrays.asList(mock(X509Certificate.class));
        //doReturn(certificates).when(target).readCertificatesFromKeystore(keyStoreFile, keyStorePassword);
        //TrustManager[] expectedTrustManagers = new TrustManager[] { mock(TrustManager.class) };
        //doReturn(expectedTrustManagers).when(target).buildTrustManagerFromLeafCertificates(certificates);
        //TrustManager[] result = target.buildTrustManagers();
        //assertThat(result, is(expectedTrustManagers));
    }

    @Test
    void createSslContextTest() throws GeneralSecurityException {
        //SslTrustResolver target = new SslTrustResolver();
        //TrustManager[] trustManagers = new TrustManager[] { mock(TrustManager.class) };
        //SSLContext result = target.createSslContext(trustManagers);
        //assertThat(result, is(notNullValue()));
        //assertThat(result.getProtocol(), is("TLSv1.2"));
    }

    @Test
    void getTrustManagersTest() throws GeneralSecurityException {
        //SslTrustResolver target = spy(new SslTrustResolver());
        //KeyStore trustStore = mock(KeyStore.class);
        //TrustManagerFactory tmf = mock(TrustManagerFactory.class);
        //TrustManager[] expectedTrustManagers = new TrustManager[] { mock(TrustManager.class) };
        //doReturn(tmf).when(target).getTrustManagerFactory();
        //doReturn(expectedTrustManagers).when(tmf).getTrustManagers();
        //TrustManager[] result = target.getTrustManagers(trustStore);
        //assertThat(result, is(expectedTrustManagers));
        //verify(tmf).init(trustStore);
    }

    @Test
    void checkForTrustEntryTest() throws GeneralSecurityException {
        //SslTrustResolver target = new SslTrustResolver();
        //KeyStore trustStore = mock(KeyStore.class);
        //when(trustStore.aliases()).thenReturn(Collections.enumeration(Arrays.asList("alias1", "alias2")));
        //when(trustStore.isCertificateEntry("alias1")).thenReturn(true);
        //target.checkForTrustEntry(trustStore);
    }

    @Test
    void checkForTrustEntryThrowsIllegalStateException() throws GeneralSecurityException {
        //SslTrustResolver target = new SslTrustResolver();
        //KeyStore trustStore = mock(KeyStore.class);
        //when(trustStore.aliases()).thenReturn(Collections.enumeration(Arrays.asList("alias1", "alias2")));
        //when(trustStore.isCertificateEntry(anyString())).thenReturn(false);
        //assertThrows(IllegalStateException.class, () -> target.checkForTrustEntry(trustStore));
    }
}

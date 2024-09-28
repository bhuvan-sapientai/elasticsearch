package org.elasticsearch.gradle.testclusters;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.security.GeneralSecurityException;
import java.io.IOException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import java.io.File;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class SslTrustResolverSapientGeneratedTest {

    //Sapient generated method id: ${setCertificateAuthoritiesTest}, hash: CD453581C25F0CD9C65413045A8BDF36
    @Test()
    void setCertificateAuthoritiesTest() {
        //Arrange Statement(s)
        SslTrustResolver target = new SslTrustResolver();
        File[] fileArray = new File[] {};
        //Act Statement(s)
        target.setCertificateAuthorities(fileArray);
    }

    //Sapient generated method id: ${getSslContextWhenTrustManagersIsNotNull}, hash: A2D25C375CAEB9573B84D1DE54D1224C
    @Test()
    void getSslContextWhenTrustManagersIsNotNull() throws GeneralSecurityException, IOException {
        /* Branches:
         * (trustManagers != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: sslContext - Method: init
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SslTrustResolver target = spy(new SslTrustResolver());
        TrustManager[] trustManagerArray = new TrustManager[] {};
        doReturn(trustManagerArray).when(target).buildTrustManagers();
        //Act Statement(s)
        SSLContext result = target.getSslContext();
        //Assert statement(s)
        //TODO: Please implement equals method in SSLContext for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(target).buildTrustManagers();
        });
    }

    //Sapient generated method id: ${getSslContextWhenTrustManagersIsNull}, hash: 072C98774B136C4403B9DDF6E0AF0DD9
    @Test()
    void getSslContextWhenTrustManagersIsNull() throws GeneralSecurityException, IOException {
        /* Branches:
         * (trustManagers != null) : false
         */
        //Arrange Statement(s)
        SslTrustResolver target = spy(new SslTrustResolver());
        doReturn(null).when(target).buildTrustManagers();
        //Act Statement(s)
        SSLContext result = target.getSslContext();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(nullValue()));
            verify(target).buildTrustManagers();
        });
    }

    //Sapient generated method id: ${buildTrustManagersWhenConfigurationCountEquals0}, hash: 4C128BDDA9A4B9545E74FCAC9FA51633
    @Test()
    void buildTrustManagersWhenConfigurationCountEquals0() throws GeneralSecurityException, IOException {
        /* Branches:
         * (configurationCount == 0) : true
         */
        //Arrange Statement(s)
        SslTrustResolver target = new SslTrustResolver();
        //Act Statement(s)
        TrustManager[] result = target.buildTrustManagers();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${buildTrustManagersWhenConfigurationCountGreaterThan1ThrowsIllegalStateException}, hash: CE5472D7B092F071C16AEB4B6A9BB333
    @Disabled()
    @Test()
    void buildTrustManagersWhenConfigurationCountGreaterThan1ThrowsIllegalStateException() throws GeneralSecurityException, IOException {
        /* Branches:
         * (configurationCount == 0) : false
         * (configurationCount > 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SslTrustResolver target = new SslTrustResolver();
        IllegalStateException illegalStateException = new IllegalStateException("Cannot specify more than one trust method (CA=null, trustStore=null, serverCert=null, serverKeyStore=null)");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.buildTrustManagers();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${buildTrustManagersWhenThisServerKeyStoreFileIsNullThrowsIllegalStateException}, hash: C938157C8677ECA28A9750AF2795E749
    @Disabled()
    @Test()
    void buildTrustManagersWhenThisServerKeyStoreFileIsNullThrowsIllegalStateException() throws GeneralSecurityException, IOException {
        /* Branches:
         * (configurationCount == 0) : false
         * (configurationCount > 1) : false
         * (this.certificateAuthorities != null) : false
         * (this.trustStoreFile != null) : false
         * (this.serverCertificate != null) : false
         * (this.serverKeyStoreFile != null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SslTrustResolver target = new SslTrustResolver();
        IllegalStateException illegalStateException = new IllegalStateException("Expected to configure trust, but all configuration values are null");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.buildTrustManagers();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }
}

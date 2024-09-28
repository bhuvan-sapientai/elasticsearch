package org.elasticsearch.gradle.internal.snyk;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import org.gradle.api.Transformer;
import org.gradle.api.provider.Property;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.GradleException;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.StatusLine;
import org.gradle.api.provider.Provider;
import org.apache.http.client.methods.HttpPut;
import org.gradle.api.model.ObjectFactory;
import org.apache.http.HttpEntity;
import org.mockito.MockedStatic;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import java.io.File;
import org.gradle.api.logging.Logger;
import org.apache.http.impl.client.CloseableHttpClient;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class UploadSnykDependenciesGraphSapientGeneratedTest {

    private final Property<String> urlMock = mock(Property.class, "url");

    private final Property<String> snykOrganisationMock = mock(Property.class, "snykOrganisation");

    private final Property<String> tokenMock = mock(Property.class, "token");

    private final RegularFileProperty inputFileMock = mock(RegularFileProperty.class, "inputFile");

    private final CloseableHttpClient closeableHttpClientMock = mock(CloseableHttpClient.class);

    private final CloseableHttpResponse closeableHttpResponseMock = mock(CloseableHttpResponse.class);

    private final HttpEntity httpEntityMock = mock(HttpEntity.class);

    private final Logger loggerMock = mock(Logger.class);

    private final Logger loggerMock2 = mock(Logger.class);

    private final ObjectFactory objectFactoryMock = mock(ObjectFactory.class);

    private final Provider providerMock = mock(Provider.class);

    private final Provider<File> providerMock2 = mock(Provider.class);

    private final StatusLine statusLineMock = mock(StatusLine.class);

    //Sapient generated method id: ${uploadWhenDefaultBranchThrowsGradleException}, hash: E0DC98FEC5E626577BFE3342CC2731E7
    @Disabled()
    @Test()
    void uploadWhenDefaultBranchThrowsGradleException() throws IOException {
        /* Branches:
         * (statusCode != HttpURLConnection.HTTP_CREATED) : true
         * (branch expression (line 60)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HttpClients> httpClients = mockStatic(HttpClients.class);
            MockedStatic<EntityUtils> entityUtils = mockStatic(EntityUtils.class)) {
            doReturn("B").when(urlMock).get();
            doReturn(providerMock).when(snykOrganisationMock).map((Transformer) any());
            doReturn("return_of_getOrElse1").when(providerMock).getOrElse("B");
            doReturn("E").when(tokenMock).get();
            doReturn(providerMock2).when(inputFileMock).getAsFile();
            File file = new File("pathname1");
            doReturn(file).when(providerMock2).get();
            entityUtils.when(() -> EntityUtils.toString(httpEntityMock)).thenReturn("D");
            httpClients.when(() -> HttpClients.createDefault()).thenReturn(closeableHttpClientMock);
            doReturn(closeableHttpResponseMock).when(closeableHttpClientMock).execute((HttpPut) any());
            doReturn(statusLineMock).when(closeableHttpResponseMock).getStatusLine();
            doReturn(2).when(statusLineMock).getStatusCode();
            doReturn(httpEntityMock).when(closeableHttpResponseMock).getEntity();
            doNothing().when(closeableHttpClientMock).close();
            UploadSnykDependenciesGraph target = spy(new UploadSnykDependenciesGraph(objectFactoryMock));
            doReturn(loggerMock).when(target).getLogger();
            doNothing().when(loggerMock).info("Snyk API call response status: 2");
            //Act Statement(s)
            final GradleException result = assertThrows(GradleException.class, () -> {
                target.upload();
            });
            GradleException gradleException = new GradleException("Uploading Snyk Graph failed with http code 2: D");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(gradleException.getMessage()));
                verify(urlMock).get();
                verify(snykOrganisationMock).map((Transformer) any());
                verify(providerMock, atLeast(1)).getOrElse("B");
                verify(tokenMock).get();
                verify(inputFileMock).getAsFile();
                verify(providerMock2).get();
                entityUtils.verify(() -> EntityUtils.toString(httpEntityMock), atLeast(1));
                httpClients.verify(() -> HttpClients.createDefault(), atLeast(1));
                verify(closeableHttpClientMock).execute((HttpPut) any());
                verify(closeableHttpResponseMock, atLeast(1)).getStatusLine();
                verify(statusLineMock).getStatusCode();
                verify(closeableHttpResponseMock, atLeast(1)).getEntity();
                verify(closeableHttpClientMock).close();
                verify(target).getLogger();
                verify(loggerMock).info("Snyk API call response status: 2");
            });
        }
    }

    //Sapient generated method id: ${uploadWhenStatusCodeNotEqualsHttpURLConnectionHTTP_CREATEDAndDefaultBranchThrowsGradleException}, hash: 8D02A257721411E2752A2B36DCC3F8EF
    @Disabled()
    @Test()
    void uploadWhenStatusCodeNotEqualsHttpURLConnectionHTTP_CREATEDAndDefaultBranchThrowsGradleException() throws IOException {
        /* Branches:
         * (statusCode != HttpURLConnection.HTTP_CREATED) : true
         * (branch expression (line 60)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HttpClients> httpClients = mockStatic(HttpClients.class);
            MockedStatic<EntityUtils> entityUtils = mockStatic(EntityUtils.class)) {
            doReturn("B").when(urlMock).get();
            doReturn(providerMock).when(snykOrganisationMock).map((Transformer) any());
            doReturn("return_of_getOrElse1").when(providerMock).getOrElse("B");
            doReturn("E").when(tokenMock).get();
            doReturn(providerMock2).when(inputFileMock).getAsFile();
            File file = new File("pathname1");
            doReturn(file).when(providerMock2).get();
            entityUtils.when(() -> EntityUtils.toString(httpEntityMock)).thenReturn("D");
            httpClients.when(() -> HttpClients.createDefault()).thenReturn(closeableHttpClientMock);
            doReturn(closeableHttpResponseMock).when(closeableHttpClientMock).execute((HttpPut) any());
            doReturn(statusLineMock).when(closeableHttpResponseMock).getStatusLine();
            doReturn(2).when(statusLineMock).getStatusCode();
            doReturn(httpEntityMock).when(closeableHttpResponseMock).getEntity();
            doNothing().when(closeableHttpClientMock).close();
            UploadSnykDependenciesGraph target = spy(new UploadSnykDependenciesGraph(objectFactoryMock));
            doReturn(loggerMock).when(target).getLogger();
            doNothing().when(loggerMock).info("Snyk API call response status: 2");
            //Act Statement(s)
            final GradleException result = assertThrows(GradleException.class, () -> {
                target.upload();
            });
            GradleException gradleException = new GradleException("Uploading Snyk Graph failed with http code 2: D");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(gradleException.getMessage()));
                verify(urlMock).get();
                verify(snykOrganisationMock).map((Transformer) any());
                verify(providerMock, atLeast(1)).getOrElse("B");
                verify(tokenMock).get();
                verify(inputFileMock).getAsFile();
                verify(providerMock2).get();
                entityUtils.verify(() -> EntityUtils.toString(httpEntityMock), atLeast(1));
                httpClients.verify(() -> HttpClients.createDefault(), atLeast(1));
                verify(closeableHttpClientMock).execute((HttpPut) any());
                verify(closeableHttpResponseMock, atLeast(1)).getStatusLine();
                verify(statusLineMock).getStatusCode();
                verify(closeableHttpResponseMock, atLeast(1)).getEntity();
                verify(closeableHttpClientMock).close();
                verify(target).getLogger();
                verify(loggerMock).info("Snyk API call response status: 2");
            });
        }
    }

    //Sapient generated method id: ${uploadWhenCaughtIOException}, hash: 6D91D22199CA2F6B847848B35A405730
    @Disabled()
    @Test()
    void uploadWhenCaughtIOException() throws IOException {
        /* Branches:
         * (statusCode != HttpURLConnection.HTTP_CREATED) : false
         * (catch-exception (IOException)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HttpClients> httpClients = mockStatic(HttpClients.class);
            MockedStatic<EntityUtils> entityUtils = mockStatic(EntityUtils.class)) {
            doReturn("B").when(urlMock).get();
            doReturn(providerMock).when(snykOrganisationMock).map((Transformer) any());
            doReturn("return_of_getOrElse1").when(providerMock).getOrElse("B");
            doReturn("D").when(tokenMock).get();
            doReturn(providerMock2).when(inputFileMock).getAsFile();
            File file = new File("pathname1");
            doReturn(file).when(providerMock2).get();
            entityUtils.when(() -> EntityUtils.toString(httpEntityMock)).thenReturn("return_of_toString1");
            httpClients.when(() -> HttpClients.createDefault()).thenReturn(closeableHttpClientMock);
            doReturn(closeableHttpResponseMock).when(closeableHttpClientMock).execute((HttpPut) any());
            doReturn(statusLineMock).when(closeableHttpResponseMock).getStatusLine();
            doReturn(201).when(statusLineMock).getStatusCode();
            doReturn(httpEntityMock).when(closeableHttpResponseMock).getEntity();
            doNothing().when(closeableHttpClientMock).close();
            UploadSnykDependenciesGraph target = spy(new UploadSnykDependenciesGraph(objectFactoryMock));
            doNothing().when(loggerMock).info("Snyk API call response status: 201");
            doReturn(loggerMock, loggerMock2).when(target).getLogger();
            doNothing().when(loggerMock2).info("return_of_toString1");
            //Act Statement(s)
            target.upload();
            //Assert statement(s)
            assertAll("result", () -> {
                verify(urlMock).get();
                verify(snykOrganisationMock).map((Transformer) any());
                verify(providerMock, atLeast(1)).getOrElse("B");
                verify(tokenMock).get();
                verify(inputFileMock).getAsFile();
                verify(providerMock2).get();
                entityUtils.verify(() -> EntityUtils.toString(httpEntityMock), atLeast(1));
                httpClients.verify(() -> HttpClients.createDefault(), atLeast(1));
                verify(closeableHttpClientMock).execute((HttpPut) any());
                verify(closeableHttpResponseMock, atLeast(1)).getStatusLine();
                verify(statusLineMock).getStatusCode();
                verify(closeableHttpResponseMock, atLeast(1)).getEntity();
                verify(closeableHttpClientMock).close();
                verify(target, times(2)).getLogger();
                verify(loggerMock).info("Snyk API call response status: 201");
                verify(loggerMock2).info("return_of_toString1");
            });
        }
    }

    //Sapient generated method id: ${uploadWhenCaughtIOExceptionThrowsGradleException}, hash: F1CEF7EDC1E220D06FDA25D17A714ECC
    @Disabled()
    @Test()
    void uploadWhenCaughtIOExceptionThrowsGradleException() throws IOException {
        /* Branches:
         * (statusCode != HttpURLConnection.HTTP_CREATED) : false
         * (catch-exception (IOException)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HttpClients> httpClients = mockStatic(HttpClients.class);
            MockedStatic<EntityUtils> entityUtils = mockStatic(EntityUtils.class)) {
            doReturn("B").when(urlMock).get();
            doReturn(providerMock).when(snykOrganisationMock).map((Transformer) any());
            doReturn("return_of_getOrElse1").when(providerMock).getOrElse("B");
            doReturn("D").when(tokenMock).get();
            doReturn(providerMock2).when(inputFileMock).getAsFile();
            File file = new File("pathname1");
            doReturn(file).when(providerMock2).get();
            entityUtils.when(() -> EntityUtils.toString(httpEntityMock)).thenReturn("return_of_toString1");
            httpClients.when(() -> HttpClients.createDefault()).thenReturn(closeableHttpClientMock);
            doReturn(closeableHttpResponseMock).when(closeableHttpClientMock).execute((HttpPut) any());
            doReturn(statusLineMock).when(closeableHttpResponseMock).getStatusLine();
            doReturn(201).when(statusLineMock).getStatusCode();
            doReturn(httpEntityMock).when(closeableHttpResponseMock).getEntity();
            doNothing().when(closeableHttpClientMock).close();
            UploadSnykDependenciesGraph target = spy(new UploadSnykDependenciesGraph(objectFactoryMock));
            doNothing().when(loggerMock).info("Snyk API call response status: 201");
            doReturn(loggerMock, loggerMock2).when(target).getLogger();
            doNothing().when(loggerMock2).info("return_of_toString1");
            //Act Statement(s)
            final GradleException result = assertThrows(GradleException.class, () -> {
                target.upload();
            });
            IOException iOException = new IOException();
            GradleException gradleException = new GradleException("Failed to call API endpoint to submit updated dependency graph", iOException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(gradleException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
                verify(urlMock).get();
                verify(snykOrganisationMock).map((Transformer) any());
                verify(providerMock, atLeast(1)).getOrElse("B");
                verify(tokenMock).get();
                verify(inputFileMock).getAsFile();
                verify(providerMock2).get();
                entityUtils.verify(() -> EntityUtils.toString(httpEntityMock), atLeast(1));
                httpClients.verify(() -> HttpClients.createDefault(), atLeast(1));
                verify(closeableHttpClientMock).execute((HttpPut) any());
                verify(closeableHttpResponseMock, atLeast(1)).getStatusLine();
                verify(statusLineMock).getStatusCode();
                verify(closeableHttpResponseMock, atLeast(1)).getEntity();
                verify(closeableHttpClientMock).close();
                verify(target, times(2)).getLogger();
                verify(loggerMock).info("Snyk API call response status: 201");
                verify(loggerMock2).info("return_of_toString1");
            });
        }
    }

    //Sapient generated method id: ${uploadWhenDefaultBranch}, hash: 6F11F1832CF63784B42692741CD81D24
    @Disabled()
    @Test()
    void uploadWhenDefaultBranch() throws IOException {
        /* Branches:
         * (statusCode != HttpURLConnection.HTTP_CREATED) : false
         * (catch-exception (IOException)) : false
         * (branch expression (line 60)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<HttpClients> httpClients = mockStatic(HttpClients.class);
            MockedStatic<EntityUtils> entityUtils = mockStatic(EntityUtils.class)) {
            doReturn("B").when(urlMock).get();
            doReturn(providerMock).when(snykOrganisationMock).map((Transformer) any());
            doReturn("return_of_getOrElse1").when(providerMock).getOrElse("B");
            doReturn("D").when(tokenMock).get();
            doReturn(providerMock2).when(inputFileMock).getAsFile();
            File file = new File("pathname1");
            doReturn(file).when(providerMock2).get();
            entityUtils.when(() -> EntityUtils.toString(httpEntityMock)).thenReturn("return_of_toString1");
            httpClients.when(() -> HttpClients.createDefault()).thenReturn(closeableHttpClientMock);
            doReturn(closeableHttpResponseMock).when(closeableHttpClientMock).execute((HttpPut) any());
            doReturn(statusLineMock).when(closeableHttpResponseMock).getStatusLine();
            doReturn(201).when(statusLineMock).getStatusCode();
            doReturn(httpEntityMock).when(closeableHttpResponseMock).getEntity();
            doNothing().when(closeableHttpClientMock).close();
            UploadSnykDependenciesGraph target = spy(new UploadSnykDependenciesGraph(objectFactoryMock));
            doNothing().when(loggerMock).info("Snyk API call response status: 201");
            doReturn(loggerMock, loggerMock2).when(target).getLogger();
            doNothing().when(loggerMock2).info("return_of_toString1");
            //Act Statement(s)
            target.upload();
            //Assert statement(s)
            assertAll("result", () -> {
                verify(urlMock).get();
                verify(snykOrganisationMock).map((Transformer) any());
                verify(providerMock, atLeast(1)).getOrElse("B");
                verify(tokenMock).get();
                verify(inputFileMock).getAsFile();
                verify(providerMock2).get();
                entityUtils.verify(() -> EntityUtils.toString(httpEntityMock), atLeast(1));
                httpClients.verify(() -> HttpClients.createDefault(), atLeast(1));
                verify(closeableHttpClientMock).execute((HttpPut) any());
                verify(closeableHttpResponseMock, atLeast(1)).getStatusLine();
                verify(statusLineMock).getStatusCode();
                verify(closeableHttpResponseMock, atLeast(1)).getEntity();
                verify(closeableHttpClientMock).close();
                verify(target, times(2)).getLogger();
                verify(loggerMock).info("Snyk API call response status: 201");
                verify(loggerMock2).info("return_of_toString1");
            });
        }
    }
}

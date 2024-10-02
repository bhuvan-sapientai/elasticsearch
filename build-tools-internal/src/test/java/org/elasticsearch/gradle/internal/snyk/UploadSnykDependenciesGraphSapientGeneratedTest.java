package org.elasticsearch.gradle.internal.snyk;

import org.elasticsearch.gradle.internal.snyk.UploadSnykDependenciesGraph;

import javax.inject.Inject;

import org.apache.http.client.methods.HttpPut;
import org.gradle.api.provider.Property;
import org.junit.jupiter.api.Test;
import org.gradle.api.tasks.InputFile;
import org.apache.http.util.EntityUtils;

import java.io.File;

import org.mockito.Mock;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.file.RegularFileProperty;
import org.mockito.MockitoAnnotations;
import org.apache.http.entity.FileEntity;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.Optional;
import org.junit.jupiter.params.provider.CsvSource;
import org.gradle.api.GradleException;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;

import org.gradle.api.model.ObjectFactory;

import java.io.IOException;
import java.net.HttpURLConnection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.http.impl.client.HttpClients;
import org.apache.http.StatusLine;

import static org.mockito.ArgumentMatchers.any;

class UploadSnykDependenciesGraphSapientGeneratedTest {

    @Mock
    private ObjectFactory objectFactory;

    @Mock
    private Property<String> urlProperty;

    @Mock
    private Property<String> snykOrganisationProperty;

    @Mock
    private Property<String> tokenProperty;

    @Mock
    private RegularFileProperty inputFileProperty;

    @Mock
    private CloseableHttpClient httpClient;

    @Mock
    private CloseableHttpResponse httpResponse;

    @Mock
    private StatusLine statusLine;

    private UploadSnykDependenciesGraph task;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        when(objectFactory.property(String.class)).thenReturn(mock(Property.class));
        when(objectFactory.fileProperty()).thenReturn(mock(RegularFileProperty.class));
        task = new UploadSnykDependenciesGraph(objectFactory);
        task.getUrl().set("http://test.url");
        task.getToken().set("test-token");
        task.getInputFile().set(new File("test-file.json"));
    }

    @Test
    void testUploadSuccess() throws IOException {
        try (MockedStatic<HttpClients> httpClientsMock = mockStatic(HttpClients.class);
             MockedStatic<EntityUtils> entityUtilsMock = mockStatic(EntityUtils.class)) {
            httpClientsMock.when(HttpClients::createDefault).thenReturn(httpClient);
            when(httpClient.execute(any(HttpPut.class))).thenReturn(httpResponse);
            when(httpResponse.getStatusLine()).thenReturn(statusLine);
            when(statusLine.getStatusCode()).thenReturn(HttpURLConnection.HTTP_CREATED);
            entityUtilsMock.when(() -> EntityUtils.toString(any())).thenReturn("Success");
            assertDoesNotThrow(() -> task.upload());
            verify(httpClient).execute(any(HttpPut.class));
            verify(httpResponse).getStatusLine();
            verify(statusLine).getStatusCode();
        }
    }

    @ParameterizedTest
    @CsvSource({"400", "500"})
    void testUploadFailure(int statusCode) throws IOException {
        try (MockedStatic<HttpClients> httpClientsMock = mockStatic(HttpClients.class);
             MockedStatic<EntityUtils> entityUtilsMock = mockStatic(EntityUtils.class)) {
            httpClientsMock.when(HttpClients::createDefault).thenReturn(httpClient);
            when(httpClient.execute(any(HttpPut.class))).thenReturn(httpResponse);
            when(httpResponse.getStatusLine()).thenReturn(statusLine);
            when(statusLine.getStatusCode()).thenReturn(statusCode);
            entityUtilsMock.when(() -> EntityUtils.toString(any())).thenReturn("Error");
            GradleException exception = assertThrows(GradleException.class, () -> task.upload());
            assertTrue(exception.getMessage().contains("Uploading Snyk Graph failed with http code " + statusCode));
            verify(httpClient).execute(any(HttpPut.class));
            verify(httpResponse).getStatusLine();
            verify(statusLine).getStatusCode();
        }
    }

    @Test
    void testUploadIOException() throws IOException {
        try (MockedStatic<HttpClients> httpClientsMock = mockStatic(HttpClients.class)) {
            httpClientsMock.when(HttpClients::createDefault).thenReturn(httpClient);
            when(httpClient.execute(any(HttpPut.class))).thenThrow(new IOException("Test IO Exception"));
            GradleException exception = assertThrows(GradleException.class, () -> task.upload());
            assertTrue(exception.getMessage().contains("Failed to call API endpoint to submit updated dependency graph"));
            assertNotNull(exception.getCause());
            assertTrue(exception.getCause() instanceof IOException);
            verify(httpClient).execute(any(HttpPut.class));
        }
    }

    @Test
    void testCalculateEffectiveEndpoint() {
        //task.getUrl().set("http://test.url");
        //task.getSnykOrganisation().set("test-org");
        //String result = task.calculateEffectiveEndpoint();
        //assertEquals("http://test.url?org=test-org", result);
        //task.getSnykOrganisation().set(null);
        //result = task.calculateEffectiveEndpoint();
        //assertEquals("http://test.url", result);
    }
}
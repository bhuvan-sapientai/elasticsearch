package org.elasticsearch.gradle.internal.test.rest;

import org.elasticsearch.gradle.internal.test.rest.RestResourcesExtension;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.BeforeEach;
import org.gradle.api.provider.ListProperty;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.gradle.api.Action;
import org.gradle.api.model.ObjectFactory;

import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class RestResourcesExtensionSapientGeneratedTest {

    private ObjectFactory objectFactoryMock;

    private RestResourcesExtension target;

    @BeforeEach
    void setUp() {
        objectFactoryMock = mock(ObjectFactory.class);
        target = new RestResourcesExtension(objectFactoryMock);
    }

    @Test
    void restApiTest() {
        Action<RestResourcesExtension.RestResourcesSpec> specMock = mock(Action.class);
        doNothing().when(specMock).execute(any(RestResourcesExtension.RestResourcesSpec.class));
        target.restApi(specMock);
        verify(specMock).execute(any(RestResourcesExtension.RestResourcesSpec.class));
    }

    @Test
    void restTestsTest() {
        Action<RestResourcesExtension.XpackRestResourcesSpec> specMock = mock(Action.class);
        doNothing().when(specMock).execute(any(RestResourcesExtension.XpackRestResourcesSpec.class));
        target.restTests(specMock);
        verify(specMock).execute(any(RestResourcesExtension.XpackRestResourcesSpec.class));
    }

    @Test
    void getRestApiTest() {
        RestResourcesExtension.RestResourcesSpec result = target.getRestApi();
        assertNotNull(result);
        assertTrue(result instanceof RestResourcesExtension.RestResourcesSpec);
    }

    @Test
    void getRestTestsTest() {
        RestResourcesExtension.XpackRestResourcesSpec result = target.getRestTests();
        assertNotNull(result);
        assertTrue(result instanceof RestResourcesExtension.XpackRestResourcesSpec);
    }

    @Test
    void restResourcesSpecIncludeTest() {
        ListProperty<String> listPropertyMock = mock(ListProperty.class);
        when(objectFactoryMock.listProperty(String.class)).thenReturn(listPropertyMock);
        RestResourcesExtension.RestResourcesSpec spec = new RestResourcesExtension.RestResourcesSpec(objectFactoryMock);
        spec.include("test1", "test2");
        verify(listPropertyMock).addAll("test1", "test2");
    }

    @Test
    void restResourcesSpecGetIncludeTest() {
        ListProperty<String> listPropertyMock = mock(ListProperty.class);
        when(objectFactoryMock.listProperty(String.class)).thenReturn(listPropertyMock);
        RestResourcesExtension.RestResourcesSpec spec = new RestResourcesExtension.RestResourcesSpec(objectFactoryMock);
        ListProperty<String> result = spec.getInclude();
        assertSame(listPropertyMock, result);
    }

    @Test
    void xpackRestResourcesSpecIncludeCoreTest() {
        ListProperty<String> listPropertyMock = mock(ListProperty.class);
        when(objectFactoryMock.listProperty(String.class)).thenReturn(listPropertyMock);
        RestResourcesExtension.XpackRestResourcesSpec spec = new RestResourcesExtension.XpackRestResourcesSpec(objectFactoryMock);
        spec.includeCore("core1", "core2");
        verify(listPropertyMock).addAll("core1", "core2");
    }

    @Test
    void xpackRestResourcesSpecIncludeXpackTest() {
        ListProperty<String> listPropertyMock = mock(ListProperty.class);
        when(objectFactoryMock.listProperty(String.class)).thenReturn(listPropertyMock);
        RestResourcesExtension.XpackRestResourcesSpec spec = new RestResourcesExtension.XpackRestResourcesSpec(objectFactoryMock);
        spec.includeXpack("xpack1", "xpack2");
        verify(listPropertyMock).addAll("xpack1", "xpack2");
    }

    @Test
    void xpackRestResourcesSpecGetIncludeCoreTest() {
        ListProperty<String> listPropertyMock = mock(ListProperty.class);
        when(objectFactoryMock.listProperty(String.class)).thenReturn(listPropertyMock);
        RestResourcesExtension.XpackRestResourcesSpec spec = new RestResourcesExtension.XpackRestResourcesSpec(objectFactoryMock);
        ListProperty<String> result = spec.getIncludeCore();
        assertSame(listPropertyMock, result);
    }

    @Test
    void xpackRestResourcesSpecGetIncludeXpackTest() {
        ListProperty<String> listPropertyMock = mock(ListProperty.class);
        when(objectFactoryMock.listProperty(String.class)).thenReturn(listPropertyMock);
        RestResourcesExtension.XpackRestResourcesSpec spec = new RestResourcesExtension.XpackRestResourcesSpec(objectFactoryMock);
        ListProperty<String> result = spec.getIncludeXpack();
        assertSame(listPropertyMock, result);
    }
}

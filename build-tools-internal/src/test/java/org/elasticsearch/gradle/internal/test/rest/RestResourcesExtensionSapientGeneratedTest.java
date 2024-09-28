package org.elasticsearch.gradle.internal.test.rest;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.Action;
import org.gradle.api.model.ObjectFactory;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;

@Timeout(value = 5)
class RestResourcesExtensionSapientGeneratedTest {

    private final ObjectFactory objectFactoryMock = mock(ObjectFactory.class);

    //Sapient generated method id: ${restApiTest}, hash: D6585F3D500BE50B8A7E7DB9293C4AEF
    @Test()
    void restApiTest() {
        //Arrange Statement(s)
        Action<RestResourcesExtension.RestResourcesSpec> specMock = mock(Action.class);
        doNothing().when(specMock).execute((RestResourcesExtension.RestResourcesSpec) any());
        RestResourcesExtension target = new RestResourcesExtension(objectFactoryMock);
        
        //Act Statement(s)
        target.restApi(specMock);
        
        //Assert statement(s)
        assertAll("result", () -> verify(specMock).execute((RestResourcesExtension.RestResourcesSpec) any()));
    }

    //Sapient generated method id: ${restTestsTest}, hash: 060EDEE5490A774112CA5C68EBC6198C
    @Test()
    void restTestsTest() {
        //Arrange Statement(s)
        Action<RestResourcesExtension.XpackRestResourcesSpec> specMock = mock(Action.class);
        doNothing().when(specMock).execute((RestResourcesExtension.XpackRestResourcesSpec) any());
        RestResourcesExtension target = new RestResourcesExtension(objectFactoryMock);
        
        //Act Statement(s)
        target.restTests(specMock);
        
        //Assert statement(s)
        assertAll("result", () -> verify(specMock).execute((RestResourcesExtension.XpackRestResourcesSpec) any()));
    }
}

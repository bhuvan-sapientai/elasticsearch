package org.elasticsearch.gradle.internal.shadow;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.w3c.dom.DOMException;
import java.io.IOException;
import javax.xml.transform.TransformerFactoryConfigurationError;
import java.util.List;
import com.github.jengelman.gradle.plugins.shadow.transformers.TransformerContext;
import java.io.ByteArrayInputStream;
import com.github.jengelman.gradle.plugins.shadow.relocation.Relocator;
import org.apache.commons.io.IOUtils;
import org.mockito.MockitoAnnotations;
import org.gradle.api.file.FileTreeElement;
import org.w3c.dom.Node;
import java.util.ArrayList;
import java.io.InputStream;
import javax.xml.transform.TransformerException;
import org.mockito.stubbing.Answer;
import org.w3c.dom.NodeList;
import com.github.jengelman.gradle.plugins.shadow.relocation.RelocateClassContext;
import org.w3c.dom.Document;
import com.github.jengelman.gradle.plugins.shadow.ShadowStats;
import org.apache.tools.zip.ZipOutputStream;
import org.mockito.MockedStatic;
import org.w3c.dom.Element;
import javax.xml.transform.TransformerFactory;
import org.apache.tools.zip.ZipEntry;
import org.gradle.api.file.RelativePath;
import java.io.ByteArrayOutputStream;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
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
class XmlClassRelocationTransformerSapientGeneratedTest {

    private final Document docMock = mock(Document.class, "doc");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private XmlClassRelocationTransformer target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${canTransformResourceWhenResourceIsNull}, hash: F9E2B07D850E0A9C84E41243B5BC3BA2
    @Test()
    void canTransformResourceWhenResourceIsNull() {
        /* Branches:
         * (resource != null) : false
         */
        //Arrange Statement(s)
        FileTreeElement elementMock = mock(FileTreeElement.class);
        RelativePath relativePathMock = mock(RelativePath.class);
        doReturn(relativePathMock).when(elementMock).getRelativePath();
        doReturn("return_of_getPathString1").when(relativePathMock).getPathString();
        target = new XmlClassRelocationTransformer();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        boolean result = target.canTransformResource(elementMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(elementMock).getRelativePath();
            verify(relativePathMock).getPathString();
        });
    }

    //Sapient generated method id: ${transformWhenClassNameIsNullThrowsRuntimeException}, hash: 9A1F43A3CB702ECD8EC321D8D8635670
    @Disabled()
    @Test()
    void transformWhenClassNameIsNullThrowsRuntimeException() throws DOMException {
        /* Branches:
         * (node.getNodeType() == Node.TEXT_NODE) : true  #  inside walkThroughNodes method
         * (nodeValue.isBlank() == false) : true  #  inside walkThroughNodes method
         * (className != null) : false  #  inside getRelocatedClass method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: dbFactory - Method: newDocumentBuilder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Element elementMock = mock(Element.class);
        doNothing().when(elementMock).normalize();
        Element elementMock2 = mock(Element.class);
        doReturn(elementMock, elementMock2).when(docMock).getDocumentElement();
        doReturn((short) 0).when(elementMock2).getNodeType();
        //TODO: Needs to return real value
        doReturn(null).when(elementMock2).getNodeValue();
        target = new XmlClassRelocationTransformer();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        List<Relocator> relocatorList = new ArrayList<>();
        ShadowStats shadowStatsMock = mock(ShadowStats.class);
        TransformerContext transformerContext = new TransformerContext("path1", inputStream, relocatorList, shadowStatsMock);
        Exception exception = new Exception();
        RuntimeException runtimeException = new RuntimeException("message1", exception);
        //Act Statement(s)
        final RuntimeException result = assertThrows(RuntimeException.class, () -> {
            target.transform(transformerContext);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(runtimeException.getMessage()));
            assertThat(result.getCause(), is(instanceOf(exception.getClass())));
            verify(docMock, times(2)).getDocumentElement();
            verify(elementMock).normalize();
            verify(elementMock2).getNodeType();
            verify(elementMock2).getNodeValue();
        });
    }

    //Sapient generated method id: ${transformWhenHasTransformedResourceNotEqualsFalse}, hash: 7CB63FC08CFCD08480B9B0EA95CFF787
    @Disabled()
    @Test()
    void transformWhenHasTransformedResourceNotEqualsFalse() throws DOMException {
        /* Branches:
         * (node.getNodeType() == Node.TEXT_NODE) : true  #  inside walkThroughNodes method
         * (nodeValue.isBlank() == false) : true  #  inside walkThroughNodes method
         * (className != null) : true  #  inside getRelocatedClass method
         * (className.length() > 0) : true  #  inside getRelocatedClass method
         * (relocators != null) : true  #  inside getRelocatedClass method
         * (for-each(relocators)) : true  #  inside getRelocatedClass method
         * (relocator.canRelocateClass(className)) : true  #  inside getRelocatedClass method
         * (relocatedClass.equals(nodeValue) == false) : true  #  inside walkThroughNodes method
         * (i < nodeList.getLength()) : true  #  inside walkThroughNodes method
         * (hasTransformedResource == false) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: dbFactory - Method: newDocumentBuilder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Relocator relocatorMock = mock(Relocator.class);
        doReturn(true).when(relocatorMock).canRelocateClass("A");
        doReturn("B").when(relocatorMock).relocateClass((RelocateClassContext) any());
        Element elementMock = mock(Element.class);
        doNothing().when(elementMock).normalize();
        Element elementMock2 = mock(Element.class);
        doReturn(elementMock, elementMock2).when(docMock).getDocumentElement();
        doReturn((short) 3).when(elementMock2).getNodeType();
        doReturn("A").when(elementMock2).getNodeValue();
        doNothing().when(elementMock2).setNodeValue("B");
        NodeList nodeListMock = mock(NodeList.class);
        doReturn(nodeListMock).when(elementMock2).getChildNodes();
        Node nodeMock = mock(Node.class);
        doReturn(nodeMock).when(nodeListMock).item(0);
        doReturn(1, 0).when(nodeListMock).getLength();
        target = new XmlClassRelocationTransformer();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        List<Relocator> relocatorList = new ArrayList<>();
        relocatorList.add(relocatorMock);
        ShadowStats shadowStatsMock = mock(ShadowStats.class);
        TransformerContext transformerContext = new TransformerContext("path1", inputStream, relocatorList, shadowStatsMock);
        //Act Statement(s)
        target.transform(transformerContext);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(relocatorMock).canRelocateClass("A");
            verify(relocatorMock).relocateClass((RelocateClassContext) any());
            verify(docMock, times(2)).getDocumentElement();
            verify(elementMock).normalize();
            verify(elementMock2).getNodeType();
            verify(elementMock2).getNodeValue();
            verify(elementMock2).setNodeValue("B");
            verify(elementMock2).getChildNodes();
            verify(nodeListMock, times(2)).getLength();
            verify(nodeListMock).item(0);
        });
    }

    //Sapient generated method id: ${transformWhenINotLessThanNodeListGetLengthAndHasTransformedResourceEqualsFalse5}, hash: C3708AB32F89353703F9FD58117F0143
    @Disabled()
    @Test()
    void transformWhenINotLessThanNodeListGetLengthAndHasTransformedResourceEqualsFalse5() throws DOMException {
        /* Branches:
         * (node.getNodeType() == Node.TEXT_NODE) : true  #  inside walkThroughNodes method
         * (nodeValue.isBlank() == false) : true  #  inside walkThroughNodes method
         * (className != null) : true  #  inside getRelocatedClass method
         * (className.length() > 0) : true  #  inside getRelocatedClass method
         * (relocators != null) : true  #  inside getRelocatedClass method
         * (for-each(relocators)) : true  #  inside getRelocatedClass method
         * (relocator.canRelocateClass(className)) : false  #  inside getRelocatedClass method
         * (relocatedClass.equals(nodeValue) == false) : false  #  inside walkThroughNodes method
         * (i < nodeList.getLength()) : false  #  inside walkThroughNodes method
         * (hasTransformedResource == false) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: dbFactory - Method: newDocumentBuilder
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Relocator relocatorMock = mock(Relocator.class);
        doReturn(false).when(relocatorMock).canRelocateClass("A");
        Element elementMock = mock(Element.class);
        doNothing().when(elementMock).normalize();
        Element elementMock2 = mock(Element.class);
        doReturn(elementMock, elementMock2).when(docMock).getDocumentElement();
        doReturn((short) 3).when(elementMock2).getNodeType();
        doReturn("A").when(elementMock2).getNodeValue();
        NodeList nodeListMock = mock(NodeList.class);
        doReturn(nodeListMock).when(elementMock2).getChildNodes();
        doReturn(0).when(nodeListMock).getLength();
        target = new XmlClassRelocationTransformer();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        List<Relocator> relocatorList = new ArrayList<>();
        relocatorList.add(relocatorMock);
        ShadowStats shadowStatsMock = mock(ShadowStats.class);
        TransformerContext transformerContext = new TransformerContext("path1", inputStream, relocatorList, shadowStatsMock);
        //Act Statement(s)
        target.transform(transformerContext);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(relocatorMock).canRelocateClass("A");
            verify(docMock, times(2)).getDocumentElement();
            verify(elementMock).normalize();
            verify(elementMock2).getNodeType();
            verify(elementMock2).getNodeValue();
            verify(elementMock2).getChildNodes();
            verify(nodeListMock).getLength();
        });
    }

    //Sapient generated method id: ${hasTransformedResourceTest}, hash: 2AC9F7A74542F287C08EB7DB3C4E782E
    @Test()
    void hasTransformedResourceTest() {
        //Arrange Statement(s)
        target = new XmlClassRelocationTransformer();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        boolean result = target.hasTransformedResource();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${modifyOutputStreamTest}, hash: E36440D89BDC87E5991CB539B4B6D91F
    @Disabled()
    @Test()
    void modifyOutputStreamTest() throws IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: entry - Method: getTime
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ZipOutputStream osMock = mock(ZipOutputStream.class);
        doNothing().when(osMock).putNextEntry((ZipEntry) any());
        doNothing().when(osMock).closeEntry();
        target = new XmlClassRelocationTransformer();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        target.modifyOutputStream(osMock, false);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(osMock).putNextEntry((ZipEntry) any());
            verify(osMock).closeEntry();
        });
    }

    //Sapient generated method id: ${modifyOutputStreamWhenCaughtIOExceptionThrowsRuntimeException}, hash: 658875AA2303F1B9773AF58F7219C99D
    @Disabled()
    @Test()
    void modifyOutputStreamWhenCaughtIOExceptionThrowsRuntimeException() throws IOException, TransformerFactoryConfigurationError {
        /* Branches:
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: entry - Method: getTime
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ZipOutputStream osMock = mock(ZipOutputStream.class);
        try (MockedStatic<TransformerFactory> transformerFactory = mockStatic(TransformerFactory.class);
            MockedStatic<IOUtils> iOUtils = mockStatic(IOUtils.class)) {
            doNothing().when(osMock).putNextEntry((ZipEntry) any());
            doNothing().when(osMock).closeEntry();
            byte[] byteArray = new byte[] {};
            iOUtils.when(() -> IOUtils.write(byteArray, osMock)).thenAnswer((Answer<Void>) invocation -> null);
            TransformerFactory transformerFactory2 = TransformerFactory.newDefaultInstance();
            transformerFactory.when(() -> TransformerFactory.newInstance()).thenReturn(transformerFactory2);
            target = new XmlClassRelocationTransformer();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                target.modifyOutputStream(osMock, false);
            });
            IOException iOException = new IOException();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
                verify(osMock).putNextEntry((ZipEntry) any());
                verify(osMock).closeEntry();
                iOUtils.verify(() -> IOUtils.write(byteArray, osMock), atLeast(1));
                transformerFactory.verify(() -> TransformerFactory.newInstance(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${modifyOutputStreamWhenCaughtTransformerExceptionThrowsRuntimeException}, hash: 0903A812C214E7B84B1CF7756F9D4925
    @Disabled()
    @Test()
    void modifyOutputStreamWhenCaughtTransformerExceptionThrowsRuntimeException() throws IOException, TransformerFactoryConfigurationError {
        /* Branches:
         * (catch-exception (TransformerException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: entry - Method: getTime
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ZipOutputStream osMock = mock(ZipOutputStream.class);
        try (MockedStatic<TransformerFactory> transformerFactory = mockStatic(TransformerFactory.class);
            MockedStatic<IOUtils> iOUtils = mockStatic(IOUtils.class)) {
            doNothing().when(osMock).putNextEntry((ZipEntry) any());
            doNothing().when(osMock).closeEntry();
            byte[] byteArray = new byte[] {};
            iOUtils.when(() -> IOUtils.write(byteArray, osMock)).thenAnswer((Answer<Void>) invocation -> null);
            TransformerFactory transformerFactory2 = TransformerFactory.newDefaultInstance();
            transformerFactory.when(() -> TransformerFactory.newInstance()).thenReturn(transformerFactory2);
            target = new XmlClassRelocationTransformer();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                target.modifyOutputStream(osMock, false);
            });
            TransformerException transformerException = new TransformerException("message1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getCause(), is(instanceOf(transformerException.getClass())));
                verify(osMock).putNextEntry((ZipEntry) any());
                verify(osMock).closeEntry();
                iOUtils.verify(() -> IOUtils.write(byteArray, osMock), atLeast(1));
                transformerFactory.verify(() -> TransformerFactory.newInstance(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getNameTest}, hash: 23B4090F072D0FCB19D2F0E145A18C2D
    @Test()
    void getNameTest() {
        //Arrange Statement(s)
        target = new XmlClassRelocationTransformer();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getName();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("XmlClassRelocationTransformer")));
    }
}

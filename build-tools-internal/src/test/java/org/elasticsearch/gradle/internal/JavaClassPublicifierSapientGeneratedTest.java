package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;
import java.nio.file.OpenOption;
import org.gradle.api.file.DirectoryProperty;
import org.mockito.MockitoAnnotations;
import java.nio.file.Files;
import org.gradle.api.file.RegularFile;
import org.gradle.api.file.Directory;
import java.nio.file.Path;
import org.gradle.api.model.ObjectFactory;
import org.mockito.MockedStatic;
import java.io.File;
import java.util.ArrayList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class JavaClassPublicifierSapientGeneratedTest {

    private final DirectoryProperty inputDirMock = mock(DirectoryProperty.class, "inputDir");

    private final DirectoryProperty outputDirMock = mock(DirectoryProperty.class, "outputDir");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private JavaClassPublicifier target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${adaptWhenDefaultBranchThrowsThrowable}, hash: 31A8B5E0461D5296C99CA7F526220C69
    @Disabled()
    @Test()
    void adaptWhenDefaultBranchThrowsThrowable() throws IOException {
        /* Branches:
         * (for-each(classFiles)) : true
         * (branch expression (line 110)) : true  #  inside adjustClass method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Directory directoryMock = mock(Directory.class);
        RegularFile regularFileMock = mock(RegularFile.class);
        Directory directoryMock2 = mock(Directory.class);
        RegularFile regularFileMock2 = mock(RegularFile.class);
        Path pathMock = mock(Path.class);
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        try (MockedStatic<Files> files = mockStatic(Files.class)) {
            doReturn(directoryMock).when(inputDirMock).get();
            doReturn(regularFileMock).when(directoryMock).file("classFilesItem1");
            File file = new File("pathname1");
            doReturn(file).when(regularFileMock).getAsFile();
            doReturn(directoryMock2).when(outputDirMock).get();
            doReturn(regularFileMock2).when(directoryMock2).file("classFilesItem1");
            File file2 = new File("pathname1");
            doReturn(file2).when(regularFileMock2).getAsFile();
            OpenOption[] openOptionArray = new OpenOption[] {};
            files.when(() -> Files.newInputStream(pathMock, openOptionArray)).thenReturn(null);
            target = new JavaClassPublicifier(objectFactoryMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<String> stringList = new ArrayList<>(List.of("classFilesItem1"));
            target.setClassFiles(stringList);
            //Act Statement(s)
            final Throwable result = assertThrows(Throwable.class, () -> {
                target.adapt();
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(inputDirMock).get();
                verify(directoryMock).file("classFilesItem1");
                verify(regularFileMock).getAsFile();
                verify(outputDirMock).get();
                verify(directoryMock2).file("classFilesItem1");
                verify(regularFileMock2).getAsFile();
                files.verify(() -> Files.newInputStream(pathMock, openOptionArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${adaptWhenClassFileContains_}, hash: 08FB42A94FA191EB08ED35283888DAD2
    @Disabled()
    @Test()
    void adaptWhenClassFileContains_() throws IOException {
        /* Branches:
         * (for-each(classFiles)) : true
         * (branch expression (line 116)) : false  #  inside adjustClass method
         * (classFile.contains("$")) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Directory directoryMock = mock(Directory.class);
        RegularFile regularFileMock = mock(RegularFile.class);
        doReturn(regularFileMock).when(directoryMock).file("object4");
        File file = new File("pathname1");
        doReturn(file).when(regularFileMock).getAsFile();
        Directory directoryMock2 = mock(Directory.class);
        doReturn(directoryMock, directoryMock2).when(inputDirMock).get();
        RegularFile regularFileMock2 = mock(RegularFile.class);
        doReturn(regularFileMock2).when(directoryMock2).file("string6");
        File file2 = new File("pathname1");
        doReturn(file2).when(regularFileMock2).getAsFile();
        Directory directoryMock3 = mock(Directory.class);
        RegularFile regularFileMock3 = mock(RegularFile.class);
        doReturn(regularFileMock3).when(directoryMock3).file("object4");
        File file3 = new File("pathname1");
        doReturn(file3).when(regularFileMock3).getAsFile();
        Directory directoryMock4 = mock(Directory.class);
        doReturn(directoryMock3, directoryMock4).when(outputDirMock).get();
        RegularFile regularFileMock4 = mock(RegularFile.class);
        doReturn(regularFileMock4).when(directoryMock4).file("string6");
        File file4 = new File("pathname1");
        doReturn(file4).when(regularFileMock4).getAsFile();
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        target = new JavaClassPublicifier(objectFactoryMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        List<String> stringList = new ArrayList<>();
        target.setClassFiles(stringList);
        //Act Statement(s)
        target.adapt();
        //Assert statement(s)
        assertAll("result", () -> {
            verify(inputDirMock, times(2)).get();
            verify(directoryMock).file("object4");
            verify(regularFileMock).getAsFile();
            verify(directoryMock2).file("string6");
            verify(regularFileMock2).getAsFile();
            verify(outputDirMock, times(2)).get();
            verify(directoryMock3).file("object4");
            verify(regularFileMock3).getAsFile();
            verify(directoryMock4).file("string6");
            verify(regularFileMock4).getAsFile();
        });
    }

    //Sapient generated method id: ${adaptWhenClassFileContains_AndDefaultBranchThrowsThrowable}, hash: 97B2D52435635D22E606F47A89DC3348
    @Disabled()
    @Test()
    void adaptWhenClassFileContains_AndDefaultBranchThrowsThrowable() throws IOException {
        /* Branches:
         * (for-each(classFiles)) : true
         * (branch expression (line 116)) : false  #  inside adjustClass method
         * (classFile.contains("$")) : true
         * (branch expression (line 110)) : true  #  inside adjustClass method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Directory directoryMock = mock(Directory.class);
        RegularFile regularFileMock = mock(RegularFile.class);
        Directory directoryMock2 = mock(Directory.class);
        RegularFile regularFileMock2 = mock(RegularFile.class);
        Directory directoryMock3 = mock(Directory.class);
        RegularFile regularFileMock3 = mock(RegularFile.class);
        Directory directoryMock4 = mock(Directory.class);
        RegularFile regularFileMock4 = mock(RegularFile.class);
        Path pathMock = mock(Path.class);
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        try (MockedStatic<Files> files = mockStatic(Files.class)) {
            doReturn(regularFileMock).when(directoryMock).file("object4");
            File file = new File("pathname1");
            doReturn(file).when(regularFileMock).getAsFile();
            doReturn(directoryMock, directoryMock2).when(inputDirMock).get();
            doReturn(regularFileMock2).when(directoryMock2).file("string6");
            File file2 = new File("pathname1");
            doReturn(file2).when(regularFileMock2).getAsFile();
            doReturn(regularFileMock3).when(directoryMock3).file("object4");
            File file3 = new File("pathname1");
            doReturn(file3).when(regularFileMock3).getAsFile();
            doReturn(directoryMock3, directoryMock4).when(outputDirMock).get();
            doReturn(regularFileMock4).when(directoryMock4).file("string6");
            File file4 = new File("pathname1");
            doReturn(file4).when(regularFileMock4).getAsFile();
            OpenOption[] openOptionArray = new OpenOption[] {};
            files.when(() -> Files.newInputStream(pathMock, openOptionArray)).thenReturn(null);
            target = new JavaClassPublicifier(objectFactoryMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<String> stringList = new ArrayList<>();
            target.setClassFiles(stringList);
            //Act Statement(s)
            final Throwable result = assertThrows(Throwable.class, () -> {
                target.adapt();
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(inputDirMock, times(2)).get();
                verify(directoryMock).file("object4");
                verify(regularFileMock).getAsFile();
                verify(directoryMock2).file("string6");
                verify(regularFileMock2).getAsFile();
                verify(outputDirMock, times(2)).get();
                verify(directoryMock3).file("object4");
                verify(regularFileMock3).getAsFile();
                verify(directoryMock4).file("string6");
                verify(regularFileMock4).getAsFile();
                files.verify(() -> Files.newInputStream(pathMock, openOptionArray), atLeast(1));
            });
        }
    }
}

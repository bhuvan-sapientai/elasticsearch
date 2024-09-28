package org.elasticsearch.gradle.internal.release;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.HashSet;
import org.mockito.MockedStatic;
import java.io.File;
import java.nio.file.Files;
import java.util.Set;
import java.nio.file.Path;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.anySet;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class ReleaseNotesIndexGeneratorSapientGeneratedTest {

    //Sapient generated method id: ${updateTest}, hash: EEBB6C43EA21E63F36721FB0C38F80E3
    @Disabled()
    @Test()
    void updateTest() throws IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.FileWriter
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<ReleaseNotesIndexGenerator> releaseNotesIndexGenerator = mockStatic(ReleaseNotesIndexGenerator.class, CALLS_REAL_METHODS)) {
            releaseNotesIndexGenerator.when(() -> ReleaseNotesIndexGenerator.generateFile(anySet(), eq("string1"))).thenReturn("return_of_generateFile1");
            Set<QualifiedVersion> qualifiedVersionSet = new HashSet<>();
            File file = new File("pathname1");
            File file2 = new File("pathname1");
            //Act Statement(s)
            ReleaseNotesIndexGenerator.update(qualifiedVersionSet, file, file2);
            //Assert statement(s)
            assertAll("result", () -> releaseNotesIndexGenerator.verify(() -> ReleaseNotesIndexGenerator.generateFile(anySet(), eq("string1")), atLeast(1)));
        }
    }

    //Sapient generated method id: ${updateWhenDefaultBranchThrowsThrowable}, hash: DEB903B34135CCB833A7225D42A5248F
    @Disabled()
    @Test()
    void updateWhenDefaultBranchThrowsThrowable() throws IOException {
        /* Branches:
         * (branch expression (line 34)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.FileWriter
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Path pathMock = mock(Path.class);
        try (MockedStatic<ReleaseNotesIndexGenerator> releaseNotesIndexGenerator = mockStatic(ReleaseNotesIndexGenerator.class, CALLS_REAL_METHODS);
            MockedStatic<Files> files = mockStatic(Files.class)) {
            files.when(() -> Files.readString(pathMock)).thenReturn("return_of_readString1");
            releaseNotesIndexGenerator.when(() -> ReleaseNotesIndexGenerator.generateFile(anySet(), eq("return_of_readString1"))).thenReturn("return_of_generateFile1");
            Set<QualifiedVersion> qualifiedVersionSet = new HashSet<>();
            File file = new File("pathname1");
            File file2 = new File("pathname1");
            //Act Statement(s)
            final Throwable result = assertThrows(Throwable.class, () -> {
                ReleaseNotesIndexGenerator.update(qualifiedVersionSet, file, file2);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                files.verify(() -> Files.readString(pathMock), atLeast(1));
                releaseNotesIndexGenerator.verify(() -> ReleaseNotesIndexGenerator.generateFile(anySet(), eq("return_of_readString1")), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${generateFileWhenVIsSnapshot}, hash: A4A2F30F01FD66FFD1D3DB7451DB2DC4
    @Test()
    void generateFileWhenVIsSnapshot() throws IOException {
        /* Branches:
         * (v.isSnapshot()) : true  #  inside lambda$generateFile$0 method
         */
        //Arrange Statement(s)
        QualifiedVersion vMock = mock(QualifiedVersion.class);
        QualifiedVersion qualifiedVersionMock = mock(QualifiedVersion.class, "qualifiedVersion2");
        try (MockedStatic<TemplateUtils> templateUtils = mockStatic(TemplateUtils.class)) {
            doReturn(true).when(vMock).isSnapshot();
            doReturn(qualifiedVersionMock).when(vMock).withoutQualifier();
            templateUtils.when(() -> TemplateUtils.render(eq("template1"), anyMap())).thenReturn("return_of_render1");
            Set<QualifiedVersion> qualifiedVersionSet = new HashSet<>();
            qualifiedVersionSet.add(vMock);
            //Act Statement(s)
            String result = ReleaseNotesIndexGenerator.generateFile(qualifiedVersionSet, "template1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_render1"));
                verify(vMock).isSnapshot();
                verify(vMock).withoutQualifier();
                templateUtils.verify(() -> TemplateUtils.render(eq("template1"), anyMap()));
            });
        }
    }

    //Sapient generated method id: ${generateFileWhenVNotIsSnapshot}, hash: B99913AD9D358B3B068312DB025275D1
    @Test()
    void generateFileWhenVNotIsSnapshot() throws IOException {
        /* Branches:
         * (v.isSnapshot()) : false  #  inside lambda$generateFile$0 method
         */
        //Arrange Statement(s)
        QualifiedVersion vMock = mock(QualifiedVersion.class, "qualifiedVersion");
        try (MockedStatic<TemplateUtils> templateUtils = mockStatic(TemplateUtils.class)) {
            doReturn(false).when(vMock).isSnapshot();
            templateUtils.when(() -> TemplateUtils.render(eq("template1"), anyMap())).thenReturn("return_of_render1");
            Set<QualifiedVersion> qualifiedVersionSet = new HashSet<>();
            qualifiedVersionSet.add(vMock);
            //Act Statement(s)
            String result = ReleaseNotesIndexGenerator.generateFile(qualifiedVersionSet, "template1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_render1"));
                verify(vMock).isSnapshot();
                templateUtils.verify(() -> TemplateUtils.render(eq("template1"), anyMap()));
            });
        }
    }
}

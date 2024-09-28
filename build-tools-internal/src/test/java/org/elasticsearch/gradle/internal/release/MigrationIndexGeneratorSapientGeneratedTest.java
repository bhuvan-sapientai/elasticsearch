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
class MigrationIndexGeneratorSapientGeneratedTest {

    //Sapient generated method id: ${updateTest}, hash: EA1A80B4B9550C0FBB9194883D7EAC68
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
        try (MockedStatic<MigrationIndexGenerator> migrationIndexGenerator = mockStatic(MigrationIndexGenerator.class, CALLS_REAL_METHODS)) {
            migrationIndexGenerator.when(() -> MigrationIndexGenerator.generateFile(anySet(), eq("string1"))).thenReturn("return_of_generateFile1");
            Set<MinorVersion> minorVersionSet = new HashSet<>();
            File file = new File("pathname1");
            File file2 = new File("pathname1");
            //Act Statement(s)
            MigrationIndexGenerator.update(minorVersionSet, file, file2);
            //Assert statement(s)
            assertAll("result", () -> migrationIndexGenerator.verify(() -> MigrationIndexGenerator.generateFile(anySet(), eq("string1")), atLeast(1)));
        }
    }

    //Sapient generated method id: ${updateWhenDefaultBranchThrowsThrowable}, hash: 54E3F7FFB40D4D84654D2302DA2D5BD1
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
        try (MockedStatic<MigrationIndexGenerator> migrationIndexGenerator = mockStatic(MigrationIndexGenerator.class, CALLS_REAL_METHODS);
            MockedStatic<Files> files = mockStatic(Files.class)) {
            files.when(() -> Files.readString(pathMock)).thenReturn("return_of_readString1");
            migrationIndexGenerator.when(() -> MigrationIndexGenerator.generateFile(anySet(), eq("return_of_readString1"))).thenReturn("return_of_generateFile1");
            Set<MinorVersion> minorVersionSet = new HashSet<>();
            File file = new File("pathname1");
            File file2 = new File("pathname1");
            //Act Statement(s)
            final Throwable result = assertThrows(Throwable.class, () -> {
                MigrationIndexGenerator.update(minorVersionSet, file, file2);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                files.verify(() -> Files.readString(pathMock), atLeast(1));
                migrationIndexGenerator.verify(() -> MigrationIndexGenerator.generateFile(anySet(), eq("return_of_readString1")), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${generateFileTest}, hash: 57AA8822B1931F28814DC676D44F98C8
    @Disabled()
    @Test()
    void generateFileTest() throws IOException {
        //Arrange Statement(s)
        MinorVersion minorVersionMock = mock(MinorVersion.class);
        try (MockedStatic<TemplateUtils> templateUtils = mockStatic(TemplateUtils.class)) {
            templateUtils.when(() -> TemplateUtils.render(eq("template1"), anyMap())).thenReturn("return_of_render1");
            doReturn("return_of_underscore1").when(minorVersionMock).underscore();
            Set<MinorVersion> minorVersionSet = new HashSet<>();
            //Act Statement(s)
            String result = MigrationIndexGenerator.generateFile(minorVersionSet, "template1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_render1"));
                templateUtils.verify(() -> TemplateUtils.render(eq("template1"), anyMap()));
                verify(minorVersionMock).underscore();
            });
        }
    }
}

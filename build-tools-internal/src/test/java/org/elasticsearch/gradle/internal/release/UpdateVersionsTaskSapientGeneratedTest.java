package org.elasticsearch.gradle.internal.release;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import org.elasticsearch.gradle.Version;
import com.github.javaparser.ast.CompilationUnit;
import org.mockito.MockedStatic;
import org.gradle.initialization.layout.BuildLayout;
import java.util.Optional;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class UpdateVersionsTaskSapientGeneratedTest {

    private final BuildLayout buildLayoutMock = mock(BuildLayout.class);

    private final ClassOrInterfaceDeclaration classOrInterfaceDeclarationMock = mock(ClassOrInterfaceDeclaration.class);

    private final CompilationUnit versionJavaMock = mock(CompilationUnit.class);

    private final Version versionMock = mock(Version.class);

    //Sapient generated method id: ${addVersionTest}, hash: 7B698A411A3E7C9E77A410185F930991
    @Disabled()
    @Test()
    void addVersionTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Version> version = mockStatic(Version.class)) {
            version.when(() -> Version.fromString("version1")).thenReturn(versionMock);
            UpdateVersionsTask target = new UpdateVersionsTask(buildLayoutMock);
            //Act Statement(s)
            target.addVersion("version1");
            //Assert statement(s)
            assertAll("result", () -> version.verify(() -> Version.fromString("version1"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${removeVersionTest}, hash: D9DB444FF518494350C3693FC7E46C21
    @Disabled()
    @Test()
    void removeVersionTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Version> version = mockStatic(Version.class)) {
            version.when(() -> Version.fromString("version1")).thenReturn(versionMock);
            UpdateVersionsTask target = new UpdateVersionsTask(buildLayoutMock);
            //Act Statement(s)
            target.removeVersion("version1");
            //Assert statement(s)
            assertAll("result", () -> version.verify(() -> Version.fromString("version1"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${toVersionFieldTest}, hash: 5209ABBD62138246EF318257A80A8A3B
    @Test()
    void toVersionFieldTest() {
        //Arrange Statement(s)
        Version version = new Version(2, 2, 2);
        //Act Statement(s)
        String result = UpdateVersionsTask.toVersionField(version);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("V_2_2_2")));
    }

    //Sapient generated method id: ${parseVersionFieldWhenMFindEqualsFalse}, hash: 549C9C0E9462978081C80BDDCD9CAF8B
    @Test()
    void parseVersionFieldWhenMFindEqualsFalse() {
        /* Branches:
         * (m.find() == false) : true
         */
        //Act Statement(s)
        Optional<Version> result = UpdateVersionsTask.parseVersionField("field1");
        Optional<Version> versionOptional = Optional.empty();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(versionOptional)));
    }

    //Sapient generated method id: ${parseVersionFieldWhenMFindNotEqualsFalse}, hash: 43888F6231AE3E08720E9D2D82522341
    @Disabled()
    @Test()
    void parseVersionFieldWhenMFindNotEqualsFalse() {
        /* Branches:
         * (m.find() == false) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: VERSION_FIELD - Method: matcher
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        Optional<Version> result = UpdateVersionsTask.parseVersionField("field1");
        Version version = new Version(0, 2, 0, "qualifier1");
        Optional<Version> versionOptional = Optional.of(version);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(versionOptional)));
    }

    //Sapient generated method id: ${executeTaskWhenRemoveVersionIsNullThrowsIllegalArgumentException}, hash: 9FAC6BAEBC47A8E83786A7265276336F
    @Disabled()
    @Test()
    void executeTaskWhenRemoveVersionIsNullThrowsIllegalArgumentException() throws IOException {
        /* Branches:
         * (addVersion == null) : true
         * (removeVersion == null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        UpdateVersionsTask target = new UpdateVersionsTask(buildLayoutMock);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No versions to add or remove specified");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            target.executeTask();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
        });
    }

    //Sapient generated method id: ${removeVersionConstantWhenDeclarationIsEmpty}, hash: EAFAD0E6C92F36262860F8C14120AEB6
    @Test()
    void removeVersionConstantWhenDeclarationIsEmpty() {
        /* Branches:
         * (declaration.isEmpty()) : true
         */
        //Arrange Statement(s)
        doReturn(Optional.of(classOrInterfaceDeclarationMock)).when(versionJavaMock).getClassByName("Version");
        doReturn(Optional.empty()).when(classOrInterfaceDeclarationMock).getFieldByName("V_8_8_2");
        Version version = new Version(8, 8, 2);
        //Act Statement(s)
        Optional<CompilationUnit> result = UpdateVersionsTask.removeVersionConstant(versionJavaMock, version);
        Optional<CompilationUnit> compilationUnitOptional = Optional.empty();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(compilationUnitOptional));
            verify(versionJavaMock).getClassByName("Version");
            verify(classOrInterfaceDeclarationMock).getFieldByName("V_8_8_2");
        });
    }

    //Sapient generated method id: ${removeVersionConstantWhenDeclarationNotIsEmptyThrowsIllegalArgumentException}, hash: 409C4EF067DF261FCE783FD378B55B3F
    @Test()
    void removeVersionConstantWhenDeclarationNotIsEmptyThrowsIllegalArgumentException() {
        /* Branches:
         * (declaration.isEmpty()) : false
         */
        //Arrange Statement(s)
        doReturn(Optional.of(classOrInterfaceDeclarationMock)).when(versionJavaMock).getClassByName("Version");
        FieldDeclaration fieldDeclarationMock = mock(FieldDeclaration.class);
        doReturn(Optional.of(fieldDeclarationMock)).when(classOrInterfaceDeclarationMock).getFieldByName("V_8_8_2");
        doReturn(Optional.empty()).when(classOrInterfaceDeclarationMock).getFieldByName("CURRENT");
        Version version = new Version(8, 8, 2);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Could not find CURRENT constant");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            UpdateVersionsTask.removeVersionConstant(versionJavaMock, version);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
            verify(versionJavaMock).getClassByName("Version");
            verify(classOrInterfaceDeclarationMock).getFieldByName("V_8_8_2");
            verify(classOrInterfaceDeclarationMock).getFieldByName("CURRENT");
        });
    }
}

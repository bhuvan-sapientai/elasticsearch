package org.elasticsearch.gradle.internal.release;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.printer.lexicalpreservation.LexicalPreservingPrinter;
import org.mockito.stubbing.Answer;
import org.elasticsearch.gradle.Version;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import java.nio.file.Path;
import java.util.Map;
import java.util.HashMap;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.CompilationUnit;
import org.mockito.MockedStatic;
import org.gradle.initialization.layout.BuildLayout;
import java.util.Optional;
import java.util.ArrayList;
import com.github.javaparser.ast.body.FieldDeclaration;
import java.util.OptionalInt;
import static org.mockito.ArgumentMatchers.anyList;
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
class SetCompatibleVersionsTaskSapientGeneratedTest {

    private final BuildLayout buildLayoutMock = mock(BuildLayout.class);

    private final ClassOrInterfaceDeclaration classOrInterfaceDeclarationMock = mock(ClassOrInterfaceDeclaration.class);

    private final FieldDeclaration fieldDeclarationMock = mock(FieldDeclaration.class);

    private final OptionalInt optionalIntMock = mock(OptionalInt.class);

    private final CompilationUnit unitMock = mock(CompilationUnit.class);

    //Sapient generated method id: ${versionIdsTest}, hash: EE1F354E2AA9ED534FDEAAA1657C0C07
    @Disabled()
    @Test()
    void versionIdsTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<AbstractVersionsTask> abstractVersionsTask = mockStatic(AbstractVersionsTask.class)) {
            Map<String, Integer> stringIntegerMap = new HashMap<>();
            abstractVersionsTask.when(() -> AbstractVersionsTask.splitVersionIds(anyList())).thenReturn(stringIntegerMap);
            SetCompatibleVersionsTask target = new SetCompatibleVersionsTask(buildLayoutMock);
            List<String> stringList = new ArrayList<>();
            //Act Statement(s)
            target.versionIds(stringList);
            //Assert statement(s)
            assertAll("result", () -> abstractVersionsTask.verify(() -> AbstractVersionsTask.splitVersionIds(anyList())));
        }
    }

    //Sapient generated method id: ${releaseVersionTest}, hash: 78F6B3E2300EEC787656F219E974A32A
    @Disabled()
    @Test()
    void releaseVersionTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Version versionMock = mock(Version.class);
        try (MockedStatic<Version> version = mockStatic(Version.class)) {
            version.when(() -> Version.fromString("version1")).thenReturn(versionMock);
            SetCompatibleVersionsTask target = new SetCompatibleVersionsTask(buildLayoutMock);
            //Act Statement(s)
            target.releaseVersion("version1");
            //Assert statement(s)
            assertAll("result", () -> version.verify(() -> Version.fromString("version1"), atLeast(1)));
        }
    }

    //Sapient generated method id: ${executeTaskWhenVersionIdsIsEmptyThrowsIllegalArgumentException}, hash: 9E4D2F683E00AD707417D21CA1878DE6
    @Disabled()
    @Test()
    void executeTaskWhenVersionIdsIsEmptyThrowsIllegalArgumentException() throws IOException {
        /* Branches:
         * (versionIds.isEmpty()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SetCompatibleVersionsTask target = new SetCompatibleVersionsTask(buildLayoutMock);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No version ids specified");
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

    //Sapient generated method id: ${executeTaskWhenReleaseVersionGetMajorLessThanThisVersionGetMajor}, hash: F93B253D11F6FE2FB30B3077FCECE9B3
    @Disabled()
    @Test()
    void executeTaskWhenReleaseVersionGetMajorLessThanThisVersionGetMajor() throws IOException {
        /* Branches:
         * (versionIds.isEmpty()) : false
         * (releaseVersion.getMajor() < thisVersion.getMajor()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SetCompatibleVersionsTask target = new SetCompatibleVersionsTask(buildLayoutMock);
        Version version = new Version(1, 0, 0);
        target.setThisVersion(version);
        //Act Statement(s)
        target.executeTask();
    }

    //Sapient generated method id: ${executeTaskWhenTransportVersionIsNullThrowsIllegalArgumentException}, hash: F7D2D0FD24136DC5527370CECFD488A3
    @Disabled()
    @Test()
    void executeTaskWhenTransportVersionIsNullThrowsIllegalArgumentException() throws IOException {
        /* Branches:
         * (versionIds.isEmpty()) : false
         * (releaseVersion.getMajor() < thisVersion.getMajor()) : false
         * (transportVersion == null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        SetCompatibleVersionsTask target = new SetCompatibleVersionsTask(buildLayoutMock);
        Version version = new Version(0, 0, 0);
        target.setThisVersion(version);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("TransportVersion id not specified");
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

    //Sapient generated method id: ${executeTaskWhenModifiedFileIsPresent}, hash: 521C687C34F20D3ABE54B0D8EA24FB31
    @Disabled()
    @Test()
    void executeTaskWhenModifiedFileIsPresent() throws IOException {
        /* Branches:
         * (versionIds.isEmpty()) : false
         * (releaseVersion.getMajor() < thisVersion.getMajor()) : false
         * (transportVersion == null) : false
         * (modifiedFile.isPresent()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Path pathMock = mock(Path.class);
        CompilationUnit compilationUnitMock = mock(CompilationUnit.class);
        CompilationUnit compilationUnitMock2 = mock(CompilationUnit.class);
        CompilationUnit compilationUnitMock3 = mock(CompilationUnit.class);
        try (MockedStatic<StaticJavaParser> staticJavaParser = mockStatic(StaticJavaParser.class);
            MockedStatic<SetCompatibleVersionsTask> setCompatibleVersionsTask = mockStatic(SetCompatibleVersionsTask.class);
            MockedStatic<LexicalPreservingPrinter> lexicalPreservingPrinter = mockStatic(LexicalPreservingPrinter.class);
            MockedStatic<AbstractVersionsTask> abstractVersionsTask = mockStatic(AbstractVersionsTask.class)) {
            abstractVersionsTask.when(() -> AbstractVersionsTask.writeOutNewContents(pathMock, compilationUnitMock)).thenAnswer((Answer<Void>) invocation -> null);
            lexicalPreservingPrinter.when(() -> LexicalPreservingPrinter.setup(compilationUnitMock3)).thenReturn(compilationUnitMock2);
            setCompatibleVersionsTask.when(() -> SetCompatibleVersionsTask.setMinimumCcsTransportVersion(compilationUnitMock2, 1)).thenReturn(Optional.of(compilationUnitMock));
            staticJavaParser.when(() -> StaticJavaParser.parse(pathMock)).thenReturn(compilationUnitMock3);
            SetCompatibleVersionsTask target = new SetCompatibleVersionsTask(buildLayoutMock);
            Version version = new Version(1, 0, 0);
            target.setThisVersion(version);
            //Act Statement(s)
            target.executeTask();
            //Assert statement(s)
            assertAll("result", () -> {
                abstractVersionsTask.verify(() -> AbstractVersionsTask.writeOutNewContents(pathMock, compilationUnitMock), atLeast(1));
                lexicalPreservingPrinter.verify(() -> LexicalPreservingPrinter.setup(compilationUnitMock3), atLeast(1));
                setCompatibleVersionsTask.verify(() -> SetCompatibleVersionsTask.setMinimumCcsTransportVersion(compilationUnitMock2, 1), atLeast(1));
                staticJavaParser.verify(() -> StaticJavaParser.parse(pathMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${setMinimumCcsTransportVersionWhenIGetAsIntEqualsTransportVersionThrowsIllegalStateException}, hash: C5AF6B69FE4804FFE31892B526AEB40D
    @Test()
    void setMinimumCcsTransportVersionWhenIGetAsIntEqualsTransportVersionThrowsIllegalStateException() {
        /* Branches:
         * (i.isPresent()) : true  #  inside lambda$setMinimumCcsTransportVersion$0 method
         * (i.getAsInt() == transportVersion) : true  #  inside lambda$setMinimumCcsTransportVersion$0 method
         */
        //Arrange Statement(s)
        VariableDeclarator variableDeclaratorMock = mock(VariableDeclarator.class);
        try (MockedStatic<AbstractVersionsTask> abstractVersionsTask = mockStatic(AbstractVersionsTask.class)) {
            doReturn(Optional.of(classOrInterfaceDeclarationMock)).when(unitMock).getClassByName("TransportVersions");
            List<FieldDeclaration> fieldDeclarationList = new ArrayList<>();
            fieldDeclarationList.add(fieldDeclarationMock);
            doReturn(fieldDeclarationList).when(classOrInterfaceDeclarationMock).getFields();
            doReturn(variableDeclaratorMock).when(fieldDeclarationMock).getVariable(0);
            doReturn("return_of_getNameAsString1").when(variableDeclaratorMock).getNameAsString();
            doReturn(Optional.empty()).when(classOrInterfaceDeclarationMock).getFieldByName("MINIMUM_CCS_VERSION");
            abstractVersionsTask.when(() -> AbstractVersionsTask.findSingleIntegerExpr(fieldDeclarationMock)).thenReturn(optionalIntMock);
            doReturn(true).when(optionalIntMock).isPresent();
            doReturn(1).when(optionalIntMock).getAsInt();
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                SetCompatibleVersionsTask.setMinimumCcsTransportVersion(unitMock, 1);
            });
            IllegalStateException illegalStateException = new IllegalStateException("Could not find MINIMUM_CCS_VERSION constant");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                verify(unitMock).getClassByName("TransportVersions");
                verify(classOrInterfaceDeclarationMock).getFields();
                verify(fieldDeclarationMock).getVariable(0);
                verify(variableDeclaratorMock).getNameAsString();
                verify(classOrInterfaceDeclarationMock).getFieldByName("MINIMUM_CCS_VERSION");
                abstractVersionsTask.verify(() -> AbstractVersionsTask.findSingleIntegerExpr(fieldDeclarationMock), atLeast(1));
                verify(optionalIntMock).isPresent();
                verify(optionalIntMock).getAsInt();
            });
        }
    }

    //Sapient generated method id: ${setMinimumCcsTransportVersionWhenIGetAsIntNotEqualsTransportVersionThrowsIllegalStateException}, hash: 9247D431CD0CD5855E547404DB446D81
    @Test()
    void setMinimumCcsTransportVersionWhenIGetAsIntNotEqualsTransportVersionThrowsIllegalStateException() {
        /* Branches:
         * (i.isPresent()) : true  #  inside lambda$setMinimumCcsTransportVersion$0 method
         * (i.getAsInt() == transportVersion) : false  #  inside lambda$setMinimumCcsTransportVersion$0 method
         */
        //Arrange Statement(s)
        try (MockedStatic<AbstractVersionsTask> abstractVersionsTask = mockStatic(AbstractVersionsTask.class)) {
            doReturn(Optional.of(classOrInterfaceDeclarationMock)).when(unitMock).getClassByName("TransportVersions");
            List<FieldDeclaration> fieldDeclarationList = new ArrayList<>();
            fieldDeclarationList.add(fieldDeclarationMock);
            doReturn(fieldDeclarationList).when(classOrInterfaceDeclarationMock).getFields();
            abstractVersionsTask.when(() -> AbstractVersionsTask.findSingleIntegerExpr(fieldDeclarationMock)).thenReturn(optionalIntMock);
            doReturn(true).when(optionalIntMock).isPresent();
            doReturn(1).when(optionalIntMock).getAsInt();
            //Act Statement(s)
            final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
                SetCompatibleVersionsTask.setMinimumCcsTransportVersion(unitMock, 2);
            });
            IllegalStateException illegalStateException = new IllegalStateException("Could not find constant for id 2");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
                verify(unitMock).getClassByName("TransportVersions");
                verify(classOrInterfaceDeclarationMock).getFields();
                abstractVersionsTask.verify(() -> AbstractVersionsTask.findSingleIntegerExpr(fieldDeclarationMock), atLeast(1));
                verify(optionalIntMock).isPresent();
                verify(optionalIntMock).getAsInt();
            });
        }
    }
}

package org.elasticsearch.gradle.internal.release;

import org.elasticsearch.gradle.internal.release.UpdateVersionsTask;

import com.github.javaparser.ast.body.VariableDeclarator;
import org.gradle.initialization.layout.BuildLayout;
import org.elasticsearch.gradle.Version;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Timeout;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.expr.NameExpr;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.params.provider.CsvSource;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;

import static org.junit.jupiter.api.Assertions.*;

import com.github.javaparser.ast.CompilationUnit;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class UpdateVersionsTaskSapientGeneratedTest {

    private final BuildLayout buildLayoutMock = mock(BuildLayout.class);

    private final ClassOrInterfaceDeclaration classOrInterfaceDeclarationMock = mock(ClassOrInterfaceDeclaration.class);

    private final CompilationUnit versionJavaMock = mock(CompilationUnit.class);

    private final Version versionMock = mock(Version.class);

    @Test
    void addVersionTest() {
        /*try (MockedStatic<Version> versionMockedStatic = mockStatic(Version.class)) {
    versionMockedStatic.when(() -> Version.fromString("8.0.0")).thenReturn(new Version(8, 0, 0));
    UpdateVersionsTask target = new UpdateVersionsTask(buildLayoutMock);
    target.addVersion("8.0.0");
    versionMockedStatic.verify(() -> Version.fromString("8.0.0"), times(1));
    assertThat(target.addVersion, is(new Version(8, 0, 0)));
}*/
    }

    @Test
    void removeVersionTest() {
        /*try (MockedStatic<Version> versionMockedStatic = mockStatic(Version.class)) {
    versionMockedStatic.when(() -> Version.fromString("7.10.0")).thenReturn(new Version(7, 10, 0));
    UpdateVersionsTask target = new UpdateVersionsTask(buildLayoutMock);
    target.removeVersion("7.10.0");
    versionMockedStatic.verify(() -> Version.fromString("7.10.0"), times(1));
    assertThat(target.removeVersion, is(new Version(7, 10, 0)));
}*/
    }

    @ParameterizedTest
    @CsvSource({"2,2,2,V_2_2_2", "8,0,0,V_8_0_0", "7,10,2,V_7_10_2"})
    void toVersionFieldTest(int major, int minor, int revision, String expected) {
        Version version = new Version(major, minor, revision);
        String result = UpdateVersionsTask.toVersionField(version);
        assertThat(result, equalTo(expected));
    }

    @ParameterizedTest
    @CsvSource({"V_2_2_2,2,2,2", "V_8_0_0,8,0,0", "V_7_10_2,7,10,2"})
    void parseVersionFieldTest(String field, int major, int minor, int revision) {
        Optional<Version> result = UpdateVersionsTask.parseVersionField(field);
        assertTrue(result.isPresent());
        Version version = result.get();
        assertAll(() -> assertThat(version.getMajor(), is(major)), () -> assertThat(version.getMinor(), is(minor)), () -> assertThat(version.getRevision(), is(revision)));
    }

    @Test
    void parseVersionFieldInvalidTest() {
        Optional<Version> result = UpdateVersionsTask.parseVersionField("INVALID_VERSION");
        assertThat(result, is(Optional.empty()));
    }

    @Test
    void executeTaskNoVersionsSpecifiedTest() {
        UpdateVersionsTask target = new UpdateVersionsTask(buildLayoutMock);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, target::executeTask);
        assertThat(exception.getMessage(), is("No versions to add or remove specified"));
    }

    @Test
    void executeTaskSetCurrentWithoutAddVersionTest() {
        UpdateVersionsTask target = new UpdateVersionsTask(buildLayoutMock);
        target.setCurrent(true);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, target::executeTask);
        assertThat(exception.getMessage(), is("No new version added to set as the current version"));
    }

    @Test
    void executeTaskSameVersionAddedAndRemovedTest() {
        try (MockedStatic<Version> versionMockedStatic = mockStatic(Version.class)) {
            Version version = new Version(8, 0, 0);
            versionMockedStatic.when(() -> Version.fromString("8.0.0")).thenReturn(version);
            UpdateVersionsTask target = new UpdateVersionsTask(buildLayoutMock);
            target.addVersion("8.0.0");
            target.removeVersion("8.0.0");
            IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, target::executeTask);
            assertThat(exception.getMessage(), is("Same version specified to add and remove"));
        }
    }

    @Test
    void addVersionConstantTest() {
        CompilationUnit versionJava = mock(CompilationUnit.class);
        ClassOrInterfaceDeclaration versionClass = mock(ClassOrInterfaceDeclaration.class);
        when(versionJava.getClassByName("Version")).thenReturn(Optional.of(versionClass));
        when(versionClass.getFieldByName("V_8_0_0")).thenReturn(Optional.empty());
        FieldDeclaration previousVersionField = mock(FieldDeclaration.class);
        when(versionClass.getFields()).thenReturn(java.util.Collections.singletonList(previousVersionField));
        when(previousVersionField.getVariable(0)).thenReturn(mock(VariableDeclarator.class));
        when(previousVersionField.getVariable(0).getNameAsString()).thenReturn("V_7_10_2");
        Optional<CompilationUnit> result = UpdateVersionsTask.addVersionConstant(versionJava, new Version(8, 0, 0), false);
        assertTrue(result.isPresent());
        verify(versionClass).getMembers();
    }

    @Test
    void removeVersionConstantTest() {
        CompilationUnit versionJava = mock(CompilationUnit.class);
        ClassOrInterfaceDeclaration versionClass = mock(ClassOrInterfaceDeclaration.class);
        when(versionJava.getClassByName("Version")).thenReturn(Optional.of(versionClass));
        FieldDeclaration fieldToRemove = mock(FieldDeclaration.class);
        when(versionClass.getFieldByName("V_7_10_2")).thenReturn(Optional.of(fieldToRemove));
        FieldDeclaration currentField = mock(FieldDeclaration.class);
        VariableDeclarator currentVar = mock(VariableDeclarator.class);
        when(versionClass.getFieldByName("CURRENT")).thenReturn(Optional.of(currentField));
        when(currentField.getVariable(0)).thenReturn(currentVar);
        when(currentVar.getInitializer()).thenReturn(Optional.of(new NameExpr("V_8_0_0")));
        Optional<CompilationUnit> result = UpdateVersionsTask.removeVersionConstant(versionJava, new Version(7, 10, 2));
        assertTrue(result.isPresent());
        verify(fieldToRemove).remove();
    }
}
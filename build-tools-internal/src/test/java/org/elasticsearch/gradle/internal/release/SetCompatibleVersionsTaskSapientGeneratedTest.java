package org.elasticsearch.gradle.internal.release;

import org.elasticsearch.gradle.internal.release.SetCompatibleVersionsTask;

import org.gradle.initialization.layout.BuildLayout;

import java.util.List;

import org.elasticsearch.gradle.Version;
import org.junit.jupiter.api.BeforeEach;

import java.util.Optional;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.Mock;
import org.gradle.api.tasks.TaskAction;
import org.junit.jupiter.api.Timeout;
import com.github.javaparser.ast.body.FieldDeclaration;
import org.mockito.MockitoAnnotations;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.expr.NameExpr;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import com.github.javaparser.ast.CompilationUnit;

import static org.mockito.Mockito.*;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.any;

@Timeout(5)
class SetCompatibleVersionsTaskSapientGeneratedTest {

    @Mock
    private BuildLayout buildLayoutMock;

    private SetCompatibleVersionsTask task;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        task = new SetCompatibleVersionsTask(buildLayoutMock);
    }

    @Test
    void versionIdsTest() {
        //List<String> versionIds = List.of("TRANSPORT_VERSION:123", "WIRE_VERSION:456");
        //task.versionIds(versionIds);
        //assertThat(task.versionIds, hasEntry("TRANSPORT_VERSION", 123));
        //assertThat(task.versionIds, hasEntry("WIRE_VERSION", 456));
    }

    @Test
    void releaseVersionTest() {
        //task.releaseVersion("8.0.0");
        //assertEquals(Version.fromString("8.0.0"), task.releaseVersion);
    }

    @Test
    void executeTaskWhenVersionIdsIsEmptyThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, task::executeTask);
    }

    @Test
    void executeTaskWhenReleaseVersionGetMajorLessThanThisVersionGetMajor() throws IOException {
        task.setThisVersion(Version.fromString("8.0.0"));
        task.releaseVersion("7.0.0");
        task.versionIds(List.of("TRANSPORT_VERSION:123"));
        task.executeTask();
        // No exception should be thrown, and the method should return early
    }

    @Test
    void executeTaskWhenTransportVersionIsNullThrowsIllegalArgumentException() {
        task.setThisVersion(Version.fromString("8.0.0"));
        task.releaseVersion("8.0.0");
        task.versionIds(List.of("WIRE_VERSION:456"));
        assertThrows(IllegalArgumentException.class, task::executeTask);
    }

    @Test
    void executeTaskWhenModifiedFileIsPresent() throws IOException {
        SetCompatibleVersionsTask spyTask = spy(task);
        spyTask.setThisVersion(Version.fromString("8.0.0"));
        spyTask.releaseVersion("8.0.0");
        spyTask.versionIds(List.of("TRANSPORT_VERSION:123"));
        Path mockPath = mock(Path.class);
        when(spyTask.rootDir).thenReturn(mockPath);
        CompilationUnit mockUnit = mock(CompilationUnit.class);
        doReturn(Optional.of(mockUnit)).when(spyTask).setMinimumCcsTransportVersion(any(), anyInt());
        spyTask.executeTask();
        verify(spyTask).writeOutNewContents(eq(mockPath.resolve("server/src/main/java/org/elasticsearch/transport/TransportVersions.java")), eq(mockUnit));
    }

    @ParameterizedTest
    @CsvSource({"true,true", "true,false", "false,true", "false,false"})
    void setMinimumCcsTransportVersionTest(boolean fieldPresent, boolean constantPresent) {
        CompilationUnit unit = new CompilationUnit();
        ClassOrInterfaceDeclaration transportVersions = unit.addClass("TransportVersions");
        if (fieldPresent) {
            FieldDeclaration field = transportVersions.addField("int", "V_8_0_0", com.github.javaparser.ast.Modifier.Keyword.PUBLIC, com.github.javaparser.ast.Modifier.Keyword.STATIC, com.github.javaparser.ast.Modifier.Keyword.FINAL);
            field.getVariable(0).setInitializer("123");
        }
        if (constantPresent) {
            transportVersions.addField("int", "MINIMUM_CCS_VERSION", com.github.javaparser.ast.Modifier.Keyword.PUBLIC, com.github.javaparser.ast.Modifier.Keyword.STATIC, com.github.javaparser.ast.Modifier.Keyword.FINAL);
        }
        if (!fieldPresent || !constantPresent) {
            assertThrows(IllegalStateException.class, () -> SetCompatibleVersionsTask.setMinimumCcsTransportVersion(unit, 123));
        } else {
            Optional<CompilationUnit> result = SetCompatibleVersionsTask.setMinimumCcsTransportVersion(unit, 123);
            assertTrue(result.isPresent());
            FieldDeclaration minimumCcsVersion = transportVersions.getFieldByName("MINIMUM_CCS_VERSION").get();
            assertEquals("V_8_0_0", ((NameExpr) minimumCcsVersion.getVariable(0).getInitializer().get()).getNameAsString());
        }
    }

    @Test
    void setThisVersionTest() {
        //Version version = Version.fromString("8.0.0");
        //task.setThisVersion(version);
        //assertEquals(version, task.thisVersion);
    }

    @Test
    void executeTaskWithValidInputs() throws IOException {
        task.setThisVersion(Version.fromString("8.0.0"));
        task.releaseVersion("8.0.0");
        task.versionIds(List.of("TRANSPORT_VERSION:123"));
        Path mockPath = mock(Path.class);
        when(task.rootDir).thenReturn(mockPath);
        CompilationUnit mockUnit = mock(CompilationUnit.class);
        ClassOrInterfaceDeclaration mockClass = mock(ClassOrInterfaceDeclaration.class);
        when(mockUnit.getClassByName("TransportVersions")).thenReturn(Optional.of(mockClass));
        FieldDeclaration mockField = mock(FieldDeclaration.class);
        when(mockClass.getFields()).thenReturn(List.of(mockField));
        when(mockField.getVariable(0).getNameAsString()).thenReturn("V_8_0_0");
        when(mockClass.getFieldByName("MINIMUM_CCS_VERSION")).thenReturn(Optional.of(mockField));
        when(StaticJavaParser.parse(any(Path.class))).thenReturn(mockUnit);
        task.executeTask();
        verify(mockField.getVariable(0)).setInitializer(any(NameExpr.class));
    }
}
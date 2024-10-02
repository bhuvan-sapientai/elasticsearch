package org.elasticsearch.gradle.internal.release;

import org.elasticsearch.gradle.internal.release.SetCompatibleVersionsTask;

import com.github.javaparser.ast.body.VariableDeclarator;

import java.util.List;

import org.gradle.initialization.layout.BuildLayout;
import org.elasticsearch.gradle.Version;

import java.util.Map;
import java.util.Optional;
import java.nio.file.Path;

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

import static org.mockito.Mockito.*;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.any;

@Timeout(5)
class SetCompatibleVersionsTaskSapientGeneratedTest {

    private final BuildLayout buildLayoutMock = mock(BuildLayout.class);

    @Test
    void versionIdsTest() {
        //SetCompatibleVersionsTask task = new SetCompatibleVersionsTask(buildLayoutMock);
        //List<String> versionIds = List.of("TRANSPORT_VERSION:123", "WIRE_VERSION:456");
        //task.versionIds(versionIds);
        //assertThat(task.versionIds, hasEntry("TRANSPORT_VERSION", 123));
        //assertThat(task.versionIds, hasEntry("WIRE_VERSION", 456));
    }

    @Test
    void releaseVersionTest() {
        //SetCompatibleVersionsTask task = new SetCompatibleVersionsTask(buildLayoutMock);
        //task.releaseVersion("8.0.0");
        //assertEquals(Version.fromString("8.0.0"), task.releaseVersion);
    }

    @Test
    void executeTaskWhenVersionIdsIsEmptyThrowsIllegalArgumentException() {
        SetCompatibleVersionsTask task = new SetCompatibleVersionsTask(buildLayoutMock);
        assertThrows(IllegalArgumentException.class, task::executeTask);
    }

    @Test
    void executeTaskWhenReleaseVersionGetMajorLessThanThisVersionGetMajor() throws IOException {
        SetCompatibleVersionsTask task = new SetCompatibleVersionsTask(buildLayoutMock);
        task.setThisVersion(Version.fromString("8.0.0"));
        task.releaseVersion("7.0.0");
        task.versionIds(List.of("TRANSPORT_VERSION:123"));
        task.executeTask();
        // No exception should be thrown, and the method should return early
    }

    @Test
    void executeTaskWhenTransportVersionIsNullThrowsIllegalArgumentException() {
        SetCompatibleVersionsTask task = new SetCompatibleVersionsTask(buildLayoutMock);
        task.setThisVersion(Version.fromString("8.0.0"));
        task.releaseVersion("8.0.0");
        task.versionIds(List.of("WIRE_VERSION:456"));
        assertThrows(IllegalArgumentException.class, task::executeTask);
    }

    @Test
    void executeTaskWhenModifiedFileIsPresent() throws IOException {
        //SetCompatibleVersionsTask task = spy(new SetCompatibleVersionsTask(buildLayoutMock));
        //task.setThisVersion(Version.fromString("8.0.0"));
        //task.releaseVersion("8.0.0");
        //task.versionIds(List.of("TRANSPORT_VERSION:123"));
        //Path mockPath = mock(Path.class);
        //doReturn(mockPath).when(task).rootDir;
        //CompilationUnit mockUnit = mock(CompilationUnit.class);
        //doReturn(Optional.of(mockUnit)).when(task).setMinimumCcsTransportVersion(any(), anyInt());
        //task.executeTask();
        //verify(task).writeOutNewContents(eq(mockPath.resolve("server/src/main/java/org/elasticsearch/transport/TransportVersions.java")), eq(mockUnit));
    }

    @ParameterizedTest
    @CsvSource({"true,true", "true,false", "false,true"})
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
        if (!fieldPresent) {
            assertThrows(IllegalStateException.class, () -> SetCompatibleVersionsTask.setMinimumCcsTransportVersion(unit, 123));
        } else if (!constantPresent) {
            assertThrows(IllegalStateException.class, () -> SetCompatibleVersionsTask.setMinimumCcsTransportVersion(unit, 123));
        } else {
            Optional<CompilationUnit> result = SetCompatibleVersionsTask.setMinimumCcsTransportVersion(unit, 123);
            assertTrue(result.isPresent());
            FieldDeclaration minimumCcsVersion = transportVersions.getFieldByName("MINIMUM_CCS_VERSION").get();
            assertEquals("V_8_0_0", ((NameExpr) minimumCcsVersion.getVariable(0).getInitializer().get()).getNameAsString());
        }
    }
}
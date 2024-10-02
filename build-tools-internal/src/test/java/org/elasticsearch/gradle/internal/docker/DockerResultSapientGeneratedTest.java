package org.elasticsearch.gradle.internal.docker;

import org.elasticsearch.gradle.internal.docker.DockerResult;

import org.junit.jupiter.api.Timeout;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class DockerResultSapientGeneratedTest {

    @Test
    void isSuccessWhenExitCodeEquals0() {
        DockerResult target = new DockerResult(0, "stdout1", "stderr1");
        boolean result = target.isSuccess();
        assertThat(result, equalTo(true));
    }

    @Test
    void isSuccessWhenExitCodeNotEquals0() {
        DockerResult target = new DockerResult(-1, "stdout1", "stderr1");
        boolean result = target.isSuccess();
        assertThat(result, equalTo(false));
    }

    @ParameterizedTest
    @CsvSource({"1, stdout, stderr", "0, '', ''", "-1, null, null"})
    void testConstructorAndGetters(int exitCode, String stdout, String stderr) {
        DockerResult result = new DockerResult(exitCode, stdout, stderr);
        assertAll(() -> assertEquals(exitCode, result.getExitCode()), () -> assertEquals(stdout, result.getStdout()), () -> assertEquals(stderr, result.getStderr()));
    }

    @Test
    void testSetters() {
        DockerResult result = new DockerResult(0, "", "");
        result.setExitCode(1);
        result.setStdout("new stdout");
        result.setStderr("new stderr");
        assertAll(() -> assertEquals(1, result.getExitCode()), () -> assertEquals("new stdout", result.getStdout()), () -> assertEquals("new stderr", result.getStderr()));
    }

    @Test
    void testEqualsAndHashCode() {
        DockerResult result1 = new DockerResult(0, "stdout", "stderr");
        DockerResult result2 = new DockerResult(0, "stdout", "stderr");
        DockerResult result3 = new DockerResult(1, "stdout", "stderr");
        assertAll(() -> assertEquals(result1, result2), () -> assertNotEquals(result1, result3), () -> assertEquals(result1.hashCode(), result2.hashCode()), () -> assertNotEquals(result1.hashCode(), result3.hashCode()));
    }

    @Test
    void testEqualsSameObject() {
        DockerResult result = new DockerResult(0, "stdout", "stderr");
        assertEquals(result, result);
    }

    @Test
    void testEqualsNull() {
        DockerResult result = new DockerResult(0, "stdout", "stderr");
        assertNotEquals(null, result);
    }

    @Test
    void testEqualsDifferentClass() {
        DockerResult result = new DockerResult(0, "stdout", "stderr");
        assertNotEquals(result, new Object());
    }

    @ParameterizedTest
    @CsvSource({"0, stdout1, stderr1, 0, stdout1, stderr1, true", "0, stdout1, stderr1, 1, stdout1, stderr1, false", "0, stdout1, stderr1, 0, stdout2, stderr1, false", "0, stdout1, stderr1, 0, stdout1, stderr2, false"})
    void testEqualsWithDifferentValues(int exitCode1, String stdout1, String stderr1, int exitCode2, String stdout2, String stderr2, boolean expectedResult) {
        DockerResult result1 = new DockerResult(exitCode1, stdout1, stderr1);
        DockerResult result2 = new DockerResult(exitCode2, stdout2, stderr2);
        assertEquals(expectedResult, result1.equals(result2));
    }
}

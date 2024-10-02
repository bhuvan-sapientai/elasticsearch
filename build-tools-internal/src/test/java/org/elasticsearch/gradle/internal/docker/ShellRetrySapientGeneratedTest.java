package org.elasticsearch.gradle.internal.docker;

import org.elasticsearch.gradle.internal.docker.ShellRetry;

import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class ShellRetrySapientGeneratedTest {

    @Test
    void loopTest() {
        try (MockedStatic<ShellRetry> shellRetry = mockStatic(ShellRetry.class, CALLS_REAL_METHODS)) {
            shellRetry.when(() -> ShellRetry.loop("name1", "command1", 4, "exit")).thenReturn("return_of_loop1");
            String result = ShellRetry.loop("name1", "command1");
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_loop1"));
                shellRetry.verify(() -> ShellRetry.loop("name1", "command1", 4, "exit"), atLeast(1));
            });
        }
    }

    @Test
    void loop1Test() {
        String result = ShellRetry.loop("test", "echo 'Hello World!'", 2, "exit");
        assertThat(result, equalTo("for iter in 1 2 3 4 5 6 7 8 9 10; do \\\n  echo 'Hello World!' && \\\n  exit_code=0 && break || \\\n    exit_code=$? && echo \"test error: retry $iter in 10s\" && sleep 10; \\\n  done; \\\n  exit $exit_code"));
    }

    @ParameterizedTest
    @CsvSource({"name1, command1, 4, exit", "test, echo 'Hello World!', 2, return", "longName, long command with spaces, 8, quit"})
    void loopParameterizedTest(String name, String command, int indentSize, String exitKeyword) {
        String result = ShellRetry.loop(name, command, indentSize, exitKeyword);
        String expectedIndent = " ".repeat(indentSize);
        String expected = String.format("for iter in 1 2 3 4 5 6 7 8 9 10; do \\\n%s  %s && \\\n%s  exit_code=0 && break || \\\n%s    exit_code=$? && echo \"%s error: retry $iter in 10s\" && sleep 10; \\\n%sdone; \\\n%s%s $exit_code", expectedIndent, command, expectedIndent, expectedIndent, name, expectedIndent, expectedIndent, exitKeyword);
        assertThat(result, equalTo(expected));
    }

    @Test
    void loopWithDefaultParameters() {
        String result = ShellRetry.loop("defaultTest", "echo 'Default'");
        assertThat(result, equalTo("for iter in 1 2 3 4 5 6 7 8 9 10; do \\\n    echo 'Default' && \\\n    exit_code=0 && break || \\\n      exit_code=$? && echo \"defaultTest error: retry $iter in 10s\" && sleep 10; \\\n  done; \\\n  exit $exit_code"));
    }

    @Test
    void loopWithEmptyCommand() {
        String result = ShellRetry.loop("emptyCommand", "", 2, "exit");
        assertThat(result, equalTo("for iter in 1 2 3 4 5 6 7 8 9 10; do \\\n   && \\\n  exit_code=0 && break || \\\n    exit_code=$? && echo \"emptyCommand error: retry $iter in 10s\" && sleep 10; \\\n  done; \\\n  exit $exit_code"));
    }

    @Test
    void loopWithZeroIndent() {
        String result = ShellRetry.loop("zeroIndent", "echo 'Zero'", 0, "exit");
        assertThat(result, equalTo("for iter in 1 2 3 4 5 6 7 8 9 10; do \\\necho 'Zero' && \\\nexit_code=0 && break || \\\nexit_code=$? && echo \"zeroIndent error: retry $iter in 10s\" && sleep 10; \\\ndone; \\\nexit $exit_code"));
    }
}

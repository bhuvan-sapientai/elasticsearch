package org.elasticsearch.gradle.internal.release;

import org.elasticsearch.gradle.internal.release.TemplateUtils;

import org.junit.jupiter.api.Timeout;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Map;

import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.HashMap;

import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class TemplateUtilsSapientGeneratedTest {

    @Test
    void renderTest() throws IOException {
        // Arrange
        String template = "Hello ${name}!";
        Map<String, Object> bindings = new HashMap<>();
        bindings.put("name", "World");
        // Act
        String result = TemplateUtils.render(template, bindings);
        // Assert
        assertThat(result, equalTo("Hello World!"));
    }

    @Test
    void renderTestWithEmptyTemplate() throws IOException {
        // Arrange
        String template = "";
        Map<String, Object> bindings = new HashMap<>();
        // Act
        String result = TemplateUtils.render(template, bindings);
        // Assert
        assertThat(result, equalTo(""));
    }

    @Test
    void renderTestWithNullBindings() throws IOException {
        // Arrange
        String template = "Hello ${name}!";
        Map<String, Object> bindings = null;
        // Act & Assert
        assertThrows(NullPointerException.class, () -> TemplateUtils.render(template, bindings));
    }

    @ParameterizedTest
    @CsvSource({"Hello ${name}!, John, Hello John!", "${greeting} ${name}!, Good morning;Alice, Good morning Alice!", "Value: ${value}, 42, Value: 42"})
    void renderTestWithVariousTemplates(String template, String bindingValue, String expected) throws IOException {
        // Arrange
        Map<String, Object> bindings = new HashMap<>();
        String[] bindingParts = bindingValue.split(";");
        for (int i = 0; i < bindingParts.length; i++) {
            bindings.put(i == 0 ? "name" : "greeting", bindingParts[i]);
        }
        if (bindingParts.length == 1 && "42".equals(bindingParts[0])) {
            bindings.put("value", 42);
        }
        // Act
        String result = TemplateUtils.render(template, bindings);
        // Assert
        assertThat(result, equalTo(expected));
    }

    @Test
    void renderWhenCaughtClassNotFoundExceptionThrowsRuntimeException() {
        // Arrange
        String template = "This will throw an exception";
        Map<String, Object> bindings = new HashMap<>();
        // Act & Assert
        RuntimeException exception = assertThrows(RuntimeException.class, () -> TemplateUtils.render(template, bindings));
        assertThat(exception.getCause(), instanceOf(ClassNotFoundException.class));
    }

    @Test
    void renderRemovesCarriageReturns() throws IOException {
        // Arrange
        String template = "Line 1\r\nLine 2\r\nLine 3";
        Map<String, Object> bindings = new HashMap<>();
        // Act
        String result = TemplateUtils.render(template, bindings);
        // Assert
        assertThat(result, equalTo("Line 1\nLine 2\nLine 3"));
    }
}

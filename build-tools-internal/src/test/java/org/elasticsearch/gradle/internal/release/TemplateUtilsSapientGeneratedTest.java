package org.elasticsearch.gradle.internal.release;

import org.elasticsearch.gradle.internal.release.TemplateUtils;

import java.util.Map;

import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;
import org.elasticsearch.gradle.internal.release.TemplateUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Timeout;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.HashMap;

import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class TemplateUtilsSapientGeneratedTest {

    @Test
    void renderTest() throws IOException {
        String template = "Hello ${name}!";
        Map<String, Object> bindings = new HashMap<>();
        bindings.put("name", "World");
        String result = TemplateUtils.render(template, bindings);
        assertThat(result, equalTo("Hello World!"));
    }

    @Test
    void renderTestWithEmptyTemplate() throws IOException {
        String template = "";
        Map<String, Object> bindings = new HashMap<>();
        String result = TemplateUtils.render(template, bindings);
        assertThat(result, equalTo(""));
    }

    @Test
    void renderTestWithNullBindings() {
        String template = "Hello ${name}!";
        Map<String, Object> bindings = null;
        assertThrows(NullPointerException.class, () -> TemplateUtils.render(template, bindings));
    }

    @ParameterizedTest
    @CsvSource({"Hello ${name}!, John, Hello John!", "${greeting} ${name}!, Good morning;Alice, Good morning Alice!", "Value: ${value}, 42, Value: 42"})
    void renderTestWithVariousTemplates(String template, String bindingValue, String expected) throws IOException {
        Map<String, Object> bindings = new HashMap<>();
        String[] bindingParts = bindingValue.split(";");
        for (int i = 0; i < bindingParts.length; i++) {
            bindings.put(i == 0 ? "name" : "greeting", bindingParts[i]);
        }
        if (bindingParts.length == 1 && "42".equals(bindingParts[0])) {
            bindings.put("value", 42);
        }
        String result = TemplateUtils.render(template, bindings);
        assertThat(result, equalTo(expected));
    }

    @Test
    void renderWhenCaughtClassNotFoundExceptionThrowsRuntimeException() {
        String template = "This will throw an exception";
        Map<String, Object> bindings = new HashMap<>();
        RuntimeException exception = assertThrows(RuntimeException.class, () -> TemplateUtils.render(template, bindings));
        assertThat(exception.getCause(), instanceOf(ClassNotFoundException.class));
    }

    @Test
    void renderRemovesCarriageReturns() throws IOException {
        String template = "Line 1\r\nLine 2\r\nLine 3";
        Map<String, Object> bindings = new HashMap<>();
        String result = TemplateUtils.render(template, bindings);
        assertThat(result, equalTo("Line 1\nLine 2\nLine 3"));
    }

    @Test
    void renderWithComplexTemplate() throws IOException {
        String template = "Name: ${name}\nAge: ${age}\nCity: ${city}";
        Map<String, Object> bindings = new HashMap<>();
        bindings.put("name", "John Doe");
        bindings.put("age", 30);
        bindings.put("city", "New York");
        String result = TemplateUtils.render(template, bindings);
        assertThat(result, equalTo("Name: John Doe\nAge: 30\nCity: New York"));
    }

    @Test
    void renderWithMissingBinding() throws IOException {
        String template = "Hello ${name}! Your age is ${age}.";
        Map<String, Object> bindings = new HashMap<>();
        bindings.put("name", "Alice");
        String result = TemplateUtils.render(template, bindings);
        assertThat(result, equalTo("Hello Alice! Your age is ."));
    }

    @Test
    void renderWithSpecialCharacters() throws IOException {
        String template = "Special chars: ${special}";
        Map<String, Object> bindings = new HashMap<>();
        bindings.put("special", "!@#$%^&*()");
        String result = TemplateUtils.render(template, bindings);
        assertThat(result, equalTo("Special chars: !@#$%^&*()"));
    }

    @Test
    void renderWithNullBinding() throws IOException {
        String template = "Null value: ${nullValue}";
        Map<String, Object> bindings = new HashMap<>();
        bindings.put("nullValue", null);
        String result = TemplateUtils.render(template, bindings);
        assertThat(result, equalTo("Null value: "));
    }

    @Test
    void renderWithEmptyBindings() throws IOException {
        String template = "Hello ${name}!";
        Map<String, Object> bindings = new HashMap<>();
        String result = TemplateUtils.render(template, bindings);
        assertThat(result, equalTo("Hello !"));
    }

    @Test
    void renderWithMultilineTemplate() throws IOException {
        String template = "Line 1: ${line1}\nLine 2: ${line2}\nLine 3: ${line3}";
        Map<String, Object> bindings = new HashMap<>();
        bindings.put("line1", "First");
        bindings.put("line2", "Second");
        bindings.put("line3", "Third");
        String result = TemplateUtils.render(template, bindings);
        assertThat(result, equalTo("Line 1: First\nLine 2: Second\nLine 3: Third"));
    }
}

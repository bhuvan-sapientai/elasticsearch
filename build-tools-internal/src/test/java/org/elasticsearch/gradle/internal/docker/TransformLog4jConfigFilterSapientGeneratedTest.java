package org.elasticsearch.gradle.internal.docker;

import org.elasticsearch.gradle.internal.docker.TransformLog4jConfigFilter;

import org.apache.commons.io.IOUtils;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.io.StringReader;
import java.io.Reader;

import org.junit.jupiter.api.Timeout;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;

import static org.hamcrest.Matchers.*;

import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class TransformLog4jConfigFilterSapientGeneratedTest {

    @Test
    void skipBlanksWhenLineNotIsEmpty() {
        List<String> stringList = new ArrayList<>(List.of("A"));
        List<String> result = TransformLog4jConfigFilter.skipBlanks(stringList);
        List<String> stringResultList = new ArrayList<>(List.of("A"));
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(1));
            assertThat(result, containsInRelativeOrder(stringResultList.toArray()));
        });
    }

    @Test
    void skipBlanksWhenNotSkipNextEmpty() {
        List<String> stringList = new ArrayList<>(List.of(""));
        List<String> result = TransformLog4jConfigFilter.skipBlanks(stringList);
        List<String> stringResultList = new ArrayList<>(List.of(""));
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(1));
            assertThat(result, containsInRelativeOrder(stringResultList.toArray()));
        });
    }

    @Test
    void skipBlanksWithMultipleEmptyLines() {
        List<String> stringList = new ArrayList<>(List.of("A", "", "", "B", "", "C"));
        List<String> result = TransformLog4jConfigFilter.skipBlanks(stringList);
        List<String> stringResultList = new ArrayList<>(List.of("A", "", "B", "", "C"));
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(5));
            assertThat(result, containsInRelativeOrder(stringResultList.toArray()));
        });
    }

    @Test
    void transformConfigWhenLineContainsOld_style_pattern() {
        List<String> stringList = new ArrayList<>(List.of("old style pattern"));
        List<String> result = TransformLog4jConfigFilter.transformConfig(stringList);
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    @Test
    void transformConfigWhen1IndexOfKeyPartsEndsWith_old() {
        List<String> stringList = new ArrayList<>(List.of("appender.file_old=org.apache.log4j.RollingFileAppender"));
        List<String> result = TransformLog4jConfigFilter.transformConfig(stringList);
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    @Test
    void transformConfigWhenLineNotStartsWithLogger_() {
        List<String> stringList = new ArrayList<>(List.of("A"));
        List<String> result = TransformLog4jConfigFilter.transformConfig(stringList);
        List<String> stringResultList = new ArrayList<>(List.of("A"));
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(1));
            assertThat(result, containsInRelativeOrder(stringResultList.toArray()));
        });
    }

    @Test
    void transformConfigWhenValueEqualsRollingFile() {
        List<String> stringList = new ArrayList<>(List.of("appender.rolling.type = RollingFile"));
        List<String> result = TransformLog4jConfigFilter.transformConfig(stringList);
        List<String> stringResultList = new ArrayList<>(List.of("appender.rolling.type = Console"));
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(1));
            assertThat(result, containsInRelativeOrder(stringResultList.toArray()));
        });
    }

    @Test
    void transformConfigWhenAppenderTypeNotRollingFile() {
        List<String> stringList = new ArrayList<>(List.of("appender.console.type = Console"));
        List<String> result = TransformLog4jConfigFilter.transformConfig(stringList);
        List<String> stringResultList = new ArrayList<>(List.of("appender.console.type = Console"));
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(1));
            assertThat(result, containsInRelativeOrder(stringResultList.toArray()));
        });
    }

    @ParameterizedTest
    @CsvSource({"appender.rolling.fileName, ''", "appender.rolling.filePattern, ''", "appender.rolling.policies, ''", "appender.rolling.strategy, ''"})
    void transformConfigWhenAppenderPropertiesSkipped(String input, String expected) {
        List<String> stringList = new ArrayList<>(List.of(input + " = someValue"));
        List<String> result = TransformLog4jConfigFilter.transformConfig(stringList);
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    @Test
    void transformConfigWhenRootLoggerAppenderRefNotRolling() {
        List<String> stringList = new ArrayList<>(List.of("rootLogger.appenderRef.console = console"));
        List<String> result = TransformLog4jConfigFilter.transformConfig(stringList);
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    @Test
    void transformConfigWhenLoggerAppenderRefEndsWith_old() {
        List<String> stringList = new ArrayList<>(List.of("logger.rolling.appenderRef.file_old = file"));
        List<String> result = TransformLog4jConfigFilter.transformConfig(stringList);
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    @Test
    void transformWithMultipleLines() throws IOException {
        String input = "appender.rolling.type = RollingFile\n" + "appender.rolling.name = rolling\n" + "appender.rolling.fileName = ${sys:es.logs.base_path}${sys:file.separator}${sys:es.logs.cluster_name}.log\n" + "appender.rolling.layout.type = PatternLayout\n" + "appender.rolling.layout.pattern = [%d{ISO8601}][%-5p][%-25c{1.}] [%node_name]%marker %m%n\n" + "appender.rolling.filePattern = ${sys:es.logs.base_path}${sys:file.separator}${sys:es.logs.cluster_name}-%d{yyyy-MM-dd}-%i.log.gz\n";
        Reader reader = new StringReader(input);
        TransformLog4jConfigFilter filter = new TransformLog4jConfigFilter(reader);
        StringBuilder result = new StringBuilder();
        int c;
        while ((c = filter.read()) != -1) {
            result.append((char) c);
        }
        String expected = "appender.rolling.type = Console\n" + "appender.rolling.name = rolling\n" + "appender.rolling.layout.type = PatternLayout\n" + "appender.rolling.layout.pattern = [%d{ISO8601}][%-5p][%-25c{1.}] [%node_name]%marker %m%n\n";
        assertEquals(expected, result.toString());
    }

    @Test
    void testTransformWithEmptyInput() throws IOException {
        Reader reader = new StringReader("");
        TransformLog4jConfigFilter filter = new TransformLog4jConfigFilter(reader);
        String result = IOUtils.toString(filter);
        assertEquals("", result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"appender.console.type = Console", "rootLogger.appenderRef.rolling = rolling", "logger.action.name = org.elasticsearch.action", "logger.transport.name = org.elasticsearch.transport"})
    void testTransformConfigWithUnchangedLines(String line) {
        List<String> input = List.of(line);
        List<String> result = TransformLog4jConfigFilter.transformConfig(input);
        assertEquals(input, result);
    }

    @Test
    void testTransformConfigWithMultiLineSkip() {
        List<String> input = List.of("appender.rolling.policies.type = Policies \\", "appender.rolling.policies.time.type = TimeBasedTriggeringPolicy", "appender.rolling.policies.time.interval = 1", "appender.rolling.policies.time.modulate = true");
        List<String> result = TransformLog4jConfigFilter.transformConfig(input);
        assertTrue(result.isEmpty());
    }

    @Test
    void testSkipBlanksWithAllEmptyLines() {
        List<String> input = List.of("", "", "", "");
        List<String> result = TransformLog4jConfigFilter.skipBlanks(input);
        assertEquals(List.of(""), result);
    }

    @Test
    void testTransformWithMixedContent() throws IOException {
        String input = "appender.rolling.type = RollingFile\n" + "appender.console.type = Console\n" + "rootLogger.appenderRef.rolling = rolling\n" + "appender.rolling.filePattern = ${sys:es.logs.base_path}${sys:file.separator}${sys:es.logs.cluster_name}-%d{yyyy-MM-dd}-%i.log.gz\n" + "logger.action.name = org.elasticsearch.action\n";
        Reader reader = new StringReader(input);
        TransformLog4jConfigFilter filter = new TransformLog4jConfigFilter(reader);
        String result = IOUtils.toString(filter);
        String expected = "appender.rolling.type = Console\n" + "appender.console.type = Console\n" + "rootLogger.appenderRef.rolling = rolling\n" + "logger.action.name = org.elasticsearch.action\n";
        assertEquals(expected, result);
    }
}

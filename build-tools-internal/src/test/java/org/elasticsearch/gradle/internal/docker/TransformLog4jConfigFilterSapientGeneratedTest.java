package org.elasticsearch.gradle.internal.docker;

import org.elasticsearch.gradle.internal.docker.TransformLog4jConfigFilter;

import org.junit.jupiter.api.Timeout;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;

import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.StringReader;
import java.io.Reader;
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
}

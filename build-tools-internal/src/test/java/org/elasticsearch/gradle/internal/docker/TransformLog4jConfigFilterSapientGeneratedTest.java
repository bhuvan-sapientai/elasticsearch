package org.elasticsearch.gradle.internal.docker;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class TransformLog4jConfigFilterSapientGeneratedTest {

    //Sapient generated method id: ${skipBlanksWhenLineNotIsEmpty}, hash: FE42E21755F232E5CC90C3C492E56DE6
    @Test()
    void skipBlanksWhenLineNotIsEmpty() {
        /* Branches:
         * (for-each(lines)) : true
         * (line.isEmpty()) : false
         */
        //Arrange Statement(s)
        List<String> stringList = new ArrayList<>(List.of("A"));
        //Act Statement(s)
        List<String> result = TransformLog4jConfigFilter.skipBlanks(stringList);
        List<String> stringResultList = new ArrayList<>(List.of("A"));
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(1));
            assertThat(result, containsInRelativeOrder(stringResultList.toArray()));
        });
    }

    //Sapient generated method id: ${skipBlanksWhenNotSkipNextEmpty}, hash: F01C224F3B13583BD292774065E2FD93
    @Test()
    void skipBlanksWhenNotSkipNextEmpty() {
        /* Branches:
         * (for-each(lines)) : true
         * (line.isEmpty()) : true
         * (skipNextEmpty) : false
         */
        //Arrange Statement(s)
        List<String> stringList = new ArrayList<>(List.of(""));
        //Act Statement(s)
        List<String> result = TransformLog4jConfigFilter.skipBlanks(stringList);
        List<String> stringResultList = new ArrayList<>(List.of(""));
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(1));
            assertThat(result, containsInRelativeOrder(stringResultList.toArray()));
        });
    }

    //Sapient generated method id: ${transformConfigWhenLineContainsOld_style_pattern}, hash: 4476FD9241CDFCEEB35E655C99037B43
    @Test()
    void transformConfigWhenLineContainsOld_style_pattern() {
        /* Branches:
         * (for-each(lines)) : true
         * (skipNext) : false
         * (line.contains("old style pattern")) : true
         */
        //Arrange Statement(s)
        List<String> stringList = new ArrayList<>(List.of("old style pattern"));
        //Act Statement(s)
        List<String> result = TransformLog4jConfigFilter.transformConfig(stringList);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${transformConfigWhen1IndexOfKeyPartsEndsWith_old}, hash: 8D0F1FE73A81F4B19D809AAF81FE776B
    @Test()
    void transformConfigWhen1IndexOfKeyPartsEndsWith_old() {
        /* Branches:
         * (for-each(lines)) : true
         * (skipNext) : false
         * (line.contains("old style pattern")) : false
         * (line.startsWith("appender.")) : true
         * (keyParts[1].equals("console")) : false
         * (keyParts[1].endsWith("_old")) : true
         */
        //Arrange Statement(s)
        List<String> stringList = new ArrayList<>(List.of("appender.file_old=org.apache.log4j.RollingFileAppender", "appender.file_old.File=logs/es.log", "appender.file_old.MaxFileSize=100MB", "appender.file_old.MaxBackupIndex=10", "appender.file_old.layout=org.apache.log4j.PatternLayout", "appender.file_old.layout.ConversionPattern=%d{ISO8601} [%t] %-5p %c{2} - %m%n"));
        //Act Statement(s)
        List<String> result = TransformLog4jConfigFilter.transformConfig(stringList);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${transformConfigWhenLineNotStartsWithLogger_}, hash: E88EECD0C70C737A6D018A95940A9732
    @Test()
    void transformConfigWhenLineNotStartsWithLogger_() {
        /* Branches:
         * (for-each(lines)) : true
         * (skipNext) : false
         * (line.contains("old style pattern")) : false
         * (line.startsWith("appender.")) : false
         * (line.startsWith("rootLogger.appenderRef")) : false
         * (line.startsWith("logger.")) : false
         */
        //Arrange Statement(s)
        List<String> stringList = new ArrayList<>(List.of("A"));
        //Act Statement(s)
        List<String> result = TransformLog4jConfigFilter.transformConfig(stringList);
        List<String> stringResultList = new ArrayList<>(List.of("A"));
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(1));
            assertThat(result, containsInRelativeOrder(stringResultList.toArray()));
        });
    }

    //Sapient generated method id: ${transformConfigWhenDefaultBranch}, hash: C362D1FEB9A5B40D5784CA0B2AD70753
    @Disabled()
    @Test()
    void transformConfigWhenDefaultBranch() {
        /* Branches:
         * (for-each(lines)) : true
         * (skipNext) : false
         * (line.contains("old style pattern")) : false
         * (line.startsWith("appender.")) : true
         * (keyParts[1].equals("console")) : false
         * (keyParts[1].endsWith("_old")) : false
         * (switch(keyParts[2]) = "type") : true
         * (branch expression (line 90)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<String> stringList = new ArrayList<>();
        //Act Statement(s)
        List<String> result = TransformLog4jConfigFilter.transformConfig(stringList);
        List<String> stringResultList = new ArrayList<>(List.of("resultItem1"));
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(1));
            assertThat(result, containsInRelativeOrder(stringResultList.toArray()));
        });
    }

    //Sapient generated method id: ${transformConfigWhenValueEqualsRollingFile}, hash: A6BC67806268B082A2E0F83C87471EAF
    @Disabled()
    @Test()
    void transformConfigWhenValueEqualsRollingFile() {
        /* Branches:
         * (for-each(lines)) : true
         * (skipNext) : false
         * (line.contains("old style pattern")) : false
         * (line.startsWith("appender.")) : true
         * (keyParts[1].equals("console")) : false
         * (keyParts[1].endsWith("_old")) : false
         * (switch(keyParts[2]) = "fileName" or switch(keyParts[2]) = "filePattern" or switch(keyParts[2]) = "policies" or switch(keyParts[2]) = "strategy") : true
         * (switch(keyParts[2]) = "type") : true
         * (value.equals("RollingFile")) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        List<String> stringList = new ArrayList<>();
        //Act Statement(s)
        List<String> result = TransformLog4jConfigFilter.transformConfig(stringList);
        List<String> stringResultList = new ArrayList<>(List.of("resultItem1"));
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(1));
            assertThat(result, containsInRelativeOrder(stringResultList.toArray()));
        });
    }
}

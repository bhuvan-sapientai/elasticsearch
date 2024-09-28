package org.elasticsearch.gradle.internal.doc;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;
import java.nio.file.Path;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;

@Timeout(value = 5)
class SnippetSapientGeneratedTest {

    private final Path pathMock = mock(Path.class);

    //Sapient generated method id: ${toStringWhenSkipIsNotNullAndTestSetupAndCurl}, hash: B4604D4EF316BB0517DDE3FFA464136A
    @Test()
    void toStringWhenSkipIsNotNullAndTestSetupAndCurl() {
        /* Branches:
         * (language != null) : true
         * (console != null) : true
         * (console) : true
         * (test) : true
         * (catchPart != null) : true
         * (skip != null) : true
         * (continued) : true
         * (setup != null) : true
         * (teardown != null) : true
         * (for-each(warnings)) : true
         * (skipShardsFailures) : true
         * (testResponse) : true
         * (skip != null) : true
         * (testSetup) : true
         * (curl) : true
         */
         //Arrange Statement(s)
        Path pathMock = mock(Path.class, "path");
        List<String> stringList = new ArrayList<>(List.of(""));
        Snippet target = new Snippet(pathMock, 2, 2, "contents1", true, true, true, true, false, "", true, "", "", "", "", true, stringList, true, "name1");
        
        //Act Statement(s)
        String result = target.toString();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("path[2:2]()// CONSOLE// TEST[catch: ][skip=][continued][setup:][teardown:][warning:][skip_shard_failures]// TESTRESPONSE[skip=]// TESTSETUP(curl)")));
    }

    //Sapient generated method id: ${isConsoleCandidateWhenTestResponse}, hash: B1F824E3EA22DEB0FEF65B190F987CB3
    @Test()
    void isConsoleCandidateWhenTestResponse() {
        /* Branches:
         * (console != null) : false
         * (testResponse) : true
         */
         //Arrange Statement(s)
        List<String> stringList = new ArrayList<>();
        Snippet target = new Snippet(pathMock, 0, 0, "contents1", (Boolean) null, false, true, false, false, "skip1", false, "language1", "catchPart1", "setup1", "teardown1", false, stringList, false, "name1");
        
        //Act Statement(s)
        boolean result = target.isConsoleCandidate();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${isConsoleCandidateWhenCurl}, hash: 81B7DB4215483F6BF21102AE3F60283F
    @Test()
    void isConsoleCandidateWhenCurl() {
        /* Branches:
         * (console != null) : false
         * (testResponse) : false
         * (language.equals("js")) : false
         * (curl) : true
         */
         //Arrange Statement(s)
        List<String> stringList = new ArrayList<>();
        Snippet target = new Snippet(pathMock, 0, 0, "contents1", (Boolean) null, false, false, false, false, "skip1", false, "A", "catchPart1", "setup1", "teardown1", true, stringList, false, "name1");
        
        //Act Statement(s)
        boolean result = target.isConsoleCandidate();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }
}

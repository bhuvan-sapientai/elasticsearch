package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class ConcatFilesTaskSapientGeneratedTest {

    //Sapient generated method id: ${concatFilesWhenGetHeaderLineIsNotNullThrowsNullPointerException}, hash: 6526978A453F413FD9C0896E57287400
    @Disabled()
    @Test()
    void concatFilesWhenGetHeaderLineIsNotNullThrowsNullPointerException() throws IOException {
        /* Branches:
         * (getHeaderLine() != null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ConcatFilesTask target = new ConcatFilesTask();
        target.setHeaderLine("headerLine1");
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            target.concatFiles();
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${concatFilesWhenGetHeaderLineIsNullThrowsNullPointerException}, hash: 6A34D5E9FBF36C4B807602D1B6D573C1
    @Disabled()
    @Test()
    void concatFilesWhenGetHeaderLineIsNullThrowsNullPointerException() throws IOException {
        /* Branches:
         * (getHeaderLine() != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ConcatFilesTask target = new ConcatFilesTask();
        target.setHeaderLine((String) null);
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            target.concatFiles();
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}

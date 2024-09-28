package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.internal.file.FileException;
import org.gradle.internal.file.Chmod;
import java.io.File;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class EmptyDirTaskSapientGeneratedTest {

    //Sapient generated method id: ${createTest}, hash: 50DF14C02CBBD246EF6BEA4170DE60F7
    @Disabled()
    @Test()
    void createTest() throws FileException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EmptyDirTask target = spy(new EmptyDirTask());
        Chmod chmodMock = mock(Chmod.class);
        doReturn(chmodMock).when(target).getChmod();
        File file = new File("pathname1");
        doNothing().when(chmodMock).chmod(file, 0);
        //Act Statement(s)
        target.create();
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target).getChmod();
            verify(chmodMock).chmod(file, 0);
        });
    }

    //Sapient generated method id: ${getChmodThrowsUnsupportedOperationException}, hash: 7379EE2080DB63B790A658F07BFEADF7
    @Disabled()
    @Test()
    void getChmodThrowsUnsupportedOperationException() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EmptyDirTask target = new EmptyDirTask();
        //Act Statement(s)
        final UnsupportedOperationException result = assertThrows(UnsupportedOperationException.class, () -> {
            target.getChmod();
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getDirPathTest}, hash: 9603770BFE2EBF75DD6415D3CDF108FE
    @Disabled()
    @Test()
    void getDirPathTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        EmptyDirTask target = new EmptyDirTask();
        //Act Statement(s)
        String result = target.getDirPath();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }
}

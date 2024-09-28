package org.elasticsearch.gradle.internal.precommit;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.File;
import org.gradle.api.file.FileCollection;
import org.gradle.api.model.ObjectFactory;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class JavaModulePrecommitTaskSapientGeneratedTest {

    private final ObjectFactory objectFactoryMock = mock(ObjectFactory.class);

    //Sapient generated method id: ${setClassesDirsTest}, hash: F5CFFC2D5333A5D09495E5278501D203
    @Disabled()
    @Test()
    void setClassesDirsTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        JavaModulePrecommitTask target = new JavaModulePrecommitTask(objectFactoryMock);
        FileCollection fileCollectionMock = mock(FileCollection.class);
        //Act Statement(s)
        target.setClassesDirs(fileCollectionMock);
        //Assert statement(s)
        assertAll("result", () -> assertThat(target.getClassesDirs(), is(notNullValue())));
    }

    //Sapient generated method id: ${setResourcesDirsTest}, hash: 6567DE7C399F57D61E554E817AE26654
    @Disabled()
    @Test()
    void setResourcesDirsTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        JavaModulePrecommitTask target = new JavaModulePrecommitTask(objectFactoryMock);
        File file = new File("pathname1");
        //Act Statement(s)
        target.setResourcesDirs(file);
        //Assert statement(s)
        assertAll("result", () -> assertThat(target.getResourcesDir(), equalTo(file)));
    }

    //Sapient generated method id: ${checkModuleThrowsNullPointerException}, hash: 4C5F19D6FC81222133D3A7D080CE0EA3
    @Disabled()
    @Test()
    void checkModuleThrowsNullPointerException() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        JavaModulePrecommitTask target = new JavaModulePrecommitTask(objectFactoryMock);
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            target.checkModule();
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}

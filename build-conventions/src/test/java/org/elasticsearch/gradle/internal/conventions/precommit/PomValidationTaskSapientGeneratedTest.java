package org.elasticsearch.gradle.internal.conventions.precommit;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.GradleException;
import java.io.File;
import org.gradle.api.logging.Logger;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PomValidationTaskSapientGeneratedTest {

    private final RegularFileProperty pomFileMock = mock(RegularFileProperty.class, "pomFile");

    private final Logger loggerMock = mock(Logger.class);

    private final ObjectFactory objectFactoryMock = mock(ObjectFactory.class);

    private final Provider<File> providerMock = mock(Provider.class);

    private final Provider<File> providerMock2 = mock(Provider.class);

    //Sapient generated method id: ${checkPomWhenFoundErrorThrowsGradleException}, hash: 5728D272B6D4231B277982AD906E4D76
    @Disabled()
    @Test()
    void checkPomWhenFoundErrorThrowsGradleException() throws Exception {
        /* Branches:
         * (value == null) : true  #  inside validateNonNull method
         * (foundError) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        File file = new File("pathname1");
        doReturn(file).when(providerMock).get();
        Object object = new Object();
        doReturn(object).when(providerMock2).get();
        Provider<File> providerMock3 = mock(Provider.class);
        Object object2 = new Object();
        doReturn(object2).when(providerMock3).get();
        Provider<File> providerMock4 = mock(Provider.class);
        Object object3 = new Object();
        doReturn(object3).when(providerMock4).get();
        Provider<File> providerMock5 = mock(Provider.class);
        Object object4 = new Object();
        doReturn(object4).when(providerMock5).get();
        Provider<File> providerMock6 = mock(Provider.class);
        Object object5 = new Object();
        doReturn(object5).when(providerMock6).get();
        Provider<File> providerMock7 = mock(Provider.class);
        Object object6 = new Object();
        doReturn(object6).when(providerMock7).get();
        Provider<File> providerMock8 = mock(Provider.class);
        Object object7 = new Object();
        doReturn(object7).when(providerMock8).get();
        Provider<File> providerMock9 = mock(Provider.class);
        Object object8 = new Object();
        doReturn(object8).when(providerMock9).get();
        Provider<File> providerMock10 = mock(Provider.class);
        doReturn(providerMock, providerMock2, providerMock3, providerMock4, providerMock5, providerMock6, providerMock7, providerMock8, providerMock9, providerMock10).when(pomFileMock).getAsFile();
        Object object9 = new Object();
        doReturn(object9).when(providerMock10).get();
        PomValidationTask target = spy(new PomValidationTask(objectFactoryMock));
        Object[] objectArray = new Object[] { "groupId", "is missing", object };
        doNothing().when(loggerMock).error("{} {} in [{}]", objectArray);
        Logger loggerMock2 = mock(Logger.class);
        Object[] objectArray2 = new Object[] { "artifactId", "is missing", object2 };
        doNothing().when(loggerMock2).error("{} {} in [{}]", objectArray2);
        Logger loggerMock3 = mock(Logger.class);
        Object[] objectArray3 = new Object[] { "version", "is missing", object3 };
        doNothing().when(loggerMock3).error("{} {} in [{}]", objectArray3);
        Logger loggerMock4 = mock(Logger.class);
        Object[] objectArray4 = new Object[] { "name", "is missing", object4 };
        doNothing().when(loggerMock4).error("{} {} in [{}]", objectArray4);
        Logger loggerMock5 = mock(Logger.class);
        Object[] objectArray5 = new Object[] { "description", "is missing", object5 };
        doNothing().when(loggerMock5).error("{} {} in [{}]", objectArray5);
        Logger loggerMock6 = mock(Logger.class);
        Object[] objectArray6 = new Object[] { "url", "is missing", object6 };
        doNothing().when(loggerMock6).error("{} {} in [{}]", objectArray6);
        Logger loggerMock7 = mock(Logger.class);
        Object[] objectArray7 = new Object[] { "licenses", "is missing", object7 };
        doNothing().when(loggerMock7).error("{} {} in [{}]", objectArray7);
        Logger loggerMock8 = mock(Logger.class);
        Object[] objectArray8 = new Object[] { "developers", "is missing", object8 };
        doNothing().when(loggerMock8).error("{} {} in [{}]", objectArray8);
        Logger loggerMock9 = mock(Logger.class);
        doReturn(loggerMock, loggerMock2, loggerMock3, loggerMock4, loggerMock5, loggerMock6, loggerMock7, loggerMock8, loggerMock9).when(target).getLogger();
        Object[] objectArray9 = new Object[] { "scm", "is missing", object9 };
        doNothing().when(loggerMock9).error("{} {} in [{}]", objectArray9);
        doReturn("A").when(target).getPath();
        GradleException gradleException = new GradleException("Check failed for task 'A', see console log for details");
        //Act Statement(s)
        final GradleException result = assertThrows(GradleException.class, () -> {
            target.checkPom();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(gradleException.getMessage()));
            verify(pomFileMock, times(10)).getAsFile();
            verify(providerMock).get();
            verify(providerMock2).get();
            verify(providerMock3).get();
            verify(providerMock4).get();
            verify(providerMock5).get();
            verify(providerMock6).get();
            verify(providerMock7).get();
            verify(providerMock8).get();
            verify(providerMock9).get();
            verify(providerMock10).get();
            verify(target, times(9)).getLogger();
            verify(loggerMock).error("{} {} in [{}]", objectArray);
            verify(loggerMock2).error("{} {} in [{}]", objectArray2);
            verify(loggerMock3).error("{} {} in [{}]", objectArray3);
            verify(loggerMock4).error("{} {} in [{}]", objectArray4);
            verify(loggerMock5).error("{} {} in [{}]", objectArray5);
            verify(loggerMock6).error("{} {} in [{}]", objectArray6);
            verify(loggerMock7).error("{} {} in [{}]", objectArray7);
            verify(loggerMock8).error("{} {} in [{}]", objectArray8);
            verify(loggerMock9).error("{} {} in [{}]", objectArray9);
            verify(target).getPath();
        });
    }

    //Sapient generated method id: ${checkPomWhenDefaultBranchThrowsThrowable}, hash: 9C64D95266A00956CDA6CFBDF6C2FDC2
    @Disabled()
    @Test()
    void checkPomWhenDefaultBranchThrowsThrowable() throws Exception {
        /* Branches:
         * (value == null) : false  #  inside validateNonNull method
         * (branch expression (line 46)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        File file = new File("pathname1");
        doReturn(file).when(providerMock).get();
        doReturn(providerMock, providerMock2).when(pomFileMock).getAsFile();
        Object object = new Object();
        doReturn(object).when(providerMock2).get();
        PomValidationTask target = spy(new PomValidationTask(objectFactoryMock));
        doReturn(loggerMock).when(target).getLogger();
        Object[] objectArray = new Object[] { "scm", "is missing", object };
        doNothing().when(loggerMock).error("{} {} in [{}]", objectArray);
        //Act Statement(s)
        final Throwable result = assertThrows(Throwable.class, () -> {
            target.checkPom();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(pomFileMock, times(2)).getAsFile();
            verify(providerMock).get();
            verify(providerMock2).get();
            verify(target).getLogger();
            verify(loggerMock).error("{} {} in [{}]", objectArray);
        });
    }

    //Sapient generated method id: ${checkPomWhenNotFoundError}, hash: 931ECE7C36E1117AE5A89191DDC7A986
    @Disabled()
    @Test()
    void checkPomWhenNotFoundError() throws Exception {
        /* Branches:
         * (value == null) : false  #  inside validateNonNull method
         * (foundError) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(providerMock).when(pomFileMock).getAsFile();
        File file = new File("pathname1");
        doReturn(file).when(providerMock).get();
        PomValidationTask target = new PomValidationTask(objectFactoryMock);
        //Act Statement(s)
        target.checkPom();
        //Assert statement(s)
        assertAll("result", () -> {
            verify(pomFileMock).getAsFile();
            verify(providerMock).get();
        });
    }

    //Sapient generated method id: ${checkPomWhenDefaultBranchAndFoundErrorThrowsGradleException}, hash: 0578D1D5A35DC5BA3118E115D4260651
    @Disabled()
    @Test()
    void checkPomWhenDefaultBranchAndFoundErrorThrowsGradleException() throws Exception {
        /* Branches:
         * (value == null) : false  #  inside validateNonNull method
         * (branch expression (line 46)) : true
         * (foundError) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        File file = new File("pathname1");
        doReturn(file).when(providerMock).get();
        doReturn(providerMock, providerMock2).when(pomFileMock).getAsFile();
        Object object = new Object();
        doReturn(object).when(providerMock2).get();
        PomValidationTask target = spy(new PomValidationTask(objectFactoryMock));
        doReturn(loggerMock).when(target).getLogger();
        Object[] objectArray = new Object[] { "scm", "is missing", object };
        doNothing().when(loggerMock).error("{} {} in [{}]", objectArray);
        doReturn("A").when(target).getPath();
        GradleException gradleException = new GradleException("Check failed for task 'A', see console log for details");
        //Act Statement(s)
        final GradleException result = assertThrows(GradleException.class, () -> {
            target.checkPom();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(gradleException.getMessage()));
            verify(pomFileMock, times(2)).getAsFile();
            verify(providerMock).get();
            verify(providerMock2).get();
            verify(target).getLogger();
            verify(loggerMock).error("{} {} in [{}]", objectArray);
            verify(target).getPath();
        });
    }

    //Sapient generated method id: ${checkPomWhenDefaultBranchAndNotFoundError}, hash: F8B3C09EE9C8C11C9AE381101A82D705
    @Disabled()
    @Test()
    void checkPomWhenDefaultBranchAndNotFoundError() throws Exception {
        /* Branches:
         * (value == null) : false  #  inside validateNonNull method
         * (branch expression (line 46)) : true
         * (foundError) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Potential harmful system call (Runnable.run) detected; Learn more: https://github.com/Sapient-AI/docs#disabled-generated-tests
         *  Suggestions:
         *  This method should be avoided from unit testing. This can be covered during integration testing.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(providerMock).when(pomFileMock).getAsFile();
        File file = new File("pathname1");
        doReturn(file).when(providerMock).get();
        PomValidationTask target = new PomValidationTask(objectFactoryMock);
        //Act Statement(s)
        target.checkPom();
        //Assert statement(s)
        assertAll("result", () -> {
            verify(pomFileMock).getAsFile();
            verify(providerMock).get();
        });
    }
}

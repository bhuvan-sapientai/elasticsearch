package org.elasticsearch.gradle.jarhell;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.Action;
import org.gradle.api.file.FileCollection;
import org.gradle.api.provider.Provider;
import org.mockito.MockitoAnnotations;
import org.gradle.process.ExecOperations;
import org.gradle.api.file.ProjectLayout;
import org.elasticsearch.gradle.LoggedExec;
import org.mockito.MockedStatic;
import java.io.File;
import org.gradle.process.ExecResult;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class JarHellTaskSapientGeneratedTest {

    private final ProjectLayout projectLayoutMock = mock(ProjectLayout.class, "projectLayout");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private JarHellTask target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${getSuccessMarkerTest}, hash: 95D9304BB401026FD8EE8FB984A75D98
    @Disabled()
    @Test()
    void getSuccessMarkerTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DirectoryProperty directoryPropertyMock = mock(DirectoryProperty.class);
        doReturn(directoryPropertyMock).when(projectLayoutMock).getBuildDirectory();
        Provider<File> providerMock = mock(Provider.class);
        doReturn(providerMock).when(directoryPropertyMock).getAsFile();
        File file = new File("pathname1");
        doReturn(file).when(providerMock).get();
        ExecOperations execOperationsMock = mock(ExecOperations.class);
        ProjectLayout projectLayoutMock2 = mock(ProjectLayout.class);
        target = spy(new JarHellTask(execOperationsMock, projectLayoutMock2));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(target).getName();
        //Act Statement(s)
        File result = target.getSuccessMarker();
        File file2 = new File(file, "markers/A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(file2));
            verify(projectLayoutMock).getBuildDirectory();
            verify(directoryPropertyMock).getAsFile();
            verify(providerMock).get();
            verify(target).getName();
        });
    }

    //Sapient generated method id: ${runJarHellCheckTest}, hash: 099C34592144823A1874386979CFE1BC
    @Disabled()
    @Test()
    void runJarHellCheckTest() throws IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ExecResult execResultMock = mock(ExecResult.class);
        ExecOperations execOperationsMock = mock(ExecOperations.class);
        ProjectLayout projectLayoutMock2 = mock(ProjectLayout.class);
        try (MockedStatic<LoggedExec> loggedExec = mockStatic(LoggedExec.class)) {
            loggedExec.when(() -> LoggedExec.javaexec(eq((ExecOperations) null), (Action) any())).thenReturn(execResultMock);
            target = spy(new JarHellTask(execOperationsMock, projectLayoutMock2));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            File file = new File("pathname1");
            doReturn(file).when(target).getSuccessMarker();
            //Act Statement(s)
            target.runJarHellCheck();
            //Assert statement(s)
            assertAll("result", () -> {
                loggedExec.verify(() -> LoggedExec.javaexec(eq((ExecOperations) null), (Action) any()));
                verify(target).getSuccessMarker();
            });
        }
    }

    //Sapient generated method id: ${getClasspathWhenClasspathIsNull}, hash: 82D0DAEFD97BDED4F5E2A967D8E3D17F
    @Disabled()
    @Test()
    void getClasspathWhenClasspathIsNull() {
        /* Branches:
         * (classpath == null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ExecOperations execOperationsMock = mock(ExecOperations.class);
        ProjectLayout projectLayoutMock2 = mock(ProjectLayout.class);
        target = new JarHellTask(execOperationsMock, projectLayoutMock2);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        FileCollection result = target.getClasspath();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }
}

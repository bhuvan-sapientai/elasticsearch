package org.elasticsearch.gradle.internal.conventions.precommit;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.file.ProjectLayout;
import java.io.File;
import org.gradle.api.provider.Provider;
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

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PrecommitTaskSapientGeneratedTest {

    //Sapient generated method id: ${getSuccessMarkerTest}, hash: E28C05A8C2FF8A8E365BCA1C41C27DD2
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
        PrecommitTask target = spy(new PrecommitTask());
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        doReturn(projectLayoutMock).when(target).getProjectLayout();
        DirectoryProperty directoryPropertyMock = mock(DirectoryProperty.class);
        doReturn(directoryPropertyMock).when(projectLayoutMock).getBuildDirectory();
        Provider<File> providerMock = mock(Provider.class);
        doReturn(providerMock).when(directoryPropertyMock).getAsFile();
        File file = new File("pathname1");
        doReturn(file).when(providerMock).get();
        doReturn("A").when(target).getName();
        //Act Statement(s)
        File result = target.getSuccessMarker();
        File file2 = new File(file, "markers/A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(file2));
            verify(target).getProjectLayout();
            verify(projectLayoutMock).getBuildDirectory();
            verify(directoryPropertyMock).getAsFile();
            verify(providerMock).get();
            verify(target).getName();
        });
    }

    //Sapient generated method id: ${writeMarkerTest}, hash: 51A5222881BBEEB756E8C859C8A07356
    @Disabled()
    @Test()
    void writeMarkerTest() throws IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        PrecommitTask target = spy(new PrecommitTask());
        File file = new File("pathname1");
        doReturn(file).when(target).getSuccessMarker();
        //Act Statement(s)
        target.writeMarker();
        //Assert statement(s)
        assertAll("result", () -> verify(target).getSuccessMarker());
    }

    //Sapient generated method id: ${getProjectLayoutThrowsUnsupportedOperationException}, hash: EF7FDCFBE4B17AC2358470371A682686
    @Disabled()
    @Test()
    void getProjectLayoutThrowsUnsupportedOperationException() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        PrecommitTask target = new PrecommitTask();
        //Act Statement(s)
        final UnsupportedOperationException result = assertThrows(UnsupportedOperationException.class, () -> {
            target.getProjectLayout();
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }
}

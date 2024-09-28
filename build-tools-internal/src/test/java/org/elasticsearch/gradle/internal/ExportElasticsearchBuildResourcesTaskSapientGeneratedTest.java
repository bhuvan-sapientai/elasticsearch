package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.gradle.api.tasks.StopExecutionException;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.GradleException;
import org.mockito.MockitoAnnotations;
import java.util.Set;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.internal.tasks.TaskStateInternal;
import java.io.File;
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
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class ExportElasticsearchBuildResourcesTaskSapientGeneratedTest {

    private final DirectoryProperty outputDirMock = mock(DirectoryProperty.class, "outputDir");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private ExportElasticsearchBuildResourcesTask target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${getResourcesTest}, hash: D3A06233633BBEFD64DBEA081788580F
    @Disabled()
    @Test()
    void getResourcesTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        target = new ExportElasticsearchBuildResourcesTask(objectFactoryMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        Set<String> result = target.getResources();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getResourcesClasspathTest}, hash: D809CDC029E732FE7F65C917BEAEDA99
    @Disabled()
    @Test()
    void getResourcesClasspathTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        target = new ExportElasticsearchBuildResourcesTask(objectFactoryMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getResourcesClasspath();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${setOutputDirTest}, hash: DC43DC4E65EBBEB896C60930F8C43639
    @Disabled()
    @Test()
    void setOutputDirTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        File file = new File("pathname1");
        doNothing().when(outputDirMock).set(file);
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        target = new ExportElasticsearchBuildResourcesTask(objectFactoryMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        target.setOutputDir(file);
        //Assert statement(s)
        assertAll("result", () -> verify(outputDirMock).set(file));
    }

    //Sapient generated method id: ${copyWhenGetStateGetExecutingThrowsGradleException}, hash: 4F6E3E2135E8BE1856DB35B7902C4083
    @Disabled()
    @Test()
    void copyWhenGetStateGetExecutingThrowsGradleException() {
        /* Branches:
         * (getState().getExecuted()) : false
         * (getState().getExecuting()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        target = spy(new ExportElasticsearchBuildResourcesTask(objectFactoryMock));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        TaskStateInternal taskStateInternalMock = mock(TaskStateInternal.class);
        doReturn(false).when(taskStateInternalMock).getExecuted();
        TaskStateInternal taskStateInternal = new TaskStateInternal();
        taskStateInternal.setExecuting(true);
        doReturn(taskStateInternalMock, taskStateInternal).when(target).getState();
        GradleException gradleException = new GradleException("buildResources can't be configured after the task ran. Make sure task is not used after configuration time");
        //Act Statement(s)
        final GradleException result = assertThrows(GradleException.class, () -> {
            target.copy("resource1");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(gradleException.getMessage()));
            verify(target, times(2)).getState();
            verify(taskStateInternalMock).getExecuted();
        });
    }

    //Sapient generated method id: ${copyWhenGetStateNotGetExecuting}, hash: FB8EC28F5A8B73FA7CFD09076A518863
    @Disabled()
    @Test()
    void copyWhenGetStateNotGetExecuting() {
        /* Branches:
         * (getState().getExecuted()) : false
         * (getState().getExecuting()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        target = spy(new ExportElasticsearchBuildResourcesTask(objectFactoryMock));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        TaskStateInternal taskStateInternalMock = mock(TaskStateInternal.class);
        doReturn(false).when(taskStateInternalMock).getExecuted();
        TaskStateInternal taskStateInternal = new TaskStateInternal();
        taskStateInternal.setExecuting(false);
        doReturn(taskStateInternalMock, taskStateInternal).when(target).getState();
        //Act Statement(s)
        target.copy("resource1");
        //Assert statement(s)
        assertAll("result", () -> {
            verify(target, times(2)).getState();
            verify(taskStateInternalMock).getExecuted();
        });
    }

    //Sapient generated method id: ${doExportWhenResourcesIsEmptyThrowsStopExecutionException}, hash: 7EE7357E71D45FAB0E1E701233626000
    @Disabled()
    @Test()
    void doExportWhenResourcesIsEmptyThrowsStopExecutionException() {
        /* Branches:
         * (resources.isEmpty()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        target = spy(new ExportElasticsearchBuildResourcesTask(objectFactoryMock));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doNothing().when(target).setDidWork(false);
        //Act Statement(s)
        final StopExecutionException result = assertThrows(StopExecutionException.class, () -> {
            target.doExport();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(target).setDidWork(false);
        });
    }

    //Sapient generated method id: ${doExportWhenResourcesNotIsEmpty}, hash: 97D0DD103FA139E9B03B8617CFE5C6DA
    @Disabled()
    @Test()
    void doExportWhenResourcesNotIsEmpty() {
        /* Branches:
         * (resources.isEmpty()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        target = new ExportElasticsearchBuildResourcesTask(objectFactoryMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        target.doExport();
    }
}

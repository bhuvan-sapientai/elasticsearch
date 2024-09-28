package org.elasticsearch.gradle.internal.precommit;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.gradle.workers.WorkerExecutor;
import org.gradle.api.Action;
import org.gradle.api.file.FileCollection;
import org.gradle.api.provider.SetProperty;
import org.gradle.workers.WorkQueue;
import org.mockito.MockitoAnnotations;
import org.elasticsearch.gradle.util.GradleUtils;
import org.gradle.api.specs.Spec;
import org.gradle.api.model.ObjectFactory;
import java.util.Map;
import java.util.HashMap;
import org.gradle.api.file.ProjectLayout;
import org.mockito.MockedStatic;
import java.io.File;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class SplitPackagesAuditTaskSapientGeneratedTest {

    private final WorkerExecutor workerExecutorMock = mock(WorkerExecutor.class, "workerExecutor");

    private final FileCollection classpathMock = mock(FileCollection.class, "classpath");

    private final SetProperty<String> ignoreClassesMock = mock(SetProperty.class, "ignoreClasses");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private SplitPackagesAuditTask target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${auditSplitPackagesTest}, hash: DD17CCF6BAD30D2FD7AF6FB96C3A2632
    @Disabled()
    @Test()
    void auditSplitPackagesTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        WorkQueue workQueueMock = mock(WorkQueue.class);
        WorkerExecutor workerExecutorMock2 = mock(WorkerExecutor.class);
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        try (MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            doReturn(workQueueMock).when(workerExecutorMock).noIsolation();
            doNothing().when(workQueueMock).submit(eq(SplitPackagesAuditTask.SplitPackagesAuditAction.class), (Action) any());
            gradleUtils.when(() -> GradleUtils.projectPath("A")).thenReturn("return_of_projectPath1");
            target = spy(new SplitPackagesAuditTask(workerExecutorMock2, objectFactoryMock, projectLayoutMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Map<File, String> fileStringMap = new HashMap<>();
            target.setProjectBuildDirs(fileStringMap);
            doReturn("A").when(target).getPath();
            //Act Statement(s)
            target.auditSplitPackages();
            //Assert statement(s)
            assertAll("result", () -> {
                verify(workerExecutorMock).noIsolation();
                verify(workQueueMock).submit(eq(SplitPackagesAuditTask.SplitPackagesAuditAction.class), (Action) any());
                gradleUtils.verify(() -> GradleUtils.projectPath("A"), atLeast(1));
                verify(target).getPath();
            });
        }
    }

    //Sapient generated method id: ${getClasspathTest}, hash: A300D371182803D6807E98FE8D2A07C7
    @Disabled()
    @Test()
    void getClasspathTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        FileCollection fileCollectionMock = mock(FileCollection.class);
        doReturn(fileCollectionMock).when(classpathMock).filter((Spec) any());
        WorkerExecutor workerExecutorMock2 = mock(WorkerExecutor.class);
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        target = new SplitPackagesAuditTask(workerExecutorMock2, objectFactoryMock, projectLayoutMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        FileCollection result = target.getClasspath();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(fileCollectionMock));
            verify(classpathMock).filter((Spec) any());
        });
    }

    //Sapient generated method id: ${ignoreClassesWhenClassesIsNotEmpty}, hash: 54B3F541CB053B9BE34B9C05350BB399
    @Disabled()
    @Test()
    void ignoreClassesWhenClassesIsNotEmpty() {
        /* Branches:
         * (for-each(classes)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doNothing().when(ignoreClassesMock).add("classesItem1");
        WorkerExecutor workerExecutorMock2 = mock(WorkerExecutor.class);
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        target = new SplitPackagesAuditTask(workerExecutorMock2, objectFactoryMock, projectLayoutMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        String[] stringArray = new String[] { "classesItem1" };
        //Act Statement(s)
        target.ignoreClasses(stringArray);
        //Assert statement(s)
        assertAll("result", () -> verify(ignoreClassesMock).add("classesItem1"));
    }
}

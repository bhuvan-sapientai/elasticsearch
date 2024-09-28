package org.elasticsearch.gradle.internal.conventions;

import org.junit.jupiter.api.Timeout;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.elasticsearch.gradle.internal.conventions.precommit.LicenseHeadersPrecommitPlugin;
import org.elasticsearch.gradle.internal.conventions.info.ParallelDetector;
import org.gradle.api.Project;
import org.gradle.api.tasks.testing.Test;
import org.elasticsearch.gradle.internal.conventions.util.Util;
import org.gradle.api.tasks.TaskCollection;
import org.gradle.api.tasks.bundling.Jar;
import org.mockito.MockedStatic;
import java.io.File;
import org.gradle.api.Plugin;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BuildToolsConventionsPluginSapientGeneratedTest {

    //Sapient generated method id: ${applyWhenUtilGetBooleanPropertyTests_fips_enabledFalseEqualsFalse}, hash: 18603F5055C59C5F7CDAEF9BD8C649C4
    @Disabled()
    @org.junit.jupiter.api.Test()
    void applyWhenUtilGetBooleanPropertyTests_fips_enabledFalseEqualsFalse() {
        /* Branches:
         * (Util.getBooleanProperty("tests.fips.enabled", false) == false) : true  #  inside lambda$apply$0 method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.File
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        Plugin pluginMock = mock(Plugin.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskCollection taskCollectionMock = mock(TaskCollection.class);
        TaskContainer taskContainerMock2 = mock(TaskContainer.class);
        TaskCollection taskCollectionMock2 = mock(TaskCollection.class);
        try (MockedStatic<ParallelDetector> parallelDetector = mockStatic(ParallelDetector.class)) {
            doReturn(pluginContainerMock).when(projectMock).getPlugins();
            doReturn(pluginMock).when(pluginContainerMock).apply(LicenseHeadersPrecommitPlugin.class);
            doReturn(taskCollectionMock).when(taskContainerMock).withType(Test.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            doReturn(taskContainerMock, taskContainerMock2).when(projectMock).getTasks();
            doReturn(taskCollectionMock2).when(taskContainerMock2).withType(Jar.class);
            doNothing().when(taskCollectionMock2).configureEach((Action) any());
            File file = new File("pathname1");
            doReturn(file).when(projectMock).getBuildDir();
            parallelDetector.when(() -> ParallelDetector.findDefaultParallel(projectMock)).thenReturn(0);
            BuildToolsConventionsPlugin target = new BuildToolsConventionsPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).getPlugins();
                verify(pluginContainerMock).apply(LicenseHeadersPrecommitPlugin.class);
                verify(projectMock, times(2)).getTasks();
                verify(taskContainerMock).withType(Test.class);
                verify(taskCollectionMock).configureEach((Action) any());
                verify(taskContainerMock2).withType(Jar.class);
                verify(taskCollectionMock2).configureEach((Action) any());
                verify(projectMock).getBuildDir();
                parallelDetector.verify(() -> ParallelDetector.findDefaultParallel(projectMock), atLeast(1));
            });
        }
    }
}

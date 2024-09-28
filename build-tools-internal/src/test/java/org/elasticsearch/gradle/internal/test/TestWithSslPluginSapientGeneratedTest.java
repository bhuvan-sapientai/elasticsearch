package org.elasticsearch.gradle.internal.test;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.UnknownTaskException;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.NamedDomainObjectContainer;
import org.elasticsearch.gradle.internal.precommit.ForbiddenPatternsPrecommitPlugin;
import org.elasticsearch.gradle.internal.test.rest.LegacyJavaRestTestPlugin;
import org.elasticsearch.gradle.testclusters.TestClustersPlugin;
import org.elasticsearch.gradle.internal.conventions.util.Util;
import org.gradle.api.tasks.TaskProvider;
import org.elasticsearch.gradle.internal.ExportElasticsearchBuildResourcesTask;
import org.gradle.api.tasks.SourceSetContainer;
import java.util.Optional;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.gradle.api.file.SourceDirectorySet;
import org.elasticsearch.gradle.internal.precommit.ForbiddenPatternsTask;
import org.elasticsearch.gradle.testclusters.TestClustersAware;
import org.gradle.api.Project;
import org.gradle.api.plugins.PluginCollection;
import org.gradle.api.tasks.TaskCollection;
import org.mockito.MockedStatic;
import java.io.File;
import org.elasticsearch.gradle.internal.info.BuildParams;
import org.elasticsearch.gradle.internal.precommit.FilePermissionsPrecommitPlugin;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class TestWithSslPluginSapientGeneratedTest {

    private final ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);

    private final NamedDomainObjectContainer namedDomainObjectContainerMock = mock(NamedDomainObjectContainer.class);

    private final PluginCollection pluginCollectionMock = mock(PluginCollection.class);

    private final PluginCollection pluginCollectionMock2 = mock(PluginCollection.class);

    private final PluginCollection pluginCollectionMock3 = mock(PluginCollection.class);

    private final PluginCollection pluginCollectionMock4 = mock(PluginCollection.class);

    private final PluginCollection pluginCollectionMock5 = mock(PluginCollection.class);

    private final PluginContainer pluginContainerMock = mock(PluginContainer.class);

    private final PluginContainer pluginContainerMock2 = mock(PluginContainer.class);

    private final PluginContainer pluginContainerMock3 = mock(PluginContainer.class);

    private final PluginContainer pluginContainerMock4 = mock(PluginContainer.class);

    private final PluginContainer pluginContainerMock5 = mock(PluginContainer.class);

    private final Project projectMock = mock(Project.class);

    private final SourceDirectorySet sourceDirectorySetMock = mock(SourceDirectorySet.class);

    private final SourceDirectorySet sourceDirectorySetMock2 = mock(SourceDirectorySet.class);

    private final SourceDirectorySet sourceDirectorySetMock3 = mock(SourceDirectorySet.class);

    private final SourceDirectorySet sourceDirectorySetMock4 = mock(SourceDirectorySet.class);

    private final SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);

    private final SourceSet sourceSetMock = mock(SourceSet.class);

    private final SourceSet sourceSetMock2 = mock(SourceSet.class);

    private final TaskCollection taskCollectionMock = mock(TaskCollection.class);

    private final TaskCollection taskCollectionMock2 = mock(TaskCollection.class);

    private final TaskCollection taskCollectionMock3 = mock(TaskCollection.class);

    private final TaskCollection taskCollectionMock4 = mock(TaskCollection.class);

    private final TaskCollection taskCollectionMock5 = mock(TaskCollection.class);

    private final TaskContainer taskContainerMock = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock10 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock2 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock3 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock4 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock5 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock6 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock7 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock8 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock9 = mock(TaskContainer.class);

    private final TaskProvider<ExportElasticsearchBuildResourcesTask> taskProviderMock = mock(TaskProvider.class);

    private final TaskProvider taskProviderMock2 = mock(TaskProvider.class);

    private final TaskProvider taskProviderMock3 = mock(TaskProvider.class);

    private final TaskProvider taskProviderMock4 = mock(TaskProvider.class);

    private final TaskProvider taskProviderMock5 = mock(TaskProvider.class);

    //Sapient generated method id: ${applyWhenBuildParamsIsInFipsJvm}, hash: 5EC9B8C4BCCCA979D33EAF1697EEB2BB
    @Disabled()
    @Test()
    void applyWhenBuildParamsIsInFipsJvm() throws UnknownDomainObjectException, InvalidUserDataException, UnknownTaskException {
        /* Branches:
         * (BuildParams.isInFipsJvm()) : true  #  inside lambda$apply$13 method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.File
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Util> util = mockStatic(Util.class);
            MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            File file = new File("pathname1");
            doReturn(taskProviderMock).when(taskContainerMock).register(eq("copyTestCertificates"), eq(ExportElasticsearchBuildResourcesTask.class), (Action) any());
            doReturn(pluginCollectionMock).when(pluginContainerMock).withType(ForbiddenPatternsPrecommitPlugin.class);
            doNothing().when(pluginCollectionMock).configureEach((Action) any());
            doReturn(taskProviderMock2).when(taskContainerMock2).named("forbiddenPatterns");
            doNothing().when(taskProviderMock2).configure((Action) any());
            doReturn(pluginCollectionMock2).when(pluginContainerMock2).withType(FilePermissionsPrecommitPlugin.class);
            doNothing().when(pluginCollectionMock2).configureEach((Action) any());
            doReturn(taskProviderMock3).when(taskContainerMock3).named("filepermissions");
            doNothing().when(taskProviderMock3).configure((Action) any());
            doReturn(pluginCollectionMock3).when(pluginContainerMock3).withType(StandaloneRestTestPlugin.class);
            doNothing().when(pluginCollectionMock3).configureEach((Action) any());
            doReturn(taskProviderMock4).when(taskContainerMock4).named("return_of_getProcessResourcesTaskName1");
            doNothing().when(taskProviderMock4).configure((Action) any());
            doReturn(taskCollectionMock).when(taskContainerMock5).withType(TestClustersAware.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            doReturn(taskCollectionMock2).when(taskContainerMock6).withType(RestIntegTestTask.class);
            doNothing().when(taskCollectionMock2).configureEach((Action) any());
            doReturn(pluginCollectionMock4).when(pluginContainerMock4).withType(LegacyJavaRestTestPlugin.class);
            doNothing().when(pluginCollectionMock4).configureEach((Action) any());
            doReturn(taskProviderMock5).when(taskContainerMock7).named("return_of_getProcessResourcesTaskName1");
            doNothing().when(taskProviderMock5).configure((Action) any());
            doReturn(taskCollectionMock3).when(taskContainerMock8).withType(TestClustersAware.class);
            doNothing().when(taskCollectionMock3).configureEach((Action) any());
            doReturn(taskCollectionMock4).when(taskContainerMock9).withType(RestIntegTestTask.class);
            doNothing().when(taskCollectionMock4).configureEach((Action) any());
            doReturn(pluginContainerMock, pluginContainerMock2, pluginContainerMock3, pluginContainerMock4, pluginContainerMock5).when(projectMock).getPlugins();
            doReturn(pluginCollectionMock5).when(pluginContainerMock5).withType(TestClustersPlugin.class);
            doNothing().when(pluginCollectionMock5).configureEach((Action) any());
            File file2 = new File("pathname1");
            doReturn(file, file2).when(projectMock).getBuildDir();
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(namedDomainObjectContainerMock).when(extensionContainerMock).getByName("testClusters");
            doNothing().when(namedDomainObjectContainerMock).configureEach((Action) any());
            doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3, taskContainerMock4, taskContainerMock5, taskContainerMock6, taskContainerMock7, taskContainerMock8, taskContainerMock9, taskContainerMock10).when(projectMock).getTasks();
            doReturn(taskCollectionMock5).when(taskContainerMock10).withType(ForbiddenPatternsTask.class);
            doNothing().when(taskCollectionMock5).configureEach((Action) any());
            buildParams.when(() -> BuildParams.isInFipsJvm()).thenReturn(true);
            util.when(() -> Util.getJavaTestSourceSet(projectMock)).thenReturn(Optional.of(sourceSetMock));
            doReturn(sourceDirectorySetMock).when(sourceSetMock).getResources();
            doReturn(sourceDirectorySetMock2).when(sourceDirectorySetMock).srcDir((File) any());
            doReturn("return_of_getProcessResourcesTaskName1").when(sourceSetMock).getProcessResourcesTaskName();
            util.when(() -> Util.getJavaSourceSets(projectMock)).thenReturn(sourceSetContainerMock);
            doReturn(sourceSetMock2).when(sourceSetContainerMock).getByName("javaRestTest");
            doReturn(sourceDirectorySetMock3).when(sourceSetMock2).getResources();
            doReturn(sourceDirectorySetMock4).when(sourceDirectorySetMock3).srcDir((File) any());
            doReturn("return_of_getProcessResourcesTaskName1").when(sourceSetMock2).getProcessResourcesTaskName();
            TestWithSslPlugin target = new TestWithSslPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(2)).getBuildDir();
                verify(projectMock, times(10)).getTasks();
                verify(taskContainerMock).register(eq("copyTestCertificates"), eq(ExportElasticsearchBuildResourcesTask.class), (Action) any());
                verify(projectMock, times(5)).getPlugins();
                verify(pluginContainerMock).withType(ForbiddenPatternsPrecommitPlugin.class);
                verify(pluginCollectionMock).configureEach((Action) any());
                verify(taskContainerMock2).named("forbiddenPatterns");
                verify(taskProviderMock2).configure((Action) any());
                verify(pluginContainerMock2).withType(FilePermissionsPrecommitPlugin.class);
                verify(pluginCollectionMock2).configureEach((Action) any());
                verify(taskContainerMock3).named("filepermissions");
                verify(taskProviderMock3).configure((Action) any());
                verify(pluginContainerMock3).withType(StandaloneRestTestPlugin.class);
                verify(pluginCollectionMock3).configureEach((Action) any());
                verify(taskContainerMock4).named("return_of_getProcessResourcesTaskName1");
                verify(taskProviderMock4).configure((Action) any());
                verify(taskContainerMock5).withType(TestClustersAware.class);
                verify(taskCollectionMock).configureEach((Action) any());
                verify(taskContainerMock6).withType(RestIntegTestTask.class);
                verify(taskCollectionMock2).configureEach((Action) any());
                verify(pluginContainerMock4).withType(LegacyJavaRestTestPlugin.class);
                verify(pluginCollectionMock4).configureEach((Action) any());
                verify(taskContainerMock7).named("return_of_getProcessResourcesTaskName1");
                verify(taskProviderMock5).configure((Action) any());
                verify(taskContainerMock8).withType(TestClustersAware.class);
                verify(taskCollectionMock3).configureEach((Action) any());
                verify(taskContainerMock9).withType(RestIntegTestTask.class);
                verify(taskCollectionMock4).configureEach((Action) any());
                verify(pluginContainerMock5).withType(TestClustersPlugin.class);
                verify(pluginCollectionMock5).configureEach((Action) any());
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByName("testClusters");
                verify(namedDomainObjectContainerMock).configureEach((Action) any());
                verify(taskContainerMock10).withType(ForbiddenPatternsTask.class);
                verify(taskCollectionMock5).configureEach((Action) any());
                buildParams.verify(() -> BuildParams.isInFipsJvm(), atLeast(1));
                util.verify(() -> Util.getJavaTestSourceSet(projectMock), atLeast(1));
                verify(sourceSetMock).getResources();
                verify(sourceDirectorySetMock).srcDir((File) any());
                verify(sourceSetMock).getProcessResourcesTaskName();
                util.verify(() -> Util.getJavaSourceSets(projectMock), atLeast(1));
                verify(sourceSetContainerMock).getByName("javaRestTest");
                verify(sourceSetMock2).getResources();
                verify(sourceDirectorySetMock3).srcDir((File) any());
                verify(sourceSetMock2).getProcessResourcesTaskName();
            });
        }
    }

    //Sapient generated method id: ${applyWhenBuildParamsNotIsInFipsJvm}, hash: 5F484815931228E58ACD955AB650C147
    @Disabled()
    @Test()
    void applyWhenBuildParamsNotIsInFipsJvm() throws UnknownDomainObjectException, InvalidUserDataException, UnknownTaskException {
        /* Branches:
         * (BuildParams.isInFipsJvm()) : false  #  inside lambda$apply$13 method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.File
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Util> util = mockStatic(Util.class);
            MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            File file = new File("pathname1");
            doReturn(taskProviderMock).when(taskContainerMock).register(eq("copyTestCertificates"), eq(ExportElasticsearchBuildResourcesTask.class), (Action) any());
            doReturn(pluginCollectionMock).when(pluginContainerMock).withType(ForbiddenPatternsPrecommitPlugin.class);
            doNothing().when(pluginCollectionMock).configureEach((Action) any());
            doReturn(taskProviderMock2).when(taskContainerMock2).named("forbiddenPatterns");
            doNothing().when(taskProviderMock2).configure((Action) any());
            doReturn(pluginCollectionMock2).when(pluginContainerMock2).withType(FilePermissionsPrecommitPlugin.class);
            doNothing().when(pluginCollectionMock2).configureEach((Action) any());
            doReturn(taskProviderMock3).when(taskContainerMock3).named("filepermissions");
            doNothing().when(taskProviderMock3).configure((Action) any());
            doReturn(pluginCollectionMock3).when(pluginContainerMock3).withType(StandaloneRestTestPlugin.class);
            doNothing().when(pluginCollectionMock3).configureEach((Action) any());
            doReturn(taskProviderMock4).when(taskContainerMock4).named("return_of_getProcessResourcesTaskName1");
            doNothing().when(taskProviderMock4).configure((Action) any());
            doReturn(taskCollectionMock).when(taskContainerMock5).withType(TestClustersAware.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            doReturn(taskCollectionMock2).when(taskContainerMock6).withType(RestIntegTestTask.class);
            doNothing().when(taskCollectionMock2).configureEach((Action) any());
            doReturn(pluginCollectionMock4).when(pluginContainerMock4).withType(LegacyJavaRestTestPlugin.class);
            doNothing().when(pluginCollectionMock4).configureEach((Action) any());
            doReturn(taskProviderMock5).when(taskContainerMock7).named("return_of_getProcessResourcesTaskName1");
            doNothing().when(taskProviderMock5).configure((Action) any());
            doReturn(taskCollectionMock3).when(taskContainerMock8).withType(TestClustersAware.class);
            doNothing().when(taskCollectionMock3).configureEach((Action) any());
            doReturn(taskCollectionMock4).when(taskContainerMock9).withType(RestIntegTestTask.class);
            doNothing().when(taskCollectionMock4).configureEach((Action) any());
            doReturn(pluginContainerMock, pluginContainerMock2, pluginContainerMock3, pluginContainerMock4, pluginContainerMock5).when(projectMock).getPlugins();
            doReturn(pluginCollectionMock5).when(pluginContainerMock5).withType(TestClustersPlugin.class);
            doNothing().when(pluginCollectionMock5).configureEach((Action) any());
            File file2 = new File("pathname1");
            doReturn(file, file2).when(projectMock).getBuildDir();
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(namedDomainObjectContainerMock).when(extensionContainerMock).getByName("testClusters");
            doNothing().when(namedDomainObjectContainerMock).configureEach((Action) any());
            doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3, taskContainerMock4, taskContainerMock5, taskContainerMock6, taskContainerMock7, taskContainerMock8, taskContainerMock9, taskContainerMock10).when(projectMock).getTasks();
            doReturn(taskCollectionMock5).when(taskContainerMock10).withType(ForbiddenPatternsTask.class);
            doNothing().when(taskCollectionMock5).configureEach((Action) any());
            buildParams.when(() -> BuildParams.isInFipsJvm()).thenReturn(false);
            util.when(() -> Util.getJavaTestSourceSet(projectMock)).thenReturn(Optional.of(sourceSetMock));
            doReturn(sourceDirectorySetMock).when(sourceSetMock).getResources();
            doReturn(sourceDirectorySetMock2).when(sourceDirectorySetMock).srcDir((File) any());
            doReturn("return_of_getProcessResourcesTaskName1").when(sourceSetMock).getProcessResourcesTaskName();
            util.when(() -> Util.getJavaSourceSets(projectMock)).thenReturn(sourceSetContainerMock);
            doReturn(sourceSetMock2).when(sourceSetContainerMock).getByName("javaRestTest");
            doReturn(sourceDirectorySetMock3).when(sourceSetMock2).getResources();
            doReturn(sourceDirectorySetMock4).when(sourceDirectorySetMock3).srcDir((File) any());
            doReturn("return_of_getProcessResourcesTaskName1").when(sourceSetMock2).getProcessResourcesTaskName();
            TestWithSslPlugin target = new TestWithSslPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(2)).getBuildDir();
                verify(projectMock, times(10)).getTasks();
                verify(taskContainerMock).register(eq("copyTestCertificates"), eq(ExportElasticsearchBuildResourcesTask.class), (Action) any());
                verify(projectMock, times(5)).getPlugins();
                verify(pluginContainerMock).withType(ForbiddenPatternsPrecommitPlugin.class);
                verify(pluginCollectionMock).configureEach((Action) any());
                verify(taskContainerMock2).named("forbiddenPatterns");
                verify(taskProviderMock2).configure((Action) any());
                verify(pluginContainerMock2).withType(FilePermissionsPrecommitPlugin.class);
                verify(pluginCollectionMock2).configureEach((Action) any());
                verify(taskContainerMock3).named("filepermissions");
                verify(taskProviderMock3).configure((Action) any());
                verify(pluginContainerMock3).withType(StandaloneRestTestPlugin.class);
                verify(pluginCollectionMock3).configureEach((Action) any());
                verify(taskContainerMock4).named("return_of_getProcessResourcesTaskName1");
                verify(taskProviderMock4).configure((Action) any());
                verify(taskContainerMock5).withType(TestClustersAware.class);
                verify(taskCollectionMock).configureEach((Action) any());
                verify(taskContainerMock6).withType(RestIntegTestTask.class);
                verify(taskCollectionMock2).configureEach((Action) any());
                verify(pluginContainerMock4).withType(LegacyJavaRestTestPlugin.class);
                verify(pluginCollectionMock4).configureEach((Action) any());
                verify(taskContainerMock7).named("return_of_getProcessResourcesTaskName1");
                verify(taskProviderMock5).configure((Action) any());
                verify(taskContainerMock8).withType(TestClustersAware.class);
                verify(taskCollectionMock3).configureEach((Action) any());
                verify(taskContainerMock9).withType(RestIntegTestTask.class);
                verify(taskCollectionMock4).configureEach((Action) any());
                verify(pluginContainerMock5).withType(TestClustersPlugin.class);
                verify(pluginCollectionMock5).configureEach((Action) any());
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByName("testClusters");
                verify(namedDomainObjectContainerMock).configureEach((Action) any());
                verify(taskContainerMock10).withType(ForbiddenPatternsTask.class);
                verify(taskCollectionMock5).configureEach((Action) any());
                buildParams.verify(() -> BuildParams.isInFipsJvm(), atLeast(1));
                util.verify(() -> Util.getJavaTestSourceSet(projectMock), atLeast(1));
                verify(sourceSetMock).getResources();
                verify(sourceDirectorySetMock).srcDir((File) any());
                verify(sourceSetMock).getProcessResourcesTaskName();
                util.verify(() -> Util.getJavaSourceSets(projectMock), atLeast(1));
                verify(sourceSetContainerMock).getByName("javaRestTest");
                verify(sourceSetMock2).getResources();
                verify(sourceDirectorySetMock3).srcDir((File) any());
                verify(sourceSetMock2).getProcessResourcesTaskName();
            });
        }
    }
}

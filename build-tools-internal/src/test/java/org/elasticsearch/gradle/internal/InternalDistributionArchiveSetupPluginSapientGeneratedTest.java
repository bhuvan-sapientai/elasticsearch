package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.NamedDomainObjectContainer;
import org.mockito.MockitoAnnotations;
import org.gradle.api.attributes.Attribute;
import org.gradle.api.plugins.ExtraPropertiesExtension;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.tasks.bundling.AbstractArchiveTask;
import org.gradle.api.plugins.BasePlugin;
import org.gradle.api.tasks.bundling.Zip;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.gradle.api.NamedDomainObjectFactory;
import org.gradle.api.Project;
import org.gradle.api.tasks.TaskCollection;
import org.mockito.MockedStatic;
import org.gradle.api.tasks.Sync;
import java.io.File;
import org.elasticsearch.gradle.internal.conventions.GUtils;
import org.gradle.api.Plugin;
import org.gradle.api.tasks.AbstractCopyTask;
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
class InternalDistributionArchiveSetupPluginSapientGeneratedTest {

    private final NamedDomainObjectContainer<DistributionArchive> containerMock = mock(NamedDomainObjectContainer.class, "container");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private InternalDistributionArchiveSetupPlugin target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${applyWhenSubdirContainsOss}, hash: 76A2C202624A3BEA5A638733E591DE01
    @Disabled()
    @Test()
    void applyWhenSubdirContainsOss() throws InvalidUserDataException {
        /* Branches:
         * (name.endsWith("Tar")) : true  #  inside lambda$registerAndConfigureDistributionArchivesExtension$1 method
         * (subdir.contains("oss")) : true  #  inside lambda$configureGeneralTaskDefaults$8 method
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
        TaskProvider<Sync> taskProviderMock = mock(TaskProvider.class);
        TaskProvider<AbstractArchiveTask> taskProviderMock2 = mock(TaskProvider.class);
        Project projectMock2 = mock(Project.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        ExtensionContainer extensionContainerMock2 = mock(ExtensionContainer.class);
        ExtraPropertiesExtension extraPropertiesExtensionMock = mock(ExtraPropertiesExtension.class);
        TaskContainer taskContainerMock2 = mock(TaskContainer.class);
        TaskProvider taskProviderMock3 = mock(TaskProvider.class);
        ExtensionContainer extensionContainerMock3 = mock(ExtensionContainer.class);
        TaskContainer taskContainerMock3 = mock(TaskContainer.class);
        TaskProvider taskProviderMock4 = mock(TaskProvider.class);
        ExtensionContainer extensionContainerMock4 = mock(ExtensionContainer.class);
        TaskContainer taskContainerMock4 = mock(TaskContainer.class);
        TaskProvider taskProviderMock5 = mock(TaskProvider.class);
        TaskContainer taskContainerMock5 = mock(TaskContainer.class);
        TaskCollection taskCollectionMock = mock(TaskCollection.class);
        TaskContainer taskContainerMock6 = mock(TaskContainer.class);
        TaskCollection taskCollectionMock2 = mock(TaskCollection.class);
        TaskContainer taskContainerMock7 = mock(TaskContainer.class);
        TaskCollection taskCollectionMock3 = mock(TaskCollection.class);
        TaskContainer taskContainerMock8 = mock(TaskContainer.class);
        TaskCollection taskCollectionMock4 = mock(TaskCollection.class);
        Action<Object> actionMock = mock(Action.class);
        try (MockedStatic<GUtils> gUtils = mockStatic(GUtils.class)) {
            doReturn(pluginContainerMock).when(projectMock).getPlugins();
            doReturn(pluginMock).when(pluginContainerMock).apply(BasePlugin.class);
            doReturn(taskProviderMock).when(taskContainerMock).register(eq("string6"), eq(Sync.class), (Action) any());
            doReturn(taskProviderMock2).when(taskContainerMock).register("string9", SymbolicLinkPreservingTar.class);
            doReturn(containerMock).when(projectMock).container(eq(DistributionArchive.class), (NamedDomainObjectFactory) any());
            doReturn(projectMock2).when(projectMock).project(eq("string12"), (Action) any());
            doNothing().when(extensionContainerMock).add("distribution_archives", containerMock);
            File file = new File("pathname1");
            doReturn(extraPropertiesExtensionMock).when(extensionContainerMock2).getExtraProperties();
            doNothing().when(extraPropertiesExtensionMock).set(eq("logsDir"), (File) any());
            File file2 = new File("pathname1");
            doReturn(taskProviderMock3).when(taskContainerMock2).register(eq("createLogsDir"), eq(EmptyDirTask.class), (Action) any());
            File file3 = new File("pathname1");
            doNothing().when(extensionContainerMock3).add(eq("pluginsDir"), (File) any());
            doReturn(taskProviderMock4).when(taskContainerMock3).register(eq("createPluginsDir"), eq(EmptyDirTask.class), (Action) any());
            File file4 = new File("pathname1");
            doReturn(file, file2, file3, file4).when(projectMock).getBuildDir();
            doReturn(extensionContainerMock, extensionContainerMock2, extensionContainerMock3, extensionContainerMock4).when(projectMock).getExtensions();
            doNothing().when(extensionContainerMock4).add(eq("jvmOptionsDir"), (File) any());
            doReturn(taskProviderMock5).when(taskContainerMock4).register(eq("createJvmOptionsDir"), eq(EmptyDirTask.class), (Action) any());
            doReturn(taskCollectionMock).when(taskContainerMock5).withType(AbstractCopyTask.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            doReturn(taskCollectionMock2).when(taskContainerMock6).withType(EmptyDirTask.class);
            doReturn(taskCollectionMock3).when(taskContainerMock7).withType(AbstractArchiveTask.class);
            doNothing().when(taskCollectionMock3).configureEach((Action) any());
            File file5 = new File("pathname1");
            doReturn(file5).when(projectMock).file("string17");
            doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3, taskContainerMock4, taskContainerMock5, taskContainerMock6, taskContainerMock7, taskContainerMock8).when(projectMock).getTasks();
            doReturn(taskCollectionMock4).when(taskContainerMock8).withType(SymbolicLinkPreservingTar.class);
            doNothing().when(taskCollectionMock4).configureEach((Action) any());
            doReturn(actionMock).when(containerMock).whenObjectAdded((Action) any());
            gUtils.when(() -> GUtils.capitalize("string4")).thenReturn("return_of_capitalize1");
            gUtils.when(() -> GUtils.capitalize("string1")).thenReturn("return_of_capitalize1");
            target = new InternalDistributionArchiveSetupPlugin();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).getPlugins();
                verify(pluginContainerMock).apply(BasePlugin.class);
                verify(projectMock, times(8)).getTasks();
                verify(taskContainerMock).register(eq("string6"), eq(Sync.class), (Action) any());
                verify(taskContainerMock).register("string9", SymbolicLinkPreservingTar.class);
                verify(projectMock).container(eq(DistributionArchive.class), (NamedDomainObjectFactory) any());
                verify(projectMock).project(eq("string12"), (Action) any());
                verify(projectMock, times(4)).getExtensions();
                verify(extensionContainerMock).add("distribution_archives", containerMock);
                verify(projectMock, times(4)).getBuildDir();
                verify(extensionContainerMock2).getExtraProperties();
                verify(extraPropertiesExtensionMock).set(eq("logsDir"), (File) any());
                verify(taskContainerMock2).register(eq("createLogsDir"), eq(EmptyDirTask.class), (Action) any());
                verify(extensionContainerMock3).add(eq("pluginsDir"), (File) any());
                verify(taskContainerMock3).register(eq("createPluginsDir"), eq(EmptyDirTask.class), (Action) any());
                verify(extensionContainerMock4).add(eq("jvmOptionsDir"), (File) any());
                verify(taskContainerMock4).register(eq("createJvmOptionsDir"), eq(EmptyDirTask.class), (Action) any());
                verify(taskContainerMock5).withType(AbstractCopyTask.class);
                verify(taskCollectionMock).configureEach((Action) any());
                verify(taskContainerMock6).withType(EmptyDirTask.class);
                verify(taskContainerMock7).withType(AbstractArchiveTask.class);
                verify(taskCollectionMock3).configureEach((Action) any());
                verify(projectMock).file("string17");
                verify(taskContainerMock8).withType(SymbolicLinkPreservingTar.class);
                verify(taskCollectionMock4).configureEach((Action) any());
                verify(containerMock).whenObjectAdded((Action) any());
                gUtils.verify(() -> GUtils.capitalize("string4"), atLeast(1));
                gUtils.verify(() -> GUtils.capitalize("string1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenNameNotEndsWithTarAndSubdirNotContainsOss}, hash: 79D72BB1F1E6485316D57CCFAFCF3379
    @Disabled()
    @Test()
    void applyWhenNameNotEndsWithTarAndSubdirNotContainsOss() throws InvalidUserDataException {
        /* Branches:
         * (name.endsWith("Tar")) : false  #  inside lambda$registerAndConfigureDistributionArchivesExtension$1 method
         * (subdir.contains("oss")) : false  #  inside lambda$configureGeneralTaskDefaults$8 method
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
        TaskProvider<Sync> taskProviderMock = mock(TaskProvider.class);
        TaskProvider<AbstractArchiveTask> taskProviderMock2 = mock(TaskProvider.class);
        Project projectMock2 = mock(Project.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        ExtensionContainer extensionContainerMock2 = mock(ExtensionContainer.class);
        ExtraPropertiesExtension extraPropertiesExtensionMock = mock(ExtraPropertiesExtension.class);
        TaskContainer taskContainerMock2 = mock(TaskContainer.class);
        TaskProvider taskProviderMock3 = mock(TaskProvider.class);
        ExtensionContainer extensionContainerMock3 = mock(ExtensionContainer.class);
        TaskContainer taskContainerMock3 = mock(TaskContainer.class);
        TaskProvider taskProviderMock4 = mock(TaskProvider.class);
        ExtensionContainer extensionContainerMock4 = mock(ExtensionContainer.class);
        TaskContainer taskContainerMock4 = mock(TaskContainer.class);
        TaskProvider taskProviderMock5 = mock(TaskProvider.class);
        TaskContainer taskContainerMock5 = mock(TaskContainer.class);
        TaskCollection taskCollectionMock = mock(TaskCollection.class);
        TaskContainer taskContainerMock6 = mock(TaskContainer.class);
        TaskCollection taskCollectionMock2 = mock(TaskCollection.class);
        TaskContainer taskContainerMock7 = mock(TaskContainer.class);
        TaskCollection taskCollectionMock3 = mock(TaskCollection.class);
        TaskContainer taskContainerMock8 = mock(TaskContainer.class);
        TaskCollection taskCollectionMock4 = mock(TaskCollection.class);
        Action<Object> actionMock = mock(Action.class);
        try (MockedStatic<GUtils> gUtils = mockStatic(GUtils.class)) {
            doReturn(pluginContainerMock).when(projectMock).getPlugins();
            doReturn(pluginMock).when(pluginContainerMock).apply(BasePlugin.class);
            doReturn(taskProviderMock).when(taskContainerMock).register(eq("string6"), eq(Sync.class), (Action) any());
            doReturn(taskProviderMock2).when(taskContainerMock).register("string9", Zip.class);
            doReturn(containerMock).when(projectMock).container(eq(DistributionArchive.class), (NamedDomainObjectFactory) any());
            doReturn(projectMock2).when(projectMock).project(eq("string12"), (Action) any());
            doNothing().when(extensionContainerMock).add("distribution_archives", containerMock);
            File file = new File("pathname1");
            doReturn(extraPropertiesExtensionMock).when(extensionContainerMock2).getExtraProperties();
            doNothing().when(extraPropertiesExtensionMock).set(eq("logsDir"), (File) any());
            File file2 = new File("pathname1");
            doReturn(taskProviderMock3).when(taskContainerMock2).register(eq("createLogsDir"), eq(EmptyDirTask.class), (Action) any());
            File file3 = new File("pathname1");
            doNothing().when(extensionContainerMock3).add(eq("pluginsDir"), (File) any());
            doReturn(taskProviderMock4).when(taskContainerMock3).register(eq("createPluginsDir"), eq(EmptyDirTask.class), (Action) any());
            File file4 = new File("pathname1");
            doReturn(file, file2, file3, file4).when(projectMock).getBuildDir();
            doReturn(extensionContainerMock, extensionContainerMock2, extensionContainerMock3, extensionContainerMock4).when(projectMock).getExtensions();
            doNothing().when(extensionContainerMock4).add(eq("jvmOptionsDir"), (File) any());
            doReturn(taskProviderMock5).when(taskContainerMock4).register(eq("createJvmOptionsDir"), eq(EmptyDirTask.class), (Action) any());
            doReturn(taskCollectionMock).when(taskContainerMock5).withType(AbstractCopyTask.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            doReturn(taskCollectionMock2).when(taskContainerMock6).withType(EmptyDirTask.class);
            doReturn(taskCollectionMock3).when(taskContainerMock7).withType(AbstractArchiveTask.class);
            doNothing().when(taskCollectionMock3).configureEach((Action) any());
            File file5 = new File("pathname1");
            doReturn(file5).when(projectMock).file("string17");
            doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3, taskContainerMock4, taskContainerMock5, taskContainerMock6, taskContainerMock7, taskContainerMock8).when(projectMock).getTasks();
            doReturn(taskCollectionMock4).when(taskContainerMock8).withType(SymbolicLinkPreservingTar.class);
            doNothing().when(taskCollectionMock4).configureEach((Action) any());
            doReturn(actionMock).when(containerMock).whenObjectAdded((Action) any());
            gUtils.when(() -> GUtils.capitalize("string4")).thenReturn("return_of_capitalize1");
            gUtils.when(() -> GUtils.capitalize("string1")).thenReturn("return_of_capitalize1");
            target = new InternalDistributionArchiveSetupPlugin();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).getPlugins();
                verify(pluginContainerMock).apply(BasePlugin.class);
                verify(projectMock, times(8)).getTasks();
                verify(taskContainerMock).register(eq("string6"), eq(Sync.class), (Action) any());
                verify(taskContainerMock).register("string9", Zip.class);
                verify(projectMock).container(eq(DistributionArchive.class), (NamedDomainObjectFactory) any());
                verify(projectMock).project(eq("string12"), (Action) any());
                verify(projectMock, times(4)).getExtensions();
                verify(extensionContainerMock).add("distribution_archives", containerMock);
                verify(projectMock, times(4)).getBuildDir();
                verify(extensionContainerMock2).getExtraProperties();
                verify(extraPropertiesExtensionMock).set(eq("logsDir"), (File) any());
                verify(taskContainerMock2).register(eq("createLogsDir"), eq(EmptyDirTask.class), (Action) any());
                verify(extensionContainerMock3).add(eq("pluginsDir"), (File) any());
                verify(taskContainerMock3).register(eq("createPluginsDir"), eq(EmptyDirTask.class), (Action) any());
                verify(extensionContainerMock4).add(eq("jvmOptionsDir"), (File) any());
                verify(taskContainerMock4).register(eq("createJvmOptionsDir"), eq(EmptyDirTask.class), (Action) any());
                verify(taskContainerMock5).withType(AbstractCopyTask.class);
                verify(taskCollectionMock).configureEach((Action) any());
                verify(taskContainerMock6).withType(EmptyDirTask.class);
                verify(taskContainerMock7).withType(AbstractArchiveTask.class);
                verify(taskCollectionMock3).configureEach((Action) any());
                verify(projectMock).file("string17");
                verify(taskContainerMock8).withType(SymbolicLinkPreservingTar.class);
                verify(taskCollectionMock4).configureEach((Action) any());
                verify(containerMock).whenObjectAdded((Action) any());
                gUtils.verify(() -> GUtils.capitalize("string4"), atLeast(1));
                gUtils.verify(() -> GUtils.capitalize("string1"), atLeast(1));
            });
        }
    }
}

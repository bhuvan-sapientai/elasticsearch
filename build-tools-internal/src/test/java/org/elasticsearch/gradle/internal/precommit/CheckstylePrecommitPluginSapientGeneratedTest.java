package org.elasticsearch.gradle.internal.precommit;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.UnknownTaskException;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.provider.Provider;
import java.util.concurrent.Callable;
import org.gradle.api.plugins.JavaBasePlugin;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.Task;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.artifacts.VersionCatalog;
import java.util.Optional;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.plugins.quality.CheckstyleExtension;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.gradle.api.plugins.quality.Checkstyle;
import org.gradle.api.Project;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.tasks.TaskCollection;
import org.gradle.api.DomainObjectCollection;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.gradle.api.artifacts.VersionCatalogsExtension;
import java.io.File;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.api.plugins.PluginManager;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class CheckstylePrecommitPluginSapientGeneratedTest {

    private final CheckstyleExtension checkstyleExtensionMock = mock(CheckstyleExtension.class);

    private final ConfigurableFileCollection configurableFileCollectionMock = mock(ConfigurableFileCollection.class);

    private final DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);

    private final DirectoryProperty directoryPropertyMock = mock(DirectoryProperty.class);

    private final DomainObjectCollection domainObjectCollectionMock = mock(DomainObjectCollection.class);

    private final ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);

    private final ExtensionContainer extensionContainerMock2 = mock(ExtensionContainer.class);

    private final ExtensionContainer extensionContainerMock3 = mock(ExtensionContainer.class);

    private final MinimalExternalModuleDependency minimalExternalModuleDependencyMock = mock(MinimalExternalModuleDependency.class);

    private final ObjectFactory objectFactoryMock = mock(ObjectFactory.class);

    private final Object objectMock = mock(Object.class, "object2");

    private final PluginContainer pluginContainerMock = mock(PluginContainer.class);

    private final PluginManager pluginManagerMock = mock(PluginManager.class);

    private final Project projectMock = mock(Project.class);

    private final Provider providerMock = mock(Provider.class);

    private final Provider<String> providerMock2 = mock(Provider.class);

    private final Provider providerMock3 = mock(Provider.class);

    private final SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);

    private final TaskCollection taskCollectionMock = mock(TaskCollection.class);

    private final TaskCollection taskCollectionMock2 = mock(TaskCollection.class);

    private final TaskCollection taskCollectionMock3 = mock(TaskCollection.class);

    private final TaskContainer taskContainerMock = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock2 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock3 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock4 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock5 = mock(TaskContainer.class);

    private final TaskProvider<Task> taskProviderMock = mock(TaskProvider.class);

    private final TaskProvider<Task> taskProviderMock2 = mock(TaskProvider.class);

    private final TaskProvider taskProviderMock3 = mock(TaskProvider.class);

    private final VersionCatalog versionCatalogMock = mock(VersionCatalog.class);

    private final VersionCatalogsExtension versionCatalogsExtensionMock = mock(VersionCatalogsExtension.class);

    //Sapient generated method id: ${createTaskWhenFileEqualsCheckstyleConfUrlGetProtocol}, hash: 91D59AEACA92B5AA414F314C7991ED43
    @Disabled()
    @Test()
    void createTaskWhenFileEqualsCheckstyleConfUrlGetProtocol() throws UnknownDomainObjectException, UnknownTaskException, InvalidUserDataException {
        /* Branches:
         * ("jar".equals(checkstyleConfUrl.getProtocol())) : false
         * ("file".equals(checkstyleConfUrl.getProtocol())) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.File
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        File file = new File("pathname1");
        doReturn(file).when(projectMock).getBuildDir();
        doReturn(taskProviderMock).when(taskContainerMock).register("copyCheckstyleConf");
        doNothing().when(taskProviderMock).configure((Action) any());
        doReturn(taskProviderMock2).when(taskContainerMock2).register("checkstyle");
        doNothing().when(taskProviderMock2).configure((Action) any());
        doReturn(taskCollectionMock).when(taskContainerMock3).withType(Checkstyle.class);
        doReturn(pluginManagerMock).when(projectMock).getPluginManager();
        doNothing().when(pluginManagerMock).apply("checkstyle");
        doReturn(checkstyleExtensionMock).when(extensionContainerMock).getByType(CheckstyleExtension.class);
        doReturn(directoryPropertyMock).when(checkstyleExtensionMock).getConfigDirectory();
        doNothing().when(directoryPropertyMock).set((File) any());
        doReturn(dependencyHandlerMock).when(projectMock).getDependencies();
        doNothing().when(dependencyHandlerMock).addProvider("checkstyle", providerMock);
        doNothing().when(dependencyHandlerMock).addProvider(eq("checkstyle"), eq(providerMock2), (Action) any());
        doReturn(objectMock).when(projectMock).getVersion();
        doReturn(versionCatalogsExtensionMock).when(extensionContainerMock2).getByType(VersionCatalogsExtension.class);
        doReturn(versionCatalogMock).when(versionCatalogsExtensionMock).named("buildLibs");
        doReturn(Optional.of(providerMock3)).when(versionCatalogMock).findLibrary("checkstyle");
        doReturn(minimalExternalModuleDependencyMock).when(providerMock3).get();
        doReturn(providerMock2, providerMock).when(projectMock).provider((Callable) any());
        doReturn(taskCollectionMock2).when(taskContainerMock4).withType(Checkstyle.class);
        doNothing().when(taskCollectionMock2).configureEach((Action) any());
        doReturn(pluginContainerMock).when(projectMock).getPlugins();
        doReturn(domainObjectCollectionMock).when(pluginContainerMock).withType(eq(JavaBasePlugin.class), (Action) any());
        doReturn(extensionContainerMock, extensionContainerMock2, extensionContainerMock3).when(projectMock).getExtensions();
        doReturn(sourceSetContainerMock).when(extensionContainerMock3).getByType(SourceSetContainer.class);
        doNothing().when(sourceSetContainerMock).all((Action) any());
        doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3, taskContainerMock4, taskContainerMock5).when(projectMock).getTasks();
        doReturn(taskCollectionMock3).when(taskContainerMock5).withType(Checkstyle.class);
        doReturn(taskProviderMock3).when(taskCollectionMock3).named("return_of_getTaskName1");
        doNothing().when(taskProviderMock3).configure((Action) any());
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(configurableFileCollectionMock).when(objectFactoryMock).fileCollection();
        CheckstylePrecommitPlugin target = new CheckstylePrecommitPlugin();
        //Act Statement(s)
        TaskProvider<? extends Task> result = target.createTask(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(taskProviderMock2));
            verify(projectMock).getBuildDir();
            verify(projectMock, times(5)).getTasks();
            verify(taskContainerMock).register("copyCheckstyleConf");
            verify(taskProviderMock, atLeast(3)).configure((Action) any());
            verify(taskContainerMock2).register("checkstyle");
            verify(taskProviderMock2).configure((Action) any());
            verify(taskContainerMock3).withType(Checkstyle.class);
            verify(projectMock).getPluginManager();
            verify(pluginManagerMock).apply("checkstyle");
            verify(projectMock, times(3)).getExtensions();
            verify(extensionContainerMock).getByType(CheckstyleExtension.class);
            verify(checkstyleExtensionMock).getConfigDirectory();
            verify(directoryPropertyMock).set((File) any());
            verify(projectMock).getDependencies();
            verify(dependencyHandlerMock).addProvider("checkstyle", providerMock);
            verify(dependencyHandlerMock).addProvider(eq("checkstyle"), eq(providerMock2), (Action) any());
            verify(projectMock).getVersion();
            verify(projectMock, atLeast(2)).provider((Callable) any());
            verify(extensionContainerMock2).getByType(VersionCatalogsExtension.class);
            verify(versionCatalogsExtensionMock).named("buildLibs");
            verify(versionCatalogMock).findLibrary("checkstyle");
            verify(providerMock3).get();
            verify(taskContainerMock4).withType(Checkstyle.class);
            verify(taskCollectionMock2).configureEach((Action) any());
            verify(projectMock).getPlugins();
            verify(pluginContainerMock).withType(eq(JavaBasePlugin.class), (Action) any());
            verify(extensionContainerMock3).getByType(SourceSetContainer.class);
            verify(sourceSetContainerMock).all((Action) any());
            verify(taskContainerMock5).withType(Checkstyle.class);
            verify(taskCollectionMock3).named("return_of_getTaskName1");
            verify(taskProviderMock3).configure((Action) any());
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
        });
    }

    //Sapient generated method id: ${createTaskWhenCaughtIOExceptionAndFileEqualsCheckstyleConfUrlGetProtocol}, hash: 3D649D3221793DA995206593F09E7569
    @Disabled()
    @Test()
    void createTaskWhenCaughtIOExceptionAndFileEqualsCheckstyleConfUrlGetProtocol() throws UnknownDomainObjectException, UnknownTaskException, InvalidUserDataException {
        /* Branches:
         * ("jar".equals(checkstyleConfUrl.getProtocol())) : false
         * (catch-exception (IOException)) : true
         * ("file".equals(checkstyleConfUrl.getProtocol())) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.File
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        File file = new File("pathname1");
        doReturn(file).when(projectMock).getBuildDir();
        doReturn(taskProviderMock).when(taskContainerMock).register("copyCheckstyleConf");
        doNothing().when(taskProviderMock).configure((Action) any());
        doReturn(taskProviderMock2).when(taskContainerMock2).register("checkstyle");
        doNothing().when(taskProviderMock2).configure((Action) any());
        doReturn(taskCollectionMock).when(taskContainerMock3).withType(Checkstyle.class);
        doReturn(pluginManagerMock).when(projectMock).getPluginManager();
        doNothing().when(pluginManagerMock).apply("checkstyle");
        doReturn(checkstyleExtensionMock).when(extensionContainerMock).getByType(CheckstyleExtension.class);
        doReturn(directoryPropertyMock).when(checkstyleExtensionMock).getConfigDirectory();
        doNothing().when(directoryPropertyMock).set((File) any());
        doReturn(dependencyHandlerMock).when(projectMock).getDependencies();
        doNothing().when(dependencyHandlerMock).addProvider("checkstyle", providerMock);
        doNothing().when(dependencyHandlerMock).addProvider(eq("checkstyle"), eq(providerMock2), (Action) any());
        doReturn(objectMock).when(projectMock).getVersion();
        doReturn(versionCatalogsExtensionMock).when(extensionContainerMock2).getByType(VersionCatalogsExtension.class);
        doReturn(versionCatalogMock).when(versionCatalogsExtensionMock).named("buildLibs");
        doReturn(Optional.of(providerMock3)).when(versionCatalogMock).findLibrary("checkstyle");
        doReturn(minimalExternalModuleDependencyMock).when(providerMock3).get();
        doReturn(providerMock2, providerMock).when(projectMock).provider((Callable) any());
        doReturn(taskCollectionMock2).when(taskContainerMock4).withType(Checkstyle.class);
        doNothing().when(taskCollectionMock2).configureEach((Action) any());
        doReturn(pluginContainerMock).when(projectMock).getPlugins();
        doReturn(domainObjectCollectionMock).when(pluginContainerMock).withType(eq(JavaBasePlugin.class), (Action) any());
        doReturn(extensionContainerMock, extensionContainerMock2, extensionContainerMock3).when(projectMock).getExtensions();
        doReturn(sourceSetContainerMock).when(extensionContainerMock3).getByType(SourceSetContainer.class);
        doNothing().when(sourceSetContainerMock).all((Action) any());
        doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3, taskContainerMock4, taskContainerMock5).when(projectMock).getTasks();
        doReturn(taskCollectionMock3).when(taskContainerMock5).withType(Checkstyle.class);
        doReturn(taskProviderMock3).when(taskCollectionMock3).named("return_of_getTaskName1");
        doNothing().when(taskProviderMock3).configure((Action) any());
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(configurableFileCollectionMock).when(objectFactoryMock).fileCollection();
        CheckstylePrecommitPlugin target = new CheckstylePrecommitPlugin();
        //Act Statement(s)
        TaskProvider<? extends Task> result = target.createTask(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(taskProviderMock2));
            verify(projectMock).getBuildDir();
            verify(projectMock, times(5)).getTasks();
            verify(taskContainerMock).register("copyCheckstyleConf");
            verify(taskProviderMock, atLeast(3)).configure((Action) any());
            verify(taskContainerMock2).register("checkstyle");
            verify(taskProviderMock2).configure((Action) any());
            verify(taskContainerMock3).withType(Checkstyle.class);
            verify(projectMock).getPluginManager();
            verify(pluginManagerMock).apply("checkstyle");
            verify(projectMock, times(3)).getExtensions();
            verify(extensionContainerMock).getByType(CheckstyleExtension.class);
            verify(checkstyleExtensionMock).getConfigDirectory();
            verify(directoryPropertyMock).set((File) any());
            verify(projectMock).getDependencies();
            verify(dependencyHandlerMock).addProvider("checkstyle", providerMock);
            verify(dependencyHandlerMock).addProvider(eq("checkstyle"), eq(providerMock2), (Action) any());
            verify(projectMock).getVersion();
            verify(projectMock, atLeast(2)).provider((Callable) any());
            verify(extensionContainerMock2).getByType(VersionCatalogsExtension.class);
            verify(versionCatalogsExtensionMock).named("buildLibs");
            verify(versionCatalogMock).findLibrary("checkstyle");
            verify(providerMock3).get();
            verify(taskContainerMock4).withType(Checkstyle.class);
            verify(taskCollectionMock2).configureEach((Action) any());
            verify(projectMock).getPlugins();
            verify(pluginContainerMock).withType(eq(JavaBasePlugin.class), (Action) any());
            verify(extensionContainerMock3).getByType(SourceSetContainer.class);
            verify(sourceSetContainerMock).all((Action) any());
            verify(taskContainerMock5).withType(Checkstyle.class);
            verify(taskCollectionMock3).named("return_of_getTaskName1");
            verify(taskProviderMock3).configure((Action) any());
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
        });
    }
}

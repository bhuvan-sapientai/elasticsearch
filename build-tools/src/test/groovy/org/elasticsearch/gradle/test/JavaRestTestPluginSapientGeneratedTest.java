package org.elasticsearch.gradle.test;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.UnknownConfigurationException;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.UnknownTaskException;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.Transformer;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.artifacts.Dependency;
import org.gradle.api.provider.Provider;
import org.elasticsearch.gradle.testclusters.ElasticsearchCluster;
import org.gradle.api.plugins.JavaBasePlugin;
import org.elasticsearch.gradle.testclusters.TestClustersPlugin;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.tasks.SourceSetOutput;
import org.gradle.api.plugins.ExtensionContainer;
import org.elasticsearch.gradle.VersionProperties;
import org.gradle.api.tasks.bundling.Zip;
import org.gradle.api.Action;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.file.FileCollection;
import org.gradle.api.file.RegularFile;
import org.gradle.api.Project;
import org.gradle.api.DomainObjectCollection;
import org.gradle.api.tasks.TaskCollection;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.mockito.MockedStatic;
import org.gradle.api.NamedDomainObjectProvider;
import org.elasticsearch.gradle.plugin.PluginBuildPlugin;
import org.elasticsearch.gradle.testclusters.StandaloneRestIntegTestTask;
import org.gradle.api.plugins.PluginManager;
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
class JavaRestTestPluginSapientGeneratedTest {

    //Sapient generated method id: ${applyTest}, hash: FAA8CEFB6916FD0FE680CAA93C8B0E65
    @Disabled()
    @Test()
    void applyTest() throws UnknownConfigurationException, UnknownDomainObjectException, InvalidUserDataException, UnknownTaskException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: nonInputProperties - Method: systemProperty
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        PluginManager pluginManagerMock2 = mock(PluginManager.class);
        PluginManager pluginManagerMock3 = mock(PluginManager.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        SourceSet sourceSetMock = mock(SourceSet.class);
        SourceSetOutput sourceSetOutputMock = mock(SourceSetOutput.class);
        FileCollection fileCollectionMock = mock(FileCollection.class);
        FileCollection fileCollectionMock2 = mock(FileCollection.class);
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        Configuration configurationMock = mock(Configuration.class);
        Configuration configurationMock2 = mock(Configuration.class);
        DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        Dependency dependencyMock = mock(Dependency.class);
        ExtensionContainer extensionContainerMock2 = mock(ExtensionContainer.class);
        NamedDomainObjectContainer namedDomainObjectContainerMock = mock(NamedDomainObjectContainer.class);
        NamedDomainObjectProvider<ElasticsearchCluster> namedDomainObjectProviderMock = mock(NamedDomainObjectProvider.class);
        ElasticsearchCluster elasticsearchClusterMock = mock(ElasticsearchCluster.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider<StandaloneRestIntegTestTask> taskProviderMock = mock(TaskProvider.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        DomainObjectCollection domainObjectCollectionMock = mock(DomainObjectCollection.class);
        TaskContainer taskContainerMock2 = mock(TaskContainer.class);
        TaskCollection taskCollectionMock = mock(TaskCollection.class);
        TaskProvider<Zip> taskProviderMock2 = mock(TaskProvider.class);
        Provider<RegularFile> providerMock = mock(Provider.class);
        TaskContainer taskContainerMock3 = mock(TaskContainer.class);
        TaskProvider taskProviderMock3 = mock(TaskProvider.class);
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doNothing().when(pluginManagerMock).apply(GradleTestPolicySetupPlugin.class);
            doNothing().when(pluginManagerMock2).apply(TestClustersPlugin.class);
            doReturn(pluginManagerMock, pluginManagerMock2, pluginManagerMock3).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock3).apply(JavaBasePlugin.class);
            doReturn(sourceSetContainerMock).when(extensionContainerMock).getByType(SourceSetContainer.class);
            doReturn(sourceSetMock).when(sourceSetContainerMock).maybeCreate("javaRestTest");
            doReturn("return_of_getImplementationConfigurationName1").when(sourceSetMock).getImplementationConfigurationName();
            doReturn(sourceSetOutputMock).when(sourceSetMock).getOutput();
            doReturn(fileCollectionMock).when(sourceSetOutputMock).getClassesDirs();
            doReturn(fileCollectionMock2).when(sourceSetMock).getRuntimeClasspath();
            doReturn(configurationContainerMock).when(projectMock).getConfigurations();
            doReturn(configurationMock).when(configurationContainerMock).getByName("return_of_getImplementationConfigurationName1");
            doReturn(configurationMock2).when(configurationMock).defaultDependencies((Action) any());
            doReturn(dependencyHandlerMock).when(projectMock).getDependencies();
            doReturn(dependencyMock).when(dependencyHandlerMock).create("org.elasticsearch.test:framework:A");
            doReturn(extensionContainerMock, extensionContainerMock2).when(projectMock).getExtensions();
            doReturn(namedDomainObjectContainerMock).when(extensionContainerMock2).getByName("testClusters");
            doReturn(namedDomainObjectProviderMock).when(namedDomainObjectContainerMock).register("javaRestTest");
            doReturn(elasticsearchClusterMock).when(namedDomainObjectProviderMock).get();
            doNothing().when(namedDomainObjectProviderMock).configure((Action) any());
            doReturn(taskProviderMock).when(taskContainerMock).register(eq("javaRestTest"), eq(StandaloneRestIntegTestTask.class), (Action) any());
            doNothing().when(taskProviderMock).configure((Action) any());
            doReturn(pluginContainerMock).when(projectMock).getPlugins();
            doReturn(domainObjectCollectionMock).when(pluginContainerMock).withType(eq(PluginBuildPlugin.class), (Action) any());
            doReturn(taskCollectionMock).when(taskContainerMock2).withType(Zip.class);
            doReturn(taskProviderMock2).when(taskCollectionMock).named("bundlePlugin");
            doReturn(providerMock).when(taskProviderMock2).flatMap((Transformer) any());
            doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3).when(projectMock).getTasks();
            doReturn(taskProviderMock3).when(taskContainerMock3).named("check");
            doNothing().when(taskProviderMock3).configure((Action) any());
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("A");
            JavaRestTestPlugin target = new JavaRestTestPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(3)).getPluginManager();
                verify(pluginManagerMock).apply(GradleTestPolicySetupPlugin.class);
                verify(pluginManagerMock2).apply(TestClustersPlugin.class);
                verify(pluginManagerMock3).apply(JavaBasePlugin.class);
                verify(projectMock, times(2)).getExtensions();
                verify(extensionContainerMock).getByType(SourceSetContainer.class);
                verify(sourceSetContainerMock).maybeCreate("javaRestTest");
                verify(sourceSetMock).getImplementationConfigurationName();
                verify(sourceSetMock).getOutput();
                verify(sourceSetOutputMock).getClassesDirs();
                verify(sourceSetMock).getRuntimeClasspath();
                verify(projectMock).getConfigurations();
                verify(configurationContainerMock).getByName("return_of_getImplementationConfigurationName1");
                verify(configurationMock).defaultDependencies((Action) any());
                verify(projectMock).getDependencies();
                verify(dependencyHandlerMock).create("org.elasticsearch.test:framework:A");
                verify(extensionContainerMock2).getByName("testClusters");
                verify(namedDomainObjectContainerMock).register("javaRestTest");
                verify(namedDomainObjectProviderMock).get();
                verify(namedDomainObjectProviderMock).configure((Action) any());
                verify(projectMock, times(3)).getTasks();
                verify(taskContainerMock).register(eq("javaRestTest"), eq(StandaloneRestIntegTestTask.class), (Action) any());
                verify(taskProviderMock).configure((Action) any());
                verify(projectMock).getPlugins();
                verify(pluginContainerMock).withType(eq(PluginBuildPlugin.class), (Action) any());
                verify(taskContainerMock2).withType(Zip.class);
                verify(taskCollectionMock).named("bundlePlugin");
                verify(taskProviderMock2).flatMap((Transformer) any());
                verify(taskContainerMock3).named("check");
                verify(taskProviderMock3).configure((Action) any());
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }
}

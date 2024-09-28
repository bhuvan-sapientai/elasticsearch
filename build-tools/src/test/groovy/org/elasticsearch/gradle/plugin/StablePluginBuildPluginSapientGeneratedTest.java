package org.elasticsearch.gradle.plugin;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.UnknownConfigurationException;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.UnknownTaskException;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.artifacts.Dependency;
import org.gradle.api.file.CopySpec;
import org.gradle.api.provider.Provider;
import org.elasticsearch.gradle.util.GradleUtils;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.tasks.SourceSetOutput;
import org.gradle.api.plugins.ExtensionContainer;
import org.elasticsearch.gradle.VersionProperties;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.gradle.api.file.FileCollection;
import org.gradle.api.file.RegularFile;
import org.gradle.api.Project;
import org.gradle.api.tasks.TaskCollection;
import org.gradle.api.file.ProjectLayout;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.mockito.MockedStatic;
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
class StablePluginBuildPluginSapientGeneratedTest {

    //Sapient generated method id: ${applyTest}, hash: 6E67A75790CFD2CC16E9A7635F97D137
    @Disabled()
    @Test()
    void applyTest() throws UnknownConfigurationException, InvalidUserDataException, UnknownDomainObjectException, UnknownTaskException {
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskCollection taskCollectionMock = mock(TaskCollection.class);
        TaskProvider taskProviderMock = mock(TaskProvider.class);
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        DirectoryProperty directoryPropertyMock = mock(DirectoryProperty.class);
        Provider<RegularFile> providerMock = mock(Provider.class);
        TaskContainer taskContainerMock2 = mock(TaskContainer.class);
        TaskProvider<GenerateNamedComponentsTask> taskProviderMock2 = mock(TaskProvider.class);
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        Configuration configurationMock = mock(Configuration.class);
        FileCollection fileCollectionMock = mock(FileCollection.class);
        FileCollection fileCollectionMock2 = mock(FileCollection.class);
        ConfigurationContainer configurationContainerMock2 = mock(ConfigurationContainer.class);
        Configuration configurationMock2 = mock(Configuration.class);
        Configuration configurationMock3 = mock(Configuration.class);
        DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        Dependency dependencyMock = mock(Dependency.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        Project projectMock2 = mock(Project.class);
        CopySpec copySpecMock = mock(CopySpec.class);
        CopySpec copySpecMock2 = mock(CopySpec.class);
        SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        SourceSet sourceSetMock = mock(SourceSet.class);
        SourceSetOutput sourceSetOutputMock = mock(SourceSetOutput.class);
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            doReturn(pluginManagerMock).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock).apply(BasePluginBuildPlugin.class);
            doReturn(taskCollectionMock).when(taskContainerMock).withType(GeneratePluginPropertiesTask.class);
            doReturn(taskProviderMock).when(taskCollectionMock).named("pluginProperties");
            doNothing().when(taskProviderMock).configure((Action) any());
            doReturn(projectLayoutMock).when(projectMock).getLayout();
            doReturn(directoryPropertyMock).when(projectLayoutMock).getBuildDirectory();
            doReturn(providerMock).when(directoryPropertyMock).file("generated-descriptor/stable-plugin-descriptor.properties");
            doReturn(taskContainerMock, taskContainerMock2).when(projectMock).getTasks();
            doReturn(taskProviderMock2).when(taskContainerMock2).register(eq("pluginNamedComponents"), eq(GenerateNamedComponentsTask.class), (Action) any());
            doNothing().when(taskProviderMock2).configure((Action) any());
            doReturn(configurationMock).when(configurationContainerMock).getByName("compileClasspath");
            doReturn(fileCollectionMock).when(configurationMock).plus(fileCollectionMock2);
            doReturn(configurationContainerMock, configurationContainerMock2).when(projectMock).getConfigurations();
            doReturn(configurationMock2).when(configurationContainerMock2).create("pluginScannerConfig");
            doReturn(configurationMock3).when(configurationMock2).defaultDependencies((Action) any());
            doReturn(dependencyHandlerMock).when(projectMock).getDependencies();
            doReturn(dependencyMock).when(dependencyHandlerMock).create("org.elasticsearch:elasticsearch-plugin-scanner:A");
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            PluginPropertiesExtension pluginPropertiesExtension = new PluginPropertiesExtension(projectMock2);
            pluginPropertiesExtension.setBundleSpec(copySpecMock);
            doReturn(pluginPropertiesExtension).when(extensionContainerMock).getByType(PluginPropertiesExtension.class);
            Object[] objectArray = new Object[] { taskProviderMock2 };
            doReturn(copySpecMock2).when(copySpecMock).from(objectArray);
            gradleUtils.when(() -> GradleUtils.getJavaSourceSets(projectMock)).thenReturn(sourceSetContainerMock);
            doReturn(sourceSetMock).when(sourceSetContainerMock).findByName("main");
            doReturn(sourceSetOutputMock).when(sourceSetMock).getOutput();
            doReturn(fileCollectionMock2).when(sourceSetOutputMock).getClassesDirs();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("A");
            StablePluginBuildPlugin target = new StablePluginBuildPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).getPluginManager();
                verify(pluginManagerMock).apply(BasePluginBuildPlugin.class);
                verify(projectMock, times(2)).getTasks();
                verify(taskContainerMock).withType(GeneratePluginPropertiesTask.class);
                verify(taskCollectionMock).named("pluginProperties");
                verify(taskProviderMock).configure((Action) any());
                verify(projectMock).getLayout();
                verify(projectLayoutMock).getBuildDirectory();
                verify(directoryPropertyMock).file("generated-descriptor/stable-plugin-descriptor.properties");
                verify(taskContainerMock2).register(eq("pluginNamedComponents"), eq(GenerateNamedComponentsTask.class), (Action) any());
                verify(taskProviderMock2).configure((Action) any());
                verify(projectMock, times(2)).getConfigurations();
                verify(configurationContainerMock).getByName("compileClasspath");
                verify(configurationMock).plus(fileCollectionMock2);
                verify(configurationContainerMock2).create("pluginScannerConfig");
                verify(configurationMock2).defaultDependencies((Action) any());
                verify(projectMock).getDependencies();
                verify(dependencyHandlerMock).create("org.elasticsearch:elasticsearch-plugin-scanner:A");
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByType(PluginPropertiesExtension.class);
                verify(copySpecMock).from(objectArray);
                gradleUtils.verify(() -> GradleUtils.getJavaSourceSets(projectMock), atLeast(1));
                verify(sourceSetContainerMock).findByName("main");
                verify(sourceSetMock).getOutput();
                verify(sourceSetOutputMock).getClassesDirs();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }
}

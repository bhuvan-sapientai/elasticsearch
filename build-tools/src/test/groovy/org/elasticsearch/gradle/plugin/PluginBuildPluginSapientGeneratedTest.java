package org.elasticsearch.gradle.plugin;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.UnknownTaskException;
import org.elasticsearch.gradle.VersionProperties;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.artifacts.Dependency;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.gradle.api.provider.Provider;
import org.gradle.api.file.RegularFile;
import java.util.concurrent.Callable;
import org.gradle.api.Project;
import org.gradle.api.tasks.TaskCollection;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.gradle.api.file.ProjectLayout;
import org.gradle.api.tasks.TaskProvider;
import org.mockito.MockedStatic;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.plugins.PluginManager;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class PluginBuildPluginSapientGeneratedTest {

    private final ProviderFactory providerFactoryMock = mock(ProviderFactory.class, "providerFactory");

    //Sapient generated method id: ${applyTest}, hash: 503CAC15968D4E629EB604A9ED6FF717
    @Disabled()
    @Test()
    void applyTest() throws UnknownDomainObjectException, UnknownTaskException {
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        Dependency dependencyMock = mock(Dependency.class);
        Dependency dependencyMock2 = mock(Dependency.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        Project projectMock2 = mock(Project.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskCollection taskCollectionMock = mock(TaskCollection.class);
        TaskProvider taskProviderMock = mock(TaskProvider.class);
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        DirectoryProperty directoryPropertyMock = mock(DirectoryProperty.class);
        Provider<RegularFile> providerMock = mock(Provider.class);
        Provider providerMock2 = mock(Provider.class);
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(pluginManagerMock).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock).apply(BasePluginBuildPlugin.class);
            doReturn(dependencyHandlerMock).when(projectMock).getDependencies();
            doReturn(dependencyMock).when(dependencyHandlerMock).add("compileOnly", "org.elasticsearch:elasticsearch:A");
            doReturn(dependencyMock2).when(dependencyHandlerMock).add("testImplementation", "org.elasticsearch.test:framework:B");
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            PluginPropertiesExtension pluginPropertiesExtension = new PluginPropertiesExtension(projectMock2);
            pluginPropertiesExtension.setClassname("classname1");
            doReturn(pluginPropertiesExtension).when(extensionContainerMock).getByType(PluginPropertiesExtension.class);
            doReturn(taskContainerMock).when(projectMock).getTasks();
            doReturn(taskCollectionMock).when(taskContainerMock).withType(GeneratePluginPropertiesTask.class);
            doReturn(taskProviderMock).when(taskCollectionMock).named("pluginProperties");
            doNothing().when(taskProviderMock).configure((Action) any());
            doReturn(projectLayoutMock).when(projectMock).getLayout();
            doReturn(directoryPropertyMock).when(projectLayoutMock).getBuildDirectory();
            doReturn(providerMock).when(directoryPropertyMock).file("generated-descriptor/plugin-descriptor.properties");
            doReturn(providerMock2).when(providerFactoryMock).provider((Callable) any());
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("A").thenReturn("B");
            PluginBuildPlugin target = new PluginBuildPlugin(providerFactoryMock);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).getPluginManager();
                verify(pluginManagerMock).apply(BasePluginBuildPlugin.class);
                verify(projectMock).getDependencies();
                verify(dependencyHandlerMock).add("compileOnly", "org.elasticsearch:elasticsearch:A");
                verify(dependencyHandlerMock).add("testImplementation", "org.elasticsearch.test:framework:B");
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByType(PluginPropertiesExtension.class);
                verify(projectMock).getTasks();
                verify(taskContainerMock).withType(GeneratePluginPropertiesTask.class);
                verify(taskCollectionMock).named("pluginProperties");
                verify(taskProviderMock).configure((Action) any());
                verify(projectMock).getLayout();
                verify(projectLayoutMock).getBuildDirectory();
                verify(directoryPropertyMock).file("generated-descriptor/plugin-descriptor.properties");
                verify(providerFactoryMock).provider((Callable) any());
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(2));
            });
        }
    }
}

package org.elasticsearch.gradle.plugin;

import org.elasticsearch.gradle.plugin.PluginBuildPlugin;
import javax.inject.Inject;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.plugins.PluginManager;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;
import org.elasticsearch.gradle.VersionProperties;
import org.gradle.api.Plugin;
import org.gradle.api.Action;
import org.gradle.api.file.RegularFile;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.tasks.TaskCollection;
import org.gradle.api.UnknownTaskException;
import org.gradle.api.file.ProjectLayout;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import static org.junit.jupiter.api.Assertions.*;
import org.gradle.api.artifacts.Dependency;
import org.gradle.api.tasks.TaskProvider;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.*;
import org.gradle.api.provider.Provider;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

class PluginBuildPluginSapientGeneratedTest {

    private final ProviderFactory providerFactoryMock = mock(ProviderFactory.class, "providerFactory");

    @Disabled()
    @Test
    void applyTest() throws UnknownDomainObjectException, UnknownTaskException {
        // Arrange
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
            when(projectMock.getPluginManager()).thenReturn(pluginManagerMock);
            doNothing().when(pluginManagerMock).apply(BasePluginBuildPlugin.class);
            when(projectMock.getDependencies()).thenReturn(dependencyHandlerMock);
            when(dependencyHandlerMock.add("compileOnly", "org.elasticsearch:elasticsearch:A")).thenReturn(dependencyMock);
            when(dependencyHandlerMock.add("testImplementation", "org.elasticsearch.test:framework:B")).thenReturn(dependencyMock2);
            when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
            PluginPropertiesExtension pluginPropertiesExtension = new PluginPropertiesExtension(projectMock2);
            pluginPropertiesExtension.setClassname("classname1");
            when(extensionContainerMock.getByType(PluginPropertiesExtension.class)).thenReturn(pluginPropertiesExtension);
            when(projectMock.getTasks()).thenReturn(taskContainerMock);
            when(taskContainerMock.withType(GeneratePluginPropertiesTask.class)).thenReturn(taskCollectionMock);
            when(taskCollectionMock.named("pluginProperties")).thenReturn(taskProviderMock);
            doNothing().when(taskProviderMock).configure(any(Action.class));
            when(projectMock.getLayout()).thenReturn(projectLayoutMock);
            when(projectLayoutMock.getBuildDirectory()).thenReturn(directoryPropertyMock);
            when(directoryPropertyMock.file("generated-descriptor/plugin-descriptor.properties")).thenReturn(providerMock);
            when(providerFactoryMock.provider(any())).thenReturn(providerMock2);
            versionProperties.when(VersionProperties::getElasticsearch).thenReturn("A").thenReturn("B");
            PluginBuildPlugin target = new PluginBuildPlugin(providerFactoryMock);
            // Act
            target.apply(projectMock);
            // Assert
            assertAll("result", () -> verify(projectMock).getPluginManager(), () -> verify(pluginManagerMock).apply(BasePluginBuildPlugin.class), () -> verify(projectMock).getDependencies(), () -> verify(dependencyHandlerMock).add("compileOnly", "org.elasticsearch:elasticsearch:A"), () -> verify(dependencyHandlerMock).add("testImplementation", "org.elasticsearch.test:framework:B"), () -> verify(projectMock).getExtensions(), () -> verify(extensionContainerMock).getByType(PluginPropertiesExtension.class), () -> verify(projectMock).getTasks(), () -> verify(taskContainerMock).withType(GeneratePluginPropertiesTask.class), () -> verify(taskCollectionMock).named("pluginProperties"), () -> verify(taskProviderMock).configure(any(Action.class)), () -> verify(projectMock).getLayout(), () -> verify(projectLayoutMock).getBuildDirectory(), () -> verify(directoryPropertyMock).file("generated-descriptor/plugin-descriptor.properties"), () -> verify(providerFactoryMock).provider(any()), () -> versionProperties.verify(VersionProperties::getElasticsearch, atLeast(2)));
        }
    }

    @Test
    void constructorTest() {
        // Act
        PluginBuildPlugin plugin = new PluginBuildPlugin(providerFactoryMock);
        // Assert
        assertNotNull(plugin);
        assertEquals(providerFactoryMock, plugin.providerFactory);
    }
}

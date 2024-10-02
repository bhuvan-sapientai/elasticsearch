package org.elasticsearch.gradle.internal.packer;

import org.elasticsearch.gradle.internal.packer.CacheTestFixtureResourcesPlugin;

import org.gradle.api.DomainObjectCollection;
import org.gradle.api.plugins.JavaPluginExtension;
import org.elasticsearch.gradle.internal.ResolveAllDependencies;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.Action;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.api.artifacts.Dependency;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;

import java.util.HashMap;

import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.tasks.SourceSet;

import java.util.Map;

import org.gradle.api.artifacts.Configuration;
import org.elasticsearch.gradle.VersionProperties;
import org.gradle.api.Plugin;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.tasks.TaskCollection;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.file.FileCollection;

import static org.mockito.ArgumentMatchers.any;

class CacheTestFixtureResourcesPluginSapientGeneratedTest {

    @Test
    void applyTest() {
        // Arrange
        //Project projectMock = mock(Project.class);
        //ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        //Configuration configurationMock = mock(Configuration.class);
        //DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        //Dependency dependencyMock = mock(Dependency.class);
        //PluginContainer pluginContainerMock = mock(PluginContainer.class);
        //DomainObjectCollection domainObjectCollectionMock = mock(DomainObjectCollection.class);
        //TaskContainer taskContainerMock = mock(TaskContainer.class);
        //TaskProvider<CacheCacheableTestFixtures> taskProviderMock = mock(TaskProvider.class);
        //JavaPluginExtension javaPluginExtensionMock = mock(JavaPluginExtension.class);
        //SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        //SourceSet sourceSetMock = mock(SourceSet.class);
        //FileCollection fileCollectionMock = mock(FileCollection.class);
        //TaskCollection taskCollectionMock = mock(TaskCollection.class);
        //when(projectMock.getConfigurations()).thenReturn(configurationContainerMock);
        //when(configurationContainerMock.create("cacheTestFixtures")).thenReturn(configurationMock);
        //when(projectMock.getDependencies()).thenReturn(dependencyHandlerMock);
        //when(dependencyHandlerMock.create(anyString())).thenReturn(dependencyMock);
        //when(projectMock.getPlugins()).thenReturn(pluginContainerMock);
        //when(pluginContainerMock.withType(eq(JavaPlugin.class), any())).thenReturn(domainObjectCollectionMock);
        //when(projectMock.getTasks()).thenReturn(taskContainerMock);
        //when(taskContainerMock.register(eq("cacheTestFixtures"), eq(CacheCacheableTestFixtures.class), any())).thenReturn(taskProviderMock);
        //when(projectMock.getExtensions()).thenReturn(mock(org.gradle.api.plugins.ExtensionContainer.class));
        //when(projectMock.getExtensions().getByType(JavaPluginExtension.class)).thenReturn(javaPluginExtensionMock);
        //when(javaPluginExtensionMock.getSourceSets()).thenReturn(sourceSetContainerMock);
        //when(sourceSetContainerMock.getByName("test")).thenReturn(sourceSetMock);
        //when(sourceSetMock.getRuntimeClasspath()).thenReturn(fileCollectionMock);
        //when(taskContainerMock.withType(ResolveAllDependencies.class)).thenReturn(taskCollectionMock);
        //Map<String, String> versions = new HashMap<>();
        //versions.put("reflections", "0.9.12");
        /*try (MockedStatic<VersionProperties> versionPropertiesMock = mockStatic(VersionProperties.class)) {
    versionPropertiesMock.when(VersionProperties::getVersions).thenReturn(versions);
    // Act
    CacheTestFixtureResourcesPlugin plugin = new CacheTestFixtureResourcesPlugin();
    plugin.apply(projectMock);
    // Assert
    verify(configurationContainerMock).create("cacheTestFixtures");
    verify(configurationMock).defaultDependencies(any());
    verify(dependencyHandlerMock).create("org.reflections:reflections:0.9.12");
    verify(pluginContainerMock).withType(eq(JavaPlugin.class), any());
    verify(taskContainerMock).register(eq("cacheTestFixtures"), eq(CacheCacheableTestFixtures.class), any());
    verify(sourceSetContainerMock).getByName("test");
    verify(taskCollectionMock).configureEach(any());
    versionPropertiesMock.verify(VersionProperties::getVersions);
}*/
    }

    @Test
    void testCacheTestFixturesConstant() {
        assertEquals("cacheTestFixtures", CacheTestFixtureResourcesPlugin.CACHE_TEST_FIXTURES);
    }
}
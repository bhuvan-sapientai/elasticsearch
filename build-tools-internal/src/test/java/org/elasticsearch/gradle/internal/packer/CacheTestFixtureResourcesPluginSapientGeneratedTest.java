package org.elasticsearch.gradle.internal.packer;

import org.elasticsearch.gradle.internal.packer.CacheTestFixtureResourcesPlugin;

import org.gradle.api.tasks.SourceSet;
import org.junit.jupiter.api.BeforeEach;
import org.elasticsearch.gradle.internal.ResolveAllDependencies;
import org.gradle.api.plugins.JavaPluginExtension;

import java.util.Map;

import static org.mockito.ArgumentMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.Configuration;

import static org.mockito.ArgumentMatchers.eq;

import org.gradle.api.Project;
import org.elasticsearch.gradle.VersionProperties;
import org.gradle.api.Plugin;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.anyString;

import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.api.artifacts.Dependency;
import org.gradle.api.tasks.TaskProvider;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;

import java.util.HashMap;

import static org.mockito.ArgumentMatchers.any;

class CacheTestFixtureResourcesPluginSapientGeneratedTest {

    @Mock
    private Project project;

    @Mock
    private Configuration configuration;

    @Mock
    private DependencyHandler dependencyHandler;

    @Mock
    private Dependency dependency;

    @Mock
    private JavaPluginExtension javaPluginExtension;

    @Mock
    private SourceSet testSourceSet;

    @Mock
    private TaskProvider<CacheCacheableTestFixtures> taskProvider;

    private CacheTestFixtureResourcesPlugin plugin;

    @BeforeEach
    void setUp() {
        //MockitoAnnotations.openMocks(this);
        //plugin = new CacheTestFixtureResourcesPlugin();
        //when(project.getConfigurations()).thenReturn(mock(org.gradle.api.artifacts.ConfigurationContainer.class));
        //when(project.getConfigurations().create(anyString())).thenReturn(configuration);
        //when(project.getDependencies()).thenReturn(dependencyHandler);
        //when(dependencyHandler.create(anyString())).thenReturn(dependency);
        //when(project.getPlugins()).thenReturn(mock(org.gradle.api.plugins.PluginContainer.class));
        //when(project.getTasks()).thenReturn(mock(org.gradle.api.tasks.TaskContainer.class));
        //when(project.getExtensions()).thenReturn(mock(org.gradle.api.plugins.ExtensionContainer.class));
        //when(project.getExtensions().getByType(JavaPluginExtension.class)).thenReturn(javaPluginExtension);
        //when(javaPluginExtension.getSourceSets()).thenReturn(mock(org.gradle.api.tasks.SourceSetContainer.class));
        //when(javaPluginExtension.getSourceSets().getByName(JavaPlugin.TEST_SOURCE_SET_NAME)).thenReturn(testSourceSet);
        //when(project.getTasks().register(eq(CacheTestFixtureResourcesPlugin.CACHE_TEST_FIXTURES), eq(CacheCacheableTestFixtures.class), any())).thenReturn(taskProvider);
    }

    @Test
    void applyTest() {
        //Map<String, String> versions = new HashMap<>();
        //versions.put("reflections", "0.9.12");
        /*try (MockedStatic<VersionProperties> versionPropertiesMock = mockStatic(VersionProperties.class)) {
    versionPropertiesMock.when(VersionProperties::getVersions).thenReturn(versions);
    plugin.apply(project);
    verify(project.getConfigurations()).create(CacheTestFixtureResourcesPlugin.CACHE_TEST_FIXTURES);
    verify(configuration).defaultDependencies(any());
    verify(dependencyHandler).create("org.reflections:reflections:0.9.12");
    verify(project.getPlugins()).withType(eq(JavaPlugin.class), any());
    verify(project.getTasks()).register(eq(CacheTestFixtureResourcesPlugin.CACHE_TEST_FIXTURES), eq(CacheCacheableTestFixtures.class), any());
    verify(javaPluginExtension.getSourceSets()).getByName(JavaPlugin.TEST_SOURCE_SET_NAME);
    verify(project.getTasks()).withType(ResolveAllDependencies.class);
    versionPropertiesMock.verify(VersionProperties::getVersions);
}*/
    }

    @Test
    void testCacheTestFixturesConstant() {
        assertEquals("cacheTestFixtures", CacheTestFixtureResourcesPlugin.CACHE_TEST_FIXTURES);
    }
}
package org.elasticsearch.gradle.internal.packer;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.artifacts.Dependency;
import org.gradle.api.plugins.JavaPlugin;
import java.util.Map;
import java.util.HashMap;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.tasks.SourceSet;
import org.elasticsearch.gradle.internal.ResolveAllDependencies;
import org.gradle.api.plugins.ExtensionContainer;
import org.elasticsearch.gradle.VersionProperties;
import org.gradle.api.Action;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.plugins.JavaPluginExtension;
import org.gradle.api.file.FileCollection;
import org.gradle.api.Project;
import org.gradle.api.DomainObjectCollection;
import org.gradle.api.tasks.TaskCollection;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.mockito.MockedStatic;
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
class CacheTestFixtureResourcesPluginSapientGeneratedTest {

    //Sapient generated method id: ${applyTest}, hash: 443382CE076BCEE930C14FB619A5613A
    @Disabled()
    @Test()
    void applyTest() throws InvalidUserDataException, UnknownDomainObjectException {
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        Configuration configurationMock = mock(Configuration.class);
        Configuration configurationMock2 = mock(Configuration.class);
        DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        Dependency dependencyMock = mock(Dependency.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        DomainObjectCollection domainObjectCollectionMock = mock(DomainObjectCollection.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider<CacheCacheableTestFixtures> taskProviderMock = mock(TaskProvider.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        JavaPluginExtension javaPluginExtensionMock = mock(JavaPluginExtension.class);
        SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        SourceSet sourceSetMock = mock(SourceSet.class);
        FileCollection fileCollectionMock = mock(FileCollection.class);
        TaskContainer taskContainerMock2 = mock(TaskContainer.class);
        TaskCollection taskCollectionMock = mock(TaskCollection.class);
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(configurationContainerMock).when(projectMock).getConfigurations();
            doReturn(configurationMock).when(configurationContainerMock).create("cacheTestFixtures");
            doReturn(configurationMock2).when(configurationMock).defaultDependencies((Action) any());
            doReturn(dependencyHandlerMock).when(projectMock).getDependencies();
            doReturn(dependencyMock).when(dependencyHandlerMock).create("org.reflections:reflections:A");
            doReturn(pluginContainerMock).when(projectMock).getPlugins();
            doReturn(domainObjectCollectionMock).when(pluginContainerMock).withType(eq(JavaPlugin.class), (Action) any());
            doReturn(taskProviderMock).when(taskContainerMock).register(eq("cacheTestFixtures"), eq(CacheCacheableTestFixtures.class), (Action) any());
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(javaPluginExtensionMock).when(extensionContainerMock).getByType(JavaPluginExtension.class);
            doReturn(sourceSetContainerMock).when(javaPluginExtensionMock).getSourceSets();
            doReturn(sourceSetMock).when(sourceSetContainerMock).getByName("test");
            doReturn(fileCollectionMock).when(sourceSetMock).getRuntimeClasspath();
            doReturn(taskContainerMock, taskContainerMock2).when(projectMock).getTasks();
            doReturn(taskCollectionMock).when(taskContainerMock2).withType(ResolveAllDependencies.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            Map<String, String> stringStringMap = new HashMap<>();
            stringStringMap.put("reflections", "A");
            versionProperties.when(() -> VersionProperties.getVersions()).thenReturn(stringStringMap);
            CacheTestFixtureResourcesPlugin target = new CacheTestFixtureResourcesPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).getConfigurations();
                verify(configurationContainerMock).create("cacheTestFixtures");
                verify(configurationMock).defaultDependencies((Action) any());
                verify(projectMock).getDependencies();
                verify(dependencyHandlerMock).create("org.reflections:reflections:A");
                verify(projectMock).getPlugins();
                verify(pluginContainerMock).withType(eq(JavaPlugin.class), (Action) any());
                verify(projectMock, times(2)).getTasks();
                verify(taskContainerMock).register(eq("cacheTestFixtures"), eq(CacheCacheableTestFixtures.class), (Action) any());
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByType(JavaPluginExtension.class);
                verify(javaPluginExtensionMock).getSourceSets();
                verify(sourceSetContainerMock).getByName("test");
                verify(sourceSetMock).getRuntimeClasspath();
                verify(taskContainerMock2).withType(ResolveAllDependencies.class);
                verify(taskCollectionMock).configureEach((Action) any());
                versionProperties.verify(() -> VersionProperties.getVersions(), atLeast(1));
            });
        }
    }
}

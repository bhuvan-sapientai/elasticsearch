package org.elasticsearch.gradle.internal.test;

import org.elasticsearch.gradle.internal.test.DistroTestPlugin;

import org.elasticsearch.gradle.DistributionDownloadPlugin;
import org.elasticsearch.gradle.internal.docker.DockerSupportPlugin;
import org.gradle.api.invocation.Gradle;
import org.gradle.api.plugins.PluginManager;
import org.elasticsearch.gradle.internal.test.DistroTestPlugin;
import org.junit.jupiter.api.Test;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.Project;
import org.elasticsearch.gradle.internal.InternalDistributionDownloadPlugin;
import org.elasticsearch.gradle.ElasticsearchDistribution.Platform;
import org.elasticsearch.gradle.internal.docker.DockerSupportService;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;

import org.gradle.api.plugins.PluginContainer;

import java.util.List;

import org.elasticsearch.gradle.ElasticsearchDistributionType;
import org.elasticsearch.gradle.ElasticsearchDistribution;

import java.util.Map;

import org.elasticsearch.gradle.VersionProperties;
import org.junit.jupiter.api.Timeout;
import org.gradle.api.tasks.TaskContainer;
import org.elasticsearch.gradle.util.GradleUtils;
import org.elasticsearch.gradle.internal.JdkDownloadPlugin;
import org.gradle.api.services.BuildServiceRegistry;
import org.gradle.api.tasks.TaskProvider;
import org.elasticsearch.gradle.Architecture;
import org.gradle.api.provider.Provider;
import org.gradle.api.Task;

import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class DistroTestPluginSapientGeneratedTest {

    @Test
    void applyConfiguresProjectCorrectly() {
        // Arrange
        //Project projectMock = mock(Project.class);
        //Project rootProjectMock = mock(Project.class);
        //PluginManager rootPluginManagerMock = mock(PluginManager.class);
        //PluginContainer pluginContainerMock = mock(PluginContainer.class);
        //PluginManager pluginManagerMock = mock(PluginManager.class);
        //Gradle gradleMock = mock(Gradle.class);
        //BuildServiceRegistry buildServiceRegistryMock = mock(BuildServiceRegistry.class);
        //NamedDomainObjectContainer<ElasticsearchDistribution> distributionContainerMock = mock(NamedDomainObjectContainer.class);
        //Provider<DockerSupportService> dockerSupportServiceProviderMock = mock(Provider.class);
        //TaskContainer taskContainerMock = mock(TaskContainer.class);
        //doReturn(rootProjectMock).when(projectMock).getRootProject();
        //doReturn(rootPluginManagerMock).when(rootProjectMock).getPluginManager();
        //doReturn(pluginContainerMock).when(projectMock).getPlugins();
        //doReturn(pluginManagerMock).when(projectMock).getPluginManager();
        //doReturn(gradleMock).when(projectMock).getGradle();
        //doReturn(buildServiceRegistryMock).when(gradleMock).getSharedServices();
        //doReturn(taskContainerMock).when(projectMock).getTasks();
        /*try (MockedStatic<DistributionDownloadPlugin> distributionDownloadPluginMockedStatic = mockStatic(DistributionDownloadPlugin.class);
    MockedStatic<GradleUtils> gradleUtilsMockedStatic = mockStatic(GradleUtils.class);
    MockedStatic<VersionProperties> versionPropertiesMockedStatic = mockStatic(VersionProperties.class)) {
    distributionDownloadPluginMockedStatic.when(() -> DistributionDownloadPlugin.getContainer(projectMock)).thenReturn(distributionContainerMock);
    gradleUtilsMockedStatic.when(() -> GradleUtils.getBuildService(buildServiceRegistryMock, DockerSupportPlugin.DOCKER_SUPPORT_SERVICE_NAME)).thenReturn(dockerSupportServiceProviderMock);
    versionPropertiesMockedStatic.when(VersionProperties::getElasticsearch).thenReturn("7.10.0");
    DistroTestPlugin distroTestPlugin = new DistroTestPlugin();
    // Act
    distroTestPlugin.apply(projectMock);
    // Assert
    verify(rootProjectMock).getPluginManager();
    verify(rootPluginManagerMock).apply(DockerSupportPlugin.class);
    verify(pluginContainerMock).apply(InternalDistributionDownloadPlugin.class);
    verify(pluginContainerMock).apply(JdkDownloadPlugin.class);
    verify(pluginManagerMock).apply("elasticsearch.java");
    verify(projectMock).getGradle();
    verify(gradleMock).getSharedServices();
    verify(taskContainerMock).register(eq("destructiveDistroTest"), any());
    distributionDownloadPluginMockedStatic.verify(() -> DistributionDownloadPlugin.getContainer(projectMock), times(2));
    gradleUtilsMockedStatic.verify(() -> GradleUtils.getBuildService(buildServiceRegistryMock, DockerSupportPlugin.DOCKER_SUPPORT_SERVICE_NAME));
    versionPropertiesMockedStatic.verify(VersionProperties::getElasticsearch, atLeastOnce());
}*/
    }

    @Test
    void applyConfiguresDistributionsCorrectly() {
        // Arrange
        //Project projectMock = mock(Project.class);
        //PluginContainer pluginContainerMock = mock(PluginContainer.class);
        //PluginManager pluginManagerMock = mock(PluginManager.class);
        //Gradle gradleMock = mock(Gradle.class);
        //BuildServiceRegistry buildServiceRegistryMock = mock(BuildServiceRegistry.class);
        //NamedDomainObjectContainer<ElasticsearchDistribution> distributionContainerMock = mock(NamedDomainObjectContainer.class);
        //Provider<DockerSupportService> dockerSupportServiceProviderMock = mock(Provider.class);
        //ElasticsearchDistribution distributionMock = mock(ElasticsearchDistribution.class);
        //TaskContainer taskContainerMock = mock(TaskContainer.class);
        //TaskProvider<Task> taskProviderMock = mock(TaskProvider.class);
        //doReturn(projectMock).when(projectMock).getRootProject();
        //doReturn(pluginContainerMock).when(projectMock).getPlugins();
        //doReturn(pluginManagerMock).when(projectMock).getPluginManager();
        //doReturn(gradleMock).when(projectMock).getGradle();
        //doReturn(buildServiceRegistryMock).when(gradleMock).getSharedServices();
        //doReturn(distributionMock).when(distributionContainerMock).create(anyString(), any());
        //doReturn(taskContainerMock).when(projectMock).getTasks();
        //doReturn(taskProviderMock).when(taskContainerMock).register(anyString());
        /*try (MockedStatic<DistributionDownloadPlugin> distributionDownloadPluginMockedStatic = mockStatic(DistributionDownloadPlugin.class);
    MockedStatic<GradleUtils> gradleUtilsMockedStatic = mockStatic(GradleUtils.class);
    MockedStatic<VersionProperties> versionPropertiesMockedStatic = mockStatic(VersionProperties.class)) {
    distributionDownloadPluginMockedStatic.when(() -> DistributionDownloadPlugin.getContainer(projectMock)).thenReturn(distributionContainerMock);
    gradleUtilsMockedStatic.when(() -> GradleUtils.getBuildService(buildServiceRegistryMock, DockerSupportPlugin.DOCKER_SUPPORT_SERVICE_NAME)).thenReturn(dockerSupportServiceProviderMock);
    versionPropertiesMockedStatic.when(VersionProperties::getElasticsearch).thenReturn("7.10.0");
    DistroTestPlugin distroTestPlugin = new DistroTestPlugin();
    // Act
    distroTestPlugin.apply(projectMock);
    // Assert
    verify(distributionContainerMock, atLeast(1)).create(anyString(), any());
    verify(distributionMock, atLeast(1)).setArchitecture(any(Architecture.class));
    verify(distributionMock, atLeast(1)).setType(any(ElasticsearchDistributionType.class));
    verify(distributionMock, atLeast(1)).setVersion(anyString());
    verify(distributionMock, atLeast(1)).setPreferArchive(anyBoolean());
    verify(distributionMock, atLeast(1)).setPlatform(any(Platform.class));
    verify(taskContainerMock, atLeast(1)).register(anyString(), any());
}*/
    }
}
package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.Transformer;
import org.gradle.api.invocation.Gradle;
import org.gradle.api.provider.Provider;
import org.elasticsearch.gradle.util.GradleUtils;
import org.gradle.api.Project;
import org.elasticsearch.gradle.DistributionResolution;
import org.elasticsearch.gradle.DistributionDownloadPlugin;
import org.elasticsearch.gradle.internal.docker.DockerSupportPlugin;
import org.elasticsearch.gradle.internal.docker.DockerSupportService;
import org.mockito.MockedStatic;
import org.elasticsearch.gradle.internal.info.GlobalBuildInfoPlugin;
import java.util.ArrayList;
import org.gradle.api.services.BuildServiceRegistry;
import org.gradle.api.plugins.PluginManager;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

@Timeout(value = 5)
class InternalDistributionDownloadPluginSapientGeneratedTest {

    //Sapient generated method id: ${applyTest}, hash: F8A3499D02444425570DCC9411BE7CEE
    @Test()
    void applyTest() {
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        Project projectMock2 = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        Project projectMock3 = mock(Project.class);
        PluginManager pluginManagerMock2 = mock(PluginManager.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        DistributionDownloadPlugin distributionDownloadPluginMock = mock(DistributionDownloadPlugin.class);
        Provider<Boolean> providerMock = mock(Provider.class);
        Gradle gradleMock = mock(Gradle.class);
        BuildServiceRegistry buildServiceRegistryMock = mock(BuildServiceRegistry.class);
        Provider<DockerSupportService> providerMock2 = mock(Provider.class);
        try (MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class);
            MockedStatic<DistributionDownloadPlugin> distributionDownloadPlugin = mockStatic(DistributionDownloadPlugin.class)) {
            doReturn(pluginManagerMock).when(projectMock2).getPluginManager();
            doNothing().when(pluginManagerMock).apply(GlobalBuildInfoPlugin.class);
            doReturn(projectMock2, projectMock3).when(projectMock).getRootProject();
            doReturn(pluginManagerMock2).when(projectMock3).getPluginManager();
            doNothing().when(pluginManagerMock2).apply(DockerSupportPlugin.class);
            doReturn(pluginContainerMock).when(projectMock).getPlugins();
            doReturn(distributionDownloadPluginMock).when(pluginContainerMock).apply(DistributionDownloadPlugin.class);
            doNothing().when(distributionDownloadPluginMock).setDockerAvailability(providerMock);
            doReturn(gradleMock).when(projectMock).getGradle();
            doReturn(buildServiceRegistryMock).when(gradleMock).getSharedServices();
            DistributionResolution distributionResolution = new DistributionResolution("local-build", (DistributionResolution.Resolver) null);
            DistributionResolution distributionResolution2 = new DistributionResolution("bwc", (DistributionResolution.Resolver) null);
            List<DistributionResolution> distributionResolutionList = new ArrayList<>();
            distributionResolutionList.add(distributionResolution);
            distributionResolutionList.add(distributionResolution2);
            distributionDownloadPlugin.when(() -> DistributionDownloadPlugin.getRegistrationsContainer(projectMock)).thenReturn(distributionResolutionList);
            gradleUtils.when(() -> GradleUtils.getBuildService(buildServiceRegistryMock, "dockerSupportService")).thenReturn(providerMock2);
            doReturn(providerMock).when(providerMock2).map((Transformer) any());
            InternalDistributionDownloadPlugin target = new InternalDistributionDownloadPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(2)).getRootProject();
                verify(projectMock2).getPluginManager();
                verify(pluginManagerMock).apply(GlobalBuildInfoPlugin.class);
                verify(projectMock3).getPluginManager();
                verify(pluginManagerMock2).apply(DockerSupportPlugin.class);
                verify(projectMock).getPlugins();
                verify(pluginContainerMock).apply(DistributionDownloadPlugin.class);
                verify(distributionDownloadPluginMock).setDockerAvailability(providerMock);
                verify(projectMock).getGradle();
                verify(gradleMock).getSharedServices();
                distributionDownloadPlugin.verify(() -> DistributionDownloadPlugin.getRegistrationsContainer(projectMock), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.getBuildService(buildServiceRegistryMock, "dockerSupportService"), atLeast(1));
                verify(providerMock2).map((Transformer) any());
            });
        }
    }
}

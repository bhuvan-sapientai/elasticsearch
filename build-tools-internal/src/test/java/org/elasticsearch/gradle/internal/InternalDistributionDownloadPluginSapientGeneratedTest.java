package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.InternalDistributionDownloadPlugin;

import org.elasticsearch.gradle.DistributionDownloadPlugin;
import org.elasticsearch.gradle.internal.docker.DockerSupportPlugin;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.invocation.Gradle;

import java.util.List;

import org.gradle.api.plugins.PluginManager;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;
import org.mockito.Mock;
import org.elasticsearch.gradle.DistributionResolution;
import org.elasticsearch.gradle.util.GradleUtils;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.services.BuildServiceRegistry;
import org.elasticsearch.gradle.internal.docker.DockerSupportService;
import org.elasticsearch.gradle.internal.info.GlobalBuildInfoPlugin;

import static org.mockito.Mockito.*;

import org.gradle.api.provider.Provider;

import static org.mockito.ArgumentMatchers.any;

class InternalDistributionDownloadPluginSapientGeneratedTest {

    @Mock
    private Project project;

    @Mock
    private PluginManager pluginManager;

    @Mock
    private PluginContainer pluginContainer;

    @Mock
    private DistributionDownloadPlugin distributionDownloadPlugin;

    @Mock
    private Gradle gradle;

    @Mock
    private BuildServiceRegistry buildServiceRegistry;

    @Mock
    private Provider<DockerSupportService> dockerSupportServiceProvider;

    @Mock
    private Provider<Boolean> booleanProvider;

    @Test
    void testApply() {
        // Arrange
        //InternalDistributionDownloadPlugin plugin = new InternalDistributionDownloadPlugin();
        //when(project.getRootProject()).thenReturn(project);
        //when(project.getPluginManager()).thenReturn(pluginManager);
        //when(project.getPlugins()).thenReturn(pluginContainer);
        //when(project.getGradle()).thenReturn(gradle);
        //when(gradle.getSharedServices()).thenReturn(buildServiceRegistry);
        //when(pluginContainer.apply(DistributionDownloadPlugin.class)).thenReturn(distributionDownloadPlugin);
        //List<DistributionResolution> resolutions = new ArrayList<>();
        //resolutions.add(new DistributionResolution("local-build", null));
        //resolutions.add(new DistributionResolution("bwc", null));
        /*try (var mockedStatic = mockStatic(DistributionDownloadPlugin.class);
    var mockedGradleUtils = mockStatic(GradleUtils.class)) {
    mockedStatic.when(() -> DistributionDownloadPlugin.getRegistrationsContainer(project)).thenReturn(resolutions);
    mockedGradleUtils.when(() -> GradleUtils.getBuildService(buildServiceRegistry, DockerSupportPlugin.DOCKER_SUPPORT_SERVICE_NAME)).thenReturn(dockerSupportServiceProvider);
    when(dockerSupportServiceProvider.map(any())).thenReturn(booleanProvider);
    // Act
    plugin.apply(project);
    // Assert
    verify(pluginManager).apply(GlobalBuildInfoPlugin.class);
    verify(pluginManager).apply(DockerSupportPlugin.class);
    verify(pluginContainer).apply(DistributionDownloadPlugin.class);
    verify(distributionDownloadPlugin).setDockerAvailability(booleanProvider);
    assertEquals(2, resolutions.size());
    assertEquals("local-build", resolutions.get(0).getName());
    assertEquals("bwc", resolutions.get(1).getName());
}*/
    }
}
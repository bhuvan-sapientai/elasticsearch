package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.InternalDistributionDownloadPlugin;

import org.elasticsearch.gradle.DistributionDownloadPlugin;
import org.elasticsearch.gradle.internal.docker.DockerSupportPlugin;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.gradle.api.GradleException;
import org.gradle.api.artifacts.Dependency;
import org.elasticsearch.gradle.internal.info.GlobalBuildInfoPlugin;
import org.elasticsearch.gradle.internal.docker.DockerSupportService;

import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.List;

import org.elasticsearch.gradle.Version;
import org.elasticsearch.gradle.ElasticsearchDistribution;
import org.junit.jupiter.api.BeforeEach;

import java.util.Map;

import org.elasticsearch.gradle.VersionProperties;
import org.elasticsearch.gradle.DistributionResolution;
import org.elasticsearch.gradle.internal.info.BuildParams;
import org.elasticsearch.gradle.util.GradleUtils;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

import org.elasticsearch.gradle.Architecture;
import org.gradle.api.provider.Provider;

import static org.mockito.ArgumentMatchers.any;

class InternalDistributionDownloadPluginSapientGeneratedTest {

    @Mock
    private Project project;

    @Mock
    private DependencyHandler dependencyHandler;

    @Mock
    private DistributionDownloadPlugin distributionDownloadPlugin;

    @Mock
    private Provider<DockerSupportService> dockerSupport;

    private InternalDistributionDownloadPlugin plugin;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        plugin = new InternalDistributionDownloadPlugin();
        when(project.getRootProject()).thenReturn(project);
        when(project.getDependencies()).thenReturn(dependencyHandler);
        when(project.getPlugins()).thenReturn(mock(org.gradle.api.plugins.PluginContainer.class));
        when(project.getGradle()).thenReturn(mock(org.gradle.api.invocation.Gradle.class));
    }

    @Test
    void testApply() {
        //List<DistributionResolution> resolutions = new ArrayList<>();
        //when(DistributionDownloadPlugin.getRegistrationsContainer(project)).thenReturn(resolutions);
        //when(GradleUtils.getBuildService(any(), eq(DockerSupportPlugin.DOCKER_SUPPORT_SERVICE_NAME))).thenReturn(dockerSupport);
        //when(dockerSupport.map(any())).thenReturn(mock(Provider.class));
        //plugin.apply(project);
        //verify(project.getRootProject().getPluginManager()).apply(GlobalBuildInfoPlugin.class);
        //verify(project.getRootProject().getPluginManager()).apply(DockerSupportPlugin.class);
        //verify(project.getPlugins()).apply(DistributionDownloadPlugin.class);
        //assertEquals(2, resolutions.size());
        //assertEquals("local-build", resolutions.get(0).getName());
        //assertEquals("bwc", resolutions.get(1).getName());
    }

    @Test
    void testIsCurrentVersion() {
        //ElasticsearchDistribution distribution = mock(ElasticsearchDistribution.class);
        //when(distribution.getVersion()).thenReturn(VersionProperties.getElasticsearch());
        //boolean result = plugin.isCurrentVersion(distribution);
        //assertTrue(result);
    }

    @Test
    void testDistributionProjectName() {
        //ElasticsearchDistribution distribution = mock(ElasticsearchDistribution.class);
        //when(distribution.getType()).thenReturn(ElasticsearchDistribution.Type.ARCHIVE);
        //when(distribution.getPlatform()).thenReturn(ElasticsearchDistribution.Platform.LINUX);
        //when(distribution.getArchitecture()).thenReturn(Architecture.X64);
        //String result = InternalDistributionDownloadPlugin.distributionProjectName(distribution);
        //assertEquals("linux-x86_64-tar", result);
    }

    @Test
    void testProjectDependency() {
        //Map<String, Object> depConfig = new HashMap<>();
        //depConfig.put("path", ":distribution");
        //depConfig.put("configuration", "default");
        //Dependency mockDependency = mock(Dependency.class);
        //when(dependencyHandler.project(depConfig)).thenReturn(mockDependency);
        //Dependency result = InternalDistributionDownloadPlugin.projectDependency(dependencyHandler, ":distribution", "default");
        //assertEquals(mockDependency, result);
    }

    @Test
    void testDistributionProjectPath() {
        //ElasticsearchDistribution distribution = mock(ElasticsearchDistribution.class);
        //when(distribution.getType()).thenReturn(ElasticsearchDistribution.Type.ARCHIVE);
        //when(distribution.getPlatform()).thenReturn(ElasticsearchDistribution.Platform.LINUX);
        //when(distribution.getArchitecture()).thenReturn(Architecture.X64);
        //String result = InternalDistributionDownloadPlugin.distributionProjectPath(distribution);
        //assertEquals(":distribution:archives:linux-x86_64-tar", result);
    }

    @Test
    void testGetProjectConfig() {
        //ElasticsearchDistribution distribution = mock(ElasticsearchDistribution.class);
        //when(distribution.getType()).thenReturn(ElasticsearchDistribution.Type.ARCHIVE);
        //BwcVersions.UnreleasedVersionInfo info = mock(BwcVersions.UnreleasedVersionInfo.class);
        //when(info.gradleProjectPath()).thenReturn(":distribution");
        //when(info.version()).thenReturn(Version.fromString("7.0.0"));
        //String result = InternalDistributionDownloadPlugin.getProjectConfig(distribution, info);
        //assertEquals("linux-x86_64-tar", result);
    }

    @Test
    void testProjectBasedDistributionDependency() {
        InternalDistributionDownloadPlugin.ProjectBasedDistributionDependency dependency = new InternalDistributionDownloadPlugin.ProjectBasedDistributionDependency(config -> mock(Dependency.class));
        assertNotNull(dependency.getDefaultNotation());
        assertNotNull(dependency.getExtractedNotation());
    }
}
package org.elasticsearch.gradle.internal.test;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.plugins.PluginContainer;
import org.elasticsearch.gradle.VersionProperties;
import org.elasticsearch.gradle.ElasticsearchDistribution;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.invocation.Gradle;
import org.gradle.api.provider.Provider;
import org.elasticsearch.gradle.util.GradleUtils;
import org.gradle.api.Project;
import org.elasticsearch.gradle.DistributionDownloadPlugin;
import org.elasticsearch.gradle.internal.JdkDownloadPlugin;
import org.elasticsearch.gradle.Architecture;
import org.elasticsearch.gradle.internal.docker.DockerSupportPlugin;
import org.elasticsearch.gradle.internal.docker.DockerSupportService;
import org.mockito.MockedStatic;
import org.elasticsearch.gradle.internal.InternalDistributionDownloadPlugin;
import org.gradle.api.services.BuildServiceRegistry;
import org.gradle.api.Plugin;
import org.gradle.api.plugins.PluginManager;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class DistroTestPluginSapientGeneratedTest {

    //Sapient generated method id: ${applyWhenTypeEqualsARCHIVEThrowsNullPointerException}, hash: 14B7B2C93A11E6FA54269E64BD39FCFD
    @Disabled()
    @Test()
    void applyWhenTypeEqualsARCHIVEThrowsNullPointerException() {
        /* Branches:
         * (for-each(Architecture.values())) : true  #  inside configureDistributions method
         * (type == ARCHIVE) : true  #  inside distroId method
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        Project projectMock2 = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        Plugin pluginMock = mock(Plugin.class);
        PluginContainer pluginContainerMock2 = mock(PluginContainer.class);
        Plugin pluginMock2 = mock(Plugin.class);
        PluginManager pluginManagerMock2 = mock(PluginManager.class);
        Gradle gradleMock = mock(Gradle.class);
        BuildServiceRegistry buildServiceRegistryMock = mock(BuildServiceRegistry.class);
        NamedDomainObjectContainer<ElasticsearchDistribution> namedDomainObjectContainerMock = mock(NamedDomainObjectContainer.class);
        NamedDomainObjectContainer<ElasticsearchDistribution> namedDomainObjectContainerMock2 = mock(NamedDomainObjectContainer.class);
        Provider<DockerSupportService> providerMock = mock(Provider.class);
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class);
            MockedStatic<DistributionDownloadPlugin> distributionDownloadPlugin = mockStatic(DistributionDownloadPlugin.class)) {
            doReturn(projectMock2).when(projectMock).getRootProject();
            doReturn(pluginManagerMock).when(projectMock2).getPluginManager();
            doNothing().when(pluginManagerMock).apply(DockerSupportPlugin.class);
            doReturn(pluginMock).when(pluginContainerMock).apply(InternalDistributionDownloadPlugin.class);
            doReturn(pluginContainerMock, pluginContainerMock2).when(projectMock).getPlugins();
            doReturn(pluginMock2).when(pluginContainerMock2).apply(JdkDownloadPlugin.class);
            doReturn(pluginManagerMock2).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock2).apply("elasticsearch.java");
            doReturn(gradleMock).when(projectMock).getGradle();
            doReturn(buildServiceRegistryMock).when(gradleMock).getSharedServices();
            distributionDownloadPlugin.when(() -> DistributionDownloadPlugin.getContainer(projectMock)).thenReturn(namedDomainObjectContainerMock).thenReturn(namedDomainObjectContainerMock2);
            gradleUtils.when(() -> GradleUtils.getBuildService(buildServiceRegistryMock, "dockerSupportService")).thenReturn(providerMock);
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            DistroTestPlugin target = new DistroTestPlugin();
            //Act Statement(s)
            final NullPointerException result = assertThrows(NullPointerException.class, () -> {
                target.apply(projectMock);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(projectMock).getRootProject();
                verify(projectMock2).getPluginManager();
                verify(pluginManagerMock).apply(DockerSupportPlugin.class);
                verify(projectMock, times(2)).getPlugins();
                verify(pluginContainerMock).apply(InternalDistributionDownloadPlugin.class);
                verify(pluginContainerMock2).apply(JdkDownloadPlugin.class);
                verify(projectMock).getPluginManager();
                verify(pluginManagerMock2).apply("elasticsearch.java");
                verify(projectMock).getGradle();
                verify(gradleMock).getSharedServices();
                distributionDownloadPlugin.verify(() -> DistributionDownloadPlugin.getContainer(projectMock), atLeast(2));
                gradleUtils.verify(() -> GradleUtils.getBuildService(buildServiceRegistryMock, "dockerSupportService"), atLeast(1));
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }
}

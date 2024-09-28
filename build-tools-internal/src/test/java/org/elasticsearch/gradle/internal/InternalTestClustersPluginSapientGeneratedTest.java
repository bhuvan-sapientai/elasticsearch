package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.plugins.PluginContainer;
import org.elasticsearch.gradle.VersionProperties;
import org.elasticsearch.gradle.Version;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.Action;
import org.gradle.api.provider.Provider;
import java.util.concurrent.Callable;
import org.gradle.api.Project;
import org.elasticsearch.gradle.testclusters.TestClustersPlugin;
import org.gradle.api.provider.ProviderFactory;
import java.util.function.Function;
import org.mockito.MockedStatic;
import java.io.File;
import org.elasticsearch.gradle.internal.info.BuildParams;
import org.gradle.api.Plugin;
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
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class InternalTestClustersPluginSapientGeneratedTest {

    private final ProviderFactory providerFactoryMock = mock(ProviderFactory.class, "providerFactory");

    private final BwcVersions bwcVersionsMock = mock(BwcVersions.class);

    private final PluginContainer pluginContainerMock = mock(PluginContainer.class);

    private final PluginContainer pluginContainerMock2 = mock(PluginContainer.class);

    private final PluginManager pluginManagerMock = mock(PluginManager.class);

    private final Plugin pluginMock = mock(Plugin.class);

    private final Project projectMock = mock(Project.class);

    private final Project projectMock2 = mock(Project.class);

    private final Provider<File> providerMock = mock(Provider.class);

    private final TestClustersPlugin testClustersPluginMock = mock(TestClustersPlugin.class);

    private final Version versionMock = mock(Version.class);

    //Sapient generated method id: ${applyWhenShouldConfigureTestClustersWithOneProcessor}, hash: FD7F65A3ED232BD2461C5700E1097172
    @Disabled()
    @Test()
    void applyWhenShouldConfigureTestClustersWithOneProcessor() throws UnknownDomainObjectException {
        /* Branches:
         * (version.equals(VersionProperties.getElasticsearchVersion())) : true  #  inside lambda$apply$1 method
         * (BuildParams.isSnapshotBuild() == false) : false  #  inside lambda$apply$1 method
         * (BuildParams.getBwcVersions().unreleasedInfo(version) == null) : true  #  inside lambda$apply$1 method
         * (Boolean.parseBoolean(System.getProperty("tests.configure_test_clusters_with_one_processor", "false"))) : true  #  inside shouldConfigureTestClustersWithOneProcessor method
         * (shouldConfigureTestClustersWithOneProcessor()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        NamedDomainObjectContainer namedDomainObjectContainerMock = mock(NamedDomainObjectContainer.class);
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            doReturn(pluginMock).when(pluginContainerMock).apply(InternalDistributionDownloadPlugin.class);
            doReturn(projectMock2).when(projectMock).getRootProject();
            doReturn(pluginManagerMock).when(projectMock2).getPluginManager();
            doNothing().when(pluginManagerMock).apply(InternalReaperPlugin.class);
            doReturn(pluginContainerMock, pluginContainerMock2).when(projectMock).getPlugins();
            doReturn(testClustersPluginMock).when(pluginContainerMock2).apply(TestClustersPlugin.class);
            doNothing().when(testClustersPluginMock).setRuntimeJava(providerMock);
            doNothing().when(testClustersPluginMock).setIsReleasedVersion((Function) any());
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(namedDomainObjectContainerMock).when(extensionContainerMock).getByName("testClusters");
            doNothing().when(namedDomainObjectContainerMock).configureEach((Action) any());
            doReturn(providerMock).when(providerFactoryMock).provider((Callable) any());
            File file = new File("pathname1");
            buildParams.when(() -> BuildParams.getRuntimeJavaHome()).thenReturn(file);
            buildParams.when(() -> BuildParams.isSnapshotBuild()).thenReturn(false);
            buildParams.when(() -> BuildParams.getBwcVersions()).thenReturn(bwcVersionsMock);
            doReturn(null).when(bwcVersionsMock).unreleasedInfo(versionMock);
            versionProperties.when(() -> VersionProperties.getElasticsearchVersion()).thenReturn(versionMock);
            InternalTestClustersPlugin target = new InternalTestClustersPlugin(providerFactoryMock);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(2)).getPlugins();
                verify(pluginContainerMock).apply(InternalDistributionDownloadPlugin.class);
                verify(projectMock).getRootProject();
                verify(projectMock2).getPluginManager();
                verify(pluginManagerMock).apply(InternalReaperPlugin.class);
                verify(pluginContainerMock2).apply(TestClustersPlugin.class);
                verify(testClustersPluginMock).setRuntimeJava(providerMock);
                verify(testClustersPluginMock).setIsReleasedVersion((Function) any());
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByName("testClusters");
                verify(namedDomainObjectContainerMock).configureEach((Action) any());
                verify(providerFactoryMock).provider((Callable) any());
                buildParams.verify(() -> BuildParams.getRuntimeJavaHome(), atLeast(1));
                buildParams.verify(() -> BuildParams.isSnapshotBuild(), atLeast(1));
                buildParams.verify(() -> BuildParams.getBwcVersions(), atLeast(1));
                verify(bwcVersionsMock).unreleasedInfo(versionMock);
                versionProperties.verify(() -> VersionProperties.getElasticsearchVersion(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenBooleanNotParseBooleanSystemGetPropertyTests_configure_test_clusters_with_one_processorFalseAndShouldConfigure4}, hash: D448B9E9379F2A771A6DE02CFF83D133
    @Disabled()
    @Test()
    void applyWhenBooleanNotParseBooleanSystemGetPropertyTests_configure_test_clusters_with_one_processorFalseAndShouldConfigure4() {
        /* Branches:
         * (version.equals(VersionProperties.getElasticsearchVersion())) : true  #  inside lambda$apply$1 method
         * (BuildParams.isSnapshotBuild() == false) : false  #  inside lambda$apply$1 method
         * (BuildParams.getBwcVersions().unreleasedInfo(version) == null) : false  #  inside lambda$apply$1 method
         * (Boolean.parseBoolean(System.getProperty("tests.configure_test_clusters_with_one_processor", "false"))) : false  #  inside shouldConfigureTestClustersWithOneProcessor method
         * (shouldConfigureTestClustersWithOneProcessor()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BwcVersions.UnreleasedVersionInfo bwcVersionsUnreleasedVersionInfoMock = mock(BwcVersions.UnreleasedVersionInfo.class);
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            doReturn(pluginMock).when(pluginContainerMock).apply(InternalDistributionDownloadPlugin.class);
            doReturn(projectMock2).when(projectMock).getRootProject();
            doReturn(pluginManagerMock).when(projectMock2).getPluginManager();
            doNothing().when(pluginManagerMock).apply(InternalReaperPlugin.class);
            doReturn(pluginContainerMock, pluginContainerMock2).when(projectMock).getPlugins();
            doReturn(testClustersPluginMock).when(pluginContainerMock2).apply(TestClustersPlugin.class);
            doNothing().when(testClustersPluginMock).setRuntimeJava(providerMock);
            doNothing().when(testClustersPluginMock).setIsReleasedVersion((Function) any());
            doReturn(providerMock).when(providerFactoryMock).provider((Callable) any());
            File file = new File("pathname1");
            buildParams.when(() -> BuildParams.getRuntimeJavaHome()).thenReturn(file);
            buildParams.when(() -> BuildParams.isSnapshotBuild()).thenReturn(true);
            buildParams.when(() -> BuildParams.getBwcVersions()).thenReturn(bwcVersionsMock);
            doReturn(bwcVersionsUnreleasedVersionInfoMock).when(bwcVersionsMock).unreleasedInfo(versionMock);
            versionProperties.when(() -> VersionProperties.getElasticsearchVersion()).thenReturn(versionMock);
            InternalTestClustersPlugin target = new InternalTestClustersPlugin(providerFactoryMock);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(2)).getPlugins();
                verify(pluginContainerMock).apply(InternalDistributionDownloadPlugin.class);
                verify(projectMock).getRootProject();
                verify(projectMock2).getPluginManager();
                verify(pluginManagerMock).apply(InternalReaperPlugin.class);
                verify(pluginContainerMock2).apply(TestClustersPlugin.class);
                verify(testClustersPluginMock).setRuntimeJava(providerMock);
                verify(testClustersPluginMock).setIsReleasedVersion((Function) any());
                verify(providerFactoryMock).provider((Callable) any());
                buildParams.verify(() -> BuildParams.getRuntimeJavaHome(), atLeast(1));
                buildParams.verify(() -> BuildParams.isSnapshotBuild(), atLeast(1));
                buildParams.verify(() -> BuildParams.getBwcVersions(), atLeast(1));
                verify(bwcVersionsMock).unreleasedInfo(versionMock);
                versionProperties.verify(() -> VersionProperties.getElasticsearchVersion(), atLeast(1));
            });
        }
    }
}

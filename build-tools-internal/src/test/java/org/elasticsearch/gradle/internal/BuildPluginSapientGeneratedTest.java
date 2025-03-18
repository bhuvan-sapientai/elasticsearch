package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.BuildPlugin;

import org.elasticsearch.gradle.internal.precommit.InternalPrecommitTasks;
import org.gradle.api.plugins.PluginManager;
import org.gradle.api.plugins.ExtraPropertiesExtension;
import org.junit.jupiter.api.Test;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.Project;
import org.elasticsearch.gradle.internal.test.HistoricalFeaturesMetadataPlugin;

import java.io.File;

import org.gradle.api.Action;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.file.ProjectLayout;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.provider.ProviderFactory;

import static org.hamcrest.MatcherAssert.assertThat;

import org.elasticsearch.gradle.internal.snyk.SnykDependencyMonitoringGradlePlugin;
import org.mockito.MockedStatic;
import org.elasticsearch.gradle.internal.info.GlobalBuildInfoPlugin;

import static org.mockito.Mockito.*;

import org.gradle.api.model.ObjectFactory;
import org.gradle.initialization.layout.BuildLayout;
import org.gradle.api.plugins.ExtraPropertiesExtension.UnknownPropertyException;
import org.gradle.api.file.RegularFile;
import org.junit.jupiter.api.Timeout;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.tasks.TaskCollection;
import org.gradle.api.UnknownDomainObjectException;
import org.mockito.stubbing.Answer;

import static org.hamcrest.Matchers.*;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.tasks.bundling.Jar;
import org.gradle.internal.scripts.ScriptFileResolver;
import org.gradle.api.provider.Provider;

import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class BuildPluginSapientGeneratedTest {

    private final ObjectFactory objectFactoryMock = mock(ObjectFactory.class, "objectFactory");

    private final ProviderFactory providerFactoryMock = mock(ProviderFactory.class, "providerFactory");

    private final ProjectLayout projectLayoutMock = mock(ProjectLayout.class, "projectLayout");

    private final BuildLayout buildLayoutMock = mock(BuildLayout.class);

    private final PluginManager pluginManagerMock = mock(PluginManager.class);

    private final PluginManager pluginManagerMock2 = mock(PluginManager.class);

    private final Project projectMock = mock(Project.class);

    private final Project projectMock2 = mock(Project.class);

    @Test
    void applyWhenProjectGetPluginManagerHasPluginElasticsearch_standalone_rest_testThrowsInvalidUserDataException() {
        doReturn(projectMock2).when(projectMock).getRootProject();
        doReturn(pluginManagerMock).when(projectMock2).getPluginManager();
        doNothing().when(pluginManagerMock).apply(GlobalBuildInfoPlugin.class);
        doReturn(pluginManagerMock2).when(projectMock).getPluginManager();
        doReturn(true).when(pluginManagerMock2).hasPlugin("elasticsearch.standalone-rest-test");
        BuildPlugin target = new BuildPlugin(buildLayoutMock, objectFactoryMock, providerFactoryMock, projectLayoutMock);
        InvalidUserDataException exception = assertThrows(InvalidUserDataException.class, () -> target.apply(projectMock));
        assertThat(exception.getMessage(), equalTo("elasticsearch.standalone-test, elasticsearch.standalone-rest-test, and elasticsearch.build are mutually exclusive"));
        verify(projectMock).getRootProject();
        verify(projectMock2).getPluginManager();
        verify(pluginManagerMock).apply(GlobalBuildInfoPlugin.class);
        verify(projectMock).getPluginManager();
        verify(pluginManagerMock2).hasPlugin("elasticsearch.standalone-rest-test");
    }

    @Test
    void applyWhenProjectGetPluginManagerNotHasPluginElasticsearch_standalone_rest_test() {
        PluginManager[] pluginManagers = new PluginManager[7];
        for (int i = 0; i < 7; i++) {
            pluginManagers[i] = mock(PluginManager.class);
        }
        try (MockedStatic<InternalPrecommitTasks> internalPrecommitTasks = mockStatic(InternalPrecommitTasks.class)) {
            doReturn(projectMock2).when(projectMock).getRootProject();
            doReturn(pluginManagerMock).when(projectMock2).getPluginManager();
            doNothing().when(pluginManagerMock).apply(GlobalBuildInfoPlugin.class);
            doReturn(false).when(pluginManagers[0]).hasPlugin("elasticsearch.standalone-rest-test");
            doNothing().when(pluginManagers[1]).apply("elasticsearch.java");
            doNothing().when(pluginManagers[2]).apply("elasticsearch.publish");
            doNothing().when(pluginManagers[3]).apply(ElasticsearchJavadocPlugin.class);
            doNothing().when(pluginManagers[4]).apply(DependenciesInfoPlugin.class);
            doNothing().when(pluginManagers[5]).apply(SnykDependencyMonitoringGradlePlugin.class);
            doReturn(pluginManagers[0], pluginManagers[1], pluginManagers[2], pluginManagers[3], pluginManagers[4], pluginManagers[5], pluginManagers[6]).when(projectMock).getPluginManager();
            doNothing().when(pluginManagers[6]).apply(HistoricalFeaturesMetadataPlugin.class);
            internalPrecommitTasks.when(() -> InternalPrecommitTasks.create(projectMock, true)).thenAnswer((Answer<Void>) invocation -> null);
            BuildPlugin target = spy(new BuildPlugin(buildLayoutMock, objectFactoryMock, providerFactoryMock, projectLayoutMock));
            doNothing().when(target).configureLicenseAndNotice(projectMock);
            target.apply(projectMock);
            verify(projectMock).getRootProject();
            verify(projectMock2).getPluginManager();
            verify(pluginManagerMock).apply(GlobalBuildInfoPlugin.class);
            verify(projectMock, times(7)).getPluginManager();
            verify(pluginManagers[0]).hasPlugin("elasticsearch.standalone-rest-test");
            verify(pluginManagers[1]).apply("elasticsearch.java");
            verify(pluginManagers[2]).apply("elasticsearch.publish");
            verify(pluginManagers[3]).apply(ElasticsearchJavadocPlugin.class);
            verify(pluginManagers[4]).apply(DependenciesInfoPlugin.class);
            verify(pluginManagers[5]).apply(SnykDependencyMonitoringGradlePlugin.class);
            verify(pluginManagers[6]).apply(HistoricalFeaturesMetadataPlugin.class);
            internalPrecommitTasks.verify(() -> InternalPrecommitTasks.create(projectMock, true), times(1));
            verify(target).configureLicenseAndNotice(projectMock);
        }
    }

    @Test
    void configureLicenseAndNoticeTest() throws UnknownDomainObjectException, UnknownPropertyException {
        //ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        //ExtraPropertiesExtension extraPropertiesExtensionMock = mock(ExtraPropertiesExtension.class);
        //RegularFileProperty regularFilePropertyMock = mock(RegularFileProperty.class);
        //RegularFileProperty regularFilePropertyMock2 = mock(RegularFileProperty.class);
        //Provider<RegularFile> providerMock = mock(Provider.class);
        //RegularFileProperty regularFilePropertyMock3 = mock(RegularFileProperty.class);
        //RegularFileProperty regularFilePropertyMock4 = mock(RegularFileProperty.class);
        //Provider<RegularFile> providerMock2 = mock(Provider.class);
        //doReturn(extensionContainerMock).when(projectMock).getExtensions();
        //doReturn(extraPropertiesExtensionMock).when(extensionContainerMock).getByType(ExtraPropertiesExtension.class);
        //doReturn(regularFilePropertyMock, regularFilePropertyMock3).when(objectFactoryMock).fileProperty();
        //doReturn(regularFilePropertyMock2).when(regularFilePropertyMock).convention(any());
        //doReturn(regularFilePropertyMock4).when(regularFilePropertyMock3).convention(any());
        //TaskContainer taskContainerMock = mock(TaskContainer.class);
        //TaskCollection taskCollectionMock = mock(TaskCollection.class);
        //doReturn(taskContainerMock).when(projectMock).getTasks();
        //doReturn(taskCollectionMock).when(taskContainerMock).withType(Jar.class);
        //File fileMock = mock(File.class);
        //doReturn(fileMock).when(buildLayoutMock).getRootDirectory();
        //BuildPlugin target = new BuildPlugin(buildLayoutMock, objectFactoryMock, providerFactoryMock, projectLayoutMock);
        //target.configureLicenseAndNotice(projectMock);
        //verify(projectMock, times(1)).getExtensions();
        //verify(extensionContainerMock).getByType(ExtraPropertiesExtension.class);
        //verify(extraPropertiesExtensionMock).set(eq("licenseFile"), any(RegularFileProperty.class));
        //verify(extraPropertiesExtensionMock).set(eq("noticeFile"), any(RegularFileProperty.class));
        //verify(objectFactoryMock, times(2)).fileProperty();
        //verify(regularFilePropertyMock).convention(any());
        //verify(regularFilePropertyMock3).convention(any());
        //verify(projectMock).getTasks();
        //verify(taskContainerMock).withType(Jar.class);
        //verify(taskCollectionMock).configureEach(any(Action.class));
    }
}
package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.plugins.ExtraPropertiesExtension.UnknownPropertyException;
import org.gradle.api.provider.Provider;
import org.gradle.api.plugins.ExtraPropertiesExtension;
import java.util.concurrent.Callable;
import org.gradle.api.tasks.bundling.Jar;
import org.gradle.api.provider.ProviderFactory;
import org.elasticsearch.gradle.internal.precommit.InternalPrecommitTasks;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.file.RegularFileProperty;
import org.mockito.stubbing.Answer;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.gradle.api.file.RegularFile;
import org.gradle.api.Project;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.tasks.TaskCollection;
import org.gradle.api.file.ProjectLayout;
import org.elasticsearch.gradle.internal.snyk.SnykDependencyMonitoringGradlePlugin;
import org.mockito.MockedStatic;
import org.elasticsearch.gradle.internal.info.GlobalBuildInfoPlugin;
import org.elasticsearch.gradle.internal.test.HistoricalFeaturesMetadataPlugin;
import java.io.File;
import org.gradle.initialization.layout.BuildLayout;
import org.gradle.internal.scripts.ScriptFileResolver;
import org.gradle.api.plugins.PluginManager;
import org.gradle.api.InvalidUserDataException;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

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

    //Sapient generated method id: ${applyWhenProjectGetPluginManagerHasPluginElasticsearch_standalone_rest_testThrowsInvalidUserDataException}, hash: A6F8F158A51C324A15298FD7668AFB73
    @Test()
    void applyWhenProjectGetPluginManagerHasPluginElasticsearch_standalone_rest_testThrowsInvalidUserDataException() {
        /* Branches:
         * (project.getPluginManager().hasPlugin("elasticsearch.standalone-rest-test")) : true
         */
        //Arrange Statement(s)
        doReturn(projectMock2).when(projectMock).getRootProject();
        doReturn(pluginManagerMock).when(projectMock2).getPluginManager();
        doNothing().when(pluginManagerMock).apply(GlobalBuildInfoPlugin.class);
        doReturn(pluginManagerMock2).when(projectMock).getPluginManager();
        doReturn(true).when(pluginManagerMock2).hasPlugin("elasticsearch.standalone-rest-test");
        BuildPlugin target = new BuildPlugin(buildLayoutMock, objectFactoryMock, providerFactoryMock, projectLayoutMock);
        InvalidUserDataException invalidUserDataException = new InvalidUserDataException("elasticsearch.standalone-test, elasticsearch.standalone-rest-test, and elasticsearch.build are mutually exclusive");
        //Act Statement(s)
        final InvalidUserDataException result = assertThrows(InvalidUserDataException.class, () -> {
            target.apply(projectMock);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(invalidUserDataException.getMessage()));
            verify(projectMock).getRootProject();
            verify(projectMock2).getPluginManager();
            verify(pluginManagerMock).apply(GlobalBuildInfoPlugin.class);
            verify(projectMock).getPluginManager();
            verify(pluginManagerMock2).hasPlugin("elasticsearch.standalone-rest-test");
        });
    }

    //Sapient generated method id: ${applyWhenProjectGetPluginManagerNotHasPluginElasticsearch_standalone_rest_test}, hash: 63AB347D0CF398B70365EBEF6906291E
    @Test()
    void applyWhenProjectGetPluginManagerNotHasPluginElasticsearch_standalone_rest_test() {
        /* Branches:
         * (project.getPluginManager().hasPlugin("elasticsearch.standalone-rest-test")) : false
         */
        //Arrange Statement(s)
        PluginManager pluginManagerMock3 = mock(PluginManager.class);
        PluginManager pluginManagerMock4 = mock(PluginManager.class);
        PluginManager pluginManagerMock5 = mock(PluginManager.class);
        PluginManager pluginManagerMock6 = mock(PluginManager.class);
        PluginManager pluginManagerMock7 = mock(PluginManager.class);
        PluginManager pluginManagerMock8 = mock(PluginManager.class);
        try (MockedStatic<InternalPrecommitTasks> internalPrecommitTasks = mockStatic(InternalPrecommitTasks.class)) {
            doReturn(projectMock2).when(projectMock).getRootProject();
            doReturn(pluginManagerMock).when(projectMock2).getPluginManager();
            doNothing().when(pluginManagerMock).apply(GlobalBuildInfoPlugin.class);
            doReturn(false).when(pluginManagerMock2).hasPlugin("elasticsearch.standalone-rest-test");
            doNothing().when(pluginManagerMock3).apply("elasticsearch.java");
            doNothing().when(pluginManagerMock4).apply("elasticsearch.publish");
            doNothing().when(pluginManagerMock5).apply(ElasticsearchJavadocPlugin.class);
            doNothing().when(pluginManagerMock6).apply(DependenciesInfoPlugin.class);
            doNothing().when(pluginManagerMock7).apply(SnykDependencyMonitoringGradlePlugin.class);
            doReturn(pluginManagerMock2, pluginManagerMock3, pluginManagerMock4, pluginManagerMock5, pluginManagerMock6, pluginManagerMock7, pluginManagerMock8).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock8).apply(HistoricalFeaturesMetadataPlugin.class);
            internalPrecommitTasks.when(() -> InternalPrecommitTasks.create(projectMock, true)).thenAnswer((Answer<Void>) invocation -> null);
            BuildPlugin target = spy(new BuildPlugin(buildLayoutMock, objectFactoryMock, providerFactoryMock, projectLayoutMock));
            doNothing().when(target).configureLicenseAndNotice(projectMock);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).getRootProject();
                verify(projectMock2).getPluginManager();
                verify(pluginManagerMock).apply(GlobalBuildInfoPlugin.class);
                verify(projectMock, times(7)).getPluginManager();
                verify(pluginManagerMock2).hasPlugin("elasticsearch.standalone-rest-test");
                verify(pluginManagerMock3).apply("elasticsearch.java");
                verify(pluginManagerMock4).apply("elasticsearch.publish");
                verify(pluginManagerMock5).apply(ElasticsearchJavadocPlugin.class);
                verify(pluginManagerMock6).apply(DependenciesInfoPlugin.class);
                verify(pluginManagerMock7).apply(SnykDependencyMonitoringGradlePlugin.class);
                verify(pluginManagerMock8).apply(HistoricalFeaturesMetadataPlugin.class);
                internalPrecommitTasks.verify(() -> InternalPrecommitTasks.create(projectMock, true), atLeast(1));
                verify(target).configureLicenseAndNotice(projectMock);
            });
        }
    }

    //Sapient generated method id: ${configureLicenseAndNoticeTest}, hash: 943280322DB61147B0B30309180B8701
    @Disabled()
    @Test()
    void configureLicenseAndNoticeTest() throws UnknownDomainObjectException, UnknownPropertyException {
        //Arrange Statement(s)
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        ExtraPropertiesExtension extraPropertiesExtensionMock = mock(ExtraPropertiesExtension.class);
        doReturn(extraPropertiesExtensionMock).when(extensionContainerMock).getByType(ExtraPropertiesExtension.class);
        RegularFileProperty regularFilePropertyMock = mock(RegularFileProperty.class);
        doNothing().when(extraPropertiesExtensionMock).set("licenseFile", regularFilePropertyMock);
        RegularFileProperty regularFilePropertyMock2 = mock(RegularFileProperty.class);
        Provider<RegularFile> providerMock = mock(Provider.class);
        doReturn(regularFilePropertyMock2).when(regularFilePropertyMock).convention(providerMock);
        RegularFileProperty regularFilePropertyMock3 = mock(RegularFileProperty.class);
        doNothing().when(extraPropertiesExtensionMock).set("noticeFile", regularFilePropertyMock3);
        RegularFileProperty regularFilePropertyMock4 = mock(RegularFileProperty.class);
        Provider<RegularFile> providerMock2 = mock(Provider.class);
        doReturn(regularFilePropertyMock4).when(regularFilePropertyMock3).convention(providerMock2);
        ExtensionContainer extensionContainerMock2 = mock(ExtensionContainer.class);
        doReturn(extensionContainerMock, extensionContainerMock2).when(projectMock).getExtensions();
        ExtraPropertiesExtension extraPropertiesExtensionMock2 = mock(ExtraPropertiesExtension.class);
        doReturn(extraPropertiesExtensionMock2).when(extensionContainerMock2).getByType(ExtraPropertiesExtension.class);
        RegularFileProperty regularFilePropertyMock5 = mock(RegularFileProperty.class);
        doReturn(regularFilePropertyMock5).when(extraPropertiesExtensionMock2).get("licenseFile");
        Provider<File> providerMock3 = mock(Provider.class);
        doReturn(providerMock3).when(regularFilePropertyMock5).getAsFile();
        File fileMock = mock(File.class);
        doReturn(fileMock).when(providerMock3).get();
        doReturn("return_of_getParent1").when(fileMock).getParent();
        doReturn("return_of_getName1").when(fileMock).getName();
        RegularFileProperty regularFilePropertyMock6 = mock(RegularFileProperty.class);
        doReturn(regularFilePropertyMock6).when(extraPropertiesExtensionMock2).get("noticeFile");
        Provider<File> providerMock4 = mock(Provider.class);
        doReturn(providerMock4).when(regularFilePropertyMock6).getAsFile();
        File fileMock2 = mock(File.class);
        doReturn(fileMock2).when(providerMock4).get();
        doReturn("return_of_getParent1").when(fileMock2).getParent();
        doReturn("return_of_getName1").when(fileMock2).getName();
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        doReturn(taskContainerMock).when(projectMock).getTasks();
        TaskCollection taskCollectionMock = mock(TaskCollection.class);
        doReturn(taskCollectionMock).when(taskContainerMock).withType(Jar.class);
        doNothing().when(taskCollectionMock).configureEach((Action) any());
        doReturn(regularFilePropertyMock, regularFilePropertyMock3).when(objectFactoryMock).fileProperty();
        Provider<File> providerMock5 = mock(Provider.class);
        Provider<File> providerMock6 = mock(Provider.class);
        doReturn(providerMock5, providerMock6).when(providerFactoryMock).provider((Callable) any());
        doReturn(providerMock).when(projectLayoutMock).file(providerMock5);
        doReturn(providerMock2).when(projectLayoutMock).file(providerMock6);
        File file = new File("pathname1");
        File file2 = new File("pathname1");
        File file3 = new File("pathname1");
        ScriptFileResolver scriptFileResolverMock = mock(ScriptFileResolver.class);
        BuildLayout buildLayout = new BuildLayout(file, file2, file3, scriptFileResolverMock);
        BuildPlugin target = new BuildPlugin(buildLayout, objectFactoryMock, providerFactoryMock, projectLayoutMock);
        //Act Statement(s)
        target.configureLicenseAndNotice(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock, times(2)).getExtensions();
            verify(extensionContainerMock).getByType(ExtraPropertiesExtension.class);
            verify(extraPropertiesExtensionMock).set("licenseFile", regularFilePropertyMock);
            verify(regularFilePropertyMock).convention(providerMock);
            verify(extraPropertiesExtensionMock).set("noticeFile", regularFilePropertyMock3);
            verify(regularFilePropertyMock3).convention(providerMock2);
            verify(extensionContainerMock2).getByType(ExtraPropertiesExtension.class);
            verify(extraPropertiesExtensionMock2).get("licenseFile");
            verify(regularFilePropertyMock5).getAsFile();
            verify(providerMock3).get();
            verify(fileMock).getParent();
            verify(fileMock).getName();
            verify(extraPropertiesExtensionMock2).get("noticeFile");
            verify(regularFilePropertyMock6).getAsFile();
            verify(providerMock4).get();
            verify(fileMock2).getParent();
            verify(fileMock2).getName();
            verify(projectMock).getTasks();
            verify(taskContainerMock).withType(Jar.class);
            verify(taskCollectionMock).configureEach((Action) any());
            verify(objectFactoryMock, times(2)).fileProperty();
            verify(providerFactoryMock, atLeast(2)).provider((Callable) any());
            verify(projectLayoutMock).file(providerMock5);
            verify(projectLayoutMock).file(providerMock6);
        });
    }
}

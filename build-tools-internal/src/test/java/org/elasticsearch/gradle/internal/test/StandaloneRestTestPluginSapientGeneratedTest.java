package org.elasticsearch.gradle.internal.test;

import org.junit.jupiter.api.Timeout;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.artifacts.UnknownConfigurationException;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.artifacts.ConfigurationContainer;
import java.util.List;
import org.gradle.api.artifacts.Configuration;
import org.elasticsearch.gradle.internal.test.rest.RestTestUtil;
import org.gradle.plugins.ide.idea.model.IdeaModule;
import java.util.HashSet;
import org.gradle.api.tasks.testing.Test;
import org.elasticsearch.gradle.internal.precommit.InternalPrecommitTasks;
import java.util.Map;
import java.util.HashMap;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.tasks.SourceSetContainer;
import org.elasticsearch.gradle.internal.ExportElasticsearchBuildResourcesTask;
import org.gradle.plugins.ide.idea.model.IdeaModel;
import java.util.ArrayList;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.tasks.SourceSetOutput;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.plugins.ide.eclipse.model.EclipseClasspath;
import org.gradle.plugins.ide.eclipse.model.EclipseModel;
import org.mockito.stubbing.Answer;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.gradle.api.file.SourceDirectorySet;
import org.gradle.api.file.FileCollection;
import java.util.Set;
import org.gradle.api.Project;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.tasks.TaskCollection;
import java.util.Collection;
import org.mockito.MockedStatic;
import org.elasticsearch.gradle.internal.info.GlobalBuildInfoPlugin;
import java.io.File;
import org.gradle.api.plugins.PluginManager;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.atLeast;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class StandaloneRestTestPluginSapientGeneratedTest {

    private final PluginManager pluginManagerMock = mock(PluginManager.class);

    private final Project projectMock = mock(Project.class);

    //Sapient generated method id: ${applyWhenProjectGetPluginManagerHasPluginElasticsearch_buildThrowsInvalidUserDataException}, hash: 8159ECCD67344EDA5A623F2CC4B86464
    @org.junit.jupiter.api.Test()
    void applyWhenProjectGetPluginManagerHasPluginElasticsearch_buildThrowsInvalidUserDataException() {
        /* Branches:
         * (project.getPluginManager().hasPlugin("elasticsearch.build")) : true
         */
        //Arrange Statement(s)
        doReturn(pluginManagerMock).when(projectMock).getPluginManager();
        doReturn(true).when(pluginManagerMock).hasPlugin("elasticsearch.build");
        StandaloneRestTestPlugin target = new StandaloneRestTestPlugin();
        InvalidUserDataException invalidUserDataException = new InvalidUserDataException("elasticsearch.standalone-test, elasticsearch.standalone-rest-test, and elasticsearch.build are mutually exclusive");
        //Act Statement(s)
        final InvalidUserDataException result = assertThrows(InvalidUserDataException.class, () -> {
            target.apply(projectMock);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(invalidUserDataException.getMessage()));
            verify(projectMock).getPluginManager();
            verify(pluginManagerMock).hasPlugin("elasticsearch.build");
        });
    }

    //Sapient generated method id: ${applyWhenProjectGetPluginManagerNotHasPluginElasticsearch_build}, hash: C94066401902B1C19A0434F033623EF1
    @Disabled()
    @org.junit.jupiter.api.Test()
    void applyWhenProjectGetPluginManagerNotHasPluginElasticsearch_build() throws InvalidUserDataException, UnknownConfigurationException, UnknownDomainObjectException {
        /* Branches:
         * (project.getPluginManager().hasPlugin("elasticsearch.build")) : false
         */
        //Arrange Statement(s)
        Project projectMock2 = mock(Project.class);
        PluginManager pluginManagerMock2 = mock(PluginManager.class);
        PluginManager pluginManagerMock3 = mock(PluginManager.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider taskProviderMock = mock(TaskProvider.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        SourceSet sourceSetMock = mock(SourceSet.class);
        SourceSetOutput sourceSetOutputMock = mock(SourceSetOutput.class);
        FileCollection fileCollectionMock = mock(FileCollection.class);
        FileCollection fileCollectionMock2 = mock(FileCollection.class);
        SourceDirectorySet sourceDirectorySetMock = mock(SourceDirectorySet.class);
        TaskContainer taskContainerMock2 = mock(TaskContainer.class);
        TaskCollection taskCollectionMock = mock(TaskCollection.class);
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        ExtensionContainer extensionContainerMock2 = mock(ExtensionContainer.class);
        EclipseModel eclipseModelMock = mock(EclipseModel.class);
        EclipseClasspath eclipseClasspathMock = mock(EclipseClasspath.class);
        Configuration configurationMock = mock(Configuration.class);
        ConfigurationContainer configurationContainerMock2 = mock(ConfigurationContainer.class);
        ExtensionContainer extensionContainerMock3 = mock(ExtensionContainer.class);
        IdeaModel ideaModelMock = mock(IdeaModel.class);
        IdeaModule ideaModuleMock = mock(IdeaModule.class);
        ConfigurableFileCollection configurableFileCollectionMock = mock(ConfigurableFileCollection.class);
        ConfigurableFileCollection configurableFileCollectionMock2 = mock(ConfigurableFileCollection.class);
        ConfigurationContainer configurationContainerMock3 = mock(ConfigurationContainer.class);
        Configuration configurationMock2 = mock(Configuration.class);
        try (MockedStatic<RestTestUtil> restTestUtil = mockStatic(RestTestUtil.class);
            MockedStatic<InternalPrecommitTasks> internalPrecommitTasks = mockStatic(InternalPrecommitTasks.class)) {
            doReturn(false).when(pluginManagerMock).hasPlugin("elasticsearch.build");
            doReturn(projectMock2).when(projectMock).getRootProject();
            doReturn(pluginManagerMock2).when(projectMock2).getPluginManager();
            doNothing().when(pluginManagerMock2).apply(GlobalBuildInfoPlugin.class);
            doReturn(pluginManagerMock, pluginManagerMock3).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock3).apply(LegacyRestTestBasePlugin.class);
            doReturn(taskProviderMock).when(taskContainerMock).register("buildResources", ExportElasticsearchBuildResourcesTask.class);
            doReturn(sourceSetContainerMock).when(extensionContainerMock).getByType(SourceSetContainer.class);
            doReturn(sourceSetMock).when(sourceSetContainerMock).create("test");
            doReturn(sourceSetOutputMock).when(sourceSetMock).getOutput();
            doReturn(fileCollectionMock).when(sourceSetOutputMock).getClassesDirs();
            doReturn(fileCollectionMock2).when(sourceSetMock).getRuntimeClasspath();
            doReturn(sourceDirectorySetMock).when(sourceSetMock).getJava();
            Set<File> fileSet = new HashSet<>();
            doReturn(fileSet).when(sourceDirectorySetMock).getSrcDirs();
            doReturn(taskContainerMock, taskContainerMock2).when(projectMock).getTasks();
            doReturn(taskCollectionMock).when(taskContainerMock2).withType(Test.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            Object object = new Object();
            doReturn(object).when(configurationContainerMock).create("compileOnly");
            doReturn(eclipseModelMock).when(extensionContainerMock2).getByType(EclipseModel.class);
            doReturn(eclipseClasspathMock).when(eclipseModelMock).getClasspath();
            List<SourceSet> sourceSetList = new ArrayList<>();
            sourceSetList.add(sourceSetMock);
            doNothing().when(eclipseClasspathMock).setSourceSets(sourceSetList);
            List<Configuration> configurationList = new ArrayList<>();
            configurationList.add(configurationMock);
            doNothing().when(eclipseClasspathMock).setPlusConfigurations(configurationList);
            doReturn(configurationMock).when(configurationContainerMock2).getByName("testRuntimeClasspath");
            doReturn(extensionContainerMock, extensionContainerMock2, extensionContainerMock3).when(projectMock).getExtensions();
            doReturn(ideaModelMock).when(extensionContainerMock3).getByType(IdeaModel.class);
            doReturn(ideaModuleMock).when(ideaModelMock).getModule();
            doReturn(configurableFileCollectionMock).when(ideaModuleMock).getTestSources();
            Object[] objectArray = new Object[] { fileSet };
            doReturn(configurableFileCollectionMock2).when(configurableFileCollectionMock).from(objectArray);
            Map<String, Map<String, Collection<Configuration>>> stringMapStringCollectionConfigurationMap = new HashMap<>();
            doReturn(stringMapStringCollectionConfigurationMap).when(ideaModuleMock).getScopes();
            doReturn(configurationContainerMock, configurationContainerMock2, configurationContainerMock3).when(projectMock).getConfigurations();
            doReturn(configurationMock2).when(configurationContainerMock3).getByName("testRuntimeClasspath");
            internalPrecommitTasks.when(() -> InternalPrecommitTasks.create(projectMock, false)).thenAnswer((Answer<Void>) invocation -> null);
            restTestUtil.when(() -> RestTestUtil.setupJavaRestTestDependenciesDefaults(projectMock, sourceSetMock)).thenAnswer((Answer<Void>) invocation -> null);
            StandaloneRestTestPlugin target = new StandaloneRestTestPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(2)).getPluginManager();
                verify(pluginManagerMock).hasPlugin("elasticsearch.build");
                verify(projectMock).getRootProject();
                verify(projectMock2).getPluginManager();
                verify(pluginManagerMock2).apply(GlobalBuildInfoPlugin.class);
                verify(pluginManagerMock3).apply(LegacyRestTestBasePlugin.class);
                verify(projectMock, times(2)).getTasks();
                verify(taskContainerMock).register("buildResources", ExportElasticsearchBuildResourcesTask.class);
                verify(projectMock, times(3)).getExtensions();
                verify(extensionContainerMock).getByType(SourceSetContainer.class);
                verify(sourceSetContainerMock).create("test");
                verify(sourceSetMock).getOutput();
                verify(sourceSetOutputMock).getClassesDirs();
                verify(sourceSetMock).getRuntimeClasspath();
                verify(sourceSetMock).getJava();
                verify(sourceDirectorySetMock).getSrcDirs();
                verify(taskContainerMock2).withType(Test.class);
                verify(taskCollectionMock).configureEach((Action) any());
                verify(projectMock, times(3)).getConfigurations();
                verify(configurationContainerMock).create("compileOnly");
                verify(extensionContainerMock2).getByType(EclipseModel.class);
                verify(eclipseModelMock, times(2)).getClasspath();
                verify(eclipseClasspathMock).setSourceSets(sourceSetList);
                verify(eclipseClasspathMock).setPlusConfigurations(configurationList);
                verify(configurationContainerMock2).getByName("testRuntimeClasspath");
                verify(extensionContainerMock3).getByType(IdeaModel.class);
                verify(ideaModelMock, times(2)).getModule();
                verify(ideaModuleMock).getTestSources();
                verify(configurableFileCollectionMock).from(objectArray);
                verify(ideaModuleMock).getScopes();
                verify(configurationContainerMock3).getByName("testRuntimeClasspath");
                internalPrecommitTasks.verify(() -> InternalPrecommitTasks.create(projectMock, false), atLeast(1));
                restTestUtil.verify(() -> RestTestUtil.setupJavaRestTestDependenciesDefaults(projectMock, sourceSetMock), atLeast(1));
            });
        }
    }
}

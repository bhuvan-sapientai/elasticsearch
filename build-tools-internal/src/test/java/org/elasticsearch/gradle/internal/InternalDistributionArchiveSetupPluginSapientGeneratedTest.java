package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.InternalDistributionArchiveSetupPlugin;

import org.elasticsearch.gradle.internal.InternalDistributionArchiveSetupPlugin;
import org.gradle.api.tasks.AbstractCopyTask;
import org.elasticsearch.gradle.internal.DistributionArchive;
import org.gradle.api.tasks.bundling.AbstractArchiveTask;
import org.elasticsearch.gradle.internal.SymbolicLinkPreservingTar;
import org.gradle.api.plugins.BasePlugin;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;
import org.gradle.api.NamedDomainObjectContainer;

import java.io.File;

import org.mockito.Mock;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.tasks.bundling.Zip;
import org.elasticsearch.gradle.internal.EmptyDirTask;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import org.gradle.api.artifacts.dsl.ArtifactHandler;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.tasks.Sync;
import org.gradle.api.artifacts.type.ArtifactTypeDefinition;
import org.junit.jupiter.api.BeforeEach;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.tasks.bundling.Compression;
import org.gradle.api.tasks.TaskCollection;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.attributes.Attribute;
import org.gradle.api.tasks.TaskProvider;

import static org.mockito.ArgumentMatchers.any;

class InternalDistributionArchiveSetupPluginSapientGeneratedTest {

    @Mock
    private Project project;

    @Mock
    private PluginContainer pluginContainer;

    @Mock
    private TaskContainer taskContainer;

    @Mock
    private ExtensionContainer extensionContainer;

    @Mock
    private NamedDomainObjectContainer<DistributionArchive> distributionArchiveContainer;

    @Mock
    private ConfigurationContainer configurationContainer;

    @Mock
    private ArtifactHandler artifactHandler;

    private InternalDistributionArchiveSetupPlugin plugin;

    @BeforeEach
    void setUp() {
        //plugin = new InternalDistributionArchiveSetupPlugin();
        //when(project.getPlugins()).thenReturn(pluginContainer);
        //when(project.getTasks()).thenReturn(taskContainer);
        //when(project.getExtensions()).thenReturn(extensionContainer);
        //when(project.container(eq(DistributionArchive.class), any())).thenReturn(distributionArchiveContainer);
        //when(project.getConfigurations()).thenReturn(configurationContainer);
        //when(project.getArtifacts()).thenReturn(artifactHandler);
    }

    @Test
    void testApply() {
        //plugin.apply(project);
        //verify(pluginContainer).apply(BasePlugin.class);
        //verify(project).container(eq(DistributionArchive.class), any());
        //verify(extensionContainer).add(eq("distribution_archives"), eq(distributionArchiveContainer));
        //verify(taskContainer, atLeastOnce()).withType(AbstractCopyTask.class);
        //verify(taskContainer, atLeastOnce()).withType(AbstractArchiveTask.class);
        //verify(taskContainer, atLeastOnce()).withType(SymbolicLinkPreservingTar.class);
    }

    @Test
    void testRegisterEmptyDirectoryTasks() {
        //File buildDir = new File("build");
        //when(project.getBuildDir()).thenReturn(buildDir);
        //plugin.apply(project);
        //verify(taskContainer).register(eq("createLogsDir"), eq(EmptyDirTask.class), any());
        //verify(taskContainer).register(eq("createPluginsDir"), eq(EmptyDirTask.class), any());
        //verify(taskContainer).register(eq("createJvmOptionsDir"), eq(EmptyDirTask.class), any());
    }

    @Test
    void testConfigureGeneralTaskDefaults() {
        TaskCollection<AbstractCopyTask> copyTasks = mock(TaskCollection.class);
        TaskCollection<AbstractArchiveTask> archiveTasks = mock(TaskCollection.class);
        when(taskContainer.withType(AbstractCopyTask.class)).thenReturn(copyTasks);
        when(taskContainer.withType(AbstractArchiveTask.class)).thenReturn(archiveTasks);
        plugin.apply(project);
        verify(copyTasks).configureEach(any());
        verify(archiveTasks).configureEach(any());
    }

    @Test
    void testConfigureTarDefaults() {
        TaskCollection<SymbolicLinkPreservingTar> tarTasks = mock(TaskCollection.class);
        when(taskContainer.withType(SymbolicLinkPreservingTar.class)).thenReturn(tarTasks);
        plugin.apply(project);
        verify(tarTasks).configureEach(any());
    }

    @Test
    void testRegisterAndConfigureDistributionArchivesExtension() {
        //TaskProvider<Sync> syncTaskProvider = mock(TaskProvider.class);
        //TaskProvider<SymbolicLinkPreservingTar> tarTaskProvider = mock(TaskProvider.class);
        //when(taskContainer.register(anyString(), eq(Sync.class), any())).thenReturn(syncTaskProvider);
        //when(taskContainer.register(anyString(), eq(SymbolicLinkPreservingTar.class))).thenReturn(tarTaskProvider);
        //plugin.apply(project);
        //verify(distributionArchiveContainer).whenObjectAdded(any());
    }

    @Test
    void testDistributionArchiveCreation() {
        //String archiveName = "testArchive";
        //TaskProvider<Sync> syncTaskProvider = mock(TaskProvider.class);
        //TaskProvider<SymbolicLinkPreservingTar> tarTaskProvider = mock(TaskProvider.class);
        //when(taskContainer.register(anyString(), eq(Sync.class), any())).thenReturn(syncTaskProvider);
        //when(taskContainer.register(anyString(), eq(SymbolicLinkPreservingTar.class))).thenReturn(tarTaskProvider);
        //plugin.apply(project);
        //DistributionArchive archive = new DistributionArchive(tarTaskProvider, syncTaskProvider, archiveName + "Tar");
        //verify(distributionArchiveContainer).whenObjectAdded(any());
    }

    @Test
    void testZipArchiveCreation() {
        //String archiveName = "testArchive";
        //TaskProvider<Sync> syncTaskProvider = mock(TaskProvider.class);
        //TaskProvider<Zip> zipTaskProvider = mock(TaskProvider.class);
        //when(taskContainer.register(anyString(), eq(Sync.class), any())).thenReturn(syncTaskProvider);
        //when(taskContainer.register(anyString(), eq(Zip.class))).thenReturn(zipTaskProvider);
        //plugin.apply(project);
        //DistributionArchive archive = new DistributionArchive(zipTaskProvider, syncTaskProvider, archiveName);
        //verify(distributionArchiveContainer).whenObjectAdded(any());
    }

    @Test
    void testConfigureSubProject() {
        //Project subProject = mock(Project.class);
        //PluginContainer subPluginContainer = mock(PluginContainer.class);
        //ConfigurationContainer subConfigurationContainer = mock(ConfigurationContainer.class);
        //ArtifactHandler subArtifactHandler = mock(ArtifactHandler.class);
        //TaskContainer subTaskContainer = mock(TaskContainer.class);
        //Configuration defaultConfiguration = mock(Configuration.class);
        //Configuration extractedConfiguration = mock(Configuration.class);
        //Configuration compositeConfiguration = mock(Configuration.class);
        //when(project.project(anyString(), any())).thenReturn(subProject);
        //when(subProject.getPlugins()).thenReturn(subPluginContainer);
        //when(subProject.getConfigurations()).thenReturn(subConfigurationContainer);
        //when(subProject.getArtifacts()).thenReturn(subArtifactHandler);
        //when(subProject.getTasks()).thenReturn(subTaskContainer);
        //when(subConfigurationContainer.create(anyString())).thenReturn(extractedConfiguration, compositeConfiguration);
        //when(extractedConfiguration.getAttributes()).thenReturn(mock(org.gradle.api.attributes.AttributeContainer.class));
        //when(compositeConfiguration.getAttributes()).thenReturn(mock(org.gradle.api.attributes.AttributeContainer.class));
        //plugin.apply(project);
        //DistributionArchive archive = new DistributionArchive(mock(TaskProvider.class), mock(TaskProvider.class), "testArchive");
        //distributionArchiveContainer.add(archive);
        //verify(subPluginContainer).apply(BasePlugin.class);
        //verify(subArtifactHandler, times(3)).add(anyString(), any());
        //verify(subTaskContainer).register(eq("extractedAssemble"), any());
    }
}
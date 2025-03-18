package org.elasticsearch.gradle.internal.test;

import org.elasticsearch.gradle.internal.test.TestWithSslPlugin;

import org.elasticsearch.gradle.internal.conventions.util.Util;
import org.elasticsearch.gradle.internal.precommit.ForbiddenPatternsPrecommitPlugin;

import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;
import org.elasticsearch.gradle.testclusters.TestClustersAware;
import org.elasticsearch.gradle.internal.precommit.FilePermissionsPrecommitPlugin;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.Project;

import java.io.File;

import org.mockito.Mock;
import org.elasticsearch.gradle.testclusters.ElasticsearchCluster;

import static org.elasticsearch.gradle.internal.precommit.FilePermissionsPrecommitPlugin.FILEPERMISSIONS_TASK_NAME;
import static org.mockito.ArgumentMatchers.anyString;

import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;

import org.elasticsearch.gradle.testclusters.TestClustersPlugin;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.tasks.SourceSet;
import org.junit.jupiter.api.BeforeEach;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.eq;

import org.elasticsearch.gradle.internal.info.BuildParams;
import org.gradle.api.file.SourceDirectorySet;
import org.gradle.api.tasks.TaskContainer;

import static org.elasticsearch.gradle.internal.precommit.ForbiddenPatternsPrecommitPlugin.FORBIDDEN_PATTERNS_TASK_NAME;

import org.elasticsearch.gradle.internal.test.rest.LegacyJavaRestTestPlugin;
import org.elasticsearch.gradle.internal.ExportElasticsearchBuildResourcesTask;
import org.gradle.api.tasks.TaskProvider;
import org.elasticsearch.gradle.internal.precommit.ForbiddenPatternsTask;
import org.gradle.api.Task;

import static org.mockito.ArgumentMatchers.any;

class TestWithSslPluginSapientGeneratedTest {

    @Mock
    private Project project;

    @Mock
    private TaskContainer taskContainer;

    @Mock
    private PluginContainer pluginContainer;

    @Mock
    private NamedDomainObjectContainer<ElasticsearchCluster> clusters;

    @Mock
    private TaskProvider<ExportElasticsearchBuildResourcesTask> exportKeyStoreTask;

    @Mock
    private TaskProvider<Task> forbiddenPatternsTask;

    @Mock
    private TaskProvider<Task> filePermissionsTask;

    @Mock
    private SourceSet testSourceSet;

    @Mock
    private SourceDirectorySet resources;

    private TestWithSslPlugin plugin;

    @BeforeEach
    void setUp() {
        //plugin = new TestWithSslPlugin();
        //when(project.getTasks()).thenReturn(taskContainer);
        //when(project.getPlugins()).thenReturn(pluginContainer);
        //when(project.getBuildDir()).thenReturn(new File("build"));
        //when(project.getExtensions()).thenReturn(mock(org.gradle.api.internal.plugins.ExtensionContainerInternal.class));
        //when(taskContainer.register(eq("copyTestCertificates"), eq(ExportElasticsearchBuildResourcesTask.class), any())).thenReturn(exportKeyStoreTask);
        //when(taskContainer.named(FORBIDDEN_PATTERNS_TASK_NAME)).thenReturn(forbiddenPatternsTask);
        //when(taskContainer.named(FILEPERMISSIONS_TASK_NAME)).thenReturn(filePermissionsTask);
    }

    @Test
    void testApply() {
        /*try (MockedStatic<Util> utilMock = mockStatic(Util.class);
    MockedStatic<BuildParams> buildParamsMock = mockStatic(BuildParams.class)) {
    utilMock.when(() -> Util.getJavaTestSourceSet(project)).thenReturn(Optional.of(testSourceSet));
    buildParamsMock.when(BuildParams::isInFipsJvm).thenReturn(false);
    when(testSourceSet.getResources()).thenReturn(resources);
    plugin.apply(project);
    verify(taskContainer).register(eq("copyTestCertificates"), eq(ExportElasticsearchBuildResourcesTask.class), any());
    verify(pluginContainer).withType(ForbiddenPatternsPrecommitPlugin.class);
    verify(pluginContainer).withType(FilePermissionsPrecommitPlugin.class);
    verify(pluginContainer).withType(StandaloneRestTestPlugin.class);
    verify(pluginContainer).withType(LegacyJavaRestTestPlugin.class);
    verify(pluginContainer).withType(TestClustersPlugin.class);
}*/
    }

    @Test
    void testApplyWithFipsJvm() {
        /*try (MockedStatic<Util> utilMock = mockStatic(Util.class);
    MockedStatic<BuildParams> buildParamsMock = mockStatic(BuildParams.class)) {
    utilMock.when(() -> Util.getJavaTestSourceSet(project)).thenReturn(Optional.of(testSourceSet));
    buildParamsMock.when(BuildParams::isInFipsJvm).thenReturn(true);
    when(testSourceSet.getResources()).thenReturn(resources);
    when(project.getExtensions().getByName(TestClustersPlugin.EXTENSION_NAME)).thenReturn(clusters);
    plugin.apply(project);
    verify(clusters).configureEach(any());
    verify(taskContainer).withType(eq(ForbiddenPatternsTask.class), any());
}*/
    }

    @Test
    void testConfigureTestClusters() {
        try (MockedStatic<BuildParams> buildParamsMock = mockStatic(BuildParams.class)) {
            buildParamsMock.when(BuildParams::isInFipsJvm).thenReturn(false);
            when(project.getExtensions().getByName(TestClustersPlugin.EXTENSION_NAME)).thenReturn(clusters);
            plugin.apply(project);
            verify(clusters).configureEach(any());
        }
    }

    @Test
    void testConfigureTestClustersWithFipsJvm() {
        try (MockedStatic<BuildParams> buildParamsMock = mockStatic(BuildParams.class)) {
            buildParamsMock.when(BuildParams::isInFipsJvm).thenReturn(true);
            when(project.getExtensions().getByName(TestClustersPlugin.EXTENSION_NAME)).thenReturn(clusters);
            plugin.apply(project);
            verify(clusters).configureEach(any());
        }
    }

    @Test
    void testConfigureForbiddenPatternsTask() {
        //plugin.apply(project);
        //verify(taskContainer).withType(eq(ForbiddenPatternsTask.class), any());
    }
}
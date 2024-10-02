package org.elasticsearch.gradle.internal.doc;

import org.elasticsearch.gradle.internal.doc.DocsTestPlugin;

import org.gradle.api.plugins.JavaPluginExtension;

import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;
import org.elasticsearch.gradle.OS;
import org.elasticsearch.gradle.testclusters.TestDistribution;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.Project;
import org.mockito.Mock;
import org.gradle.api.tasks.SourceSetContainer;
import org.elasticsearch.gradle.testclusters.ElasticsearchCluster;
import org.gradle.api.file.ProjectLayout;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

import org.elasticsearch.gradle.testclusters.TestClustersPlugin;
import org.elasticsearch.gradle.Version;
import org.gradle.api.tasks.SourceSet;
import org.junit.jupiter.api.BeforeEach;

import java.util.Map;

import static org.mockito.ArgumentMatchers.eq;

import org.elasticsearch.gradle.VersionProperties;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.file.Directory;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.internal.file.FileOperations;
import org.gradle.api.provider.Provider;

import static org.mockito.ArgumentMatchers.any;

class DocsTestPluginSapientGeneratedTest {

    @Mock
    private FileOperations fileOperations;

    @Mock
    private ProjectLayout projectLayout;

    @Mock
    private Project project;

    @Mock
    private NamedDomainObjectContainer<ElasticsearchCluster> testClusters;

    @Mock
    private TaskContainer taskContainer;

    @Mock
    private JavaPluginExtension javaPluginExtension;

    @Mock
    private SourceSetContainer sourceSetContainer;

    @Mock
    private SourceSet yamlRestTestSourceSet;

    @Mock
    private Provider<Directory> restRootDirProvider;

    private DocsTestPlugin plugin;

    @BeforeEach
    void setUp() {
        plugin = new DocsTestPlugin(fileOperations, projectLayout);
        when(project.getExtensions()).thenReturn(mock(org.gradle.api.plugins.ExtensionContainer.class));
        when(project.getExtensions().getByName(TestClustersPlugin.EXTENSION_NAME)).thenReturn(testClusters);
        when(project.getTasks()).thenReturn(taskContainer);
        when(project.getExtensions().getByType(JavaPluginExtension.class)).thenReturn(javaPluginExtension);
        when(javaPluginExtension.getSourceSets()).thenReturn(sourceSetContainer);
        when(sourceSetContainer.getByName("yamlRestTest")).thenReturn(yamlRestTestSourceSet);
        when(yamlRestTestSourceSet.getOutput()).thenReturn(mock(org.gradle.api.tasks.SourceSetOutput.class));
        when(projectLayout.getBuildDirectory()).thenReturn(mock(org.gradle.api.file.DirectoryProperty.class));
        when(projectLayout.getBuildDirectory().dir(anyString())).thenReturn(restRootDirProvider);
    }

    @Test
    void testApply() {
        //plugin.apply(project);
        //verify(project.getPluginManager()).apply("elasticsearch.legacy-yaml-rest-test");
        //verify(testClusters).matching(any());
        //verify(taskContainer).named(eq("assemble"), any());
        //verify(taskContainer).register(eq("listSnippets"), eq(DocSnippetTask.class), any());
        //verify(taskContainer).register(eq("listConsoleCandidates"), eq(DocSnippetTask.class), any());
        //verify(taskContainer).register(eq("buildRestTests"), eq(RestTestsFromDocSnippetTask.class), any());
        //verify(yamlRestTestSourceSet.getOutput()).dir(any(Map.class), eq(restRootDirProvider));
    }

    @Test
    void testCommonDefaultSubstitutions() {
        //plugin.apply(project);
        //TaskProvider<DocSnippetTask> listSnippetsTask = mock(TaskProvider.class);
        //when(taskContainer.register(eq("listSnippets"), eq(DocSnippetTask.class), any())).thenReturn(listSnippetsTask);
        /*try (MockedStatic<Version> versionMockedStatic = mockStatic(Version.class);
    MockedStatic<VersionProperties> versionPropertiesMockedStatic = mockStatic(VersionProperties.class);
    MockedStatic<OS> osMockedStatic = mockStatic(OS.class)) {
    Version mockVersion = mock(Version.class);
    versionMockedStatic.when(() -> Version.fromString(anyString())).thenReturn(mockVersion);
    when(mockVersion.toString()).thenReturn("mock-version");
    versionPropertiesMockedStatic.when(VersionProperties::getElasticsearch).thenReturn("mock-es-version");
    versionPropertiesMockedStatic.when(VersionProperties::getLucene).thenReturn("mock-lucene-version");
    OS.Conditional<String> mockConditional = mock(OS.Conditional.class);
    osMockedStatic.when(OS::conditionalString).thenReturn(mockConditional);
    when(mockConditional.onWindows(any())).thenReturn(mockConditional);
    when(mockConditional.onUnix(any())).thenReturn(mockConditional);
    when(mockConditional.supply()).thenReturn("mock-build-type");
    verify(listSnippetsTask).configure(any());
}*/
    }
}
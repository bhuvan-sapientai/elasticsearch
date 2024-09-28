package org.elasticsearch.gradle.testclusters;

import org.elasticsearch.gradle.testclusters.ElasticsearchCluster;
import java.util.Collection;
import java.nio.file.Files;
import org.gradle.api.tasks.Internal;
import java.io.UncheckedIOException;
import org.gradle.api.tasks.Nested;
import org.gradle.api.NamedDomainObjectContainer;
import java.util.function.Supplier;
import static org.elasticsearch.gradle.testclusters.TestClustersPlugin.BUNDLE_ATTRIBUTE;
import java.util.concurrent.atomic.AtomicBoolean;
import static org.mockito.Mockito.*;
import java.util.HashMap;
import org.gradle.api.tasks.PathSensitivity;
import java.io.IOException;
import org.gradle.api.tasks.Sync;
import org.elasticsearch.gradle.Version;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import org.gradle.api.file.ArchiveOperations;
import org.junit.jupiter.params.ParameterizedTest;
import org.gradle.api.Named;
import java.util.Objects;
import org.gradle.api.file.RegularFile;
import java.security.GeneralSecurityException;
import java.util.function.Predicate;
import org.gradle.api.logging.Logging;
import java.util.stream.Collectors;
import java.util.concurrent.TimeUnit;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.internal.file.FileOperations;
import org.gradle.api.provider.Provider;
import org.gradle.api.tasks.PathSensitive;
import org.gradle.api.tasks.bundling.AbstractArchiveTask;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;
import java.io.File;
import org.mockito.Mock;
import org.gradle.process.ExecOperations;
import java.util.LinkedHashMap;
import org.elasticsearch.gradle.ReaperService;
import org.gradle.api.tasks.bundling.Zip;
import org.junit.jupiter.params.provider.CsvSource;
import org.elasticsearch.gradle.FileSupplier;
import org.gradle.api.artifacts.Dependency;
import java.util.List;
import org.gradle.api.artifacts.type.ArtifactTypeDefinition;
import org.gradle.api.artifacts.Configuration;
import org.elasticsearch.gradle.PropertyNormalization;
import org.gradle.api.logging.Logger;
import org.gradle.api.tasks.Classpath;
import org.gradle.api.tasks.InputFiles;
import static org.elasticsearch.gradle.plugin.BasePluginBuildPlugin.EXPLODED_BUNDLE_CONFIG;
import java.util.function.Function;
import java.nio.charset.StandardCharsets;
import org.gradle.api.file.FileSystemOperations;
import static org.junit.jupiter.api.Assertions.*;
import org.gradle.api.file.ConfigurableFileCollection;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

class ElasticsearchClusterSapientGeneratedTest {

    @Mock
    private Project project;

    @Mock
    private Provider<ReaperService> reaper;

    @Mock
    private FileOperations fileOperations;

    @Mock
    private NamedDomainObjectContainer<ElasticsearchNode> nodes;

    @Mock
    private ConfigurableFileCollection pluginAndModuleConfiguration;

    @Mock
    private ElasticsearchNode firstNode;

    @Mock
    private ElasticsearchNode lastNode;

    private ElasticsearchCluster cluster;

    @BeforeEach
    void setUp() {
        when(project.getObjects()).thenReturn(mock(org.gradle.api.model.ObjectFactory.class));
        when(project.getObjects().fileCollection()).thenReturn(pluginAndModuleConfiguration);
        when(project.container(ElasticsearchNode.class)).thenReturn(nodes);
        cluster = new ElasticsearchCluster("testPath", "testCluster", project, reaper, mock(org.gradle.api.file.FileSystemOperations.class), mock(org.gradle.api.file.ArchiveOperations.class), mock(org.gradle.process.ExecOperations.class), fileOperations, new File("testDir"), mock(Provider.class), version -> true);
    }

    @Disabled()
    @Test
    void testSetNumberOfNodes() {
        when(nodes.size()).thenReturn(1);
        cluster.setNumberOfNodes(3);
        verify(nodes, times(2)).add(any());
    }

    @Disabled()
    @Test
    void testSetNumberOfNodesThrowsExceptionForInvalidNumber() {
        assertThrows(IllegalArgumentException.class, () -> cluster.setNumberOfNodes(0));
    }

    @Disabled()
    @Test
    void testSetNumberOfNodesThrowsExceptionWhenShrinking() {
        when(nodes.size()).thenReturn(3);
        assertThrows(IllegalArgumentException.class, () -> cluster.setNumberOfNodes(2));
    }

    @Test
    void testPlugin() {
        //Provider<RegularFile> plugin = mock(Provider.class);
        //cluster.plugin(plugin);
        //verify(nodes).all(any());
    }

    @Test
    void testModule() {
        //Provider<RegularFile> module = mock(Provider.class);
        //cluster.module(module);
        //verify(nodes).all(any());
    }

    @ParameterizedTest
    @CsvSource({ "key,value", "test.key,test.value" })
    void testSetting(String key, String value) {
        //cluster.setting(key, value);
        //verify(nodes).all(any());
    }

    @Test
    void testSystemProperty() {
        //cluster.systemProperty("key", "value");
        //verify(nodes).all(any());
    }

    @Test
    void testEnvironment() {
        //cluster.environment("key", "value");
        //verify(nodes).all(any());
    }

    @Test
    void testJvmArgs() {
        //cluster.jvmArgs("-Xms2g", "-Xmx2g");
        //verify(nodes).all(any());
    }

    @Test
    void testSetPreserveDataDir() {
        //cluster.setPreserveDataDir(true);
        //verify(nodes).all(any());
    }

    @Disabled()
    @Test
    void testStart() {
        when(nodes.iterator()).thenReturn(List.of(firstNode).iterator());
        cluster.start();
        verify(firstNode).start();
    }

    @Disabled()
    @Test
    void testRestart() {
        when(nodes.iterator()).thenReturn(List.of(firstNode).iterator());
        cluster.restart();
        verify(firstNode).restart();
    }

    @Disabled()
    @Test
    void testStop() {
        when(nodes.iterator()).thenReturn(List.of(firstNode).iterator());
        cluster.stop(true);
        verify(firstNode).stop(true);
    }

    @Test
    void testExtraConfigFile() {
        //File configFile = new File("config.yml");
        //cluster.extraConfigFile("destination", configFile);
        //verify(nodes).all(any());
    }

    @Test
    void testUser() {
        //Map<String, String> userSpec = new HashMap<>();
        //userSpec.put("username", "testuser");
        //userSpec.put("password", "testpass");
        //cluster.user(userSpec);
        //verify(nodes).all(any());
    }

    @Test
    void testRolesFile() {
        //File rolesFile = new File("roles.yml");
        //cluster.rolesFile(rolesFile);
        //verify(nodes).all(any());
    }

    @Test
    void testRequiresFeature() {
        //cluster.requiresFeature("test_feature", Version.fromString("7.0.0"));
        //verify(nodes).all(any());
    }

    @Test
    void testSetNameCustomization() {
        //Function<String, String> customizer = name -> "custom_" + name;
        //cluster.setNameCustomization(customizer);
        //verify(nodes).all(any());
    }

    @Disabled()
    @Test
    void testIsProcessAlive() {
        when(nodes.stream()).thenReturn(List.of(firstNode, lastNode).stream());
        when(firstNode.isProcessAlive()).thenReturn(true);
        when(lastNode.isProcessAlive()).thenReturn(true);
        assertTrue(cluster.isProcessAlive());
    }

    @Disabled()
    @Test
    void testSingleNode() {
        when(nodes.size()).thenReturn(1);
        when(nodes.iterator()).thenReturn(List.of(firstNode).iterator());
        assertEquals(firstNode, cluster.singleNode());
    }

    @Disabled()
    @Test
    void testSingleNodeThrowsExceptionForMultipleNodes() {
        when(nodes.size()).thenReturn(2);
        assertThrows(IllegalStateException.class, () -> cluster.singleNode());
    }
}

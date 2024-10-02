package org.elasticsearch.gradle.testclusters;

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
import org.junit.jupiter.api.Timeout;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.Transformer;
import org.gradle.api.attributes.AttributeContainer;
import org.gradle.api.attributes.Attribute;
import org.gradle.api.specs.Spec;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;
import org.gradle.api.model.ObjectFactory;
import java.nio.file.Path;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import java.nio.file.OpenOption;
import java.util.function.Consumer;
import org.gradle.api.Action;
import java.util.Set;
import org.gradle.api.file.ProjectLayout;
import org.mockito.MockedStatic;
import org.gradle.api.file.FileTree;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

@Timeout(value = 5)
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

    private final NamedDomainObjectContainer<ElasticsearchNode> nodesMock = mock(NamedDomainObjectContainer.class, "nodes");

    private final ConfigurableFileCollection pluginAndModuleConfigurationMock = mock(ConfigurableFileCollection.class, "pluginAndModuleConfiguration");

    private final Project projectMock = mock(Project.class, "project");

    private final ArchiveOperations archiveOperationsMock = mock(ArchiveOperations.class);

    private final AttributeContainer attributeContainerMock = mock(AttributeContainer.class);

    private final AttributeContainer attributeContainerMock2 = mock(AttributeContainer.class);

    private final AttributeContainer attributeContainerMock3 = mock(AttributeContainer.class);

    private final AttributeContainer attributeContainerMock4 = mock(AttributeContainer.class);

    private final ConfigurableFileCollection configurableFileCollectionMock = mock(ConfigurableFileCollection.class);

    private final ConfigurableFileCollection configurableFileCollectionMock2 = mock(ConfigurableFileCollection.class);

    private final ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);

    private final Configuration configurationMock = mock(Configuration.class);

    private final DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);

    private final Dependency dependencyMock = mock(Dependency.class);

    private final ElasticsearchNode elasticsearchNodeMock = mock(ElasticsearchNode.class);

    private final ElasticsearchNode elasticsearchNodeMock2 = mock(ElasticsearchNode.class);

    private final ExecOperations execOperationsMock = mock(ExecOperations.class);

    private final FileCollection fileCollectionMock = mock(FileCollection.class);

    private final FileOperations fileOperationsMock = mock(FileOperations.class);

    private final FileSystemOperations fileSystemOperationsMock = mock(FileSystemOperations.class);

    private final FileTree fileTreeMock = mock(FileTree.class);

    private final Function<Version, Boolean> functionMock = mock(Function.class);

    private final ObjectFactory objectFactoryMock = mock(ObjectFactory.class);

    private final Path pathMock = mock(Path.class);

    private final Path pathMock2 = mock(Path.class);

    private final Provider<ReaperService> providerMock = mock(Provider.class);

    private final Provider<File> providerMock2 = mock(Provider.class);

    private final Provider<File> providerMock3 = mock(Provider.class);

    private final Supplier<CharSequence> supplierMock = mock(Supplier.class);

    private final Version versionMock = mock(Version.class);

    private final Version versionMock2 = mock(Version.class);

    private final Version versionMock3 = mock(Version.class);

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

    //Sapient generated method id: ${getInstalledClasspathWhenPluginAndModuleConfigurationGetAsFileTreeFilterFGetNameEndsWith_jar}, hash: 8D87449BD9E4058A407FD99C85B83B1C
    @Test()
    void getInstalledClasspathWhenPluginAndModuleConfigurationGetAsFileTreeFilterFGetNameEndsWith_jar() {
        /* Branches:
         * (pluginAndModuleConfiguration.getAsFileTree().filter(f -> f.getName().endsWith(".jar"))) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doReturn(fileTreeMock).when(pluginAndModuleConfigurationMock).getAsFileTree();
        doReturn(fileCollectionMock).when(fileTreeMock).filter((Spec) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "BC", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        FileCollection result = target.getInstalledClasspath();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(fileCollectionMock));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(pluginAndModuleConfigurationMock).getAsFileTree();
            verify(fileTreeMock).filter((Spec) any());
        });
    }

    //Sapient generated method id: ${getInstalledClasspathWhenPluginAndModuleConfigurationGetAsFileTreeNotFilterFGetNameEndsWith_jar}, hash: A9CC8C5D0B4742DAE11981E4AE28DC46
    @Test()
    void getInstalledClasspathWhenPluginAndModuleConfigurationGetAsFileTreeNotFilterFGetNameEndsWith_jar() {
        /* Branches:
         * (pluginAndModuleConfiguration.getAsFileTree().filter(f -> f.getName().endsWith(".jar"))) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doReturn(fileTreeMock).when(pluginAndModuleConfigurationMock).getAsFileTree();
        doReturn(fileCollectionMock).when(fileTreeMock).filter((Spec) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "E", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        FileCollection result = target.getInstalledClasspath();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(fileCollectionMock));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(pluginAndModuleConfigurationMock).getAsFileTree();
            verify(fileTreeMock).filter((Spec) any());
        });
    }

    //Sapient generated method id: ${getInstalledFilesWhenFGetNameEndsWith_jarEqualsFalse}, hash: 1F2BB7F1F054B29739213ECE59A0127B
    @Test()
    void getInstalledFilesWhenFGetNameEndsWith_jarEqualsFalse() {
        /* Branches:
         * (f.getName().endsWith(".jar") == false) : true  #  inside lambda$getInstalledFiles$1 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doReturn(fileTreeMock).when(pluginAndModuleConfigurationMock).getAsFileTree();
        doReturn(fileCollectionMock).when(fileTreeMock).filter((Spec) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "E", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        FileCollection result = target.getInstalledFiles();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(fileCollectionMock));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(pluginAndModuleConfigurationMock).getAsFileTree();
            verify(fileTreeMock).filter((Spec) any());
        });
    }

    //Sapient generated method id: ${getInstalledFilesWhenFGetNameEndsWith_jarNotEqualsFalse}, hash: 73F238D434AF96D8DC1999C51EAAAEC9
    @Test()
    void getInstalledFilesWhenFGetNameEndsWith_jarNotEqualsFalse() {
        /* Branches:
         * (f.getName().endsWith(".jar") == false) : false  #  inside lambda$getInstalledFiles$1 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doReturn(fileTreeMock).when(pluginAndModuleConfigurationMock).getAsFileTree();
        doReturn(fileCollectionMock).when(fileTreeMock).filter((Spec) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "BC", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        FileCollection result = target.getInstalledFiles();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(fileCollectionMock));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(pluginAndModuleConfigurationMock).getAsFileTree();
            verify(fileTreeMock).filter((Spec) any());
        });
    }

    //Sapient generated method id: ${setNumberOfNodesWhenNumberOfNodesLessThan1ThrowsIllegalArgumentException}, hash: 08482A3782E069BBE2DDE2DDD79C5C1D
    @Test()
    void setNumberOfNodesWhenNumberOfNodesLessThan1ThrowsIllegalArgumentException() {
        /* Branches:
         * (configurationFrozen.get()) : false  #  inside checkFrozen method
         * (numberOfNodes < 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Number of nodes should be >= 1 but was 0 for null");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            target.setNumberOfNodes(0);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
        });
    }

    //Sapient generated method id: ${setNumberOfNodesWhenNumberOfNodesLessThanNodesSizeThrowsIllegalArgumentException}, hash: 05D772D5FD3866B4F708D084970BCA06
    @Test()
    void setNumberOfNodesWhenNumberOfNodesLessThanNodesSizeThrowsIllegalArgumentException() {
        /* Branches:
         * (configurationFrozen.get()) : false  #  inside checkFrozen method
         * (numberOfNodes < 1) : false
         * (numberOfNodes < nodes.size()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doReturn(3, 2).when(nodesMock).size();
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Cannot shrink null to have 2 nodes as it already has 2");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            target.setNumberOfNodes(2);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock, times(2)).size();
        });
    }

    //Sapient generated method id: ${setNumberOfNodesWhenILessThanNumberOfNodes}, hash: DCBD2E713FCAF8A621B0FB2872088CE4
    @Test()
    void setNumberOfNodesWhenILessThanNumberOfNodes() {
        /* Branches:
         * (configurationFrozen.get()) : false  #  inside checkFrozen method
         * (numberOfNodes < 1) : false
         * (numberOfNodes < nodes.size()) : false
         * (i < numberOfNodes) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doReturn(1, 2).when(nodesMock).size();
        File file = new File("pathname1");
        ElasticsearchCluster target = spy(new ElasticsearchCluster("path1", "", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock));
        doReturn("return_of_safeName1").when(target).safeName("");
        
        //Act Statement(s)
        target.setNumberOfNodes(3);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock, atLeast(2)).add((ElasticsearchNode) any());
            verify(nodesMock, times(2)).size();
            verify(target).safeName("");
        });
    }

    //Sapient generated method id: ${setReadinessEnabledWhenNodesIsNotEmpty}, hash: 340BB914FAC0E3633C018E2FCB1FF343
    @Test()
    void setReadinessEnabledWhenNodesIsNotEmpty() {
        /* Branches:
         * (enabled) : true
         * (for-each(nodes)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        List<ElasticsearchNode> elasticsearchNodeList = new ArrayList<>();
        elasticsearchNodeList.add(elasticsearchNodeMock);
        Iterator<ElasticsearchNode> iterator = elasticsearchNodeList.iterator();
        doReturn(iterator).when(nodesMock).iterator();
        doNothing().when(elasticsearchNodeMock).setting("readiness.port", "0");
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        target.setReadinessEnabled(true);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).iterator();
            verify(elasticsearchNodeMock).setting("readiness.port", "0");
        });
    }

    //Sapient generated method id: ${getFirstNodeTest}, hash: 20330FF29662DDFF857F5F4AFB200224
    @Test()
    void getFirstNodeTest() throws UnknownDomainObjectException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doReturn(elasticsearchNodeMock).when(nodesMock).getAt("A-0");
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        ElasticsearchNode result = target.getFirstNode();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(elasticsearchNodeMock));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).getAt("A-0");
        });
    }

    //Sapient generated method id: ${getLastNodeTest}, hash: 606B90BAB6A433F825B23546509B23EB
    @Test()
    void getLastNodeTest() throws UnknownDomainObjectException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doReturn(3).when(nodesMock).size();
        doReturn(elasticsearchNodeMock).when(nodesMock).getAt("A-2");
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        ElasticsearchNode result = target.getLastNode();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(elasticsearchNodeMock));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).size();
            verify(nodesMock).getAt("A-2");
        });
    }

    //Sapient generated method id: ${getNumberOfNodesTest}, hash: CB0DECA645344FF5D1063DF65FD09592
    @Test()
    void getNumberOfNodesTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doReturn(0).when(nodesMock).size();
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        int result = target.getNumberOfNodes();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).size();
        });
    }

    //Sapient generated method id: ${setVersionTest}, hash: 4AE74ED5C32B7F95F51E03B29694D8A3
    @Test()
    void setVersionTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        target.setVersion("version1");
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${setVersionsTest}, hash: 8B7A959B21A46B604A14A83ABA4255A4
    @Test()
    void setVersionsTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        List<String> stringList = new ArrayList<>();
        
        //Act Statement(s)
        target.setVersions(stringList);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${setTestDistributionTest}, hash: 14C3902B86A7027456FC36AFB226E2AA
    @Test()
    void setTestDistributionTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        target.setTestDistribution(TestDistribution.INTEG_TEST);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${pluginThrowsIllegalStateException}, hash: 4C13E41A11AADF0CEDEC9BE61EBC12D2
    @Test()
    void pluginThrowsIllegalStateException() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        IllegalStateException illegalStateException = new IllegalStateException("zip configuration of project B had no files");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.plugin("B");
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
        });
    }

    //Sapient generated method id: ${plugin1Test}, hash: 026DFAB7A58E29A57E6AA02A84F4384F
    @Test()
    void plugin1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        TaskProvider<Zip> pluginMock = mock(TaskProvider.class);
        Provider providerMock = mock(Provider.class);
        doReturn(providerMock).when(pluginMock).flatMap((Transformer) any());
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        Provider<ReaperService> providerMock2 = mock(Provider.class);
        File file = new File("pathname1");
        ElasticsearchCluster target = spy(new ElasticsearchCluster("path1", "A", projectMock, providerMock2, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock3, functionMock));
        doNothing().when(target).plugin(providerMock);
        
        //Act Statement(s)
        target.plugin(pluginMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(pluginMock).flatMap((Transformer) any());
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(target).plugin(providerMock);
        });
    }

    //Sapient generated method id: ${plugin2Test}, hash: 850D7A794B9904B5DFD5546EADC40F46
    @Test()
    void plugin2Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(dependencyHandlerMock).when(projectMock).getDependencies();
        doReturn(dependencyMock).when(dependencyHandlerMock).create(configurableFileCollectionMock);
        Provider<RegularFile> providerMock = mock(Provider.class);
        Object[] objectArray = new Object[] { providerMock };
        doReturn(configurableFileCollectionMock).when(projectMock).files(objectArray);
        doReturn(configurationContainerMock).when(projectMock).getConfigurations();
        Dependency[] dependencyArray = new Dependency[] { dependencyMock };
        doReturn(configurationMock).when(configurationContainerMock).detachedConfiguration(dependencyArray);
        Attribute attribute = ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE;
        doReturn(attributeContainerMock2).when(attributeContainerMock).attribute(attribute, "directory");
        doReturn(attributeContainerMock, attributeContainerMock3).when(configurationMock).getAttributes();
        Attribute attribute2 = TestClustersPlugin.BUNDLE_ATTRIBUTE;
        doReturn(attributeContainerMock4).when(attributeContainerMock3).attribute(attribute2, true);
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        Object[] objectArray2 = new Object[] { configurationMock };
        doReturn(configurableFileCollectionMock2).when(pluginAndModuleConfigurationMock).from(objectArray2);
        Provider<ReaperService> providerMock2 = mock(Provider.class);
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock2, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock3, functionMock);
        
        //Act Statement(s)
        target.plugin(providerMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(projectMock).getDependencies();
            verify(dependencyHandlerMock).create(configurableFileCollectionMock);
            verify(projectMock).files(objectArray);
            verify(projectMock).getConfigurations();
            verify(configurationContainerMock).detachedConfiguration(dependencyArray);
            verify(configurationMock, times(2)).getAttributes();
            verify(attributeContainerMock).attribute(attribute, "directory");
            verify(attributeContainerMock3).attribute(attribute2, true);
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
            verify(pluginAndModuleConfigurationMock).from(objectArray2);
        });
    }

    //Sapient generated method id: ${moduleTest}, hash: 38A766AB822FDEB9DA3BA404BCF1A3D5
    @Test()
    void moduleTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(dependencyHandlerMock).when(projectMock).getDependencies();
        doReturn(dependencyMock).when(dependencyHandlerMock).create(configurableFileCollectionMock);
        Provider<RegularFile> providerMock = mock(Provider.class);
        Object[] objectArray = new Object[] { providerMock };
        doReturn(configurableFileCollectionMock).when(projectMock).files(objectArray);
        doReturn(configurationContainerMock).when(projectMock).getConfigurations();
        Dependency[] dependencyArray = new Dependency[] { dependencyMock };
        doReturn(configurationMock).when(configurationContainerMock).detachedConfiguration(dependencyArray);
        Attribute attribute = ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE;
        doReturn(attributeContainerMock2).when(attributeContainerMock).attribute(attribute, "directory");
        doReturn(attributeContainerMock, attributeContainerMock3).when(configurationMock).getAttributes();
        Attribute attribute2 = TestClustersPlugin.BUNDLE_ATTRIBUTE;
        doReturn(attributeContainerMock4).when(attributeContainerMock3).attribute(attribute2, true);
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        Object[] objectArray2 = new Object[] { configurationMock };
        doReturn(configurableFileCollectionMock2).when(pluginAndModuleConfigurationMock).from(objectArray2);
        Provider<ReaperService> providerMock2 = mock(Provider.class);
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock2, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock3, functionMock);
        
        //Act Statement(s)
        target.module(providerMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(projectMock).getDependencies();
            verify(dependencyHandlerMock).create(configurableFileCollectionMock);
            verify(projectMock).files(objectArray);
            verify(projectMock).getConfigurations();
            verify(configurationContainerMock).detachedConfiguration(dependencyArray);
            verify(configurationMock, times(2)).getAttributes();
            verify(attributeContainerMock).attribute(attribute, "directory");
            verify(attributeContainerMock3).attribute(attribute2, true);
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
            verify(pluginAndModuleConfigurationMock).from(objectArray2);
        });
    }

    //Sapient generated method id: ${module1Test}, hash: 3DC092A4A13350F5B0CC2FE935BE958F
    @Test()
    void module1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        TaskProvider<Sync> moduleMock = mock(TaskProvider.class);
        Provider<File> providerMock = mock(Provider.class);
        doReturn(providerMock).when(moduleMock).map((Transformer) any());
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        doReturn(projectLayoutMock).when(projectMock).getLayout();
        Provider<RegularFile> providerMock2 = mock(Provider.class);
        doReturn(providerMock2).when(projectLayoutMock).file(providerMock);
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        Provider<ReaperService> providerMock3 = mock(Provider.class);
        File file = new File("pathname1");
        Provider<File> providerMock4 = mock(Provider.class);
        ElasticsearchCluster target = spy(new ElasticsearchCluster("path1", "A", projectMock, providerMock3, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock4, functionMock));
        doNothing().when(target).module(providerMock2);
        
        //Act Statement(s)
        target.module(moduleMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(moduleMock).map((Transformer) any());
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(projectMock).getLayout();
            verify(projectLayoutMock).file(providerMock);
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(target).module(providerMock2);
        });
    }

    //Sapient generated method id: ${module2ThrowsIllegalStateException}, hash: 59880BC2B6B231E98E2EE104269CFA5D
    @Test()
    void module2ThrowsIllegalStateException() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        IllegalStateException illegalStateException = new IllegalStateException("explodedBundleZip configuration of project B had no files");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.module("B");
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
        });
    }

    //Sapient generated method id: ${getPluginAndModuleConfigurationsTest}, hash: DC424DC5158EAB4E56BA02E4C86B905B
    @Test()
    void getPluginAndModuleConfigurationsTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        Collection<Configuration> result = target.getPluginAndModuleConfigurations();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(0));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
        });
    }

    //Sapient generated method id: ${keystoreTest}, hash: 62D46781D8E6351377EE73345AA6E9CB
    @Test()
    void keystoreTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        target.keystore("key1", "value1");
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${keystore1Test}, hash: C9FD3F1BD8B28DF32B5E0B03623C3532
    @Test()
    void keystore1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        target.keystore("key1", supplierMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${keystore2Test}, hash: 7A166C81DCB177BAF1EC5785A4560C28
    @Test()
    void keystore2Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        File file2 = new File("pathname1");
        
        //Act Statement(s)
        target.keystore("key1", file2);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${keystore3Test}, hash: 73BCB0DA27F7575C5500A67FBC61D906
    @Test()
    void keystore3Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        File file2 = new File("pathname1");
        
        //Act Statement(s)
        target.keystore("key1", file2, PropertyNormalization.DEFAULT);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${keystore4Test}, hash: 4268741E11DC10AFAE38E6DDEC7CB2EB
    @Test()
    void keystore4Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        FileSupplier fileSupplierMock = mock(FileSupplier.class);
        
        //Act Statement(s)
        target.keystore("key1", fileSupplierMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${keystorePasswordTest}, hash: 2EAA8B937A2A65EAAAC94161D1F83EEC
    @Test()
    void keystorePasswordTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        target.keystorePassword("password1");
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${cliSetupTest}, hash: ED299B3EADD66BEBC8FC3431888EBDAF
    @Test()
    void cliSetupTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        CharSequence[] charSequenceArray = new CharSequence[] {};
        
        //Act Statement(s)
        target.cliSetup("binTool1", charSequenceArray);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${settingTest}, hash: 3E6DA6C69E81D67F9295C32232A58EC1
    @Test()
    void settingTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        target.setting("key1", "value1");
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${setting1Test}, hash: D7D5A696613F00FD798AAD98D59523EC
    @Test()
    void setting1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        target.setting("key1", "value1", PropertyNormalization.DEFAULT);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${setting2Test}, hash: CEDB25F72AB82D6190A48EABD9ED1D65
    @Test()
    void setting2Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        target.setting("key1", supplierMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${setting3Test}, hash: 23D54EE6AD9A1ECFB4D01EED3D89886F
    @Test()
    void setting3Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        target.setting("key1", supplierMock, PropertyNormalization.DEFAULT);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${systemPropertyTest}, hash: 609478CAAE07208DC2957767BEFD38A4
    @Test()
    void systemPropertyTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        target.systemProperty("key1", "value1");
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${systemProperty1Test}, hash: D613354B13285EB002B7BD94AEE5380B
    @Test()
    void systemProperty1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        target.systemProperty("key1", supplierMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${systemProperty2Test}, hash: 73BFD6E1423DE336ABAD68611097DF12
    @Test()
    void systemProperty2Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        target.systemProperty("key1", supplierMock, PropertyNormalization.DEFAULT);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${environmentTest}, hash: 9DC7A575EA045D9345972E9FA01AF241
    @Test()
    void environmentTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        target.environment("key1", "value1");
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${environment1Test}, hash: 4D66854754E36836E77DF07F644C7E32
    @Test()
    void environment1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        target.environment("key1", supplierMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${environment2Test}, hash: D3F7C5A20BFF189975F5AF7B2D89C20B
    @Test()
    void environment2Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        target.environment("key1", supplierMock, PropertyNormalization.DEFAULT);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${jvmArgsTest}, hash: 66118EF669ED2D4AD9E403F94793A7BF
    @Test()
    void jvmArgsTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        String[] stringArray = new String[] {};
        
        //Act Statement(s)
        target.jvmArgs(stringArray);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${isPreserveDataDirWhenNodesStreamIsEmptyAnyMatchNodeIsPreserveDataDirIsEmpty}, hash: 3BA479BA459BED42FD318507E6F4F6DC
    @Test()
    void isPreserveDataDirWhenNodesStreamIsEmptyAnyMatchNodeIsPreserveDataDirIsEmpty() {
        /* Branches:
         * (nodes.stream().anyMatch(node -> node.isPreserveDataDir())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        Stream<ElasticsearchNode> stream = Stream.empty();
        doReturn(stream).when(nodesMock).stream();
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        boolean result = target.isPreserveDataDir();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).stream();
        });
    }

    //Sapient generated method id: ${isPreserveDataDirWhenNodesStreamIsEmptyAnyMatchNodeIsPreserveDataDir}, hash: 625BEA2A10DFAFE5E8C1EAEE4EEA4254
    @Test()
    void isPreserveDataDirWhenNodesStreamIsEmptyAnyMatchNodeIsPreserveDataDir() {
        /* Branches:
         * (nodes.stream().anyMatch(node -> node.isPreserveDataDir())) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        Stream<ElasticsearchNode> stream = Stream.empty();
        doReturn(stream).when(nodesMock).stream();
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        boolean result = target.isPreserveDataDir();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).stream();
        });
    }

    //Sapient generated method id: ${setPreserveDataDirTest}, hash: DE7F132AF8D32DB6B7EC401E335BBC94
    @Test()
    void setPreserveDataDirTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        target.setPreserveDataDir(false);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${freezeTest}, hash: 58D829FF5E1DA5AB1D3DAEF8AD0A0387
    @Test()
    void freezeTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).forEach((Consumer) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        target.freeze();
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).forEach((Consumer) any());
        });
    }

    //Sapient generated method id: ${startWhenNodesIsNotEmptyAndNodeGetTestDistributionEqualsTestDistributionINTEG_TESTThrowsNullPointerException}, hash: 7474B7A9CC2EE7B528B881A89200B7A4
    @Test()
    void startWhenNodesIsNotEmptyAndNodeGetTestDistributionEqualsTestDistributionINTEG_TESTThrowsNullPointerException() {
        /* Branches:
         * (nodes.stream().map(ElasticsearchNode::getName).anyMatch(name -> name == null)) : false  #  inside commonNodeConfig method
         * (for-each(nodes)) : true  #  inside commonNodeConfig method
         * (node.getTestDistribution().equals(TestDistribution.INTEG_TEST)) : true  #  inside commonNodeConfig method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        Stream<ElasticsearchNode> stream = Stream.empty();
        doReturn(stream).when(nodesMock).stream();
        List<ElasticsearchNode> elasticsearchNodeList = new ArrayList<>();
        elasticsearchNodeList.add(elasticsearchNodeMock);
        Iterator<ElasticsearchNode> iterator = elasticsearchNodeList.iterator();
        doReturn(iterator).when(nodesMock).iterator();
        doReturn(TestDistribution.INTEG_TEST).when(elasticsearchNodeMock).getTestDistribution();
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            target.start();
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).stream();
            verify(nodesMock).iterator();
            verify(elasticsearchNodeMock).getTestDistribution();
        });
    }

    //Sapient generated method id: ${startWhenHasDeprecationIndexingNodeThrowsNullPointerException}, hash: E871F501B7225AD2CAED211B47D20C5E
    @Test()
    void startWhenHasDeprecationIndexingNodeThrowsNullPointerException() {
        /* Branches:
         * (nodes.stream().map(ElasticsearchNode::getName).anyMatch(name -> name == null)) : false  #  inside commonNodeConfig method
         * (for-each(nodes)) : true  #  inside commonNodeConfig method
         * (node.getTestDistribution().equals(TestDistribution.INTEG_TEST)) : false  #  inside commonNodeConfig method
         * (node.getVersion().onOrAfter("7.16.0")) : true  #  inside hasDeprecationIndexing method
         * (node.getSettingKeys().contains("stateless.enabled") == false) : true  #  inside hasDeprecationIndexing method
         * (hasDeprecationIndexing(node)) : true  #  inside commonNodeConfig method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        Stream<ElasticsearchNode> stream = Stream.empty();
        doReturn(stream).when(nodesMock).stream();
        List<ElasticsearchNode> elasticsearchNodeList = new ArrayList<>();
        elasticsearchNodeList.add(elasticsearchNodeMock);
        Iterator<ElasticsearchNode> iterator = elasticsearchNodeList.iterator();
        doReturn(iterator).when(nodesMock).iterator();
        doReturn(TestDistribution.DEFAULT).when(elasticsearchNodeMock).getTestDistribution();
        doReturn(versionMock).when(elasticsearchNodeMock).getVersion();
        doReturn(true).when(versionMock).onOrAfter("7.16.0");
        Set<String> stringSet = new HashSet<>();
        doReturn(stringSet).when(elasticsearchNodeMock).getSettingKeys();
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            target.start();
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).stream();
            verify(nodesMock).iterator();
            verify(elasticsearchNodeMock).getTestDistribution();
            verify(elasticsearchNodeMock).getVersion();
            verify(versionMock).onOrAfter("7.16.0");
            verify(elasticsearchNodeMock).getSettingKeys();
        });
    }

    //Sapient generated method id: ${startWhenDefaultBranchThrowsAssertionError}, hash: EA8AB6D6A9E145D3DF553AFC732FF20E
    @Test()
    void startWhenDefaultBranchThrowsAssertionError() {
        /* Branches:
         * (nodes.stream().map(ElasticsearchNode::getName).anyMatch(name -> name == null)) : true  #  inside commonNodeConfig method
         * (for-each(nodes)) : true  #  inside commonNodeConfig method
         * (node.getTestDistribution().equals(TestDistribution.INTEG_TEST)) : false  #  inside commonNodeConfig method
         * (node.getVersion().onOrAfter("7.16.0")) : false  #  inside hasDeprecationIndexing method
         * (hasDeprecationIndexing(node)) : false  #  inside commonNodeConfig method
         * (nodeNames != null) : true  #  inside commonNodeConfig method
         * (branch expression (line 444)) : false  #  inside commonNodeConfig method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        Stream<ElasticsearchNode> stream = Stream.empty();
        Stream<ElasticsearchNode> stream2 = Stream.empty();
        doReturn(stream, stream2).when(nodesMock).stream();
        List<ElasticsearchNode> elasticsearchNodeList = new ArrayList<>();
        elasticsearchNodeList.add(elasticsearchNodeMock);
        Iterator<ElasticsearchNode> iterator = elasticsearchNodeList.iterator();
        doReturn(iterator).when(nodesMock).iterator();
        doReturn(TestDistribution.DEFAULT).when(elasticsearchNodeMock).getTestDistribution();
        doReturn(false).when(versionMock).onOrAfter("7.16.0");
        doReturn(false).when(versionMock2).onOrAfter("7.0.0");
        doReturn(versionMock, versionMock2, versionMock3).when(elasticsearchNodeMock).getVersion();
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        //Act Statement(s)
        final AssertionError result = assertThrows(AssertionError.class, () -> {
            target.start();
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock, times(2)).stream();
            verify(nodesMock).iterator();
            verify(elasticsearchNodeMock).getTestDistribution();
            verify(elasticsearchNodeMock, times(3)).getVersion();
            verify(versionMock).onOrAfter("7.16.0");
            verify(versionMock2).onOrAfter("7.0.0");
        });
    }

    //Sapient generated method id: ${startWhenDefaultBranchThrowsNullPointerException}, hash: 2CAB75421A4D49951FF6F05B492A0939
    @Test()
    void startWhenDefaultBranchThrowsNullPointerException() {
        /* Branches:
         * (nodes.stream().map(ElasticsearchNode::getName).anyMatch(name -> name == null)) : true  #  inside commonNodeConfig method
         * (for-each(nodes)) : true  #  inside commonNodeConfig method
         * (node.getTestDistribution().equals(TestDistribution.INTEG_TEST)) : false  #  inside commonNodeConfig method
         * (node.getVersion().onOrAfter("7.16.0")) : false  #  inside hasDeprecationIndexing method
         * (hasDeprecationIndexing(node)) : false  #  inside commonNodeConfig method
         * (nodeNames != null) : true  #  inside commonNodeConfig method
         * (branch expression (line 444)) : false  #  inside commonNodeConfig method
         * (branch expression (line 445)) : false  #  inside commonNodeConfig method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        Stream<ElasticsearchNode> stream = Stream.empty();
        Stream<ElasticsearchNode> stream2 = Stream.empty();
        doReturn(stream, stream2).when(nodesMock).stream();
        List<ElasticsearchNode> elasticsearchNodeList = new ArrayList<>();
        elasticsearchNodeList.add(elasticsearchNodeMock);
        Iterator<ElasticsearchNode> iterator = elasticsearchNodeList.iterator();
        doReturn(iterator).when(nodesMock).iterator();
        doReturn(TestDistribution.DEFAULT).when(elasticsearchNodeMock).getTestDistribution();
        doReturn(false).when(versionMock).onOrAfter("7.16.0");
        doReturn(versionMock, versionMock2).when(elasticsearchNodeMock).getVersion();
        doReturn(true).when(versionMock2).onOrAfter("7.0.0");
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            target.start();
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock, times(2)).stream();
            verify(nodesMock).iterator();
            verify(elasticsearchNodeMock).getTestDistribution();
            verify(elasticsearchNodeMock, times(2)).getVersion();
            verify(versionMock).onOrAfter("7.16.0");
            verify(versionMock2).onOrAfter("7.0.0");
        });
    }

    //Sapient generated method id: ${startWhenHasDeprecationIndexingNotNodeAndNodeNamesIsNullAndFirstNodeIsNull}, hash: 54EC3DABF1B44560FFED6C3B8CF37D4B
    @Test()
    void startWhenHasDeprecationIndexingNotNodeAndNodeNamesIsNullAndFirstNodeIsNull() {
        /* Branches:
         * (nodes.stream().map(ElasticsearchNode::getName).anyMatch(name -> name == null)) : false  #  inside commonNodeConfig method
         * (for-each(nodes)) : true  #  inside commonNodeConfig method
         * (node.getTestDistribution().equals(TestDistribution.INTEG_TEST)) : false  #  inside commonNodeConfig method
         * (node.getVersion().onOrAfter("7.16.0")) : true  #  inside hasDeprecationIndexing method
         * (node.getSettingKeys().contains("stateless.enabled") == false) : false  #  inside hasDeprecationIndexing method
         * (hasDeprecationIndexing(node)) : false  #  inside commonNodeConfig method
         * (nodeNames != null) : false  #  inside commonNodeConfig method
         * (firstNode == null) : true  #  inside commonNodeConfig method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        Stream<ElasticsearchNode> stream = Stream.empty();
        doReturn(stream).when(nodesMock).stream();
        List<ElasticsearchNode> elasticsearchNodeList = new ArrayList<>();
        elasticsearchNodeList.add(elasticsearchNodeMock);
        Iterator<ElasticsearchNode> iterator = elasticsearchNodeList.iterator();
        doReturn(iterator).when(nodesMock).iterator();
        doReturn(TestDistribution.DEFAULT).when(elasticsearchNodeMock).getTestDistribution();
        doReturn(versionMock).when(elasticsearchNodeMock).getVersion();
        doReturn(true).when(versionMock).onOrAfter("7.16.0");
        Set<String> stringSet = new HashSet<>(Set.of("stateless.enabled"));
        doReturn(stringSet).when(elasticsearchNodeMock).getSettingKeys();
        doNothing().when(nodesMock).forEach((Consumer) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        target.start();
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).stream();
            verify(nodesMock).iterator();
            verify(elasticsearchNodeMock).getTestDistribution();
            verify(elasticsearchNodeMock).getVersion();
            verify(versionMock).onOrAfter("7.16.0");
            verify(elasticsearchNodeMock).getSettingKeys();
            verify(nodesMock).forEach((Consumer) any());
        });
    }

    //Sapient generated method id: ${restartTest}, hash: 5E895D222472B862F48B0684A50B63F5
    @Test()
    void restartTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).forEach((Consumer) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        target.restart();
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).forEach((Consumer) any());
        });
    }

    //Sapient generated method id: ${goToNextVersionTest}, hash: 1DF384D775E009D4CB99773CE7314D37
    @Test()
    void goToNextVersionTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).forEach((Consumer) any());
        doNothing().when(nodesMock).all((Action) any());
        Stream<ElasticsearchNode> stream = Stream.empty();
        doReturn(stream).when(nodesMock).stream();
        File file = new File("pathname1");
        ElasticsearchCluster target = spy(new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock));
        doNothing().when(target).start();
        
        //Act Statement(s)
        target.goToNextVersion();
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock, atLeast(2)).forEach((Consumer) any());
            verify(nodesMock).all((Action) any());
            verify(nodesMock).stream();
            verify(target).start();
        });
    }

    //Sapient generated method id: ${goToNextVersionWhenCaughtIOExceptionThrowsUncheckedIOException}, hash: 30EA8514BF7AD3E97CE94AC59539E702
    @Test()
    void goToNextVersionWhenCaughtIOExceptionThrowsUncheckedIOException() throws IOException {
        /* Branches:
         * (catch-exception (IOException)) : true  #  inside lambda$writeUnicastHostsFiles$40 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<Files> files = mockStatic(Files.class)) {
            doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
            doReturn(objectFactoryMock).when(projectMock).getObjects();
            doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
            doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
            doNothing().when(nodesMock).forEach((Consumer) any());
            doNothing().when(nodesMock).all((Action) any());
            Stream<ElasticsearchNode> stream = Stream.empty();
            doReturn(stream).when(nodesMock).stream();
            byte[] byteArray = new byte[] {};
            OpenOption[] openOptionArray = new OpenOption[] {};
            files.when(() -> Files.write(pathMock2, byteArray, openOptionArray)).thenReturn(pathMock);
            File file = new File("pathname1");
            ElasticsearchCluster target = spy(new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock));
            doNothing().when(target).start();
            //Act Statement(s)
            final UncheckedIOException result = assertThrows(UncheckedIOException.class, () -> {
                target.goToNextVersion();
            });
            IOException iOException = new IOException();
            UncheckedIOException uncheckedIOException = new UncheckedIOException("Failed to write unicast_hosts for null", iOException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(uncheckedIOException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
                verify(projectMock).container(ElasticsearchNode.class);
                verify(projectMock).getObjects();
                verify(objectFactoryMock).fileCollection();
                verify(nodesMock).add((ElasticsearchNode) any());
                verify(nodesMock, atLeast(2)).forEach((Consumer) any());
                verify(nodesMock).all((Action) any());
                verify(nodesMock).stream();
                files.verify(() -> Files.write(pathMock2, byteArray, openOptionArray), atLeast(1));
                verify(target).start();
            });
        }
    }

    //Sapient generated method id: ${nextNodeToNextVersionWhenNodeIndexPlus1GreaterThanNodesSizeThrowsTestClustersException}, hash: 326847A07F4A62229DE2926F5C6CBCC5
    @Test()
    void nextNodeToNextVersionWhenNodeIndexPlus1GreaterThanNodesSizeThrowsTestClustersException() {
        /* Branches:
         * (nodeIndex + 1 > nodes.size()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doReturn(0).when(nodesMock).size();
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        TestClustersException testClustersException = new TestClustersException("Ran out of nodes to take to the next version");
        //Act Statement(s)
        final TestClustersException result = assertThrows(TestClustersException.class, () -> {
            target.nextNodeToNextVersion();
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(testClustersException.getMessage()));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).size();
        });
    }

    //Sapient generated method id: ${nextNodeToNextVersionWhenNodesIsNotEmptyAndNodeGetTestDistributionEqualsTestDistributionINTEGThrowsNullPointerException}, hash: 46FE90064AFF0B225F7278168D93B04F
    @Test()
    void nextNodeToNextVersionWhenNodesIsNotEmptyAndNodeGetTestDistributionEqualsTestDistributionINTEGThrowsNullPointerException() throws UnknownDomainObjectException {
        /* Branches:
         * (nodeIndex + 1 > nodes.size()) : false
         * (nodes.stream().map(ElasticsearchNode::getName).anyMatch(name -> name == null)) : false  #  inside commonNodeConfig method
         * (for-each(nodes)) : true  #  inside commonNodeConfig method
         * (node.getTestDistribution().equals(TestDistribution.INTEG_TEST)) : true  #  inside commonNodeConfig method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doReturn(1).when(nodesMock).size();
        doReturn(elasticsearchNodeMock).when(nodesMock).getByName("A-0");
        doNothing().when(elasticsearchNodeMock).stop(false);
        doNothing().when(elasticsearchNodeMock).goToNextVersion();
        Stream<ElasticsearchNode> stream = Stream.empty();
        doReturn(stream).when(nodesMock).stream();
        List<ElasticsearchNode> elasticsearchNodeList = new ArrayList<>();
        elasticsearchNodeList.add(elasticsearchNodeMock2);
        Iterator<ElasticsearchNode> iterator = elasticsearchNodeList.iterator();
        doReturn(iterator).when(nodesMock).iterator();
        doReturn(TestDistribution.INTEG_TEST).when(elasticsearchNodeMock2).getTestDistribution();
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            target.nextNodeToNextVersion();
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).size();
            verify(nodesMock).getByName("A-0");
            verify(elasticsearchNodeMock).stop(false);
            verify(elasticsearchNodeMock).goToNextVersion();
            verify(nodesMock).stream();
            verify(nodesMock).iterator();
            verify(elasticsearchNodeMock2).getTestDistribution();
        });
    }

    //Sapient generated method id: ${nextNodeToNextVersionWhenHasDeprecationIndexingNodeThrowsNullPointerException}, hash: 8872763D2FA25290AB2CF20A4F9D519B
    @Test()
    void nextNodeToNextVersionWhenHasDeprecationIndexingNodeThrowsNullPointerException() throws UnknownDomainObjectException {
        /* Branches:
         * (nodeIndex + 1 > nodes.size()) : false
         * (nodes.stream().map(ElasticsearchNode::getName).anyMatch(name -> name == null)) : false  #  inside commonNodeConfig method
         * (for-each(nodes)) : true  #  inside commonNodeConfig method
         * (node.getTestDistribution().equals(TestDistribution.INTEG_TEST)) : false  #  inside commonNodeConfig method
         * (node.getVersion().onOrAfter("7.16.0")) : true  #  inside hasDeprecationIndexing method
         * (node.getSettingKeys().contains("stateless.enabled") == false) : true  #  inside hasDeprecationIndexing method
         * (hasDeprecationIndexing(node)) : true  #  inside commonNodeConfig method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doReturn(1).when(nodesMock).size();
        doReturn(elasticsearchNodeMock).when(nodesMock).getByName("A-0");
        doNothing().when(elasticsearchNodeMock).stop(false);
        doNothing().when(elasticsearchNodeMock).goToNextVersion();
        Stream<ElasticsearchNode> stream = Stream.empty();
        doReturn(stream).when(nodesMock).stream();
        List<ElasticsearchNode> elasticsearchNodeList = new ArrayList<>();
        elasticsearchNodeList.add(elasticsearchNodeMock2);
        Iterator<ElasticsearchNode> iterator = elasticsearchNodeList.iterator();
        doReturn(iterator).when(nodesMock).iterator();
        doReturn(TestDistribution.DEFAULT).when(elasticsearchNodeMock2).getTestDistribution();
        doReturn(versionMock).when(elasticsearchNodeMock2).getVersion();
        doReturn(true).when(versionMock).onOrAfter("7.16.0");
        Set<String> stringSet = new HashSet<>();
        doReturn(stringSet).when(elasticsearchNodeMock2).getSettingKeys();
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            target.nextNodeToNextVersion();
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).size();
            verify(nodesMock).getByName("A-0");
            verify(elasticsearchNodeMock).stop(false);
            verify(elasticsearchNodeMock).goToNextVersion();
            verify(nodesMock).stream();
            verify(nodesMock).iterator();
            verify(elasticsearchNodeMock2).getTestDistribution();
            verify(elasticsearchNodeMock2).getVersion();
            verify(versionMock).onOrAfter("7.16.0");
            verify(elasticsearchNodeMock2).getSettingKeys();
        });
    }

    //Sapient generated method id: ${nextNodeToNextVersionWhenDefaultBranchThrowsAssertionError}, hash: EEF48A5E6FB9468FF7DF8DEFB8E1757A
    @Test()
    void nextNodeToNextVersionWhenDefaultBranchThrowsAssertionError() throws UnknownDomainObjectException {
        /* Branches:
         * (nodeIndex + 1 > nodes.size()) : false
         * (nodes.stream().map(ElasticsearchNode::getName).anyMatch(name -> name == null)) : true  #  inside commonNodeConfig method
         * (for-each(nodes)) : true  #  inside commonNodeConfig method
         * (node.getTestDistribution().equals(TestDistribution.INTEG_TEST)) : false  #  inside commonNodeConfig method
         * (node.getVersion().onOrAfter("7.16.0")) : false  #  inside hasDeprecationIndexing method
         * (hasDeprecationIndexing(node)) : false  #  inside commonNodeConfig method
         * (nodeNames != null) : true  #  inside commonNodeConfig method
         * (branch expression (line 444)) : false  #  inside commonNodeConfig method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doReturn(1).when(nodesMock).size();
        doReturn(elasticsearchNodeMock).when(nodesMock).getByName("A-0");
        doNothing().when(elasticsearchNodeMock).stop(false);
        doNothing().when(elasticsearchNodeMock).goToNextVersion();
        Stream<ElasticsearchNode> stream = Stream.empty();
        Stream<ElasticsearchNode> stream2 = Stream.empty();
        doReturn(stream, stream2).when(nodesMock).stream();
        List<ElasticsearchNode> elasticsearchNodeList = new ArrayList<>();
        elasticsearchNodeList.add(elasticsearchNodeMock2);
        Iterator<ElasticsearchNode> iterator = elasticsearchNodeList.iterator();
        doReturn(iterator).when(nodesMock).iterator();
        doReturn(TestDistribution.DEFAULT).when(elasticsearchNodeMock2).getTestDistribution();
        doReturn(false).when(versionMock).onOrAfter("7.16.0");
        doReturn(false).when(versionMock2).onOrAfter("7.0.0");
        doReturn(versionMock, versionMock2, versionMock3).when(elasticsearchNodeMock2).getVersion();
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        //Act Statement(s)
        final AssertionError result = assertThrows(AssertionError.class, () -> {
            target.nextNodeToNextVersion();
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).size();
            verify(nodesMock).getByName("A-0");
            verify(elasticsearchNodeMock).stop(false);
            verify(elasticsearchNodeMock).goToNextVersion();
            verify(nodesMock, times(2)).stream();
            verify(nodesMock).iterator();
            verify(elasticsearchNodeMock2).getTestDistribution();
            verify(elasticsearchNodeMock2, times(3)).getVersion();
            verify(versionMock).onOrAfter("7.16.0");
            verify(versionMock2).onOrAfter("7.0.0");
        });
    }

    //Sapient generated method id: ${nextNodeToNextVersionWhenDefaultBranchThrowsNullPointerException}, hash: E1346E19114CDCAC3DAEA003E0132EB2
    @Test()
    void nextNodeToNextVersionWhenDefaultBranchThrowsNullPointerException() throws UnknownDomainObjectException {
        /* Branches:
         * (nodeIndex + 1 > nodes.size()) : false
         * (nodes.stream().map(ElasticsearchNode::getName).anyMatch(name -> name == null)) : true  #  inside commonNodeConfig method
         * (for-each(nodes)) : true  #  inside commonNodeConfig method
         * (node.getTestDistribution().equals(TestDistribution.INTEG_TEST)) : false  #  inside commonNodeConfig method
         * (node.getVersion().onOrAfter("7.16.0")) : false  #  inside hasDeprecationIndexing method
         * (hasDeprecationIndexing(node)) : false  #  inside commonNodeConfig method
         * (nodeNames != null) : true  #  inside commonNodeConfig method
         * (branch expression (line 444)) : false  #  inside commonNodeConfig method
         * (branch expression (line 445)) : false  #  inside commonNodeConfig method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doReturn(1).when(nodesMock).size();
        doReturn(elasticsearchNodeMock).when(nodesMock).getByName("A-0");
        doNothing().when(elasticsearchNodeMock).stop(false);
        doNothing().when(elasticsearchNodeMock).goToNextVersion();
        Stream<ElasticsearchNode> stream = Stream.empty();
        Stream<ElasticsearchNode> stream2 = Stream.empty();
        doReturn(stream, stream2).when(nodesMock).stream();
        List<ElasticsearchNode> elasticsearchNodeList = new ArrayList<>();
        elasticsearchNodeList.add(elasticsearchNodeMock2);
        Iterator<ElasticsearchNode> iterator = elasticsearchNodeList.iterator();
        doReturn(iterator).when(nodesMock).iterator();
        doReturn(TestDistribution.DEFAULT).when(elasticsearchNodeMock2).getTestDistribution();
        doReturn(false).when(versionMock).onOrAfter("7.16.0");
        doReturn(versionMock, versionMock2).when(elasticsearchNodeMock2).getVersion();
        doReturn(true).when(versionMock2).onOrAfter("7.0.0");
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            target.nextNodeToNextVersion();
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).size();
            verify(nodesMock).getByName("A-0");
            verify(elasticsearchNodeMock).stop(false);
            verify(elasticsearchNodeMock).goToNextVersion();
            verify(nodesMock, times(2)).stream();
            verify(nodesMock).iterator();
            verify(elasticsearchNodeMock2).getTestDistribution();
            verify(elasticsearchNodeMock2, times(2)).getVersion();
            verify(versionMock).onOrAfter("7.16.0");
            verify(versionMock2).onOrAfter("7.0.0");
        });
    }

    //Sapient generated method id: ${nextNodeToNextVersionWhenHasDeprecationIndexingNode}, hash: 7FEA29DD45073F54F2245312C17EA47F
    @Test()
    void nextNodeToNextVersionWhenHasDeprecationIndexingNode() throws UnknownDomainObjectException {
        /* Branches:
         * (nodeIndex + 1 > nodes.size()) : false
         * (nodes.stream().map(ElasticsearchNode::getName).anyMatch(name -> name == null)) : false  #  inside commonNodeConfig method
         * (for-each(nodes)) : true  #  inside commonNodeConfig method
         * (node.getTestDistribution().equals(TestDistribution.INTEG_TEST)) : false  #  inside commonNodeConfig method
         * (node.getVersion().onOrAfter("7.16.0")) : true  #  inside hasDeprecationIndexing method
         * (node.getSettingKeys().contains("stateless.enabled") == false) : false  #  inside hasDeprecationIndexing method
         * (hasDeprecationIndexing(node)) : false  #  inside commonNodeConfig method
         * (nodeNames != null) : false  #  inside commonNodeConfig method
         * (firstNode == null) : true  #  inside commonNodeConfig method
         * (node.getTestDistribution().equals(TestDistribution.DEFAULT)) : true
         * (hasDeprecationIndexing(node)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doReturn(1).when(nodesMock).size();
        doReturn(elasticsearchNodeMock).when(nodesMock).getByName("A-0");
        doNothing().when(elasticsearchNodeMock).stop(false);
        doNothing().when(elasticsearchNodeMock).goToNextVersion();
        doReturn(TestDistribution.DEFAULT).when(elasticsearchNodeMock).getTestDistribution();
        doReturn(versionMock).when(elasticsearchNodeMock).getVersion();
        doReturn(true).when(versionMock).onOrAfter("7.16.0");
        Set<String> stringSet = new HashSet<>();
        doReturn(stringSet).when(elasticsearchNodeMock).getSettingKeys();
        doNothing().when(elasticsearchNodeMock).setting("cluster.deprecation_indexing.enabled", "false");
        doNothing().when(elasticsearchNodeMock).start();
        Stream<ElasticsearchNode> stream = Stream.empty();
        doReturn(stream).when(nodesMock).stream();
        List<ElasticsearchNode> elasticsearchNodeList = new ArrayList<>();
        elasticsearchNodeList.add(elasticsearchNodeMock2);
        Iterator<ElasticsearchNode> iterator = elasticsearchNodeList.iterator();
        doReturn(iterator).when(nodesMock).iterator();
        doReturn(TestDistribution.DEFAULT).when(elasticsearchNodeMock2).getTestDistribution();
        doReturn(versionMock2).when(elasticsearchNodeMock2).getVersion();
        doReturn(true).when(versionMock2).onOrAfter("7.16.0");
        Set<String> stringSet2 = new HashSet<>(Set.of("stateless.enabled"));
        doReturn(stringSet2).when(elasticsearchNodeMock2).getSettingKeys();
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        target.nextNodeToNextVersion();
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).size();
            verify(nodesMock).getByName("A-0");
            verify(elasticsearchNodeMock).stop(false);
            verify(elasticsearchNodeMock).goToNextVersion();
            verify(elasticsearchNodeMock).getTestDistribution();
            verify(elasticsearchNodeMock).getVersion();
            verify(versionMock).onOrAfter("7.16.0");
            verify(elasticsearchNodeMock).getSettingKeys();
            verify(elasticsearchNodeMock).setting("cluster.deprecation_indexing.enabled", "false");
            verify(elasticsearchNodeMock).start();
            verify(nodesMock).stream();
            verify(nodesMock).iterator();
            verify(elasticsearchNodeMock2).getTestDistribution();
            verify(elasticsearchNodeMock2).getVersion();
            verify(versionMock2).onOrAfter("7.16.0");
            verify(elasticsearchNodeMock2).getSettingKeys();
        });
    }

    //Sapient generated method id: ${nextNodeToNextVersionWhenHasDeprecationIndexingNotNode}, hash: 70F23DF3FF6834E2EFCB9199BC937CBB
    @Test()
    void nextNodeToNextVersionWhenHasDeprecationIndexingNotNode() throws UnknownDomainObjectException {
        /* Branches:
         * (nodeIndex + 1 > nodes.size()) : false
         * (nodes.stream().map(ElasticsearchNode::getName).anyMatch(name -> name == null)) : false  #  inside commonNodeConfig method
         * (for-each(nodes)) : true  #  inside commonNodeConfig method
         * (node.getTestDistribution().equals(TestDistribution.INTEG_TEST)) : false  #  inside commonNodeConfig method
         * (node.getVersion().onOrAfter("7.16.0")) : true  #  inside hasDeprecationIndexing method
         * (node.getSettingKeys().contains("stateless.enabled") == false) : false  #  inside hasDeprecationIndexing method
         * (hasDeprecationIndexing(node)) : false  #  inside commonNodeConfig method
         * (nodeNames != null) : false  #  inside commonNodeConfig method
         * (firstNode == null) : true  #  inside commonNodeConfig method
         * (node.getTestDistribution().equals(TestDistribution.DEFAULT)) : true
         * (hasDeprecationIndexing(node)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doReturn(1).when(nodesMock).size();
        doReturn(elasticsearchNodeMock).when(nodesMock).getByName("A-0");
        doNothing().when(elasticsearchNodeMock).stop(false);
        doNothing().when(elasticsearchNodeMock).goToNextVersion();
        doReturn(TestDistribution.DEFAULT).when(elasticsearchNodeMock).getTestDistribution();
        doReturn(versionMock).when(elasticsearchNodeMock).getVersion();
        doReturn(true).when(versionMock).onOrAfter("7.16.0");
        Set<String> stringSet = new HashSet<>(Set.of("stateless.enabled"));
        doReturn(stringSet).when(elasticsearchNodeMock).getSettingKeys();
        doNothing().when(elasticsearchNodeMock).start();
        Stream<ElasticsearchNode> stream = Stream.empty();
        doReturn(stream).when(nodesMock).stream();
        List<ElasticsearchNode> elasticsearchNodeList = new ArrayList<>();
        elasticsearchNodeList.add(elasticsearchNodeMock2);
        Iterator<ElasticsearchNode> iterator = elasticsearchNodeList.iterator();
        doReturn(iterator).when(nodesMock).iterator();
        doReturn(TestDistribution.DEFAULT).when(elasticsearchNodeMock2).getTestDistribution();
        doReturn(versionMock2).when(elasticsearchNodeMock2).getVersion();
        doReturn(true).when(versionMock2).onOrAfter("7.16.0");
        Set<String> stringSet2 = new HashSet<>(Set.of("stateless.enabled"));
        doReturn(stringSet2).when(elasticsearchNodeMock2).getSettingKeys();
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        target.nextNodeToNextVersion();
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).size();
            verify(nodesMock).getByName("A-0");
            verify(elasticsearchNodeMock).stop(false);
            verify(elasticsearchNodeMock).goToNextVersion();
            verify(elasticsearchNodeMock).getTestDistribution();
            verify(elasticsearchNodeMock).getVersion();
            verify(versionMock).onOrAfter("7.16.0");
            verify(elasticsearchNodeMock).getSettingKeys();
            verify(elasticsearchNodeMock).start();
            verify(nodesMock).stream();
            verify(nodesMock).iterator();
            verify(elasticsearchNodeMock2).getTestDistribution();
            verify(elasticsearchNodeMock2).getVersion();
            verify(versionMock2).onOrAfter("7.16.0");
            verify(elasticsearchNodeMock2).getSettingKeys();
        });
    }

    //Sapient generated method id: ${extraConfigFileTest}, hash: 6F6CB8E9168EA1935F3F683132634463
    @Test()
    void extraConfigFileTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        File file2 = new File("pathname1");
        
        //Act Statement(s)
        target.extraConfigFile("destination1", file2);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${extraConfigFile1Test}, hash: 0A5F6D2AF4DFE6093EDC9C72271ADC5D
    @Test()
    void extraConfigFile1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        File file2 = new File("pathname1");
        
        //Act Statement(s)
        target.extraConfigFile("destination1", file2, PropertyNormalization.DEFAULT);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${extraJarFilesTest}, hash: BC2E0B66E03868DD505A1B03499C61D5
    @Test()
    void extraJarFilesTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        target.extraJarFiles(fileCollectionMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${userTest}, hash: 0C49CE28F6CB021FF589111FCE5CC6AD
    @Test()
    void userTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        Map<String, String> stringStringMap = new HashMap<>();
        
        //Act Statement(s)
        target.user(stringStringMap);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${rolesFileTest}, hash: FD2E179653D13A4670A8528834A63F3D
    @Test()
    void rolesFileTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        File file2 = new File("pathname1");
        
        //Act Statement(s)
        target.rolesFile(file2);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${requiresFeatureTest}, hash: 6C30B114C2EC0004CCA4F405E6FA496F
    @Test()
    void requiresFeatureTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        target.requiresFeature("feature1", versionMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${requiresFeature1Test}, hash: E8403A86C0DFA84DEBBD5D9CA2891C64
    @Test()
    void requiresFeature1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        target.requiresFeature("feature1", versionMock, versionMock2);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${writeUnicastHostsFilesTest}, hash: 80EBAE36B1BF5E08F64046B0F6814C82
    @Test()
    void writeUnicastHostsFilesTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        Stream<ElasticsearchNode> stream = Stream.empty();
        doReturn(stream).when(nodesMock).stream();
        doNothing().when(nodesMock).forEach((Consumer) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        target.writeUnicastHostsFiles();
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).stream();
            verify(nodesMock).forEach((Consumer) any());
        });
    }

    //Sapient generated method id: ${writeUnicastHostsFilesWhenCaughtIOExceptionThrowsUncheckedIOException}, hash: 6E1B16A2788BDCC68AF0131E9825319B
    @Test()
    void writeUnicastHostsFilesWhenCaughtIOExceptionThrowsUncheckedIOException() throws IOException {
        /* Branches:
         * (catch-exception (IOException)) : true  #  inside lambda$writeUnicastHostsFiles$40 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<Files> files = mockStatic(Files.class)) {
            doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
            doReturn(objectFactoryMock).when(projectMock).getObjects();
            doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
            doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
            Stream<ElasticsearchNode> stream = Stream.empty();
            doReturn(stream).when(nodesMock).stream();
            doNothing().when(nodesMock).forEach((Consumer) any());
            byte[] byteArray = new byte[] {};
            OpenOption[] openOptionArray = new OpenOption[] {};
            files.when(() -> Files.write(pathMock2, byteArray, openOptionArray)).thenReturn(pathMock);
            File file = new File("pathname1");
            ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
            //Act Statement(s)
            final UncheckedIOException result = assertThrows(UncheckedIOException.class, () -> {
                target.writeUnicastHostsFiles();
            });
            IOException iOException = new IOException();
            UncheckedIOException uncheckedIOException = new UncheckedIOException("Failed to write unicast_hosts for null", iOException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(uncheckedIOException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
                verify(projectMock).container(ElasticsearchNode.class);
                verify(projectMock).getObjects();
                verify(objectFactoryMock).fileCollection();
                verify(nodesMock).add((ElasticsearchNode) any());
                verify(nodesMock).stream();
                verify(nodesMock).forEach((Consumer) any());
                files.verify(() -> Files.write(pathMock2, byteArray, openOptionArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getHttpSocketURITest}, hash: 9DD30E00D8DD811176A09A34C4421732
    @Test()
    void getHttpSocketURITest() throws UnknownDomainObjectException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doReturn(elasticsearchNodeMock).when(nodesMock).getAt("A-0");
        doReturn("return_of_getHttpSocketURI1").when(elasticsearchNodeMock).getHttpSocketURI();
        File file = new File("pathname1");
        ElasticsearchCluster target = spy(new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock));
        doNothing().when(target).waitForAllConditions();
        
        //Act Statement(s)
        String result = target.getHttpSocketURI();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getHttpSocketURI1"));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).getAt("A-0");
            verify(elasticsearchNodeMock).getHttpSocketURI();
            verify(target).waitForAllConditions();
        });
    }

    //Sapient generated method id: ${getTransportPortURITest}, hash: 3120D374CFFAC16BD0ADA001EF1F6117
    @Test()
    void getTransportPortURITest() throws UnknownDomainObjectException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doReturn(elasticsearchNodeMock).when(nodesMock).getAt("A-0");
        doReturn("return_of_getTransportPortURI1").when(elasticsearchNodeMock).getTransportPortURI();
        File file = new File("pathname1");
        ElasticsearchCluster target = spy(new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock));
        doNothing().when(target).waitForAllConditions();
        
        //Act Statement(s)
        String result = target.getTransportPortURI();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getTransportPortURI1"));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).getAt("A-0");
            verify(elasticsearchNodeMock).getTransportPortURI();
            verify(target).waitForAllConditions();
        });
    }

    //Sapient generated method id: ${getReadinessPortURITest}, hash: C9A4DFAABB829294B080A15EDA98B9FF
    @Test()
    void getReadinessPortURITest() throws UnknownDomainObjectException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doReturn(elasticsearchNodeMock).when(nodesMock).getAt("A-0");
        doReturn("return_of_getReadinessPortURI1").when(elasticsearchNodeMock).getReadinessPortURI();
        File file = new File("pathname1");
        ElasticsearchCluster target = spy(new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock));
        doNothing().when(target).waitForAllConditions();
        
        //Act Statement(s)
        String result = target.getReadinessPortURI();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getReadinessPortURI1"));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).getAt("A-0");
            verify(elasticsearchNodeMock).getReadinessPortURI();
            verify(target).waitForAllConditions();
        });
    }

    //Sapient generated method id: ${getAllHttpSocketURITest}, hash: 42B825BDE598343BBF056212B851DC69
    @Test()
    void getAllHttpSocketURITest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        Stream<ElasticsearchNode> stream = Stream.empty();
        doReturn(stream).when(nodesMock).stream();
        File file = new File("pathname1");
        ElasticsearchCluster target = spy(new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock));
        doNothing().when(target).waitForAllConditions();
        
        //Act Statement(s)
        List<String> result = target.getAllHttpSocketURI();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(0));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).stream();
            verify(target).waitForAllConditions();
        });
    }

    //Sapient generated method id: ${getAllTransportPortURITest}, hash: DC2B117F5DF0DF5A85A870591062EF82
    @Test()
    void getAllTransportPortURITest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        Stream<ElasticsearchNode> stream = Stream.empty();
        doReturn(stream).when(nodesMock).stream();
        File file = new File("pathname1");
        ElasticsearchCluster target = spy(new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock));
        doNothing().when(target).waitForAllConditions();
        
        //Act Statement(s)
        List<String> result = target.getAllTransportPortURI();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(0));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).stream();
            verify(target).waitForAllConditions();
        });
    }

    //Sapient generated method id: ${getAllReadinessPortURITest}, hash: 6A8D971E63F30092A980162FFB5B0311
    @Test()
    void getAllReadinessPortURITest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        Stream<ElasticsearchNode> stream = Stream.empty();
        doReturn(stream).when(nodesMock).stream();
        File file = new File("pathname1");
        ElasticsearchCluster target = spy(new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock));
        doNothing().when(target).waitForAllConditions();
        
        //Act Statement(s)
        List<String> result = target.getAllReadinessPortURI();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(0));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).stream();
            verify(target).waitForAllConditions();
        });
    }

    //Sapient generated method id: ${getAllRemoteAccessPortURITest}, hash: A2B596EB58E8A3723938318D16D7F638
    @Test()
    void getAllRemoteAccessPortURITest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        Stream<ElasticsearchNode> stream = Stream.empty();
        doReturn(stream).when(nodesMock).stream();
        File file = new File("pathname1");
        ElasticsearchCluster target = spy(new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock));
        doNothing().when(target).waitForAllConditions();
        
        //Act Statement(s)
        List<String> result = target.getAllRemoteAccessPortURI();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(0));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).stream();
            verify(target).waitForAllConditions();
        });
    }

    //Sapient generated method id: ${waitForAllConditionsTest}, hash: B587C8B4479A65D395C14899B9D72B91
    @Test()
    void waitForAllConditionsTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        Stream<ElasticsearchNode> stream = Stream.empty();
        doReturn(stream).when(nodesMock).stream();
        doNothing().when(nodesMock).forEach((Consumer) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = spy(new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock));
        doNothing().when(target).waitForConditions((LinkedHashMap) any(), eq(0L), eq(40L), eq(TimeUnit.SECONDS), eq(target));
        
        //Act Statement(s)
        target.waitForAllConditions();
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).stream();
            verify(nodesMock).forEach((Consumer) any());
            verify(target).waitForConditions((LinkedHashMap) any(), eq(0L), eq(40L), eq(TimeUnit.SECONDS), eq(target));
        });
    }

    //Sapient generated method id: ${waitForAllConditionsWhenCaughtIOExceptionThrowsUncheckedIOException}, hash: 849E2180ECDDAA8CBE53C63C2D8D7E5E
    @Test()
    void waitForAllConditionsWhenCaughtIOExceptionThrowsUncheckedIOException() throws IOException {
        /* Branches:
         * (catch-exception (IOException)) : true  #  inside lambda$writeUnicastHostsFiles$40 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        try (MockedStatic<Files> files = mockStatic(Files.class)) {
            doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
            doReturn(objectFactoryMock).when(projectMock).getObjects();
            doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
            doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
            Stream<ElasticsearchNode> stream = Stream.empty();
            doReturn(stream).when(nodesMock).stream();
            doNothing().when(nodesMock).forEach((Consumer) any());
            byte[] byteArray = new byte[] {};
            OpenOption[] openOptionArray = new OpenOption[] {};
            files.when(() -> Files.write(pathMock2, byteArray, openOptionArray)).thenReturn(pathMock);
            File file = new File("pathname1");
            ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
            //Act Statement(s)
            final UncheckedIOException result = assertThrows(UncheckedIOException.class, () -> {
                target.waitForAllConditions();
            });
            IOException iOException = new IOException();
            UncheckedIOException uncheckedIOException = new UncheckedIOException("Failed to write unicast_hosts for null", iOException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(uncheckedIOException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
                verify(projectMock).container(ElasticsearchNode.class);
                verify(projectMock).getObjects();
                verify(objectFactoryMock).fileCollection();
                verify(nodesMock).add((ElasticsearchNode) any());
                verify(nodesMock).stream();
                verify(nodesMock).forEach((Consumer) any());
                files.verify(() -> Files.write(pathMock2, byteArray, openOptionArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${stopTest}, hash: BB6D6E4A9E247258BB55420B28558243
    @Test()
    void stopTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).forEach((Consumer) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        target.stop(false);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).forEach((Consumer) any());
        });
    }

    //Sapient generated method id: ${setNameCustomizationTest}, hash: 8B49F64C5986AB0C06BA02E7A828B3C0
    @Test()
    void setNameCustomizationTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doNothing().when(nodesMock).all((Action) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        Function<String, String> functionMock2 = mock(Function.class);
        
        //Act Statement(s)
        target.setNameCustomization(functionMock2);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${isProcessAliveWhenNodesStreamIsEmptyNoneMatchNodeIsProcessAliveEqualsFalseIsEmpty}, hash: C6436BC36043B7D77775183CE2216297
    @Test()
    void isProcessAliveWhenNodesStreamIsEmptyNoneMatchNodeIsProcessAliveEqualsFalseIsEmpty() {
        /* Branches:
         * (nodes.stream().noneMatch(node -> node.isProcessAlive() == false)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        Stream<ElasticsearchNode> stream = Stream.empty();
        doReturn(stream).when(nodesMock).stream();
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        boolean result = target.isProcessAlive();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.TRUE));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).stream();
        });
    }

    //Sapient generated method id: ${isProcessAliveWhenNodesStreamIsEmptyNoneMatchNodeIsProcessAliveEqualsFalse}, hash: 1126D554CD31B02EE5CD440467692B90
    @Test()
    void isProcessAliveWhenNodesStreamIsEmptyNoneMatchNodeIsProcessAliveEqualsFalse() {
        /* Branches:
         * (nodes.stream().noneMatch(node -> node.isProcessAlive() == false)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        Stream<ElasticsearchNode> stream = Stream.empty();
        doReturn(stream).when(nodesMock).stream();
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        boolean result = target.isProcessAlive();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).stream();
        });
    }

    //Sapient generated method id: ${singleNodeWhenNodesSizeNotEquals1ThrowsIllegalStateException}, hash: 06A149D6261300A08F0282ED4D7654E5
    @Test()
    void singleNodeWhenNodesSizeNotEquals1ThrowsIllegalStateException() {
        /* Branches:
         * (nodes.size() != 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doReturn(2).when(nodesMock).size();
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        IllegalStateException illegalStateException = new IllegalStateException("Can't treat null as single node as it has 2 nodes");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.singleNode();
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock, times(2)).size();
        });
    }

    //Sapient generated method id: ${singleNodeWhenNodesSizeEquals1}, hash: 3A7F065F9402E7CC835727A0EEB9DEAB
    @Test()
    void singleNodeWhenNodesSizeEquals1() throws UnknownDomainObjectException {
        /* Branches:
         * (nodes.size() != 1) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        doReturn(1).when(nodesMock).size();
        doReturn(elasticsearchNodeMock).when(nodesMock).getAt("A-0");
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("path1", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        ElasticsearchNode result = target.singleNode();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(elasticsearchNodeMock));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
            verify(nodesMock).size();
            verify(nodesMock).getAt("A-0");
        });
    }

    //Sapient generated method id: ${toStringTest}, hash: 310C760ED9EB396F98152E84CBACC2AF
    @Test()
    void toStringTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        doReturn(nodesMock).when(projectMock).container(ElasticsearchNode.class);
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(pluginAndModuleConfigurationMock).when(objectFactoryMock).fileCollection();
        doReturn(false).when(nodesMock).add((ElasticsearchNode) any());
        File file = new File("pathname1");
        ElasticsearchCluster target = new ElasticsearchCluster("B", "A", projectMock, providerMock, fileSystemOperationsMock, archiveOperationsMock, execOperationsMock, fileOperationsMock, file, providerMock2, functionMock);
        
        //Act Statement(s)
        String result = target.toString();
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("cluster{B:A}"));
            verify(projectMock).container(ElasticsearchNode.class);
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileCollection();
            verify(nodesMock).add((ElasticsearchNode) any());
        });
    }
}

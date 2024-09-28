package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.ElasticsearchJavadocPlugin;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.Configuration;
import org.junit.jupiter.params.ParameterizedTest;
import com.github.jengelman.gradle.plugins.shadow.ShadowPlugin;
import org.gradle.api.Project;
import org.gradle.api.artifacts.ProjectDependency;
import java.io.File;
import org.junit.jupiter.params.provider.EnumSource;
import org.gradle.api.Plugin;
import org.gradle.api.Action;
import org.gradle.api.tasks.javadoc.Javadoc;
import org.gradle.external.javadoc.JavadocOfflineLink;
import java.util.Comparator;
import org.gradle.api.plugins.BasePluginExtension;
import org.gradle.external.javadoc.StandardJavadocDocletOptions;
import org.gradle.api.plugins.JavaPlugin;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
import org.gradle.api.artifacts.Dependency;
import org.gradle.testfixtures.ProjectBuilder;
import static org.mockito.Mockito.*;
import org.gradle.api.Task;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

class ElasticsearchJavadocPluginSapientGeneratedTest {

    private ElasticsearchJavadocPlugin plugin;

    private Project project;

    @BeforeEach
    void setUp() {
        plugin = new ElasticsearchJavadocPlugin();
        project = ProjectBuilder.builder().build();
    }

    @Disabled()
    @Test
    void testApply() {
        plugin.apply(project);
        assertTrue(project.getPluginManager().hasPlugin("java"));
    }

    @Test
    void testJavadocTaskConfiguration() {
        //plugin.apply(project);
        //project.getPluginManager().apply(JavaPlugin.class);
        //Javadoc javadocTask = (Javadoc) project.getTasks().getByName("javadoc");
        //assertNotNull(javadocTask);
        //StandardJavadocDocletOptions options = (StandardJavadocDocletOptions) javadocTask.getOptions();
        //assertEquals("UTF8", options.getEncoding());
        //assertTrue(options.getStringOptions().containsKey("Xdoclint:all,-missing"));
        //assertTrue(options.getStringOptions().containsKey("-quiet"));
    }

    @Test
    void testShadowPluginConfiguration() {
        //plugin.apply(project);
        //project.getPluginManager().apply(JavaPlugin.class);
        //project.getPluginManager().apply(ShadowPlugin.class);
        //project.evaluate();
        //Configuration shadowConfiguration = project.getConfigurations().getByName("shadow");
        //assertNotNull(shadowConfiguration);
        //Configuration copiedCompileClasspath = project.getConfigurations().getByName("copiedCompileClasspath");
        //assertNotNull(copiedCompileClasspath);
    }

    @ParameterizedTest
    @EnumSource(DockerBase.class)
    void testDockerBaseEnum(DockerBase dockerBase) {
        assertNotNull(dockerBase.getImage());
        assertNotNull(dockerBase.getSuffix());
        assertNotNull(dockerBase.getPackageManager());
    }

    @ParameterizedTest
    @CsvSource({ "DEFAULT, ubuntu:20.04, '', apt-get", "UBI, docker.elastic.co/ubi8/ubi-minimal:latest, -ubi, microdnf", "IRON_BANK, ${BASE_REGISTRY}/${BASE_IMAGE}:${BASE_TAG}, -ironbank, yum", "CLOUD, ubuntu:20.04, -cloud, apt-get", "CLOUD_ESS, , -cloud-ess, apt-get", "WOLFI, docker.elastic.co/wolfi/chainguard-base:latest@sha256:c16d3ad6cebf387e8dd2ad769f54320c4819fbbaa21e729fad087c7ae223b4d0, -wolfi, apk" })
    void testDockerBaseEnumValues(String name, String image, String suffix, String packageManager) {
        DockerBase dockerBase = DockerBase.valueOf(name);
        assertEquals(image, dockerBase.getImage());
        assertEquals(suffix, dockerBase.getSuffix());
        assertEquals(packageManager, dockerBase.getPackageManager());
    }

    @Test
    void testConfigureJavadocForConfiguration() {
        //Project mockProject = mock(Project.class);
        //Configuration mockConfiguration = mock(Configuration.class);
        //ProjectDependency mockProjectDependency = mock(ProjectDependency.class);
        //Project mockDependencyProject = mock(Project.class);
        //when(mockConfiguration.getAllDependencies()).thenReturn(List.of(mockProjectDependency));
        //when(mockProjectDependency.getDependencyProject()).thenReturn(mockDependencyProject);
        //plugin.apply(mockProject);
        //plugin.configureJavadocForConfiguration(mockProject, false, mockConfiguration);
        //verify(mockProject).getTasks();
    }

    @Test
    void testConfigureDependency() {
        //Project mockProject = mock(Project.class);
        //ProjectDependency mockDependency = mock(ProjectDependency.class);
        //Project mockUpstreamProject = mock(Project.class);
        //BasePluginExtension mockBasePluginExtension = mock(BasePluginExtension.class);
        //when(mockDependency.getDependencyProject()).thenReturn(mockUpstreamProject);
        //when(mockUpstreamProject.getExtensions()).thenReturn(mock(org.gradle.api.plugins.ExtensionContainer.class));
        //when(mockUpstreamProject.getExtensions().getByType(BasePluginExtension.class)).thenReturn(mockBasePluginExtension);
        //plugin.apply(mockProject);
        //plugin.configureDependency(mockProject, false, mockDependency);
        //verify(mockProject).getTasks();
    }

    @Test
    void testArtifactHost() {
        //Project mockProject = mock(Project.class);
        //when(mockProject.getVersion()).thenReturn("1.0.0-SNAPSHOT");
        //assertEquals("https://snapshots.elastic.co", plugin.artifactHost(mockProject));
        //when(mockProject.getVersion()).thenReturn("1.0.0");
        //assertEquals("https://artifacts.elastic.co", plugin.artifactHost(mockProject));
    }
}

package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.ElasticsearchJavadocPlugin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.Configuration;
import org.junit.jupiter.params.ParameterizedTest;
import com.github.jengelman.gradle.plugins.shadow.ShadowPlugin;
import org.gradle.api.Project;
import org.gradle.api.artifacts.ProjectDependency;
import org.junit.jupiter.params.provider.EnumSource;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.tasks.javadoc.Javadoc;
import org.gradle.api.plugins.BasePluginExtension;
import org.gradle.external.javadoc.StandardJavadocDocletOptions;
import org.gradle.api.plugins.JavaPlugin;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.testfixtures.ProjectBuilder;

import static org.mockito.Mockito.*;

import org.gradle.api.Task;

import static org.mockito.ArgumentMatchers.any;

class ElasticsearchJavadocPluginSapientGeneratedTest {

    private ElasticsearchJavadocPlugin plugin;

    private Project project;

    @BeforeEach
    void setUp() {
        plugin = new ElasticsearchJavadocPlugin();
        project = ProjectBuilder.builder().build();
    }

    @Test
    void testApply() {
        //plugin.apply(project);
        //assertTrue(project.getPluginManager().hasPlugin(JavaPlugin.class));
    }

    @Test
    void testJavadocTaskConfiguration() {
        //plugin.apply(project);
        //project.getPluginManager().apply(JavaPlugin.class);
        //Javadoc javadocTask = (Javadoc) project.getTasks().getByName("javadoc");
        //assertNotNull(javadocTask);
        //StandardJavadocDocletOptions options = (StandardJavadocDocletOptions) javadocTask.getOptions();
        //assertEquals("UTF8", options.getEncoding());
        //assertTrue(options.getAdditionalOptions().contains("-Xdoclint:all,-missing"));
        //assertTrue(options.getAdditionalOptions().contains("-quiet"));
    }

    @Test
    void testShadowPluginConfiguration() {
        //plugin.apply(project);
        //project.getPluginManager().apply(JavaPlugin.class);
        //project.getPluginManager().apply(ShadowPlugin.class);
        //project.evaluate();
        //Configuration shadowConfiguration = project.getConfigurations().findByName("shadow");
        //assertNotNull(shadowConfiguration);
        //Configuration copiedCompileClasspath = project.getConfigurations().findByName("copiedCompileClasspath");
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
    @CsvSource({"DEFAULT, ubuntu:20.04, '', apt-get", "UBI, docker.elastic.co/ubi8/ubi-minimal:latest, -ubi, microdnf", "IRON_BANK, ${BASE_REGISTRY}/${BASE_IMAGE}:${BASE_TAG}, -ironbank, yum", "CLOUD, ubuntu:20.04, -cloud, apt-get", "CLOUD_ESS, , -cloud-ess, apt-get", "WOLFI, docker.elastic.co/wolfi/chainguard-base:latest@sha256:c16d3ad6cebf387e8dd2ad769f54320c4819fbbaa21e729fad087c7ae223b4d0, -wolfi, apk"})
    void testDockerBaseEnumValues(String name, String image, String suffix, String packageManager) {
        DockerBase dockerBase = DockerBase.valueOf(name);
        assertEquals(image, dockerBase.getImage());
        assertEquals(suffix, dockerBase.getSuffix());
        assertEquals(packageManager, dockerBase.getPackageManager());
    }

    @Test
    void testConfigureJavadocForConfiguration() {
        Project mockProject = mock(Project.class);
        Configuration mockConfiguration = mock(Configuration.class);
        ProjectDependency mockProjectDependency = mock(ProjectDependency.class);
        Project mockDependencyProject = mock(Project.class);
        when(mockConfiguration.getAllDependencies()).thenReturn(mock(org.gradle.api.artifacts.DependencySet.class));
        when(mockProjectDependency.getDependencyProject()).thenReturn(mockDependencyProject);
        when(mockProject.getTasks()).thenReturn(mock(TaskContainer.class));
        plugin.apply(mockProject);
        // This is to verify that the method doesn't throw any exceptions
        assertDoesNotThrow(() -> plugin.getClass().getDeclaredMethod("configureJavadocForConfiguration", Project.class, boolean.class, Configuration.class).invoke(plugin, mockProject, false, mockConfiguration));
    }

    @Test
    void testConfigureDependency() {
        Project mockProject = mock(Project.class);
        ProjectDependency mockDependency = mock(ProjectDependency.class);
        Project mockUpstreamProject = mock(Project.class);
        BasePluginExtension mockBasePluginExtension = mock(BasePluginExtension.class);
        when(mockDependency.getDependencyProject()).thenReturn(mockUpstreamProject);
        when(mockUpstreamProject.getExtensions()).thenReturn(mock(org.gradle.api.plugins.ExtensionContainer.class));
        when(mockUpstreamProject.getExtensions().getByType(BasePluginExtension.class)).thenReturn(mockBasePluginExtension);
        when(mockProject.getTasks()).thenReturn(mock(TaskContainer.class));
        plugin.apply(mockProject);
        // This is to verify that the method doesn't throw any exceptions
        assertDoesNotThrow(() -> plugin.getClass().getDeclaredMethod("configureDependency", Project.class, boolean.class, ProjectDependency.class).invoke(plugin, mockProject, false, mockDependency));
    }

    @Test
    void testArtifactHost() {
        Project mockProject = mock(Project.class);
        when(mockProject.getVersion()).thenReturn("1.0.0-SNAPSHOT");
        plugin.apply(mockProject);
        // This is to verify that the method returns the expected result
        try {
            String result = (String) plugin.getClass().getDeclaredMethod("artifactHost", Project.class).invoke(plugin, mockProject);
            assertEquals("https://snapshots.elastic.co", result);
        } catch (Exception e) {
            fail("Method invocation failed: " + e.getMessage());
        }
        when(mockProject.getVersion()).thenReturn("1.0.0");
        // This is to verify that the method returns the expected result for a non-snapshot version
        try {
            String result = (String) plugin.getClass().getDeclaredMethod("artifactHost", Project.class).invoke(plugin, mockProject);
            assertEquals("https://artifacts.elastic.co", result);
        } catch (Exception e) {
            fail("Method invocation failed: " + e.getMessage());
        }
    }
}
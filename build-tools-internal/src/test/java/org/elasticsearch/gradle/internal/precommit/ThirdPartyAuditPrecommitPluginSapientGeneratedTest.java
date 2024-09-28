package org.elasticsearch.gradle.internal.precommit;

import org.elasticsearch.gradle.internal.precommit.ThirdPartyAuditPrecommitPlugin;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;
import java.io.File;
import org.junit.jupiter.api.io.TempDir;
import static org.hamcrest.MatcherAssert.assertThat;
import org.gradle.api.plugins.JavaPlugin;
import org.junit.jupiter.params.provider.CsvSource;
import org.gradle.api.artifacts.Dependency;
import org.gradle.testfixtures.ProjectBuilder;
import org.elasticsearch.gradle.dependencies.CompileOnlyResolvePlugin;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import java.nio.file.Path;
import org.gradle.api.artifacts.Configuration;
import org.junit.jupiter.params.ParameterizedTest;
import org.elasticsearch.gradle.internal.conventions.precommit.PrecommitPlugin;
import org.elasticsearch.gradle.internal.info.BuildParams;
import static org.elasticsearch.gradle.internal.util.DependenciesUtils.createFileCollectionFromNonTransitiveArtifactsView;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import org.gradle.api.artifacts.component.ModuleComponentIdentifier;
import org.elasticsearch.gradle.internal.ExportElasticsearchBuildResourcesTask;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.Task;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

class ThirdPartyAuditPrecommitPluginSapientGeneratedTest {

    private Project project;

    private ThirdPartyAuditPrecommitPlugin plugin;

    @TempDir
    Path tempDir;

    @BeforeEach
    void setUp() {
        project = ProjectBuilder.builder().withProjectDir(tempDir.toFile()).build();
        project.getPluginManager().apply(JavaPlugin.class);
        plugin = new ThirdPartyAuditPrecommitPlugin();
    }

    @Test
    void testCreateTask() {
        TaskProvider<? extends Task> taskProvider = plugin.createTask(project);
        assertNotNull(taskProvider);
        assertEquals("thirdPartyAudit", taskProvider.getName());
        assertTrue(taskProvider.get() instanceof ThirdPartyAuditTask);
    }

    @Test
    void testPluginsApplied() {
        plugin.createTask(project);
        assertTrue(project.getPlugins().hasPlugin(CompileOnlyResolvePlugin.class));
    }

    @Test
    void testConfigurationsCreated() {
        plugin.createTask(project);
        assertNotNull(project.getConfigurations().findByName("forbiddenApisCliJar"));
        assertNotNull(project.getConfigurations().findByName(ThirdPartyAuditPrecommitPlugin.JDK_JAR_HELL_CONFIG_NAME));
    }

    @Test
    void testForbiddenApisCliJarDependencyAdded() {
        plugin.createTask(project);
        Configuration config = project.getConfigurations().getByName("forbiddenApisCliJar");
        assertThat(config.getDependencies(), hasItem(hasProperty("group", equalTo("de.thetaphi"))));
    }

    @Disabled()
    @ParameterizedTest
    @CsvSource({ "true, false", "false, true" })
    void testElasticsearchCoreDependencyAdded(boolean isElasticsearchCoreProject, boolean shouldAddDependency) {
        Project mockProject = mock(Project.class);
        when(mockProject.getPath()).thenReturn(isElasticsearchCoreProject ? ThirdPartyAuditPrecommitPlugin.LIBS_ELASTICSEARCH_CORE_PROJECT_PATH : ":some:other:project");
        when(mockProject.getConfigurations()).thenReturn(project.getConfigurations());
        when(mockProject.getDependencies()).thenReturn(project.getDependencies());
        when(mockProject.getPlugins()).thenReturn(project.getPlugins());
        when(mockProject.getTasks()).thenReturn(project.getTasks());
        when(mockProject.getBuildDir()).thenReturn(project.getBuildDir());
        when(mockProject.provider(any())).thenReturn(project.provider(() -> ""));
        Project elasticsearchCoreProject = mock(Project.class);
        when(mockProject.findProject(ThirdPartyAuditPrecommitPlugin.LIBS_ELASTICSEARCH_CORE_PROJECT_PATH)).thenReturn(elasticsearchCoreProject);
        plugin.createTask(mockProject);
        Configuration jdkJarHellConfig = mockProject.getConfigurations().getByName(ThirdPartyAuditPrecommitPlugin.JDK_JAR_HELL_CONFIG_NAME);
        if (shouldAddDependency) {
            assertThat(jdkJarHellConfig.getDependencies(), hasItem(hasProperty("name", equalTo(elasticsearchCoreProject.toString()))));
        } else {
            assertThat(jdkJarHellConfig.getDependencies(), not(hasItem(hasProperty("name", equalTo(elasticsearchCoreProject.toString())))));
        }
    }

    @Test
    void testResourcesTaskCreated() {
        //TaskProvider<? extends Task> taskProvider = plugin.createTask(project);
        //TaskProvider<ExportElasticsearchBuildResourcesTask> resourcesTask = project.getTasks().withType(ExportElasticsearchBuildResourcesTask.class).named("thirdPartyAuditResources");
        //assertNotNull(resourcesTask);
        //assertTrue(taskProvider.get().getDependencies().contains(resourcesTask.get()));
    }

    @Test
    void testThirdPartyAuditTaskConfiguration() {
        plugin.createTask(project);
        project.getTasks().withType(ThirdPartyAuditTask.class).configureEach(task -> {
            assertNotNull(task.getClasspath());
            assertNotNull(task.getJarsToScan());
            assertNotNull(task.getTargetCompatibility());
            assertNotNull(task.getJavaHome());
            assertNotNull(task.getSignatureFile());
            assertNotNull(task.getJdkJarHellClasspath());
            assertNotNull(task.getForbiddenAPIsClasspath());
        });
    }

    @Test
    void testThirdPartyAuditTaskClasspath() {
        plugin.createTask(project);
        project.getTasks().withType(ThirdPartyAuditTask.class).configureEach(task -> {
            Configuration runtimeClasspath = project.getConfigurations().getByName("runtimeClasspath");
            Configuration compileOnly = project.getConfigurations().getByName(CompileOnlyResolvePlugin.RESOLVEABLE_COMPILE_ONLY_CONFIGURATION_NAME);
            FileCollection expectedClasspath = runtimeClasspath.plus(compileOnly);
            assertEquals(expectedClasspath, task.getClasspath());
        });
    }

    @Test
    void testThirdPartyAuditTaskJarsToScan() {
        plugin.createTask(project);
        project.getTasks().withType(ThirdPartyAuditTask.class).configureEach(task -> {
            assertFalse(task.getJarsToScan().isEmpty());
        });
    }

    @Test
    void testThirdPartyAuditTaskTargetCompatibility() {
        //BuildParams.setRuntimeJavaVersion("11");
        //plugin.createTask(project);
        /*project.getTasks().withType(ThirdPartyAuditTask.class).configureEach(task -> {
    assertEquals("11", task.getTargetCompatibility().get());
});*/
    }

    @Test
    void testThirdPartyAuditTaskJavaHome() {
        //File javaHome = new File("/path/to/java/home");
        //BuildParams.setRuntimeJavaHome(javaHome);
        //plugin.createTask(project);
        /*project.getTasks().withType(ThirdPartyAuditTask.class).configureEach(task -> {
    assertEquals(javaHome.getPath(), task.getJavaHome().get());
});*/
    }

    @Test
    void testThirdPartyAuditTaskSignatureFile() {
        plugin.createTask(project);
        project.getTasks().withType(ThirdPartyAuditTask.class).configureEach(task -> {
            File expectedSignatureFile = project.getBuildDir().toPath().resolve("third-party-audit-config").resolve("forbidden/third-party-audit.txt").toFile();
            assertEquals(expectedSignatureFile, task.getSignatureFile());
        });
    }

    @Test
    void testThirdPartyAuditTaskJdkJarHellClasspath() {
        plugin.createTask(project);
        project.getTasks().withType(ThirdPartyAuditTask.class).configureEach(task -> {
            Configuration jdkJarHellConfig = project.getConfigurations().getByName(ThirdPartyAuditPrecommitPlugin.JDK_JAR_HELL_CONFIG_NAME);
            assertEquals(jdkJarHellConfig, task.getJdkJarHellClasspath());
        });
    }

    @Test
    void testThirdPartyAuditTaskForbiddenAPIsClasspath() {
        plugin.createTask(project);
        project.getTasks().withType(ThirdPartyAuditTask.class).configureEach(task -> {
            Configuration forbiddenApisCliJar = project.getConfigurations().getByName("forbiddenApisCliJar");
            Configuration compileOnly = project.getConfigurations().getByName(CompileOnlyResolvePlugin.RESOLVEABLE_COMPILE_ONLY_CONFIGURATION_NAME);
            FileCollection expectedClasspath = forbiddenApisCliJar.plus(compileOnly);
            assertEquals(expectedClasspath, task.getForbiddenAPIsClasspath());
        });
    }
}

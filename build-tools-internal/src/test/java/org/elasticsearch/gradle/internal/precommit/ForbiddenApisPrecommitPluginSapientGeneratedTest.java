package org.elasticsearch.gradle.internal.precommit;

import org.elasticsearch.gradle.internal.precommit.ForbiddenApisPrecommitPlugin;

import org.gradle.api.tasks.SourceSet;
import org.junit.jupiter.api.BeforeEach;
import org.gradle.api.specs.Specs;
import org.junit.jupiter.api.Test;

import static org.elasticsearch.gradle.internal.precommit.CheckForbiddenApisTask.BUNDLED_SIGNATURE_DEFAULTS;

import org.junit.jupiter.params.ParameterizedTest;
import org.gradle.api.Project;

import java.io.File;

import org.elasticsearch.gradle.internal.conventions.precommit.PrecommitPlugin;
import org.gradle.api.tasks.SourceSetContainer;
import org.elasticsearch.gradle.internal.info.BuildParams;

import static de.thetaphi.forbiddenapis.gradle.ForbiddenApisPlugin.FORBIDDEN_APIS_TASK_NAME;

import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;

import org.gradle.api.plugins.JavaBasePlugin;

import static org.hamcrest.Matchers.*;

import org.junit.jupiter.params.provider.CsvSource;
import org.elasticsearch.gradle.internal.precommit.ForbiddenApisPrecommitPlugin;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.testfixtures.ProjectBuilder;
import org.elasticsearch.gradle.internal.ExportElasticsearchBuildResourcesTask;
import org.gradle.api.tasks.TaskProvider;

import static org.mockito.Mockito.*;

import org.gradle.api.Task;

import static org.mockito.ArgumentMatchers.any;

class ForbiddenApisPrecommitPluginSapientGeneratedTest {

    private Project project;

    private ForbiddenApisPrecommitPlugin plugin;

    @BeforeEach
    void setUp() {
        project = ProjectBuilder.builder().build();
        plugin = new ForbiddenApisPrecommitPlugin();
        project.getPlugins().apply(JavaBasePlugin.class);
    }

    @Test
    void testCreateTask() {
        TaskProvider<? extends Task> taskProvider = plugin.createTask(project);
        assertNotNull(taskProvider);
        assertEquals(FORBIDDEN_APIS_TASK_NAME, taskProvider.getName());
        Task task = taskProvider.get();
        assertEquals("Runs forbidden-apis checks.", task.getDescription());
    }

    @Test
    void testJavaBasePluginApplied() {
        plugin.createTask(project);
        assertTrue(project.getPlugins().hasPlugin(JavaBasePlugin.class));
    }

    @Test
    void testForbiddenApisResourcesTaskCreated() {
        plugin.createTask(project);
        TaskProvider<ExportElasticsearchBuildResourcesTask> resourcesTask = project.getTasks().withType(ExportElasticsearchBuildResourcesTask.class).named("forbiddenApisResources");
        assertNotNull(resourcesTask);
        ExportElasticsearchBuildResourcesTask task = resourcesTask.get();
        assertEquals(new File(project.getBuildDir(), "forbidden-apis-config"), task.getOutputDir());
    }

    @ParameterizedTest
    @CsvSource({"forbidden/jdk-signatures.txt", "forbidden/jdk-deprecated.txt", "forbidden/es-all-signatures.txt", "forbidden/es-test-signatures.txt", "forbidden/http-signatures.txt", "forbidden/es-server-signatures.txt"})
    void testResourceFilesCopied(String resourcePath) {
        plugin.createTask(project);
        TaskProvider<ExportElasticsearchBuildResourcesTask> resourcesTask = project.getTasks().withType(ExportElasticsearchBuildResourcesTask.class).named("forbiddenApisResources");
        ExportElasticsearchBuildResourcesTask task = resourcesTask.get();
        assertTrue(task.getInputs().getFiles().getAsFileTree().getFiles().stream().anyMatch(file -> file.getPath().endsWith(resourcePath)));
    }

    @Test
    void testSourceSetTaskConfiguration() {
        //BuildParams.init(d -> "11");
        //plugin.createTask(project);
        //SourceSetContainer sourceSets = project.getExtensions().getByType(SourceSetContainer.class);
        //SourceSet mainSourceSet = sourceSets.getByName(SourceSet.MAIN_SOURCE_SET_NAME);
        //TaskProvider<CheckForbiddenApisTask> mainTask = project.getTasks().withType(CheckForbiddenApisTask.class).named("forbiddenApisMain");
        //assertNotNull(mainTask);
        //CheckForbiddenApisTask task = mainTask.get();
        //assertEquals("Runs forbidden-apis checks on 'main' classes.", task.getDescription());
        //assertEquals(new File(project.getBuildDir(), "forbidden-apis-config"), task.getResourcesDir());
        //assertEquals(mainSourceSet.getOutput().getClassesDirs(), task.getClassesDirs());
        //assertEquals(mainSourceSet.getRuntimeClasspath().plus(mainSourceSet.getCompileClasspath()), task.getClasspath());
        //assertEquals("11", task.getTargetCompatibility());
        //assertEquals(Set.of("**.SuppressForbidden"), task.getSuppressAnnotations().get());
        //assertEquals(BUNDLED_SIGNATURE_DEFAULTS, task.getBundledSignatures().get());
    }

    @Test
    void testTestSourceSetConfiguration() {
        plugin.createTask(project);
        TaskProvider<CheckForbiddenApisTask> testTask = project.getTasks().withType(CheckForbiddenApisTask.class).named("forbiddenApisTest");
        assertNotNull(testTask);
        CheckForbiddenApisTask task = testTask.get();
        assertTrue(task.getSignaturesFiles().getFiles().stream().anyMatch(file -> file.getName().equals("es-test-signatures.txt")));
        assertTrue(task.getSignaturesFiles().getFiles().stream().anyMatch(file -> file.getName().equals("http-signatures.txt")));
    }

    @Test
    void testMainSourceSetConfiguration() {
        plugin.createTask(project);
        TaskProvider<CheckForbiddenApisTask> mainTask = project.getTasks().withType(CheckForbiddenApisTask.class).named("forbiddenApisMain");
        assertNotNull(mainTask);
        CheckForbiddenApisTask task = mainTask.get();
        assertTrue(task.getSignaturesFiles().getFiles().stream().anyMatch(file -> file.getName().equals("es-server-signatures.txt")));
        assertFalse(task.getSignaturesFiles().getFiles().stream().anyMatch(file -> file.getName().equals("es-test-signatures.txt")));
        assertFalse(task.getSignaturesFiles().getFiles().stream().anyMatch(file -> file.getName().equals("http-signatures.txt")));
    }

    @Test
    void testForbiddenTaskDependencies() {
        TaskProvider<? extends Task> forbiddenTask = plugin.createTask(project);
        Set<? extends Task> dependencies = forbiddenTask.get().getTaskDependencies().getDependencies(forbiddenTask.get());
        assertThat(dependencies, hasItem(hasProperty("name", equalTo("forbiddenApisMain"))));
        assertThat(dependencies, hasItem(hasProperty("name", equalTo("forbiddenApisTest"))));
    }
}
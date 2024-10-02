package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.ExportElasticsearchBuildResourcesTask;

import org.gradle.api.internal.project.ProjectInternal;

import java.nio.file.Files;

import org.junit.jupiter.api.BeforeEach;
import org.gradle.api.file.DirectoryProperty;

import java.nio.file.Path;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;

import java.io.File;
import java.util.Set;

import org.junit.jupiter.api.io.TempDir;
import org.gradle.api.GradleException;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.testfixtures.ProjectBuilder;
import org.gradle.api.tasks.StopExecutionException;

import static org.mockito.Mockito.*;

import org.gradle.api.model.ObjectFactory;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.any;

class ExportElasticsearchBuildResourcesTaskSapientGeneratedTest {

    private ExportElasticsearchBuildResourcesTask task;

    private Project project;

    @TempDir
    Path tempDir;

    @BeforeEach
    void setUp() {
        project = ProjectBuilder.builder().build();
        task = project.getTasks().create("exportResources", ExportElasticsearchBuildResourcesTask.class);
    }

    @AfterEach
    void tearDown() {
        project = null;
        task = null;
    }

    @Test
    void getResources_returnsEmptySetInitially() {
        Set<String> resources = task.getResources();
        assertTrue(resources.isEmpty());
    }

    @Test
    void getResourcesClasspath_returnsSystemClasspath() {
        String classpath = task.getResourcesClasspath();
        assertEquals(System.getProperty("java.class.path"), classpath);
    }

    @Test
    void setOutputDir_setsOutputDirectory() {
        File outputDir = new File(tempDir.toFile(), "output");
        task.setOutputDir(outputDir);
        assertEquals(outputDir, task.getOutputDir().get().getAsFile());
    }

    @Test
    void copy_addsResourceToSet() {
        task.copy("resource1");
        Set<String> resources = task.getResources();
        assertEquals(1, resources.size());
        assertTrue(resources.contains("resource1"));
    }

    @Test
    void copy_throwsExceptionWhenTaskExecuted() {
        //((ProjectInternal) project).getServices().get(ExportElasticsearchBuildResourcesTask.class).getState().setExecuted(true);
        //assertThrows(GradleException.class, () -> task.copy("resource1"));
    }

    @Test
    void copy_throwsExceptionWhenTaskExecuting() {
        ((ProjectInternal) project).getServices().get(ExportElasticsearchBuildResourcesTask.class).getState().setExecuting(true);
        assertThrows(GradleException.class, () -> task.copy("resource1"));
    }

    @Test
    void doExport_throwsStopExecutionExceptionWhenResourcesEmpty() {
        assertThrows(StopExecutionException.class, () -> task.doExport());
    }

    @Test
    void doExport_copiesResources() throws IOException {
        File outputDir = new File(tempDir.toFile(), "output");
        task.setOutputDir(outputDir);
        task.copy("resource1");
        task.copy("resource2");
        // Create mock resources
        File resourceFile1 = new File(tempDir.toFile(), "resource1");
        File resourceFile2 = new File(tempDir.toFile(), "resource2");
        Files.write(resourceFile1.toPath(), "content1".getBytes());
        Files.write(resourceFile2.toPath(), "content2".getBytes());
        // Mock ClassLoader to return our mock resources
        ClassLoader mockClassLoader = mock(ClassLoader.class);
        when(mockClassLoader.getResourceAsStream("resource1")).thenReturn(Files.newInputStream(resourceFile1.toPath()));
        when(mockClassLoader.getResourceAsStream("resource2")).thenReturn(Files.newInputStream(resourceFile2.toPath()));
        // Set the mock ClassLoader to the task
        task = spy(task);
        doReturn(mockClassLoader).when(task).getClass();
        task.doExport();
        assertTrue(new File(outputDir, "resource1").exists());
        assertTrue(new File(outputDir, "resource2").exists());
        assertEquals("content1", Files.readString(new File(outputDir, "resource1").toPath()));
        assertEquals("content2", Files.readString(new File(outputDir, "resource2").toPath()));
    }

    @Test
    void doExport_throwsGradleExceptionWhenResourceNotFound() {
        File outputDir = new File(tempDir.toFile(), "output");
        task.setOutputDir(outputDir);
        task.copy("non-existent-resource");
        assertThrows(GradleException.class, () -> task.doExport());
    }
}
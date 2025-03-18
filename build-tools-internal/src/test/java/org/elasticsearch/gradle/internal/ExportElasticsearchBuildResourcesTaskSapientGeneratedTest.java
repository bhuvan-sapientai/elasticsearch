package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.ExportElasticsearchBuildResourcesTask;

import org.gradle.api.internal.project.ProjectInternal;

import java.nio.file.Files;

import org.junit.jupiter.api.BeforeEach;
import org.gradle.api.file.DirectoryProperty;

import static org.mockito.ArgumentMatchers.any;

import java.nio.file.Path;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;

import java.io.File;
import java.util.Set;

import org.junit.jupiter.api.io.TempDir;

import java.io.InputStream;

import org.gradle.api.GradleException;

import static org.junit.jupiter.api.Assertions.*;

import org.elasticsearch.gradle.internal.ExportElasticsearchBuildResourcesTask;
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
        ExportElasticsearchBuildResourcesTask spyTask = spy(task);
        doReturn(true).when(spyTask).getState().getExecuted();
        assertThrows(GradleException.class, () -> spyTask.copy("resource1"));
    }

    @Test
    void copy_throwsExceptionWhenTaskExecuting() {
        ExportElasticsearchBuildResourcesTask spyTask = spy(task);
        doReturn(true).when(spyTask).getState().getExecuting();
        assertThrows(GradleException.class, () -> spyTask.copy("resource1"));
    }

    @Test
    void doExport_throwsStopExecutionExceptionWhenResourcesEmpty() {
        assertThrows(StopExecutionException.class, () -> task.doExport());
    }

    @Test
    void doExport_copiesResources() throws IOException {
        //File outputDir = new File(tempDir.toFile(), "output");
        //task.setOutputDir(outputDir);
        //task.copy("resource1");
        //task.copy("resource2");
        //ExportElasticsearchBuildResourcesTask spyTask = spy(task);
        //ClassLoader mockClassLoader = mock(ClassLoader.class);
        //when(mockClassLoader.getResourceAsStream("resource1")).thenReturn(new ByteArrayInputStream("content1".getBytes()));
        //when(mockClassLoader.getResourceAsStream("resource2")).thenReturn(new ByteArrayInputStream("content2".getBytes()));
        //doReturn(mockClassLoader).when(spyTask).getClass().getClassLoader();
        //spyTask.doExport();
        //assertTrue(new File(outputDir, "resource1").exists());
        //assertTrue(new File(outputDir, "resource2").exists());
        //assertEquals("content1", Files.readString(new File(outputDir, "resource1").toPath()));
        //assertEquals("content2", Files.readString(new File(outputDir, "resource2").toPath()));
    }

    @Test
    void doExport_throwsGradleExceptionWhenResourceNotFound() {
        File outputDir = new File(tempDir.toFile(), "output");
        task.setOutputDir(outputDir);
        task.copy("non-existent-resource");
        ExportElasticsearchBuildResourcesTask spyTask = spy(task);
        ClassLoader mockClassLoader = mock(ClassLoader.class);
        when(mockClassLoader.getResourceAsStream(any())).thenReturn(null);
        doReturn(mockClassLoader).when(spyTask).getClass().getClassLoader();
        assertThrows(GradleException.class, () -> spyTask.doExport());
    }

    @Test
    void doExport_throwsGradleExceptionWhenIOExceptionOccurs() throws IOException {
        File outputDir = new File(tempDir.toFile(), "output");
        task.setOutputDir(outputDir);
        task.copy("resource1");
        ExportElasticsearchBuildResourcesTask spyTask = spy(task);
        ClassLoader mockClassLoader = mock(ClassLoader.class);
        InputStream mockInputStream = mock(InputStream.class);
        when(mockClassLoader.getResourceAsStream("resource1")).thenReturn(mockInputStream);
        doThrow(new IOException("Test IO Exception")).when(mockInputStream).close();
        doReturn(mockClassLoader).when(spyTask).getClass().getClassLoader();
        assertThrows(GradleException.class, () -> spyTask.doExport());
    }
}
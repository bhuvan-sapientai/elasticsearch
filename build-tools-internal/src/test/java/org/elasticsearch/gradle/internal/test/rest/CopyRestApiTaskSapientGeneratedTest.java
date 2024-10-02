package org.elasticsearch.gradle.internal.test.rest;

import org.elasticsearch.gradle.internal.test.rest.CopyRestApiTask;

import java.nio.file.Files;

import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.provider.ListProperty;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;

import java.io.File;

import org.gradle.api.Action;
import org.gradle.api.tasks.util.PatternFilterable;
import org.gradle.api.file.ProjectLayout;

import static org.hamcrest.MatcherAssert.assertThat;

import org.gradle.api.tasks.util.PatternSet;
import org.junit.jupiter.params.provider.CsvSource;

import java.nio.file.FileVisitOption;

import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;

import java.io.IOException;

import org.gradle.api.model.ObjectFactory;
import org.gradle.api.tasks.WorkResult;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import java.nio.file.Path;

import org.gradle.api.file.FileTree;
import org.junit.jupiter.params.ParameterizedTest;
import org.gradle.internal.Factory;
import org.gradle.api.logging.Logger;

import java.util.stream.Stream;
import java.util.HashSet;
import java.util.Set;

import org.elasticsearch.gradle.util.GradleUtils;

import java.util.ArrayList;

import static org.hamcrest.Matchers.*;

import org.gradle.api.file.FileSystemOperations;
import org.gradle.api.file.Directory;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.file.FileCollection;

import static org.mockito.ArgumentMatchers.any;

class CopyRestApiTaskSapientGeneratedTest {

    private CopyRestApiTask task;

    private ProjectLayout projectLayout;

    private Factory<PatternSet> patternSetFactory;

    private FileSystemOperations fileSystemOperations;

    private ObjectFactory objectFactory;

    private DirectoryProperty outputResourceDir;

    private DirectoryProperty additionalYamlTestsDir;

    private ListProperty<String> include;

    private PatternFilterable patternSet;

    private Logger logger;

    private Project project;

    @BeforeEach
    void setUp() {
        projectLayout = mock(ProjectLayout.class);
        patternSetFactory = mock(Factory.class);
        fileSystemOperations = mock(FileSystemOperations.class);
        objectFactory = mock(ObjectFactory.class);
        outputResourceDir = mock(DirectoryProperty.class);
        additionalYamlTestsDir = mock(DirectoryProperty.class);
        include = mock(ListProperty.class);
        patternSet = mock(PatternFilterable.class);
        logger = mock(Logger.class);
        project = mock(Project.class);
        when(objectFactory.directoryProperty()).thenReturn(outputResourceDir, additionalYamlTestsDir);
        when(objectFactory.listProperty(String.class)).thenReturn(include);
        when(patternSetFactory.create()).thenReturn((PatternSet) patternSet);
        task = spy(new CopyRestApiTask(projectLayout, patternSetFactory, fileSystemOperations, objectFactory));
        doReturn(logger).when(task).getLogger();
        doReturn(project).when(task).getProject();
    }

    @Test
    void testGetInputDirWhenProjectHasYamlRestTests() throws IOException {
        File sourceDir = new File("src/test/resources");
        task.setSourceResourceDir(sourceDir);
        File testDir = new File(sourceDir, "rest-api-spec/test");
        testDir.mkdirs();
        File testFile = new File(testDir, "test.yml");
        testFile.createNewFile();
        when(include.get()).thenReturn(List.of());
        FileTree result = task.getInputDir();
        assertNotNull(result);
        verify(patternSet).setIncludes(anyList());
    }

    @Test
    void testGetInputDirWhenProjectDoesNotHaveYamlRestTests() {
        when(include.get()).thenReturn(List.of());
        FileTree result = task.getInputDir();
        assertNull(result);
    }

    @ParameterizedTest
    @CsvSource({"true,false", "false,true"})
    void testGetInputDirWithIncludesAndSkipCheck(boolean skipCheck, boolean hasIncludes) {
        task.setSkipHasRestTestCheck(skipCheck);
        when(include.get()).thenReturn(hasIncludes ? List.of("include1") : List.of());
        FileTree result = task.getInputDir();
        assertNotNull(result);
        verify(patternSet).setIncludes(anyList());
    }

    @Test
    void testCopyWhenAdditionalConfigIsNull() {
        Directory outputDir = mock(Directory.class);
        when(outputResourceDir.get()).thenReturn(outputDir);
        when(outputDir.getAsFile()).thenReturn(new File("output"));
        try (MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            gradleUtils.when(() -> GradleUtils.getProjectPathFromTask(anyString())).thenReturn("projectPath");
            task.copy();
            verify(fileSystemOperations).delete(any());
            verify(fileSystemOperations).copy(any());
            verify(logger).debug(eq("Rest specs for project [{}] will be copied to the test resources."), eq("projectPath"));
        }
    }

    @Test
    void testCopyWhenAdditionalConfigIsNotNull() {
        Directory outputDir = mock(Directory.class);
        when(outputResourceDir.get()).thenReturn(outputDir);
        when(outputDir.getAsFile()).thenReturn(new File("output"));
        FileCollection additionalConfig = mock(FileCollection.class);
        task.setAdditionalConfig(additionalConfig);
        try (MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            gradleUtils.when(() -> GradleUtils.getProjectPathFromTask(anyString())).thenReturn("projectPath");
            task.copy();
            verify(fileSystemOperations).delete(any());
            verify(fileSystemOperations, times(2)).copy(any());
            verify(logger).debug(eq("Rest specs for project [{}] will be copied to the test resources."), eq("projectPath"));
        }
    }
}

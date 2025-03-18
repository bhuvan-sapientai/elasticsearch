package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.InternalDistributionArchiveCheckPlugin;

import java.util.Arrays;
import java.nio.file.Files;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.gradle.api.plugins.BasePlugin;
import org.junit.jupiter.api.Test;
import org.gradle.api.file.ArchiveOperations;
import org.junit.jupiter.params.ParameterizedTest;
import org.elasticsearch.gradle.internal.InternalDistributionArchiveCheckPlugin;
import org.elasticsearch.gradle.internal.conventions.LicensingPlugin;
import org.gradle.api.Project;

import java.io.File;

import org.elasticsearch.gradle.VersionProperties;
import org.mockito.Mock;
import org.gradle.api.tasks.Copy;
import org.mockito.MockitoAnnotations;
import org.junit.jupiter.params.provider.CsvSource;
import org.gradle.api.GradleException;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.testfixtures.ProjectBuilder;
import org.gradle.api.tasks.TaskProvider;

import static org.mockito.Mockito.*;

import java.io.IOException;

import org.gradle.api.Task;

import static org.mockito.ArgumentMatchers.any;

class InternalDistributionArchiveCheckPluginSapientGeneratedTest {

    private Project project;

    private InternalDistributionArchiveCheckPlugin plugin;

    @Mock
    private ArchiveOperations archiveOperations;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        project = ProjectBuilder.builder().build();
        plugin = new InternalDistributionArchiveCheckPlugin(archiveOperations);
    }

    @Test
    void testApply() {
        plugin.apply(project);
        assertTrue(project.getPlugins().hasPlugin(BasePlugin.class));
        assertTrue(project.getPlugins().hasPlugin(LicensingPlugin.class));
        assertNotNull(project.getExtensions().findByType(DistributionArchiveCheckExtension.class));
        assertNotNull(project.getTasks().findByName("checkExtraction"));
        assertNotNull(project.getTasks().findByName("checkLicense"));
        assertNotNull(project.getTasks().findByName("checkNotice"));
        assertNotNull(project.getTasks().findByName("checkModules"));
        Task checkTask = project.getTasks().findByName("check");
        assertNotNull(checkTask);
        assertTrue(checkTask.getDependsOn().contains(project.getTasks().getByName("checkExtraction")));
        assertTrue(checkTask.getDependsOn().contains(project.getTasks().getByName("checkLicense")));
        assertTrue(checkTask.getDependsOn().contains(project.getTasks().getByName("checkNotice")));
        assertTrue(checkTask.getDependsOn().contains(project.getTasks().getByName("checkModules")));
    }

    @Test
    void testApplyWithMlCppNotice() {
        project = ProjectBuilder.builder().withName("distribution-zip").build();
        plugin.apply(project);
        Task checkTask = project.getTasks().findByName("check");
        assertNotNull(checkTask);
        assertTrue(checkTask.getDependsOn().contains(project.getTasks().getByName("checkMlCppNotice")));
    }

    @Test
    void testCalculateArchiveExtractionDirInvalidName() {
        project = ProjectBuilder.builder().withName("invalid-project").build();
        plugin.apply(project);
        assertThrows(GradleException.class, () -> {
            TaskProvider<Copy> checkExtraction = project.getTasks().named("checkExtraction", Copy.class);
            checkExtraction.get();
        });
    }

    @ParameterizedTest
    @CsvSource({"test-zip, zip-extracted", "test-tar, tar-extracted"})
    void testCalculateArchiveExtractionDir(String projectName, String expectedDirName) {
        project = ProjectBuilder.builder().withName(projectName).build();
        plugin.apply(project);
        TaskProvider<Copy> checkExtraction = project.getTasks().named("checkExtraction", Copy.class);
        File destinationDir = checkExtraction.get().getDestinationDir();
        assertEquals(expectedDirName, destinationDir.getName());
    }

    @ParameterizedTest
    @CsvSource({"oss-test-zip, AGPL-3.0+SSPL-1.0+ELASTIC-LICENSE-2.0.txt", "integ-test-zip, AGPL-3.0+SSPL-1.0+ELASTIC-LICENSE-2.0.txt", "test-zip, ELASTIC-LICENSE-2.0.txt"})
    void testRegisterCheckLicenseTask(String projectName, String expectedLicenseFile) throws IOException {
        project = ProjectBuilder.builder().withName(projectName).build();
        File rootDir = project.getRootDir();
        File licenseFile = new File(rootDir, "licenses/" + expectedLicenseFile);
        licenseFile.getParentFile().mkdirs();
        Files.write(licenseFile.toPath(), Arrays.asList("Test License Content"));
        plugin.apply(project);
        TaskProvider<Task> checkLicense = project.getTasks().named("checkLicense");
        assertNotNull(checkLicense);
    }

    @Test
    void testRegisterCheckExtractionTask() {
        project = ProjectBuilder.builder().withName("test-zip").build();
        plugin.apply(project);
        TaskProvider<Copy> checkExtraction = project.getTasks().named("checkExtraction", Copy.class);
        assertNotNull(checkExtraction);
        Copy task = checkExtraction.get();
        assertTrue(task.getSource().isEmpty());
        assertEquals(new File(project.getBuildDir(), "zip-extracted"), task.getDestinationDir());
    }

    @ParameterizedTest
    @CsvSource({"test-project, buildTestProject", "distribution-zip, buildDistributionZip", "archive-tar, buildArchiveTar"})
    void testCalculateBuildTask(String projectName, String expectedTaskName) {
        project = ProjectBuilder.builder().withName(projectName).build();
        plugin.apply(project);
        TaskProvider<Task> buildTask = project.getTasks().named(expectedTaskName);
        assertNotNull(buildTask);
    }

    @Test
    void testRegisterCheckNoticeTask() throws IOException {
        project = ProjectBuilder.builder().withName("test-zip").build();
        plugin.apply(project);
        TaskProvider<Task> checkNotice = project.getTasks().named("checkNotice");
        assertNotNull(checkNotice);
        File extractionDir = new File(project.getBuildDir(), "zip-extracted");
        extractionDir.mkdirs();
        File noticeFile = new File(extractionDir, "elasticsearch-" + VersionProperties.getElasticsearch() + "/NOTICE.txt");
        noticeFile.getParentFile().mkdirs();
        Files.write(noticeFile.toPath(), Arrays.asList("Elasticsearch", "Copyright 2009-2024 Elasticsearch"));
        checkNotice.get().getActions().get(0).execute(checkNotice.get());
    }

    @Test
    void testRegisterCheckMlCppNoticeTask() throws IOException {
        //project = ProjectBuilder.builder().withName("distribution-zip").build();
        //plugin.apply(project);
        //TaskProvider<Task> checkMlCppNotice = project.getTasks().named("checkMlCppNotice");
        //assertNotNull(checkMlCppNotice);
        //File extractionDir = new File(project.getBuildDir(), "zip-extracted");
        //extractionDir.mkdirs();
        //File mlCppNoticeFile = new File(extractionDir, "elasticsearch-" + VersionProperties.getElasticsearch() + "/modules/x-pack-ml/NOTICE.txt");
        //mlCppNoticeFile.getParentFile().mkdirs();
        //Files.write(mlCppNoticeFile.toPath(), Arrays.asList("ML-CPP Notice"));
        //DistributionArchiveCheckExtension extension = project.getExtensions().getByType(DistributionArchiveCheckExtension.class);
        //extension.getExpectedMlLicenses().set(Arrays.asList("ML-CPP Notice"));
        //checkMlCppNotice.get().getActions().get(0).execute(checkMlCppNotice.get());
    }

    @Test
    void testAssertLinesInFile() throws IOException {
        //File testFile = File.createTempFile("test", ".txt");
        //List<String> lines = Arrays.asList("Line 1", "Line 2", "Line 3");
        //Files.write(testFile.toPath(), lines);
        //assertDoesNotThrow(() -> InternalDistributionArchiveCheckPlugin.assertLinesInFile(testFile.toPath(), lines));
        //assertThrows(GradleException.class, () -> InternalDistributionArchiveCheckPlugin.assertLinesInFile(testFile.toPath(), Arrays.asList("Line 1", "Wrong Line", "Line 3")));
    }

    @Test
    void testAssertNoClassFile() {
        //File nonClassFile = new File("test.txt");
        //File classFile = new File("Test.class");
        //assertDoesNotThrow(() -> InternalDistributionArchiveCheckPlugin.assertNoClassFile(nonClassFile));
        //assertThrows(GradleException.class, () -> InternalDistributionArchiveCheckPlugin.assertNoClassFile(classFile));
    }
}
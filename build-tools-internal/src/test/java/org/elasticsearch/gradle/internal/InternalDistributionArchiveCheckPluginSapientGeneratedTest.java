package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.InternalDistributionArchiveCheckPlugin;

import java.nio.file.Files;

import static org.mockito.ArgumentMatchers.any;

import org.gradle.api.plugins.BasePlugin;
import org.junit.jupiter.api.Test;
import org.elasticsearch.gradle.internal.InternalDistributionArchiveCheckPlugin;
import org.elasticsearch.gradle.internal.conventions.LicensingPlugin;
import org.gradle.api.Project;

import java.io.File;

import org.mockito.Mock;
import org.gradle.api.tasks.Copy;
import org.mockito.MockitoAnnotations;
import org.junit.jupiter.params.provider.CsvSource;
import org.gradle.api.GradleException;
import org.gradle.testfixtures.ProjectBuilder;

import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.gradle.api.file.ArchiveOperations;
import org.junit.jupiter.params.ParameterizedTest;
import org.elasticsearch.gradle.VersionProperties;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.tasks.TaskProvider;
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
    void testDockerBaseEnum() {
        assertEquals("ubuntu:20.04", DockerBase.DEFAULT.getImage());
        assertEquals("", DockerBase.DEFAULT.getSuffix());
        assertEquals("apt-get", DockerBase.DEFAULT.getPackageManager());
        assertEquals("docker.elastic.co/ubi8/ubi-minimal:latest", DockerBase.UBI.getImage());
        assertEquals("-ubi", DockerBase.UBI.getSuffix());
        assertEquals("microdnf", DockerBase.UBI.getPackageManager());
        assertNull(DockerBase.CLOUD_ESS.getImage());
        assertEquals("-cloud-ess", DockerBase.CLOUD_ESS.getSuffix());
        assertEquals("apt-get", DockerBase.CLOUD_ESS.getPackageManager());
    }
}

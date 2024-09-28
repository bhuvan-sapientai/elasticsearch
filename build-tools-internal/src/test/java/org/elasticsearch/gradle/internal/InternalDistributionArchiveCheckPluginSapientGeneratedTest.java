package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.InternalDistributionArchiveCheckPlugin;
import java.nio.file.Files;
import javax.inject.Inject;
import org.gradle.api.plugins.BasePlugin;
import org.junit.jupiter.api.Test;
import org.elasticsearch.gradle.internal.conventions.LicensingPlugin;
import org.gradle.api.Project;
import java.io.File;
import org.mockito.Mock;
import org.gradle.api.Action;
import org.elasticsearch.gradle.internal.conventions.GUtils;
import org.gradle.api.tasks.Copy;
import org.junit.jupiter.params.provider.CsvSource;
import org.gradle.api.GradleException;
import org.gradle.testfixtures.ProjectBuilder;
import static org.mockito.Mockito.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import java.nio.file.Path;
import org.gradle.api.file.ArchiveOperations;
import org.junit.jupiter.params.ParameterizedTest;
import org.elasticsearch.gradle.VersionProperties;
import org.gradle.api.Plugin;
import java.util.concurrent.Callable;
import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Collectors;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.Task;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

class InternalDistributionArchiveCheckPluginSapientGeneratedTest {

    private Project project;

    private InternalDistributionArchiveCheckPlugin plugin;

    @Mock
    private ArchiveOperations archiveOperations;

    @BeforeEach
    void setUp() {
        project = ProjectBuilder.builder().build();
        plugin = new InternalDistributionArchiveCheckPlugin(archiveOperations);
    }

    @Disabled()
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
        assertTrue(checkTask.getDependsOn().contains(project.getTasks().findByName("checkExtraction")));
        assertTrue(checkTask.getDependsOn().contains(project.getTasks().findByName("checkLicense")));
        assertTrue(checkTask.getDependsOn().contains(project.getTasks().findByName("checkNotice")));
        assertTrue(checkTask.getDependsOn().contains(project.getTasks().findByName("checkModules")));
    }

    @ParameterizedTest
    @CsvSource({ "test-zip, zip-extracted", "test-tar, tar-extracted" })
    void testCalculateArchiveExtractionDir(String projectName, String expectedDirName) {
        //project.setName(projectName);
        //File extractionDir = plugin.calculateArchiveExtractionDir(project);
        //assertEquals(new File(project.getBuildDir(), expectedDirName), extractionDir);
    }

    @Test
    void testCalculateArchiveExtractionDirInvalidName() {
        //project.setName("invalid-project");
        //assertThrows(GradleException.class, () -> plugin.calculateArchiveExtractionDir(project));
    }

    @Test
    void testRegisterCheckMlCppNoticeTask() throws IOException {
        // Verify that no exception is thrown
        //project.setName("test-zip");
        //DistributionArchiveCheckExtension extension = mock(DistributionArchiveCheckExtension.class);
        //when(extension.getExpectedMlLicenses()).thenReturn(() -> Arrays.asList("License1", "License2"));
        //TaskProvider<Copy> checkExtraction = project.getTasks().register("checkExtraction", Copy.class);
        //File destinationDir = new File(project.getBuildDir(), "extracted");
        //checkExtraction.configure(task -> task.setDestinationDir(destinationDir));
        //TaskProvider<Task> checkMlCppNoticeTask = InternalDistributionArchiveCheckPlugin.registerCheckMlCppNoticeTask(project, checkExtraction, extension);
        //assertNotNull(checkMlCppNoticeTask);
        //assertEquals("checkMlCppNotice", checkMlCppNoticeTask.getName());
        // Create a mock NOTICE.txt file
        //File moduleDir = new File(destinationDir, "elasticsearch-" + VersionProperties.getElasticsearch() + "/modules/x-pack-ml");
        //moduleDir.mkdirs();
        //File noticeFile = new File(moduleDir, "NOTICE.txt");
        //Files.write(noticeFile.toPath(), Arrays.asList("License1", "License2", "License3"));
        // Execute the task
        //checkMlCppNoticeTask.get().getActions().get(0).execute(checkMlCppNoticeTask.get());
    }

    @Test
    void testRegisterCheckNoticeTask() throws IOException {
        // Verify that no exception is thrown
        //TaskProvider<Copy> checkExtraction = project.getTasks().register("checkExtraction", Copy.class);
        //File destinationDir = new File(project.getBuildDir(), "extracted");
        //checkExtraction.configure(task -> task.setDestinationDir(destinationDir));
        //TaskProvider<Task> checkNoticeTask = plugin.registerCheckNoticeTask(project, checkExtraction);
        //assertNotNull(checkNoticeTask);
        //assertEquals("checkNotice", checkNoticeTask.getName());
        // Create a mock NOTICE.txt file
        //File esDir = new File(destinationDir, "elasticsearch-" + VersionProperties.getElasticsearch());
        //esDir.mkdirs();
        //File noticeFile = new File(esDir, "NOTICE.txt");
        //Files.write(noticeFile.toPath(), Arrays.asList("Elasticsearch", "Copyright 2009-2024 Elasticsearch", "Additional line"));
        // Execute the task
        //checkNoticeTask.get().getActions().get(0).execute(checkNoticeTask.get());
    }

    @ParameterizedTest
    @CsvSource({ "oss-test-zip, AGPL-3.0+SSPL-1.0+ELASTIC-LICENSE-2.0.txt", "integ-test-zip, AGPL-3.0+SSPL-1.0+ELASTIC-LICENSE-2.0.txt", "test-zip, ELASTIC-LICENSE-2.0.txt" })
    void testRegisterCheckLicenseTask(String projectName, String expectedLicenseFile) throws IOException {
        // Verify that no exception is thrown
        //project.setName(projectName);
        //TaskProvider<Copy> checkExtraction = project.getTasks().register("checkExtraction", Copy.class);
        //File destinationDir = new File(project.getBuildDir(), "extracted");
        //checkExtraction.configure(task -> task.setDestinationDir(destinationDir));
        // Create mock license files
        //File licensesDir = new File(project.getRootDir(), "licenses");
        //licensesDir.mkdirs();
        //Files.write(new File(licensesDir, "AGPL-3.0+SSPL-1.0+ELASTIC-LICENSE-2.0.txt").toPath(), Arrays.asList("AGPL License", "SSPL License", "Elastic License"));
        //Files.write(new File(licensesDir, "ELASTIC-LICENSE-2.0.txt").toPath(), Arrays.asList("Elastic License 2.0"));
        //TaskProvider<Task> checkLicenseTask = plugin.registerCheckLicenseTask(project, checkExtraction);
        //assertNotNull(checkLicenseTask);
        //assertEquals("checkLicense", checkLicenseTask.getName());
        // Create a mock LICENSE.txt file
        //File esDir = new File(destinationDir, "elasticsearch-" + VersionProperties.getElasticsearch());
        //esDir.mkdirs();
        //File licenseFile = new File(esDir, "LICENSE.txt");
        //Files.write(licenseFile.toPath(), Files.readAllLines(new File(licensesDir, expectedLicenseFile).toPath()));
        // Execute the task
        //checkLicenseTask.get().getActions().get(0).execute(checkLicenseTask.get());
    }

    @Test
    void testRegisterCheckExtractionTask() {
        //Project parentProject = ProjectBuilder.builder().build();
        //project.setParent(parentProject);
        /*TaskProvider<Task> buildDistTask = parentProject.getTasks().register("buildTestZip", task -> {
    File outputFile = new File(parentProject.getBuildDir(), "distributions/test.zip");
    task.getOutputs().file(outputFile);
});*/
        //File archiveExtractionDir = new File(project.getBuildDir(), "extracted");
        //TaskProvider<Copy> checkExtractionTask = plugin.registerCheckExtractionTask(project, buildDistTask, archiveExtractionDir);
        //assertNotNull(checkExtractionTask);
        //assertEquals("checkExtraction", checkExtractionTask.getName());
        //assertTrue(checkExtractionTask.get() instanceof Copy);
        //Copy copyTask = (Copy) checkExtractionTask.get();
        //assertEquals(archiveExtractionDir, copyTask.getDestinationDir());
        //assertTrue(copyTask.getDependsOn().contains(buildDistTask.get()));
    }

    @ParameterizedTest
    @CsvSource({ "test-project, buildTestProject", "distribution-zip, buildDistributionZip", "archive-tar, buildArchiveTar" })
    void testCalculateBuildTask(String projectName, String expectedTaskName) {
        //assertEquals(expectedTaskName, plugin.calculateBuildTask(projectName));
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

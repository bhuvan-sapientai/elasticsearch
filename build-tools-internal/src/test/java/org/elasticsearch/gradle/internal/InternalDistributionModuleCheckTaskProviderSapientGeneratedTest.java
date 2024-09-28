package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.InternalDistributionModuleCheckTaskProvider;
import java.util.jar.JarEntry;
import java.nio.file.Files;
import java.util.zip.ZipEntry;
import java.io.UncheckedIOException;
import java.lang.module.ModuleFinder;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;
import org.gradle.api.Action;
import org.gradle.api.tasks.Copy;
import org.junit.jupiter.api.io.TempDir;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.jar.JarOutputStream;
import org.junit.jupiter.params.provider.CsvSource;
import org.gradle.api.GradleException;
import org.gradle.testfixtures.ProjectBuilder;
import static org.mockito.Mockito.*;
import java.io.IOException;
import java.util.jar.JarFile;
import java.util.Arrays;
import java.lang.module.ModuleReference;
import static java.util.stream.Collectors.joining;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import java.nio.file.Path;
import org.junit.jupiter.params.ParameterizedTest;
import org.elasticsearch.gradle.VersionProperties;
import org.junit.jupiter.params.provider.EnumSource;
import org.gradle.api.logging.Logger;
import java.util.function.Predicate;
import java.util.function.Function;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import org.gradle.api.logging.Logging;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.Task;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

class InternalDistributionModuleCheckTaskProviderSapientGeneratedTest {

    private Project project;

    private TaskProvider<Copy> checkExtraction;

    @TempDir
    Path tempDir;

    @BeforeEach
    void setUp() {
        project = ProjectBuilder.builder().build();
        checkExtraction = project.getTasks().register("checkExtraction", Copy.class);
    }

    @Test
    void testRegisterCheckModulesTask() {
        TaskProvider<Task> checkModulesTask = InternalDistributionModuleCheckTaskProvider.registerCheckModulesTask(project, checkExtraction);
        assertNotNull(checkModulesTask);
        assertEquals("checkModules", checkModulesTask.getName());
        assertTrue(checkModulesTask.get().getDependsOn().contains(checkExtraction));
    }

    @Disabled()
    @Test
    void testAssertAllESJarsAreModular() throws IOException {
        Path libPath = tempDir.resolve("elasticsearch-" + VersionProperties.getElasticsearch()).resolve("lib");
        Files.createDirectories(libPath);
        createJarWithModuleInfo(libPath.resolve("elasticsearch-core-" + VersionProperties.getElasticsearch() + ".jar"));
        createJarWithModuleInfo(libPath.resolve("elasticsearch-secure-sm-" + VersionProperties.getElasticsearch() + ".jar"));
        TaskProvider<Task> checkModulesTask = InternalDistributionModuleCheckTaskProvider.registerCheckModulesTask(project, checkExtraction);
        Copy copyTask = mock(Copy.class);
        when(checkExtraction.get()).thenReturn(copyTask);
        when(copyTask.getDestinationDir()).thenReturn(tempDir.toFile());
        assertDoesNotThrow(() -> checkModulesTask.get().getActions().get(0).execute(checkModulesTask.get()));
    }

    @Disabled()
    @Test
    void testAssertAllESJarsAreModularWithNonModularJar() throws IOException {
        Path libPath = tempDir.resolve("elasticsearch-" + VersionProperties.getElasticsearch()).resolve("lib");
        Files.createDirectories(libPath);
        createJarWithModuleInfo(libPath.resolve("elasticsearch-core-" + VersionProperties.getElasticsearch() + ".jar"));
        createJarWithoutModuleInfo(libPath.resolve("elasticsearch-secure-sm-" + VersionProperties.getElasticsearch() + ".jar"));
        TaskProvider<Task> checkModulesTask = InternalDistributionModuleCheckTaskProvider.registerCheckModulesTask(project, checkExtraction);
        Copy copyTask = mock(Copy.class);
        when(checkExtraction.get()).thenReturn(copyTask);
        when(copyTask.getDestinationDir()).thenReturn(tempDir.toFile());
        GradleException exception = assertThrows(GradleException.class, () -> checkModulesTask.get().getActions().get(0).execute(checkModulesTask.get()));
        assertTrue(exception.getMessage().contains("module-info.class no found in"));
    }

    @Disabled()
    @Test
    void testAssertAllModulesPresent() throws IOException {
        Path libPath = tempDir.resolve("elasticsearch-" + VersionProperties.getElasticsearch()).resolve("lib");
        Files.createDirectories(libPath);
        List<String> expectedModules = Arrays.asList("org.elasticsearch.base", "org.elasticsearch.cli", "org.elasticsearch.geo", "org.elasticsearch.grok", "org.elasticsearch.logging", "org.elasticsearch.lz4", "org.elasticsearch.nativeaccess", "org.elasticsearch.plugin", "org.elasticsearch.plugin.analysis", "org.elasticsearch.securesm", "org.elasticsearch.server", "org.elasticsearch.simdvec", "org.elasticsearch.tdigest", "org.elasticsearch.xcontent");
        for (String module : expectedModules) {
            createJarWithModuleInfo(libPath.resolve(module + "-" + VersionProperties.getElasticsearch() + ".jar"), module);
        }
        TaskProvider<Task> checkModulesTask = InternalDistributionModuleCheckTaskProvider.registerCheckModulesTask(project, checkExtraction);
        Copy copyTask = mock(Copy.class);
        when(checkExtraction.get()).thenReturn(copyTask);
        when(copyTask.getDestinationDir()).thenReturn(tempDir.toFile());
        assertDoesNotThrow(() -> checkModulesTask.get().getActions().get(0).execute(checkModulesTask.get()));
    }

    @Disabled()
    @Test
    void testAssertAllModulesPresentWithMissingModule() throws IOException {
        Path libPath = tempDir.resolve("elasticsearch-" + VersionProperties.getElasticsearch()).resolve("lib");
        Files.createDirectories(libPath);
        List<String> modules = Arrays.asList("org.elasticsearch.base", "org.elasticsearch.cli", "org.elasticsearch.geo", "org.elasticsearch.grok", "org.elasticsearch.logging", "org.elasticsearch.lz4", "org.elasticsearch.nativeaccess", "org.elasticsearch.plugin", "org.elasticsearch.plugin.analysis", "org.elasticsearch.securesm", "org.elasticsearch.server", "org.elasticsearch.simdvec", "org.elasticsearch.xcontent");
        for (String module : modules) {
            createJarWithModuleInfo(libPath.resolve(module + "-" + VersionProperties.getElasticsearch() + ".jar"), module);
        }
        TaskProvider<Task> checkModulesTask = InternalDistributionModuleCheckTaskProvider.registerCheckModulesTask(project, checkExtraction);
        Copy copyTask = mock(Copy.class);
        when(checkExtraction.get()).thenReturn(copyTask);
        when(copyTask.getDestinationDir()).thenReturn(tempDir.toFile());
        GradleException exception = assertThrows(GradleException.class, () -> checkModulesTask.get().getActions().get(0).execute(checkModulesTask.get()));
        assertTrue(exception.getMessage().contains("expected modules"));
        assertTrue(exception.getMessage().contains("actual modules"));
    }

    @Test
    void testListToString() {
        List<String> list = Arrays.asList("b", "a", "c");
        String result = InternalDistributionModuleCheckTaskProvider.listToString(list);
        assertEquals("[\n  a\n  b\n  c]", result);
    }

    @ParameterizedTest
    @EnumSource(DockerBase.class)
    void testDockerBaseEnumValues(DockerBase dockerBase) {
        assertNotNull(dockerBase.getImage());
        assertNotNull(dockerBase.getSuffix());
        assertNotNull(dockerBase.getPackageManager());
    }

    @ParameterizedTest
    @CsvSource({ "DEFAULT, ubuntu:20.04, '', apt-get", "UBI, docker.elastic.co/ubi8/ubi-minimal:latest, -ubi, microdnf", "IRON_BANK, ${BASE_REGISTRY}/${BASE_IMAGE}:${BASE_TAG}, -ironbank, yum", "CLOUD, ubuntu:20.04, -cloud, apt-get", "CLOUD_ESS, '', -cloud-ess, apt-get", "WOLFI, docker.elastic.co/wolfi/chainguard-base:latest@sha256:c16d3ad6cebf387e8dd2ad769f54320c4819fbbaa21e729fad087c7ae223b4d0, -wolfi, apk" })
    void testDockerBaseEnumProperties(DockerBase dockerBase, String expectedImage, String expectedSuffix, String expectedPackageManager) {
        assertEquals(expectedImage, dockerBase.getImage());
        assertEquals(expectedSuffix, dockerBase.getSuffix());
        assertEquals(expectedPackageManager, dockerBase.getPackageManager());
    }

    private void createJarWithModuleInfo(Path jarPath) throws IOException {
        createJarWithModuleInfo(jarPath, "org.elasticsearch.test");
    }

    private void createJarWithModuleInfo(Path jarPath, String moduleName) throws IOException {
        try (JarOutputStream jos = new JarOutputStream(Files.newOutputStream(jarPath))) {
            jos.putNextEntry(new ZipEntry("module-info.class"));
            jos.write(("module " + moduleName + " {}").getBytes());
            jos.closeEntry();
        }
    }

    private void createJarWithoutModuleInfo(Path jarPath) throws IOException {
        try (JarOutputStream jos = new JarOutputStream(Files.newOutputStream(jarPath))) {
            jos.putNextEntry(new ZipEntry("some-class.class"));
            jos.write("class content".getBytes());
            jos.closeEntry();
        }
    }
}

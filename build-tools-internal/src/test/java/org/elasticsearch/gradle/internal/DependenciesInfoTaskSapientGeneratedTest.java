package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.DependenciesInfoTask;

import java.nio.file.Files;

import org.junit.jupiter.api.BeforeEach;
import org.elasticsearch.gradle.internal.precommit.DependencyLicensesTask;
import org.gradle.api.file.DirectoryProperty;

import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.ModuleVersionIdentifier;
import org.gradle.api.artifacts.Configuration;
import org.elasticsearch.gradle.internal.precommit.LicenseAnalyzer;

import java.io.File;

import org.gradle.api.logging.Logger;
import org.gradle.api.file.ProjectLayout;
import org.junit.jupiter.api.io.TempDir;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.artifacts.ResolvedModuleVersion;
import org.gradle.api.artifacts.DependencySet;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.artifacts.Dependency;
import org.gradle.api.artifacts.ResolvedArtifact;

import static org.mockito.Mockito.*;

import org.gradle.api.model.ObjectFactory;

import java.io.IOException;

import org.gradle.api.artifacts.ResolvedConfiguration;

import java.util.*;

import static org.mockito.ArgumentMatchers.any;

class DependenciesInfoTaskSapientGeneratedTest {

    private DependenciesInfoTask task;

    private Configuration runtimeConfiguration;

    private Configuration compileOnlyConfiguration;

    private DirectoryProperty licensesDir;

    private Logger logger;

    @TempDir
    Path tempDir;

    @BeforeEach
    void setUp() {
        ProjectLayout projectLayout = mock(ProjectLayout.class);
        ObjectFactory objectFactory = mock(ObjectFactory.class);
        ProviderFactory providerFactory = mock(ProviderFactory.class);
        task = new DependenciesInfoTask(projectLayout, objectFactory, providerFactory);
        runtimeConfiguration = mock(Configuration.class);
        compileOnlyConfiguration = mock(Configuration.class);
        licensesDir = mock(DirectoryProperty.class);
        logger = mock(Logger.class);
        task.setRuntimeConfiguration(runtimeConfiguration);
        task.setCompileOnlyConfiguration(compileOnlyConfiguration);
        task.setLicensesDir(tempDir.toFile());
        task.setOutputFile(tempDir.resolve("dependencies.csv").toFile());
        when(task.getLogger()).thenReturn(logger);
    }

    @Test
    void testGenerateDependenciesInfo() throws IOException {
        // Mock dependencies
        DependencySet runtimeDependencies = mock(DependencySet.class);
        when(runtimeConfiguration.getAllDependencies()).thenReturn(runtimeDependencies);
        Dependency dep1 = mockDependency("org.example", "lib1", "1.0");
        Dependency dep2 = mockDependency("com.test", "lib2", "2.0");
        when(runtimeDependencies.iterator()).thenReturn(Arrays.asList(dep1, dep2).iterator());
        // Mock compile only artifacts
        ResolvedConfiguration resolvedConfiguration = mock(ResolvedConfiguration.class);
        when(compileOnlyConfiguration.getResolvedConfiguration()).thenReturn(resolvedConfiguration);
        Set<ResolvedArtifact> resolvedArtifacts = new HashSet<>();
        when(resolvedConfiguration.getResolvedArtifacts()).thenReturn(resolvedArtifacts);
        // Mock license files
        File licenseFile = tempDir.resolve("lib1-LICENSE.txt").toFile();
        Files.writeString(licenseFile.toPath(), "Apache License 2.0");
        // Execute task
        task.generateDependenciesInfo();
        // Verify output
        File outputFile = tempDir.resolve("dependencies.csv").toFile();
        List<String> lines = Files.readAllLines(outputFile.toPath());
        assertEquals(2, lines.size());
        assertTrue(lines.get(0).startsWith("org.example:lib1,1.0,https://repo1.maven.org/maven2/org/example/lib1/1.0,Apache-2.0"));
        assertTrue(lines.get(1).startsWith("com.test:lib2,2.0,https://repo1.maven.org/maven2/com/test/lib2/2.0"));
    }

    @Test
    void testGetLicenseType() throws IOException {
        File licenseFile = tempDir.resolve("lib1-LICENSE.txt").toFile();
        Files.writeString(licenseFile.toPath(), "Apache License 2.0");
        String licenseType = task.getLicenseType("org.example", "lib1");
        assertEquals("Apache-2.0,", licenseType);
    }

    @Test
    void testCreateURL() {
        String url = task.createURL("org.example", "lib1", "1.0");
        assertEquals("https://repo1.maven.org/maven2/org/example/lib1/1.0", url);
    }

    private Dependency mockDependency(String group, String name, String version) {
        Dependency dependency = mock(Dependency.class);
        when(dependency.getGroup()).thenReturn(group);
        when(dependency.getName()).thenReturn(name);
        when(dependency.getVersion()).thenReturn(version);
        return dependency;
    }
}

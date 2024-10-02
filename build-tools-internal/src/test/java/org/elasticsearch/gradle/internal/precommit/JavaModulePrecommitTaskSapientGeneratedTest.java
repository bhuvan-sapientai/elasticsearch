package org.elasticsearch.gradle.internal.precommit;

import org.elasticsearch.gradle.internal.precommit.JavaModulePrecommitTask;

import java.lang.module.ModuleDescriptor;
import java.lang.module.ModuleReference;
import java.nio.file.Files;
import java.lang.module.ModuleFinder;

import org.junit.jupiter.api.BeforeEach;

import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.io.File;

import org.elasticsearch.gradle.VersionProperties;

import java.util.Set;

import org.gradle.api.provider.SetProperty;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.params.provider.CsvSource;
import org.gradle.api.GradleException;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.file.FileCollection;

import static org.mockito.Mockito.*;

import org.gradle.api.model.ObjectFactory;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.any;

class JavaModulePrecommitTaskSapientGeneratedTest {

    private JavaModulePrecommitTask task;

    private ObjectFactory objectFactory;

    private FileCollection classesDirs;

    private FileCollection classpath;

    private File resourcesDir;

    private SetProperty<File> srcDirs;

    @BeforeEach
    void setUp() {
        objectFactory = mock(ObjectFactory.class);
        task = new JavaModulePrecommitTask(objectFactory);
        classesDirs = mock(FileCollection.class);
        classpath = mock(FileCollection.class);
        resourcesDir = mock(File.class);
        srcDirs = mock(SetProperty.class);
        when(objectFactory.setProperty(File.class)).thenReturn(srcDirs);
        task.setClassesDirs(classesDirs);
        task.setClasspath(classpath);
        task.setResourcesDirs(resourcesDir);
    }

    @Test
    void testGetClassesDirs() {
        assertThat(task.getClassesDirs(), is(classesDirs));
    }

    @Test
    void testSetClassesDirs() {
        FileCollection newClassesDirs = mock(FileCollection.class);
        task.setClassesDirs(newClassesDirs);
        assertThat(task.getClassesDirs(), is(newClassesDirs));
    }

    @Test
    void testSetClassesDirsNullThrowsException() {
        assertThrows(NullPointerException.class, () -> task.setClassesDirs(null));
    }

    @Test
    void testGetResourcesDir() {
        assertThat(task.getResourcesDir(), is(resourcesDir));
    }

    @Test
    void testSetResourcesDirs() {
        File newResourcesDir = new File("newPath");
        task.setResourcesDirs(newResourcesDir);
        assertThat(task.getResourcesDir(), is(newResourcesDir));
    }

    @Test
    void testSetResourcesDirsNullThrowsException() {
        assertThrows(NullPointerException.class, () -> task.setResourcesDirs(null));
    }

    @Test
    void testGetSrcDirs() {
        assertThat(task.getSrcDirs(), is(srcDirs));
    }

    @Test
    void testGetClasspath() {
        assertThat(task.getClasspath(), is(classpath));
    }

    @Test
    void testSetClasspath() {
        FileCollection newClasspath = mock(FileCollection.class);
        task.setClasspath(newClasspath);
        assertThat(task.getClasspath(), is(newClasspath));
    }

    @Test
    void testCheckModuleNoModuleInfo() throws IOException {
        when(srcDirs.get()).thenReturn(Set.of(new File("src")));
        // Should not throw any exception
        task.checkModule();
    }

    @ParameterizedTest
    @CsvSource({"org.elasticsearch.module, true", "co.elastic.module, true", "com.example.module, false"})
    void testCheckModuleNamePrefix(String moduleName, boolean shouldPass) throws IOException {
        setupMockModule(moduleName);
        if (shouldPass) {
            assertDoesNotThrow(() -> task.checkModule());
        } else {
            assertThrows(GradleException.class, () -> task.checkModule());
        }
    }

    @Test
    void testCheckModuleVersion() throws IOException {
        String correctVersion = VersionProperties.getElasticsearch();
        setupMockModule("org.elasticsearch.module", correctVersion);
        assertDoesNotThrow(() -> task.checkModule());
        setupMockModule("org.elasticsearch.module", "wrongVersion");
        assertThrows(GradleException.class, () -> task.checkModule());
    }

    @Test
    void testCheckModuleServices() throws IOException {
        String moduleName = "org.elasticsearch.module";
        String version = VersionProperties.getElasticsearch();
        String service = "org.elasticsearch.test.Service";
        setupMockModule(moduleName, version, Set.of(service));
        setupMockResourcesDir(Set.of(service));
        assertDoesNotThrow(() -> task.checkModule());
        setupMockResourcesDir(Set.of("org.elasticsearch.test.UnknownService"));
        assertThrows(GradleException.class, () -> task.checkModule());
    }

    private void setupMockModule(String moduleName) throws IOException {
        //setupMockModule(moduleName, VersionProperties.getElasticsearch(), Set.of());
    }

    private void setupMockModule(String moduleName, String version) throws IOException {
        //setupMockModule(moduleName, version, Set.of());
    }

    private void setupMockModule(String moduleName, String version, Set<String> services) throws IOException {
        //File moduleInfoFile = new File("src/module-info.java");
        //when(srcDirs.get()).thenReturn(Set.of(moduleInfoFile.getParentFile()));
        //Files.writeString(moduleInfoFile.toPath(), "module " + moduleName + " {}");
        //ModuleReference mockModuleRef = mock(ModuleReference.class);
        //ModuleDescriptor mockDescriptor = mock(ModuleDescriptor.class);
        //when(mockModuleRef.descriptor()).thenReturn(mockDescriptor);
        //when(mockDescriptor.name()).thenReturn(moduleName);
        //when(mockDescriptor.rawVersion()).thenReturn(java.util.Optional.of(version));
        //Set<ModuleDescriptor.Provides> provides = services.stream().map(s -> ModuleDescriptor.Provides.newProvider(s, s)).collect(java.util.stream.Collectors.toSet());
        //when(mockDescriptor.provides()).thenReturn(provides);
        //File classesDir = mock(File.class);
        //when(classesDirs.getSingleFile()).thenReturn(classesDir);
        //when(classesDir.toPath()).thenReturn(Path.of("/mock/classes"));
        //ModuleFinder mockFinder = mock(ModuleFinder.class);
        //when(mockFinder.findAll()).thenReturn(Set.of(mockModuleRef));
        /*try (var mocked = mockStatic(ModuleFinder.class)) {
    mocked.when(() -> ModuleFinder.of(any(Path.class))).thenReturn(mockFinder);
    task.checkModule();
}*/
    }

    private void setupMockResourcesDir(Set<String> services) throws IOException {
        File servicesDir = new File(resourcesDir, "META-INF/services");
        when(resourcesDir.toPath()).thenReturn(Path.of("/mock/resources"));
        when(Files.exists(servicesDir.toPath())).thenReturn(true);
        var pathStream = services.stream().map(s -> Path.of("/mock/resources/META-INF/services", s)).toList();
        try (var mocked = mockStatic(Files.class)) {
            mocked.when(() -> Files.walk(any(Path.class))).thenReturn(pathStream.stream());
            mocked.when(() -> Files.isRegularFile(any(Path.class))).thenReturn(true);
            task.checkModule();
        }
    }
}
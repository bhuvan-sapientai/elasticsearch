package org.elasticsearch.gradle.jarhell;

import org.elasticsearch.gradle.jarhell.JarHellTask;
import org.elasticsearch.gradle.LoggedExec;
import org.elasticsearch.gradle.jarhell.JarHellTask;
import java.nio.file.Files;
import javax.inject.Inject;
import org.gradle.api.file.DirectoryProperty;
import static org.mockito.ArgumentMatchers.any;
import org.gradle.api.tasks.CacheableTask;
import org.junit.jupiter.api.Test;
import java.io.File;
import org.mockito.Mock;
import org.gradle.api.DefaultTask;
import org.gradle.process.ExecOperations;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.file.ProjectLayout;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.MatcherAssert.assertThat;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.*;
import java.io.IOException;
import org.gradle.process.JavaExecSpec;
import java.nio.file.StandardOpenOption;
import org.junit.jupiter.api.BeforeEach;
import org.gradle.api.tasks.OutputFile;
import java.nio.file.Path;
import org.junit.jupiter.api.AfterEach;
import org.gradle.api.tasks.Classpath;
import org.gradle.api.tasks.SkipWhenEmpty;
import org.junit.jupiter.api.Timeout;
import org.gradle.api.specs.Spec;
import org.mockito.InjectMocks;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.CompileClasspath;
import org.gradle.api.provider.Provider;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class JarHellTaskSapientGeneratedTest {

    @Mock
    private ExecOperations execOperations;

    @Mock
    private ProjectLayout projectLayout;

    @Mock
    private DirectoryProperty buildDirectory;

    @Mock
    private Provider<File> buildDirectoryProvider;

    @Mock
    private FileCollection jarHellRuntimeClasspath;

    @Mock
    private FileCollection classpath;

    @InjectMocks
    private JarHellTask target;

    private AutoCloseable autoCloseableMocks;

    @BeforeEach
    void setUp() {
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        when(projectLayout.getBuildDirectory()).thenReturn(buildDirectory);
        when(buildDirectory.getAsFile()).thenReturn(buildDirectoryProvider);
        when(buildDirectoryProvider.get()).thenReturn(new File("build"));
    }

    @AfterEach
    void tearDown() throws Exception {
        if (autoCloseableMocks != null) {
            autoCloseableMocks.close();
        }
    }

    @Disabled()
    @Test
    void getSuccessMarkerTest() {
        target = spy(new JarHellTask(execOperations, projectLayout));
        when(target.getName()).thenReturn("testTask");
        File result = target.getSuccessMarker();
        assertThat(result, equalTo(new File("build/markers/testTask")));
        verify(projectLayout).getBuildDirectory();
        verify(buildDirectory).getAsFile();
        verify(buildDirectoryProvider).get();
        verify(target).getName();
    }

    @Disabled()
    @Test
    void runJarHellCheckTest() throws IOException {
        target = spy(new JarHellTask(execOperations, projectLayout));
        when(target.getJarHellRuntimeClasspath()).thenReturn(jarHellRuntimeClasspath);
        when(target.getClasspath()).thenReturn(classpath);
        when(jarHellRuntimeClasspath.plus(classpath)).thenReturn(jarHellRuntimeClasspath);
        when(jarHellRuntimeClasspath.getAsPath()).thenReturn("classpath");
        File successMarker = new File("build/markers/testTask");
        doReturn(successMarker).when(target).getSuccessMarker();
        try (MockedStatic<LoggedExec> loggedExec = mockStatic(LoggedExec.class)) {
            target.runJarHellCheck();
            loggedExec.verify(() -> LoggedExec.javaexec(eq(execOperations), any()));
            verify(target).getSuccessMarker();
            assertTrue(Files.exists(successMarker.toPath()));
        }
    }

    @Disabled()
    @Test
    void getClasspathWhenClasspathIsNull() {
        target = new JarHellTask(execOperations, projectLayout);
        FileCollection result = target.getClasspath();
        assertThat(result, is(nullValue()));
    }

    @Disabled()
    @Test
    void getClasspathWhenClasspathIsNotNull() {
        target = new JarHellTask(execOperations, projectLayout);
        FileCollection mockClasspath = mock(FileCollection.class);
        target.setClasspath(mockClasspath);
        when(mockClasspath.filter(any(Spec.class))).thenReturn(mockClasspath);
        FileCollection result = target.getClasspath();
        assertThat(result, is(notNullValue()));
        verify(mockClasspath).filter(any(Spec.class));
    }

    @Disabled()
    @Test
    void setAndGetClasspath() {
        target = new JarHellTask(execOperations, projectLayout);
        FileCollection mockClasspath = mock(FileCollection.class);
        target.setClasspath(mockClasspath);
        FileCollection result = target.getClasspath();
        assertThat(result, is(notNullValue()));
    }

    @Disabled()
    @Test
    void setAndGetJarHellRuntimeClasspath() {
        target = new JarHellTask(execOperations, projectLayout);
        FileCollection mockJarHellRuntimeClasspath = mock(FileCollection.class);
        target.setJarHellRuntimeClasspath(mockJarHellRuntimeClasspath);
        FileCollection result = target.getJarHellRuntimeClasspath();
        assertThat(result, is(sameInstance(mockJarHellRuntimeClasspath)));
    }

    @Disabled()
    @Test
    void constructorSetsDescription() {
        target = new JarHellTask(execOperations, projectLayout);
        String description = target.getDescription();
        assertThat(description, is("Runs CheckJarHell on the configured classpath"));
    }

    @Disabled()
    @Test
    void runJarHellCheckThrowsIOException() throws IOException {
        target = spy(new JarHellTask(execOperations, projectLayout));
        when(target.getJarHellRuntimeClasspath()).thenReturn(jarHellRuntimeClasspath);
        when(target.getClasspath()).thenReturn(classpath);
        when(jarHellRuntimeClasspath.plus(classpath)).thenReturn(jarHellRuntimeClasspath);
        when(jarHellRuntimeClasspath.getAsPath()).thenReturn("classpath");
        File successMarker = new File("build/markers/testTask");
        doReturn(successMarker).when(target).getSuccessMarker();
        try (MockedStatic<LoggedExec> loggedExec = mockStatic(LoggedExec.class)) {
            loggedExec.when(() -> LoggedExec.javaexec(eq(execOperations), any())).thenThrow(new IOException("Test exception"));
            assertThrows(IOException.class, () -> target.runJarHellCheck());
            verify(target).getSuccessMarker();
            assertFalse(Files.exists(successMarker.toPath()));
        }
    }
}

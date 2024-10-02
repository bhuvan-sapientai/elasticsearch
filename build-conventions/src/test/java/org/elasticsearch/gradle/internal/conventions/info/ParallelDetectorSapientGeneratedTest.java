package org.elasticsearch.gradle.internal.conventions.info;

import org.elasticsearch.gradle.internal.conventions.info.ParallelDetector;
import org.gradle.api.invocation.Gradle;
import java.nio.file.Files;
import java.io.UncheckedIOException;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;
import java.io.File;
import org.gradle.api.Action;
import org.elasticsearch.gradle.internal.conventions.info.ParallelDetector;
import org.gradle.process.ExecSpec;
import org.junit.jupiter.api.io.TempDir;
import org.gradle.api.provider.ProviderFactory;
import java.io.FileReader;
import static org.mockito.Mockito.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Arrays;
import org.gradle.process.ExecOutput;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import java.nio.file.Path;
import org.gradle.api.logging.Logger;
import java.io.BufferedReader;
import static org.junit.jupiter.api.Assertions.*;
import org.gradle.api.logging.Logging;
import java.util.stream.Collectors;
import org.gradle.StartParameter;
import java.io.ByteArrayOutputStream;
import org.gradle.api.provider.Provider;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

class ParallelDetectorSapientGeneratedTest {

    private Project projectMock;

    private ProviderFactory providerFactoryMock;

    private Gradle gradleMock;

    private StartParameter startParameterMock;

    @BeforeEach
    void setUp() {
        projectMock = mock(Project.class);
        providerFactoryMock = mock(ProviderFactory.class);
        gradleMock = mock(Gradle.class);
        startParameterMock = mock(StartParameter.class);
        when(projectMock.getProviders()).thenReturn(providerFactoryMock);
        when(projectMock.getGradle()).thenReturn(gradleMock);
        when(gradleMock.getStartParameter()).thenReturn(startParameterMock);
    }

    @Disabled()
    @Test
    void testFindDefaultParallelWithCpuInfoFile(@TempDir Path tempDir) throws IOException {
        File cpuInfoFile = tempDir.resolve("cpuinfo").toFile();
        Files.writeString(cpuInfoFile.toPath(), "physical id : 0\n" + "cpu cores : 4\n" + "physical id : 1\n" + "cpu cores : 4\n");
        when(startParameterMock.getMaxWorkerCount()).thenReturn(16);
        int result = ParallelDetector.findDefaultParallel(projectMock);
        assertEquals(8, result);
    }

    @Test
    void testFindDefaultParallelOnMac() {
        Provider<String> osNameProvider = mock(Provider.class);
        Provider<String> osArchProvider = mock(Provider.class);
        Provider<String> osVersionProvider = mock(Provider.class);
        ExecOutput execOutputMock = mock(ExecOutput.class);
        ExecOutput.StandardStreamContent standardOutputMock = mock(ExecOutput.StandardStreamContent.class);
        Provider<String> outputProvider = mock(Provider.class);
        when(providerFactoryMock.systemProperty("os.name")).thenReturn(osNameProvider);
        when(osNameProvider.getOrElse("")).thenReturn("Mac OS X");
        when(providerFactoryMock.systemProperty("os.arch")).thenReturn(osArchProvider);
        when(osArchProvider.getOrElse("")).thenReturn("x86_64");
        when(providerFactoryMock.systemProperty("os.version")).thenReturn(osVersionProvider);
        when(osVersionProvider.getOrElse("")).thenReturn("10.15.7");
        when(providerFactoryMock.exec(any(Action.class))).thenReturn(execOutputMock);
        when(execOutputMock.getStandardOutput()).thenReturn(standardOutputMock);
        when(standardOutputMock.getAsText()).thenReturn(outputProvider);
        when(outputProvider.get()).thenReturn("4");
        when(startParameterMock.getMaxWorkerCount()).thenReturn(8);
        int result = ParallelDetector.findDefaultParallel(projectMock);
        assertEquals(4, result);
    }

    @Disabled()
    @Test
    void testFindDefaultParallelOnMacAppleSilicon() {
        Provider<String> osNameProvider = mock(Provider.class);
        Provider<String> osArchProvider = mock(Provider.class);
        Provider<String> osVersionProvider = mock(Provider.class);
        ExecOutput execOutputMock = mock(ExecOutput.class);
        ExecOutput.StandardStreamContent standardOutputMock = mock(ExecOutput.StandardStreamContent.class);
        Provider<String> outputProvider = mock(Provider.class);
        when(providerFactoryMock.systemProperty("os.name")).thenReturn(osNameProvider);
        when(osNameProvider.getOrElse("")).thenReturn("Mac OS X");
        when(providerFactoryMock.systemProperty("os.arch")).thenReturn(osArchProvider);
        when(osArchProvider.getOrElse("")).thenReturn("aarch64");
        when(providerFactoryMock.systemProperty("os.version")).thenReturn(osVersionProvider);
        when(osVersionProvider.getOrElse("")).thenReturn("12.0.1");
        when(providerFactoryMock.exec(any(Action.class))).thenReturn(execOutputMock);
        when(execOutputMock.getStandardOutput()).thenReturn(standardOutputMock);
        when(standardOutputMock.getAsText()).thenReturn(outputProvider);
        when(outputProvider.get()).thenReturn("8");
        when(startParameterMock.getMaxWorkerCount()).thenReturn(16);
        int result = ParallelDetector.findDefaultParallel(projectMock);
        assertEquals(8, result);
    }

    @Test
    void testFindDefaultParallelFallback() {
        when(providerFactoryMock.systemProperty("os.name")).thenReturn(mock(Provider.class));
        when(startParameterMock.getMaxWorkerCount()).thenReturn(4);
        int result = ParallelDetector.findDefaultParallel(projectMock);
        assertTrue(result > 0 && result <= 4);
    }
}

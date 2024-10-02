package org.elasticsearch.gradle.internal.info;

import org.elasticsearch.gradle.internal.info.GlobalBuildInfoPlugin;

import static org.mockito.Mockito.doReturn;

import java.nio.file.Files;
import java.io.UncheckedIOException;

import static org.mockito.ArgumentMatchers.any;

import org.gradle.internal.jvm.inspection.JvmMetadataDetector;
import org.gradle.api.plugins.ExtensionContainer;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;

import org.gradle.api.GradleException;

import java.io.IOException;

import org.gradle.internal.jvm.Jvm;
import org.gradle.api.plugins.PluginContainer;

import static org.mockito.Mockito.doNothing;

import java.nio.file.Path;

import org.junit.jupiter.api.AfterEach;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

import org.gradle.internal.jvm.inspection.JvmToolchainMetadata;
import org.junit.jupiter.api.Timeout;
import org.gradle.util.GradleVersion;
import org.gradle.api.plugins.JvmToolchainsPlugin;
import org.gradle.jvm.toolchain.JavaLanguageVersion;
import org.gradle.api.provider.Provider;
import org.elasticsearch.gradle.internal.conventions.info.GitInfo;

import static org.hamcrest.Matchers.is;

import org.gradle.api.invocation.Gradle;
import org.gradle.api.provider.Property;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;

import java.io.File;

import org.gradle.api.execution.TaskExecutionGraph;
import org.gradle.api.Action;
import org.gradle.api.JavaVersion;

import static org.mockito.Mockito.atLeast;

import org.gradle.api.provider.ProviderFactory;

import java.util.function.Consumer;

import org.gradle.jvm.toolchain.internal.InstallationLocation;

import static org.mockito.Mockito.times;

import org.gradle.jvm.toolchain.JavaLauncher;
import org.mockito.MockedStatic;
import org.gradle.api.model.ObjectFactory;

import static org.junit.jupiter.api.Assertions.assertAll;

import java.util.List;

import static org.mockito.ArgumentMatchers.eq;

import org.gradle.internal.jvm.inspection.JavaInstallationRegistry;
import org.elasticsearch.gradle.VersionProperties;
import org.gradle.api.Plugin;

import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.notNullValue;

import org.gradle.api.UnknownDomainObjectException;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.mockStatic;

import org.elasticsearch.gradle.util.GradleUtils;

import static org.mockito.Mockito.CALLS_REAL_METHODS;

import org.mockito.InjectMocks;

import java.util.ArrayList;
import java.util.concurrent.Callable;

import org.gradle.jvm.toolchain.JavaToolchainService;
import org.gradle.api.Transformer;

import static org.mockito.Mockito.verify;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class GlobalBuildInfoPluginSapientGeneratedTest {

    private final ObjectFactory objectFactoryMock = mock(ObjectFactory.class, "objectFactory");

    private final JavaToolchainService toolChainServiceMock = mock(JavaToolchainService.class, "toolChainService");

    private final ProviderFactory providersMock = mock(ProviderFactory.class, "providers");

    private final JavaInstallationRegistry javaInstallationRegistryMock = mock(JavaInstallationRegistry.class, "javaInstallationRegistry");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private GlobalBuildInfoPlugin target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    @Test()
    void applyWhenProjectNotEqualsProjectGetRootProjectThrowsIllegalStateException() {
        Project projectMock = mock(Project.class);
        Project projectMock2 = mock(Project.class);
        doReturn(projectMock2).when(projectMock).getRootProject();
        JvmMetadataDetector jvmMetadataDetectorMock = mock(JvmMetadataDetector.class);
        target = new GlobalBuildInfoPlugin(objectFactoryMock, javaInstallationRegistryMock, jvmMetadataDetectorMock, providersMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        IllegalStateException illegalStateException = new IllegalStateException("org.elasticsearch.gradle.internal.info.GlobalBuildInfoPlugin can only be applied to the root project.");
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.apply(projectMock);
        });
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
            verify(projectMock).getRootProject();
        });
    }

    @Test()
    void applyWhenGradleVersionCurrentCompareToMinimumGradleVersionLessThan0ThrowsGradleException() throws UnknownDomainObjectException {
        Project projectMock = mock(Project.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        Plugin pluginMock = mock(Plugin.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        GradleVersion gradleVersionMock = mock(GradleVersion.class);
        GradleVersion gradleVersionMock2 = mock(GradleVersion.class);
        JvmMetadataDetector jvmMetadataDetectorMock = mock(JvmMetadataDetector.class);
        try (MockedStatic<GradleVersion> gradleVersion = mockStatic(GradleVersion.class);
             MockedStatic<GlobalBuildInfoPlugin> globalBuildInfoPlugin = mockStatic(GlobalBuildInfoPlugin.class)) {
            doReturn(projectMock).when(projectMock).getRootProject();
            doReturn(pluginContainerMock).when(projectMock).getPlugins();
            doReturn(pluginMock).when(pluginContainerMock).apply(JvmToolchainsPlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(toolChainServiceMock).when(extensionContainerMock).getByType(JavaToolchainService.class);
            globalBuildInfoPlugin.when(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumGradleVersion")).thenReturn("return_of_getResourceContents1");
            gradleVersion.when(() -> GradleVersion.version("return_of_getResourceContents1")).thenReturn(gradleVersionMock);
            doReturn("A").when(gradleVersionMock).getVersion();
            gradleVersion.when(() -> GradleVersion.current()).thenReturn(gradleVersionMock2);
            doReturn(-1).when(gradleVersionMock2).compareTo(gradleVersionMock);
            target = new GlobalBuildInfoPlugin(objectFactoryMock, javaInstallationRegistryMock, jvmMetadataDetectorMock, providersMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            final GradleException result = assertThrows(GradleException.class, () -> {
                target.apply(projectMock);
            });
            GradleException gradleException = new GradleException("Gradle A+ is required");
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(gradleException.getMessage()));
                verify(projectMock).getRootProject();
                verify(projectMock).getPlugins();
                verify(pluginContainerMock).apply(JvmToolchainsPlugin.class);
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByType(JavaToolchainService.class);
                globalBuildInfoPlugin.verify(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumGradleVersion"), atLeast(1));
                gradleVersion.verify(() -> GradleVersion.version("return_of_getResourceContents1"), atLeast(1));
                verify(gradleVersionMock).getVersion();
                gradleVersion.verify(() -> GradleVersion.current(), atLeast(1));
                verify(gradleVersionMock2).compareTo(gradleVersionMock);
            });
        }
    }

    @Test()
    void getResourceContentsWhenBLengthNotEquals0AndCaughtIOExceptionThrowsUncheckedIOException() {
        IOException iOException = new IOException();
        UncheckedIOException uncheckedIOException = new UncheckedIOException("Error trying to read classpath resource: server/src/main/java/org/elasticsearch/Version.java", iOException);
        final UncheckedIOException result = assertThrows(UncheckedIOException.class, () -> {
            GlobalBuildInfoPlugin.getResourceContents("server/src/main/java/org/elasticsearch/Version.java");
        });
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(uncheckedIOException.getMessage()));
            assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
        });
    }
}

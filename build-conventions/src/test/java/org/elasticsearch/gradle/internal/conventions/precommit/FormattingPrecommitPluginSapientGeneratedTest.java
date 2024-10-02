package org.elasticsearch.gradle.internal.conventions.precommit;

import org.elasticsearch.gradle.internal.conventions.precommit.FormattingPrecommitPlugin;
import org.elasticsearch.gradle.internal.conventions.util.Util;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.invocation.Gradle;
import org.gradle.api.plugins.PluginManager;
import com.diffplug.gradle.spotless.SpotlessPlugin;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.gradle.api.Project;
import java.io.File;
import org.gradle.api.Plugin;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.artifacts.dsl.RepositoryHandler;
import org.gradle.api.plugins.ExtensionContainer;
import com.diffplug.gradle.spotless.SpotlessExtension;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import org.elasticsearch.gradle.internal.conventions.precommit.FormattingPrecommitPlugin;
import org.gradle.api.tasks.TaskProvider;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

class FormattingPrecommitPluginSapientGeneratedTest {

    @Disabled()
    @Test
    void applyWithoutBuildPerformanceTest() {
        Project projectMock = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        RepositoryHandler repositoryHandlerMock = mock(RepositoryHandler.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        SpotlessExtension spotlessExtensionMock = mock(SpotlessExtension.class);
        Gradle gradleMock = mock(Gradle.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider<org.gradle.api.Task> taskProviderMock = mock(TaskProvider.class);
        when(projectMock.getPluginManager()).thenReturn(pluginManagerMock);
        when(projectMock.getPlugins()).thenReturn(pluginContainerMock);
        when(projectMock.getRepositories()).thenReturn(repositoryHandlerMock);
        when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
        when(projectMock.getGradle()).thenReturn(gradleMock);
        when(projectMock.getTasks()).thenReturn(taskContainerMock);
        when(extensionContainerMock.getByType(SpotlessExtension.class)).thenReturn(spotlessExtensionMock);
        when(taskContainerMock.named("precommit")).thenReturn(taskProviderMock);
        try (MockedStatic<Util> mockedUtil = mockStatic(Util.class)) {
            mockedUtil.when(() -> Util.locateElasticsearchWorkspace(any())).thenReturn(new File("dummy"));
            FormattingPrecommitPlugin plugin = new FormattingPrecommitPlugin();
            plugin.apply(projectMock);
            verify(pluginManagerMock).withPlugin(eq("java-base"), any());
            verify(pluginContainerMock).apply(PrecommitTaskPlugin.class);
            verify(pluginContainerMock).apply(SpotlessPlugin.class);
            verify(repositoryHandlerMock).mavenCentral();
            verify(spotlessExtensionMock).java(any());
            verify(taskProviderMock).configure(any());
        }
    }

    @Disabled()
    @ParameterizedTest
    @ValueSource(booleans = { true, false })
    void applyWithBuildPerformanceTest(boolean isBuildPerformanceTest) {
        Project projectMock = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        RepositoryHandler repositoryHandlerMock = mock(RepositoryHandler.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        SpotlessExtension spotlessExtensionMock = mock(SpotlessExtension.class);
        Gradle gradleMock = mock(Gradle.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider<org.gradle.api.Task> taskProviderMock = mock(TaskProvider.class);
        when(projectMock.getPluginManager()).thenReturn(pluginManagerMock);
        when(projectMock.getPlugins()).thenReturn(pluginContainerMock);
        when(projectMock.getRepositories()).thenReturn(repositoryHandlerMock);
        when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
        when(projectMock.getGradle()).thenReturn(gradleMock);
        when(projectMock.getTasks()).thenReturn(taskContainerMock);
        when(extensionContainerMock.getByType(SpotlessExtension.class)).thenReturn(spotlessExtensionMock);
        when(taskContainerMock.named("precommit")).thenReturn(taskProviderMock);
        when(projectMock.getPath()).thenReturn(":server");
        try (MockedStatic<Util> mockedUtil = mockStatic(Util.class);
            MockedStatic<Boolean> mockedBoolean = mockStatic(Boolean.class)) {
            mockedUtil.when(() -> Util.locateElasticsearchWorkspace(any())).thenReturn(new File("dummy"));
            mockedBoolean.when(() -> Boolean.getBoolean("BUILD_PERFORMANCE_TEST")).thenReturn(isBuildPerformanceTest);
            FormattingPrecommitPlugin plugin = new FormattingPrecommitPlugin();
            plugin.apply(projectMock);
            verify(pluginManagerMock).withPlugin(eq("java-base"), any());
            verify(pluginContainerMock).apply(PrecommitTaskPlugin.class);
            verify(pluginContainerMock).apply(SpotlessPlugin.class);
            verify(repositoryHandlerMock).mavenCentral();
            verify(spotlessExtensionMock).java(any());
            verify(taskProviderMock).configure(any());
        }
    }

    @Disabled()
    @Test
    void applyWithNonServerProject() {
        Project projectMock = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        RepositoryHandler repositoryHandlerMock = mock(RepositoryHandler.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        SpotlessExtension spotlessExtensionMock = mock(SpotlessExtension.class);
        Gradle gradleMock = mock(Gradle.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider<org.gradle.api.Task> taskProviderMock = mock(TaskProvider.class);
        when(projectMock.getPluginManager()).thenReturn(pluginManagerMock);
        when(projectMock.getPlugins()).thenReturn(pluginContainerMock);
        when(projectMock.getRepositories()).thenReturn(repositoryHandlerMock);
        when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
        when(projectMock.getGradle()).thenReturn(gradleMock);
        when(projectMock.getTasks()).thenReturn(taskContainerMock);
        when(extensionContainerMock.getByType(SpotlessExtension.class)).thenReturn(spotlessExtensionMock);
        when(taskContainerMock.named("precommit")).thenReturn(taskProviderMock);
        when(projectMock.getPath()).thenReturn(":non-server");
        try (MockedStatic<Util> mockedUtil = mockStatic(Util.class);
            MockedStatic<Boolean> mockedBoolean = mockStatic(Boolean.class)) {
            mockedUtil.when(() -> Util.locateElasticsearchWorkspace(any())).thenReturn(new File("dummy"));
            mockedBoolean.when(() -> Boolean.getBoolean("BUILD_PERFORMANCE_TEST")).thenReturn(true);
            FormattingPrecommitPlugin plugin = new FormattingPrecommitPlugin();
            plugin.apply(projectMock);
            verify(pluginManagerMock).withPlugin(eq("java-base"), any());
            verify(pluginContainerMock).apply(PrecommitTaskPlugin.class);
            verify(pluginContainerMock).apply(SpotlessPlugin.class);
            verify(repositoryHandlerMock).mavenCentral();
            verify(spotlessExtensionMock).java(any());
            verify(taskProviderMock).configure(any());
        }
    }
}

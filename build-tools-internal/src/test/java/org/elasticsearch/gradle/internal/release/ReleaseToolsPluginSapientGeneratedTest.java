package org.elasticsearch.gradle.internal.release;

import org.elasticsearch.gradle.internal.release.ReleaseToolsPlugin;

import org.elasticsearch.gradle.internal.conventions.precommit.PrecommitTaskPlugin;
import org.elasticsearch.gradle.Version;
import org.gradle.api.plugins.PluginManager;
import org.junit.jupiter.api.Test;
import org.gradle.api.file.FileTree;
import org.elasticsearch.gradle.internal.precommit.ValidateYamlAgainstSchemaTask;
import org.gradle.api.Project;

import java.io.File;

import org.elasticsearch.gradle.VersionProperties;
import org.gradle.api.Action;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.file.ProjectLayout;
import org.gradle.api.tasks.util.PatternSet;
import org.gradle.api.file.Directory;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.tasks.TaskProvider;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;

import org.gradle.api.Task;

import static org.mockito.ArgumentMatchers.any;

class ReleaseToolsPluginSapientGeneratedTest {

    @Test
    void applyTest() {
        // Arrange
        Project projectMock = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        Directory projectDirectoryMock = mock(Directory.class);
        Directory changelogDirectoryMock = mock(Directory.class);
        FileTree fileTreeMock = mock(FileTree.class);
        Version versionMock = mock(Version.class);
        when(projectMock.getPluginManager()).thenReturn(pluginManagerMock);
        when(projectMock.getTasks()).thenReturn(taskContainerMock);
        when(projectMock.getRootDir()).thenReturn(new File("rootDir"));
        when(projectMock.getBuildDir()).thenReturn(new File("buildDir"));
        when(projectLayoutMock.getProjectDirectory()).thenReturn(projectDirectoryMock);
        when(projectDirectoryMock.dir("docs/changelog")).thenReturn(changelogDirectoryMock);
        when(changelogDirectoryMock.getAsFileTree()).thenReturn(fileTreeMock);
        when(fileTreeMock.matching(any(PatternSet.class))).thenReturn(fileTreeMock);
        try (MockedStatic<VersionProperties> versionPropertiesMock = mockStatic(VersionProperties.class)) {
            versionPropertiesMock.when(VersionProperties::getElasticsearchVersion).thenReturn(versionMock);
            // Act
            ReleaseToolsPlugin plugin = new ReleaseToolsPlugin(projectLayoutMock);
            plugin.apply(projectMock);
            // Assert
            verify(pluginManagerMock).apply(PrecommitTaskPlugin.class);
            verify(taskContainerMock).register(eq("updateVersions"), eq(UpdateVersionsTask.class), any(Action.class));
            verify(taskContainerMock).register("extractCurrentVersions", ExtractCurrentVersionsTask.class);
            verify(taskContainerMock).register("tagVersions", TagVersionsTask.class);
            verify(taskContainerMock).register(eq("setCompatibleVersions"), eq(SetCompatibleVersionsTask.class), any(Action.class));
            verify(taskContainerMock).register(eq("validateChangelogs"), eq(ValidateYamlAgainstSchemaTask.class), any(Action.class));
            verify(taskContainerMock).register(eq("generateReleaseNotes"), eq(GenerateReleaseNotesTask.class));
            verify(taskContainerMock).register(eq("generateStubReleaseNotes"), eq(GenerateReleaseNotesTask.class));
            verify(taskContainerMock).register(eq("pruneChangelogs"), eq(PruneChangelogsTask.class), any(Action.class));
            verify(taskContainerMock).named("precommit");
            versionPropertiesMock.verify(VersionProperties::getElasticsearchVersion);
        }
    }
}

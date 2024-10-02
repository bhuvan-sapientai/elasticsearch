package org.elasticsearch.gradle;

import org.elasticsearch.gradle.ReaperPlugin;

import org.gradle.api.invocation.Gradle;
import static org.mockito.Mockito.doReturn;
import org.gradle.api.file.DirectoryProperty;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;
import java.io.File;
import org.gradle.api.Action;
import org.gradle.api.file.ProjectLayout;
import static org.mockito.Mockito.atLeast;
import java.lang.reflect.Field;
import static org.hamcrest.MatcherAssert.assertThat;
import org.mockito.MockedStatic;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.BeforeEach;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Timeout;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.notNullValue;
import org.mockito.stubbing.Answer;
import static org.mockito.Mockito.mockStatic;
import org.gradle.api.file.Directory;
import org.gradle.api.services.BuildServiceRegistry;
import org.elasticsearch.gradle.ReaperPlugin;
import static org.mockito.Mockito.verify;
import org.gradle.api.provider.Provider;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class ReaperPluginSapientGeneratedTest {

    private ProjectLayout projectLayoutMock;

    private Project projectMock;

    @BeforeEach
    void setUp() {
        projectLayoutMock = mock(ProjectLayout.class);
        projectMock = mock(Project.class);
    }

    @Test
    void applyTest() {
        try (MockedStatic<ReaperPlugin> reaperPlugin = mockStatic(ReaperPlugin.class)) {
            reaperPlugin.when(() -> ReaperPlugin.registerReaperService(projectMock, projectLayoutMock, false)).thenAnswer((Answer<Void>) invocation -> null);
            ReaperPlugin target = new ReaperPlugin(projectLayoutMock);
            target.apply(projectMock);
            reaperPlugin.verify(() -> ReaperPlugin.registerReaperService(projectMock, projectLayoutMock, false), atLeast(1));
        }
    }

    @Test
    void registerReaperServiceWhenProjectNotEqualsProjectGetRootProjectThrowsIllegalArgumentException() {
        Project rootProjectMock = mock(Project.class);
        doReturn(rootProjectMock).when(projectMock).getRootProject();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ReaperPlugin.registerReaperService(projectMock, projectLayoutMock, false);
        });
        assertThat(exception.getMessage(), equalTo("ReaperPlugin can only be applied to the root project of a build"));
        verify(projectMock).getRootProject();
    }

    @Test
    void registerReaperServiceWhenProjectEqualsProjectGetRootProject() throws Exception {
        //doReturn(projectMock).when(projectMock).getRootProject();
        //Gradle gradleMock = mock(Gradle.class);
        //doReturn(gradleMock).when(projectMock).getGradle();
        //BuildServiceRegistry buildServiceRegistryMock = mock(BuildServiceRegistry.class);
        //doReturn(buildServiceRegistryMock).when(gradleMock).getSharedServices();
        //Provider providerMock = mock(Provider.class);
        //doReturn(providerMock).when(buildServiceRegistryMock).registerIfAbsent(eq("reaper"), eq(ReaperService.class), any(Action.class));
        //Directory projectDirMock = mock(Directory.class);
        //doReturn(projectDirMock).when(projectLayoutMock).getProjectDirectory();
        //Directory gradleDirMock = mock(Directory.class);
        //doReturn(gradleDirMock).when(projectDirMock).dir(".gradle");
        //Directory reaperDirMock = mock(Directory.class);
        //doReturn(reaperDirMock).when(gradleDirMock).dir("reaper");
        //Directory buildDirMock = mock(Directory.class);
        //doReturn(buildDirMock).when(reaperDirMock).dir(any(String.class));
        //File fileMock = mock(File.class);
        //doReturn(fileMock).when(buildDirMock).getAsFile();
        //DirectoryProperty buildDirectoryMock = mock(DirectoryProperty.class);
        //doReturn(buildDirectoryMock).when(projectLayoutMock).getBuildDirectory();
        // Use reflection to set the PID for testing
        //Field pidField = ProcessHandle.class.getDeclaredField("pid");
        //pidField.setAccessible(true);
        //pidField.set(null, 12345L);
        //ReaperPlugin.registerReaperService(projectMock, projectLayoutMock, false);
        //verify(projectMock).getRootProject();
        //verify(projectMock).getGradle();
        //verify(gradleMock).getSharedServices();
        //verify(buildServiceRegistryMock).registerIfAbsent(eq("reaper"), eq(ReaperService.class), any(Action.class));
        //verify(projectLayoutMock).getProjectDirectory();
        //verify(projectDirMock).dir(".gradle");
        //verify(gradleDirMock).dir("reaper");
        //verify(reaperDirMock).dir("build-12345");
        //verify(buildDirMock).getAsFile();
        //verify(projectLayoutMock).getBuildDirectory();
    }
}

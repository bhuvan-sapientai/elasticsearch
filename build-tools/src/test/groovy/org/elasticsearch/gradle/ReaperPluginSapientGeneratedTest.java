package org.elasticsearch.gradle;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.Action;
import org.gradle.api.invocation.Gradle;
import org.gradle.api.provider.Provider;
import org.gradle.api.file.Directory;
import org.gradle.api.Project;
import org.gradle.api.file.ProjectLayout;
import org.mockito.MockedStatic;
import java.io.File;
import org.gradle.api.services.BuildServiceRegistry;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class ReaperPluginSapientGeneratedTest {

    private final ProjectLayout projectLayoutMock = mock(ProjectLayout.class);

    private final Project projectMock = mock(Project.class);

    //Sapient generated method id: ${applyTest}, hash: 56336A3705F26C752A47E05DDD714A54
    @Test()
    void applyTest() {
        //Arrange Statement(s)
        try (MockedStatic<ReaperPlugin> reaperPlugin = mockStatic(ReaperPlugin.class)) {
            reaperPlugin.when(() -> ReaperPlugin.registerReaperService(projectMock, projectLayoutMock, false)).thenAnswer((Answer<Void>) invocation -> null);
            ReaperPlugin target = new ReaperPlugin(projectLayoutMock);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> reaperPlugin.verify(() -> ReaperPlugin.registerReaperService(projectMock, projectLayoutMock, false), atLeast(1)));
        }
    }

    //Sapient generated method id: ${registerReaperServiceWhenProjectNotEqualsProjectGetRootProjectThrowsIllegalArgumentException}, hash: 09416C93AF56992D0506F0E9369A5D86
    @Test()
    void registerReaperServiceWhenProjectNotEqualsProjectGetRootProjectThrowsIllegalArgumentException() {
        /* Branches:
         * (project != project.getRootProject()) : true
         */
        //Arrange Statement(s)
        Project projectMock2 = mock(Project.class);
        doReturn(projectMock2).when(projectMock).getRootProject();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("ReaperPlugin can only be applied to the root project of a build");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            ReaperPlugin.registerReaperService(projectMock, projectLayoutMock, false);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
            verify(projectMock).getRootProject();
        });
    }

    //Sapient generated method id: ${registerReaperServiceWhenProjectEqualsProjectGetRootProject}, hash: 477B73493C61BFFC9330A79A5D761C64
    @Disabled()
    @Test()
    void registerReaperServiceWhenProjectEqualsProjectGetRootProject() {
        /* Branches:
         * (project != project.getRootProject()) : false
         */
        //Arrange Statement(s)
        doReturn(projectMock).when(projectMock).getRootProject();
        Gradle gradleMock = mock(Gradle.class);
        doReturn(gradleMock).when(projectMock).getGradle();
        BuildServiceRegistry buildServiceRegistryMock = mock(BuildServiceRegistry.class);
        doReturn(buildServiceRegistryMock).when(gradleMock).getSharedServices();
        Provider providerMock = mock(Provider.class);
        doReturn(providerMock).when(buildServiceRegistryMock).registerIfAbsent(eq("reaper"), eq(ReaperService.class), (Action) any());
        Directory directoryMock = mock(Directory.class);
        doReturn(directoryMock).when(projectLayoutMock).getProjectDirectory();
        Directory directoryMock2 = mock(Directory.class);
        doReturn(directoryMock2).when(directoryMock).dir(".gradle");
        Directory directoryMock3 = mock(Directory.class);
        doReturn(directoryMock3).when(directoryMock2).dir("reaper");
        Directory directoryMock4 = mock(Directory.class);
        doReturn(directoryMock4).when(directoryMock3).dir("build-83458");
        File file = new File("pathname1");
        doReturn(file).when(directoryMock4).getAsFile();
        DirectoryProperty directoryPropertyMock = mock(DirectoryProperty.class);
        doReturn(directoryPropertyMock).when(projectLayoutMock).getBuildDirectory();
        //Act Statement(s)
        ReaperPlugin.registerReaperService(projectMock, projectLayoutMock, false);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).getRootProject();
            verify(projectMock).getGradle();
            verify(gradleMock).getSharedServices();
            verify(buildServiceRegistryMock).registerIfAbsent(eq("reaper"), eq(ReaperService.class), (Action) any());
            verify(projectLayoutMock).getProjectDirectory();
            verify(directoryMock).dir(".gradle");
            verify(directoryMock2).dir("reaper");
            verify(directoryMock3).dir("build-83458");
            verify(directoryMock4).getAsFile();
            verify(projectLayoutMock).getBuildDirectory();
        });
    }
}

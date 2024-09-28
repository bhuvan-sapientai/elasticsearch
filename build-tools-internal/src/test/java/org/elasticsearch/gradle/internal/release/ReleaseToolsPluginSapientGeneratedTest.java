package org.elasticsearch.gradle.internal.release;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.UnknownTaskException;
import org.elasticsearch.gradle.internal.conventions.precommit.PrecommitTaskPlugin;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.Task;
import org.elasticsearch.gradle.internal.precommit.ValidateYamlAgainstSchemaTask;
import org.elasticsearch.gradle.VersionProperties;
import org.elasticsearch.gradle.Version;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.gradle.api.file.Directory;
import org.gradle.api.Project;
import org.gradle.api.tasks.util.PatternSet;
import org.gradle.api.file.ProjectLayout;
import org.mockito.MockedStatic;
import java.io.File;
import org.gradle.api.file.FileTree;
import org.gradle.api.plugins.PluginManager;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class ReleaseToolsPluginSapientGeneratedTest {

    private final ProjectLayout projectLayoutMock = mock(ProjectLayout.class, "projectLayout");

    //Sapient generated method id: ${applyTest}, hash: 57589B2BD2E69AFEFAC31506F4FCBE9F
    @Disabled()
    @Test()
    void applyTest() throws InvalidUserDataException, UnknownTaskException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.File
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider taskProviderMock = mock(TaskProvider.class);
        TaskContainer taskContainerMock2 = mock(TaskContainer.class);
        TaskProvider taskProviderMock2 = mock(TaskProvider.class);
        Task taskMock = mock(Task.class);
        Task taskMock2 = mock(Task.class);
        UpdateVersionsTask updateVersionsTaskMock = mock(UpdateVersionsTask.class);
        TaskContainer taskContainerMock3 = mock(TaskContainer.class);
        TaskProvider taskProviderMock3 = mock(TaskProvider.class);
        TaskContainer taskContainerMock4 = mock(TaskContainer.class);
        TaskProvider taskProviderMock4 = mock(TaskProvider.class);
        TaskContainer taskContainerMock5 = mock(TaskContainer.class);
        TaskProvider taskProviderMock5 = mock(TaskProvider.class);
        TaskContainer taskContainerMock6 = mock(TaskContainer.class);
        TaskProvider taskProviderMock6 = mock(TaskProvider.class);
        TaskContainer taskContainerMock7 = mock(TaskContainer.class);
        TaskProvider taskProviderMock7 = mock(TaskProvider.class);
        Action actionMock = mock(Action.class);
        TaskContainer taskContainerMock8 = mock(TaskContainer.class);
        TaskProvider taskProviderMock8 = mock(TaskProvider.class);
        Action actionMock2 = mock(Action.class);
        TaskContainer taskContainerMock9 = mock(TaskContainer.class);
        TaskProvider taskProviderMock9 = mock(TaskProvider.class);
        TaskContainer taskContainerMock10 = mock(TaskContainer.class);
        TaskProvider taskProviderMock10 = mock(TaskProvider.class);
        Directory directoryMock = mock(Directory.class);
        Directory directoryMock2 = mock(Directory.class);
        FileTree fileTreeMock = mock(FileTree.class);
        FileTree fileTreeMock2 = mock(FileTree.class);
        Version versionMock = mock(Version.class);
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(pluginManagerMock).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock).apply(PrecommitTaskPlugin.class);
            doReturn(taskProviderMock).when(taskContainerMock).register(eq("updateVersions"), eq(UpdateVersionsTask.class), (Action) any());
            doReturn(taskProviderMock2).when(taskContainerMock2).named("spotlessApply");
            doReturn(taskMock).when(taskProviderMock2).get();
            Object[] objectArray = new Object[] { updateVersionsTaskMock };
            doReturn(taskMock2).when(taskMock).mustRunAfter(objectArray);
            doReturn(taskProviderMock3).when(taskContainerMock3).register("extractCurrentVersions", ExtractCurrentVersionsTask.class);
            doReturn(taskProviderMock4).when(taskContainerMock4).register("tagVersions", TagVersionsTask.class);
            doReturn(taskProviderMock5).when(taskContainerMock5).register(eq("setCompatibleVersions"), eq(SetCompatibleVersionsTask.class), (Action) any());
            doReturn(taskProviderMock6).when(taskContainerMock6).register(eq("validateChangelogs"), eq(ValidateYamlAgainstSchemaTask.class), (Action) any());
            File file = new File("pathname1");
            doReturn(file).when(projectMock).getRootDir();
            File file2 = new File("pathname1");
            doReturn(file2).when(projectMock).getBuildDir();
            doReturn(taskProviderMock7).when(taskContainerMock7).register("generateReleaseNotes", GenerateReleaseNotesTask.class);
            doNothing().when(taskProviderMock7).configure(actionMock);
            doReturn(taskProviderMock8).when(taskContainerMock8).register("generateStubReleaseNotes", GenerateReleaseNotesTask.class);
            doNothing().when(taskProviderMock8).configure(actionMock2);
            doReturn(taskProviderMock9).when(taskContainerMock9).register("pruneChangelogs", PruneChangelogsTask.class);
            doNothing().when(taskProviderMock9).configure((Action) any());
            doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3, taskContainerMock4, taskContainerMock5, taskContainerMock6, taskContainerMock7, taskContainerMock8, taskContainerMock9, taskContainerMock10).when(projectMock).getTasks();
            doReturn(taskProviderMock10).when(taskContainerMock10).named("precommit");
            doNothing().when(taskProviderMock10).configure((Action) any());
            doReturn(directoryMock).when(projectLayoutMock).getProjectDirectory();
            doReturn(directoryMock2).when(directoryMock).dir("docs/changelog");
            doReturn(fileTreeMock).when(directoryMock2).getAsFileTree();
            doReturn(fileTreeMock2).when(fileTreeMock).matching((PatternSet) any());
            versionProperties.when(() -> VersionProperties.getElasticsearchVersion()).thenReturn(versionMock);
            ReleaseToolsPlugin target = new ReleaseToolsPlugin(projectLayoutMock);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).getPluginManager();
                verify(pluginManagerMock).apply(PrecommitTaskPlugin.class);
                verify(projectMock, times(10)).getTasks();
                verify(taskContainerMock).register(eq("updateVersions"), eq(UpdateVersionsTask.class), (Action) any());
                verify(taskContainerMock2).named("spotlessApply");
                verify(taskProviderMock2).get();
                verify(taskMock).mustRunAfter(objectArray);
                verify(taskContainerMock3).register("extractCurrentVersions", ExtractCurrentVersionsTask.class);
                verify(taskContainerMock4).register("tagVersions", TagVersionsTask.class);
                verify(taskContainerMock5).register(eq("setCompatibleVersions"), eq(SetCompatibleVersionsTask.class), (Action) any());
                verify(taskContainerMock6).register(eq("validateChangelogs"), eq(ValidateYamlAgainstSchemaTask.class), (Action) any());
                verify(projectMock).getRootDir();
                verify(projectMock).getBuildDir();
                verify(taskContainerMock7).register("generateReleaseNotes", GenerateReleaseNotesTask.class);
                verify(taskProviderMock7).configure(actionMock);
                verify(taskContainerMock8).register("generateStubReleaseNotes", GenerateReleaseNotesTask.class);
                verify(taskProviderMock8).configure(actionMock2);
                verify(taskContainerMock9).register("pruneChangelogs", PruneChangelogsTask.class);
                verify(taskProviderMock9).configure((Action) any());
                verify(taskContainerMock10).named("precommit");
                verify(taskProviderMock10).configure((Action) any());
                verify(projectLayoutMock).getProjectDirectory();
                verify(directoryMock).dir("docs/changelog");
                verify(directoryMock2).getAsFileTree();
                verify(fileTreeMock).matching((PatternSet) any());
                versionProperties.verify(() -> VersionProperties.getElasticsearchVersion(), atLeast(1));
            });
        }
    }
}

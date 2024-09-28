package org.elasticsearch.gradle.internal.conventions.precommit;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.UnknownTaskException;
import org.gradle.api.artifacts.dsl.RepositoryHandler;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.Action;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.invocation.Gradle;
import com.diffplug.gradle.spotless.SpotlessExtension;
import org.gradle.api.Project;
import org.elasticsearch.gradle.internal.conventions.util.Util;
import org.gradle.api.tasks.TaskProvider;
import org.mockito.MockedStatic;
import java.io.File;
import org.gradle.api.Plugin;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.artifacts.repositories.MavenArtifactRepository;
import org.gradle.api.plugins.PluginManager;
import com.diffplug.gradle.spotless.SpotlessPlugin;
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

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FormattingPrecommitPluginSapientGeneratedTest {

    //Sapient generated method id: ${applyWhenBooleanNotGetBooleanBUILD_PERFORMANCE_TEST}, hash: D04497D262A3DA2D182863A795198086
    @Disabled()
    @Test()
    void applyWhenBooleanNotGetBooleanBUILD_PERFORMANCE_TEST() throws UnknownDomainObjectException, UnknownTaskException {
        /* Branches:
         * (Boolean.getBoolean("BUILD_PERFORMANCE_TEST")) : false  #  inside lambda$apply$0 method
         *
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
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        Plugin pluginMock = mock(Plugin.class);
        PluginContainer pluginContainerMock2 = mock(PluginContainer.class);
        Plugin pluginMock2 = mock(Plugin.class);
        RepositoryHandler repositoryHandlerMock = mock(RepositoryHandler.class);
        MavenArtifactRepository mavenArtifactRepositoryMock = mock(MavenArtifactRepository.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        SpotlessExtension spotlessExtensionMock = mock(SpotlessExtension.class);
        Gradle gradleMock = mock(Gradle.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider taskProviderMock = mock(TaskProvider.class);
        try (MockedStatic<Util> util = mockStatic(Util.class)) {
            doReturn(pluginManagerMock).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock).withPlugin(eq("java-base"), (Action) any());
            doReturn(pluginMock).when(pluginContainerMock).apply(PrecommitTaskPlugin.class);
            doReturn(pluginContainerMock, pluginContainerMock2).when(projectMock).getPlugins();
            doReturn(pluginMock2).when(pluginContainerMock2).apply(SpotlessPlugin.class);
            doReturn(repositoryHandlerMock).when(projectMock).getRepositories();
            doReturn(mavenArtifactRepositoryMock).when(repositoryHandlerMock).mavenCentral();
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(spotlessExtensionMock).when(extensionContainerMock).getByType(SpotlessExtension.class);
            doNothing().when(spotlessExtensionMock).java((Action) any());
            doReturn(gradleMock).when(projectMock).getGradle();
            doReturn(taskContainerMock).when(projectMock).getTasks();
            doReturn(taskProviderMock).when(taskContainerMock).named("precommit");
            doNothing().when(taskProviderMock).configure((Action) any());
            File file = new File("pathname1");
            util.when(() -> Util.locateElasticsearchWorkspace(gradleMock)).thenReturn(file);
            FormattingPrecommitPlugin target = new FormattingPrecommitPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).getPluginManager();
                verify(pluginManagerMock).withPlugin(eq("java-base"), (Action) any());
                verify(projectMock, times(2)).getPlugins();
                verify(pluginContainerMock).apply(PrecommitTaskPlugin.class);
                verify(pluginContainerMock2).apply(SpotlessPlugin.class);
                verify(projectMock).getRepositories();
                verify(repositoryHandlerMock).mavenCentral();
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByType(SpotlessExtension.class);
                verify(spotlessExtensionMock).java((Action) any());
                verify(projectMock).getGradle();
                verify(projectMock).getTasks();
                verify(taskContainerMock).named("precommit");
                verify(taskProviderMock).configure((Action) any());
                util.verify(() -> Util.locateElasticsearchWorkspace(gradleMock), atLeast(1));
            });
        }
    }
}

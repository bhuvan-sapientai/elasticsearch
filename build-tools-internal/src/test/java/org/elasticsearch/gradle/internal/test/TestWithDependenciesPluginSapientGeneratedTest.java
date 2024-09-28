package org.elasticsearch.gradle.internal.test;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.plugins.ExtraPropertiesExtension.UnknownPropertyException;
import org.gradle.api.artifacts.UnknownConfigurationException;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.UnknownTaskException;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.Action;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.invocation.Gradle;
import org.gradle.api.plugins.ExtraPropertiesExtension;
import org.gradle.api.Project;
import org.gradle.api.tasks.Copy;
import java.util.Map;
import java.util.HashMap;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.tasks.SourceSetContainer;
import java.io.File;
import org.gradle.api.artifacts.DependencySet;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.tasks.SourceSetOutput;
import org.gradle.api.plugins.ExtensionContainer;
import static java.util.Map.entry;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class TestWithDependenciesPluginSapientGeneratedTest {

    private final ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);

    private final ExtraPropertiesExtension extraPropertiesExtensionMock = mock(ExtraPropertiesExtension.class);

    private final Object objectMock = mock(Object.class, "object");

    private final Project projectMock = mock(Project.class);

    //Sapient generated method id: ${applyWhenBooleanValueOfExtraPropertiesGetIsEclipseToString}, hash: FFFED5978D82C09F72DC20315E682A2D
    @Disabled()
    @Test()
    void applyWhenBooleanValueOfExtraPropertiesGetIsEclipseToString() throws UnknownPropertyException {
        /* Branches:
         * (extraProperties.has("isEclipse")) : true
         * (Boolean.valueOf(extraProperties.get("isEclipse").toString())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        doReturn(extraPropertiesExtensionMock).when(extensionContainerMock).getExtraProperties();
        doReturn(false).when(extraPropertiesExtensionMock).has("isEclipse");
        doReturn(objectMock).when(extraPropertiesExtensionMock).get("isEclipse");
        TestWithDependenciesPlugin target = new TestWithDependenciesPlugin();
        //Act Statement(s)
        target.apply(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).getExtraProperties();
            verify(extraPropertiesExtensionMock).has("isEclipse");
            verify(extraPropertiesExtensionMock).get("isEclipse");
        });
    }

    //Sapient generated method id: ${applyWhenDepGetDependencyProjectGetPluginsHasPluginPluginBuildPlugin}, hash: 891DB9E15C83AC434602B5F49D0BC991
    @Disabled()
    @Test()
    void applyWhenDepGetDependencyProjectGetPluginsHasPluginPluginBuildPlugin() throws UnknownConfigurationException, UnknownDomainObjectException, UnknownPropertyException, InvalidUserDataException, UnknownTaskException {
        /* Branches:
         * (extraProperties.has("isEclipse")) : true
         * (Boolean.valueOf(extraProperties.get("isEclipse").toString())) : false
         * (dep instanceof ProjectDependency) : true  #  inside lambda$apply$1 method
         * (((ProjectDependency) dep).getDependencyProject().getPlugins().hasPlugin(PluginBuildPlugin.class)) : true  #  inside lambda$apply$1 method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.File
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        doReturn(extraPropertiesExtensionMock).when(extensionContainerMock).getExtraProperties();
        doReturn(true).when(extraPropertiesExtensionMock).has("isEclipse");
        doReturn(objectMock).when(extraPropertiesExtensionMock).get("isEclipse");
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        doReturn(configurationContainerMock).when(projectMock).getConfigurations();
        Configuration configurationMock = mock(Configuration.class);
        doReturn(configurationMock).when(configurationContainerMock).getByName("testImplementation");
        DependencySet dependencySetMock = mock(DependencySet.class);
        doReturn(dependencySetMock).when(configurationMock).getDependencies();
        doNothing().when(dependencySetMock).all((Action) any());
        Gradle gradleMock = mock(Gradle.class);
        doReturn(gradleMock).when(projectMock).getGradle();
        doNothing().when(gradleMock).projectsEvaluated((Action) any());
        File file = new File("pathname1");
        doReturn(file).when(projectMock).getBuildDir();
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        doReturn(taskContainerMock).when(projectMock).getTasks();
        TaskProvider taskProviderMock = mock(TaskProvider.class);
        doReturn(taskProviderMock).when(taskContainerMock).register(eq("copyMetadata"), eq(Copy.class), (Action) any());
        ExtensionContainer extensionContainerMock2 = mock(ExtensionContainer.class);
        doReturn(extensionContainerMock, extensionContainerMock2).when(projectMock).getExtensions();
        SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        doReturn(sourceSetContainerMock).when(extensionContainerMock2).getByType(SourceSetContainer.class);
        SourceSet sourceSetMock = mock(SourceSet.class);
        doReturn(sourceSetMock).when(sourceSetContainerMock).getByName("test");
        SourceSetOutput sourceSetOutputMock = mock(SourceSetOutput.class);
        doReturn(sourceSetOutputMock).when(sourceSetMock).getOutput();
        Map<String, Object> stringObjectMap = new HashMap<>(Map.ofEntries(entry("builtBy", "copyMetadata")));
        doNothing().when(sourceSetOutputMock).dir(eq(stringObjectMap), (File) any());
        TestWithDependenciesPlugin target = new TestWithDependenciesPlugin();
        //Act Statement(s)
        target.apply(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock, times(2)).getExtensions();
            verify(extensionContainerMock).getExtraProperties();
            verify(extraPropertiesExtensionMock).has("isEclipse");
            verify(extraPropertiesExtensionMock).get("isEclipse");
            verify(projectMock).getConfigurations();
            verify(configurationContainerMock).getByName("testImplementation");
            verify(configurationMock).getDependencies();
            verify(dependencySetMock).all((Action) any());
            verify(projectMock).getGradle();
            verify(gradleMock).projectsEvaluated((Action) any());
            verify(projectMock).getBuildDir();
            verify(projectMock).getTasks();
            verify(taskContainerMock).register(eq("copyMetadata"), eq(Copy.class), (Action) any());
            verify(extensionContainerMock2).getByType(SourceSetContainer.class);
            verify(sourceSetContainerMock).getByName("test");
            verify(sourceSetMock).getOutput();
            verify(sourceSetOutputMock).dir(eq(stringObjectMap), (File) any());
        });
    }
}

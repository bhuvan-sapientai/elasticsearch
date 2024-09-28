package org.elasticsearch.gradle.internal.precommit;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.UnknownProjectException;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.artifacts.Dependency;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.gradle.api.plugins.JavaPluginExtension;
import org.gradle.api.Project;
import org.gradle.api.specs.Spec;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.Task;
import org.gradle.api.NamedDomainObjectSet;
import org.gradle.api.plugins.ExtensionContainer;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class LoggerUsagePrecommitPluginSapientGeneratedTest {

    private final ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);

    private final Configuration configurationMock = mock(Configuration.class);

    private final DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);

    private final Dependency dependencyMock = mock(Dependency.class);

    private final ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);

    private final JavaPluginExtension javaPluginExtensionMock = mock(JavaPluginExtension.class);

    private final NamedDomainObjectSet namedDomainObjectSetMock = mock(NamedDomainObjectSet.class);

    private final Project projectMock = mock(Project.class);

    private final Project projectMock2 = mock(Project.class);

    private final Project projectMock3 = mock(Project.class);

    private final SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);

    private final TaskContainer taskContainerMock = mock(TaskContainer.class);

    private final TaskProvider<LoggerUsageTask> taskProviderMock = mock(TaskProvider.class);

    //Sapient generated method id: ${createTaskWhenSourceSetGetNameEqualsSourceSetTEST_SOURCE_SET_NAME}, hash: F2F05FD2FEE9A09E7CBF690EBC5D182D
    @Disabled()
    @Test()
    void createTaskWhenSourceSetGetNameEqualsSourceSetTEST_SOURCE_SET_NAME() throws InvalidUserDataException, UnknownDomainObjectException, UnknownProjectException {
        /* Branches:
         * (project.findProject(":test:logger-usage") != null) : true
         * (sourceSet.getName().equals(SourceSet.MAIN_SOURCE_SET_NAME)) : false  #  inside lambda$createTask$0 method
         * (sourceSet.getName().equals(SourceSet.TEST_SOURCE_SET_NAME)) : true  #  inside lambda$createTask$0 method
         */
        //Arrange Statement(s)
        doReturn(configurationContainerMock).when(projectMock).getConfigurations();
        doReturn(configurationMock).when(configurationContainerMock).create("loggerUsagePlugin");
        doReturn(projectMock2).when(projectMock).findProject(":test:logger-usage");
        doReturn(dependencyHandlerMock).when(projectMock).getDependencies();
        doReturn(dependencyMock).when(dependencyHandlerMock).add("loggerUsagePlugin", projectMock3);
        doReturn(projectMock3).when(projectMock).project(":test:logger-usage");
        doReturn(taskContainerMock).when(projectMock).getTasks();
        doReturn(taskProviderMock).when(taskContainerMock).register("loggerUsageCheck", LoggerUsageTask.class);
        doNothing().when(taskProviderMock).configure((Action) any());
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        doReturn(javaPluginExtensionMock).when(extensionContainerMock).getByType(JavaPluginExtension.class);
        doReturn(sourceSetContainerMock).when(javaPluginExtensionMock).getSourceSets();
        doReturn(namedDomainObjectSetMock).when(sourceSetContainerMock).matching((Spec) any());
        doNothing().when(namedDomainObjectSetMock).all((Action) any());
        LoggerUsagePrecommitPlugin target = new LoggerUsagePrecommitPlugin();
        //Act Statement(s)
        TaskProvider<? extends Task> result = target.createTask(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(taskProviderMock));
            verify(projectMock).getConfigurations();
            verify(configurationContainerMock).create("loggerUsagePlugin");
            verify(projectMock).findProject(":test:logger-usage");
            verify(projectMock).getDependencies();
            verify(dependencyHandlerMock).add("loggerUsagePlugin", projectMock3);
            verify(projectMock).project(":test:logger-usage");
            verify(projectMock).getTasks();
            verify(taskContainerMock).register("loggerUsageCheck", LoggerUsageTask.class);
            verify(taskProviderMock, atLeast(2)).configure((Action) any());
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).getByType(JavaPluginExtension.class);
            verify(javaPluginExtensionMock).getSourceSets();
            verify(sourceSetContainerMock).matching((Spec) any());
            verify(namedDomainObjectSetMock).all((Action) any());
        });
    }

    //Sapient generated method id: ${createTaskWhenSourceSetGetNameNotEqualsSourceSetTEST_SOURCE_SET_NAME}, hash: F35B3373176CC5A9971E273482953D3E
    @Disabled()
    @Test()
    void createTaskWhenSourceSetGetNameNotEqualsSourceSetTEST_SOURCE_SET_NAME() throws InvalidUserDataException, UnknownDomainObjectException, UnknownProjectException {
        /* Branches:
         * (project.findProject(":test:logger-usage") != null) : true
         * (sourceSet.getName().equals(SourceSet.MAIN_SOURCE_SET_NAME)) : false  #  inside lambda$createTask$0 method
         * (sourceSet.getName().equals(SourceSet.TEST_SOURCE_SET_NAME)) : false  #  inside lambda$createTask$0 method
         */
        //Arrange Statement(s)
        doReturn(configurationContainerMock).when(projectMock).getConfigurations();
        doReturn(configurationMock).when(configurationContainerMock).create("loggerUsagePlugin");
        doReturn(projectMock2).when(projectMock).findProject(":test:logger-usage");
        doReturn(dependencyHandlerMock).when(projectMock).getDependencies();
        doReturn(dependencyMock).when(dependencyHandlerMock).add("loggerUsagePlugin", projectMock3);
        doReturn(projectMock3).when(projectMock).project(":test:logger-usage");
        doReturn(taskContainerMock).when(projectMock).getTasks();
        doReturn(taskProviderMock).when(taskContainerMock).register("loggerUsageCheck", LoggerUsageTask.class);
        doNothing().when(taskProviderMock).configure((Action) any());
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        doReturn(javaPluginExtensionMock).when(extensionContainerMock).getByType(JavaPluginExtension.class);
        doReturn(sourceSetContainerMock).when(javaPluginExtensionMock).getSourceSets();
        doReturn(namedDomainObjectSetMock).when(sourceSetContainerMock).matching((Spec) any());
        doNothing().when(namedDomainObjectSetMock).all((Action) any());
        LoggerUsagePrecommitPlugin target = new LoggerUsagePrecommitPlugin();
        //Act Statement(s)
        TaskProvider<? extends Task> result = target.createTask(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(taskProviderMock));
            verify(projectMock).getConfigurations();
            verify(configurationContainerMock).create("loggerUsagePlugin");
            verify(projectMock).findProject(":test:logger-usage");
            verify(projectMock).getDependencies();
            verify(dependencyHandlerMock).add("loggerUsagePlugin", projectMock3);
            verify(projectMock).project(":test:logger-usage");
            verify(projectMock).getTasks();
            verify(taskContainerMock).register("loggerUsageCheck", LoggerUsageTask.class);
            verify(taskProviderMock, atLeast(2)).configure((Action) any());
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).getByType(JavaPluginExtension.class);
            verify(javaPluginExtensionMock).getSourceSets();
            verify(sourceSetContainerMock).matching((Spec) any());
            verify(namedDomainObjectSetMock).all((Action) any());
        });
    }
}

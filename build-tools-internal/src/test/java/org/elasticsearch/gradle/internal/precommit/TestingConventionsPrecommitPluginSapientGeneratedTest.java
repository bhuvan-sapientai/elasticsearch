package org.elasticsearch.gradle.internal.precommit;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.plugins.JavaPluginExtension;
import org.gradle.api.Action;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.plugins.JavaBasePlugin;
import org.elasticsearch.gradle.internal.test.rest.LegacyJavaRestTestPlugin;
import org.gradle.api.Project;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.api.tasks.TaskCollection;
import org.gradle.api.DomainObjectCollection;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.Task;
import org.gradle.api.NamedDomainObjectProvider;
import org.gradle.api.tasks.SourceSet;
import org.elasticsearch.gradle.internal.test.rest.LegacyYamlRestTestPlugin;
import org.elasticsearch.gradle.internal.test.rest.InternalJavaRestTestPlugin;
import org.gradle.api.Plugin;
import org.gradle.api.plugins.ExtensionContainer;
import org.elasticsearch.gradle.internal.test.InternalClusterTestPlugin;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class TestingConventionsPrecommitPluginSapientGeneratedTest {

    //Sapient generated method id: ${createTaskTest}, hash: 5AF6CD684DB0A34BC4D392E5E4123478
    @Disabled()
    @Test()
    void createTaskTest() throws UnknownDomainObjectException, InvalidUserDataException {
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        Plugin pluginMock = mock(Plugin.class);
        doReturn(pluginMock).when(pluginContainerMock).apply(JavaBasePlugin.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        JavaPluginExtension javaPluginExtensionMock = mock(JavaPluginExtension.class);
        doReturn(javaPluginExtensionMock).when(extensionContainerMock).getByType(JavaPluginExtension.class);
        SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        doReturn(sourceSetContainerMock).when(javaPluginExtensionMock).getSourceSets();
        NamedDomainObjectProvider<SourceSet> namedDomainObjectProviderMock = mock(NamedDomainObjectProvider.class);
        doReturn(namedDomainObjectProviderMock).when(sourceSetContainerMock).named("test");
        doNothing().when(namedDomainObjectProviderMock).configure((Action) any());
        NamedDomainObjectProvider<SourceSet> namedDomainObjectProviderMock2 = mock(NamedDomainObjectProvider.class);
        doReturn(namedDomainObjectProviderMock2).when(sourceSetContainerMock).named("yamlRestTest");
        doNothing().when(namedDomainObjectProviderMock2).configure((Action) any());
        NamedDomainObjectProvider<SourceSet> namedDomainObjectProviderMock3 = mock(NamedDomainObjectProvider.class);
        doReturn(namedDomainObjectProviderMock3).when(sourceSetContainerMock).named("internalClusterTest");
        doNothing().when(namedDomainObjectProviderMock3).configure((Action) any());
        NamedDomainObjectProvider<SourceSet> namedDomainObjectProviderMock4 = mock(NamedDomainObjectProvider.class);
        doNothing().when(namedDomainObjectProviderMock4).configure((Action) any());
        NamedDomainObjectProvider<SourceSet> namedDomainObjectProviderMock5 = mock(NamedDomainObjectProvider.class);
        doReturn(namedDomainObjectProviderMock4, namedDomainObjectProviderMock5).when(sourceSetContainerMock).named("javaRestTest");
        doNothing().when(namedDomainObjectProviderMock5).configure((Action) any());
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskCollection taskCollectionMock = mock(TaskCollection.class);
        doReturn(taskCollectionMock).when(taskContainerMock).withType(TestingConventionsCheckTask.class);
        TaskProvider<Task> taskProviderMock = mock(TaskProvider.class);
        doReturn(taskProviderMock).when(taskContainerMock).register(eq("testingConventions"), (Action) any());
        PluginContainer pluginContainerMock2 = mock(PluginContainer.class);
        DomainObjectCollection domainObjectCollectionMock = mock(DomainObjectCollection.class);
        doReturn(domainObjectCollectionMock).when(pluginContainerMock2).withType(eq(JavaPlugin.class), (Action) any());
        TaskContainer taskContainerMock2 = mock(TaskContainer.class);
        TaskProvider<TestingConventionsCheckTask> taskProviderMock2 = mock(TaskProvider.class);
        doReturn(taskProviderMock2).when(taskContainerMock2).register(eq("return_of_getTaskName1"), eq(TestingConventionsCheckTask.class), (Action) any());
        doNothing().when(taskProviderMock2).configure((Action) any());
        PluginContainer pluginContainerMock3 = mock(PluginContainer.class);
        DomainObjectCollection domainObjectCollectionMock2 = mock(DomainObjectCollection.class);
        doReturn(domainObjectCollectionMock2).when(pluginContainerMock3).withType(eq(LegacyYamlRestTestPlugin.class), (Action) any());
        TaskContainer taskContainerMock3 = mock(TaskContainer.class);
        TaskProvider<TestingConventionsCheckTask> taskProviderMock3 = mock(TaskProvider.class);
        doReturn(taskProviderMock3).when(taskContainerMock3).register(eq("return_of_getTaskName1"), eq(TestingConventionsCheckTask.class), (Action) any());
        doNothing().when(taskProviderMock3).configure((Action) any());
        PluginContainer pluginContainerMock4 = mock(PluginContainer.class);
        DomainObjectCollection domainObjectCollectionMock3 = mock(DomainObjectCollection.class);
        doReturn(domainObjectCollectionMock3).when(pluginContainerMock4).withType(eq(InternalClusterTestPlugin.class), (Action) any());
        TaskContainer taskContainerMock4 = mock(TaskContainer.class);
        TaskProvider<TestingConventionsCheckTask> taskProviderMock4 = mock(TaskProvider.class);
        doReturn(taskProviderMock4).when(taskContainerMock4).register(eq("return_of_getTaskName1"), eq(TestingConventionsCheckTask.class), (Action) any());
        doNothing().when(taskProviderMock4).configure((Action) any());
        PluginContainer pluginContainerMock5 = mock(PluginContainer.class);
        DomainObjectCollection domainObjectCollectionMock4 = mock(DomainObjectCollection.class);
        doReturn(domainObjectCollectionMock4).when(pluginContainerMock5).withType(eq(LegacyJavaRestTestPlugin.class), (Action) any());
        TaskContainer taskContainerMock5 = mock(TaskContainer.class);
        TaskProvider<TestingConventionsCheckTask> taskProviderMock5 = mock(TaskProvider.class);
        doReturn(taskProviderMock5).when(taskContainerMock5).register(eq("return_of_getTaskName1"), eq(TestingConventionsCheckTask.class), (Action) any());
        doNothing().when(taskProviderMock5).configure((Action) any());
        PluginContainer pluginContainerMock6 = mock(PluginContainer.class);
        doReturn(pluginContainerMock, pluginContainerMock2, pluginContainerMock3, pluginContainerMock4, pluginContainerMock5, pluginContainerMock6).when(projectMock).getPlugins();
        DomainObjectCollection domainObjectCollectionMock5 = mock(DomainObjectCollection.class);
        doReturn(domainObjectCollectionMock5).when(pluginContainerMock6).withType(eq(InternalJavaRestTestPlugin.class), (Action) any());
        TaskContainer taskContainerMock6 = mock(TaskContainer.class);
        doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3, taskContainerMock4, taskContainerMock5, taskContainerMock6).when(projectMock).getTasks();
        TaskProvider<TestingConventionsCheckTask> taskProviderMock6 = mock(TaskProvider.class);
        doReturn(taskProviderMock6).when(taskContainerMock6).register(eq("return_of_getTaskName1"), eq(TestingConventionsCheckTask.class), (Action) any());
        doNothing().when(taskProviderMock6).configure((Action) any());
        TestingConventionsPrecommitPlugin target = new TestingConventionsPrecommitPlugin();
        //Act Statement(s)
        TaskProvider<? extends Task> result = target.createTask(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(taskProviderMock));
            verify(projectMock, times(6)).getPlugins();
            verify(pluginContainerMock).apply(JavaBasePlugin.class);
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).getByType(JavaPluginExtension.class);
            verify(javaPluginExtensionMock).getSourceSets();
            verify(sourceSetContainerMock).named("test");
            verify(namedDomainObjectProviderMock).configure((Action) any());
            verify(sourceSetContainerMock).named("yamlRestTest");
            verify(namedDomainObjectProviderMock2).configure((Action) any());
            verify(sourceSetContainerMock).named("internalClusterTest");
            verify(namedDomainObjectProviderMock3).configure((Action) any());
            verify(sourceSetContainerMock, times(2)).named("javaRestTest");
            verify(namedDomainObjectProviderMock4).configure((Action) any());
            verify(namedDomainObjectProviderMock5).configure((Action) any());
            verify(projectMock, times(6)).getTasks();
            verify(taskContainerMock).withType(TestingConventionsCheckTask.class);
            verify(taskContainerMock).register(eq("testingConventions"), (Action) any());
            verify(pluginContainerMock2).withType(eq(JavaPlugin.class), (Action) any());
            verify(taskContainerMock2).register(eq("return_of_getTaskName1"), eq(TestingConventionsCheckTask.class), (Action) any());
            verify(taskProviderMock2).configure((Action) any());
            verify(pluginContainerMock3).withType(eq(LegacyYamlRestTestPlugin.class), (Action) any());
            verify(taskContainerMock3).register(eq("return_of_getTaskName1"), eq(TestingConventionsCheckTask.class), (Action) any());
            verify(taskProviderMock3).configure((Action) any());
            verify(pluginContainerMock4).withType(eq(InternalClusterTestPlugin.class), (Action) any());
            verify(taskContainerMock4).register(eq("return_of_getTaskName1"), eq(TestingConventionsCheckTask.class), (Action) any());
            verify(taskProviderMock4).configure((Action) any());
            verify(pluginContainerMock5).withType(eq(LegacyJavaRestTestPlugin.class), (Action) any());
            verify(taskContainerMock5).register(eq("return_of_getTaskName1"), eq(TestingConventionsCheckTask.class), (Action) any());
            verify(taskProviderMock5).configure((Action) any());
            verify(pluginContainerMock6).withType(eq(InternalJavaRestTestPlugin.class), (Action) any());
            verify(taskContainerMock6).register(eq("return_of_getTaskName1"), eq(TestingConventionsCheckTask.class), (Action) any());
            verify(taskProviderMock6).configure((Action) any());
        });
    }
}

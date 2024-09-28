package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.gradle.api.plugins.JavaPluginExtension;
import org.gradle.api.file.SourceDirectorySet;
import org.gradle.api.Project;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.api.DomainObjectCollection;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.tasks.SourceSetContainer;
import java.io.File;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.plugins.ExtensionContainer;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class StringTemplatePluginSapientGeneratedTest {

    //Sapient generated method id: ${applyTest}, hash: F7A1E01A0819CB44ED83AC30EBE363E7
    @Disabled()
    @Test()
    void applyTest() throws UnknownDomainObjectException, InvalidUserDataException {
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        File file = new File("pathname1");
        doReturn(file).when(projectMock).file("src/main/generated-src/");
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        doReturn(taskContainerMock).when(projectMock).getTasks();
        TaskProvider<StringTemplateTask> taskProviderMock = mock(TaskProvider.class);
        doReturn(taskProviderMock).when(taskContainerMock).register("stringTemplates", StringTemplateTask.class);
        doNothing().when(taskProviderMock).configure((Action) any());
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        doReturn(pluginContainerMock).when(projectMock).getPlugins();
        DomainObjectCollection domainObjectCollectionMock = mock(DomainObjectCollection.class);
        doReturn(domainObjectCollectionMock).when(pluginContainerMock).withType(eq(JavaPlugin.class), (Action) any());
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        JavaPluginExtension javaPluginExtensionMock = mock(JavaPluginExtension.class);
        doReturn(javaPluginExtensionMock).when(extensionContainerMock).getByType(JavaPluginExtension.class);
        SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        doReturn(sourceSetContainerMock).when(javaPluginExtensionMock).getSourceSets();
        SourceSet sourceSetMock = mock(SourceSet.class);
        doReturn(sourceSetMock).when(sourceSetContainerMock).getByName("main");
        SourceDirectorySet sourceDirectorySetMock = mock(SourceDirectorySet.class);
        doReturn(sourceDirectorySetMock).when(sourceSetMock).getJava();
        SourceDirectorySet sourceDirectorySetMock2 = mock(SourceDirectorySet.class);
        doReturn(sourceDirectorySetMock2).when(sourceDirectorySetMock).srcDir(taskProviderMock);
        StringTemplatePlugin target = new StringTemplatePlugin();
        //Act Statement(s)
        target.apply(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).file("src/main/generated-src/");
            verify(projectMock).getTasks();
            verify(taskContainerMock).register("stringTemplates", StringTemplateTask.class);
            verify(taskProviderMock).configure((Action) any());
            verify(projectMock).getPlugins();
            verify(pluginContainerMock).withType(eq(JavaPlugin.class), (Action) any());
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).getByType(JavaPluginExtension.class);
            verify(javaPluginExtensionMock).getSourceSets();
            verify(sourceSetContainerMock).getByName("main");
            verify(sourceSetMock).getJava();
            verify(sourceDirectorySetMock).srcDir(taskProviderMock);
        });
    }
}

package org.elasticsearch.gradle.internal.snyk;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.UnknownConfigurationException;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.invocation.Gradle;
import org.gradle.api.provider.Provider;
import java.util.concurrent.Callable;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.api.provider.ProviderFactory;
import org.elasticsearch.gradle.internal.conventions.info.GitInfo;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.gradle.api.plugins.JavaPluginExtension;
import org.gradle.api.file.RegularFile;
import org.gradle.api.Project;
import org.gradle.api.DomainObjectCollection;
import org.gradle.api.file.ProjectLayout;
import org.mockito.MockedStatic;
import java.io.File;
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
class SnykDependencyMonitoringGradlePluginSapientGeneratedTest {

    private final ProviderFactory providerFactoryMock = mock(ProviderFactory.class, "providerFactory");

    private final ProjectLayout projectLayoutMock = mock(ProjectLayout.class, "projectLayout");

    //Sapient generated method id: ${applyTest}, hash: 1D69F72D4DD660B8684505CD8CB63AA6
    @Disabled()
    @Test()
    void applyTest() throws UnknownConfigurationException, UnknownDomainObjectException, InvalidUserDataException {
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider<GenerateSnykDependencyGraph> taskProviderMock = mock(TaskProvider.class);
        GenerateSnykDependencyGraph generateSnykDependencyGraphMock = mock(GenerateSnykDependencyGraph.class);
        RegularFileProperty regularFilePropertyMock = mock(RegularFileProperty.class);
        Object objectMock = mock(Object.class, "object");
        Gradle gradleMock = mock(Gradle.class);
        TaskContainer taskContainerMock2 = mock(TaskContainer.class);
        TaskProvider taskProviderMock2 = mock(TaskProvider.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        DomainObjectCollection domainObjectCollectionMock = mock(DomainObjectCollection.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        JavaPluginExtension javaPluginExtensionMock = mock(JavaPluginExtension.class);
        SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        SourceSet sourceSetMock = mock(SourceSet.class);
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        Configuration configurationMock = mock(Configuration.class);
        Provider<String> providerMock = mock(Provider.class);
        Provider providerMock2 = mock(Provider.class);
        Provider providerMock3 = mock(Provider.class);
        Provider<String> providerMock4 = mock(Provider.class);
        Provider<String> providerMock5 = mock(Provider.class);
        DirectoryProperty directoryPropertyMock = mock(DirectoryProperty.class);
        Provider<RegularFile> providerMock6 = mock(Provider.class);
        GitInfo gitInfoMock = mock(GitInfo.class);
        try (MockedStatic<GitInfo> gitInfo = mockStatic(GitInfo.class)) {
            doReturn(taskProviderMock).when(taskContainerMock).register(eq("generateSnykDependencyGraph"), eq(GenerateSnykDependencyGraph.class), (Action) any());
            doReturn(generateSnykDependencyGraphMock).when(taskProviderMock).get();
            doReturn(regularFilePropertyMock).when(generateSnykDependencyGraphMock).getOutputFile();
            doNothing().when(taskProviderMock).configure((Action) any());
            doReturn("return_of_getPath1").when(projectMock).getPath();
            doReturn("return_of_getName1").when(projectMock).getName();
            doReturn(objectMock).when(projectMock).getVersion();
            doReturn(gradleMock).when(projectMock).getGradle();
            doReturn("return_of_getGradleVersion1").when(gradleMock).getGradleVersion();
            File file = new File("pathname1");
            doReturn(file).when(projectMock).getRootDir();
            doReturn(taskContainerMock, taskContainerMock2).when(projectMock).getTasks();
            doReturn(taskProviderMock2).when(taskContainerMock2).register(eq("uploadSnykDependencyGraph"), eq(UploadSnykDependenciesGraph.class), (Action) any());
            doReturn(pluginContainerMock).when(projectMock).getPlugins();
            doReturn(domainObjectCollectionMock).when(pluginContainerMock).withType(eq(JavaPlugin.class), (Action) any());
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(javaPluginExtensionMock).when(extensionContainerMock).getByType(JavaPluginExtension.class);
            doReturn(sourceSetContainerMock).when(javaPluginExtensionMock).getSourceSets();
            doReturn(sourceSetMock).when(sourceSetContainerMock).getByName("main");
            doReturn("return_of_getRuntimeClasspathConfigurationName1").when(sourceSetMock).getRuntimeClasspathConfigurationName();
            doReturn(configurationContainerMock).when(projectMock).getConfigurations();
            doReturn(configurationMock).when(configurationContainerMock).getByName("return_of_getRuntimeClasspathConfigurationName1");
            doReturn(providerMock).when(providerFactoryMock).gradleProperty("snykTargetReference");
            doReturn(providerMock2).when(providerMock).orElse("object");
            doReturn(providerMock3).when(providerFactoryMock).provider((Callable) any());
            doReturn(providerMock4).when(providerFactoryMock).environmentVariable("SNYK_TOKEN");
            doReturn(providerMock5).when(providerFactoryMock).gradleProperty("snykOrganisation");
            doReturn(directoryPropertyMock).when(projectLayoutMock).getBuildDirectory();
            doReturn(providerMock6).when(directoryPropertyMock).file("snyk/dependencies.json");
            gitInfo.when(() -> GitInfo.gitInfo(file)).thenReturn(gitInfoMock);
            doReturn("return_of_urlFromOrigin1").when(gitInfoMock).urlFromOrigin();
            SnykDependencyMonitoringGradlePlugin target = new SnykDependencyMonitoringGradlePlugin(projectLayoutMock, providerFactoryMock);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(2)).getTasks();
                verify(taskContainerMock).register(eq("generateSnykDependencyGraph"), eq(GenerateSnykDependencyGraph.class), (Action) any());
                verify(taskProviderMock, atLeast(1)).get();
                verify(generateSnykDependencyGraphMock).getOutputFile();
                verify(taskProviderMock).configure((Action) any());
                verify(projectMock).getPath();
                verify(projectMock).getName();
                verify(projectMock).getVersion();
                verify(projectMock).getGradle();
                verify(gradleMock).getGradleVersion();
                verify(projectMock).getRootDir();
                verify(taskContainerMock2).register(eq("uploadSnykDependencyGraph"), eq(UploadSnykDependenciesGraph.class), (Action) any());
                verify(projectMock).getPlugins();
                verify(pluginContainerMock).withType(eq(JavaPlugin.class), (Action) any());
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByType(JavaPluginExtension.class);
                verify(javaPluginExtensionMock).getSourceSets();
                verify(sourceSetContainerMock).getByName("main");
                verify(sourceSetMock).getRuntimeClasspathConfigurationName();
                verify(projectMock).getConfigurations();
                verify(configurationContainerMock).getByName("return_of_getRuntimeClasspathConfigurationName1");
                verify(providerFactoryMock).gradleProperty("snykTargetReference");
                verify(providerMock).orElse("object");
                verify(providerFactoryMock).provider((Callable) any());
                verify(providerFactoryMock).environmentVariable("SNYK_TOKEN");
                verify(providerFactoryMock).gradleProperty("snykOrganisation");
                verify(projectLayoutMock).getBuildDirectory();
                verify(directoryPropertyMock).file("snyk/dependencies.json");
                gitInfo.verify(() -> GitInfo.gitInfo(file), atLeast(1));
                verify(gitInfoMock).urlFromOrigin();
            });
        }
    }
}

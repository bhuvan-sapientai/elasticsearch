package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.UnknownConfigurationException;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.UnknownTaskException;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.jvm.tasks.Jar;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.provider.Property;
import org.gradle.api.artifacts.Dependency;
import org.gradle.api.plugins.JavaPluginExtension;
import org.gradle.api.Action;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.provider.Provider;
import java.util.concurrent.Callable;
import org.gradle.api.Project;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.api.DomainObjectCollection;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.gradle.api.plugins.BasePluginExtension;
import org.gradle.api.tasks.TaskProvider;
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
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class InternalTestArtifactExtensionSapientGeneratedTest {

    private final Project projectMock = mock(Project.class, "project");

    private final ProviderFactory providerFactoryMock = mock(ProviderFactory.class, "providerFactory");

    //Sapient generated method id: ${registerTestArtifactFromSourceSetTest}, hash: 19E8818F48C794B1240B910B44FA3B7F
    @Disabled()
    @Test()
    void registerTestArtifactFromSourceSetTest() throws UnknownConfigurationException, InvalidUserDataException, UnknownDomainObjectException, UnknownTaskException {
        //Arrange Statement(s)
        SourceSet sourceSetMock = mock(SourceSet.class);
        doReturn("A", "C").when(sourceSetMock).getName();
        doReturn("return_of_getApiElementsConfigurationName1").when(sourceSetMock).getApiElementsConfigurationName();
        doReturn("D").when(sourceSetMock).getApiConfigurationName();
        doReturn("return_of_getRuntimeElementsConfigurationName1", "E").when(sourceSetMock).getRuntimeElementsConfigurationName();
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        JavaPluginExtension javaPluginExtensionMock = mock(JavaPluginExtension.class);
        doReturn(javaPluginExtensionMock).when(extensionContainerMock).getByType(JavaPluginExtension.class);
        doNothing().when(javaPluginExtensionMock).registerFeature(eq("AArtifacts"), (Action) any());
        doReturn("B").when(projectMock).getName();
        DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        doReturn(dependencyHandlerMock).when(projectMock).getDependencies();
        Dependency dependencyMock = mock(Dependency.class);
        doReturn(dependencyMock).when(dependencyHandlerMock).create(projectMock);
        Dependency dependencyMock2 = mock(Dependency.class);
        Dependency dependencyMock3 = mock(Dependency.class);
        doReturn(dependencyMock2, dependencyMock3).when(dependencyHandlerMock).add("return_of_getName1", dependencyMock);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        doReturn(pluginContainerMock).when(projectMock).getPlugins();
        DomainObjectCollection domainObjectCollectionMock = mock(DomainObjectCollection.class);
        doReturn(domainObjectCollectionMock).when(pluginContainerMock).withType(eq(JavaPlugin.class), (Action) any());
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        Configuration configurationMock = mock(Configuration.class);
        doReturn(configurationMock).when(configurationContainerMock).getByName("return_of_getApiElementsConfigurationName1");
        Configuration configurationMock2 = mock(Configuration.class);
        Configuration configurationMock3 = mock(Configuration.class);
        Configuration[] configurationArray = new Configuration[] { configurationMock3 };
        doReturn(configurationMock2).when(configurationMock).extendsFrom(configurationArray);
        doReturn("return_of_getName1").when(configurationMock3).getName();
        ConfigurationContainer configurationContainerMock2 = mock(ConfigurationContainer.class);
        doReturn(configurationMock3).when(configurationContainerMock2).create("DTestArtifacts");
        ConfigurationContainer configurationContainerMock3 = mock(ConfigurationContainer.class);
        Configuration configurationMock4 = mock(Configuration.class);
        doReturn(configurationMock4).when(configurationContainerMock3).getByName("return_of_getRuntimeElementsConfigurationName1");
        Configuration configurationMock5 = mock(Configuration.class);
        Configuration configurationMock6 = mock(Configuration.class);
        Configuration[] configurationArray2 = new Configuration[] { configurationMock6 };
        doReturn(configurationMock5).when(configurationMock4).extendsFrom(configurationArray2);
        doReturn("return_of_getName1").when(configurationMock6).getName();
        ConfigurationContainer configurationContainerMock4 = mock(ConfigurationContainer.class);
        doReturn(configurationContainerMock, configurationContainerMock2, configurationContainerMock3, configurationContainerMock4).when(projectMock).getConfigurations();
        doReturn(configurationMock6).when(configurationContainerMock4).create("ETestArtifacts");
        ExtensionContainer extensionContainerMock2 = mock(ExtensionContainer.class);
        doReturn(extensionContainerMock, extensionContainerMock2).when(projectMock).getExtensions();
        BasePluginExtension basePluginExtensionMock = mock(BasePluginExtension.class);
        doReturn(basePluginExtensionMock).when(extensionContainerMock2).getByType(BasePluginExtension.class);
        Property<String> propertyMock = mock(Property.class);
        doReturn(propertyMock).when(basePluginExtensionMock).getArchivesName();
        doReturn("F").when(propertyMock).get();
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        doReturn(taskContainerMock).when(projectMock).getTasks();
        TaskProvider taskProviderMock = mock(TaskProvider.class);
        doReturn(taskProviderMock).when(taskContainerMock).named("AJar", Jar.class);
        doNothing().when(taskProviderMock).configure((Action) any());
        Provider providerMock = mock(Provider.class);
        doReturn(providerMock).when(providerFactoryMock).provider((Callable) any());
        InternalTestArtifactExtension target = new InternalTestArtifactExtension(projectMock, providerFactoryMock);
        //Act Statement(s)
        target.registerTestArtifactFromSourceSet(sourceSetMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(sourceSetMock, times(2)).getName();
            verify(sourceSetMock).getApiElementsConfigurationName();
            verify(sourceSetMock).getApiConfigurationName();
            verify(sourceSetMock, times(2)).getRuntimeElementsConfigurationName();
            verify(projectMock, times(2)).getExtensions();
            verify(extensionContainerMock).getByType(JavaPluginExtension.class);
            verify(javaPluginExtensionMock).registerFeature(eq("AArtifacts"), (Action) any());
            verify(projectMock).getName();
            verify(projectMock).getDependencies();
            verify(dependencyHandlerMock).create(projectMock);
            verify(dependencyHandlerMock, times(2)).add("return_of_getName1", dependencyMock);
            verify(projectMock).getPlugins();
            verify(pluginContainerMock).withType(eq(JavaPlugin.class), (Action) any());
            verify(projectMock, times(4)).getConfigurations();
            verify(configurationContainerMock).getByName("return_of_getApiElementsConfigurationName1");
            verify(configurationMock).extendsFrom(configurationArray);
            verify(configurationMock3).getName();
            verify(configurationContainerMock2).create("DTestArtifacts");
            verify(configurationContainerMock3).getByName("return_of_getRuntimeElementsConfigurationName1");
            verify(configurationMock4).extendsFrom(configurationArray2);
            verify(configurationMock6).getName();
            verify(configurationContainerMock4).create("ETestArtifacts");
            verify(extensionContainerMock2).getByType(BasePluginExtension.class);
            verify(basePluginExtensionMock).getArchivesName();
            verify(propertyMock).get();
            verify(projectMock).getTasks();
            verify(taskContainerMock).named("AJar", Jar.class);
            verify(taskProviderMock).configure((Action) any());
            verify(providerFactoryMock).provider((Callable) any());
        });
    }
}

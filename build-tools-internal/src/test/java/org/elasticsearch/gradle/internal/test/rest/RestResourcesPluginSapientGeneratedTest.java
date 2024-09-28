package org.elasticsearch.gradle.internal.test.rest;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.reflect.ObjectInstantiationException;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.Transformer;
import org.gradle.api.artifacts.Dependency;
import org.gradle.api.provider.Provider;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.tasks.SourceSetOutput;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.Action;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.file.SourceDirectorySet;
import java.util.Set;
import org.gradle.api.attributes.Usage;
import org.gradle.api.file.Directory;
import org.gradle.api.Project;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.file.ProjectLayout;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import java.io.File;
import org.gradle.api.provider.ListProperty;
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
class RestResourcesPluginSapientGeneratedTest {

    private final ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);

    private final ConfigurationContainer configurationContainerMock2 = mock(ConfigurationContainer.class);

    private final ConfigurationContainer configurationContainerMock3 = mock(ConfigurationContainer.class);

    private final ConfigurationContainer configurationContainerMock4 = mock(ConfigurationContainer.class);

    private final ConfigurationContainer configurationContainerMock5 = mock(ConfigurationContainer.class);

    private final ConfigurationContainer configurationContainerMock6 = mock(ConfigurationContainer.class);

    private final Configuration configurationMock = mock(Configuration.class);

    private final Configuration configurationMock2 = mock(Configuration.class);

    private final Configuration configurationMock3 = mock(Configuration.class);

    private final DirectoryProperty directoryPropertyMock = mock(DirectoryProperty.class);

    private final DirectoryProperty directoryPropertyMock2 = mock(DirectoryProperty.class);

    private final ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);

    private final ExtensionContainer extensionContainerMock2 = mock(ExtensionContainer.class);

    private final File fileMock = mock(File.class);

    private final ListProperty<String> listPropertyMock = mock(ListProperty.class);

    private final ListProperty<String> listPropertyMock2 = mock(ListProperty.class);

    private final ObjectFactory objectFactoryMock = mock(ObjectFactory.class);

    private final ObjectFactory objectFactoryMock2 = mock(ObjectFactory.class);

    private final ObjectFactory objectFactoryMock3 = mock(ObjectFactory.class);

    private final ObjectFactory objectFactoryMock4 = mock(ObjectFactory.class);

    private final ObjectFactory objectFactoryMock5 = mock(ObjectFactory.class);

    private final ObjectFactory objectFactoryMock6 = mock(ObjectFactory.class);

    private final ProjectLayout projectLayoutMock = mock(ProjectLayout.class);

    private final ProjectLayout projectLayoutMock2 = mock(ProjectLayout.class);

    private final Project projectMock = mock(Project.class);

    private final Provider providerMock = mock(Provider.class);

    private final Provider providerMock2 = mock(Provider.class);

    private final Provider providerMock3 = mock(Provider.class);

    private final Provider<Directory> providerMock4 = mock(Provider.class);

    private final Provider<Directory> providerMock5 = mock(Provider.class);

    private final RestResourcesExtension restResourcesExtensionMock = mock(RestResourcesExtension.class);

    private final RestResourcesExtension.RestResourcesSpec restResourcesExtensionRestResourcesSpecMock = mock(RestResourcesExtension.RestResourcesSpec.class);

    private final RestResourcesExtension.XpackRestResourcesSpec restResourcesExtensionXpackRestResourcesSpecMock = mock(RestResourcesExtension.XpackRestResourcesSpec.class);

    private final SourceDirectorySet sourceDirectorySetMock = mock(SourceDirectorySet.class);

    private final SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);

    private final SourceSet sourceSetMock = mock(SourceSet.class);

    private final SourceSetOutput sourceSetOutputMock = mock(SourceSetOutput.class);

    private final SourceSetOutput sourceSetOutputMock2 = mock(SourceSetOutput.class);

    private final TaskContainer taskContainerMock = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock2 = mock(TaskContainer.class);

    private final TaskProvider taskProviderMock = mock(TaskProvider.class);

    private final TaskProvider taskProviderMock2 = mock(TaskProvider.class);

    private final Usage usageMock = mock(Usage.class);

    private final Usage usageMock2 = mock(Usage.class);

    private final Usage usageMock3 = mock(Usage.class);

    private final Usage usageMock4 = mock(Usage.class);

    private final Usage usageMock5 = mock(Usage.class);

    private final Usage usageMock6 = mock(Usage.class);

    //Sapient generated method id: ${applyWhenProjectGetPathEquals_rest_api_specNotEqualsFalseAndNotRestApiSpecProjectAvailableAndFNotIsDirectory}, hash: 82BBB9A6826D919D8C682A68E03C11BF
    @Disabled()
    @Test()
    void applyWhenProjectGetPathEquals_rest_api_specNotEqualsFalseAndNotRestApiSpecProjectAvailableAndFNotIsDirectory() throws InvalidUserDataException, UnknownDomainObjectException, ObjectInstantiationException {
        /* Branches:
         * (project.findProject(":rest-api-spec") != null) : false
         * (restApiSpecProjectAvailable) : false
         * (project.findProject(":x-pack:plugin") != null) : false
         * (restXpackTests) : false
         * (project.getPath().equals(":rest-api-spec") == false) : false  #  inside lambda$apply$4 method
         * (restApiSpecProjectAvailable) : false
         * (f.isDirectory()) : false  #  inside lambda$apply$7 method
         */
        Object[] objectArray = new Object[] {};
        doReturn(restResourcesExtensionMock).when(extensionContainerMock).create("restResources", RestResourcesExtension.class, objectArray);
        doReturn(restResourcesExtensionXpackRestResourcesSpecMock).when(restResourcesExtensionMock).getRestTests();
        doReturn(listPropertyMock).when(restResourcesExtensionXpackRestResourcesSpecMock).getIncludeXpack();
        doReturn(restResourcesExtensionRestResourcesSpecMock).when(restResourcesExtensionMock).getRestApi();
        doReturn(listPropertyMock2).when(restResourcesExtensionRestResourcesSpecMock).getInclude();
        doReturn(extensionContainerMock, extensionContainerMock2).when(projectMock).getExtensions();
        doReturn(sourceSetContainerMock).when(extensionContainerMock2).getByType(SourceSetContainer.class);
        doReturn(sourceSetMock).when(sourceSetContainerMock).maybeCreate("test");
        doReturn(sourceDirectorySetMock).when(sourceSetMock).getResources();
        Set<File> fileSet = new HashSet<>();
        fileSet.add(fileMock);
        doReturn(fileSet).when(sourceDirectorySetMock).getSrcDirs();
        doReturn(false).when(fileMock).isDirectory();
        doNothing().when(sourceSetOutputMock).dir(providerMock);
        doReturn(sourceSetOutputMock, sourceSetOutputMock2).when(sourceSetMock).getOutput();
        doNothing().when(sourceSetOutputMock2).dir(providerMock2);
        doReturn(configurationMock).when(configurationContainerMock).create(eq("restTestConfig"), (Action) any());
        doReturn(usageMock).when(objectFactoryMock).named(Usage.class, "yaml-tests");
        doReturn(configurationMock2).when(configurationContainerMock2).create(eq("restXpackTestConfig"), (Action) any());
        doReturn(usageMock2).when(objectFactoryMock2).named(Usage.class, "yaml-xpack-tests");
        doReturn(null).when(projectMock).findProject(":rest-api-spec");
        doReturn(null).when(projectMock).findProject(":x-pack:plugin");
        Object object = new Object();
        doReturn(object).when(configurationContainerMock3).create(eq("restTests"), (Action) any());
        doReturn(usageMock3).when(objectFactoryMock3).named(Usage.class, "yaml-tests");
        Object object2 = new Object();
        doReturn(object2).when(configurationContainerMock4).create(eq("restXpackTests"), (Action) any());
        doReturn(usageMock4).when(objectFactoryMock4).named(Usage.class, "yaml-xpack-tests");
        doReturn(taskProviderMock).when(taskContainerMock).register(eq("copyYamlTestsTask"), eq(CopyRestTestsTask.class), (Action) any());
        doReturn(providerMock3).when(taskProviderMock).flatMap((Transformer) any());
        doReturn(providerMock2).when(taskProviderMock).map((Transformer) any());
        doReturn(":rest-api-spec").when(projectMock).getPath();
        doReturn(directoryPropertyMock).when(projectLayoutMock).getBuildDirectory();
        doReturn(providerMock4).when(directoryPropertyMock).dir("restResources/yamlTests");
        doReturn(configurationMock3).when(configurationContainerMock5).create(eq("restSpec"), (Action) any());
        doReturn(usageMock5).when(objectFactoryMock5).named(Usage.class, "yaml-spec");
        doReturn(configurationContainerMock, configurationContainerMock2, configurationContainerMock3, configurationContainerMock4, configurationContainerMock5, configurationContainerMock6).when(projectMock).getConfigurations();
        Object object3 = new Object();
        doReturn(object3).when(configurationContainerMock6).create(eq("restSpecs"), (Action) any());
        doReturn(objectFactoryMock, objectFactoryMock2, objectFactoryMock3, objectFactoryMock4, objectFactoryMock5, objectFactoryMock6).when(projectMock).getObjects();
        doReturn(usageMock6).when(objectFactoryMock6).named(Usage.class, "yaml-spec");
        doReturn(taskContainerMock, taskContainerMock2).when(projectMock).getTasks();
        doReturn(taskProviderMock2).when(taskContainerMock2).register(eq("copyRestApiSpecsTask"), eq(CopyRestApiTask.class), (Action) any());
        doReturn(providerMock).when(taskProviderMock2).map((Transformer) any());
        doReturn(projectLayoutMock, projectLayoutMock2).when(projectMock).getLayout();
        doReturn(directoryPropertyMock2).when(projectLayoutMock2).getBuildDirectory();
        doReturn(providerMock5).when(directoryPropertyMock2).dir("restResources/yamlSpecs");
        RestResourcesPlugin target = new RestResourcesPlugin();
        //Act Statement(s)
        target.apply(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock, times(2)).getExtensions();
            verify(extensionContainerMock).create("restResources", RestResourcesExtension.class, objectArray);
            verify(restResourcesExtensionMock).getRestTests();
            verify(restResourcesExtensionXpackRestResourcesSpecMock).getIncludeXpack();
            verify(restResourcesExtensionMock).getRestApi();
            verify(restResourcesExtensionRestResourcesSpecMock).getInclude();
            verify(extensionContainerMock2).getByType(SourceSetContainer.class);
            verify(sourceSetContainerMock).maybeCreate("test");
            verify(sourceSetMock).getResources();
            verify(sourceDirectorySetMock).getSrcDirs();
            verify(fileMock).isDirectory();
            verify(sourceSetMock, times(2)).getOutput();
            verify(sourceSetOutputMock).dir(providerMock);
            verify(sourceSetOutputMock2).dir(providerMock2);
            verify(projectMock, times(6)).getConfigurations();
            verify(configurationContainerMock).create(eq("restTestConfig"), (Action) any());
            verify(projectMock, times(6)).getObjects();
            verify(objectFactoryMock).named(Usage.class, "yaml-tests");
            verify(configurationContainerMock2).create(eq("restXpackTestConfig"), (Action) any());
            verify(objectFactoryMock2).named(Usage.class, "yaml-xpack-tests");
            verify(projectMock).findProject(":rest-api-spec");
            verify(projectMock).findProject(":x-pack:plugin");
            verify(configurationContainerMock3).create(eq("restTests"), (Action) any());
            verify(objectFactoryMock3).named(Usage.class, "yaml-tests");
            verify(configurationContainerMock4).create(eq("restXpackTests"), (Action) any());
            verify(objectFactoryMock4).named(Usage.class, "yaml-xpack-tests");
            verify(projectMock, times(2)).getTasks();
            verify(taskContainerMock).register(eq("copyYamlTestsTask"), eq(CopyRestTestsTask.class), (Action) any());
            verify(taskProviderMock).flatMap((Transformer) any());
            verify(taskProviderMock).map((Transformer) any());
            verify(projectMock).getPath();
            verify(projectMock, times(2)).getLayout();
            verify(projectLayoutMock).getBuildDirectory();
            verify(directoryPropertyMock).dir("restResources/yamlTests");
            verify(configurationContainerMock5).create(eq("restSpec"), (Action) any());
            verify(objectFactoryMock5).named(Usage.class, "yaml-spec");
            verify(configurationContainerMock6).create(eq("restSpecs"), (Action) any());
            verify(objectFactoryMock6).named(Usage.class, "yaml-spec");
            verify(taskContainerMock2).register(eq("copyRestApiSpecsTask"), eq(CopyRestApiTask.class), (Action) any());
            verify(taskProviderMock2).map((Transformer) any());
            verify(projectLayoutMock2).getBuildDirectory();
            verify(directoryPropertyMock2).dir("restResources/yamlSpecs");
        });
    }

    //Sapient generated method id: ${applyWhenFGetNameEqualsResources}, hash: 40B954D4D2E0235126FDD00E975D681A
    @Disabled()
    @Test()
    void applyWhenFGetNameEqualsResources() throws InvalidUserDataException, UnknownDomainObjectException, ObjectInstantiationException {
        /* Branches:
         * (project.findProject(":rest-api-spec") != null) : true
         * (restApiSpecProjectAvailable) : true
         * (project.findProject(":x-pack:plugin") != null) : true
         * (restXpackTests) : true
         * (project.getPath().equals(":rest-api-spec") == false) : true  #  inside lambda$apply$4 method
         * (restApiSpecProjectAvailable) : true
         * (f.isDirectory()) : true  #  inside lambda$apply$7 method
         * (f.getName().equals("resources")) : true  #  inside lambda$apply$7 method
         */
        Object[] objectArray = new Object[] {};
        doReturn(restResourcesExtensionMock).when(extensionContainerMock).create("restResources", RestResourcesExtension.class, objectArray);
        doReturn(restResourcesExtensionXpackRestResourcesSpecMock).when(restResourcesExtensionMock).getRestTests();
        doReturn(listPropertyMock).when(restResourcesExtensionXpackRestResourcesSpecMock).getIncludeCore();
        doReturn(listPropertyMock2).when(restResourcesExtensionXpackRestResourcesSpecMock).getIncludeXpack();
        doReturn(restResourcesExtensionRestResourcesSpecMock).when(restResourcesExtensionMock).getRestApi();
        ListProperty<String> listPropertyMock3 = mock(ListProperty.class);
        doReturn(listPropertyMock3).when(restResourcesExtensionRestResourcesSpecMock).getInclude();
        doReturn(extensionContainerMock, extensionContainerMock2).when(projectMock).getExtensions();
        doReturn(sourceSetContainerMock).when(extensionContainerMock2).getByType(SourceSetContainer.class);
        doReturn(sourceSetMock).when(sourceSetContainerMock).maybeCreate("test");
        doReturn(sourceDirectorySetMock).when(sourceSetMock).getResources();
        Set<File> fileSet = new HashSet<>();
        fileSet.add(fileMock);
        doReturn(fileSet).when(sourceDirectorySetMock).getSrcDirs();
        doReturn(true).when(fileMock).isDirectory();
        doReturn("resources").when(fileMock).getName();
        doNothing().when(sourceSetOutputMock).dir(providerMock);
        doReturn(sourceSetOutputMock, sourceSetOutputMock2).when(sourceSetMock).getOutput();
        doNothing().when(sourceSetOutputMock2).dir(providerMock2);
        doReturn(configurationMock).when(configurationContainerMock).create(eq("restTestConfig"), (Action) any());
        doReturn("return_of_getName1").when(configurationMock).getName();
        doReturn(usageMock).when(objectFactoryMock).named(Usage.class, "yaml-tests");
        doReturn(configurationMock2).when(configurationContainerMock2).create(eq("restXpackTestConfig"), (Action) any());
        doReturn("return_of_getName1").when(configurationMock2).getName();
        doReturn(usageMock2).when(objectFactoryMock2).named(Usage.class, "yaml-xpack-tests");
        Project projectMock2 = mock(Project.class);
        doReturn(projectMock2).when(projectMock).findProject(":rest-api-spec");
        DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        Dependency dependencyMock = mock(Dependency.class);
        Map<String, String> stringStringMap = new HashMap<>(Map.ofEntries(entry("path", ":rest-api-spec"), entry("configuration", "restTests")));
        doReturn(dependencyMock).when(dependencyHandlerMock).project(eq(stringStringMap));
        DependencyHandler dependencyHandlerMock2 = mock(DependencyHandler.class);
        Dependency dependencyMock2 = mock(Dependency.class);
        doReturn(dependencyMock2).when(dependencyHandlerMock2).add("return_of_getName1", dependencyMock);
        Project projectMock3 = mock(Project.class);
        doReturn(projectMock3).when(projectMock).findProject(":x-pack:plugin");
        DependencyHandler dependencyHandlerMock3 = mock(DependencyHandler.class);
        Dependency dependencyMock3 = mock(Dependency.class);
        Map<String, String> stringStringMap2 = new HashMap<>(Map.ofEntries(entry("path", ":x-pack:plugin"), entry("configuration", "restXpackTests")));
        doReturn(dependencyMock3).when(dependencyHandlerMock3).project(eq(stringStringMap2));
        DependencyHandler dependencyHandlerMock4 = mock(DependencyHandler.class);
        Dependency dependencyMock4 = mock(Dependency.class);
        doReturn(dependencyMock4).when(dependencyHandlerMock4).add("return_of_getName1", dependencyMock3);
        Object object = new Object();
        doReturn(object).when(configurationContainerMock3).create(eq("restTests"), (Action) any());
        doReturn(usageMock3).when(objectFactoryMock3).named(Usage.class, "yaml-tests");
        Object object2 = new Object();
        doReturn(object2).when(configurationContainerMock4).create(eq("restXpackTests"), (Action) any());
        doReturn(usageMock4).when(objectFactoryMock4).named(Usage.class, "yaml-xpack-tests");
        doReturn(taskProviderMock).when(taskContainerMock).register(eq("copyYamlTestsTask"), eq(CopyRestTestsTask.class), (Action) any());
        doReturn(providerMock3).when(taskProviderMock).flatMap((Transformer) any());
        doReturn(providerMock2).when(taskProviderMock).map((Transformer) any());
        doReturn("A").when(projectMock).getPath();
        doReturn(directoryPropertyMock).when(projectLayoutMock).getBuildDirectory();
        doReturn(providerMock4).when(directoryPropertyMock).dir("restResources/yamlTests");
        doReturn(configurationMock3).when(configurationContainerMock5).create(eq("restSpec"), (Action) any());
        doReturn("return_of_getName1").when(configurationMock3).getName();
        doReturn(usageMock5).when(objectFactoryMock5).named(Usage.class, "yaml-spec");
        DependencyHandler dependencyHandlerMock5 = mock(DependencyHandler.class);
        Dependency dependencyMock5 = mock(Dependency.class);
        Map<String, String> stringStringMap3 = new HashMap<>(Map.ofEntries(entry("path", ":rest-api-spec"), entry("configuration", "restSpecs")));
        doReturn(dependencyMock5).when(dependencyHandlerMock5).project(eq(stringStringMap3));
        DependencyHandler dependencyHandlerMock6 = mock(DependencyHandler.class);
        doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3, dependencyHandlerMock4, dependencyHandlerMock5, dependencyHandlerMock6).when(projectMock).getDependencies();
        Dependency dependencyMock6 = mock(Dependency.class);
        doReturn(dependencyMock6).when(dependencyHandlerMock6).add("return_of_getName1", dependencyMock5);
        doReturn(configurationContainerMock, configurationContainerMock2, configurationContainerMock3, configurationContainerMock4, configurationContainerMock5, configurationContainerMock6).when(projectMock).getConfigurations();
        Object object3 = new Object();
        doReturn(object3).when(configurationContainerMock6).create(eq("restSpecs"), (Action) any());
        doReturn(objectFactoryMock, objectFactoryMock2, objectFactoryMock3, objectFactoryMock4, objectFactoryMock5, objectFactoryMock6).when(projectMock).getObjects();
        doReturn(usageMock6).when(objectFactoryMock6).named(Usage.class, "yaml-spec");
        doReturn(taskContainerMock, taskContainerMock2).when(projectMock).getTasks();
        doReturn(taskProviderMock2).when(taskContainerMock2).register(eq("copyRestApiSpecsTask"), eq(CopyRestApiTask.class), (Action) any());
        doReturn(providerMock).when(taskProviderMock2).map((Transformer) any());
        doReturn(projectLayoutMock, projectLayoutMock2).when(projectMock).getLayout();
        doReturn(directoryPropertyMock2).when(projectLayoutMock2).getBuildDirectory();
        doReturn(providerMock5).when(directoryPropertyMock2).dir("restResources/yamlSpecs");
        RestResourcesPlugin target = new RestResourcesPlugin();
        //Act Statement(s)
        target.apply(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock, times(2)).getExtensions();
            verify(extensionContainerMock).create("restResources", RestResourcesExtension.class, objectArray);
            verify(restResourcesExtensionMock, times(2)).getRestTests();
            verify(restResourcesExtensionXpackRestResourcesSpecMock).getIncludeCore();
            verify(restResourcesExtensionXpackRestResourcesSpecMock).getIncludeXpack();
            verify(restResourcesExtensionMock).getRestApi();
            verify(restResourcesExtensionRestResourcesSpecMock).getInclude();
            verify(extensionContainerMock2).getByType(SourceSetContainer.class);
            verify(sourceSetContainerMock).maybeCreate("test");
            verify(sourceSetMock).getResources();
            verify(sourceDirectorySetMock).getSrcDirs();
            verify(fileMock).isDirectory();
            verify(fileMock).getName();
            verify(sourceSetMock, times(2)).getOutput();
            verify(sourceSetOutputMock).dir(providerMock);
            verify(sourceSetOutputMock2).dir(providerMock2);
            verify(projectMock, times(6)).getConfigurations();
            verify(configurationContainerMock).create(eq("restTestConfig"), (Action) any());
            verify(configurationMock, atLeast(1)).getName();
            verify(projectMock, times(6)).getObjects();
            verify(objectFactoryMock).named(Usage.class, "yaml-tests");
            verify(configurationContainerMock2).create(eq("restXpackTestConfig"), (Action) any());
            verify(configurationMock2, atLeast(1)).getName();
            verify(objectFactoryMock2).named(Usage.class, "yaml-xpack-tests");
            verify(projectMock).findProject(":rest-api-spec");
            verify(projectMock, times(6)).getDependencies();
            verify(dependencyHandlerMock).project(eq(stringStringMap));
            verify(dependencyHandlerMock2).add("return_of_getName1", dependencyMock);
            verify(projectMock).findProject(":x-pack:plugin");
            verify(dependencyHandlerMock3).project(eq(stringStringMap2));
            verify(dependencyHandlerMock4).add("return_of_getName1", dependencyMock3);
            verify(configurationContainerMock3).create(eq("restTests"), (Action) any());
            verify(objectFactoryMock3).named(Usage.class, "yaml-tests");
            verify(configurationContainerMock4).create(eq("restXpackTests"), (Action) any());
            verify(objectFactoryMock4).named(Usage.class, "yaml-xpack-tests");
            verify(projectMock, times(2)).getTasks();
            verify(taskContainerMock).register(eq("copyYamlTestsTask"), eq(CopyRestTestsTask.class), (Action) any());
            verify(taskProviderMock).flatMap((Transformer) any());
            verify(taskProviderMock).map((Transformer) any());
            verify(projectMock).getPath();
            verify(projectMock, times(2)).getLayout();
            verify(projectLayoutMock).getBuildDirectory();
            verify(directoryPropertyMock).dir("restResources/yamlTests");
            verify(configurationContainerMock5).create(eq("restSpec"), (Action) any());
            verify(configurationMock3, atLeast(1)).getName();
            verify(objectFactoryMock5).named(Usage.class, "yaml-spec");
            verify(dependencyHandlerMock5).project(eq(stringStringMap3));
            verify(dependencyHandlerMock6).add("return_of_getName1", dependencyMock5);
            verify(configurationContainerMock6).create(eq("restSpecs"), (Action) any());
            verify(objectFactoryMock6).named(Usage.class, "yaml-spec");
            verify(taskContainerMock2).register(eq("copyRestApiSpecsTask"), eq(CopyRestApiTask.class), (Action) any());
            verify(taskProviderMock2).map((Transformer) any());
            verify(projectLayoutMock2).getBuildDirectory();
            verify(directoryPropertyMock2).dir("restResources/yamlSpecs");
        });
    }
}

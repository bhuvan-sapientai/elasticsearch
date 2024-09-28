package org.elasticsearch.gradle.internal.distribution;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.artifacts.Configuration;
import org.elasticsearch.gradle.plugin.PluginPropertiesExtension;
import org.gradle.api.artifacts.Dependency;
import org.gradle.api.Action;
import org.gradle.api.Project;
import java.util.Map;
import java.util.HashMap;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.gradle.api.tasks.TaskProvider;
import java.io.File;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.tasks.AbstractCopyTask;
import static java.util.Map.entry;
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
class ElasticsearchDistributionExtensionSapientGeneratedTest {

    private final Project projectMock = mock(Project.class, "project");

    //Sapient generated method id: ${copyModuleWhenCONFIG_BIN_REGEX_PATTERNMatcherDGetRelativePathGetPathStringMatchesEqualsFalse}, hash: 39241522C349161BE8000B9541A262AB
    @Disabled()
    @Test()
    void copyModuleWhenCONFIG_BIN_REGEX_PATTERNMatcherDGetRelativePathGetPathStringMatchesEqualsFalse() throws IllegalStateException, UnknownDomainObjectException {
        /* Branches:
         * (CONFIG_BIN_REGEX_PATTERN.matcher(d.getRelativePath().getPathString()).matches() == false) : true  #  inside lambda$copyModule$1 method
         */
        //Arrange Statement(s)
        TaskProvider<AbstractCopyTask> copyTaskMock = mock(TaskProvider.class);
        doNothing().when(copyTaskMock).configure((Action) any());
        Project moduleMock = mock(Project.class);
        doReturn("return_of_getPath1").when(moduleMock).getPath();
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        doReturn(extensionContainerMock).when(moduleMock).getExtensions();
        Project projectMock2 = mock(Project.class);
        PluginPropertiesExtension pluginPropertiesExtension = new PluginPropertiesExtension(projectMock2);
        pluginPropertiesExtension.setName("name1");
        doReturn(pluginPropertiesExtension).when(extensionContainerMock).getByType(PluginPropertiesExtension.class);
        DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        doReturn(dependencyHandlerMock).when(projectMock).getDependencies();
        Dependency dependencyMock = mock(Dependency.class);
        Map<String, String> stringStringMap = new HashMap<>(Map.ofEntries(entry("path", "return_of_getPath1"), entry("configuration", "explodedBundleZip")));
        doReturn(dependencyMock).when(dependencyHandlerMock).project(eq(stringStringMap));
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        doReturn(configurationContainerMock).when(projectMock).getConfigurations();
        Configuration configurationMock = mock(Configuration.class);
        Dependency[] dependencyArray = new Dependency[] { dependencyMock };
        doReturn(configurationMock).when(configurationContainerMock).detachedConfiguration(dependencyArray);
        File file = new File("pathname1");
        doReturn(file).when(configurationMock).getSingleFile();
        ElasticsearchDistributionExtension target = new ElasticsearchDistributionExtension(projectMock);
        //Act Statement(s)
        target.copyModule(copyTaskMock, moduleMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(copyTaskMock).configure((Action) any());
            verify(moduleMock).getPath();
            verify(moduleMock).getExtensions();
            verify(extensionContainerMock).getByType(PluginPropertiesExtension.class);
            verify(projectMock).getDependencies();
            verify(dependencyHandlerMock).project(eq(stringStringMap));
            verify(projectMock).getConfigurations();
            verify(configurationContainerMock).detachedConfiguration(dependencyArray);
            verify(configurationMock).getSingleFile();
        });
    }
}

package org.elasticsearch.gradle.dependencies;

import org.elasticsearch.gradle.dependencies.CompileOnlyResolvePlugin;

import org.gradle.api.NamedDomainObjectProvider;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.Project;
import org.gradle.api.Plugin;
import org.gradle.api.Action;
import org.junit.jupiter.api.Timeout;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.plugins.JavaPlugin;
import static org.junit.jupiter.api.Assertions.*;
import org.elasticsearch.gradle.dependencies.CompileOnlyResolvePlugin;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class CompileOnlyResolvePluginSapientGeneratedTest {

    @Test
    void applyWhenConfigurationGetNameEqualsJavaPluginCOMPILE_ONLY_CONFIGURATION_NAME() {
        // Arrange
        Project projectMock = mock(Project.class);
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        Configuration compileOnlyConfigurationMock = mock(Configuration.class);
        NamedDomainObjectProvider<Configuration> namedDomainObjectProviderMock = mock(NamedDomainObjectProvider.class);
        when(projectMock.getConfigurations()).thenReturn(configurationContainerMock);
        when(configurationContainerMock.register(CompileOnlyResolvePlugin.RESOLVEABLE_COMPILE_ONLY_CONFIGURATION_NAME)).thenReturn(namedDomainObjectProviderMock);
        when(compileOnlyConfigurationMock.getName()).thenReturn(JavaPlugin.COMPILE_ONLY_CONFIGURATION_NAME);
        doAnswer(invocation -> {
            Action<Configuration> action = invocation.getArgument(0);
            action.execute(compileOnlyConfigurationMock);
            return null;
        }).when(configurationContainerMock).all(any(Action.class));
        CompileOnlyResolvePlugin plugin = new CompileOnlyResolvePlugin();
        // Act
        plugin.apply(projectMock);
        // Assert
        verify(projectMock, times(2)).getConfigurations();
        verify(configurationContainerMock).all(any(Action.class));
        verify(configurationContainerMock).register(CompileOnlyResolvePlugin.RESOLVEABLE_COMPILE_ONLY_CONFIGURATION_NAME);
        verify(namedDomainObjectProviderMock).configure(any(Action.class));
    }

    @Test
    void applyWhenConfigurationGetNameNotEqualsJavaPluginCOMPILE_ONLY_CONFIGURATION_NAME() {
        // Arrange
        Project projectMock = mock(Project.class);
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        Configuration nonCompileOnlyConfigurationMock = mock(Configuration.class);
        when(projectMock.getConfigurations()).thenReturn(configurationContainerMock);
        when(nonCompileOnlyConfigurationMock.getName()).thenReturn("nonCompileOnly");
        doAnswer(invocation -> {
            Action<Configuration> action = invocation.getArgument(0);
            action.execute(nonCompileOnlyConfigurationMock);
            return null;
        }).when(configurationContainerMock).all(any(Action.class));
        CompileOnlyResolvePlugin plugin = new CompileOnlyResolvePlugin();
        // Act
        plugin.apply(projectMock);
        // Assert
        verify(projectMock).getConfigurations();
        verify(configurationContainerMock).all(any(Action.class));
        verify(configurationContainerMock, never()).register(anyString());
    }
}

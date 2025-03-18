package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.InternalAvailableTcpPortProviderPlugin;

import org.junit.jupiter.api.Timeout;
import org.gradle.api.plugins.ExtensionContainer;

import static org.hamcrest.Matchers.notNullValue;

import org.gradle.api.plugins.PluginContainer;
import org.elasticsearch.gradle.internal.InternalAvailableTcpPortProviderPlugin;
import org.elasticsearch.gradle.internal.util.ports.ReservedPortRange;

import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;
import org.gradle.api.Project;
import org.elasticsearch.gradle.internal.util.ports.AvailablePortAllocator;

import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class InternalAvailableTcpPortProviderPluginSapientGeneratedTest {

    @Test
    void applyAddsPortRangeExtension() {
        // Arrange
        Project projectMock = mock(Project.class);
        Project rootProjectMock = mock(Project.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        InternalAvailableTcpPortProviderPlugin.InternalAvailableTcpPortProviderRootPlugin rootPluginMock = mock(InternalAvailableTcpPortProviderPlugin.InternalAvailableTcpPortProviderRootPlugin.class);
        AvailablePortAllocator allocatorMock = mock(AvailablePortAllocator.class);
        ReservedPortRange portRangeMock = mock(ReservedPortRange.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        when(projectMock.getRootProject()).thenReturn(rootProjectMock);
        when(rootProjectMock.getPlugins()).thenReturn(pluginContainerMock);
        when(pluginContainerMock.apply(InternalAvailableTcpPortProviderPlugin.InternalAvailableTcpPortProviderRootPlugin.class)).thenReturn(rootPluginMock);
        when(rootPluginMock.allocator).thenReturn(allocatorMock);
        when(allocatorMock.reservePortRange()).thenReturn(portRangeMock);
        when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
        InternalAvailableTcpPortProviderPlugin target = new InternalAvailableTcpPortProviderPlugin();
        // Act
        target.apply(projectMock);
        // Assert
        verify(projectMock).getExtensions();
        verify(extensionContainerMock).add("portRange", portRangeMock);
    }

    @Test
    void rootPluginApplySetsAllocator() {
        // Arrange
        Project projectMock = mock(Project.class);
        InternalAvailableTcpPortProviderPlugin.InternalAvailableTcpPortProviderRootPlugin target = new InternalAvailableTcpPortProviderPlugin.InternalAvailableTcpPortProviderRootPlugin();
        // Act
        target.apply(projectMock);
        // Assert
        assertThat(target.allocator, is(notNullValue()));
        assertThat(target.allocator.getClass(), is(AvailablePortAllocator.class));
    }

    @Test
    void applyWithNullProject() {
        // Arrange
        InternalAvailableTcpPortProviderPlugin target = new InternalAvailableTcpPortProviderPlugin();
        // Act & Assert
        assertThat(target, is(notNullValue()));
        org.junit.jupiter.api.Assertions.assertThrows(NullPointerException.class, () -> target.apply(null));
    }

    @Test
    void rootPluginApplyWithNullProject() {
        // Arrange
        InternalAvailableTcpPortProviderPlugin.InternalAvailableTcpPortProviderRootPlugin target = new InternalAvailableTcpPortProviderPlugin.InternalAvailableTcpPortProviderRootPlugin();
        // Act & Assert
        assertThat(target, is(notNullValue()));
        org.junit.jupiter.api.Assertions.assertThrows(NullPointerException.class, () -> target.apply(null));
    }
}

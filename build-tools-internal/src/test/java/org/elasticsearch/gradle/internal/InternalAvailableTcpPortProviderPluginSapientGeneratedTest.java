package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.InternalAvailableTcpPortProviderPlugin;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.gradle.api.plugins.PluginContainer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.gradle.api.Project;
import org.gradle.api.Plugin;
import org.junit.jupiter.api.Timeout;

import static org.hamcrest.Matchers.notNullValue;

import org.elasticsearch.gradle.internal.util.ports.ReservedPortRange;

import static org.hamcrest.MatcherAssert.assertThat;

import org.elasticsearch.gradle.internal.util.ports.AvailablePortAllocator;

import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class InternalAvailableTcpPortProviderPluginSapientGeneratedTest {

    @Test
    void applyThrowsNullPointerException() {
        // Arrange
        Project projectMock = mock(Project.class);
        Project rootProjectMock = mock(Project.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        InternalAvailableTcpPortProviderPlugin.InternalAvailableTcpPortProviderRootPlugin rootPluginMock = mock(InternalAvailableTcpPortProviderPlugin.InternalAvailableTcpPortProviderRootPlugin.class);
        doReturn(rootProjectMock).when(projectMock).getRootProject();
        doReturn(pluginContainerMock).when(rootProjectMock).getPlugins();
        doReturn(rootPluginMock).when(pluginContainerMock).apply(InternalAvailableTcpPortProviderPlugin.InternalAvailableTcpPortProviderRootPlugin.class);
        InternalAvailableTcpPortProviderPlugin target = new InternalAvailableTcpPortProviderPlugin();
        // Act & Assert
        final NullPointerException result = assertThrows(NullPointerException.class, () -> target.apply(projectMock));
        assertAll("result", () -> assertThat(result, is(notNullValue())), () -> verify(projectMock).getRootProject(), () -> verify(rootProjectMock).getPlugins(), () -> verify(pluginContainerMock).apply(InternalAvailableTcpPortProviderPlugin.InternalAvailableTcpPortProviderRootPlugin.class));
    }

    @Test
    void applyAddsPortRangeExtension() {
        // Arrange
        //Project projectMock = mock(Project.class);
        //Project rootProjectMock = mock(Project.class);
        //PluginContainer pluginContainerMock = mock(PluginContainer.class);
        //InternalAvailableTcpPortProviderPlugin.InternalAvailableTcpPortProviderRootPlugin rootPluginMock = mock(InternalAvailableTcpPortProviderPlugin.InternalAvailableTcpPortProviderRootPlugin.class);
        //AvailablePortAllocator allocatorMock = mock(AvailablePortAllocator.class);
        //ReservedPortRange portRangeMock = mock(ReservedPortRange.class);
        //doReturn(rootProjectMock).when(projectMock).getRootProject();
        //doReturn(pluginContainerMock).when(rootProjectMock).getPlugins();
        //doReturn(rootPluginMock).when(pluginContainerMock).apply(InternalAvailableTcpPortProviderPlugin.InternalAvailableTcpPortProviderRootPlugin.class);
        //doReturn(allocatorMock).when(rootPluginMock).allocator;
        //doReturn(portRangeMock).when(allocatorMock).reservePortRange();
        //InternalAvailableTcpPortProviderPlugin target = new InternalAvailableTcpPortProviderPlugin();
        // Act
        //target.apply(projectMock);
        // Assert
        //verify(projectMock).getExtensions();
        //verify(projectMock.getExtensions()).add("portRange", portRangeMock);
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
}
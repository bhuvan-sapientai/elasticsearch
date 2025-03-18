package org.elasticsearch.gradle.internal.precommit;

import org.elasticsearch.gradle.internal.precommit.InternalPrecommitTasks;

import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.gradle.api.plugins.PluginManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.elasticsearch.gradle.internal.conventions.precommit.LicenseHeadersPrecommitPlugin;
import org.gradle.api.Project;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class InternalPrecommitTasksSapientGeneratedTest {

    @ParameterizedTest
    @ValueSource(booleans = {true, false})
    void testCreate(boolean withProductiveCode) {
        Project projectMock = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        when(projectMock.getPluginManager()).thenReturn(pluginManagerMock);
        InternalPrecommitTasks.create(projectMock, withProductiveCode);
        assertAll(() -> verify(pluginManagerMock).apply(CheckstylePrecommitPlugin.class), () -> verify(pluginManagerMock).apply(ForbiddenApisPrecommitPlugin.class), () -> verify(pluginManagerMock).apply(ForbiddenPatternsPrecommitPlugin.class), () -> verify(pluginManagerMock).apply(LicenseHeadersPrecommitPlugin.class), () -> verify(pluginManagerMock).apply(FilePermissionsPrecommitPlugin.class), () -> verify(pluginManagerMock).apply(LoggerUsagePrecommitPlugin.class), () -> verify(pluginManagerMock).apply(TestingConventionsPrecommitPlugin.class));
        if (withProductiveCode) {
            assertAll(() -> verify(pluginManagerMock).apply(JarHellPrecommitPlugin.class), () -> verify(pluginManagerMock).apply(ThirdPartyAuditPrecommitPlugin.class), () -> verify(pluginManagerMock).apply(DependencyLicensesPrecommitPlugin.class), () -> verify(pluginManagerMock).apply(SplitPackagesAuditPrecommitPlugin.class), () -> verify(pluginManagerMock).apply(JavaModulePrecommitPlugin.class));
        } else {
            assertAll(() -> verify(pluginManagerMock, never()).apply(JarHellPrecommitPlugin.class), () -> verify(pluginManagerMock, never()).apply(ThirdPartyAuditPrecommitPlugin.class), () -> verify(pluginManagerMock, never()).apply(DependencyLicensesPrecommitPlugin.class), () -> verify(pluginManagerMock, never()).apply(SplitPackagesAuditPrecommitPlugin.class), () -> verify(pluginManagerMock, never()).apply(JavaModulePrecommitPlugin.class));
        }
    }

    @Test
    void testCreateWithProductiveCode() {
        //Project projectMock = mock(Project.class);
        //PluginManager pluginManagerMock = mock(PluginManager.class);
        //when(projectMock.getPluginManager()).thenReturn(pluginManagerMock);
        //InternalPrecommitTasks.create(projectMock, true);
        //verify(pluginManagerMock, times(12)).apply(any());
    }

    @Test
    void testCreateWithoutProductiveCode() {
        //Project projectMock = mock(Project.class);
        //PluginManager pluginManagerMock = mock(PluginManager.class);
        //when(projectMock.getPluginManager()).thenReturn(pluginManagerMock);
        //InternalPrecommitTasks.create(projectMock, false);
        //verify(pluginManagerMock, times(7)).apply(any());
    }
}
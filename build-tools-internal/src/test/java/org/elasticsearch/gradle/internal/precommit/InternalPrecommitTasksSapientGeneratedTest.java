package org.elasticsearch.gradle.internal.precommit;

import org.elasticsearch.gradle.internal.precommit.InternalPrecommitTasks;

import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.gradle.api.plugins.PluginManager;
import org.junit.jupiter.api.Test;
import org.elasticsearch.gradle.internal.conventions.precommit.LicenseHeadersPrecommitPlugin;
import org.gradle.api.Project;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class InternalPrecommitTasksSapientGeneratedTest {

    @Test
    void createWhenWithProductiveCode() {
        Project projectMock = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        when(projectMock.getPluginManager()).thenReturn(pluginManagerMock);
        InternalPrecommitTasks.create(projectMock, true);
        assertAll("result", () -> {
            verify(pluginManagerMock).apply(CheckstylePrecommitPlugin.class);
            verify(pluginManagerMock).apply(ForbiddenApisPrecommitPlugin.class);
            verify(pluginManagerMock).apply(ForbiddenPatternsPrecommitPlugin.class);
            verify(pluginManagerMock).apply(LicenseHeadersPrecommitPlugin.class);
            verify(pluginManagerMock).apply(FilePermissionsPrecommitPlugin.class);
            verify(pluginManagerMock).apply(LoggerUsagePrecommitPlugin.class);
            verify(pluginManagerMock).apply(TestingConventionsPrecommitPlugin.class);
            verify(pluginManagerMock).apply(JarHellPrecommitPlugin.class);
            verify(pluginManagerMock).apply(ThirdPartyAuditPrecommitPlugin.class);
            verify(pluginManagerMock).apply(DependencyLicensesPrecommitPlugin.class);
            verify(pluginManagerMock).apply(SplitPackagesAuditPrecommitPlugin.class);
            verify(pluginManagerMock).apply(JavaModulePrecommitPlugin.class);
        });
    }

    @Test
    void createWhenWithoutProductiveCode() {
        Project projectMock = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        when(projectMock.getPluginManager()).thenReturn(pluginManagerMock);
        InternalPrecommitTasks.create(projectMock, false);
        assertAll("result", () -> {
            verify(pluginManagerMock).apply(CheckstylePrecommitPlugin.class);
            verify(pluginManagerMock).apply(ForbiddenApisPrecommitPlugin.class);
            verify(pluginManagerMock).apply(ForbiddenPatternsPrecommitPlugin.class);
            verify(pluginManagerMock).apply(LicenseHeadersPrecommitPlugin.class);
            verify(pluginManagerMock).apply(FilePermissionsPrecommitPlugin.class);
            verify(pluginManagerMock).apply(LoggerUsagePrecommitPlugin.class);
            verify(pluginManagerMock).apply(TestingConventionsPrecommitPlugin.class);
            verify(pluginManagerMock, never()).apply(JarHellPrecommitPlugin.class);
            verify(pluginManagerMock, never()).apply(ThirdPartyAuditPrecommitPlugin.class);
            verify(pluginManagerMock, never()).apply(DependencyLicensesPrecommitPlugin.class);
            verify(pluginManagerMock, never()).apply(SplitPackagesAuditPrecommitPlugin.class);
            verify(pluginManagerMock, never()).apply(JavaModulePrecommitPlugin.class);
        });
    }
}

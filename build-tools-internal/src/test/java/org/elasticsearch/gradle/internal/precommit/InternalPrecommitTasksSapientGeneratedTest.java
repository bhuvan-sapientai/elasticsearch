package org.elasticsearch.gradle.internal.precommit;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.elasticsearch.gradle.internal.conventions.precommit.LicenseHeadersPrecommitPlugin;
import org.gradle.api.Project;
import org.gradle.api.plugins.PluginManager;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

@Timeout(value = 5)
class InternalPrecommitTasksSapientGeneratedTest {

    //Sapient generated method id: ${createWhenWithProductiveCode}, hash: 6CCA7D0702196567BE4D186FEC136FED
    @Test()
    void createWhenWithProductiveCode() {
        /* Branches:
         * (withProductiveCode) : true
         */
         //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        doNothing().when(pluginManagerMock).apply(CheckstylePrecommitPlugin.class);
        PluginManager pluginManagerMock2 = mock(PluginManager.class);
        doNothing().when(pluginManagerMock2).apply(ForbiddenApisPrecommitPlugin.class);
        PluginManager pluginManagerMock3 = mock(PluginManager.class);
        doNothing().when(pluginManagerMock3).apply(ForbiddenPatternsPrecommitPlugin.class);
        PluginManager pluginManagerMock4 = mock(PluginManager.class);
        doNothing().when(pluginManagerMock4).apply(LicenseHeadersPrecommitPlugin.class);
        PluginManager pluginManagerMock5 = mock(PluginManager.class);
        doNothing().when(pluginManagerMock5).apply(FilePermissionsPrecommitPlugin.class);
        PluginManager pluginManagerMock6 = mock(PluginManager.class);
        doNothing().when(pluginManagerMock6).apply(LoggerUsagePrecommitPlugin.class);
        PluginManager pluginManagerMock7 = mock(PluginManager.class);
        doNothing().when(pluginManagerMock7).apply(TestingConventionsPrecommitPlugin.class);
        PluginManager pluginManagerMock8 = mock(PluginManager.class);
        doNothing().when(pluginManagerMock8).apply(JarHellPrecommitPlugin.class);
        PluginManager pluginManagerMock9 = mock(PluginManager.class);
        doNothing().when(pluginManagerMock9).apply(ThirdPartyAuditPrecommitPlugin.class);
        PluginManager pluginManagerMock10 = mock(PluginManager.class);
        doNothing().when(pluginManagerMock10).apply(DependencyLicensesPrecommitPlugin.class);
        PluginManager pluginManagerMock11 = mock(PluginManager.class);
        doNothing().when(pluginManagerMock11).apply(SplitPackagesAuditPrecommitPlugin.class);
        PluginManager pluginManagerMock12 = mock(PluginManager.class);
        doReturn(pluginManagerMock, pluginManagerMock2, pluginManagerMock3, pluginManagerMock4, pluginManagerMock5, pluginManagerMock6, pluginManagerMock7, pluginManagerMock8, pluginManagerMock9, pluginManagerMock10, pluginManagerMock11, pluginManagerMock12).when(projectMock).getPluginManager();
        doNothing().when(pluginManagerMock12).apply(JavaModulePrecommitPlugin.class);
        
        //Act Statement(s)
        InternalPrecommitTasks.create(projectMock, true);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock, times(12)).getPluginManager();
            verify(pluginManagerMock).apply(CheckstylePrecommitPlugin.class);
            verify(pluginManagerMock2).apply(ForbiddenApisPrecommitPlugin.class);
            verify(pluginManagerMock3).apply(ForbiddenPatternsPrecommitPlugin.class);
            verify(pluginManagerMock4).apply(LicenseHeadersPrecommitPlugin.class);
            verify(pluginManagerMock5).apply(FilePermissionsPrecommitPlugin.class);
            verify(pluginManagerMock6).apply(LoggerUsagePrecommitPlugin.class);
            verify(pluginManagerMock7).apply(TestingConventionsPrecommitPlugin.class);
            verify(pluginManagerMock8).apply(JarHellPrecommitPlugin.class);
            verify(pluginManagerMock9).apply(ThirdPartyAuditPrecommitPlugin.class);
            verify(pluginManagerMock10).apply(DependencyLicensesPrecommitPlugin.class);
            verify(pluginManagerMock11).apply(SplitPackagesAuditPrecommitPlugin.class);
            verify(pluginManagerMock12).apply(JavaModulePrecommitPlugin.class);
        });
    }
}

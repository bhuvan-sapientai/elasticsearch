package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.Project;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5)
class InternalAvailableTcpPortProviderPluginSapientGeneratedTest {

    //Sapient generated method id: ${applyThrowsNullPointerException}, hash: C42568698E7700AE7AABEDA2BC365CED
    @Test()
    void applyThrowsNullPointerException() {
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        Project projectMock2 = mock(Project.class);
        doReturn(projectMock2).when(projectMock).getRootProject();
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        doReturn(pluginContainerMock).when(projectMock2).getPlugins();
        InternalAvailableTcpPortProviderPlugin.InternalAvailableTcpPortProviderRootPlugin internalAvailableTcpPortProviderPluginInternalAvailableTcpPortProviderRootPluginMock = mock(InternalAvailableTcpPortProviderPlugin.InternalAvailableTcpPortProviderRootPlugin.class);
        doReturn(internalAvailableTcpPortProviderPluginInternalAvailableTcpPortProviderRootPluginMock).when(pluginContainerMock).apply(InternalAvailableTcpPortProviderPlugin.InternalAvailableTcpPortProviderRootPlugin.class);
        InternalAvailableTcpPortProviderPlugin target = new InternalAvailableTcpPortProviderPlugin();
        //Act Statement(s)
        final NullPointerException result = assertThrows(NullPointerException.class, () -> {
            target.apply(projectMock);
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(projectMock).getRootProject();
            verify(projectMock2).getPlugins();
            verify(pluginContainerMock).apply(InternalAvailableTcpPortProviderPlugin.InternalAvailableTcpPortProviderRootPlugin.class);
        });
    }
}

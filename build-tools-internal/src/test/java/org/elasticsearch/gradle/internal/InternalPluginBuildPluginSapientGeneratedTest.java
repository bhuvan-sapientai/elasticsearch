package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;
import org.gradle.api.plugins.PluginManager;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

@Timeout(value = 5)
class InternalPluginBuildPluginSapientGeneratedTest {

    //Sapient generated method id: ${applyTest}, hash: C2A631BF13293FF71C71215E6ED986D0
    @Test()
    void applyTest() {
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        doNothing().when(pluginManagerMock).apply(BuildPlugin.class);
        PluginManager pluginManagerMock2 = mock(PluginManager.class);
        doReturn(pluginManagerMock, pluginManagerMock2).when(projectMock).getPluginManager();
        doNothing().when(pluginManagerMock2).apply(BaseInternalPluginBuildPlugin.class);
        InternalPluginBuildPlugin target = new InternalPluginBuildPlugin();
        
        //Act Statement(s)
        target.apply(projectMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock, times(2)).getPluginManager();
            verify(pluginManagerMock).apply(BuildPlugin.class);
            verify(pluginManagerMock2).apply(BaseInternalPluginBuildPlugin.class);
        });
    }
}

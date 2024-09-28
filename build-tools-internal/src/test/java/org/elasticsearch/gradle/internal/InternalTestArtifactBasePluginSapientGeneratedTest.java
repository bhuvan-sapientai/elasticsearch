package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.Plugin;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.Project;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5)
class InternalTestArtifactBasePluginSapientGeneratedTest {

    //Sapient generated method id: ${applyTest}, hash: EA1552DDC56A6D30DFDCF287CA57A936
    @Test()
    void applyTest() {
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        doReturn(pluginContainerMock).when(projectMock).getPlugins();
        Plugin pluginMock = mock(Plugin.class);
        doReturn(pluginMock).when(pluginContainerMock).apply(ElasticsearchJavaBasePlugin.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        Object object = new Object();
        ProviderFactory providerFactoryMock = mock(ProviderFactory.class);
        Object[] objectArray = new Object[] { projectMock, providerFactoryMock };
        doReturn(object).when(extensionContainerMock).create("testArtifacts", InternalTestArtifactExtension.class, objectArray);
        InternalTestArtifactBasePlugin target = new InternalTestArtifactBasePlugin(providerFactoryMock);
        
        //Act Statement(s)
        target.apply(projectMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).getPlugins();
            verify(pluginContainerMock).apply(ElasticsearchJavaBasePlugin.class);
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).create("testArtifacts", InternalTestArtifactExtension.class, objectArray);
        });
    }
}

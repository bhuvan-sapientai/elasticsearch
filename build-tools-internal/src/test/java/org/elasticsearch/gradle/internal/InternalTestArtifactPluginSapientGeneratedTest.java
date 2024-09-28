package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.Action;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.Plugin;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.Project;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class InternalTestArtifactPluginSapientGeneratedTest {

    //Sapient generated method id: ${applyWhenSourceSetGetNameEqualsSourceSetMAIN_SOURCE_SET_NAMEEqualsFalse}, hash: 7336D9AFC53752E74C26B7B585B7ACBE
    @Disabled()
    @Test()
    void applyWhenSourceSetGetNameEqualsSourceSetMAIN_SOURCE_SET_NAMEEqualsFalse() throws UnknownDomainObjectException {
        /* Branches:
         * (sourceSet.getName().equals(SourceSet.MAIN_SOURCE_SET_NAME) == false) : true  #  inside lambda$apply$0 method
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        doReturn(pluginContainerMock).when(projectMock).getPlugins();
        Plugin pluginMock = mock(Plugin.class);
        doReturn(pluginMock).when(pluginContainerMock).apply(InternalTestArtifactBasePlugin.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        InternalTestArtifactExtension internalTestArtifactExtensionMock = mock(InternalTestArtifactExtension.class);
        doReturn(internalTestArtifactExtensionMock).when(extensionContainerMock).getByType(InternalTestArtifactExtension.class);
        SourceSet sourceSetMock = mock(SourceSet.class);
        doNothing().when(internalTestArtifactExtensionMock).registerTestArtifactFromSourceSet(sourceSetMock);
        doReturn("A").when(sourceSetMock).getName();
        ExtensionContainer extensionContainerMock2 = mock(ExtensionContainer.class);
        doReturn(extensionContainerMock, extensionContainerMock2).when(projectMock).getExtensions();
        SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        doReturn(sourceSetContainerMock).when(extensionContainerMock2).getByType(SourceSetContainer.class);
        doNothing().when(sourceSetContainerMock).all((Action) any());
        InternalTestArtifactPlugin target = new InternalTestArtifactPlugin();
        //Act Statement(s)
        target.apply(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).getPlugins();
            verify(pluginContainerMock).apply(InternalTestArtifactBasePlugin.class);
            verify(projectMock, times(2)).getExtensions();
            verify(extensionContainerMock).getByType(InternalTestArtifactExtension.class);
            verify(internalTestArtifactExtensionMock).registerTestArtifactFromSourceSet(sourceSetMock);
            verify(sourceSetMock).getName();
            verify(extensionContainerMock2).getByType(SourceSetContainer.class);
            verify(sourceSetContainerMock).all((Action) any());
        });
    }
}

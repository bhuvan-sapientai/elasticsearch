package org.elasticsearch.gradle.internal.test.rest;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.InvalidUserDataException;
import org.mockito.stubbing.Answer;
import org.elasticsearch.gradle.internal.test.LegacyRestTestBasePlugin;
import org.gradle.api.provider.Provider;
import org.elasticsearch.gradle.util.GradleUtils;
import org.gradle.api.Project;
import org.gradle.api.tasks.SourceSetContainer;
import org.elasticsearch.gradle.internal.test.RestIntegTestTask;
import org.mockito.MockedStatic;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.plugins.PluginManager;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5)
class LegacyJavaRestTestPluginSapientGeneratedTest {

    //Sapient generated method id: ${applyTest}, hash: 67E52F00DB74BA364C4E5A4AFFED7A09
    @Test()
    void applyTest() throws UnknownDomainObjectException, InvalidUserDataException {
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        PluginManager pluginManagerMock = mock(PluginManager.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);
        SourceSet sourceSetMock = mock(SourceSet.class);
        Provider<RestIntegTestTask> providerMock = mock(Provider.class);
        try (MockedStatic<RestTestUtil> restTestUtil = mockStatic(RestTestUtil.class);
            MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            doReturn(pluginManagerMock).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock).apply(LegacyRestTestBasePlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(sourceSetContainerMock).when(extensionContainerMock).getByType(SourceSetContainer.class);
            doReturn(sourceSetMock).when(sourceSetContainerMock).create("javaRestTest");
            gradleUtils.when(() -> GradleUtils.setupIdeForTestSourceSet(projectMock, sourceSetMock)).thenAnswer((Answer<Void>) invocation -> null);
            restTestUtil.when(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock)).thenReturn(providerMock);
            restTestUtil.when(() -> RestTestUtil.setupJavaRestTestDependenciesDefaults(projectMock, sourceSetMock)).thenAnswer((Answer<Void>) invocation -> null);
            LegacyJavaRestTestPlugin target = new LegacyJavaRestTestPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).getPluginManager();
                verify(pluginManagerMock).apply(LegacyRestTestBasePlugin.class);
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByType(SourceSetContainer.class);
                verify(sourceSetContainerMock).create("javaRestTest");
                gradleUtils.verify(() -> GradleUtils.setupIdeForTestSourceSet(projectMock, sourceSetMock), atLeast(1));
                restTestUtil.verify(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock), atLeast(1));
                restTestUtil.verify(() -> RestTestUtil.setupJavaRestTestDependenciesDefaults(projectMock, sourceSetMock), atLeast(1));
            });
        }
    }
}

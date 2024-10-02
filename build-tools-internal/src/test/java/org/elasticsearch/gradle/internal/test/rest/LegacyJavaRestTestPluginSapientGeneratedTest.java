package org.elasticsearch.gradle.internal.test.rest;

import org.elasticsearch.gradle.internal.test.rest.LegacyJavaRestTestPlugin;

import org.gradle.api.tasks.SourceSet;
import org.gradle.api.plugins.PluginManager;
import org.junit.jupiter.api.Test;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.Project;
import org.gradle.api.tasks.SourceSetContainer;
import org.junit.jupiter.api.Timeout;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.UnknownDomainObjectException;
import org.mockito.stubbing.Answer;
import org.elasticsearch.gradle.util.GradleUtils;
import org.elasticsearch.gradle.internal.test.LegacyRestTestBasePlugin;
import org.elasticsearch.gradle.internal.test.RestIntegTestTask;

import static org.junit.jupiter.api.Assertions.*;

import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;

import org.gradle.api.provider.Provider;

import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class LegacyJavaRestTestPluginSapientGeneratedTest {

    @Test
    void applyTest() throws UnknownDomainObjectException, InvalidUserDataException {
        // Arrange
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
            doReturn(sourceSetMock).when(sourceSetContainerMock).create(LegacyJavaRestTestPlugin.SOURCE_SET_NAME);
            gradleUtils.when(() -> GradleUtils.setupIdeForTestSourceSet(projectMock, sourceSetMock)).thenAnswer((Answer<Void>) invocation -> null);
            restTestUtil.when(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock)).thenReturn(providerMock);
            restTestUtil.when(() -> RestTestUtil.setupJavaRestTestDependenciesDefaults(projectMock, sourceSetMock)).thenAnswer((Answer<Void>) invocation -> null);
            LegacyJavaRestTestPlugin target = new LegacyJavaRestTestPlugin();
            // Act
            target.apply(projectMock);
            // Assert
            assertAll("result", () -> verify(projectMock).getPluginManager(), () -> verify(pluginManagerMock).apply(LegacyRestTestBasePlugin.class), () -> verify(projectMock).getExtensions(), () -> verify(extensionContainerMock).getByType(SourceSetContainer.class), () -> verify(sourceSetContainerMock).create(LegacyJavaRestTestPlugin.SOURCE_SET_NAME), () -> gradleUtils.verify(() -> GradleUtils.setupIdeForTestSourceSet(projectMock, sourceSetMock), times(1)), () -> restTestUtil.verify(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock), times(1)), () -> restTestUtil.verify(() -> RestTestUtil.setupJavaRestTestDependenciesDefaults(projectMock, sourceSetMock), times(1)));
        }
    }

    @Test
    void testSourceSetName() {
        assertEquals("javaRestTest", LegacyJavaRestTestPlugin.SOURCE_SET_NAME);
    }
}

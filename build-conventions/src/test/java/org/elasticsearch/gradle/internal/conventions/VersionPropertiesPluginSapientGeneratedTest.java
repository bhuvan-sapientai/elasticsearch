package org.elasticsearch.gradle.internal.conventions;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.Action;
import org.gradle.api.invocation.Gradle;
import org.gradle.api.provider.Provider;
import org.gradle.api.Project;
import org.elasticsearch.gradle.internal.conventions.util.Util;
import org.mockito.MockedStatic;
import java.io.File;
import org.gradle.api.services.BuildServiceRegistry;
import org.gradle.api.plugins.ExtensionContainer;
import java.util.Properties;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class VersionPropertiesPluginSapientGeneratedTest {

    //Sapient generated method id: ${applyTest}, hash: C4D76F5C8F3C16889CDCAE464D68A549
    @Test()
    void applyTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.File
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        Gradle gradleMock = mock(Gradle.class);
        Gradle gradleMock2 = mock(Gradle.class);
        BuildServiceRegistry buildServiceRegistryMock = mock(BuildServiceRegistry.class);
        Provider<VersionPropertiesBuildService> providerMock = mock(Provider.class);
        VersionPropertiesBuildService versionPropertiesBuildServiceMock = mock(VersionPropertiesBuildService.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        try (MockedStatic<Util> util = mockStatic(Util.class)) {
            doReturn(gradleMock, gradleMock2).when(projectMock).getGradle();
            doReturn(buildServiceRegistryMock).when(gradleMock2).getSharedServices();
            doReturn(providerMock).when(buildServiceRegistryMock).registerIfAbsent(eq("versions"), eq(VersionPropertiesBuildService.class), (Action) any());
            doReturn(versionPropertiesBuildServiceMock).when(providerMock).get();
            Properties properties = new Properties();
            doReturn(properties).when(versionPropertiesBuildServiceMock).getProperties();
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doNothing().when(extensionContainerMock).add(eq("versions"), eq(properties));
            File file = new File("pathname1");
            util.when(() -> Util.locateElasticsearchWorkspace(gradleMock)).thenReturn(file);
            VersionPropertiesPlugin target = new VersionPropertiesPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(2)).getGradle();
                verify(gradleMock2).getSharedServices();
                verify(buildServiceRegistryMock).registerIfAbsent(eq("versions"), eq(VersionPropertiesBuildService.class), (Action) any());
                verify(providerMock, atLeast(1)).get();
                verify(versionPropertiesBuildServiceMock).getProperties();
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).add(eq("versions"), eq(properties));
                util.verify(() -> Util.locateElasticsearchWorkspace(gradleMock), atLeast(1));
            });
        }
    }
}

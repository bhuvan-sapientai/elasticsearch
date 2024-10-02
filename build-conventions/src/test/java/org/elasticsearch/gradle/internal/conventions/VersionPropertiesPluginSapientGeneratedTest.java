package org.elasticsearch.gradle.internal.conventions;

// import org.elasticsearch.gradle.internal.conventions.VersionPropertiesPlugin;
// import org.elasticsearch.gradle.internal.conventions.util.Util;
// import org.gradle.api.invocation.Gradle;
// import org.elasticsearch.gradle.internal.conventions.VersionPropertiesPlugin;
// import static org.mockito.ArgumentMatchers.any;
// import org.junit.jupiter.api.Test;
// import java.util.Properties;
// import org.gradle.api.Project;
// import java.io.File;
// import org.gradle.api.Plugin;
// import org.gradle.api.Action;
// import org.gradle.api.plugins.ExtensionContainer;
// import org.gradle.api.provider.RegularFileProperty;
// import static org.junit.jupiter.api.Assertions.*;
// import org.gradle.api.services.BuildServiceRegistry;
// import org.mockito.ArgumentCaptor;
// import org.mockito.MockedStatic;
// import static org.mockito.Mockito.*;
// import org.gradle.api.provider.Provider;
// import static org.mockito.ArgumentMatchers.any;

class VersionPropertiesPluginSapientGeneratedTest {

//     @Test
//     void applyTest() {
//         // Arrange
//         Project projectMock = mock(Project.class);
//         Gradle gradleMock = mock(Gradle.class);
//         BuildServiceRegistry buildServiceRegistryMock = mock(BuildServiceRegistry.class);
//         Provider<VersionPropertiesBuildService> providerMock = mock(Provider.class);
//         VersionPropertiesBuildService versionPropertiesBuildServiceMock = mock(VersionPropertiesBuildService.class);
//         ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
//         try (MockedStatic<Util> util = mockStatic(Util.class)) {
//             when(projectMock.getGradle()).thenReturn(gradleMock);
//             when(gradleMock.getSharedServices()).thenReturn(buildServiceRegistryMock);
//             when(buildServiceRegistryMock.registerIfAbsent(eq("versions"), eq(VersionPropertiesBuildService.class), any(Action.class))).thenReturn(providerMock);
//             when(providerMock.get()).thenReturn(versionPropertiesBuildServiceMock);
//             Properties properties = new Properties();
//             when(versionPropertiesBuildServiceMock.getProperties()).thenReturn(properties);
//             when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
//             File workspaceDir = new File("workspace");
//             util.when(() -> Util.locateElasticsearchWorkspace(gradleMock)).thenReturn(workspaceDir);
//             VersionPropertiesPlugin target = new VersionPropertiesPlugin();
//             // Act
//             target.apply(projectMock);
//             // Assert
//             verify(projectMock, times(1)).getGradle();
//             verify(gradleMock).getSharedServices();
//             verify(buildServiceRegistryMock).registerIfAbsent(eq("versions"), eq(VersionPropertiesBuildService.class), any(Action.class));
//             verify(providerMock).get();
//             verify(versionPropertiesBuildServiceMock).getProperties();
//             verify(projectMock).getExtensions();
//             verify(extensionContainerMock).add(eq("versions"), eq(properties));
//             util.verify(() -> Util.locateElasticsearchWorkspace(gradleMock));
//             // Verify the correct path for infoPath
//             ArgumentCaptor<Action<VersionPropertiesBuildService.Params>> actionCaptor = ArgumentCaptor.forClass(Action.class);
//             verify(buildServiceRegistryMock).registerIfAbsent(eq("versions"), eq(VersionPropertiesBuildService.class), actionCaptor.capture());
//             VersionPropertiesBuildService.Params paramsMock = mock(VersionPropertiesBuildService.Params.class);
//             RegularFileProperty filePropertyMock = mock(RegularFileProperty.class);
//             when(paramsMock.getInfoPath()).thenReturn(filePropertyMock);
//             actionCaptor.getValue().execute(paramsMock);
//             verify(filePropertyMock).set(new File(workspaceDir, "build-tools-internal"));
//         }
//     }

//     @Test
//     void applyTestWithNullWorkspace() {
//         // Arrange
//         Project projectMock = mock(Project.class);
//         Gradle gradleMock = mock(Gradle.class);
//         try (MockedStatic<Util> util = mockStatic(Util.class)) {
//             when(projectMock.getGradle()).thenReturn(gradleMock);
//             util.when(() -> Util.locateElasticsearchWorkspace(gradleMock)).thenReturn(null);
//             VersionPropertiesPlugin target = new VersionPropertiesPlugin();
//             // Act & Assert
//             assertThrows(NullPointerException.class, () -> target.apply(projectMock));
//         }
//     }
}
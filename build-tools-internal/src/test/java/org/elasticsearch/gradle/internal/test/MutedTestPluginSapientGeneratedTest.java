package org.elasticsearch.gradle.internal.test;

// import org.elasticsearch.gradle.internal.test.MutedTestPlugin;
// import java.util.Arrays;
// import org.gradle.api.invocation.Gradle;
// import org.junit.jupiter.api.BeforeEach;
// import static org.mockito.ArgumentMatchers.any;
// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.params.ParameterizedTest;
// import static org.mockito.ArgumentMatchers.eq;
// import org.gradle.api.Project;
// import java.io.File;
// import org.gradle.api.file.RegularFile;
// import org.elasticsearch.gradle.internal.info.BuildParams;
// import org.gradle.api.tasks.TaskCollection;
// import org.gradle.api.tasks.TaskContainer;
// import org.gradle.api.file.ProjectLayout;
// import org.gradle.api.tasks.testing.Test;
// import static org.mockito.ArgumentMatchers.anyString;
// import java.util.ArrayList;
// import org.junit.jupiter.params.provider.CsvSource;
// import org.gradle.api.file.Directory;
// import org.gradle.api.services.BuildServiceRegistry;
// import org.mockito.MockedStatic;
// import static org.mockito.Mockito.*;
// import org.gradle.api.provider.Provider;
// import static org.mockito.ArgumentMatchers.any;

class MutedTestPluginSapientGeneratedTest {

//     private BuildServiceRegistry buildServiceRegistryMock;

//     private Gradle gradleMock;

//     private MutedTestsBuildService mutedTestsBuildServiceMock;

//     private Project projectMock;

//     private Project rootProjectMock;

//     private Provider<MutedTestsBuildService> providerMock;

//     private TaskCollection taskCollectionMock;

//     private TaskContainer taskContainerMock;

//     private ProjectLayout projectLayoutMock;

//     private Directory projectDirectoryMock;

//     @BeforeEach
//     void setUp() {
//         buildServiceRegistryMock = mock(BuildServiceRegistry.class);
//         gradleMock = mock(Gradle.class);
//         mutedTestsBuildServiceMock = mock(MutedTestsBuildService.class);
//         projectMock = mock(Project.class);
//         rootProjectMock = mock(Project.class);
//         providerMock = mock(Provider.class);
//         taskCollectionMock = mock(TaskCollection.class);
//         taskContainerMock = mock(TaskContainer.class);
//         projectLayoutMock = mock(ProjectLayout.class);
//         projectDirectoryMock = mock(Directory.class);
//         when(projectMock.getGradle()).thenReturn(gradleMock);
//         when(gradleMock.getSharedServices()).thenReturn(buildServiceRegistryMock);
//         when(buildServiceRegistryMock.registerIfAbsent(eq("mutedTests"), eq(MutedTestsBuildService.class), any())).thenReturn(providerMock);
//         when(providerMock.get()).thenReturn(mutedTestsBuildServiceMock);
//         when(projectMock.getRootProject()).thenReturn(rootProjectMock);
//         when(rootProjectMock.getProjectDir()).thenReturn(new File("rootProjectDir"));
//         when(projectMock.getTasks()).thenReturn(taskContainerMock);
//         when(taskContainerMock.withType(Test.class)).thenReturn(taskCollectionMock);
//         when(rootProjectMock.getLayout()).thenReturn(projectLayoutMock);
//         when(projectLayoutMock.getProjectDirectory()).thenReturn(projectDirectoryMock);
//     }

//     @Test
//     void applyWhenProjectHasAdditionalFilesProperty() {
//         when(projectMock.hasProperty("org.elasticsearch.additional.muted.tests")).thenReturn(true);
//         when(projectMock.property("org.elasticsearch.additional.muted.tests")).thenReturn("file1.txt,file2.txt");
//         when(projectDirectoryMock.file(anyString())).thenReturn(mock(RegularFile.class));
//         when(mutedTestsBuildServiceMock.getExcludePatterns()).thenReturn(Arrays.asList("pattern1", "pattern2"));
//         try (MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
//             buildParams.when(BuildParams::isCi).thenReturn(false);
//             MutedTestPlugin plugin = new MutedTestPlugin();
//             plugin.apply(projectMock);
//             verify(projectMock).hasProperty("org.elasticsearch.additional.muted.tests");
//             verify(projectMock).property("org.elasticsearch.additional.muted.tests");
//             verify(projectDirectoryMock, times(2)).file(anyString());
//             verify(taskCollectionMock).configureEach(any());
//             buildParams.verify(BuildParams::isCi, times(1));
//         }
//     }

//     @ParameterizedTest
//     @CsvSource({ "true,true", "true,false", "false,true", "false,false" })
//     void applyWithDifferentBuildParamsAndAdditionalFilesProperty(boolean hasAdditionalFiles, boolean isCi) {
//         when(projectMock.hasProperty("org.elasticsearch.additional.muted.tests")).thenReturn(hasAdditionalFiles);
//         if (hasAdditionalFiles) {
//             when(projectMock.property("org.elasticsearch.additional.muted.tests")).thenReturn("file1.txt");
//             when(projectDirectoryMock.file(anyString())).thenReturn(mock(RegularFile.class));
//         }
//         when(mutedTestsBuildServiceMock.getExcludePatterns()).thenReturn(Arrays.asList("pattern1"));
//         try (MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
//             buildParams.when(BuildParams::isCi).thenReturn(isCi);
//             MutedTestPlugin plugin = new MutedTestPlugin();
//             plugin.apply(projectMock);
//             verify(projectMock).hasProperty("org.elasticsearch.additional.muted.tests");
//             if (hasAdditionalFiles) {
//                 verify(projectMock).property("org.elasticsearch.additional.muted.tests");
//                 verify(projectDirectoryMock).file(anyString());
//             }
//             verify(taskCollectionMock).configureEach(any());
//             buildParams.verify(BuildParams::isCi, times(1));
//         }
//     }

//     @Test
//     void applyWhenNoExcludePatterns() {
//         when(projectMock.hasProperty("org.elasticsearch.additional.muted.tests")).thenReturn(false);
//         when(mutedTestsBuildServiceMock.getExcludePatterns()).thenReturn(new ArrayList<>());
//         try (MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
//             buildParams.when(BuildParams::isCi).thenReturn(true);
//             MutedTestPlugin plugin = new MutedTestPlugin();
//             plugin.apply(projectMock);
//             verify(projectMock).hasProperty("org.elasticsearch.additional.muted.tests");
//             verify(taskCollectionMock).configureEach(any());
//             buildParams.verify(BuildParams::isCi, times(1));
//         }
//     }
}
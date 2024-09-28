package org.elasticsearch.gradle.internal.test;

import org.junit.jupiter.api.Timeout;
import groovy.lang.MissingPropertyException;
import java.util.List;
import org.gradle.api.Action;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.invocation.Gradle;
import org.gradle.api.provider.Provider;
import org.gradle.api.Project;
import org.gradle.api.tasks.testing.Test;
import org.gradle.api.tasks.TaskCollection;
import org.mockito.MockedStatic;
import java.io.File;
import java.util.ArrayList;
import org.elasticsearch.gradle.internal.info.BuildParams;
import org.gradle.api.services.BuildServiceRegistry;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class MutedTestPluginSapientGeneratedTest {

    private final BuildServiceRegistry buildServiceRegistryMock = mock(BuildServiceRegistry.class);

    private final Gradle gradleMock = mock(Gradle.class);

    private final MutedTestsBuildService mutedTestsBuildServiceMock = mock(MutedTestsBuildService.class);

    private final Project projectMock = mock(Project.class);

    private final Project projectMock2 = mock(Project.class);

    private final Provider<MutedTestsBuildService> providerMock = mock(Provider.class);

    private final TaskCollection taskCollectionMock = mock(TaskCollection.class);

    private final TaskContainer taskContainerMock = mock(TaskContainer.class);

    //Sapient generated method id: ${applyWhenBuildParamsIsCiEqualsFalse}, hash: 796F20EEC3E93A8D5C6E7DE685BA5B9F
    @Disabled()
    @org.junit.jupiter.api.Test()
    void applyWhenBuildParamsIsCiEqualsFalse() throws MissingPropertyException {
        /* Branches:
         * (project.hasProperty(ADDITIONAL_FILES_PROPERTY)) : true
         * (for-each(mutedTestsProvider.get().getExcludePatterns())) : true  #  inside lambda$apply$3 method
         * (BuildParams.isCi() == false) : true  #  inside lambda$apply$3 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object objectMock = mock(Object.class, "object");
        try (MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            doReturn(true).when(projectMock).hasProperty("org.elasticsearch.additional.muted.tests");
            doReturn(objectMock).when(projectMock).property("org.elasticsearch.additional.muted.tests");
            doReturn(gradleMock).when(projectMock).getGradle();
            doReturn(buildServiceRegistryMock).when(gradleMock).getSharedServices();
            doReturn(providerMock).when(buildServiceRegistryMock).registerIfAbsent(eq("mutedTests"), eq(MutedTestsBuildService.class), (Action) any());
            doReturn(mutedTestsBuildServiceMock).when(providerMock).get();
            List<String> stringList = new ArrayList<>(List.of("return_of_getExcludePatternsItem1"));
            doReturn(stringList).when(mutedTestsBuildServiceMock).getExcludePatterns();
            doReturn(projectMock2).when(projectMock).getRootProject();
            File file = new File("pathname1");
            doReturn(file).when(projectMock2).getProjectDir();
            doReturn(taskContainerMock).when(projectMock).getTasks();
            doReturn(taskCollectionMock).when(taskContainerMock).withType(Test.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            buildParams.when(() -> BuildParams.isCi()).thenReturn(false);
            MutedTestPlugin target = new MutedTestPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).hasProperty("org.elasticsearch.additional.muted.tests");
                verify(projectMock).property("org.elasticsearch.additional.muted.tests");
                verify(projectMock).getGradle();
                verify(gradleMock).getSharedServices();
                verify(buildServiceRegistryMock).registerIfAbsent(eq("mutedTests"), eq(MutedTestsBuildService.class), (Action) any());
                verify(providerMock, atLeast(1)).get();
                verify(mutedTestsBuildServiceMock).getExcludePatterns();
                verify(projectMock).getRootProject();
                verify(projectMock2).getProjectDir();
                verify(projectMock).getTasks();
                verify(taskContainerMock).withType(Test.class);
                verify(taskCollectionMock).configureEach((Action) any());
                buildParams.verify(() -> BuildParams.isCi(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenPIsEmptyNotEqualsFalseAndMutedTestsProviderGetGetExcludePatternsIsEmptyAndBuildParamsIsCiNotEqualsFalse}, hash: 44E754AA8F4171C34CABC39B61DEE5A3
    @Disabled()
    @org.junit.jupiter.api.Test()
    void applyWhenPIsEmptyNotEqualsFalseAndMutedTestsProviderGetGetExcludePatternsIsEmptyAndBuildParamsIsCiNotEqualsFalse() {
        /* Branches:
         * (project.hasProperty(ADDITIONAL_FILES_PROPERTY)) : false
         * (p.isEmpty() == false) : false  #  inside lambda$apply$0 method
         * (for-each(mutedTestsProvider.get().getExcludePatterns())) : false  #  inside lambda$apply$3 method
         * (BuildParams.isCi() == false) : false  #  inside lambda$apply$3 method
         */
        //Arrange Statement(s)
        try (MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            doReturn(false).when(projectMock).hasProperty("org.elasticsearch.additional.muted.tests");
            doReturn(gradleMock).when(projectMock).getGradle();
            doReturn(buildServiceRegistryMock).when(gradleMock).getSharedServices();
            doReturn(providerMock).when(buildServiceRegistryMock).registerIfAbsent(eq("mutedTests"), eq(MutedTestsBuildService.class), (Action) any());
            doReturn(mutedTestsBuildServiceMock).when(providerMock).get();
            List<String> stringList = new ArrayList<>();
            doReturn(stringList).when(mutedTestsBuildServiceMock).getExcludePatterns();
            doReturn(projectMock2).when(projectMock).getRootProject();
            File file = new File("pathname1");
            doReturn(file).when(projectMock2).getProjectDir();
            doReturn(taskContainerMock).when(projectMock).getTasks();
            doReturn(taskCollectionMock).when(taskContainerMock).withType(Test.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            buildParams.when(() -> BuildParams.isCi()).thenReturn(true);
            MutedTestPlugin target = new MutedTestPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).hasProperty("org.elasticsearch.additional.muted.tests");
                verify(projectMock).getGradle();
                verify(gradleMock).getSharedServices();
                verify(buildServiceRegistryMock).registerIfAbsent(eq("mutedTests"), eq(MutedTestsBuildService.class), (Action) any());
                verify(providerMock, atLeast(1)).get();
                verify(mutedTestsBuildServiceMock).getExcludePatterns();
                verify(projectMock).getRootProject();
                verify(projectMock2).getProjectDir();
                verify(projectMock).getTasks();
                verify(taskContainerMock).withType(Test.class);
                verify(taskCollectionMock).configureEach((Action) any());
                buildParams.verify(() -> BuildParams.isCi(), atLeast(1));
            });
        }
    }
}

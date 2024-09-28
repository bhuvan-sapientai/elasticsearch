package org.elasticsearch.gradle.internal.test;

import org.junit.jupiter.api.Timeout;
import org.gradle.api.tasks.testing.Test;
import org.mockito.stubbing.Answer;
import org.gradle.api.JavaVersion;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.Action;
import org.mockito.MockedStatic;
import org.elasticsearch.gradle.internal.info.BuildParams;
import org.elasticsearch.gradle.util.GradleUtils;
import org.gradle.api.Project;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class InternalClusterTestPluginSapientGeneratedTest {

    private final Project projectMock = mock(Project.class);

    private final TaskProvider<Test> taskProviderMock = mock(TaskProvider.class);

    //Sapient generated method id: ${applyWhenBuildParamsGetRuntimeJavaVersionCompareToJavaVersionVERSION_14LessThan0}, hash: A12A373AB8771081D6C60C168658C358
    @Disabled()
    @org.junit.jupiter.api.Test()
    void applyWhenBuildParamsGetRuntimeJavaVersionCompareToJavaVersionVERSION_14LessThan0() {
        /* Branches:
         * (BuildParams.getRuntimeJavaVersion().compareTo(JavaVersion.VERSION_14) < 0) : true  #  inside lambda$apply$0 method
         */
        //Arrange Statement(s)
        try (MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class);
            MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            buildParams.when(() -> BuildParams.getRuntimeJavaVersion()).thenReturn(JavaVersion.VERSION_1_2);
            gradleUtils.when(() -> GradleUtils.addTestSourceSet(projectMock, "internalClusterTest")).thenReturn(taskProviderMock);
            doNothing().when(taskProviderMock).configure((Action) any());
            gradleUtils.when(() -> GradleUtils.extendSourceSet(projectMock, "test", "internalClusterTest")).thenAnswer((Answer<Void>) invocation -> null);
            InternalClusterTestPlugin target = new InternalClusterTestPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                buildParams.verify(() -> BuildParams.getRuntimeJavaVersion(), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.addTestSourceSet(projectMock, "internalClusterTest"), atLeast(1));
                verify(taskProviderMock).configure((Action) any());
                gradleUtils.verify(() -> GradleUtils.extendSourceSet(projectMock, "test", "internalClusterTest"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenBuildParamsGetRuntimeJavaVersionCompareToJavaVersionVERSION_14NotLessThan0}, hash: 966BC62E10310156FB23A128516E8204
    @Disabled()
    @org.junit.jupiter.api.Test()
    void applyWhenBuildParamsGetRuntimeJavaVersionCompareToJavaVersionVERSION_14NotLessThan0() {
        /* Branches:
         * (BuildParams.getRuntimeJavaVersion().compareTo(JavaVersion.VERSION_14) < 0) : false  #  inside lambda$apply$0 method
         */
        //Arrange Statement(s)
        try (MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class);
            MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            buildParams.when(() -> BuildParams.getRuntimeJavaVersion()).thenReturn(JavaVersion.VERSION_HIGHER);
            gradleUtils.when(() -> GradleUtils.addTestSourceSet(projectMock, "internalClusterTest")).thenReturn(taskProviderMock);
            doNothing().when(taskProviderMock).configure((Action) any());
            gradleUtils.when(() -> GradleUtils.extendSourceSet(projectMock, "test", "internalClusterTest")).thenAnswer((Answer<Void>) invocation -> null);
            InternalClusterTestPlugin target = new InternalClusterTestPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                buildParams.verify(() -> BuildParams.getRuntimeJavaVersion(), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.addTestSourceSet(projectMock, "internalClusterTest"), atLeast(1));
                verify(taskProviderMock).configure((Action) any());
                gradleUtils.verify(() -> GradleUtils.extendSourceSet(projectMock, "test", "internalClusterTest"), atLeast(1));
            });
        }
    }
}

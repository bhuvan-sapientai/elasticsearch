package org.elasticsearch.gradle.internal.test.rest.compat.compat;

import org.junit.jupiter.api.Timeout;
import org.elasticsearch.gradle.internal.test.rest.RestTestUtil;
import org.gradle.api.Project;
import org.gradle.api.tasks.testing.Test;
import org.gradle.api.file.ProjectLayout;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.internal.file.FileOperations;
import org.elasticsearch.gradle.internal.test.RestIntegTestTask;
import org.mockito.MockedStatic;
import org.gradle.api.tasks.SourceSet;
import org.elasticsearch.gradle.internal.test.rest.LegacyYamlRestTestPlugin;
import org.gradle.api.Plugin;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5)
class LegacyYamlRestCompatTestPluginSapientGeneratedTest {

    private final FileOperations fileOperationsMock = mock(FileOperations.class);

    private final ProjectLayout projectLayoutMock = mock(ProjectLayout.class);

    //Sapient generated method id: ${registerTestTaskTest}, hash: D4A6D548DF18922C66D5F980A32FD348
    @org.junit.jupiter.api.Test()
    void registerTestTaskTest() {
        //Arrange Statement(s)
        SourceSet sourceSetMock = mock(SourceSet.class);
        TaskProvider<RestIntegTestTask> taskProviderMock = mock(TaskProvider.class);
        Project projectMock = mock(Project.class);
        try (MockedStatic<RestTestUtil> restTestUtil = mockStatic(RestTestUtil.class)) {
            doReturn("return_of_getName1").when(sourceSetMock).getName();
            restTestUtil.when(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock, "return_of_getName1")).thenReturn(taskProviderMock);
            LegacyYamlRestCompatTestPlugin target = new LegacyYamlRestCompatTestPlugin(projectLayoutMock, fileOperationsMock);
            //Act Statement(s)
            TaskProvider<? extends Test> result = target.registerTestTask(projectMock, sourceSetMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(taskProviderMock));
                verify(sourceSetMock).getName();
                restTestUtil.verify(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock, "return_of_getName1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getBasePluginTest}, hash: B7E19E4B8084F7CD8C0D91D15F62B784
    @org.junit.jupiter.api.Test()
    void getBasePluginTest() {
        //Arrange Statement(s)
        LegacyYamlRestCompatTestPlugin target = new LegacyYamlRestCompatTestPlugin(projectLayoutMock, fileOperationsMock);
        
        //Act Statement(s)
        Class<? extends Plugin<Project>> result = target.getBasePlugin();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(LegacyYamlRestTestPlugin.class)));
    }
}

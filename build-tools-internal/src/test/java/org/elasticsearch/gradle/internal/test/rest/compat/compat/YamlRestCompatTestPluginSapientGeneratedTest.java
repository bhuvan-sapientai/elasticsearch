package org.elasticsearch.gradle.internal.test.rest.compat.compat;

import org.junit.jupiter.api.Timeout;
import org.elasticsearch.gradle.internal.test.rest.InternalYamlRestTestPlugin;
import org.elasticsearch.gradle.internal.test.rest.RestTestUtil;
import org.gradle.api.Project;
import org.gradle.api.tasks.testing.Test;
import org.gradle.api.file.ProjectLayout;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.internal.file.FileOperations;
import org.mockito.MockedStatic;
import org.gradle.api.tasks.SourceSet;
import org.elasticsearch.gradle.testclusters.StandaloneRestIntegTestTask;
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
class YamlRestCompatTestPluginSapientGeneratedTest {

    private final FileOperations fileOperationsMock = mock(FileOperations.class);

    private final ProjectLayout projectLayoutMock = mock(ProjectLayout.class);

    //Sapient generated method id: ${registerTestTaskTest}, hash: 341154381DA8A0BB800D0273D731C4DD
    @org.junit.jupiter.api.Test()
    void registerTestTaskTest() {
        //Arrange Statement(s)
        SourceSet sourceSetMock = mock(SourceSet.class);
        TaskProvider<Test> taskProviderMock = mock(TaskProvider.class);
        Project projectMock = mock(Project.class);
        try (MockedStatic<RestTestUtil> restTestUtil = mockStatic(RestTestUtil.class)) {
            doReturn("return_of_getName1").when(sourceSetMock).getName();
            restTestUtil.when(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock, "return_of_getName1", StandaloneRestIntegTestTask.class)).thenReturn(taskProviderMock);
            YamlRestCompatTestPlugin target = new YamlRestCompatTestPlugin(projectLayoutMock, fileOperationsMock);
            //Act Statement(s)
            TaskProvider<? extends Test> result = target.registerTestTask(projectMock, sourceSetMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(taskProviderMock));
                verify(sourceSetMock).getName();
                restTestUtil.verify(() -> RestTestUtil.registerTestTask(projectMock, sourceSetMock, "return_of_getName1", StandaloneRestIntegTestTask.class), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getBasePluginTest}, hash: C45C475EEE406B4D7194DAD944247FC7
    @org.junit.jupiter.api.Test()
    void getBasePluginTest() {
        //Arrange Statement(s)
        YamlRestCompatTestPlugin target = new YamlRestCompatTestPlugin(projectLayoutMock, fileOperationsMock);
        
        //Act Statement(s)
        Class<? extends Plugin<Project>> result = target.getBasePlugin();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(InternalYamlRestTestPlugin.class)));
    }
}

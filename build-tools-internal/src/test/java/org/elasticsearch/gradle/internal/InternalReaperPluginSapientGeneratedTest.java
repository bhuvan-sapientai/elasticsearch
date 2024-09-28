package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.elasticsearch.gradle.ReaperPlugin;
import org.gradle.api.file.ProjectLayout;
import org.mockito.MockedStatic;
import org.gradle.api.Project;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5)
class InternalReaperPluginSapientGeneratedTest {

    //Sapient generated method id: ${applyTest}, hash: B5915A492A9E0DFBF162935E61F91076
    @Test()
    void applyTest() {
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        try (MockedStatic<ReaperPlugin> reaperPlugin = mockStatic(ReaperPlugin.class)) {
            reaperPlugin.when(() -> ReaperPlugin.registerReaperService(projectMock, projectLayoutMock, true)).thenAnswer((Answer<Void>) invocation -> null);
            InternalReaperPlugin target = new InternalReaperPlugin(projectLayoutMock);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> reaperPlugin.verify(() -> ReaperPlugin.registerReaperService(projectMock, projectLayoutMock, true), atLeast(1)));
        }
    }
}

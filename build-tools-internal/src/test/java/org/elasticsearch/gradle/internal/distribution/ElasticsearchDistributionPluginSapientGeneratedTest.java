package org.elasticsearch.gradle.internal.distribution;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.Project;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5)
class ElasticsearchDistributionPluginSapientGeneratedTest {

    //Sapient generated method id: ${applyTest}, hash: BF8A07671E72907CCF4C668EC223F5CF
    @Test()
    void applyTest() {
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        Object object = new Object();
        Object[] objectArray = new Object[] { projectMock };
        doReturn(object).when(extensionContainerMock).create("distro", ElasticsearchDistributionExtension.class, objectArray);
        ElasticsearchDistributionPlugin target = new ElasticsearchDistributionPlugin();
        
        //Act Statement(s)
        target.apply(projectMock);
        
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).create("distro", ElasticsearchDistributionExtension.class, objectArray);
        });
    }
}

package org.elasticsearch.gradle.internal.dra;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.dsl.RepositoryHandler;
import org.gradle.api.Transformer;
import org.gradle.api.Action;
import org.gradle.api.provider.Provider;
import org.gradle.api.plugins.ExtraPropertiesExtension;
import org.gradle.api.Project;
import org.gradle.api.artifacts.repositories.IvyArtifactRepository;
import org.gradle.api.provider.ProviderFactory;
import java.util.Map;
import java.util.HashMap;
import org.gradle.api.plugins.ExtensionContainer;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class DraResolvePluginSapientGeneratedTest {

    private final ProviderFactory providerFactoryMock = mock(ProviderFactory.class, "providerFactory");

    private final Provider<String> repositoryPrefixMock = mock(Provider.class, "repositoryPrefix");

    //Sapient generated method id: ${applyWhenUseDra}, hash: 48AEEC932CFABD8C823FC6BE9CAE5E6F
    @Disabled()
    @Test()
    void applyWhenUseDra() {
        /* Branches:
         * (useDra) : true
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        ExtraPropertiesExtension extraPropertiesExtensionMock = mock(ExtraPropertiesExtension.class);
        doReturn(extraPropertiesExtensionMock).when(extensionContainerMock).getExtraProperties();
        doNothing().when(extraPropertiesExtensionMock).set("useDra", true);
        RepositoryHandler repositoryHandlerMock = mock(RepositoryHandler.class);
        doReturn(repositoryHandlerMock).when(projectMock).getRepositories();
        IvyArtifactRepository ivyArtifactRepositoryMock = mock(IvyArtifactRepository.class);
        doReturn(ivyArtifactRepositoryMock).when(repositoryHandlerMock).ivy((Action) any());
        doReturn(repositoryPrefixMock).when(providerFactoryMock).systemProperty("dra.artifacts.url.repo.prefix");
        Provider<String> providerMock = mock(Provider.class);
        doReturn(providerMock).when(providerFactoryMock).systemProperty("dra.artifacts");
        Provider providerMock2 = mock(Provider.class);
        doReturn(providerMock2).when(providerMock).map((Transformer) any());
        doReturn(true).when(providerMock2).getOrElse(false);
        Provider<String> providerMock3 = mock(Provider.class);
        doReturn(providerMock3).when(providerFactoryMock).systemProperty("dra.workflow");
        Provider providerMock4 = mock(Provider.class);
        doReturn(providerMock4).when(providerMock3).map((Transformer) any());
        Provider providerMock5 = mock(Provider.class);
        doReturn(providerMock5).when(providerMock4).map((Transformer) any());
        doReturn(DraResolvePlugin.DraWorkflow.STAGING).when(providerMock5).get();
        Provider<Map<String, String>> providerMock6 = mock(Provider.class);
        doReturn(providerMock6).when(providerFactoryMock).systemPropertiesPrefixedBy("dra.artifacts.dependency");
        Provider<Map<String, String>> providerMock7 = mock(Provider.class);
        doReturn(providerMock7).when(providerMock6).map((Transformer) any());
        Map map = new HashMap<>();
        doReturn(map).when(providerMock7).get();
        Provider providerMock8 = mock(Provider.class);
        doReturn(providerMock8).when(repositoryPrefixMock).orElse("https://artifacts-staging.elastic.co/");
        Object object = new Object();
        doReturn(object).when(providerMock8).get();
        DraResolvePlugin target = new DraResolvePlugin(providerFactoryMock);
        //Act Statement(s)
        target.apply(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).getExtraProperties();
            verify(extraPropertiesExtensionMock).set("useDra", true);
            verify(projectMock).getRepositories();
            verify(repositoryHandlerMock).ivy((Action) any());
            verify(providerFactoryMock).systemProperty("dra.artifacts.url.repo.prefix");
            verify(providerFactoryMock).systemProperty("dra.artifacts");
            verify(providerMock).map((Transformer) any());
            verify(providerMock2, atLeast(1)).getOrElse(false);
            verify(providerFactoryMock).systemProperty("dra.workflow");
            verify(providerMock3).map((Transformer) any());
            verify(providerMock4).map((Transformer) any());
            verify(providerMock5, atLeast(1)).get();
            verify(providerFactoryMock).systemPropertiesPrefixedBy("dra.artifacts.dependency");
            verify(providerMock6).map((Transformer) any());
            verify(providerMock7, atLeast(1)).get();
            verify(repositoryPrefixMock).orElse("https://artifacts-staging.elastic.co/");
            verify(providerMock8).get();
        });
    }
}

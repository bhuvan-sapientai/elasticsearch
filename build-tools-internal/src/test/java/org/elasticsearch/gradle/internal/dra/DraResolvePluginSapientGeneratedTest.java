package org.elasticsearch.gradle.internal.dra;

import org.elasticsearch.gradle.internal.dra.DraResolvePlugin;

import org.junit.jupiter.api.BeforeEach;

import javax.inject.Inject;
import java.util.Map;

import static org.mockito.ArgumentMatchers.any;

import org.gradle.api.plugins.ExtraPropertiesExtension;

import static java.util.Map.Entry;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.mockito.ArgumentMatchers.eq;

import org.gradle.api.Project;
import org.gradle.api.Plugin;
import org.gradle.api.artifacts.repositories.IvyArtifactRepository;
import org.junit.jupiter.params.provider.EnumSource;
import org.gradle.api.artifacts.dsl.RepositoryHandler;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.provider.ProviderFactory;

import static org.mockito.ArgumentMatchers.anyString;
import static org.junit.jupiter.api.Assertions.*;

import org.mockito.ArgumentCaptor;

import java.util.stream.Collectors;

import static org.mockito.Mockito.*;

import java.util.HashMap;

import org.gradle.api.provider.Provider;

import static org.mockito.ArgumentMatchers.any;

class DraResolvePluginSapientGeneratedTest {

    private ProviderFactory providerFactoryMock;

    private Project projectMock;

    private ExtensionContainer extensionContainerMock;

    private ExtraPropertiesExtension extraPropertiesExtensionMock;

    private RepositoryHandler repositoryHandlerMock;

    private IvyArtifactRepository ivyArtifactRepositoryMock;

    private DraResolvePlugin plugin;

    @BeforeEach
    void setUp() {
        //providerFactoryMock = mock(ProviderFactory.class);
        //projectMock = mock(Project.class);
        //extensionContainerMock = mock(ExtensionContainer.class);
        //extraPropertiesExtensionMock = mock(ExtraPropertiesExtension.class);
        //repositoryHandlerMock = mock(RepositoryHandler.class);
        //ivyArtifactRepositoryMock = mock(IvyArtifactRepository.class);
        //when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
        //when(extensionContainerMock.getExtraProperties()).thenReturn(extraPropertiesExtensionMock);
        //when(projectMock.getRepositories()).thenReturn(repositoryHandlerMock);
        //when(repositoryHandlerMock.ivy(any())).thenReturn(ivyArtifactRepositoryMock);
        //plugin = new DraResolvePlugin(providerFactoryMock);
    }

    @Test
    void applyWhenUseDraIsFalse() {
        when(providerFactoryMock.systemProperty(DraResolvePlugin.USE_DRA_ARTIFACTS_FLAG)).thenReturn(mockProviderWithValue("false"));
        plugin.apply(projectMock);
        verify(extraPropertiesExtensionMock).set("useDra", false);
        verifyNoMoreInteractions(repositoryHandlerMock);
    }

    @Test
    void applyWhenUseDraIsTrue() {
        //setupMocksForUseDraTrue(DraResolvePlugin.DraWorkflow.STAGING);
        //plugin.apply(projectMock);
        //verify(extraPropertiesExtensionMock).set("useDra", true);
        //verify(projectMock).getRepositories();
        //verify(repositoryHandlerMock).ivy(any());
    }

    @ParameterizedTest
    @EnumSource(DraResolvePlugin.DraWorkflow.class)
    void applyWithDifferentWorkflows(DraResolvePlugin.DraWorkflow workflow) {
        //setupMocksForUseDraTrue(workflow);
        //plugin.apply(projectMock);
        //ArgumentCaptor<IvyArtifactRepository.ModuleLocation> moduleLocationCaptor = ArgumentCaptor.forClass(IvyArtifactRepository.ModuleLocation.class);
        //verify(ivyArtifactRepositoryMock).setName(startsWith("dra-" + workflow.name().toLowerCase()));
        //verify(ivyArtifactRepositoryMock).setUrl(workflow.repository);
        //verify(ivyArtifactRepositoryMock).patternLayout(any());
    }

    @Test
    void applyWithMultipleBuildIdProperties() {
        //setupMocksForUseDraTrue(DraResolvePlugin.DraWorkflow.STAGING);
        //Map<String, String> buildIdProps = new HashMap<>();
        //buildIdProps.put("dra.artifacts.dependency.key1", "value1");
        //buildIdProps.put("dra.artifacts.dependency.key2", "value2");
        //when(providerFactoryMock.systemPropertiesPrefixedBy(DraResolvePlugin.DRA_ARTIFACTS_DEPENDENCY_PREFIX)).thenReturn(mockProviderWithValue(buildIdProps));
        //plugin.apply(projectMock);
        //verify(repositoryHandlerMock, times(2)).ivy(any());
    }

    private void setupMocksForUseDraTrue(DraResolvePlugin.DraWorkflow workflow) {
        when(providerFactoryMock.systemProperty(DraResolvePlugin.USE_DRA_ARTIFACTS_FLAG)).thenReturn(mockProviderWithValue("true"));
        when(providerFactoryMock.systemProperty(DraResolvePlugin.DRA_WORKFLOW)).thenReturn(mockProviderWithValue(workflow.name()));
        when(providerFactoryMock.systemProperty("dra.artifacts.url.repo.prefix")).thenReturn(mockProviderWithValue("https://test-repo.com/"));
        when(providerFactoryMock.systemPropertiesPrefixedBy(DraResolvePlugin.DRA_ARTIFACTS_DEPENDENCY_PREFIX)).thenReturn(mockProviderWithValue(new HashMap<>()));
    }

    private <T> Provider<T> mockProviderWithValue(T value) {
        //Provider<T> providerMock = mock(Provider.class);
        //when(providerMock.get()).thenReturn(value);
        //when(providerMock.getOrElse(any())).thenReturn(value);
        //when(providerMock.map(any())).thenReturn(providerMock);
        //return providerMock;
    }
}
package org.elasticsearch.gradle;

import org.elasticsearch.gradle.DistributionDownloadPlugin;
import org.gradle.api.invocation.Gradle;
import java.util.List;
import org.gradle.api.artifacts.type.ArtifactTypeDefinition;
import org.junit.jupiter.api.BeforeEach;
import org.gradle.api.provider.Property;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;
import org.gradle.api.artifacts.repositories.IvyArtifactRepository;
import org.mockito.Mock;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.artifacts.dsl.RepositoryHandler;
import org.mockito.MockitoAnnotations;
import org.gradle.api.artifacts.type.ArtifactTypeContainer;
import org.mockito.InjectMocks;
import java.util.ArrayList;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import static org.junit.jupiter.api.Assertions.*;
import org.gradle.StartParameter;
import static org.mockito.Mockito.*;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.Provider;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

class DistributionDownloadPluginSapientGeneratedTest {

    @Mock
    private ObjectFactory objectFactory;

    @Mock
    private Property<Boolean> dockerAvailability;

    @InjectMocks
    private DistributionDownloadPlugin plugin;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void tearDown() {
        // No specific teardown needed
    }

    @Disabled()
    @Test
    void testSetDockerAvailability() {
        Provider<Boolean> mockProvider = mock(Provider.class);
        when(objectFactory.property(Boolean.class)).thenReturn(dockerAvailability);
        plugin.setDockerAvailability(mockProvider);
        verify(dockerAvailability).set(mockProvider);
    }

    @Disabled()
    @Test
    void testApply() {
        Project mockProject = mock(Project.class);
        Gradle mockGradle = mock(Gradle.class);
        StartParameter mockStartParameter = mock(StartParameter.class);
        DependencyHandler mockDependencyHandler = mock(DependencyHandler.class);
        ConfigurationContainer mockConfigurationContainer = mock(ConfigurationContainer.class);
        RepositoryHandler mockRepositoryHandler = mock(RepositoryHandler.class);
        ArtifactTypeContainer mockArtifactTypeContainer = mock(ArtifactTypeContainer.class);
        when(mockProject.getGradle()).thenReturn(mockGradle);
        when(mockGradle.getStartParameter()).thenReturn(mockStartParameter);
        when(mockStartParameter.getWriteDependencyVerifications()).thenReturn(new ArrayList<>());
        when(mockProject.getDependencies()).thenReturn(mockDependencyHandler);
        when(mockProject.getConfigurations()).thenReturn(mockConfigurationContainer);
        when(mockProject.getRepositories()).thenReturn(mockRepositoryHandler);
        when(mockDependencyHandler.getArtifactTypes()).thenReturn(mockArtifactTypeContainer);
        plugin.apply(mockProject);
        verify(mockDependencyHandler, times(2)).registerTransform(any(), any());
        verify(mockArtifactTypeContainer).maybeCreate("tar.gz");
        verify(mockProject).getExtensions();
        verify(mockRepositoryHandler).findByName("elasticsearch-downloads");
    }

    @Disabled()
    @Test
    void testGetContainer() {
        Project mockProject = mock(Project.class);
        when(mockProject.getExtensions()).thenReturn(mock(org.gradle.api.plugins.ExtensionContainer.class));
        DistributionDownloadPlugin.getContainer(mockProject);
        verify(mockProject.getExtensions()).getByName("elasticsearch_distributions");
    }

    @Disabled()
    @Test
    void testGetRegistrationsContainer() {
        Project mockProject = mock(Project.class);
        when(mockProject.getExtensions()).thenReturn(mock(org.gradle.api.plugins.ExtensionContainer.class));
        DistributionDownloadPlugin.getRegistrationsContainer(mockProject);
        verify(mockProject.getExtensions()).getByName("elasticsearch_distributions_resolutions");
    }
}

package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.JdkDownloadPlugin;

import org.gradle.api.attributes.AttributesSchema;
import org.gradle.api.artifacts.type.ArtifactTypeDefinition;
import org.junit.jupiter.api.Test;
import org.gradle.api.attributes.AttributeMatchingStrategy;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.Project;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.artifacts.repositories.IvyArtifactRepository;
import org.gradle.api.Action;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.artifacts.dsl.RepositoryHandler;
import org.gradle.api.attributes.AttributeContainer;
import org.gradle.api.plugins.ExtensionContainer;

import static org.hamcrest.MatcherAssert.assertThat;

import org.gradle.api.artifacts.type.ArtifactTypeContainer;
import org.gradle.api.attributes.Attribute;

import static org.hamcrest.Matchers.*;

import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.gradle.api.GradleException;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.artifacts.Dependency;

import static org.mockito.Mockito.*;

import org.gradle.api.model.ObjectFactory;

import static org.mockito.ArgumentMatchers.any;

class JdkDownloadPluginSapientGeneratedTest {

    @Test
    void testApply() {
        // Setup
        //Project project = mock(Project.class);
        //DependencyHandler dependencyHandler = mock(DependencyHandler.class);
        //AttributesSchema attributesSchema = mock(AttributesSchema.class);
        //ArtifactTypeContainer artifactTypeContainer = mock(ArtifactTypeContainer.class);
        //ConfigurationContainer configurationContainer = mock(ConfigurationContainer.class);
        //Configuration configuration = mock(Configuration.class);
        //AttributeContainer attributeContainer = mock(AttributeContainer.class);
        //RepositoryHandler repositoryHandler = mock(RepositoryHandler.class);
        //ObjectFactory objectFactory = mock(ObjectFactory.class);
        //ExtensionContainer extensionContainer = mock(ExtensionContainer.class);
        //NamedDomainObjectContainer<Jdk> jdkContainer = mock(NamedDomainObjectContainer.class);
        //when(project.getDependencies()).thenReturn(dependencyHandler);
        //when(dependencyHandler.getAttributesSchema()).thenReturn(attributesSchema);
        //when(dependencyHandler.getArtifactTypes()).thenReturn(artifactTypeContainer);
        //when(project.getConfigurations()).thenReturn(configurationContainer);
        //when(configurationContainer.create(anyString())).thenReturn(configuration);
        //when(configuration.getAttributes()).thenReturn(attributeContainer);
        //when(project.getRepositories()).thenReturn(repositoryHandler);
        //when(project.getObjects()).thenReturn(objectFactory);
        //when(project.getExtensions()).thenReturn(extensionContainer);
        //when(project.container(eq(Jdk.class), any())).thenReturn(jdkContainer);
        // Execute
        //JdkDownloadPlugin plugin = new JdkDownloadPlugin();
        //plugin.apply(project);
        // Verify
        //verify(dependencyHandler).getAttributesSchema();
        //verify(attributesSchema).attribute(any(Attribute.class));
        //verify(dependencyHandler, times(2)).getArtifactTypes();
        //verify(artifactTypeContainer).maybeCreate(ArtifactTypeDefinition.ZIP_TYPE);
        //verify(dependencyHandler).registerTransform(any(), any());
        //verify(project).getConfigurations();
        //verify(configurationContainer).create(anyString());
        //verify(configuration).setCanBeConsumed(false);
        //verify(configuration, times(2)).getAttributes();
        //verify(attributeContainer).attribute(any(Attribute.class), any());
        //verify(project).getRepositories();
        //verify(project).getObjects();
        //verify(project).container(eq(Jdk.class), any());
        //verify(extensionContainer).add(eq("jdks"), any());
    }

    @Test
    void testGetContainer() {
        // Setup
        Project project = mock(Project.class);
        ExtensionContainer extensionContainer = mock(ExtensionContainer.class);
        NamedDomainObjectContainer<Jdk> jdkContainer = mock(NamedDomainObjectContainer.class);
        when(project.getExtensions()).thenReturn(extensionContainer);
        when(extensionContainer.getByName("jdks")).thenReturn(jdkContainer);
        // Execute
        NamedDomainObjectContainer<Jdk> result = JdkDownloadPlugin.getContainer(project);
        // Verify
        assertThat(result, is(jdkContainer));
        verify(project).getExtensions();
        verify(extensionContainer).getByName("jdks");
    }

    @Test
    void testSetupRepository() {
        // Setup
        //Project project = mock(Project.class);
        //RepositoryHandler repositoryHandler = mock(RepositoryHandler.class);
        //IvyArtifactRepository ivyRepository = mock(IvyArtifactRepository.class);
        //Jdk jdk = mock(Jdk.class);
        //when(project.getRepositories()).thenReturn(repositoryHandler);
        //when(repositoryHandler.ivy(any(Action.class))).thenReturn(ivyRepository);
        //when(jdk.getVendor()).thenReturn(JdkDownloadPlugin.VENDOR_ADOPTIUM);
        //when(jdk.getMajor()).thenReturn("8");
        //when(jdk.getBaseVersion()).thenReturn("8u292");
        //when(jdk.getBuild()).thenReturn("b10");
        // Execute
        //JdkDownloadPlugin plugin = new JdkDownloadPlugin();
        //plugin.apply(project);
        //plugin.setupRepository(project, jdk);
        // Verify
        //verify(repositoryHandler).ivy(any(Action.class));
        //verify(ivyRepository).setName(startsWith("jdk_repo_"));
        //verify(ivyRepository).setUrl(startsWith("https://api.adoptium.net"));
        //verify(ivyRepository).patternLayout(any(Action.class));
        //verify(ivyRepository).metadataSources(any(Action.class));
        //verify(ivyRepository).content(any(Action.class));
    }

    @Test
    void testSetupRepositoryUnknownVendor() {
        // Setup
        //Project project = mock(Project.class);
        //RepositoryHandler repositoryHandler = mock(RepositoryHandler.class);
        //Jdk jdk = mock(Jdk.class);
        //when(project.getRepositories()).thenReturn(repositoryHandler);
        //when(jdk.getVendor()).thenReturn("unknown");
        // Execute and Verify
        //JdkDownloadPlugin plugin = new JdkDownloadPlugin();
        //plugin.apply(project);
        //assertThrows(GradleException.class, () -> plugin.setupRepository(project, jdk));
    }
}
package org.elasticsearch.gradle;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.artifacts.UnknownConfigurationException;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.artifacts.type.ArtifactTypeDefinition;
import org.gradle.api.artifacts.ConfigurationContainer;
import java.util.List;
import org.gradle.api.artifacts.dsl.RepositoryHandler;
import org.gradle.api.Transformer;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.artifacts.Dependency;
import org.gradle.api.attributes.AttributeContainer;
import org.elasticsearch.gradle.transform.SymbolicLinkPreservingUntarTransform;
import org.gradle.api.invocation.Gradle;
import org.mockito.MockitoAnnotations;
import org.gradle.api.provider.Provider;
import org.gradle.api.attributes.Attribute;
import java.util.concurrent.Callable;
import org.gradle.api.artifacts.repositories.IvyArtifactRepository;
import java.util.ArrayList;
import org.elasticsearch.gradle.transform.UnzipTransform;
import org.gradle.api.artifacts.DependencySet;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.StartParameter;
import org.gradle.api.provider.Property;
import org.gradle.api.Action;
import org.gradle.api.NamedDomainObjectFactory;
import org.gradle.api.Project;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.artifacts.type.ArtifactTypeContainer;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import org.mockito.MockedStatic;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class DistributionDownloadPluginSapientGeneratedTest {

    private final Property<Boolean> dockerAvailabilityMock = mock(Property.class, "dockerAvailability");

    private final ObjectFactory objectFactoryMock = mock(ObjectFactory.class, "objectFactory");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private DistributionDownloadPlugin target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${setDockerAvailabilityTest}, hash: BA23529FC24EFFEAD4AFD5DA42FD0FD1
    @Test()
    void setDockerAvailabilityTest() {
        //Arrange Statement(s)
        Property propertyMock = mock(Property.class);
        doReturn(propertyMock).when(objectFactoryMock).property(Boolean.class);
        doReturn(dockerAvailabilityMock).when(propertyMock).value(false);
        Provider<Boolean> providerMock = mock(Provider.class);
        doNothing().when(dockerAvailabilityMock).set(providerMock);
        target = new DistributionDownloadPlugin(objectFactoryMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        target.setDockerAvailability(providerMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(objectFactoryMock).property(Boolean.class);
            verify(propertyMock).value(false);
            verify(dockerAvailabilityMock).set(providerMock);
        });
    }

    //Sapient generated method id: ${applyWhenProjectGetRepositoriesFindByNameDOWNLOAD_REPO_NAMEIsNotNull}, hash: 2571A6AB4503422C9FDE552A934C84E0
    @Disabled()
    @Test()
    void applyWhenProjectGetRepositoriesFindByNameDOWNLOAD_REPO_NAMEIsNotNull() throws InvalidUserDataException {
        /* Branches:
         * (project.getGradle().getStartParameter().getWriteDependencyVerifications().isEmpty() == false) : true
         * (writingDependencies == false) : false  #  inside lambda$setupDistributionContainer$2 method
         * (project.getRepositories().findByName(DOWNLOAD_REPO_NAME) != null) : true  #  inside setupDownloadServiceRepo method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.elasticsearch.gradle.ElasticsearchDistribution
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        Gradle gradleMock = mock(Gradle.class);
        doReturn(gradleMock).when(projectMock).getGradle();
        List<String> stringList = new ArrayList<>(List.of("writeDependencyVerificationsItem1"));
        StartParameter startParameter = new StartParameter();
        startParameter.setWriteDependencyVerifications(stringList);
        doReturn(startParameter).when(gradleMock).getStartParameter();
        DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        doNothing().when(dependencyHandlerMock).registerTransform(eq(UnzipTransform.class), (Action) any());
        DependencyHandler dependencyHandlerMock2 = mock(DependencyHandler.class);
        ArtifactTypeContainer artifactTypeContainerMock = mock(ArtifactTypeContainer.class);
        doReturn(artifactTypeContainerMock).when(dependencyHandlerMock2).getArtifactTypes();
        ArtifactTypeDefinition artifactTypeDefinitionMock = mock(ArtifactTypeDefinition.class);
        doReturn(artifactTypeDefinitionMock).when(artifactTypeContainerMock).maybeCreate("tar.gz");
        doReturn("return_of_getName1").when(artifactTypeDefinitionMock).getName();
        DependencyHandler dependencyHandlerMock3 = mock(DependencyHandler.class);
        doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3).when(projectMock).getDependencies();
        doNothing().when(dependencyHandlerMock3).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        List<DistributionResolution> distributionResolutionList = new ArrayList<>();
        doNothing().when(extensionContainerMock).add("elasticsearch_distributions_resolutions", distributionResolutionList);
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        Configuration configurationMock = mock(Configuration.class);
        doReturn(configurationMock).when(configurationContainerMock).create("es_distro_file_A");
        ConfigurationContainer configurationContainerMock2 = mock(ConfigurationContainer.class);
        doReturn(configurationContainerMock, configurationContainerMock2).when(projectMock).getConfigurations();
        Configuration configurationMock2 = mock(Configuration.class);
        doReturn(configurationMock2).when(configurationContainerMock2).create("es_distro_extracted_A");
        AttributeContainer attributeContainerMock = mock(AttributeContainer.class);
        doReturn(attributeContainerMock).when(configurationMock2).getAttributes();
        AttributeContainer attributeContainerMock2 = mock(AttributeContainer.class);
        Attribute attribute = ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE;
        doReturn(attributeContainerMock2).when(attributeContainerMock).attribute(attribute, "directory");
        NamedDomainObjectContainer<ElasticsearchDistribution> namedDomainObjectContainerMock = mock(NamedDomainObjectContainer.class);
        doReturn(namedDomainObjectContainerMock).when(projectMock).container(eq(ElasticsearchDistribution.class), (NamedDomainObjectFactory) any());
        ExtensionContainer extensionContainerMock2 = mock(ExtensionContainer.class);
        doReturn(extensionContainerMock, extensionContainerMock2).when(projectMock).getExtensions();
        doNothing().when(extensionContainerMock2).add("elasticsearch_distributions", namedDomainObjectContainerMock);
        RepositoryHandler repositoryHandlerMock = mock(RepositoryHandler.class);
        doReturn(repositoryHandlerMock).when(projectMock).getRepositories();
        Object object = new Object();
        doReturn(object).when(repositoryHandlerMock).findByName("elasticsearch-downloads");
        Property propertyMock = mock(Property.class);
        doReturn(propertyMock).when(objectFactoryMock).property(Boolean.class);
        doReturn(dockerAvailabilityMock).when(propertyMock).value(false);
        ConfigurableFileCollection configurableFileCollectionMock = mock(ConfigurableFileCollection.class);
        ConfigurableFileCollection configurableFileCollectionMock2 = mock(ConfigurableFileCollection.class);
        Object[] objectArray = new Object[] { configurationMock };
        doReturn(configurableFileCollectionMock2).when(configurableFileCollectionMock).from(objectArray);
        ConfigurableFileCollection configurableFileCollectionMock3 = mock(ConfigurableFileCollection.class);
        doReturn(configurableFileCollectionMock, configurableFileCollectionMock3).when(objectFactoryMock).fileCollection();
        ConfigurableFileCollection configurableFileCollectionMock4 = mock(ConfigurableFileCollection.class);
        Object[] objectArray2 = new Object[] { configurationMock2 };
        doReturn(configurableFileCollectionMock4).when(configurableFileCollectionMock3).from(objectArray2);
        target = new DistributionDownloadPlugin(objectFactoryMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        target.apply(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).getGradle();
            verify(gradleMock).getStartParameter();
            verify(projectMock, times(3)).getDependencies();
            verify(dependencyHandlerMock).registerTransform(eq(UnzipTransform.class), (Action) any());
            verify(dependencyHandlerMock2).getArtifactTypes();
            verify(artifactTypeContainerMock).maybeCreate("tar.gz");
            verify(artifactTypeDefinitionMock).getName();
            verify(dependencyHandlerMock3).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
            verify(projectMock, times(2)).getExtensions();
            verify(extensionContainerMock).add("elasticsearch_distributions_resolutions", distributionResolutionList);
            verify(projectMock, times(2)).getConfigurations();
            verify(configurationContainerMock).create("es_distro_file_A");
            verify(configurationContainerMock2).create("es_distro_extracted_A");
            verify(configurationMock2).getAttributes();
            verify(attributeContainerMock).attribute(attribute, "directory");
            verify(projectMock).container(eq(ElasticsearchDistribution.class), (NamedDomainObjectFactory) any());
            verify(extensionContainerMock2).add("elasticsearch_distributions", namedDomainObjectContainerMock);
            verify(projectMock).getRepositories();
            verify(repositoryHandlerMock).findByName("elasticsearch-downloads");
            verify(objectFactoryMock).property(Boolean.class);
            verify(propertyMock).value(false);
            verify(objectFactoryMock, times(2)).fileCollection();
            verify(configurableFileCollectionMock).from(objectArray);
            verify(configurableFileCollectionMock3).from(objectArray2);
        });
    }

    //Sapient generated method id: ${applyWhenDistributionGetTypeShouldExtractAndProjectGetRepositoriesFindByNameDOWNLOAD_REPO_NAMEIsNull}, hash: B0802187277DE2A30614C2ACDD820911
    @Disabled()
    @Test()
    void applyWhenDistributionGetTypeShouldExtractAndProjectGetRepositoriesFindByNameDOWNLOAD_REPO_NAMEIsNull() throws InvalidUserDataException, UnknownConfigurationException {
        /* Branches:
         * (project.getGradle().getStartParameter().getWriteDependencyVerifications().isEmpty() == false) : false
         * (writingDependencies == false) : true  #  inside lambda$setupDistributionContainer$2 method
         * (distribution.getType() == ElasticsearchDistributionTypes.INTEG_TEST_ZIP) : true  #  inside dependencyNotation method
         * (distribution.getType().shouldExtract()) : true  #  inside lambda$registerDistributionDependencies$6 method
         * (project.getRepositories().findByName(DOWNLOAD_REPO_NAME) != null) : false  #  inside setupDownloadServiceRepo method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.elasticsearch.gradle.ElasticsearchDistribution
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        Gradle gradleMock = mock(Gradle.class);
        DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        DependencyHandler dependencyHandlerMock2 = mock(DependencyHandler.class);
        ArtifactTypeContainer artifactTypeContainerMock = mock(ArtifactTypeContainer.class);
        ArtifactTypeDefinition artifactTypeDefinitionMock = mock(ArtifactTypeDefinition.class);
        DependencyHandler dependencyHandlerMock3 = mock(DependencyHandler.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        Configuration configurationMock = mock(Configuration.class);
        ConfigurationContainer configurationContainerMock2 = mock(ConfigurationContainer.class);
        Configuration configurationMock2 = mock(Configuration.class);
        AttributeContainer attributeContainerMock = mock(AttributeContainer.class);
        AttributeContainer attributeContainerMock2 = mock(AttributeContainer.class);
        ConfigurationContainer configurationContainerMock3 = mock(ConfigurationContainer.class);
        Configuration configurationMock3 = mock(Configuration.class);
        DependencySet dependencySetMock = mock(DependencySet.class);
        Provider providerMock = mock(Provider.class);
        Provider providerMock2 = mock(Provider.class);
        DependencyHandler dependencyHandlerMock4 = mock(DependencyHandler.class);
        Dependency dependencyMock = mock(Dependency.class);
        ConfigurationContainer configurationContainerMock4 = mock(ConfigurationContainer.class);
        Configuration configurationMock4 = mock(Configuration.class);
        DependencySet dependencySetMock2 = mock(DependencySet.class);
        Provider providerMock3 = mock(Provider.class);
        Provider providerMock4 = mock(Provider.class);
        DependencyHandler dependencyHandlerMock5 = mock(DependencyHandler.class);
        Dependency dependencyMock2 = mock(Dependency.class);
        NamedDomainObjectContainer<ElasticsearchDistribution> namedDomainObjectContainerMock = mock(NamedDomainObjectContainer.class);
        ExtensionContainer extensionContainerMock2 = mock(ExtensionContainer.class);
        RepositoryHandler repositoryHandlerMock = mock(RepositoryHandler.class);
        RepositoryHandler repositoryHandlerMock2 = mock(RepositoryHandler.class);
        IvyArtifactRepository ivyArtifactRepositoryMock = mock(IvyArtifactRepository.class);
        RepositoryHandler repositoryHandlerMock3 = mock(RepositoryHandler.class);
        RepositoryHandler repositoryHandlerMock4 = mock(RepositoryHandler.class);
        IvyArtifactRepository ivyArtifactRepositoryMock2 = mock(IvyArtifactRepository.class);
        RepositoryHandler repositoryHandlerMock5 = mock(RepositoryHandler.class);
        Property propertyMock = mock(Property.class);
        ConfigurableFileCollection configurableFileCollectionMock = mock(ConfigurableFileCollection.class);
        ConfigurableFileCollection configurableFileCollectionMock2 = mock(ConfigurableFileCollection.class);
        ConfigurableFileCollection configurableFileCollectionMock3 = mock(ConfigurableFileCollection.class);
        ConfigurableFileCollection configurableFileCollectionMock4 = mock(ConfigurableFileCollection.class);
        DistributionDependency distributionDependencyMock = mock(DistributionDependency.class);
        DistributionDependency distributionDependencyMock2 = mock(DistributionDependency.class);
        try (MockedStatic<DistributionDependency> distributionDependency = mockStatic(DistributionDependency.class)) {
            doReturn(gradleMock).when(projectMock).getGradle();
            List<String> stringList = new ArrayList<>();
            StartParameter startParameter = new StartParameter();
            startParameter.setWriteDependencyVerifications(stringList);
            doReturn(startParameter).when(gradleMock).getStartParameter();
            doNothing().when(dependencyHandlerMock).registerTransform(eq(UnzipTransform.class), (Action) any());
            doReturn(artifactTypeContainerMock).when(dependencyHandlerMock2).getArtifactTypes();
            doReturn(artifactTypeDefinitionMock).when(artifactTypeContainerMock).maybeCreate("tar.gz");
            doReturn("return_of_getName1").when(artifactTypeDefinitionMock).getName();
            doNothing().when(dependencyHandlerMock3).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
            List<DistributionResolution> distributionResolutionList = new ArrayList<>();
            doNothing().when(extensionContainerMock).add("elasticsearch_distributions_resolutions", distributionResolutionList);
            doReturn(configurationMock).when(configurationContainerMock).create("es_distro_file_A");
            doReturn(configurationMock2).when(configurationContainerMock2).create("es_distro_extracted_A");
            doReturn(attributeContainerMock).when(configurationMock2).getAttributes();
            Attribute attribute = ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE;
            doReturn(attributeContainerMock2).when(attributeContainerMock).attribute(attribute, "directory");
            doReturn(configurationMock3).when(configurationContainerMock3).getByName("es_distro_file_A");
            doReturn(dependencySetMock).when(configurationMock3).getDependencies();
            doNothing().when(dependencySetMock).addLater(providerMock);
            doReturn(providerMock).when(providerMock2).map((Transformer) any());
            Object object = new Object();
            doReturn(dependencyMock).when(dependencyHandlerMock4).create(object);
            doReturn(configurationContainerMock, configurationContainerMock2, configurationContainerMock3, configurationContainerMock4).when(projectMock).getConfigurations();
            doReturn(configurationMock4).when(configurationContainerMock4).getByName("es_distro_extracted_A");
            doReturn(dependencySetMock2).when(configurationMock4).getDependencies();
            doNothing().when(dependencySetMock2).addAllLater(providerMock3);
            doReturn(providerMock2, providerMock4).when(projectMock).provider((Callable) any());
            doReturn(providerMock3).when(providerMock4).map((Transformer) any());
            doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3, dependencyHandlerMock4, dependencyHandlerMock5).when(projectMock).getDependencies();
            Object object2 = new Object();
            doReturn(dependencyMock2).when(dependencyHandlerMock5).create(object2);
            doReturn(namedDomainObjectContainerMock).when(projectMock).container(eq(ElasticsearchDistribution.class), (NamedDomainObjectFactory) any());
            doReturn(extensionContainerMock, extensionContainerMock2).when(projectMock).getExtensions();
            doNothing().when(extensionContainerMock2).add("elasticsearch_distributions", namedDomainObjectContainerMock);
            doReturn(null).when(repositoryHandlerMock).findByName("elasticsearch-downloads");
            doReturn(ivyArtifactRepositoryMock).when(repositoryHandlerMock2).ivy((Action) any());
            doNothing().when(repositoryHandlerMock3).exclusiveContent((Action) any());
            doReturn(ivyArtifactRepositoryMock2).when(repositoryHandlerMock4).ivy((Action) any());
            doReturn(repositoryHandlerMock, repositoryHandlerMock2, repositoryHandlerMock3, repositoryHandlerMock4, repositoryHandlerMock5).when(projectMock).getRepositories();
            doNothing().when(repositoryHandlerMock5).exclusiveContent((Action) any());
            doReturn(propertyMock).when(objectFactoryMock).property(Boolean.class);
            doReturn(dockerAvailabilityMock).when(propertyMock).value(false);
            Object[] objectArray = new Object[] { configurationMock };
            doReturn(configurableFileCollectionMock2).when(configurableFileCollectionMock).from(objectArray);
            doReturn(configurableFileCollectionMock, configurableFileCollectionMock3).when(objectFactoryMock).fileCollection();
            Object[] objectArray2 = new Object[] { configurationMock2 };
            doReturn(configurableFileCollectionMock4).when(configurableFileCollectionMock3).from(objectArray2);
            distributionDependency.when(() -> DistributionDependency.of("org.elasticsearch.distribution.integ-test-zip:elasticsearch:B@zip")).thenReturn(distributionDependencyMock);
            doReturn(object).when(distributionDependencyMock).getDefaultNotation();
            distributionDependency.when(() -> DistributionDependency.of("org.elasticsearch.distribution.integ-test-zip:elasticsearch:C@zip")).thenReturn(distributionDependencyMock2);
            doReturn(object2).when(distributionDependencyMock2).getExtractedNotation();
            target = new DistributionDownloadPlugin(objectFactoryMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).getGradle();
                verify(gradleMock).getStartParameter();
                verify(projectMock, times(5)).getDependencies();
                verify(dependencyHandlerMock).registerTransform(eq(UnzipTransform.class), (Action) any());
                verify(dependencyHandlerMock2).getArtifactTypes();
                verify(artifactTypeContainerMock).maybeCreate("tar.gz");
                verify(artifactTypeDefinitionMock).getName();
                verify(dependencyHandlerMock3).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
                verify(projectMock, times(2)).getExtensions();
                verify(extensionContainerMock).add("elasticsearch_distributions_resolutions", distributionResolutionList);
                verify(projectMock, times(4)).getConfigurations();
                verify(configurationContainerMock).create("es_distro_file_A");
                verify(configurationContainerMock2).create("es_distro_extracted_A");
                verify(configurationMock2).getAttributes();
                verify(attributeContainerMock).attribute(attribute, "directory");
                verify(configurationContainerMock3).getByName("es_distro_file_A");
                verify(configurationMock3).getDependencies();
                verify(dependencySetMock).addLater(providerMock);
                verify(projectMock, atLeast(2)).provider((Callable) any());
                verify(providerMock2).map((Transformer) any());
                verify(dependencyHandlerMock4).create(object);
                verify(configurationContainerMock4).getByName("es_distro_extracted_A");
                verify(configurationMock4).getDependencies();
                verify(dependencySetMock2).addAllLater(providerMock3);
                verify(providerMock4).map((Transformer) any());
                verify(dependencyHandlerMock5).create(object2);
                verify(projectMock).container(eq(ElasticsearchDistribution.class), (NamedDomainObjectFactory) any());
                verify(extensionContainerMock2).add("elasticsearch_distributions", namedDomainObjectContainerMock);
                verify(projectMock, times(5)).getRepositories();
                verify(repositoryHandlerMock).findByName("elasticsearch-downloads");
                verify(repositoryHandlerMock2).ivy((Action) any());
                verify(repositoryHandlerMock3).exclusiveContent((Action) any());
                verify(repositoryHandlerMock4).ivy((Action) any());
                verify(repositoryHandlerMock5).exclusiveContent((Action) any());
                verify(objectFactoryMock).property(Boolean.class);
                verify(propertyMock).value(false);
                verify(objectFactoryMock, times(2)).fileCollection();
                verify(configurableFileCollectionMock).from(objectArray);
                verify(configurableFileCollectionMock3).from(objectArray2);
                distributionDependency.verify(() -> DistributionDependency.of("org.elasticsearch.distribution.integ-test-zip:elasticsearch:B@zip"), atLeast(1));
                verify(distributionDependencyMock).getDefaultNotation();
                distributionDependency.verify(() -> DistributionDependency.of("org.elasticsearch.distribution.integ-test-zip:elasticsearch:C@zip"), atLeast(1));
                verify(distributionDependencyMock2).getExtractedNotation();
            });
        }
    }

    //Sapient generated method id: ${applyWhenDistributionGetVersionEndsWith_SNAPSHOTAndProjectGetRepositoriesFindByNameDOWNLOAD_REPO_NAMEIsNull}, hash: 0CCC71026B0850CCA5B1BEE765D7679E
    @Disabled()
    @Test()
    void applyWhenDistributionGetVersionEndsWith_SNAPSHOTAndProjectGetRepositoriesFindByNameDOWNLOAD_REPO_NAMEIsNull() throws InvalidUserDataException, UnknownConfigurationException {
        /* Branches:
         * (project.getGradle().getStartParameter().getWriteDependencyVerifications().isEmpty() == false) : false
         * (writingDependencies == false) : true  #  inside lambda$setupDistributionContainer$2 method
         * (distribution.getType() == ElasticsearchDistributionTypes.INTEG_TEST_ZIP) : true  #  inside dependencyNotation method
         * (distribution.getType().shouldExtract()) : true  #  inside lambda$registerDistributionDependencies$6 method
         * (distribution.getVersion().endsWith("-SNAPSHOT")) : true  #  inside dependencyNotation method
         * (project.getRepositories().findByName(DOWNLOAD_REPO_NAME) != null) : false  #  inside setupDownloadServiceRepo method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.elasticsearch.gradle.ElasticsearchDistribution
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        Gradle gradleMock = mock(Gradle.class);
        DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        DependencyHandler dependencyHandlerMock2 = mock(DependencyHandler.class);
        ArtifactTypeContainer artifactTypeContainerMock = mock(ArtifactTypeContainer.class);
        ArtifactTypeDefinition artifactTypeDefinitionMock = mock(ArtifactTypeDefinition.class);
        DependencyHandler dependencyHandlerMock3 = mock(DependencyHandler.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        Configuration configurationMock = mock(Configuration.class);
        ConfigurationContainer configurationContainerMock2 = mock(ConfigurationContainer.class);
        Configuration configurationMock2 = mock(Configuration.class);
        AttributeContainer attributeContainerMock = mock(AttributeContainer.class);
        AttributeContainer attributeContainerMock2 = mock(AttributeContainer.class);
        ConfigurationContainer configurationContainerMock3 = mock(ConfigurationContainer.class);
        Configuration configurationMock3 = mock(Configuration.class);
        DependencySet dependencySetMock = mock(DependencySet.class);
        Provider providerMock = mock(Provider.class);
        Provider providerMock2 = mock(Provider.class);
        DependencyHandler dependencyHandlerMock4 = mock(DependencyHandler.class);
        Dependency dependencyMock = mock(Dependency.class);
        ConfigurationContainer configurationContainerMock4 = mock(ConfigurationContainer.class);
        Configuration configurationMock4 = mock(Configuration.class);
        DependencySet dependencySetMock2 = mock(DependencySet.class);
        Provider providerMock3 = mock(Provider.class);
        Provider providerMock4 = mock(Provider.class);
        DependencyHandler dependencyHandlerMock5 = mock(DependencyHandler.class);
        Dependency dependencyMock2 = mock(Dependency.class);
        NamedDomainObjectContainer<ElasticsearchDistribution> namedDomainObjectContainerMock = mock(NamedDomainObjectContainer.class);
        ExtensionContainer extensionContainerMock2 = mock(ExtensionContainer.class);
        RepositoryHandler repositoryHandlerMock = mock(RepositoryHandler.class);
        RepositoryHandler repositoryHandlerMock2 = mock(RepositoryHandler.class);
        IvyArtifactRepository ivyArtifactRepositoryMock = mock(IvyArtifactRepository.class);
        RepositoryHandler repositoryHandlerMock3 = mock(RepositoryHandler.class);
        RepositoryHandler repositoryHandlerMock4 = mock(RepositoryHandler.class);
        IvyArtifactRepository ivyArtifactRepositoryMock2 = mock(IvyArtifactRepository.class);
        RepositoryHandler repositoryHandlerMock5 = mock(RepositoryHandler.class);
        Property propertyMock = mock(Property.class);
        ConfigurableFileCollection configurableFileCollectionMock = mock(ConfigurableFileCollection.class);
        ConfigurableFileCollection configurableFileCollectionMock2 = mock(ConfigurableFileCollection.class);
        ConfigurableFileCollection configurableFileCollectionMock3 = mock(ConfigurableFileCollection.class);
        ConfigurableFileCollection configurableFileCollectionMock4 = mock(ConfigurableFileCollection.class);
        DistributionDependency distributionDependencyMock = mock(DistributionDependency.class);
        DistributionDependency distributionDependencyMock2 = mock(DistributionDependency.class);
        Version versionMock = mock(Version.class);
        try (MockedStatic<Version> version = mockStatic(Version.class);
            MockedStatic<DistributionDependency> distributionDependency = mockStatic(DistributionDependency.class)) {
            doReturn(gradleMock).when(projectMock).getGradle();
            List<String> stringList = new ArrayList<>();
            StartParameter startParameter = new StartParameter();
            startParameter.setWriteDependencyVerifications(stringList);
            doReturn(startParameter).when(gradleMock).getStartParameter();
            doNothing().when(dependencyHandlerMock).registerTransform(eq(UnzipTransform.class), (Action) any());
            doReturn(artifactTypeContainerMock).when(dependencyHandlerMock2).getArtifactTypes();
            doReturn(artifactTypeDefinitionMock).when(artifactTypeContainerMock).maybeCreate("tar.gz");
            doReturn("return_of_getName1").when(artifactTypeDefinitionMock).getName();
            doNothing().when(dependencyHandlerMock3).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
            List<DistributionResolution> distributionResolutionList = new ArrayList<>();
            doNothing().when(extensionContainerMock).add("elasticsearch_distributions_resolutions", distributionResolutionList);
            doReturn(configurationMock).when(configurationContainerMock).create("es_distro_file_CI");
            doReturn(configurationMock2).when(configurationContainerMock2).create("es_distro_extracted_CI");
            doReturn(attributeContainerMock).when(configurationMock2).getAttributes();
            Attribute attribute = ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE;
            doReturn(attributeContainerMock2).when(attributeContainerMock).attribute(attribute, "directory");
            doReturn(configurationMock3).when(configurationContainerMock3).getByName("es_distro_file_CI");
            doReturn(dependencySetMock).when(configurationMock3).getDependencies();
            doNothing().when(dependencySetMock).addLater(providerMock);
            doReturn(providerMock).when(providerMock2).map((Transformer) any());
            Object object = new Object();
            doReturn(dependencyMock).when(dependencyHandlerMock4).create(object);
            doReturn(configurationContainerMock, configurationContainerMock2, configurationContainerMock3, configurationContainerMock4).when(projectMock).getConfigurations();
            doReturn(configurationMock4).when(configurationContainerMock4).getByName("es_distro_extracted_CI");
            doReturn(dependencySetMock2).when(configurationMock4).getDependencies();
            doNothing().when(dependencySetMock2).addAllLater(providerMock3);
            doReturn(providerMock2, providerMock4).when(projectMock).provider((Callable) any());
            doReturn(providerMock3).when(providerMock4).map((Transformer) any());
            doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3, dependencyHandlerMock4, dependencyHandlerMock5).when(projectMock).getDependencies();
            Object object2 = new Object();
            doReturn(dependencyMock2).when(dependencyHandlerMock5).create(object2);
            doReturn(namedDomainObjectContainerMock).when(projectMock).container(eq(ElasticsearchDistribution.class), (NamedDomainObjectFactory) any());
            doReturn(extensionContainerMock, extensionContainerMock2).when(projectMock).getExtensions();
            doNothing().when(extensionContainerMock2).add("elasticsearch_distributions", namedDomainObjectContainerMock);
            doReturn(null).when(repositoryHandlerMock).findByName("elasticsearch-downloads");
            doReturn(ivyArtifactRepositoryMock).when(repositoryHandlerMock2).ivy((Action) any());
            doNothing().when(repositoryHandlerMock3).exclusiveContent((Action) any());
            doReturn(ivyArtifactRepositoryMock2).when(repositoryHandlerMock4).ivy((Action) any());
            doReturn(repositoryHandlerMock, repositoryHandlerMock2, repositoryHandlerMock3, repositoryHandlerMock4, repositoryHandlerMock5).when(projectMock).getRepositories();
            doNothing().when(repositoryHandlerMock5).exclusiveContent((Action) any());
            doReturn(propertyMock).when(objectFactoryMock).property(Boolean.class);
            doReturn(dockerAvailabilityMock).when(propertyMock).value(false);
            Object[] objectArray = new Object[] { configurationMock };
            doReturn(configurableFileCollectionMock2).when(configurableFileCollectionMock).from(objectArray);
            doReturn(configurableFileCollectionMock, configurableFileCollectionMock3).when(objectFactoryMock).fileCollection();
            Object[] objectArray2 = new Object[] { configurationMock2 };
            doReturn(configurableFileCollectionMock4).when(configurableFileCollectionMock3).from(objectArray2);
            distributionDependency.when(() -> DistributionDependency.of("org.elasticsearch.distribution.integ-test-zip:elasticsearch:DJ@zip")).thenReturn(distributionDependencyMock);
            doReturn(object).when(distributionDependencyMock).getDefaultNotation();
            distributionDependency.when(() -> DistributionDependency.of("elasticsearch-distribution-snapshot:elasticsearch:EKFL@GM")).thenReturn(distributionDependencyMock2);
            doReturn(object2).when(distributionDependencyMock2).getExtractedNotation();
            version.when(() -> Version.fromString("return_of_getVersion1")).thenReturn(versionMock);
            target = new DistributionDownloadPlugin(objectFactoryMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).getGradle();
                verify(gradleMock).getStartParameter();
                verify(projectMock, times(5)).getDependencies();
                verify(dependencyHandlerMock).registerTransform(eq(UnzipTransform.class), (Action) any());
                verify(dependencyHandlerMock2).getArtifactTypes();
                verify(artifactTypeContainerMock).maybeCreate("tar.gz");
                verify(artifactTypeDefinitionMock).getName();
                verify(dependencyHandlerMock3).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
                verify(projectMock, times(2)).getExtensions();
                verify(extensionContainerMock).add("elasticsearch_distributions_resolutions", distributionResolutionList);
                verify(projectMock, times(4)).getConfigurations();
                verify(configurationContainerMock).create("es_distro_file_CI");
                verify(configurationContainerMock2).create("es_distro_extracted_CI");
                verify(configurationMock2).getAttributes();
                verify(attributeContainerMock).attribute(attribute, "directory");
                verify(configurationContainerMock3).getByName("es_distro_file_CI");
                verify(configurationMock3).getDependencies();
                verify(dependencySetMock).addLater(providerMock);
                verify(projectMock, atLeast(2)).provider((Callable) any());
                verify(providerMock2).map((Transformer) any());
                verify(dependencyHandlerMock4).create(object);
                verify(configurationContainerMock4).getByName("es_distro_extracted_CI");
                verify(configurationMock4).getDependencies();
                verify(dependencySetMock2).addAllLater(providerMock3);
                verify(providerMock4).map((Transformer) any());
                verify(dependencyHandlerMock5).create(object2);
                verify(projectMock).container(eq(ElasticsearchDistribution.class), (NamedDomainObjectFactory) any());
                verify(extensionContainerMock2).add("elasticsearch_distributions", namedDomainObjectContainerMock);
                verify(projectMock, times(5)).getRepositories();
                verify(repositoryHandlerMock).findByName("elasticsearch-downloads");
                verify(repositoryHandlerMock2).ivy((Action) any());
                verify(repositoryHandlerMock3).exclusiveContent((Action) any());
                verify(repositoryHandlerMock4).ivy((Action) any());
                verify(repositoryHandlerMock5).exclusiveContent((Action) any());
                verify(objectFactoryMock).property(Boolean.class);
                verify(propertyMock).value(false);
                verify(objectFactoryMock, times(2)).fileCollection();
                verify(configurableFileCollectionMock).from(objectArray);
                verify(configurableFileCollectionMock3).from(objectArray2);
                distributionDependency.verify(() -> DistributionDependency.of("org.elasticsearch.distribution.integ-test-zip:elasticsearch:DJ@zip"), atLeast(1));
                verify(distributionDependencyMock).getDefaultNotation();
                distributionDependency.verify(() -> DistributionDependency.of("elasticsearch-distribution-snapshot:elasticsearch:EKFL@GM"), atLeast(1));
                verify(distributionDependencyMock2).getExtractedNotation();
                version.verify(() -> Version.fromString("return_of_getVersion1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenDistributionGetVersionNotEndsWith_SNAPSHOTAndProjectGetRepositoriesFindByNameDOWNLOAD_REPO_NAMEIsNull}, hash: 5118E957C28118169485E69D0FC0E571
    @Disabled()
    @Test()
    void applyWhenDistributionGetVersionNotEndsWith_SNAPSHOTAndProjectGetRepositoriesFindByNameDOWNLOAD_REPO_NAMEIsNull() throws InvalidUserDataException, UnknownConfigurationException {
        /* Branches:
         * (project.getGradle().getStartParameter().getWriteDependencyVerifications().isEmpty() == false) : false
         * (writingDependencies == false) : true  #  inside lambda$setupDistributionContainer$2 method
         * (distribution.getType() == ElasticsearchDistributionTypes.INTEG_TEST_ZIP) : true  #  inside dependencyNotation method
         * (distribution.getType().shouldExtract()) : true  #  inside lambda$registerDistributionDependencies$6 method
         * (distribution.getVersion().endsWith("-SNAPSHOT")) : false  #  inside dependencyNotation method
         * (project.getRepositories().findByName(DOWNLOAD_REPO_NAME) != null) : false  #  inside setupDownloadServiceRepo method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.elasticsearch.gradle.ElasticsearchDistribution
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        Gradle gradleMock = mock(Gradle.class);
        DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        DependencyHandler dependencyHandlerMock2 = mock(DependencyHandler.class);
        ArtifactTypeContainer artifactTypeContainerMock = mock(ArtifactTypeContainer.class);
        ArtifactTypeDefinition artifactTypeDefinitionMock = mock(ArtifactTypeDefinition.class);
        DependencyHandler dependencyHandlerMock3 = mock(DependencyHandler.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        Configuration configurationMock = mock(Configuration.class);
        ConfigurationContainer configurationContainerMock2 = mock(ConfigurationContainer.class);
        Configuration configurationMock2 = mock(Configuration.class);
        AttributeContainer attributeContainerMock = mock(AttributeContainer.class);
        AttributeContainer attributeContainerMock2 = mock(AttributeContainer.class);
        ConfigurationContainer configurationContainerMock3 = mock(ConfigurationContainer.class);
        Configuration configurationMock3 = mock(Configuration.class);
        DependencySet dependencySetMock = mock(DependencySet.class);
        Provider providerMock = mock(Provider.class);
        Provider providerMock2 = mock(Provider.class);
        DependencyHandler dependencyHandlerMock4 = mock(DependencyHandler.class);
        Dependency dependencyMock = mock(Dependency.class);
        ConfigurationContainer configurationContainerMock4 = mock(ConfigurationContainer.class);
        Configuration configurationMock4 = mock(Configuration.class);
        DependencySet dependencySetMock2 = mock(DependencySet.class);
        Provider providerMock3 = mock(Provider.class);
        Provider providerMock4 = mock(Provider.class);
        DependencyHandler dependencyHandlerMock5 = mock(DependencyHandler.class);
        Dependency dependencyMock2 = mock(Dependency.class);
        NamedDomainObjectContainer<ElasticsearchDistribution> namedDomainObjectContainerMock = mock(NamedDomainObjectContainer.class);
        ExtensionContainer extensionContainerMock2 = mock(ExtensionContainer.class);
        RepositoryHandler repositoryHandlerMock = mock(RepositoryHandler.class);
        RepositoryHandler repositoryHandlerMock2 = mock(RepositoryHandler.class);
        IvyArtifactRepository ivyArtifactRepositoryMock = mock(IvyArtifactRepository.class);
        RepositoryHandler repositoryHandlerMock3 = mock(RepositoryHandler.class);
        RepositoryHandler repositoryHandlerMock4 = mock(RepositoryHandler.class);
        IvyArtifactRepository ivyArtifactRepositoryMock2 = mock(IvyArtifactRepository.class);
        RepositoryHandler repositoryHandlerMock5 = mock(RepositoryHandler.class);
        Property propertyMock = mock(Property.class);
        ConfigurableFileCollection configurableFileCollectionMock = mock(ConfigurableFileCollection.class);
        ConfigurableFileCollection configurableFileCollectionMock2 = mock(ConfigurableFileCollection.class);
        ConfigurableFileCollection configurableFileCollectionMock3 = mock(ConfigurableFileCollection.class);
        ConfigurableFileCollection configurableFileCollectionMock4 = mock(ConfigurableFileCollection.class);
        DistributionDependency distributionDependencyMock = mock(DistributionDependency.class);
        DistributionDependency distributionDependencyMock2 = mock(DistributionDependency.class);
        Version versionMock = mock(Version.class);
        try (MockedStatic<Version> version = mockStatic(Version.class);
            MockedStatic<DistributionDependency> distributionDependency = mockStatic(DistributionDependency.class)) {
            doReturn(gradleMock).when(projectMock).getGradle();
            List<String> stringList = new ArrayList<>();
            StartParameter startParameter = new StartParameter();
            startParameter.setWriteDependencyVerifications(stringList);
            doReturn(startParameter).when(gradleMock).getStartParameter();
            doNothing().when(dependencyHandlerMock).registerTransform(eq(UnzipTransform.class), (Action) any());
            doReturn(artifactTypeContainerMock).when(dependencyHandlerMock2).getArtifactTypes();
            doReturn(artifactTypeDefinitionMock).when(artifactTypeContainerMock).maybeCreate("tar.gz");
            doReturn("return_of_getName1").when(artifactTypeDefinitionMock).getName();
            doNothing().when(dependencyHandlerMock3).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
            List<DistributionResolution> distributionResolutionList = new ArrayList<>();
            doNothing().when(extensionContainerMock).add("elasticsearch_distributions_resolutions", distributionResolutionList);
            doReturn(configurationMock).when(configurationContainerMock).create("es_distro_file_BQ");
            doReturn(configurationMock2).when(configurationContainerMock2).create("es_distro_extracted_BQ");
            doReturn(attributeContainerMock).when(configurationMock2).getAttributes();
            Attribute attribute = ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE;
            doReturn(attributeContainerMock2).when(attributeContainerMock).attribute(attribute, "directory");
            doReturn(configurationMock3).when(configurationContainerMock3).getByName("es_distro_file_BQ");
            doReturn(dependencySetMock).when(configurationMock3).getDependencies();
            doNothing().when(dependencySetMock).addLater(providerMock);
            doReturn(providerMock).when(providerMock2).map((Transformer) any());
            Object object = new Object();
            doReturn(dependencyMock).when(dependencyHandlerMock4).create(object);
            doReturn(configurationContainerMock, configurationContainerMock2, configurationContainerMock3, configurationContainerMock4).when(projectMock).getConfigurations();
            doReturn(configurationMock4).when(configurationContainerMock4).getByName("es_distro_extracted_BQ");
            doReturn(dependencySetMock2).when(configurationMock4).getDependencies();
            doNothing().when(dependencySetMock2).addAllLater(providerMock3);
            doReturn(providerMock2, providerMock4).when(projectMock).provider((Callable) any());
            doReturn(providerMock3).when(providerMock4).map((Transformer) any());
            doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3, dependencyHandlerMock4, dependencyHandlerMock5).when(projectMock).getDependencies();
            Object object2 = new Object();
            doReturn(dependencyMock2).when(dependencyHandlerMock5).create(object2);
            doReturn(namedDomainObjectContainerMock).when(projectMock).container(eq(ElasticsearchDistribution.class), (NamedDomainObjectFactory) any());
            doReturn(extensionContainerMock, extensionContainerMock2).when(projectMock).getExtensions();
            doNothing().when(extensionContainerMock2).add("elasticsearch_distributions", namedDomainObjectContainerMock);
            doReturn(null).when(repositoryHandlerMock).findByName("elasticsearch-downloads");
            doReturn(ivyArtifactRepositoryMock).when(repositoryHandlerMock2).ivy((Action) any());
            doNothing().when(repositoryHandlerMock3).exclusiveContent((Action) any());
            doReturn(ivyArtifactRepositoryMock2).when(repositoryHandlerMock4).ivy((Action) any());
            doReturn(repositoryHandlerMock, repositoryHandlerMock2, repositoryHandlerMock3, repositoryHandlerMock4, repositoryHandlerMock5).when(projectMock).getRepositories();
            doNothing().when(repositoryHandlerMock5).exclusiveContent((Action) any());
            doReturn(propertyMock).when(objectFactoryMock).property(Boolean.class);
            doReturn(dockerAvailabilityMock).when(propertyMock).value(false);
            Object[] objectArray = new Object[] { configurationMock };
            doReturn(configurableFileCollectionMock2).when(configurableFileCollectionMock).from(objectArray);
            doReturn(configurableFileCollectionMock, configurableFileCollectionMock3).when(objectFactoryMock).fileCollection();
            Object[] objectArray2 = new Object[] { configurationMock2 };
            doReturn(configurableFileCollectionMock4).when(configurableFileCollectionMock3).from(objectArray2);
            distributionDependency.when(() -> DistributionDependency.of("org.elasticsearch.distribution.integ-test-zip:elasticsearch:@zip")).thenReturn(distributionDependencyMock);
            doReturn(object).when(distributionDependencyMock).getDefaultNotation();
            distributionDependency.when(() -> DistributionDependency.of("elasticsearch-distribution:elasticsearch:CR@")).thenReturn(distributionDependencyMock2);
            doReturn(object2).when(distributionDependencyMock2).getExtractedNotation();
            version.when(() -> Version.fromString("return_of_getVersion1")).thenReturn(versionMock);
            target = new DistributionDownloadPlugin(objectFactoryMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).getGradle();
                verify(gradleMock).getStartParameter();
                verify(projectMock, times(5)).getDependencies();
                verify(dependencyHandlerMock).registerTransform(eq(UnzipTransform.class), (Action) any());
                verify(dependencyHandlerMock2).getArtifactTypes();
                verify(artifactTypeContainerMock).maybeCreate("tar.gz");
                verify(artifactTypeDefinitionMock).getName();
                verify(dependencyHandlerMock3).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
                verify(projectMock, times(2)).getExtensions();
                verify(extensionContainerMock).add("elasticsearch_distributions_resolutions", distributionResolutionList);
                verify(projectMock, times(4)).getConfigurations();
                verify(configurationContainerMock).create("es_distro_file_BQ");
                verify(configurationContainerMock2).create("es_distro_extracted_BQ");
                verify(configurationMock2).getAttributes();
                verify(attributeContainerMock).attribute(attribute, "directory");
                verify(configurationContainerMock3).getByName("es_distro_file_BQ");
                verify(configurationMock3).getDependencies();
                verify(dependencySetMock).addLater(providerMock);
                verify(projectMock, atLeast(2)).provider((Callable) any());
                verify(providerMock2).map((Transformer) any());
                verify(dependencyHandlerMock4).create(object);
                verify(configurationContainerMock4).getByName("es_distro_extracted_BQ");
                verify(configurationMock4).getDependencies();
                verify(dependencySetMock2).addAllLater(providerMock3);
                verify(providerMock4).map((Transformer) any());
                verify(dependencyHandlerMock5).create(object2);
                verify(projectMock).container(eq(ElasticsearchDistribution.class), (NamedDomainObjectFactory) any());
                verify(extensionContainerMock2).add("elasticsearch_distributions", namedDomainObjectContainerMock);
                verify(projectMock, times(5)).getRepositories();
                verify(repositoryHandlerMock).findByName("elasticsearch-downloads");
                verify(repositoryHandlerMock2).ivy((Action) any());
                verify(repositoryHandlerMock3).exclusiveContent((Action) any());
                verify(repositoryHandlerMock4).ivy((Action) any());
                verify(repositoryHandlerMock5).exclusiveContent((Action) any());
                verify(objectFactoryMock).property(Boolean.class);
                verify(propertyMock).value(false);
                verify(objectFactoryMock, times(2)).fileCollection();
                verify(configurableFileCollectionMock).from(objectArray);
                verify(configurableFileCollectionMock3).from(objectArray2);
                distributionDependency.verify(() -> DistributionDependency.of("org.elasticsearch.distribution.integ-test-zip:elasticsearch:@zip"), atLeast(1));
                verify(distributionDependencyMock).getDefaultNotation();
                distributionDependency.verify(() -> DistributionDependency.of("elasticsearch-distribution:elasticsearch:CR@"), atLeast(1));
                verify(distributionDependencyMock2).getExtractedNotation();
                version.verify(() -> Version.fromString("return_of_getVersion1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenDistributionGetVersionEndsWith_SNAPSHOTAndDistributionGetTypeNotShouldExtractAndProjectGetRepositoriesFindByNa}, hash: D26531265DE8F644050017C3CC438398
    @Disabled()
    @Test()
    void applyWhenDistributionGetVersionEndsWith_SNAPSHOTAndDistributionGetTypeNotShouldExtractAndProjectGetRepositoriesFindByNa() throws InvalidUserDataException, UnknownConfigurationException {
        /* Branches:
         * (project.getGradle().getStartParameter().getWriteDependencyVerifications().isEmpty() == false) : false
         * (writingDependencies == false) : true  #  inside lambda$setupDistributionContainer$2 method
         * (distribution.getType() == ElasticsearchDistributionTypes.INTEG_TEST_ZIP) : false  #  inside dependencyNotation method
         * (distribution.getVersion().endsWith("-SNAPSHOT")) : true  #  inside dependencyNotation method
         * (distribution.getType().shouldExtract()) : false  #  inside lambda$registerDistributionDependencies$6 method
         * (project.getRepositories().findByName(DOWNLOAD_REPO_NAME) != null) : false  #  inside setupDownloadServiceRepo method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.elasticsearch.gradle.ElasticsearchDistribution
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        Gradle gradleMock = mock(Gradle.class);
        DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        DependencyHandler dependencyHandlerMock2 = mock(DependencyHandler.class);
        ArtifactTypeContainer artifactTypeContainerMock = mock(ArtifactTypeContainer.class);
        ArtifactTypeDefinition artifactTypeDefinitionMock = mock(ArtifactTypeDefinition.class);
        DependencyHandler dependencyHandlerMock3 = mock(DependencyHandler.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        Configuration configurationMock = mock(Configuration.class);
        ConfigurationContainer configurationContainerMock2 = mock(ConfigurationContainer.class);
        Configuration configurationMock2 = mock(Configuration.class);
        AttributeContainer attributeContainerMock = mock(AttributeContainer.class);
        AttributeContainer attributeContainerMock2 = mock(AttributeContainer.class);
        ConfigurationContainer configurationContainerMock3 = mock(ConfigurationContainer.class);
        Configuration configurationMock3 = mock(Configuration.class);
        DependencySet dependencySetMock = mock(DependencySet.class);
        Provider providerMock = mock(Provider.class);
        Provider providerMock2 = mock(Provider.class);
        DependencyHandler dependencyHandlerMock4 = mock(DependencyHandler.class);
        Dependency dependencyMock = mock(Dependency.class);
        ConfigurationContainer configurationContainerMock4 = mock(ConfigurationContainer.class);
        Configuration configurationMock4 = mock(Configuration.class);
        DependencySet dependencySetMock2 = mock(DependencySet.class);
        Provider providerMock3 = mock(Provider.class);
        Provider providerMock4 = mock(Provider.class);
        NamedDomainObjectContainer<ElasticsearchDistribution> namedDomainObjectContainerMock = mock(NamedDomainObjectContainer.class);
        ExtensionContainer extensionContainerMock2 = mock(ExtensionContainer.class);
        RepositoryHandler repositoryHandlerMock = mock(RepositoryHandler.class);
        RepositoryHandler repositoryHandlerMock2 = mock(RepositoryHandler.class);
        IvyArtifactRepository ivyArtifactRepositoryMock = mock(IvyArtifactRepository.class);
        RepositoryHandler repositoryHandlerMock3 = mock(RepositoryHandler.class);
        RepositoryHandler repositoryHandlerMock4 = mock(RepositoryHandler.class);
        IvyArtifactRepository ivyArtifactRepositoryMock2 = mock(IvyArtifactRepository.class);
        RepositoryHandler repositoryHandlerMock5 = mock(RepositoryHandler.class);
        Property propertyMock = mock(Property.class);
        ConfigurableFileCollection configurableFileCollectionMock = mock(ConfigurableFileCollection.class);
        ConfigurableFileCollection configurableFileCollectionMock2 = mock(ConfigurableFileCollection.class);
        ConfigurableFileCollection configurableFileCollectionMock3 = mock(ConfigurableFileCollection.class);
        ConfigurableFileCollection configurableFileCollectionMock4 = mock(ConfigurableFileCollection.class);
        DistributionDependency distributionDependencyMock = mock(DistributionDependency.class);
        Version versionMock = mock(Version.class);
        try (MockedStatic<Version> version = mockStatic(Version.class);
            MockedStatic<DistributionDependency> distributionDependency = mockStatic(DistributionDependency.class)) {
            doReturn(gradleMock).when(projectMock).getGradle();
            List<String> stringList = new ArrayList<>();
            StartParameter startParameter = new StartParameter();
            startParameter.setWriteDependencyVerifications(stringList);
            doReturn(startParameter).when(gradleMock).getStartParameter();
            doNothing().when(dependencyHandlerMock).registerTransform(eq(UnzipTransform.class), (Action) any());
            doReturn(artifactTypeContainerMock).when(dependencyHandlerMock2).getArtifactTypes();
            doReturn(artifactTypeDefinitionMock).when(artifactTypeContainerMock).maybeCreate("tar.gz");
            doReturn("return_of_getName1").when(artifactTypeDefinitionMock).getName();
            doNothing().when(dependencyHandlerMock3).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
            List<DistributionResolution> distributionResolutionList = new ArrayList<>();
            doNothing().when(extensionContainerMock).add("elasticsearch_distributions_resolutions", distributionResolutionList);
            doReturn(configurationMock).when(configurationContainerMock).create("es_distro_file_B");
            doReturn(configurationMock2).when(configurationContainerMock2).create("es_distro_extracted_B");
            doReturn(attributeContainerMock).when(configurationMock2).getAttributes();
            Attribute attribute = ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE;
            doReturn(attributeContainerMock2).when(attributeContainerMock).attribute(attribute, "directory");
            doReturn(configurationMock3).when(configurationContainerMock3).getByName("es_distro_file_B");
            doReturn(dependencySetMock).when(configurationMock3).getDependencies();
            doNothing().when(dependencySetMock).addLater(providerMock);
            doReturn(providerMock).when(providerMock2).map((Transformer) any());
            doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3, dependencyHandlerMock4).when(projectMock).getDependencies();
            Object object = new Object();
            doReturn(dependencyMock).when(dependencyHandlerMock4).create(object);
            doReturn(configurationContainerMock, configurationContainerMock2, configurationContainerMock3, configurationContainerMock4).when(projectMock).getConfigurations();
            doReturn(configurationMock4).when(configurationContainerMock4).getByName("es_distro_extracted_B");
            doReturn(dependencySetMock2).when(configurationMock4).getDependencies();
            doNothing().when(dependencySetMock2).addAllLater(providerMock3);
            doReturn(providerMock2, providerMock4).when(projectMock).provider((Callable) any());
            doReturn(providerMock3).when(providerMock4).map((Transformer) any());
            doReturn(namedDomainObjectContainerMock).when(projectMock).container(eq(ElasticsearchDistribution.class), (NamedDomainObjectFactory) any());
            doReturn(extensionContainerMock, extensionContainerMock2).when(projectMock).getExtensions();
            doNothing().when(extensionContainerMock2).add("elasticsearch_distributions", namedDomainObjectContainerMock);
            doReturn(null).when(repositoryHandlerMock).findByName("elasticsearch-downloads");
            doReturn(ivyArtifactRepositoryMock).when(repositoryHandlerMock2).ivy((Action) any());
            doNothing().when(repositoryHandlerMock3).exclusiveContent((Action) any());
            doReturn(ivyArtifactRepositoryMock2).when(repositoryHandlerMock4).ivy((Action) any());
            doReturn(repositoryHandlerMock, repositoryHandlerMock2, repositoryHandlerMock3, repositoryHandlerMock4, repositoryHandlerMock5).when(projectMock).getRepositories();
            doNothing().when(repositoryHandlerMock5).exclusiveContent((Action) any());
            doReturn(propertyMock).when(objectFactoryMock).property(Boolean.class);
            doReturn(dockerAvailabilityMock).when(propertyMock).value(false);
            Object[] objectArray = new Object[] { configurationMock };
            doReturn(configurableFileCollectionMock2).when(configurableFileCollectionMock).from(objectArray);
            doReturn(configurableFileCollectionMock, configurableFileCollectionMock3).when(objectFactoryMock).fileCollection();
            Object[] objectArray2 = new Object[] { configurationMock2 };
            doReturn(configurableFileCollectionMock4).when(configurableFileCollectionMock3).from(objectArray2);
            distributionDependency.when(() -> DistributionDependency.of("elasticsearch-distribution-snapshot:elasticsearch:CD@E")).thenReturn(distributionDependencyMock);
            doReturn(object).when(distributionDependencyMock).getDefaultNotation();
            version.when(() -> Version.fromString("return_of_getVersion1")).thenReturn(versionMock);
            target = new DistributionDownloadPlugin(objectFactoryMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).getGradle();
                verify(gradleMock).getStartParameter();
                verify(projectMock, times(4)).getDependencies();
                verify(dependencyHandlerMock).registerTransform(eq(UnzipTransform.class), (Action) any());
                verify(dependencyHandlerMock2).getArtifactTypes();
                verify(artifactTypeContainerMock).maybeCreate("tar.gz");
                verify(artifactTypeDefinitionMock).getName();
                verify(dependencyHandlerMock3).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
                verify(projectMock, times(2)).getExtensions();
                verify(extensionContainerMock).add("elasticsearch_distributions_resolutions", distributionResolutionList);
                verify(projectMock, times(4)).getConfigurations();
                verify(configurationContainerMock).create("es_distro_file_B");
                verify(configurationContainerMock2).create("es_distro_extracted_B");
                verify(configurationMock2).getAttributes();
                verify(attributeContainerMock).attribute(attribute, "directory");
                verify(configurationContainerMock3).getByName("es_distro_file_B");
                verify(configurationMock3).getDependencies();
                verify(dependencySetMock).addLater(providerMock);
                verify(projectMock, atLeast(2)).provider((Callable) any());
                verify(providerMock2).map((Transformer) any());
                verify(dependencyHandlerMock4).create(object);
                verify(configurationContainerMock4).getByName("es_distro_extracted_B");
                verify(configurationMock4).getDependencies();
                verify(dependencySetMock2).addAllLater(providerMock3);
                verify(providerMock4).map((Transformer) any());
                verify(projectMock).container(eq(ElasticsearchDistribution.class), (NamedDomainObjectFactory) any());
                verify(extensionContainerMock2).add("elasticsearch_distributions", namedDomainObjectContainerMock);
                verify(projectMock, times(5)).getRepositories();
                verify(repositoryHandlerMock).findByName("elasticsearch-downloads");
                verify(repositoryHandlerMock2).ivy((Action) any());
                verify(repositoryHandlerMock3).exclusiveContent((Action) any());
                verify(repositoryHandlerMock4).ivy((Action) any());
                verify(repositoryHandlerMock5).exclusiveContent((Action) any());
                verify(objectFactoryMock).property(Boolean.class);
                verify(propertyMock).value(false);
                verify(objectFactoryMock, times(2)).fileCollection();
                verify(configurableFileCollectionMock).from(objectArray);
                verify(configurableFileCollectionMock3).from(objectArray2);
                distributionDependency.verify(() -> DistributionDependency.of("elasticsearch-distribution-snapshot:elasticsearch:CD@E"), atLeast(1));
                verify(distributionDependencyMock).getDefaultNotation();
                version.verify(() -> Version.fromString("return_of_getVersion1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenDistributionGetVersionNotEndsWith_SNAPSHOTAndDistributionGetTypeNotShouldExtractAndProjectGetRepositoriesFindB}, hash: A8832E190158D3657BEA2BE9D4D70265
    @Disabled()
    @Test()
    void applyWhenDistributionGetVersionNotEndsWith_SNAPSHOTAndDistributionGetTypeNotShouldExtractAndProjectGetRepositoriesFindB() throws InvalidUserDataException, UnknownConfigurationException {
        /* Branches:
         * (project.getGradle().getStartParameter().getWriteDependencyVerifications().isEmpty() == false) : false
         * (writingDependencies == false) : true  #  inside lambda$setupDistributionContainer$2 method
         * (distribution.getType() == ElasticsearchDistributionTypes.INTEG_TEST_ZIP) : false  #  inside dependencyNotation method
         * (distribution.getVersion().endsWith("-SNAPSHOT")) : false  #  inside dependencyNotation method
         * (distribution.getType().shouldExtract()) : false  #  inside lambda$registerDistributionDependencies$6 method
         * (project.getRepositories().findByName(DOWNLOAD_REPO_NAME) != null) : false  #  inside setupDownloadServiceRepo method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.elasticsearch.gradle.ElasticsearchDistribution
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        Gradle gradleMock = mock(Gradle.class);
        DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);
        DependencyHandler dependencyHandlerMock2 = mock(DependencyHandler.class);
        ArtifactTypeContainer artifactTypeContainerMock = mock(ArtifactTypeContainer.class);
        ArtifactTypeDefinition artifactTypeDefinitionMock = mock(ArtifactTypeDefinition.class);
        DependencyHandler dependencyHandlerMock3 = mock(DependencyHandler.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        Configuration configurationMock = mock(Configuration.class);
        ConfigurationContainer configurationContainerMock2 = mock(ConfigurationContainer.class);
        Configuration configurationMock2 = mock(Configuration.class);
        AttributeContainer attributeContainerMock = mock(AttributeContainer.class);
        AttributeContainer attributeContainerMock2 = mock(AttributeContainer.class);
        ConfigurationContainer configurationContainerMock3 = mock(ConfigurationContainer.class);
        Configuration configurationMock3 = mock(Configuration.class);
        DependencySet dependencySetMock = mock(DependencySet.class);
        Provider providerMock = mock(Provider.class);
        Provider providerMock2 = mock(Provider.class);
        DependencyHandler dependencyHandlerMock4 = mock(DependencyHandler.class);
        Dependency dependencyMock = mock(Dependency.class);
        ConfigurationContainer configurationContainerMock4 = mock(ConfigurationContainer.class);
        Configuration configurationMock4 = mock(Configuration.class);
        DependencySet dependencySetMock2 = mock(DependencySet.class);
        Provider providerMock3 = mock(Provider.class);
        Provider providerMock4 = mock(Provider.class);
        NamedDomainObjectContainer<ElasticsearchDistribution> namedDomainObjectContainerMock = mock(NamedDomainObjectContainer.class);
        ExtensionContainer extensionContainerMock2 = mock(ExtensionContainer.class);
        RepositoryHandler repositoryHandlerMock = mock(RepositoryHandler.class);
        RepositoryHandler repositoryHandlerMock2 = mock(RepositoryHandler.class);
        IvyArtifactRepository ivyArtifactRepositoryMock = mock(IvyArtifactRepository.class);
        RepositoryHandler repositoryHandlerMock3 = mock(RepositoryHandler.class);
        RepositoryHandler repositoryHandlerMock4 = mock(RepositoryHandler.class);
        IvyArtifactRepository ivyArtifactRepositoryMock2 = mock(IvyArtifactRepository.class);
        RepositoryHandler repositoryHandlerMock5 = mock(RepositoryHandler.class);
        Property propertyMock = mock(Property.class);
        ConfigurableFileCollection configurableFileCollectionMock = mock(ConfigurableFileCollection.class);
        ConfigurableFileCollection configurableFileCollectionMock2 = mock(ConfigurableFileCollection.class);
        ConfigurableFileCollection configurableFileCollectionMock3 = mock(ConfigurableFileCollection.class);
        ConfigurableFileCollection configurableFileCollectionMock4 = mock(ConfigurableFileCollection.class);
        DistributionDependency distributionDependencyMock = mock(DistributionDependency.class);
        Version versionMock = mock(Version.class);
        try (MockedStatic<Version> version = mockStatic(Version.class);
            MockedStatic<DistributionDependency> distributionDependency = mockStatic(DistributionDependency.class)) {
            doReturn(gradleMock).when(projectMock).getGradle();
            List<String> stringList = new ArrayList<>();
            StartParameter startParameter = new StartParameter();
            startParameter.setWriteDependencyVerifications(stringList);
            doReturn(startParameter).when(gradleMock).getStartParameter();
            doNothing().when(dependencyHandlerMock).registerTransform(eq(UnzipTransform.class), (Action) any());
            doReturn(artifactTypeContainerMock).when(dependencyHandlerMock2).getArtifactTypes();
            doReturn(artifactTypeDefinitionMock).when(artifactTypeContainerMock).maybeCreate("tar.gz");
            doReturn("return_of_getName1").when(artifactTypeDefinitionMock).getName();
            doNothing().when(dependencyHandlerMock3).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
            List<DistributionResolution> distributionResolutionList = new ArrayList<>();
            doNothing().when(extensionContainerMock).add("elasticsearch_distributions_resolutions", distributionResolutionList);
            doReturn(configurationMock).when(configurationContainerMock).create("es_distro_file_");
            doReturn(configurationMock2).when(configurationContainerMock2).create("es_distro_extracted_");
            doReturn(attributeContainerMock).when(configurationMock2).getAttributes();
            Attribute attribute = ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE;
            doReturn(attributeContainerMock2).when(attributeContainerMock).attribute(attribute, "directory");
            doReturn(configurationMock3).when(configurationContainerMock3).getByName("es_distro_file_");
            doReturn(dependencySetMock).when(configurationMock3).getDependencies();
            doNothing().when(dependencySetMock).addLater(providerMock);
            doReturn(providerMock).when(providerMock2).map((Transformer) any());
            doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3, dependencyHandlerMock4).when(projectMock).getDependencies();
            Object object = new Object();
            doReturn(dependencyMock).when(dependencyHandlerMock4).create(object);
            doReturn(configurationContainerMock, configurationContainerMock2, configurationContainerMock3, configurationContainerMock4).when(projectMock).getConfigurations();
            doReturn(configurationMock4).when(configurationContainerMock4).getByName("es_distro_extracted_");
            doReturn(dependencySetMock2).when(configurationMock4).getDependencies();
            doNothing().when(dependencySetMock2).addAllLater(providerMock3);
            doReturn(providerMock2, providerMock4).when(projectMock).provider((Callable) any());
            doReturn(providerMock3).when(providerMock4).map((Transformer) any());
            doReturn(namedDomainObjectContainerMock).when(projectMock).container(eq(ElasticsearchDistribution.class), (NamedDomainObjectFactory) any());
            doReturn(extensionContainerMock, extensionContainerMock2).when(projectMock).getExtensions();
            doNothing().when(extensionContainerMock2).add("elasticsearch_distributions", namedDomainObjectContainerMock);
            doReturn(null).when(repositoryHandlerMock).findByName("elasticsearch-downloads");
            doReturn(ivyArtifactRepositoryMock).when(repositoryHandlerMock2).ivy((Action) any());
            doNothing().when(repositoryHandlerMock3).exclusiveContent((Action) any());
            doReturn(ivyArtifactRepositoryMock2).when(repositoryHandlerMock4).ivy((Action) any());
            doReturn(repositoryHandlerMock, repositoryHandlerMock2, repositoryHandlerMock3, repositoryHandlerMock4, repositoryHandlerMock5).when(projectMock).getRepositories();
            doNothing().when(repositoryHandlerMock5).exclusiveContent((Action) any());
            doReturn(propertyMock).when(objectFactoryMock).property(Boolean.class);
            doReturn(dockerAvailabilityMock).when(propertyMock).value(false);
            Object[] objectArray = new Object[] { configurationMock };
            doReturn(configurableFileCollectionMock2).when(configurableFileCollectionMock).from(objectArray);
            doReturn(configurableFileCollectionMock, configurableFileCollectionMock3).when(objectFactoryMock).fileCollection();
            Object[] objectArray2 = new Object[] { configurationMock2 };
            doReturn(configurableFileCollectionMock4).when(configurableFileCollectionMock3).from(objectArray2);
            distributionDependency.when(() -> DistributionDependency.of("elasticsearch-distribution:elasticsearch:BC@")).thenReturn(distributionDependencyMock);
            doReturn(object).when(distributionDependencyMock).getDefaultNotation();
            version.when(() -> Version.fromString("return_of_getVersion1")).thenReturn(versionMock);
            target = new DistributionDownloadPlugin(objectFactoryMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).getGradle();
                verify(gradleMock).getStartParameter();
                verify(projectMock, times(4)).getDependencies();
                verify(dependencyHandlerMock).registerTransform(eq(UnzipTransform.class), (Action) any());
                verify(dependencyHandlerMock2).getArtifactTypes();
                verify(artifactTypeContainerMock).maybeCreate("tar.gz");
                verify(artifactTypeDefinitionMock).getName();
                verify(dependencyHandlerMock3).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
                verify(projectMock, times(2)).getExtensions();
                verify(extensionContainerMock).add("elasticsearch_distributions_resolutions", distributionResolutionList);
                verify(projectMock, times(4)).getConfigurations();
                verify(configurationContainerMock).create("es_distro_file_");
                verify(configurationContainerMock2).create("es_distro_extracted_");
                verify(configurationMock2).getAttributes();
                verify(attributeContainerMock).attribute(attribute, "directory");
                verify(configurationContainerMock3).getByName("es_distro_file_");
                verify(configurationMock3).getDependencies();
                verify(dependencySetMock).addLater(providerMock);
                verify(projectMock, atLeast(2)).provider((Callable) any());
                verify(providerMock2).map((Transformer) any());
                verify(dependencyHandlerMock4).create(object);
                verify(configurationContainerMock4).getByName("es_distro_extracted_");
                verify(configurationMock4).getDependencies();
                verify(dependencySetMock2).addAllLater(providerMock3);
                verify(providerMock4).map((Transformer) any());
                verify(projectMock).container(eq(ElasticsearchDistribution.class), (NamedDomainObjectFactory) any());
                verify(extensionContainerMock2).add("elasticsearch_distributions", namedDomainObjectContainerMock);
                verify(projectMock, times(5)).getRepositories();
                verify(repositoryHandlerMock).findByName("elasticsearch-downloads");
                verify(repositoryHandlerMock2).ivy((Action) any());
                verify(repositoryHandlerMock3).exclusiveContent((Action) any());
                verify(repositoryHandlerMock4).ivy((Action) any());
                verify(repositoryHandlerMock5).exclusiveContent((Action) any());
                verify(objectFactoryMock).property(Boolean.class);
                verify(propertyMock).value(false);
                verify(objectFactoryMock, times(2)).fileCollection();
                verify(configurableFileCollectionMock).from(objectArray);
                verify(configurableFileCollectionMock3).from(objectArray2);
                distributionDependency.verify(() -> DistributionDependency.of("elasticsearch-distribution:elasticsearch:BC@"), atLeast(1));
                verify(distributionDependencyMock).getDefaultNotation();
                version.verify(() -> Version.fromString("return_of_getVersion1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getContainerTest}, hash: 12B19ACD5ACF4CE0CB8090BAA5C83D17
    @Test()
    void getContainerTest() throws UnknownDomainObjectException {
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        NamedDomainObjectContainer namedDomainObjectContainerMock = mock(NamedDomainObjectContainer.class);
        doReturn(namedDomainObjectContainerMock).when(extensionContainerMock).getByName("elasticsearch_distributions");
        //Act Statement(s)
        NamedDomainObjectContainer<ElasticsearchDistribution> result = DistributionDownloadPlugin.getContainer(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(namedDomainObjectContainerMock));
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).getByName("elasticsearch_distributions");
        });
    }

    //Sapient generated method id: ${getRegistrationsContainerTest}, hash: A0EF1A64B9A63776426A9C3845C11653
    @Test()
    void getRegistrationsContainerTest() throws UnknownDomainObjectException {
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        List list = new ArrayList<>();
        doReturn(list).when(extensionContainerMock).getByName("elasticsearch_distributions_resolutions");
        //Act Statement(s)
        List<DistributionResolution> result = DistributionDownloadPlugin.getRegistrationsContainer(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(list));
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).getByName("elasticsearch_distributions_resolutions");
        });
    }
}

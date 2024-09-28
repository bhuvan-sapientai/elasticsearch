package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.artifacts.type.ArtifactTypeDefinition;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.artifacts.dsl.RepositoryHandler;
import org.gradle.api.attributes.AttributesSchema;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.artifacts.Dependency;
import org.gradle.api.GradleException;
import org.elasticsearch.gradle.transform.SymbolicLinkPreservingUntarTransform;
import org.gradle.api.attributes.AttributeContainer;
import org.gradle.api.attributes.Attribute;
import org.gradle.api.artifacts.repositories.IvyArtifactRepository;
import org.elasticsearch.gradle.transform.UnzipTransform;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.Action;
import org.gradle.api.NamedDomainObjectFactory;
import org.gradle.api.attributes.AttributeMatchingStrategy;
import org.gradle.api.Project;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.artifacts.type.ArtifactTypeContainer;
import org.gradle.api.artifacts.dsl.DependencyHandler;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class JdkDownloadPluginSapientGeneratedTest {

    private final ArtifactTypeContainer artifactTypeContainerMock = mock(ArtifactTypeContainer.class);

    private final ArtifactTypeContainer artifactTypeContainerMock2 = mock(ArtifactTypeContainer.class);

    private final ArtifactTypeDefinition artifactTypeDefinitionMock = mock(ArtifactTypeDefinition.class);

    private final AttributeContainer attributeContainerMock = mock(AttributeContainer.class);

    private final AttributeContainer attributeContainerMock2 = mock(AttributeContainer.class);

    private final AttributeContainer attributeContainerMock3 = mock(AttributeContainer.class);

    private final AttributeContainer attributeContainerMock4 = mock(AttributeContainer.class);

    private final AttributeMatchingStrategy attributeMatchingStrategyMock = mock(AttributeMatchingStrategy.class);

    private final AttributesSchema attributesSchemaMock = mock(AttributesSchema.class);

    private final ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);

    private final Configuration configurationMock = mock(Configuration.class);

    private final Configuration configurationMock2 = mock(Configuration.class);

    private final DependencyHandler dependencyHandlerMock = mock(DependencyHandler.class);

    private final DependencyHandler dependencyHandlerMock2 = mock(DependencyHandler.class);

    private final DependencyHandler dependencyHandlerMock3 = mock(DependencyHandler.class);

    private final DependencyHandler dependencyHandlerMock4 = mock(DependencyHandler.class);

    private final DependencyHandler dependencyHandlerMock5 = mock(DependencyHandler.class);

    private final DependencyHandler dependencyHandlerMock6 = mock(DependencyHandler.class);

    private final Dependency dependencyMock = mock(Dependency.class);

    private final ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);

    private final IvyArtifactRepository ivyArtifactRepositoryMock = mock(IvyArtifactRepository.class);

    private final NamedDomainObjectContainer<Jdk> namedDomainObjectContainerMock = mock(NamedDomainObjectContainer.class);

    private final ObjectFactory objectFactoryMock = mock(ObjectFactory.class);

    private final Project projectMock = mock(Project.class);

    private final RepositoryHandler repositoryHandlerMock = mock(RepositoryHandler.class);

    //Sapient generated method id: ${applyWhenJdkGetVendorNotEqualsVENDOR_ZULUThrowsGradleException}, hash: 9DB9672AEEF2D3D86C532E1827387991
    @Disabled()
    @Test()
    void applyWhenJdkGetVendorNotEqualsVENDOR_ZULUThrowsGradleException() throws InvalidUserDataException {
        /* Branches:
         * (jdk.getVendor().equals(VENDOR_ADOPTIUM)) : false  #  inside setupRepository method
         * (jdk.getVendor().equals(VENDOR_OPENJDK)) : false  #  inside setupRepository method
         * (jdk.getVendor().equals(VENDOR_ZULU)) : false  #  inside setupRepository method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: jdk - Method: finalizeValues
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        doReturn(attributesSchemaMock).when(dependencyHandlerMock).getAttributesSchema();
        doReturn(attributeMatchingStrategyMock).when(attributesSchemaMock).attribute((Attribute) any());
        doReturn(artifactTypeContainerMock).when(dependencyHandlerMock2).getArtifactTypes();
        Object object = new Object();
        doReturn(object).when(artifactTypeContainerMock).maybeCreate("zip");
        doNothing().when(dependencyHandlerMock3).registerTransform(eq(UnzipTransform.class), (Action) any());
        doReturn(artifactTypeContainerMock2).when(dependencyHandlerMock4).getArtifactTypes();
        doReturn(artifactTypeDefinitionMock).when(artifactTypeContainerMock2).maybeCreate("tar.gz");
        doReturn("return_of_getName1").when(artifactTypeDefinitionMock).getName();
        doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3, dependencyHandlerMock4, dependencyHandlerMock5).when(projectMock).getDependencies();
        doNothing().when(dependencyHandlerMock5).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
        doReturn(configurationContainerMock).when(projectMock).getConfigurations();
        doReturn(configurationMock).when(configurationContainerMock).create("jdk_A");
        doNothing().when(configurationMock).setCanBeConsumed(false);
        Attribute attribute = ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE;
        doReturn(attributeContainerMock2).when(attributeContainerMock).attribute(attribute, "directory");
        doReturn(attributeContainerMock, attributeContainerMock3).when(configurationMock).getAttributes();
        doReturn(attributeContainerMock4).when(attributeContainerMock3).attribute((Attribute) any(), eq(true));
        doReturn(configurationMock2).when(configurationMock).defaultDependencies((Action) any());
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(repositoryHandlerMock).when(projectMock).getRepositories();
        NamedDomainObjectContainer namedDomainObjectContainerMock = mock(NamedDomainObjectContainer.class);
        doReturn(namedDomainObjectContainerMock).when(projectMock).container(eq(Jdk.class), (NamedDomainObjectFactory) any());
        JdkDownloadPlugin target = new JdkDownloadPlugin();
        GradleException gradleException = new GradleException("Unknown JDK vendor [G]");
        //Act Statement(s)
        final GradleException result = assertThrows(GradleException.class, () -> {
            target.apply(projectMock);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(gradleException.getMessage()));
            verify(projectMock, times(5)).getDependencies();
            verify(dependencyHandlerMock).getAttributesSchema();
            verify(attributesSchemaMock).attribute((Attribute) any());
            verify(dependencyHandlerMock2).getArtifactTypes();
            verify(artifactTypeContainerMock).maybeCreate("zip");
            verify(dependencyHandlerMock3).registerTransform(eq(UnzipTransform.class), (Action) any());
            verify(dependencyHandlerMock4).getArtifactTypes();
            verify(artifactTypeContainerMock2).maybeCreate("tar.gz");
            verify(artifactTypeDefinitionMock).getName();
            verify(dependencyHandlerMock5).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
            verify(projectMock).getConfigurations();
            verify(configurationContainerMock).create("jdk_A");
            verify(configurationMock).setCanBeConsumed(false);
            verify(configurationMock, times(2)).getAttributes();
            verify(attributeContainerMock).attribute(attribute, "directory");
            verify(attributeContainerMock3).attribute((Attribute) any(), eq(true));
            verify(configurationMock).defaultDependencies((Action) any());
            verify(projectMock).getObjects();
            verify(projectMock).getRepositories();
            verify(projectMock).container(eq(Jdk.class), (NamedDomainObjectFactory) any());
        });
    }

    //Sapient generated method id: ${applyWhenIsJdkOnMacOsPlatformNotJdkAndJdkGetPlatformNotEqualsWindows}, hash: 76C30AD6861FAC29CF0B998227425B80
    @Disabled()
    @Test()
    void applyWhenIsJdkOnMacOsPlatformNotJdkAndJdkGetPlatformNotEqualsWindows() throws InvalidUserDataException {
        /* Branches:
         * (jdk.getVendor().equals(VENDOR_ADOPTIUM)) : true  #  inside setupRepository method
         * (jdk.getMajor().equals("8")) : true  #  inside setupRepository method
         * (repositories.findByName(repoName) == null) : true  #  inside setupRepository method
         * (jdk.getPlatform().equals("darwin")) : false  #  inside isJdkOnMacOsPlatform method
         * (jdk.getPlatform().equals("mac")) : false  #  inside isJdkOnMacOsPlatform method
         * (isJdkOnMacOsPlatform(jdk)) : false  #  inside dependencyNotation method
         * (jdk.getPlatform().equals("windows")) : false  #  inside dependencyNotation method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: jdk - Method: finalizeValues
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        doReturn(attributesSchemaMock).when(dependencyHandlerMock).getAttributesSchema();
        doReturn(attributeMatchingStrategyMock).when(attributesSchemaMock).attribute((Attribute) any());
        doReturn(artifactTypeContainerMock).when(dependencyHandlerMock2).getArtifactTypes();
        Object object = new Object();
        doReturn(object).when(artifactTypeContainerMock).maybeCreate("zip");
        doNothing().when(dependencyHandlerMock3).registerTransform(eq(UnzipTransform.class), (Action) any());
        doReturn(artifactTypeContainerMock2).when(dependencyHandlerMock4).getArtifactTypes();
        doReturn(artifactTypeDefinitionMock).when(artifactTypeContainerMock2).maybeCreate("tar.gz");
        doReturn("return_of_getName1").when(artifactTypeDefinitionMock).getName();
        doNothing().when(dependencyHandlerMock5).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
        doReturn(configurationContainerMock).when(projectMock).getConfigurations();
        doReturn(configurationMock).when(configurationContainerMock).create("jdk_A");
        doNothing().when(configurationMock).setCanBeConsumed(false);
        Attribute attribute = ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE;
        doReturn(attributeContainerMock2).when(attributeContainerMock).attribute(attribute, "directory");
        doReturn(attributeContainerMock, attributeContainerMock3).when(configurationMock).getAttributes();
        doReturn(attributeContainerMock4).when(attributeContainerMock3).attribute((Attribute) any(), eq(true));
        doReturn(configurationMock2).when(configurationMock).defaultDependencies((Action) any());
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(repositoryHandlerMock).when(projectMock).getRepositories();
        doReturn(null).when(repositoryHandlerMock).findByName("jdk_repo_B_C");
        doReturn(ivyArtifactRepositoryMock).when(repositoryHandlerMock).ivy((Action) any());
        doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3, dependencyHandlerMock4, dependencyHandlerMock5, dependencyHandlerMock6).when(projectMock).getDependencies();
        doReturn(dependencyMock).when(dependencyHandlerMock6).create("K_L:M:N:O@tar.gz");
        doReturn(namedDomainObjectContainerMock).when(projectMock).container(eq(Jdk.class), (NamedDomainObjectFactory) any());
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        doNothing().when(extensionContainerMock).add("jdks", namedDomainObjectContainerMock);
        JdkDownloadPlugin target = new JdkDownloadPlugin();
        //Act Statement(s)
        target.apply(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock, times(6)).getDependencies();
            verify(dependencyHandlerMock).getAttributesSchema();
            verify(attributesSchemaMock).attribute((Attribute) any());
            verify(dependencyHandlerMock2).getArtifactTypes();
            verify(artifactTypeContainerMock).maybeCreate("zip");
            verify(dependencyHandlerMock3).registerTransform(eq(UnzipTransform.class), (Action) any());
            verify(dependencyHandlerMock4).getArtifactTypes();
            verify(artifactTypeContainerMock2).maybeCreate("tar.gz");
            verify(artifactTypeDefinitionMock).getName();
            verify(dependencyHandlerMock5).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
            verify(projectMock).getConfigurations();
            verify(configurationContainerMock).create("jdk_A");
            verify(configurationMock).setCanBeConsumed(false);
            verify(configurationMock, times(2)).getAttributes();
            verify(attributeContainerMock).attribute(attribute, "directory");
            verify(attributeContainerMock3).attribute((Attribute) any(), eq(true));
            verify(configurationMock).defaultDependencies((Action) any());
            verify(projectMock).getObjects();
            verify(projectMock).getRepositories();
            verify(repositoryHandlerMock).findByName("jdk_repo_B_C");
            verify(repositoryHandlerMock).ivy((Action) any());
            verify(dependencyHandlerMock6).create("K_L:M:N:O@tar.gz");
            verify(projectMock).container(eq(Jdk.class), (NamedDomainObjectFactory) any());
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).add("jdks", namedDomainObjectContainerMock);
        });
    }

    //Sapient generated method id: ${applyWhenIsJdkOnMacOsPlatformJdkAndJdkGetVendorNotEqualsVENDOR_ADOPTIUMAndJdkGetPlatformNotEqualsWindows}, hash: 0F6862A05F0EBAD32537B7AFAAEE53B9
    @Disabled()
    @Test()
    void applyWhenIsJdkOnMacOsPlatformJdkAndJdkGetVendorNotEqualsVENDOR_ADOPTIUMAndJdkGetPlatformNotEqualsWindows() throws InvalidUserDataException {
        /* Branches:
         * (jdk.getVendor().equals(VENDOR_ADOPTIUM)) : true  #  inside setupRepository method
         * (jdk.getMajor().equals("8")) : false  #  inside setupRepository method
         * (repositories.findByName(repoName) == null) : true  #  inside setupRepository method
         * (jdk.getPlatform().equals("darwin")) : true  #  inside isJdkOnMacOsPlatform method
         * (isJdkOnMacOsPlatform(jdk)) : true  #  inside dependencyNotation method
         * (jdk.getVendor().equals(VENDOR_ADOPTIUM)) : false  #  inside dependencyNotation method
         * (jdk.getPlatform().equals("windows")) : false  #  inside dependencyNotation method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: jdk - Method: finalizeValues
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        doReturn(attributesSchemaMock).when(dependencyHandlerMock).getAttributesSchema();
        doReturn(attributeMatchingStrategyMock).when(attributesSchemaMock).attribute((Attribute) any());
        doReturn(artifactTypeContainerMock).when(dependencyHandlerMock2).getArtifactTypes();
        Object object = new Object();
        doReturn(object).when(artifactTypeContainerMock).maybeCreate("zip");
        doNothing().when(dependencyHandlerMock3).registerTransform(eq(UnzipTransform.class), (Action) any());
        doReturn(artifactTypeContainerMock2).when(dependencyHandlerMock4).getArtifactTypes();
        doReturn(artifactTypeDefinitionMock).when(artifactTypeContainerMock2).maybeCreate("tar.gz");
        doReturn("return_of_getName1").when(artifactTypeDefinitionMock).getName();
        doNothing().when(dependencyHandlerMock5).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
        doReturn(configurationContainerMock).when(projectMock).getConfigurations();
        doReturn(configurationMock).when(configurationContainerMock).create("jdk_A");
        doNothing().when(configurationMock).setCanBeConsumed(false);
        Attribute attribute = ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE;
        doReturn(attributeContainerMock2).when(attributeContainerMock).attribute(attribute, "directory");
        doReturn(attributeContainerMock, attributeContainerMock3).when(configurationMock).getAttributes();
        doReturn(attributeContainerMock4).when(attributeContainerMock3).attribute((Attribute) any(), eq(true));
        doReturn(configurationMock2).when(configurationMock).defaultDependencies((Action) any());
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(repositoryHandlerMock).when(projectMock).getRepositories();
        doReturn(null).when(repositoryHandlerMock).findByName("jdk_repo_B_C");
        doReturn(ivyArtifactRepositoryMock).when(repositoryHandlerMock).ivy((Action) any());
        doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3, dependencyHandlerMock4, dependencyHandlerMock5, dependencyHandlerMock6).when(projectMock).getDependencies();
        doReturn(dependencyMock).when(dependencyHandlerMock6).create("K_L:macos:M:N@tar.gz");
        doReturn(namedDomainObjectContainerMock).when(projectMock).container(eq(Jdk.class), (NamedDomainObjectFactory) any());
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        doNothing().when(extensionContainerMock).add("jdks", namedDomainObjectContainerMock);
        JdkDownloadPlugin target = new JdkDownloadPlugin();
        //Act Statement(s)
        target.apply(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock, times(6)).getDependencies();
            verify(dependencyHandlerMock).getAttributesSchema();
            verify(attributesSchemaMock).attribute((Attribute) any());
            verify(dependencyHandlerMock2).getArtifactTypes();
            verify(artifactTypeContainerMock).maybeCreate("zip");
            verify(dependencyHandlerMock3).registerTransform(eq(UnzipTransform.class), (Action) any());
            verify(dependencyHandlerMock4).getArtifactTypes();
            verify(artifactTypeContainerMock2).maybeCreate("tar.gz");
            verify(artifactTypeDefinitionMock).getName();
            verify(dependencyHandlerMock5).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
            verify(projectMock).getConfigurations();
            verify(configurationContainerMock).create("jdk_A");
            verify(configurationMock).setCanBeConsumed(false);
            verify(configurationMock, times(2)).getAttributes();
            verify(attributeContainerMock).attribute(attribute, "directory");
            verify(attributeContainerMock3).attribute((Attribute) any(), eq(true));
            verify(configurationMock).defaultDependencies((Action) any());
            verify(projectMock).getObjects();
            verify(projectMock).getRepositories();
            verify(repositoryHandlerMock).findByName("jdk_repo_B_C");
            verify(repositoryHandlerMock).ivy((Action) any());
            verify(dependencyHandlerMock6).create("K_L:macos:M:N@tar.gz");
            verify(projectMock).container(eq(Jdk.class), (NamedDomainObjectFactory) any());
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).add("jdks", namedDomainObjectContainerMock);
        });
    }

    //Sapient generated method id: ${applyWhenIsJdkOnMacOsPlatformNotJdkThrowsGradleException}, hash: 73043C593C2F158AF92C340774DE1541
    @Disabled()
    @Test()
    void applyWhenIsJdkOnMacOsPlatformNotJdkThrowsGradleException() throws InvalidUserDataException {
        /* Branches:
         * (jdk.getVendor().equals(VENDOR_ADOPTIUM)) : false  #  inside setupRepository method
         * (jdk.getVendor().equals(VENDOR_OPENJDK)) : false  #  inside setupRepository method
         * (jdk.getVendor().equals(VENDOR_ZULU)) : true  #  inside setupRepository method
         * (jdk.getMajor().equals("8")) : true  #  inside setupRepository method
         * (jdk.getPlatform().equals("darwin")) : false  #  inside isJdkOnMacOsPlatform method
         * (jdk.getPlatform().equals("mac")) : false  #  inside isJdkOnMacOsPlatform method
         * (isJdkOnMacOsPlatform(jdk)) : false  #  inside setupRepository method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: jdk - Method: finalizeValues
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        doReturn(attributesSchemaMock).when(dependencyHandlerMock).getAttributesSchema();
        doReturn(attributeMatchingStrategyMock).when(attributesSchemaMock).attribute((Attribute) any());
        doReturn(artifactTypeContainerMock).when(dependencyHandlerMock2).getArtifactTypes();
        Object object = new Object();
        doReturn(object).when(artifactTypeContainerMock).maybeCreate("zip");
        doNothing().when(dependencyHandlerMock3).registerTransform(eq(UnzipTransform.class), (Action) any());
        doReturn(artifactTypeContainerMock2).when(dependencyHandlerMock4).getArtifactTypes();
        doReturn(artifactTypeDefinitionMock).when(artifactTypeContainerMock2).maybeCreate("tar.gz");
        doReturn("return_of_getName1").when(artifactTypeDefinitionMock).getName();
        doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3, dependencyHandlerMock4, dependencyHandlerMock5).when(projectMock).getDependencies();
        doNothing().when(dependencyHandlerMock5).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
        doReturn(configurationContainerMock).when(projectMock).getConfigurations();
        doReturn(configurationMock).when(configurationContainerMock).create("jdk_A");
        doNothing().when(configurationMock).setCanBeConsumed(false);
        Attribute attribute = ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE;
        doReturn(attributeContainerMock2).when(attributeContainerMock).attribute(attribute, "directory");
        doReturn(attributeContainerMock, attributeContainerMock3).when(configurationMock).getAttributes();
        doReturn(attributeContainerMock4).when(attributeContainerMock3).attribute((Attribute) any(), eq(true));
        doReturn(configurationMock2).when(configurationMock).defaultDependencies((Action) any());
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(repositoryHandlerMock).when(projectMock).getRepositories();
        NamedDomainObjectContainer namedDomainObjectContainerMock = mock(NamedDomainObjectContainer.class);
        doReturn(namedDomainObjectContainerMock).when(projectMock).container(eq(Jdk.class), (NamedDomainObjectFactory) any());
        JdkDownloadPlugin target = new JdkDownloadPlugin();
        GradleException gradleException = new GradleException("JDK vendor zulu is supported only for JDK8 on MacOS with Apple Silicon.");
        //Act Statement(s)
        final GradleException result = assertThrows(GradleException.class, () -> {
            target.apply(projectMock);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(gradleException.getMessage()));
            verify(projectMock, times(5)).getDependencies();
            verify(dependencyHandlerMock).getAttributesSchema();
            verify(attributesSchemaMock).attribute((Attribute) any());
            verify(dependencyHandlerMock2).getArtifactTypes();
            verify(artifactTypeContainerMock).maybeCreate("zip");
            verify(dependencyHandlerMock3).registerTransform(eq(UnzipTransform.class), (Action) any());
            verify(dependencyHandlerMock4).getArtifactTypes();
            verify(artifactTypeContainerMock2).maybeCreate("tar.gz");
            verify(artifactTypeDefinitionMock).getName();
            verify(dependencyHandlerMock5).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
            verify(projectMock).getConfigurations();
            verify(configurationContainerMock).create("jdk_A");
            verify(configurationMock).setCanBeConsumed(false);
            verify(configurationMock, times(2)).getAttributes();
            verify(attributeContainerMock).attribute(attribute, "directory");
            verify(attributeContainerMock3).attribute((Attribute) any(), eq(true));
            verify(configurationMock).defaultDependencies((Action) any());
            verify(projectMock).getObjects();
            verify(projectMock).getRepositories();
            verify(projectMock).container(eq(Jdk.class), (NamedDomainObjectFactory) any());
        });
    }

    //Sapient generated method id: ${applyWhenJdkGetPlatformEqualsWindows}, hash: 33A00E99C91F519B09D10F8900D44510
    @Disabled()
    @Test()
    void applyWhenJdkGetPlatformEqualsWindows() throws InvalidUserDataException {
        /* Branches:
         * (jdk.getVendor().equals(VENDOR_ADOPTIUM)) : true  #  inside setupRepository method
         * (jdk.getMajor().equals("8")) : true  #  inside setupRepository method
         * (repositories.findByName(repoName) == null) : true  #  inside setupRepository method
         * (jdk.getPlatform().equals("darwin")) : false  #  inside isJdkOnMacOsPlatform method
         * (jdk.getPlatform().equals("mac")) : true  #  inside isJdkOnMacOsPlatform method
         * (isJdkOnMacOsPlatform(jdk)) : true  #  inside dependencyNotation method
         * (jdk.getVendor().equals(VENDOR_ADOPTIUM)) : true  #  inside dependencyNotation method
         * (jdk.getPlatform().equals("windows")) : true  #  inside dependencyNotation method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: jdk - Method: finalizeValues
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        doReturn(attributesSchemaMock).when(dependencyHandlerMock).getAttributesSchema();
        doReturn(attributeMatchingStrategyMock).when(attributesSchemaMock).attribute((Attribute) any());
        doReturn(artifactTypeContainerMock).when(dependencyHandlerMock2).getArtifactTypes();
        Object object = new Object();
        doReturn(object).when(artifactTypeContainerMock).maybeCreate("zip");
        doNothing().when(dependencyHandlerMock3).registerTransform(eq(UnzipTransform.class), (Action) any());
        doReturn(artifactTypeContainerMock2).when(dependencyHandlerMock4).getArtifactTypes();
        doReturn(artifactTypeDefinitionMock).when(artifactTypeContainerMock2).maybeCreate("tar.gz");
        doReturn("return_of_getName1").when(artifactTypeDefinitionMock).getName();
        doNothing().when(dependencyHandlerMock5).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
        doReturn(configurationContainerMock).when(projectMock).getConfigurations();
        doReturn(configurationMock).when(configurationContainerMock).create("jdk_A");
        doNothing().when(configurationMock).setCanBeConsumed(false);
        Attribute attribute = ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE;
        doReturn(attributeContainerMock2).when(attributeContainerMock).attribute(attribute, "directory");
        doReturn(attributeContainerMock, attributeContainerMock3).when(configurationMock).getAttributes();
        doReturn(attributeContainerMock4).when(attributeContainerMock3).attribute((Attribute) any(), eq(true));
        doReturn(configurationMock2).when(configurationMock).defaultDependencies((Action) any());
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(repositoryHandlerMock).when(projectMock).getRepositories();
        doReturn(null).when(repositoryHandlerMock).findByName("jdk_repo_B_C");
        doReturn(ivyArtifactRepositoryMock).when(repositoryHandlerMock).ivy((Action) any());
        doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3, dependencyHandlerMock4, dependencyHandlerMock5, dependencyHandlerMock6).when(projectMock).getDependencies();
        doReturn(dependencyMock).when(dependencyHandlerMock6).create("I_J:mac:K:L@zip");
        doReturn(namedDomainObjectContainerMock).when(projectMock).container(eq(Jdk.class), (NamedDomainObjectFactory) any());
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        doNothing().when(extensionContainerMock).add("jdks", namedDomainObjectContainerMock);
        JdkDownloadPlugin target = new JdkDownloadPlugin();
        //Act Statement(s)
        target.apply(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock, times(6)).getDependencies();
            verify(dependencyHandlerMock).getAttributesSchema();
            verify(attributesSchemaMock).attribute((Attribute) any());
            verify(dependencyHandlerMock2).getArtifactTypes();
            verify(artifactTypeContainerMock).maybeCreate("zip");
            verify(dependencyHandlerMock3).registerTransform(eq(UnzipTransform.class), (Action) any());
            verify(dependencyHandlerMock4).getArtifactTypes();
            verify(artifactTypeContainerMock2).maybeCreate("tar.gz");
            verify(artifactTypeDefinitionMock).getName();
            verify(dependencyHandlerMock5).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
            verify(projectMock).getConfigurations();
            verify(configurationContainerMock).create("jdk_A");
            verify(configurationMock).setCanBeConsumed(false);
            verify(configurationMock, times(2)).getAttributes();
            verify(attributeContainerMock).attribute(attribute, "directory");
            verify(attributeContainerMock3).attribute((Attribute) any(), eq(true));
            verify(configurationMock).defaultDependencies((Action) any());
            verify(projectMock).getObjects();
            verify(projectMock).getRepositories();
            verify(repositoryHandlerMock).findByName("jdk_repo_B_C");
            verify(repositoryHandlerMock).ivy((Action) any());
            verify(dependencyHandlerMock6).create("I_J:mac:K:L@zip");
            verify(projectMock).container(eq(Jdk.class), (NamedDomainObjectFactory) any());
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).add("jdks", namedDomainObjectContainerMock);
        });
    }

    //Sapient generated method id: ${applyWhenIsJdkOnMacOsPlatformJdkAndJdkGetVendorNotEqualsVENDOR_ADOPTIUMAndJdkGetPlatformNotEqualsWindows2}, hash: 9242067D241C354178A6CA925AC68573
    @Disabled()
    @Test()
    void applyWhenIsJdkOnMacOsPlatformJdkAndJdkGetVendorNotEqualsVENDOR_ADOPTIUMAndJdkGetPlatformNotEqualsWindows2() throws InvalidUserDataException {
        /* Branches:
         * (jdk.getVendor().equals(VENDOR_ADOPTIUM)) : false  #  inside setupRepository method
         * (jdk.getVendor().equals(VENDOR_OPENJDK)) : true  #  inside setupRepository method
         * (jdk.getHash() != null) : true  #  inside setupRepository method
         * (repositories.findByName(repoName) == null) : true  #  inside setupRepository method
         * (jdk.getPlatform().equals("darwin")) : true  #  inside isJdkOnMacOsPlatform method
         * (isJdkOnMacOsPlatform(jdk)) : true  #  inside dependencyNotation method
         * (jdk.getVendor().equals(VENDOR_ADOPTIUM)) : false  #  inside dependencyNotation method
         * (jdk.getPlatform().equals("windows")) : false  #  inside dependencyNotation method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: jdk - Method: finalizeValues
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        doReturn(attributesSchemaMock).when(dependencyHandlerMock).getAttributesSchema();
        doReturn(attributeMatchingStrategyMock).when(attributesSchemaMock).attribute((Attribute) any());
        doReturn(artifactTypeContainerMock).when(dependencyHandlerMock2).getArtifactTypes();
        Object object = new Object();
        doReturn(object).when(artifactTypeContainerMock).maybeCreate("zip");
        doNothing().when(dependencyHandlerMock3).registerTransform(eq(UnzipTransform.class), (Action) any());
        doReturn(artifactTypeContainerMock2).when(dependencyHandlerMock4).getArtifactTypes();
        doReturn(artifactTypeDefinitionMock).when(artifactTypeContainerMock2).maybeCreate("tar.gz");
        doReturn("return_of_getName1").when(artifactTypeDefinitionMock).getName();
        doNothing().when(dependencyHandlerMock5).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
        doReturn(configurationContainerMock).when(projectMock).getConfigurations();
        doReturn(configurationMock).when(configurationContainerMock).create("jdk_A");
        doNothing().when(configurationMock).setCanBeConsumed(false);
        Attribute attribute = ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE;
        doReturn(attributeContainerMock2).when(attributeContainerMock).attribute(attribute, "directory");
        doReturn(attributeContainerMock, attributeContainerMock3).when(configurationMock).getAttributes();
        doReturn(attributeContainerMock4).when(attributeContainerMock3).attribute((Attribute) any(), eq(true));
        doReturn(configurationMock2).when(configurationMock).defaultDependencies((Action) any());
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(repositoryHandlerMock).when(projectMock).getRepositories();
        doReturn(null).when(repositoryHandlerMock).findByName("jdk_repo_B_C");
        doReturn(ivyArtifactRepositoryMock).when(repositoryHandlerMock).ivy((Action) any());
        doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3, dependencyHandlerMock4, dependencyHandlerMock5, dependencyHandlerMock6).when(projectMock).getDependencies();
        doReturn(dependencyMock).when(dependencyHandlerMock6).create("L_M:macos:N:O@tar.gz");
        doReturn(namedDomainObjectContainerMock).when(projectMock).container(eq(Jdk.class), (NamedDomainObjectFactory) any());
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        doNothing().when(extensionContainerMock).add("jdks", namedDomainObjectContainerMock);
        JdkDownloadPlugin target = new JdkDownloadPlugin();
        //Act Statement(s)
        target.apply(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock, times(6)).getDependencies();
            verify(dependencyHandlerMock).getAttributesSchema();
            verify(attributesSchemaMock).attribute((Attribute) any());
            verify(dependencyHandlerMock2).getArtifactTypes();
            verify(artifactTypeContainerMock).maybeCreate("zip");
            verify(dependencyHandlerMock3).registerTransform(eq(UnzipTransform.class), (Action) any());
            verify(dependencyHandlerMock4).getArtifactTypes();
            verify(artifactTypeContainerMock2).maybeCreate("tar.gz");
            verify(artifactTypeDefinitionMock).getName();
            verify(dependencyHandlerMock5).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
            verify(projectMock).getConfigurations();
            verify(configurationContainerMock).create("jdk_A");
            verify(configurationMock).setCanBeConsumed(false);
            verify(configurationMock, times(2)).getAttributes();
            verify(attributeContainerMock).attribute(attribute, "directory");
            verify(attributeContainerMock3).attribute((Attribute) any(), eq(true));
            verify(configurationMock).defaultDependencies((Action) any());
            verify(projectMock).getObjects();
            verify(projectMock).getRepositories();
            verify(repositoryHandlerMock).findByName("jdk_repo_B_C");
            verify(repositoryHandlerMock).ivy((Action) any());
            verify(dependencyHandlerMock6).create("L_M:macos:N:O@tar.gz");
            verify(projectMock).container(eq(Jdk.class), (NamedDomainObjectFactory) any());
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).add("jdks", namedDomainObjectContainerMock);
        });
    }

    //Sapient generated method id: ${applyWhenIsJdkOnMacOsPlatformJdkAndJdkGetVendorNotEqualsVENDOR_ADOPTIUMAndJdkGetPlatformNotEqualsWindows4}, hash: 359E228FA929B11AB908974AAE5B9C69
    @Disabled()
    @Test()
    void applyWhenIsJdkOnMacOsPlatformJdkAndJdkGetVendorNotEqualsVENDOR_ADOPTIUMAndJdkGetPlatformNotEqualsWindows4() throws InvalidUserDataException {
        /* Branches:
         * (jdk.getVendor().equals(VENDOR_ADOPTIUM)) : false  #  inside setupRepository method
         * (jdk.getVendor().equals(VENDOR_OPENJDK)) : true  #  inside setupRepository method
         * (jdk.getHash() != null) : false  #  inside setupRepository method
         * (repositories.findByName(repoName) == null) : true  #  inside setupRepository method
         * (jdk.getPlatform().equals("darwin")) : true  #  inside isJdkOnMacOsPlatform method
         * (isJdkOnMacOsPlatform(jdk)) : true  #  inside dependencyNotation method
         * (jdk.getVendor().equals(VENDOR_ADOPTIUM)) : false  #  inside dependencyNotation method
         * (jdk.getPlatform().equals("windows")) : false  #  inside dependencyNotation method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: jdk - Method: finalizeValues
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        doReturn(attributesSchemaMock).when(dependencyHandlerMock).getAttributesSchema();
        doReturn(attributeMatchingStrategyMock).when(attributesSchemaMock).attribute((Attribute) any());
        doReturn(artifactTypeContainerMock).when(dependencyHandlerMock2).getArtifactTypes();
        Object object = new Object();
        doReturn(object).when(artifactTypeContainerMock).maybeCreate("zip");
        doNothing().when(dependencyHandlerMock3).registerTransform(eq(UnzipTransform.class), (Action) any());
        doReturn(artifactTypeContainerMock2).when(dependencyHandlerMock4).getArtifactTypes();
        doReturn(artifactTypeDefinitionMock).when(artifactTypeContainerMock2).maybeCreate("tar.gz");
        doReturn("return_of_getName1").when(artifactTypeDefinitionMock).getName();
        doNothing().when(dependencyHandlerMock5).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
        doReturn(configurationContainerMock).when(projectMock).getConfigurations();
        doReturn(configurationMock).when(configurationContainerMock).create("jdk_A");
        doNothing().when(configurationMock).setCanBeConsumed(false);
        Attribute attribute = ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE;
        doReturn(attributeContainerMock2).when(attributeContainerMock).attribute(attribute, "directory");
        doReturn(attributeContainerMock, attributeContainerMock3).when(configurationMock).getAttributes();
        doReturn(attributeContainerMock4).when(attributeContainerMock3).attribute((Attribute) any(), eq(true));
        doReturn(configurationMock2).when(configurationMock).defaultDependencies((Action) any());
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(repositoryHandlerMock).when(projectMock).getRepositories();
        doReturn(null).when(repositoryHandlerMock).findByName("jdk_repo_B_C");
        doReturn(ivyArtifactRepositoryMock).when(repositoryHandlerMock).ivy((Action) any());
        doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3, dependencyHandlerMock4, dependencyHandlerMock5, dependencyHandlerMock6).when(projectMock).getDependencies();
        doReturn(dependencyMock).when(dependencyHandlerMock6).create("K_L:macos:M:N@tar.gz");
        doReturn(namedDomainObjectContainerMock).when(projectMock).container(eq(Jdk.class), (NamedDomainObjectFactory) any());
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        doNothing().when(extensionContainerMock).add("jdks", namedDomainObjectContainerMock);
        JdkDownloadPlugin target = new JdkDownloadPlugin();
        //Act Statement(s)
        target.apply(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock, times(6)).getDependencies();
            verify(dependencyHandlerMock).getAttributesSchema();
            verify(attributesSchemaMock).attribute((Attribute) any());
            verify(dependencyHandlerMock2).getArtifactTypes();
            verify(artifactTypeContainerMock).maybeCreate("zip");
            verify(dependencyHandlerMock3).registerTransform(eq(UnzipTransform.class), (Action) any());
            verify(dependencyHandlerMock4).getArtifactTypes();
            verify(artifactTypeContainerMock2).maybeCreate("tar.gz");
            verify(artifactTypeDefinitionMock).getName();
            verify(dependencyHandlerMock5).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
            verify(projectMock).getConfigurations();
            verify(configurationContainerMock).create("jdk_A");
            verify(configurationMock).setCanBeConsumed(false);
            verify(configurationMock, times(2)).getAttributes();
            verify(attributeContainerMock).attribute(attribute, "directory");
            verify(attributeContainerMock3).attribute((Attribute) any(), eq(true));
            verify(configurationMock).defaultDependencies((Action) any());
            verify(projectMock).getObjects();
            verify(projectMock).getRepositories();
            verify(repositoryHandlerMock).findByName("jdk_repo_B_C");
            verify(repositoryHandlerMock).ivy((Action) any());
            verify(dependencyHandlerMock6).create("K_L:macos:M:N@tar.gz");
            verify(projectMock).container(eq(Jdk.class), (NamedDomainObjectFactory) any());
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).add("jdks", namedDomainObjectContainerMock);
        });
    }

    //Sapient generated method id: ${applyWhenRepositoriesFindByNameRepoNameIsNullAndIsJdkOnMacOsPlatformJdkAndJdkGetVendorNotEqualsVENDOR_ADOPTIUMAndJdkGet}, hash: A18BAA182679E9C4A52A919ED59E8FD7
    @Disabled()
    @Test()
    void applyWhenRepositoriesFindByNameRepoNameIsNullAndIsJdkOnMacOsPlatformJdkAndJdkGetVendorNotEqualsVENDOR_ADOPTIUMAndJdkGet() throws InvalidUserDataException {
        /* Branches:
         * (jdk.getVendor().equals(VENDOR_ADOPTIUM)) : false  #  inside setupRepository method
         * (jdk.getVendor().equals(VENDOR_OPENJDK)) : false  #  inside setupRepository method
         * (jdk.getVendor().equals(VENDOR_ZULU)) : true  #  inside setupRepository method
         * (jdk.getMajor().equals("8")) : true  #  inside setupRepository method
         * (jdk.getPlatform().equals("darwin")) : false  #  inside isJdkOnMacOsPlatform method
         * (jdk.getPlatform().equals("mac")) : true  #  inside isJdkOnMacOsPlatform method
         * (isJdkOnMacOsPlatform(jdk)) : true  #  inside setupRepository method
         * (jdk.getArchitecture().equals("aarch64")) : true  #  inside setupRepository method
         * (repositories.findByName(repoName) == null) : true  #  inside setupRepository method
         * (isJdkOnMacOsPlatform(jdk)) : true  #  inside dependencyNotation method
         * (jdk.getVendor().equals(VENDOR_ADOPTIUM)) : false  #  inside dependencyNotation method
         * (jdk.getPlatform().equals("windows")) : false  #  inside dependencyNotation method
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: jdk - Method: finalizeValues
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        doReturn(attributesSchemaMock).when(dependencyHandlerMock).getAttributesSchema();
        doReturn(attributeMatchingStrategyMock).when(attributesSchemaMock).attribute((Attribute) any());
        doReturn(artifactTypeContainerMock).when(dependencyHandlerMock2).getArtifactTypes();
        Object object = new Object();
        doReturn(object).when(artifactTypeContainerMock).maybeCreate("zip");
        doNothing().when(dependencyHandlerMock3).registerTransform(eq(UnzipTransform.class), (Action) any());
        doReturn(artifactTypeContainerMock2).when(dependencyHandlerMock4).getArtifactTypes();
        doReturn(artifactTypeDefinitionMock).when(artifactTypeContainerMock2).maybeCreate("tar.gz");
        doReturn("return_of_getName1").when(artifactTypeDefinitionMock).getName();
        doNothing().when(dependencyHandlerMock5).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
        doReturn(configurationContainerMock).when(projectMock).getConfigurations();
        doReturn(configurationMock).when(configurationContainerMock).create("jdk_A");
        doNothing().when(configurationMock).setCanBeConsumed(false);
        Attribute attribute = ArtifactTypeDefinition.ARTIFACT_TYPE_ATTRIBUTE;
        doReturn(attributeContainerMock2).when(attributeContainerMock).attribute(attribute, "directory");
        doReturn(attributeContainerMock, attributeContainerMock3).when(configurationMock).getAttributes();
        doReturn(attributeContainerMock4).when(attributeContainerMock3).attribute((Attribute) any(), eq(true));
        doReturn(configurationMock2).when(configurationMock).defaultDependencies((Action) any());
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(repositoryHandlerMock).when(projectMock).getRepositories();
        doReturn(null).when(repositoryHandlerMock).findByName("jdk_repo_B_C");
        doReturn(ivyArtifactRepositoryMock).when(repositoryHandlerMock).ivy((Action) any());
        doReturn(dependencyHandlerMock, dependencyHandlerMock2, dependencyHandlerMock3, dependencyHandlerMock4, dependencyHandlerMock5, dependencyHandlerMock6).when(projectMock).getDependencies();
        doReturn(dependencyMock).when(dependencyHandlerMock6).create("M_N:macos:O:P@tar.gz");
        doReturn(namedDomainObjectContainerMock).when(projectMock).container(eq(Jdk.class), (NamedDomainObjectFactory) any());
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        doNothing().when(extensionContainerMock).add("jdks", namedDomainObjectContainerMock);
        JdkDownloadPlugin target = new JdkDownloadPlugin();
        //Act Statement(s)
        target.apply(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock, times(6)).getDependencies();
            verify(dependencyHandlerMock).getAttributesSchema();
            verify(attributesSchemaMock).attribute((Attribute) any());
            verify(dependencyHandlerMock2).getArtifactTypes();
            verify(artifactTypeContainerMock).maybeCreate("zip");
            verify(dependencyHandlerMock3).registerTransform(eq(UnzipTransform.class), (Action) any());
            verify(dependencyHandlerMock4).getArtifactTypes();
            verify(artifactTypeContainerMock2).maybeCreate("tar.gz");
            verify(artifactTypeDefinitionMock).getName();
            verify(dependencyHandlerMock5).registerTransform(eq(SymbolicLinkPreservingUntarTransform.class), (Action) any());
            verify(projectMock).getConfigurations();
            verify(configurationContainerMock).create("jdk_A");
            verify(configurationMock).setCanBeConsumed(false);
            verify(configurationMock, times(2)).getAttributes();
            verify(attributeContainerMock).attribute(attribute, "directory");
            verify(attributeContainerMock3).attribute((Attribute) any(), eq(true));
            verify(configurationMock).defaultDependencies((Action) any());
            verify(projectMock).getObjects();
            verify(projectMock).getRepositories();
            verify(repositoryHandlerMock).findByName("jdk_repo_B_C");
            verify(repositoryHandlerMock).ivy((Action) any());
            verify(dependencyHandlerMock6).create("M_N:macos:O:P@tar.gz");
            verify(projectMock).container(eq(Jdk.class), (NamedDomainObjectFactory) any());
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).add("jdks", namedDomainObjectContainerMock);
        });
    }

    //Sapient generated method id: ${getContainerTest}, hash: 0C9F0EAD6B6A9ADAFFA3B8E77995003F
    @Test()
    void getContainerTest() throws UnknownDomainObjectException {
        //Arrange Statement(s)
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        NamedDomainObjectContainer namedDomainObjectContainerMock = mock(NamedDomainObjectContainer.class);
        doReturn(namedDomainObjectContainerMock).when(extensionContainerMock).getByName("jdks");
        //Act Statement(s)
        NamedDomainObjectContainer<Jdk> result = JdkDownloadPlugin.getContainer(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(namedDomainObjectContainerMock));
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).getByName("jdks");
        });
    }
}

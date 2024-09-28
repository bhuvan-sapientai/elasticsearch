package org.elasticsearch.gradle.internal.info;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.gradle.api.UnknownDomainObjectException;
import java.io.IOException;
import java.util.List;
import org.gradle.api.Transformer;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.execution.TaskExecutionGraph;
import org.gradle.internal.jvm.inspection.JvmMetadataDetector;
import org.gradle.api.GradleException;
import org.gradle.jvm.toolchain.JavaToolchainService;
import org.gradle.internal.jvm.inspection.JavaInstallationRegistry;
import org.gradle.internal.jvm.Jvm;
import org.gradle.api.invocation.Gradle;
import org.mockito.MockitoAnnotations;
import org.gradle.api.provider.Provider;
import org.elasticsearch.gradle.util.GradleUtils;
import java.util.concurrent.Callable;
import org.gradle.internal.jvm.inspection.JvmToolchainMetadata;
import org.gradle.api.provider.ProviderFactory;
import org.elasticsearch.gradle.internal.conventions.info.GitInfo;
import org.gradle.api.JavaVersion;
import java.util.ArrayList;
import org.gradle.util.GradleVersion;
import java.util.function.Consumer;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.jvm.toolchain.JavaLanguageVersion;
import org.mockito.stubbing.Answer;
import org.elasticsearch.gradle.VersionProperties;
import org.gradle.api.provider.Property;
import org.gradle.api.Action;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import org.gradle.jvm.toolchain.JavaLauncher;
import org.gradle.api.Project;
import org.gradle.api.model.ObjectFactory;
import java.nio.file.Path;
import org.gradle.api.plugins.JvmToolchainsPlugin;
import org.mockito.MockedStatic;
import java.io.File;
import org.gradle.jvm.toolchain.internal.InstallationLocation;
import org.gradle.api.Plugin;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
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
import static org.mockito.Mockito.atLeast;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class GlobalBuildInfoPluginSapientGeneratedTest {

    private final ObjectFactory objectFactoryMock = mock(ObjectFactory.class, "objectFactory");

    private final JavaToolchainService toolChainServiceMock = mock(JavaToolchainService.class, "toolChainService");

    private final ProviderFactory providersMock = mock(ProviderFactory.class, "providers");

    private final JavaInstallationRegistry javaInstallationRegistryMock = mock(JavaInstallationRegistry.class, "javaInstallationRegistry");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private GlobalBuildInfoPlugin target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${applyWhenProjectNotEqualsProjectGetRootProjectThrowsIllegalStateException}, hash: D9A1FFE86DA6EF55EFE28E04FDAB5E77
    @Test()
    void applyWhenProjectNotEqualsProjectGetRootProjectThrowsIllegalStateException() {
        /* Branches:
         * (project != project.getRootProject()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        Project projectMock2 = mock(Project.class);
        doReturn(projectMock2).when(projectMock).getRootProject();
        JvmMetadataDetector jvmMetadataDetectorMock = mock(JvmMetadataDetector.class);
        target = new GlobalBuildInfoPlugin(objectFactoryMock, javaInstallationRegistryMock, jvmMetadataDetectorMock, providersMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        IllegalStateException illegalStateException = new IllegalStateException("org.elasticsearch.gradle.internal.info.GlobalBuildInfoPlugin can only be applied to the root project.");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.apply(projectMock);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
            verify(projectMock).getRootProject();
        });
    }

    //Sapient generated method id: ${applyWhenGradleVersionCurrentCompareToMinimumGradleVersionLessThan0ThrowsGradleException}, hash: BFFF3E24658ABA6C27C93B935CB1A5CC
    @Test()
    void applyWhenGradleVersionCurrentCompareToMinimumGradleVersionLessThan0ThrowsGradleException() throws UnknownDomainObjectException {
        /* Branches:
         * (project != project.getRootProject()) : false
         * (GradleVersion.current().compareTo(minimumGradleVersion) < 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        Plugin pluginMock = mock(Plugin.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        GradleVersion gradleVersionMock = mock(GradleVersion.class);
        GradleVersion gradleVersionMock2 = mock(GradleVersion.class);
        JvmMetadataDetector jvmMetadataDetectorMock = mock(JvmMetadataDetector.class);
        try (MockedStatic<GradleVersion> gradleVersion = mockStatic(GradleVersion.class);
            MockedStatic<GlobalBuildInfoPlugin> globalBuildInfoPlugin = mockStatic(GlobalBuildInfoPlugin.class)) {
            doReturn(projectMock).when(projectMock).getRootProject();
            doReturn(pluginContainerMock).when(projectMock).getPlugins();
            doReturn(pluginMock).when(pluginContainerMock).apply(JvmToolchainsPlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(toolChainServiceMock).when(extensionContainerMock).getByType(JavaToolchainService.class);
            globalBuildInfoPlugin.when(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumGradleVersion")).thenReturn("return_of_getResourceContents1");
            gradleVersion.when(() -> GradleVersion.version("return_of_getResourceContents1")).thenReturn(gradleVersionMock);
            doReturn("A").when(gradleVersionMock).getVersion();
            gradleVersion.when(() -> GradleVersion.current()).thenReturn(gradleVersionMock2);
            doReturn(-1).when(gradleVersionMock2).compareTo(gradleVersionMock);
            target = new GlobalBuildInfoPlugin(objectFactoryMock, javaInstallationRegistryMock, jvmMetadataDetectorMock, providersMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            final GradleException result = assertThrows(GradleException.class, () -> {
                target.apply(projectMock);
            });
            GradleException gradleException = new GradleException("Gradle A+ is required");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(gradleException.getMessage()));
                verify(projectMock).getRootProject();
                verify(projectMock).getPlugins();
                verify(pluginContainerMock).apply(JvmToolchainsPlugin.class);
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByType(JavaToolchainService.class);
                globalBuildInfoPlugin.verify(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumGradleVersion"), atLeast(1));
                gradleVersion.verify(() -> GradleVersion.version("return_of_getResourceContents1"), atLeast(1));
                verify(gradleVersionMock).getVersion();
                gradleVersion.verify(() -> GradleVersion.current(), atLeast(1));
                verify(gradleVersionMock2).compareTo(gradleVersionMock);
            });
        }
    }

    //Sapient generated method id: ${applyWhenMinimumCompilerVersionCompareToCurrentVersionGreaterThan0ThrowsGradleException}, hash: D2381DBF9ECEDF7B6556FD35DF5BFB0F
    @Disabled()
    @Test()
    void applyWhenMinimumCompilerVersionCompareToCurrentVersionGreaterThan0ThrowsGradleException() throws UnknownDomainObjectException {
        /* Branches:
         * (project != project.getRootProject()) : false
         * (GradleVersion.current().compareTo(minimumGradleVersion) < 0) : false
         * (runtimeJavaProperty != null) : true  #  inside findRuntimeJavaHome method
         * (isExplicitRuntimeJavaHomeSet) : true
         * (System.getProperty("idea.active", "false").equals("true") == false) : true  #  inside assertMinimumCompilerVersion method
         * (minimumCompilerVersion.compareTo(currentVersion) > 0) : true  #  inside assertMinimumCompilerVersion method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        Plugin pluginMock = mock(Plugin.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        Property propertyMock = mock(Property.class);
        Property<JavaLanguageVersion> propertyMock2 = mock(Property.class);
        JavaLanguageVersion javaLanguageVersionMock = mock(JavaLanguageVersion.class);
        Provider<JavaLauncher> providerMock = mock(Provider.class);
        Provider<File> providerMock2 = mock(Provider.class);
        GitInfo gitInfoMock = mock(GitInfo.class);
        GradleVersion gradleVersionMock = mock(GradleVersion.class);
        GradleVersion gradleVersionMock2 = mock(GradleVersion.class);
        JvmMetadataDetector jvmMetadataDetectorMock = mock(JvmMetadataDetector.class);
        try (MockedStatic<JavaVersion> javaVersion = mockStatic(JavaVersion.class, CALLS_REAL_METHODS);
            MockedStatic<JavaLanguageVersion> javaLanguageVersion = mockStatic(JavaLanguageVersion.class);
            MockedStatic<GradleVersion> gradleVersion = mockStatic(GradleVersion.class);
            MockedStatic<GlobalBuildInfoPlugin> globalBuildInfoPlugin = mockStatic(GlobalBuildInfoPlugin.class, CALLS_REAL_METHODS);
            MockedStatic<GitInfo> gitInfo = mockStatic(GitInfo.class);
            MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            doReturn(projectMock).when(projectMock).getRootProject();
            doReturn(pluginContainerMock).when(projectMock).getPlugins();
            doReturn(pluginMock).when(pluginContainerMock).apply(JvmToolchainsPlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(toolChainServiceMock).when(extensionContainerMock).getByType(JavaToolchainService.class);
            File file = new File("pathname1");
            doReturn(file).when(projectMock).getRootDir();
            doReturn(propertyMock).when(objectFactoryMock).property(JavaLanguageVersion.class);
            doReturn(propertyMock2).when(propertyMock).value(javaLanguageVersionMock);
            doReturn(providerMock).when(toolChainServiceMock).launcherFor((Action) any());
            doReturn(providerMock2).when(providerMock).map((Transformer) any());
            doReturn(true).when(providerMock2).isPresent();
            buildParams.when(() -> BuildParams.init((Consumer) any())).thenAnswer((Answer<Void>) invocation -> null);
            gitInfo.when(() -> GitInfo.gitInfo(file)).thenReturn(gitInfoMock);
            globalBuildInfoPlugin.when(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumGradleVersion")).thenReturn("return_of_getResourceContents1");
            globalBuildInfoPlugin.when(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumCompilerVersion")).thenReturn("A");
            globalBuildInfoPlugin.when(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumRuntimeVersion")).thenReturn("B");
            gradleVersion.when(() -> GradleVersion.version("return_of_getResourceContents1")).thenReturn(gradleVersionMock);
            gradleVersion.when(() -> GradleVersion.current()).thenReturn(gradleVersionMock2);
            doReturn(0).when(gradleVersionMock2).compareTo(gradleVersionMock);
            javaLanguageVersion.when(() -> JavaLanguageVersion.of("string4")).thenReturn(javaLanguageVersionMock);
            javaVersion.when(() -> JavaVersion.toVersion("A")).thenReturn(JavaVersion.VERSION_27);
            javaVersion.when(() -> JavaVersion.toVersion("B")).thenReturn(JavaVersion.VERSION_1_1);
            target = new GlobalBuildInfoPlugin(objectFactoryMock, javaInstallationRegistryMock, jvmMetadataDetectorMock, providersMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            final GradleException result = assertThrows(GradleException.class, () -> {
                target.apply(projectMock);
            });
            GradleException gradleException = new GradleException("Project requires Java version of VERSION_27 or newer but Gradle JAVA_HOME is 21");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(gradleException.getMessage()));
                verify(projectMock, atLeast(1)).getRootProject();
                verify(projectMock, atLeast(1)).getPlugins();
                verify(pluginContainerMock, atLeast(1)).apply(JvmToolchainsPlugin.class);
                verify(projectMock, atLeast(1)).getExtensions();
                verify(extensionContainerMock, atLeast(1)).getByType(JavaToolchainService.class);
                verify(projectMock, atLeast(1)).getRootDir();
                verify(objectFactoryMock, atLeast(1)).property(JavaLanguageVersion.class);
                verify(propertyMock, atLeast(1)).value(javaLanguageVersionMock);
                verify(toolChainServiceMock, atLeast(1)).launcherFor((Action) any());
                verify(providerMock, atLeast(1)).map((Transformer) any());
                verify(providerMock2, atLeast(1)).isPresent();
                buildParams.verify(() -> BuildParams.init((Consumer) any()), atLeast(1));
                gitInfo.verify(() -> GitInfo.gitInfo(file), atLeast(1));
                globalBuildInfoPlugin.verify(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumGradleVersion"), atLeast(1));
                globalBuildInfoPlugin.verify(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumCompilerVersion"), atLeast(1));
                globalBuildInfoPlugin.verify(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumRuntimeVersion"), atLeast(1));
                gradleVersion.verify(() -> GradleVersion.version("return_of_getResourceContents1"), atLeast(1));
                gradleVersion.verify(() -> GradleVersion.current(), atLeast(1));
                verify(gradleVersionMock2, atLeast(1)).compareTo(gradleVersionMock);
                javaLanguageVersion.verify(() -> JavaLanguageVersion.of("string4"), atLeast(1));
                javaVersion.verify(() -> JavaVersion.toVersion("A"), atLeast(1));
                javaVersion.verify(() -> JavaVersion.toVersion("B"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenNotIsExplicitRuntimeJavaHomeSetAndSystemGetPropertyIdea_activeFalseEqualsTrueNotEqualsFalseAndGradleUtilsIsInc}, hash: 5A94BAB3F3CACEF40A05B168AE520CA2
    @Disabled()
    @Test()
    void applyWhenNotIsExplicitRuntimeJavaHomeSetAndSystemGetPropertyIdea_activeFalseEqualsTrueNotEqualsFalseAndGradleUtilsIsInc() throws UnknownDomainObjectException {
        /* Branches:
         * (project != project.getRootProject()) : false
         * (GradleVersion.current().compareTo(minimumGradleVersion) < 0) : false
         * (runtimeJavaProperty != null) : false  #  inside findRuntimeJavaHome method
         * (System.getenv("RUNTIME_JAVA_HOME") != null) : true  #  inside findRuntimeJavaHome method
         * (isExplicitRuntimeJavaHomeSet) : false
         * (System.getProperty("idea.active", "false").equals("true") == false) : false  #  inside assertMinimumCompilerVersion method
         * (GradleUtils.isIncludedBuild(project) == false) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        Plugin pluginMock = mock(Plugin.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        Provider<File> providerMock = mock(Provider.class);
        Property propertyMock = mock(Property.class);
        Property<JavaLanguageVersion> propertyMock2 = mock(Property.class);
        JavaLanguageVersion javaLanguageVersionMock = mock(JavaLanguageVersion.class);
        Provider<JavaLauncher> providerMock2 = mock(Provider.class);
        Provider<File> providerMock3 = mock(Provider.class);
        GitInfo gitInfoMock = mock(GitInfo.class);
        GradleVersion gradleVersionMock = mock(GradleVersion.class);
        GradleVersion gradleVersionMock2 = mock(GradleVersion.class);
        JvmMetadataDetector jvmMetadataDetectorMock = mock(JvmMetadataDetector.class);
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<JavaVersion> javaVersion = mockStatic(JavaVersion.class, CALLS_REAL_METHODS);
            MockedStatic<JavaLanguageVersion> javaLanguageVersion = mockStatic(JavaLanguageVersion.class);
            MockedStatic<GradleVersion> gradleVersion = mockStatic(GradleVersion.class);
            MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class);
            MockedStatic<GlobalBuildInfoPlugin> globalBuildInfoPlugin = mockStatic(GlobalBuildInfoPlugin.class, CALLS_REAL_METHODS);
            MockedStatic<GitInfo> gitInfo = mockStatic(GitInfo.class);
            MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            doReturn(projectMock).when(projectMock).getRootProject();
            doReturn(pluginContainerMock).when(projectMock).getPlugins();
            doReturn(pluginMock).when(pluginContainerMock).apply(JvmToolchainsPlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(toolChainServiceMock).when(extensionContainerMock).getByType(JavaToolchainService.class);
            File file = new File("pathname1");
            doReturn(file).when(projectMock).getRootDir();
            doReturn(providerMock).when(providersMock).provider((Callable) any());
            doReturn(false).when(providerMock).isPresent();
            doReturn(propertyMock).when(objectFactoryMock).property(JavaLanguageVersion.class);
            doReturn(propertyMock2).when(propertyMock).value(javaLanguageVersionMock);
            doReturn(providerMock2).when(toolChainServiceMock).launcherFor((Action) any());
            doReturn(providerMock3).when(providerMock2).map((Transformer) any());
            buildParams.when(() -> BuildParams.init((Consumer) any())).thenAnswer((Answer<Void>) invocation -> null);
            gitInfo.when(() -> GitInfo.gitInfo(file)).thenReturn(gitInfoMock);
            globalBuildInfoPlugin.when(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumGradleVersion")).thenReturn("return_of_getResourceContents1");
            globalBuildInfoPlugin.when(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumCompilerVersion")).thenReturn("A");
            globalBuildInfoPlugin.when(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumRuntimeVersion")).thenReturn("B");
            gradleUtils.when(() -> GradleUtils.isIncludedBuild(projectMock)).thenReturn(true);
            gradleVersion.when(() -> GradleVersion.version("return_of_getResourceContents1")).thenReturn(gradleVersionMock);
            gradleVersion.when(() -> GradleVersion.current()).thenReturn(gradleVersionMock2);
            doReturn(0).when(gradleVersionMock2).compareTo(gradleVersionMock);
            javaLanguageVersion.when(() -> JavaLanguageVersion.of("return_of_getBundledJdkMajorVersion1")).thenReturn(javaLanguageVersionMock);
            javaVersion.when(() -> JavaVersion.toVersion("A")).thenReturn(JavaVersion.VERSION_1_1);
            javaVersion.when(() -> JavaVersion.toVersion("B")).thenReturn(JavaVersion.VERSION_1_1);
            versionProperties.when(() -> VersionProperties.getBundledJdkMajorVersion()).thenReturn("return_of_getBundledJdkMajorVersion1");
            target = new GlobalBuildInfoPlugin(objectFactoryMock, javaInstallationRegistryMock, jvmMetadataDetectorMock, providersMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, atLeast(1)).getRootProject();
                verify(projectMock, atLeast(1)).getPlugins();
                verify(pluginContainerMock, atLeast(1)).apply(JvmToolchainsPlugin.class);
                verify(projectMock, atLeast(1)).getExtensions();
                verify(extensionContainerMock, atLeast(1)).getByType(JavaToolchainService.class);
                verify(projectMock, atLeast(1)).getRootDir();
                verify(providersMock, atLeast(1)).provider((Callable) any());
                verify(providerMock, atLeast(1)).isPresent();
                verify(objectFactoryMock, atLeast(1)).property(JavaLanguageVersion.class);
                verify(propertyMock, atLeast(1)).value(javaLanguageVersionMock);
                verify(toolChainServiceMock, atLeast(1)).launcherFor((Action) any());
                verify(providerMock2, atLeast(1)).map((Transformer) any());
                buildParams.verify(() -> BuildParams.init((Consumer) any()), atLeast(1));
                gitInfo.verify(() -> GitInfo.gitInfo(file), atLeast(1));
                globalBuildInfoPlugin.verify(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumGradleVersion"), atLeast(1));
                globalBuildInfoPlugin.verify(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumCompilerVersion"), atLeast(1));
                globalBuildInfoPlugin.verify(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumRuntimeVersion"), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.isIncludedBuild(projectMock), atLeast(1));
                gradleVersion.verify(() -> GradleVersion.version("return_of_getResourceContents1"), atLeast(1));
                gradleVersion.verify(() -> GradleVersion.current(), atLeast(1));
                verify(gradleVersionMock2, atLeast(1)).compareTo(gradleVersionMock);
                javaLanguageVersion.verify(() -> JavaLanguageVersion.of("return_of_getBundledJdkMajorVersion1"), atLeast(1));
                javaVersion.verify(() -> JavaVersion.toVersion("A"), atLeast(1));
                javaVersion.verify(() -> JavaVersion.toVersion("B"), atLeast(1));
                versionProperties.verify(() -> VersionProperties.getBundledJdkMajorVersion(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenCaughtIOExceptionThrowsUncheckedIOException}, hash: 50E383876B365C4596341D9CE54E3B68
    @Disabled()
    @Test()
    void applyWhenCaughtIOExceptionThrowsUncheckedIOException() throws UnknownDomainObjectException, IOException {
        /* Branches:
         * (project != project.getRootProject()) : false
         * (GradleVersion.current().compareTo(minimumGradleVersion) < 0) : false
         * (runtimeJavaProperty != null) : true  #  inside findRuntimeJavaHome method
         * (isExplicitRuntimeJavaHomeSet) : true
         * (System.getProperty("idea.active", "false").equals("true") == false) : true  #  inside assertMinimumCompilerVersion method
         * (minimumCompilerVersion.compareTo(currentVersion) > 0) : false  #  inside assertMinimumCompilerVersion method
         * (GradleUtils.isIncludedBuild(project) == false) : true
         * (catch-exception (IOException)) : true  #  inside isSameFile method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        Plugin pluginMock = mock(Plugin.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        Gradle gradleMock = mock(Gradle.class);
        TaskExecutionGraph taskExecutionGraphMock = mock(TaskExecutionGraph.class);
        Property propertyMock = mock(Property.class);
        Property<JavaLanguageVersion> propertyMock2 = mock(Property.class);
        JavaLanguageVersion javaLanguageVersionMock = mock(JavaLanguageVersion.class);
        Provider<JavaLauncher> providerMock = mock(Provider.class);
        Provider<File> providerMock2 = mock(Provider.class);
        JvmToolchainMetadata jvmToolchainMetadataMock = mock(JvmToolchainMetadata.class);
        Path pathMock = mock(Path.class);
        GitInfo gitInfoMock = mock(GitInfo.class);
        GradleVersion gradleVersionMock = mock(GradleVersion.class);
        GradleVersion gradleVersionMock2 = mock(GradleVersion.class);
        JvmMetadataDetector jvmMetadataDetectorMock = mock(JvmMetadataDetector.class);
        try (MockedStatic<JavaVersion> javaVersion = mockStatic(JavaVersion.class, CALLS_REAL_METHODS);
            MockedStatic<JavaLanguageVersion> javaLanguageVersion = mockStatic(JavaLanguageVersion.class);
            MockedStatic<GradleVersion> gradleVersion = mockStatic(GradleVersion.class);
            MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class);
            MockedStatic<GlobalBuildInfoPlugin> globalBuildInfoPlugin = mockStatic(GlobalBuildInfoPlugin.class, CALLS_REAL_METHODS);
            MockedStatic<GitInfo> gitInfo = mockStatic(GitInfo.class);
            MockedStatic<Files> files = mockStatic(Files.class);
            MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            doReturn(projectMock).when(projectMock).getRootProject();
            doReturn(pluginContainerMock).when(projectMock).getPlugins();
            doReturn(pluginMock).when(pluginContainerMock).apply(JvmToolchainsPlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(toolChainServiceMock).when(extensionContainerMock).getByType(JavaToolchainService.class);
            File file = new File("pathname1");
            doReturn(file).when(projectMock).getRootDir();
            doReturn(gradleMock).when(projectMock).getGradle();
            doReturn(taskExecutionGraphMock).when(gradleMock).getTaskGraph();
            doNothing().when(taskExecutionGraphMock).whenReady((Action) any());
            doReturn(propertyMock).when(objectFactoryMock).property(JavaLanguageVersion.class);
            doReturn(propertyMock2).when(propertyMock).value(javaLanguageVersionMock);
            doReturn(providerMock).when(toolChainServiceMock).launcherFor((Action) any());
            doReturn(providerMock2).when(providerMock).map((Transformer) any());
            doReturn(true).when(providerMock2).isPresent();
            List<JvmToolchainMetadata> jvmToolchainMetadataList = new ArrayList<>();
            jvmToolchainMetadataList.add(jvmToolchainMetadataMock);
            doReturn(jvmToolchainMetadataList).when(javaInstallationRegistryMock).toolchains();
            buildParams.when(() -> BuildParams.init((Consumer) any())).thenAnswer((Answer<Void>) invocation -> null);
            files.when(() -> Files.isSameFile((Path) any(), eq(pathMock))).thenReturn(false);
            gitInfo.when(() -> GitInfo.gitInfo(file)).thenReturn(gitInfoMock);
            globalBuildInfoPlugin.when(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumGradleVersion")).thenReturn("return_of_getResourceContents1");
            globalBuildInfoPlugin.when(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumCompilerVersion")).thenReturn("A");
            globalBuildInfoPlugin.when(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumRuntimeVersion")).thenReturn("B");
            gradleUtils.when(() -> GradleUtils.isIncludedBuild(projectMock)).thenReturn(false);
            gradleVersion.when(() -> GradleVersion.version("return_of_getResourceContents1")).thenReturn(gradleVersionMock);
            gradleVersion.when(() -> GradleVersion.current()).thenReturn(gradleVersionMock2);
            doReturn(0).when(gradleVersionMock2).compareTo(gradleVersionMock);
            javaLanguageVersion.when(() -> JavaLanguageVersion.of("string4")).thenReturn(javaLanguageVersionMock);
            javaVersion.when(() -> JavaVersion.toVersion("A")).thenReturn(JavaVersion.VERSION_1_1);
            javaVersion.when(() -> JavaVersion.toVersion("B")).thenReturn(JavaVersion.VERSION_1_1);
            File file2 = new File("pathname1");
            InstallationLocation installationLocation = InstallationLocation.userDefined(file2, "source1");
            jvmToolchainMetadataMock.location = installationLocation;
            target = new GlobalBuildInfoPlugin(objectFactoryMock, javaInstallationRegistryMock, jvmMetadataDetectorMock, providersMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            final UncheckedIOException result = assertThrows(UncheckedIOException.class, () -> {
                target.apply(projectMock);
            });
            IOException iOException = new IOException();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
                verify(projectMock, atLeast(1)).getRootProject();
                verify(projectMock, atLeast(1)).getPlugins();
                verify(pluginContainerMock, atLeast(1)).apply(JvmToolchainsPlugin.class);
                verify(projectMock, atLeast(1)).getExtensions();
                verify(extensionContainerMock, atLeast(1)).getByType(JavaToolchainService.class);
                verify(projectMock, atLeast(1)).getRootDir();
                verify(projectMock, atLeast(1)).getGradle();
                verify(gradleMock, atLeast(1)).getTaskGraph();
                verify(taskExecutionGraphMock, atLeast(1)).whenReady((Action) any());
                verify(objectFactoryMock, atLeast(1)).property(JavaLanguageVersion.class);
                verify(propertyMock, atLeast(1)).value(javaLanguageVersionMock);
                verify(toolChainServiceMock, atLeast(1)).launcherFor((Action) any());
                verify(providerMock, atLeast(1)).map((Transformer) any());
                verify(providerMock2, atLeast(1)).isPresent();
                verify(javaInstallationRegistryMock, atLeast(1)).toolchains();
                buildParams.verify(() -> BuildParams.init((Consumer) any()), atLeast(1));
                files.verify(() -> Files.isSameFile((Path) any(), eq(pathMock)), atLeast(1));
                gitInfo.verify(() -> GitInfo.gitInfo(file), atLeast(1));
                globalBuildInfoPlugin.verify(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumGradleVersion"), atLeast(1));
                globalBuildInfoPlugin.verify(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumCompilerVersion"), atLeast(1));
                globalBuildInfoPlugin.verify(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumRuntimeVersion"), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.isIncludedBuild(projectMock), atLeast(1));
                gradleVersion.verify(() -> GradleVersion.version("return_of_getResourceContents1"), atLeast(1));
                gradleVersion.verify(() -> GradleVersion.current(), atLeast(1));
                verify(gradleVersionMock2, atLeast(1)).compareTo(gradleVersionMock);
                javaLanguageVersion.verify(() -> JavaLanguageVersion.of("string4"), atLeast(1));
                javaVersion.verify(() -> JavaVersion.toVersion("A"), atLeast(1));
                javaVersion.verify(() -> JavaVersion.toVersion("B"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenSystemGetPropertyIdea_activeFalseEqualsTrueNotEqualsFalseAndGradleUtilsIsIncludedBuildProjectNotEqualsFalse2}, hash: 27AB358FA599F5B37AA74C357AB99E4E
    @Disabled()
    @Test()
    void applyWhenSystemGetPropertyIdea_activeFalseEqualsTrueNotEqualsFalseAndGradleUtilsIsIncludedBuildProjectNotEqualsFalse2() throws UnknownDomainObjectException {
        /* Branches:
         * (project != project.getRootProject()) : false
         * (GradleVersion.current().compareTo(minimumGradleVersion) < 0) : false
         * (runtimeJavaProperty != null) : false  #  inside findRuntimeJavaHome method
         * (System.getenv("RUNTIME_JAVA_HOME") != null) : false  #  inside findRuntimeJavaHome method
         * (env == null) : true  #  inside lambda$findRuntimeJavaHome$14 method
         * (isExplicitRuntimeJavaHomeSet) : false
         * (System.getProperty("idea.active", "false").equals("true") == false) : false  #  inside assertMinimumCompilerVersion method
         * (GradleUtils.isIncludedBuild(project) == false) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        Plugin pluginMock = mock(Plugin.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        Provider<File> providerMock = mock(Provider.class);
        Property propertyMock = mock(Property.class);
        Property<JavaLanguageVersion> propertyMock2 = mock(Property.class);
        JavaLanguageVersion javaLanguageVersionMock = mock(JavaLanguageVersion.class);
        Provider<JavaLauncher> providerMock2 = mock(Provider.class);
        Provider<File> providerMock3 = mock(Provider.class);
        GitInfo gitInfoMock = mock(GitInfo.class);
        GradleVersion gradleVersionMock = mock(GradleVersion.class);
        GradleVersion gradleVersionMock2 = mock(GradleVersion.class);
        JvmMetadataDetector jvmMetadataDetectorMock = mock(JvmMetadataDetector.class);
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<JavaVersion> javaVersion = mockStatic(JavaVersion.class, CALLS_REAL_METHODS);
            MockedStatic<JavaLanguageVersion> javaLanguageVersion = mockStatic(JavaLanguageVersion.class);
            MockedStatic<GradleVersion> gradleVersion = mockStatic(GradleVersion.class);
            MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class);
            MockedStatic<GlobalBuildInfoPlugin> globalBuildInfoPlugin = mockStatic(GlobalBuildInfoPlugin.class, CALLS_REAL_METHODS);
            MockedStatic<GitInfo> gitInfo = mockStatic(GitInfo.class);
            MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            doReturn(projectMock).when(projectMock).getRootProject();
            doReturn(pluginContainerMock).when(projectMock).getPlugins();
            doReturn(pluginMock).when(pluginContainerMock).apply(JvmToolchainsPlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(toolChainServiceMock).when(extensionContainerMock).getByType(JavaToolchainService.class);
            File file = new File("pathname1");
            doReturn(file).when(projectMock).getRootDir();
            doReturn(providerMock).when(providersMock).provider((Callable) any());
            doReturn(false).when(providerMock).isPresent();
            doReturn(propertyMock).when(objectFactoryMock).property(JavaLanguageVersion.class);
            doReturn(propertyMock2).when(propertyMock).value(javaLanguageVersionMock);
            doReturn(providerMock2).when(toolChainServiceMock).launcherFor((Action) any());
            doReturn(providerMock3).when(providerMock2).map((Transformer) any());
            buildParams.when(() -> BuildParams.init((Consumer) any())).thenAnswer((Answer<Void>) invocation -> null);
            gitInfo.when(() -> GitInfo.gitInfo(file)).thenReturn(gitInfoMock);
            globalBuildInfoPlugin.when(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumGradleVersion")).thenReturn("return_of_getResourceContents1");
            globalBuildInfoPlugin.when(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumCompilerVersion")).thenReturn("A");
            globalBuildInfoPlugin.when(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumRuntimeVersion")).thenReturn("B");
            gradleUtils.when(() -> GradleUtils.isIncludedBuild(projectMock)).thenReturn(true);
            gradleVersion.when(() -> GradleVersion.version("return_of_getResourceContents1")).thenReturn(gradleVersionMock);
            gradleVersion.when(() -> GradleVersion.current()).thenReturn(gradleVersionMock2);
            doReturn(0).when(gradleVersionMock2).compareTo(gradleVersionMock);
            javaLanguageVersion.when(() -> JavaLanguageVersion.of("return_of_getBundledJdkMajorVersion1")).thenReturn(javaLanguageVersionMock);
            javaVersion.when(() -> JavaVersion.toVersion("A")).thenReturn(JavaVersion.VERSION_1_1);
            javaVersion.when(() -> JavaVersion.toVersion("B")).thenReturn(JavaVersion.VERSION_1_1);
            versionProperties.when(() -> VersionProperties.getBundledJdkMajorVersion()).thenReturn("return_of_getBundledJdkMajorVersion1");
            target = new GlobalBuildInfoPlugin(objectFactoryMock, javaInstallationRegistryMock, jvmMetadataDetectorMock, providersMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, atLeast(1)).getRootProject();
                verify(projectMock, atLeast(1)).getPlugins();
                verify(pluginContainerMock, atLeast(1)).apply(JvmToolchainsPlugin.class);
                verify(projectMock, atLeast(1)).getExtensions();
                verify(extensionContainerMock, atLeast(1)).getByType(JavaToolchainService.class);
                verify(projectMock, atLeast(1)).getRootDir();
                verify(providersMock, atLeast(1)).provider((Callable) any());
                verify(providerMock, atLeast(1)).isPresent();
                verify(objectFactoryMock, atLeast(1)).property(JavaLanguageVersion.class);
                verify(propertyMock, atLeast(1)).value(javaLanguageVersionMock);
                verify(toolChainServiceMock, atLeast(1)).launcherFor((Action) any());
                verify(providerMock2, atLeast(1)).map((Transformer) any());
                buildParams.verify(() -> BuildParams.init((Consumer) any()), atLeast(1));
                gitInfo.verify(() -> GitInfo.gitInfo(file), atLeast(1));
                globalBuildInfoPlugin.verify(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumGradleVersion"), atLeast(1));
                globalBuildInfoPlugin.verify(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumCompilerVersion"), atLeast(1));
                globalBuildInfoPlugin.verify(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumRuntimeVersion"), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.isIncludedBuild(projectMock), atLeast(1));
                gradleVersion.verify(() -> GradleVersion.version("return_of_getResourceContents1"), atLeast(1));
                gradleVersion.verify(() -> GradleVersion.current(), atLeast(1));
                verify(gradleVersionMock2, atLeast(1)).compareTo(gradleVersionMock);
                javaLanguageVersion.verify(() -> JavaLanguageVersion.of("return_of_getBundledJdkMajorVersion1"), atLeast(1));
                javaVersion.verify(() -> JavaVersion.toVersion("A"), atLeast(1));
                javaVersion.verify(() -> JavaVersion.toVersion("B"), atLeast(1));
                versionProperties.verify(() -> VersionProperties.getBundledJdkMajorVersion(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenSystemGetPropertyIdea_activeFalseEqualsTrueNotEqualsFalseAndGradleUtilsIsIncludedBuildProjectNotEqualsFalse3}, hash: DC4DB240B54DDBE339254A3C23642901
    @Disabled()
    @Test()
    void applyWhenSystemGetPropertyIdea_activeFalseEqualsTrueNotEqualsFalseAndGradleUtilsIsIncludedBuildProjectNotEqualsFalse3() throws UnknownDomainObjectException {
        /* Branches:
         * (project != project.getRootProject()) : false
         * (GradleVersion.current().compareTo(minimumGradleVersion) < 0) : false
         * (runtimeJavaProperty != null) : false  #  inside findRuntimeJavaHome method
         * (System.getenv("RUNTIME_JAVA_HOME") != null) : false  #  inside findRuntimeJavaHome method
         * (env == null) : false  #  inside lambda$findRuntimeJavaHome$14 method
         * (isExplicitRuntimeJavaHomeSet) : false
         * (System.getProperty("idea.active", "false").equals("true") == false) : false  #  inside assertMinimumCompilerVersion method
         * (GradleUtils.isIncludedBuild(project) == false) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        Plugin pluginMock = mock(Plugin.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        Provider<File> providerMock = mock(Provider.class);
        Property propertyMock = mock(Property.class);
        Property<JavaLanguageVersion> propertyMock2 = mock(Property.class);
        JavaLanguageVersion javaLanguageVersionMock = mock(JavaLanguageVersion.class);
        Provider<JavaLauncher> providerMock2 = mock(Provider.class);
        Provider<File> providerMock3 = mock(Provider.class);
        GitInfo gitInfoMock = mock(GitInfo.class);
        GradleVersion gradleVersionMock = mock(GradleVersion.class);
        GradleVersion gradleVersionMock2 = mock(GradleVersion.class);
        JvmMetadataDetector jvmMetadataDetectorMock = mock(JvmMetadataDetector.class);
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<JavaVersion> javaVersion = mockStatic(JavaVersion.class, CALLS_REAL_METHODS);
            MockedStatic<JavaLanguageVersion> javaLanguageVersion = mockStatic(JavaLanguageVersion.class);
            MockedStatic<GradleVersion> gradleVersion = mockStatic(GradleVersion.class);
            MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class);
            MockedStatic<GlobalBuildInfoPlugin> globalBuildInfoPlugin = mockStatic(GlobalBuildInfoPlugin.class, CALLS_REAL_METHODS);
            MockedStatic<GitInfo> gitInfo = mockStatic(GitInfo.class);
            MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            doReturn(projectMock).when(projectMock).getRootProject();
            doReturn(pluginContainerMock).when(projectMock).getPlugins();
            doReturn(pluginMock).when(pluginContainerMock).apply(JvmToolchainsPlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(toolChainServiceMock).when(extensionContainerMock).getByType(JavaToolchainService.class);
            File file = new File("pathname1");
            doReturn(file).when(projectMock).getRootDir();
            doReturn(providerMock).when(providersMock).provider((Callable) any());
            doReturn(false).when(providerMock).isPresent();
            doReturn(propertyMock).when(objectFactoryMock).property(JavaLanguageVersion.class);
            doReturn(propertyMock2).when(propertyMock).value(javaLanguageVersionMock);
            doReturn(providerMock2).when(toolChainServiceMock).launcherFor((Action) any());
            doReturn(providerMock3).when(providerMock2).map((Transformer) any());
            buildParams.when(() -> BuildParams.init((Consumer) any())).thenAnswer((Answer<Void>) invocation -> null);
            gitInfo.when(() -> GitInfo.gitInfo(file)).thenReturn(gitInfoMock);
            globalBuildInfoPlugin.when(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumGradleVersion")).thenReturn("return_of_getResourceContents1");
            globalBuildInfoPlugin.when(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumCompilerVersion")).thenReturn("A");
            globalBuildInfoPlugin.when(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumRuntimeVersion")).thenReturn("B");
            gradleUtils.when(() -> GradleUtils.isIncludedBuild(projectMock)).thenReturn(true);
            gradleVersion.when(() -> GradleVersion.version("return_of_getResourceContents1")).thenReturn(gradleVersionMock);
            gradleVersion.when(() -> GradleVersion.current()).thenReturn(gradleVersionMock2);
            doReturn(0).when(gradleVersionMock2).compareTo(gradleVersionMock);
            javaLanguageVersion.when(() -> JavaLanguageVersion.of("return_of_getBundledJdkMajorVersion1")).thenReturn(javaLanguageVersionMock);
            javaVersion.when(() -> JavaVersion.toVersion("A")).thenReturn(JavaVersion.VERSION_1_1);
            javaVersion.when(() -> JavaVersion.toVersion("B")).thenReturn(JavaVersion.VERSION_1_1);
            versionProperties.when(() -> VersionProperties.getBundledJdkMajorVersion()).thenReturn("return_of_getBundledJdkMajorVersion1");
            target = new GlobalBuildInfoPlugin(objectFactoryMock, javaInstallationRegistryMock, jvmMetadataDetectorMock, providersMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, atLeast(1)).getRootProject();
                verify(projectMock, atLeast(1)).getPlugins();
                verify(pluginContainerMock, atLeast(1)).apply(JvmToolchainsPlugin.class);
                verify(projectMock, atLeast(1)).getExtensions();
                verify(extensionContainerMock, atLeast(1)).getByType(JavaToolchainService.class);
                verify(projectMock, atLeast(1)).getRootDir();
                verify(providersMock, atLeast(1)).provider((Callable) any());
                verify(providerMock, atLeast(1)).isPresent();
                verify(objectFactoryMock, atLeast(1)).property(JavaLanguageVersion.class);
                verify(propertyMock, atLeast(1)).value(javaLanguageVersionMock);
                verify(toolChainServiceMock, atLeast(1)).launcherFor((Action) any());
                verify(providerMock2, atLeast(1)).map((Transformer) any());
                buildParams.verify(() -> BuildParams.init((Consumer) any()), atLeast(1));
                gitInfo.verify(() -> GitInfo.gitInfo(file), atLeast(1));
                globalBuildInfoPlugin.verify(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumGradleVersion"), atLeast(1));
                globalBuildInfoPlugin.verify(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumCompilerVersion"), atLeast(1));
                globalBuildInfoPlugin.verify(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumRuntimeVersion"), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.isIncludedBuild(projectMock), atLeast(1));
                gradleVersion.verify(() -> GradleVersion.version("return_of_getResourceContents1"), atLeast(1));
                gradleVersion.verify(() -> GradleVersion.current(), atLeast(1));
                verify(gradleVersionMock2, atLeast(1)).compareTo(gradleVersionMock);
                javaLanguageVersion.verify(() -> JavaLanguageVersion.of("return_of_getBundledJdkMajorVersion1"), atLeast(1));
                javaVersion.verify(() -> JavaVersion.toVersion("A"), atLeast(1));
                javaVersion.verify(() -> JavaVersion.toVersion("B"), atLeast(1));
                versionProperties.verify(() -> VersionProperties.getBundledJdkMajorVersion(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenBuildParamsGetIsRuntimeJavaHomeSetThrowsGradleException}, hash: 5A2BAEFB0730146ACE948C7AB33B1236
    @Disabled()
    @Test()
    void applyWhenBuildParamsGetIsRuntimeJavaHomeSetThrowsGradleException() throws UnknownDomainObjectException {
        /* Branches:
         * (project != project.getRootProject()) : false
         * (GradleVersion.current().compareTo(minimumGradleVersion) < 0) : false
         * (runtimeJavaProperty != null) : true  #  inside findRuntimeJavaHome method
         * (isExplicitRuntimeJavaHomeSet) : true
         * (System.getProperty("idea.active", "false").equals("true") == false) : true  #  inside assertMinimumCompilerVersion method
         * (minimumCompilerVersion.compareTo(currentVersion) > 0) : false  #  inside assertMinimumCompilerVersion method
         * (GradleUtils.isIncludedBuild(project) == false) : true
         * (Files.isSameFile(javaHome.toPath(), installationLocation.getLocation().toPath())) : false  #  inside isSameFile method
         * (BuildParams.getIsRuntimeJavaHomeSet()) : true  #  inside logGlobalBuildInfo method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        Plugin pluginMock = mock(Plugin.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        Gradle gradleMock = mock(Gradle.class);
        TaskExecutionGraph taskExecutionGraphMock = mock(TaskExecutionGraph.class);
        Property propertyMock = mock(Property.class);
        Property<JavaLanguageVersion> propertyMock2 = mock(Property.class);
        JavaLanguageVersion javaLanguageVersionMock = mock(JavaLanguageVersion.class);
        Provider<JavaLauncher> providerMock = mock(Provider.class);
        Provider<File> providerMock2 = mock(Provider.class);
        JvmToolchainMetadata jvmToolchainMetadataMock = mock(JvmToolchainMetadata.class);
        JvmToolchainMetadata jvmToolchainMetadataMock2 = mock(JvmToolchainMetadata.class);
        GitInfo gitInfoMock = mock(GitInfo.class);
        GradleVersion gradleVersionMock = mock(GradleVersion.class);
        GradleVersion gradleVersionMock2 = mock(GradleVersion.class);
        JvmMetadataDetector jvmMetadataDetectorMock = mock(JvmMetadataDetector.class);
        try (MockedStatic<JavaVersion> javaVersion = mockStatic(JavaVersion.class, CALLS_REAL_METHODS);
            MockedStatic<JavaLanguageVersion> javaLanguageVersion = mockStatic(JavaLanguageVersion.class);
            MockedStatic<GradleVersion> gradleVersion = mockStatic(GradleVersion.class);
            MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class);
            MockedStatic<GlobalBuildInfoPlugin> globalBuildInfoPlugin = mockStatic(GlobalBuildInfoPlugin.class, CALLS_REAL_METHODS);
            MockedStatic<GitInfo> gitInfo = mockStatic(GitInfo.class);
            MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            doReturn(projectMock).when(projectMock).getRootProject();
            doReturn(pluginContainerMock).when(projectMock).getPlugins();
            doReturn(pluginMock).when(pluginContainerMock).apply(JvmToolchainsPlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(toolChainServiceMock).when(extensionContainerMock).getByType(JavaToolchainService.class);
            File file = new File("pathname1");
            doReturn(file).when(projectMock).getRootDir();
            doReturn(gradleMock).when(projectMock).getGradle();
            doReturn(taskExecutionGraphMock).when(gradleMock).getTaskGraph();
            doNothing().when(taskExecutionGraphMock).whenReady((Action) any());
            doReturn(propertyMock).when(objectFactoryMock).property(JavaLanguageVersion.class);
            doReturn(propertyMock2).when(propertyMock).value(javaLanguageVersionMock);
            doReturn(providerMock).when(toolChainServiceMock).launcherFor((Action) any());
            doReturn(providerMock2).when(providerMock).map((Transformer) any());
            doReturn(true).when(providerMock2).isPresent();
            List<JvmToolchainMetadata> jvmToolchainMetadataList = new ArrayList<>();
            jvmToolchainMetadataList.add(jvmToolchainMetadataMock);
            List<JvmToolchainMetadata> jvmToolchainMetadataList2 = new ArrayList<>();
            jvmToolchainMetadataList2.add(jvmToolchainMetadataMock2);
            doReturn(jvmToolchainMetadataList, jvmToolchainMetadataList2).when(javaInstallationRegistryMock).toolchains();
            buildParams.when(() -> BuildParams.init((Consumer) any())).thenAnswer((Answer<Void>) invocation -> null);
            buildParams.when(() -> BuildParams.getIsRuntimeJavaHomeSet()).thenReturn(true);
            File file2 = new File("pathname1");
            buildParams.when(() -> BuildParams.getRuntimeJavaHome()).thenReturn(file2);
            gitInfo.when(() -> GitInfo.gitInfo(file)).thenReturn(gitInfoMock);
            globalBuildInfoPlugin.when(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumGradleVersion")).thenReturn("return_of_getResourceContents1");
            globalBuildInfoPlugin.when(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumCompilerVersion")).thenReturn("A");
            globalBuildInfoPlugin.when(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumRuntimeVersion")).thenReturn("B");
            gradleUtils.when(() -> GradleUtils.isIncludedBuild(projectMock)).thenReturn(false);
            gradleVersion.when(() -> GradleVersion.version("return_of_getResourceContents1")).thenReturn(gradleVersionMock);
            doReturn(0).when(gradleVersionMock2).compareTo(gradleVersionMock);
            GradleVersion gradleVersion2 = GradleVersion.current();
            gradleVersion.when(() -> GradleVersion.current()).thenReturn(gradleVersionMock2).thenReturn(gradleVersion2);
            javaLanguageVersion.when(() -> JavaLanguageVersion.of("string4")).thenReturn(javaLanguageVersionMock);
            javaVersion.when(() -> JavaVersion.toVersion("A")).thenReturn(JavaVersion.VERSION_1_5);
            javaVersion.when(() -> JavaVersion.toVersion("B")).thenReturn(JavaVersion.VERSION_1_1);
            File file3 = new File("pathname1");
            InstallationLocation installationLocation = InstallationLocation.userDefined(file3, "source1");
            jvmToolchainMetadataMock.location = installationLocation;
            jvmToolchainMetadataMock2.location = installationLocation;
            target = new GlobalBuildInfoPlugin(objectFactoryMock, javaInstallationRegistryMock, jvmMetadataDetectorMock, providersMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            final GradleException result = assertThrows(GradleException.class, () -> {
                target.apply(projectMock);
            });
            GradleException gradleException = new GradleException("Could not locate available Java installation in Gradle registry at: file7");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(gradleException.getMessage()));
                verify(projectMock, atLeast(1)).getRootProject();
                verify(projectMock, atLeast(1)).getPlugins();
                verify(pluginContainerMock, atLeast(1)).apply(JvmToolchainsPlugin.class);
                verify(projectMock, atLeast(1)).getExtensions();
                verify(extensionContainerMock, atLeast(1)).getByType(JavaToolchainService.class);
                verify(projectMock, atLeast(1)).getRootDir();
                verify(projectMock, atLeast(1)).getGradle();
                verify(gradleMock, atLeast(1)).getTaskGraph();
                verify(taskExecutionGraphMock, atLeast(1)).whenReady((Action) any());
                verify(objectFactoryMock, atLeast(1)).property(JavaLanguageVersion.class);
                verify(propertyMock, atLeast(1)).value(javaLanguageVersionMock);
                verify(toolChainServiceMock, atLeast(1)).launcherFor((Action) any());
                verify(providerMock, atLeast(1)).map((Transformer) any());
                verify(providerMock2, atLeast(1)).isPresent();
                verify(javaInstallationRegistryMock, times(2)).toolchains();
                buildParams.verify(() -> BuildParams.init((Consumer) any()), atLeast(1));
                buildParams.verify(() -> BuildParams.getIsRuntimeJavaHomeSet(), atLeast(1));
                buildParams.verify(() -> BuildParams.getRuntimeJavaHome(), atLeast(1));
                gitInfo.verify(() -> GitInfo.gitInfo(file), atLeast(1));
                globalBuildInfoPlugin.verify(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumGradleVersion"), atLeast(1));
                globalBuildInfoPlugin.verify(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumCompilerVersion"), atLeast(1));
                globalBuildInfoPlugin.verify(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumRuntimeVersion"), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.isIncludedBuild(projectMock), atLeast(1));
                gradleVersion.verify(() -> GradleVersion.version("return_of_getResourceContents1"), atLeast(1));
                gradleVersion.verify(() -> GradleVersion.current(), atLeast(2));
                verify(gradleVersionMock2, atLeast(1)).compareTo(gradleVersionMock);
                javaLanguageVersion.verify(() -> JavaLanguageVersion.of("string4"), atLeast(1));
                javaVersion.verify(() -> JavaVersion.toVersion("A"), atLeast(1));
                javaVersion.verify(() -> JavaVersion.toVersion("B"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenJavaToolchainHomeIsNotNull}, hash: ED9ED02B3516FAF993305CFB540E27E5
    @Disabled()
    @Test()
    void applyWhenJavaToolchainHomeIsNotNull() throws UnknownDomainObjectException {
        /* Branches:
         * (project != project.getRootProject()) : false
         * (GradleVersion.current().compareTo(minimumGradleVersion) < 0) : false
         * (runtimeJavaProperty != null) : true  #  inside findRuntimeJavaHome method
         * (isExplicitRuntimeJavaHomeSet) : true
         * (System.getProperty("idea.active", "false").equals("true") == false) : true  #  inside assertMinimumCompilerVersion method
         * (minimumCompilerVersion.compareTo(currentVersion) > 0) : false  #  inside assertMinimumCompilerVersion method
         * (GradleUtils.isIncludedBuild(project) == false) : true
         * (Files.isSameFile(javaHome.toPath(), installationLocation.getLocation().toPath())) : true  #  inside isSameFile method
         * (BuildParams.getIsRuntimeJavaHomeSet()) : true  #  inside logGlobalBuildInfo method
         * (javaToolchainHome != null) : true  #  inside logGlobalBuildInfo method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        Plugin pluginMock = mock(Plugin.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        Gradle gradleMock = mock(Gradle.class);
        TaskExecutionGraph taskExecutionGraphMock = mock(TaskExecutionGraph.class);
        Property propertyMock = mock(Property.class);
        Property<JavaLanguageVersion> propertyMock2 = mock(Property.class);
        JavaLanguageVersion javaLanguageVersionMock = mock(JavaLanguageVersion.class);
        Provider<JavaLauncher> providerMock = mock(Provider.class);
        Provider<File> providerMock2 = mock(Provider.class);
        JvmToolchainMetadata jvmToolchainMetadataMock = mock(JvmToolchainMetadata.class);
        JvmToolchainMetadata jvmToolchainMetadataMock2 = mock(JvmToolchainMetadata.class);
        GitInfo gitInfoMock = mock(GitInfo.class);
        GradleVersion gradleVersionMock = mock(GradleVersion.class);
        GradleVersion gradleVersionMock2 = mock(GradleVersion.class);
        JvmMetadataDetector jvmMetadataDetectorMock = mock(JvmMetadataDetector.class);
        try (MockedStatic<JavaVersion> javaVersion = mockStatic(JavaVersion.class, CALLS_REAL_METHODS);
            MockedStatic<JavaLanguageVersion> javaLanguageVersion = mockStatic(JavaLanguageVersion.class);
            MockedStatic<GradleVersion> gradleVersion = mockStatic(GradleVersion.class);
            MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class);
            MockedStatic<GlobalBuildInfoPlugin> globalBuildInfoPlugin = mockStatic(GlobalBuildInfoPlugin.class, CALLS_REAL_METHODS);
            MockedStatic<GitInfo> gitInfo = mockStatic(GitInfo.class);
            MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            doReturn(projectMock).when(projectMock).getRootProject();
            doReturn(pluginContainerMock).when(projectMock).getPlugins();
            doReturn(pluginMock).when(pluginContainerMock).apply(JvmToolchainsPlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(toolChainServiceMock).when(extensionContainerMock).getByType(JavaToolchainService.class);
            File file = new File("pathname1");
            doReturn(file).when(projectMock).getRootDir();
            doReturn(gradleMock).when(projectMock).getGradle();
            doReturn(taskExecutionGraphMock).when(gradleMock).getTaskGraph();
            doNothing().when(taskExecutionGraphMock).whenReady((Action) any());
            doReturn(propertyMock).when(objectFactoryMock).property(JavaLanguageVersion.class);
            doReturn(propertyMock2).when(propertyMock).value(javaLanguageVersionMock);
            doReturn(providerMock).when(toolChainServiceMock).launcherFor((Action) any());
            doReturn(providerMock2).when(providerMock).map((Transformer) any());
            doReturn(true).when(providerMock2).isPresent();
            List<JvmToolchainMetadata> jvmToolchainMetadataList = new ArrayList<>();
            jvmToolchainMetadataList.add(jvmToolchainMetadataMock);
            List<JvmToolchainMetadata> jvmToolchainMetadataList2 = new ArrayList<>();
            jvmToolchainMetadataList2.add(jvmToolchainMetadataMock2);
            doReturn(jvmToolchainMetadataList, jvmToolchainMetadataList2).when(javaInstallationRegistryMock).toolchains();
            buildParams.when(() -> BuildParams.init((Consumer) any())).thenAnswer((Answer<Void>) invocation -> null);
            buildParams.when(() -> BuildParams.getIsRuntimeJavaHomeSet()).thenReturn(true);
            File file2 = new File("pathname1");
            File file3 = new File("pathname1");
            buildParams.when(() -> BuildParams.getRuntimeJavaHome()).thenReturn(file2).thenReturn(file3);
            buildParams.when(() -> BuildParams.getTestSeed()).thenReturn("`");
            buildParams.when(() -> BuildParams.isInFipsJvm()).thenReturn(true);
            gitInfo.when(() -> GitInfo.gitInfo(file)).thenReturn(gitInfoMock);
            globalBuildInfoPlugin.when(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumGradleVersion")).thenReturn("return_of_getResourceContents1");
            globalBuildInfoPlugin.when(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumCompilerVersion")).thenReturn("A");
            globalBuildInfoPlugin.when(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumRuntimeVersion")).thenReturn("B");
            gradleUtils.when(() -> GradleUtils.isIncludedBuild(projectMock)).thenReturn(false);
            gradleVersion.when(() -> GradleVersion.version("return_of_getResourceContents1")).thenReturn(gradleVersionMock);
            doReturn(0).when(gradleVersionMock2).compareTo(gradleVersionMock);
            GradleVersion gradleVersion2 = GradleVersion.current();
            gradleVersion.when(() -> GradleVersion.current()).thenReturn(gradleVersionMock2).thenReturn(gradleVersion2);
            javaLanguageVersion.when(() -> JavaLanguageVersion.of("string4")).thenReturn(javaLanguageVersionMock);
            javaVersion.when(() -> JavaVersion.toVersion("A")).thenReturn(JavaVersion.VERSION_1_9);
            javaVersion.when(() -> JavaVersion.toVersion("B")).thenReturn(JavaVersion.VERSION_1_1);
            File file4 = new File("pathname1");
            InstallationLocation installationLocation = InstallationLocation.userDefined(file4, "source1");
            jvmToolchainMetadataMock.location = installationLocation;
            jvmToolchainMetadataMock2.location = installationLocation;
            target = new GlobalBuildInfoPlugin(objectFactoryMock, javaInstallationRegistryMock, jvmMetadataDetectorMock, providersMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, atLeast(1)).getRootProject();
                verify(projectMock, atLeast(1)).getPlugins();
                verify(pluginContainerMock, atLeast(1)).apply(JvmToolchainsPlugin.class);
                verify(projectMock, atLeast(1)).getExtensions();
                verify(extensionContainerMock, atLeast(1)).getByType(JavaToolchainService.class);
                verify(projectMock, atLeast(1)).getRootDir();
                verify(projectMock, atLeast(1)).getGradle();
                verify(gradleMock, atLeast(1)).getTaskGraph();
                verify(taskExecutionGraphMock, atLeast(1)).whenReady((Action) any());
                verify(objectFactoryMock, atLeast(1)).property(JavaLanguageVersion.class);
                verify(propertyMock, atLeast(1)).value(javaLanguageVersionMock);
                verify(toolChainServiceMock, atLeast(1)).launcherFor((Action) any());
                verify(providerMock, atLeast(1)).map((Transformer) any());
                verify(providerMock2, atLeast(1)).isPresent();
                verify(javaInstallationRegistryMock, times(2)).toolchains();
                buildParams.verify(() -> BuildParams.init((Consumer) any()), atLeast(1));
                buildParams.verify(() -> BuildParams.getIsRuntimeJavaHomeSet(), atLeast(1));
                buildParams.verify(() -> BuildParams.getRuntimeJavaHome(), atLeast(2));
                buildParams.verify(() -> BuildParams.getTestSeed(), atLeast(1));
                buildParams.verify(() -> BuildParams.isInFipsJvm(), atLeast(1));
                gitInfo.verify(() -> GitInfo.gitInfo(file), atLeast(1));
                globalBuildInfoPlugin.verify(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumGradleVersion"), atLeast(1));
                globalBuildInfoPlugin.verify(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumCompilerVersion"), atLeast(1));
                globalBuildInfoPlugin.verify(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumRuntimeVersion"), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.isIncludedBuild(projectMock), atLeast(1));
                gradleVersion.verify(() -> GradleVersion.version("return_of_getResourceContents1"), atLeast(1));
                gradleVersion.verify(() -> GradleVersion.current(), atLeast(2));
                verify(gradleVersionMock2, atLeast(1)).compareTo(gradleVersionMock);
                javaLanguageVersion.verify(() -> JavaLanguageVersion.of("string4"), atLeast(1));
                javaVersion.verify(() -> JavaVersion.toVersion("A"), atLeast(1));
                javaVersion.verify(() -> JavaVersion.toVersion("B"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenBuildParamsNotGetIsRuntimeJavaHomeSetAndJavaToolchainHomeIsNotNull}, hash: 6F229628E7F7EC12DE5666817747ED7F
    @Disabled()
    @Test()
    void applyWhenBuildParamsNotGetIsRuntimeJavaHomeSetAndJavaToolchainHomeIsNotNull() throws UnknownDomainObjectException {
        /* Branches:
         * (project != project.getRootProject()) : false
         * (GradleVersion.current().compareTo(minimumGradleVersion) < 0) : false
         * (runtimeJavaProperty != null) : true  #  inside findRuntimeJavaHome method
         * (isExplicitRuntimeJavaHomeSet) : true
         * (System.getProperty("idea.active", "false").equals("true") == false) : true  #  inside assertMinimumCompilerVersion method
         * (minimumCompilerVersion.compareTo(currentVersion) > 0) : false  #  inside assertMinimumCompilerVersion method
         * (GradleUtils.isIncludedBuild(project) == false) : true
         * (Files.isSameFile(javaHome.toPath(), installationLocation.getLocation().toPath())) : false  #  inside isSameFile method
         * (BuildParams.getIsRuntimeJavaHomeSet()) : false  #  inside logGlobalBuildInfo method
         * (javaToolchainHome != null) : true  #  inside logGlobalBuildInfo method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        Plugin pluginMock = mock(Plugin.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        Gradle gradleMock = mock(Gradle.class);
        TaskExecutionGraph taskExecutionGraphMock = mock(TaskExecutionGraph.class);
        Property propertyMock = mock(Property.class);
        Property<JavaLanguageVersion> propertyMock2 = mock(Property.class);
        JavaLanguageVersion javaLanguageVersionMock = mock(JavaLanguageVersion.class);
        Provider<JavaLauncher> providerMock = mock(Provider.class);
        Provider<File> providerMock2 = mock(Provider.class);
        JvmToolchainMetadata jvmToolchainMetadataMock = mock(JvmToolchainMetadata.class);
        GitInfo gitInfoMock = mock(GitInfo.class);
        GradleVersion gradleVersionMock = mock(GradleVersion.class);
        GradleVersion gradleVersionMock2 = mock(GradleVersion.class);
        JvmMetadataDetector jvmMetadataDetectorMock = mock(JvmMetadataDetector.class);
        try (MockedStatic<JavaVersion> javaVersion = mockStatic(JavaVersion.class, CALLS_REAL_METHODS);
            MockedStatic<JavaLanguageVersion> javaLanguageVersion = mockStatic(JavaLanguageVersion.class);
            MockedStatic<GradleVersion> gradleVersion = mockStatic(GradleVersion.class);
            MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class);
            MockedStatic<GlobalBuildInfoPlugin> globalBuildInfoPlugin = mockStatic(GlobalBuildInfoPlugin.class, CALLS_REAL_METHODS);
            MockedStatic<GitInfo> gitInfo = mockStatic(GitInfo.class);
            MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            doReturn(projectMock).when(projectMock).getRootProject();
            doReturn(pluginContainerMock).when(projectMock).getPlugins();
            doReturn(pluginMock).when(pluginContainerMock).apply(JvmToolchainsPlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(toolChainServiceMock).when(extensionContainerMock).getByType(JavaToolchainService.class);
            File file = new File("pathname1");
            doReturn(file).when(projectMock).getRootDir();
            doReturn(gradleMock).when(projectMock).getGradle();
            doReturn(taskExecutionGraphMock).when(gradleMock).getTaskGraph();
            doNothing().when(taskExecutionGraphMock).whenReady((Action) any());
            doReturn(propertyMock).when(objectFactoryMock).property(JavaLanguageVersion.class);
            doReturn(propertyMock2).when(propertyMock).value(javaLanguageVersionMock);
            doReturn(providerMock).when(toolChainServiceMock).launcherFor((Action) any());
            doReturn(providerMock2).when(providerMock).map((Transformer) any());
            doReturn(true).when(providerMock2).isPresent();
            List<JvmToolchainMetadata> jvmToolchainMetadataList = new ArrayList<>();
            jvmToolchainMetadataList.add(jvmToolchainMetadataMock);
            doReturn(jvmToolchainMetadataList).when(javaInstallationRegistryMock).toolchains();
            buildParams.when(() -> BuildParams.init((Consumer) any())).thenAnswer((Answer<Void>) invocation -> null);
            buildParams.when(() -> BuildParams.getIsRuntimeJavaHomeSet()).thenReturn(false);
            buildParams.when(() -> BuildParams.getTestSeed()).thenReturn("Z");
            buildParams.when(() -> BuildParams.isInFipsJvm()).thenReturn(true);
            gitInfo.when(() -> GitInfo.gitInfo(file)).thenReturn(gitInfoMock);
            globalBuildInfoPlugin.when(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumGradleVersion")).thenReturn("return_of_getResourceContents1");
            globalBuildInfoPlugin.when(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumCompilerVersion")).thenReturn("A");
            globalBuildInfoPlugin.when(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumRuntimeVersion")).thenReturn("B");
            gradleUtils.when(() -> GradleUtils.isIncludedBuild(projectMock)).thenReturn(false);
            gradleVersion.when(() -> GradleVersion.version("return_of_getResourceContents1")).thenReturn(gradleVersionMock);
            doReturn(0).when(gradleVersionMock2).compareTo(gradleVersionMock);
            GradleVersion gradleVersion2 = GradleVersion.current();
            gradleVersion.when(() -> GradleVersion.current()).thenReturn(gradleVersionMock2).thenReturn(gradleVersion2);
            javaLanguageVersion.when(() -> JavaLanguageVersion.of("string4")).thenReturn(javaLanguageVersionMock);
            javaVersion.when(() -> JavaVersion.toVersion("A")).thenReturn(JavaVersion.VERSION_1_3);
            javaVersion.when(() -> JavaVersion.toVersion("B")).thenReturn(JavaVersion.VERSION_1_1);
            File file2 = new File("pathname1");
            InstallationLocation installationLocation = InstallationLocation.userDefined(file2, "source1");
            jvmToolchainMetadataMock.location = installationLocation;
            target = new GlobalBuildInfoPlugin(objectFactoryMock, javaInstallationRegistryMock, jvmMetadataDetectorMock, providersMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, atLeast(1)).getRootProject();
                verify(projectMock, atLeast(1)).getPlugins();
                verify(pluginContainerMock, atLeast(1)).apply(JvmToolchainsPlugin.class);
                verify(projectMock, atLeast(1)).getExtensions();
                verify(extensionContainerMock, atLeast(1)).getByType(JavaToolchainService.class);
                verify(projectMock, atLeast(1)).getRootDir();
                verify(projectMock, atLeast(1)).getGradle();
                verify(gradleMock, atLeast(1)).getTaskGraph();
                verify(taskExecutionGraphMock, atLeast(1)).whenReady((Action) any());
                verify(objectFactoryMock, atLeast(1)).property(JavaLanguageVersion.class);
                verify(propertyMock, atLeast(1)).value(javaLanguageVersionMock);
                verify(toolChainServiceMock, atLeast(1)).launcherFor((Action) any());
                verify(providerMock, atLeast(1)).map((Transformer) any());
                verify(providerMock2, atLeast(1)).isPresent();
                verify(javaInstallationRegistryMock, atLeast(1)).toolchains();
                buildParams.verify(() -> BuildParams.init((Consumer) any()), atLeast(1));
                buildParams.verify(() -> BuildParams.getIsRuntimeJavaHomeSet(), atLeast(1));
                buildParams.verify(() -> BuildParams.getTestSeed(), atLeast(1));
                buildParams.verify(() -> BuildParams.isInFipsJvm(), atLeast(1));
                gitInfo.verify(() -> GitInfo.gitInfo(file), atLeast(1));
                globalBuildInfoPlugin.verify(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumGradleVersion"), atLeast(1));
                globalBuildInfoPlugin.verify(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumCompilerVersion"), atLeast(1));
                globalBuildInfoPlugin.verify(() -> GlobalBuildInfoPlugin.getResourceContents("/minimumRuntimeVersion"), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.isIncludedBuild(projectMock), atLeast(1));
                gradleVersion.verify(() -> GradleVersion.version("return_of_getResourceContents1"), atLeast(1));
                gradleVersion.verify(() -> GradleVersion.current(), atLeast(2));
                verify(gradleVersionMock2, atLeast(1)).compareTo(gradleVersionMock);
                javaLanguageVersion.verify(() -> JavaLanguageVersion.of("string4"), atLeast(1));
                javaVersion.verify(() -> JavaVersion.toVersion("A"), atLeast(1));
                javaVersion.verify(() -> JavaVersion.toVersion("B"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getResourceContentsWhenBLengthNotEquals0}, hash: E218AA617F62245D13889DC6704B0E4E
    @Disabled()
    @Test()
    void getResourceContentsWhenBLengthNotEquals0() {
        /* Branches:
         * (line != null) : true
         * (b.length() != 0) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: reader - Method: readLine
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        String result = GlobalBuildInfoPlugin.getResourceContents("server/src/main/java/org/elasticsearch/Version.java");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${getResourceContentsWhenBLengthNotEquals0AndDefaultBranchThrowsThrowable}, hash: 21A5F0C8D1FCE6F6F2EC3E0AEFC4B5F6
    @Test()
    void getResourceContentsWhenBLengthNotEquals0AndDefaultBranchThrowsThrowable() {
        /* Branches:
         * (line != null) : true
         * (b.length() != 0) : true
         * (branch expression (line 337)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: reader - Method: readLine
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        final Throwable result = assertThrows(Throwable.class, () -> {
            GlobalBuildInfoPlugin.getResourceContents("server/src/main/java/org/elasticsearch/Version.java");
        });
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getResourceContentsWhenBLengthNotEquals0AndCaughtIOExceptionThrowsUncheckedIOException}, hash: 19DD8199E6AED763897CC2EA9F4C1923
    @Disabled()
    @Test()
    void getResourceContentsWhenBLengthNotEquals0AndCaughtIOExceptionThrowsUncheckedIOException() {
        /* Branches:
         * (line != null) : true
         * (b.length() != 0) : true
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  A variable could not be isolated/mocked when calling a method - Variable name: reader - Method: readLine
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        IOException iOException = new IOException();
        UncheckedIOException uncheckedIOException = new UncheckedIOException("Error trying to read classpath resource: server/src/main/java/org/elasticsearch/Version.java", iOException);
        //Act Statement(s)
        final UncheckedIOException result = assertThrows(UncheckedIOException.class, () -> {
            GlobalBuildInfoPlugin.getResourceContents("server/src/main/java/org/elasticsearch/Version.java");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(uncheckedIOException.getMessage()));
            assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
        });
    }
}

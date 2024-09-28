package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.UnknownProjectException;
import org.gradle.api.InvalidUserDataException;
import org.gradle.language.base.plugins.LifecycleBasePlugin;
import org.gradle.api.Transformer;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.jvm.toolchain.JavaToolchainService;
import org.gradle.api.invocation.Gradle;
import org.gradle.api.provider.Provider;
import java.util.concurrent.Callable;
import org.gradle.api.tasks.Copy;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.tasks.TaskProvider;
import org.elasticsearch.gradle.LoggedExec;
import org.gradle.api.Task;
import java.util.function.Consumer;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.StartParameter;
import org.mockito.stubbing.Answer;
import org.gradle.api.provider.Property;
import org.elasticsearch.gradle.Version;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.gradle.api.file.Directory;
import org.gradle.api.Project;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.plugins.JvmToolchainsPlugin;
import org.gradle.api.file.ProjectLayout;
import org.mockito.MockedStatic;
import org.elasticsearch.gradle.internal.info.GlobalBuildInfoPlugin;
import java.io.File;
import org.elasticsearch.gradle.internal.info.BuildParams;
import org.gradle.api.Plugin;
import org.gradle.api.plugins.PluginManager;
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
import static org.mockito.Mockito.mockStatic;

@Timeout(value = 5)
class InternalDistributionBwcSetupPluginSapientGeneratedTest {

    private final BwcGitExtension bwcGitExtensionMock = mock(BwcGitExtension.class);

    private final BwcSetupExtension bwcSetupExtensionMock = mock(BwcSetupExtension.class);

    private final TaskProvider<Task> bwcTaskProviderMock = mock(TaskProvider.class);

    private final BwcVersions bwcVersionsMock = mock(BwcVersions.class);

    private final Directory directoryMock = mock(Directory.class);

    private final DirectoryProperty directoryPropertyMock = mock(DirectoryProperty.class);

    private final ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);

    private final ExtensionContainer extensionContainerMock2 = mock(ExtensionContainer.class);

    private final Gradle gradleMock = mock(Gradle.class);

    private final Gradle gradleMock2 = mock(Gradle.class);

    private final InternalBwcGitPlugin internalBwcGitPluginMock = mock(InternalBwcGitPlugin.class);

    private final JavaToolchainService javaToolchainServiceMock = mock(JavaToolchainService.class);

    private final ObjectFactory objectFactoryMock = mock(ObjectFactory.class);

    private final PluginContainer pluginContainerMock = mock(PluginContainer.class);

    private final PluginContainer pluginContainerMock2 = mock(PluginContainer.class);

    private final PluginContainer pluginContainerMock3 = mock(PluginContainer.class);

    private final PluginManager pluginManagerMock = mock(PluginManager.class);

    private final Plugin pluginMock = mock(Plugin.class);

    private final Plugin pluginMock2 = mock(Plugin.class);

    private final ProjectLayout projectLayoutMock = mock(ProjectLayout.class);

    private final Project projectMock = mock(Project.class);

    private final Project projectMock2 = mock(Project.class);

    private final Project projectMock3 = mock(Project.class);

    private final Property<File> propertyMock = mock(Property.class);

    private final ProviderFactory providerFactoryMock = mock(ProviderFactory.class);

    private final Provider<BwcVersions.UnreleasedVersionInfo> providerMock = mock(Provider.class);

    private final Provider<File> providerMock2 = mock(Provider.class);

    private final Provider<Version> providerMock3 = mock(Provider.class);

    private final Provider<String> providerMock4 = mock(Provider.class);

    private final Provider<Version> providerMock5 = mock(Provider.class);

    private final TaskContainer taskContainerMock = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock2 = mock(TaskContainer.class);

    private final TaskProvider<Task> taskProviderMock = mock(TaskProvider.class);

    private final TaskProvider taskProviderMock2 = mock(TaskProvider.class);

    private final Version versionMock = mock(Version.class);

    //Sapient generated method id: ${applyWhenDistributionProjectsIsNotEmptyThrowsNullPointerException}, hash: 1B166B2F5E10DC7BD906B1B87F465BCF
    @Disabled()
    @Test()
    void applyWhenDistributionProjectsIsNotEmptyThrowsNullPointerException() throws UnknownDomainObjectException, UnknownProjectException, InvalidUserDataException {
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //Act Statement(s)
        //Assert statement(s)
        /* Branches:
         * (bwcVersion.onOrAfter("7.13.0")) : false  #  inside resolveArchiveProjects method
         * (bwcVersion.onOrAfter("7.0.0")) : false  #  inside resolveArchiveProjects method
         * (name.endsWith("zip")) : false  #  inside lambda$resolveArchiveProjects$10 method
         * (name.endsWith("tar")) : false  #  inside lambda$resolveArchiveProjects$10 method
         * (bwcVersion.onOrAfter("7.0.0")) : false  #  inside lambda$resolveArchiveProjects$10 method
         * (for-each(distributionProjects)) : true  #  inside configureBwcProject method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.File
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //InternalDistributionBwcSetupPlugin.DistributionProjectArtifact internalDistributionBwcSetupPluginDistributionProjectArtifactMock = mock(InternalDistributionBwcSetupPlugin.DistributionProjectArtifact.class);
        //doReturn(projectMock2).when(projectMock).getRootProject();
        //doReturn(pluginManagerMock).when(projectMock2).getPluginManager();
        //doNothing().when(pluginManagerMock).apply(GlobalBuildInfoPlugin.class);
        //doReturn(pluginContainerMock).when(projectMock).getPlugins();
        //doReturn(pluginMock).when(pluginContainerMock).apply(JvmToolchainsPlugin.class);
        //doReturn(extensionContainerMock).when(projectMock).getExtensions();
        //doReturn(javaToolchainServiceMock).when(extensionContainerMock).getByType(JavaToolchainService.class);
        //doReturn(projectMock3).when(projectMock).project("return_of_gradleProjectPath1");
        //doReturn(projectLayoutMock).when(projectMock3).getLayout();
        //doReturn(directoryPropertyMock).when(projectLayoutMock).getBuildDirectory();
        //doReturn(directoryMock).when(directoryPropertyMock).get();
        //File file = new File("pathname1");
        //doReturn(file).when(directoryMock).getAsFile();
        //doReturn(extensionContainerMock2).when(projectMock3).getExtensions();
        //Object[] objectArray = new Object[] { projectMock3, objectFactoryMock, providerFactoryMock, javaToolchainServiceMock, providerMock, providerMock2 };
        //doReturn(bwcSetupExtensionMock).when(extensionContainerMock2).create("bwcSetup", BwcSetupExtension.class, objectArray);
        //doReturn(internalBwcGitPluginMock).when(pluginContainerMock2).apply(InternalBwcGitPlugin.class);
        //doReturn(bwcGitExtensionMock).when(internalBwcGitPluginMock).getGitExtension();
        //doNothing().when(bwcGitExtensionMock).setBwcVersion(providerMock3);
        //doNothing().when(bwcGitExtensionMock).setBwcBranch(providerMock4);
        //doReturn(propertyMock).when(bwcGitExtensionMock).getCheckoutDir();
        //doNothing().when(propertyMock).set(providerMock2);
        //File file2 = new File("pathname1");
        //doReturn(file2).when(providerMock2).get();
        //doReturn(pluginContainerMock2, pluginContainerMock3).when(projectMock3).getPlugins();
        //doReturn(pluginMock2).when(pluginContainerMock3).apply(LifecycleBasePlugin.class);
        //doReturn(taskProviderMock).when(taskContainerMock).register("buildBwc");
        //doReturn(taskContainerMock, taskContainerMock2).when(projectMock3).getTasks();
        //doReturn(taskProviderMock2).when(taskContainerMock2).register(eq("setupGradleUserHome"), eq(Copy.class), (Action) any());
        //File file3 = new File("pathname1");
        //doReturn(file3).when(gradleMock).getGradleUserHomeDir();
        //doReturn("C").when(projectMock3).getName();
        //doReturn(gradleMock, gradleMock2).when(projectMock3).getGradle();
        //File file4 = new File("pathname1");
        //doReturn(file4).when(gradleMock2).getGradleUserHomeDir();
        //doReturn(providerMock).when(providerFactoryMock).provider((Callable) any());
        //doReturn(versionMock).when(providerMock5).get();
        //doReturn(false).when(versionMock).onOrAfter("7.13.0");
        //doReturn(false).when(versionMock).onOrAfter("7.0.0");
        //doReturn(providerMock2, providerMock5, providerMock3, providerMock4).when(providerMock).map((Transformer) any());
        //buildParams.when(() -> BuildParams.getBwcVersions()).thenReturn(bwcVersionsMock);
        //doNothing().when(bwcVersionsMock).forPreviousUnreleased((Consumer) any());
        //internalDistributionBwcSetupPlugin.when(() -> InternalDistributionBwcSetupPlugin.createBuildBwcTask(bwcSetupExtensionMock, projectMock3, providerMock5, "string34", "string35", internalDistributionBwcSetupPluginDistributionProjectArtifactMock, taskProviderMock, "string33")).thenAnswer((Answer<Void>) invocation -> null);
        //InternalDistributionBwcSetupPlugin target = new InternalDistributionBwcSetupPlugin(objectFactoryMock, providerFactoryMock);
        //final NullPointerException result = assertThrows(NullPointerException.class, () -> {    target.apply(projectMock);});
        //assertAll("result", () -> {    assertThat(result, is(notNullValue()));    verify(projectMock, atLeast(1)).getRootProject();    verify(projectMock2, atLeast(1)).getPluginManager();    verify(pluginManagerMock, atLeast(1)).apply(GlobalBuildInfoPlugin.class);    verify(projectMock, atLeast(1)).getPlugins();    verify(pluginContainerMock, atLeast(1)).apply(JvmToolchainsPlugin.class);    verify(projectMock, atLeast(1)).getExtensions();    verify(extensionContainerMock, atLeast(1)).getByType(JavaToolchainService.class);    verify(projectMock, atLeast(1)).project("return_of_gradleProjectPath1");    verify(projectMock3, atLeast(1)).getLayout();    verify(projectLayoutMock, atLeast(1)).getBuildDirectory();    verify(directoryPropertyMock, atLeast(1)).get();    verify(directoryMock, atLeast(1)).getAsFile();    verify(projectMock3, atLeast(1)).getExtensions();    verify(extensionContainerMock2, atLeast(1)).create("bwcSetup", BwcSetupExtension.class, objectArray);    verify(projectMock3, times(2)).getPlugins();    verify(pluginContainerMock2, atLeast(1)).apply(InternalBwcGitPlugin.class);    verify(internalBwcGitPluginMock, atLeast(1)).getGitExtension();    verify(bwcGitExtensionMock, atLeast(1)).setBwcVersion(providerMock3);    verify(bwcGitExtensionMock, atLeast(1)).setBwcBranch(providerMock4);    verify(bwcGitExtensionMock, atLeast(1)).getCheckoutDir();    verify(propertyMock, atLeast(1)).set(providerMock2);    verify(providerMock2, atLeast(1)).get();    verify(pluginContainerMock3, atLeast(1)).apply(LifecycleBasePlugin.class);    verify(projectMock3, times(2)).getTasks();    verify(taskContainerMock, atLeast(1)).register("buildBwc");    verify(taskContainerMock2, atLeast(1)).register(eq("setupGradleUserHome"), eq(Copy.class), (Action) any());    verify(projectMock3, times(2)).getGradle();    verify(gradleMock, atLeast(1)).getGradleUserHomeDir();    verify(projectMock3, atLeast(1)).getName();    verify(gradleMock2, atLeast(1)).getGradleUserHomeDir();    verify(providerFactoryMock, atLeast(1)).provider((Callable) any());    verify(providerMock, atLeast(4)).map((Transformer) any());    verify(providerMock5, atLeast(1)).get();    verify(versionMock, atLeast(1)).onOrAfter("7.13.0");    verify(versionMock, times(9)).onOrAfter("7.0.0");    buildParams.verify(() -> BuildParams.getBwcVersions(), atLeast(1));    verify(bwcVersionsMock, atLeast(1)).forPreviousUnreleased((Consumer) any());    internalDistributionBwcSetupPlugin.verify(() -> InternalDistributionBwcSetupPlugin.createBuildBwcTask(bwcSetupExtensionMock, projectMock3, providerMock5, "string34", "string35", internalDistributionBwcSetupPluginDistributionProjectArtifactMock, taskProviderMock, "string33"), atLeast(1));});
    }

    //Sapient generated method id: ${applyWhenBwcVersionNotOnOrAfter7_0_0AndDistributionProjectsIsNotEmptyThrowsNullPointerException}, hash: 0D3E628565921C3779CDF04303BC63DF
    @Disabled()
    @Test()
    void applyWhenBwcVersionNotOnOrAfter7_0_0AndDistributionProjectsIsNotEmptyThrowsNullPointerException() throws UnknownDomainObjectException, UnknownProjectException, InvalidUserDataException {
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //Act Statement(s)
        //Assert statement(s)
        /* Branches:
         * (bwcVersion.onOrAfter("7.13.0")) : false  #  inside resolveArchiveProjects method
         * (bwcVersion.onOrAfter("7.0.0")) : true  #  inside resolveArchiveProjects method
         * (bwcVersion.onOrAfter("7.12.0")) : true  #  inside resolveArchiveProjects method
         * (name.endsWith("zip")) : false  #  inside lambda$resolveArchiveProjects$10 method
         * (name.endsWith("tar")) : false  #  inside lambda$resolveArchiveProjects$10 method
         * (bwcVersion.onOrAfter("7.0.0")) : false  #  inside lambda$resolveArchiveProjects$10 method
         * (for-each(distributionProjects)) : true  #  inside configureBwcProject method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.File
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //InternalDistributionBwcSetupPlugin.DistributionProjectArtifact internalDistributionBwcSetupPluginDistributionProjectArtifactMock = mock(InternalDistributionBwcSetupPlugin.DistributionProjectArtifact.class);
        //doReturn(projectMock2).when(projectMock).getRootProject();
        //doReturn(pluginManagerMock).when(projectMock2).getPluginManager();
        //doNothing().when(pluginManagerMock).apply(GlobalBuildInfoPlugin.class);
        //doReturn(pluginContainerMock).when(projectMock).getPlugins();
        //doReturn(pluginMock).when(pluginContainerMock).apply(JvmToolchainsPlugin.class);
        //doReturn(extensionContainerMock).when(projectMock).getExtensions();
        //doReturn(javaToolchainServiceMock).when(extensionContainerMock).getByType(JavaToolchainService.class);
        //doReturn(projectMock3).when(projectMock).project("return_of_gradleProjectPath1");
        //doReturn(projectLayoutMock).when(projectMock3).getLayout();
        //doReturn(directoryPropertyMock).when(projectLayoutMock).getBuildDirectory();
        //doReturn(directoryMock).when(directoryPropertyMock).get();
        //File file = new File("pathname1");
        //doReturn(file).when(directoryMock).getAsFile();
        //doReturn(extensionContainerMock2).when(projectMock3).getExtensions();
        //Object[] objectArray = new Object[] { projectMock3, objectFactoryMock, providerFactoryMock, javaToolchainServiceMock, providerMock, providerMock2 };
        //doReturn(bwcSetupExtensionMock).when(extensionContainerMock2).create("bwcSetup", BwcSetupExtension.class, objectArray);
        //doReturn(internalBwcGitPluginMock).when(pluginContainerMock2).apply(InternalBwcGitPlugin.class);
        //doReturn(bwcGitExtensionMock).when(internalBwcGitPluginMock).getGitExtension();
        //doNothing().when(bwcGitExtensionMock).setBwcVersion(providerMock3);
        //doNothing().when(bwcGitExtensionMock).setBwcBranch(providerMock4);
        //doReturn(propertyMock).when(bwcGitExtensionMock).getCheckoutDir();
        //doNothing().when(propertyMock).set(providerMock2);
        //File file2 = new File("pathname1");
        //doReturn(file2).when(providerMock2).get();
        //doReturn(pluginContainerMock2, pluginContainerMock3).when(projectMock3).getPlugins();
        //doReturn(pluginMock2).when(pluginContainerMock3).apply(LifecycleBasePlugin.class);
        //doReturn(taskProviderMock).when(taskContainerMock).register("buildBwc");
        //doReturn(taskContainerMock, taskContainerMock2).when(projectMock3).getTasks();
        //doReturn(taskProviderMock2).when(taskContainerMock2).register(eq("setupGradleUserHome"), eq(Copy.class), (Action) any());
        //File file3 = new File("pathname1");
        //doReturn(file3).when(gradleMock).getGradleUserHomeDir();
        //doReturn("C").when(projectMock3).getName();
        //doReturn(gradleMock, gradleMock2).when(projectMock3).getGradle();
        //File file4 = new File("pathname1");
        //doReturn(file4).when(gradleMock2).getGradleUserHomeDir();
        //doReturn(providerMock).when(providerFactoryMock).provider((Callable) any());
        //doReturn(versionMock).when(providerMock5).get();
        //doReturn(false).when(versionMock).onOrAfter("7.13.0");
        //doReturn(true).when(versionMock).onOrAfter("7.12.0");
        //doReturn(true, false, false, false, false, false, false, false, false, false, false, false, false, false, false).when(versionMock).onOrAfter("7.0.0");
        //doReturn(providerMock2, providerMock5, providerMock3, providerMock4).when(providerMock).map((Transformer) any());
        //buildParams.when(() -> BuildParams.getBwcVersions()).thenReturn(bwcVersionsMock);
        //doNothing().when(bwcVersionsMock).forPreviousUnreleased((Consumer) any());
        //internalDistributionBwcSetupPlugin.when(() -> InternalDistributionBwcSetupPlugin.createBuildBwcTask(bwcSetupExtensionMock, projectMock3, providerMock5, "string52", "string53", internalDistributionBwcSetupPluginDistributionProjectArtifactMock, taskProviderMock, "string51")).thenAnswer((Answer<Void>) invocation -> null);
        //InternalDistributionBwcSetupPlugin target = new InternalDistributionBwcSetupPlugin(objectFactoryMock, providerFactoryMock);
        //final NullPointerException result = assertThrows(NullPointerException.class, () -> {    target.apply(projectMock);});
        //assertAll("result", () -> {    assertThat(result, is(notNullValue()));    verify(projectMock, atLeast(1)).getRootProject();    verify(projectMock2, atLeast(1)).getPluginManager();    verify(pluginManagerMock, atLeast(1)).apply(GlobalBuildInfoPlugin.class);    verify(projectMock, atLeast(1)).getPlugins();    verify(pluginContainerMock, atLeast(1)).apply(JvmToolchainsPlugin.class);    verify(projectMock, atLeast(1)).getExtensions();    verify(extensionContainerMock, atLeast(1)).getByType(JavaToolchainService.class);    verify(projectMock, atLeast(1)).project("return_of_gradleProjectPath1");    verify(projectMock3, atLeast(1)).getLayout();    verify(projectLayoutMock, atLeast(1)).getBuildDirectory();    verify(directoryPropertyMock, atLeast(1)).get();    verify(directoryMock, atLeast(1)).getAsFile();    verify(projectMock3, atLeast(1)).getExtensions();    verify(extensionContainerMock2, atLeast(1)).create("bwcSetup", BwcSetupExtension.class, objectArray);    verify(projectMock3, times(2)).getPlugins();    verify(pluginContainerMock2, atLeast(1)).apply(InternalBwcGitPlugin.class);    verify(internalBwcGitPluginMock, atLeast(1)).getGitExtension();    verify(bwcGitExtensionMock, atLeast(1)).setBwcVersion(providerMock3);    verify(bwcGitExtensionMock, atLeast(1)).setBwcBranch(providerMock4);    verify(bwcGitExtensionMock, atLeast(1)).getCheckoutDir();    verify(propertyMock, atLeast(1)).set(providerMock2);    verify(providerMock2, atLeast(1)).get();    verify(pluginContainerMock3, atLeast(1)).apply(LifecycleBasePlugin.class);    verify(projectMock3, times(2)).getTasks();    verify(taskContainerMock, atLeast(1)).register("buildBwc");    verify(taskContainerMock2, atLeast(1)).register(eq("setupGradleUserHome"), eq(Copy.class), (Action) any());    verify(projectMock3, times(2)).getGradle();    verify(gradleMock, atLeast(1)).getGradleUserHomeDir();    verify(projectMock3, atLeast(1)).getName();    verify(gradleMock2, atLeast(1)).getGradleUserHomeDir();    verify(providerFactoryMock, atLeast(1)).provider((Callable) any());    verify(providerMock, atLeast(4)).map((Transformer) any());    verify(providerMock5, atLeast(1)).get();    verify(versionMock, atLeast(1)).onOrAfter("7.13.0");    verify(versionMock, times(15)).onOrAfter("7.0.0");    verify(versionMock, atLeast(1)).onOrAfter("7.12.0");    buildParams.verify(() -> BuildParams.getBwcVersions(), atLeast(1));    verify(bwcVersionsMock, atLeast(1)).forPreviousUnreleased((Consumer) any());    internalDistributionBwcSetupPlugin.verify(() -> InternalDistributionBwcSetupPlugin.createBuildBwcTask(bwcSetupExtensionMock, projectMock3, providerMock5, "string52", "string53", internalDistributionBwcSetupPluginDistributionProjectArtifactMock, taskProviderMock, "string51"), atLeast(1));});
    }

    //Sapient generated method id: ${applyWhenNameContainsDebAndDistributionProjectsIsNotEmptyThrowsNullPointerException}, hash: 89B88C0ED4656BDCCBA7037509301E25
    @Disabled()
    @Test()
    void applyWhenNameContainsDebAndDistributionProjectsIsNotEmptyThrowsNullPointerException() throws UnknownDomainObjectException, UnknownProjectException, InvalidUserDataException {
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //Act Statement(s)
        //Assert statement(s)
        /* Branches:
         * (bwcVersion.onOrAfter("7.13.0")) : true  #  inside resolveArchiveProjects method
         * (name.endsWith("zip")) : false  #  inside lambda$resolveArchiveProjects$10 method
         * (name.endsWith("tar")) : false  #  inside lambda$resolveArchiveProjects$10 method
         * (bwcVersion.onOrAfter("7.0.0")) : true  #  inside lambda$resolveArchiveProjects$10 method
         * (name.contains("zip")) : false  #  inside lambda$resolveArchiveProjects$10 method
         * (name.contains("tar")) : false  #  inside lambda$resolveArchiveProjects$10 method
         * (name.contains("deb")) : true  #  inside lambda$resolveArchiveProjects$10 method
         * (for-each(distributionProjects)) : true  #  inside configureBwcProject method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.File
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //InternalDistributionBwcSetupPlugin.DistributionProjectArtifact internalDistributionBwcSetupPluginDistributionProjectArtifactMock = mock(InternalDistributionBwcSetupPlugin.DistributionProjectArtifact.class);
        //doReturn(projectMock2).when(projectMock).getRootProject();
        //doReturn(pluginManagerMock).when(projectMock2).getPluginManager();
        //doNothing().when(pluginManagerMock).apply(GlobalBuildInfoPlugin.class);
        //doReturn(pluginContainerMock).when(projectMock).getPlugins();
        //doReturn(pluginMock).when(pluginContainerMock).apply(JvmToolchainsPlugin.class);
        //doReturn(extensionContainerMock).when(projectMock).getExtensions();
        //doReturn(javaToolchainServiceMock).when(extensionContainerMock).getByType(JavaToolchainService.class);
        //doReturn(projectMock3).when(projectMock).project("return_of_gradleProjectPath1");
        //doReturn(projectLayoutMock).when(projectMock3).getLayout();
        //doReturn(directoryPropertyMock).when(projectLayoutMock).getBuildDirectory();
        //doReturn(directoryMock).when(directoryPropertyMock).get();
        //File file = new File("pathname1");
        //doReturn(file).when(directoryMock).getAsFile();
        //doReturn(extensionContainerMock2).when(projectMock3).getExtensions();
        //Object[] objectArray = new Object[] { projectMock3, objectFactoryMock, providerFactoryMock, javaToolchainServiceMock, providerMock, providerMock2 };
        //doReturn(bwcSetupExtensionMock).when(extensionContainerMock2).create("bwcSetup", BwcSetupExtension.class, objectArray);
        //doReturn(internalBwcGitPluginMock).when(pluginContainerMock2).apply(InternalBwcGitPlugin.class);
        //doReturn(bwcGitExtensionMock).when(internalBwcGitPluginMock).getGitExtension();
        //doNothing().when(bwcGitExtensionMock).setBwcVersion(providerMock3);
        //doNothing().when(bwcGitExtensionMock).setBwcBranch(providerMock4);
        //doReturn(propertyMock).when(bwcGitExtensionMock).getCheckoutDir();
        //doNothing().when(propertyMock).set(providerMock2);
        //File file2 = new File("pathname1");
        //doReturn(file2).when(providerMock2).get();
        //doReturn(pluginContainerMock2, pluginContainerMock3).when(projectMock3).getPlugins();
        //doReturn(pluginMock2).when(pluginContainerMock3).apply(LifecycleBasePlugin.class);
        //doReturn(taskProviderMock).when(taskContainerMock).register("buildBwc");
        //doReturn(taskContainerMock, taskContainerMock2).when(projectMock3).getTasks();
        //doReturn(taskProviderMock2).when(taskContainerMock2).register(eq("setupGradleUserHome"), eq(Copy.class), (Action) any());
        //File file3 = new File("pathname1");
        //doReturn(file3).when(gradleMock).getGradleUserHomeDir();
        //doReturn("C").when(projectMock3).getName();
        //doReturn(gradleMock, gradleMock2).when(projectMock3).getGradle();
        //File file4 = new File("pathname1");
        //doReturn(file4).when(gradleMock2).getGradleUserHomeDir();
        //doReturn(providerMock).when(providerFactoryMock).provider((Callable) any());
        //doReturn(versionMock).when(providerMock5).get();
        //doReturn(true).when(versionMock).onOrAfter("7.13.0");
        //doReturn(true, false, false, false, false, false, false).when(versionMock).onOrAfter("7.0.0");
        //doReturn(providerMock2, providerMock5, providerMock3, providerMock4).when(providerMock).map((Transformer) any());
        //buildParams.when(() -> BuildParams.getBwcVersions()).thenReturn(bwcVersionsMock);
        //doNothing().when(bwcVersionsMock).forPreviousUnreleased((Consumer) any());
        //internalDistributionBwcSetupPlugin.when(() -> InternalDistributionBwcSetupPlugin.createBuildBwcTask(bwcSetupExtensionMock, projectMock3, providerMock5, "string32", "string33", internalDistributionBwcSetupPluginDistributionProjectArtifactMock, taskProviderMock, "string31")).thenAnswer((Answer<Void>) invocation -> null);
        //InternalDistributionBwcSetupPlugin target = new InternalDistributionBwcSetupPlugin(objectFactoryMock, providerFactoryMock);
        //final NullPointerException result = assertThrows(NullPointerException.class, () -> {    target.apply(projectMock);});
        //assertAll("result", () -> {    assertThat(result, is(notNullValue()));    verify(projectMock, atLeast(1)).getRootProject();    verify(projectMock2, atLeast(1)).getPluginManager();    verify(pluginManagerMock, atLeast(1)).apply(GlobalBuildInfoPlugin.class);    verify(projectMock, atLeast(1)).getPlugins();    verify(pluginContainerMock, atLeast(1)).apply(JvmToolchainsPlugin.class);    verify(projectMock, atLeast(1)).getExtensions();    verify(extensionContainerMock, atLeast(1)).getByType(JavaToolchainService.class);    verify(projectMock, atLeast(1)).project("return_of_gradleProjectPath1");    verify(projectMock3, atLeast(1)).getLayout();    verify(projectLayoutMock, atLeast(1)).getBuildDirectory();    verify(directoryPropertyMock, atLeast(1)).get();    verify(directoryMock, atLeast(1)).getAsFile();    verify(projectMock3, atLeast(1)).getExtensions();    verify(extensionContainerMock2, atLeast(1)).create("bwcSetup", BwcSetupExtension.class, objectArray);    verify(projectMock3, times(2)).getPlugins();    verify(pluginContainerMock2, atLeast(1)).apply(InternalBwcGitPlugin.class);    verify(internalBwcGitPluginMock, atLeast(1)).getGitExtension();    verify(bwcGitExtensionMock, atLeast(1)).setBwcVersion(providerMock3);    verify(bwcGitExtensionMock, atLeast(1)).setBwcBranch(providerMock4);    verify(bwcGitExtensionMock, atLeast(1)).getCheckoutDir();    verify(propertyMock, atLeast(1)).set(providerMock2);    verify(providerMock2, atLeast(1)).get();    verify(pluginContainerMock3, atLeast(1)).apply(LifecycleBasePlugin.class);    verify(projectMock3, times(2)).getTasks();    verify(taskContainerMock, atLeast(1)).register("buildBwc");    verify(taskContainerMock2, atLeast(1)).register(eq("setupGradleUserHome"), eq(Copy.class), (Action) any());    verify(projectMock3, times(2)).getGradle();    verify(gradleMock, atLeast(1)).getGradleUserHomeDir();    verify(projectMock3, atLeast(1)).getName();    verify(gradleMock2, atLeast(1)).getGradleUserHomeDir();    verify(providerFactoryMock, atLeast(1)).provider((Callable) any());    verify(providerMock, atLeast(4)).map((Transformer) any());    verify(providerMock5, atLeast(1)).get();    verify(versionMock, atLeast(1)).onOrAfter("7.13.0");    verify(versionMock, times(7)).onOrAfter("7.0.0");    buildParams.verify(() -> BuildParams.getBwcVersions(), atLeast(1));    verify(bwcVersionsMock, atLeast(1)).forPreviousUnreleased((Consumer) any());    internalDistributionBwcSetupPlugin.verify(() -> InternalDistributionBwcSetupPlugin.createBuildBwcTask(bwcSetupExtensionMock, projectMock3, providerMock5, "string32", "string33", internalDistributionBwcSetupPluginDistributionProjectArtifactMock, taskProviderMock, "string31"), atLeast(1));});
    }

    //Sapient generated method id: ${buildBwcTaskNameTest}, hash: 0DA1BDA471987C9691576DEA59EEBD29
    @Test()
    void buildBwcTaskNameTest() {
        
        //Act Statement(s)
        String result = InternalDistributionBwcSetupPlugin.buildBwcTaskName("A");
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("buildBwcA")));
    }

    //Sapient generated method id: ${createBuildBwcTaskWhenProjectGetGradleGetStartParameterIsBuildCacheEnabled}, hash: 899E29616223E981D6BEAC28FFAAB008
    @Disabled()
    @Test()
    void createBuildBwcTaskWhenProjectGetGradleGetStartParameterIsBuildCacheEnabled() {
        //Act Statement(s)
        //Assert statement(s)
        /* Branches:
         * (projectArtifact.expandedDistDir != null) : false  #  inside lambda$createBuildBwcTask$14 method
         * (useNativeExpanded) : false  #  inside lambda$createBuildBwcTask$14 method
         * (useNativeExpanded) : false  #  inside lambda$createBuildBwcTask$14 method
         * (BuildParams.isCi() == false) : true  #  inside lambda$createBuildBwcTask$13 method
         * (project.getGradle().getStartParameter().isBuildCacheEnabled()) : true  #  inside lambda$createBuildBwcTask$14 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        //TaskProvider<LoggedExec> taskProviderMock = mock(TaskProvider.class);
        //Provider<Version> providerMock = mock(Provider.class);
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //InternalDistributionBwcSetupPlugin.DistributionProjectArtifact internalDistributionBwcSetupPluginDistributionProjectArtifactMock = mock(InternalDistributionBwcSetupPlugin.DistributionProjectArtifact.class);
        //doReturn(taskProviderMock).when(bwcSetupExtensionMock).bwcTask(eq("buildBwcC"), (Action) any());
        //File file = new File("pathname1");
        //doReturn(file).when(projectMock).getBuildDir();
        //doReturn(gradleMock).when(projectMock).getGradle();
        //StartParameter startParameter = new StartParameter();
        //startParameter.setBuildCacheEnabled(true);
        //doReturn(startParameter).when(gradleMock).getStartParameter();
        //File file2 = new File("pathname1");
        //doReturn(file2).when(projectMock).getRootDir();
        //doNothing().when(bwcTaskProviderMock).configure((Action) any());
        //buildParams.when(() -> BuildParams.isCi()).thenReturn(false);
        //InternalDistributionBwcSetupPlugin.createBuildBwcTask(bwcSetupExtensionMock, projectMock, providerMock, "A", "/", internalDistributionBwcSetupPluginDistributionProjectArtifactMock, bwcTaskProviderMock, "D");
        //assertAll("result", () -> {    verify(bwcSetupExtensionMock).bwcTask(eq("buildBwcC"), (Action) any());    verify(projectMock).getBuildDir();    verify(projectMock).getGradle();    verify(gradleMock).getStartParameter();    verify(projectMock).getRootDir();    verify(bwcTaskProviderMock).configure((Action) any());    buildParams.verify(() -> BuildParams.isCi(), atLeast(1));});
    }

    //Sapient generated method id: ${createBuildBwcTaskWhenBuildParamsIsCiNotEqualsFalseAndProjectGetGradleGetStartParameterNotIsBuildCacheEnabled}, hash: 6A17364C8926371CD7F6BEC4B88DBF9B
    @Disabled()
    @Test()
    void createBuildBwcTaskWhenBuildParamsIsCiNotEqualsFalseAndProjectGetGradleGetStartParameterNotIsBuildCacheEnabled() {
        //Act Statement(s)
        //Assert statement(s)
        /* Branches:
         * (projectArtifact.expandedDistDir != null) : false  #  inside lambda$createBuildBwcTask$14 method
         * (useNativeExpanded) : false  #  inside lambda$createBuildBwcTask$14 method
         * (useNativeExpanded) : false  #  inside lambda$createBuildBwcTask$14 method
         * (BuildParams.isCi() == false) : false  #  inside lambda$createBuildBwcTask$13 method
         * (project.getGradle().getStartParameter().isBuildCacheEnabled()) : false  #  inside lambda$createBuildBwcTask$14 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        //TaskProvider<LoggedExec> taskProviderMock = mock(TaskProvider.class);
        //Provider<Version> providerMock = mock(Provider.class);
        //TODO: Please change the modifier of the below class from private to public to isolate the test case scenario.
        //InternalDistributionBwcSetupPlugin.DistributionProjectArtifact internalDistributionBwcSetupPluginDistributionProjectArtifactMock = mock(InternalDistributionBwcSetupPlugin.DistributionProjectArtifact.class);
        //doReturn(taskProviderMock).when(bwcSetupExtensionMock).bwcTask(eq("buildBwcC"), (Action) any());
        //File file = new File("pathname1");
        //doReturn(file).when(projectMock).getBuildDir();
        //doReturn(gradleMock).when(projectMock).getGradle();
        //StartParameter startParameter = new StartParameter();
        //startParameter.setBuildCacheEnabled(false);
        //doReturn(startParameter).when(gradleMock).getStartParameter();
        //File file2 = new File("pathname1");
        //doReturn(file2).when(projectMock).getRootDir();
        //doNothing().when(bwcTaskProviderMock).configure((Action) any());
        //buildParams.when(() -> BuildParams.isCi()).thenReturn(true);
        //InternalDistributionBwcSetupPlugin.createBuildBwcTask(bwcSetupExtensionMock, projectMock, providerMock, "A", "/", internalDistributionBwcSetupPluginDistributionProjectArtifactMock, bwcTaskProviderMock, "D");
        //assertAll("result", () -> {    verify(bwcSetupExtensionMock).bwcTask(eq("buildBwcC"), (Action) any());    verify(projectMock).getBuildDir();    verify(projectMock).getGradle();    verify(gradleMock).getStartParameter();    verify(projectMock).getRootDir();    verify(bwcTaskProviderMock).configure((Action) any());    buildParams.verify(() -> BuildParams.isCi(), atLeast(1));});
    }
}

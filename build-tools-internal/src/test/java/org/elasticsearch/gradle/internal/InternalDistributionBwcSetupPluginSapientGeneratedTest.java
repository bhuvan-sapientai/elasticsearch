package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.InternalDistributionBwcSetupPlugin;

import org.gradle.api.invocation.Gradle;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.plugins.PluginManager;

import static org.mockito.ArgumentMatchers.any;

import org.gradle.api.InvalidUserDataException;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;
import org.gradle.language.base.plugins.LifecycleBasePlugin;

import java.io.File;

import org.mockito.Mock;
import org.gradle.api.file.ProjectLayout;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.tasks.Copy;
import org.gradle.api.provider.ProviderFactory;

import static org.mockito.ArgumentMatchers.anyString;

import org.gradle.api.GradleException;
import org.elasticsearch.gradle.internal.info.GlobalBuildInfoPlugin;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;

import org.gradle.api.model.ObjectFactory;

import java.util.Arrays;

import org.gradle.api.plugins.PluginContainer;

import java.util.List;

import org.elasticsearch.gradle.Version;
import org.junit.jupiter.api.BeforeEach;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collections;

import static org.mockito.ArgumentMatchers.eq;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.elasticsearch.gradle.internal.info.BuildParams;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.plugins.JvmToolchainsPlugin;
import org.gradle.api.file.Directory;
import org.gradle.jvm.toolchain.JavaToolchainService;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.Task;
import org.gradle.api.provider.Provider;

import static org.mockito.ArgumentMatchers.any;

class InternalDistributionBwcSetupPluginSapientGeneratedTest {

    @Mock
    private Project project;

    @Mock
    private Project rootProject;

    @Mock
    private PluginManager pluginManager;

    @Mock
    private PluginContainer pluginContainer;

    @Mock
    private JavaToolchainService javaToolchainService;

    @Mock
    private TaskContainer taskContainer;

    @Mock
    private ProjectLayout projectLayout;

    @Mock
    private DirectoryProperty buildDirectory;

    @Mock
    private Directory buildDir;

    @Mock
    private Gradle gradle;

    @Mock
    private ObjectFactory objectFactory;

    @Mock
    private ProviderFactory providerFactory;

    @Mock
    private ExtensionContainer extensionContainer;

    private InternalDistributionBwcSetupPlugin plugin;

    @BeforeEach
    void setUp() {
        plugin = new InternalDistributionBwcSetupPlugin(objectFactory, providerFactory);
        when(project.getRootProject()).thenReturn(rootProject);
        when(rootProject.getPluginManager()).thenReturn(pluginManager);
        when(project.getPlugins()).thenReturn(pluginContainer);
        when(project.getExtensions()).thenReturn(extensionContainer);
        when(extensionContainer.getByType(JavaToolchainService.class)).thenReturn(javaToolchainService);
        when(project.getTasks()).thenReturn(taskContainer);
        when(project.getLayout()).thenReturn(projectLayout);
        when(projectLayout.getBuildDirectory()).thenReturn(buildDirectory);
        when(buildDirectory.get()).thenReturn(buildDir);
        when(buildDir.getAsFile()).thenReturn(new File("build"));
        when(project.getGradle()).thenReturn(gradle);
        when(gradle.getStartParameter()).thenReturn(mock(org.gradle.StartParameter.class));
    }

    @Test
    void testApply() {
        /*try (MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
    buildParams.when(BuildParams::getBwcVersions).thenReturn(mock(BwcVersions.class));
    plugin.apply(project);
    verify(rootProject.getPluginManager()).apply(GlobalBuildInfoPlugin.class);
    verify(project.getPlugins()).apply(JvmToolchainsPlugin.class);
    verify(project.getExtensions()).getByType(JavaToolchainService.class);
    verify(project.getTasks()).register(eq("buildBwc"), any());
    verify(project.getTasks()).register(eq("setupGradleUserHome"), eq(Copy.class), any());
}*/
    }

    @Test
    void testBuildBwcTaskName() {
        assertEquals("buildBwcFoo", InternalDistributionBwcSetupPlugin.buildBwcTaskName("foo"));
        assertEquals("buildBwcFooBar", InternalDistributionBwcSetupPlugin.buildBwcTaskName("foo-bar"));
    }

    @Test
    void testCreateBuildBwcTask() {
        //BwcSetupExtension bwcSetupExtension = mock(BwcSetupExtension.class);
        //Provider<Version> bwcVersion = mock(Provider.class);
        //TaskProvider<Task> bwcTaskProvider = mock(TaskProvider.class);
        //when(project.getBuildDir()).thenReturn(new File("build"));
        //when(project.getGradle()).thenReturn(mock(Gradle.class));
        //when(project.getGradle().getStartParameter()).thenReturn(mock(org.gradle.StartParameter.class));
        //when(project.getRootDir()).thenReturn(new File("."));
        //InternalDistributionBwcSetupPlugin.createBuildBwcTask(bwcSetupExtension, project, bwcVersion, "testProject", "testPath", new InternalDistributionBwcSetupPlugin.DistributionProjectArtifact(new File("test.zip"), null), bwcTaskProvider, "assemble");
        //verify(bwcSetupExtension).bwcTask(eq("buildBwcTestProject"), any());
        //verify(bwcTaskProvider).configure(any());
    }

    @Test
    void testCreateBuildBwcTaskWithInvalidOutput() {
        //BwcSetupExtension bwcSetupExtension = mock(BwcSetupExtension.class);
        //Provider<Version> bwcVersion = mock(Provider.class);
        //TaskProvider<Task> bwcTaskProvider = mock(TaskProvider.class);
        //when(project.getBuildDir()).thenReturn(new File("build"));
        //when(project.getGradle()).thenReturn(mock(Gradle.class));
        //when(project.getGradle().getStartParameter()).thenReturn(mock(org.gradle.StartParameter.class));
        //when(project.getRootDir()).thenReturn(new File("."));
        //when(bwcVersion.get()).thenReturn(Version.fromString("7.0.0"));
        //InternalDistributionBwcSetupPlugin.DistributionProjectArtifact artifact = new InternalDistributionBwcSetupPlugin.DistributionProjectArtifact(new File("non_existent_file.zip"), null);
        //InternalDistributionBwcSetupPlugin.createBuildBwcTask(bwcSetupExtension, project, bwcVersion, "testProject", "testPath", artifact, bwcTaskProvider, "assemble");
        //verify(bwcSetupExtension).bwcTask(eq("buildBwcTestProject"), any());
        //verify(bwcTaskProvider).configure(any());
    }

    @Test
    void testResolveArchiveProjects() {
        //File checkoutDir = new File("checkout");
        //Version bwcVersion = Version.fromString("7.14.0");
        //List<InternalDistributionBwcSetupPlugin.DistributionProject> result = InternalDistributionBwcSetupPlugin.resolveArchiveProjects(checkoutDir, bwcVersion);
        //assertEquals(9, result.size());
        //assertEquals("deb", result.get(0).name);
        //assertEquals("rpm", result.get(1).name);
        //assertEquals("windows-zip", result.get(2).name);
        //assertEquals("darwin-tar", result.get(3).name);
        //assertEquals("linux-tar", result.get(4).name);
        //assertEquals("darwin-aarch64-tar", result.get(5).name);
        //assertEquals("linux-aarch64-tar", result.get(6).name);
    }
}
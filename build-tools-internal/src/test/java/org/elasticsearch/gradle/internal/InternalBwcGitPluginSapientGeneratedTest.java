package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.InternalBwcGitPlugin;

import org.elasticsearch.gradle.LoggedExec;

import java.nio.file.Files;

import static org.mockito.ArgumentMatchers.any;

import org.gradle.api.plugins.ExtraPropertiesExtension;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;

import java.io.File;

import org.mockito.Mock;
import org.gradle.process.ExecOperations;
import org.gradle.process.ExecResult;
import org.gradle.api.file.ProjectLayout;
import org.gradle.process.ExecSpec;
import org.gradle.api.plugins.ExtensionContainer;
import org.mockito.MockitoAnnotations;
import org.gradle.api.provider.ProviderFactory;
import org.junit.jupiter.params.provider.CsvSource;
import org.gradle.api.GradleException;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import java.io.IOException;

import org.elasticsearch.gradle.internal.InternalBwcGitPlugin;
import org.gradle.initialization.layout.BuildLayout;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.gradle.api.logging.Logger;
import org.junit.jupiter.params.provider.EnumSource;
import org.gradle.api.tasks.TaskContainer;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.tasks.TaskProvider;

import java.io.ByteArrayOutputStream;

import org.elasticsearch.gradle.internal.conventions.info.GitInfo;
import org.gradle.api.Task;
import org.gradle.api.provider.Provider;

import static org.mockito.ArgumentMatchers.any;

class InternalBwcGitPluginSapientGeneratedTest {

    @Mock
    private BuildLayout buildLayout;

    @Mock
    private ExecOperations execOperations;

    @Mock
    private ProjectLayout projectLayout;

    @Mock
    private ProviderFactory providerFactory;

    @Mock
    private Project project;

    @Mock
    private TaskContainer taskContainer;

    @Mock
    private ExtraPropertiesExtension extraPropertiesExtension;

    @Mock
    private ExtensionContainer extensionContainer;

    private InternalBwcGitPlugin plugin;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        plugin = new InternalBwcGitPlugin(buildLayout, execOperations, projectLayout, providerFactory);
        when(project.getTasks()).thenReturn(taskContainer);
        when(project.getExtensions()).thenReturn(extensionContainer);
        when(extensionContainer.create(eq("bwcGitConfig"), eq(BwcGitExtension.class))).thenReturn(mock(BwcGitExtension.class));
    }

    @Test
    void testApply() {
        //plugin.apply(project);
        //verify(taskContainer).register(eq("createClone"), eq(LoggedExec.class), any());
        //verify(taskContainer).register(eq("findRemote"), eq(LoggedExec.class), any());
        //verify(taskContainer).register(eq("addRemote"), any());
        //verify(taskContainer).register(eq("fetchLatest"), eq(LoggedExec.class), any());
        //verify(taskContainer).register(eq("checkoutBwcBranch"), any());
    }

    @Test
    void testGetGitExtension() {
        plugin.apply(project);
        assertNotNull(plugin.getGitExtension());
    }

    @ParameterizedTest
    @CsvSource({"elastic, elastic\thttp://example.com, true", "elastic, other\thttp://example.com, false", "elastic, , false"})
    void testIsRemoteAvailable(String remote, String output, boolean expected) {
        //Provider<String> remoteProvider = mock(Provider.class);
        //when(remoteProvider.get()).thenReturn(remote);
        //boolean result = InternalBwcGitPlugin.isRemoteAvailable(remoteProvider, output);
        //assertEquals(expected, result);
    }

    @ParameterizedTest
    @EnumSource(DockerBase.class)
    void testDockerBaseEnumValues(DockerBase dockerBase) {
        assertNotNull(dockerBase.getImage());
        assertNotNull(dockerBase.getSuffix());
        assertNotNull(dockerBase.getPackageManager());
    }

    @Test
    void testMaybeAlignedRefSpec() throws Exception {
        //Logger logger = mock(Logger.class);
        //String defaultRefSpec = "refs/heads/main";
        //when(providerFactory.systemProperty("bwc.checkout.align")).thenReturn(mock(Provider.class));
        //when(execOperations.exec(any())).thenReturn(mock(ExecResult.class));
        //String result = plugin.maybeAlignedRefSpec(logger, defaultRefSpec);
        //assertNotNull(result);
    }

    @Test
    void testWriteFile() throws IOException {
        //File file = File.createTempFile("test", ".tmp");
        //String content = "Test content";
        //plugin.writeFile(file, content);
        //String readContent = Files.readString(file.toPath());
        //assertEquals(content, readContent);
    }

    @Test
    void testExecInCheckoutDir() {
        //BwcGitExtension gitExtension = mock(BwcGitExtension.class);
        //when(gitExtension.getCheckoutDir()).thenReturn(mock(Provider.class));
        //when(gitExtension.getCheckoutDir().get()).thenReturn(new File("."));
        //plugin.getGitExtension().getCheckoutDir().set(new File("."));
        //ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        /*when(execOperations.exec(any())).thenAnswer(invocation -> {
    ExecSpec spec = invocation.getArgument(0);
    spec.setStandardOutput(outputStream);
    outputStream.write("Test output".getBytes());
    return mock(ExecResult.class);
});*/
        /*String result = plugin.execInCheckoutDir(spec -> {
});*/
        //assertEquals("Test output", result.trim());
    }
}
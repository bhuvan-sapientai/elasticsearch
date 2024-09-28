package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.InternalBwcGitPlugin;
import org.elasticsearch.gradle.LoggedExec;
import java.nio.file.Files;
import java.io.UncheckedIOException;
import javax.inject.Inject;
import org.gradle.api.plugins.ExtraPropertiesExtension;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;
import java.io.File;
import org.mockito.Mock;
import org.gradle.api.Action;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;
import org.gradle.process.ExecOperations;
import org.gradle.process.ExecResult;
import org.gradle.api.file.ProjectLayout;
import org.gradle.process.ExecSpec;
import org.gradle.api.provider.ProviderFactory;
import org.junit.jupiter.params.provider.CsvSource;
import org.gradle.api.GradleException;
import static org.mockito.Mockito.*;
import java.io.IOException;
import java.util.Arrays;
import org.gradle.initialization.layout.BuildLayout;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import static java.nio.file.StandardOpenOption.CREATE;
import org.gradle.api.logging.Logger;
import org.junit.jupiter.params.provider.EnumSource;
import org.gradle.api.Plugin;
import org.gradle.api.tasks.TaskContainer;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;
import org.gradle.api.tasks.TaskProvider;
import java.io.ByteArrayOutputStream;
import org.elasticsearch.gradle.internal.conventions.info.GitInfo;
import org.gradle.api.Task;
import org.gradle.api.provider.Provider;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

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

    private InternalBwcGitPlugin plugin;

    @BeforeEach
    void setUp() {
        plugin = new InternalBwcGitPlugin(buildLayout, execOperations, projectLayout, providerFactory);
        when(project.getTasks()).thenReturn(taskContainer);
        when(project.getExtensions()).thenReturn(mock(org.gradle.api.plugins.ExtensionContainer.class));
        when(project.getExtensions().create(eq("bwcGitConfig"), eq(BwcGitExtension.class))).thenReturn(mock(BwcGitExtension.class));
    }

    @Disabled()
    @Test
    void testApply() {
        //plugin.apply(project);
        //verify(project.getTasks()).register(eq("createClone"), eq(LoggedExec.class), any());
        //verify(project.getTasks()).register(eq("findRemote"), eq(LoggedExec.class), any());
        //verify(project.getTasks()).register(eq("addRemote"), any());
        //verify(project.getTasks()).register(eq("fetchLatest"), eq(LoggedExec.class), any());
        //verify(project.getTasks()).register(eq("checkoutBwcBranch"), any());
    }

    @Disabled()
    @Test
    void testGetGitExtension() {
        plugin.apply(project);
        assertNotNull(plugin.getGitExtension());
    }

    @Disabled()
    @Test
    void testMaybeAlignedRefSpec() throws Exception {
        //Logger logger = mock(Logger.class);
        //Provider<String> bwcCheckoutAlignProvider = mock(Provider.class);
        //when(providerFactory.systemProperty("bwc.checkout.align")).thenReturn(bwcCheckoutAlignProvider);
        //when(bwcCheckoutAlignProvider.isPresent()).thenReturn(true);
        //ExecResult execResult = mock(ExecResult.class);
        //when(execResult.getExitValue()).thenReturn(0);
        //when(execOperations.exec(any())).thenReturn(execResult);
        //String result = plugin.maybeAlignedRefSpec(logger, "defaultRefSpec");
        //assertNotNull(result);
        //verify(execOperations, times(3)).exec(any());
    }

    @Disabled()
    @ParameterizedTest
    @CsvSource({ "elastic, elastic\thttp://example.com, true", "elastic, other\thttp://example.com, false", "elastic, , false" })
    void testIsRemoteAvailable(String remote, String output, boolean expected) {
        //Provider<String> remoteProvider = mock(Provider.class);
        //when(remoteProvider.get()).thenReturn(remote);
        //assertEquals(expected, InternalBwcGitPlugin.isRemoteAvailable(remoteProvider, output));
    }

    @Disabled()
    @ParameterizedTest
    @EnumSource(DockerBase.class)
    void testDockerBaseEnumValues(DockerBase dockerBase) {
        assertNotNull(dockerBase.getImage());
        assertNotNull(dockerBase.getSuffix());
        assertNotNull(dockerBase.getPackageManager());
    }

    @Disabled()
    @Test
    void testWriteFile() throws IOException {
        //File tempFile = File.createTempFile("test", ".txt");
        //tempFile.deleteOnExit();
        //String content = "Test content";
        //plugin.writeFile(tempFile, content);
        //String readContent = new String(Files.readAllBytes(tempFile.toPath()));
        //assertEquals(content, readContent);
    }

    @Disabled()
    @Test
    void testExecInCheckoutDir() {
        //BwcGitExtension gitExtension = mock(BwcGitExtension.class);
        //when(gitExtension.getCheckoutDir()).thenReturn(mock(Provider.class));
        //when(gitExtension.getCheckoutDir().get()).thenReturn(new File("/tmp"));
        //ExecResult execResult = mock(ExecResult.class);
        //when(execResult.getExitValue()).thenReturn(0);
        //when(execOperations.exec(any())).thenReturn(execResult);
        //Action<ExecSpec> action = mock(Action.class);
        //String result = plugin.execInCheckoutDir(action);
        //assertNotNull(result);
        //verify(execOperations).exec(any());
        //verify(action).execute(any());
    }

    @Disabled()
    @Test
    void testExecInCheckoutDirWithNonZeroExitValue() {
        //BwcGitExtension gitExtension = mock(BwcGitExtension.class);
        //when(gitExtension.getCheckoutDir()).thenReturn(mock(Provider.class));
        //when(gitExtension.getCheckoutDir().get()).thenReturn(new File("/tmp"));
        //ExecResult execResult = mock(ExecResult.class);
        //when(execResult.getExitValue()).thenReturn(1);
        //when(execOperations.exec(any())).thenReturn(execResult);
        //Action<ExecSpec> action = mock(Action.class);
        //assertThrows(GradleException.class, () -> plugin.execInCheckoutDir(action));
    }
}

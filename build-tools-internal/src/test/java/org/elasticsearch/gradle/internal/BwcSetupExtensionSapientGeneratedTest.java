package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.BwcSetupExtension;

import org.elasticsearch.gradle.LoggedExec;
import org.gradle.api.provider.Property;
import org.junit.jupiter.api.Test;
import org.elasticsearch.gradle.OS;
import org.gradle.api.Project;

import java.io.File;

import org.mockito.Mock;
import org.gradle.api.Action;
import org.mockito.MockitoAnnotations;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.logging.LogLevel;
import org.junit.jupiter.params.provider.CsvSource;
import org.gradle.api.GradleException;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import org.gradle.api.model.ObjectFactory;

import java.io.IOException;
import java.util.Arrays;

import org.elasticsearch.gradle.Version;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.elasticsearch.gradle.internal.info.BuildParams;
import org.gradle.jvm.toolchain.JavaToolchainService;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.jvm.toolchain.JavaLanguageVersion;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.provider.Provider;

import static org.mockito.ArgumentMatchers.any;

class BwcSetupExtensionSapientGeneratedTest {

    @Mock
    private Project project;

    @Mock
    private ObjectFactory objectFactory;

    @Mock
    private ProviderFactory providerFactory;

    @Mock
    private JavaToolchainService toolChainService;

    @Mock
    private Provider<BwcVersions.UnreleasedVersionInfo> unreleasedVersionInfo;

    @Mock
    private Provider<File> checkoutDir;

    private BwcSetupExtension bwcSetupExtension;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        bwcSetupExtension = new BwcSetupExtension(project, objectFactory, providerFactory, toolChainService, unreleasedVersionInfo, checkoutDir);
    }

    @Test
    void testBwcTaskWithDefaultUniqueUserHome() {
        //TaskProvider<LoggedExec> taskProvider = mock(TaskProvider.class);
        //when(project.getTasks()).thenReturn(mock(Project.TaskContainer.class));
        //when(project.getTasks().register(eq("testTask"), eq(LoggedExec.class), any(Action.class))).thenReturn(taskProvider);
        /*TaskProvider<LoggedExec> result = bwcSetupExtension.bwcTask("testTask", task -> {
});*/
        //assertNotNull(result);
        //verify(project.getTasks()).register(eq("testTask"), eq(LoggedExec.class), any(Action.class));
    }

    @Test
    void testBwcTaskWithSpecifiedUniqueUserHome() {
        //TaskProvider<LoggedExec> taskProvider = mock(TaskProvider.class);
        //when(project.getTasks()).thenReturn(mock(Project.TaskContainer.class));
        //when(project.getTasks().register(eq("testTask"), eq(LoggedExec.class), any(Action.class))).thenReturn(taskProvider);
        /*TaskProvider<LoggedExec> result = bwcSetupExtension.bwcTask("testTask", task -> {
}, false);*/
        //assertNotNull(result);
        //verify(project.getTasks()).register(eq("testTask"), eq(LoggedExec.class), any(Action.class));
    }

    @ParameterizedTest
    @CsvSource({"WINDOWS, cmd", "MAC, /tmp/checkout/gradlew", "LINUX, /tmp/checkout/gradlew"})
    void testCreateRunBwcGradleTaskExecutableBasedOnOS(OS os, String expectedExecutable) {
        //when(checkoutDir.get()).thenReturn(new File("/tmp/checkout"));
        //when(project.getGradle()).thenReturn(mock(org.gradle.api.invocation.Gradle.class));
        //when(project.getGradle().getGradleUserHomeDir()).thenReturn(new File("/tmp/gradle-user-home"));
        //when(project.getName()).thenReturn("test-project");
        /*try (var osStaticMock = mockStatic(OS.class)) {
    osStaticMock.when(OS::current).thenReturn(os);
    TaskProvider<LoggedExec> taskProvider = mock(TaskProvider.class);
    when(project.getTasks()).thenReturn(mock(Project.TaskContainer.class));
    when(project.getTasks().register(eq("testTask"), eq(LoggedExec.class), any(Action.class))).thenReturn(taskProvider);
    TaskProvider<LoggedExec> result = bwcSetupExtension.bwcTask("testTask", task -> {
    }, true);
    assertNotNull(result);
    verify(project.getTasks()).register(eq("testTask"), eq(LoggedExec.class), any(Action.class));
}*/
    }

    @Test
    void testGetJavaHome() {
        //JavaToolchainService toolChainService = mock(JavaToolchainService.class);
        //ObjectFactory objectFactory = mock(ObjectFactory.class);
        //Property<JavaLanguageVersion> javaVersionProperty = mock(Property.class);
        //when(objectFactory.property(JavaLanguageVersion.class)).thenReturn(javaVersionProperty);
        //when(javaVersionProperty.value(any(JavaLanguageVersion.class))).thenReturn(javaVersionProperty);
        //Provider<String> javaHomeProvider = BwcSetupExtension.getJavaHome(objectFactory, toolChainService, 11);
        //assertNotNull(javaHomeProvider);
        //verify(toolChainService).launcherFor(any());
    }

    @Test
    void testJavaHomeValueSource() throws IOException {
        BwcSetupExtension.JavaHomeValueSource javaHomeValueSource = new BwcSetupExtension.JavaHomeValueSource() {

            @Override
            public Params getParameters() {
                return new Params() {

                    @Override
                    public Property<Version> getVersion() {
                        Property<Version> versionProperty = mock(Property.class);
                        when(versionProperty.get()).thenReturn(Version.fromString("7.15.0"));
                        return versionProperty;
                    }

                    @Override
                    public Property<File> getCheckoutDir() {
                        Property<File> checkoutDirProperty = mock(Property.class);
                        when(checkoutDirProperty.get()).thenReturn(new File("/tmp/checkout"));
                        return checkoutDirProperty;
                    }
                };
            }
        };
        String result = javaHomeValueSource.obtain();
        assertNotNull(result);
    }

    @ParameterizedTest
    @CsvSource({"1.0.0, 1, 0, 0", "2.3.4, 2, 3, 4", "1.0.0-alpha1, 1, 0, 0", "2.3.4-beta2, 2, 3, 4", "3.0.0-rc1, 3, 0, 0", "4.5.6-SNAPSHOT, 4, 5, 6"})
    void testVersionFromString(String versionString, int expectedMajor, int expectedMinor, int expectedRevision) {
        Version version = Version.fromString(versionString);
        assertEquals(expectedMajor, version.getMajor());
        assertEquals(expectedMinor, version.getMinor());
        assertEquals(expectedRevision, version.getRevision());
    }

    @Test
    void testVersionFromStringThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> Version.fromString("invalid.version"));
    }

    @ParameterizedTest
    @CsvSource({"1.0.0, 2.0.0, true", "2.0.0, 1.0.0, false", "1.0.0, 1.0.0, false"})
    void testVersionBefore(String version1, String version2, boolean expected) {
        Version v1 = Version.fromString(version1);
        Version v2 = Version.fromString(version2);
        assertEquals(expected, v1.before(v2));
    }

    @ParameterizedTest
    @CsvSource({"1.0.0, 2.0.0, true", "2.0.0, 1.0.0, false", "1.0.0, 1.0.0, true"})
    void testVersionOnOrBefore(String version1, String version2, boolean expected) {
        Version v1 = Version.fromString(version1);
        Version v2 = Version.fromString(version2);
        assertEquals(expected, v1.onOrBefore(v2));
    }

    @ParameterizedTest
    @CsvSource({"1.0.0, 2.0.0, false", "2.0.0, 1.0.0, true", "1.0.0, 1.0.0, true"})
    void testVersionOnOrAfter(String version1, String version2, boolean expected) {
        Version v1 = Version.fromString(version1);
        Version v2 = Version.fromString(version2);
        assertEquals(expected, v1.onOrAfter(v2));
    }

    @ParameterizedTest
    @CsvSource({"1.0.0, 2.0.0, false", "2.0.0, 1.0.0, true", "1.0.0, 1.0.0, false"})
    void testVersionAfter(String version1, String version2, boolean expected) {
        Version v1 = Version.fromString(version1);
        Version v2 = Version.fromString(version2);
        assertEquals(expected, v1.after(v2));
    }

    @Test
    void testVersionEquals() {
        Version v1 = Version.fromString("1.0.0");
        Version v2 = Version.fromString("1.0.0");
        Version v3 = Version.fromString("2.0.0");
        assertEquals(v1, v2);
        assertNotEquals(v1, v3);
        assertNotEquals(v1, null);
        assertNotEquals(v1, "1.0.0");
    }

    @Test
    void testVersionHashCode() {
        Version v1 = Version.fromString("1.0.0");
        Version v2 = Version.fromString("1.0.0");
        Version v3 = Version.fromString("2.0.0");
        assertEquals(v1.hashCode(), v2.hashCode());
        assertNotEquals(v1.hashCode(), v3.hashCode());
    }

    @Test
    void testVersionCompareTo() {
        Version v1 = Version.fromString("1.0.0");
        Version v2 = Version.fromString("2.0.0");
        Version v3 = Version.fromString("1.0.0");
        assertTrue(v1.compareTo(v2) < 0);
        assertTrue(v2.compareTo(v1) > 0);
        assertEquals(0, v1.compareTo(v3));
    }
}
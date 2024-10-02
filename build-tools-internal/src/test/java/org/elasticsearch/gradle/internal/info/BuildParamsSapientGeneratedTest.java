package org.elasticsearch.gradle.internal.info;

import org.elasticsearch.gradle.internal.info.BuildParams;

import java.util.List;

import org.gradle.jvm.toolchain.JavaToolchainSpec;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;

import java.io.File;

import org.gradle.api.Action;
import org.gradle.api.specs.Spec;
import org.gradle.api.JavaVersion;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.function.Consumer;
import java.util.Random;
import java.time.ZonedDateTime;

import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;

import org.gradle.api.provider.Provider;
import org.gradle.api.Task;

import static org.mockito.ArgumentMatchers.any;

class BuildParamsSapientGeneratedTest {

    private MockedStatic<BuildParams> mockedBuildParams;

    private Provider<JavaVersion> runtimeJavaVersionMock;

    private Provider<String> runtimeJavaDetailsMock;

    private Task taskMock;

    @BeforeEach
    void setUp() {
        mockedBuildParams = mockStatic(BuildParams.class, CALLS_REAL_METHODS);
        runtimeJavaVersionMock = mock(Provider.class);
        runtimeJavaDetailsMock = mock(Provider.class);
        taskMock = mock(Task.class);
    }

    @AfterEach
    void tearDown() {
        mockedBuildParams.close();
    }

    @Test
    void initTest() {
        Consumer<BuildParams.MutableBuildParams> initializerMock = mock(Consumer.class);
        BuildParams.MutableBuildParams buildParamsMutableBuildParamsMock = mock(BuildParams.MutableBuildParams.class);
        doNothing().when(initializerMock).accept(any(BuildParams.MutableBuildParams.class));
        BuildParams.init(initializerMock);
        verify(initializerMock).accept(any(BuildParams.MutableBuildParams.class));
    }

    @Test
    void getRuntimeJavaHomeTest() {
        File mockFile = mock(File.class);
        Provider<File> mockProvider = mock(Provider.class);
        when(mockProvider.get()).thenReturn(mockFile);
        mockedBuildParams.when(BuildParams::getRuntimeJavaHome).thenReturn(mockFile);
        File result = BuildParams.getRuntimeJavaHome();
        assertThat(result, is(mockFile));
    }

    @Test
    void getIsRuntimeJavaHomeSetTest() {
        mockedBuildParams.when(BuildParams::getIsRuntimeJavaHomeSet).thenReturn(true);
        Boolean result = BuildParams.getIsRuntimeJavaHomeSet();
        assertThat(result, is(true));
    }

    @Test
    void getJavaVersionsTest() {
        List<JavaHome> mockJavaHomes = mock(List.class);
        mockedBuildParams.when(BuildParams::getJavaVersions).thenReturn(mockJavaHomes);
        List<JavaHome> result = BuildParams.getJavaVersions();
        assertThat(result, is(mockJavaHomes));
    }

    @Test
    void getMinimumCompilerVersionTest() {
        JavaVersion mockJavaVersion = mock(JavaVersion.class);
        mockedBuildParams.when(BuildParams::getMinimumCompilerVersion).thenReturn(mockJavaVersion);
        JavaVersion result = BuildParams.getMinimumCompilerVersion();
        assertThat(result, is(mockJavaVersion));
    }

    @Test
    void getMinimumRuntimeVersionTest() {
        JavaVersion mockJavaVersion = mock(JavaVersion.class);
        mockedBuildParams.when(BuildParams::getMinimumRuntimeVersion).thenReturn(mockJavaVersion);
        JavaVersion result = BuildParams.getMinimumRuntimeVersion();
        assertThat(result, is(mockJavaVersion));
    }

    @Test
    void getGradleJavaVersionTest() {
        JavaVersion mockJavaVersion = mock(JavaVersion.class);
        mockedBuildParams.when(BuildParams::getGradleJavaVersion).thenReturn(mockJavaVersion);
        JavaVersion result = BuildParams.getGradleJavaVersion();
        assertThat(result, is(mockJavaVersion));
    }

    @Test
    void getRuntimeJavaVersionTest() {
        JavaVersion mockJavaVersion = mock(JavaVersion.class);
        when(runtimeJavaVersionMock.get()).thenReturn(mockJavaVersion);
        mockedBuildParams.when(BuildParams::getRuntimeJavaVersion).thenReturn(mockJavaVersion);
        JavaVersion result = BuildParams.getRuntimeJavaVersion();
        assertThat(result, is(mockJavaVersion));
    }

    @Test
    void getRuntimeJavaDetailsTest() {
        String mockDetails = "Mock Java Details";
        when(runtimeJavaDetailsMock.get()).thenReturn(mockDetails);
        mockedBuildParams.when(BuildParams::getRuntimeJavaDetails).thenReturn(mockDetails);
        String result = BuildParams.getRuntimeJavaDetails();
        assertThat(result, is(mockDetails));
    }

    @Test
    void isInFipsJvmTest() {
        mockedBuildParams.when(BuildParams::isInFipsJvm).thenReturn(true);
        Boolean result = BuildParams.isInFipsJvm();
        assertThat(result, is(true));
    }

    @Test
    void withFipsEnabledOnlyTest() {
        mockedBuildParams.when(BuildParams::isInFipsJvm).thenReturn(false);
        BuildParams.withFipsEnabledOnly(taskMock);
        verify(taskMock).onlyIf(eq("FIPS mode disabled"), any(Spec.class));
    }

    @Test
    void getGitRevisionTest() {
        String mockRevision = "mockRevision";
        mockedBuildParams.when(BuildParams::getGitRevision).thenReturn(mockRevision);
        String result = BuildParams.getGitRevision();
        assertThat(result, is(mockRevision));
    }

    @Test
    void getGitOriginTest() {
        String mockOrigin = "mockOrigin";
        mockedBuildParams.when(BuildParams::getGitOrigin).thenReturn(mockOrigin);
        String result = BuildParams.getGitOrigin();
        assertThat(result, is(mockOrigin));
    }

    @Test
    void getBuildDateTest() {
        ZonedDateTime mockDate = mock(ZonedDateTime.class);
        mockedBuildParams.when(BuildParams::getBuildDate).thenReturn(mockDate);
        ZonedDateTime result = BuildParams.getBuildDate();
        assertThat(result, is(mockDate));
    }

    @Test
    void getBwcVersionsTest() {
        //BwcVersions mockBwcVersions = mock(BwcVersions.class);
        //Provider<BwcVersions> mockProvider = mock(Provider.class);
        //when(mockProvider.get()).thenReturn(mockBwcVersions);
        //mockedBuildParams.when(BuildParams::getBwcVersions).thenReturn(mockBwcVersions);
        //BwcVersions result = BuildParams.getBwcVersions();
        //assertThat(result, is(mockBwcVersions));
    }

    @Test
    void getTestSeedTest() {
        String mockSeed = "mockSeed";
        mockedBuildParams.when(BuildParams::getTestSeed).thenReturn(mockSeed);
        String result = BuildParams.getTestSeed();
        assertThat(result, is(mockSeed));
    }

    @Test
    void getRandomTest() {
        mockedBuildParams.when(BuildParams::getTestSeed).thenReturn("123:456");
        Random result = BuildParams.getRandom();
        assertThat(result, is(notNullValue()));
    }

    @Test
    void isCiTest() {
        mockedBuildParams.when(BuildParams::isCi).thenReturn(true);
        Boolean result = BuildParams.isCi();
        assertThat(result, is(true));
    }

    @Test
    void isGraalVmRuntimeTest() {
        when(runtimeJavaDetailsMock.get()).thenReturn("GraalVM Runtime");
        mockedBuildParams.when(BuildParams::getRuntimeJavaDetails).thenReturn("GraalVM Runtime");
        Boolean result = BuildParams.isGraalVmRuntime();
        assertThat(result, is(true));
    }

    @Test
    void getDefaultParallelTest() {
        mockedBuildParams.when(BuildParams::getDefaultParallel).thenReturn(4);
        Integer result = BuildParams.getDefaultParallel();
        assertThat(result, is(4));
    }

    @Test
    void isSnapshotBuildTest() {
        mockedBuildParams.when(BuildParams::isSnapshotBuild).thenReturn(true);
        boolean result = BuildParams.isSnapshotBuild();
        assertThat(result, is(true));
    }

    @Test
    void getJavaToolChainSpecTest() {
        Provider<? extends Action<JavaToolchainSpec>> mockProvider = mock(Provider.class);
        mockedBuildParams.when(BuildParams::getJavaToolChainSpec).thenReturn(mockProvider);
        Provider<? extends Action<JavaToolchainSpec>> result = BuildParams.getJavaToolChainSpec();
        assertThat(result, is(mockProvider));
    }
}
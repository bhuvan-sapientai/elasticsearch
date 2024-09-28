package org.elasticsearch.gradle.internal.conventions.info;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.StartParameter;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.Action;
import org.gradle.api.invocation.Gradle;
import org.gradle.api.provider.Provider;
import org.gradle.process.ExecOutput;
import org.gradle.api.Project;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ParallelDetectorSapientGeneratedTest {

    private final ExecOutput execOutputMock = mock(ExecOutput.class);

    private final ExecOutput.StandardStreamContent execOutputStandardStreamContentMock = mock(ExecOutput.StandardStreamContent.class);

    private final Gradle gradleMock = mock(Gradle.class);

    private final Project projectMock = mock(Project.class);

    private final ProviderFactory providerFactoryMock = mock(ProviderFactory.class);

    private final ProviderFactory providerFactoryMock2 = mock(ProviderFactory.class);

    private final ProviderFactory providerFactoryMock3 = mock(ProviderFactory.class);

    private final ProviderFactory providerFactoryMock4 = mock(ProviderFactory.class);

    private final Provider<String> providerMock = mock(Provider.class);

    private final Provider<String> providerMock2 = mock(Provider.class);

    private final Provider<String> providerMock3 = mock(Provider.class);

    private final Provider<String> providerMock4 = mock(Provider.class);

    private final StartParameter startParameterMock = mock(StartParameter.class);

    //Sapient generated method id: ${findDefaultParallelWhen_defaultParallelIsNull}, hash: A77F02CC2CC86E4398697D2F2D2B4531
    @Test()
    void findDefaultParallelWhen_defaultParallelIsNull() {
        /* Branches:
         * (_defaultParallel == null) : true
         * (cpuInfoFile.exists()) : false
         * (providers.systemProperty("os.name").getOrElse("").startsWith("Mac")) : false  #  inside isMac method
         * (isMac(project.getProviders())) : false
         * (_defaultParallel == null) : true
         */
        //Arrange Statement(s)
        doReturn(providerFactoryMock).when(projectMock).getProviders();
        doReturn(providerMock).when(providerFactoryMock).systemProperty("os.name");
        doReturn("A").when(providerMock).getOrElse("");
        doReturn(gradleMock).when(projectMock).getGradle();
        doReturn(startParameterMock).when(gradleMock).getStartParameter();
        doReturn(4).when(startParameterMock).getMaxWorkerCount();
        //Act Statement(s)
        int result = ParallelDetector.findDefaultParallel(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(4));
            verify(projectMock).getProviders();
            verify(providerFactoryMock).systemProperty("os.name");
            verify(providerMock).getOrElse("");
            verify(projectMock).getGradle();
            verify(gradleMock).getStartParameter();
            verify(startParameterMock).getMaxWorkerCount();
        });
    }

    //Sapient generated method id: ${findDefaultParallelWhen_defaultParallelIsNotNullAnd_defaultParallelLessThan1}, hash: C2DCFF64A199FDF99BEEF9AAD305DA74
    @Disabled()
    @Test()
    void findDefaultParallelWhen_defaultParallelIsNotNullAnd_defaultParallelLessThan1() {
        /* Branches:
         * (_defaultParallel == null) : true
         * (cpuInfoFile.exists()) : false
         * (providers.systemProperty("os.name").getOrElse("").startsWith("Mac")) : true  #  inside isMac method
         * (isMac(project.getProviders())) : true
         * (isAppleSilicon) : true
         * (rawVersion.isEmpty()) : true  #  inside isMontereyOrNewer method
         * (isMontereyOrNewer(project.getProviders())) : false
         * (_defaultParallel == null) : false
         * (_defaultParallel < 1) : true
         */
        doReturn(providerMock).when(providerFactoryMock).systemProperty("os.name");
        doReturn("Mac").when(providerMock).getOrElse("");
        doReturn(providerMock2).when(providerFactoryMock2).systemProperty("os.arch");
        doReturn("aarch64").when(providerMock2).getOrElse("");
        doReturn(providerMock3).when(providerFactoryMock3).systemProperty("os.version");
        doReturn(" ").when(providerMock3).getOrElse("");
        doReturn(providerFactoryMock, providerFactoryMock2, providerFactoryMock3, providerFactoryMock4).when(projectMock).getProviders();
        doReturn(execOutputMock).when(providerFactoryMock4).exec((Action) any());
        doReturn(execOutputStandardStreamContentMock).when(execOutputMock).getStandardOutput();
        doReturn(providerMock4).when(execOutputStandardStreamContentMock).getAsText();
        doReturn("0 ").when(providerMock4).get();
        doReturn(gradleMock).when(projectMock).getGradle();
        doReturn(startParameterMock).when(gradleMock).getStartParameter();
        doReturn(4).when(startParameterMock).getMaxWorkerCount();
        //Act Statement(s)
        int result = ParallelDetector.findDefaultParallel(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(4));
            verify(projectMock, times(4)).getProviders();
            verify(providerFactoryMock).systemProperty("os.name");
            verify(providerMock).getOrElse("");
            verify(providerFactoryMock2).systemProperty("os.arch");
            verify(providerMock2).getOrElse("");
            verify(providerFactoryMock3).systemProperty("os.version");
            verify(providerMock3).getOrElse("");
            verify(providerFactoryMock4).exec((Action) any());
            verify(execOutputMock, atLeast(1)).getStandardOutput();
            verify(execOutputStandardStreamContentMock).getAsText();
            verify(providerMock4).get();
            verify(projectMock).getGradle();
            verify(gradleMock).getStartParameter();
            verify(startParameterMock).getMaxWorkerCount();
        });
    }

    //Sapient generated method id: ${findDefaultParallelWhenIsMontereyOrNewerProjectGetProvidersAnd_defaultParallelIsNull}, hash: 111369ED71021F8E71551303C2F8049E
    @Disabled()
    @Test()
    void findDefaultParallelWhenIsMontereyOrNewerProjectGetProvidersAnd_defaultParallelIsNull() {
        /* Branches:
         * (_defaultParallel == null) : true
         * (cpuInfoFile.exists()) : false
         * (providers.systemProperty("os.name").getOrElse("").startsWith("Mac")) : true  #  inside isMac method
         * (isMac(project.getProviders())) : true
         * (isAppleSilicon) : true
         * (rawVersion.isEmpty()) : false  #  inside isMontereyOrNewer method
         * (Integer.parseInt(majorVersion) >= MACOS_MONTEREY_MAJOR_VERSION) : true  #  inside isMontereyOrNewer method
         * (isMontereyOrNewer(project.getProviders())) : true
         * (_defaultParallel == null) : true
         */
        doReturn(providerMock).when(providerFactoryMock).systemProperty("os.name");
        doReturn("Mac").when(providerMock).getOrElse("");
        doReturn(providerMock2).when(providerFactoryMock2).systemProperty("os.arch");
        doReturn("aarch64").when(providerMock2).getOrElse("");
        doReturn(providerMock3).when(providerFactoryMock3).systemProperty("os.version");
        doReturn("C ").when(providerMock3).getOrElse("");
        doReturn(providerFactoryMock, providerFactoryMock2, providerFactoryMock3, providerFactoryMock4).when(projectMock).getProviders();
        doReturn(execOutputMock).when(providerFactoryMock4).exec((Action) any());
        doReturn(execOutputStandardStreamContentMock).when(execOutputMock).getStandardOutput();
        doReturn(providerMock4).when(execOutputStandardStreamContentMock).getAsText();
        doReturn("0 ").when(providerMock4).get();
        doReturn(gradleMock).when(projectMock).getGradle();
        doReturn(startParameterMock).when(gradleMock).getStartParameter();
        doReturn(-19455).when(startParameterMock).getMaxWorkerCount();
        //Act Statement(s)
        int result = ParallelDetector.findDefaultParallel(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(-19455));
            verify(projectMock, times(4)).getProviders();
            verify(providerFactoryMock).systemProperty("os.name");
            verify(providerMock).getOrElse("");
            verify(providerFactoryMock2).systemProperty("os.arch");
            verify(providerMock2).getOrElse("");
            verify(providerFactoryMock3).systemProperty("os.version");
            verify(providerMock3).getOrElse("");
            verify(providerFactoryMock4).exec((Action) any());
            verify(execOutputMock, atLeast(1)).getStandardOutput();
            verify(execOutputStandardStreamContentMock).getAsText();
            verify(providerMock4).get();
            verify(projectMock).getGradle();
            verify(gradleMock).getStartParameter();
            verify(startParameterMock).getMaxWorkerCount();
        });
    }

    //Sapient generated method id: ${findDefaultParallelWhenIntegerParseIntMajorVersionLessThanMACOS_MONTEREY_MAJOR_VERSIONAndIsMontereyOrNewerNotProjectGet}, hash: E15DFFC5FCD2813FE9738E82B5173EFB
    @Disabled()
    @Test()
    void findDefaultParallelWhenIntegerParseIntMajorVersionLessThanMACOS_MONTEREY_MAJOR_VERSIONAndIsMontereyOrNewerNotProjectGet() {
        /* Branches:
         * (_defaultParallel == null) : true
         * (cpuInfoFile.exists()) : false
         * (providers.systemProperty("os.name").getOrElse("").startsWith("Mac")) : true  #  inside isMac method
         * (isMac(project.getProviders())) : true
         * (isAppleSilicon) : true
         * (rawVersion.isEmpty()) : false  #  inside isMontereyOrNewer method
         * (Integer.parseInt(majorVersion) >= MACOS_MONTEREY_MAJOR_VERSION) : false  #  inside isMontereyOrNewer method
         * (isMontereyOrNewer(project.getProviders())) : false
         * (_defaultParallel == null) : true
         */
        doReturn(providerMock).when(providerFactoryMock).systemProperty("os.name");
        doReturn("MacA").when(providerMock).getOrElse("");
        doReturn(providerMock2).when(providerFactoryMock2).systemProperty("os.arch");
        doReturn("aarch64").when(providerMock2).getOrElse("");
        doReturn(providerMock3).when(providerFactoryMock3).systemProperty("os.version");
        doReturn("C ").when(providerMock3).getOrElse("");
        doReturn(providerFactoryMock, providerFactoryMock2, providerFactoryMock3, providerFactoryMock4).when(projectMock).getProviders();
        doReturn(execOutputMock).when(providerFactoryMock4).exec((Action) any());
        doReturn(execOutputStandardStreamContentMock).when(execOutputMock).getStandardOutput();
        doReturn(providerMock4).when(execOutputStandardStreamContentMock).getAsText();
        doReturn("0 ").when(providerMock4).get();
        doReturn(gradleMock).when(projectMock).getGradle();
        doReturn(startParameterMock).when(gradleMock).getStartParameter();
        doReturn(4).when(startParameterMock).getMaxWorkerCount();
        //Act Statement(s)
        int result = ParallelDetector.findDefaultParallel(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(4));
            verify(projectMock, times(4)).getProviders();
            verify(providerFactoryMock).systemProperty("os.name");
            verify(providerMock).getOrElse("");
            verify(providerFactoryMock2).systemProperty("os.arch");
            verify(providerMock2).getOrElse("");
            verify(providerFactoryMock3).systemProperty("os.version");
            verify(providerMock3).getOrElse("");
            verify(providerFactoryMock4).exec((Action) any());
            verify(execOutputMock, atLeast(1)).getStandardOutput();
            verify(execOutputStandardStreamContentMock).getAsText();
            verify(providerMock4).get();
            verify(projectMock).getGradle();
            verify(gradleMock).getStartParameter();
            verify(startParameterMock).getMaxWorkerCount();
        });
    }
}

package org.elasticsearch.gradle.internal.info;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.Action;
import org.gradle.api.provider.Provider;
import org.gradle.api.specs.Spec;
import org.gradle.jvm.toolchain.JavaToolchainSpec;
import org.gradle.api.JavaVersion;
import org.gradle.api.Task;
import org.mockito.MockedStatic;
import java.util.function.Consumer;
import java.util.Random;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class BuildParamsSapientGeneratedTest {

    private final Provider<JavaVersion> runtimeJavaVersionMock = mock(Provider.class, "runtimeJavaVersion");

    private final Provider<String> runtimeJavaDetailsMock = mock(Provider.class, "runtimeJavaDetails");

    private final Task taskMock = mock(Task.class);

    //Sapient generated method id: ${initTest}, hash: B8B77CEB92107EF84760A8428BBE26FB
    @Disabled()
    @Test()
    void initTest() {
        //Arrange Statement(s)
        Consumer initializerMock = mock(Consumer.class);
        BuildParams.MutableBuildParams buildParamsMutableBuildParamsMock = mock(BuildParams.MutableBuildParams.class);
        doNothing().when(initializerMock).accept(buildParamsMutableBuildParamsMock);
        //Act Statement(s)
        BuildParams.init(initializerMock);
        //Assert statement(s)
        assertAll("result", () -> verify(initializerMock).accept(buildParamsMutableBuildParamsMock));
    }

    //Sapient generated method id: ${getRuntimeJavaHomeWhenMethodNameNotStartsWithIsThrowsIllegalStateException}, hash: 8368FF97F1E2BD4A16F28FF4035B65D4
    @Disabled()
    @Test()
    void getRuntimeJavaHomeWhenMethodNameNotStartsWithIsThrowsIllegalStateException() {
        /* Branches:
         * (object == null) : true  #  inside value method
         * (methodName.startsWith("is")) : false  #  inside propertyName method
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Build parameter 'oke' has not been initialized.\nPerhaps the plugin responsible for initializing this property has not been applied.");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            BuildParams.getRuntimeJavaHome();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getIsRuntimeJavaHomeSetWhenMethodNameNotStartsWithIsThrowsIllegalStateException}, hash: 709094BA3355511106FBD8685FF8B8E0
    @Disabled()
    @Test()
    void getIsRuntimeJavaHomeSetWhenMethodNameNotStartsWithIsThrowsIllegalStateException() {
        /* Branches:
         * (object == null) : true  #  inside value method
         * (methodName.startsWith("is")) : false  #  inside propertyName method
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Build parameter 'oke' has not been initialized.\nPerhaps the plugin responsible for initializing this property has not been applied.");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            BuildParams.getIsRuntimeJavaHomeSet();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getJavaVersionsWhenMethodNameNotStartsWithIsThrowsIllegalStateException}, hash: 2E902718E6B93F9312357D271C9B10B7
    @Disabled()
    @Test()
    void getJavaVersionsWhenMethodNameNotStartsWithIsThrowsIllegalStateException() {
        /* Branches:
         * (object == null) : true  #  inside value method
         * (methodName.startsWith("is")) : false  #  inside propertyName method
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Build parameter 'oke' has not been initialized.\nPerhaps the plugin responsible for initializing this property has not been applied.");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            BuildParams.getJavaVersions();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getMinimumCompilerVersionWhenMethodNameNotStartsWithIsThrowsIllegalStateException}, hash: 59005A0746121080C62B7403BA366D0B
    @Disabled()
    @Test()
    void getMinimumCompilerVersionWhenMethodNameNotStartsWithIsThrowsIllegalStateException() {
        /* Branches:
         * (object == null) : true  #  inside value method
         * (methodName.startsWith("is")) : false  #  inside propertyName method
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Build parameter 'it' has not been initialized.\nPerhaps the plugin responsible for initializing this property has not been applied.");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            BuildParams.getMinimumCompilerVersion();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getMinimumRuntimeVersionWhenMethodNameNotStartsWithIsThrowsIllegalStateException}, hash: 88514C252548E1E29BC1B97C996773A5
    @Disabled()
    @Test()
    void getMinimumRuntimeVersionWhenMethodNameNotStartsWithIsThrowsIllegalStateException() {
        /* Branches:
         * (object == null) : true  #  inside value method
         * (methodName.startsWith("is")) : false  #  inside propertyName method
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Build parameter 'oke' has not been initialized.\nPerhaps the plugin responsible for initializing this property has not been applied.");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            BuildParams.getMinimumRuntimeVersion();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getGradleJavaVersionWhenMethodNameNotStartsWithIsThrowsIllegalStateException}, hash: E7E4B82B626137A48E926DA5E1F2CCDF
    @Disabled()
    @Test()
    void getGradleJavaVersionWhenMethodNameNotStartsWithIsThrowsIllegalStateException() {
        /* Branches:
         * (object == null) : true  #  inside value method
         * (methodName.startsWith("is")) : false  #  inside propertyName method
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Build parameter 'oke' has not been initialized.\nPerhaps the plugin responsible for initializing this property has not been applied.");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            BuildParams.getGradleJavaVersion();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getRuntimeJavaVersionWhenObjectIsNotNull}, hash: 1A3A97A9C6691125EF37C6EF094FDA4A
    @Disabled()
    @Test()
    void getRuntimeJavaVersionWhenObjectIsNotNull() {
        /* Branches:
         * (object == null) : false  #  inside value method
         */
        //Arrange Statement(s)
        doReturn(JavaVersion.VERSION_1_1).when(runtimeJavaVersionMock).get();
        //Act Statement(s)
        JavaVersion result = BuildParams.getRuntimeJavaVersion();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(JavaVersion.VERSION_1_1));
            verify(runtimeJavaVersionMock).get();
        });
    }

    //Sapient generated method id: ${getRuntimeJavaVersionWhenMethodNameNotStartsWithIsThrowsIllegalStateException}, hash: FADB11AC735B39940AA30BB04EDCADBB
    @Disabled()
    @Test()
    void getRuntimeJavaVersionWhenMethodNameNotStartsWithIsThrowsIllegalStateException() {
        /* Branches:
         * (object == null) : true  #  inside value method
         * (methodName.startsWith("is")) : false  #  inside propertyName method
         */
        //Arrange Statement(s)
        doReturn(null).when(runtimeJavaVersionMock).get();
        IllegalStateException illegalStateException = new IllegalStateException("Build parameter 'oke' has not been initialized.\nPerhaps the plugin responsible for initializing this property has not been applied.");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            BuildParams.getRuntimeJavaVersion();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
            verify(runtimeJavaVersionMock).get();
        });
    }

    //Sapient generated method id: ${getRuntimeJavaDetailsWhenObjectIsNotNull}, hash: E3A075B0E4E896897DBD8685C6D01259
    @Disabled()
    @Test()
    void getRuntimeJavaDetailsWhenObjectIsNotNull() {
        /* Branches:
         * (object == null) : false  #  inside value method
         */
        //Arrange Statement(s)
        doReturn("return_of_get1").when(runtimeJavaDetailsMock).get();
        //Act Statement(s)
        String result = BuildParams.getRuntimeJavaDetails();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_get1"));
            verify(runtimeJavaDetailsMock).get();
        });
    }

    //Sapient generated method id: ${getRuntimeJavaDetailsWhenMethodNameNotStartsWithIsThrowsIllegalStateException}, hash: 443F4E50C763EAEB31C69EE1F7104483
    @Disabled()
    @Test()
    void getRuntimeJavaDetailsWhenMethodNameNotStartsWithIsThrowsIllegalStateException() {
        /* Branches:
         * (object == null) : true  #  inside value method
         * (methodName.startsWith("is")) : false  #  inside propertyName method
         */
        //Arrange Statement(s)
        doReturn(null).when(runtimeJavaDetailsMock).get();
        IllegalStateException illegalStateException = new IllegalStateException("Build parameter 'oke' has not been initialized.\nPerhaps the plugin responsible for initializing this property has not been applied.");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            BuildParams.getRuntimeJavaDetails();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
            verify(runtimeJavaDetailsMock).get();
        });
    }

    //Sapient generated method id: ${isInFipsJvmWhenMethodNameNotStartsWithIsThrowsIllegalStateException}, hash: 9E48C05D1683B8436053D14D7A26A7A1
    @Disabled()
    @Test()
    void isInFipsJvmWhenMethodNameNotStartsWithIsThrowsIllegalStateException() {
        /* Branches:
         * (object == null) : true  #  inside value method
         * (methodName.startsWith("is")) : false  #  inside propertyName method
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Build parameter 'oke' has not been initialized.\nPerhaps the plugin responsible for initializing this property has not been applied.");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            BuildParams.isInFipsJvm();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${withFipsEnabledOnlyWhenIsInFipsJvmEqualsFalse}, hash: 02ABE461BA1B3F948566C3A62EE51367
    @Test()
    void withFipsEnabledOnlyWhenIsInFipsJvmEqualsFalse() {
        /* Branches:
         * (isInFipsJvm() == false) : true  #  inside lambda$withFipsEnabledOnly$0 method
         */
        //Arrange Statement(s)
        try (MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class, CALLS_REAL_METHODS)) {
            doNothing().when(taskMock).onlyIf(eq("FIPS mode disabled"), (Spec) any());
            buildParams.when(() -> BuildParams.isInFipsJvm()).thenReturn(false);
            //Act Statement(s)
            BuildParams.withFipsEnabledOnly(taskMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(taskMock, atLeast(1)).onlyIf(eq("FIPS mode disabled"), (Spec) any());
                buildParams.verify(() -> BuildParams.isInFipsJvm(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${withFipsEnabledOnlyWhenIsInFipsJvmNotEqualsFalse}, hash: 539630D1CDF7C6A24E5782DC5F238480
    @Test()
    void withFipsEnabledOnlyWhenIsInFipsJvmNotEqualsFalse() {
        /* Branches:
         * (isInFipsJvm() == false) : false  #  inside lambda$withFipsEnabledOnly$0 method
         */
        //Arrange Statement(s)
        try (MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class, CALLS_REAL_METHODS)) {
            doNothing().when(taskMock).onlyIf(eq("FIPS mode disabled"), (Spec) any());
            buildParams.when(() -> BuildParams.isInFipsJvm()).thenReturn(true);
            //Act Statement(s)
            BuildParams.withFipsEnabledOnly(taskMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(taskMock, atLeast(1)).onlyIf(eq("FIPS mode disabled"), (Spec) any());
                buildParams.verify(() -> BuildParams.isInFipsJvm(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getGitRevisionWhenMethodNameNotStartsWithIsThrowsIllegalStateException}, hash: 35652AD964281CD811B6245FE3E22FC3
    @Disabled()
    @Test()
    void getGitRevisionWhenMethodNameNotStartsWithIsThrowsIllegalStateException() {
        /* Branches:
         * (object == null) : true  #  inside value method
         * (methodName.startsWith("is")) : false  #  inside propertyName method
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Build parameter 'oke' has not been initialized.\nPerhaps the plugin responsible for initializing this property has not been applied.");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            BuildParams.getGitRevision();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getGitOriginWhenMethodNameNotStartsWithIsThrowsIllegalStateException}, hash: 9018CED2FB04F50398B000919A225851
    @Disabled()
    @Test()
    void getGitOriginWhenMethodNameNotStartsWithIsThrowsIllegalStateException() {
        /* Branches:
         * (object == null) : true  #  inside value method
         * (methodName.startsWith("is")) : false  #  inside propertyName method
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Build parameter 'oke' has not been initialized.\nPerhaps the plugin responsible for initializing this property has not been applied.");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            BuildParams.getGitOrigin();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getBuildDateWhenMethodNameNotStartsWithIsThrowsIllegalStateException}, hash: CF110A9A301546D67AD76172948FE8D1
    @Disabled()
    @Test()
    void getBuildDateWhenMethodNameNotStartsWithIsThrowsIllegalStateException() {
        /* Branches:
         * (object == null) : true  #  inside value method
         * (methodName.startsWith("is")) : false  #  inside propertyName method
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Build parameter 'oke' has not been initialized.\nPerhaps the plugin responsible for initializing this property has not been applied.");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            BuildParams.getBuildDate();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getBwcVersionsWhenMethodNameNotStartsWithIsThrowsIllegalStateException}, hash: D9CC18007A9BF8A2C2CA6FFDEA7F3DE0
    @Disabled()
    @Test()
    void getBwcVersionsWhenMethodNameNotStartsWithIsThrowsIllegalStateException() {
        /* Branches:
         * (object == null) : true  #  inside value method
         * (methodName.startsWith("is")) : false  #  inside propertyName method
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Build parameter 'oke' has not been initialized.\nPerhaps the plugin responsible for initializing this property has not been applied.");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            BuildParams.getBwcVersions();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getTestSeedWhenMethodNameNotStartsWithIsThrowsIllegalStateException}, hash: 5CF7FE92F06AB358106F1B361822F7E4
    @Disabled()
    @Test()
    void getTestSeedWhenMethodNameNotStartsWithIsThrowsIllegalStateException() {
        /* Branches:
         * (object == null) : true  #  inside value method
         * (methodName.startsWith("is")) : false  #  inside propertyName method
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Build parameter 'oke' has not been initialized.\nPerhaps the plugin responsible for initializing this property has not been applied.");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            BuildParams.getTestSeed();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getRandomTest}, hash: B0C5B96FDF670CFD4C4D915782DF5570
    @Disabled()
    @Test()
    void getRandomTest() {
        //Act Statement(s)
        Random result = BuildParams.getRandom();
        //Assert statement(s)
        //TODO: Please implement equals method in Random for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${isCiWhenMethodNameNotStartsWithIsThrowsIllegalStateException}, hash: A8205033109B8883E627CDF0CD35696D
    @Disabled()
    @Test()
    void isCiWhenMethodNameNotStartsWithIsThrowsIllegalStateException() {
        /* Branches:
         * (object == null) : true  #  inside value method
         * (methodName.startsWith("is")) : false  #  inside propertyName method
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Build parameter 'oke' has not been initialized.\nPerhaps the plugin responsible for initializing this property has not been applied.");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            BuildParams.isCi();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${isGraalVmRuntimeWhenObjectIsNotNull}, hash: 001887A5A24CB64BF477CBED976895CF
    @Disabled()
    @Test()
    void isGraalVmRuntimeWhenObjectIsNotNull() {
        /* Branches:
         * (object == null) : false  #  inside value method
         */
        //Arrange Statement(s)
        doReturn("A").when(runtimeJavaDetailsMock).get();
        //Act Statement(s)
        Boolean result = BuildParams.isGraalVmRuntime();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(Boolean.FALSE));
            verify(runtimeJavaDetailsMock).get();
        });
    }

    //Sapient generated method id: ${isGraalVmRuntimeWhenMethodNameNotStartsWithIsThrowsIllegalStateException}, hash: AE7E0FEBCAB6B16F28CBC562F99F8D2C
    @Disabled()
    @Test()
    void isGraalVmRuntimeWhenMethodNameNotStartsWithIsThrowsIllegalStateException() {
        /* Branches:
         * (object == null) : true  #  inside value method
         * (methodName.startsWith("is")) : false  #  inside propertyName method
         */
        //Arrange Statement(s)
        doReturn("A").when(runtimeJavaDetailsMock).get();
        IllegalStateException illegalStateException = new IllegalStateException("Build parameter 'oke' has not been initialized.\nPerhaps the plugin responsible for initializing this property has not been applied.");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            BuildParams.isGraalVmRuntime();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
            verify(runtimeJavaDetailsMock).get();
        });
    }

    //Sapient generated method id: ${getDefaultParallelWhenMethodNameNotStartsWithIsThrowsIllegalStateException}, hash: 2CCB1FADC278A2BD8CECAC0ED3293B38
    @Disabled()
    @Test()
    void getDefaultParallelWhenMethodNameNotStartsWithIsThrowsIllegalStateException() {
        /* Branches:
         * (object == null) : true  #  inside value method
         * (methodName.startsWith("is")) : false  #  inside propertyName method
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Build parameter 'oke' has not been initialized.\nPerhaps the plugin responsible for initializing this property has not been applied.");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            BuildParams.getDefaultParallel();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${isSnapshotBuildWhenMethodNameNotStartsWithIsThrowsIllegalStateException}, hash: 5DB5ECEBF26A90600E672E64C0334B58
    @Disabled()
    @Test()
    void isSnapshotBuildWhenMethodNameNotStartsWithIsThrowsIllegalStateException() {
        /* Branches:
         * (object == null) : true  #  inside value method
         * (methodName.startsWith("is")) : false  #  inside propertyName method
         */
        //Arrange Statement(s)
        IllegalStateException illegalStateException = new IllegalStateException("Build parameter 'oke' has not been initialized.\nPerhaps the plugin responsible for initializing this property has not been applied.");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            BuildParams.isSnapshotBuild();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
        });
    }

    //Sapient generated method id: ${getJavaToolChainSpecTest}, hash: AA48D69A6F0FBCE5B2027174674B162A
    @Test()
    void getJavaToolChainSpecTest() {
        //Act Statement(s)
        Provider<? extends Action<JavaToolchainSpec>> result = BuildParams.getJavaToolChainSpec();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }
}

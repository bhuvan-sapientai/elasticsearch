package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.TaskDependency;
import java.util.Iterator;
import org.gradle.api.model.ObjectFactory;
import java.io.File;
import java.util.ArrayList;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class JdkSapientGeneratedTest {

    private final Property<String> vendorMock = mock(Property.class, "vendor");

    private final Property<String> versionMock = mock(Property.class, "version");

    private final Property<String> platformMock = mock(Property.class, "platform");

    private final Property<String> architectureMock = mock(Property.class, "architecture");

    private final Property<String> distributionVersionMock = mock(Property.class, "distributionVersion");

    private final Configuration configurationMock = mock(Configuration.class, "configuration");

    private final File fileMock = mock(File.class, "file");

    private final ObjectFactory objectFactoryMock = mock(ObjectFactory.class);

    //Sapient generated method id: ${getVendorTest}, hash: B508664421D65B8B73686EC0DE549FD7
    @Test()
    void getVendorTest() {
        doReturn(vendorMock, versionMock, platformMock, architectureMock, distributionVersionMock).when(objectFactoryMock).property(String.class);
        doReturn("return_of_get1").when(vendorMock).get();
        Jdk target = new Jdk("name1", configurationMock, objectFactoryMock);
        //Act Statement(s)
        String result = target.getVendor();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_get1"));
            verify(objectFactoryMock, times(5)).property(String.class);
            verify(vendorMock).get();
        });
    }

    //Sapient generated method id: ${setVendorWhenALLOWED_VENDORSContainsVendorEqualsFalseThrowsIllegalArgumentException}, hash: 26C6C4FADF4729A11A4FCDBE63E1C7EC
    @Test()
    void setVendorWhenALLOWED_VENDORSContainsVendorEqualsFalseThrowsIllegalArgumentException() {
        /* Branches:
         * (ALLOWED_VENDORS.contains(vendor) == false) : true
         */
        doReturn(vendorMock, versionMock, platformMock, architectureMock, distributionVersionMock).when(objectFactoryMock).property(String.class);
        Jdk target = new Jdk("B", configurationMock, objectFactoryMock);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("unknown vendor [A] for jdk [B], must be one of [adoptium, openjdk, zulu]");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            target.setVendor("A");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
            verify(objectFactoryMock, times(5)).property(String.class);
        });
    }

    //Sapient generated method id: ${setVendorWhenALLOWED_VENDORSContainsVendorNotEqualsFalse}, hash: A8968F0DE24898F2DE65DB7700D9E411
    @Test()
    void setVendorWhenALLOWED_VENDORSContainsVendorNotEqualsFalse() {
        /* Branches:
         * (ALLOWED_VENDORS.contains(vendor) == false) : false
         */
        doReturn(vendorMock, versionMock, platformMock, architectureMock, distributionVersionMock).when(objectFactoryMock).property(String.class);
        doNothing().when(vendorMock).set("zulu");
        Jdk target = new Jdk("name1", configurationMock, objectFactoryMock);
        //Act Statement(s)
        target.setVendor("zulu");
        //Assert statement(s)
        assertAll("result", () -> {
            verify(objectFactoryMock, times(5)).property(String.class);
            verify(vendorMock).set("zulu");
        });
    }

    //Sapient generated method id: ${getVersionTest}, hash: FE4CC7C48A442B8148E4B914865DC5F5
    @Test()
    void getVersionTest() {
        doReturn(vendorMock, versionMock, platformMock, architectureMock, distributionVersionMock).when(objectFactoryMock).property(String.class);
        doReturn("return_of_get1").when(versionMock).get();
        Jdk target = new Jdk("name1", configurationMock, objectFactoryMock);
        //Act Statement(s)
        String result = target.getVersion();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_get1"));
            verify(objectFactoryMock, times(5)).property(String.class);
            verify(versionMock).get();
        });
    }

    //Sapient generated method id: ${setVersionWhenLEGACY_VERSION_PATTERNMatcherVersionMatchesEqualsFalseThrowsIllegalArgumentException}, hash: 4E598D416BE16284B110767345DD02A6
    @Test()
    void setVersionWhenLEGACY_VERSION_PATTERNMatcherVersionMatchesEqualsFalseThrowsIllegalArgumentException() {
        /* Branches:
         * (VERSION_PATTERN.matcher(version).matches() == false) : true
         * (LEGACY_VERSION_PATTERN.matcher(version).matches() == false) : true
         */
        doReturn(vendorMock, versionMock, platformMock, architectureMock, distributionVersionMock).when(objectFactoryMock).property(String.class);
        Jdk target = new Jdk("B", configurationMock, objectFactoryMock);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("malformed version [A] for jdk [B]");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            target.setVersion("A");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
            verify(objectFactoryMock, times(5)).property(String.class);
        });
    }

    //Sapient generated method id: ${setVersionWhenJdkVersionMatcherMatchesEqualsFalseThrowsIllegalArgumentException}, hash: FB6793014AE3D70EE4DEE0D577890692
    @Disabled()
    @Test()
    void setVersionWhenJdkVersionMatcherMatchesEqualsFalseThrowsIllegalArgumentException() {
        /* Branches:
         * (VERSION_PATTERN.matcher(version).matches() == false) : true
         * (LEGACY_VERSION_PATTERN.matcher(version).matches() == false) : false
         * (jdkVersionMatcher.matches() == false) : true  #  inside parseVersion method
         * (jdkVersionMatcher.matches() == false) : true  #  inside parseVersion method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        doReturn(vendorMock, versionMock, platformMock, architectureMock, distributionVersionMock).when(objectFactoryMock).property(String.class);
        Jdk target = new Jdk("name1", configurationMock, objectFactoryMock);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("s1");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            target.setVersion("version1");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
            verify(objectFactoryMock, times(5)).property(String.class);
        });
    }

    //Sapient generated method id: ${setVersionWhenJdkVersionMatcherGroup2IsNotNull}, hash: 9377127BFC038AB92FA45613DA943832
    @Disabled()
    @Test()
    void setVersionWhenJdkVersionMatcherGroup2IsNotNull() {
        /* Branches:
         * (VERSION_PATTERN.matcher(version).matches() == false) : true
         * (LEGACY_VERSION_PATTERN.matcher(version).matches() == false) : false
         * (jdkVersionMatcher.matches() == false) : true  #  inside parseVersion method
         * (jdkVersionMatcher.matches() == false) : false  #  inside parseVersion method
         * (jdkVersionMatcher.group(2) != null) : true  #  inside parseVersion method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        doReturn(vendorMock, versionMock, platformMock, architectureMock, distributionVersionMock).when(objectFactoryMock).property(String.class);
        doNothing().when(versionMock).set("version1");
        Jdk target = new Jdk("name1", configurationMock, objectFactoryMock);
        //Act Statement(s)
        target.setVersion("version1");
        //Assert statement(s)
        assertAll("result", () -> {
            verify(objectFactoryMock, times(5)).property(String.class);
            verify(versionMock).set("version1");
        });
    }

    //Sapient generated method id: ${getPlatformTest}, hash: 8EB43CABBECE967C4CC85ADF65F5E383
    @Test()
    void getPlatformTest() {
        doReturn(vendorMock, versionMock, platformMock, architectureMock, distributionVersionMock).when(objectFactoryMock).property(String.class);
        doReturn("return_of_get1").when(platformMock).get();
        Jdk target = new Jdk("name1", configurationMock, objectFactoryMock);
        //Act Statement(s)
        String result = target.getPlatform();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_get1"));
            verify(objectFactoryMock, times(5)).property(String.class);
            verify(platformMock).get();
        });
    }

    //Sapient generated method id: ${setPlatformWhenALLOWED_PLATFORMSContainsPlatformEqualsFalseThrowsIllegalArgumentException}, hash: 03DB442D552DB35CC0DFB50FF7DF6F22
    @Test()
    void setPlatformWhenALLOWED_PLATFORMSContainsPlatformEqualsFalseThrowsIllegalArgumentException() {
        /* Branches:
         * (ALLOWED_PLATFORMS.contains(platform) == false) : true
         */
        doReturn(vendorMock, versionMock, platformMock, architectureMock, distributionVersionMock).when(objectFactoryMock).property(String.class);
        Jdk target = new Jdk("B", configurationMock, objectFactoryMock);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("unknown platform [A] for jdk [B], must be one of [darwin, linux, windows, mac]");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            target.setPlatform("A");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
            verify(objectFactoryMock, times(5)).property(String.class);
        });
    }

    //Sapient generated method id: ${setPlatformWhenALLOWED_PLATFORMSContainsPlatformNotEqualsFalse}, hash: 84AC21F3503C4F44776A9B68B895B824
    @Test()
    void setPlatformWhenALLOWED_PLATFORMSContainsPlatformNotEqualsFalse() {
        /* Branches:
         * (ALLOWED_PLATFORMS.contains(platform) == false) : false
         */
        doReturn(vendorMock, versionMock, platformMock, architectureMock, distributionVersionMock).when(objectFactoryMock).property(String.class);
        doNothing().when(platformMock).set("mac");
        Jdk target = new Jdk("name1", configurationMock, objectFactoryMock);
        //Act Statement(s)
        target.setPlatform("mac");
        //Assert statement(s)
        assertAll("result", () -> {
            verify(objectFactoryMock, times(5)).property(String.class);
            verify(platformMock).set("mac");
        });
    }

    //Sapient generated method id: ${getArchitectureTest}, hash: 91EF155E1111E538B33DC87577296D09
    @Test()
    void getArchitectureTest() {
        doReturn(vendorMock, versionMock, platformMock, architectureMock, distributionVersionMock).when(objectFactoryMock).property(String.class);
        doReturn("return_of_get1").when(architectureMock).get();
        Jdk target = new Jdk("name1", configurationMock, objectFactoryMock);
        //Act Statement(s)
        String result = target.getArchitecture();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_get1"));
            verify(objectFactoryMock, times(5)).property(String.class);
            verify(architectureMock).get();
        });
    }

    //Sapient generated method id: ${setArchitectureWhenALLOWED_ARCHITECTURESContainsArchitectureEqualsFalseThrowsIllegalArgumentException}, hash: CC3147645481207141745EDE391E45BC
    @Test()
    void setArchitectureWhenALLOWED_ARCHITECTURESContainsArchitectureEqualsFalseThrowsIllegalArgumentException() {
        /* Branches:
         * (ALLOWED_ARCHITECTURES.contains(architecture) == false) : true
         */
        doReturn(vendorMock, versionMock, platformMock, architectureMock, distributionVersionMock).when(objectFactoryMock).property(String.class);
        Jdk target = new Jdk("B", configurationMock, objectFactoryMock);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("unknown architecture [A] for jdk [B], must be one of [aarch64, x64]");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            target.setArchitecture("A");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
            verify(objectFactoryMock, times(5)).property(String.class);
        });
    }

    //Sapient generated method id: ${setArchitectureWhenALLOWED_ARCHITECTURESContainsArchitectureNotEqualsFalse}, hash: FED89A5F83F8BCE4158FC7485570B6F6
    @Test()
    void setArchitectureWhenALLOWED_ARCHITECTURESContainsArchitectureNotEqualsFalse() {
        /* Branches:
         * (ALLOWED_ARCHITECTURES.contains(architecture) == false) : false
         */
        doReturn(vendorMock, versionMock, platformMock, architectureMock, distributionVersionMock).when(objectFactoryMock).property(String.class);
        doNothing().when(architectureMock).set("x64");
        Jdk target = new Jdk("name1", configurationMock, objectFactoryMock);
        //Act Statement(s)
        target.setArchitecture("x64");
        //Assert statement(s)
        assertAll("result", () -> {
            verify(objectFactoryMock, times(5)).property(String.class);
            verify(architectureMock).set("x64");
        });
    }

    //Sapient generated method id: ${getDistributionVersionTest}, hash: 14D5B35AE9A2614C34928E0C413376F7
    @Test()
    void getDistributionVersionTest() {
        doReturn(vendorMock, versionMock, platformMock, architectureMock, distributionVersionMock).when(objectFactoryMock).property(String.class);
        doReturn("return_of_get1").when(distributionVersionMock).get();
        Jdk target = new Jdk("name1", configurationMock, objectFactoryMock);
        //Act Statement(s)
        String result = target.getDistributionVersion();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_get1"));
            verify(objectFactoryMock, times(5)).property(String.class);
            verify(distributionVersionMock).get();
        });
    }

    //Sapient generated method id: ${setDistributionVersionTest}, hash: D5C8537E5309A9BCC72B8D57DB7B4A4B
    @Test()
    void setDistributionVersionTest() {
        doReturn(vendorMock, versionMock, platformMock, architectureMock, distributionVersionMock).when(objectFactoryMock).property(String.class);
        doNothing().when(distributionVersionMock).set("distributionVersion1");
        Jdk target = new Jdk("name1", configurationMock, objectFactoryMock);
        //Act Statement(s)
        target.setDistributionVersion("distributionVersion1");
        //Assert statement(s)
        assertAll("result", () -> {
            verify(objectFactoryMock, times(5)).property(String.class);
            verify(distributionVersionMock).set("distributionVersion1");
        });
    }

    //Sapient generated method id: ${getPathTest}, hash: CA4EF0F6ED2BFD101C46CEC2D0456E7F
    @Test()
    void getPathTest() throws IllegalStateException {
        doReturn(vendorMock, versionMock, platformMock, architectureMock, distributionVersionMock).when(objectFactoryMock).property(String.class);
        doReturn(fileMock).when(configurationMock).getSingleFile();
        Jdk target = new Jdk("name1", configurationMock, objectFactoryMock);
        //Act Statement(s)
        String result = target.getPath();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("file"));
            verify(objectFactoryMock, times(5)).property(String.class);
            verify(configurationMock).getSingleFile();
        });
    }

    //Sapient generated method id: ${getConfigurationNameTest}, hash: CD5ACB3C14C7C61A5048FD682B4D4454
    @Test()
    void getConfigurationNameTest() {
        doReturn(vendorMock, versionMock, platformMock, architectureMock, distributionVersionMock).when(objectFactoryMock).property(String.class);
        doReturn("return_of_getName1").when(configurationMock).getName();
        Jdk target = new Jdk("name1", configurationMock, objectFactoryMock);
        //Act Statement(s)
        String result = target.getConfigurationName();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getName1"));
            verify(objectFactoryMock, times(5)).property(String.class);
            verify(configurationMock).getName();
        });
    }

    //Sapient generated method id: ${toStringTest}, hash: 62775A0F6DC805145026CED2FF33523A
    @Test()
    void toStringTest() throws IllegalStateException {
        doReturn(vendorMock, versionMock, platformMock, architectureMock, distributionVersionMock).when(objectFactoryMock).property(String.class);
        doReturn(fileMock).when(configurationMock).getSingleFile();
        Jdk target = new Jdk("name1", configurationMock, objectFactoryMock);
        //Act Statement(s)
        String result = target.toString();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("file"));
            verify(objectFactoryMock, times(5)).property(String.class);
            verify(configurationMock).getSingleFile();
        });
    }

    //Sapient generated method id: ${getBuildDependenciesTest}, hash: A0C0F2583F714FD3488C8037F00B5FCE
    @Test()
    void getBuildDependenciesTest() {
        doReturn(vendorMock, versionMock, platformMock, architectureMock, distributionVersionMock).when(objectFactoryMock).property(String.class);
        TaskDependency taskDependencyMock = mock(TaskDependency.class);
        doReturn(taskDependencyMock).when(configurationMock).getBuildDependencies();
        Jdk target = new Jdk("name1", configurationMock, objectFactoryMock);
        //Act Statement(s)
        TaskDependency result = target.getBuildDependencies();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(taskDependencyMock));
            verify(objectFactoryMock, times(5)).property(String.class);
            verify(configurationMock).getBuildDependencies();
        });
    }

    //Sapient generated method id: ${getBinJavaPathTest}, hash: 3388E75F335FB88A284BC756920C8296
    @Test()
    void getBinJavaPathTest() {
        doReturn(vendorMock, versionMock, platformMock, architectureMock, distributionVersionMock).when(objectFactoryMock).property(String.class);
        Jdk target = new Jdk("name1", configurationMock, objectFactoryMock);
        //Act Statement(s)
        Object result = target.getBinJavaPath();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(objectFactoryMock, times(5)).property(String.class);
        });
    }

    //Sapient generated method id: ${getJavaHomePathTest}, hash: EDA286D115E567F2E108F200C2E4F4F9
    @Test()
    void getJavaHomePathTest() {
        doReturn(vendorMock, versionMock, platformMock, architectureMock, distributionVersionMock).when(objectFactoryMock).property(String.class);
        Jdk target = new Jdk("name1", configurationMock, objectFactoryMock);
        //Act Statement(s)
        Object result = target.getJavaHomePath();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(objectFactoryMock, times(5)).property(String.class);
        });
    }

    //Sapient generated method id: ${finalizeValuesWhenVersionIsPresentEqualsFalseThrowsIllegalArgumentException}, hash: 7B4261331EDABA8DF9F6325DDB4C9D40
    @Test()
    void finalizeValuesWhenVersionIsPresentEqualsFalseThrowsIllegalArgumentException() {
        /* Branches:
         * (version.isPresent() == false) : true
         */
        doReturn(vendorMock, versionMock, platformMock, architectureMock, distributionVersionMock).when(objectFactoryMock).property(String.class);
        doReturn(false).when(versionMock).isPresent();
        Jdk target = new Jdk("A", configurationMock, objectFactoryMock);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("version not specified for jdk [A]");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            target.finalizeValues();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
            verify(objectFactoryMock, times(5)).property(String.class);
            verify(versionMock).isPresent();
        });
    }

    //Sapient generated method id: ${finalizeValuesWhenPlatformIsPresentEqualsFalseThrowsIllegalArgumentException}, hash: 9BDA3C61214E1B1B749706FA2F32A9BB
    @Test()
    void finalizeValuesWhenPlatformIsPresentEqualsFalseThrowsIllegalArgumentException() {
        /* Branches:
         * (version.isPresent() == false) : false
         * (platform.isPresent() == false) : true
         */
        doReturn(vendorMock, versionMock, platformMock, architectureMock, distributionVersionMock).when(objectFactoryMock).property(String.class);
        doReturn(true).when(versionMock).isPresent();
        doReturn(false).when(platformMock).isPresent();
        Jdk target = new Jdk("A", configurationMock, objectFactoryMock);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("platform not specified for jdk [A]");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            target.finalizeValues();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
            verify(objectFactoryMock, times(5)).property(String.class);
            verify(versionMock).isPresent();
            verify(platformMock).isPresent();
        });
    }

    //Sapient generated method id: ${finalizeValuesWhenVendorIsPresentEqualsFalseThrowsIllegalArgumentException}, hash: 4B735F65073530333D35735005788C7E
    @Test()
    void finalizeValuesWhenVendorIsPresentEqualsFalseThrowsIllegalArgumentException() {
        /* Branches:
         * (version.isPresent() == false) : false
         * (platform.isPresent() == false) : false
         * (vendor.isPresent() == false) : true
         */
        doReturn(vendorMock, versionMock, platformMock, architectureMock, distributionVersionMock).when(objectFactoryMock).property(String.class);
        doReturn(true).when(versionMock).isPresent();
        doReturn(true).when(platformMock).isPresent();
        doReturn(false).when(vendorMock).isPresent();
        Jdk target = new Jdk("A", configurationMock, objectFactoryMock);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("vendor not specified for jdk [A]");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            target.finalizeValues();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
            verify(objectFactoryMock, times(5)).property(String.class);
            verify(versionMock).isPresent();
            verify(platformMock).isPresent();
            verify(vendorMock).isPresent();
        });
    }

    //Sapient generated method id: ${finalizeValuesWhenArchitectureIsPresentEqualsFalseThrowsIllegalArgumentException}, hash: E47097D3D760D8B5FA0093A9E99A6840
    @Test()
    void finalizeValuesWhenArchitectureIsPresentEqualsFalseThrowsIllegalArgumentException() {
        /* Branches:
         * (version.isPresent() == false) : false
         * (platform.isPresent() == false) : false
         * (vendor.isPresent() == false) : false
         * (architecture.isPresent() == false) : true
         */
        doReturn(vendorMock, versionMock, platformMock, architectureMock, distributionVersionMock).when(objectFactoryMock).property(String.class);
        doReturn(true).when(versionMock).isPresent();
        doReturn(true).when(platformMock).isPresent();
        doReturn(true).when(vendorMock).isPresent();
        doReturn(false).when(architectureMock).isPresent();
        Jdk target = new Jdk("A", configurationMock, objectFactoryMock);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("architecture not specified for jdk [A]");
        //Act Statement(s)
        final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
            target.finalizeValues();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
            verify(objectFactoryMock, times(5)).property(String.class);
            verify(versionMock).isPresent();
            verify(platformMock).isPresent();
            verify(vendorMock).isPresent();
            verify(architectureMock).isPresent();
        });
    }

    //Sapient generated method id: ${finalizeValuesWhenArchitectureIsPresentNotEqualsFalse}, hash: 4A92692855A963F396472BB844F8222A
    @Test()
    void finalizeValuesWhenArchitectureIsPresentNotEqualsFalse() {
        /* Branches:
         * (version.isPresent() == false) : false
         * (platform.isPresent() == false) : false
         * (vendor.isPresent() == false) : false
         * (architecture.isPresent() == false) : false
         */
        doReturn(vendorMock, versionMock, platformMock, architectureMock, distributionVersionMock).when(objectFactoryMock).property(String.class);
        doReturn(true).when(versionMock).isPresent();
        doNothing().when(versionMock).finalizeValue();
        doReturn(true).when(platformMock).isPresent();
        doNothing().when(platformMock).finalizeValue();
        doReturn(true).when(vendorMock).isPresent();
        doNothing().when(vendorMock).finalizeValue();
        doReturn(true).when(architectureMock).isPresent();
        doNothing().when(architectureMock).finalizeValue();
        doNothing().when(distributionVersionMock).finalizeValue();
        Jdk target = new Jdk("name1", configurationMock, objectFactoryMock);
        //Act Statement(s)
        target.finalizeValues();
        //Assert statement(s)
        assertAll("result", () -> {
            verify(objectFactoryMock, times(5)).property(String.class);
            verify(versionMock).isPresent();
            verify(versionMock).finalizeValue();
            verify(platformMock).isPresent();
            verify(platformMock).finalizeValue();
            verify(vendorMock).isPresent();
            verify(vendorMock).finalizeValue();
            verify(architectureMock).isPresent();
            verify(architectureMock).finalizeValue();
            verify(distributionVersionMock).finalizeValue();
        });
    }

    //Sapient generated method id: ${iteratorTest}, hash: 6B37F0E5F7BBC38EDCBDF800839262B4
    @Test()
    void iteratorTest() {
        doReturn(vendorMock, versionMock, platformMock, architectureMock, distributionVersionMock).when(objectFactoryMock).property(String.class);
        List<File> fileList = new ArrayList<>();
        Iterator<File> iterator = fileList.iterator();
        doReturn(iterator).when(configurationMock).iterator();
        Jdk target = new Jdk("name1", configurationMock, objectFactoryMock);
        //Act Statement(s)
        Iterator<File> result = target.iterator();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(objectFactoryMock, times(5)).property(String.class);
            verify(configurationMock).iterator();
        });
    }
}

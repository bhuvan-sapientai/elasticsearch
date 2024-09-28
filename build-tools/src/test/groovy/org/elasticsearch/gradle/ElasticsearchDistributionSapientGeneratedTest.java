package org.elasticsearch.gradle;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.TaskDependency;
import java.util.Iterator;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.model.ObjectFactory;
import org.mockito.MockedStatic;
import java.io.File;
import java.util.ArrayList;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class ElasticsearchDistributionSapientGeneratedTest {

    private final Property<ElasticsearchDistributionType> typeMock = mock(Property.class, "type");

    private final Property<String> versionMock = mock(Property.class, "version");

    private final Property<ElasticsearchDistribution.Platform> platformMock = mock(Property.class, "platform");

    private final Property<Boolean> bundledJdkMock = mock(Property.class, "bundledJdk");

    private final Property<Boolean> failIfUnavailableMock = mock(Property.class, "failIfUnavailable");

    private final Property<Boolean> preferArchiveMock = mock(Property.class, "preferArchive");

    private final Property<Architecture> architectureMock = mock(Property.class, "architecture");

    private final ConfigurableFileCollection configurationMock = mock(ConfigurableFileCollection.class, "configuration");

    private final Property<Boolean> dockerAvailabilityMock = mock(Property.class, "dockerAvailability");

    private final ConfigurableFileCollection extractedMock = mock(ConfigurableFileCollection.class, "extracted");

    private final ElasticsearchDistribution elasticsearchDistributionMock = mock(ElasticsearchDistribution.class);

    private final ElasticsearchDistributionType elasticsearchDistributionTypeMock = mock(ElasticsearchDistributionType.class);

    private final ElasticsearchDistributionType elasticsearchDistributionTypeMock2 = mock(ElasticsearchDistributionType.class);

    private final ElasticsearchDistributionType elasticsearchDistributionTypeMock3 = mock(ElasticsearchDistributionType.class);

    private final ObjectFactory objectFactoryMock = mock(ObjectFactory.class);

    private final Property propertyMock = mock(Property.class);

    private final Property propertyMock2 = mock(Property.class);

    private final Property propertyMock3 = mock(Property.class);

    private final Property propertyMock4 = mock(Property.class);

    private final TaskDependency taskDependencyMock = mock(TaskDependency.class);

    //Sapient generated method id: ${getVersionTest}, hash: CE8CA58B4D746C53B482A10509B8A748
    @Disabled()
    @Test()
    void getVersionTest() {
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn("return_of_get1").when(versionMock).get();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            String result = target.getVersion();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_get1"));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(versionMock).get();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${setVersionTest}, hash: 87F10412EDD8E54BA84E23FEE3574372
    @Disabled()
    @Test()
    void setVersionTest() {
        //Arrange Statement(s)
        Version versionMock2 = mock(Version.class);
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<Version> version = mockStatic(Version.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doNothing().when(versionMock).set("version1");
            version.when(() -> Version.fromString("version1")).thenReturn(versionMock2);
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            target.setVersion("version1");
            //Assert statement(s)
            assertAll("result", () -> {
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(versionMock).set("version1");
                version.verify(() -> Version.fromString("version1"), atLeast(1));
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getPlatformTest}, hash: 240611FBE84DF3FE26EF8C24EF98D7B1
    @Disabled()
    @Test()
    void getPlatformTest() {
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(ElasticsearchDistribution.Platform.LINUX).when(platformMock).getOrNull();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            ElasticsearchDistribution.Platform result = target.getPlatform();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(ElasticsearchDistribution.Platform.LINUX));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(platformMock).getOrNull();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${setPlatformTest}, hash: FF1188B02A1310826F57690B0ECF30F8
    @Disabled()
    @Test()
    void setPlatformTest() {
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doNothing().when(platformMock).set(ElasticsearchDistribution.Platform.LINUX);
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            target.setPlatform(ElasticsearchDistribution.Platform.LINUX);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(platformMock).set(ElasticsearchDistribution.Platform.LINUX);
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getTypeTest}, hash: DC28451991E3B5D238C5B0618591CC0A
    @Disabled()
    @Test()
    void getTypeTest() {
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(elasticsearchDistributionTypeMock2).when(typeMock).get();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            ElasticsearchDistributionType result = target.getType();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(elasticsearchDistributionTypeMock2));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(typeMock).get();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${setTypeTest}, hash: 55DDD8D9169D8FD4EBBF4CC5607D37D3
    @Disabled()
    @Test()
    void setTypeTest() {
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doNothing().when(typeMock).set(elasticsearchDistributionTypeMock2);
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            target.setType(elasticsearchDistributionTypeMock2);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(typeMock).set(elasticsearchDistributionTypeMock2);
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${setType1WhenTypeEqualsElasticsearchDistributionTypesARCHIVEGetName}, hash: DE3C642353605DC665351DCB3FAA05C4
    @Disabled()
    @Test()
    void setType1WhenTypeEqualsElasticsearchDistributionTypesARCHIVEGetName() {
        /* Branches:
         * (type.equals(ElasticsearchDistributionTypes.ARCHIVE.getName())) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn("A").when(elasticsearchDistributionTypeMock).getName();
            doNothing().when(typeMock).set(elasticsearchDistributionTypeMock);
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            target.setType("A");
            //Assert statement(s)
            assertAll("result", () -> {
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(elasticsearchDistributionTypeMock).getName();
                verify(typeMock).set(elasticsearchDistributionTypeMock);
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${setType1WhenTypeEqualsElasticsearchDistributionTypesINTEG_TEST_ZIPGetName}, hash: 1219530A2D2631B7E758DC8ACFF3BFAC
    @Disabled()
    @Test()
    void setType1WhenTypeEqualsElasticsearchDistributionTypesINTEG_TEST_ZIPGetName() {
        /* Branches:
         * (type.equals(ElasticsearchDistributionTypes.ARCHIVE.getName())) : false
         * (type.equals(ElasticsearchDistributionTypes.INTEG_TEST_ZIP.getName())) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn("B").when(elasticsearchDistributionTypeMock).getName();
            doNothing().when(typeMock).set(elasticsearchDistributionTypeMock2);
            doReturn("A").when(elasticsearchDistributionTypeMock2).getName();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            target.setType("A");
            //Assert statement(s)
            assertAll("result", () -> {
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(elasticsearchDistributionTypeMock).getName();
                verify(typeMock).set(elasticsearchDistributionTypeMock2);
                verify(elasticsearchDistributionTypeMock2).getName();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${setType1WhenTypeNotEqualsElasticsearchDistributionTypesINTEG_TEST_ZIPGetNameThrowsIllegalArgumentException}, hash: E6C5DFDEF2A3ACA16911118D16D5677D
    @Disabled()
    @Test()
    void setType1WhenTypeNotEqualsElasticsearchDistributionTypesINTEG_TEST_ZIPGetNameThrowsIllegalArgumentException() {
        /* Branches:
         * (type.equals(ElasticsearchDistributionTypes.ARCHIVE.getName())) : false
         * (type.equals(ElasticsearchDistributionTypes.INTEG_TEST_ZIP.getName())) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn("B").when(elasticsearchDistributionTypeMock).getName();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                target.setType("A");
            });
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Cannot set Elasticsearch Distribution type to A. Type unknown.");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(elasticsearchDistributionTypeMock).getName();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getBundledJdkWhenBundledJdkGetOrElseTrue}, hash: 31FDB6A8C72FDBDB985A5379478FF9F2
    @Disabled()
    @Test()
    void getBundledJdkWhenBundledJdkGetOrElseTrue() {
        /* Branches:
         * (bundledJdk.getOrElse(true)) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(true).when(bundledJdkMock).getOrElse(true);
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            boolean result = target.getBundledJdk();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(bundledJdkMock).getOrElse(true);
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getBundledJdkWhenBundledJdkNotGetOrElseTrue}, hash: 4815A7C2AC5FADF1BC19C420AE5DBA18
    @Disabled()
    @Test()
    void getBundledJdkWhenBundledJdkNotGetOrElseTrue() {
        /* Branches:
         * (bundledJdk.getOrElse(true)) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(false).when(bundledJdkMock).getOrElse(true);
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            boolean result = target.getBundledJdk();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(bundledJdkMock).getOrElse(true);
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isDockerWhenThisTypeGetIsDocker}, hash: DFB2F47E3179D38E0ACADEA41B9A6A7F
    @Disabled()
    @Test()
    void isDockerWhenThisTypeGetIsDocker() {
        /* Branches:
         * (this.type.get().isDocker()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(elasticsearchDistributionTypeMock2).when(typeMock).get();
            doReturn(true).when(elasticsearchDistributionTypeMock2).isDocker();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            boolean result = target.isDocker();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(typeMock).get();
                verify(elasticsearchDistributionTypeMock2).isDocker();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${isDockerWhenThisTypeGetNotIsDocker}, hash: 95AD8C451B3AA1D70109B6C073B60459
    @Disabled()
    @Test()
    void isDockerWhenThisTypeGetNotIsDocker() {
        /* Branches:
         * (this.type.get().isDocker()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(elasticsearchDistributionTypeMock2).when(typeMock).get();
            doReturn(false).when(elasticsearchDistributionTypeMock2).isDocker();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            boolean result = target.isDocker();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(typeMock).get();
                verify(elasticsearchDistributionTypeMock2).isDocker();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${setBundledJdkTest}, hash: 98C88455665A3CB965DC4A3A53FFD119
    @Disabled()
    @Test()
    void setBundledJdkTest() {
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doNothing().when(bundledJdkMock).set(false);
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            target.setBundledJdk(false);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(bundledJdkMock).set(false);
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getFailIfUnavailableWhenThisFailIfUnavailableGet}, hash: C6D22CD54CAEE3DB2BA0D1EF57C6D596
    @Disabled()
    @Test()
    void getFailIfUnavailableWhenThisFailIfUnavailableGet() {
        /* Branches:
         * (this.failIfUnavailable.get()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(true).when(failIfUnavailableMock).get();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            boolean result = target.getFailIfUnavailable();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(failIfUnavailableMock).get();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getFailIfUnavailableWhenThisFailIfUnavailableNotGet}, hash: 8B79047D205E7F328BEA81317EDDBA48
    @Disabled()
    @Test()
    void getFailIfUnavailableWhenThisFailIfUnavailableNotGet() {
        /* Branches:
         * (this.failIfUnavailable.get()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(false).when(failIfUnavailableMock).get();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            boolean result = target.getFailIfUnavailable();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(failIfUnavailableMock).get();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${setFailIfUnavailableTest}, hash: 7C700C7BAAB8DC2A56A4D52B26FAAA8F
    @Disabled()
    @Test()
    void setFailIfUnavailableTest() {
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doNothing().when(failIfUnavailableMock).set(false);
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            target.setFailIfUnavailable(false);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(failIfUnavailableMock).set(false);
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getPreferArchiveWhenPreferArchiveGet}, hash: 935E3A73D7ABC40EC0BD4174D1C00A4F
    @Disabled()
    @Test()
    void getPreferArchiveWhenPreferArchiveGet() {
        /* Branches:
         * (preferArchive.get()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(true).when(preferArchiveMock).get();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            boolean result = target.getPreferArchive();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.TRUE));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(preferArchiveMock).get();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getPreferArchiveWhenPreferArchiveNotGet}, hash: D97F8C8C4EBF2F4D467AEB012BCA3809
    @Disabled()
    @Test()
    void getPreferArchiveWhenPreferArchiveNotGet() {
        /* Branches:
         * (preferArchive.get()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(false).when(preferArchiveMock).get();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            boolean result = target.getPreferArchive();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Boolean.FALSE));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(preferArchiveMock).get();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${setPreferArchiveTest}, hash: C07AE0A0DE83C87EAF2F83590DD6B619
    @Disabled()
    @Test()
    void setPreferArchiveTest() {
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doNothing().when(preferArchiveMock).set(false);
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            target.setPreferArchive(false);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(preferArchiveMock).set(false);
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${setArchitectureTest}, hash: 2148C8A71F8408741C4003A11C42B22B
    @Disabled()
    @Test()
    void setArchitectureTest() {
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doNothing().when(architectureMock).set(Architecture.X64);
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            target.setArchitecture(Architecture.X64);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(architectureMock).set(Architecture.X64);
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getArchitectureTest}, hash: D10ED1F7ECE01B63F8E03E9A21B1DE20
    @Disabled()
    @Test()
    void getArchitectureTest() {
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(Architecture.X64).when(architectureMock).get();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            Architecture result = target.getArchitecture();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(Architecture.X64));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(architectureMock).get();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${toStringTest}, hash: CF3E34B6EB0B294A477CFA256A41954D
    @Disabled()
    @Test()
    void toStringTest() {
        //Arrange Statement(s)
        ElasticsearchDistributionType elasticsearchDistributionTypeMock2 = mock(ElasticsearchDistributionType.class, "object2");
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(elasticsearchDistributionTypeMock2).when(typeMock).get();
            doReturn("B").when(versionMock).get();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("A", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            String result = target.toString();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("A_object2_B"));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(typeMock).get();
                verify(versionMock).get();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${maybeFreezeWhenFrozenEqualsFalse}, hash: D28E1CE43124A6745E71AD434C6AD556
    @Disabled()
    @Test()
    void maybeFreezeWhenFrozenEqualsFalse() {
        /* Branches:
         * (frozen == false) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = spy(new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock));
            doNothing().when(target).finalizeValues();
            //Act Statement(s)
            ElasticsearchDistribution result = target.maybeFreeze();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(target));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
                verify(target).finalizeValues();
            });
        }
    }

    //Sapient generated method id: ${getFilepathTest}, hash: 646CC96E2884D5799BC922CC4D3BC18F
    @Disabled()
    @Test()
    void getFilepathTest() throws IllegalStateException {
        //Arrange Statement(s)
        File fileMock = mock(File.class, "file");
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(fileMock).when(configurationMock).getSingleFile();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = spy(new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock));
            doReturn(elasticsearchDistributionMock).when(target).maybeFreeze();
            //Act Statement(s)
            String result = target.getFilepath();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("file"));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(configurationMock).getSingleFile();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
                verify(target).maybeFreeze();
            });
        }
    }

    //Sapient generated method id: ${getExtractedWhenGetTypeShouldExtractEqualsFalseThrowsUnsupportedOperationException}, hash: EF2F3660F485D509D234BBB30382A8D6
    @Disabled()
    @Test()
    void getExtractedWhenGetTypeShouldExtractEqualsFalseThrowsUnsupportedOperationException() {
        /* Branches:
         * (getType().shouldExtract() == false) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(false).when(elasticsearchDistributionTypeMock2).shouldExtract();
            doReturn(elasticsearchDistributionTypeMock2, elasticsearchDistributionTypeMock3).when(typeMock).get();
            doReturn("A").when(elasticsearchDistributionTypeMock3).getName();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("B", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            final UnsupportedOperationException result = assertThrows(UnsupportedOperationException.class, () -> {
                target.getExtracted();
            });
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("distribution type [A] for elasticsearch distribution [B] cannot be extracted");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(unsupportedOperationException.getMessage()));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(typeMock, times(2)).get();
                verify(elasticsearchDistributionTypeMock2).shouldExtract();
                verify(elasticsearchDistributionTypeMock3).getName();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getExtractedWhenGetTypeShouldExtractNotEqualsFalse}, hash: C2A787B3F50666BA087FA18CD5194CC7
    @Disabled()
    @Test()
    void getExtractedWhenGetTypeShouldExtractNotEqualsFalse() {
        /* Branches:
         * (getType().shouldExtract() == false) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(elasticsearchDistributionTypeMock2).when(typeMock).get();
            doReturn(true).when(elasticsearchDistributionTypeMock2).shouldExtract();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            ConfigurableFileCollection result = target.getExtracted();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(extractedMock));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(typeMock).get();
                verify(elasticsearchDistributionTypeMock2).shouldExtract();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getBuildDependenciesWhenSkippingDockerDistributionBuild}, hash: 07199F89A0E148C98791CEA8BC8603A7
    @Disabled()
    @Test()
    void getBuildDependenciesWhenSkippingDockerDistributionBuild() {
        /* Branches:
         * (isDocker()) : true  #  inside skippingDockerDistributionBuild method
         * (getFailIfUnavailable() == false) : true  #  inside skippingDockerDistributionBuild method
         * (dockerAvailability.get() == false) : true  #  inside skippingDockerDistributionBuild method
         * (skippingDockerDistributionBuild()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(false).when(dockerAvailabilityMock).get();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = spy(new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock));
            doReturn(true).when(target).isDocker();
            doReturn(false).when(target).getFailIfUnavailable();
            //Act Statement(s)
            TaskDependency result = target.getBuildDependencies();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(dockerAvailabilityMock).get();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
                verify(target).isDocker();
                verify(target).getFailIfUnavailable();
            });
        }
    }

    //Sapient generated method id: ${getBuildDependenciesWhenPreferArchiveGetEqualsFalse}, hash: 757656B5E699F721A402DD4C94F9F803
    @Disabled()
    @Test()
    void getBuildDependenciesWhenPreferArchiveGetEqualsFalse() {
        /* Branches:
         * (isDocker()) : true  #  inside skippingDockerDistributionBuild method
         * (getFailIfUnavailable() == false) : true  #  inside skippingDockerDistributionBuild method
         * (dockerAvailability.get() == false) : false  #  inside skippingDockerDistributionBuild method
         * (skippingDockerDistributionBuild()) : false
         * (getType().shouldExtract()) : true
         * (preferArchive.get() == false) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(elasticsearchDistributionTypeMock2).when(typeMock).get();
            doReturn(true).when(elasticsearchDistributionTypeMock2).shouldExtract();
            doReturn(true).when(dockerAvailabilityMock).get();
            doReturn(false).when(preferArchiveMock).get();
            doReturn(taskDependencyMock).when(extractedMock).getBuildDependencies();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = spy(new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock));
            doReturn(true).when(target).isDocker();
            doReturn(false).when(target).getFailIfUnavailable();
            doReturn(elasticsearchDistributionMock).when(target).maybeFreeze();
            //Act Statement(s)
            TaskDependency result = target.getBuildDependencies();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(taskDependencyMock));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(typeMock).get();
                verify(elasticsearchDistributionTypeMock2).shouldExtract();
                verify(dockerAvailabilityMock).get();
                verify(preferArchiveMock).get();
                verify(extractedMock).getBuildDependencies();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
                verify(target).isDocker();
                verify(target).getFailIfUnavailable();
                verify(target).maybeFreeze();
            });
        }
    }

    //Sapient generated method id: ${getBuildDependenciesWhenPreferArchiveGetNotEqualsFalse}, hash: E9898603F7140BDC426BB8C116D659DA
    @Disabled()
    @Test()
    void getBuildDependenciesWhenPreferArchiveGetNotEqualsFalse() {
        /* Branches:
         * (isDocker()) : true  #  inside skippingDockerDistributionBuild method
         * (getFailIfUnavailable() == false) : true  #  inside skippingDockerDistributionBuild method
         * (dockerAvailability.get() == false) : false  #  inside skippingDockerDistributionBuild method
         * (skippingDockerDistributionBuild()) : false
         * (getType().shouldExtract()) : true
         * (preferArchive.get() == false) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(elasticsearchDistributionTypeMock2).when(typeMock).get();
            doReturn(true).when(elasticsearchDistributionTypeMock2).shouldExtract();
            doReturn(true).when(dockerAvailabilityMock).get();
            doReturn(true).when(preferArchiveMock).get();
            doReturn(taskDependencyMock).when(configurationMock).getBuildDependencies();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = spy(new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock));
            doReturn(true).when(target).isDocker();
            doReturn(false).when(target).getFailIfUnavailable();
            doReturn(elasticsearchDistributionMock).when(target).maybeFreeze();
            //Act Statement(s)
            TaskDependency result = target.getBuildDependencies();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(taskDependencyMock));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(typeMock).get();
                verify(elasticsearchDistributionTypeMock2).shouldExtract();
                verify(dockerAvailabilityMock).get();
                verify(preferArchiveMock).get();
                verify(configurationMock).getBuildDependencies();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
                verify(target).isDocker();
                verify(target).getFailIfUnavailable();
                verify(target).maybeFreeze();
            });
        }
    }

    //Sapient generated method id: ${iteratorWhenGetTypeShouldExtract}, hash: 0D85E8C794A851E94BAB30E0391DC9C7
    @Disabled()
    @Test()
    void iteratorWhenGetTypeShouldExtract() {
        /* Branches:
         * (getType().shouldExtract()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(elasticsearchDistributionTypeMock2).when(typeMock).get();
            doReturn(true).when(elasticsearchDistributionTypeMock2).shouldExtract();
            List<File> fileList = new ArrayList<>();
            Iterator<File> iterator = fileList.iterator();
            doReturn(iterator).when(extractedMock).iterator();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = spy(new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock));
            doReturn(elasticsearchDistributionMock).when(target).maybeFreeze();
            //Act Statement(s)
            Iterator<File> result = target.iterator();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(typeMock).get();
                verify(elasticsearchDistributionTypeMock2).shouldExtract();
                verify(extractedMock).iterator();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
                verify(target).maybeFreeze();
            });
        }
    }

    //Sapient generated method id: ${iteratorWhenGetTypeNotShouldExtract}, hash: 0809DC2BCE644F5672DE526430C14039
    @Disabled()
    @Test()
    void iteratorWhenGetTypeNotShouldExtract() {
        /* Branches:
         * (getType().shouldExtract()) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(elasticsearchDistributionTypeMock2).when(typeMock).get();
            doReturn(false).when(elasticsearchDistributionTypeMock2).shouldExtract();
            List<File> fileList = new ArrayList<>();
            Iterator<File> iterator = fileList.iterator();
            doReturn(iterator).when(configurationMock).iterator();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = spy(new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock));
            doReturn(elasticsearchDistributionMock).when(target).maybeFreeze();
            //Act Statement(s)
            Iterator<File> result = target.iterator();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(typeMock).get();
                verify(elasticsearchDistributionTypeMock2).shouldExtract();
                verify(configurationMock).iterator();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
                verify(target).maybeFreeze();
            });
        }
    }

    //Sapient generated method id: ${finalizeValuesWhenPlatformGetOrNullIsNotNullThrowsIllegalArgumentException}, hash: 6D26545869513A591CAA14FF9DCD215F
    @Disabled()
    @Test()
    void finalizeValuesWhenPlatformGetOrNullIsNotNullThrowsIllegalArgumentException() {
        /* Branches:
         * (getType() == ElasticsearchDistributionTypes.INTEG_TEST_ZIP) : true
         * (platform.getOrNull() != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(elasticsearchDistributionTypeMock2).when(typeMock).get();
            Object object = new Object();
            doReturn(object).when(platformMock).getOrNull();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("A", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                target.finalizeValues();
            });
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("platform cannot be set on elasticsearch distribution [A] of type [integ_test_zip]");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(typeMock).get();
                verify(platformMock).getOrNull();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${finalizeValuesWhenBundledJdkGetOrNullIsNotNullThrowsIllegalArgumentException}, hash: DB56A0860B15389F62B6B8DFE61E7440
    @Disabled()
    @Test()
    void finalizeValuesWhenBundledJdkGetOrNullIsNotNullThrowsIllegalArgumentException() {
        /* Branches:
         * (getType() == ElasticsearchDistributionTypes.INTEG_TEST_ZIP) : true
         * (platform.getOrNull() != null) : false
         * (bundledJdk.getOrNull() != null) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(elasticsearchDistributionTypeMock2).when(typeMock).get();
            doReturn(null).when(platformMock).getOrNull();
            Object object = new Object();
            doReturn(object).when(bundledJdkMock).getOrNull();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("A", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                target.finalizeValues();
            });
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("bundledJdk cannot be set on elasticsearch distribution [A] of type [integ_test_zip]");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(typeMock).get();
                verify(platformMock).getOrNull();
                verify(bundledJdkMock).getOrNull();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${finalizeValuesWhenBundledJdkGetOrNullIsNull}, hash: 290F8D240BEFBABA4BF60419E8CA1709
    @Disabled()
    @Test()
    void finalizeValuesWhenBundledJdkGetOrNullIsNull() {
        /* Branches:
         * (getType() == ElasticsearchDistributionTypes.INTEG_TEST_ZIP) : true
         * (platform.getOrNull() != null) : false
         * (bundledJdk.getOrNull() != null) : false
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(elasticsearchDistributionTypeMock2).when(typeMock).get();
            doReturn(null).when(platformMock).getOrNull();
            doReturn(null).when(bundledJdkMock).getOrNull();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock);
            //Act Statement(s)
            target.finalizeValues();
            //Assert statement(s)
            assertAll("result", () -> {
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(typeMock).get();
                verify(platformMock).getOrNull();
                verify(bundledJdkMock).getOrNull();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${finalizeValuesWhenFailIfUnavailableGetEqualsFalseThrowsIllegalArgumentException}, hash: 3D4CC00F3D568F0B5F44A686C97693DE
    @Disabled()
    @Test()
    void finalizeValuesWhenFailIfUnavailableGetEqualsFalseThrowsIllegalArgumentException() {
        /* Branches:
         * (getType() == ElasticsearchDistributionTypes.INTEG_TEST_ZIP) : false
         * (isDocker() == false) : true
         * (failIfUnavailable.get() == false) : true
         */
        //Arrange Statement(s)
        ElasticsearchDistributionType elasticsearchDistributionTypeMock3 = mock(ElasticsearchDistributionType.class, "object4");
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(elasticsearchDistributionTypeMock2, elasticsearchDistributionTypeMock3).when(typeMock).get();
            doReturn(false).when(failIfUnavailableMock).get();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = spy(new ElasticsearchDistribution("A", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock));
            doReturn(false).when(target).isDocker();
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                target.finalizeValues();
            });
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("failIfUnavailable cannot be 'false' on elasticsearch distribution [A] of type [object4]");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(typeMock, times(2)).get();
                verify(failIfUnavailableMock).get();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
                verify(target).isDocker();
            });
        }
    }

    //Sapient generated method id: ${finalizeValuesWhenGetTypeNotEqualsElasticsearchDistributionTypesARCHIVEAndPlatformIsPreseThrowsIllegalArgumentException}, hash: CACA69209A6248F98ACF4CA43BE946E7
    @Disabled()
    @Test()
    void finalizeValuesWhenGetTypeNotEqualsElasticsearchDistributionTypesARCHIVEAndPlatformIsPreseThrowsIllegalArgumentException() {
        /* Branches:
         * (getType() == ElasticsearchDistributionTypes.INTEG_TEST_ZIP) : false
         * (isDocker() == false) : true
         * (failIfUnavailable.get() == false) : false
         * (getType() == ElasticsearchDistributionTypes.ARCHIVE) : false
         * (platform.isPresent()) : true
         */
        //Arrange Statement(s)
        ElasticsearchDistributionType elasticsearchDistributionTypeMock4 = mock(ElasticsearchDistributionType.class, "object5");
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(elasticsearchDistributionTypeMock2, elasticsearchDistributionTypeMock3, elasticsearchDistributionTypeMock4).when(typeMock).get();
            doReturn(true).when(failIfUnavailableMock).get();
            doReturn(true).when(platformMock).isPresent();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = spy(new ElasticsearchDistribution("A", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock));
            doReturn(false).when(target).isDocker();
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                target.finalizeValues();
            });
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("platform cannot be set on elasticsearch distribution [A] of type [object5]");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(typeMock, times(3)).get();
                verify(failIfUnavailableMock).get();
                verify(platformMock).isPresent();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
                verify(target).isDocker();
            });
        }
    }

    //Sapient generated method id: ${finalizeValuesWhenPlatformIsPresentEqualsFalseAndBundledJdkIsPresentEqualsFalse}, hash: B5D0867344425E8D00451EF54646CAF3
    @Disabled()
    @Test()
    void finalizeValuesWhenPlatformIsPresentEqualsFalseAndBundledJdkIsPresentEqualsFalse() {
        /* Branches:
         * (getType() == ElasticsearchDistributionTypes.INTEG_TEST_ZIP) : false
         * (isDocker() == false) : true
         * (failIfUnavailable.get() == false) : false
         * (getType() == ElasticsearchDistributionTypes.ARCHIVE) : true
         * (platform.isPresent() == false) : true
         * (bundledJdk.isPresent() == false) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(elasticsearchDistributionTypeMock2, elasticsearchDistributionTypeMock).when(typeMock).get();
            doNothing().when(typeMock).finalizeValue();
            doReturn(true).when(failIfUnavailableMock).get();
            doReturn(false).when(platformMock).isPresent();
            doNothing().when(platformMock).set(ElasticsearchDistribution.Platform.DARWIN);
            doNothing().when(platformMock).finalizeValue();
            doReturn(false).when(bundledJdkMock).isPresent();
            doNothing().when(bundledJdkMock).set(true);
            doNothing().when(bundledJdkMock).finalizeValue();
            doNothing().when(versionMock).finalizeValue();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = spy(new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock));
            doReturn(false).when(target).isDocker();
            //Act Statement(s)
            target.finalizeValues();
            //Assert statement(s)
            assertAll("result", () -> {
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(typeMock, times(2)).get();
                verify(typeMock).finalizeValue();
                verify(failIfUnavailableMock).get();
                verify(platformMock).isPresent();
                verify(platformMock).set(ElasticsearchDistribution.Platform.DARWIN);
                verify(platformMock).finalizeValue();
                verify(bundledJdkMock).isPresent();
                verify(bundledJdkMock).set(true);
                verify(bundledJdkMock).finalizeValue();
                verify(versionMock).finalizeValue();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
                verify(target).isDocker();
            });
        }
    }

    //Sapient generated method id: ${finalizeValuesWhenIsDockerAndBundledJdkIsPresentThrowsIllegalArgumentException}, hash: 56BC0AA953E8B365B6D7EDB8B6408BE4
    @Disabled()
    @Test()
    void finalizeValuesWhenIsDockerAndBundledJdkIsPresentThrowsIllegalArgumentException() {
        /* Branches:
         * (getType() == ElasticsearchDistributionTypes.INTEG_TEST_ZIP) : false
         * (isDocker() == false) : true
         * (failIfUnavailable.get() == false) : false
         * (getType() == ElasticsearchDistributionTypes.ARCHIVE) : false
         * (platform.isPresent()) : false
         * (isDocker()) : true
         * (bundledJdk.isPresent()) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(elasticsearchDistributionTypeMock2, elasticsearchDistributionTypeMock3).when(typeMock).get();
            doReturn(true).when(failIfUnavailableMock).get();
            doReturn(false).when(platformMock).isPresent();
            doReturn(true).when(bundledJdkMock).isPresent();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = spy(new ElasticsearchDistribution("A", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock));
            doReturn(false, true).when(target).isDocker();
            //Act Statement(s)
            final IllegalArgumentException result = assertThrows(IllegalArgumentException.class, () -> {
                target.finalizeValues();
            });
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("bundledJdk cannot be set on elasticsearch distribution [A] of type [docker]");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(illegalArgumentException.getMessage()));
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(typeMock, times(2)).get();
                verify(failIfUnavailableMock).get();
                verify(platformMock).isPresent();
                verify(bundledJdkMock).isPresent();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
                verify(target, times(2)).isDocker();
            });
        }
    }

    //Sapient generated method id: ${finalizeValuesWhenIsDockerAndBundledJdkNotIsPresentAndBundledJdkIsPresentEqualsFalse}, hash: 15F88CCB1459E60D94DE08228ED31489
    @Disabled()
    @Test()
    void finalizeValuesWhenIsDockerAndBundledJdkNotIsPresentAndBundledJdkIsPresentEqualsFalse() {
        /* Branches:
         * (getType() == ElasticsearchDistributionTypes.INTEG_TEST_ZIP) : false
         * (isDocker() == false) : true
         * (failIfUnavailable.get() == false) : false
         * (getType() == ElasticsearchDistributionTypes.ARCHIVE) : false
         * (platform.isPresent()) : false
         * (isDocker()) : true
         * (bundledJdk.isPresent()) : false
         * (bundledJdk.isPresent() == false) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(architectureMock).when(objectFactoryMock).property(Architecture.class);
            doReturn(propertyMock).when(objectFactoryMock).property(String.class);
            doReturn(versionMock).when(propertyMock).convention("return_of_getElasticsearch1");
            doReturn(typeMock).when(objectFactoryMock).property(ElasticsearchDistributionType.class);
            doReturn(platformMock).when(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
            doReturn(failIfUnavailableMock).when(propertyMock2).convention(true);
            doReturn(bundledJdkMock, propertyMock2, propertyMock3).when(objectFactoryMock).property(Boolean.class);
            doReturn(preferArchiveMock).when(propertyMock3).convention(false);
            doReturn(propertyMock4).when(typeMock).convention(elasticsearchDistributionTypeMock);
            doReturn(elasticsearchDistributionTypeMock2, elasticsearchDistributionTypeMock3).when(typeMock).get();
            doNothing().when(typeMock).finalizeValue();
            doReturn(true).when(failIfUnavailableMock).get();
            doReturn(false).when(platformMock).isPresent();
            doNothing().when(platformMock).finalizeValue();
            doReturn(false).when(bundledJdkMock).isPresent();
            doNothing().when(bundledJdkMock).set(true);
            doNothing().when(bundledJdkMock).finalizeValue();
            doNothing().when(versionMock).finalizeValue();
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            ElasticsearchDistribution target = spy(new ElasticsearchDistribution("name1", objectFactoryMock, dockerAvailabilityMock, configurationMock, extractedMock));
            doReturn(false, true).when(target).isDocker();
            //Act Statement(s)
            target.finalizeValues();
            //Assert statement(s)
            assertAll("result", () -> {
                verify(objectFactoryMock).property(Architecture.class);
                verify(objectFactoryMock).property(String.class);
                verify(propertyMock).convention("return_of_getElasticsearch1");
                verify(objectFactoryMock).property(ElasticsearchDistributionType.class);
                verify(objectFactoryMock).property(ElasticsearchDistribution.Platform.class);
                verify(objectFactoryMock, times(3)).property(Boolean.class);
                verify(propertyMock2).convention(true);
                verify(propertyMock3).convention(false);
                verify(typeMock).convention(elasticsearchDistributionTypeMock);
                verify(typeMock, times(2)).get();
                verify(typeMock).finalizeValue();
                verify(failIfUnavailableMock).get();
                verify(platformMock).isPresent();
                verify(platformMock).finalizeValue();
                verify(bundledJdkMock, times(2)).isPresent();
                verify(bundledJdkMock).set(true);
                verify(bundledJdkMock).finalizeValue();
                verify(versionMock).finalizeValue();
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
                verify(target, times(2)).isDocker();
            });
        }
    }
}

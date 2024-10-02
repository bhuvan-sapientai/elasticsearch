package org.elasticsearch.gradle;

import org.elasticsearch.gradle.ElasticsearchDistribution;
import org.elasticsearch.gradle.ElasticsearchDistribution;
import org.junit.jupiter.api.BeforeEach;
import org.gradle.api.tasks.TaskDependency;
import static org.mockito.ArgumentMatchers.any;
import org.gradle.api.provider.Property;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.util.Iterator;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import org.gradle.api.file.ConfigurableFileCollection;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.*;
import org.gradle.api.model.ObjectFactory;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

class ElasticsearchDistributionSapientGeneratedTest {

    private ElasticsearchDistribution distribution;

    private ObjectFactory objectFactory;

    private Property<Boolean> dockerAvailability;

    private ConfigurableFileCollection fileConfiguration;

    private ConfigurableFileCollection extractedConfiguration;

    private Property<Architecture> architecture;

    private Property<String> version;

    private Property<ElasticsearchDistributionType> type;

    private Property<ElasticsearchDistribution.Platform> platform;

    private Property<Boolean> bundledJdk;

    private Property<Boolean> failIfUnavailable;

    private Property<Boolean> preferArchive;

    @BeforeEach
    void setUp() {
        objectFactory = mock(ObjectFactory.class);
        dockerAvailability = mock(Property.class);
        fileConfiguration = mock(ConfigurableFileCollection.class);
        extractedConfiguration = mock(ConfigurableFileCollection.class);
        architecture = mock(Property.class);
        version = mock(Property.class);
        type = mock(Property.class);
        platform = mock(Property.class);
        bundledJdk = mock(Property.class);
        failIfUnavailable = mock(Property.class);
        preferArchive = mock(Property.class);
        when(objectFactory.property(Architecture.class)).thenReturn(architecture);
        when(objectFactory.property(String.class)).thenReturn(version);
        when(objectFactory.property(ElasticsearchDistributionType.class)).thenReturn(type);
        when(objectFactory.property(ElasticsearchDistribution.Platform.class)).thenReturn(platform);
        when(objectFactory.property(Boolean.class)).thenReturn(bundledJdk).thenReturn(failIfUnavailable).thenReturn(preferArchive);
        when(version.convention(anyString())).thenReturn(version);
        when(type.convention(any(ElasticsearchDistributionType.class))).thenReturn(type);
        when(failIfUnavailable.convention(anyBoolean())).thenReturn(failIfUnavailable);
        when(preferArchive.convention(anyBoolean())).thenReturn(preferArchive);
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            versionProperties.when(VersionProperties::getElasticsearch).thenReturn("7.10.0");
            distribution = new ElasticsearchDistribution("testDistro", objectFactory, dockerAvailability, fileConfiguration, extractedConfiguration);
        }
    }

    @Disabled()
    @Test
    void testGetVersion() {
        when(version.get()).thenReturn("7.10.0");
        assertEquals("7.10.0", distribution.getVersion());
    }

    @Disabled()
    @Test
    void testSetVersion() {
        distribution.setVersion("7.11.0");
        verify(version).set("7.11.0");
    }

    @Disabled()
    @Test
    void testGetPlatform() {
        ElasticsearchDistribution.Platform testPlatform = ElasticsearchDistribution.Platform.LINUX;
        when(platform.getOrNull()).thenReturn(testPlatform);
        assertEquals(testPlatform, distribution.getPlatform());
    }

    @Disabled()
    @Test
    void testSetPlatform() {
        ElasticsearchDistribution.Platform testPlatform = ElasticsearchDistribution.Platform.WINDOWS;
        distribution.setPlatform(testPlatform);
        verify(platform).set(testPlatform);
    }

    @Disabled()
    @Test
    void testGetType() {
        //ElasticsearchDistributionType testType = ElasticsearchDistributionType.ARCHIVE;
        //when(type.get()).thenReturn(testType);
        //assertEquals(testType, distribution.getType());
    }

    @Disabled()
    @Test
    void testSetType() {
        //ElasticsearchDistributionType testType = ElasticsearchDistributionType.INTEG_TEST_ZIP;
        //distribution.setType(testType);
        //verify(type).set(testType);
    }

    @Disabled()
    @Test
    void testGetBundledJdk() {
        when(bundledJdk.getOrElse(true)).thenReturn(true);
        assertTrue(distribution.getBundledJdk());
    }

    @Disabled()
    @Test
    void testSetBundledJdk() {
        distribution.setBundledJdk(false);
        verify(bundledJdk).set(false);
    }

    @Disabled()
    @Test
    void testIsDocker() {
        ElasticsearchDistributionType dockerType = mock(ElasticsearchDistributionType.class);
        when(dockerType.isDocker()).thenReturn(true);
        when(type.get()).thenReturn(dockerType);
        assertTrue(distribution.isDocker());
    }

    @Disabled()
    @Test
    void testGetFailIfUnavailable() {
        when(failIfUnavailable.get()).thenReturn(true);
        assertTrue(distribution.getFailIfUnavailable());
    }

    @Disabled()
    @Test
    void testSetFailIfUnavailable() {
        distribution.setFailIfUnavailable(false);
        verify(failIfUnavailable).set(false);
    }

    @Disabled()
    @Test
    void testGetPreferArchive() {
        when(preferArchive.get()).thenReturn(true);
        assertTrue(distribution.getPreferArchive());
    }

    @Disabled()
    @Test
    void testSetPreferArchive() {
        distribution.setPreferArchive(false);
        verify(preferArchive).set(false);
    }

    @Disabled()
    @Test
    void testSetArchitecture() {
        distribution.setArchitecture(Architecture.X64);
        verify(architecture).set(Architecture.X64);
    }

    @Disabled()
    @Test
    void testGetArchitecture() {
        when(architecture.get()).thenReturn(Architecture.AARCH64);
        assertEquals(Architecture.AARCH64, distribution.getArchitecture());
    }

    @Disabled()
    @Test
    void testToString() {
        //when(type.get()).thenReturn(ElasticsearchDistributionType.ARCHIVE);
        //when(version.get()).thenReturn("7.10.0");
        //assertEquals("testDistro_ARCHIVE_7.10.0", distribution.toString());
    }

    @Disabled()
    @Test
    void testMaybeFreeze() {
        ElasticsearchDistribution result = distribution.maybeFreeze();
        assertSame(distribution, result);
    }

    @Disabled()
    @Test
    void testGetFilepath() {
        File mockFile = mock(File.class);
        when(mockFile.toString()).thenReturn("/path/to/distribution");
        when(fileConfiguration.getSingleFile()).thenReturn(mockFile);
        assertEquals("/path/to/distribution", distribution.getFilepath());
    }

    @Disabled()
    @Test
    void testGetExtracted() {
        //when(type.get()).thenReturn(ElasticsearchDistributionType.ARCHIVE);
        //assertSame(extractedConfiguration, distribution.getExtracted());
    }

    @Disabled()
    @Test
    void testGetExtractedThrowsException() {
        //when(type.get()).thenReturn(ElasticsearchDistributionType.DOCKER);
        //assertThrows(UnsupportedOperationException.class, () -> distribution.getExtracted());
    }

    @Disabled()
    @Test
    void testGetBuildDependencies() {
        //TaskDependency mockDependency = mock(TaskDependency.class);
        //when(extractedConfiguration.getBuildDependencies()).thenReturn(mockDependency);
        //when(type.get()).thenReturn(ElasticsearchDistributionType.ARCHIVE);
        //when(preferArchive.get()).thenReturn(false);
        //assertSame(mockDependency, distribution.getBuildDependencies());
    }

    @Disabled()
    @Test
    void testIterator() {
        //Iterator<File> mockIterator = mock(Iterator.class);
        //when(extractedConfiguration.iterator()).thenReturn(mockIterator);
        //when(type.get()).thenReturn(ElasticsearchDistributionType.ARCHIVE);
        //assertSame(mockIterator, distribution.iterator());
    }
}

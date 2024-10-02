package org.elasticsearch.gradle.internal.conventions;

import org.elasticsearch.gradle.internal.conventions.VersionPropertiesLoader;

import java.io.FileInputStream;
import org.elasticsearch.gradle.internal.conventions.VersionPropertiesLoader;
import java.io.FileOutputStream;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import java.util.Properties;
import java.io.File;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.gradle.api.provider.ProviderFactory;
import java.io.InputStream;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.io.IOException;
import org.gradle.api.provider.Provider;
import static org.mockito.ArgumentMatchers.any;

class VersionPropertiesLoaderSapientGeneratedTest {

    @Mock
    private ProviderFactory providerFactory;

    @Mock
    private Provider<String> provider;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testLoadBuildSrcVersionFromFile() throws IOException {
        File inputFile = File.createTempFile("test-version", ".properties");
        Properties props = new Properties();
        props.setProperty("elasticsearch", "1.2.3");
        try (FileOutputStream fos = new FileOutputStream(inputFile)) {
            props.store(fos, null);
        }
        when(providerFactory.systemProperty("build.version_qualifier")).thenReturn(provider);
        when(provider.getOrElse("")).thenReturn("");
        when(providerFactory.systemProperty("build.snapshot")).thenReturn(provider);
        when(provider.getOrElse("true")).thenReturn("true");
        Properties loadedProps = VersionPropertiesLoader.loadBuildSrcVersion(inputFile, providerFactory);
        assertNotNull(loadedProps);
        assertEquals("1.2.3-SNAPSHOT", loadedProps.getProperty("elasticsearch"));
        inputFile.delete();
    }

    @Test
    void testLoadBuildSrcVersionMissingElasticsearchVersion() {
        Properties props = new Properties();
        assertThrows(IllegalStateException.class, () -> VersionPropertiesLoader.loadBuildSrcVersion(props, providerFactory));
    }

    @ParameterizedTest
    @CsvSource({ "1.2.3, true, , 1.2.3-SNAPSHOT", "1.2.3, false, , 1.2.3", "1.2.3, true, alpha1, 1.2.3-alpha1-SNAPSHOT", "1.2.3, false, beta2, 1.2.3-beta2" })
    void testLoadBuildSrcVersionWithDifferentScenarios(String version, String snapshot, String qualifier, String expected) {
        Properties props = new Properties();
        props.setProperty("elasticsearch", version);
        when(providerFactory.systemProperty("build.version_qualifier")).thenReturn(provider);
        when(provider.getOrElse("")).thenReturn(qualifier != null ? qualifier : "");
        when(providerFactory.systemProperty("build.snapshot")).thenReturn(provider);
        when(provider.getOrElse("true")).thenReturn(snapshot);
        VersionPropertiesLoader.loadBuildSrcVersion(props, providerFactory);
        assertEquals(expected, props.getProperty("elasticsearch"));
    }

    @Test
    void testLoadBuildSrcVersionInvalidElasticsearchVersion() {
        Properties props = new Properties();
        props.setProperty("elasticsearch", "invalid.version");
        assertThrows(IllegalStateException.class, () -> VersionPropertiesLoader.loadBuildSrcVersion(props, providerFactory));
    }

    @Test
    void testLoadBuildSrcVersionInvalidQualifier() {
        Properties props = new Properties();
        props.setProperty("elasticsearch", "1.2.3");
        when(providerFactory.systemProperty("build.version_qualifier")).thenReturn(provider);
        when(provider.getOrElse("")).thenReturn("invalid-qualifier");
        assertThrows(IllegalStateException.class, () -> VersionPropertiesLoader.loadBuildSrcVersion(props, providerFactory));
    }

    @Test
    void testLoadBuildSrcVersionInvalidSnapshotValue() {
        Properties props = new Properties();
        props.setProperty("elasticsearch", "1.2.3");
        when(providerFactory.systemProperty("build.version_qualifier")).thenReturn(provider);
        when(provider.getOrElse("")).thenReturn("");
        when(providerFactory.systemProperty("build.snapshot")).thenReturn(provider);
        when(provider.getOrElse("true")).thenReturn("invalid");
        assertThrows(IllegalArgumentException.class, () -> VersionPropertiesLoader.loadBuildSrcVersion(props, providerFactory));
    }

    @ParameterizedTest
    @CsvSource({ "alpha1, true", "beta2, true", "rc3, true", "alpha11, true", "beta22, true", "rc33, true", "alpha, false", "beta, false", "rc, false", "alpha0, false", "beta-1, false", "rc1a, false" })
    void testQualifierValidation(String qualifier, boolean isValid) {
        Properties props = new Properties();
        props.setProperty("elasticsearch", "1.2.3");
        when(providerFactory.systemProperty("build.version_qualifier")).thenReturn(provider);
        when(provider.getOrElse("")).thenReturn(qualifier);
        when(providerFactory.systemProperty("build.snapshot")).thenReturn(provider);
        when(provider.getOrElse("true")).thenReturn("true");
        if (isValid) {
            assertDoesNotThrow(() -> VersionPropertiesLoader.loadBuildSrcVersion(props, providerFactory));
        } else {
            assertThrows(IllegalStateException.class, () -> VersionPropertiesLoader.loadBuildSrcVersion(props, providerFactory));
        }
    }

    @Test
    void testLoadBuildSrcVersionWithEmptyQualifier() {
        Properties props = new Properties();
        props.setProperty("elasticsearch", "1.2.3");
        when(providerFactory.systemProperty("build.version_qualifier")).thenReturn(provider);
        when(provider.getOrElse("")).thenReturn("");
        when(providerFactory.systemProperty("build.snapshot")).thenReturn(provider);
        when(provider.getOrElse("true")).thenReturn("true");
        VersionPropertiesLoader.loadBuildSrcVersion(props, providerFactory);
        assertEquals("1.2.3-SNAPSHOT", props.getProperty("elasticsearch"));
    }

    @Test
    void testLoadBuildSrcVersionWithNonSnapshotBuild() {
        Properties props = new Properties();
        props.setProperty("elasticsearch", "1.2.3");
        when(providerFactory.systemProperty("build.version_qualifier")).thenReturn(provider);
        when(provider.getOrElse("")).thenReturn("");
        when(providerFactory.systemProperty("build.snapshot")).thenReturn(provider);
        when(provider.getOrElse("true")).thenReturn("false");
        VersionPropertiesLoader.loadBuildSrcVersion(props, providerFactory);
        assertEquals("1.2.3", props.getProperty("elasticsearch"));
    }

    @Test
    void testLoadBuildSrcVersionWithQualifierAndNonSnapshotBuild() {
        Properties props = new Properties();
        props.setProperty("elasticsearch", "1.2.3");
        when(providerFactory.systemProperty("build.version_qualifier")).thenReturn(provider);
        when(provider.getOrElse("")).thenReturn("beta1");
        when(providerFactory.systemProperty("build.snapshot")).thenReturn(provider);
        when(provider.getOrElse("true")).thenReturn("false");
        VersionPropertiesLoader.loadBuildSrcVersion(props, providerFactory);
        assertEquals("1.2.3-beta1", props.getProperty("elasticsearch"));
    }

    @Test
    void testLoadBuildSrcVersionWithMultipleDigitVersion() {
        Properties props = new Properties();
        props.setProperty("elasticsearch", "11.22.33");
        when(providerFactory.systemProperty("build.version_qualifier")).thenReturn(provider);
        when(provider.getOrElse("")).thenReturn("");
        when(providerFactory.systemProperty("build.snapshot")).thenReturn(provider);
        when(provider.getOrElse("true")).thenReturn("true");
        VersionPropertiesLoader.loadBuildSrcVersion(props, providerFactory);
        assertEquals("11.22.33-SNAPSHOT", props.getProperty("elasticsearch"));
    }

    @Test
    void testLoadBuildSrcVersionWithQualifierEdgeCases() {
        Properties props = new Properties();
        props.setProperty("elasticsearch", "1.2.3");
        when(providerFactory.systemProperty("build.version_qualifier")).thenReturn(provider);
        when(provider.getOrElse("")).thenReturn("alpha999");
        when(providerFactory.systemProperty("build.snapshot")).thenReturn(provider);
        when(provider.getOrElse("true")).thenReturn("true");
        VersionPropertiesLoader.loadBuildSrcVersion(props, providerFactory);
        assertEquals("1.2.3-alpha999-SNAPSHOT", props.getProperty("elasticsearch"));
    }

    @Test
    void testLoadBuildSrcVersionWithEmptyProperties() throws IOException {
        File inputFile = File.createTempFile("empty-version", ".properties");
        try {
            assertThrows(IllegalStateException.class, () -> VersionPropertiesLoader.loadBuildSrcVersion(inputFile, providerFactory));
        } finally {
            inputFile.delete();
        }
    }
}

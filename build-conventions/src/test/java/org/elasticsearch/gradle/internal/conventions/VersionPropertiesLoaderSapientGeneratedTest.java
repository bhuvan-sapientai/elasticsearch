package org.elasticsearch.gradle.internal.conventions;

import org.elasticsearch.gradle.internal.conventions.VersionPropertiesLoader;
import java.io.FileInputStream;
import org.junit.jupiter.api.BeforeEach;
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
import org.junit.jupiter.api.Disabled;

class VersionPropertiesLoaderSapientGeneratedTest {

    @Mock
    private ProviderFactory providerFactory;

    @Mock
    private Provider<String> provider;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Disabled()
    @Test
    void testLoadBuildSrcVersionFromFile() throws IOException {
        File inputFile = new File("test-version.properties");
        when(providerFactory.systemProperty("build.version_qualifier")).thenReturn(provider);
        when(provider.getOrElse("")).thenReturn("");
        when(providerFactory.systemProperty("build.snapshot")).thenReturn(provider);
        when(provider.getOrElse("true")).thenReturn("true");
        Properties props = VersionPropertiesLoader.loadBuildSrcVersion(inputFile, providerFactory);
        assertNotNull(props);
        assertTrue(props.getProperty("elasticsearch").endsWith("-SNAPSHOT"));
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
}

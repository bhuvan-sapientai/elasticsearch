package org.elasticsearch.gradle;

import org.elasticsearch.gradle.VersionProperties;
import java.nio.file.Files;
import org.junit.jupiter.api.io.TempDir;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import java.nio.file.Path;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import java.util.Properties;
import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

class VersionPropertiesSapientGeneratedTest {

    @TempDir
    Path tempDir;

    private Path versionPropertiesPath;

    @BeforeEach
    void setUp() throws IOException {
        versionPropertiesPath = tempDir.resolve("version.properties");
        Properties props = new Properties();
        props.setProperty("elasticsearch", "7.10.0");
        props.setProperty("lucene", "8.7.0");
        props.setProperty("bundled_jdk_vendor", "adoptopenjdk");
        props.setProperty("bundled_jdk", "15.0.1+9");
        props.store(Files.newOutputStream(versionPropertiesPath), null);
        System.setProperty("version.properties", versionPropertiesPath.toString());
    }

    @AfterEach
    void tearDown() {
        System.clearProperty("version.properties");
    }

    @Disabled()
    @Test
    void getElasticsearchTest() {
        String result = VersionProperties.getElasticsearch();
        assertThat(result, equalTo("7.10.0"));
    }

    @Disabled()
    @Test
    void getElasticsearchVersionTest() {
        Version result = VersionProperties.getElasticsearchVersion();
        assertThat(result, equalTo(Version.fromString("7.10.0")));
    }

    @Disabled()
    @Test
    void getLuceneTest() {
        String result = VersionProperties.getLucene();
        assertThat(result, equalTo("8.7.0"));
    }

    @Disabled()
    @Test
    void getBundledJdkMajorVersionTest() {
        String result = VersionProperties.getBundledJdkMajorVersion();
        assertThat(result, equalTo("15"));
    }

    @Disabled()
    @Test
    void getBundledJdkVersionTest() {
        String result = VersionProperties.getBundledJdkVersion();
        assertThat(result, equalTo("15.0.1+9"));
    }

    @Disabled()
    @Test
    void getBundledJdkVendorTest() {
        String result = VersionProperties.getBundledJdkVendor();
        assertThat(result, equalTo("adoptopenjdk"));
    }

    @Disabled()
    @Test
    void getVersionsTest() {
        Map<String, String> result = VersionProperties.getVersions();
        assertThat(result, allOf(hasEntry("elasticsearch", "7.10.0"), hasEntry("lucene", "8.7.0"), hasEntry("bundled_jdk_vendor", "adoptopenjdk"), hasEntry("bundled_jdk", "15.0.1+9")));
    }

    @Disabled()
    @Test
    void isElasticsearchSnapshotWhenElasticsearchEndsWith_SNAPSHOT() throws IOException {
        Properties props = new Properties();
        props.setProperty("elasticsearch", "7.10.0-SNAPSHOT");
        props.store(Files.newOutputStream(versionPropertiesPath), null);
        boolean result = VersionProperties.isElasticsearchSnapshot();
        assertThat(result, equalTo(true));
    }

    @Disabled()
    @Test
    void isElasticsearchSnapshotWhenElasticsearchNotEndsWith_SNAPSHOT() {
        boolean result = VersionProperties.isElasticsearchSnapshot();
        assertThat(result, equalTo(false));
    }

    @Disabled()
    @Test
    void testMissingVersionProperties() {
        System.clearProperty("version.properties");
        assertThrows(IllegalStateException.class, VersionProperties::getVersions);
    }

    @Disabled()
    @Test
    void testInvalidVersionProperties() throws IOException {
        Files.writeString(versionPropertiesPath, "invalid content");
        assertThrows(IllegalStateException.class, VersionProperties::getVersions);
    }
}

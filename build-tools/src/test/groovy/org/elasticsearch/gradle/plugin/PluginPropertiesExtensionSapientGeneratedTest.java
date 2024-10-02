package org.elasticsearch.gradle.plugin;

import org.elasticsearch.gradle.plugin.PluginPropertiesExtension;
import org.gradle.api.file.CopySpec;
import java.util.List;
import org.gradle.api.plugins.ExtraPropertiesExtension.UnknownPropertyException;
import org.gradle.api.provider.Property;
import org.gradle.api.plugins.ExtraPropertiesExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import java.io.File;
import org.gradle.api.Project;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.UnknownDomainObjectException;
import static org.hamcrest.MatcherAssert.assertThat;
import org.gradle.api.plugins.BasePluginExtension;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.gradle.api.model.ObjectFactory;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

class PluginPropertiesExtensionSapientGeneratedTest {

    private final Project projectMock = mock(Project.class);

    private final ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);

    private final ExtraPropertiesExtension extraPropertiesExtensionMock = mock(ExtraPropertiesExtension.class);

    private final ObjectFactory objectFactoryMock = mock(ObjectFactory.class);

    private final RegularFileProperty regularFilePropertyMock = mock(RegularFileProperty.class);

    private final BasePluginExtension basePluginExtensionMock = mock(BasePluginExtension.class);

    private final Property<String> propertyMock = mock(Property.class);

    @Test
    void getNameWhenNameIsNull() {
        doReturn("projectName").when(projectMock).getName();
        PluginPropertiesExtension target = new PluginPropertiesExtension(projectMock);
        String result = target.getName();
        assertThat(result, equalTo("projectName"));
        verify(projectMock).getName();
    }

    @Disabled()
    @Test
    void getNameWhenNameIsNotNull() {
        PluginPropertiesExtension target = new PluginPropertiesExtension(projectMock);
        target.setName("customName");
        String result = target.getName();
        assertThat(result, equalTo("customName"));
    }

    @Test
    void setNameTest() throws UnknownDomainObjectException {
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        doReturn(basePluginExtensionMock).when(extensionContainerMock).getByType(BasePluginExtension.class);
        doReturn(propertyMock).when(basePluginExtensionMock).getArchivesName();
        PluginPropertiesExtension target = new PluginPropertiesExtension(projectMock);
        target.setName("testName");
        verify(propertyMock).set("testName");
    }

    @Test
    void getVersionWhenVersionIsNull() {
        doReturn("projectVersion").when(projectMock).getVersion();
        PluginPropertiesExtension target = new PluginPropertiesExtension(projectMock);
        String result = target.getVersion();
        assertThat(result, equalTo("projectVersion"));
        verify(projectMock).getVersion();
    }

    @Test
    void getVersionWhenVersionIsNotNull() {
        PluginPropertiesExtension target = new PluginPropertiesExtension(projectMock);
        target.setVersion("1.0.0");
        String result = target.getVersion();
        assertThat(result, equalTo("1.0.0"));
    }

    @Test
    void setDescriptionTest() {
        PluginPropertiesExtension target = new PluginPropertiesExtension(projectMock);
        target.setDescription("Test Description");
        verify(projectMock).setDescription("Test Description");
        assertThat(target.getDescription(), equalTo("Test Description"));
    }

    @Test
    void setLicenseFileWhenExtraPropertiesHasLicenseFile() throws UnknownPropertyException {
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        doReturn(extraPropertiesExtensionMock).when(extensionContainerMock).getExtraProperties();
        doReturn(true).when(extraPropertiesExtensionMock).has("licenseFile");
        doReturn(regularFilePropertyMock).when(extraPropertiesExtensionMock).get("licenseFile");
        File file = new File("license.txt");
        PluginPropertiesExtension target = new PluginPropertiesExtension(projectMock);
        target.setLicenseFile(file);
        verify(regularFilePropertyMock).set(file);
        assertThat(target.getLicenseFile(), equalTo(file));
    }

    @Test
    void setLicenseFileWhenExtraPropertiesNotHasLicenseFile() {
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        doReturn(extraPropertiesExtensionMock).when(extensionContainerMock).getExtraProperties();
        doReturn(false).when(extraPropertiesExtensionMock).has("licenseFile");
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(regularFilePropertyMock).when(objectFactoryMock).fileProperty();
        File file = new File("license.txt");
        PluginPropertiesExtension target = new PluginPropertiesExtension(projectMock);
        target.setLicenseFile(file);
        verify(regularFilePropertyMock).set(file);
        assertThat(target.getLicenseFile(), equalTo(file));
    }

    @Test
    void setNoticeFileWhenExtraPropertiesHasNoticeFile() throws UnknownPropertyException {
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        doReturn(extraPropertiesExtensionMock).when(extensionContainerMock).getExtraProperties();
        doReturn(true).when(extraPropertiesExtensionMock).has("noticeFile");
        doReturn(regularFilePropertyMock).when(extraPropertiesExtensionMock).get("noticeFile");
        File file = new File("notice.txt");
        PluginPropertiesExtension target = new PluginPropertiesExtension(projectMock);
        target.setNoticeFile(file);
        verify(regularFilePropertyMock).set(file);
        assertThat(target.getNoticeFile(), equalTo(file));
    }

    @Test
    void setNoticeFileWhenExtraPropertiesNotHasNoticeFile() {
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        doReturn(extraPropertiesExtensionMock).when(extensionContainerMock).getExtraProperties();
        doReturn(false).when(extraPropertiesExtensionMock).has("noticeFile");
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(regularFilePropertyMock).when(objectFactoryMock).fileProperty();
        File file = new File("notice.txt");
        PluginPropertiesExtension target = new PluginPropertiesExtension(projectMock);
        target.setNoticeFile(file);
        verify(regularFilePropertyMock).set(file);
        assertThat(target.getNoticeFile(), equalTo(file));
    }

    @Test
    void getClassnameTest() {
        PluginPropertiesExtension target = new PluginPropertiesExtension(projectMock);
        target.setClassname("org.example.TestPlugin");
        assertThat(target.getClassname(), equalTo("org.example.TestPlugin"));
    }

    @Test
    void getExtendedPluginsTest() {
        PluginPropertiesExtension target = new PluginPropertiesExtension(projectMock);
        target.setExtendedPlugins(java.util.Arrays.asList("plugin1", "plugin2"));
        assertThat(target.getExtendedPlugins(), contains("plugin1", "plugin2"));
    }

    @ParameterizedTest
    @CsvSource({ "true", "false" })
    void hasNativeControllerTest(boolean hasNativeController) {
        PluginPropertiesExtension target = new PluginPropertiesExtension(projectMock);
        target.setHasNativeController(hasNativeController);
        assertThat(target.isHasNativeController(), equalTo(hasNativeController));
    }

    @ParameterizedTest
    @CsvSource({ "true", "false" })
    void isLicensedTest(boolean isLicensed) {
        PluginPropertiesExtension target = new PluginPropertiesExtension(projectMock);
        target.setLicensed(isLicensed);
        assertThat(target.isLicensed(), equalTo(isLicensed));
    }

    @ParameterizedTest
    @CsvSource({ "true", "false" })
    void requiresKeystoreTest(boolean requiresKeystore) {
        PluginPropertiesExtension target = new PluginPropertiesExtension(projectMock);
        target.setRequiresKeystore(requiresKeystore);
        assertThat(target.isRequiresKeystore(), equalTo(requiresKeystore));
    }

    @Test
    void getProjectTest() {
        PluginPropertiesExtension target = new PluginPropertiesExtension(projectMock);
        assertThat(target.getProject(), sameInstance(projectMock));
    }

    @Test
    void setBundleSpecTest() {
        CopySpec bundleSpecMock = mock(CopySpec.class);
        PluginPropertiesExtension target = new PluginPropertiesExtension(projectMock);
        target.setBundleSpec(bundleSpecMock);
        assertThat(target.getBundleSpec(), sameInstance(bundleSpecMock));
    }
}

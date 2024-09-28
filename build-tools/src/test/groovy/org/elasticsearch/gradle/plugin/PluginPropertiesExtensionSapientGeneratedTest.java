package org.elasticsearch.gradle.plugin;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.plugins.ExtraPropertiesExtension.UnknownPropertyException;
import org.gradle.api.provider.Property;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.plugins.BasePluginExtension;
import java.io.File;
import org.gradle.api.plugins.ExtraPropertiesExtension;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.Project;
import org.gradle.api.model.ObjectFactory;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class PluginPropertiesExtensionSapientGeneratedTest {

    private final Project projectMock = mock(Project.class, "project");

    private final ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);

    private final ExtraPropertiesExtension extraPropertiesExtensionMock = mock(ExtraPropertiesExtension.class);

    private final ObjectFactory objectFactoryMock = mock(ObjectFactory.class);

    private final RegularFileProperty regularFilePropertyMock = mock(RegularFileProperty.class);

    //Sapient generated method id: ${getNameWhenNameIsNull}, hash: BD181FA3B579FE413C5E32B7C32A2307
    @Disabled()
    @Test()
    void getNameWhenNameIsNull() {
        /* Branches:
         * (name == null) : true
         */
        //Arrange Statement(s)
        doReturn("return_of_getName1").when(projectMock).getName();
        PluginPropertiesExtension target = new PluginPropertiesExtension(projectMock);
        target.setName((String) null);
        //Act Statement(s)
        String result = target.getName();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getName1"));
            verify(projectMock).getName();
        });
    }

    //Sapient generated method id: ${getNameWhenNameIsNotNull}, hash: 52733AB9EEAE4DB126B15A4594EFE5FC
    @Disabled()
    @Test()
    void getNameWhenNameIsNotNull() {
        /* Branches:
         * (name == null) : false
         */
        //Arrange Statement(s)
        PluginPropertiesExtension target = new PluginPropertiesExtension(projectMock);
        target.setName("name1");
        //Act Statement(s)
        String result = target.getName();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("name1")));
    }

    //Sapient generated method id: ${setNameTest}, hash: D96B25B09FD789742C4802F2C043B2CE
    @Test()
    void setNameTest() throws UnknownDomainObjectException {
        //Arrange Statement(s)
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        BasePluginExtension basePluginExtensionMock = mock(BasePluginExtension.class);
        doReturn(basePluginExtensionMock).when(extensionContainerMock).getByType(BasePluginExtension.class);
        Property<String> propertyMock = mock(Property.class);
        doReturn(propertyMock).when(basePluginExtensionMock).getArchivesName();
        doNothing().when(propertyMock).set("name1");
        PluginPropertiesExtension target = new PluginPropertiesExtension(projectMock);
        //Act Statement(s)
        target.setName("name1");
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).getByType(BasePluginExtension.class);
            verify(basePluginExtensionMock).getArchivesName();
            verify(propertyMock).set("name1");
        });
    }

    //Sapient generated method id: ${getVersionWhenVersionIsNull}, hash: D5BF91F2E516467EEE7D6634F45C6E7D
    @Test()
    void getVersionWhenVersionIsNull() {
        /* Branches:
         * (version == null) : true
         */
        //Arrange Statement(s)
        Object objectMock = mock(Object.class, "object");
        doReturn(objectMock).when(projectMock).getVersion();
        PluginPropertiesExtension target = new PluginPropertiesExtension(projectMock);
        target.setVersion((String) null);
        //Act Statement(s)
        String result = target.getVersion();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("object"));
            verify(projectMock).getVersion();
        });
    }

    //Sapient generated method id: ${getVersionWhenVersionIsNotNull}, hash: 715D1FFBB1164427D53E96B5321AFE93
    @Test()
    void getVersionWhenVersionIsNotNull() {
        /* Branches:
         * (version == null) : false
         */
        //Arrange Statement(s)
        PluginPropertiesExtension target = new PluginPropertiesExtension(projectMock);
        target.setVersion("version1");
        //Act Statement(s)
        String result = target.getVersion();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("version1")));
    }

    //Sapient generated method id: ${setDescriptionTest}, hash: C1BEF3E8B88436C036E2ABC5D6516433
    @Test()
    void setDescriptionTest() {
        //Arrange Statement(s)
        doNothing().when(projectMock).setDescription("description1");
        PluginPropertiesExtension target = new PluginPropertiesExtension(projectMock);
        //Act Statement(s)
        target.setDescription("description1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(target.getDescription(), equalTo("description1"));
            verify(projectMock).setDescription("description1");
        });
    }

    //Sapient generated method id: ${setLicenseFileWhenExtraPropertiesHasLicenseFile}, hash: AECBB3847F38F743921193D0AF6852B8
    @Test()
    void setLicenseFileWhenExtraPropertiesHasLicenseFile() throws UnknownPropertyException {
        /* Branches:
         * (extraProperties.has("licenseFile")) : true
         */
        //Arrange Statement(s)
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        doReturn(extraPropertiesExtensionMock).when(extensionContainerMock).getExtraProperties();
        doReturn(true).when(extraPropertiesExtensionMock).has("licenseFile");
        doReturn(regularFilePropertyMock).when(extraPropertiesExtensionMock).get("licenseFile");
        File file = new File("pathname1");
        doNothing().when(regularFilePropertyMock).set(file);
        PluginPropertiesExtension target = new PluginPropertiesExtension(projectMock);
        //Act Statement(s)
        target.setLicenseFile(file);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(target.getLicenseFile(), equalTo(file));
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).getExtraProperties();
            verify(extraPropertiesExtensionMock).has("licenseFile");
            verify(extraPropertiesExtensionMock).get("licenseFile");
            verify(regularFilePropertyMock).set(file);
        });
    }

    //Sapient generated method id: ${setLicenseFileWhenExtraPropertiesNotHasLicenseFile}, hash: 3EB9A470E5BE8303D10CD70275C677BB
    @Test()
    void setLicenseFileWhenExtraPropertiesNotHasLicenseFile() {
        /* Branches:
         * (extraProperties.has("licenseFile")) : false
         */
        //Arrange Statement(s)
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        doReturn(extraPropertiesExtensionMock).when(extensionContainerMock).getExtraProperties();
        doReturn(false).when(extraPropertiesExtensionMock).has("licenseFile");
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(regularFilePropertyMock).when(objectFactoryMock).fileProperty();
        File file = new File("pathname1");
        doNothing().when(regularFilePropertyMock).set(file);
        PluginPropertiesExtension target = new PluginPropertiesExtension(projectMock);
        //Act Statement(s)
        target.setLicenseFile(file);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(target.getLicenseFile(), equalTo(file));
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).getExtraProperties();
            verify(extraPropertiesExtensionMock).has("licenseFile");
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileProperty();
            verify(regularFilePropertyMock).set(file);
        });
    }

    //Sapient generated method id: ${setNoticeFileWhenExtraPropertiesHasNoticeFile}, hash: 15D885ACBDA5379046ECA1290E5DBE1A
    @Test()
    void setNoticeFileWhenExtraPropertiesHasNoticeFile() throws UnknownPropertyException {
        /* Branches:
         * (extraProperties.has("noticeFile")) : true
         */
        //Arrange Statement(s)
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        doReturn(extraPropertiesExtensionMock).when(extensionContainerMock).getExtraProperties();
        doReturn(true).when(extraPropertiesExtensionMock).has("noticeFile");
        doReturn(regularFilePropertyMock).when(extraPropertiesExtensionMock).get("noticeFile");
        File file = new File("pathname1");
        doNothing().when(regularFilePropertyMock).set(file);
        PluginPropertiesExtension target = new PluginPropertiesExtension(projectMock);
        //Act Statement(s)
        target.setNoticeFile(file);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(target.getNoticeFile(), equalTo(file));
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).getExtraProperties();
            verify(extraPropertiesExtensionMock).has("noticeFile");
            verify(extraPropertiesExtensionMock).get("noticeFile");
            verify(regularFilePropertyMock).set(file);
        });
    }

    //Sapient generated method id: ${setNoticeFileWhenExtraPropertiesNotHasNoticeFile}, hash: 9FF2AA54374AA79EA12CF3071A24E4F0
    @Test()
    void setNoticeFileWhenExtraPropertiesNotHasNoticeFile() {
        /* Branches:
         * (extraProperties.has("noticeFile")) : false
         */
        //Arrange Statement(s)
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        doReturn(extraPropertiesExtensionMock).when(extensionContainerMock).getExtraProperties();
        doReturn(false).when(extraPropertiesExtensionMock).has("noticeFile");
        doReturn(objectFactoryMock).when(projectMock).getObjects();
        doReturn(regularFilePropertyMock).when(objectFactoryMock).fileProperty();
        File file = new File("pathname1");
        doNothing().when(regularFilePropertyMock).set(file);
        PluginPropertiesExtension target = new PluginPropertiesExtension(projectMock);
        //Act Statement(s)
        target.setNoticeFile(file);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(target.getNoticeFile(), equalTo(file));
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).getExtraProperties();
            verify(extraPropertiesExtensionMock).has("noticeFile");
            verify(projectMock).getObjects();
            verify(objectFactoryMock).fileProperty();
            verify(regularFilePropertyMock).set(file);
        });
    }
}

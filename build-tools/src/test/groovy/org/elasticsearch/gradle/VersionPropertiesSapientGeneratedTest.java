package org.elasticsearch.gradle;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.Map;
import org.mockito.MockedStatic;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class VersionPropertiesSapientGeneratedTest {

    //Sapient generated method id: ${getElasticsearchTest}, hash: DB87EDE754C0D0A70C79768693F98FFD
    @Disabled()
    @Test()
    void getElasticsearchTest() {
        //Act Statement(s)
        String result = VersionProperties.getElasticsearch();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${getElasticsearchVersionTest}, hash: A74C60157EBB9F00353F9818DB6CCEA1
    @Disabled()
    @Test()
    void getElasticsearchVersionTest() {
        //Arrange Statement(s)
        Version versionMock = mock(Version.class);
        try (MockedStatic<Version> version = mockStatic(Version.class)) {
            version.when(() -> Version.fromString("fieldString1")).thenReturn(versionMock);
            //Act Statement(s)
            Version result = VersionProperties.getElasticsearchVersion();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(versionMock));
                version.verify(() -> Version.fromString("fieldString1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getLuceneTest}, hash: B517B36439C3040EEDF02B11E015180A
    @Disabled()
    @Test()
    void getLuceneTest() {
        //Act Statement(s)
        String result = VersionProperties.getLucene();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${getBundledJdkMajorVersionTest}, hash: F3EC3CB6B67419AEEAC5F094815374B0
    @Disabled()
    @Test()
    void getBundledJdkMajorVersionTest() {
        //Act Statement(s)
        String result = VersionProperties.getBundledJdkMajorVersion();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${getBundledJdkVersionTest}, hash: 22C89237CBC05CB5D33CEFC3A602E146
    @Disabled()
    @Test()
    void getBundledJdkVersionTest() {
        //Act Statement(s)
        String result = VersionProperties.getBundledJdkVersion();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${getBundledJdkVendorTest}, hash: 8DEF313F026ED0841BCA4ABE6C017B45
    @Disabled()
    @Test()
    void getBundledJdkVendorTest() {
        //Act Statement(s)
        String result = VersionProperties.getBundledJdkVendor();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("result1")));
    }

    //Sapient generated method id: ${getVersionsTest}, hash: 397C4537D46F84F56FEB3C9F205BB73E
    @Disabled()
    @Test()
    void getVersionsTest() {
        //Act Statement(s)
        Map<String, String> result = VersionProperties.getVersions();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${isElasticsearchSnapshotWhenElasticsearchEndsWith_SNAPSHOT}, hash: 134358025A1C31062A86114DCE979892
    @Disabled()
    @Test()
    void isElasticsearchSnapshotWhenElasticsearchEndsWith_SNAPSHOT() {
        /* Branches:
         * (elasticsearch.endsWith("-SNAPSHOT")) : true
         */
        //Act Statement(s)
        boolean result = VersionProperties.isElasticsearchSnapshot();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${isElasticsearchSnapshotWhenElasticsearchNotEndsWith_SNAPSHOT}, hash: 0B3D994E6A04400F5A3C0A3B8B95C614
    @Disabled()
    @Test()
    void isElasticsearchSnapshotWhenElasticsearchNotEndsWith_SNAPSHOT() {
        /* Branches:
         * (elasticsearch.endsWith("-SNAPSHOT")) : false
         */
        //Act Statement(s)
        boolean result = VersionProperties.isElasticsearchSnapshot();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }
}

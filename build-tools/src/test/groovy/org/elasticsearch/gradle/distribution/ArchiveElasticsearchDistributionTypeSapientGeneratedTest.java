package org.elasticsearch.gradle.distribution;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.elasticsearch.gradle.ElasticsearchDistribution;
import org.elasticsearch.gradle.Version;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class ArchiveElasticsearchDistributionTypeSapientGeneratedTest {

    private final Version versionMock = mock(Version.class);

    //Sapient generated method id: ${getNameTest}, hash: B2102B9CB5B72B4D1692420670F6E57E
    @Test()
    void getNameTest() {
        //Arrange Statement(s)
        ArchiveElasticsearchDistributionType target = new ArchiveElasticsearchDistributionType();
        //Act Statement(s)
        String result = target.getName();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("archive")));
    }

    //Sapient generated method id: ${getExtensionWhenPlatformEqualsElasticsearchDistributionPlatformWINDOWS}, hash: CCE13D3E1334D3B300EAA2A8DFBD2A42
    @Test()
    void getExtensionWhenPlatformEqualsElasticsearchDistributionPlatformWINDOWS() {
        /* Branches:
         * (platform == ElasticsearchDistribution.Platform.WINDOWS) : true
         */
        //Arrange Statement(s)
        ArchiveElasticsearchDistributionType target = new ArchiveElasticsearchDistributionType();
        //Act Statement(s)
        String result = target.getExtension(ElasticsearchDistribution.Platform.WINDOWS);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("zip")));
    }

    //Sapient generated method id: ${getExtensionWhenPlatformNotEqualsElasticsearchDistributionPlatformWINDOWS}, hash: CF7482ADAC2675DADBA9B2D9149EFAA3
    @Test()
    void getExtensionWhenPlatformNotEqualsElasticsearchDistributionPlatformWINDOWS() {
        /* Branches:
         * (platform == ElasticsearchDistribution.Platform.WINDOWS) : false
         */
        //Arrange Statement(s)
        ArchiveElasticsearchDistributionType target = new ArchiveElasticsearchDistributionType();
        //Act Statement(s)
        String result = target.getExtension(ElasticsearchDistribution.Platform.LINUX);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("tar.gz")));
    }

    //Sapient generated method id: ${getClassifierWhenVersionOnOrAfter7_0_0}, hash: 14AD691D94F52EA13D14CF9FFFD934DF
    @Disabled()
    @Test()
    void getClassifierWhenVersionOnOrAfter7_0_0() {
        /* Branches:
         * (version.onOrAfter("7.0.0")) : true
         */
        //Arrange Statement(s)
        doReturn(true).when(versionMock).onOrAfter("7.0.0");
        ArchiveElasticsearchDistributionType target = new ArchiveElasticsearchDistributionType();
        //Act Statement(s)
        String result = target.getClassifier(ElasticsearchDistribution.Platform.DARWIN, versionMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(":DARWIN-null"));
            verify(versionMock).onOrAfter("7.0.0");
        });
    }

    //Sapient generated method id: ${getClassifierWhenVersionNotOnOrAfter7_0_0}, hash: 6E2EF98D147D1DF483C4E86A2B9C840E
    @Test()
    void getClassifierWhenVersionNotOnOrAfter7_0_0() {
        /* Branches:
         * (version.onOrAfter("7.0.0")) : false
         */
        //Arrange Statement(s)
        doReturn(false).when(versionMock).onOrAfter("7.0.0");
        ArchiveElasticsearchDistributionType target = new ArchiveElasticsearchDistributionType();
        //Act Statement(s)
        String result = target.getClassifier(ElasticsearchDistribution.Platform.LINUX, versionMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(""));
            verify(versionMock).onOrAfter("7.0.0");
        });
    }

    //Sapient generated method id: ${shouldExtractTest}, hash: B1C10603691B59C8601C3E109060D17E
    @Test()
    void shouldExtractTest() {
        //Arrange Statement(s)
        ArchiveElasticsearchDistributionType target = new ArchiveElasticsearchDistributionType();
        //Act Statement(s)
        boolean result = target.shouldExtract();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }
}

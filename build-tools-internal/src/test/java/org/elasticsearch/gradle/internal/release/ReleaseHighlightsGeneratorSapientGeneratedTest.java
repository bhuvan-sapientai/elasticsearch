package org.elasticsearch.gradle.internal.release;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;
import org.elasticsearch.gradle.VersionProperties;
import java.nio.file.Files;
import java.nio.file.Path;
import org.mockito.MockedStatic;
import java.io.File;
import java.util.ArrayList;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class ReleaseHighlightsGeneratorSapientGeneratedTest {

    private final QualifiedVersion qualifiedVersionMock = mock(QualifiedVersion.class);

    //Sapient generated method id: ${updateTest}, hash: 9C7FC68691AA1C8547EAED2DE42F0BB9
    @Disabled()
    @Test()
    void updateTest() throws IOException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.FileWriter
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<ReleaseHighlightsGenerator> releaseHighlightsGenerator = mockStatic(ReleaseHighlightsGenerator.class, CALLS_REAL_METHODS);
            MockedStatic<QualifiedVersion> qualifiedVersion = mockStatic(QualifiedVersion.class)) {
            qualifiedVersion.when(() -> QualifiedVersion.of("return_of_getElasticsearch1")).thenReturn(qualifiedVersionMock);
            releaseHighlightsGenerator.when(() -> ReleaseHighlightsGenerator.generateFile(eq(qualifiedVersionMock), eq("string2"), anyList())).thenReturn("return_of_generateFile1");
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            File file = new File("pathname1");
            File file2 = new File("pathname1");
            List<ChangelogEntry> changelogEntryList = new ArrayList<>();
            //Act Statement(s)
            ReleaseHighlightsGenerator.update(file, file2, changelogEntryList);
            //Assert statement(s)
            assertAll("result", () -> {
                qualifiedVersion.verify(() -> QualifiedVersion.of("return_of_getElasticsearch1"), atLeast(1));
                releaseHighlightsGenerator.verify(() -> ReleaseHighlightsGenerator.generateFile(eq(qualifiedVersionMock), eq("string2"), anyList()), atLeast(1));
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${updateWhenDefaultBranchThrowsThrowable}, hash: 28906F8D7E7EE7B9D11468ADB836905B
    @Disabled()
    @Test()
    void updateWhenDefaultBranchThrowsThrowable() throws IOException {
        /* Branches:
         * (branch expression (line 33)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.FileWriter
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Path pathMock = mock(Path.class);
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<ReleaseHighlightsGenerator> releaseHighlightsGenerator = mockStatic(ReleaseHighlightsGenerator.class, CALLS_REAL_METHODS);
            MockedStatic<QualifiedVersion> qualifiedVersion = mockStatic(QualifiedVersion.class);
            MockedStatic<Files> files = mockStatic(Files.class)) {
            files.when(() -> Files.readString(pathMock)).thenReturn("return_of_readString1");
            qualifiedVersion.when(() -> QualifiedVersion.of("return_of_getElasticsearch1")).thenReturn(qualifiedVersionMock);
            releaseHighlightsGenerator.when(() -> ReleaseHighlightsGenerator.generateFile(eq(qualifiedVersionMock), eq("return_of_readString1"), anyList())).thenReturn("return_of_generateFile1");
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            File file = new File("pathname1");
            File file2 = new File("pathname1");
            List<ChangelogEntry> changelogEntryList = new ArrayList<>();
            //Act Statement(s)
            final Throwable result = assertThrows(Throwable.class, () -> {
                ReleaseHighlightsGenerator.update(file, file2, changelogEntryList);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                files.verify(() -> Files.readString(pathMock), atLeast(1));
                qualifiedVersion.verify(() -> QualifiedVersion.of("return_of_getElasticsearch1"), atLeast(1));
                releaseHighlightsGenerator.verify(() -> ReleaseHighlightsGenerator.generateFile(eq(qualifiedVersionMock), eq("return_of_readString1"), anyList()), atLeast(1));
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${generateFileWhenMinorGreaterThanOrEqualsTo0}, hash: 8510EF09006A50214FEC7DC0F9FD1D15
    @Test()
    void generateFileWhenMinorGreaterThanOrEqualsTo0() throws IOException {
        /* Branches:
         * (version.minor() > 0) : true
         * (minor >= 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        QualifiedVersion versionMock = mock(QualifiedVersion.class);
        ChangelogEntry.Highlight highlightMock = mock(ChangelogEntry.Highlight.class);
        try (MockedStatic<TemplateUtils> templateUtils = mockStatic(TemplateUtils.class)) {
            doReturn(2).when(versionMock).major();
            doReturn(1, 3).when(versionMock).minor();
            templateUtils.when(() -> TemplateUtils.render(eq("template1"), anyMap())).thenReturn("return_of_render1");
            ChangelogEntry changelogEntry = new ChangelogEntry();
            changelogEntry.setHighlight(highlightMock);
            List<ChangelogEntry> changelogEntryList = new ArrayList<>();
            changelogEntryList.add(changelogEntry);
            //Act Statement(s)
            String result = ReleaseHighlightsGenerator.generateFile(versionMock, "template1", changelogEntryList);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_render1"));
                verify(versionMock, times(2)).minor();
                verify(versionMock).major();
                templateUtils.verify(() -> TemplateUtils.render(eq("template1"), anyMap()));
            });
        }
    }
}

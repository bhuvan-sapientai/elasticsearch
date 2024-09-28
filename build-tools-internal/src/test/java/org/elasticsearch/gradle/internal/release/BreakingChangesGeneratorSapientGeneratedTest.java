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
class BreakingChangesGeneratorSapientGeneratedTest {

    private final QualifiedVersion qualifiedVersionMock = mock(QualifiedVersion.class);

    //Sapient generated method id: ${updateTest}, hash: 11672472F772DB007B661D941E4A842C
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
            MockedStatic<QualifiedVersion> qualifiedVersion = mockStatic(QualifiedVersion.class);
            MockedStatic<BreakingChangesGenerator> breakingChangesGenerator = mockStatic(BreakingChangesGenerator.class, CALLS_REAL_METHODS)) {
            breakingChangesGenerator.when(() -> BreakingChangesGenerator.generateMigrationFile(eq(qualifiedVersionMock), eq("string2"), anyList())).thenReturn("return_of_generateMigrationFile1");
            qualifiedVersion.when(() -> QualifiedVersion.of("return_of_getElasticsearch1")).thenReturn(qualifiedVersionMock);
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            File file = new File("pathname1");
            File file2 = new File("pathname1");
            List<ChangelogEntry> changelogEntryList = new ArrayList<>();
            //Act Statement(s)
            BreakingChangesGenerator.update(file, file2, changelogEntryList);
            //Assert statement(s)
            assertAll("result", () -> {
                breakingChangesGenerator.verify(() -> BreakingChangesGenerator.generateMigrationFile(eq(qualifiedVersionMock), eq("string2"), anyList()), atLeast(1));
                qualifiedVersion.verify(() -> QualifiedVersion.of("return_of_getElasticsearch1"), atLeast(1));
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${updateWhenDefaultBranchThrowsThrowable}, hash: BA17109E6AE801A359B81E117D98B2AD
    @Disabled()
    @Test()
    void updateWhenDefaultBranchThrowsThrowable() throws IOException {
        /* Branches:
         * (branch expression (line 36)) : true
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
            MockedStatic<QualifiedVersion> qualifiedVersion = mockStatic(QualifiedVersion.class);
            MockedStatic<Files> files = mockStatic(Files.class);
            MockedStatic<BreakingChangesGenerator> breakingChangesGenerator = mockStatic(BreakingChangesGenerator.class, CALLS_REAL_METHODS)) {
            breakingChangesGenerator.when(() -> BreakingChangesGenerator.generateMigrationFile(eq(qualifiedVersionMock), eq("return_of_readString1"), anyList())).thenReturn("return_of_generateMigrationFile1");
            files.when(() -> Files.readString(pathMock)).thenReturn("return_of_readString1");
            qualifiedVersion.when(() -> QualifiedVersion.of("return_of_getElasticsearch1")).thenReturn(qualifiedVersionMock);
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            File file = new File("pathname1");
            File file2 = new File("pathname1");
            List<ChangelogEntry> changelogEntryList = new ArrayList<>();
            //Act Statement(s)
            final Throwable result = assertThrows(Throwable.class, () -> {
                BreakingChangesGenerator.update(file, file2, changelogEntryList);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                breakingChangesGenerator.verify(() -> BreakingChangesGenerator.generateMigrationFile(eq(qualifiedVersionMock), eq("return_of_readString1"), anyList()), atLeast(1));
                files.verify(() -> Files.readString(pathMock), atLeast(1));
                qualifiedVersion.verify(() -> QualifiedVersion.of("return_of_getElasticsearch1"), atLeast(1));
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${generateMigrationFileTest}, hash: 4F6EADD7AB4AE3DE8C70C62A3CF1E634
    @Disabled()
    @Test()
    void generateMigrationFileTest() throws IOException {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        QualifiedVersion versionMock = mock(QualifiedVersion.class);
        ChangelogEntry.Deprecation deprecationMock = mock(ChangelogEntry.Deprecation.class);
        ChangelogEntry.Breaking breakingMock = mock(ChangelogEntry.Breaking.class);
        try (MockedStatic<TemplateUtils> templateUtils = mockStatic(TemplateUtils.class)) {
            doReturn(false).when(versionMock).isSnapshot();
            doReturn(8).when(versionMock).revision();
            doReturn(2, 2, 8).when(versionMock).minor();
            doReturn(2, 2, 8, 1).when(versionMock).major();
            templateUtils.when(() -> TemplateUtils.render(eq("template1"), anyMap())).thenReturn("return_of_render1");
            ChangelogEntry changelogEntry = new ChangelogEntry();
            changelogEntry.setDeprecation(deprecationMock);
            changelogEntry.setBreaking(breakingMock);
            List<ChangelogEntry> changelogEntryList = new ArrayList<>();
            changelogEntryList.add(changelogEntry);
            //Act Statement(s)
            String result = BreakingChangesGenerator.generateMigrationFile(versionMock, "template1", changelogEntryList);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_render1"));
                verify(versionMock).isSnapshot();
                verify(versionMock, times(4)).major();
                verify(versionMock, times(3)).minor();
                verify(versionMock).revision();
                templateUtils.verify(() -> TemplateUtils.render(eq("template1"), anyMap()));
            });
        }
    }
}

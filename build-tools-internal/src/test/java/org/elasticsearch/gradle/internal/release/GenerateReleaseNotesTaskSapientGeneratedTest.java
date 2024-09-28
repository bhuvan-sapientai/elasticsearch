package org.elasticsearch.gradle.internal.release;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import org.gradle.api.GradleException;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import org.gradle.api.file.RegularFileProperty;
import org.elasticsearch.gradle.VersionProperties;
import org.mockito.stubbing.Answer;
import org.gradle.api.file.FileCollection;
import java.util.Set;
import org.gradle.api.file.RegularFile;
import java.util.stream.Stream;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.model.ObjectFactory;
import org.gradle.process.ExecOperations;
import org.mockito.MockedStatic;
import java.io.File;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static java.util.Map.entry;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.anyList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.ArgumentMatchers.anySet;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class GenerateReleaseNotesTaskSapientGeneratedTest {

    private final ConfigurableFileCollection changelogsMock = mock(ConfigurableFileCollection.class, "changelogs");

    private final RegularFileProperty releaseNotesIndexTemplateMock = mock(RegularFileProperty.class, "releaseNotesIndexTemplate");

    private final RegularFileProperty releaseNotesIndexFileMock = mock(RegularFileProperty.class, "releaseNotesIndexFile");

    private final RegularFileProperty releaseNotesTemplateMock = mock(RegularFileProperty.class, "releaseNotesTemplate");

    private final RegularFileProperty releaseNotesFileMock = mock(RegularFileProperty.class, "releaseNotesFile");

    private final RegularFileProperty releaseHighlightsTemplateMock = mock(RegularFileProperty.class, "releaseHighlightsTemplate");

    private final RegularFileProperty releaseHighlightsFileMock = mock(RegularFileProperty.class, "releaseHighlightsFile");

    private final RegularFileProperty breakingChangesTemplateMock = mock(RegularFileProperty.class, "breakingChangesTemplate");

    private final RegularFileProperty breakingChangesMigrationFileMock = mock(RegularFileProperty.class, "breakingChangesMigrationFile");

    private final RegularFileProperty migrationIndexTemplateMock = mock(RegularFileProperty.class, "migrationIndexTemplate");

    private final RegularFileProperty migrationIndexFileMock = mock(RegularFileProperty.class, "migrationIndexFile");

    private final ExecOperations execOperationsMock = mock(ExecOperations.class);

    private final GitWrapper gitWrapperMock = mock(GitWrapper.class);

    private final MinorVersion minorVersionMock = mock(MinorVersion.class);

    private final ObjectFactory objectFactoryMock = mock(ObjectFactory.class);

    private final QualifiedVersion qualifiedVersionMock = mock(QualifiedVersion.class);

    private final RegularFile regularFileMock = mock(RegularFile.class);

    //Sapient generated method id: ${executeTaskWhenNeedsGitTagsCurrentVersionThrowsNullPointerException}, hash: 3862CB84BA2839FD67B72855F44A7165
    @Disabled()
    @Test()
    void executeTaskWhenNeedsGitTagsCurrentVersionThrowsNullPointerException() throws IOException {
        /* Branches:
         * (needsGitTags(currentVersion)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<GenerateReleaseNotesTask> generateReleaseNotesTask = mockStatic(GenerateReleaseNotesTask.class, CALLS_REAL_METHODS)) {
            generateReleaseNotesTask.when(() -> GenerateReleaseNotesTask.needsGitTags("return_of_getElasticsearch1")).thenReturn(true);
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            GenerateReleaseNotesTask target = new GenerateReleaseNotesTask(objectFactoryMock, execOperationsMock);
            //Act Statement(s)
            final NullPointerException result = assertThrows(NullPointerException.class, () -> {
                target.executeTask();
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                generateReleaseNotesTask.verify(() -> GenerateReleaseNotesTask.needsGitTags("return_of_getElasticsearch1"), atLeast(1));
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${executeTaskWhenQualifiedVersionRevisionEquals0}, hash: 276AF627DF7F4952A7E1C2C5484B9441
    @Disabled()
    @Test()
    void executeTaskWhenQualifiedVersionRevisionEquals0() throws IOException {
        /* Branches:
         * (needsGitTags(currentVersion)) : false
         * (qualifiedVersion.revision() == 0) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        RegularFile regularFileMock2 = mock(RegularFile.class);
        RegularFile regularFileMock3 = mock(RegularFile.class);
        RegularFile regularFileMock4 = mock(RegularFile.class);
        RegularFile regularFileMock5 = mock(RegularFile.class);
        RegularFile regularFileMock6 = mock(RegularFile.class);
        RegularFile regularFileMock7 = mock(RegularFile.class);
        RegularFile regularFileMock8 = mock(RegularFile.class);
        RegularFile regularFileMock9 = mock(RegularFile.class);
        RegularFile regularFileMock10 = mock(RegularFile.class);
        ChangelogEntry changelogEntryMock = mock(ChangelogEntry.class);
        QualifiedVersion qualifiedVersion2Mock = mock(QualifiedVersion.class);
        QualifiedVersion qualifiedVersion2Mock2 = mock(QualifiedVersion.class);
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<ReleaseNotesIndexGenerator> releaseNotesIndexGenerator = mockStatic(ReleaseNotesIndexGenerator.class);
            MockedStatic<ReleaseNotesGenerator> releaseNotesGenerator = mockStatic(ReleaseNotesGenerator.class);
            MockedStatic<ReleaseHighlightsGenerator> releaseHighlightsGenerator = mockStatic(ReleaseHighlightsGenerator.class);
            MockedStatic<QualifiedVersion> qualifiedVersion = mockStatic(QualifiedVersion.class);
            MockedStatic<MinorVersion> minorVersion = mockStatic(MinorVersion.class);
            MockedStatic<MigrationIndexGenerator> migrationIndexGenerator = mockStatic(MigrationIndexGenerator.class);
            MockedStatic<GenerateReleaseNotesTask> generateReleaseNotesTask = mockStatic(GenerateReleaseNotesTask.class, CALLS_REAL_METHODS);
            MockedStatic<ChangelogEntry> changelogEntry = mockStatic(ChangelogEntry.class);
            MockedStatic<BreakingChangesGenerator> breakingChangesGenerator = mockStatic(BreakingChangesGenerator.class)) {
            Set<File> fileSet = new HashSet<>();
            doReturn(fileSet).when(changelogsMock).getFiles();
            doReturn(regularFileMock).when(releaseNotesIndexTemplateMock).get();
            File file = new File("pathname1");
            doReturn(file).when(regularFileMock).getAsFile();
            doReturn(regularFileMock2).when(releaseNotesIndexFileMock).get();
            File file2 = new File("pathname1");
            doReturn(file2).when(regularFileMock2).getAsFile();
            doReturn(regularFileMock3).when(releaseNotesTemplateMock).get();
            File file3 = new File("pathname1");
            doReturn(file3).when(regularFileMock3).getAsFile();
            doReturn(regularFileMock4).when(releaseNotesFileMock).get();
            File file4 = new File("pathname1");
            doReturn(file4).when(regularFileMock4).getAsFile();
            doReturn(regularFileMock5).when(releaseHighlightsTemplateMock).get();
            File file5 = new File("pathname1");
            doReturn(file5).when(regularFileMock5).getAsFile();
            doReturn(regularFileMock6).when(releaseHighlightsFileMock).get();
            File file6 = new File("pathname1");
            doReturn(file6).when(regularFileMock6).getAsFile();
            doReturn(regularFileMock7).when(breakingChangesTemplateMock).get();
            File file7 = new File("pathname1");
            doReturn(file7).when(regularFileMock7).getAsFile();
            doReturn(regularFileMock8).when(breakingChangesMigrationFileMock).get();
            File file8 = new File("pathname1");
            doReturn(file8).when(regularFileMock8).getAsFile();
            doReturn(regularFileMock9).when(migrationIndexTemplateMock).get();
            File file9 = new File("pathname1");
            doReturn(file9).when(regularFileMock9).getAsFile();
            doReturn(regularFileMock10).when(migrationIndexFileMock).get();
            File file10 = new File("pathname1");
            doReturn(file10).when(regularFileMock10).getAsFile();
            breakingChangesGenerator.when(() -> BreakingChangesGenerator.update(eq(file7), eq(file8), anyList())).thenAnswer((Answer<Void>) invocation -> null);
            File file11 = new File("pathname1");
            changelogEntry.when(() -> ChangelogEntry.parse(file11)).thenReturn(changelogEntryMock);
            generateReleaseNotesTask.when(() -> GenerateReleaseNotesTask.needsGitTags("return_of_getElasticsearch1")).thenReturn(false);
            Set<File> fileSet2 = new HashSet<>();
            fileSet2.add(file11);
            Map<QualifiedVersion, Set<File>> qualifiedVersionSetFileMap = new HashMap<>();
            qualifiedVersionSetFileMap.put(qualifiedVersion2Mock, fileSet2);
            generateReleaseNotesTask.when(() -> GenerateReleaseNotesTask.partitionFilesByVersion(eq((GitWrapper) null), eq("return_of_getElasticsearch1"), anySet())).thenReturn(qualifiedVersionSetFileMap);
            Set<QualifiedVersion> qualifiedVersionSet = new HashSet<>();
            qualifiedVersionSet.add(qualifiedVersion2Mock2);
            generateReleaseNotesTask.when(() -> GenerateReleaseNotesTask.getVersions((GitWrapper) null, "return_of_getElasticsearch1")).thenReturn(qualifiedVersionSet);
            migrationIndexGenerator.when(() -> MigrationIndexGenerator.update(anySet(), eq(file9), eq(file10))).thenAnswer((Answer<Void>) invocation -> null);
            minorVersion.when(() -> MinorVersion.of(qualifiedVersion2Mock2)).thenReturn(minorVersionMock);
            qualifiedVersion.when(() -> QualifiedVersion.of("return_of_getElasticsearch1")).thenReturn(qualifiedVersionMock);
            doReturn(0).when(qualifiedVersionMock).revision();
            releaseHighlightsGenerator.when(() -> ReleaseHighlightsGenerator.update(eq(file5), eq(file6), anyList())).thenAnswer((Answer<Void>) invocation -> null);
            releaseNotesGenerator.when(() -> ReleaseNotesGenerator.update(eq(file3), eq(file4), eq(qualifiedVersionMock), anySet())).thenAnswer((Answer<Void>) invocation -> null);
            releaseNotesIndexGenerator.when(() -> ReleaseNotesIndexGenerator.update(anySet(), eq(file), eq(file2))).thenAnswer((Answer<Void>) invocation -> null);
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            GenerateReleaseNotesTask target = new GenerateReleaseNotesTask(objectFactoryMock, execOperationsMock);
            //Act Statement(s)
            target.executeTask();
            //Assert statement(s)
            assertAll("result", () -> {
                verify(changelogsMock, atLeast(1)).getFiles();
                verify(releaseNotesIndexTemplateMock, atLeast(1)).get();
                verify(regularFileMock, atLeast(1)).getAsFile();
                verify(releaseNotesIndexFileMock, atLeast(1)).get();
                verify(regularFileMock2, atLeast(1)).getAsFile();
                verify(releaseNotesTemplateMock, atLeast(1)).get();
                verify(regularFileMock3, atLeast(1)).getAsFile();
                verify(releaseNotesFileMock, atLeast(1)).get();
                verify(regularFileMock4, atLeast(1)).getAsFile();
                verify(releaseHighlightsTemplateMock, atLeast(1)).get();
                verify(regularFileMock5, atLeast(1)).getAsFile();
                verify(releaseHighlightsFileMock, atLeast(1)).get();
                verify(regularFileMock6, atLeast(1)).getAsFile();
                verify(breakingChangesTemplateMock, atLeast(1)).get();
                verify(regularFileMock7, atLeast(1)).getAsFile();
                verify(breakingChangesMigrationFileMock, atLeast(1)).get();
                verify(regularFileMock8, atLeast(1)).getAsFile();
                verify(migrationIndexTemplateMock, atLeast(1)).get();
                verify(regularFileMock9, atLeast(1)).getAsFile();
                verify(migrationIndexFileMock, atLeast(1)).get();
                verify(regularFileMock10, atLeast(1)).getAsFile();
                breakingChangesGenerator.verify(() -> BreakingChangesGenerator.update(eq(file7), eq(file8), anyList()), atLeast(1));
                changelogEntry.verify(() -> ChangelogEntry.parse(file11), atLeast(1));
                generateReleaseNotesTask.verify(() -> GenerateReleaseNotesTask.needsGitTags("return_of_getElasticsearch1"), atLeast(1));
                generateReleaseNotesTask.verify(() -> GenerateReleaseNotesTask.partitionFilesByVersion(eq((GitWrapper) null), eq("return_of_getElasticsearch1"), anySet()), atLeast(1));
                generateReleaseNotesTask.verify(() -> GenerateReleaseNotesTask.getVersions((GitWrapper) null, "return_of_getElasticsearch1"), atLeast(1));
                migrationIndexGenerator.verify(() -> MigrationIndexGenerator.update(anySet(), eq(file9), eq(file10)), atLeast(1));
                minorVersion.verify(() -> MinorVersion.of(qualifiedVersion2Mock2), atLeast(1));
                qualifiedVersion.verify(() -> QualifiedVersion.of("return_of_getElasticsearch1"), atLeast(1));
                verify(qualifiedVersionMock, atLeast(1)).revision();
                releaseHighlightsGenerator.verify(() -> ReleaseHighlightsGenerator.update(eq(file5), eq(file6), anyList()), atLeast(1));
                releaseNotesGenerator.verify(() -> ReleaseNotesGenerator.update(eq(file3), eq(file4), eq(qualifiedVersionMock), anySet()), atLeast(1));
                releaseNotesIndexGenerator.verify(() -> ReleaseNotesIndexGenerator.update(anySet(), eq(file), eq(file2)), atLeast(1));
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${getVersionsWhenQualifiedVersionRevisionEquals0}, hash: D1D59AC5D9A331F9436A7F8C6B302226
    @Disabled()
    @Test()
    void getVersionsWhenQualifiedVersionRevisionEquals0() {
        /* Branches:
         * (qualifiedVersion.minor() > 0) : true
         * (qualifiedVersion.revision() == 0) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<QualifiedVersion> qualifiedVersion = mockStatic(QualifiedVersion.class)) {
            Stream<QualifiedVersion> stream = Stream.empty();
            doReturn(stream).when(gitWrapperMock).listVersions("v2.*");
            qualifiedVersion.when(() -> QualifiedVersion.of("currentVersion1")).thenReturn(qualifiedVersionMock);
            doReturn(0).when(qualifiedVersionMock).revision();
            doReturn(2, 0).when(qualifiedVersionMock).major();
            doReturn(1, 0).when(qualifiedVersionMock).minor();
            //Act Statement(s)
            Set<QualifiedVersion> result = GenerateReleaseNotesTask.getVersions(gitWrapperMock, "currentVersion1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(1));
                verify(gitWrapperMock).listVersions("v2.*");
                qualifiedVersion.verify(() -> QualifiedVersion.of("currentVersion1"), atLeast(1));
                verify(qualifiedVersionMock, times(2)).major();
                verify(qualifiedVersionMock, times(2)).minor();
                verify(qualifiedVersionMock).revision();
            });
        }
    }

    //Sapient generated method id: ${getMinorVersionsTest}, hash: 8D054A779DBA18AA42AFA088EC310144
    @Test()
    void getMinorVersionsTest() {
        //Arrange Statement(s)
        try (MockedStatic<MinorVersion> minorVersion = mockStatic(MinorVersion.class)) {
            minorVersion.when(() -> MinorVersion.of(qualifiedVersionMock)).thenReturn(minorVersionMock);
            Set<QualifiedVersion> qualifiedVersionSet = new HashSet<>();
            qualifiedVersionSet.add(qualifiedVersionMock);
            //Act Statement(s)
            Set<MinorVersion> result = GenerateReleaseNotesTask.getMinorVersions(qualifiedVersionSet);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result.size(), equalTo(1));
                assertThat(result.iterator().next(), is(instanceOf(MinorVersion.class)));
                minorVersion.verify(() -> MinorVersion.of(qualifiedVersionMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${partitionFilesByVersionWhenNeedsGitTagsVersionStringEqualsFalse}, hash: C76866B8CF478A0FFAB95EB7BAF87D99
    @Test()
    void partitionFilesByVersionWhenNeedsGitTagsVersionStringEqualsFalse() {
        /* Branches:
         * (needsGitTags(versionString) == false) : true
         */
        //Arrange Statement(s)
        try (MockedStatic<QualifiedVersion> qualifiedVersion = mockStatic(QualifiedVersion.class);
            MockedStatic<GenerateReleaseNotesTask> generateReleaseNotesTask = mockStatic(GenerateReleaseNotesTask.class, CALLS_REAL_METHODS)) {
            generateReleaseNotesTask.when(() -> GenerateReleaseNotesTask.needsGitTags("versionString1")).thenReturn(false);
            qualifiedVersion.when(() -> QualifiedVersion.of("versionString1")).thenReturn(qualifiedVersionMock);
            Set<File> fileSet = new HashSet<>();
            //Act Statement(s)
            Map<QualifiedVersion, Set<File>> result = GenerateReleaseNotesTask.partitionFilesByVersion(gitWrapperMock, "versionString1", fileSet);
            Map<QualifiedVersion, Set<File>> qualifiedVersionSetFileResultMap = new HashMap<>(Map.ofEntries(entry(qualifiedVersionMock, fileSet)));
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(qualifiedVersionSetFileResultMap));
                generateReleaseNotesTask.verify(() -> GenerateReleaseNotesTask.needsGitTags("versionString1"), atLeast(1));
                qualifiedVersion.verify(() -> QualifiedVersion.of("versionString1"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${partitionFilesByVersionWhenEarlierVersionsIsEmptyThrowsGradleException}, hash: 1BBB2B0F5DEDC93ACD425DDC865E5C64
    @Disabled()
    @Test()
    void partitionFilesByVersionWhenEarlierVersionsIsEmptyThrowsGradleException() {
        /* Branches:
         * (needsGitTags(versionString) == false) : false
         * (earlierVersions.isEmpty()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        QualifiedVersion qualifiedVersionMock = mock(QualifiedVersion.class, "qualifiedVersion");
        try (MockedStatic<QualifiedVersion> qualifiedVersion = mockStatic(QualifiedVersion.class);
            MockedStatic<GenerateReleaseNotesTask> generateReleaseNotesTask = mockStatic(GenerateReleaseNotesTask.class, CALLS_REAL_METHODS)) {
            Stream<QualifiedVersion> stream = Stream.empty();
            doReturn(stream).when(gitWrapperMock).listVersions("string1");
            generateReleaseNotesTask.when(() -> GenerateReleaseNotesTask.needsGitTags("versionString1")).thenReturn(true);
            qualifiedVersion.when(() -> QualifiedVersion.of("versionString1")).thenReturn(qualifiedVersionMock);
            doReturn(1).when(qualifiedVersionMock).major();
            doReturn(1).when(qualifiedVersionMock).minor();
            Set<File> fileSet = new HashSet<>();
            //Act Statement(s)
            final GradleException result = assertThrows(GradleException.class, () -> {
                GenerateReleaseNotesTask.partitionFilesByVersion(gitWrapperMock, "versionString1", fileSet);
            });
            GradleException gradleException = new GradleException("Failed to find git tags prior to [vqualifiedVersion]");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(gradleException.getMessage()));
                verify(gitWrapperMock, atLeast(1)).listVersions("string1");
                generateReleaseNotesTask.verify(() -> GenerateReleaseNotesTask.needsGitTags("versionString1"), atLeast(1));
                qualifiedVersion.verify(() -> QualifiedVersion.of("versionString1"), atLeast(1));
                verify(qualifiedVersionMock, atLeast(1)).major();
                verify(qualifiedVersionMock, atLeast(1)).minor();
            });
        }
    }

    //Sapient generated method id: ${needsGitTagsWhenVersionStringEndsWith_0_alpha1}, hash: B7C182C27D9227403868DDB26B0D48B9
    @Test()
    void needsGitTagsWhenVersionStringEndsWith_0_alpha1() {
        /* Branches:
         * (versionString.endsWith(".0")) : false
         * (versionString.endsWith(".0-SNAPSHOT")) : false
         * (versionString.endsWith(".0-alpha1")) : true
         */
        //Act Statement(s)
        boolean result = GenerateReleaseNotesTask.needsGitTags("BD.0-alpha1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${needsGitTagsWhenVersionStringNotEndsWith_0_alpha1}, hash: 3DC737FB13FCF46DF6FCE42053058FCF
    @Test()
    void needsGitTagsWhenVersionStringNotEndsWith_0_alpha1() {
        /* Branches:
         * (versionString.endsWith(".0")) : false
         * (versionString.endsWith(".0-SNAPSHOT")) : false
         * (versionString.endsWith(".0-alpha1")) : false
         */
        //Act Statement(s)
        boolean result = GenerateReleaseNotesTask.needsGitTags("BDIEFGMQLJK");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${getChangelogsTest}, hash: 1282C2A9743CD9869A3E1EB3DF3CB34F
    @Disabled()
    @Test()
    void getChangelogsTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        GenerateReleaseNotesTask target = new GenerateReleaseNotesTask(objectFactoryMock, execOperationsMock);
        //Act Statement(s)
        FileCollection result = target.getChangelogs();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(changelogsMock)));
    }

    //Sapient generated method id: ${setChangelogsTest}, hash: E8F50EE67EA2FE72E9F64C354894AB67
    @Disabled()
    @Test()
    void setChangelogsTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        FileCollection fileCollectionMock = mock(FileCollection.class);
        doNothing().when(changelogsMock).setFrom(fileCollectionMock);
        GenerateReleaseNotesTask target = new GenerateReleaseNotesTask(objectFactoryMock, execOperationsMock);
        //Act Statement(s)
        target.setChangelogs(fileCollectionMock);
        //Assert statement(s)
        assertAll("result", () -> verify(changelogsMock).setFrom(fileCollectionMock));
    }

    //Sapient generated method id: ${setReleaseNotesIndexTemplateTest}, hash: 8DC32D02A8A90614CA72F99E0A671BD3
    @Disabled()
    @Test()
    void setReleaseNotesIndexTemplateTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doNothing().when(releaseNotesIndexTemplateMock).set(regularFileMock);
        GenerateReleaseNotesTask target = new GenerateReleaseNotesTask(objectFactoryMock, execOperationsMock);
        //Act Statement(s)
        target.setReleaseNotesIndexTemplate(regularFileMock);
        //Assert statement(s)
        assertAll("result", () -> verify(releaseNotesIndexTemplateMock).set(regularFileMock));
    }

    //Sapient generated method id: ${setReleaseNotesTemplateTest}, hash: 1EA3543F0E3C1CF9345D6B8DC83CB892
    @Disabled()
    @Test()
    void setReleaseNotesTemplateTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doNothing().when(releaseNotesTemplateMock).set(regularFileMock);
        GenerateReleaseNotesTask target = new GenerateReleaseNotesTask(objectFactoryMock, execOperationsMock);
        //Act Statement(s)
        target.setReleaseNotesTemplate(regularFileMock);
        //Assert statement(s)
        assertAll("result", () -> verify(releaseNotesTemplateMock).set(regularFileMock));
    }

    //Sapient generated method id: ${setReleaseHighlightsTemplateTest}, hash: C51EF57CE56F7D41962497D9DCEB8CEA
    @Disabled()
    @Test()
    void setReleaseHighlightsTemplateTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doNothing().when(releaseHighlightsTemplateMock).set(regularFileMock);
        GenerateReleaseNotesTask target = new GenerateReleaseNotesTask(objectFactoryMock, execOperationsMock);
        //Act Statement(s)
        target.setReleaseHighlightsTemplate(regularFileMock);
        //Assert statement(s)
        assertAll("result", () -> verify(releaseHighlightsTemplateMock).set(regularFileMock));
    }

    //Sapient generated method id: ${setBreakingChangesTemplateTest}, hash: 4975F8D5EE31160F51BD23EC80BF7DB1
    @Disabled()
    @Test()
    void setBreakingChangesTemplateTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doNothing().when(breakingChangesTemplateMock).set(regularFileMock);
        GenerateReleaseNotesTask target = new GenerateReleaseNotesTask(objectFactoryMock, execOperationsMock);
        //Act Statement(s)
        target.setBreakingChangesTemplate(regularFileMock);
        //Assert statement(s)
        assertAll("result", () -> verify(breakingChangesTemplateMock).set(regularFileMock));
    }

    //Sapient generated method id: ${setMigrationIndexTemplateTest}, hash: 797DA8075D5486D11A722D6DF4D9EC81
    @Disabled()
    @Test()
    void setMigrationIndexTemplateTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doNothing().when(migrationIndexTemplateMock).set(regularFileMock);
        GenerateReleaseNotesTask target = new GenerateReleaseNotesTask(objectFactoryMock, execOperationsMock);
        //Act Statement(s)
        target.setMigrationIndexTemplate(regularFileMock);
        //Assert statement(s)
        assertAll("result", () -> verify(migrationIndexTemplateMock).set(regularFileMock));
    }

    //Sapient generated method id: ${setReleaseNotesIndexFileTest}, hash: 562E309CE9C39E4C21E51296043F7C73
    @Disabled()
    @Test()
    void setReleaseNotesIndexFileTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doNothing().when(releaseNotesIndexFileMock).set(regularFileMock);
        GenerateReleaseNotesTask target = new GenerateReleaseNotesTask(objectFactoryMock, execOperationsMock);
        //Act Statement(s)
        target.setReleaseNotesIndexFile(regularFileMock);
        //Assert statement(s)
        assertAll("result", () -> verify(releaseNotesIndexFileMock).set(regularFileMock));
    }

    //Sapient generated method id: ${setReleaseNotesFileTest}, hash: 14F4265F6B2874F20136400F9311D756
    @Disabled()
    @Test()
    void setReleaseNotesFileTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doNothing().when(releaseNotesFileMock).set(regularFileMock);
        GenerateReleaseNotesTask target = new GenerateReleaseNotesTask(objectFactoryMock, execOperationsMock);
        //Act Statement(s)
        target.setReleaseNotesFile(regularFileMock);
        //Assert statement(s)
        assertAll("result", () -> verify(releaseNotesFileMock).set(regularFileMock));
    }

    //Sapient generated method id: ${setReleaseHighlightsFileTest}, hash: 8C408DAAFFB3F81D32560F80E41ABC13
    @Disabled()
    @Test()
    void setReleaseHighlightsFileTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doNothing().when(releaseHighlightsFileMock).set(regularFileMock);
        GenerateReleaseNotesTask target = new GenerateReleaseNotesTask(objectFactoryMock, execOperationsMock);
        //Act Statement(s)
        target.setReleaseHighlightsFile(regularFileMock);
        //Assert statement(s)
        assertAll("result", () -> verify(releaseHighlightsFileMock).set(regularFileMock));
    }

    //Sapient generated method id: ${setBreakingChangesMigrationFileTest}, hash: 63B64777663FC1AE692675AF195659F0
    @Disabled()
    @Test()
    void setBreakingChangesMigrationFileTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doNothing().when(breakingChangesMigrationFileMock).set(regularFileMock);
        GenerateReleaseNotesTask target = new GenerateReleaseNotesTask(objectFactoryMock, execOperationsMock);
        //Act Statement(s)
        target.setBreakingChangesMigrationFile(regularFileMock);
        //Assert statement(s)
        assertAll("result", () -> verify(breakingChangesMigrationFileMock).set(regularFileMock));
    }

    //Sapient generated method id: ${setMigrationIndexFileTest}, hash: 6CE890C801ADC62F544741B516DDA881
    @Disabled()
    @Test()
    void setMigrationIndexFileTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doNothing().when(migrationIndexFileMock).set(regularFileMock);
        GenerateReleaseNotesTask target = new GenerateReleaseNotesTask(objectFactoryMock, execOperationsMock);
        //Act Statement(s)
        target.setMigrationIndexFile(regularFileMock);
        //Assert statement(s)
        assertAll("result", () -> verify(migrationIndexFileMock).set(regularFileMock));
    }
}

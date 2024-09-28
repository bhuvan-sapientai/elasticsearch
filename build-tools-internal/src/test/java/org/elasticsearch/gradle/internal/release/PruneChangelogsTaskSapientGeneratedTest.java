package org.elasticsearch.gradle.internal.release;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.TreeSet;
import org.elasticsearch.gradle.VersionProperties;
import org.gradle.api.GradleException;
import java.util.Set;
import java.util.stream.Stream;
import org.gradle.api.Project;
import org.gradle.api.model.ObjectFactory;
import org.gradle.process.ExecOperations;
import java.nio.file.Path;
import java.util.HashSet;
import org.mockito.MockedStatic;
import java.io.File;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class PruneChangelogsTaskSapientGeneratedTest {

    private final PruneChangelogsTask.DeleteHelper deleteHelperMock = mock(PruneChangelogsTask.DeleteHelper.class);

    private final GitWrapper gitWrapperMock = mock(GitWrapper.class);

    private final Path pathMock = mock(Path.class);

    private final PruneChangelogsTask.DeleteHelper pruneChangelogsTaskDeleteHelperMock = mock(PruneChangelogsTask.DeleteHelper.class);

    private final QualifiedVersion qualifiedVersionMock = mock(QualifiedVersion.class);

    private final QualifiedVersion versionMock = mock(QualifiedVersion.class);

    //Sapient generated method id: ${executeTaskThrowsNullPointerException}, hash: B83A55C16EDA0C1CB45C05CA159566BB
    @Disabled()
    @Test()
    void executeTaskThrowsNullPointerException() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        ExecOperations execOperationsMock = mock(ExecOperations.class);
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
            MockedStatic<QualifiedVersion> qualifiedVersion = mockStatic(QualifiedVersion.class)) {
            qualifiedVersion.when(() -> QualifiedVersion.of("return_of_getElasticsearch1")).thenReturn(qualifiedVersionMock);
            versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
            PruneChangelogsTask target = new PruneChangelogsTask(projectMock, objectFactoryMock, execOperationsMock);
            //Act Statement(s)
            final NullPointerException result = assertThrows(NullPointerException.class, () -> {
                target.executeTask();
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                qualifiedVersion.verify(() -> QualifiedVersion.of("return_of_getElasticsearch1"), atLeast(1));
                versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${findAndDeleteFilesWhenAllFilesInCheckoutIsEmpty}, hash: 8E16FD732C21C05CB9B59C0DAFA7DA06
    @Test()
    void findAndDeleteFilesWhenAllFilesInCheckoutIsEmpty() {
        /* Branches:
         * (allFilesInCheckout.isEmpty()) : true
         */
        //Arrange Statement(s)
        Set<File> fileSet = new HashSet<>();
        //Act Statement(s)
        PruneChangelogsTask.findAndDeleteFiles(gitWrapperMock, pruneChangelogsTaskDeleteHelperMock, qualifiedVersionMock, fileSet, pathMock);
    }

    //Sapient generated method id: ${findAndDeleteFilesWhenEarlierFilesIsEmpty}, hash: 95439A6E1A68CBD028C007A2F22D6BE9
    @Test()
    void findAndDeleteFilesWhenEarlierFilesIsEmpty() {
        /* Branches:
         * (allFilesInCheckout.isEmpty()) : false
         * (earlierFiles.isEmpty()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Stream<QualifiedVersion> stream = Stream.empty();
        doReturn(stream).when(gitWrapperMock).listVersions("v8.*");
        Stream<QualifiedVersion> stream2 = Stream.empty();
        doReturn(stream2).when(gitWrapperMock).listVersions("v2.*");
        doReturn(8, 3).when(versionMock).major();
        File file = new File("pathname1");
        Set<File> fileSet = new HashSet<>();
        fileSet.add(file);
        //Act Statement(s)
        PruneChangelogsTask.findAndDeleteFiles(gitWrapperMock, pruneChangelogsTaskDeleteHelperMock, versionMock, fileSet, pathMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(gitWrapperMock).listVersions("v8.*");
            verify(gitWrapperMock).listVersions("v2.*");
            verify(versionMock, times(2)).major();
        });
    }

    //Sapient generated method id: ${findAndDeleteFilesWhenFilesToDeleteIsEmpty}, hash: D5D640B849CAEFFA9CEF4FDA9261A9CE
    @Test()
    void findAndDeleteFilesWhenFilesToDeleteIsEmpty() {
        /* Branches:
         * (allFilesInCheckout.isEmpty()) : false
         * (earlierFiles.isEmpty()) : false
         * (branch expression (line 98)) : false
         * (filesToDelete.isEmpty()) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Stream<QualifiedVersion> stream = Stream.empty();
        Stream<QualifiedVersion> stream2 = Stream.empty();
        doReturn(stream, stream2).when(gitWrapperMock).listVersions("v2.*");
        doReturn(2, 3).when(versionMock).major();
        File file = new File("pathname1");
        Set<File> fileSet = new HashSet<>();
        fileSet.add(file);
        //Act Statement(s)
        PruneChangelogsTask.findAndDeleteFiles(gitWrapperMock, pruneChangelogsTaskDeleteHelperMock, versionMock, fileSet, pathMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(gitWrapperMock, times(2)).listVersions("v2.*");
            verify(versionMock, times(2)).major();
        });
    }

    //Sapient generated method id: ${findAndDeleteFilesWhenFailedToDeleteIsEmptyEqualsFalseThrowsGradleException}, hash: AB3245B7F19705692D3EB0C8444AFB70
    @Disabled()
    @Test()
    void findAndDeleteFilesWhenFailedToDeleteIsEmptyEqualsFalseThrowsGradleException() {
        /* Branches:
         * (allFilesInCheckout.isEmpty()) : false
         * (earlierFiles.isEmpty()) : false
         * (branch expression (line 98)) : true
         * (filesToDelete.isEmpty()) : false
         * (failedToDelete.isEmpty() == false) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Stream<QualifiedVersion> stream = Stream.empty();
        doReturn(stream).when(gitWrapperMock).listVersions("v8.*");
        Stream<QualifiedVersion> stream2 = Stream.empty();
        doReturn(stream2).when(gitWrapperMock).listVersions("v2.*");
        File file = new File("pathname1");
        Set<File> fileSet = new HashSet<>();
        fileSet.add(file);
        File file2 = new File("pathname1");
        TreeSet<File> fileSet2 = new TreeSet<>();
        fileSet2.add(file2);
        doReturn(fileSet).when(deleteHelperMock).deleteFiles(fileSet2);
        doReturn(8, 3).when(versionMock).major();
        Set<File> fileSet3 = new HashSet<>();
        fileSet3.add(file2);
        GradleException gradleException = new GradleException("Failed to delete some files:\n\n\tpath4\n");
        //Act Statement(s)
        final GradleException result = assertThrows(GradleException.class, () -> {
            PruneChangelogsTask.findAndDeleteFiles(gitWrapperMock, deleteHelperMock, versionMock, fileSet3, pathMock);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(gradleException.getMessage()));
            verify(gitWrapperMock).listVersions("v8.*");
            verify(gitWrapperMock).listVersions("v2.*");
            verify(deleteHelperMock).deleteFiles(fileSet2);
            verify(versionMock, times(2)).major();
        });
    }

    //Sapient generated method id: ${findAndDeleteFilesWhenFailedToDeleteIsEmptyNotEqualsFalse}, hash: C0EA11A3FC540EAD0AD9AAA120DA8AE5
    @Disabled()
    @Test()
    void findAndDeleteFilesWhenFailedToDeleteIsEmptyNotEqualsFalse() {
        /* Branches:
         * (allFilesInCheckout.isEmpty()) : false
         * (earlierFiles.isEmpty()) : false
         * (branch expression (line 98)) : true
         * (filesToDelete.isEmpty()) : false
         * (failedToDelete.isEmpty() == false) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Stream<QualifiedVersion> stream = Stream.empty();
        doReturn(stream).when(gitWrapperMock).listVersions("v8.*");
        Stream<QualifiedVersion> stream2 = Stream.empty();
        doReturn(stream2).when(gitWrapperMock).listVersions("v2.*");
        Set<File> fileSet = new HashSet<>();
        File file = new File("pathname1");
        TreeSet<File> fileSet2 = new TreeSet<>();
        fileSet2.add(file);
        doReturn(fileSet).when(deleteHelperMock).deleteFiles(fileSet2);
        doReturn(8, 3).when(versionMock).major();
        Set<File> fileSet3 = new HashSet<>();
        fileSet3.add(file);
        //Act Statement(s)
        PruneChangelogsTask.findAndDeleteFiles(gitWrapperMock, deleteHelperMock, versionMock, fileSet3, pathMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(gitWrapperMock).listVersions("v8.*");
            verify(gitWrapperMock).listVersions("v2.*");
            verify(deleteHelperMock).deleteFiles(fileSet2);
            verify(versionMock, times(2)).major();
        });
    }

    //Sapient generated method id: ${findPreviousVersionTest}, hash: BE64198AE8D9755CED5A4B7DF17D8EA1
    @Test()
    void findPreviousVersionTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Stream<QualifiedVersion> stream = Stream.empty();
        doReturn(stream).when(gitWrapperMock).listVersions("v8.*");
        Stream<QualifiedVersion> stream2 = Stream.empty();
        doReturn(stream2).when(gitWrapperMock).listVersions("v2.*");
        doReturn(8, 3).when(versionMock).major();
        //Act Statement(s)
        Stream<QualifiedVersion> result = PruneChangelogsTask.findPreviousVersion(gitWrapperMock, versionMock);
        //Assert statement(s)
        //TODO: Please implement equals method in Stream for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(gitWrapperMock).listVersions("v8.*");
            verify(gitWrapperMock).listVersions("v2.*");
            verify(versionMock, times(2)).major();
        });
    }
}

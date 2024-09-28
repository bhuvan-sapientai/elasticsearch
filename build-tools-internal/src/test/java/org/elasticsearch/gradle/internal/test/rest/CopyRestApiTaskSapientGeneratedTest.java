package org.elasticsearch.gradle.internal.test.rest;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;
import org.gradle.api.file.FileSystemOperations;
import org.elasticsearch.gradle.util.GradleUtils;
import java.nio.file.FileVisitOption;
import java.util.HashSet;
import java.util.ArrayList;
import org.gradle.api.logging.Logger;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.Action;
import org.gradle.api.tasks.WorkResult;
import java.nio.file.Files;
import java.util.Set;
import org.gradle.api.file.Directory;
import java.util.stream.Stream;
import org.gradle.api.Project;
import org.gradle.api.tasks.util.PatternSet;
import java.nio.file.Path;
import org.gradle.api.model.ObjectFactory;
import org.gradle.internal.Factory;
import org.gradle.api.file.ProjectLayout;
import org.mockito.MockedStatic;
import java.io.File;
import org.gradle.api.file.FileTree;
import org.gradle.api.provider.ListProperty;
import org.gradle.api.tasks.util.PatternFilterable;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.atLeast;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class CopyRestApiTaskSapientGeneratedTest {

    private final DirectoryProperty additionalYamlTestsDirMock = mock(DirectoryProperty.class, "additionalYamlTestsDir");

    private final ListProperty<String> includeMock = mock(ListProperty.class, "include");

    private final PatternFilterable patternSetMock = mock(PatternFilterable.class, "patternSet");

    private final FileSystemOperations fileSystemOperationsMock = mock(FileSystemOperations.class, "fileSystemOperations");

    private final DirectoryProperty outputResourceDirMock = mock(DirectoryProperty.class, "outputResourceDir");

    private final Directory directoryMock = mock(Directory.class);

    private final Factory<PatternSet> factoryMock = mock(Factory.class);

    private final FileSystemOperations fileSystemOperationsMock2 = mock(FileSystemOperations.class);

    private final ObjectFactory objectFactoryMock = mock(ObjectFactory.class);

    private final PatternFilterable patternFilterableMock = mock(PatternFilterable.class);

    private final ProjectLayout projectLayoutMock = mock(ProjectLayout.class);

    //Sapient generated method id: ${getInputDirWhenCaughtIOExceptionThrowsIllegalStateException}, hash: 6BDD754B7C4A347244D3EDD78C1456BE
    @Disabled()
    @Test()
    void getInputDirWhenCaughtIOExceptionThrowsIllegalStateException() {
        /* Branches:
         * (skipHasRestTestCheck) : false
         * (sourceResourceDir != null) : false  #  inside projectHasYamlRestTests method
         * (catch-exception (IOException)) : true  #  inside projectHasYamlRestTests method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        CopyRestApiTask target = spy(new CopyRestApiTask(projectLayoutMock, factoryMock, fileSystemOperationsMock2, objectFactoryMock));
        Project projectMock = mock(Project.class, "project");
        doReturn(projectMock).when(target).getProject();
        IOException iOException = new IOException();
        IllegalStateException illegalStateException = new IllegalStateException("message1", iOException);
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.getInputDir();
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
            assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
            verify(target).getProject();
        });
    }

    //Sapient generated method id: ${getInputDirWhenDefaultBranchThrowsThrowable}, hash: 251BDC6892E103DB1A667266D77F8592
    @Disabled()
    @Test()
    void getInputDirWhenDefaultBranchThrowsThrowable() throws IOException {
        /* Branches:
         * (skipHasRestTestCheck) : false
         * (sourceResourceDir != null) : false  #  inside projectHasYamlRestTests method
         * (yamlTestOutputDir.exists()) : true  #  inside projectHasYamlRestTests method
         * (branch expression (line 157)) : true  #  inside projectHasYamlRestTests method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Files> files = mockStatic(Files.class)) {
            doReturn(directoryMock).when(additionalYamlTestsDirMock).get();
            File file = new File("pathname1");
            doReturn(file).when(directoryMock).getAsFile();
            Stream<Path> stream = Stream.empty();
            FileVisitOption[] fileVisitOptionArray = new FileVisitOption[] {};
            files.when(() -> Files.walk((Path) any(), eq(fileVisitOptionArray))).thenReturn(stream);
            CopyRestApiTask target = new CopyRestApiTask(projectLayoutMock, factoryMock, fileSystemOperationsMock2, objectFactoryMock);
            //Act Statement(s)
            final Throwable result = assertThrows(Throwable.class, () -> {
                target.getInputDir();
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(additionalYamlTestsDirMock).get();
                verify(directoryMock).getAsFile();
                files.verify(() -> Files.walk((Path) any(), eq(fileVisitOptionArray)));
            });
        }
    }

    //Sapient generated method id: ${getInputDirWhenIncludeGetIsEmptyNotEqualsFalse}, hash: 33A14CEE114049C1808203ADD6938904
    @Disabled()
    @Test()
    void getInputDirWhenIncludeGetIsEmptyNotEqualsFalse() {
        /* Branches:
         * (skipHasRestTestCheck) : false
         * (sourceResourceDir != null) : false  #  inside projectHasYamlRestTests method
         * (yamlTestOutputDir.exists()) : false  #  inside projectHasYamlRestTests method
         * (projectHasYamlRestTests()) : false
         * (include.get().isEmpty() == false) : true
         * (additionalConfig == null) : true
         * (projectHasYamlRestTests) : false
         * (include.get().isEmpty() == false) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(directoryMock).when(additionalYamlTestsDirMock).get();
        File file = new File("pathname1");
        doReturn(file).when(directoryMock).getAsFile();
        List list = new ArrayList<>();
        list.add(null);
        List list2 = new ArrayList<>();
        list2.add((String) null);
        List list3 = new ArrayList<>();
        doReturn(list, list2, list3).when(includeMock).get();
        List<String> stringList = new ArrayList<>(List.of("null*/**"));
        doReturn(patternFilterableMock).when(patternSetMock).setIncludes(stringList);
        CopyRestApiTask target = new CopyRestApiTask(projectLayoutMock, factoryMock, fileSystemOperationsMock2, objectFactoryMock);
        //Act Statement(s)
        FileTree result = target.getInputDir();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(nullValue()));
            verify(additionalYamlTestsDirMock).get();
            verify(directoryMock).getAsFile();
            verify(includeMock, times(3)).get();
            verify(patternSetMock).setIncludes(stringList);
        });
    }

    //Sapient generated method id: ${getInputDirWhenAdditionalConfigIsNullAndProjectHasYamlRestTests}, hash: 9E9DA4F61975062215BBB79E24BC45A2
    @Disabled()
    @Test()
    void getInputDirWhenAdditionalConfigIsNullAndProjectHasYamlRestTests() {
        /* Branches:
         * (skipHasRestTestCheck) : false
         * (sourceResourceDir != null) : false  #  inside projectHasYamlRestTests method
         * (yamlTestOutputDir.exists()) : true  #  inside projectHasYamlRestTests method
         * (branch expression (line 159)) : false  #  inside projectHasYamlRestTests method
         * (files.anyMatch(p -> p.getFileName().toString().endsWith("yml"))) : true  #  inside projectHasYamlRestTests method
         * (projectHasYamlRestTests()) : true
         * (include.get().isEmpty() == false) : false
         * (projectHasYamlRestTests) : true
         * (additionalConfig == null) : true
         * (projectHasYamlRestTests) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(directoryMock).when(additionalYamlTestsDirMock).get();
        File file = new File("pathname1");
        doReturn(file).when(directoryMock).getAsFile();
        List list = new ArrayList<>();
        List list2 = new ArrayList<>();
        list2.add((String) null);
        doReturn(list, list2).when(includeMock).get();
        List<String> stringList = new ArrayList<>(List.of("null*/**"));
        doReturn(patternFilterableMock).when(patternSetMock).setIncludes(stringList);
        CopyRestApiTask target = new CopyRestApiTask(projectLayoutMock, factoryMock, fileSystemOperationsMock2, objectFactoryMock);
        //Act Statement(s)
        FileTree result = target.getInputDir();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(additionalYamlTestsDirMock).get();
            verify(directoryMock).getAsFile();
            verify(includeMock, times(2)).get();
            verify(patternSetMock).setIncludes(stringList);
        });
    }

    //Sapient generated method id: ${getInputDirWhenIncludeGetIsEmptyEqualsFalse}, hash: 6DEF33137D102DEA94610E1B5954B8F4
    @Disabled()
    @Test()
    void getInputDirWhenIncludeGetIsEmptyEqualsFalse() {
        /* Branches:
         * (skipHasRestTestCheck) : false
         * (sourceResourceDir != null) : false  #  inside projectHasYamlRestTests method
         * (yamlTestOutputDir.exists()) : true  #  inside projectHasYamlRestTests method
         * (branch expression (line 159)) : false  #  inside projectHasYamlRestTests method
         * (files.anyMatch(p -> p.getFileName().toString().endsWith("yml"))) : false  #  inside projectHasYamlRestTests method
         * (projectHasYamlRestTests()) : false
         * (include.get().isEmpty() == false) : true
         * (additionalConfig == null) : true
         * (projectHasYamlRestTests) : false
         * (include.get().isEmpty() == false) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(directoryMock).when(additionalYamlTestsDirMock).get();
        File file = new File("pathname1");
        doReturn(file).when(directoryMock).getAsFile();
        List list = new ArrayList<>();
        list.add(null);
        List list2 = new ArrayList<>();
        list2.add((String) null);
        List list3 = new ArrayList<>();
        list3.add(null);
        doReturn(list, list2, list3).when(includeMock).get();
        List<String> stringList = new ArrayList<>(List.of("null*/**"));
        doReturn(patternFilterableMock).when(patternSetMock).setIncludes(stringList);
        CopyRestApiTask target = new CopyRestApiTask(projectLayoutMock, factoryMock, fileSystemOperationsMock2, objectFactoryMock);
        //Act Statement(s)
        FileTree result = target.getInputDir();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(additionalYamlTestsDirMock).get();
            verify(directoryMock).getAsFile();
            verify(includeMock, times(3)).get();
            verify(patternSetMock).setIncludes(stringList);
        });
    }

    //Sapient generated method id: ${getInputDirWhenAdditionalConfigIsNullAndNotProjectHasYamlRestTestsAndIncludeGetIsEmptyNotEqualsFalse}, hash: 20A3007A3F4A033DA42BB6A700AA542A
    @Disabled()
    @Test()
    void getInputDirWhenAdditionalConfigIsNullAndNotProjectHasYamlRestTestsAndIncludeGetIsEmptyNotEqualsFalse() {
        /* Branches:
         * (skipHasRestTestCheck) : false
         * (sourceResourceDir != null) : false  #  inside projectHasYamlRestTests method
         * (yamlTestOutputDir.exists()) : false  #  inside projectHasYamlRestTests method
         * (branch expression (line 157)) : true  #  inside projectHasYamlRestTests method
         * (projectHasYamlRestTests()) : false
         * (include.get().isEmpty() == false) : false
         * (projectHasYamlRestTests) : false
         * (additionalConfig == null) : true
         * (projectHasYamlRestTests) : false
         * (include.get().isEmpty() == false) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(directoryMock).when(additionalYamlTestsDirMock).get();
        File file = new File("pathname1");
        doReturn(file).when(directoryMock).getAsFile();
        List list = new ArrayList<>();
        List list2 = new ArrayList<>();
        doReturn(list, list2).when(includeMock).get();
        CopyRestApiTask target = new CopyRestApiTask(projectLayoutMock, factoryMock, fileSystemOperationsMock2, objectFactoryMock);
        //Act Statement(s)
        FileTree result = target.getInputDir();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(nullValue()));
            verify(additionalYamlTestsDirMock).get();
            verify(directoryMock).getAsFile();
            verify(includeMock, times(2)).get();
        });
    }

    //Sapient generated method id: ${getInputDirWhenProjectHasYamlRestTestsAndAdditionalConfigIsNullAndProjectHasYamlRestTests}, hash: C7FCECA7F42EBEB216B15D4A0B48C086
    @Disabled()
    @Test()
    void getInputDirWhenProjectHasYamlRestTestsAndAdditionalConfigIsNullAndProjectHasYamlRestTests() throws IOException {
        /* Branches:
         * (skipHasRestTestCheck) : false
         * (sourceResourceDir != null) : false  #  inside projectHasYamlRestTests method
         * (branch expression (line 150)) : true  #  inside projectHasYamlRestTests method
         * (yamlTestOutputDir.exists()) : true  #  inside projectHasYamlRestTests method
         * (branch expression (line 159)) : false  #  inside projectHasYamlRestTests method
         * (files.anyMatch(p -> p.getFileName().toString().endsWith("yml"))) : true  #  inside projectHasYamlRestTests method
         * (projectHasYamlRestTests()) : true
         * (include.get().isEmpty() == false) : false
         * (projectHasYamlRestTests) : true
         * (additionalConfig == null) : true
         * (projectHasYamlRestTests) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Files> files = mockStatic(Files.class)) {
            doReturn(directoryMock).when(additionalYamlTestsDirMock).get();
            File file = new File("pathname1");
            doReturn(file).when(directoryMock).getAsFile();
            List list = new ArrayList<>();
            List list2 = new ArrayList<>();
            list2.add((String) null);
            doReturn(list, list2).when(includeMock).get();
            List<String> stringList = new ArrayList<>(List.of("null*/**"));
            doReturn(patternFilterableMock).when(patternSetMock).setIncludes(stringList);
            Stream<Path> stream = Stream.empty();
            FileVisitOption[] fileVisitOptionArray = new FileVisitOption[] {};
            files.when(() -> Files.walk((Path) any(), eq(fileVisitOptionArray))).thenReturn(stream);
            CopyRestApiTask target = new CopyRestApiTask(projectLayoutMock, factoryMock, fileSystemOperationsMock2, objectFactoryMock);
            //Act Statement(s)
            FileTree result = target.getInputDir();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(additionalYamlTestsDirMock).get();
                verify(directoryMock).getAsFile();
                verify(includeMock, times(2)).get();
                verify(patternSetMock).setIncludes(stringList);
                files.verify(() -> Files.walk((Path) any(), eq(fileVisitOptionArray)));
            });
        }
    }

    //Sapient generated method id: ${getInputDirWhenNotProjectHasYamlRestTestsAndIncludeGetIsEmptyEqualsFalse}, hash: FFE61005E610AC8A10578723C5A8EAF1
    @Disabled()
    @Test()
    void getInputDirWhenNotProjectHasYamlRestTestsAndIncludeGetIsEmptyEqualsFalse() throws IOException {
        /* Branches:
         * (skipHasRestTestCheck) : false
         * (sourceResourceDir != null) : false  #  inside projectHasYamlRestTests method
         * (branch expression (line 150)) : true  #  inside projectHasYamlRestTests method
         * (yamlTestOutputDir.exists()) : true  #  inside projectHasYamlRestTests method
         * (branch expression (line 159)) : false  #  inside projectHasYamlRestTests method
         * (files.anyMatch(p -> p.getFileName().toString().endsWith("yml"))) : false  #  inside projectHasYamlRestTests method
         * (projectHasYamlRestTests()) : false
         * (include.get().isEmpty() == false) : true
         * (additionalConfig == null) : true
         * (projectHasYamlRestTests) : false
         * (include.get().isEmpty() == false) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Files> files = mockStatic(Files.class)) {
            doReturn(directoryMock).when(additionalYamlTestsDirMock).get();
            File file = new File("pathname1");
            doReturn(file).when(directoryMock).getAsFile();
            List list = new ArrayList<>();
            list.add(null);
            List list2 = new ArrayList<>();
            list2.add((String) null);
            List list3 = new ArrayList<>();
            list3.add(null);
            doReturn(list, list2, list3).when(includeMock).get();
            List<String> stringList = new ArrayList<>(List.of("null*/**"));
            doReturn(patternFilterableMock).when(patternSetMock).setIncludes(stringList);
            Stream<Path> stream = Stream.empty();
            FileVisitOption[] fileVisitOptionArray = new FileVisitOption[] {};
            files.when(() -> Files.walk((Path) any(), eq(fileVisitOptionArray))).thenReturn(stream);
            CopyRestApiTask target = new CopyRestApiTask(projectLayoutMock, factoryMock, fileSystemOperationsMock2, objectFactoryMock);
            //Act Statement(s)
            FileTree result = target.getInputDir();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(additionalYamlTestsDirMock).get();
                verify(directoryMock).getAsFile();
                verify(includeMock, times(3)).get();
                verify(patternSetMock).setIncludes(stringList);
                files.verify(() -> Files.walk((Path) any(), eq(fileVisitOptionArray)));
            });
        }
    }

    //Sapient generated method id: ${copyWhenAdditionalConfigIsNull}, hash: A426F067809ABE7B21B53C183109ECE2
    @Disabled()
    @Test()
    void copyWhenAdditionalConfigIsNull() {
        /* Branches:
         * (additionalConfig != null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        WorkResult workResultMock = mock(WorkResult.class);
        WorkResult workResultMock2 = mock(WorkResult.class);
        Logger loggerMock = mock(Logger.class);
        try (MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            doReturn(workResultMock).when(fileSystemOperationsMock).delete((Action) any());
            doReturn(workResultMock2).when(fileSystemOperationsMock).copy((Action) any());
            doReturn(directoryMock).when(outputResourceDirMock).get();
            File file = new File("pathname1");
            doReturn(file).when(directoryMock).getAsFile();
            Set<String> stringSet = new HashSet<>();
            doReturn(stringSet).when(patternSetMock).getIncludes();
            gradleUtils.when(() -> GradleUtils.getProjectPathFromTask("A")).thenReturn("return_of_getProjectPathFromTask1");
            CopyRestApiTask target = spy(new CopyRestApiTask(projectLayoutMock, factoryMock, fileSystemOperationsMock2, objectFactoryMock));
            doReturn("A").when(target).getPath();
            doReturn(loggerMock).when(target).getLogger();
            doNothing().when(loggerMock).debug("Rest specs for project [{}] will be copied to the test resources.", "return_of_getProjectPathFromTask1");
            //Act Statement(s)
            target.copy();
            //Assert statement(s)
            assertAll("result", () -> {
                verify(fileSystemOperationsMock).delete((Action) any());
                verify(fileSystemOperationsMock).copy((Action) any());
                verify(outputResourceDirMock).get();
                verify(directoryMock).getAsFile();
                verify(patternSetMock).getIncludes();
                gradleUtils.verify(() -> GradleUtils.getProjectPathFromTask("A"), atLeast(1));
                verify(target).getPath();
                verify(target).getLogger();
                verify(loggerMock).debug("Rest specs for project [{}] will be copied to the test resources.", "return_of_getProjectPathFromTask1");
            });
        }
    }
}

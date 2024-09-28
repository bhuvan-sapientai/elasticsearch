package org.elasticsearch.gradle.internal.conventions.util;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.plugins.JavaPluginExtension;
import org.gradle.api.Action;
import org.gradle.api.GradleException;
import org.gradle.api.file.SourceDirectorySet;
import org.gradle.api.invocation.Gradle;
import org.gradle.api.Project;
import java.util.Collection;
import java.util.function.Supplier;
import org.gradle.api.tasks.SourceSetContainer;
import org.mockito.MockedStatic;
import java.io.File;
import org.gradle.api.file.FileTree;
import org.gradle.api.initialization.IncludedBuild;
import java.util.ArrayList;
import java.util.Optional;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.tasks.util.PatternFilterable;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UtilSapientGeneratedTest {

    private final Action<PatternFilterable> actionMock = mock(Action.class);

    private final ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);

    private final ExtensionContainer extensionContainerMock2 = mock(ExtensionContainer.class);

    private final FileTree fileTreeMock = mock(FileTree.class);

    private final FileTree fileTreeMock2 = mock(FileTree.class);

    private final Gradle gradleMock = mock(Gradle.class);

    private final IncludedBuild includedBuildMock = mock(IncludedBuild.class);

    private final JavaPluginExtension javaPluginExtensionMock = mock(JavaPluginExtension.class);

    private final Project projectMock = mock(Project.class);

    private final Project projectMock2 = mock(Project.class);

    private final SourceDirectorySet sourceDirectorySetMock = mock(SourceDirectorySet.class);

    private final SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);

    private final SourceSet sourceSetMock = mock(SourceSet.class);

    //Sapient generated method id: ${getBooleanPropertyWhenDefaultValue}, hash: EB9665347F9F0D8B4FD083DB8DDD65E7
    @Test()
    void getBooleanPropertyWhenDefaultValue() {
        /* Branches:
         * (propertyValue == null) : true
         * (defaultValue) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = Util.getBooleanProperty("property1", true);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${getBooleanPropertyWhenNotDefaultValue}, hash: 1633FA96A2610DFDA94F0ACE89A000F9
    @Test()
    void getBooleanPropertyWhenNotDefaultValue() {
        /* Branches:
         * (propertyValue == null) : true
         * (defaultValue) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = Util.getBooleanProperty("property1", false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${getBooleanPropertyWhenTrueEqualsPropertyValue}, hash: A7F6741E039F8F268632E61BA4F2E7CA
    @Disabled()
    @Test()
    void getBooleanPropertyWhenTrueEqualsPropertyValue() {
        /* Branches:
         * (propertyValue == null) : false
         * ("true".equals(propertyValue)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = Util.getBooleanProperty("property1", false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${getBooleanPropertyWhenFalseEqualsPropertyValue}, hash: 0B599867BF0B4D4FD83EDA68C9038447
    @Test()
    void getBooleanPropertyWhenFalseEqualsPropertyValue() {
        /* Branches:
         * (propertyValue == null) : false
         * ("true".equals(propertyValue)) : false
         * ("false".equals(propertyValue)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Act Statement(s)
        boolean result = Util.getBooleanProperty("property1", false);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${getBooleanPropertyWhenFalseNotEqualsPropertyValueThrowsGradleException}, hash: D311AE5DCA32277D24C38D2E6976D4E8
    @Disabled()
    @Test()
    void getBooleanPropertyWhenFalseNotEqualsPropertyValueThrowsGradleException() {
        /* Branches:
         * (propertyValue == null) : false
         * ("true".equals(propertyValue)) : false
         * ("false".equals(propertyValue)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        GradleException gradleException = new GradleException("Sysprop [B] must be [true] or [false] but was [A]");
        //Act Statement(s)
        final GradleException result = assertThrows(GradleException.class, () -> {
            Util.getBooleanProperty("B", false);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(gradleException.getMessage()));
        });
    }

    //Sapient generated method id: ${getJavaMainSourceResourcesTest}, hash: 194A107ED743D48B2A5EE213FD5B1B31
    @Test()
    void getJavaMainSourceResourcesTest() {
        //Arrange Statement(s)
        try (MockedStatic<Util> util = mockStatic(Util.class, CALLS_REAL_METHODS)) {
            util.when(() -> Util.getJavaMainSourceSet(projectMock)).thenReturn(Optional.of(sourceSetMock));
            doReturn(sourceDirectorySetMock).when(sourceSetMock).getResources();
            doReturn(fileTreeMock).when(sourceDirectorySetMock).getAsFileTree();
            doReturn(fileTreeMock2).when(fileTreeMock).matching(actionMock);
            //Act Statement(s)
            FileTree result = Util.getJavaMainSourceResources(projectMock, actionMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(fileTreeMock2));
                util.verify(() -> Util.getJavaMainSourceSet(projectMock), atLeast(1));
                verify(sourceSetMock, atLeast(1)).getResources();
                verify(sourceDirectorySetMock, atLeast(1)).getAsFileTree();
                verify(fileTreeMock, atLeast(1)).matching(actionMock);
            });
        }
    }

    //Sapient generated method id: ${getJavaTestSourceResourcesTest}, hash: 8731324EFE788E54C3BCAAF4AC2072CB
    @Test()
    void getJavaTestSourceResourcesTest() {
        //Arrange Statement(s)
        try (MockedStatic<Util> util = mockStatic(Util.class, CALLS_REAL_METHODS)) {
            util.when(() -> Util.getJavaTestSourceSet(projectMock)).thenReturn(Optional.of(sourceSetMock));
            doReturn(sourceDirectorySetMock).when(sourceSetMock).getResources();
            doReturn(fileTreeMock).when(sourceDirectorySetMock).getAsFileTree();
            doReturn(fileTreeMock2).when(fileTreeMock).matching(actionMock);
            //Act Statement(s)
            FileTree result = Util.getJavaTestSourceResources(projectMock, actionMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(fileTreeMock2));
                util.verify(() -> Util.getJavaTestSourceSet(projectMock), atLeast(1));
                verify(sourceSetMock, atLeast(1)).getResources();
                verify(sourceDirectorySetMock, atLeast(1)).getAsFileTree();
                verify(fileTreeMock, atLeast(1)).matching(actionMock);
            });
        }
    }

    //Sapient generated method id: ${getJavaTestAndMainSourceResourcesWhenMainFileTreeIsPresent}, hash: 91499539343B9BB7BEAFD0ADC70F6BC0
    @Test()
    void getJavaTestAndMainSourceResourcesWhenMainFileTreeIsPresent() {
        /* Branches:
         * (testFileTree.isPresent()) : true
         * (mainFileTree.isPresent()) : true
         */
        //Arrange Statement(s)
        FileTree fileTreeMock3 = mock(FileTree.class);
        FileTree fileTreeMock4 = mock(FileTree.class);
        SourceSet sourceSetMock2 = mock(SourceSet.class);
        SourceDirectorySet sourceDirectorySetMock2 = mock(SourceDirectorySet.class);
        try (MockedStatic<Util> util = mockStatic(Util.class, CALLS_REAL_METHODS)) {
            util.when(() -> Util.getJavaTestSourceSet(projectMock)).thenReturn(Optional.of(sourceSetMock));
            doReturn(sourceDirectorySetMock).when(sourceSetMock).getResources();
            doReturn(fileTreeMock).when(sourceDirectorySetMock).getAsFileTree();
            doReturn(fileTreeMock2).when(fileTreeMock).plus(fileTreeMock3);
            doReturn(fileTreeMock4).when(fileTreeMock2).matching(actionMock);
            util.when(() -> Util.getJavaMainSourceSet(projectMock)).thenReturn(Optional.of(sourceSetMock2));
            doReturn(sourceDirectorySetMock2).when(sourceSetMock2).getResources();
            doReturn(fileTreeMock3).when(sourceDirectorySetMock2).getAsFileTree();
            //Act Statement(s)
            FileTree result = Util.getJavaTestAndMainSourceResources(projectMock, actionMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(fileTreeMock4));
                util.verify(() -> Util.getJavaTestSourceSet(projectMock), atLeast(1));
                verify(sourceSetMock, atLeast(1)).getResources();
                verify(sourceDirectorySetMock, atLeast(1)).getAsFileTree();
                verify(fileTreeMock, atLeast(1)).plus(fileTreeMock3);
                verify(fileTreeMock2, atLeast(1)).matching(actionMock);
                util.verify(() -> Util.getJavaMainSourceSet(projectMock), atLeast(1));
                verify(sourceSetMock2, atLeast(1)).getResources();
                verify(sourceDirectorySetMock2, atLeast(1)).getAsFileTree();
            });
        }
    }

    //Sapient generated method id: ${getJavaTestSourceSetWhenProjectGetExtensionsFindByNameJavaIsNull}, hash: 520D3BABAA9A55C87786CAF72B52DDD4
    @Test()
    void getJavaTestSourceSetWhenProjectGetExtensionsFindByNameJavaIsNull() {
        /* Branches:
         * (project.getExtensions().findByName("java") == null) : true
         */
        //Arrange Statement(s)
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        doReturn(null).when(extensionContainerMock).findByName("java");
        //Act Statement(s)
        Optional<SourceSet> result = Util.getJavaTestSourceSet(projectMock);
        Optional<SourceSet> sourceSetOptional = Optional.empty();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(sourceSetOptional));
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).findByName("java");
        });
    }

    //Sapient generated method id: ${getJavaTestSourceSetWhenProjectGetExtensionsFindByNameJavaIsNotNull}, hash: 23459140E55B8BB9DED56993E5CB7D2B
    @Test()
    void getJavaTestSourceSetWhenProjectGetExtensionsFindByNameJavaIsNotNull() throws UnknownDomainObjectException {
        /* Branches:
         * (project.getExtensions().findByName("java") == null) : false
         */
        Object object = new Object();
        doReturn(object).when(extensionContainerMock).findByName("java");
        doReturn(extensionContainerMock, extensionContainerMock2).when(projectMock).getExtensions();
        doReturn(javaPluginExtensionMock).when(extensionContainerMock2).getByType(JavaPluginExtension.class);
        doReturn(sourceSetContainerMock).when(javaPluginExtensionMock).getSourceSets();
        doReturn(sourceSetMock).when(sourceSetContainerMock).findByName("test");
        //Act Statement(s)
        Optional<SourceSet> result = Util.getJavaTestSourceSet(projectMock);
        Optional<SourceSet> sourceSetOptional = Optional.of(sourceSetMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(sourceSetOptional));
            verify(projectMock, times(2)).getExtensions();
            verify(extensionContainerMock).findByName("java");
            verify(extensionContainerMock2).getByType(JavaPluginExtension.class);
            verify(javaPluginExtensionMock).getSourceSets();
            verify(sourceSetContainerMock).findByName("test");
        });
    }

    //Sapient generated method id: ${getJavaMainSourceSetWhenIsJavaExtensionAvailableProject}, hash: 1D2852D42195E6619E387FC0072F2F00
    @Test()
    void getJavaMainSourceSetWhenIsJavaExtensionAvailableProject() throws UnknownDomainObjectException {
        /* Branches:
         * (project.getExtensions().getByType(JavaPluginExtension.class) == null) : true  #  inside isJavaExtensionAvailable method
         * (isJavaExtensionAvailable(project)) : true
         */
        //Arrange Statement(s)
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        doReturn(null).when(extensionContainerMock).getByType(JavaPluginExtension.class);
        //Act Statement(s)
        Optional<SourceSet> result = Util.getJavaMainSourceSet(projectMock);
        Optional<SourceSet> sourceSetOptional = Optional.empty();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(sourceSetOptional));
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).getByType(JavaPluginExtension.class);
        });
    }

    //Sapient generated method id: ${getJavaMainSourceSetWhenIsJavaExtensionAvailableNotProject}, hash: 3BE6500A2A20FC93787BC615843C0DDE
    @Test()
    void getJavaMainSourceSetWhenIsJavaExtensionAvailableNotProject() throws UnknownDomainObjectException {
        /* Branches:
         * (project.getExtensions().getByType(JavaPluginExtension.class) == null) : false  #  inside isJavaExtensionAvailable method
         * (isJavaExtensionAvailable(project)) : false
         */
        Object object = new Object();
        doReturn(object).when(extensionContainerMock).getByType(JavaPluginExtension.class);
        doReturn(extensionContainerMock, extensionContainerMock2).when(projectMock).getExtensions();
        doReturn(javaPluginExtensionMock).when(extensionContainerMock2).getByType(JavaPluginExtension.class);
        doReturn(sourceSetContainerMock).when(javaPluginExtensionMock).getSourceSets();
        doReturn(sourceSetMock).when(sourceSetContainerMock).findByName("main");
        //Act Statement(s)
        Optional<SourceSet> result = Util.getJavaMainSourceSet(projectMock);
        Optional<SourceSet> sourceSetOptional = Optional.of(sourceSetMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(sourceSetOptional));
            verify(projectMock, times(2)).getExtensions();
            verify(extensionContainerMock).getByType(JavaPluginExtension.class);
            verify(extensionContainerMock2).getByType(JavaPluginExtension.class);
            verify(javaPluginExtensionMock).getSourceSets();
            verify(sourceSetContainerMock).findByName("main");
        });
    }

    //Sapient generated method id: ${toStringableTest}, hash: 440B33101B12DF0BFD9171A452D637D8
    @Test()
    void toStringableTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Supplier supplierMock = mock(Supplier.class);
        //Act Statement(s)
        Object result = Util.toStringable(supplierMock);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getJavaSourceSetsTest}, hash: 90483A672D9FEA9DFF0748C54A40D791
    @Test()
    void getJavaSourceSetsTest() throws UnknownDomainObjectException {
        //Arrange Statement(s)
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        doReturn(javaPluginExtensionMock).when(extensionContainerMock).getByType(JavaPluginExtension.class);
        doReturn(sourceSetContainerMock).when(javaPluginExtensionMock).getSourceSets();
        //Act Statement(s)
        SourceSetContainer result = Util.getJavaSourceSets(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(sourceSetContainerMock));
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).getByType(JavaPluginExtension.class);
            verify(javaPluginExtensionMock).getSourceSets();
        });
    }

    //Sapient generated method id: ${locateElasticsearchWorkspaceWhenGradleGetParentIsNotNull}, hash: 7DADF05B1D25A6F7D80FC30F9BFDECAA
    @Disabled()
    @Test()
    void locateElasticsearchWorkspaceWhenGradleGetParentIsNotNull() throws IllegalStateException {
        /* Branches:
         * (gradle.getRootProject().getName().startsWith("build-tools")) : false
         * (gradle.getParent() == null) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(projectMock).when(gradleMock).getRootProject();
        doReturn("A").when(projectMock).getName();
        Gradle gradleMock2 = mock(Gradle.class);
        Gradle gradleMock3 = mock(Gradle.class);
        doReturn(gradleMock2, gradleMock3).when(gradleMock).getParent();
        //Act Statement(s)
        File result = Util.locateElasticsearchWorkspace(gradleMock);
        File file = new File("pathname1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(file));
            verify(gradleMock).getRootProject();
            verify(projectMock).getName();
            verify(gradleMock, times(2)).getParent();
        });
    }

    //Sapient generated method id: ${locateElasticsearchWorkspaceWhenVersionFileExistsBuildToolsParent}, hash: BFDCF6634295F8DA27807B71B57AFB41
    @Disabled()
    @Test()
    void locateElasticsearchWorkspaceWhenVersionFileExistsBuildToolsParent() throws IllegalStateException {
        /* Branches:
         * (gradle.getRootProject().getName().startsWith("build-tools")) : true
         * (new File(rootDir, "build-tools-internal/version.properties").exists()) : true  #  inside versionFileExists method
         * (versionFileExists(buildToolsParent)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        doReturn("build-toolsA").when(projectMock).getName();
        doReturn(projectMock, projectMock2).when(gradleMock).getRootProject();
        File file = new File("pathname1");
        doReturn(file).when(projectMock2).getRootDir();
        //Act Statement(s)
        File result = Util.locateElasticsearchWorkspace(gradleMock);
        File file2 = new File("pathname1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(file2));
            verify(gradleMock, times(2)).getRootProject();
            verify(projectMock).getName();
            verify(projectMock2).getRootDir();
        });
    }

    //Sapient generated method id: ${locateElasticsearchWorkspaceWhenVersionFileExistsNotBuildToolsParent}, hash: 474E5C26B4F77F8DF1C6C457683F9797
    @Disabled()
    @Test()
    void locateElasticsearchWorkspaceWhenVersionFileExistsNotBuildToolsParent() throws IllegalStateException {
        /* Branches:
         * (gradle.getRootProject().getName().startsWith("build-tools")) : true
         * (new File(rootDir, "build-tools-internal/version.properties").exists()) : false  #  inside versionFileExists method
         * (versionFileExists(buildToolsParent)) : false
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        doReturn("build-toolsA").when(projectMock).getName();
        doReturn(projectMock, projectMock2).when(gradleMock).getRootProject();
        File file = new File("pathname1");
        doReturn(file).when(projectMock2).getRootDir();
        //Act Statement(s)
        File result = Util.locateElasticsearchWorkspace(gradleMock);
        File file2 = new File("pathname1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(file2));
            verify(gradleMock, times(2)).getRootProject();
            verify(projectMock).getName();
            verify(projectMock2).getRootDir();
        });
    }

    //Sapient generated method id: ${locateElasticsearchWorkspaceWhenVersionFileExistsIncludedBuildGetProjectDir}, hash: 83E99E8C44BC0AE9C1452A52DF820CD4
    @Disabled()
    @Test()
    void locateElasticsearchWorkspaceWhenVersionFileExistsIncludedBuildGetProjectDir() throws IllegalStateException {
        /* Branches:
         * (gradle.getRootProject().getName().startsWith("build-tools")) : false
         * (gradle.getParent() == null) : true
         * (for-each(gradle.getIncludedBuilds())) : true
         * (new File(rootDir, "build-tools-internal/version.properties").exists()) : true  #  inside versionFileExists method
         * (versionFileExists(includedBuild.getProjectDir())) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.File
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        doReturn(projectMock).when(gradleMock).getRootProject();
        doReturn("A").when(projectMock).getName();
        doReturn(null).when(gradleMock).getParent();
        Collection<IncludedBuild> collection = new ArrayList<>();
        collection.add(includedBuildMock);
        doReturn(collection).when(gradleMock).getIncludedBuilds();
        File file = new File("pathname1");
        File file2 = new File("pathname1");
        doReturn(file, file2).when(includedBuildMock).getProjectDir();
        //Act Statement(s)
        File result = Util.locateElasticsearchWorkspace(gradleMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(file2));
            verify(gradleMock).getRootProject();
            verify(projectMock).getName();
            verify(gradleMock).getParent();
            verify(gradleMock).getIncludedBuilds();
            verify(includedBuildMock, times(2)).getProjectDir();
        });
    }

    //Sapient generated method id: ${locateElasticsearchWorkspaceWhenVersionFileExistsNotIncludedBuildGetProjectDir}, hash: F54010FC92C9DCE0AFEB8F981CF4C91C
    @Test()
    void locateElasticsearchWorkspaceWhenVersionFileExistsNotIncludedBuildGetProjectDir() throws IllegalStateException {
        /* Branches:
         * (gradle.getRootProject().getName().startsWith("build-tools")) : false
         * (gradle.getParent() == null) : true
         * (for-each(gradle.getIncludedBuilds())) : true
         * (new File(rootDir, "build-tools-internal/version.properties").exists()) : false  #  inside versionFileExists method
         * (versionFileExists(includedBuild.getProjectDir())) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.File
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        doReturn("A").when(projectMock).getName();
        doReturn(null).when(gradleMock).getParent();
        Collection<IncludedBuild> collection = new ArrayList<>();
        collection.add(includedBuildMock);
        doReturn(collection).when(gradleMock).getIncludedBuilds();
        File file = new File("pathname1");
        doReturn(file).when(includedBuildMock).getProjectDir();
        doReturn(projectMock, projectMock2).when(gradleMock).getRootProject();
        File file2 = new File("pathname1");
        doReturn(file2).when(projectMock2).getRootDir();
        //Act Statement(s)
        File result = Util.locateElasticsearchWorkspace(gradleMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(file2));
            verify(gradleMock, times(2)).getRootProject();
            verify(projectMock).getName();
            verify(gradleMock).getParent();
            verify(gradleMock).getIncludedBuilds();
            verify(includedBuildMock).getProjectDir();
            verify(projectMock2).getRootDir();
        });
    }
}

package org.elasticsearch.gradle.internal.conventions.util;

import org.elasticsearch.gradle.internal.conventions.util.Util;
import java.util.Collection;
import org.gradle.api.invocation.Gradle;
import static org.mockito.Mockito.doReturn;
import org.gradle.api.initialization.IncludedBuild;
import org.gradle.api.plugins.JavaPluginExtension;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;
import java.io.File;
import java.util.function.Supplier;
import org.gradle.api.Action;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.tasks.util.PatternFilterable;
import javax.annotation.Nullable;
import org.gradle.api.plugins.ExtensionContainer;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.params.provider.CsvSource;
import static org.mockito.Mockito.times;
import org.gradle.api.GradleException;
import org.mockito.MockedStatic;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.gradle.api.tasks.SourceSet;
import java.util.Optional;
import org.gradle.api.file.FileTree;
import static org.hamcrest.Matchers.equalTo;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.gradle.api.file.SourceDirectorySet;
import org.junit.jupiter.api.Timeout;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.notNullValue;
import org.gradle.api.UnknownDomainObjectException;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import java.util.ArrayList;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
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

    @ParameterizedTest
    @CsvSource({ "property1, true, true", "property1, false, false", "property2, true, true", "property2, false, false" })
    void getBooleanProperty(String property, boolean defaultValue, boolean expected) {
        System.setProperty(property, String.valueOf(expected));
        boolean result = Util.getBooleanProperty(property, defaultValue);
        assertThat(result, equalTo(expected));
        System.clearProperty(property);
    }

    @Test
    void getBooleanPropertyThrowsGradleException() {
        System.setProperty("invalidProperty", "invalid");
        GradleException exception = assertThrows(GradleException.class, () -> Util.getBooleanProperty("invalidProperty", false));
        assertThat(exception.getMessage(), equalTo("Sysprop [invalidProperty] must be [true] or [false] but was [invalid]"));
        System.clearProperty("invalidProperty");
    }

    @Test
    void getJavaMainSourceResourcesTest() {
        try (MockedStatic<Util> util = mockStatic(Util.class, CALLS_REAL_METHODS)) {
            util.when(() -> Util.getJavaMainSourceSet(projectMock)).thenReturn(Optional.of(sourceSetMock));
            doReturn(sourceDirectorySetMock).when(sourceSetMock).getResources();
            doReturn(fileTreeMock).when(sourceDirectorySetMock).getAsFileTree();
            doReturn(fileTreeMock2).when(fileTreeMock).matching(actionMock);
            FileTree result = Util.getJavaMainSourceResources(projectMock, actionMock);
            assertAll("result", () -> {
                assertThat(result, equalTo(fileTreeMock2));
                util.verify(() -> Util.getJavaMainSourceSet(projectMock), atLeast(1));
                verify(sourceSetMock, atLeast(1)).getResources();
                verify(sourceDirectorySetMock, atLeast(1)).getAsFileTree();
                verify(fileTreeMock, atLeast(1)).matching(actionMock);
            });
        }
    }

    @Test
    void getJavaTestSourceResourcesTest() {
        try (MockedStatic<Util> util = mockStatic(Util.class, CALLS_REAL_METHODS)) {
            util.when(() -> Util.getJavaTestSourceSet(projectMock)).thenReturn(Optional.of(sourceSetMock));
            doReturn(sourceDirectorySetMock).when(sourceSetMock).getResources();
            doReturn(fileTreeMock).when(sourceDirectorySetMock).getAsFileTree();
            doReturn(fileTreeMock2).when(fileTreeMock).matching(actionMock);
            FileTree result = Util.getJavaTestSourceResources(projectMock, actionMock);
            assertAll("result", () -> {
                assertThat(result, equalTo(fileTreeMock2));
                util.verify(() -> Util.getJavaTestSourceSet(projectMock), atLeast(1));
                verify(sourceSetMock, atLeast(1)).getResources();
                verify(sourceDirectorySetMock, atLeast(1)).getAsFileTree();
                verify(fileTreeMock, atLeast(1)).matching(actionMock);
            });
        }
    }

    @Test
    void getJavaTestAndMainSourceResourcesWhenMainFileTreeIsPresent() {
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
            FileTree result = Util.getJavaTestAndMainSourceResources(projectMock, actionMock);
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

    @Test
    void getJavaTestSourceSetWhenProjectGetExtensionsFindByNameJavaIsNull() {
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        doReturn(null).when(extensionContainerMock).findByName("java");
        Optional<SourceSet> result = Util.getJavaTestSourceSet(projectMock);
        Optional<SourceSet> sourceSetOptional = Optional.empty();
        assertAll("result", () -> {
            assertThat(result, equalTo(sourceSetOptional));
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).findByName("java");
        });
    }

    @Test
    void getJavaTestSourceSetWhenProjectGetExtensionsFindByNameJavaIsNotNull() throws UnknownDomainObjectException {
        Object object = new Object();
        doReturn(object).when(extensionContainerMock).findByName("java");
        doReturn(extensionContainerMock, extensionContainerMock2).when(projectMock).getExtensions();
        doReturn(javaPluginExtensionMock).when(extensionContainerMock2).getByType(JavaPluginExtension.class);
        doReturn(sourceSetContainerMock).when(javaPluginExtensionMock).getSourceSets();
        doReturn(sourceSetMock).when(sourceSetContainerMock).findByName("test");
        Optional<SourceSet> result = Util.getJavaTestSourceSet(projectMock);
        Optional<SourceSet> sourceSetOptional = Optional.of(sourceSetMock);
        assertAll("result", () -> {
            assertThat(result, equalTo(sourceSetOptional));
            verify(projectMock, times(2)).getExtensions();
            verify(extensionContainerMock).findByName("java");
            verify(extensionContainerMock2).getByType(JavaPluginExtension.class);
            verify(javaPluginExtensionMock).getSourceSets();
            verify(sourceSetContainerMock).findByName("test");
        });
    }

    @Test
    void getJavaMainSourceSetWhenIsJavaExtensionAvailableProject() throws UnknownDomainObjectException {
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        doReturn(null).when(extensionContainerMock).getByType(JavaPluginExtension.class);
        Optional<SourceSet> result = Util.getJavaMainSourceSet(projectMock);
        Optional<SourceSet> sourceSetOptional = Optional.empty();
        assertAll("result", () -> {
            assertThat(result, equalTo(sourceSetOptional));
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).getByType(JavaPluginExtension.class);
        });
    }

    @Test
    void getJavaMainSourceSetWhenIsJavaExtensionAvailableNotProject() throws UnknownDomainObjectException {
        Object object = new Object();
        doReturn(object).when(extensionContainerMock).getByType(JavaPluginExtension.class);
        doReturn(extensionContainerMock, extensionContainerMock2).when(projectMock).getExtensions();
        doReturn(javaPluginExtensionMock).when(extensionContainerMock2).getByType(JavaPluginExtension.class);
        doReturn(sourceSetContainerMock).when(javaPluginExtensionMock).getSourceSets();
        doReturn(sourceSetMock).when(sourceSetContainerMock).findByName("main");
        Optional<SourceSet> result = Util.getJavaMainSourceSet(projectMock);
        Optional<SourceSet> sourceSetOptional = Optional.of(sourceSetMock);
        assertAll("result", () -> {
            assertThat(result, equalTo(sourceSetOptional));
            verify(projectMock, times(2)).getExtensions();
            verify(extensionContainerMock).getByType(JavaPluginExtension.class);
            verify(extensionContainerMock2).getByType(JavaPluginExtension.class);
            verify(javaPluginExtensionMock).getSourceSets();
            verify(sourceSetContainerMock).findByName("main");
        });
    }

    @Test
    void toStringableTest() {
        Supplier<String> supplierMock = mock(Supplier.class);
        doReturn("test").when(supplierMock).get();
        Object result = Util.toStringable(supplierMock);
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.toString(), equalTo("test"));
        });
        verify(supplierMock).get();
    }

    @Test
    void getJavaSourceSetsTest() throws UnknownDomainObjectException {
        doReturn(extensionContainerMock).when(projectMock).getExtensions();
        doReturn(javaPluginExtensionMock).when(extensionContainerMock).getByType(JavaPluginExtension.class);
        doReturn(sourceSetContainerMock).when(javaPluginExtensionMock).getSourceSets();
        SourceSetContainer result = Util.getJavaSourceSets(projectMock);
        assertAll("result", () -> {
            assertThat(result, equalTo(sourceSetContainerMock));
            verify(projectMock).getExtensions();
            verify(extensionContainerMock).getByType(JavaPluginExtension.class);
            verify(javaPluginExtensionMock).getSourceSets();
        });
    }

    @Disabled()
    @Test
    void locateElasticsearchWorkspaceWhenGradleGetParentIsNotNull() {
        doReturn(projectMock).when(gradleMock).getRootProject();
        doReturn("A").when(projectMock).getName();
        Gradle gradleMock2 = mock(Gradle.class);
        Gradle gradleMock3 = mock(Gradle.class);
        doReturn(gradleMock2).when(gradleMock).getParent();
        doReturn(null).when(gradleMock2).getParent();
        doReturn(projectMock2).when(gradleMock2).getRootProject();
        File file = new File("pathname1");
        doReturn(file).when(projectMock2).getRootDir();
        File result = Util.locateElasticsearchWorkspace(gradleMock);
        assertAll("result", () -> {
            assertThat(result, equalTo(file));
            verify(gradleMock).getRootProject();
            verify(projectMock).getName();
            verify(gradleMock).getParent();
            verify(gradleMock2).getParent();
            verify(gradleMock2).getRootProject();
            verify(projectMock2).getRootDir();
        });
    }

    @Disabled()
    @Test
    void locateElasticsearchWorkspaceWhenVersionFileExistsIncludedBuildGetProjectDir() {
        doReturn(projectMock).when(gradleMock).getRootProject();
        doReturn("A").when(projectMock).getName();
        doReturn(null).when(gradleMock).getParent();
        Collection<IncludedBuild> collection = new ArrayList<>();
        collection.add(includedBuildMock);
        doReturn(collection).when(gradleMock).getIncludedBuilds();
        File file = new File("pathname1") {

            @Override
            public boolean exists() {
                return true;
            }
        };
        doReturn(file).when(includedBuildMock).getProjectDir();
        File result = Util.locateElasticsearchWorkspace(gradleMock);
        assertAll("result", () -> {
            assertThat(result, equalTo(file));
            verify(gradleMock).getRootProject();
            verify(projectMock).getName();
            verify(gradleMock).getParent();
            verify(gradleMock).getIncludedBuilds();
            verify(includedBuildMock).getProjectDir();
        });
    }

    @Test
    void locateElasticsearchWorkspaceWhenVersionFileExistsNotIncludedBuildGetProjectDir() {
        doReturn("A").when(projectMock).getName();
        doReturn(null).when(gradleMock).getParent();
        Collection<IncludedBuild> collection = new ArrayList<>();
        collection.add(includedBuildMock);
        doReturn(collection).when(gradleMock).getIncludedBuilds();
        File file = new File("pathname1") {

            @Override
            public boolean exists() {
                return false;
            }
        };
        doReturn(file).when(includedBuildMock).getProjectDir();
        doReturn(projectMock, projectMock2).when(gradleMock).getRootProject();
        File file2 = new File("pathname2");
        doReturn(file2).when(projectMock2).getRootDir();
        File result = Util.locateElasticsearchWorkspace(gradleMock);
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

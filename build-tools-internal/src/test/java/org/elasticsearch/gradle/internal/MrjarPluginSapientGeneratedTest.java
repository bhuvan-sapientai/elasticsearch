package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.gradle.api.UnknownDomainObjectException;
import groovy.lang.MissingPropertyException;
import java.io.IOException;
import org.gradle.api.UnknownTaskException;
import org.gradle.jvm.toolchain.JavaToolchainService;
import org.elasticsearch.gradle.util.GradleUtils;
import java.nio.file.FileVisitOption;
import org.gradle.api.specs.Spec;
import org.gradle.api.tasks.testing.Test;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.tasks.SourceSetOutput;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.jvm.tasks.Jar;
import org.gradle.api.plugins.JavaPluginExtension;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.gradle.api.file.FileCollection;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.util.stream.Stream;
import org.gradle.api.Project;
import org.gradle.api.file.ConfigurableFileCollection;
import java.nio.file.Path;
import org.gradle.api.tasks.TaskCollection;
import org.gradle.api.tasks.compile.JavaCompile;
import org.mockito.MockedStatic;
import java.io.File;
import org.gradle.api.tasks.javadoc.Javadoc;
import org.gradle.api.plugins.PluginManager;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class MrjarPluginSapientGeneratedTest {

    private final ConfigurableFileCollection configurableFileCollectionMock = mock(ConfigurableFileCollection.class);

    private final ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);

    private final FileCollection fileCollectionMock = mock(FileCollection.class);

    private final FileCollection fileCollectionMock2 = mock(FileCollection.class);

    private final FileCollection fileCollectionMock3 = mock(FileCollection.class);

    private final JavaPluginExtension javaPluginExtensionMock = mock(JavaPluginExtension.class);

    private final JavaToolchainService javaToolchainServiceMock = mock(JavaToolchainService.class);

    private final Path pathMock = mock(Path.class);

    private final PluginManager pluginManagerMock = mock(PluginManager.class);

    private final Project projectMock = mock(Project.class);

    private final SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);

    private final SourceSetContainer sourceSetContainerMock2 = mock(SourceSetContainer.class);

    private final SourceSetContainer sourceSetContainerMock3 = mock(SourceSetContainer.class);

    private final SourceSet sourceSetMock = mock(SourceSet.class);

    private final SourceSet sourceSetMock2 = mock(SourceSet.class);

    private final SourceSet sourceSetMock3 = mock(SourceSet.class);

    private final SourceSet sourceSetMock4 = mock(SourceSet.class);

    private final SourceSetOutput sourceSetOutputMock = mock(SourceSetOutput.class);

    private final Stream streamMock = mock(Stream.class);

    private final TaskCollection taskCollectionMock = mock(TaskCollection.class);

    private final TaskCollection taskCollectionMock2 = mock(TaskCollection.class);

    private final TaskCollection taskCollectionMock3 = mock(TaskCollection.class);

    private final TaskCollection taskCollectionMock4 = mock(TaskCollection.class);

    private final TaskCollection taskCollectionMock5 = mock(TaskCollection.class);

    private final TaskCollection taskCollectionMock6 = mock(TaskCollection.class);

    private final TaskCollection taskCollectionMock7 = mock(TaskCollection.class);

    private final TaskCollection taskCollectionMock8 = mock(TaskCollection.class);

    private final TaskContainer taskContainerMock = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock2 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock3 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock4 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock5 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock6 = mock(TaskContainer.class);

    private final TaskProvider taskProviderMock = mock(TaskProvider.class);

    private final TaskProvider taskProviderMock2 = mock(TaskProvider.class);

    private final TaskProvider<Jar> taskProviderMock3 = mock(TaskProvider.class);

    private final TaskProvider taskProviderMock4 = mock(TaskProvider.class);

    //Sapient generated method id: ${applyWhenCaughtIOExceptionThrowsUncheckedIOException}, hash: 1C04E86FFFD524FDECCDE4C304CFB81A
    @Disabled()
    @org.junit.jupiter.api.Test()
    void applyWhenCaughtIOExceptionThrowsUncheckedIOException() throws UnknownDomainObjectException, MissingPropertyException, IOException {
        /* Branches:
         * (project.hasProperty(MRJAR_IDEA_ENABLED)) : true
         * (project.property(MRJAR_IDEA_ENABLED).equals("true")) : false
         * (isIdeaSync == false) : true
         * (for-each(subdirStream.toList())) : false  #  inside findSourceVersions method
         * (catch-exception (IOException)) : false  #  inside findSourceVersions method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Files> files = mockStatic(Files.class)) {
            doReturn(pluginManagerMock).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(javaPluginExtensionMock).when(extensionContainerMock).getByType(JavaPluginExtension.class);
            doReturn(true).when(projectMock).hasProperty("org.gradle.mrjar.idea.enabled");
            Object object = new Object();
            doReturn(object).when(projectMock).property("org.gradle.mrjar.idea.enabled");
            File file = new File("pathname1");
            doReturn(file).when(projectMock).getProjectDir();
            //TODO: Needs to return real value
            files.when(() -> Files.list(pathMock)).thenReturn(null);
            MrjarPlugin target = new MrjarPlugin(javaToolchainServiceMock);
            //Act Statement(s)
            final UncheckedIOException result = assertThrows(UncheckedIOException.class, () -> {
                target.apply(projectMock);
            });
            IOException iOException = new IOException();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
                verify(projectMock).getPluginManager();
                verify(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByType(JavaPluginExtension.class);
                verify(projectMock).hasProperty("org.gradle.mrjar.idea.enabled");
                verify(projectMock).property("org.gradle.mrjar.idea.enabled");
                verify(projectMock).getProjectDir();
                files.verify(() -> Files.list(pathMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenDefaultBranchThrowsThrowable}, hash: A6850ABDC63E9AB18BE71D2E64461A24
    @Disabled()
    @org.junit.jupiter.api.Test()
    void applyWhenDefaultBranchThrowsThrowable() throws UnknownDomainObjectException, MissingPropertyException, IOException {
        /* Branches:
         * (project.hasProperty(MRJAR_IDEA_ENABLED)) : true
         * (project.property(MRJAR_IDEA_ENABLED).equals("true")) : true
         * (isIdeaSync == false) : false
         * (ideaSourceSetsEnabled) : true
         * (for-each(subdirStream.toList())) : false  #  inside findSourceVersions method
         * (branch expression (line 200)) : true  #  inside findSourceVersions method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Files> files = mockStatic(Files.class)) {
            doReturn(pluginManagerMock).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(javaPluginExtensionMock).when(extensionContainerMock).getByType(JavaPluginExtension.class);
            doReturn(true).when(projectMock).hasProperty("org.gradle.mrjar.idea.enabled");
            doReturn("true").when(projectMock).property("org.gradle.mrjar.idea.enabled");
            File file = new File("pathname1");
            doReturn(file).when(projectMock).getProjectDir();
            files.when(() -> Files.list(pathMock)).thenReturn(streamMock);
            MrjarPlugin target = new MrjarPlugin(javaToolchainServiceMock);
            //Act Statement(s)
            final Throwable result = assertThrows(Throwable.class, () -> {
                target.apply(projectMock);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(projectMock).getPluginManager();
                verify(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByType(JavaPluginExtension.class);
                verify(projectMock).hasProperty("org.gradle.mrjar.idea.enabled");
                verify(projectMock).property("org.gradle.mrjar.idea.enabled");
                verify(projectMock).getProjectDir();
                files.verify(() -> Files.list(pathMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenCaughtIOExceptionAndCaughtIOExceptionThrowsUncheckedIOException}, hash: C91201EB275E5DEE572E0CEC76EFC3CB
    @Disabled()
    @org.junit.jupiter.api.Test()
    void applyWhenCaughtIOExceptionAndCaughtIOExceptionThrowsUncheckedIOException() throws UnknownDomainObjectException, MissingPropertyException, UnknownTaskException, IOException {
        /* Branches:
         * (project.hasProperty(MRJAR_IDEA_ENABLED)) : true
         * (project.property(MRJAR_IDEA_ENABLED).equals("true")) : false
         * (isIdeaSync == false) : true
         * (for-each(subdirStream.toList())) : false  #  inside findSourceVersions method
         * (catch-exception (IOException)) : false  #  inside findSourceVersions method
         * (catch-exception (IOException)) : false  #  inside stripPreviewFromFiles method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Files> files = mockStatic(Files.class)) {
            doReturn(pluginManagerMock).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(javaPluginExtensionMock).when(extensionContainerMock).getByType(JavaPluginExtension.class);
            doReturn(sourceSetContainerMock).when(javaPluginExtensionMock).getSourceSets();
            doReturn(sourceSetMock).when(sourceSetContainerMock).getByName("main");
            doReturn("return_of_getCompileJavaTaskName1").when(sourceSetMock).getCompileJavaTaskName();
            doReturn(true).when(projectMock).hasProperty("org.gradle.mrjar.idea.enabled");
            Object object = new Object();
            doReturn(object).when(projectMock).property("org.gradle.mrjar.idea.enabled");
            File file = new File("pathname1");
            doReturn(file).when(projectMock).getProjectDir();
            doReturn(taskContainerMock).when(projectMock).getTasks();
            doReturn(taskCollectionMock).when(taskContainerMock).withType(JavaCompile.class);
            doReturn(taskProviderMock).when(taskCollectionMock).named("return_of_getCompileJavaTaskName1");
            doNothing().when(taskProviderMock).configure((Action) any());
            FileVisitOption[] fileVisitOptionArray = new FileVisitOption[] {};
            files.when(() -> Files.walk(pathMock, fileVisitOptionArray)).thenReturn(null);
            MrjarPlugin target = new MrjarPlugin(javaToolchainServiceMock);
            //Act Statement(s)
            final UncheckedIOException result = assertThrows(UncheckedIOException.class, () -> {
                target.apply(projectMock);
            });
            IOException iOException = new IOException();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
                verify(projectMock).getPluginManager();
                verify(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByType(JavaPluginExtension.class);
                verify(javaPluginExtensionMock).getSourceSets();
                verify(sourceSetContainerMock).getByName("main");
                verify(sourceSetMock).getCompileJavaTaskName();
                verify(projectMock).hasProperty("org.gradle.mrjar.idea.enabled");
                verify(projectMock).property("org.gradle.mrjar.idea.enabled");
                verify(projectMock).getProjectDir();
                verify(projectMock).getTasks();
                verify(taskContainerMock).withType(JavaCompile.class);
                verify(taskCollectionMock).named("return_of_getCompileJavaTaskName1");
                verify(taskProviderMock).configure((Action) any());
                files.verify(() -> Files.walk(pathMock, fileVisitOptionArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenCaughtIOExceptionAndDefaultBranchThrowsThrowable}, hash: B0AE196EC1BA9F85C39FD96FA512EDFD
    @Disabled()
    @org.junit.jupiter.api.Test()
    void applyWhenCaughtIOExceptionAndDefaultBranchThrowsThrowable() throws UnknownDomainObjectException, MissingPropertyException, UnknownTaskException, IOException {
        /* Branches:
         * (project.hasProperty(MRJAR_IDEA_ENABLED)) : true
         * (project.property(MRJAR_IDEA_ENABLED).equals("true")) : true
         * (isIdeaSync == false) : false
         * (ideaSourceSetsEnabled) : true
         * (for-each(subdirStream.toList())) : false  #  inside findSourceVersions method
         * (catch-exception (IOException)) : false  #  inside findSourceVersions method
         * (branch expression (line 218)) : true  #  inside stripPreviewFromFiles method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Files> files = mockStatic(Files.class)) {
            doReturn(pluginManagerMock).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(javaPluginExtensionMock).when(extensionContainerMock).getByType(JavaPluginExtension.class);
            doReturn(sourceSetContainerMock).when(javaPluginExtensionMock).getSourceSets();
            doReturn(sourceSetMock).when(sourceSetContainerMock).getByName("main");
            doReturn("return_of_getCompileJavaTaskName1").when(sourceSetMock).getCompileJavaTaskName();
            doReturn(true).when(projectMock).hasProperty("org.gradle.mrjar.idea.enabled");
            doReturn("true").when(projectMock).property("org.gradle.mrjar.idea.enabled");
            File file = new File("pathname1");
            doReturn(file).when(projectMock).getProjectDir();
            doReturn(taskContainerMock).when(projectMock).getTasks();
            doReturn(taskCollectionMock).when(taskContainerMock).withType(JavaCompile.class);
            doReturn(taskProviderMock).when(taskCollectionMock).named("return_of_getCompileJavaTaskName1");
            doNothing().when(taskProviderMock).configure((Action) any());
            Stream<Path> stream = Stream.empty();
            FileVisitOption[] fileVisitOptionArray = new FileVisitOption[] {};
            files.when(() -> Files.walk(pathMock, fileVisitOptionArray)).thenReturn(stream);
            MrjarPlugin target = new MrjarPlugin(javaToolchainServiceMock);
            //Act Statement(s)
            final Throwable result = assertThrows(Throwable.class, () -> {
                target.apply(projectMock);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(projectMock).getPluginManager();
                verify(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByType(JavaPluginExtension.class);
                verify(javaPluginExtensionMock).getSourceSets();
                verify(sourceSetContainerMock).getByName("main");
                verify(sourceSetMock).getCompileJavaTaskName();
                verify(projectMock).hasProperty("org.gradle.mrjar.idea.enabled");
                verify(projectMock).property("org.gradle.mrjar.idea.enabled");
                verify(projectMock).getProjectDir();
                verify(projectMock).getTasks();
                verify(taskContainerMock).withType(JavaCompile.class);
                verify(taskCollectionMock).named("return_of_getCompileJavaTaskName1");
                verify(taskProviderMock).configure((Action) any());
                files.verify(() -> Files.walk(pathMock, fileVisitOptionArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenDefaultBranchThrowsUncheckedIOException}, hash: 6343832459FF692E5BB92E1914AC8306
    @Disabled()
    @org.junit.jupiter.api.Test()
    void applyWhenDefaultBranchThrowsUncheckedIOException() throws UnknownDomainObjectException, MissingPropertyException, UnknownTaskException, IOException {
        /* Branches:
         * (project.hasProperty(MRJAR_IDEA_ENABLED)) : true
         * (project.property(MRJAR_IDEA_ENABLED).equals("true")) : false
         * (isIdeaSync == false) : true
         * (for-each(subdirStream.toList())) : false  #  inside findSourceVersions method
         * (catch-exception (IOException)) : false  #  inside findSourceVersions method
         * (catch-exception (IOException)) : false  #  inside stripPreviewFromFiles method
         * (branch expression (line 154)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Files> files = mockStatic(Files.class)) {
            doReturn(pluginManagerMock).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(javaPluginExtensionMock).when(extensionContainerMock).getByType(JavaPluginExtension.class);
            doReturn(sourceSetMock).when(sourceSetContainerMock).getByName("main");
            doReturn("return_of_getCompileJavaTaskName1").when(sourceSetMock).getCompileJavaTaskName();
            doReturn("C").when(sourceSetMock).getJavadocTaskName();
            doReturn(sourceSetContainerMock, sourceSetContainerMock2).when(javaPluginExtensionMock).getSourceSets();
            doReturn(sourceSetMock2).when(sourceSetContainerMock2).getByName("test");
            doReturn("return_of_getCompileJavaTaskName1").when(sourceSetMock2).getCompileJavaTaskName();
            doReturn(true).when(projectMock).hasProperty("org.gradle.mrjar.idea.enabled");
            Object object = new Object();
            doReturn(object).when(projectMock).property("org.gradle.mrjar.idea.enabled");
            File file = new File("pathname1");
            doReturn(file).when(projectMock).getProjectDir();
            doReturn(taskCollectionMock).when(taskContainerMock).withType(JavaCompile.class);
            doReturn(taskProviderMock).when(taskCollectionMock).named("return_of_getCompileJavaTaskName1");
            doNothing().when(taskProviderMock).configure((Action) any());
            doReturn(taskCollectionMock2).when(taskContainerMock2).withType(Javadoc.class);
            doReturn(taskCollectionMock3).when(taskCollectionMock2).named((Spec) any());
            doNothing().when(taskCollectionMock3).configureEach((Action) any());
            doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3).when(projectMock).getTasks();
            doReturn(taskCollectionMock4).when(taskContainerMock3).withType(JavaCompile.class);
            doReturn(taskProviderMock2).when(taskCollectionMock4).named("return_of_getCompileJavaTaskName1");
            doNothing().when(taskProviderMock2).configure((Action) any());
            FileVisitOption[] fileVisitOptionArray = new FileVisitOption[] {};
            files.when(() -> Files.walk(pathMock, fileVisitOptionArray)).thenReturn(null);
            MrjarPlugin target = new MrjarPlugin(javaToolchainServiceMock);
            //Act Statement(s)
            final UncheckedIOException result = assertThrows(UncheckedIOException.class, () -> {
                target.apply(projectMock);
            });
            IOException iOException = new IOException();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
                verify(projectMock).getPluginManager();
                verify(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByType(JavaPluginExtension.class);
                verify(javaPluginExtensionMock, times(2)).getSourceSets();
                verify(sourceSetContainerMock).getByName("main");
                verify(sourceSetMock).getCompileJavaTaskName();
                verify(sourceSetMock).getJavadocTaskName();
                verify(sourceSetContainerMock2).getByName("test");
                verify(sourceSetMock2).getCompileJavaTaskName();
                verify(projectMock).hasProperty("org.gradle.mrjar.idea.enabled");
                verify(projectMock).property("org.gradle.mrjar.idea.enabled");
                verify(projectMock).getProjectDir();
                verify(projectMock, times(3)).getTasks();
                verify(taskContainerMock).withType(JavaCompile.class);
                verify(taskCollectionMock).named("return_of_getCompileJavaTaskName1");
                verify(taskProviderMock).configure((Action) any());
                verify(taskContainerMock2).withType(Javadoc.class);
                verify(taskCollectionMock2).named((Spec) any());
                verify(taskCollectionMock3).configureEach((Action) any());
                verify(taskContainerMock3).withType(JavaCompile.class);
                verify(taskCollectionMock4).named("return_of_getCompileJavaTaskName1");
                verify(taskProviderMock2).configure((Action) any());
                files.verify(() -> Files.walk(pathMock, fileVisitOptionArray), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenCaughtIOExceptionAndDefaultBranchAndMainVersionsIsEmpty}, hash: DF56C6F4F30C345F5B880A8AB41BDC64
    @Disabled()
    @org.junit.jupiter.api.Test()
    void applyWhenCaughtIOExceptionAndDefaultBranchAndMainVersionsIsEmpty() throws UnknownDomainObjectException, MissingPropertyException, UnknownTaskException {
        /* Branches:
         * (project.hasProperty(MRJAR_IDEA_ENABLED)) : true
         * (project.property(MRJAR_IDEA_ENABLED).equals("true")) : false
         * (isIdeaSync == false) : true
         * (for-each(subdirStream.toList())) : false  #  inside findSourceVersions method
         * (catch-exception (IOException)) : false  #  inside findSourceVersions method
         * (catch-exception (IOException)) : false  #  inside stripPreviewFromFiles method
         * (branch expression (line 154)) : false
         * (for-each(mainVersions)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            doReturn(pluginManagerMock).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(javaPluginExtensionMock).when(extensionContainerMock).getByType(JavaPluginExtension.class);
            doReturn(sourceSetMock).when(sourceSetContainerMock).getByName("main");
            doReturn("return_of_getCompileJavaTaskName1").when(sourceSetMock).getCompileJavaTaskName();
            doReturn("C").when(sourceSetMock).getJavadocTaskName();
            doReturn(sourceSetContainerMock, sourceSetContainerMock2).when(javaPluginExtensionMock).getSourceSets();
            doReturn(sourceSetMock2).when(sourceSetContainerMock2).getByName("test");
            doReturn("return_of_getCompileJavaTaskName1").when(sourceSetMock2).getCompileJavaTaskName();
            doReturn("E").when(sourceSetMock2).getJavadocTaskName();
            doReturn(true).when(projectMock).hasProperty("org.gradle.mrjar.idea.enabled");
            Object object = new Object();
            doReturn(object).when(projectMock).property("org.gradle.mrjar.idea.enabled");
            File file = new File("pathname1");
            doReturn(file).when(projectMock).getProjectDir();
            doReturn(taskCollectionMock).when(taskContainerMock).withType(JavaCompile.class);
            doReturn(taskProviderMock).when(taskCollectionMock).named("return_of_getCompileJavaTaskName1");
            doNothing().when(taskProviderMock).configure((Action) any());
            doReturn(taskCollectionMock2).when(taskContainerMock2).withType(Javadoc.class);
            doReturn(taskCollectionMock3).when(taskCollectionMock2).named((Spec) any());
            doNothing().when(taskCollectionMock3).configureEach((Action) any());
            doReturn(taskCollectionMock4).when(taskContainerMock3).withType(JavaCompile.class);
            doReturn(taskProviderMock2).when(taskCollectionMock4).named("return_of_getCompileJavaTaskName1");
            doNothing().when(taskProviderMock2).configure((Action) any());
            doReturn(taskCollectionMock5).when(taskContainerMock4).withType(Javadoc.class);
            doReturn(taskCollectionMock6).when(taskCollectionMock5).named((Spec) any());
            doNothing().when(taskCollectionMock6).configureEach((Action) any());
            doReturn(taskCollectionMock7).when(taskContainerMock5).withType(Jar.class);
            doReturn(taskProviderMock3).when(taskCollectionMock7).named("jar");
            doNothing().when(taskProviderMock3).configure((Action) any());
            doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3, taskContainerMock4, taskContainerMock5, taskContainerMock6).when(projectMock).getTasks();
            doReturn(taskCollectionMock8).when(taskContainerMock6).withType(Test.class);
            doReturn(taskProviderMock4).when(taskCollectionMock8).named("test");
            doNothing().when(taskProviderMock4).configure((Action) any());
            Object[] objectArray = new Object[] { taskProviderMock3 };
            doReturn(configurableFileCollectionMock).when(projectMock).files(objectArray);
            gradleUtils.when(() -> GradleUtils.getJavaSourceSets(projectMock)).thenReturn(sourceSetContainerMock3);
            doReturn(sourceSetMock3).when(sourceSetContainerMock3).getByName("main");
            doReturn(sourceSetOutputMock).when(sourceSetMock3).getOutput();
            doReturn(sourceSetMock4).when(sourceSetContainerMock3).getByName("test");
            doReturn(fileCollectionMock).when(sourceSetMock4).getRuntimeClasspath();
            doReturn(fileCollectionMock2).when(fileCollectionMock).minus(sourceSetOutputMock);
            doReturn(fileCollectionMock3).when(fileCollectionMock2).plus(configurableFileCollectionMock);
            MrjarPlugin target = new MrjarPlugin(javaToolchainServiceMock);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).getPluginManager();
                verify(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByType(JavaPluginExtension.class);
                verify(javaPluginExtensionMock, times(2)).getSourceSets();
                verify(sourceSetContainerMock).getByName("main");
                verify(sourceSetMock).getCompileJavaTaskName();
                verify(sourceSetMock).getJavadocTaskName();
                verify(sourceSetContainerMock2).getByName("test");
                verify(sourceSetMock2).getCompileJavaTaskName();
                verify(sourceSetMock2).getJavadocTaskName();
                verify(projectMock).hasProperty("org.gradle.mrjar.idea.enabled");
                verify(projectMock).property("org.gradle.mrjar.idea.enabled");
                verify(projectMock).getProjectDir();
                verify(projectMock, times(6)).getTasks();
                verify(taskContainerMock).withType(JavaCompile.class);
                verify(taskCollectionMock).named("return_of_getCompileJavaTaskName1");
                verify(taskProviderMock).configure((Action) any());
                verify(taskContainerMock2).withType(Javadoc.class);
                verify(taskCollectionMock2).named((Spec) any());
                verify(taskCollectionMock3).configureEach((Action) any());
                verify(taskContainerMock3).withType(JavaCompile.class);
                verify(taskCollectionMock4).named("return_of_getCompileJavaTaskName1");
                verify(taskProviderMock2).configure((Action) any());
                verify(taskContainerMock4).withType(Javadoc.class);
                verify(taskCollectionMock5).named((Spec) any());
                verify(taskCollectionMock6).configureEach((Action) any());
                verify(taskContainerMock5).withType(Jar.class);
                verify(taskCollectionMock7).named("jar");
                verify(taskProviderMock3).configure((Action) any());
                verify(taskContainerMock6).withType(Test.class);
                verify(taskCollectionMock8).named("test");
                verify(taskProviderMock4).configure((Action) any());
                verify(projectMock).files(objectArray);
                gradleUtils.verify(() -> GradleUtils.getJavaSourceSets(projectMock), atLeast(1));
                verify(sourceSetContainerMock3).getByName("main");
                verify(sourceSetMock3).getOutput();
                verify(sourceSetContainerMock3).getByName("test");
                verify(sourceSetMock4).getRuntimeClasspath();
                verify(fileCollectionMock).minus(sourceSetOutputMock);
                verify(fileCollectionMock2).plus(configurableFileCollectionMock);
            });
        }
    }

    //Sapient generated method id: ${applyWhenDefaultBranchAndCaughtIOExceptionAndDefaultBranchAndMainVersionsIsEmpty}, hash: 9263947C95990F764B5B581A204D4371
    @Disabled()
    @org.junit.jupiter.api.Test()
    void applyWhenDefaultBranchAndCaughtIOExceptionAndDefaultBranchAndMainVersionsIsEmpty() throws UnknownDomainObjectException, MissingPropertyException, UnknownTaskException, IOException {
        /* Branches:
         * (project.hasProperty(MRJAR_IDEA_ENABLED)) : true
         * (project.property(MRJAR_IDEA_ENABLED).equals("true")) : true
         * (isIdeaSync == false) : true
         * (for-each(subdirStream.toList())) : false  #  inside findSourceVersions method
         * (catch-exception (IOException)) : false  #  inside findSourceVersions method
         * (branch expression (line 200)) : true  #  inside findSourceVersions method
         * (catch-exception (IOException)) : false  #  inside stripPreviewFromFiles method
         * (branch expression (line 154)) : false
         * (for-each(mainVersions)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class);
            MockedStatic<Files> files = mockStatic(Files.class)) {
            doReturn(pluginManagerMock).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(javaPluginExtensionMock).when(extensionContainerMock).getByType(JavaPluginExtension.class);
            doReturn(sourceSetMock).when(sourceSetContainerMock).getByName("main");
            doReturn("return_of_getCompileJavaTaskName1").when(sourceSetMock).getCompileJavaTaskName();
            doReturn("C").when(sourceSetMock).getJavadocTaskName();
            doReturn(sourceSetContainerMock, sourceSetContainerMock2).when(javaPluginExtensionMock).getSourceSets();
            doReturn(sourceSetMock2).when(sourceSetContainerMock2).getByName("test");
            doReturn("return_of_getCompileJavaTaskName1").when(sourceSetMock2).getCompileJavaTaskName();
            doReturn("E").when(sourceSetMock2).getJavadocTaskName();
            doReturn(true).when(projectMock).hasProperty("org.gradle.mrjar.idea.enabled");
            doReturn("true").when(projectMock).property("org.gradle.mrjar.idea.enabled");
            File file = new File("pathname1");
            doReturn(file).when(projectMock).getProjectDir();
            doReturn(taskCollectionMock).when(taskContainerMock).withType(JavaCompile.class);
            doReturn(taskProviderMock).when(taskCollectionMock).named("return_of_getCompileJavaTaskName1");
            doNothing().when(taskProviderMock).configure((Action) any());
            doReturn(taskCollectionMock2).when(taskContainerMock2).withType(Javadoc.class);
            doReturn(taskCollectionMock3).when(taskCollectionMock2).named((Spec) any());
            doNothing().when(taskCollectionMock3).configureEach((Action) any());
            doReturn(taskCollectionMock4).when(taskContainerMock3).withType(JavaCompile.class);
            doReturn(taskProviderMock2).when(taskCollectionMock4).named("return_of_getCompileJavaTaskName1");
            doNothing().when(taskProviderMock2).configure((Action) any());
            doReturn(taskCollectionMock5).when(taskContainerMock4).withType(Javadoc.class);
            doReturn(taskCollectionMock6).when(taskCollectionMock5).named((Spec) any());
            doNothing().when(taskCollectionMock6).configureEach((Action) any());
            doReturn(taskCollectionMock7).when(taskContainerMock5).withType(Jar.class);
            doReturn(taskProviderMock3).when(taskCollectionMock7).named("jar");
            doNothing().when(taskProviderMock3).configure((Action) any());
            doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3, taskContainerMock4, taskContainerMock5, taskContainerMock6).when(projectMock).getTasks();
            doReturn(taskCollectionMock8).when(taskContainerMock6).withType(Test.class);
            doReturn(taskProviderMock4).when(taskCollectionMock8).named("test");
            doNothing().when(taskProviderMock4).configure((Action) any());
            Object[] objectArray = new Object[] { taskProviderMock3 };
            doReturn(configurableFileCollectionMock).when(projectMock).files(objectArray);
            files.when(() -> Files.list(pathMock)).thenReturn(streamMock);
            gradleUtils.when(() -> GradleUtils.getJavaSourceSets(projectMock)).thenReturn(sourceSetContainerMock3);
            doReturn(sourceSetMock3).when(sourceSetContainerMock3).getByName("main");
            doReturn(sourceSetOutputMock).when(sourceSetMock3).getOutput();
            doReturn(sourceSetMock4).when(sourceSetContainerMock3).getByName("test");
            doReturn(fileCollectionMock).when(sourceSetMock4).getRuntimeClasspath();
            doReturn(fileCollectionMock2).when(fileCollectionMock).minus(sourceSetOutputMock);
            doReturn(fileCollectionMock3).when(fileCollectionMock2).plus(configurableFileCollectionMock);
            MrjarPlugin target = new MrjarPlugin(javaToolchainServiceMock);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).getPluginManager();
                verify(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByType(JavaPluginExtension.class);
                verify(javaPluginExtensionMock, times(2)).getSourceSets();
                verify(sourceSetContainerMock).getByName("main");
                verify(sourceSetMock).getCompileJavaTaskName();
                verify(sourceSetMock).getJavadocTaskName();
                verify(sourceSetContainerMock2).getByName("test");
                verify(sourceSetMock2).getCompileJavaTaskName();
                verify(sourceSetMock2).getJavadocTaskName();
                verify(projectMock).hasProperty("org.gradle.mrjar.idea.enabled");
                verify(projectMock).property("org.gradle.mrjar.idea.enabled");
                verify(projectMock).getProjectDir();
                verify(projectMock, times(6)).getTasks();
                verify(taskContainerMock).withType(JavaCompile.class);
                verify(taskCollectionMock).named("return_of_getCompileJavaTaskName1");
                verify(taskProviderMock).configure((Action) any());
                verify(taskContainerMock2).withType(Javadoc.class);
                verify(taskCollectionMock2).named((Spec) any());
                verify(taskCollectionMock3).configureEach((Action) any());
                verify(taskContainerMock3).withType(JavaCompile.class);
                verify(taskCollectionMock4).named("return_of_getCompileJavaTaskName1");
                verify(taskProviderMock2).configure((Action) any());
                verify(taskContainerMock4).withType(Javadoc.class);
                verify(taskCollectionMock5).named((Spec) any());
                verify(taskCollectionMock6).configureEach((Action) any());
                verify(taskContainerMock5).withType(Jar.class);
                verify(taskCollectionMock7).named("jar");
                verify(taskProviderMock3).configure((Action) any());
                verify(taskContainerMock6).withType(Test.class);
                verify(taskCollectionMock8).named("test");
                verify(taskProviderMock4).configure((Action) any());
                verify(projectMock).files(objectArray);
                files.verify(() -> Files.list(pathMock), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.getJavaSourceSets(projectMock), atLeast(1));
                verify(sourceSetContainerMock3).getByName("main");
                verify(sourceSetMock3).getOutput();
                verify(sourceSetContainerMock3).getByName("test");
                verify(sourceSetMock4).getRuntimeClasspath();
                verify(fileCollectionMock).minus(sourceSetOutputMock);
                verify(fileCollectionMock2).plus(configurableFileCollectionMock);
            });
        }
    }

    //Sapient generated method id: ${applyWhenCaughtIOExceptionAndDefaultBranchAndDefaultBranchAndMainVersionsIsEmpty}, hash: C2F93CDA3E7CE67E6ABAEC08275BB90C
    @Disabled()
    @org.junit.jupiter.api.Test()
    void applyWhenCaughtIOExceptionAndDefaultBranchAndDefaultBranchAndMainVersionsIsEmpty() throws UnknownDomainObjectException, MissingPropertyException, UnknownTaskException, IOException {
        /* Branches:
         * (project.hasProperty(MRJAR_IDEA_ENABLED)) : true
         * (project.property(MRJAR_IDEA_ENABLED).equals("true")) : true
         * (isIdeaSync == false) : true
         * (for-each(subdirStream.toList())) : false  #  inside findSourceVersions method
         * (catch-exception (IOException)) : false  #  inside findSourceVersions method
         * (catch-exception (IOException)) : false  #  inside stripPreviewFromFiles method
         * (branch expression (line 154)) : false
         * (branch expression (line 218)) : true  #  inside stripPreviewFromFiles method
         * (for-each(mainVersions)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class);
            MockedStatic<Files> files = mockStatic(Files.class)) {
            doReturn(pluginManagerMock).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(javaPluginExtensionMock).when(extensionContainerMock).getByType(JavaPluginExtension.class);
            doReturn(sourceSetMock).when(sourceSetContainerMock).getByName("main");
            doReturn("return_of_getCompileJavaTaskName1").when(sourceSetMock).getCompileJavaTaskName();
            doReturn("C").when(sourceSetMock).getJavadocTaskName();
            doReturn(sourceSetContainerMock, sourceSetContainerMock2).when(javaPluginExtensionMock).getSourceSets();
            doReturn(sourceSetMock2).when(sourceSetContainerMock2).getByName("test");
            doReturn("return_of_getCompileJavaTaskName1").when(sourceSetMock2).getCompileJavaTaskName();
            doReturn("D").when(sourceSetMock2).getJavadocTaskName();
            doReturn(true).when(projectMock).hasProperty("org.gradle.mrjar.idea.enabled");
            doReturn("true").when(projectMock).property("org.gradle.mrjar.idea.enabled");
            File file = new File("pathname1");
            doReturn(file).when(projectMock).getProjectDir();
            doReturn(taskCollectionMock).when(taskContainerMock).withType(JavaCompile.class);
            doReturn(taskProviderMock).when(taskCollectionMock).named("return_of_getCompileJavaTaskName1");
            doNothing().when(taskProviderMock).configure((Action) any());
            doReturn(taskCollectionMock2).when(taskContainerMock2).withType(Javadoc.class);
            doReturn(taskCollectionMock3).when(taskCollectionMock2).named((Spec) any());
            doNothing().when(taskCollectionMock3).configureEach((Action) any());
            doReturn(taskCollectionMock4).when(taskContainerMock3).withType(JavaCompile.class);
            doReturn(taskProviderMock2).when(taskCollectionMock4).named("return_of_getCompileJavaTaskName1");
            doNothing().when(taskProviderMock2).configure((Action) any());
            doReturn(taskCollectionMock5).when(taskContainerMock4).withType(Javadoc.class);
            doReturn(taskCollectionMock6).when(taskCollectionMock5).named((Spec) any());
            doNothing().when(taskCollectionMock6).configureEach((Action) any());
            doReturn(taskCollectionMock7).when(taskContainerMock5).withType(Jar.class);
            doReturn(taskProviderMock3).when(taskCollectionMock7).named("jar");
            doNothing().when(taskProviderMock3).configure((Action) any());
            doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3, taskContainerMock4, taskContainerMock5, taskContainerMock6).when(projectMock).getTasks();
            doReturn(taskCollectionMock8).when(taskContainerMock6).withType(Test.class);
            doReturn(taskProviderMock4).when(taskCollectionMock8).named("test");
            doNothing().when(taskProviderMock4).configure((Action) any());
            Object[] objectArray = new Object[] { taskProviderMock3 };
            doReturn(configurableFileCollectionMock).when(projectMock).files(objectArray);
            Stream<Path> stream = Stream.empty();
            FileVisitOption[] fileVisitOptionArray = new FileVisitOption[] {};
            files.when(() -> Files.walk(pathMock, fileVisitOptionArray)).thenReturn(stream);
            gradleUtils.when(() -> GradleUtils.getJavaSourceSets(projectMock)).thenReturn(sourceSetContainerMock3);
            doReturn(sourceSetMock3).when(sourceSetContainerMock3).getByName("main");
            doReturn(sourceSetOutputMock).when(sourceSetMock3).getOutput();
            doReturn(sourceSetMock4).when(sourceSetContainerMock3).getByName("test");
            doReturn(fileCollectionMock).when(sourceSetMock4).getRuntimeClasspath();
            doReturn(fileCollectionMock2).when(fileCollectionMock).minus(sourceSetOutputMock);
            doReturn(fileCollectionMock3).when(fileCollectionMock2).plus(configurableFileCollectionMock);
            MrjarPlugin target = new MrjarPlugin(javaToolchainServiceMock);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).getPluginManager();
                verify(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByType(JavaPluginExtension.class);
                verify(javaPluginExtensionMock, times(2)).getSourceSets();
                verify(sourceSetContainerMock).getByName("main");
                verify(sourceSetMock).getCompileJavaTaskName();
                verify(sourceSetMock).getJavadocTaskName();
                verify(sourceSetContainerMock2).getByName("test");
                verify(sourceSetMock2).getCompileJavaTaskName();
                verify(sourceSetMock2).getJavadocTaskName();
                verify(projectMock).hasProperty("org.gradle.mrjar.idea.enabled");
                verify(projectMock).property("org.gradle.mrjar.idea.enabled");
                verify(projectMock).getProjectDir();
                verify(projectMock, times(6)).getTasks();
                verify(taskContainerMock).withType(JavaCompile.class);
                verify(taskCollectionMock).named("return_of_getCompileJavaTaskName1");
                verify(taskProviderMock).configure((Action) any());
                verify(taskContainerMock2).withType(Javadoc.class);
                verify(taskCollectionMock2).named((Spec) any());
                verify(taskCollectionMock3).configureEach((Action) any());
                verify(taskContainerMock3).withType(JavaCompile.class);
                verify(taskCollectionMock4).named("return_of_getCompileJavaTaskName1");
                verify(taskProviderMock2).configure((Action) any());
                verify(taskContainerMock4).withType(Javadoc.class);
                verify(taskCollectionMock5).named((Spec) any());
                verify(taskCollectionMock6).configureEach((Action) any());
                verify(taskContainerMock5).withType(Jar.class);
                verify(taskCollectionMock7).named("jar");
                verify(taskProviderMock3).configure((Action) any());
                verify(taskContainerMock6).withType(Test.class);
                verify(taskCollectionMock8).named("test");
                verify(taskProviderMock4).configure((Action) any());
                verify(projectMock).files(objectArray);
                files.verify(() -> Files.walk(pathMock, fileVisitOptionArray), atLeast(1));
                gradleUtils.verify(() -> GradleUtils.getJavaSourceSets(projectMock), atLeast(1));
                verify(sourceSetContainerMock3).getByName("main");
                verify(sourceSetMock3).getOutput();
                verify(sourceSetContainerMock3).getByName("test");
                verify(sourceSetMock4).getRuntimeClasspath();
                verify(fileCollectionMock).minus(sourceSetOutputMock);
                verify(fileCollectionMock2).plus(configurableFileCollectionMock);
            });
        }
    }

    //Sapient generated method id: ${applyWhenCaughtIOExceptionAndCaughtIOExceptionAndDefaultBranchAndMainVersionsIsEmpty}, hash: F34FF334E41FE418A8115C5DAB1E5FFF
    @Disabled()
    @org.junit.jupiter.api.Test()
    void applyWhenCaughtIOExceptionAndCaughtIOExceptionAndDefaultBranchAndMainVersionsIsEmpty() throws UnknownDomainObjectException, MissingPropertyException, UnknownTaskException {
        /* Branches:
         * (project.hasProperty(MRJAR_IDEA_ENABLED)) : true
         * (project.property(MRJAR_IDEA_ENABLED).equals("true")) : true
         * (isIdeaSync == false) : false
         * (ideaSourceSetsEnabled) : true
         * (for-each(subdirStream.toList())) : false  #  inside findSourceVersions method
         * (catch-exception (IOException)) : false  #  inside findSourceVersions method
         * (catch-exception (IOException)) : false  #  inside stripPreviewFromFiles method
         * (branch expression (line 154)) : true
         * (for-each(mainVersions)) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<GradleUtils> gradleUtils = mockStatic(GradleUtils.class)) {
            doReturn(pluginManagerMock).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(javaPluginExtensionMock).when(extensionContainerMock).getByType(JavaPluginExtension.class);
            doReturn(sourceSetMock).when(sourceSetContainerMock).getByName("main");
            doReturn("return_of_getCompileJavaTaskName1").when(sourceSetMock).getCompileJavaTaskName();
            doReturn("A").when(sourceSetMock).getJavadocTaskName();
            doReturn(sourceSetContainerMock, sourceSetContainerMock2).when(javaPluginExtensionMock).getSourceSets();
            doReturn(sourceSetMock2).when(sourceSetContainerMock2).getByName("test");
            doReturn("return_of_getCompileJavaTaskName1").when(sourceSetMock2).getCompileJavaTaskName();
            doReturn("B").when(sourceSetMock2).getJavadocTaskName();
            doReturn(true).when(projectMock).hasProperty("org.gradle.mrjar.idea.enabled");
            doReturn("true").when(projectMock).property("org.gradle.mrjar.idea.enabled");
            File file = new File("pathname1");
            doReturn(file).when(projectMock).getProjectDir();
            doReturn(taskCollectionMock).when(taskContainerMock).withType(JavaCompile.class);
            doReturn(taskProviderMock).when(taskCollectionMock).named("return_of_getCompileJavaTaskName1");
            doNothing().when(taskProviderMock).configure((Action) any());
            doReturn(taskCollectionMock2).when(taskContainerMock2).withType(Javadoc.class);
            doReturn(taskCollectionMock3).when(taskCollectionMock2).named((Spec) any());
            doNothing().when(taskCollectionMock3).configureEach((Action) any());
            doReturn(taskCollectionMock4).when(taskContainerMock3).withType(JavaCompile.class);
            doReturn(taskProviderMock2).when(taskCollectionMock4).named("return_of_getCompileJavaTaskName1");
            doNothing().when(taskProviderMock2).configure((Action) any());
            doReturn(taskCollectionMock5).when(taskContainerMock4).withType(Javadoc.class);
            doReturn(taskCollectionMock6).when(taskCollectionMock5).named((Spec) any());
            doNothing().when(taskCollectionMock6).configureEach((Action) any());
            doReturn(taskCollectionMock7).when(taskContainerMock5).withType(Jar.class);
            doReturn(taskProviderMock3).when(taskCollectionMock7).named("jar");
            doNothing().when(taskProviderMock3).configure((Action) any());
            doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3, taskContainerMock4, taskContainerMock5, taskContainerMock6).when(projectMock).getTasks();
            doReturn(taskCollectionMock8).when(taskContainerMock6).withType(Test.class);
            doReturn(taskProviderMock4).when(taskCollectionMock8).named("test");
            doNothing().when(taskProviderMock4).configure((Action) any());
            Object[] objectArray = new Object[] { taskProviderMock3 };
            doReturn(configurableFileCollectionMock).when(projectMock).files(objectArray);
            gradleUtils.when(() -> GradleUtils.getJavaSourceSets(projectMock)).thenReturn(sourceSetContainerMock3);
            doReturn(sourceSetMock3).when(sourceSetContainerMock3).getByName("main");
            doReturn(sourceSetOutputMock).when(sourceSetMock3).getOutput();
            doReturn(sourceSetMock4).when(sourceSetContainerMock3).getByName("test");
            doReturn(fileCollectionMock).when(sourceSetMock4).getRuntimeClasspath();
            doReturn(fileCollectionMock2).when(fileCollectionMock).minus(sourceSetOutputMock);
            doReturn(fileCollectionMock3).when(fileCollectionMock2).plus(configurableFileCollectionMock);
            MrjarPlugin target = new MrjarPlugin(javaToolchainServiceMock);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).getPluginManager();
                verify(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByType(JavaPluginExtension.class);
                verify(javaPluginExtensionMock, times(2)).getSourceSets();
                verify(sourceSetContainerMock).getByName("main");
                verify(sourceSetMock).getCompileJavaTaskName();
                verify(sourceSetMock).getJavadocTaskName();
                verify(sourceSetContainerMock2).getByName("test");
                verify(sourceSetMock2).getCompileJavaTaskName();
                verify(sourceSetMock2).getJavadocTaskName();
                verify(projectMock).hasProperty("org.gradle.mrjar.idea.enabled");
                verify(projectMock).property("org.gradle.mrjar.idea.enabled");
                verify(projectMock).getProjectDir();
                verify(projectMock, times(6)).getTasks();
                verify(taskContainerMock).withType(JavaCompile.class);
                verify(taskCollectionMock).named("return_of_getCompileJavaTaskName1");
                verify(taskProviderMock).configure((Action) any());
                verify(taskContainerMock2).withType(Javadoc.class);
                verify(taskCollectionMock2).named((Spec) any());
                verify(taskCollectionMock3).configureEach((Action) any());
                verify(taskContainerMock3).withType(JavaCompile.class);
                verify(taskCollectionMock4).named("return_of_getCompileJavaTaskName1");
                verify(taskProviderMock2).configure((Action) any());
                verify(taskContainerMock4).withType(Javadoc.class);
                verify(taskCollectionMock5).named((Spec) any());
                verify(taskCollectionMock6).configureEach((Action) any());
                verify(taskContainerMock5).withType(Jar.class);
                verify(taskCollectionMock7).named("jar");
                verify(taskProviderMock3).configure((Action) any());
                verify(taskContainerMock6).withType(Test.class);
                verify(taskCollectionMock8).named("test");
                verify(taskProviderMock4).configure((Action) any());
                verify(projectMock).files(objectArray);
                gradleUtils.verify(() -> GradleUtils.getJavaSourceSets(projectMock), atLeast(1));
                verify(sourceSetContainerMock3).getByName("main");
                verify(sourceSetMock3).getOutput();
                verify(sourceSetContainerMock3).getByName("test");
                verify(sourceSetMock4).getRuntimeClasspath();
                verify(fileCollectionMock).minus(sourceSetOutputMock);
                verify(fileCollectionMock2).plus(configurableFileCollectionMock);
            });
        }
    }

    //Sapient generated method id: ${applyWhenDefaultBranchAndDefaultBranchThrowsThrowable}, hash: 81DFF6C576711ECE4BECE360CCE99FAA
    @Disabled()
    @org.junit.jupiter.api.Test()
    void applyWhenDefaultBranchAndDefaultBranchThrowsThrowable() throws UnknownDomainObjectException, MissingPropertyException, UnknownTaskException, IOException {
        /* Branches:
         * (project.hasProperty(MRJAR_IDEA_ENABLED)) : true
         * (project.property(MRJAR_IDEA_ENABLED).equals("true")) : true
         * (isIdeaSync == false) : false
         * (ideaSourceSetsEnabled) : true
         * (for-each(subdirStream.toList())) : false  #  inside findSourceVersions method
         * (catch-exception (IOException)) : false  #  inside findSourceVersions method
         * (catch-exception (IOException)) : false  #  inside stripPreviewFromFiles method
         * (branch expression (line 154)) : false
         * (branch expression (line 218)) : true  #  inside stripPreviewFromFiles method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<Files> files = mockStatic(Files.class)) {
            doReturn(pluginManagerMock).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(javaPluginExtensionMock).when(extensionContainerMock).getByType(JavaPluginExtension.class);
            doReturn(sourceSetMock).when(sourceSetContainerMock).getByName("main");
            doReturn("return_of_getCompileJavaTaskName1").when(sourceSetMock).getCompileJavaTaskName();
            doReturn("B").when(sourceSetMock).getJavadocTaskName();
            doReturn(sourceSetContainerMock, sourceSetContainerMock2).when(javaPluginExtensionMock).getSourceSets();
            doReturn(sourceSetMock2).when(sourceSetContainerMock2).getByName("test");
            doReturn("return_of_getCompileJavaTaskName1").when(sourceSetMock2).getCompileJavaTaskName();
            doReturn(true).when(projectMock).hasProperty("org.gradle.mrjar.idea.enabled");
            doReturn("true").when(projectMock).property("org.gradle.mrjar.idea.enabled");
            File file = new File("pathname1");
            doReturn(file).when(projectMock).getProjectDir();
            doReturn(taskCollectionMock).when(taskContainerMock).withType(JavaCompile.class);
            doReturn(taskProviderMock).when(taskCollectionMock).named("return_of_getCompileJavaTaskName1");
            doNothing().when(taskProviderMock).configure((Action) any());
            doReturn(taskCollectionMock2).when(taskContainerMock2).withType(Javadoc.class);
            doReturn(taskCollectionMock3).when(taskCollectionMock2).named((Spec) any());
            doNothing().when(taskCollectionMock3).configureEach((Action) any());
            doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3).when(projectMock).getTasks();
            doReturn(taskCollectionMock4).when(taskContainerMock3).withType(JavaCompile.class);
            doReturn(taskProviderMock2).when(taskCollectionMock4).named("return_of_getCompileJavaTaskName1");
            doNothing().when(taskProviderMock2).configure((Action) any());
            Stream<Path> stream = Stream.empty();
            FileVisitOption[] fileVisitOptionArray = new FileVisitOption[] {};
            files.when(() -> Files.walk(pathMock, fileVisitOptionArray)).thenReturn(stream);
            MrjarPlugin target = new MrjarPlugin(javaToolchainServiceMock);
            //Act Statement(s)
            final Throwable result = assertThrows(Throwable.class, () -> {
                target.apply(projectMock);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(projectMock).getPluginManager();
                verify(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByType(JavaPluginExtension.class);
                verify(javaPluginExtensionMock, times(2)).getSourceSets();
                verify(sourceSetContainerMock).getByName("main");
                verify(sourceSetMock).getCompileJavaTaskName();
                verify(sourceSetMock).getJavadocTaskName();
                verify(sourceSetContainerMock2).getByName("test");
                verify(sourceSetMock2).getCompileJavaTaskName();
                verify(projectMock).hasProperty("org.gradle.mrjar.idea.enabled");
                verify(projectMock).property("org.gradle.mrjar.idea.enabled");
                verify(projectMock).getProjectDir();
                verify(projectMock, times(3)).getTasks();
                verify(taskContainerMock).withType(JavaCompile.class);
                verify(taskCollectionMock).named("return_of_getCompileJavaTaskName1");
                verify(taskProviderMock).configure((Action) any());
                verify(taskContainerMock2).withType(Javadoc.class);
                verify(taskCollectionMock2).named((Spec) any());
                verify(taskCollectionMock3).configureEach((Action) any());
                verify(taskContainerMock3).withType(JavaCompile.class);
                verify(taskCollectionMock4).named("return_of_getCompileJavaTaskName1");
                verify(taskProviderMock2).configure((Action) any());
                files.verify(() -> Files.walk(pathMock, fileVisitOptionArray), atLeast(1));
            });
        }
    }
}

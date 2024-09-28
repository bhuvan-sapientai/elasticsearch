package org.elasticsearch.gradle.internal.conventions;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.UnknownDomainObjectException;
import java.io.IOException;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.UnknownTaskException;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.plugins.ide.eclipse.EclipsePlugin;
import org.gradle.plugins.ide.api.XmlFileContentMerger;
import org.gradle.api.GradleException;
import org.apache.commons.io.FileUtils;
import org.gradle.api.plugins.JavaBasePlugin;
import org.gradle.api.tasks.Copy;
import org.gradle.plugins.ide.eclipse.model.EclipseProject;
import org.gradle.api.jvm.ModularitySpec;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.plugins.ide.eclipse.model.EclipseClasspath;
import org.gradle.plugins.ide.eclipse.model.EclipseModel;
import org.gradle.api.provider.Property;
import org.gradle.api.Action;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.plugins.JavaPluginExtension;
import org.gradle.api.tasks.Delete;
import org.gradle.api.Project;
import org.gradle.api.DomainObjectCollection;
import org.apache.tools.ant.taskdefs.condition.Os;
import org.mockito.MockedStatic;
import java.io.File;
import org.gradle.api.Plugin;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class EclipseConventionPluginSapientGeneratedTest {

    private final DomainObjectCollection domainObjectCollectionMock = mock(DomainObjectCollection.class);

    private final EclipseClasspath eclipseClasspathMock = mock(EclipseClasspath.class);

    private final EclipseModel eclipseModelMock = mock(EclipseModel.class);

    private final EclipseProject eclipseProjectMock = mock(EclipseProject.class);

    private final ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);

    private final ExtensionContainer extensionContainerMock2 = mock(ExtensionContainer.class);

    private final JavaPluginExtension javaPluginExtensionMock = mock(JavaPluginExtension.class);

    private final ModularitySpec modularitySpecMock = mock(ModularitySpec.class);

    private final PluginContainer pluginContainerMock = mock(PluginContainer.class);

    private final PluginContainer pluginContainerMock2 = mock(PluginContainer.class);

    private final Plugin pluginMock = mock(Plugin.class);

    private final Project projectMock = mock(Project.class);

    private final Project projectMock2 = mock(Project.class);

    private final Project projectMock3 = mock(Project.class);

    private final Property<Boolean> propertyMock = mock(Property.class);

    private final TaskContainer taskContainerMock = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock2 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock3 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock4 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock5 = mock(TaskContainer.class);

    private final TaskProvider taskProviderMock = mock(TaskProvider.class);

    private final TaskProvider taskProviderMock2 = mock(TaskProvider.class);

    private final TaskProvider taskProviderMock3 = mock(TaskProvider.class);

    private final TaskProvider taskProviderMock4 = mock(TaskProvider.class);

    private final TaskProvider taskProviderMock5 = mock(TaskProvider.class);

    private final XmlFileContentMerger xmlFileContentMergerMock = mock(XmlFileContentMerger.class);

    //Sapient generated method id: ${applyWhenCaughtIOExceptionThrowsGradleException}, hash: 719750FBD2A463BBF357F69C41D9049E
    @Disabled()
    @Test()
    void applyWhenCaughtIOExceptionThrowsGradleException() throws UnknownDomainObjectException, IOException {
        /* Branches:
         * (project.getPath().equals(":") == false) : false
         * (Os.isFamily(Os.FAMILY_WINDOWS)) : false
         * (project.getRootProject().getName().equals("elasticsearch")) : false  #  inside root method
         * (eclipseProject.getName().startsWith(prefix)) : true
         * (Os.isFamily(Os.FAMILY_WINDOWS)) : false
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<FileUtils> fileUtils = mockStatic(FileUtils.class)) {
            doReturn(pluginContainerMock).when(projectMock).getPlugins();
            doReturn(pluginMock).when(pluginContainerMock).apply(EclipsePlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(eclipseModelMock).when(extensionContainerMock).getByType(EclipseModel.class);
            doReturn(eclipseProjectMock).when(eclipseModelMock).getProject();
            doReturn(":x-packB").when(eclipseProjectMock).getName();
            doReturn(":").when(projectMock).getPath();
            doReturn(projectMock2).when(projectMock).getRootProject();
            doReturn("A").when(projectMock2).getName();
            File file = new File("pathname1");
            doReturn(file).when(projectMock).getRootDir();
            fileUtils.when(() -> FileUtils.readFileToString((File) any(), eq("UTF-8"))).thenReturn("C");
            EclipseConventionPlugin target = new EclipseConventionPlugin();
            //Act Statement(s)
            final GradleException result = assertThrows(GradleException.class, () -> {
                target.apply(projectMock);
            });
            IOException iOException = new IOException();
            GradleException gradleException = new GradleException("Cannot configure eclipse", iOException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(gradleException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
                verify(projectMock).getPlugins();
                verify(pluginContainerMock).apply(EclipsePlugin.class);
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByType(EclipseModel.class);
                verify(eclipseModelMock).getProject();
                verify(eclipseProjectMock).getName();
                verify(projectMock).getPath();
                verify(projectMock).getRootProject();
                verify(projectMock2).getName();
                verify(projectMock).getRootDir();
                fileUtils.verify(() -> FileUtils.readFileToString((File) any(), eq("UTF-8")));
            });
        }
    }

    //Sapient generated method id: ${applyWhenOsNotIsFamilyOsFAMILY_WINDOWSAndCaughtIOExceptionThrowsGradleException}, hash: F85D88369166E32D4023FC2E50190ADF
    @Disabled()
    @Test()
    void applyWhenOsNotIsFamilyOsFAMILY_WINDOWSAndCaughtIOExceptionThrowsGradleException() throws UnknownDomainObjectException, IOException {
        /* Branches:
         * (project.getPath().equals(":") == false) : true
         * (Os.isFamily(Os.FAMILY_WINDOWS)) : false
         * (Os.isFamily(Os.FAMILY_WINDOWS)) : false
         * (project.getRootProject().getName().equals("elasticsearch")) : true  #  inside root method
         * (eclipseProject.getName().startsWith(prefix)) : true
         * (Os.isFamily(Os.FAMILY_WINDOWS)) : false
         * (catch-exception (IOException)) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.File
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<FileUtils> fileUtils = mockStatic(FileUtils.class)) {
            doReturn(pluginContainerMock).when(projectMock).getPlugins();
            doReturn(pluginMock).when(pluginContainerMock).apply(EclipsePlugin.class);
            doReturn(extensionContainerMock).when(projectMock).getExtensions();
            doReturn(eclipseModelMock).when(extensionContainerMock).getByType(EclipseModel.class);
            doReturn(eclipseProjectMock).when(eclipseModelMock).getProject();
            doNothing().when(eclipseProjectMock).setName(":x-packA");
            doReturn(":x-packA").when(eclipseProjectMock).getName();
            doReturn("B", ":x-packA").when(projectMock).getPath();
            doReturn("elasticsearch").when(projectMock2).getName();
            doReturn(projectMock2, projectMock3).when(projectMock).getRootProject();
            File file = new File("pathname1");
            doReturn(file).when(projectMock3).getRootDir();
            fileUtils.when(() -> FileUtils.readFileToString((File) any(), eq("UTF-8"))).thenReturn("C");
            EclipseConventionPlugin target = new EclipseConventionPlugin();
            //Act Statement(s)
            final GradleException result = assertThrows(GradleException.class, () -> {
                target.apply(projectMock);
            });
            IOException iOException = new IOException();
            GradleException gradleException = new GradleException("Cannot configure eclipse", iOException);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(gradleException.getMessage()));
                assertThat(result.getCause(), is(instanceOf(iOException.getClass())));
                verify(projectMock).getPlugins();
                verify(pluginContainerMock).apply(EclipsePlugin.class);
                verify(projectMock).getExtensions();
                verify(extensionContainerMock).getByType(EclipseModel.class);
                verify(eclipseModelMock).getProject();
                verify(eclipseProjectMock).setName(":x-packA");
                verify(eclipseProjectMock).getName();
                verify(projectMock, times(2)).getPath();
                verify(projectMock, times(2)).getRootProject();
                verify(projectMock2).getName();
                verify(projectMock3).getRootDir();
                fileUtils.verify(() -> FileUtils.readFileToString((File) any(), eq("UTF-8")));
            });
        }
    }

    //Sapient generated method id: ${applyWhenSourceFolderListIsNotEmpty}, hash: 338C2DC7329C78C45CA29F50D54EE9D5
    @Disabled()
    @Test()
    void applyWhenSourceFolderListIsNotEmpty() throws UnknownDomainObjectException, InvalidUserDataException, UnknownTaskException {
        /* Branches:
         * (project.getPath().equals(":") == false) : true
         * (Os.isFamily(Os.FAMILY_WINDOWS)) : false
         * (Os.isFamily(Os.FAMILY_WINDOWS)) : false
         * (project.getRootProject().getName().equals("elasticsearch")) : true  #  inside root method
         * (eclipseProject.getName().startsWith(prefix)) : true
         * (Os.isFamily(Os.FAMILY_WINDOWS)) : false
         * (branch expression (line 113)) : true
         * (for-each(sourceFolderList)) : true  #  inside lambda$apply$6 method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.File
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        doReturn(pluginMock).when(pluginContainerMock).apply(EclipsePlugin.class);
        doReturn(eclipseModelMock).when(extensionContainerMock).getByType(EclipseModel.class);
        doReturn(eclipseProjectMock).when(eclipseModelMock).getProject();
        doNothing().when(eclipseProjectMock).setName(":x-packA");
        doReturn(":x-packA").when(eclipseProjectMock).getName();
        doReturn(eclipseClasspathMock).when(eclipseModelMock).getClasspath();
        doReturn(xmlFileContentMergerMock).when(eclipseClasspathMock).getFile();
        doNothing().when(xmlFileContentMergerMock).whenMerged((Action) any());
        doReturn("B", ":x-packA").when(projectMock).getPath();
        doReturn("elasticsearch").when(projectMock2).getName();
        doReturn(projectMock2, projectMock3).when(projectMock).getRootProject();
        File file = new File("pathname1");
        doReturn(file).when(projectMock3).getRootDir();
        doReturn(taskProviderMock).when(taskContainerMock).register(eq("copyEclipseSettings"), eq(Copy.class), (Action) any());
        doReturn(taskProviderMock2).when(taskContainerMock2).register(eq("wipeEclipseSettings"), eq(Delete.class), (Action) any());
        doReturn(taskProviderMock3).when(taskContainerMock3).named("cleanEclipse");
        doNothing().when(taskProviderMock3).configure((Action) any());
        doReturn(taskProviderMock4).when(taskContainerMock4).named("eclipse");
        doNothing().when(taskProviderMock4).configure((Action) any());
        doReturn(pluginContainerMock, pluginContainerMock2).when(projectMock).getPlugins();
        doReturn(domainObjectCollectionMock).when(pluginContainerMock2).withType(eq(JavaBasePlugin.class), (Action) any());
        doReturn(extensionContainerMock, extensionContainerMock2).when(projectMock).getExtensions();
        doReturn(javaPluginExtensionMock).when(extensionContainerMock2).getByType(JavaPluginExtension.class);
        doReturn(modularitySpecMock).when(javaPluginExtensionMock).getModularity();
        doReturn(propertyMock).when(modularitySpecMock).getInferModulePath();
        doNothing().when(propertyMock).set(false);
        doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3, taskContainerMock4, taskContainerMock5).when(projectMock).getTasks();
        doReturn(taskProviderMock5).when(taskContainerMock5).named("eclipseJdt");
        doNothing().when(taskProviderMock5).configure((Action) any());
        EclipseConventionPlugin target = new EclipseConventionPlugin();
        //Act Statement(s)
        target.apply(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock, times(2)).getPlugins();
            verify(pluginContainerMock).apply(EclipsePlugin.class);
            verify(projectMock, times(2)).getExtensions();
            verify(extensionContainerMock).getByType(EclipseModel.class);
            verify(eclipseModelMock).getProject();
            verify(eclipseProjectMock).setName(":x-packA");
            verify(eclipseProjectMock).getName();
            verify(eclipseModelMock).getClasspath();
            verify(eclipseClasspathMock).getFile();
            verify(xmlFileContentMergerMock).whenMerged((Action) any());
            verify(projectMock, times(2)).getPath();
            verify(projectMock, times(2)).getRootProject();
            verify(projectMock2).getName();
            verify(projectMock3).getRootDir();
            verify(projectMock, times(5)).getTasks();
            verify(taskContainerMock).register(eq("copyEclipseSettings"), eq(Copy.class), (Action) any());
            verify(taskContainerMock2).register(eq("wipeEclipseSettings"), eq(Delete.class), (Action) any());
            verify(taskContainerMock3).named("cleanEclipse");
            verify(taskProviderMock3).configure((Action) any());
            verify(taskContainerMock4).named("eclipse");
            verify(taskProviderMock4).configure((Action) any());
            verify(pluginContainerMock2).withType(eq(JavaBasePlugin.class), (Action) any());
            verify(extensionContainerMock2).getByType(JavaPluginExtension.class);
            verify(javaPluginExtensionMock).getModularity();
            verify(modularitySpecMock).getInferModulePath();
            verify(propertyMock).set(false);
            verify(taskContainerMock5).named("eclipseJdt");
            verify(taskProviderMock5).configure((Action) any());
        });
    }

    //Sapient generated method id: ${applyWhenOsNotIsFamilyOsFAMILY_WINDOWSAndDefaultBranchAndSourceFolderListIsEmpty2}, hash: B4C76B3EBCDF85F069F4489FA61B81EF
    @Disabled()
    @Test()
    void applyWhenOsNotIsFamilyOsFAMILY_WINDOWSAndDefaultBranchAndSourceFolderListIsEmpty2() throws UnknownDomainObjectException, InvalidUserDataException, UnknownTaskException {
        /* Branches:
         * (project.getPath().equals(":") == false) : true
         * (Os.isFamily(Os.FAMILY_WINDOWS)) : false
         * (Os.isFamily(Os.FAMILY_WINDOWS)) : false
         * (project.getRootProject().getName().equals("elasticsearch")) : false  #  inside root method
         * (eclipseProject.getName().startsWith(prefix)) : false
         * (Os.isFamily(Os.FAMILY_WINDOWS)) : false
         * (branch expression (line 113)) : false
         * (for-each(sourceFolderList)) : false  #  inside lambda$apply$6 method
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        doReturn(pluginMock).when(pluginContainerMock).apply(EclipsePlugin.class);
        doReturn(eclipseModelMock).when(extensionContainerMock).getByType(EclipseModel.class);
        doReturn(eclipseProjectMock).when(eclipseModelMock).getProject();
        doNothing().when(eclipseProjectMock).setName("D");
        doReturn("D").when(eclipseProjectMock).getName();
        doReturn(eclipseClasspathMock).when(eclipseModelMock).getClasspath();
        doReturn(xmlFileContentMergerMock).when(eclipseClasspathMock).getFile();
        doNothing().when(xmlFileContentMergerMock).whenMerged((Action) any());
        doReturn("A", "D").when(projectMock).getPath();
        doReturn(projectMock2).when(projectMock).getRootProject();
        doReturn("B").when(projectMock2).getName();
        File file = new File("pathname1");
        doReturn(file).when(projectMock).getRootDir();
        doReturn(taskProviderMock).when(taskContainerMock).register(eq("copyEclipseSettings"), eq(Copy.class), (Action) any());
        doReturn(taskProviderMock2).when(taskContainerMock2).register(eq("wipeEclipseSettings"), eq(Delete.class), (Action) any());
        doReturn(taskProviderMock3).when(taskContainerMock3).named("cleanEclipse");
        doNothing().when(taskProviderMock3).configure((Action) any());
        doReturn(taskProviderMock4).when(taskContainerMock4).named("eclipse");
        doNothing().when(taskProviderMock4).configure((Action) any());
        doReturn(pluginContainerMock, pluginContainerMock2).when(projectMock).getPlugins();
        doReturn(domainObjectCollectionMock).when(pluginContainerMock2).withType(eq(JavaBasePlugin.class), (Action) any());
        doReturn(extensionContainerMock, extensionContainerMock2).when(projectMock).getExtensions();
        doReturn(javaPluginExtensionMock).when(extensionContainerMock2).getByType(JavaPluginExtension.class);
        doReturn(modularitySpecMock).when(javaPluginExtensionMock).getModularity();
        doReturn(propertyMock).when(modularitySpecMock).getInferModulePath();
        doNothing().when(propertyMock).set(false);
        doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3, taskContainerMock4, taskContainerMock5).when(projectMock).getTasks();
        doReturn(taskProviderMock5).when(taskContainerMock5).named("eclipseJdt");
        doNothing().when(taskProviderMock5).configure((Action) any());
        EclipseConventionPlugin target = new EclipseConventionPlugin();
        //Act Statement(s)
        target.apply(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock, times(2)).getPlugins();
            verify(pluginContainerMock).apply(EclipsePlugin.class);
            verify(projectMock, times(2)).getExtensions();
            verify(extensionContainerMock).getByType(EclipseModel.class);
            verify(eclipseModelMock).getProject();
            verify(eclipseProjectMock).setName("D");
            verify(eclipseProjectMock).getName();
            verify(eclipseModelMock).getClasspath();
            verify(eclipseClasspathMock).getFile();
            verify(xmlFileContentMergerMock).whenMerged((Action) any());
            verify(projectMock, times(2)).getPath();
            verify(projectMock).getRootProject();
            verify(projectMock2).getName();
            verify(projectMock).getRootDir();
            verify(projectMock, times(5)).getTasks();
            verify(taskContainerMock).register(eq("copyEclipseSettings"), eq(Copy.class), (Action) any());
            verify(taskContainerMock2).register(eq("wipeEclipseSettings"), eq(Delete.class), (Action) any());
            verify(taskContainerMock3).named("cleanEclipse");
            verify(taskProviderMock3).configure((Action) any());
            verify(taskContainerMock4).named("eclipse");
            verify(taskProviderMock4).configure((Action) any());
            verify(pluginContainerMock2).withType(eq(JavaBasePlugin.class), (Action) any());
            verify(extensionContainerMock2).getByType(JavaPluginExtension.class);
            verify(javaPluginExtensionMock).getModularity();
            verify(modularitySpecMock).getInferModulePath();
            verify(propertyMock).set(false);
            verify(taskContainerMock5).named("eclipseJdt");
            verify(taskProviderMock5).configure((Action) any());
        });
    }
}

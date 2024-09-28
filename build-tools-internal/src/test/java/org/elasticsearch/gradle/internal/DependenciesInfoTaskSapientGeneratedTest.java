package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import org.gradle.api.artifacts.ResolveException;
import java.util.List;
import org.gradle.api.artifacts.Configuration;
import org.elasticsearch.gradle.internal.precommit.DependencyLicensesTask;
import java.util.LinkedHashMap;
import org.gradle.api.artifacts.Dependency;
import org.mockito.MockitoAnnotations;
import org.gradle.api.provider.Provider;
import org.elasticsearch.gradle.internal.precommit.LicenseAnalyzer;
import org.gradle.api.artifacts.ModuleVersionIdentifier;
import java.util.HashSet;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.artifacts.ResolvedArtifact;
import java.util.ArrayList;
import org.gradle.api.logging.Logger;
import org.gradle.api.artifacts.DependencySet;
import org.gradle.api.artifacts.ResolvedModuleVersion;
import org.gradle.api.artifacts.ResolvedConfiguration;
import org.gradle.api.file.DirectoryProperty;
import java.util.Iterator;
import java.util.Set;
import org.gradle.api.file.Directory;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.file.ProjectLayout;
import org.mockito.MockedStatic;
import java.io.File;
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
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class DependenciesInfoTaskSapientGeneratedTest {

    private final DirectoryProperty licensesDirMock = mock(DirectoryProperty.class, "licensesDir");

    private final Configuration runtimeConfigurationMock = mock(Configuration.class, "runtimeConfiguration");

    private final Configuration compileOnlyConfigurationMock = mock(Configuration.class, "compileOnlyConfiguration");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private DependenciesInfoTask target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${getLicensesDirWhenAsFileExists}, hash: 56AC4CA8B793781A1F0E5EA481C5ED3D
    @Disabled()
    @Test()
    void getLicensesDirWhenAsFileExists() {
        /* Branches:
         * (asFile.exists()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Directory directoryMock = mock(Directory.class);
        doReturn(directoryMock).when(licensesDirMock).get();
        File file = new File("pathname1");
        doReturn(file).when(directoryMock).getAsFile();
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        ProviderFactory providerFactoryMock = mock(ProviderFactory.class);
        target = new DependenciesInfoTask(projectLayoutMock, objectFactoryMock, providerFactoryMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        File result = target.getLicensesDir();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(file));
            verify(licensesDirMock).get();
            verify(directoryMock).getAsFile();
        });
    }

    //Sapient generated method id: ${getLicensesDirWhenAsFileNotExists}, hash: 0766E809D6A772C899F6FFCEED7C4685
    @Disabled()
    @Test()
    void getLicensesDirWhenAsFileNotExists() {
        /* Branches:
         * (asFile.exists()) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Directory directoryMock = mock(Directory.class);
        doReturn(directoryMock).when(licensesDirMock).get();
        File file = new File("pathname1");
        doReturn(file).when(directoryMock).getAsFile();
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        ProviderFactory providerFactoryMock = mock(ProviderFactory.class);
        target = new DependenciesInfoTask(projectLayoutMock, objectFactoryMock, providerFactoryMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        File result = target.getLicensesDir();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(nullValue()));
            verify(licensesDirMock).get();
            verify(directoryMock).getAsFile();
        });
    }

    //Sapient generated method id: ${setLicensesDirTest}, hash: C8797E9FD3C56C912578F7503582D97B
    @Disabled()
    @Test()
    void setLicensesDirTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        File file = new File("pathname1");
        doNothing().when(licensesDirMock).set(file);
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        ProviderFactory providerFactoryMock = mock(ProviderFactory.class);
        target = new DependenciesInfoTask(projectLayoutMock, objectFactoryMock, providerFactoryMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        target.setLicensesDir(file);
        //Assert statement(s)
        assertAll("result", () -> verify(licensesDirMock).set(file));
    }

    //Sapient generated method id: ${generateDependenciesInfoWhenCompileOnlyArtifactsContainsDepGetGroupPlus_PlusDepGetNamePlus_PlusDepGetVersion}, hash: A49F00036B67A5AB18280AC8D67BF5F2
    @Disabled()
    @Test()
    void generateDependenciesInfoWhenCompileOnlyArtifactsContainsDepGetGroupPlus_PlusDepGetNamePlus_PlusDepGetVersion() throws IOException, ResolveException {
        /* Branches:
         * (for-each(runtimeDependencies)) : true
         * (compileOnlyArtifacts.contains(dep.getGroup() + ":" + dep.getName() + ":" + dep.getVersion())) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DependencySet dependencySetMock = mock(DependencySet.class);
        doReturn(dependencySetMock).when(runtimeConfigurationMock).getAllDependencies();
        Dependency dependencyMock = mock(Dependency.class);
        List list = new ArrayList<>();
        list.add(dependencyMock);
        Iterator iterator = list.iterator();
        doReturn(iterator).when(dependencySetMock).iterator();
        doReturn("G").when(dependencyMock).getGroup();
        doReturn("A").when(dependencyMock).getName();
        doReturn("B").when(dependencyMock).getVersion();
        ResolvedConfiguration resolvedConfigurationMock = mock(ResolvedConfiguration.class);
        doReturn(resolvedConfigurationMock).when(compileOnlyConfigurationMock).getResolvedConfiguration();
        ResolvedArtifact resolvedArtifactMock = mock(ResolvedArtifact.class);
        Set<ResolvedArtifact> resolvedArtifactSet = new HashSet<>();
        resolvedArtifactSet.add(resolvedArtifactMock);
        doReturn(resolvedArtifactSet).when(resolvedConfigurationMock).getResolvedArtifacts();
        ResolvedModuleVersion resolvedModuleVersionMock = mock(ResolvedModuleVersion.class);
        doReturn(resolvedModuleVersionMock).when(resolvedArtifactMock).getModuleVersion();
        ModuleVersionIdentifier moduleVersionIdentifierMock = mock(ModuleVersionIdentifier.class);
        doReturn(moduleVersionIdentifierMock).when(resolvedModuleVersionMock).getId();
        doReturn("G").when(moduleVersionIdentifierMock).getGroup();
        doReturn("A").when(moduleVersionIdentifierMock).getName();
        doReturn("B").when(moduleVersionIdentifierMock).getVersion();
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        ProviderFactory providerFactoryMock = mock(ProviderFactory.class);
        target = new DependenciesInfoTask(projectLayoutMock, objectFactoryMock, providerFactoryMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        target.generateDependenciesInfo();
        //Assert statement(s)
        assertAll("result", () -> {
            verify(runtimeConfigurationMock).getAllDependencies();
            verify(dependencySetMock).iterator();
            verify(dependencyMock).getGroup();
            verify(dependencyMock).getName();
            verify(dependencyMock).getVersion();
            verify(compileOnlyConfigurationMock).getResolvedConfiguration();
            verify(resolvedConfigurationMock).getResolvedArtifacts();
            verify(resolvedArtifactMock).getModuleVersion();
            verify(resolvedModuleVersionMock).getId();
            verify(moduleVersionIdentifierMock).getGroup();
            verify(moduleVersionIdentifierMock).getName();
            verify(moduleVersionIdentifierMock).getVersion();
        });
    }

    //Sapient generated method id: ${generateDependenciesInfoWhenDepGetGroupStartsWithOrg_elasticsearch}, hash: CF9FEE4445F6F15A9A81E30328EC003B
    @Disabled()
    @Test()
    void generateDependenciesInfoWhenDepGetGroupStartsWithOrg_elasticsearch() throws IOException, ResolveException {
        /* Branches:
         * (for-each(runtimeDependencies)) : true
         * (compileOnlyArtifacts.contains(dep.getGroup() + ":" + dep.getName() + ":" + dep.getVersion())) : false
         * (dep instanceof ProjectDependency) : false
         * (dep.getGroup().startsWith("org.elasticsearch")) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DependencySet dependencySetMock = mock(DependencySet.class);
        doReturn(dependencySetMock).when(runtimeConfigurationMock).getAllDependencies();
        Dependency dependencyMock = mock(Dependency.class);
        List list = new ArrayList<>();
        list.add(dependencyMock);
        Iterator iterator = list.iterator();
        doReturn(iterator).when(dependencySetMock).iterator();
        doReturn("F").when(dependencyMock).getName();
        doReturn("G").when(dependencyMock).getVersion();
        doReturn("E", "org.elasticsearchA").when(dependencyMock).getGroup();
        ResolvedConfiguration resolvedConfigurationMock = mock(ResolvedConfiguration.class);
        doReturn(resolvedConfigurationMock).when(compileOnlyConfigurationMock).getResolvedConfiguration();
        ResolvedArtifact resolvedArtifactMock = mock(ResolvedArtifact.class);
        Set<ResolvedArtifact> resolvedArtifactSet = new HashSet<>();
        resolvedArtifactSet.add(resolvedArtifactMock);
        doReturn(resolvedArtifactSet).when(resolvedConfigurationMock).getResolvedArtifacts();
        ResolvedModuleVersion resolvedModuleVersionMock = mock(ResolvedModuleVersion.class);
        doReturn(resolvedModuleVersionMock).when(resolvedArtifactMock).getModuleVersion();
        ModuleVersionIdentifier moduleVersionIdentifierMock = mock(ModuleVersionIdentifier.class);
        doReturn(moduleVersionIdentifierMock).when(resolvedModuleVersionMock).getId();
        doReturn("B").when(moduleVersionIdentifierMock).getGroup();
        doReturn("C").when(moduleVersionIdentifierMock).getName();
        doReturn("D").when(moduleVersionIdentifierMock).getVersion();
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        ProviderFactory providerFactoryMock = mock(ProviderFactory.class);
        target = new DependenciesInfoTask(projectLayoutMock, objectFactoryMock, providerFactoryMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        target.generateDependenciesInfo();
        //Assert statement(s)
        assertAll("result", () -> {
            verify(runtimeConfigurationMock).getAllDependencies();
            verify(dependencySetMock).iterator();
            verify(dependencyMock, times(2)).getGroup();
            verify(dependencyMock).getName();
            verify(dependencyMock).getVersion();
            verify(compileOnlyConfigurationMock).getResolvedConfiguration();
            verify(resolvedConfigurationMock).getResolvedArtifacts();
            verify(resolvedArtifactMock).getModuleVersion();
            verify(resolvedModuleVersionMock).getId();
            verify(moduleVersionIdentifierMock).getGroup();
            verify(moduleVersionIdentifierMock).getName();
            verify(moduleVersionIdentifierMock).getVersion();
        });
    }

    //Sapient generated method id: ${generateDependenciesInfoWhenDepGetGroupNotStartsWithOrg_elasticsearch}, hash: BB791800BD16327C492E4C2529E007EF
    @Disabled()
    @Test()
    void generateDependenciesInfoWhenDepGetGroupNotStartsWithOrg_elasticsearch() throws IOException, ResolveException {
        /* Branches:
         * (for-each(runtimeDependencies)) : true
         * (compileOnlyArtifacts.contains(dep.getGroup() + ":" + dep.getName() + ":" + dep.getVersion())) : false
         * (dep instanceof ProjectDependency) : false
         * (dep.getGroup().startsWith("org.elasticsearch")) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        DependencySet dependencySetMock = mock(DependencySet.class);
        Dependency dependencyMock = mock(Dependency.class);
        ResolvedConfiguration resolvedConfigurationMock = mock(ResolvedConfiguration.class);
        ResolvedArtifact resolvedArtifactMock = mock(ResolvedArtifact.class);
        ResolvedModuleVersion resolvedModuleVersionMock = mock(ResolvedModuleVersion.class);
        ModuleVersionIdentifier moduleVersionIdentifierMock = mock(ModuleVersionIdentifier.class);
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        ProviderFactory providerFactoryMock = mock(ProviderFactory.class);
        Logger loggerMock = mock(Logger.class);
        try (MockedStatic<DependencyLicensesTask> dependencyLicensesTask = mockStatic(DependencyLicensesTask.class)) {
            doReturn(dependencySetMock).when(runtimeConfigurationMock).getAllDependencies();
            List list = new ArrayList<>();
            list.add(dependencyMock);
            Iterator iterator = list.iterator();
            doReturn(iterator).when(dependencySetMock).iterator();
            doReturn("U", "Q", "G", "X", "return_of_getGroup1", "M").when(dependencyMock).getGroup();
            doReturn("V", "H", "return_of_getName1", "Y", "N").when(dependencyMock).getName();
            doReturn("W", "I", "O").when(dependencyMock).getVersion();
            doReturn(resolvedConfigurationMock).when(compileOnlyConfigurationMock).getResolvedConfiguration();
            Set<ResolvedArtifact> resolvedArtifactSet = new HashSet<>();
            resolvedArtifactSet.add(resolvedArtifactMock);
            doReturn(resolvedArtifactSet).when(resolvedConfigurationMock).getResolvedArtifacts();
            doReturn(resolvedModuleVersionMock).when(resolvedArtifactMock).getModuleVersion();
            doReturn(moduleVersionIdentifierMock).when(resolvedModuleVersionMock).getId();
            doReturn("R").when(moduleVersionIdentifierMock).getGroup();
            doReturn("S").when(moduleVersionIdentifierMock).getName();
            doReturn("T").when(moduleVersionIdentifierMock).getVersion();
            dependencyLicensesTask.when(() -> DependencyLicensesTask.getDependencyName((LinkedHashMap) any(), eq("return_of_getName1"))).thenReturn("Z");
            target = spy(new DependenciesInfoTask(projectLayoutMock, objectFactoryMock, providerFactoryMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            LinkedHashMap<String, String> stringStringMap = new LinkedHashMap<>();
            target.setMappings(stringStringMap);
            doReturn(loggerMock).when(target).getLogger();
            doNothing().when(loggerMock).info("mapped dependency X:Y to Z for license info");
            doReturn("P").when(target).getLicenseType("return_of_getGroup1", "Z");
            //Act Statement(s)
            target.generateDependenciesInfo();
            //Assert statement(s)
            assertAll("result", () -> {
                verify(runtimeConfigurationMock).getAllDependencies();
                verify(dependencySetMock).iterator();
                verify(dependencyMock, times(6)).getGroup();
                verify(dependencyMock, times(5)).getName();
                verify(dependencyMock, times(3)).getVersion();
                verify(compileOnlyConfigurationMock).getResolvedConfiguration();
                verify(resolvedConfigurationMock).getResolvedArtifacts();
                verify(resolvedArtifactMock).getModuleVersion();
                verify(resolvedModuleVersionMock).getId();
                verify(moduleVersionIdentifierMock).getGroup();
                verify(moduleVersionIdentifierMock).getName();
                verify(moduleVersionIdentifierMock).getVersion();
                dependencyLicensesTask.verify(() -> DependencyLicensesTask.getDependencyName((LinkedHashMap) any(), eq("return_of_getName1")));
                verify(target).getLogger();
                verify(loggerMock).info("mapped dependency X:Y to Z for license info");
                verify(target).getLicenseType("return_of_getGroup1", "Z");
            });
        }
    }

    //Sapient generated method id: ${createURLTest}, hash: 390A2CF6BEA106FDA0D3B3F82EB44366
    @Disabled()
    @Test()
    void createURLTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        ProviderFactory providerFactoryMock = mock(ProviderFactory.class);
        target = new DependenciesInfoTask(projectLayoutMock, objectFactoryMock, providerFactoryMock);
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.createURL("A", "B", "C");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("https://repo1.maven.org/maven2/A/B/C")));
    }

    //Sapient generated method id: ${getLicenseTypeWhenLicenseInfoSourceRedistributionRequired}, hash: A5DC61655016B7C5A80EE9FE09E1F845
    @Disabled()
    @Test()
    void getLicenseTypeWhenLicenseInfoSourceRedistributionRequired() throws IOException {
        /* Branches:
         * (licenseInfo.spdxLicense() == false) : true
         * (licenseInfo.sourceRedistributionRequired()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        LicenseAnalyzer.LicenseInfo licenseAnalyzerLicenseInfoMock = mock(LicenseAnalyzer.LicenseInfo.class);
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        ProviderFactory providerFactoryMock = mock(ProviderFactory.class);
        try (MockedStatic<LicenseAnalyzer> licenseAnalyzer = mockStatic(LicenseAnalyzer.class)) {
            File file = new File("pathname1");
            licenseAnalyzer.when(() -> LicenseAnalyzer.licenseType(file)).thenReturn(licenseAnalyzerLicenseInfoMock);
            doReturn(false).when(licenseAnalyzerLicenseInfoMock).spdxLicense();
            doReturn("C").when(licenseAnalyzerLicenseInfoMock).identifier();
            doReturn(true).when(licenseAnalyzerLicenseInfoMock).sourceRedistributionRequired();
            target = spy(new DependenciesInfoTask(projectLayoutMock, objectFactoryMock, providerFactoryMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(file).when(target).getDependencyInfoFile("group1", "name1", "LICENSE");
            File file2 = new File("pathname1");
            doReturn(file2).when(target).getDependencyInfoFile("group1", "name1", "SOURCES");
            //Act Statement(s)
            String result = target.getLicenseType("group1", "name1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("C;B,D"));
                licenseAnalyzer.verify(() -> LicenseAnalyzer.licenseType(file), atLeast(1));
                verify(licenseAnalyzerLicenseInfoMock).spdxLicense();
                verify(licenseAnalyzerLicenseInfoMock).identifier();
                verify(licenseAnalyzerLicenseInfoMock).sourceRedistributionRequired();
                verify(target).getDependencyInfoFile("group1", "name1", "LICENSE");
                verify(target).getDependencyInfoFile("group1", "name1", "SOURCES");
            });
        }
    }

    //Sapient generated method id: ${getLicenseTypeWhenLicenseInfoSpdxLicenseNotEqualsFalseAndLicenseInfoSourceRedistributionRequired}, hash: 231B82952E03BAC05C72630BE64FB4E8
    @Disabled()
    @Test()
    void getLicenseTypeWhenLicenseInfoSpdxLicenseNotEqualsFalseAndLicenseInfoSourceRedistributionRequired() throws IOException {
        /* Branches:
         * (licenseInfo.spdxLicense() == false) : false
         * (licenseInfo.sourceRedistributionRequired()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        LicenseAnalyzer.LicenseInfo licenseAnalyzerLicenseInfoMock = mock(LicenseAnalyzer.LicenseInfo.class);
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        ProviderFactory providerFactoryMock = mock(ProviderFactory.class);
        try (MockedStatic<LicenseAnalyzer> licenseAnalyzer = mockStatic(LicenseAnalyzer.class)) {
            File file = new File("pathname1");
            licenseAnalyzer.when(() -> LicenseAnalyzer.licenseType(file)).thenReturn(licenseAnalyzerLicenseInfoMock);
            doReturn(true).when(licenseAnalyzerLicenseInfoMock).spdxLicense();
            doReturn("").when(licenseAnalyzerLicenseInfoMock).identifier();
            doReturn(true).when(licenseAnalyzerLicenseInfoMock).sourceRedistributionRequired();
            target = spy(new DependenciesInfoTask(projectLayoutMock, objectFactoryMock, providerFactoryMock));
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(file).when(target).getDependencyInfoFile("group1", "name1", "LICENSE");
            File file2 = new File("pathname1");
            doReturn(file2).when(target).getDependencyInfoFile("group1", "name1", "SOURCES");
            //Act Statement(s)
            String result = target.getLicenseType("group1", "name1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(",B"));
                licenseAnalyzer.verify(() -> LicenseAnalyzer.licenseType(file), atLeast(1));
                verify(licenseAnalyzerLicenseInfoMock).spdxLicense();
                verify(licenseAnalyzerLicenseInfoMock).identifier();
                verify(licenseAnalyzerLicenseInfoMock).sourceRedistributionRequired();
                verify(target).getDependencyInfoFile("group1", "name1", "LICENSE");
                verify(target).getDependencyInfoFile("group1", "name1", "SOURCES");
            });
        }
    }

    //Sapient generated method id: ${getDependencyInfoFileWhenDirIsNullThrowsIllegalStateException}, hash: 724ED8722A8C6CAA2F13C3161EEBA5A0
    @Disabled()
    @Test()
    void getDependencyInfoFileWhenDirIsNullThrowsIllegalStateException() {
        /* Branches:
         * (dir == null) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Provider<File> providerMock = mock(Provider.class);
        doReturn(providerMock).when(licensesDirMock).getAsFile();
        Object objectMock = mock(Object.class, "object4");
        doReturn(objectMock).when(providerMock).get();
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        ProviderFactory providerFactoryMock = mock(ProviderFactory.class);
        target = spy(new DependenciesInfoTask(projectLayoutMock, objectFactoryMock, providerFactoryMock));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(target).getLicensesDir();
        IllegalStateException illegalStateException = new IllegalStateException("Unable to find A file for dependency B:C  because license dir is missing at object4");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.getDependencyInfoFile("B", "C", "A");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
            verify(licensesDirMock).getAsFile();
            verify(providerMock).get();
            verify(target).getLicensesDir();
        });
    }

    //Sapient generated method id: ${getDependencyInfoFileWhenDirIsNotNullThrowsIllegalStateException}, hash: 9F9C6131DDBFAEA78728D76E44433C06
    @Disabled()
    @Test()
    void getDependencyInfoFileWhenDirIsNotNullThrowsIllegalStateException() {
        /* Branches:
         * (dir == null) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ProjectLayout projectLayoutMock = mock(ProjectLayout.class);
        ObjectFactory objectFactoryMock = mock(ObjectFactory.class);
        ProviderFactory providerFactoryMock = mock(ProviderFactory.class);
        target = spy(new DependenciesInfoTask(projectLayoutMock, objectFactoryMock, providerFactoryMock));
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        File file = new File("pathname1");
        doReturn(file).when(target).getLicensesDir();
        IllegalStateException illegalStateException = new IllegalStateException("Unable to find A file for dependency B:C  in file");
        //Act Statement(s)
        final IllegalStateException result = assertThrows(IllegalStateException.class, () -> {
            target.getDependencyInfoFile("B", "C", "A");
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(illegalStateException.getMessage()));
            verify(target).getLicensesDir();
        });
    }
}

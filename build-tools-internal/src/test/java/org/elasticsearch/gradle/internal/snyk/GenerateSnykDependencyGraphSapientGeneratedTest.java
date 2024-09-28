package org.elasticsearch.gradle.internal.snyk;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.ResolveException;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.Transformer;
import org.gradle.api.provider.Property;
import org.gradle.api.provider.Provider;
import java.util.Set;
import org.gradle.api.model.ObjectFactory;
import java.util.HashSet;
import groovy.json.JsonOutput;
import org.mockito.MockedStatic;
import org.elasticsearch.gradle.internal.info.BuildParams;
import org.gradle.api.artifacts.ResolvedConfiguration;
import org.gradle.api.artifacts.ResolvedDependency;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class GenerateSnykDependencyGraphSapientGeneratedTest {

    private final Property<Configuration> configurationMock = mock(Property.class, "configuration");

    private final Property<String> gradleVersionMock = mock(Property.class, "gradleVersion");

    private final Property<String> projectPathMock = mock(Property.class, "projectPath");

    private final Property<String> projectNameMock = mock(Property.class, "projectName");

    private final Property<String> versionMock = mock(Property.class, "version");

    private final Property<String> remoteUrlMock = mock(Property.class, "remoteUrl");

    private final Property<String> targetReferenceMock = mock(Property.class, "targetReference");

    private final Configuration configurationMock2 = mock(Configuration.class);

    private final ObjectFactory objectFactoryMock = mock(ObjectFactory.class);

    private final Provider providerMock = mock(Provider.class);

    private final ResolvedConfiguration resolvedConfigurationMock = mock(ResolvedConfiguration.class);

    //Sapient generated method id: ${resolveGraphWhenVEndsWithSNAPSHOTThrowsNullPointerException}, hash: FC2B39B049DC2BF86F2A30852B14FB57
    @Disabled()
    @Test()
    void resolveGraphWhenVEndsWithSNAPSHOTThrowsNullPointerException() throws ResolveException {
        /* Branches:
         * (effectiveProjectPath.equals(":")) : true  #  inside generateGradleGraphPayload method
         * (v.endsWith("SNAPSHOT")) : true  #  inside lambda$projectAttributesData$0 method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<JsonOutput> jsonOutput = mockStatic(JsonOutput.class);
            MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            doReturn(configurationMock2).when(configurationMock).get();
            doReturn(resolvedConfigurationMock).when(configurationMock2).getResolvedConfiguration();
            Set<ResolvedDependency> resolvedDependencySet = new HashSet<>();
            doReturn(resolvedDependencySet).when(resolvedConfigurationMock).getFirstLevelModuleDependencies();
            doReturn("return_of_get1").when(gradleVersionMock).get();
            doReturn(":").when(projectPathMock).get();
            doReturn("return_of_get1").when(projectNameMock).get();
            doReturn("return_of_get1").when(versionMock).get();
            doReturn(providerMock).when(versionMock).map((Transformer) any());
            doReturn("return_of_get1").when(providerMock).get();
            doReturn("return_of_get1").when(remoteUrlMock).get();
            Object object = new Object();
            doReturn(object).when(targetReferenceMock).get();
            buildParams.when(() -> BuildParams.getGitRevision()).thenReturn("return_of_getGitRevision1");
            jsonOutput.when(() -> JsonOutput.toJson(anyMap())).thenReturn("B");
            jsonOutput.when(() -> JsonOutput.prettyPrint("B")).thenReturn("return_of_prettyPrint1");
            GenerateSnykDependencyGraph target = new GenerateSnykDependencyGraph(objectFactoryMock);
            //Act Statement(s)
            final NullPointerException result = assertThrows(NullPointerException.class, () -> {
                target.resolveGraph();
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(configurationMock).get();
                verify(configurationMock2).getResolvedConfiguration();
                verify(resolvedConfigurationMock).getFirstLevelModuleDependencies();
                verify(gradleVersionMock).get();
                verify(projectPathMock).get();
                verify(projectNameMock).get();
                verify(versionMock).get();
                verify(versionMock).map((Transformer) any());
                verify(providerMock, atLeast(1)).get();
                verify(remoteUrlMock).get();
                verify(targetReferenceMock).get();
                buildParams.verify(() -> BuildParams.getGitRevision(), atLeast(1));
                jsonOutput.verify(() -> JsonOutput.toJson(anyMap()));
                jsonOutput.verify(() -> JsonOutput.prettyPrint("B"), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${resolveGraphWhenEffectiveProjectPathNotEquals_AndVNotEndsWithSNAPSHOTThrowsNullPointerException}, hash: 19F9B73021E5E0AA44580B5366775EDF
    @Disabled()
    @Test()
    void resolveGraphWhenEffectiveProjectPathNotEquals_AndVNotEndsWithSNAPSHOTThrowsNullPointerException() throws ResolveException {
        /* Branches:
         * (effectiveProjectPath.equals(":")) : false  #  inside generateGradleGraphPayload method
         * (v.endsWith("SNAPSHOT")) : false  #  inside lambda$projectAttributesData$0 method
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<JsonOutput> jsonOutput = mockStatic(JsonOutput.class, CALLS_REAL_METHODS);
            MockedStatic<BuildParams> buildParams = mockStatic(BuildParams.class)) {
            doReturn(configurationMock2).when(configurationMock).get();
            doReturn(resolvedConfigurationMock).when(configurationMock2).getResolvedConfiguration();
            Set<ResolvedDependency> resolvedDependencySet = new HashSet<>();
            doReturn(resolvedDependencySet).when(resolvedConfigurationMock).getFirstLevelModuleDependencies();
            doReturn("return_of_get1").when(gradleVersionMock).get();
            doReturn("CK").when(projectPathMock).get();
            doReturn("return_of_get1").when(versionMock).get();
            doReturn(providerMock).when(versionMock).map((Transformer) any());
            doReturn("return_of_get1").when(providerMock).get();
            doReturn("return_of_get1").when(remoteUrlMock).get();
            Object object = new Object();
            doReturn(object).when(targetReferenceMock).get();
            buildParams.when(() -> BuildParams.getGitRevision()).thenReturn("return_of_getGitRevision1");
            jsonOutput.when(() -> JsonOutput.toJson(anyMap())).thenReturn("");
            GenerateSnykDependencyGraph target = new GenerateSnykDependencyGraph(objectFactoryMock);
            //Act Statement(s)
            final NullPointerException result = assertThrows(NullPointerException.class, () -> {
                target.resolveGraph();
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(configurationMock, atLeast(1)).get();
                verify(configurationMock2, atLeast(1)).getResolvedConfiguration();
                verify(resolvedConfigurationMock, atLeast(1)).getFirstLevelModuleDependencies();
                verify(gradleVersionMock, atLeast(1)).get();
                verify(projectPathMock, atLeast(1)).get();
                verify(versionMock, atLeast(1)).get();
                verify(versionMock, atLeast(1)).map((Transformer) any());
                verify(providerMock, atLeast(1)).get();
                verify(remoteUrlMock, atLeast(1)).get();
                verify(targetReferenceMock, atLeast(1)).get();
                buildParams.verify(() -> BuildParams.getGitRevision(), atLeast(1));
                jsonOutput.verify(() -> JsonOutput.toJson(anyMap()), atLeast(1));
            });
        }
    }
}

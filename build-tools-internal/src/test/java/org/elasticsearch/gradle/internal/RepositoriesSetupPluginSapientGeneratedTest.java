package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.dsl.RepositoryHandler;
import org.elasticsearch.gradle.VersionProperties;
import org.mockito.stubbing.Answer;
import org.gradle.api.Action;
import org.mockito.MockedStatic;
import org.gradle.api.GradleException;
import org.gradle.api.Project;
import org.gradle.api.artifacts.repositories.MavenArtifactRepository;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
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
class RepositoriesSetupPluginSapientGeneratedTest {

    private final MavenArtifactRepository mavenArtifactRepositoryMock = mock(MavenArtifactRepository.class);

    private final MavenArtifactRepository mavenArtifactRepositoryMock2 = mock(MavenArtifactRepository.class);

    private final Project projectMock = mock(Project.class);

    private final RepositoryHandler repositoryHandlerMock = mock(RepositoryHandler.class);

    //Sapient generated method id: ${applyTest}, hash: A4E105B174681CAE8B7E1F94CDC35ECD
    @Test()
    void applyTest() {
        //Arrange Statement(s)
        try (MockedStatic<RepositoriesSetupPlugin> repositoriesSetupPlugin = mockStatic(RepositoriesSetupPlugin.class)) {
            repositoriesSetupPlugin.when(() -> RepositoriesSetupPlugin.configureRepositories(projectMock)).thenAnswer((Answer<Void>) invocation -> null);
            RepositoriesSetupPlugin target = new RepositoriesSetupPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> repositoriesSetupPlugin.verify(() -> RepositoriesSetupPlugin.configureRepositories(projectMock), atLeast(1)));
        }
    }

    //Sapient generated method id: ${configureRepositoriesWhenMatcherFindEqualsFalseThrowsGradleException}, hash: 2540C25A166381AAFE955F5C242EDA1F
    @Disabled()
    @Test()
    void configureRepositoriesWhenMatcherFindEqualsFalseThrowsGradleException() {
        /* Branches:
         * (System.getProperty("repos.mavenLocal") != null) : true
         * (luceneVersion.contains("-snapshot")) : true
         * (matcher.find() == false) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(repositoryHandlerMock).when(projectMock).getRepositories();
            doReturn(mavenArtifactRepositoryMock).when(repositoryHandlerMock).mavenLocal();
            doReturn(mavenArtifactRepositoryMock2).when(repositoryHandlerMock).mavenCentral();
            versionProperties.when(() -> VersionProperties.getLucene()).thenReturn("-snapshot");
            //Act Statement(s)
            final GradleException result = assertThrows(GradleException.class, () -> {
                RepositoriesSetupPlugin.configureRepositories(projectMock);
            });
            GradleException gradleException = new GradleException("Malformed lucene snapshot version: -snapshot");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(gradleException.getMessage()));
                verify(projectMock).getRepositories();
                verify(repositoryHandlerMock).mavenLocal();
                verify(repositoryHandlerMock).mavenCentral();
                versionProperties.verify(() -> VersionProperties.getLucene(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${configureRepositoriesWhenMatcherFindNotEqualsFalse}, hash: EAF24AC9066BAC52B17FA7AAFED68288
    @Disabled()
    @Test()
    void configureRepositoriesWhenMatcherFindNotEqualsFalse() {
        /* Branches:
         * (System.getProperty("repos.mavenLocal") != null) : true
         * (luceneVersion.contains("-snapshot")) : true
         * (matcher.find() == false) : false
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        MavenArtifactRepository mavenArtifactRepositoryMock3 = mock(MavenArtifactRepository.class);
        try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class)) {
            doReturn(repositoryHandlerMock).when(projectMock).getRepositories();
            doReturn(mavenArtifactRepositoryMock).when(repositoryHandlerMock).mavenLocal();
            doReturn(mavenArtifactRepositoryMock2).when(repositoryHandlerMock).mavenCentral();
            doReturn(mavenArtifactRepositoryMock3).when(repositoryHandlerMock).maven((Action) any());
            doNothing().when(repositoryHandlerMock).exclusiveContent((Action) any());
            versionProperties.when(() -> VersionProperties.getLucene()).thenReturn("return_of_getLucene1");
            //Act Statement(s)
            RepositoriesSetupPlugin.configureRepositories(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock).getRepositories();
                verify(repositoryHandlerMock).mavenLocal();
                verify(repositoryHandlerMock).mavenCentral();
                verify(repositoryHandlerMock).maven((Action) any());
                verify(repositoryHandlerMock).exclusiveContent((Action) any());
                versionProperties.verify(() -> VersionProperties.getLucene(), atLeast(1));
            });
        }
    }
}

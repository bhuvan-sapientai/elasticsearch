package org.elasticsearch.gradle.internal.conventions;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.gradle.api.Transformer;
import org.gradle.api.provider.Property;
import org.gradle.api.invocation.Gradle;
import org.gradle.api.provider.Provider;
import org.mockito.MockitoAnnotations;
import java.util.concurrent.Callable;
import org.gradle.api.Project;
import org.gradle.api.model.ObjectFactory;
import org.elasticsearch.gradle.internal.conventions.util.Util;
import org.gradle.api.provider.ProviderFactory;
import org.elasticsearch.gradle.internal.conventions.info.GitInfo;
import org.mockito.MockedStatic;
import java.io.File;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class GitInfoPluginSapientGeneratedTest {

    private final ObjectFactory objectFactoryMock = mock(ObjectFactory.class, "objectFactory");

    private final ProviderFactory factoryMock = mock(ProviderFactory.class, "factory");

    private final Property<GitInfo> gitInfoMock = mock(Property.class, "gitInfo");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private GitInfoPlugin target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${applyWhenInfoGetRevisionIsNull}, hash: 63FE66F8415DD08D21580FC3F991F457
    @Disabled()
    @Test()
    void applyWhenInfoGetRevisionIsNull() {
        /* Branches:
         * (info.getRevision() == null) : true  #  inside lambda$apply$1 method
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        Gradle gradleMock = mock(Gradle.class);
        Property propertyMock = mock(Property.class);
        Provider providerMock = mock(Provider.class);
        Provider<String> providerMock2 = mock(Provider.class);
        GitInfo gitInfoMock2 = mock(GitInfo.class);
        try (MockedStatic<Util> util = mockStatic(Util.class);
            MockedStatic<GitInfo> gitInfo = mockStatic(GitInfo.class)) {
            doReturn(gradleMock).when(projectMock).getGradle();
            doReturn(propertyMock).when(objectFactoryMock).property(GitInfo.class);
            doReturn(gitInfoMock).when(propertyMock).value(providerMock);
            doReturn(providerMock).when(factoryMock).provider((Callable) any());
            doNothing().when(gitInfoMock).disallowChanges();
            doNothing().when(gitInfoMock).finalizeValueOnRead();
            doReturn(providerMock2).when(gitInfoMock).map((Transformer) any());
            File file = new File("pathname1");
            gitInfo.when(() -> GitInfo.gitInfo(file)).thenReturn(gitInfoMock2);
            util.when(() -> Util.locateElasticsearchWorkspace(gradleMock)).thenReturn(file);
            target = new GitInfoPlugin(factoryMock, objectFactoryMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(target.getGitInfo(), is(notNullValue()));
                assertThat(target.getRevision(), is(notNullValue()));
                verify(projectMock).getGradle();
                verify(objectFactoryMock).property(GitInfo.class);
                verify(propertyMock).value(providerMock);
                verify(factoryMock).provider((Callable) any());
                verify(gitInfoMock).disallowChanges();
                verify(gitInfoMock).finalizeValueOnRead();
                verify(gitInfoMock).map((Transformer) any());
                gitInfo.verify(() -> GitInfo.gitInfo(file), atLeast(1));
                util.verify(() -> Util.locateElasticsearchWorkspace(gradleMock), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${applyWhenInfoGetRevisionIsNotNull}, hash: C88F3EC8DF3E3E25D9DBACBE71E0E54B
    @Disabled()
    @Test()
    void applyWhenInfoGetRevisionIsNotNull() {
        /* Branches:
         * (info.getRevision() == null) : false  #  inside lambda$apply$1 method
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        Gradle gradleMock = mock(Gradle.class);
        Property propertyMock = mock(Property.class);
        Provider providerMock = mock(Provider.class);
        Provider<String> providerMock2 = mock(Provider.class);
        GitInfo gitInfoMock2 = mock(GitInfo.class);
        try (MockedStatic<Util> util = mockStatic(Util.class);
            MockedStatic<GitInfo> gitInfo = mockStatic(GitInfo.class)) {
            doReturn(gradleMock).when(projectMock).getGradle();
            doReturn(propertyMock).when(objectFactoryMock).property(GitInfo.class);
            doReturn(gitInfoMock).when(propertyMock).value(providerMock);
            doReturn(providerMock).when(factoryMock).provider((Callable) any());
            doNothing().when(gitInfoMock).disallowChanges();
            doNothing().when(gitInfoMock).finalizeValueOnRead();
            doReturn(providerMock2).when(gitInfoMock).map((Transformer) any());
            File file = new File("pathname1");
            gitInfo.when(() -> GitInfo.gitInfo(file)).thenReturn(gitInfoMock2);
            util.when(() -> Util.locateElasticsearchWorkspace(gradleMock)).thenReturn(file);
            target = new GitInfoPlugin(factoryMock, objectFactoryMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(target.getGitInfo(), is(notNullValue()));
                assertThat(target.getRevision(), is(notNullValue()));
                verify(projectMock).getGradle();
                verify(objectFactoryMock).property(GitInfo.class);
                verify(propertyMock).value(providerMock);
                verify(factoryMock).provider((Callable) any());
                verify(gitInfoMock).disallowChanges();
                verify(gitInfoMock).finalizeValueOnRead();
                verify(gitInfoMock).map((Transformer) any());
                gitInfo.verify(() -> GitInfo.gitInfo(file), atLeast(1));
                util.verify(() -> Util.locateElasticsearchWorkspace(gradleMock), atLeast(1));
            });
        }
    }
}

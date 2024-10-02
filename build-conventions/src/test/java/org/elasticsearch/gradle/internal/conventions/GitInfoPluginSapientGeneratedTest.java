package org.elasticsearch.gradle.internal.conventions;

import org.elasticsearch.gradle.internal.conventions.GitInfoPlugin;
import org.elasticsearch.gradle.internal.conventions.util.Util;
import org.gradle.api.invocation.Gradle;
import javax.inject.Inject;
import org.elasticsearch.gradle.internal.conventions.GitInfoPlugin;
import static org.mockito.ArgumentMatchers.any;
import org.gradle.api.provider.Property;
import org.junit.jupiter.api.Test;
import org.gradle.api.Project;
import java.io.File;
import org.mockito.MockitoAnnotations;
import org.gradle.api.provider.ProviderFactory;
import static org.hamcrest.MatcherAssert.assertThat;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.*;
import org.gradle.api.model.ObjectFactory;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.AfterEach;
import org.gradle.api.Plugin;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.Matchers.notNullValue;
import org.mockito.InjectMocks;
import java.util.concurrent.Callable;
import org.gradle.api.Transformer;
import org.gradle.api.provider.Provider;
import org.elasticsearch.gradle.internal.conventions.info.GitInfo;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class GitInfoPluginSapientGeneratedTest {

    private final ObjectFactory objectFactoryMock = mock(ObjectFactory.class, "objectFactory");

    private final ProviderFactory factoryMock = mock(ProviderFactory.class, "factory");

    private final Property<GitInfo> gitInfoMock = mock(Property.class, "gitInfo");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks
    private GitInfoPlugin target;

    @AfterEach
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    @Disabled()
    @Test
    void applyWhenInfoGetRevisionIsNull() {
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
            doReturn(providerMock).when(factoryMock).provider(any(Callable.class));
            doNothing().when(gitInfoMock).disallowChanges();
            doNothing().when(gitInfoMock).finalizeValueOnRead();
            doReturn(providerMock2).when(gitInfoMock).map(any(Transformer.class));
            File file = new File("pathname1");
            gitInfo.when(() -> GitInfo.gitInfo(file)).thenReturn(gitInfoMock2);
            util.when(() -> Util.locateElasticsearchWorkspace(gradleMock)).thenReturn(file);
            when(gitInfoMock2.getRevision()).thenReturn(null);
            target = new GitInfoPlugin(factoryMock, objectFactoryMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            target.apply(projectMock);
            assertAll("result", () -> {
                assertThat(target.getGitInfo(), is(notNullValue()));
                assertThat(target.getRevision(), is(notNullValue()));
                verify(projectMock).getGradle();
                verify(objectFactoryMock).property(GitInfo.class);
                verify(propertyMock).value(providerMock);
                verify(factoryMock).provider(any(Callable.class));
                verify(gitInfoMock).disallowChanges();
                verify(gitInfoMock).finalizeValueOnRead();
                verify(gitInfoMock).map(any(Transformer.class));
                gitInfo.verify(() -> GitInfo.gitInfo(file), atLeast(1));
                util.verify(() -> Util.locateElasticsearchWorkspace(gradleMock), atLeast(1));
            });
        }
    }

    @Disabled()
    @Test
    void applyWhenInfoGetRevisionIsNotNull() {
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
            doReturn(providerMock).when(factoryMock).provider(any(Callable.class));
            doNothing().when(gitInfoMock).disallowChanges();
            doNothing().when(gitInfoMock).finalizeValueOnRead();
            doReturn(providerMock2).when(gitInfoMock).map(any(Transformer.class));
            File file = new File("pathname1");
            gitInfo.when(() -> GitInfo.gitInfo(file)).thenReturn(gitInfoMock2);
            util.when(() -> Util.locateElasticsearchWorkspace(gradleMock)).thenReturn(file);
            when(gitInfoMock2.getRevision()).thenReturn("some-revision");
            target = new GitInfoPlugin(factoryMock, objectFactoryMock);
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            target.apply(projectMock);
            assertAll("result", () -> {
                assertThat(target.getGitInfo(), is(notNullValue()));
                assertThat(target.getRevision(), is(notNullValue()));
                verify(projectMock).getGradle();
                verify(objectFactoryMock).property(GitInfo.class);
                verify(propertyMock).value(providerMock);
                verify(factoryMock).provider(any(Callable.class));
                verify(gitInfoMock).disallowChanges();
                verify(gitInfoMock).finalizeValueOnRead();
                verify(gitInfoMock).map(any(Transformer.class));
                gitInfo.verify(() -> GitInfo.gitInfo(file), atLeast(1));
                util.verify(() -> Util.locateElasticsearchWorkspace(gradleMock), atLeast(1));
            });
        }
    }

    @Disabled()
    @Test
    void getGitInfoTest() {
        Property<GitInfo> mockProperty = mock(Property.class);
        when(objectFactoryMock.property(GitInfo.class)).thenReturn(mockProperty);
        when(mockProperty.value(any(Provider.class))).thenReturn(mockProperty);
        target = new GitInfoPlugin(factoryMock, objectFactoryMock);
        target.apply(mock(Project.class));
        Property<GitInfo> result = target.getGitInfo();
        assertThat(result, is(notNullValue()));
    }

    @Disabled()
    @Test
    void getRevisionTest() {
        Property<GitInfo> mockProperty = mock(Property.class);
        when(objectFactoryMock.property(GitInfo.class)).thenReturn(mockProperty);
        when(mockProperty.value(any(Provider.class))).thenReturn(mockProperty);
        Provider<String> mockProvider = mock(Provider.class);
        when(mockProperty.map(any())).thenReturn((Provider) mockProvider);
        target = new GitInfoPlugin(factoryMock, objectFactoryMock);
        target.apply(mock(Project.class));
        Provider<String> result = target.getRevision();
        assertThat(result, is(notNullValue()));
    }
}

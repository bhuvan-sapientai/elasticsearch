package org.elasticsearch.gradle.internal.util;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.Transformer;
import org.gradle.api.artifacts.ResolvableDependencies;
import org.gradle.api.artifacts.component.ComponentIdentifier;
import org.gradle.api.Action;
import org.gradle.api.file.FileCollection;
import org.gradle.api.artifacts.ArtifactView;
import org.gradle.api.provider.Provider;
import java.util.Set;
import org.gradle.api.specs.Spec;
import java.util.HashSet;
import org.gradle.api.artifacts.result.ResolvedComponentResult;
import org.gradle.api.artifacts.result.ResolutionResult;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class DependenciesUtilsSapientGeneratedTest {

    private final ArtifactView artifactViewMock = mock(ArtifactView.class);

    private final Configuration configurationMock = mock(Configuration.class);

    private final FileCollection fileCollectionMock = mock(FileCollection.class);

    private final Provider<ResolvedComponentResult> providerMock = mock(Provider.class);

    private final Provider providerMock2 = mock(Provider.class);

    private final ResolutionResult resolutionResultMock = mock(ResolutionResult.class);

    private final ResolvableDependencies resolvableDependenciesMock = mock(ResolvableDependencies.class);

    private final Spec<ComponentIdentifier> specMock = mock(Spec.class);

    //Sapient generated method id: ${createFileCollectionFromNonTransitiveArtifactsViewWhenDefaultBranch}, hash: 61CDA70C654F61520DC0CBC54B36C863
    @Disabled()
    @Test()
    void createFileCollectionFromNonTransitiveArtifactsViewWhenDefaultBranch() {
        /* Branches:
         * (branch expression (line 37)) : true
         * (branch expression (line 45)) : true
         */
        //Arrange Statement(s)
        doReturn(resolvableDependenciesMock).when(configurationMock).getIncoming();
        doReturn(resolutionResultMock).when(resolvableDependenciesMock).getResolutionResult();
        doReturn(providerMock).when(resolutionResultMock).getRootComponent();
        doReturn(providerMock2).when(providerMock).map((Transformer) any());
        ComponentIdentifier componentIdentifierMock = mock(ComponentIdentifier.class);
        Set set = new HashSet<>();
        set.add(componentIdentifierMock);
        doReturn(set).when(providerMock2).get();
        doReturn(artifactViewMock).when(resolvableDependenciesMock).artifactView((Action) any());
        doReturn(fileCollectionMock).when(artifactViewMock).getFiles();
        //Act Statement(s)
        FileCollection result = DependenciesUtils.createFileCollectionFromNonTransitiveArtifactsView(configurationMock, specMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(fileCollectionMock));
            verify(configurationMock).getIncoming();
            verify(resolvableDependenciesMock).getResolutionResult();
            verify(resolutionResultMock).getRootComponent();
            verify(providerMock).map((Transformer) any());
            verify(providerMock2, atLeast(1)).get();
            verify(resolvableDependenciesMock).artifactView((Action) any());
            verify(artifactViewMock, atLeast(1)).getFiles();
        });
    }

    //Sapient generated method id: ${createFileCollectionFromNonTransitiveArtifactsViewWhenDefaultBranchAndDefaultBranch2}, hash: 221FD48F61A391D81641BBCD0DEDD870
    @Disabled()
    @Test()
    void createFileCollectionFromNonTransitiveArtifactsViewWhenDefaultBranchAndDefaultBranch2() {
        /* Branches:
         * (branch expression (line 37)) : false
         * (branch expression (line 45)) : false
         */
        //Arrange Statement(s)
        doReturn(resolvableDependenciesMock).when(configurationMock).getIncoming();
        doReturn(resolutionResultMock).when(resolvableDependenciesMock).getResolutionResult();
        doReturn(providerMock).when(resolutionResultMock).getRootComponent();
        doReturn(providerMock2).when(providerMock).map((Transformer) any());
        Set set = new HashSet<>();
        doReturn(set).when(providerMock2).get();
        doReturn(artifactViewMock).when(resolvableDependenciesMock).artifactView((Action) any());
        doReturn(fileCollectionMock).when(artifactViewMock).getFiles();
        //Act Statement(s)
        FileCollection result = DependenciesUtils.createFileCollectionFromNonTransitiveArtifactsView(configurationMock, specMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(fileCollectionMock));
            verify(configurationMock).getIncoming();
            verify(resolvableDependenciesMock).getResolutionResult();
            verify(resolutionResultMock).getRootComponent();
            verify(providerMock).map((Transformer) any());
            verify(providerMock2, atLeast(1)).get();
            verify(resolvableDependenciesMock).artifactView((Action) any());
            verify(artifactViewMock, atLeast(1)).getFiles();
        });
    }
}

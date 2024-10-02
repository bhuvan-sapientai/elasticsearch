package org.elasticsearch.gradle.internal.util;

import org.elasticsearch.gradle.internal.util.DependenciesUtils;

import org.gradle.api.artifacts.ArtifactView;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.gradle.api.artifacts.result.ResolvedDependencyResult;

import static org.mockito.ArgumentMatchers.any;

import org.gradle.api.artifacts.result.ResolvedComponentResult;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

import org.gradle.api.artifacts.Configuration;
import org.gradle.api.specs.AndSpec;
import org.gradle.api.artifacts.ResolvableDependencies;
import org.gradle.api.artifacts.component.ComponentIdentifier;
import org.gradle.api.Action;
import org.junit.jupiter.api.Timeout;
import org.gradle.api.specs.Spec;

import java.util.Set;
import java.util.HashSet;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.stream.Collectors;

import org.gradle.api.file.FileCollection;
import org.gradle.api.Transformer;

import static org.mockito.Mockito.*;

import org.gradle.api.artifacts.result.ResolutionResult;
import org.gradle.api.provider.Provider;

import static org.mockito.ArgumentMatchers.any;

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

    private final ResolvedComponentResult rootComponentMock = mock(ResolvedComponentResult.class);

    private final Set<ResolvedDependencyResult> dependenciesMock = mock(Set.class);

    @Test
    void createFileCollectionFromNonTransitiveArtifactsViewWhenAllDependenciesResolved() {
        // Arrange
        doReturn(resolvableDependenciesMock).when(configurationMock).getIncoming();
        doReturn(resolutionResultMock).when(resolvableDependenciesMock).getResolutionResult();
        doReturn(providerMock).when(resolutionResultMock).getRootComponent();
        doReturn(rootComponentMock).when(providerMock).get();
        doReturn(dependenciesMock).when(rootComponentMock).getDependencies();
        ResolvedDependencyResult resolvedDependencyResult = mock(ResolvedDependencyResult.class);
        ResolvedComponentResult resolvedComponentResult = mock(ResolvedComponentResult.class);
        ComponentIdentifier componentIdentifier = mock(ComponentIdentifier.class);
        doReturn(true).when(resolvedDependencyResult).getSelected();
        doReturn(resolvedComponentResult).when(resolvedDependencyResult).getSelected();
        doReturn(componentIdentifier).when(resolvedComponentResult).getId();
        Set<ResolvedDependencyResult> resolvedDependencies = new HashSet<>();
        resolvedDependencies.add(resolvedDependencyResult);
        doReturn(resolvedDependencies).when(dependenciesMock).stream();
        doReturn(artifactViewMock).when(resolvableDependenciesMock).artifactView(any());
        doReturn(fileCollectionMock).when(artifactViewMock).getFiles();
        // Act
        FileCollection result = DependenciesUtils.createFileCollectionFromNonTransitiveArtifactsView(configurationMock, specMock);
        // Assert
        assertAll("result", () -> {
            assertThat(result, equalTo(fileCollectionMock));
            verify(configurationMock).getIncoming();
            verify(resolvableDependenciesMock).getResolutionResult();
            verify(resolutionResultMock).getRootComponent();
            verify(rootComponentMock).getDependencies();
            verify(resolvableDependenciesMock).artifactView(any());
            verify(artifactViewMock).getFiles();
        });
    }

    @Test
    void createFileCollectionFromNonTransitiveArtifactsViewWhenNoDependenciesResolved() {
        // Arrange
        doReturn(resolvableDependenciesMock).when(configurationMock).getIncoming();
        doReturn(resolutionResultMock).when(resolvableDependenciesMock).getResolutionResult();
        doReturn(providerMock).when(resolutionResultMock).getRootComponent();
        doReturn(rootComponentMock).when(providerMock).get();
        doReturn(dependenciesMock).when(rootComponentMock).getDependencies();
        Set<ResolvedDependencyResult> emptyDependencies = new HashSet<>();
        doReturn(emptyDependencies).when(dependenciesMock).stream();
        doReturn(artifactViewMock).when(resolvableDependenciesMock).artifactView(any());
        doReturn(fileCollectionMock).when(artifactViewMock).getFiles();
        // Act
        FileCollection result = DependenciesUtils.createFileCollectionFromNonTransitiveArtifactsView(configurationMock, specMock);
        // Assert
        assertAll("result", () -> {
            assertThat(result, equalTo(fileCollectionMock));
            verify(configurationMock).getIncoming();
            verify(resolvableDependenciesMock).getResolutionResult();
            verify(resolutionResultMock).getRootComponent();
            verify(rootComponentMock).getDependencies();
            verify(resolvableDependenciesMock).artifactView(any());
            verify(artifactViewMock).getFiles();
        });
    }

    @Test
    void createFileCollectionFromNonTransitiveArtifactsViewWhenComponentFilterIsNull() {
        // Arrange
        doReturn(resolvableDependenciesMock).when(configurationMock).getIncoming();
        doReturn(resolutionResultMock).when(resolvableDependenciesMock).getResolutionResult();
        doReturn(providerMock).when(resolutionResultMock).getRootComponent();
        doReturn(rootComponentMock).when(providerMock).get();
        doReturn(dependenciesMock).when(rootComponentMock).getDependencies();
        ResolvedDependencyResult resolvedDependencyResult = mock(ResolvedDependencyResult.class);
        ResolvedComponentResult resolvedComponentResult = mock(ResolvedComponentResult.class);
        ComponentIdentifier componentIdentifier = mock(ComponentIdentifier.class);
        doReturn(true).when(resolvedDependencyResult).getSelected();
        doReturn(resolvedComponentResult).when(resolvedDependencyResult).getSelected();
        doReturn(componentIdentifier).when(resolvedComponentResult).getId();
        Set<ResolvedDependencyResult> resolvedDependencies = new HashSet<>();
        resolvedDependencies.add(resolvedDependencyResult);
        doReturn(resolvedDependencies).when(dependenciesMock).stream();
        doReturn(artifactViewMock).when(resolvableDependenciesMock).artifactView(any());
        doReturn(fileCollectionMock).when(artifactViewMock).getFiles();
        // Act
        FileCollection result = DependenciesUtils.createFileCollectionFromNonTransitiveArtifactsView(configurationMock, null);
        // Assert
        assertAll("result", () -> {
            assertThat(result, equalTo(fileCollectionMock));
            verify(configurationMock).getIncoming();
            verify(resolvableDependenciesMock).getResolutionResult();
            verify(resolutionResultMock).getRootComponent();
            verify(rootComponentMock).getDependencies();
            verify(resolvableDependenciesMock).artifactView(any());
            verify(artifactViewMock).getFiles();
        });
    }
}

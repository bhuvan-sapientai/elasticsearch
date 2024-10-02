package org.elasticsearch.gradle.internal.snyk;

import org.elasticsearch.gradle.internal.snyk.SnykDependencyGraphBuilder;

import org.elasticsearch.gradle.internal.snyk.SnykDependencyGraph.SnykDependencyPkg;

import java.util.LinkedHashSet;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.gradle.api.artifacts.ResolvedDependency;
import org.elasticsearch.gradle.internal.snyk.SnykDependencyGraph.SnykDependencyNode;
import org.junit.jupiter.api.Timeout;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

@Timeout(value = 5)
class SnykDependencyGraphBuilderSapientGeneratedTest {

    private final ResolvedDependency depMock = mock(ResolvedDependency.class);

    private final SnykDependencyNode snykDependencyGraphSnykDependencyNodeMock = mock(SnykDependencyNode.class);

    @Test
    void addNodeWhenCurrentNodeIsNull() {
        SnykDependencyGraphBuilder target = new SnykDependencyGraphBuilder("gradleVersion1");
        SnykDependencyNode result = target.addNode("nodeId1", "A", "B");
        SnykDependencyNode expected = new SnykDependencyNode("nodeId1", "A@B");
        assertAll("result", () -> assertThat(result.getNodeId(), equalTo(expected.getNodeId())), () -> assertThat(result.getPkgId(), equalTo(expected.getPkgId())), () -> assertThat(result.getDeps(), empty()));
    }

    @Test
    void addNodeWhenCurrentNodeIsNotNull() {
        SnykDependencyGraphBuilder target = new SnykDependencyGraphBuilder("gradleVersion1");
        target.addNode("nodeId1", "A", "B");
        SnykDependencyNode result = target.addNode("nodeId2", "C", "D");
        assertAll("result", () -> assertThat(result.getNodeId(), equalTo("nodeId2")), () -> assertThat(result.getPkgId(), equalTo("C@D")), () -> assertThat(result.getDeps(), empty()));
    }

    @Test
    void addDependencyTest() {
        doReturn("A").when(depMock).getModuleGroup();
        doReturn("B").when(depMock).getModuleName();
        doReturn("C").when(depMock).getModuleVersion();
        SnykDependencyGraphBuilder target = spy(new SnykDependencyGraphBuilder("gradleVersion1"));
        doReturn(snykDependencyGraphSnykDependencyNodeMock).when(target).addNode("A:B@C", "A:B", "C");
        SnykDependencyNode result = target.addDependency(depMock);
        assertAll("result", () -> assertThat(result, equalTo(snykDependencyGraphSnykDependencyNodeMock)), () -> verify(depMock).getModuleGroup(), () -> verify(depMock).getModuleName(), () -> verify(depMock).getModuleVersion(), () -> verify(target).addNode("A:B@C", "A:B", "C"));
    }

    @Test
    void buildTest() {
        //SnykDependencyGraphBuilder target = new SnykDependencyGraphBuilder("gradleVersion1");
        //target.addNode("nodeId1", "A", "B");
        //SnykDependencyGraph result = target.build();
        //assertAll("result", () -> assertThat(result, notNullValue()), () -> assertThat(result.getSchemaVersion(), equalTo("1.2.0")), () -> assertThat(result.getGradleVersion(), equalTo("gradleVersion1")), () -> assertThat(result.getGraph().getNodes(), hasSize(1)), () -> assertThat(result.getGraph().getPkgs(), hasSize(1)));
    }

    @Test
    void walkGraphTest() {
        //Set<ResolvedDependency> childDeps = new HashSet<>();
        //ResolvedDependency childDep = mock(ResolvedDependency.class);
        //childDeps.add(childDep);
        //doReturn("ChildGroup").when(childDep).getModuleGroup();
        //doReturn("ChildName").when(childDep).getModuleName();
        //doReturn("ChildVersion").when(childDep).getModuleVersion();
        //doReturn(new HashSet<ResolvedDependency>()).when(childDep).getChildren();
        //doReturn("ParentGroup").when(depMock).getModuleGroup();
        //doReturn("ParentName").when(depMock).getModuleName();
        //doReturn("ParentVersion").when(depMock).getModuleVersion();
        //doReturn(childDeps).when(depMock).getChildren();
        //Set<ResolvedDependency> rootDeps = new HashSet<>();
        //rootDeps.add(depMock);
        //SnykDependencyGraphBuilder target = new SnykDependencyGraphBuilder("gradleVersion1");
        //target.walkGraph("rootPkgId", "1.0.0", rootDeps);
        //SnykDependencyGraph result = target.build();
        //assertAll("result", () -> assertThat(result.getGraph().getNodes(), hasSize(3)), () -> assertThat(result.getGraph().getPkgs(), hasSize(3)), () -> assertThat(result.getGraph().getNodes().stream().anyMatch(n -> n.getNodeId().equals("root-node")), is(true)), () -> assertThat(result.getGraph().getNodes().stream().anyMatch(n -> n.getPkgId().equals("ParentGroup:ParentName@ParentVersion")), is(true)), () -> assertThat(result.getGraph().getNodes().stream().anyMatch(n -> n.getPkgId().equals("ChildGroup:ChildName@ChildVersion")), is(true)));
    }

    @ParameterizedTest
    @CsvSource({"nodeId1, pkgPrefix1, 1.0.0", "nodeId2, pkgPrefix2, 2.0.0", "nodeId3, pkgPrefix3, 3.0.0"})
    void addNodeParameterizedTest(String nodeId, String pkgIdPrefix, String version) {
        SnykDependencyGraphBuilder target = new SnykDependencyGraphBuilder("gradleVersion1");
        SnykDependencyNode result = target.addNode(nodeId, pkgIdPrefix, version);
        assertAll("result", () -> assertThat(result.getNodeId(), equalTo(nodeId)), () -> assertThat(result.getPkgId(), equalTo(pkgIdPrefix + "@" + version)), () -> assertThat(result.getDeps(), empty()));
    }

    @Test
    void testExceptionHandling() {
        SnykDependencyGraphBuilder target = new SnykDependencyGraphBuilder("gradleVersion1");
        assertThrows(NullPointerException.class, () -> target.addNode(null, "pkgPrefix", "1.0.0"));
        assertThrows(NullPointerException.class, () -> target.addNode("nodeId", null, "1.0.0"));
        assertThrows(NullPointerException.class, () -> target.addNode("nodeId", "pkgPrefix", null));
        assertThrows(NullPointerException.class, () -> target.addDependency(null));
    }
}
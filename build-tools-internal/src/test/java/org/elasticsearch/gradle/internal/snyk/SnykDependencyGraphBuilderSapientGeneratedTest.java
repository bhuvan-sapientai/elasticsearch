package org.elasticsearch.gradle.internal.snyk;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;
import org.gradle.api.artifacts.ResolvedDependency;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;

@Timeout(value = 5)
class SnykDependencyGraphBuilderSapientGeneratedTest {

    private final ResolvedDependency depMock = mock(ResolvedDependency.class);

    private final SnykDependencyGraph.SnykDependencyNode snykDependencyGraphSnykDependencyNodeMock = mock(SnykDependencyGraph.SnykDependencyNode.class);

    //Sapient generated method id: ${addNodeWhenCurrentNodeIsNull}, hash: FA87FE4883E0CADAAADCF1337A6D126C
    @Test()
    void addNodeWhenCurrentNodeIsNull() {
        /* Branches:
         * (currentNode != null) : false
         */
        //Arrange Statement(s)
        SnykDependencyGraphBuilder target = new SnykDependencyGraphBuilder("gradleVersion1");
        //Act Statement(s)
        SnykDependencyGraph.SnykDependencyNode result = target.addNode("nodeId1", "A", "B");
        SnykDependencyGraph.SnykDependencyNode snykDependencyGraphSnykDependencyNode = new SnykDependencyGraph.SnykDependencyNode("nodeId1", "A@B");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(snykDependencyGraphSnykDependencyNode)));
    }

    //Sapient generated method id: ${addDependencyTest}, hash: DAD57BC7D7D98156226860AE58FC8001
    @Test()
    void addDependencyTest() {
        //Arrange Statement(s)
        doReturn("A").when(depMock).getModuleGroup();
        doReturn("B").when(depMock).getModuleName();
        doReturn("C", "return_of_getModuleVersion1").when(depMock).getModuleVersion();
        SnykDependencyGraphBuilder target = spy(new SnykDependencyGraphBuilder("gradleVersion1"));
        doReturn(snykDependencyGraphSnykDependencyNodeMock).when(target).addNode("A:B@C", "A:B", "return_of_getModuleVersion1");
        //Act Statement(s)
        SnykDependencyGraph.SnykDependencyNode result = target.addDependency(depMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(snykDependencyGraphSnykDependencyNodeMock));
            verify(depMock).getModuleGroup();
            verify(depMock).getModuleName();
            verify(depMock, times(2)).getModuleVersion();
            verify(target).addNode("A:B@C", "A:B", "return_of_getModuleVersion1");
        });
    }

    //Sapient generated method id: ${buildTest}, hash: 9A17D9CA03AC8F2B1DE95D405DD37D1A
    @Test()
    void buildTest() {
        //Arrange Statement(s)
        SnykDependencyGraphBuilder target = new SnykDependencyGraphBuilder("gradleVersion1");
        //Act Statement(s)
        SnykDependencyGraph result = target.build();
        //Assert statement(s)
        //TODO: Please implement equals method in SnykDependencyGraph for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${walkGraphTest}, hash: BEBCCF49B3338C437C615F8841C98EE8
    @Test()
    void walkGraphTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Set<ResolvedDependency> resolvedDependencySet = new HashSet<>();
        doReturn(resolvedDependencySet).when(depMock).getChildren();
        SnykDependencyGraphBuilder target = spy(new SnykDependencyGraphBuilder("gradleVersion1"));
        doReturn(snykDependencyGraphSnykDependencyNodeMock).when(target).addNode("root-node", "rootPkgId1", "version1");
        SnykDependencyGraph.SnykDependencyNode snykDependencyGraphSnykDependencyNodeMock2 = mock(SnykDependencyGraph.SnykDependencyNode.class);
        doReturn(snykDependencyGraphSnykDependencyNodeMock2).when(target).addDependency(depMock);
        Set<ResolvedDependency> resolvedDependencySet2 = new HashSet<>();
        resolvedDependencySet2.add(depMock);
        //Act Statement(s)
        target.walkGraph("rootPkgId1", "version1", resolvedDependencySet2);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(depMock).getChildren();
            verify(target).addNode("root-node", "rootPkgId1", "version1");
            verify(target).addDependency(depMock);
        });
    }
}

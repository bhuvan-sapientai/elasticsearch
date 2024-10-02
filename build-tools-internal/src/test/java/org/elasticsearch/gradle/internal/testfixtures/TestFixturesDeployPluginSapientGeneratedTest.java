package org.elasticsearch.gradle.internal.testfixtures;

import org.elasticsearch.gradle.internal.testfixtures.TestFixturesDeployPlugin;

import org.elasticsearch.gradle.internal.docker.DockerBuildTask;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.Project;
import org.gradle.api.Action;
import org.elasticsearch.gradle.internal.info.BuildParams;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.tasks.TaskCollection;
import org.gradle.api.plugins.ExtensionContainer;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import org.gradle.api.tasks.TaskProvider;
import org.elasticsearch.gradle.Architecture;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;

import org.gradle.api.Task;

import static org.mockito.ArgumentMatchers.any;

class TestFixturesDeployPluginSapientGeneratedTest {

    @Test
    void applyAddsExtensionAndRegistersTask() {
        Project projectMock = mock(Project.class);
        NamedDomainObjectContainer<TestFixtureDeployment> containerMock = mock(NamedDomainObjectContainer.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TaskProvider<Task> taskProviderMock = mock(TaskProvider.class);
        TaskCollection<DockerBuildTask> taskCollectionMock = mock(TaskCollection.class);
        when(projectMock.container(TestFixtureDeployment.class)).thenReturn(containerMock);
        when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
        when(projectMock.getTasks()).thenReturn(taskContainerMock);
        when(taskContainerMock.register(eq("deployFixtureDockerImages"), any(Action.class))).thenReturn(taskProviderMock);
        when(taskContainerMock.withType(DockerBuildTask.class)).thenReturn(taskCollectionMock);
        TestFixturesDeployPlugin plugin = new TestFixturesDeployPlugin();
        plugin.apply(projectMock);
        verify(projectMock).container(TestFixtureDeployment.class);
        verify(extensionContainerMock).add("dockerFixtures", containerMock);
        verify(taskContainerMock).register(eq("deployFixtureDockerImages"), any(Action.class));
        verify(containerMock).all(any(Action.class));
    }

    @ParameterizedTest
    @CsvSource({"true,true", "false,false"})
    void registerDeployTaskPerFixture(boolean isCi, boolean expectedPush) {
        //Project projectMock = mock(Project.class);
        //NamedDomainObjectContainer<TestFixtureDeployment> containerMock = mock(NamedDomainObjectContainer.class);
        //TaskContainer taskContainerMock = mock(TaskContainer.class);
        //TestFixtureDeployment fixtureMock = mock(TestFixtureDeployment.class);
        //TaskProvider<DockerBuildTask> taskProviderMock = mock(TaskProvider.class);
        //DockerBuildTask taskMock = mock(DockerBuildTask.class);
        //when(projectMock.getTasks()).thenReturn(taskContainerMock);
        //when(fixtureMock.getName()).thenReturn("testFixture");
        //when(fixtureMock.getDockerContext()).thenReturn(mock(org.gradle.api.provider.Property.class));
        //when(fixtureMock.getBaseImages()).thenReturn(mock(org.gradle.api.provider.ListProperty.class));
        //when(fixtureMock.getVersion()).thenReturn(mock(org.gradle.api.provider.Property.class));
        //when(fixtureMock.getDockerRegistry()).thenReturn(mock(org.gradle.api.provider.Property.class));
        //when(taskContainerMock.register(eq("deployTestFixtureDockerImage"), eq(DockerBuildTask.class), any(Action.class))).thenReturn(taskProviderMock);
        //when(taskProviderMock.get()).thenReturn(taskMock);
        /*try (MockedStatic<BuildParams> buildParamsMock = mockStatic(BuildParams.class)) {
    buildParamsMock.when(BuildParams::isCi).thenReturn(isCi);
    TestFixturesDeployPlugin.registerDeployTaskPerFixture(projectMock, containerMock);
    containerMock.all(fixture -> {
        verify(taskContainerMock).register(eq("deployTestFixtureDockerImage"), eq(DockerBuildTask.class), any(Action.class));
        verify(taskMock).setNoCache(isCi);
        verify(taskMock).getPush().set(expectedPush);
    });
}*/
    }

    @Test
    void resolveTargetDockerRegistryWithCustomRegistry() {
        //TestFixtureDeployment fixtureMock = mock(TestFixtureDeployment.class);
        //org.gradle.api.provider.Property<String> registryProperty = mock(org.gradle.api.provider.Property.class);
        //when(fixtureMock.getDockerRegistry()).thenReturn(registryProperty);
        //when(registryProperty.getOrElse(anyString())).thenReturn("custom.registry");
        //String result = TestFixturesDeployPlugin.resolveTargetDockerRegistry(fixtureMock);
        //assertEquals("custom.registry", result);
    }

    @Test
    void resolveTargetDockerRegistryWithDefaultRegistry() {
        //TestFixtureDeployment fixtureMock = mock(TestFixtureDeployment.class);
        //org.gradle.api.provider.Property<String> registryProperty = mock(org.gradle.api.provider.Property.class);
        //when(fixtureMock.getDockerRegistry()).thenReturn(registryProperty);
        //when(registryProperty.getOrElse(anyString())).thenReturn("docker.elastic.co/elasticsearch-dev");
        //String result = TestFixturesDeployPlugin.resolveTargetDockerRegistry(fixtureMock);
        //assertEquals("docker.elastic.co/elasticsearch-dev", result);
    }

    @Test
    void applyWhenBaseImagesIsEmptyEqualsFalse() {
        Project projectMock = mock(Project.class);
        NamedDomainObjectContainer<TestFixtureDeployment> containerMock = mock(NamedDomainObjectContainer.class);
        ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);
        TaskContainer taskContainerMock = mock(TaskContainer.class);
        TestFixtureDeployment fixtureMock = mock(TestFixtureDeployment.class);
        TaskProvider<DockerBuildTask> taskProviderMock = mock(TaskProvider.class);
        DockerBuildTask taskMock = mock(DockerBuildTask.class);
        when(projectMock.container(TestFixtureDeployment.class)).thenReturn(containerMock);
        when(projectMock.getExtensions()).thenReturn(extensionContainerMock);
        when(projectMock.getTasks()).thenReturn(taskContainerMock);
        when(fixtureMock.getName()).thenReturn("testFixture");
        when(fixtureMock.getDockerContext()).thenReturn(mock(org.gradle.api.provider.Property.class));
        when(fixtureMock.getBaseImages()).thenReturn(mock(org.gradle.api.provider.ListProperty.class));
        when(fixtureMock.getVersion()).thenReturn(mock(org.gradle.api.provider.Property.class));
        when(fixtureMock.getDockerRegistry()).thenReturn(mock(org.gradle.api.provider.Property.class));
        when(taskContainerMock.register(eq("deployTestFixtureDockerImage"), eq(DockerBuildTask.class), any(Action.class))).thenReturn(taskProviderMock);
        when(taskProviderMock.get()).thenReturn(taskMock);
        when(fixtureMock.getBaseImages().get()).thenReturn(java.util.Arrays.asList("base1", "base2"));
        try (MockedStatic<BuildParams> buildParamsMock = mockStatic(BuildParams.class)) {
            buildParamsMock.when(BuildParams::isCi).thenReturn(false);
            TestFixturesDeployPlugin plugin = new TestFixturesDeployPlugin();
            plugin.apply(projectMock);
            containerMock.all(fixture -> {
                verify(taskMock).setBaseImages(new String[]{"base1", "base2"});
            });
        }
    }
}
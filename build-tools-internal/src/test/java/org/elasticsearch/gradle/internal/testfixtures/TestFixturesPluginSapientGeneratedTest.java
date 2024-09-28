package org.elasticsearch.gradle.internal.testfixtures;

// import org.elasticsearch.gradle.internal.testfixtures.TestFixturesPlugin;
// import org.elasticsearch.gradle.internal.docker.DockerSupportPlugin;
// import com.avast.gradle.dockercompose.tasks.ComposeUp;
// import java.nio.file.Files;
// import java.io.UncheckedIOException;
// import javax.inject.Inject;
// import org.gradle.api.plugins.BasePlugin;
// import org.gradle.api.plugins.ExtraPropertiesExtension;
// import org.junit.jupiter.api.Test;
// import org.gradle.api.Project;
// import java.io.File;
// import org.mockito.Mock;
// import org.gradle.api.Action;
// import org.gradle.api.DefaultTask;
// import org.gradle.api.provider.ProviderFactory;
// import org.gradle.api.logging.LogLevel;
// import com.avast.gradle.dockercompose.tasks.ComposePull;
// import com.avast.gradle.dockercompose.tasks.ComposeDown;
// import org.gradle.testfixtures.ProjectBuilder;
// import java.util.EnumSet;
// import org.elasticsearch.gradle.internal.docker.DockerSupportService;
// import static org.mockito.Mockito.*;
// import java.io.IOException;
// import java.util.function.BiConsumer;
// import org.junit.jupiter.api.BeforeEach;
// import com.avast.gradle.dockercompose.DockerComposePlugin;
// import java.util.Collections;
// import com.avast.gradle.dockercompose.ComposeExtension;
// import org.gradle.api.Plugin;
// import org.gradle.api.logging.Logger;
// import com.avast.gradle.dockercompose.tasks.ComposeBuild;
// import org.elasticsearch.gradle.test.SystemPropertyCommandLineArgumentProvider;
// import org.elasticsearch.gradle.internal.info.BuildParams;
// import org.gradle.api.tasks.TaskContainer;
// import org.gradle.api.tasks.testing.Test;
// import org.elasticsearch.gradle.util.GradleUtils;
// import org.gradle.api.file.FileSystemOperations;
// import static org.junit.jupiter.api.Assertions.*;
// import org.gradle.api.logging.Logging;
// import org.gradle.api.tasks.TaskProvider;
// import org.gradle.api.Task;
// import org.gradle.api.provider.Provider;
// import static org.mockito.ArgumentMatchers.any;

class TestFixturesPluginSapientGeneratedTest {

//     private TestFixturesPlugin plugin;

//     private Project project;

//     @Mock
//     private ProviderFactory providerFactory;

//     @Mock
//     private FileSystemOperations fileSystemOperations;

//     @Mock
//     private Provider<DockerSupportService> dockerSupportServiceProvider;

//     @BeforeEach
//     void setUp() {
//         plugin = new TestFixturesPlugin(providerFactory) {

//             @Override
//             protected FileSystemOperations getFileSystemOperations() {
//                 return fileSystemOperations;
//             }
//         };
//         project = ProjectBuilder.builder().build();
//         project.getPlugins().apply("java");
//     }

//     @Test
//     void testApply() {
//         // Create a mock docker-compose.yml file
//         File dockerComposeFile = new File(project.getProjectDir(), TestFixturesPlugin.DOCKER_COMPOSE_YML);
//         try {
//             dockerComposeFile.createNewFile();
//         } catch (Exception e) {
//             fail("Failed to create mock docker-compose.yml file");
//         }
//         // Mock the DockerSupportService
//         DockerSupportService dockerSupportService = mock(DockerSupportService.class);
//         when(dockerSupportServiceProvider.get()).thenReturn(dockerSupportService);
//         // Apply the plugin
//         plugin.apply(project);
//         // Verify that necessary plugins are applied
//         assertTrue(project.getPlugins().hasPlugin(DockerSupportPlugin.class));
//         assertTrue(project.getPlugins().hasPlugin(BasePlugin.class));
//         assertTrue(project.getPlugins().hasPlugin(DockerComposePlugin.class));
//         // Verify that tasks are created
//         TaskContainer tasks = project.getTasks();
//         assertNotNull(tasks.findByName("preProcessFixture"));
//         assertNotNull(tasks.findByName("buildFixture"));
//         assertNotNull(tasks.findByName("postProcessFixture"));
//         assertNotNull(tasks.findByName("composeUp"));
//         assertNotNull(tasks.findByName("composePull"));
//         assertNotNull(tasks.findByName("composeDown"));
//         // Verify ComposeExtension configuration
//         ComposeExtension composeExtension = project.getExtensions().getByType(ComposeExtension.class);
//         assertEquals(project.getName(), composeExtension.getProjectName().get());
//         assertEquals(Collections.singletonList(TestFixturesPlugin.DOCKER_COMPOSE_YML), composeExtension.getUseComposeFiles().get());
//         assertTrue(composeExtension.getRemoveContainers().get());
//         assertFalse(composeExtension.getUseDockerComposeV2().get());
//         // Verify Test task configuration
//         tasks.withType(Test.class).configureEach(testTask -> {
//             assertTrue(testTask.getDependsOn().contains(tasks.named("postProcessFixture")));
//             assertTrue(testTask.getFinalizedBy().getDependencies().contains(tasks.named("composeDown")));
//         });
//     }

//     @Test
//     void testConfigureServiceInfoForTask() {
//         Task task = mock(Task.class);
//         DockerSupportService dockerSupportService = mock(DockerSupportService.class);
//         when(dockerSupportServiceProvider.get()).thenReturn(dockerSupportService);
//         // Mock TCP and UDP ports
//         when(dockerSupportService.getTcpPorts()).thenReturn(Collections.singletonMap("service1", Collections.singletonMap(8080, 18080)));
//         when(dockerSupportService.getUdpPorts()).thenReturn(Collections.singletonMap("service2", Collections.singletonMap(9090, 19090)));
//         plugin.configureServiceInfoForTask(task, dockerSupportServiceProvider, (name, port) -> {
//             if (name.equals("test.fixtures.service1.tcp.8080")) {
//                 assertEquals(18080, port.intValue());
//             } else if (name.equals("test.fixtures.service2.udp.9090")) {
//                 assertEquals(19090, port.intValue());
//             } else {
//                 fail("Unexpected property: " + name);
//             }
//         });
//         verify(task).usesService(dockerSupportServiceProvider);
//         verify(task).doFirst(any(Action.class));
//     }

//     @Test
//     void testMaybeSkipTask() {
//         Task task = mock(Task.class);
//         DockerSupportService dockerSupportService = mock(DockerSupportService.class);
//         when(dockerSupportServiceProvider.get()).thenReturn(dockerSupportService);
//         plugin.maybeSkipTask(dockerSupportServiceProvider, task);
//         verify(task).onlyIf(eq("docker compose is available"), any());
//     }

//     @Test
//     void testGetTaskClass() {
//         Class<? extends DefaultTask> taskClass = plugin.getTaskClass("org.gradle.api.DefaultTask");
//         assertEquals(DefaultTask.class, taskClass);
//         assertThrows(IllegalArgumentException.class, () -> plugin.getTaskClass("java.lang.String"));
//         assertThrows(IllegalArgumentException.class, () -> plugin.getTaskClass("org.gradle.api.NonExistentTask"));
//     }
}
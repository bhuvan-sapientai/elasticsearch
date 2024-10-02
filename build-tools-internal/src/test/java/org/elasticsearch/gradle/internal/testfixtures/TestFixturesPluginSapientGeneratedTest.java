package org.elasticsearch.gradle.internal.testfixtures;

// import org.elasticsearch.gradle.internal.testfixtures.TestFixturesPlugin;
// import org.elasticsearch.gradle.internal.docker.DockerSupportPlugin;
// import com.avast.gradle.dockercompose.tasks.ComposeUp;
// import static org.mockito.ArgumentMatchers.any;
// import org.gradle.api.plugins.BasePlugin;
// import org.junit.jupiter.api.Test;
// import org.gradle.api.Project;
// import java.io.File;
// import org.mockito.Mock;
// import org.gradle.api.provider.ProviderFactory;
// import org.gradle.testfixtures.ProjectBuilder;
// import org.elasticsearch.gradle.internal.docker.DockerSupportService;
// import static org.mockito.Mockito.*;
// import java.io.IOException;
// import org.junit.jupiter.api.BeforeEach;
// import com.avast.gradle.dockercompose.DockerComposePlugin;
// import java.util.Collections;
// import com.avast.gradle.dockercompose.ComposeExtension;
// import org.elasticsearch.gradle.test.SystemPropertyCommandLineArgumentProvider;
// import org.gradle.api.tasks.TaskContainer;
// import org.gradle.api.tasks.testing.Test;
// import org.elasticsearch.gradle.util.GradleUtils;
// import org.gradle.api.file.FileSystemOperations;
// import static org.junit.jupiter.api.Assertions.*;
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
//     void testApply() throws IOException {
//         // Create a mock docker-compose.yml file
//         File dockerComposeFile = new File(project.getProjectDir(), TestFixturesPlugin.DOCKER_COMPOSE_YML);
//         assertTrue(dockerComposeFile.createNewFile());
//         // Mock the DockerSupportService
//         DockerSupportService dockerSupportService = mock(DockerSupportService.class);
//         when(dockerSupportServiceProvider.get()).thenReturn(dockerSupportService);
//         // Mock GradleUtils.getBuildService
//         try (var mocked = mockStatic(GradleUtils.class)) {
//             mocked.when(() -> GradleUtils.getBuildService(any(), any())).thenReturn(dockerSupportServiceProvider);
//             // Apply the plugin
//             plugin.apply(project);
//             // Verify that necessary plugins are applied
//             assertTrue(project.getPlugins().hasPlugin(DockerSupportPlugin.class));
//             assertTrue(project.getPlugins().hasPlugin(BasePlugin.class));
//             assertTrue(project.getPlugins().hasPlugin(DockerComposePlugin.class));
//             // Verify that tasks are created
//             TaskContainer tasks = project.getTasks();
//             assertNotNull(tasks.findByName("preProcessFixture"));
//             assertNotNull(tasks.findByName("buildFixture"));
//             assertNotNull(tasks.findByName("postProcessFixture"));
//             assertNotNull(tasks.findByName("composeUp"));
//             assertNotNull(tasks.findByName("composePull"));
//             assertNotNull(tasks.findByName("composeDown"));
//             // Verify ComposeExtension configuration
//             ComposeExtension composeExtension = project.getExtensions().getByType(ComposeExtension.class);
//             assertEquals(project.getName(), composeExtension.getProjectName().get());
//             assertEquals(Collections.singletonList(TestFixturesPlugin.DOCKER_COMPOSE_YML), composeExtension.getUseComposeFiles().get());
//             assertTrue(composeExtension.getRemoveContainers().get());
//             assertFalse(composeExtension.getUseDockerComposeV2().get());
//             // Verify Test task configuration
//             tasks.withType(Test.class).configureEach(testTask -> {
//                 assertTrue(testTask.getDependsOn().contains(tasks.named("postProcessFixture")));
//                 assertTrue(testTask.getFinalizedBy().getDependencies().contains(tasks.named("composeDown")));
//             });
//         }
//     }

//     @Test
//     void testMaybeSkipTask() {
//         Task task = mock(Task.class);
//         DockerSupportService dockerSupportService = mock(DockerSupportService.class);
//         DockerSupportService.DockerAvailability dockerAvailability = mock(DockerSupportService.DockerAvailability.class);
//         when(dockerSupportServiceProvider.get()).thenReturn(dockerSupportService);
//         when(dockerSupportService.getDockerAvailability()).thenReturn(dockerAvailability);
//         when(dockerAvailability.isComposeAvailable()).thenReturn(true);
//         plugin.maybeSkipTask(dockerSupportServiceProvider, task);
//         verify(task).onlyIf(eq("docker compose is available"), any());
//     }

//     @Test
//     void testGetTaskClass() {
//         Class<? extends Task> taskClass = plugin.getTaskClass("org.gradle.api.DefaultTask");
//         assertEquals(org.gradle.api.DefaultTask.class, taskClass);
//         assertThrows(IllegalArgumentException.class, () -> plugin.getTaskClass("java.lang.String"));
//         assertThrows(IllegalArgumentException.class, () -> plugin.getTaskClass("org.gradle.api.NonExistentTask"));
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
//         verify(task).doFirst(any());
//     }
}
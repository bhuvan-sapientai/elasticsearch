package org.elasticsearch.gradle.internal.test;

// import org.elasticsearch.gradle.internal.test.StandaloneTestPlugin;
// import org.elasticsearch.gradle.internal.precommit.InternalPrecommitTasks;
// import org.elasticsearch.gradle.internal.ElasticsearchTestBasePlugin;
// import org.gradle.api.tasks.SourceSet;
// import org.junit.jupiter.api.BeforeEach;
// import org.gradle.api.plugins.PluginManager;
// import static org.mockito.ArgumentMatchers.any;
// import org.junit.jupiter.api.Test;
// import static org.mockito.ArgumentMatchers.eq;
// import org.gradle.api.Project;
// import org.mockito.Mock;
// import org.gradle.api.tasks.SourceSetContainer;
// import org.gradle.api.tasks.TaskCollection;
// import org.gradle.api.tasks.TaskContainer;
// import org.gradle.api.plugins.ExtensionContainer;
// import org.gradle.api.tasks.testing.Test;
// import org.elasticsearch.gradle.internal.ElasticsearchJavaBasePlugin;
// import static org.mockito.ArgumentMatchers.anyString;
// import org.gradle.api.artifacts.dsl.DependencyHandler;
// import org.gradle.api.tasks.TaskProvider;
// import org.elasticsearch.gradle.internal.info.GlobalBuildInfoPlugin;
// import org.mockito.MockedStatic;
// import static org.mockito.Mockito.*;
// import static org.mockito.ArgumentMatchers.any;

class StandaloneTestPluginSapientGeneratedTest {

//     @Mock
//     private Project project;

//     @Mock
//     private Project rootProject;

//     @Mock
//     private PluginManager rootPluginManager;

//     @Mock
//     private PluginManager projectPluginManager;

//     @Mock
//     private ExtensionContainer extensionContainer;

//     @Mock
//     private SourceSetContainer sourceSetContainer;

//     @Mock
//     private SourceSet testSourceSet;

//     @Mock
//     private DependencyHandler dependencyHandler;

//     @Mock
//     private TaskContainer taskContainer;

//     @Mock
//     private TaskCollection<Test> testTaskCollection;

//     @Mock
//     private TaskProvider<Test> testTaskProvider;

//     @Mock
//     private TaskProvider<Task> checkTaskProvider;

//     private StandaloneTestPlugin plugin;

//     @BeforeEach
//     void setUp() {
//         plugin = new StandaloneTestPlugin();
//         when(project.getRootProject()).thenReturn(rootProject);
//         when(rootProject.getPluginManager()).thenReturn(rootPluginManager);
//         when(project.getPluginManager()).thenReturn(projectPluginManager);
//         when(project.getExtensions()).thenReturn(extensionContainer);
//         when(extensionContainer.getByType(SourceSetContainer.class)).thenReturn(sourceSetContainer);
//         when(sourceSetContainer.create("test")).thenReturn(testSourceSet);
//         when(project.getDependencies()).thenReturn(dependencyHandler);
//         when(project.getTasks()).thenReturn(taskContainer);
//         when(taskContainer.withType(Test.class)).thenReturn(testTaskCollection);
//         when(taskContainer.register(eq("test"), eq(Test.class))).thenReturn(testTaskProvider);
//         when(taskContainer.named("check")).thenReturn(checkTaskProvider);
//     }

//     @Test
//     void applyTest() {
//         try (MockedStatic<InternalPrecommitTasks> internalPrecommitTasksMockedStatic = mockStatic(InternalPrecommitTasks.class)) {
//             // Act
//             plugin.apply(project);
//             // Assert
//             verify(rootPluginManager).apply(GlobalBuildInfoPlugin.class);
//             verify(projectPluginManager).apply(ElasticsearchJavaBasePlugin.class);
//             verify(projectPluginManager).apply(ElasticsearchTestBasePlugin.class);
//             verify(sourceSetContainer).create("test");
//             verify(dependencyHandler).add(anyString(), any());
//             verify(testTaskCollection).configureEach(any());
//             verify(testTaskProvider).configure(any());
//             verify(checkTaskProvider).configure(any());
//             internalPrecommitTasksMockedStatic.verify(() -> InternalPrecommitTasks.create(project, false));
//         }
//     }
}
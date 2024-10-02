package org.elasticsearch.gradle.internal.conventions.precommit;

// import org.elasticsearch.gradle.internal.conventions.precommit.PrecommitTaskPlugin;
// import org.elasticsearch.gradle.internal.conventions.precommit.PrecommitTaskPlugin;
// import org.gradle.api.plugins.JavaPluginExtension;
// import org.gradle.api.plugins.PluginManager;
// import static org.mockito.ArgumentMatchers.any;
// import org.junit.jupiter.api.Test;
// import org.gradle.api.Project;
// import org.gradle.language.base.plugins.LifecycleBasePlugin;
// import org.gradle.api.Plugin;
// import org.mockito.Mock;
// import org.gradle.api.tasks.TaskContainer;
// import org.gradle.api.plugins.ExtensionContainer;
// import org.gradle.api.tasks.testing.Test;
// import org.mockito.ArgumentMatchers;
// import org.gradle.api.plugins.JavaBasePlugin;
// import org.gradle.api.tasks.TaskProvider;
// import static org.mockito.Mockito.*;
// import org.gradle.api.Task;
// import static org.mockito.ArgumentMatchers.any;

class PrecommitTaskPluginSapientGeneratedTest {

//     @Mock
//     private Project project;

//     @Mock
//     private TaskContainer taskContainer;

//     @Mock
//     private PluginManager pluginManager;

//     @Mock
//     private ExtensionContainer extensionContainer;

//     @Mock
//     private JavaPluginExtension javaPluginExtension;

//     @Mock
//     private TaskProvider<Task> precommitTask;

//     @Mock
//     private TaskProvider<Task> checkTask;

//     @Test
//     void applyTest() {
//         // Arrange
//         PrecommitTaskPlugin plugin = new PrecommitTaskPlugin();
//         when(project.getTasks()).thenReturn(taskContainer);
//         when(project.getPluginManager()).thenReturn(pluginManager);
//         when(project.getExtensions()).thenReturn(extensionContainer);
//         when(taskContainer.register(ArgumentMatchers.eq(PrecommitPlugin.PRECOMMIT_TASK_NAME), any(Class.class))).thenReturn(precommitTask);
//         when(taskContainer.named(LifecycleBasePlugin.CHECK_TASK_NAME)).thenReturn(checkTask);
//         when(extensionContainer.getByType(JavaPluginExtension.class)).thenReturn(javaPluginExtension);
//         // Act
//         plugin.apply(project);
//         // Assert
//         verify(taskContainer).register(ArgumentMatchers.eq(PrecommitPlugin.PRECOMMIT_TASK_NAME), any(Class.class));
//         verify(precommitTask).configure(any());
//         verify(pluginManager).withPlugin(ArgumentMatchers.eq("lifecycle-base"), any());
//         verify(pluginManager).withPlugin(ArgumentMatchers.eq("java-base"), any());
//         verify(checkTask).configure(any());
//         verify(javaPluginExtension).getSourceSets();
//         verify(taskContainer).withType(Test.class);
//     }

//     @Test
//     void applyTestWithoutJavaBasePlugin() {
//         // Arrange
//         PrecommitTaskPlugin plugin = new PrecommitTaskPlugin();
//         when(project.getTasks()).thenReturn(taskContainer);
//         when(project.getPluginManager()).thenReturn(pluginManager);
//         when(taskContainer.register(ArgumentMatchers.eq(PrecommitPlugin.PRECOMMIT_TASK_NAME), any(Class.class))).thenReturn(precommitTask);
//         when(taskContainer.named(LifecycleBasePlugin.CHECK_TASK_NAME)).thenReturn(checkTask);
//         // Act
//         plugin.apply(project);
//         // Assert
//         verify(taskContainer).register(ArgumentMatchers.eq(PrecommitPlugin.PRECOMMIT_TASK_NAME), any(Class.class));
//         verify(precommitTask).configure(any());
//         verify(pluginManager).withPlugin(ArgumentMatchers.eq("lifecycle-base"), any());
//         verify(pluginManager).withPlugin(ArgumentMatchers.eq("java-base"), any());
//         verify(checkTask).configure(any());
//         verifyNoInteractions(extensionContainer, javaPluginExtension);
//     }

//     @Test
//     void applyTestVerifyTaskProperties() {
//         // Arrange
//         PrecommitTaskPlugin plugin = new PrecommitTaskPlugin();
//         when(project.getTasks()).thenReturn(taskContainer);
//         when(project.getPluginManager()).thenReturn(pluginManager);
//         when(taskContainer.register(ArgumentMatchers.eq(PrecommitPlugin.PRECOMMIT_TASK_NAME), any(Class.class))).thenReturn(precommitTask);
//         // Act
//         plugin.apply(project);
//         // Assert
//         verify(precommitTask).configure(argThat(action -> {
//             Task task = mock(Task.class);
//             action.execute(task);
//             verify(task).setGroup(JavaBasePlugin.VERIFICATION_GROUP);
//             verify(task).setDescription("Runs all non-test checks");
//             return true;
//         }));
//     }
}
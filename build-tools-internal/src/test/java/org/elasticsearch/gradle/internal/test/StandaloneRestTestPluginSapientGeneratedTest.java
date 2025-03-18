package org.elasticsearch.gradle.internal.test;

// import org.elasticsearch.gradle.internal.test.StandaloneRestTestPlugin;
// import java.util.Arrays;
// import org.elasticsearch.gradle.internal.precommit.InternalPrecommitTasks;
// import org.gradle.plugins.ide.eclipse.model.EclipseClasspath;
// import org.gradle.api.tasks.SourceSet;
// import org.junit.jupiter.api.BeforeEach;
// import java.util.Map;
// import org.gradle.api.InvalidUserDataException;
// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.assertThrows;
// import org.gradle.api.Project;
// import org.gradle.api.Plugin;
// import org.elasticsearch.gradle.internal.test.rest.RestTestUtil;
// import org.gradle.plugins.ide.eclipse.model.EclipseModel;
// import org.mockito.Mock;
// import org.gradle.api.tasks.SourceSetContainer;
// import org.gradle.api.tasks.TaskContainer;
// import org.gradle.api.tasks.testing.Test;
// import org.gradle.plugins.ide.idea.model.IdeaModule;
// import org.gradle.api.plugins.JavaPlugin;
// import org.elasticsearch.gradle.internal.ExportElasticsearchBuildResourcesTask;
// import org.gradle.plugins.ide.idea.model.IdeaModel;
// import org.elasticsearch.gradle.internal.info.GlobalBuildInfoPlugin;
// import static org.mockito.Mockito.*;
// import static org.mockito.ArgumentMatchers.any;

class StandaloneRestTestPluginSapientGeneratedTest {

//     @Mock
//     private Project project;

//     @Mock
//     private Project rootProject;

//     @Mock
//     private SourceSetContainer sourceSetContainer;

//     @Mock
//     private SourceSet testSourceSet;

//     @Mock
//     private EclipseModel eclipseModel;

//     @Mock
//     private IdeaModel ideaModel;

//     @Mock
//     private TaskContainer taskContainer;

//     private StandaloneRestTestPlugin plugin;

//     @BeforeEach
//     void setUp() {
//         plugin = new StandaloneRestTestPlugin();
//         when(project.getRootProject()).thenReturn(rootProject);
//         when(project.getExtensions()).thenReturn(mock(org.gradle.api.plugins.ExtensionContainer.class));
//         when(project.getExtensions().getByType(SourceSetContainer.class)).thenReturn(sourceSetContainer);
//         when(sourceSetContainer.create("test")).thenReturn(testSourceSet);
//         when(project.getTasks()).thenReturn(taskContainer);
//         when(project.getConfigurations()).thenReturn(mock(org.gradle.api.artifacts.ConfigurationContainer.class));
//         when(project.getExtensions().getByType(EclipseModel.class)).thenReturn(eclipseModel);
//         when(project.getExtensions().getByType(IdeaModel.class)).thenReturn(ideaModel);
//         when(eclipseModel.getClasspath()).thenReturn(mock(EclipseClasspath.class));
//         when(ideaModel.getModule()).thenReturn(mock(IdeaModule.class));
//     }

//     @Test
//     void applyWhenProjectHasElasticsearchBuildPlugin() {
//         when(project.getPluginManager().hasPlugin("elasticsearch.build")).thenReturn(true);
//         assertThrows(InvalidUserDataException.class, () -> plugin.apply(project));
//     }

//     @Test
//     void applyWhenProjectDoesNotHaveElasticsearchBuildPlugin() {
//         when(project.getPluginManager().hasPlugin("elasticsearch.build")).thenReturn(false);
//         plugin.apply(project);
//         verify(rootProject.getPluginManager()).apply(GlobalBuildInfoPlugin.class);
//         verify(project.getPluginManager()).apply(LegacyRestTestBasePlugin.class);
//         verify(taskContainer).register("buildResources", ExportElasticsearchBuildResourcesTask.class);
//         verify(sourceSetContainer).create("test");
//         verify(project.getConfigurations()).create("compileOnly");
//         verify(eclipseModel.getClasspath()).setSourceSets(Arrays.asList(testSourceSet));
//         verify(ideaModel.getModule().getTestSources()).from(testSourceSet.getJava().getSrcDirs());
//     }

//     @Test
//     void verifyTestTaskConfiguration() {
//         when(project.getPluginManager().hasPlugin("elasticsearch.build")).thenReturn(false);
//         plugin.apply(project);
//         verify(taskContainer).withType(Test.class);
//     }

//     @Test
//     void verifyRestTestUtilSetup() {
//         when(project.getPluginManager().hasPlugin("elasticsearch.build")).thenReturn(false);
//         plugin.apply(project);
//         RestTestUtil.setupJavaRestTestDependenciesDefaults(project, testSourceSet);
//     }

//     @Test
//     void verifyInternalPrecommitTasksCreation() {
//         when(project.getPluginManager().hasPlugin("elasticsearch.build")).thenReturn(false);
//         plugin.apply(project);
//         InternalPrecommitTasks.create(project, false);
//     }

//     @Test
//     void verifyIdeaModuleConfiguration() {
//         when(project.getPluginManager().hasPlugin("elasticsearch.build")).thenReturn(false);
//         IdeaModule ideaModule = mock(IdeaModule.class);
//         when(ideaModel.getModule()).thenReturn(ideaModule);
//         when(ideaModule.getScopes()).thenReturn(mock(Map.class));
//         plugin.apply(project);
//         verify(ideaModule.getScopes()).put(eq("TEST"), any());
//     }

//     @Test
//     void verifyEclipseClasspathConfiguration() {
//         when(project.getPluginManager().hasPlugin("elasticsearch.build")).thenReturn(false);
//         EclipseClasspath eclipseClasspath = mock(EclipseClasspath.class);
//         when(eclipseModel.getClasspath()).thenReturn(eclipseClasspath);
//         plugin.apply(project);
//         verify(eclipseClasspath).setPlusConfigurations(anyList());
//     }
}
package org.elasticsearch.gradle.internal.test;

// import org.elasticsearch.gradle.internal.test.StandaloneRestTestPlugin;
// import java.util.Arrays;
// import org.elasticsearch.gradle.internal.precommit.InternalPrecommitTasks;
// import org.gradle.api.tasks.SourceSet;
// import org.junit.jupiter.api.BeforeEach;
// import org.gradle.api.plugins.PluginManager;
// import java.util.Map;
// import org.gradle.api.InvalidUserDataException;
// import org.junit.jupiter.api.Test;
// import org.gradle.api.Project;
// import org.elasticsearch.gradle.internal.test.rest.RestTestUtil;
// import org.gradle.plugins.ide.eclipse.model.EclipseModel;
// import org.mockito.Mock;
// import org.gradle.api.tasks.SourceSetContainer;
// import org.junit.jupiter.api.Timeout;
// import org.gradle.api.tasks.testing.Test;
// import org.mockito.MockitoAnnotations;
// import org.gradle.api.plugins.JavaPlugin;
// import static org.junit.jupiter.api.Assertions.*;
// import org.elasticsearch.gradle.internal.ExportElasticsearchBuildResourcesTask;
// import org.gradle.plugins.ide.idea.model.IdeaModel;
// import org.gradle.api.tasks.TaskProvider;
// import org.elasticsearch.gradle.internal.info.GlobalBuildInfoPlugin;
// import static org.mockito.Mockito.*;
// import static org.mockito.ArgumentMatchers.any;

// @Timeout(5)
class StandaloneRestTestPluginSapientGeneratedTest {

//     @Mock
//     private Project project;

//     @Mock
//     private PluginManager pluginManager;

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

//     private StandaloneRestTestPlugin plugin;

//     @BeforeEach
//     void setUp() {
//         MockitoAnnotations.openMocks(this);
//         plugin = new StandaloneRestTestPlugin();
//         when(project.getPluginManager()).thenReturn(pluginManager);
//         when(project.getRootProject()).thenReturn(rootProject);
//         when(project.getExtensions()).thenReturn(mock(org.gradle.api.plugins.ExtensionContainer.class));
//         when(project.getExtensions().getByType(SourceSetContainer.class)).thenReturn(sourceSetContainer);
//         when(sourceSetContainer.create("test")).thenReturn(testSourceSet);
//         when(project.getTasks()).thenReturn(mock(org.gradle.api.tasks.TaskContainer.class));
//         when(project.getConfigurations()).thenReturn(mock(org.gradle.api.artifacts.ConfigurationContainer.class));
//     }

//     @Test
//     void applyWhenProjectHasElasticsearchBuildPlugin() {
//         when(pluginManager.hasPlugin("elasticsearch.build")).thenReturn(true);
//         assertThrows(InvalidUserDataException.class, () -> plugin.apply(project), "Should throw InvalidUserDataException when elasticsearch.build plugin is present");
//     }

//     @Test
//     void applyWhenProjectDoesNotHaveElasticsearchBuildPlugin() {
//         when(pluginManager.hasPlugin("elasticsearch.build")).thenReturn(false);
//         when(project.getExtensions().getByType(EclipseModel.class)).thenReturn(eclipseModel);
//         when(project.getExtensions().getByType(IdeaModel.class)).thenReturn(ideaModel);
//         when(eclipseModel.getClasspath()).thenReturn(mock(org.gradle.plugins.ide.eclipse.model.EclipseClasspath.class));
//         when(ideaModel.getModule()).thenReturn(mock(org.gradle.plugins.ide.idea.model.IdeaModule.class));
//         plugin.apply(project);
//         verify(rootProject.getPluginManager()).apply(GlobalBuildInfoPlugin.class);
//         verify(pluginManager).apply(LegacyRestTestBasePlugin.class);
//         verify(project.getTasks()).register("buildResources", ExportElasticsearchBuildResourcesTask.class);
//         verify(sourceSetContainer).create("test");
//         verify(project.getConfigurations()).create("compileOnly");
//         verify(eclipseModel.getClasspath()).setSourceSets(Arrays.asList(testSourceSet));
//         verify(ideaModel.getModule().getTestSources()).from(testSourceSet.getJava().getSrcDirs());
//     }

//     @Test
//     void verifyTestTaskConfiguration() {
//         when(pluginManager.hasPlugin("elasticsearch.build")).thenReturn(false);
//         when(project.getExtensions().getByType(EclipseModel.class)).thenReturn(eclipseModel);
//         when(project.getExtensions().getByType(IdeaModel.class)).thenReturn(ideaModel);
//         when(eclipseModel.getClasspath()).thenReturn(mock(org.gradle.plugins.ide.eclipse.model.EclipseClasspath.class));
//         when(ideaModel.getModule()).thenReturn(mock(org.gradle.plugins.ide.idea.model.IdeaModule.class));
//         plugin.apply(project);
//         verify(project.getTasks()).withType(Test.class);
//     }

//     @Test
//     void verifyRestTestUtilSetup() {
//         when(pluginManager.hasPlugin("elasticsearch.build")).thenReturn(false);
//         when(project.getExtensions().getByType(EclipseModel.class)).thenReturn(eclipseModel);
//         when(project.getExtensions().getByType(IdeaModel.class)).thenReturn(ideaModel);
//         when(eclipseModel.getClasspath()).thenReturn(mock(org.gradle.plugins.ide.eclipse.model.EclipseClasspath.class));
//         when(ideaModel.getModule()).thenReturn(mock(org.gradle.plugins.ide.idea.model.IdeaModule.class));
//         plugin.apply(project);
//         verify(RestTestUtil.class);
//         RestTestUtil.setupJavaRestTestDependenciesDefaults(project, testSourceSet);
//     }

//     @Test
//     void verifyInternalPrecommitTasksCreation() {
//         when(pluginManager.hasPlugin("elasticsearch.build")).thenReturn(false);
//         when(project.getExtensions().getByType(EclipseModel.class)).thenReturn(eclipseModel);
//         when(project.getExtensions().getByType(IdeaModel.class)).thenReturn(ideaModel);
//         when(eclipseModel.getClasspath()).thenReturn(mock(org.gradle.plugins.ide.eclipse.model.EclipseClasspath.class));
//         when(ideaModel.getModule()).thenReturn(mock(org.gradle.plugins.ide.idea.model.IdeaModule.class));
//         plugin.apply(project);
//         verify(InternalPrecommitTasks.class);
//         InternalPrecommitTasks.create(project, false);
//     }

//     @Test
//     void verifyIdeaModuleConfiguration() {
//         when(pluginManager.hasPlugin("elasticsearch.build")).thenReturn(false);
//         when(project.getExtensions().getByType(EclipseModel.class)).thenReturn(eclipseModel);
//         when(project.getExtensions().getByType(IdeaModel.class)).thenReturn(ideaModel);
//         when(eclipseModel.getClasspath()).thenReturn(mock(org.gradle.plugins.ide.eclipse.model.EclipseClasspath.class));
//         when(ideaModel.getModule()).thenReturn(mock(org.gradle.plugins.ide.idea.model.IdeaModule.class));
//         plugin.apply(project);
//         verify(ideaModel.getModule()).getScopes();
//     }
}
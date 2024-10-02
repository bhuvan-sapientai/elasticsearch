package org.elasticsearch.gradle.internal;

import org.elasticsearch.gradle.internal.DependenciesInfoPlugin;

import org.gradle.api.artifacts.dsl.ArtifactHandler;
import org.gradle.api.artifacts.PublishArtifact;
import org.gradle.api.plugins.PluginContainer;
import org.elasticsearch.gradle.internal.precommit.DependencyLicensesTask;
import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.Project;
import org.gradle.api.attributes.Category;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.api.tasks.TaskProvider;
import org.elasticsearch.gradle.dependencies.CompileOnlyResolvePlugin;

import static org.mockito.Mockito.*;

import org.gradle.api.model.ObjectFactory;

import static org.mockito.ArgumentMatchers.any;

class DependenciesInfoPluginSapientGeneratedTest {

    @Test
    void testApply() {
        // Arrange
        //Project project = mock(Project.class);
        //PluginContainer plugins = mock(PluginContainer.class);
        //ConfigurationContainer configurations = mock(ConfigurationContainer.class);
        //TaskContainer tasks = mock(TaskContainer.class);
        //ObjectFactory objects = mock(ObjectFactory.class);
        //ArtifactHandler artifacts = mock(ArtifactHandler.class);
        //when(project.getPlugins()).thenReturn(plugins);
        //when(project.getConfigurations()).thenReturn(configurations);
        //when(project.getTasks()).thenReturn(tasks);
        //when(project.getObjects()).thenReturn(objects);
        //when(project.getArtifacts()).thenReturn(artifacts);
        //Configuration runtimeClasspath = mock(Configuration.class);
        //Configuration compileOnly = mock(Configuration.class);
        //Configuration dependenciesInfoFiles = mock(Configuration.class);
        //when(configurations.getByName(JavaPlugin.RUNTIME_CLASSPATH_CONFIGURATION_NAME)).thenReturn(runtimeClasspath);
        //when(configurations.getByName(CompileOnlyResolvePlugin.RESOLVEABLE_COMPILE_ONLY_CONFIGURATION_NAME)).thenReturn(compileOnly);
        //when(configurations.create("dependenciesInfoFiles")).thenReturn(dependenciesInfoFiles);
        //TaskProvider<DependenciesInfoTask> depsInfoTask = mock(TaskProvider.class);
        //when(tasks.register("dependenciesInfo", DependenciesInfoTask.class)).thenReturn(depsInfoTask);
        //TaskProvider<DependencyLicensesTask> depLicTask = mock(TaskProvider.class);
        //when(tasks.named("dependencyLicenses", DependencyLicensesTask.class)).thenReturn(depLicTask);
        //Category category = mock(Category.class);
        //when(objects.named(Category.class, Category.DOCUMENTATION)).thenReturn(category);
        // Act
        //DependenciesInfoPlugin plugin = new DependenciesInfoPlugin();
        //plugin.apply(project);
        // Assert
        //verify(plugins).apply(CompileOnlyResolvePlugin.class);
        //verify(tasks).register(eq("dependenciesInfo"), eq(DependenciesInfoTask.class), any());
        //verify(configurations).create("dependenciesInfoFiles");
        //verify(dependenciesInfoFiles).setCanBeResolved(false);
        //verify(dependenciesInfoFiles).setCanBeConsumed(true);
        //verify(dependenciesInfoFiles).attributes(any());
        //verify(artifacts).add(eq("dependenciesInfoFiles"), eq(depsInfoTask));
    }
}
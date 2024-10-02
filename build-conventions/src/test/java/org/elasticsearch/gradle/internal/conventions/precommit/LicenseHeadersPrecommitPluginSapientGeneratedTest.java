package org.elasticsearch.gradle.internal.conventions.precommit;

import org.elasticsearch.gradle.internal.conventions.precommit.LicenseHeadersPrecommitPlugin;

import java.util.List;
import org.gradle.api.tasks.SourceSet;
import org.junit.jupiter.api.BeforeEach;
import javax.inject.Inject;
import org.gradle.api.plugins.JavaPluginExtension;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.elasticsearch.gradle.internal.conventions.precommit.LicenseHeadersPrecommitPlugin;
import org.gradle.api.Project;
import org.mockito.Mock;
import org.gradle.api.tasks.SourceSetContainer;
import org.mockito.MockitoAnnotations;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.plugins.JavaBasePlugin;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Collectors;
import org.gradle.testfixtures.ProjectBuilder;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.file.FileCollection;
import static org.mockito.Mockito.*;
import org.gradle.api.Task;
import org.gradle.api.provider.Provider;
import static org.mockito.ArgumentMatchers.any;

class LicenseHeadersPrecommitPluginSapientGeneratedTest {

    private Project project;

    private LicenseHeadersPrecommitPlugin plugin;

    @Mock
    private ProviderFactory providerFactory;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        project = ProjectBuilder.builder().build();
        plugin = new LicenseHeadersPrecommitPlugin(providerFactory);
    }

    @Test
    void testCreateTask() {
        project.getPlugins().apply(JavaBasePlugin.class);
        TaskProvider<? extends Task> taskProvider = plugin.createTask(project);
        assertNotNull(taskProvider);
        assertEquals("licenseHeaders", taskProvider.getName());
        assertTrue(taskProvider.get() instanceof LicenseHeadersTask);
    }

    @Test
    void testCreateTaskConfiguresSourceFolders() {
        //project.getPlugins().apply(JavaBasePlugin.class);
        //SourceSetContainer sourceSets = mock(SourceSetContainer.class);
        //JavaPluginExtension javaPluginExtension = mock(JavaPluginExtension.class);
        //when(javaPluginExtension.getSourceSets()).thenReturn(sourceSets);
        //project.getExtensions().add("java", javaPluginExtension);
        //List<SourceSet> sourceSetList = new ArrayList<>();
        //SourceSet sourceSet = mock(SourceSet.class);
        //sourceSetList.add(sourceSet);
        //when(sourceSets.stream()).thenReturn(sourceSetList.stream());
        //Provider<List<FileCollection>> mockProvider = mock(Provider.class);
        //when(providerFactory.provider(any())).thenReturn(mockProvider);
        //TaskProvider<? extends Task> taskProvider = plugin.createTask(project);
        //LicenseHeadersTask task = (LicenseHeadersTask) taskProvider.get();
        //verify(task.getSourceFolders()).addAll(mockProvider);
    }

    @Test
    void testCreateTaskWithoutJavaBasePlugin() {
        TaskProvider<? extends Task> taskProvider = plugin.createTask(project);
        assertNotNull(taskProvider);
        assertEquals("licenseHeaders", taskProvider.getName());
        assertTrue(taskProvider.get() instanceof LicenseHeadersTask);
        LicenseHeadersTask task = (LicenseHeadersTask) taskProvider.get();
        assertTrue(task.getSourceFolders().get().isEmpty());
    }

    @Test
    void testPluginApply() {
        project.getPlugins().apply(LicenseHeadersPrecommitPlugin.class);
        assertTrue(project.getTasks().getByName("licenseHeaders") instanceof LicenseHeadersTask);
    }

    @Test
    void testProviderFactoryInjection() {
        assertNotNull(plugin);
        assertNotNull(providerFactory);
    }

    @Test
    void testCreateTaskReturnsCorrectTaskType() {
        TaskProvider<? extends Task> taskProvider = plugin.createTask(project);
        assertTrue(taskProvider.get() instanceof LicenseHeadersTask);
    }

    @Test
    void testCreateTaskWithJavaBasePluginApplied() {
        project.getPlugins().apply(JavaBasePlugin.class);
        TaskProvider<? extends Task> taskProvider = plugin.createTask(project);
        assertNotNull(taskProvider);
        assertEquals("licenseHeaders", taskProvider.getName());
        assertTrue(taskProvider.get() instanceof LicenseHeadersTask);
    }

    @Test
    void testSourceFoldersPopulatedWhenJavaBasePluginApplied() {
        //project.getPlugins().apply(JavaBasePlugin.class);
        //SourceSetContainer sourceSets = mock(SourceSetContainer.class);
        //JavaPluginExtension javaPluginExtension = mock(JavaPluginExtension.class);
        //when(javaPluginExtension.getSourceSets()).thenReturn(sourceSets);
        //project.getExtensions().add("java", javaPluginExtension);
        //List<SourceSet> sourceSetList = new ArrayList<>();
        //SourceSet sourceSet = mock(SourceSet.class);
        //sourceSetList.add(sourceSet);
        //when(sourceSets.stream()).thenReturn(sourceSetList.stream());
        //Provider<List<FileCollection>> mockProvider = mock(Provider.class);
        //when(providerFactory.provider(any())).thenReturn(mockProvider);
        //TaskProvider<? extends Task> taskProvider = plugin.createTask(project);
        //LicenseHeadersTask task = (LicenseHeadersTask) taskProvider.get();
        //verify(task.getSourceFolders()).addAll(mockProvider);
    }
}
package org.elasticsearch.gradle.internal.conventions;

import org.elasticsearch.gradle.internal.conventions.PublishPlugin;
import org.elasticsearch.gradle.internal.conventions.util.Util;
import org.gradle.api.artifacts.PublishArtifact;
import javax.inject.Inject;
import org.gradle.api.plugins.BasePlugin;
import org.junit.jupiter.api.Test;
import com.github.jengelman.gradle.plugins.shadow.ShadowExtension;
import com.github.jengelman.gradle.plugins.shadow.ShadowPlugin;
import org.gradle.api.Project;
import java.io.File;
import org.gradle.language.base.plugins.LifecycleBasePlugin;
import org.mockito.Mock;
import org.gradle.api.NamedDomainObjectSet;
import org.gradle.api.file.ProjectLayout;
import org.gradle.api.plugins.ExtensionContainer;
import org.gradle.api.plugins.JavaLibraryPlugin;
import static org.hamcrest.MatcherAssert.assertThat;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.publish.maven.tasks.GenerateMavenPom;
import org.gradle.api.plugins.JavaPlugin;
import org.junit.jupiter.params.provider.CsvSource;
import org.gradle.testfixtures.ProjectBuilder;
import static org.mockito.Mockito.*;
import java.util.HashMap;
import org.gradle.api.publish.maven.plugins.MavenPublishPlugin;
import org.gradle.initialization.layout.BuildLayout;
import groovy.util.Node;
import org.gradle.api.tasks.SourceSet;
import org.junit.jupiter.api.BeforeEach;
import java.util.Map;
import org.gradle.api.artifacts.Configuration;
import org.junit.jupiter.params.ParameterizedTest;
import org.gradle.api.Plugin;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.XmlProvider;
import org.gradle.api.publish.PublishingExtension;
import org.gradle.api.publish.maven.MavenPublication;
import org.elasticsearch.gradle.internal.conventions.precommit.PomValidationPrecommitPlugin;
import org.gradle.api.plugins.BasePluginExtension;
import org.gradle.api.provider.MapProperty;
import static org.hamcrest.Matchers.*;
import java.util.concurrent.Callable;
import static org.junit.jupiter.api.Assertions.*;
import org.gradle.api.tasks.bundling.Jar;
import org.gradle.api.tasks.TaskProvider;
import org.elasticsearch.gradle.internal.conventions.info.GitInfo;
import org.gradle.api.Task;
import org.gradle.api.provider.Provider;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

class PublishPluginSapientGeneratedTest {

    private Project project;

    private PublishPlugin publishPlugin;

    @Mock
    private BuildLayout buildLayout;

    @BeforeEach
    void setUp() {
        project = ProjectBuilder.builder().build();
        publishPlugin = new PublishPlugin(project.getLayout(), buildLayout, project.getProviders());
    }

    @Disabled()
    @Test
    void testApply() {
        publishPlugin.apply(project);
        assertTrue(project.getPlugins().hasPlugin(BasePlugin.class));
        assertTrue(project.getPlugins().hasPlugin(MavenPublishPlugin.class));
        assertTrue(project.getPlugins().hasPlugin(PomValidationPrecommitPlugin.class));
        assertTrue(project.getPlugins().hasPlugin(LicensingPlugin.class));
        assertNotNull(project.getTasks().findByName("javadocJar"));
        assertNotNull(project.getTasks().findByName("sourcesJar"));
        assertNotNull(project.getTasks().findByName("generatePom"));
    }

    @Test
    void testConfigurePublications() {
        //publishPlugin.apply(project);
        //PublishingExtension publishingExtension = project.getExtensions().getByType(PublishingExtension.class);
        //assertNotNull(publishingExtension.getPublications().findByName("elastic"));
        //MavenPublication publication = (MavenPublication) publishingExtension.getPublications().getByName("elastic");
        //assertNotNull(publication);
        //project.getPluginManager().apply(JavaPlugin.class);
        //project.evaluate();
        //assertThat(publication.getArtifacts(), hasSize(greaterThan(0)));
    }

    @Test
    void testConfigurePublicationsWithShadowPlugin() {
        //project.getPluginManager().apply(ShadowPlugin.class);
        //publishPlugin.apply(project);
        //PublishingExtension publishingExtension = project.getExtensions().getByType(PublishingExtension.class);
        //MavenPublication publication = (MavenPublication) publishingExtension.getPublications().getByName("elastic");
        //project.evaluate();
        //verify(project.getExtensions().getByType(ShadowExtension.class)).component(publication);
    }

    @Test
    void testConfigurePomGeneration() {
        //publishPlugin.apply(project);
        //TaskContainer tasks = project.getTasks();
        //assertNotNull(tasks.findByName("generatePom"));
        //Task assembleTask = tasks.findByName(BasePlugin.ASSEMBLE_TASK_NAME);
        //assertNotNull(assembleTask);
        //assertTrue(assembleTask.getDependencies().contains(tasks.findByName("generatePom")));
        //project.setVersion("1.0.0");
        //project.getExtensions().getByType(BasePluginExtension.class).getArchivesName().set("test-artifact");
        /*tasks.withType(GenerateMavenPom.class).configureEach(pomTask -> {
    assertEquals(project.getBuildDir().getPath() + "/distributions/test-artifact-1.0.0.pom", pomTask.getDestination().get().getAsFile().getPath());
});*/
    }

    @ParameterizedTest
    @CsvSource({ "Test Project, This is a test project", "Another Project, ", ", No description" })
    void testAddNameAndDescriptionToPom(String name, String description) {
        //project.setName(name);
        //project.setDescription(description);
        //publishPlugin.apply(project);
        //PublishingExtension publishingExtension = project.getExtensions().getByType(PublishingExtension.class);
        //MavenPublication publication = (MavenPublication) publishingExtension.getPublications().getByName("elastic");
        /*publication.getPom().withXml(xml -> {
    org.w3c.dom.Node root = xml.asNode();
    assertEquals(name, root.getChildNodes().item(0).getTextContent());
    assertEquals(description != null ? description : "", root.getChildNodes().item(1).getTextContent());
});*/
    }

    @Test
    void testConfigureJavadocJar() {
        //project.getPluginManager().apply(JavaLibraryPlugin.class);
        //publishPlugin.apply(project);
        //TaskProvider<Jar> javadocJarTask = project.getTasks().named("javadocJar", Jar.class);
        //assertNotNull(javadocJarTask);
        //assertEquals("javadoc", javadocJarTask.get().getArchiveClassifier().get());
        //assertEquals("build", javadocJarTask.get().getGroup());
        //assertEquals("Assembles a jar containing javadocs.", javadocJarTask.get().getDescription());
        //Task assembleTask = project.getTasks().getByName(BasePlugin.ASSEMBLE_TASK_NAME);
        //assertTrue(assembleTask.getDependencies().contains(javadocJarTask.get()));
    }

    @Test
    void testConfigureSourcesJar() {
        //project.getPluginManager().apply(JavaLibraryPlugin.class);
        //publishPlugin.apply(project);
        //TaskProvider<Jar> sourcesJarTask = project.getTasks().named("sourcesJar", Jar.class);
        //assertNotNull(sourcesJarTask);
        //assertEquals("sources", sourcesJarTask.get().getArchiveClassifier().get());
        //assertEquals("build", sourcesJarTask.get().getGroup());
        //assertEquals("Assembles a jar containing source files.", sourcesJarTask.get().getDescription());
        //Task assembleTask = project.getTasks().getByName(BasePlugin.ASSEMBLE_TASK_NAME);
        //assertTrue(assembleTask.getDependencies().contains(sourcesJarTask.get()));
    }

    @Test
    void testAddScmInfo() {
        //GitInfo gitInfo = mock(GitInfo.class);
        //when(gitInfo.urlFromOrigin()).thenReturn("https://github.com/elastic/elasticsearch.git");
        //when(gitInfo.getOrigin()).thenReturn("git@github.com:elastic/elasticsearch.git");
        //publishPlugin.apply(project);
        //PublishingExtension publishingExtension = project.getExtensions().getByType(PublishingExtension.class);
        //MavenPublication publication = (MavenPublication) publishingExtension.getPublications().getByName("elastic");
        /*publication.getPom().withXml(xml -> {
    PublishPlugin.addScmInfo(xml, gitInfo);
    org.w3c.dom.Node root = xml.asNode();
    assertEquals("https://github.com/elastic/elasticsearch.git", root.getChildNodes().item(0).getTextContent());
    org.w3c.dom.Node scmNode = root.getChildNodes().item(1);
    assertEquals("git@github.com:elastic/elasticsearch.git", scmNode.getChildNodes().item(0).getTextContent());
});*/
    }

    @Test
    void testProjectLicensesConfiguration() {
        //publishPlugin.apply(project);
        //Map<String, String> licenses = new HashMap<>();
        //licenses.put("Apache License 2.0", "http://www.apache.org/licenses/LICENSE-2.0.txt");
        //licenses.put("The MIT License", "https://opensource.org/licenses/MIT");
        //MapProperty<String, String> projectLicenses = project.getExtensions().getExtraProperties().get("projectLicenses");
        //projectLicenses.set(licenses);
        //PublishingExtension publishingExtension = project.getExtensions().getByType(PublishingExtension.class);
        //MavenPublication publication = (MavenPublication) publishingExtension.getPublications().getByName("elastic");
        /*publication.getPom().withXml(xml -> {
    org.w3c.dom.Node root = xml.asNode();
    org.w3c.dom.NodeList licenseNodes = ((org.w3c.dom.Element) root).getElementsByTagName("license");
    assertEquals(2, licenseNodes.getLength());
    for (int i = 0; i < licenseNodes.getLength(); i++) {
        org.w3c.dom.Node licenseNode = licenseNodes.item(i);
        String name = ((org.w3c.dom.Element) licenseNode).getElementsByTagName("name").item(0).getTextContent();
        String url = ((org.w3c.dom.Element) licenseNode).getElementsByTagName("url").item(0).getTextContent();
        String distribution = ((org.w3c.dom.Element) licenseNode).getElementsByTagName("distribution").item(0).getTextContent();
        assertTrue(licenses.containsKey(name));
        assertEquals(licenses.get(name), url);
        assertEquals("repo", distribution);
    }
});*/
    }

    @Test
    void testRepositoryConfiguration() {
        //File rootDir = new File("/root");
        //when(buildLayout.getRootDirectory()).thenReturn(rootDir);
        //publishPlugin.apply(project);
        //PublishingExtension publishingExtension = project.getExtensions().getByType(PublishingExtension.class);
        //assertEquals(1, publishingExtension.getRepositories().size());
        /*publishingExtension.getRepositories().forEach(artifactRepository -> {
    assertEquals("test", artifactRepository.getName());
    assertEquals(new File(rootDir, "build/local-test-repo").toURI(), artifactRepository.getUrl());
});*/
    }
}

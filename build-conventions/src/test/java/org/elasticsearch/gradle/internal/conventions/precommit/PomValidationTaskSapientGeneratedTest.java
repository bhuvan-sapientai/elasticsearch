package org.elasticsearch.gradle.internal.conventions.precommit;

import org.elasticsearch.gradle.internal.conventions.precommit.PomValidationTask;
import java.util.Collection;
import org.apache.maven.model.Scm;
import javax.inject.Inject;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.gradle.api.tasks.InputFile;
import java.io.File;
import org.gradle.api.tasks.TaskAction;
import org.apache.maven.model.Model;
import org.apache.maven.model.License;
import org.gradle.api.file.RegularFileProperty;
import java.io.FileReader;
import java.util.function.Consumer;
import org.elasticsearch.gradle.internal.conventions.precommit.PomValidationTask;
import org.apache.maven.model.Developer;
import org.gradle.api.GradleException;
import static org.mockito.Mockito.*;
import org.gradle.api.model.ObjectFactory;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.elasticsearch.gradle.internal.conventions.precommit.PrecommitTask;
import org.gradle.api.logging.Logger;
import java.util.function.Predicate;
import static org.junit.jupiter.api.Assertions.*;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.gradle.api.provider.Provider;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

class PomValidationTaskSapientGeneratedTest {

    private PomValidationTask task;

    private ObjectFactory objectFactory;

    private RegularFileProperty pomFile;

    private Logger logger;

    private File mockFile;

    @BeforeEach
    void setUp() {
        objectFactory = mock(ObjectFactory.class);
        pomFile = mock(RegularFileProperty.class);
        logger = mock(Logger.class);
        mockFile = mock(File.class);
        when(objectFactory.fileProperty()).thenReturn(pomFile);
        when(pomFile.getAsFile()).thenReturn(mock(Provider.class));
        when(pomFile.getAsFile().get()).thenReturn(mockFile);
        task = spy(new PomValidationTask(objectFactory));
        doReturn(logger).when(task).getLogger();
    }

    @Disabled()
    @Test
    void testValidPom() throws Exception {
        Model model = createValidModel();
        MavenXpp3Reader reader = mock(MavenXpp3Reader.class);
        when(reader.read(any(FileReader.class))).thenReturn(model);
        task.checkPom();
        verify(logger, never()).error(anyString(), any(), any(), any());
    }

    @Disabled()
    @Test
    void testInvalidPom() throws Exception {
        Model model = new Model();
        MavenXpp3Reader reader = mock(MavenXpp3Reader.class);
        when(reader.read(any(FileReader.class))).thenReturn(model);
        assertThrows(GradleException.class, () -> task.checkPom());
        verify(logger, times(9)).error(anyString(), any(), any(), any());
    }

    @Disabled()
    @Test
    void testMissingScm() throws Exception {
        Model model = createValidModel();
        model.setScm(null);
        MavenXpp3Reader reader = mock(MavenXpp3Reader.class);
        when(reader.read(any(FileReader.class))).thenReturn(model);
        assertThrows(GradleException.class, () -> task.checkPom());
        verify(logger).error(eq("{} {} in [{}]"), eq("scm"), eq("is missing"), any());
    }

    @Disabled()
    @Test
    void testEmptyLicenses() throws Exception {
        Model model = createValidModel();
        model.setLicenses(Arrays.asList());
        MavenXpp3Reader reader = mock(MavenXpp3Reader.class);
        when(reader.read(any(FileReader.class))).thenReturn(model);
        assertThrows(GradleException.class, () -> task.checkPom());
        verify(logger).error(eq("{} {} in [{}]"), eq("licenses"), eq("is empty"), any());
    }

    @Disabled()
    @Test
    void testEmptyDevelopers() throws Exception {
        Model model = createValidModel();
        model.setDevelopers(Arrays.asList());
        MavenXpp3Reader reader = mock(MavenXpp3Reader.class);
        when(reader.read(any(FileReader.class))).thenReturn(model);
        assertThrows(GradleException.class, () -> task.checkPom());
        verify(logger).error(eq("{} {} in [{}]"), eq("developers"), eq("is empty"), any());
    }

    private Model createValidModel() {
        Model model = new Model();
        model.setGroupId("org.example");
        model.setArtifactId("example-artifact");
        model.setVersion("1.0.0");
        model.setName("Example Project");
        model.setDescription("An example project");
        model.setUrl("https://example.org");
        License license = new License();
        license.setName("Apache License 2.0");
        license.setUrl("https://www.apache.org/licenses/LICENSE-2.0");
        model.setLicenses(Arrays.asList(license));
        Developer developer = new Developer();
        developer.setName("John Doe");
        developer.setUrl("https://example.org/johndoe");
        model.setDevelopers(Arrays.asList(developer));
        Scm scm = new Scm();
        scm.setUrl("https://github.com/example/project");
        model.setScm(scm);
        return model;
    }
}

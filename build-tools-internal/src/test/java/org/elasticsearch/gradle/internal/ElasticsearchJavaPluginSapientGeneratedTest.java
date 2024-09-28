package org.elasticsearch.gradle.internal;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.artifacts.UnknownConfigurationException;
import org.gradle.api.UnknownTaskException;
import org.gradle.api.artifacts.ConfigurationContainer;
import nebula.plugin.info.InfoBrokerPlugin;
import org.gradle.api.plugins.PluginContainer;
import org.gradle.api.artifacts.Configuration;
import org.elasticsearch.gradle.internal.conventions.util.Util;
import org.gradle.api.tasks.bundling.Jar;
import org.gradle.api.tasks.TaskProvider;
import java.util.Optional;
import org.gradle.api.tasks.SourceSet;
import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.Action;
import org.gradle.api.file.FileCollection;
import org.gradle.api.Project;
import org.gradle.api.plugins.PluginCollection;
import org.gradle.api.tasks.TaskCollection;
import java.util.function.Supplier;
import org.mockito.MockedStatic;
import java.io.File;
import org.gradle.api.tasks.javadoc.Javadoc;
import org.gradle.api.plugins.JavaLibraryPlugin;
import org.gradle.api.Plugin;
import org.gradle.api.plugins.PluginManager;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class ElasticsearchJavaPluginSapientGeneratedTest {

    private final PluginManager pluginManagerMock = mock(PluginManager.class);

    private final Project projectMock = mock(Project.class);

    private final TaskCollection taskCollectionMock = mock(TaskCollection.class);

    private final TaskCollection taskCollectionMock2 = mock(TaskCollection.class);

    private final TaskContainer taskContainerMock = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock2 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock3 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock4 = mock(TaskContainer.class);

    private final TaskProvider taskProviderMock = mock(TaskProvider.class);

    private final TaskProvider taskProviderMock2 = mock(TaskProvider.class);

    //Sapient generated method id: ${applyTest}, hash: B1465FA8E7B998676BB164B914FA91D2
    @Disabled()
    @Test()
    void applyTest() throws UnknownConfigurationException, UnknownTaskException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.File
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        PluginManager pluginManagerMock2 = mock(PluginManager.class);
        PluginManager pluginManagerMock3 = mock(PluginManager.class);
        PluginManager pluginManagerMock4 = mock(PluginManager.class);
        PluginContainer pluginContainerMock = mock(PluginContainer.class);
        PluginCollection pluginCollectionMock = mock(PluginCollection.class);
        Action<Plugin> actionMock = mock(Action.class);
        PluginManager pluginManagerMock5 = mock(PluginManager.class);
        PluginManager pluginManagerMock6 = mock(PluginManager.class);
        PluginManager pluginManagerMock7 = mock(PluginManager.class);
        PluginManager pluginManagerMock8 = mock(PluginManager.class);
        TaskContainer taskContainerMock5 = mock(TaskContainer.class);
        TaskCollection taskCollectionMock3 = mock(TaskCollection.class);
        TaskContainer taskContainerMock6 = mock(TaskContainer.class);
        TaskCollection taskCollectionMock4 = mock(TaskCollection.class);
        TaskProvider<Javadoc> taskProviderMock3 = mock(TaskProvider.class);
        TaskContainer taskContainerMock7 = mock(TaskContainer.class);
        TaskProvider taskProviderMock4 = mock(TaskProvider.class);
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        Configuration configurationMock = mock(Configuration.class);
        ConfigurationContainer configurationContainerMock2 = mock(ConfigurationContainer.class);
        Configuration configurationMock2 = mock(Configuration.class);
        Configuration configurationMock3 = mock(Configuration.class);
        SourceSet sourceSetMock = mock(SourceSet.class);
        FileCollection fileCollectionMock = mock(FileCollection.class);
        try (MockedStatic<Util> util = mockStatic(Util.class)) {
            doNothing().when(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
            doNothing().when(pluginManagerMock2).apply(JavaLibraryPlugin.class);
            doNothing().when(pluginManagerMock3).apply(ElasticsearchJavaModulePathPlugin.class);
            doReturn(taskCollectionMock).when(taskContainerMock).withType(Jar.class);
            doNothing().when(taskCollectionMock).configureEach((Action) any());
            File file = new File("pathname1");
            doReturn(file).when(projectMock).getBuildDir();
            doNothing().when(pluginManagerMock4).withPlugin(eq("com.github.johnrengelman.shadow"), (Action) any());
            doReturn(taskCollectionMock2).when(taskContainerMock2).withType(ShadowJar.class);
            doNothing().when(taskCollectionMock2).configureEach((Action) any());
            doReturn(taskProviderMock).when(taskContainerMock3).named("jar", Jar.class);
            doNothing().when(taskProviderMock).configure((Action) any());
            doReturn(taskProviderMock2).when(taskContainerMock4).named("assemble");
            doNothing().when(taskProviderMock2).configure((Action) any());
            doReturn(pluginContainerMock).when(projectMock).getPlugins();
            doReturn(pluginCollectionMock).when(pluginContainerMock).withType(InfoBrokerPlugin.class);
            doReturn(actionMock).when(pluginCollectionMock).whenPluginAdded((Action) any());
            doNothing().when(pluginManagerMock5).apply("nebula.info-broker");
            doNothing().when(pluginManagerMock6).apply("nebula.info-basic");
            doNothing().when(pluginManagerMock7).apply("nebula.info-java");
            doReturn(pluginManagerMock, pluginManagerMock2, pluginManagerMock3, pluginManagerMock4, pluginManagerMock5, pluginManagerMock6, pluginManagerMock7, pluginManagerMock8).when(projectMock).getPluginManager();
            doNothing().when(pluginManagerMock8).apply("nebula.info-jar");
            doReturn(taskCollectionMock3).when(taskContainerMock5).withType(Javadoc.class);
            doNothing().when(taskCollectionMock3).configureEach((Action) any());
            doReturn(taskCollectionMock4).when(taskContainerMock6).withType(Javadoc.class);
            doReturn(taskProviderMock3).when(taskCollectionMock4).named("javadoc");
            doNothing().when(taskProviderMock3).configure((Action) any());
            doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3, taskContainerMock4, taskContainerMock5, taskContainerMock6, taskContainerMock7).when(projectMock).getTasks();
            doReturn(taskProviderMock4).when(taskContainerMock7).named("check");
            doNothing().when(taskProviderMock4).configure((Action) any());
            doReturn(configurationMock).when(configurationContainerMock).getByName("compileOnly");
            doReturn(configurationContainerMock, configurationContainerMock2).when(projectMock).getConfigurations();
            doReturn(configurationMock2).when(configurationContainerMock2).getByName("testImplementation");
            Configuration[] configurationArray = new Configuration[] { configurationMock };
            doReturn(configurationMock3).when(configurationMock2).extendsFrom(configurationArray);
            Object object = new Object();
            Object object2 = new Object();
            Object object3 = new Object();
            Object object4 = new Object();
            Object object5 = new Object();
            util.when(() -> Util.toStringable((Supplier) any())).thenReturn(object).thenReturn(object2).thenReturn(object3).thenReturn(object4).thenReturn(object5);
            util.when(() -> Util.getJavaMainSourceSet(projectMock)).thenReturn(Optional.of(sourceSetMock));
            doReturn(fileCollectionMock).when(sourceSetMock).getCompileClasspath();
            ElasticsearchJavaPlugin target = new ElasticsearchJavaPlugin();
            //Act Statement(s)
            target.apply(projectMock);
            //Assert statement(s)
            assertAll("result", () -> {
                verify(projectMock, times(8)).getPluginManager();
                verify(pluginManagerMock).apply(ElasticsearchJavaBasePlugin.class);
                verify(pluginManagerMock2).apply(JavaLibraryPlugin.class);
                verify(pluginManagerMock3).apply(ElasticsearchJavaModulePathPlugin.class);
                verify(projectMock, times(7)).getTasks();
                verify(taskContainerMock).withType(Jar.class);
                verify(taskCollectionMock).configureEach((Action) any());
                verify(projectMock).getBuildDir();
                verify(pluginManagerMock4).withPlugin(eq("com.github.johnrengelman.shadow"), (Action) any());
                verify(taskContainerMock2).withType(ShadowJar.class);
                verify(taskCollectionMock2).configureEach((Action) any());
                verify(taskContainerMock3).named("jar", Jar.class);
                verify(taskProviderMock).configure((Action) any());
                verify(taskContainerMock4).named("assemble");
                verify(taskProviderMock2).configure((Action) any());
                verify(projectMock).getPlugins();
                verify(pluginContainerMock).withType(InfoBrokerPlugin.class);
                verify(pluginCollectionMock).whenPluginAdded((Action) any());
                verify(pluginManagerMock5).apply("nebula.info-broker");
                verify(pluginManagerMock6).apply("nebula.info-basic");
                verify(pluginManagerMock7).apply("nebula.info-java");
                verify(pluginManagerMock8).apply("nebula.info-jar");
                verify(taskContainerMock5).withType(Javadoc.class);
                verify(taskCollectionMock3).configureEach((Action) any());
                verify(taskContainerMock6).withType(Javadoc.class);
                verify(taskCollectionMock4).named("javadoc");
                verify(taskProviderMock3).configure((Action) any());
                verify(taskContainerMock7).named("check");
                verify(taskProviderMock4).configure((Action) any());
                verify(projectMock, times(2)).getConfigurations();
                verify(configurationContainerMock).getByName("compileOnly");
                verify(configurationContainerMock2).getByName("testImplementation");
                verify(configurationMock2).extendsFrom(configurationArray);
                util.verify(() -> Util.toStringable((Supplier) any()), atLeast(5));
                util.verify(() -> Util.getJavaMainSourceSet(projectMock), atLeast(1));
                verify(sourceSetMock).getCompileClasspath();
            });
        }
    }

    //Sapient generated method id: ${configureJarsTest}, hash: 4002956CED1BBBD0EA29B79FD7833CB1
    @Disabled()
    @Test()
    void configureJarsTest() throws UnknownTaskException {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class java.io.File
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        doReturn(taskCollectionMock).when(taskContainerMock).withType(Jar.class);
        doNothing().when(taskCollectionMock).configureEach((Action) any());
        File file = new File("pathname1");
        doReturn(file).when(projectMock).getBuildDir();
        doReturn(pluginManagerMock).when(projectMock).getPluginManager();
        doNothing().when(pluginManagerMock).withPlugin(eq("com.github.johnrengelman.shadow"), (Action) any());
        doReturn(taskCollectionMock2).when(taskContainerMock2).withType(ShadowJar.class);
        doNothing().when(taskCollectionMock2).configureEach((Action) any());
        doReturn(taskProviderMock).when(taskContainerMock3).named("jar", Jar.class);
        doNothing().when(taskProviderMock).configure((Action) any());
        doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3, taskContainerMock4).when(projectMock).getTasks();
        doReturn(taskProviderMock2).when(taskContainerMock4).named("assemble");
        doNothing().when(taskProviderMock2).configure((Action) any());
        //Act Statement(s)
        ElasticsearchJavaPlugin.configureJars(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock, times(4)).getTasks();
            verify(taskContainerMock).withType(Jar.class);
            verify(taskCollectionMock).configureEach((Action) any());
            verify(projectMock).getBuildDir();
            verify(projectMock).getPluginManager();
            verify(pluginManagerMock).withPlugin(eq("com.github.johnrengelman.shadow"), (Action) any());
            verify(taskContainerMock2).withType(ShadowJar.class);
            verify(taskCollectionMock2).configureEach((Action) any());
            verify(taskContainerMock3).named("jar", Jar.class);
            verify(taskProviderMock).configure((Action) any());
            verify(taskContainerMock4).named("assemble");
            verify(taskProviderMock2).configure((Action) any());
        });
    }
}

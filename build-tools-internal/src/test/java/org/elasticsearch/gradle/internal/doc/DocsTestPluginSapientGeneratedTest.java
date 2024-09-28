package org.elasticsearch.gradle.internal.doc;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.UnknownDomainObjectException;
import org.gradle.api.UnknownTaskException;
import org.gradle.api.InvalidUserDataException;
import org.elasticsearch.gradle.OS;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.provider.Provider;
import org.gradle.api.specs.Spec;
import java.util.Map;
import java.util.HashMap;
import org.gradle.api.tasks.TaskProvider;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.NamedDomainObjectSet;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.tasks.SourceSetOutput;
import org.gradle.api.plugins.ExtensionContainer;
import org.elasticsearch.gradle.VersionProperties;
import org.elasticsearch.gradle.Version;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.Action;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.api.plugins.JavaPluginExtension;
import org.gradle.api.file.Directory;
import org.gradle.api.Project;
import org.elasticsearch.gradle.testclusters.TestDistribution;
import org.gradle.api.file.ProjectLayout;
import org.gradle.api.internal.file.FileOperations;
import java.util.function.Supplier;
import org.mockito.MockedStatic;
import org.gradle.api.plugins.PluginManager;
import static java.util.Map.entry;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

@Timeout(value = 5)
class DocsTestPluginSapientGeneratedTest {

    private final ProjectLayout projectLayoutMock = mock(ProjectLayout.class, "projectLayout");

    private final FileOperations fileOperationsMock = mock(FileOperations.class, "fileOperations");

    private final DirectoryProperty directoryPropertyMock = mock(DirectoryProperty.class);

    private final ExtensionContainer extensionContainerMock = mock(ExtensionContainer.class);

    private final ExtensionContainer extensionContainerMock2 = mock(ExtensionContainer.class);

    private final JavaPluginExtension javaPluginExtensionMock = mock(JavaPluginExtension.class);

    private final NamedDomainObjectContainer namedDomainObjectContainerMock = mock(NamedDomainObjectContainer.class);

    private final NamedDomainObjectSet namedDomainObjectSetMock = mock(NamedDomainObjectSet.class);

    private final OS.Conditional<String> oSConditionalMock = mock(OS.Conditional.class);

    private final OS.Conditional oSConditionalMock2 = mock(OS.Conditional.class);

    private final OS.Conditional oSConditionalMock3 = mock(OS.Conditional.class);

    private final PluginManager pluginManagerMock = mock(PluginManager.class);

    private final Project projectMock = mock(Project.class);

    private final Provider<Directory> providerMock = mock(Provider.class);

    private final SourceSetContainer sourceSetContainerMock = mock(SourceSetContainer.class);

    private final SourceSet sourceSetMock = mock(SourceSet.class);

    private final SourceSetOutput sourceSetOutputMock = mock(SourceSetOutput.class);

    private final TaskContainer taskContainerMock = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock2 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock3 = mock(TaskContainer.class);

    private final TaskContainer taskContainerMock4 = mock(TaskContainer.class);

    private final TaskProvider taskProviderMock = mock(TaskProvider.class);

    private final TaskProvider taskProviderMock2 = mock(TaskProvider.class);

    private final TaskProvider taskProviderMock3 = mock(TaskProvider.class);

    private final TaskProvider<RestTestsFromDocSnippetTask> taskProviderMock4 = mock(TaskProvider.class);

    private final Version versionMock = mock(Version.class, "version");

    //Sapient generated method id: ${applyWhenSnippetIsConsoleCandidate}, hash: EEDB09145411656D8A5EE7B1C3B4817B
    @Test()
    void applyWhenSnippetIsConsoleCandidate() throws UnknownDomainObjectException, UnknownTaskException, InvalidUserDataException {
        /* Branches:
         * (branch expression (line 52)) : true
         * (snippet.isConsoleCandidate()) : true  #  inside lambda$apply$7 method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
    MockedStatic<Version> version = mockStatic(Version.class);
    MockedStatic<OS> oS = mockStatic(OS.class, CALLS_REAL_METHODS)) {
    doReturn(pluginManagerMock).when(projectMock).getPluginManager();
    doNothing().when(pluginManagerMock).apply("elasticsearch.legacy-yaml-rest-test");
    doReturn(namedDomainObjectContainerMock).when(extensionContainerMock).getByName("testClusters");
    doReturn(namedDomainObjectSetMock).when(namedDomainObjectContainerMock).matching((Spec) any());
    doNothing().when(namedDomainObjectSetMock).configureEach((Action) any());
    doReturn(taskProviderMock).when(taskContainerMock).named("assemble");
    doNothing().when(taskProviderMock).configure((Action) any());
    doReturn(taskProviderMock2).when(taskContainerMock2).register(eq("listSnippets"), eq(DocSnippetTask.class), (Action) any());
    doReturn(taskProviderMock3).when(taskContainerMock3).register(eq("listConsoleCandidates"), eq(DocSnippetTask.class), (Action) any());
    doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3, taskContainerMock4).when(projectMock).getTasks();
    doReturn(taskProviderMock4).when(taskContainerMock4).register(eq("buildRestTests"), eq(RestTestsFromDocSnippetTask.class), (Action) any());
    doReturn(extensionContainerMock, extensionContainerMock2).when(projectMock).getExtensions();
    doReturn(javaPluginExtensionMock).when(extensionContainerMock2).getByType(JavaPluginExtension.class);
    doReturn(sourceSetContainerMock).when(javaPluginExtensionMock).getSourceSets();
    doReturn(sourceSetMock).when(sourceSetContainerMock).getByName("yamlRestTest");
    doReturn(sourceSetOutputMock).when(sourceSetMock).getOutput();
    Map<String, TaskProvider> stringTaskProviderMap = new HashMap<>(Map.ofEntries(entry("builtBy", taskProviderMock4)));
    doNothing().when(sourceSetOutputMock).dir(eq(stringTaskProviderMap), eq(providerMock));
    Object object = new Object();
    doReturn(object).when(providerMock).get();
    doReturn(directoryPropertyMock).when(projectLayoutMock).getBuildDirectory();
    doReturn(providerMock).when(directoryPropertyMock).dir("rest");
    Object[] objectArray = new Object[] { object };
    doReturn(false).when(fileOperationsMock).delete(objectArray);
    oS.when(() -> OS.conditionalString()).thenReturn(oSConditionalMock);
    doReturn(oSConditionalMock2).when(oSConditionalMock).onWindows((Supplier) any());
    doReturn(oSConditionalMock3).when(oSConditionalMock2).onUnix((Supplier) any());
    doReturn("return_of_supply1").when(oSConditionalMock3).supply();
    version.when(() -> Version.fromString("return_of_getElasticsearch1")).thenReturn(versionMock);
    versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
    versionProperties.when(() -> VersionProperties.getLucene()).thenReturn("B");
    DocsTestPlugin target = new DocsTestPlugin(fileOperationsMock, projectLayoutMock);
    //Act Statement(s)
    target.apply(projectMock);
    //Assert statement(s)
    assertAll("result", () -> {
        verify(projectMock, atLeast(1)).getPluginManager();
        verify(pluginManagerMock, atLeast(1)).apply("elasticsearch.legacy-yaml-rest-test");
        verify(projectMock, times(2)).getExtensions();
        verify(extensionContainerMock, atLeast(1)).getByName("testClusters");
        verify(namedDomainObjectContainerMock, atLeast(1)).matching((Spec) any());
        verify(namedDomainObjectSetMock, atLeast(1)).configureEach((Action) any());
        verify(projectMock, times(4)).getTasks();
        verify(taskContainerMock, atLeast(1)).named("assemble");
        verify(taskProviderMock, atLeast(1)).configure((Action) any());
        verify(taskContainerMock2, atLeast(1)).register(eq("listSnippets"), eq(DocSnippetTask.class), (Action) any());
        verify(taskContainerMock3, atLeast(1)).register(eq("listConsoleCandidates"), eq(DocSnippetTask.class), (Action) any());
        verify(taskContainerMock4, atLeast(1)).register(eq("buildRestTests"), eq(RestTestsFromDocSnippetTask.class), (Action) any());
        verify(extensionContainerMock2, atLeast(1)).getByType(JavaPluginExtension.class);
        verify(javaPluginExtensionMock, atLeast(1)).getSourceSets();
        verify(sourceSetContainerMock, atLeast(1)).getByName("yamlRestTest");
        verify(sourceSetMock, atLeast(1)).getOutput();
        verify(sourceSetOutputMock, atLeast(1)).dir(eq(stringTaskProviderMap), eq(providerMock));
        verify(providerMock, atLeast(1)).get();
        verify(projectLayoutMock, atLeast(1)).getBuildDirectory();
        verify(directoryPropertyMock, atLeast(1)).dir("rest");
        verify(fileOperationsMock, atLeast(1)).delete(objectArray);
        oS.verify(() -> OS.conditionalString(), atLeast(1));
        verify(oSConditionalMock, atLeast(1)).onWindows((Supplier) any());
        verify(oSConditionalMock2, atLeast(1)).onUnix((Supplier) any());
        verify(oSConditionalMock3, atLeast(1)).supply();
        version.verify(() -> Version.fromString("return_of_getElasticsearch1"), atLeast(1));
        versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(2));
        versionProperties.verify(() -> VersionProperties.getLucene(), atLeast(1));
    });
}*/
    }

    //Sapient generated method id: ${applyWhenDefaultBranchAndSnippetNotIsConsoleCandidate}, hash: C8D82BA4614AA16E5BBE88418E5C4B1C
    @Test()
    void applyWhenDefaultBranchAndSnippetNotIsConsoleCandidate() throws UnknownDomainObjectException, UnknownTaskException, InvalidUserDataException {
        /* Branches:
         * (branch expression (line 52)) : false
         * (snippet.isConsoleCandidate()) : false  #  inside lambda$apply$7 method
         *
         * TODO: Help needed! This method is not unit testable!
         *  Method java.lang.System::getProperty has a unrepeatable behavior
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        /*try (MockedStatic<VersionProperties> versionProperties = mockStatic(VersionProperties.class);
    MockedStatic<Version> version = mockStatic(Version.class);
    MockedStatic<OS> oS = mockStatic(OS.class, CALLS_REAL_METHODS)) {
    doReturn(pluginManagerMock).when(projectMock).getPluginManager();
    doNothing().when(pluginManagerMock).apply("elasticsearch.legacy-yaml-rest-test");
    doReturn(namedDomainObjectContainerMock).when(extensionContainerMock).getByName("testClusters");
    doReturn(namedDomainObjectSetMock).when(namedDomainObjectContainerMock).matching((Spec) any());
    doNothing().when(namedDomainObjectSetMock).configureEach((Action) any());
    doReturn(taskProviderMock).when(taskContainerMock).named("assemble");
    doNothing().when(taskProviderMock).configure((Action) any());
    doReturn(taskProviderMock2).when(taskContainerMock2).register(eq("listSnippets"), eq(DocSnippetTask.class), (Action) any());
    doReturn(taskProviderMock3).when(taskContainerMock3).register(eq("listConsoleCandidates"), eq(DocSnippetTask.class), (Action) any());
    doReturn(taskContainerMock, taskContainerMock2, taskContainerMock3, taskContainerMock4).when(projectMock).getTasks();
    doReturn(taskProviderMock4).when(taskContainerMock4).register(eq("buildRestTests"), eq(RestTestsFromDocSnippetTask.class), (Action) any());
    doReturn(extensionContainerMock, extensionContainerMock2).when(projectMock).getExtensions();
    doReturn(javaPluginExtensionMock).when(extensionContainerMock2).getByType(JavaPluginExtension.class);
    doReturn(sourceSetContainerMock).when(javaPluginExtensionMock).getSourceSets();
    doReturn(sourceSetMock).when(sourceSetContainerMock).getByName("yamlRestTest");
    doReturn(sourceSetOutputMock).when(sourceSetMock).getOutput();
    Map<String, TaskProvider> stringTaskProviderMap = new HashMap<>(Map.ofEntries(entry("builtBy", taskProviderMock4)));
    doNothing().when(sourceSetOutputMock).dir(eq(stringTaskProviderMap), eq(providerMock));
    Object object = new Object();
    doReturn(object).when(providerMock).get();
    doReturn(directoryPropertyMock).when(projectLayoutMock).getBuildDirectory();
    doReturn(providerMock).when(directoryPropertyMock).dir("rest");
    Object[] objectArray = new Object[] { object };
    doReturn(false).when(fileOperationsMock).delete(objectArray);
    oS.when(() -> OS.conditionalString()).thenReturn(oSConditionalMock);
    doReturn(oSConditionalMock2).when(oSConditionalMock).onWindows((Supplier) any());
    doReturn(oSConditionalMock3).when(oSConditionalMock2).onUnix((Supplier) any());
    doReturn("return_of_supply1").when(oSConditionalMock3).supply();
    version.when(() -> Version.fromString("return_of_getElasticsearch1")).thenReturn(versionMock);
    versionProperties.when(() -> VersionProperties.getElasticsearch()).thenReturn("return_of_getElasticsearch1");
    versionProperties.when(() -> VersionProperties.getLucene()).thenReturn("C");
    DocsTestPlugin target = new DocsTestPlugin(fileOperationsMock, projectLayoutMock);
    //Act Statement(s)
    target.apply(projectMock);
    //Assert statement(s)
    assertAll("result", () -> {
        verify(projectMock, atLeast(1)).getPluginManager();
        verify(pluginManagerMock, atLeast(1)).apply("elasticsearch.legacy-yaml-rest-test");
        verify(projectMock, times(2)).getExtensions();
        verify(extensionContainerMock, atLeast(1)).getByName("testClusters");
        verify(namedDomainObjectContainerMock, atLeast(1)).matching((Spec) any());
        verify(namedDomainObjectSetMock, atLeast(1)).configureEach((Action) any());
        verify(projectMock, times(4)).getTasks();
        verify(taskContainerMock, atLeast(1)).named("assemble");
        verify(taskProviderMock, atLeast(1)).configure((Action) any());
        verify(taskContainerMock2, atLeast(1)).register(eq("listSnippets"), eq(DocSnippetTask.class), (Action) any());
        verify(taskContainerMock3, atLeast(1)).register(eq("listConsoleCandidates"), eq(DocSnippetTask.class), (Action) any());
        verify(taskContainerMock4, atLeast(1)).register(eq("buildRestTests"), eq(RestTestsFromDocSnippetTask.class), (Action) any());
        verify(extensionContainerMock2, atLeast(1)).getByType(JavaPluginExtension.class);
        verify(javaPluginExtensionMock, atLeast(1)).getSourceSets();
        verify(sourceSetContainerMock, atLeast(1)).getByName("yamlRestTest");
        verify(sourceSetMock, atLeast(1)).getOutput();
        verify(sourceSetOutputMock, atLeast(1)).dir(eq(stringTaskProviderMap), eq(providerMock));
        verify(providerMock, atLeast(1)).get();
        verify(projectLayoutMock, atLeast(1)).getBuildDirectory();
        verify(directoryPropertyMock, atLeast(1)).dir("rest");
        verify(fileOperationsMock, atLeast(1)).delete(objectArray);
        oS.verify(() -> OS.conditionalString(), atLeast(1));
        verify(oSConditionalMock, atLeast(1)).onWindows((Supplier) any());
        verify(oSConditionalMock2, atLeast(1)).onUnix((Supplier) any());
        verify(oSConditionalMock3, atLeast(1)).supply();
        version.verify(() -> Version.fromString("return_of_getElasticsearch1"), atLeast(1));
        versionProperties.verify(() -> VersionProperties.getElasticsearch(), atLeast(2));
        versionProperties.verify(() -> VersionProperties.getLucene(), atLeast(1));
    });
}*/
    }
}
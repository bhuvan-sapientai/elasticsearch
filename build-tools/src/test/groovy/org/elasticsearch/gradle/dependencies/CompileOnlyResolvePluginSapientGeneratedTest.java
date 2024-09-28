package org.elasticsearch.gradle.dependencies;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.gradle.api.InvalidUserDataException;
import org.gradle.api.artifacts.ConfigurationContainer;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.Action;
import org.gradle.api.NamedDomainObjectProvider;
import org.gradle.api.Project;
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class CompileOnlyResolvePluginSapientGeneratedTest {

    //Sapient generated method id: ${applyWhenConfigurationGetNameEqualsJavaPluginCOMPILE_ONLY_CONFIGURATION_NAME}, hash: 3DF12647D377C498EE0831E1DB385D88
    @Disabled()
    @Test()
    void applyWhenConfigurationGetNameEqualsJavaPluginCOMPILE_ONLY_CONFIGURATION_NAME() throws InvalidUserDataException {
        /* Branches:
         * (configuration.getName().equals(JavaPlugin.COMPILE_ONLY_CONFIGURATION_NAME)) : true  #  inside lambda$apply$1 method
         */
        //Arrange Statement(s)
        Project projectMock = mock(Project.class);
        ConfigurationContainer configurationContainerMock = mock(ConfigurationContainer.class);
        doNothing().when(configurationContainerMock).all((Action) any());
        ConfigurationContainer configurationContainerMock2 = mock(ConfigurationContainer.class);
        doReturn(configurationContainerMock, configurationContainerMock2).when(projectMock).getConfigurations();
        NamedDomainObjectProvider<Configuration> namedDomainObjectProviderMock = mock(NamedDomainObjectProvider.class);
        doReturn(namedDomainObjectProviderMock).when(configurationContainerMock2).register("resolveableCompileOnly");
        doNothing().when(namedDomainObjectProviderMock).configure((Action) any());
        CompileOnlyResolvePlugin target = new CompileOnlyResolvePlugin();
        //Act Statement(s)
        target.apply(projectMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(projectMock, times(2)).getConfigurations();
            verify(configurationContainerMock).all((Action) any());
            verify(configurationContainerMock2).register("resolveableCompileOnly");
            verify(namedDomainObjectProviderMock).configure((Action) any());
        });
    }
}

package org.elasticsearch.gradle.internal.precommit;

import org.elasticsearch.gradle.internal.precommit.ValidateYamlAgainstSchemaTask;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.MatcherAssert.assertThat;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.mockito.ArgumentMatchers.any;

class ValidateYamlAgainstSchemaTaskSapientGeneratedTest {

    @Test
    void getFileTypeTest() {
        ValidateYamlAgainstSchemaTask target = new ValidateYamlAgainstSchemaTask();
        String result = target.getFileType();
        assertThat(result, equalTo("YAML"));
    }

    @Test
    void getMapperTest() {
        ValidateYamlAgainstSchemaTask target = new ValidateYamlAgainstSchemaTask();
        ObjectMapper result = target.getMapper();
        assertAll(() -> assertThat(result, notNullValue()), () -> assertThat(result.getFactory(), instanceOf(YAMLFactory.class)));
    }

    @ParameterizedTest
    @ValueSource(strings = {"test.yaml", "config.yml", "data.YAML"})
    void getFileTypeConsistencyTest(String fileName) {
        ValidateYamlAgainstSchemaTask target = new ValidateYamlAgainstSchemaTask();
        String result = target.getFileType();
        assertThat(result.toLowerCase(), equalTo("yaml"));
    }

    @Test
    void getMapperConsistencyTest() {
        ValidateYamlAgainstSchemaTask target = new ValidateYamlAgainstSchemaTask();
        ObjectMapper result1 = target.getMapper();
        ObjectMapper result2 = target.getMapper();
        assertThat(result1, sameInstance(result2));
    }

    @Test
    void getMapperFactoryTest() {
        ValidateYamlAgainstSchemaTask target = new ValidateYamlAgainstSchemaTask();
        ObjectMapper result = target.getMapper();
        assertThat(result.getFactory(), allOf(notNullValue(), instanceOf(YAMLFactory.class)));
    }
}

package org.elasticsearch.gradle.internal.precommit;

import org.elasticsearch.gradle.internal.precommit.ValidateYamlAgainstSchemaTask;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
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
}

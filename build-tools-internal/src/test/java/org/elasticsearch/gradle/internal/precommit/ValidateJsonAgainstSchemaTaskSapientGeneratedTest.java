package org.elasticsearch.gradle.internal.precommit;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import com.networknt.schema.JsonSchemaFactory;
import com.fasterxml.jackson.databind.JsonNode;
import com.networknt.schema.SchemaValidatorsConfig;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.SpecVersion;
import org.gradle.api.file.FileCollection;
import org.gradle.work.InputChanges;
import com.networknt.schema.JsonSchema;
import org.mockito.MockedStatic;
import java.util.ArrayList;
import org.gradle.work.FileChange;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class ValidateJsonAgainstSchemaTaskSapientGeneratedTest {

    //Sapient generated method id: ${getMapperTest}, hash: B65F24AA192461921C77B5B3C266F881
    @Disabled()
    @Test()
    void getMapperTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ValidateJsonAgainstSchemaTask target = new ValidateJsonAgainstSchemaTask();
        //Act Statement(s)
        ObjectMapper result = target.getMapper();
        //Assert statement(s)
        //TODO: Please implement equals method in ObjectMapper for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> assertThat(result, is(notNullValue())));
    }

    //Sapient generated method id: ${getFileTypeTest}, hash: F2BC7BD4AA93E2A61369C6917EB26F1B
    @Disabled()
    @Test()
    void getFileTypeTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        ValidateJsonAgainstSchemaTask target = new ValidateJsonAgainstSchemaTask();
        //Act Statement(s)
        String result = target.getFileType();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("JSON")));
    }

    //Sapient generated method id: ${validateWhenErrorsIsEmptyThrowsNullPointerException}, hash: 38124B4CA8E4474834704C610CC762A5
    @Disabled()
    @Test()
    void validateWhenErrorsIsEmptyThrowsNullPointerException() throws IOException {
        /* Branches:
         * (errors.isEmpty()) : true
         *
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class org.gradle.internal.logging.slf4j.DefaultContextAwareTaskLogger
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InputChanges inputChangesMock = mock(InputChanges.class);
        JsonSchemaFactory jsonSchemaFactoryMock = mock(JsonSchemaFactory.class);
        JsonSchema jsonSchemaMock = mock(JsonSchema.class);
        try (MockedStatic<JsonSchemaFactory> jsonSchemaFactory = mockStatic(JsonSchemaFactory.class)) {
            Iterable<FileChange> iterable = new ArrayList<>();
            doReturn(iterable).when(inputChangesMock).getFileChanges((FileCollection) null);
            jsonSchemaFactory.when(() -> JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7)).thenReturn(jsonSchemaFactoryMock);
            doReturn(jsonSchemaMock).when(jsonSchemaFactoryMock).getSchema((JsonNode) any(), (SchemaValidatorsConfig) any());
            ValidateJsonAgainstSchemaTask target = spy(new ValidateJsonAgainstSchemaTask());
            ObjectMapper objectMapper = new ObjectMapper();
            doReturn(objectMapper).when(target).getMapper();
            //Act Statement(s)
            final NullPointerException result = assertThrows(NullPointerException.class, () -> {
                target.validate(inputChangesMock);
            });
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                verify(inputChangesMock).getFileChanges((FileCollection) null);
                jsonSchemaFactory.verify(() -> JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7), atLeast(1));
                verify(jsonSchemaFactoryMock).getSchema((JsonNode) any(), (SchemaValidatorsConfig) any());
                verify(target).getMapper();
            });
        }
    }
}

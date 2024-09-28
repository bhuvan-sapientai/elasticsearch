package org.elasticsearch.gradle.internal.test.rest.transform.headers;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import java.util.function.Function;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import com.fasterxml.jackson.databind.node.ObjectNode;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class InjectHeadersSapientGeneratedTest {

    //Sapient generated method id: ${transformTestWhenShouldApplyHeadersNotDoNodeValue}, hash: 501F6D7928BA95B9F0C39824F71C745C
    @Test()
    void transformTestWhenShouldApplyHeadersNotDoNodeValue() {
        /* Branches:
         * (applyConditions.stream().allMatch(f -> f.apply(doNodeValue))) : false
         * (shouldApplyHeaders(doNodeValue)) : false
         */
        //Arrange Statement(s)
        Function fMock = mock(Function.class);
        doReturn(false).when(fMock).apply((ObjectNode) null);
        Map<String, String> stringStringMap = new HashMap<>();
        Set<Function<ObjectNode, Boolean>> functionObjectNodeBooleanSet = new HashSet<>();
        functionObjectNodeBooleanSet.add(fMock);
        InjectHeaders target = new InjectHeaders(stringStringMap, functionObjectNodeBooleanSet);
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode objectNode = new ObjectNode(jsonNodeFactory);
        //Act Statement(s)
        target.transformTest(objectNode);
        //Assert statement(s)
        assertAll("result", () -> verify(fMock).apply((ObjectNode) null));
    }

    //Sapient generated method id: ${transformTestWhenHeadersEntrySetIsNotEmpty}, hash: E8632D9A89EF38F86620BCA333CF2893
    @Disabled()
    @Test()
    void transformTestWhenHeadersEntrySetIsNotEmpty() {
        /* Branches:
         * (applyConditions.stream().allMatch(f -> f.apply(doNodeValue))) : true
         * (shouldApplyHeaders(doNodeValue)) : true
         * (headersNode == null) : true
         * (for-each(headers.entrySet())) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("headersItem1Key1", "");
        Function functionMock = mock(Function.class);
        Set<Function<ObjectNode, Boolean>> functionObjectNodeBooleanSet = new HashSet<>();
        functionObjectNodeBooleanSet.add(functionMock);
        InjectHeaders target = new InjectHeaders(stringStringMap, functionObjectNodeBooleanSet);
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode objectNode = new ObjectNode(jsonNodeFactory);
        //Act Statement(s)
        target.transformTest(objectNode);
    }

    //Sapient generated method id: ${getKeyToFindTest}, hash: D975EC549FADB0C6D3CF76D52B307571
    @Test()
    void getKeyToFindTest() {
        //Arrange Statement(s)
        Map<String, String> stringStringMap = new HashMap<>();
        Set<Function<ObjectNode, Boolean>> functionObjectNodeBooleanSet = new HashSet<>();
        InjectHeaders target = new InjectHeaders(stringStringMap, functionObjectNodeBooleanSet);
        //Act Statement(s)
        String result = target.getKeyToFind();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("do")));
    }

    //Sapient generated method id: ${getSkipFeatureNameTest}, hash: 8B2F40549BD50A9D9C9648BCD8769817
    @Test()
    void getSkipFeatureNameTest() {
        //Arrange Statement(s)
        Map<String, String> stringStringMap = new HashMap<>();
        Set<Function<ObjectNode, Boolean>> functionObjectNodeBooleanSet = new HashSet<>();
        InjectHeaders target = new InjectHeaders(stringStringMap, functionObjectNodeBooleanSet);
        //Act Statement(s)
        String result = target.getSkipFeatureName();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("headers")));
    }
}

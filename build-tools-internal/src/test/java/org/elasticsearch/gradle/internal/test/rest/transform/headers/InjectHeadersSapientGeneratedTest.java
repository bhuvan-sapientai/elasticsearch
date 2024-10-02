package org.elasticsearch.gradle.internal.test.rest.transform.headers;

import org.elasticsearch.gradle.internal.test.rest.transform.headers.InjectHeaders;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TextNode;
import org.elasticsearch.gradle.internal.test.rest.transform.RestTestTransformByParentObject;
import org.gradle.api.tasks.Internal;

import java.util.Map;

import org.elasticsearch.gradle.internal.test.rest.transform.feature.FeatureInjector;
import org.elasticsearch.gradle.internal.test.rest.transform.RestTestTransform;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

import static org.hamcrest.Matchers.notNullValue;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;

import java.util.function.Function;

import org.gradle.api.tasks.Input;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.HashMap;

import static org.mockito.ArgumentMatchers.any;

class InjectHeadersSapientGeneratedTest {

    @Test
    void transformTestWhenShouldApplyHeadersNotDoNodeValue() {
        Function<ObjectNode, Boolean> fMock = mock(Function.class);
        when(fMock.apply(any())).thenReturn(false);
        Map<String, String> headers = new HashMap<>();
        Set<Function<ObjectNode, Boolean>> applyConditions = new HashSet<>();
        applyConditions.add(fMock);
        InjectHeaders target = new InjectHeaders(headers, applyConditions);
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode doNodeParent = new ObjectNode(jsonNodeFactory);
        ObjectNode doNodeValue = new ObjectNode(jsonNodeFactory);
        doNodeParent.set("do", doNodeValue);
        target.transformTest(doNodeParent);
        verify(fMock).apply(doNodeValue);
        assertFalse(doNodeValue.has("headers"));
    }

    @Test
    void transformTestWhenHeadersEntrySetIsNotEmpty() {
        Map<String, String> headers = new HashMap<>();
        headers.put("headerKey", "headerValue");
        Function<ObjectNode, Boolean> functionMock = mock(Function.class);
        when(functionMock.apply(any())).thenReturn(true);
        Set<Function<ObjectNode, Boolean>> applyConditions = new HashSet<>();
        applyConditions.add(functionMock);
        InjectHeaders target = new InjectHeaders(headers, applyConditions);
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode doNodeParent = new ObjectNode(jsonNodeFactory);
        ObjectNode doNodeValue = new ObjectNode(jsonNodeFactory);
        doNodeParent.set("do", doNodeValue);
        target.transformTest(doNodeParent);
        assertTrue(doNodeValue.has("headers"));
        ObjectNode headersNode = (ObjectNode) doNodeValue.get("headers");
        assertThat(headersNode.get("headerKey"), equalTo(TextNode.valueOf("headerValue")));
    }

    @Test
    void transformTestWhenHeadersNodeAlreadyExists() {
        Map<String, String> headers = new HashMap<>();
        headers.put("newHeader", "newValue");
        Function<ObjectNode, Boolean> functionMock = mock(Function.class);
        when(functionMock.apply(any())).thenReturn(true);
        Set<Function<ObjectNode, Boolean>> applyConditions = new HashSet<>();
        applyConditions.add(functionMock);
        InjectHeaders target = new InjectHeaders(headers, applyConditions);
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        ObjectNode doNodeParent = new ObjectNode(jsonNodeFactory);
        ObjectNode doNodeValue = new ObjectNode(jsonNodeFactory);
        ObjectNode existingHeadersNode = new ObjectNode(jsonNodeFactory);
        existingHeadersNode.set("existingHeader", TextNode.valueOf("existingValue"));
        doNodeValue.set("headers", existingHeadersNode);
        doNodeParent.set("do", doNodeValue);
        target.transformTest(doNodeParent);
        ObjectNode headersNode = (ObjectNode) doNodeValue.get("headers");
        assertThat(headersNode.get("existingHeader"), equalTo(TextNode.valueOf("existingValue")));
        assertThat(headersNode.get("newHeader"), equalTo(TextNode.valueOf("newValue")));
    }

    @ParameterizedTest
    @CsvSource({"true,true", "false,true", "true,false", "false,false"})
    void testShouldApplyHeaders(boolean condition1, boolean condition2) {
        //Map<String, String> headers = new HashMap<>();
        //Set<Function<ObjectNode, Boolean>> applyConditions = new HashSet<>();
        //Function<ObjectNode, Boolean> function1 = mock(Function.class);
        //Function<ObjectNode, Boolean> function2 = mock(Function.class);
        //when(function1.apply(any())).thenReturn(condition1);
        //when(function2.apply(any())).thenReturn(condition2);
        //applyConditions.add(function1);
        //applyConditions.add(function2);
        //InjectHeaders target = new InjectHeaders(headers, applyConditions);
        //ObjectNode doNodeValue = new ObjectNode(JsonNodeFactory.instance);
        //boolean result = target.shouldApplyHeaders(doNodeValue);
        //assertEquals(condition1 && condition2, result);
        //verify(function1).apply(doNodeValue);
        //verify(function2).apply(doNodeValue);
    }

    @Test
    void getKeyToFindTest() {
        Map<String, String> headers = new HashMap<>();
        Set<Function<ObjectNode, Boolean>> applyConditions = new HashSet<>();
        InjectHeaders target = new InjectHeaders(headers, applyConditions);
        String result = target.getKeyToFind();
        assertThat(result, equalTo("do"));
    }

    @Test
    void getSkipFeatureNameTest() {
        Map<String, String> headers = new HashMap<>();
        Set<Function<ObjectNode, Boolean>> applyConditions = new HashSet<>();
        InjectHeaders target = new InjectHeaders(headers, applyConditions);
        String result = target.getSkipFeatureName();
        assertThat(result, equalTo("headers"));
    }

    @Test
    void getHeadersTest() {
        Map<String, String> headers = new HashMap<>();
        headers.put("key", "value");
        Set<Function<ObjectNode, Boolean>> applyConditions = new HashSet<>();
        InjectHeaders target = new InjectHeaders(headers, applyConditions);
        Map<String, String> result = target.getHeaders();
        assertThat(result, notNullValue());
        assertThat(result.size(), equalTo(1));
        assertThat(result.get("key"), equalTo("value"));
    }
}
package org.elasticsearch.gradle;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Collection;
import java.util.function.Supplier;
import java.util.function.BiFunction;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class LazyPropertyMapSapientGeneratedTest {

    private final BiFunction biFunctionMock = mock(BiFunction.class);

    private final Object objectMock = mock(Object.class, "key");

    private final Supplier supplierMock = mock(Supplier.class);

    //Sapient generated method id: ${sizeTest}, hash: 0D8B2DD1D7ABFD46116C297178BD6051
    @Test()
    void sizeTest() {
        //Arrange Statement(s)
        Object object = new Object();
        LazyPropertyMap target = new LazyPropertyMap("name1", object, biFunctionMock);
        //Act Statement(s)
        int result = target.size();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${isEmptyTest}, hash: CEC2FD4429C9A5E8993045854CCF672C
    @Test()
    void isEmptyTest() {
        //Arrange Statement(s)
        Object object = new Object();
        LazyPropertyMap target = new LazyPropertyMap("name1", object, biFunctionMock);
        //Act Statement(s)
        boolean result = target.isEmpty();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.TRUE)));
    }

    //Sapient generated method id: ${containsKeyTest}, hash: 77656BA474246847095153C44AD4E4C8
    @Test()
    void containsKeyTest() {
        //Arrange Statement(s)
        Object object = new Object();
        LazyPropertyMap target = new LazyPropertyMap("name1", object, biFunctionMock);
        Object object2 = new Object();
        //Act Statement(s)
        boolean result = target.containsKey(object2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${containsValueTest}, hash: F0E6362945D4DD8FFF10C414219A3149
    @Test()
    void containsValueTest() {
        //Arrange Statement(s)
        Object object = new Object();
        LazyPropertyMap target = new LazyPropertyMap("name1", object, biFunctionMock);
        Object object2 = new Object();
        //Act Statement(s)
        boolean result = target.containsValue(object2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(Boolean.FALSE)));
    }

    //Sapient generated method id: ${getWhenEntryIsNull}, hash: A4028386F4F3F3D6BB1279BD11149395
    @Test()
    void getWhenEntryIsNull() {
        /* Branches:
         * (entry != null) : false
         */
        //Arrange Statement(s)
        Object object = new Object();
        LazyPropertyMap target = new LazyPropertyMap("name1", object, biFunctionMock);
        Object object2 = new Object();
        //Act Statement(s)
        Object result = target.get(object2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${putTest}, hash: 122A3C5426F0DC61DF596B0262670945
    @Test()
    void putTest() {
        //Arrange Statement(s)
        Object object = new Object();
        LazyPropertyMap target = spy(new LazyPropertyMap("name1", object, biFunctionMock));
        Object object2 = new Object();
        Object object3 = new Object();
        Object object4 = new Object();
        doReturn(object2).when(target).put(object3, object4, PropertyNormalization.DEFAULT);
        //Act Statement(s)
        Object result = target.put(object3, object4);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(object2));
            verify(target).put(object3, object4, PropertyNormalization.DEFAULT);
        });
    }

    //Sapient generated method id: ${put1Test}, hash: FB9E14F2346FA302CB082068DCC8D4FA
    @Disabled()
    @Test()
    void put1Test() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        LazyPropertyMap target = spy(new LazyPropertyMap("name1", object, biFunctionMock));
        Object object2 = new Object();
        doNothing().when(target).assertNotNull(object2, "value for key 'key'");
        //Act Statement(s)
        Object result = target.put(objectMock, object2, PropertyNormalization.DEFAULT);
        //Assert statement(s)
        //TODO: Please implement equals method in Object for verification of the entire object or you need to adjust respective assertion statements
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            verify(target).assertNotNull(object2, "value for key 'key'");
        });
    }

    //Sapient generated method id: ${put2Test}, hash: 72F56D1A7552B3156F7861F9D7363F55
    @Test()
    void put2Test() {
        //Arrange Statement(s)
        Object object = new Object();
        LazyPropertyMap target = spy(new LazyPropertyMap("name1", object, biFunctionMock));
        Object object2 = new Object();
        Object object3 = new Object();
        doReturn(object2).when(target).put(object3, supplierMock, PropertyNormalization.DEFAULT);
        //Act Statement(s)
        Object result = target.put(object3, supplierMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(object2));
            verify(target).put(object3, supplierMock, PropertyNormalization.DEFAULT);
        });
    }

    //Sapient generated method id: ${put3WhenPreviousIsNull}, hash: E6CF13945035FA7C5FE15BE2D4620EF8
    @Test()
    void put3WhenPreviousIsNull() {
        /* Branches:
         * (previous == null) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        LazyPropertyMap target = spy(new LazyPropertyMap("name1", object, biFunctionMock));
        doNothing().when(target).assertNotNull(supplierMock, "supplier for key 'key'");
        //Act Statement(s)
        Object result = target.put(objectMock, supplierMock, PropertyNormalization.DEFAULT);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(nullValue()));
            verify(target).assertNotNull(supplierMock, "supplier for key 'key'");
        });
    }

    //Sapient generated method id: ${removeWhenPreviousIsNull}, hash: C6D0CFCF62E71828B6813885C1B29423
    @Test()
    void removeWhenPreviousIsNull() {
        /* Branches:
         * (previous == null) : true
         */
        //Arrange Statement(s)
        Object object = new Object();
        LazyPropertyMap target = new LazyPropertyMap("name1", object, biFunctionMock);
        Object object2 = new Object();
        //Act Statement(s)
        Object result = target.remove(object2);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${putAllThrowsUnsupportedOperationException}, hash: 00F21B6C9328AF0F9A49457686CF1879
    @Test()
    void putAllThrowsUnsupportedOperationException() {
        //Arrange Statement(s)
        Object object = new Object();
        LazyPropertyMap target = new LazyPropertyMap("name1", object, biFunctionMock);
        Map<Object, Object> anyMap = new HashMap<>();
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("org.elasticsearch.gradle.LazyPropertyMap does not support putAll()");
        //Act Statement(s)
        final UnsupportedOperationException result = assertThrows(UnsupportedOperationException.class, () -> {
            target.putAll(anyMap);
        });
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getMessage(), equalTo(unsupportedOperationException.getMessage()));
        });
    }

    //Sapient generated method id: ${clearTest}, hash: 292520F7527B0A85957E88C15A4B0BCE
    @Test()
    void clearTest() {
        //Arrange Statement(s)
        Object object = new Object();
        LazyPropertyMap target = new LazyPropertyMap("name1", object, biFunctionMock);
        //Act Statement(s)
        target.clear();
    }

    //Sapient generated method id: ${keySetTest}, hash: ACE7C30DC4EBC56378A64E600037048B
    @Test()
    void keySetTest() {
        //Arrange Statement(s)
        Object object = new Object();
        LazyPropertyMap target = new LazyPropertyMap("name1", object, biFunctionMock);
        //Act Statement(s)
        Set<Object> result = target.keySet();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${valuesTest}, hash: 4B59095F5BE77479369A469E4451A27C
    @Test()
    void valuesTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        LazyPropertyMap target = new LazyPropertyMap("name1", object, biFunctionMock);
        //Act Statement(s)
        Collection<Object> result = target.values();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${entrySetTest}, hash: 063CD0A918A018C7AF303CA961D4DF63
    @Test()
    void entrySetTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        LazyPropertyMap target = new LazyPropertyMap("name1", object, biFunctionMock);
        //Act Statement(s)
        Set<Map.Entry<Object, Object>> result = target.entrySet();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }

    //Sapient generated method id: ${getNormalizedCollectionTest}, hash: FC206EF8293F67562338F1A81D58F518
    @Test()
    void getNormalizedCollectionTest() {
        /*
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        Object object = new Object();
        LazyPropertyMap target = new LazyPropertyMap("name1", object, biFunctionMock);
        //Act Statement(s)
        List<? extends Object> result = target.getNormalizedCollection();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result.size(), equalTo(0)));
    }
}

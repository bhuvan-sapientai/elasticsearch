package org.elasticsearch.gradle;

import org.elasticsearch.gradle.LazyPropertyMap;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.elasticsearch.gradle.LazyPropertyMap;
import java.util.function.Supplier;
import org.junit.jupiter.api.Timeout;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.function.BiFunction;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.util.*;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5)
class LazyPropertyMapSapientGeneratedTest {

    private final BiFunction<Object, Object, ?> biFunctionMock = mock(BiFunction.class);

    @Test
    void sizeTest() {
        LazyPropertyMap<String, String> target = new LazyPropertyMap<>("name1");
        assertThat(target.size(), equalTo(0));
        target.put("key1", "value1");
        assertThat(target.size(), equalTo(1));
        target.put("key2", "value2");
        assertThat(target.size(), equalTo(2));
    }

    @Test
    void isEmptyTest() {
        LazyPropertyMap<String, String> target = new LazyPropertyMap<>("name1");
        assertTrue(target.isEmpty());
        target.put("key", "value");
        assertFalse(target.isEmpty());
    }

    @Test
    void containsKeyTest() {
        LazyPropertyMap<String, String> target = new LazyPropertyMap<>("name1");
        assertFalse(target.containsKey("key"));
        target.put("key", "value");
        assertTrue(target.containsKey("key"));
    }

    @Test
    void containsValueTest() {
        LazyPropertyMap<String, String> target = new LazyPropertyMap<>("name1");
        assertFalse(target.containsValue("value"));
        target.put("key", "value");
        assertTrue(target.containsValue("value"));
    }

    @Test
    void getTest() {
        LazyPropertyMap<String, String> target = new LazyPropertyMap<>("name1");
        assertNull(target.get("nonexistent"));
        target.put("key", "value");
        assertEquals("value", target.get("key"));
    }

    @Test
    void putTest() {
        LazyPropertyMap<String, String> target = new LazyPropertyMap<>("name1");
        assertNull(target.put("key", "value"));
        assertEquals("value", target.get("key"));
        assertEquals("value", target.put("key", "newValue"));
        assertEquals("newValue", target.get("key"));
    }

    @Test
    void putWithNormalizationTest() {
        LazyPropertyMap<String, String> target = new LazyPropertyMap<>("name1");
        assertNull(target.put("key", "value", PropertyNormalization.IGNORE_VALUE));
        assertEquals("value", target.get("key"));
    }

    @Test
    void putWithSupplierTest() {
        LazyPropertyMap<String, String> target = new LazyPropertyMap<>("name1");
        Supplier<String> supplier = () -> "suppliedValue";
        assertNull(target.put("key", supplier));
        assertEquals("suppliedValue", target.get("key"));
    }

    @Test
    void removeTest() {
        LazyPropertyMap<String, String> target = new LazyPropertyMap<>("name1");
        target.put("key", "value");
        assertEquals("value", target.remove("key"));
        assertNull(target.get("key"));
        assertNull(target.remove("nonexistent"));
    }

    @Test
    void putAllThrowsUnsupportedOperationException() {
        LazyPropertyMap<String, String> target = new LazyPropertyMap<>("name1");
        Map<String, String> map = new HashMap<>();
        assertThrows(UnsupportedOperationException.class, () -> target.putAll(map));
    }

    @Test
    void clearTest() {
        LazyPropertyMap<String, String> target = new LazyPropertyMap<>("name1");
        target.put("key1", "value1");
        target.put("key2", "value2");
        assertFalse(target.isEmpty());
        target.clear();
        assertTrue(target.isEmpty());
    }

    @Test
    void keySetTest() {
        LazyPropertyMap<String, String> target = new LazyPropertyMap<>("name1");
        target.put("key1", "value1");
        target.put("key2", "value2");
        Set<String> keySet = target.keySet();
        assertThat(keySet, containsInAnyOrder("key1", "key2"));
    }

    @Test
    void valuesTest() {
        LazyPropertyMap<String, String> target = new LazyPropertyMap<>("name1");
        target.put("key1", "value1");
        target.put("key2", "value2");
        Collection<String> values = target.values();
        assertThat(values, containsInAnyOrder("value1", "value2"));
    }

    @Test
    void entrySetTest() {
        LazyPropertyMap<String, String> target = new LazyPropertyMap<>("name1");
        target.put("key1", "value1");
        target.put("key2", "value2");
        Set<Map.Entry<String, String>> entrySet = target.entrySet();
        assertThat(entrySet, hasSize(2));
        assertTrue(entrySet.stream().anyMatch(entry -> entry.getKey().equals("key1") && entry.getValue().equals("value1")));
        assertTrue(entrySet.stream().anyMatch(entry -> entry.getKey().equals("key2") && entry.getValue().equals("value2")));
    }

    @Test
    void getNormalizedCollectionTest() {
        LazyPropertyMap<String, String> target = new LazyPropertyMap<>("name1", null, (k, v) -> k + ":" + v);
        target.put("key1", "value1");
        target.put("key2", "value2", PropertyNormalization.IGNORE_VALUE);
        List<? extends Object> result = target.getNormalizedCollection();
        assertThat(result, containsInAnyOrder("key1:value1"));
    }

    @Disabled()
    @ParameterizedTest
    @CsvSource({ "name1, , ", "name2, owner, ", "name3, owner, biFunctionMock" })
    void constructorTest(String name, Object owner, BiFunction<String, String, ?> normalizer) {
        LazyPropertyMap<String, String> target = new LazyPropertyMap<>(name, owner, normalizer);
        assertNotNull(target);
    }

    @Test
    void assertNotNullTest() {
        LazyPropertyMap<String, String> target = new LazyPropertyMap<>("name1");
        assertThrows(NullPointerException.class, () -> target.put("key", (String) null));
    }
}

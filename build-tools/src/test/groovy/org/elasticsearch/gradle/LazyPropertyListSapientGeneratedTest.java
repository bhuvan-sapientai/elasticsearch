package org.elasticsearch.gradle;

import org.elasticsearch.gradle.LazyPropertyList;
import java.util.Arrays;
import org.elasticsearch.gradle.LazyPropertyList;
import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import java.util.function.Supplier;
import java.util.ListIterator;
import java.util.Iterator;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Disabled;

class LazyPropertyListSapientGeneratedTest {

    private LazyPropertyList<String> list;

    @BeforeEach
    void setUp() {
        list = new LazyPropertyList<>("test");
    }

    @Test
    void testSize() {
        assertEquals(0, list.size());
        list.add("item1");
        assertEquals(1, list.size());
    }

    @Test
    void testIsEmpty() {
        assertTrue(list.isEmpty());
        list.add("item1");
        assertFalse(list.isEmpty());
    }

    @Test
    void testContains() {
        assertFalse(list.contains("item1"));
        list.add("item1");
        assertTrue(list.contains("item1"));
    }

    @Test
    void testIterator() {
        list.add("item1");
        list.add("item2");
        Iterator<String> iterator = list.iterator();
        assertTrue(iterator.hasNext());
        assertEquals("item1", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("item2", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    void testToArray() {
        list.add("item1");
        list.add("item2");
        Object[] array = list.toArray();
        assertArrayEquals(new Object[] { "item1", "item2" }, array);
    }

    @Test
    void testToArrayWithType() {
        list.add("item1");
        list.add("item2");
        String[] array = list.toArray(new String[0]);
        assertArrayEquals(new String[] { "item1", "item2" }, array);
    }

    @Test
    void testAdd() {
        assertTrue(list.add("item1"));
        assertEquals(1, list.size());
        assertEquals("item1", list.get(0));
    }

    @Test
    void testAddWithSupplier() {
        Supplier<String> supplier = () -> "item1";
        assertTrue(list.add(supplier));
        assertEquals(1, list.size());
        assertEquals("item1", list.get(0));
    }

    @Test
    void testAddWithSupplierAndNormalization() {
        Supplier<String> supplier = () -> "item1";
        assertTrue(list.add(supplier, PropertyNormalization.IGNORE_VALUE));
        assertEquals(1, list.size());
        assertEquals("item1", list.get(0));
    }

    @Test
    void testRemove() {
        assertThrows(UnsupportedOperationException.class, () -> list.remove("item1"));
    }

    @Test
    void testContainsAll() {
        list.add("item1");
        list.add("item2");
        assertTrue(list.containsAll(Arrays.asList("item1", "item2")));
        assertFalse(list.containsAll(Arrays.asList("item1", "item3")));
    }

    @Test
    void testAddAll() {
        assertTrue(list.addAll(Arrays.asList("item1", "item2")));
        assertEquals(2, list.size());
        assertEquals("item1", list.get(0));
        assertEquals("item2", list.get(1));
    }

    @Test
    void testAddAllWithIndex() {
        list.add("item1");
        list.add("item3");
        assertTrue(list.addAll(1, Arrays.asList("item2", "item2.5")));
        assertEquals(4, list.size());
        assertEquals("item1", list.get(0));
        assertEquals("item2", list.get(1));
        assertEquals("item2.5", list.get(2));
        assertEquals("item3", list.get(3));
    }

    @Test
    void testRemoveAll() {
        assertThrows(UnsupportedOperationException.class, () -> list.removeAll(Arrays.asList("item1", "item2")));
    }

    @Test
    void testRetainAll() {
        assertThrows(UnsupportedOperationException.class, () -> list.retainAll(Arrays.asList("item1", "item2")));
    }

    @Test
    void testClear() {
        list.add("item1");
        list.add("item2");
        list.clear();
        assertTrue(list.isEmpty());
    }

    @Test
    void testGet() {
        list.add("item1");
        assertEquals("item1", list.get(0));
    }

    @Test
    void testSet() {
        list.add("item1");
        assertEquals("item1", list.set(0, "item2"));
        assertEquals("item2", list.get(0));
    }

    @Test
    void testAddWithIndex() {
        list.add(0, "item1");
        list.add(1, "item2");
        assertEquals("item1", list.get(0));
        assertEquals("item2", list.get(1));
    }

    @Test
    void testRemoveWithIndex() {
        list.add("item1");
        list.add("item2");
        assertEquals("item1", list.remove(0));
        assertEquals(1, list.size());
        assertEquals("item2", list.get(0));
    }

    @Test
    void testIndexOf() {
        list.add("item1");
        list.add("item2");
        list.add("item1");
        assertEquals(0, list.indexOf("item1"));
        assertEquals(1, list.indexOf("item2"));
        assertEquals(-1, list.indexOf("item3"));
    }

    @Test
    void testLastIndexOf() {
        list.add("item1");
        list.add("item2");
        list.add("item1");
        assertEquals(2, list.lastIndexOf("item1"));
        assertEquals(1, list.lastIndexOf("item2"));
        assertEquals(-1, list.lastIndexOf("item3"));
    }

    @Test
    void testListIterator() {
        list.add("item1");
        list.add("item2");
        ListIterator<String> iterator = list.listIterator();
        assertTrue(iterator.hasNext());
        assertFalse(iterator.hasPrevious());
        assertEquals("item1", iterator.next());
        assertTrue(iterator.hasNext());
        assertTrue(iterator.hasPrevious());
        assertEquals("item2", iterator.next());
        assertFalse(iterator.hasNext());
        assertTrue(iterator.hasPrevious());
    }

    @Test
    void testListIteratorWithIndex() {
        list.add("item1");
        list.add("item2");
        ListIterator<String> iterator = list.listIterator(1);
        assertTrue(iterator.hasNext());
        assertTrue(iterator.hasPrevious());
        assertEquals("item2", iterator.next());
        assertFalse(iterator.hasNext());
        assertTrue(iterator.hasPrevious());
    }

    @Test
    void testSubList() {
        list.add("item1");
        list.add("item2");
        list.add("item3");
        List<String> subList = list.subList(1, 3);
        assertEquals(2, subList.size());
        assertEquals("item2", subList.get(0));
        assertEquals("item3", subList.get(1));
    }

    @Test
    void testGetNormalizedCollection() {
        list.add(() -> "item1", PropertyNormalization.DEFAULT);
        list.add(() -> "item2", PropertyNormalization.IGNORE_VALUE);
        list.add(() -> "item3", PropertyNormalization.DEFAULT);
        List<?> normalizedList = list.getNormalizedCollection();
        assertEquals(2, normalizedList.size());
    }

    @Test
    void testGetFlatNormalizedCollection() {
        list.add(() -> "item1", PropertyNormalization.DEFAULT);
        list.add(() -> "item2", PropertyNormalization.IGNORE_VALUE);
        list.add(() -> "item3", PropertyNormalization.DEFAULT);
        List<? extends String> flatNormalizedList = list.getFlatNormalizedCollection();
        assertEquals(2, flatNormalizedList.size());
        assertEquals("item1", flatNormalizedList.get(0));
        assertEquals("item3", flatNormalizedList.get(1));
    }

    @Disabled()
    @ParameterizedTest
    @CsvSource({ "item1, item2, item3, 3", "item1, item1, item2, 3", ", , , 0" })
    void testMultipleOperations(String item1, String item2, String item3, int expectedSize) {
        if (item1 != null)
            list.add(item1);
        if (item2 != null)
            list.add(item2);
        if (item3 != null)
            list.add(item3);
        assertEquals(expectedSize, list.size());
        assertFalse(list.isEmpty());
        if (expectedSize > 0) {
            assertTrue(list.contains(item1));
            assertEquals(0, list.indexOf(item1));
            assertEquals(item1, list.get(0));
        }
        if (expectedSize > 1) {
            assertTrue(list.contains(item2));
            assertEquals(1, list.indexOf(item2));
            assertEquals(item2, list.get(1));
        }
        if (expectedSize > 2) {
            assertTrue(list.contains(item3));
            assertEquals(2, list.indexOf(item3));
            assertEquals(item3, list.get(2));
        }
        list.clear();
        assertTrue(list.isEmpty());
    }
}

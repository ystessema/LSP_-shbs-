package org.howard.edu.assignment5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {

    private IntegerSet intSet;

    @BeforeEach
    public void setUp() {
        intSet = new IntegerSet();
    }

    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        intSet.add(1);
        intSet.clear();
        assertTrue(intSet.isEmpty());
    }

    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        intSet.add(1);
        intSet.add(2);
        assertEquals(2, intSet.length());
    }

    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        IntegerSet intSetb = new IntegerSet();
        intSet.add(1);
        intSet.add(2);
        intSetb.add(2);
        intSetb.add(1);
        assertTrue(intSet.equals(intSetb));
    }

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        intSet.add(1);
        intSet.add(2);
        assertTrue(intSet.contains(1));
        assertFalse(intSet.contains(3));
    }
    
    @Test
    @DisplayName("Test case for largest")
    public void testLargest() throws IntegerSetException {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        assertEquals(set1.largest(), 3);

        IntegerSet set2 = new IntegerSet();

        assertThrows(IntegerSetException.class, () -> set2.largest());
    }

    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() throws IntegerSetException {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        assertEquals(set1.smallest(), 1);

        IntegerSet set2 = new IntegerSet();

        assertThrows(IntegerSetException.class, () -> set2.smallest());
    }

    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        intSet.add(1);
        assertTrue(intSet.contains(1));
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        intSet.add(1);
        intSet.remove(1);
        assertFalse(intSet.contains(1));
    }

    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        IntegerSet intSetb = new IntegerSet();
        intSet.add(1);
        intSet.add(2);
        intSetb.add(2);
        intSetb.add(3);
        intSet.union(intSetb);
        assertEquals("[1, 2, 3]", intSet.toString());
    }

    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
        IntegerSet intSetb = new IntegerSet();
        intSet.add(1);
        intSet.add(2);
        intSetb.add(2);
        intSetb.add(3);
        intSet.intersect(intSetb);
        assertEquals("[2]", intSet.toString());
    }
    
    @Test
    @DisplayName("Test case for diff")
    public void testDiff() {
        IntegerSet setA = new IntegerSet();
        setA.add(1);
        setA.add(2);
        setA.add(3);

        IntegerSet setB = new IntegerSet();
        setB.add(2);
        setB.add(3);
        setB.add(4);
        setB.add(5);

        setA.diff(setB);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);

        assertEquals(expected.toString(), setA.toString());
    }


    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
        assertTrue(intSet.isEmpty());

        intSet.add(1);
        assertFalse(intSet.isEmpty());
    }

    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);

        assertEquals(intSet.toString(), "[1, 2, 3]");

        intSet.clear();
        assertEquals(intSet.toString(), "[]");
    }
}

    

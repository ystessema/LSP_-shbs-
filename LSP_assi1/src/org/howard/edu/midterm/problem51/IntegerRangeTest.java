package org.howard.edu.lsp.midterm.problem51;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerRangeTest {

    @Test
    @DisplayName("Test contains method")
    public void testContains() {
        IntegerRange range = new IntegerRange(1, 10);
        Assertions.assertTrue(range.contains(5));
        Assertions.assertFalse(range.contains(11));
    }

    @Test
    @DisplayName("Test overlaps method")
    public void testOverlaps() throws EmptyRangeException {
        IntegerRange range1 = new IntegerRange(1, 10);
        IntegerRange range2 = new IntegerRange(5, 15);
        IntegerRange range3 = new IntegerRange(11, 20);
        Assertions.assertTrue(range1.overlaps(range2));
        Assertions.assertTrue(range2.overlaps(range1));
        Assertions.assertFalse(range1.overlaps(range3));
    }

    @Test
    @DisplayName("Test size method")
    public void testSize() {
        IntegerRange range = new IntegerRange(1, 10);
        Assertions.assertEquals(10, range.size());
    }

    @Test
    @DisplayName("Test getLower and getUpper methods")
    public void testGetters() {
        IntegerRange range = new IntegerRange(1, 10);
        Assertions.assertEquals(1, range.getLower());
        Assertions.assertEquals(10, range.getUpper());
    }
}



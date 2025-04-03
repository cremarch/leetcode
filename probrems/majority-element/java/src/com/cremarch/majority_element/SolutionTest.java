package com.cremarch.majority_element;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testExample1() {
        // Example 1: [3, 2, 3] -> 3
        int[] nums = {3, 2, 3};
        int expected = 3;
        assertEquals(expected, solution.majorityElement(nums));
    }

    @Test
    public void testExample2() {
        // Example 2: [2, 2, 1, 1, 1, 2, 2] -> 2
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int expected = 2;
        assertEquals(expected, solution.majorityElement(nums));
    }

    @Test
    public void testSingleElement() {
        // Single element array
        int[] nums = {5};
        int expected = 5;
        assertEquals(expected, solution.majorityElement(nums));
    }

    @Test
    public void testTwoElements() {
        // Two elements array
        int[] nums = {5, 5};
        int expected = 5;
        assertEquals(expected, solution.majorityElement(nums));
    }

    @Test
    public void testNegativeNumbers() {
        // Array with negative numbers
        int[] nums = {-1, -1, -1, 2, 2};
        int expected = -1;
        assertEquals(expected, solution.majorityElement(nums));
    }

    @Test
    public void testLargeNumbers() {
        // Array with large numbers
        int[] nums = {1000000000, 1000000000, 1000000000, -1000000000, -1000000000};
        int expected = 1000000000;
        assertEquals(expected, solution.majorityElement(nums));
    }

    @Test
    public void testEvenLength() {
        // Even length array
        int[] nums = {3, 3, 4, 3};
        int expected = 3;
        assertEquals(expected, solution.majorityElement(nums));
    }

    @Test
    public void testOddLength() {
        // Odd length array
        int[] nums = {3, 3, 4, 4, 3};
        int expected = 3;
        assertEquals(expected, solution.majorityElement(nums));
    }
}
package com.cremarch.remove_duplicates_from_sorted_array;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
public class SolutionTest {
    
    private Solution solution;
    
    @Before
    public void setUp() {
        solution = new Solution();
    }
    
    @Test
    public void testExample1() {
        int[] nums = {1, 1, 2};
        int[] expectedNums = {1, 2};
        int k = solution.removeDuplicates(nums);
        
        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
    
    @Test
    public void testExample2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = {0, 1, 2, 3, 4};
        int k = solution.removeDuplicates(nums);
        
        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
    
    @Test
    public void testSingleElement() {
        int[] nums = {42};
        int[] expectedNums = {42};
        int k = solution.removeDuplicates(nums);
        
        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
    
    @Test
    public void testAllDuplicates() {
        int[] nums = {5, 5, 5, 5, 5};
        int[] expectedNums = {5};
        int k = solution.removeDuplicates(nums);
        
        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
    
    @Test
    public void testNegativeNumbers() {
        int[] nums = {-3, -3, -2, -1, -1, 0, 0};
        int[] expectedNums = {-3, -2, -1, 0};
        int k = solution.removeDuplicates(nums);
        
        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
    
    @Test
    public void testNoduplicates() {
        int[] nums = {1, 2, 3, 4, 5};
        int[] expectedNums = {1, 2, 3, 4, 5};
        int k = solution.removeDuplicates(nums);
        
        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
}
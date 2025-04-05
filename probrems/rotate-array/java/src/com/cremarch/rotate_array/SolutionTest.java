package com.cremarch.rotate_array;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class SolutionTest {
    
    private final Solution solution = new Solution();
    
    @Test
    public void testExample1() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] expected = {5, 6, 7, 1, 2, 3, 4};
        
        solution.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }
    
    @Test
    public void testExample2() {
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        int[] expected = {3, 99, -1, -100};
        
        solution.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }
    
    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int k = 5;
        int[] expected = {};
        
        solution.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }
    
    @Test
    public void testSingleElement() {
        int[] nums = {1};
        int k = 3;
        int[] expected = {1};
        
        solution.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }
    
    @Test
    public void testRotateFullCycle() {
        int[] nums = {1, 2, 3, 4};
        int k = 4;
        int[] expected = {1, 2, 3, 4}; // Full rotation brings back original array
        
        solution.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }
    
    @Test
    public void testLargeK() {
        int[] nums = {1, 2, 3, 4};
        int k = 10; // 10 % 4 = 2, so same as rotating by 2
        int[] expected = {3, 4, 1, 2};
        
        solution.rotate(nums, k);
        assertArrayEquals(expected, nums);
    }
}
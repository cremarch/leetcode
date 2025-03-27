package com.cremarch.merge_sorted_array;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
    
    private Solution solution;
    
    @Before
    public void setUp() {
        solution = new Solution();
    }
    
    @Test
    public void testExample1() {
        // 例1: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3 → [1,2,2,3,5,6]
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        
        solution.merge(nums1, m, nums2, n);
        
        int[] expected = {1, 2, 2, 3, 5, 6};
        assertArrayEquals("Failed example 1", expected, nums1);
    }
    
    @Test
    public void testExample2() {
        // 例2: nums1 = [1], m = 1, nums2 = [], n = 0 → [1]
        int[] nums1 = {1};
        int[] nums2 = {};
        int m = 1;
        int n = 0;
        
        solution.merge(nums1, m, nums2, n);
        
        int[] expected = {1};
        assertArrayEquals("Failed example 2", expected, nums1);
    }
    
    @Test
    public void testExample3() {
        // 例3: nums1 = [0], m = 0, nums2 = [1], n = 1 → [1]
        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0;
        int n = 1;
        
        solution.merge(nums1, m, nums2, n);
        
        int[] expected = {1};
        assertArrayEquals("Failed example 3", expected, nums1);
    }
    
    @Test
    public void testDuplicateValues() {
        // 両方の配列に同じ値がある場合
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int[] nums2 = {1, 3, 5};
        int m = 3;
        int n = 3;
        
        solution.merge(nums1, m, nums2, n);
        
        int[] expected = {1, 1, 3, 3, 5, 5};
        assertArrayEquals("Failed duplicate values test", expected, nums1);
    }
    
    @Test
    public void testNums2AllSmaller() {
        // nums2のすべての値がnums1よりも小さい場合
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int[] nums2 = {1, 2, 3};
        int m = 3;
        int n = 3;
        
        solution.merge(nums1, m, nums2, n);
        
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals("Failed when all nums2 values are smaller", expected, nums1);
    }
    
    @Test
    public void testNums2AllLarger() {
        // nums2のすべての値がnums1よりも大きい場合
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {4, 5, 6};
        int m = 3;
        int n = 3;
        
        solution.merge(nums1, m, nums2, n);
        
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals("Failed when all nums2 values are larger", expected, nums1);
    }
    
    @Test
    public void testMixedValues() {
        // 様々な値が混在する場合
        int[] nums1 = {-3, 0, 8, 0, 0, 0};
        int[] nums2 = {-2, 5, 9};
        int m = 3;
        int n = 3;
        
        solution.merge(nums1, m, nums2, n);
        
        int[] expected = {-3, -2, 0, 5, 8, 9};
        assertArrayEquals("Failed with mixed values", expected, nums1);
    }
}


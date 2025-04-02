package com.cremarch.remove_duplicates_from_sorted_array_two;

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
        // Input: nums = [1,1,1,2,2,3]
        // Output: 5, nums = [1,1,2,2,3,_]
        int[] nums = {1, 1, 1, 2, 2, 3};
        int[] expectedNums = {1, 1, 2, 2, 3};
        int k = solution.removeDuplicates(nums);
        
        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
    
    @Test
    public void testExample2() {
        // Input: nums = [0,0,1,1,1,1,2,3,3]
        // Output: 7, nums = [0,0,1,1,2,3,3,_,_]
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int[] expectedNums = {0, 0, 1, 1, 2, 3, 3};
        int k = solution.removeDuplicates(nums);
        
        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
    
    @Test
    public void testSingleElement() {
        // 配列に1つの要素だけがある場合
        int[] nums = {42};
        int[] expectedNums = {42};
        int k = solution.removeDuplicates(nums);
        
        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
    
    @Test
    public void testTwoSameElements() {
        // 配列に同じ要素が2つある場合
        int[] nums = {5, 5};
        int[] expectedNums = {5, 5};
        int k = solution.removeDuplicates(nums);
        
        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
    
    @Test
    public void testAllDuplicates() {
        // すべての要素が同じ値の場合
        int[] nums = {5, 5, 5, 5, 5};
        int[] expectedNums = {5, 5};
        int k = solution.removeDuplicates(nums);
        
        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
    
    @Test
    public void testNegativeNumbers() {
        // 負の数が含まれる場合
        int[] nums = {-3, -3, -3, -2, -1, -1, -1, 0, 0};
        int[] expectedNums = {-3, -3, -2, -1, -1, 0, 0};
        int k = solution.removeDuplicates(nums);
        
        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
    
    @Test
    public void testNoDuplicates() {
        // 重複がない場合
        int[] nums = {1, 2, 3, 4, 5};
        int[] expectedNums = {1, 2, 3, 4, 5};
        int k = solution.removeDuplicates(nums);
        
        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
    
    @Test
    public void testExactlyTwoOccurrences() {
        // すべての要素がちょうど2回ずつ出現する場合
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4};
        int[] expectedNums = {1, 1, 2, 2, 3, 3, 4, 4};
        int k = solution.removeDuplicates(nums);
        
        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
    
    @Test
    public void testMixedDuplicates() {
        // 一部の要素が2回を超えて出現し、一部は1回だけの場合
        int[] nums = {1, 1, 1, 2, 3, 3, 3, 3, 4, 5, 5, 5};
        int[] expectedNums = {1, 1, 2, 3, 3, 4, 5, 5};
        int k = solution.removeDuplicates(nums);
        
        assertEquals(expectedNums.length, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i]);
        }
    }
}
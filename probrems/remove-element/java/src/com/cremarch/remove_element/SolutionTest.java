package com.cremarch.remove_element;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

public class SolutionTest {
    
    private Solution solution;
    
    @Before
    public void setUp() {
        solution = new Solution();
    }
    
    @Test
    public void testExample1() {
        // Input: nums = [3,2,2,3], val = 3
        // Output: 2, nums = [2,2,_,_]
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        
        int result = solution.removeElement(nums, val);
        
        assertEquals(2, result);
        // 返された k 個の要素に 3 が含まれていないことを確認
        for (int i = 0; i < result; i++) {
            assertNotEquals(val, nums[i]);
        }
        
        // 最初の k 個の要素だけをソートして確認
        int[] firstK = Arrays.copyOf(nums, result);
        Arrays.sort(firstK);
        assertArrayEquals(new int[]{2, 2}, firstK);
    }
    
    @Test
    public void testExample2() {
        // Input: nums = [0,1,2,2,3,0,4,2], val = 2
        // Output: 5, nums = [0,1,4,0,3,_,_,_]
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        
        int result = solution.removeElement(nums, val);
        
        assertEquals(5, result);
        // 返された k 個の要素に 2 が含まれていないことを確認
        for (int i = 0; i < result; i++) {
            assertNotEquals(val, nums[i]);
        }
        
        // 最初の k 個の要素だけをソートして確認
        int[] firstK = Arrays.copyOf(nums, result);
        Arrays.sort(firstK);
        assertArrayEquals(new int[]{0, 0, 1, 3, 4}, firstK);
    }
    
    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int val = 5;
        
        int result = solution.removeElement(nums, val);
        
        assertEquals(0, result);
    }
    
    @Test
    public void testAllElementsRemoved() {
        // すべての要素が削除される場合
        int[] nums = {3, 3, 3, 3};
        int val = 3;
        
        int result = solution.removeElement(nums, val);
        
        assertEquals(0, result);
    }
    
    @Test
    public void testNoElementsRemoved() {
        // 削除対象の要素がない場合
        int[] nums = {1, 2, 4, 5};
        int val = 3;
        
        int result = solution.removeElement(nums, val);
        
        assertEquals(4, result);
        // 配列が変更されていないことを確認
        assertArrayEquals(new int[]{1, 2, 4, 5}, nums);
    }
    
    @Test
    public void testSingleElement() {
        // 配列に1つの要素だけがある場合
        // 1. 削除する場合
        int[] nums1 = {5};
        int val1 = 5;
        int result1 = solution.removeElement(nums1, val1);
        assertEquals(0, result1);
        
        // 2. 削除しない場合
        int[] nums2 = {5};
        int val2 = 3;
        int result2 = solution.removeElement(nums2, val2);
        assertEquals(1, result2);
        assertEquals(5, nums2[0]);
    }
}

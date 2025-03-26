package com.cremarch;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import java.util.Arrays;


public class SolutionTest {
    
    private Solution solution;
    
    @Before
    public void setUp() {
        solution = new Solution();
    }
    
    @Test
    public void testExample1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] result = solution.twoSum(nums, target);
        
        Arrays.sort(result); // インデックスの順序は任意
        assertTrue("Expected [0, 1] but got " + Arrays.toString(result), 
                   Arrays.equals(expected, result));
    }
    
    @Test
    public void testExample2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        int[] result = solution.twoSum(nums, target);
        
        Arrays.sort(result); // インデックスの順序は任意
        assertTrue("Expected [1, 2] but got " + Arrays.toString(result), 
                   Arrays.equals(expected, result));
    }
    
    @Test
    public void testExample3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        int[] result = solution.twoSum(nums, target);
        
        Arrays.sort(result); // インデックスの順序は任意
        assertTrue("Expected [0, 1] but got " + Arrays.toString(result), 
                   Arrays.equals(expected, result));
    }
    
    @Test
    public void testLargerArray() {
        int[] nums = {1, 5, 8, 10, 13, 21};
        int target = 18;
        int[] expected = {1, 4}; // 5 + 13 = 18
        int[] result = solution.twoSum(nums, target);
        
        Arrays.sort(result); // インデックスの順序は任意
        assertTrue("Expected [1, 4] but got " + Arrays.toString(result), 
                   Arrays.equals(expected, result));
    }
    
    @Test
    public void testNegativeNumbers() {
        int[] nums = {-3, 4, 8, -5, 12};
        int target = -8;
        int[] expected = {0, 3}; // -3 + (-5) = -8
        int[] result = solution.twoSum(nums, target);
        
        Arrays.sort(result); // インデックスの順序は任意
        assertTrue("Expected [0, 3] but got " + Arrays.toString(result), 
                   Arrays.equals(expected, result));
    }
}


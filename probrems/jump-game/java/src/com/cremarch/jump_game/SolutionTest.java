package com.cremarch.jump_game;

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
        int[] nums = {2, 3, 1, 1, 4};
        boolean result = solution.canJump(nums);
        assertTrue("Expected true for [2, 3, 1, 1, 4]", result);
    }
    
    @Test
    public void testExample2() {
        int[] nums = {3, 2, 1, 0, 4};
        boolean result = solution.canJump(nums);
        assertFalse("Expected false for [3, 2, 1, 0, 4]", result);
    }
    
    @Test
    public void testSingleElement() {
        int[] nums = {0};
        boolean result = solution.canJump(nums);
        assertTrue("Expected true for single element array [0]", result);
    }
}
package com.cremarch.best_time_to_buy_and_sell_stock;

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
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expected = 5; // Buy at 1, sell at 6
        int result = solution.maxProfit(prices);
        
        assertEquals("Expected profit of 5 for prices [7, 1, 5, 3, 6, 4]", expected, result);
    }
    
    @Test
    public void testExample2() {
        int[] prices = {7, 6, 4, 3, 1};
        int expected = 0; // No transaction
        int result = solution.maxProfit(prices);
        
        assertEquals("Expected profit of 0 for prices [7, 6, 4, 3, 1]", expected, result);
    }
    
    @Test
    public void testSingleElement() {
        int[] prices = {5};
        int expected = 0; // Cannot buy and sell with only one price
        int result = solution.maxProfit(prices);
        
        assertEquals("Expected profit of 0 for a single price", expected, result);
    }
    
    @Test
    public void testLargerArray() {
        int[] prices = {3, 2, 6, 5, 0, 3, 10, 7, 2};
        int expected = 10; // Buy at 0, sell at 10
        int result = solution.maxProfit(prices);
        
        assertEquals("Expected profit of 10 for prices [3, 2, 6, 5, 0, 3, 10, 7, 2]", expected, result);
    }
    
    @Test
    public void testIncreasingPrices() {
        int[] prices = {1, 2, 3, 4, 5, 6};
        int expected = 5; // Buy at 1, sell at 6
        int result = solution.maxProfit(prices);
        
        assertEquals("Expected profit of 5 for consistently increasing prices", expected, result);
    }
}

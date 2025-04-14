package com.cremarch.best_time_to_buy_and_sell_stock_ii;

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
        // Input: prices = [7,1,5,3,6,4]
        // Output: 7
        // Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
        // Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
        // Total profit is 4 + 3 = 7.
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expected = 7;
        int result = solution.maxProfit(prices);
        
        assertEquals("Expected profit of 7 for prices [7, 1, 5, 3, 6, 4]", expected, result);
    }
    
    @Test
    public void testExample2() {
        // Input: prices = [1,2,3,4,5]
        // Output: 4
        // Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
        // Total profit is 4.
        int[] prices = {1, 2, 3, 4, 5};
        int expected = 4;
        int result = solution.maxProfit(prices);
        
        assertEquals("Expected profit of 4 for prices [1, 2, 3, 4, 5]", expected, result);
    }
    
    @Test
    public void testExample3() {
        // Input: prices = [7,6,4,3,1]
        // Output: 0
        // Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.
        int[] prices = {7, 6, 4, 3, 1};
        int expected = 0;
        int result = solution.maxProfit(prices);
        
        assertEquals("Expected profit of 0 for prices [7, 6, 4, 3, 1]", expected, result);
    }
    
    @Test
    public void testSingleElement() {
        // Array with only one element
        int[] prices = {42};
        int expected = 0; // Cannot buy and sell with only one price, so profit is 0
        int result = solution.maxProfit(prices);
        
        assertEquals("Expected profit of 0 for a single price", expected, result);
    }
    
    @Test
    public void testAlternatingPrices() {
        // Prices that alternately go up and down
        int[] prices = {1, 7, 2, 9, 3, 8};
        int expected = 18; // (7-1) + (9-2) + (8-3) = 6 + 7 + 5 = 18
        int result = solution.maxProfit(prices);
        
        assertEquals("Expected profit of 18 for alternating prices [1, 7, 2, 9, 3, 8]", expected, result);
    }
    
    @Test
    public void testFlatPrices() {
        // Prices that remain the same
        int[] prices = {5, 5, 5, 5};
        int expected = 0; // No price change, so no profit can be made
        int result = solution.maxProfit(prices);
        
        assertEquals("Expected profit of 0 for flat prices [5, 5, 5, 5]", expected, result);
    }
    
    @Test
    public void testComplexCase() {
        // A more complex case
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        // Optimal transactions: (5-3) + (3-0) + (4-1) = 2 + 3 + 3 = 8
        int expected = 8;
        int result = solution.maxProfit(prices);
        
        assertEquals("Expected profit of 8 for prices [3, 3, 5, 0, 0, 3, 1, 4]", expected, result);
    }
}

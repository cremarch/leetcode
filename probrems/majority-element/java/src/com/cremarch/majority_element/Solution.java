/**
 * 169. Majority Element
 * Given an array nums of size n, return the majority element.
 * 
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [3,2,3]
 * Output: 3
 * Example 2:
 * 
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 *  
 * 
 * Constraints:
 * 
 * n == nums.length
 * 1 <= n <= 5 * 104
 * -109 <= nums[i] <= 109
 */

package com.cremarch.majority_element;

import java.util.Map;
import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        
        // if nums length  < 3, return nums[0]
        if (nums.length < 3) return nums[0];

        // declare Map<Integer, Integer>
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int n: nums){
          // if not map contains key n, put <n,1>
          if (countMap.containsKey(n)) countMap.put(n, countMap.get(n)+1);
          // else increment <n,c>
          else countMap.put(n, 1);
          // if c > nums.length/2, return c
          if (countMap.get(n) > (nums.length/2) ) return n;
        }
    
        throw new UnsupportedOperationException();
    }
}
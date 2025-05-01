/**
 * 55. Jump Game
 * 
 * You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
 * 
 * Return true if you can reach the last index, or false otherwise.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [2,3,1,1,4]
 * Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * 
 * Example 2:
 * 
 * Input: nums = [3,2,1,0,4]
 * Output: false
 * Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 * 
 *  
 * 
 * Constraints:
 * 
 *     1 <= nums.length <= 104
 *     0 <= nums[i] <= 105
 */

package com.cremarch.jump_game;


class Solution {
    public boolean canJump(int[] nums) {
        // pre  [2,3,1,1,4]
        // post true
        
        // edge case
        if (nums.length == 1) return true;
        
        // init space of backward index
        int backward = nums.length - 1;
        
        // for descendig nums index (in other words backward) - 1 as i
        for (int i = backward-1; i > -1; i--){
        
            // if nums[i] + i reach backward, backward replace as i
            if (nums[i] + i >= backward) backward = i;
        }
        
        // if backward is 0, return true
        // else return false
        return backward == 0;
    }
}
package com.cremarch.remove_duplicates_from_sorted_array;

class SolutionSample {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        int val = -101;
        while (i < n){
            if (nums[i] != val){
                nums[j] = nums[i];
                val = nums[j];
                j++;
            } 
            i++;
        }
        return j;
    }
}
package com.cremarch.remove_duplicates_from_sorted_array_two;

class SolutionSample {
    public int removeDuplicates(int[] nums) {
        int l=1;
        int k=1;
        int occ=1;
        for (int i = 1; i<nums.length; i++) {
           if(nums[i-1]!=nums[i]) {
                nums[l]=nums[i];
                k++;
                l++;
                occ=1;
           }
            else if(nums[i-1]==nums[i] && occ==1) {
                nums[l]=nums[i];
                l++;
                k++;
                occ++;
            }
            else {
                continue;
            }
        }
        return k;
    }
}
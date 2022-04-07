// This is a program to find maximum sub contiguious array sum using Kandane's algorithm

/***

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23

***/

class Solution {
    public int maxSubArray(int[] nums) {
        int max_curr=nums[0];
        int max_global=nums[0];
        for(int i =1;i<nums.length;i++)
        {
            max_curr=Math.max(nums[i],max_curr+nums[i]);
            if(max_curr>max_global)
                max_global=max_curr;
            
        }
        
        return max_global;
    }
}

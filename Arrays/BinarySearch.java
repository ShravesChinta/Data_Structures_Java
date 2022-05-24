/***
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1

***/


class Solution {
    public int search(int[] nums, int target) {
      return  binarySearch(nums,0,nums.length-1,target); 
       
    }
    
    public static int binarySearch(int[] nums,int start,int end,int target)
    {
        if(start>end)
        {
            return -1;
        }
        int mid=(start+end)/2;
        if(target==nums[mid])
            return mid;
        
        if(target>nums[mid])
            return binarySearch(nums,mid+1,end,target);
       
       return  binarySearch(nums,0,mid-1,target);
        
    }
}

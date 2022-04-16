//LeetCode question to solve Single Number2 in java

/**
137. Single Number II
Medium

4008

475

Add to List

Share
Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.

You must implement a solution with a linear runtime complexity and use only constant extra space.


Example 1:

Input: nums = [2,2,3,2]
Output: 3
Example 2:

Input: nums = [0,1,0,1,0,1,99]
Output: 99

**/

class Solution {
    public int singleNumber(int[] nums) {
     HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
     
        for(int i=0;i<nums.length;i++)
     {
             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
             
     }
        
        for(int a:map.keySet()){
            if(map.get(a)==1)
                return a;
        }
        return 0;
    }
}

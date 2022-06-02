/***
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
***/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> result= new HashMap<>();
        int count_freq=0;
        boolean bool_result=false;
        for(int a:nums)
        {
            result.putIfAbsent(a,0);
            count_freq=result.get(a);
            result.put(a,++count_freq);
            if(count_freq>=2)
            {
                bool_result=true;
                break;
            }
            
        }
        return bool_result;
    }
}

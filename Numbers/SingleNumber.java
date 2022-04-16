//Leetcode question to solve Single number in java

/***

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1

***/

//The key to solve this problem is bit manipulation. XOR will return 1 only on two different bits. So if two numbers are the same, XOR will return 0. Finally only one number left.

class Solution {
    public int singleNumber(int[] nums) {
      int x=0;
        for(int a:nums)
        {
            x=x^a;
        }
    return x;
    }
}

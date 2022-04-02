// This program uses Flyod's cycle detection method to find out the duplicate number 
// Leetcode optimised solution for Finding the Duplicate Number 



class Solution {
    public int findDuplicate(int[] nums) {
       
        int slow=nums[0];
        int fast=nums[0];
        
        do{
           slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        
        fast=nums[0];
        
        while(slow!=fast)
        {
            fast=nums[fast];
            slow=nums[slow];
        }
        
        return slow;
    }
}

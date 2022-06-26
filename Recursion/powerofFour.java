/***
Given an integer n, return true if it is a power of four. Otherwise, return false.

An integer n is a power of four, if there exists an integer x such that n == 4x.

 

Example 1:

Input: n = 16
Output: true
Example 2:

Input: n = 5
Output: false
Example 3:

Input: n = 1
Output: true

***/


class Solution {
    public boolean isPowerOfFour(int n) {
       return powerofFour(n,4); 
    }
    
    public static boolean powerofFour(int n , int k)
    {
        if(n==1)
            return true;
        else if(n==0 || n%k!=0 || n<k)
            return false;
        
        return powerofFour(n/k,k);
    }
}

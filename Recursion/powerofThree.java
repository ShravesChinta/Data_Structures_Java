/***

Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.

 

Example 1:

Input: n = 27
Output: true
Example 2:

Input: n = 0
Output: false
Example 3:

Input: n = 9
Output: true

***/

class Solution {
    public boolean isPowerOfThree(int n) {
        return powerofThree(n,3);
    }
    
    public static boolean powerofThree(int n, int k)
    {
        if(n==0)
            return false;
        else if(n==1)
            return true;
        else if(n%k!=0)
            return false;
        
        return powerofThree(n/k,k);
        
    }
}

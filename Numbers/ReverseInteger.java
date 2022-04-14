//Leetcode Medium question to reverse the Integer 

/**
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).


Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21

**/

class Solution {
    public int reverse(int x) {
     int res=0;   
   int sign=1;
    if(x<0)
    {
        x=0-x;
        sign=-1;
    }
        
        while(x>0)
        {
            if(res*sign > (Integer.MAX_VALUE /10) || res*sign < (Integer.MIN_VALUE/10 ))
                return 0;
            res=res*10+(x%10);
            x=x/10;
        }
        
       return sign*res;
    }
}

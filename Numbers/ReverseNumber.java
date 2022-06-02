/***

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

***/


class Solution {
    public int reverse(int x) {
        int sign_num=1;
        int reverse_num=0, last_digit=0;
        if(x<0)
        {
            sign_num=-1;
            x=x*(-1);
        }
        //System.out.println(Integer.MIN_VALUE);
        while(x>0)
        {   
            if(reverse_num * sign_num > (Integer.MAX_VALUE/10) || reverse_num *sign_num < (Integer.MIN_VALUE/10))
                return 0;
            last_digit=x%10;
            reverse_num=reverse_num*10+last_digit;
            x=x/10;
        }  
        return reverse_num*sign_num;
    }
}

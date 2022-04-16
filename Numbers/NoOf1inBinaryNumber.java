//Leet code question to calculate the number of 1's in the given binary number

//here the logic is to do AND operation from left of the binary number with '1'. 1 AND 1 will give 1 , else 0. so we will know that it contains 1 or not. 

/***
Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).

Note:

Note that in some languages, such as Java, there is no unsigned integer type. In this case, the input will be given as a signed integer type. It should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.
In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 3, the input represents the signed integer. -3.
 

Example 1:

Input: n = 00000000000000000000000000001011
Output: 3
Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
Example 2:

Input: n = 00000000000000000000000010000000
Output: 1
Explanation: The input binary string 00000000000000000000000010000000 has a total of one '1' bit.

***/
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        for(int i =0;i<32;i++)
            if(getBit(n,i))
            {
                count++;
            }
        
        return count;
    }
    
    public static boolean getBit(int n , int i )
    {   
        return (n & (1<<i))!=0;
    }
}

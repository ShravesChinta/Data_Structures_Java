/***
Given an array of n integers. The task is to find the first element that occurs k number of times. If no element occurs k times the print -1. The distribution of integer elements could be in any range.
Examples: 

Input: {1, 7, 4, 3, 4, 8, 7}, 
k = 2 
Output: 7 
Both 7 and 4 occur 2 times. 
But 7 is the first that occurs 2 times. 

Input: {4, 1, 6, 1, 6, 4}, 
k = 1 
Output: -1
**/

import java.util.*;


public class Main
{
	public static void main(String[] args) {
		HashMap<Integer,Integer> map1=new HashMap<>();
		int[] nums={1, 7, 4, 3, 6, 8, 7,9,9};
		int k=2;
		for(int a:nums)
		map1.put(a,map1.getOrDefault(a,0)+1);
		
		for(int b:map1.keySet())
		{
		    int val=map1.get(b);
		    if(val==k)
		    {
		        System.out.println("Element which is repeating k times is " + b);
		        break;
		    }
		}
	}
}

/***

output:
Element which is repeating k times is 7



***/

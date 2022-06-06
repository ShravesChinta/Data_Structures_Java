/***

Given an array, reverse every sub-array formed by consecutive k elements.

Examples: 

Input: 
arr = [1, 2, 3, 4, 5, 6, 7, 8, 9] 
k = 3 
Output: 
[3, 2, 1, 6, 5, 4, 9, 8, 7]

Input: 
arr = [1, 2, 3, 4, 5, 6, 7, 8] 
k = 5 
Output: 
[5, 4, 3, 2, 1, 8, 7, 6]

Input: 
arr = [1, 2, 3, 4, 5, 6] 
k = 1 
Output: 
[1, 2, 3, 4, 5, 6]

Input: 
arr = [1, 2, 3, 4, 5, 6, 7, 8] 
k = 10 
Output: 
[8, 7, 6, 5, 4, 3, 2, 1] 

***/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int[] nums={ 1, 2, 3, 4, 5, 6, 7, 8};
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		System.out.println("Elements before reverse");
		for(int a:nums)
		{
		    System.out.print(a + " ,");
		}
		System.out.println(" ");
		System.out.println("Elements after reverse");
		for(int i=0;i<nums.length;i=i+k)
		{
		    if((i+k-1)>nums.length-1)
		    break;
		    reverse(nums,i,i+k-1);
		    
		}
		
		for(int a:nums)
		{
		    System.out.print(a + " ,");
		}
		
	}
	
	public static void reverse(int[] nums, int start, int end)
	{
	    int i=start, j=end;
	    while(i<j)
	    {
	        int temp=nums[i];
	        nums[i]=nums[j];
	        nums[j]=temp;
	        i++;
	        j--;
	    }
	}
	
}

/***
output

3
Elements before reverse
1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 , 
Elements after reverse
3 ,2 ,1 ,6 ,5 ,4 ,7 ,8 ,

***/

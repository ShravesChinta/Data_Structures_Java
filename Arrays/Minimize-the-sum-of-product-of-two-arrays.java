/***
Given two arrays, A and B, of equal size n, the task is to find the minimum value of A[0] * B[0] + A[1] * B[1] +…+ A[n-1] * B[n-1]. Shuffling of elements of arrays A and B is allowed.

Examples : 

Input : A[] = {3, 1, 1} and B[] = {6, 5, 4}.
Output : 23
Minimum value of S = 1*6 + 1*5 + 3*4 = 23.

Input : A[] = { 6, 1, 9, 5, 4 } and B[] = { 3, 4, 8, 2, 4 }
Output : 80.
Minimum value of S = 1*8 + 4*4 + 5*4 + 6*3 + 9*2 = 80.

***/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		int[] nums1={3, 1, 1};
		int[] nums2={6, 5, 4};
		int i=0,j=nums2.length-1;
		int result=0;
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		while(i<nums1.length && j>=0)
		{
		    result+=nums1[i++]*nums2[j--];
		}
		System.out.println(result);
	}
}

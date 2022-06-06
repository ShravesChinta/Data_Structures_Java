/***
Given two sorted arrays of size m and n respectively, you are tasked with finding the element that would be at the k’th position of the final sorted array.

Examples: 

Input : Array 1 - 2 3 6 7 9
        Array 2 - 1 4 8 10
        k = 5
Output : 6
Explanation: The final sorted array would be -
1, 2, 3, 4, 6, 7, 8, 9, 10
The 5th element of this array is 6.

Input : Array 1 - 100 112 256 349 770
        Array 2 - 72 86 113 119 265 445 892
        k = 7
Output : 256
Explanation: Final sorted array is -
72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
7th element of this array is 256.

***/

public class Main
{
	public static void main(String[] args) {
		int[] nums1={2, 3, 6, 7, 9};
		int[] nums2={1, 4, 8, 10};
		int k=5;
		int[] nums=new int[nums1.length+nums2.length];
		int i=0,j=0,count=0;
		while(i<nums1.length && j<nums2.length)
		{
		    
		    if(nums1[i]>nums2[j])
		 nums[count++]= nums2[j++];
		 else
		 nums[count++]=nums1[i++];
		}
		
		while(i<nums1.length)
		{
		    nums[count++]=nums1[i++];
		}
		while(j<nums2.length)
		{
		    nums[count++]=nums2[j++];
		}
		
	    System.out.println("The kth element is " + nums[k-1]);
		
	}
}

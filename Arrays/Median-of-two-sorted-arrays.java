/***
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
***/


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums=new int[nums1.length+nums2.length];
        int sum=0;
        double median=0.0;
        int i=0,j=0,count=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                nums[count++]=nums1[i++];
            }
            
            else
            {
            nums[count++]=nums2[j++];   
            }
            
        }
        
        while(i<nums1.length)
        {
          nums[count++]=nums1[i++];
        }
        
        while(j<nums2.length)
        {
          nums[count++]=nums2[j++];
        }
        
        int num_len=nums.length;
        
        if(num_len%2!=0)
        {
            int mid=(nums.length-1)/2;
            //System.out.println("The sum of the middle is " + nums[mid]);
            median=(double)nums[mid];
        }
        else if(num_len/2==1)
        {
           median=(double)(nums[0]+nums[1])/2.00;    
        }
        
        else
        {
            int mid1=(nums.length)/2;
            int mid2=mid1-1;
            //System.out.println("The sum of the middle is d" + nums[mid1]+nums[mid2]);
            median=(double)(nums[mid1]+nums[mid2])/2.00;
        }
        
        
        return median;
    }
    
    
}

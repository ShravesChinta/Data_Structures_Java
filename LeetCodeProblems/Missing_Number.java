class Solution {
    public int missingNumber(int[] nums) {
     int j=0;
     for(j=0;j<=nums.length;j++)
     {
         if(searchN(j,nums))
            continue;
         else
            {   
             break;
            }
     }
        return j;
    }
    
    public static boolean searchN(int n,int[] nums){
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            if(n==nums[i])
            {   
                flag=true;
                break;
            }
        }
        return flag;
    }
    
}


// Note: The solution is not so optimised one. Try some other alternatives also 

//Leetcode optimised solution for two sum question, it can be done with List also ....


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        for(int i =0;i<nums.length;i++)
        {
            int diff= target-nums[i];
            if(map.containsKey(diff))
            {
                result[0]=i;
                result[1]=map.get(diff);
            }
            
            else{
                map.put(nums[i],i);
            }
            
        }
        return result;
    }
}



//[{2,0},{7,1},{11,2},{15,3}]

//here you find the diff if it exists in the hashMap or not..

//I guess the same way can be done with List also ...

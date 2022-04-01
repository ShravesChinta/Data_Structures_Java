

class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> l=new HashSet<Integer>();
        for(int a:nums)
        {
            l.add(a);
        }
        
        for(int i =0;i<=nums.length;i++)
        {
            if(!l.contains(i))
                return i;
        }
        
        return -1;
    }
}

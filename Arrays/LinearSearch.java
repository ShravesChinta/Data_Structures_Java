//



public class LinearSearch
{   
	public static void main(String[] args) {
	int[] array={1,4,6,2,56,39,100,28,12};
	linearSearch(array,56);
	}
	
	public static void linearSearch(int[] nums, int x)
	{   
	   for(int i =0;i<nums.length;i++)
	   {
	       if(x==nums[i])
	       System.out.println("Element found");
	   }
	}
	
}

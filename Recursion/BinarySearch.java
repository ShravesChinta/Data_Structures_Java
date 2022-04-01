//this program will do binary search operation on arrays using recursion

import java.util.*;

public class BinarySearch
{
	public static void main(String[] args) {
	
	int[] array=new int[10];
	Scanner s =new Scanner(System.in);
	for(int i =0;i<10;i++)
	{
	    array[i]=s.nextInt();
	}
	Arrays.sort(array);
	
	for(int i =0;i<10;i++)
	{
	    System.out.println(array[i]);
	}
	int result=binarySearch(array,0,10,13);
	System.out.println(result);
	
	}
	
	public static int binarySearch(int[] A, int start, int end, int x)
	{
	    if(start>end){
	        return -1;
	    }
	    
	    int mid=(start+end)/2;
	    
	    if(x==A[mid])
	    return mid;
	    
	    if(x<A[mid])
	    {
	        return binarySearch(A,start,mid-1,x);
	    }
	    
	    return binarySearch(A,mid+1,end,x);
	    
	    
	}
}

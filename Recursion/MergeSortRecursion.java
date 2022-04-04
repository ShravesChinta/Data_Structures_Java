//Merge sort recursion 


import java.util.*;

public class Main
{
	public static void main(String[] args) {

	int[] array={10,2,1,22,6,9,8,45,3,12};
	
	for(int i =0;i<10;i++)
	{
	    System.out.println(array[i]);
	}
	mergeSort(array,0,array.length-1);
	}

	public static void mergeSort(int[] array,int start, int end)
	{
	    int mid=0;
	    if(start<end)
	    {
	        mid=(start+end)/2;
	        mergeSort(array,start,mid);
	        mergeSort(array,mid+1,end);
	        merge(array,start,mid,end);
	    }
	}
	
	public static void merge(int[] data,int start, int mid, int end)
	{
	    //build temp array to avoid modifying the original contents
	    
	    int[] temp=new int[end-start+1];
	    
	    int i =start, j=mid+1, k=0;
	    while((i<=mid )&&(j<=end))
	    {
	        if(data[i]<=data[j])
	        temp[k++]=data[i++];
	        
	        else
	        temp[k++]=data[j++];
	    }
	    
	    //Add the rest of the values from the left sub-array into the result;
	    while(i<=mid)
	    {
	        temp[k]=data[i];
	        k++;i++;
	    }
	    
	    //add the rest of the values from the right sub array into the result;
	    
	    while(j<=end){
	        temp[k]=data[j];
	        k++;j++;
	    }
	    
	    for(i=start;i<=end;i++){
	        data[i]=temp[i-start];
	        System.out.print(data[i] + " -> ");
	    }
	    System.out.println(" ");
	    
	}
	
}



/***
Let say the input array to be 

array=[10,2,1,22,6,9,45,3,12]

10
2
1
22
6
9
8
45
3
12



2 -> 10 ->  
1 -> 2 -> 10 ->  
6 -> 22 ->  
1 -> 2 -> 6 -> 10 -> 22 ->  
8 -> 9 ->  
8 -> 9 -> 45 ->  
3 -> 12 ->  
3 -> 8 -> 9 -> 12 -> 45 ->  
1 -> 2 -> 3 -> 6 -> 8 -> 9 -> 10 -> 12 -> 22 -> 45 ->  


***/

//Implementation of Priority Class in java


import java.util.*;

public class Main
{
	public static void main(String[] args) {
		PriorityQueue<Integer> minHeap=new PriorityQueue<>();
		PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
		
		int[] nums={1,10,5,3,4,7,6,9,8};
		for(int a:nums)
		{
		    minHeap.offer(a);
		    maxHeap.offer(a);
		}
		
		System.out.println("The min Heap is " + minHeap);
		System.out.println("The max Heap is "+ maxHeap);
		System.out.println("__________________________");
		System.out.println("The size of min Heap is " + minHeap.size());
		System.out.println("The size of max Heap is " + maxHeap.size());
		System.out.println("__________________________");
		//peek returns the minimum value without removing it from the queue
		System.out.println("The minimum value of min Heap is " + minHeap.peek());
		//peek returns the maximum value without removing it from the queue
		System.out.println("The maximum value of max Heap is " + maxHeap.peek());
		//poll returns the minimum value and removes it from the queue
		System.out.println("The minimum value of min Heap" + minHeap.poll());
		System.out.println("__________________________");
		System.out.println("The size of the min Heap is " + minHeap.size());
	    System.out.println("__________________________");
	    //poll returns the maximum value and removes it from the queue
	    System.out.println("The Maximum value in the queue is " + maxHeap.poll());
	    System.out.println("The size of max Heap is " + maxHeap.size());
	    System.out.println("__________________________");
	}
}

/***

Output:
The min Heap is [1, 3, 5, 8, 4, 7, 6, 10, 9]
The max Heap is [10, 9, 7, 8, 3, 5, 6, 1, 4]
__________________________
The size of min Heap is 9
The size of max Heap is 9
__________________________
The minimum value of min Heap is 1
The maximum value of max Heap is 10
The minimum value of min Heap1
__________________________
The size of the min Heap is 8
__________________________
The Maximum value in the queue is 10
The size of max Heap is 8
__________________________


***/

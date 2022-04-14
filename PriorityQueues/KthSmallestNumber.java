// Solving kth smallest number using Priority Queues



class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int i =0;i<arr.length;i++)
        {
            maxHeap.add(arr[i]);
            if(maxHeap.size()>k)
            {
                maxHeap.remove();
            }
            
        }
        
        return maxHeap.remove();
    } 
}

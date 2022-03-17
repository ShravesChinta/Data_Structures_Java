class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for (int i : nums) {
            minHeap.add(i);
            if (minHeap.size() > k)
                minHeap.remove();
        }
        /// now your MinHeap will contain only k elements
        return minHeap.remove();
    }
}
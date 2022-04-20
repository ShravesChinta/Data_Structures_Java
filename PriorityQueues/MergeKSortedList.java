//LeetCode program to merge K sorted list into one single list in java


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
      PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        
    for(ListNode head:lists)
        while(head!=null)
        {
            minHeap.add(head.val);
            head=head.next;
        }
        
    ListNode head=new ListNode();
    ListNode temp=head;
    while(!minHeap.isEmpty()){
        temp.next=new ListNode(minHeap.remove());
        temp=temp.next;
    }
        return head.next;
    }
}

//Here in place of temp.next=new ListNode(minHeap.remove()), if you add temp.val=minHeap.remove(), it will give you error .. Dont know why...

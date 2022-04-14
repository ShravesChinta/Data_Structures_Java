//Leetcode program to detect cycle in linked list 


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head, fast=head;
        if(head==null|| head.next==null)
            return false;
        
        else{
            while(fast.next!=null && fast.next.next !=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
                return true;
        }
        }
        return false;
    }
}

/**
Given the head of a singly linked list, return true if it is a palindrome.

 

Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false
***/


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
    public boolean isPalindrome(ListNode head) {
     Stack<Integer> s =new Stack<>();
        
        if(head==null || head.next ==null)
        return true;
        
        ListNode middle=middleLinkedList(head);
        
        while(middle!=null)
        {
            s.push(middle.val);
            middle=middle.next;
        }
        middle=head;
        
        while(middle!=null && !s.isEmpty())
        {
            if(s.pop()!=middle.val)
            return false;
            
            middle=middle.next;
        }
        
        return true;
    }
    

public static ListNode middleLinkedList(ListNode head)
{
    ListNode fast=head,slow=head;
    while(fast!=null && fast.next!=null)
    {
        fast=fast.next.next;
        slow=slow.next;
    }
    
    return slow;
}
}

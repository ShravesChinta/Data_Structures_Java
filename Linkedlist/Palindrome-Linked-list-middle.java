/**
Given the head of a singly linked list, return true if it is a palindrome.

 

Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false
 

Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9

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
        ListNode middle =middleLinkedList(head);
        System.out.println(middle.val);
        ListNode reverseHead=reverseL(middle);

        middle=head;
        while(middle!=null && reverseHead!=null)
        {
            if(middle.val!=reverseHead.val)
                return false;
            middle=middle.next;
            reverseHead=reverseHead.next;
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
    public static ListNode reverseL(ListNode head)
    {
        if(head==null || head.next ==null)
            return head;
        
        ListNode head_new=reverseL(head.next);
        head.next.next=head;
        head.next=null;
        return head_new;
    }
}


//Method two 

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

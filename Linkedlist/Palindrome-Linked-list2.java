
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
**/

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
     ListNode temp=head;
        
        if(head==null || head.next ==null)
        return true;
        
        while(temp!=null)
        {
            s.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        
        while(temp!=null)
        {
            if(s.pop()!=temp.val)
            return false;
            
            temp=temp.next;
        }
        
        return true;
    }
}

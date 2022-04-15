//LeetCode problem to solve Valid Parenthesis in java

// I Tried solving using normal stack, but got runtime time error. So Maps are faster in searching and retrival. Use these in such scenarios

/**
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false

**/

class Solution {
    public boolean isValid(String s) {
        if(s.length() == 1 || (s.length() % 2 == 1)) return false;
        
        Map<Character, Character> map = new HashMap();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        
        Stack<Character> stack = new Stack();
         
        for(int i =0; i < s.length() ; i++){
            if(map.values().contains((s.charAt(i)))){
                stack.push(s.charAt(i));
            }else{
                if (stack.isEmpty()) return false;
                
                if( map.get(s.charAt(i)) != stack.peek()) return false;
                stack.pop();
            }
        }
        
        return stack.isEmpty();
    }
}

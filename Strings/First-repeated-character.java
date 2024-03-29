/**

Given a string S. The task is to find the first repeated character in it. We need to find the character that occurs more than once and whose index of second occurrence is smallest. S contains only lowercase letters.

 

Example 1:

Input: S="geeksforgeeks"
Output: e
Explanation: 'e' repeats at third position.
 

Example 2:

Input: S="hellogeeks"
Output: l
Explanation: 'l' repeats at third position.
 

Example 3:

Input: S="abc"
Output: -1
Explanation: There is no repeated character.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function firstRepChar() which accepts a string S as input parameter and returns a string containing first repeated character in it. If there is no repeated character in the string S then return "-1".
 

Expected Time Complexity: O(|S|) 
Expected Auxiliary Space: O(1)
where |S| denotes length of string S.

**/

class Solution 
{ 
    String firstRepChar(String s) 
    { 
       String rep="-1";
       HashMap<Character, Integer> map=new HashMap<>();
       for(int i=0;i<s.length();i++)
       {
           char c=s.charAt(i);
           if(!map.containsKey(c))
           {
               map.put(c,1);
           }
           
           else{
               rep=""+c;
               break;
           }
       }
       return rep;
    }
} 
 

/***
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false

***/

class Solution {
    public boolean isAnagram(String s, String t) {
       
       if(s.length()!=t.length())
           return false;
       int array_count1[]=new int[256];
       int array_count2[]=new int[256];
       
       Arrays.fill(array_count1,0);
       Arrays.fill(array_count2,0); 
        
       for(int i=0;i<s.length() && i<t.length();i++)
       {
          array_count1[s.charAt(i)]++;
          array_count2[t.charAt(i)]++;
       }
        
       for(int i =0;i<256;i++){
           if(array_count1[i]!=array_count2[i])
               return false;
       }
        
        return true;
    }
}

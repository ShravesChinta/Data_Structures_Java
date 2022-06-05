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
       HashMap<Character, Integer> map1=new HashMap<>();
       HashMap<Character, Integer> map2=new HashMap<>(); 
        int count1=0, count2=0;
       
        if(s.length()!=t.length())
            return false;
        
        for(int i=0;i< s.length() && i<t.length();i++)
        {
            map1.putIfAbsent(s.charAt(i),count1);
            map1.put(s.charAt(i),map1.get(s.charAt(i))+1);
            
            map2.putIfAbsent(t.charAt(i),count1);
            map2.put(t.charAt(i),map2.get(t.charAt(i))+1);
           
        }
        
        for(char x:map1.keySet())
        {
            if(!map2.containsKey(x))
            {   
                return false;
            }
            int x1=map1.get(x);
            int x2=map2.get(x);
            
            if(x1!=x2)
            {
                return false;
            }
            
            
        }
        return true;
    }
}

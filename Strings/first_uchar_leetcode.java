/***
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1

***/

class Solution {
    public int firstUniqChar(String s) {
       
    LinkedHashMap<Character,Integer> count_freq=new LinkedHashMap<>();
	ArrayList<Character> visited_string=new ArrayList<>();
    char word;
    int count=0;
    int index_unique=-1;;
    int count_index=0;
	for(int i=0;i<s.length();i++)
	{  
	   word=s.charAt(i);
       
	   if(Character.isSpace(word))
	   {
	       continue;
	   }
	   else
	   {
	      count_freq.putIfAbsent(word,0);
	      count=count_freq.get(word);
          count_freq.put(word,++count);
	}
       
	
	}
	
	for(Character c:count_freq.keySet())
	{   
	    count=count_freq.get(c);
	    if(count==1)
	    { 
	        index_unique=s.indexOf(c);
            
            break;
	    }
	    
	}
        
        return index_unique;
    }
}

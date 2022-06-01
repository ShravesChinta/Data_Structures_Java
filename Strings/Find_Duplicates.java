//Print all the duplicates in the input string

import java.util.*;

public class Find_Duplicates
{
	public static void main(String[] args) {
	HashMap<Character,Integer> count_freq=new HashMap<>();
	ArrayList<Character> visited_string=new ArrayList<>();
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
    char word;
    int count=0;
	for(int i=0;i<str.length();i++)
	{  
	   word=str.charAt(i);
	   if(Character.isSpace(word))
	   {
	       continue;
	   }
	   else
	   {
	      count_freq.putIfAbsent(word,0);
	      count=count_freq.get(word);
          count_freq.put(word,++count);
          if(count_freq.get(word)>1 && !(visited_string.contains(word)))
          {
            System.out.println("Duplicate " + word);
            visited_string.add(word);
          }
	}
	
	}
	}
	
	
}



/***

Output:
sravanti chinta is a good girl
Duplicate a
Duplicate i
Duplicate n
Duplicate t
Duplicate s
Duplicate o
Duplicate g
Duplicate r

***/

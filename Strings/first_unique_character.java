import java.util.*;

public class first_unique_character
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
	}
	
	}
	
	for(Character c:count_freq.keySet())
	{
	    count=count_freq.get(c);
	    if(count==1)
	    {
	        System.out.println("First Unique Character " + c);
	        break;
	    }
	    
	}
	
	
	}
	
	
}


/***
sravanti chinta is a good girl
First Unique Character c

***/

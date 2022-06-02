//Sorting the string based on frequency of the character

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		String str="tree is a tree";
		HashMap<Character,Integer> freq=new HashMap<>();
		PriorityQueue<Character> pq=new PriorityQueue<>((a,b) -> freq.get(b)-freq.get(a));
		char c;
		int word_count=0;
		StringBuilder res=new StringBuilder();
		for(int i =0;i<str.length();i++)
		{ 
		    c=str.charAt(i);
		    if(!(Character.isSpace(c)))
		    {
		    freq.putIfAbsent(c,0);
		    word_count=freq.get(c);
		    freq.put(c,++word_count);
		    }
		}
		
		pq.addAll(freq.keySet());
		
		while(!(pq.isEmpty()))
		{
		    char heap1=pq.remove();
		    for(int i =0;i<freq.get(heap1);i++)
		    {
		       res.append(heap1); 
		    }
		    
		}
		
		System.out.println(res);
	}
}

//This program reverses a string using Recursion 

public class StringReverse
{
	public static void main(String[] args) {
	    String str=stringReverse("Sravanti Chinta");
	    System.out.println(str);
	}
	
	public static String stringReverse(String s)
	{
	    if(s.equals(""))
	    return "";
	    
	   return stringReverse(s.substring(1))+s.charAt(0);
	  
	   
	}
}



//here s.substring(x) will display values from 1st index till last index, leaving out the 0th index value

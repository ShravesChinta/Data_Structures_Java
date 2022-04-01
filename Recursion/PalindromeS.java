//program to find if string is Palindrome or not recursively


public class PalindromeS
{
	public static void main(String[] args) {
	    Boolean b=stringPalindrome("kayak");
	    System.out.println(b);
	}
	
	public static Boolean stringPalindrome(String input)
	{
	    if(input.length()==0||input.length()==1)
	    return true;
	    
	    if(input.charAt(0)==input.charAt(input.length()-1))
	    {
	        
	        return stringPalindrome(input.substring(1,input.length()-1));
	    }
	    
	    return false;
	    
	   
	}
}

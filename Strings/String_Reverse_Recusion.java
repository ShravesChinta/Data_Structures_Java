//program to print the given string in reverse order recursively


import java.util.*;

public class String_Reverse_Recursion
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		string_reverse(str);
	}
	
	public static void string_reverse(String str)
	{
	   if(str.length()==0)
	   return;
	   
	   string_reverse(str.substring(1,str.length()));
	   System.out.print(str.substring(0,1));
	   
	}
	/***
  
 let us take input string as "Sravanti"
  In the stack we will have like this,now everytime you will print only the first letter of the string. Since on the top of the stack we have i, i will be printed
  first , then we have ti and again the first letter of ti is t. so "it" will be printed and so on...
  
  i  
  ti
  nti
  anti
  vanti
  avanti
  ravanti
  Sravanti
  
  ***/

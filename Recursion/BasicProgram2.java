/*** 
Program to print name n times using recursion

**/

import java.util.*;

public class BasicRecursion2
{
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		String s1=s.next();
		int n=s.nextInt();
		printNTimes(s1,n);
		
	}
	
	public static void printNTimes(String name, int n ){
	    if(n==0)
	    return ;
	    printNTimes(name,n-1);
	    System.out.println(name + " " + (n));
	}
}


//Program to print the sum of first N natural number


import java.util.*;

public class sumOfNNumber
{
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		sumOfNNumbers(n,sum);
		
	}
	
	public static void sumOfNNumbers(int n,int sum){
	    if(n==0)
	   {
	    System.out.println(sum);
	    return;
	   }
	    sumOfNNumbers(n-1,sum+n);
	}



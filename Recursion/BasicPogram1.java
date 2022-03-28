/** Program to print numbers from 1 to N using recursion **/


import java.util.*;

public class BasicProgram1
{
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a =s.nextInt();
		printNTimes(a);
		
	}
	
	public static void printNTimes(int n ){
	    if(n==0)
	    return ;
	    printNTimes(n-1);
	    System.out.println(n);
	}
}

/***

let us say N=4,

then the output should be 
1
2
3
4

The stack will look like this 


| f(1)  |
_________
| f(2)  |
_________
|  f(3) |
_________
| f(4)  |
__________

**/

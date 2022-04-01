//sum of n natural number using recursion 


public class SumOfNNaturalNum2
{
	public static void main(String[] args) {
	
	int sum=recursiveSummation(10);
	System.out.println(sum);
	}
	
	public static int recursiveSummation(int inputNumber)
	{
	    if(inputNumber<=1)
	     return inputNumber;
	     
	     return inputNumber+recursiveSummation(inputNumber-1);
	}
}

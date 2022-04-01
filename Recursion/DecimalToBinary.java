//program to convert decimal number into Binary Recursively


public class DecimalToBinary
{
	public static void main(String[] args) {
	String res="";
	String str=findBinary(10,res);
    System.out.println(str);
	}
	
	public static String findBinary(int decimal, String result)
	{
	    if(decimal==0)
	    return result;
	    
	    result=decimal%2+result;
	    
	    return findBinary(decimal/2,result);
	}
}

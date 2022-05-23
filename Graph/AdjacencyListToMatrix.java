import java.util.*;

public class AdjacencyListToMatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> array=new ArrayList<>();
		for(int i =0;i<=4;i++)
		{
		    array.add(new ArrayList<>());
		}
		
		array.get(0).add(1);
		array.get(0).add(4);
		
		array.get(1).add(0);
		array.get(1).add(2);
		array.get(1).add(3);
		array.get(1).add(4);
		
		array.get(2).add(1);
		array.get(2).add(3);
		
		array.get(3).add(1);
		array.get(3).add(2);
		array.get(3).add(4);
		
		array.get(4).add(0);
		array.get(4).add(1);
		array.get(4).add(3);
		
		 AdListToMatrix(array);
		
	}
	
	public static void AdListToMatrix(ArrayList<ArrayList<Integer>> array)
	{
	    int l = array.size();
	    int Matrix[][] =new int[l][l];
	    
	    for(int i = 0;i<l;i++)
	    {
	        for(int j=0;j<array.get(i).size();j++){
	            Matrix[i][array.get(i).get(j)]=1;
	        }
	    }
	    
	    for(int i =0;i<l;i++)
	    {
	        for(int j =0;j<l;j++)
	        {
	            System.out.print(Matrix[i][j] + " ");
	        }
	        System.out.println(" ");
	    }
	    
	    
	}
}

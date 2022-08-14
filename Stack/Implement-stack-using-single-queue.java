//Implementing stack using single queue

import java.util.*;
class StackUsingQueue{
    Queue<Integer> q=new LinkedList<>();
    
    public void Qpush(int data)
	{
	    q.add(data);
	    int l=q.size();
	    for(int i =0;i<l-1;i++)
	    {
	        q.add(q.remove());
	    }
	}
	
	public int Qpop()
	{
	    System.out.println("the element popped is");
	    return q.remove();
	}
	
	public int Qtop()
	{
	    System.out.println("the element at the top is");
	    return q.peek();
	}
	
	public boolean QisEmpty()
	{
	    if(q.size()==0)
	        return true;
	    else 
	        return false;
	}
}
public class Main
{
	public static void main(String[] args) {
		StackUsingQueue s=new StackUsingQueue();
		
	    s.Qpush(3);
	    s.Qpush(2);
	    s.Qpush(4);
	    System.out.println(s.Qtop());
	    System.out.println(s.Qpop());
	    System.out.println(s.Qtop());
	    s.Qpush(6);
	    System.out.println(s.Qtop());
	    System.out.println(s.QisEmpty());
	}
	
}
/**
the element at the top is
4
the element popped is
4
the element at the top is
2
the element at the top is
6
false

**/

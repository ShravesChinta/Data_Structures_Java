//program to demonstrate stack operation using two queues

import java.util.*;
class StackUsingQueue{
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();
    
    public void Qpush(int data)
	{
	    q2.add(data);
	    while(q1.size()>0)
	    {
	        q2.add(q1.remove());
	    }
	    Queue<Integer> temp=q1;
	    q1=q2;
	    q2=temp;
	}
	
	public int Qpop()
	{
	    System.out.println("the element popped is");
	    return q1.remove();
	}
	
	public int Qtop()
	{
	    System.out.println("the element at the top is");
	    return q1.peek();
	}
	
	public boolean QisEmpty()
	{
	    if(q1.size()==0)
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


/***
output is 

the element at the top is
4
the element popped is
4
the element at the top is
2
the element at the top is
6
false

***/

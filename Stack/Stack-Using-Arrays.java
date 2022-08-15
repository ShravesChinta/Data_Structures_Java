class StackUsingArray
{
    int[] stack=new int[100];
    int counter=-1;
    public int pop()
    {
        if(isEmpty()){
        System.out.println("the stack is empty");
        return -1;
        }
        
        int data1=stack[counter--];
        return data1;
       
        
    }
    
    public void push(int data)
    {
        if(isFull())
        {
            System.out.println("Stack is full");
        }
        else{
        stack[++counter]=data;
        }
    }
    
    public int top()
    {
        return stack[counter];
    }
    
    public boolean isEmpty()
    {
        if(counter<0)
        return true;
        
        return false;
    }
    
    public boolean isFull()
    {
        if(counter==99)
        return true;
         
        return false;
    }
    
}
public class Main
{
	public static void main(String[] args) {
		StackUsingArray s=new StackUsingArray();
		s.pop();
		s.push(3);
		s.push(4);
		s.push(2);
		System.out.println(s.top());
		System.out.println(s.pop());
		s.push(6);
		s.push(10);
		System.out.println(s.top());
	}
}

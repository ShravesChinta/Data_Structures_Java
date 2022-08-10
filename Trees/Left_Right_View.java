
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class Tree{
    Node root;
    Queue<Node> q=new LinkedList<Node>();
    ArrayList<Integer> a=new ArrayList<>();
    static int max_level=0;
     static int max_level1=0;
    
    public void leftview()
    {
        if(root==null)
        return;
        
        q.add(root);
        //a.add(root.data);
        while(q.size()>0)
        {
            int l=q.size();
            
            for(int i =0;i<l;i++)
            {
            Node element=q.remove();
            
            if(i==0)
            a.add(element.data);
            
            if(element.left!=null)
            q.add(element.left);
            
            if(element.right!=null)
            q.add(element.right);
            
            
            }
            
        }
        
        for(int b:a)
        System.out.print(b + "->");
        
        a.clear();
        
    }
    
    public void rightview()
    {
        if(root==null)
        return;
        
        q.add(root);
        //a.add(root.data);
        while(q.size()>0)
        {
            int l=q.size();
            for(int i =1;i<=l;i++)
            {
            Node element=q.remove();
           
            if(i==l)
            a.add(element.data);
            
            if(element.left!=null)
            {
            q.add(element.left);
            }
            
            if(element.right!=null)
            {
            q.add(element.right);
            }
            
            }
        }
        
        for(int b:a)
        System.out.print(b + "->");
        
        a.clear();
    }
    
    public void leftViewR(Node root, int level)
    {
       if(root==null)
       return;
       
       if(max_level<level)
       {
           System.out.print(root.data + "->");
           max_level=level;
       }
       
       //System.out.println("the level value is " + max_level + "and the level value is " + level);
      // leftViewR(root.left, level+1);
       //System.out.println("the level value is " + max_level + "and the level value is " + level);
       leftViewR(root.left, level+1);
       leftViewR(root.right, level+1);
        
    }
    
    
    public void rightViewR(Node root, int level)
    {
     if(root==null)
     return;
     if(max_level1<level)
       {
           System.out.print(root.data + "->");
           max_level1=level;
       }
       
       rightViewR(root.right, level+1);
       rightViewR(root.left, level+1);
     
        
    }
    
}

public class Main
{
	public static void main(String[] args) {
	Tree t=new Tree();
		t.root=new Node(20);
		t.root.left=new Node(39);
		t.root.right=new Node(4);
		t.root.left.left=new Node(10);
		t.root.left.right=new Node(45);
		t.root.right.left=new Node(88);
		t.root.right.right=new Node(100);
		System.out.println("Using iterative way left view");
		t.leftview();
		System.out.println();
		System.out.println("Using iterative way right view");
		t.rightview();
			System.out.println();
		System.out.println("Using recursion way left view");
		t.leftViewR(t.root,1);
			System.out.println();
		System.out.println("Using recursion way right view");
		t.rightViewR(t.root,1);
		

		
	}
}


/***

Using iterative way left view
20->39->10->
Using iterative way right view
20->4->100->
Using recursion way left view
20->39->10->
Using recursion way right view
20->4->100->

***/

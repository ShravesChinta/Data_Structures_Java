
import java.util.*;

class Node
{
    int data;
    Node right;
    Node left;
    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class Tree  
{
   Node root;
   static int max_l1=0;
   static int max_l2=0;
   
   public void DFSR(Node root)
   {
       if(root==null)
       return;
       
       System.out.print(root.data + "->");
       
       DFSR(root.left);
       DFSR(root.right);
       
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
		System.out.println("the dfs of the binary tree recursive way is ");
		t.DFSR(t.root);
	}
}

/***

output is 
the dfs of the binary tree recursive way is 
20->39->10->45->4->88->100->

***/

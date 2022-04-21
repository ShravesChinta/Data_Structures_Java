/***
This Program contains some basic operations in Trees

***/

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
    Node root1;
    Stack<Node> s=new Stack<>();
    Queue<Node> q=new LinkedList<>();
    List<Integer> visited =new ArrayList<>();
    
    public void BFS(Node root)
    {
        if(root==null)
        return;
       
    q.add(root);
    while(q.size()>0)
    {
        Node visited_element=q.remove();
        visited.add(visited_element.data);
        
        if(visited_element.left!=null)
        q.add(visited_element.left);
        
        if(visited_element.right!=null)
        q.add(visited_element.right);
        
    }
    
    for(int a:visited)
    System.out.print(a+" , ");
    
    System.out.println(" ");
    visited.clear();
        
    }
    
    public void DFS(Node root)
    {
        if(root==null)
        return;
       s.push(root);
       while(s.size()>0)
    {
        Node visited_element=s.pop();
        visited.add(visited_element.data);
        
        if(visited_element.right!=null)
        s.add(visited_element.right);
        
        if(visited_element.left!=null)
        s.add(visited_element.left);
        
    }
    
    for(int a:visited)
    System.out.print(a+" , ");
    
    System.out.println(" ");
    visited.clear(); 
        
    }
    
    public void inOrderTraversal(Node root)
    {
        if(root==null)
        return;
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
        
    }
    
    public void preOrderTraversal(Node root)
    {
        if(root==null)
        return;
        System.out.print(root.data+ " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
        
    }
    
    public void postOrderTraversal(Node root)
    {
        if(root==null)
        return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
        
    }
    
    public void LevelOrderTraversal(Node root)
    {
       q.add(root);
       int height_of_tree=0;
       while(q.size()>0)
    {   
        int size_q=q.size();
        
        while(size_q>0){
        
        Node visited_element=q.remove();
        visited.add(visited_element.data);
        
        if(visited_element.left!=null)
        q.add(visited_element.left);
        
        if(visited_element.right!=null)
        q.add(visited_element.right);
        
        size_q--;
        
        }
        height_of_tree++;
        
    }
    
    for(int a:visited)
    System.out.print(a+" , ");
    
    System.out.println(" ");
    visited.clear(); 
    
    System.out.println("Height of the tree is " + height_of_tree);
        
    }
    
   
    public boolean symmetricTree(Node root)
    {
    if(root==null)
    return true;
    
    return isSymmetric(root.left,root.right);
    }
    
    public boolean isSymmetric(Node left, Node right)
    {
        if(left==null && right ==null)
        return true;
        
        else if(right==null || left==null)
        return false;
        
        if(left.data!=right.data)
        return false;
        
        
        if(!isSymmetric(left.left,right.right))
        return false;
        
        if(!isSymmetric(left.right, right.left))
        return false;
        
        return true;
        
    }
    
    public void leftViewTree(Node root)
    {
     
     q.add(root);
       int height_of_tree=0;
       while(q.size()>0)
    {   
        int size_q=q.size();
        
        while(size_q>0){
        
        Node visited_element=q.remove();
        visited.add(visited_element.data);
        
        if(visited_element.left!=null)
        {
        q.add(visited_element.left);
        System.out.print(visited_element.left.data + "->");
        }
        
        if(visited_element.right!=null)
        q.add(visited_element.right);
        
        size_q--;
        
        }
       
        
    }
    
        
    }
    
    public void rightViewTree(Node root)
    {
      q.add(root);
       int height_of_tree=0;
       while(q.size()>0)
    {   
        int size_q=q.size();
        
        while(size_q>0){
        
        Node visited_element=q.remove();
        visited.add(visited_element.data);
        
        if(visited_element.left!=null)
        {
        q.add(visited_element.left);
        System.out.print(visited_element.left.data + "->");
        }
        
        if(visited_element.right!=null)
        {
            q.add(visited_element.right);
            System.out.print(visited_element.left.data + "->");
        }
        
        size_q--;
        
        }  
        
        
    }
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
		t.BFS(t.root);
		t.DFS(t.root);
		t.inOrderTraversal(t.root);
		System.out.println(" ");
		t.preOrderTraversal(t.root);
		System.out.println(" ");
		t.postOrderTraversal(t.root);
		System.out.println(" ");
		t.LevelOrderTraversal(t.root);
		System.out.println("is the tree symmetric");
		t.root1=new Node(1);
		t.root1.left=new Node(2);
		t.root1.right=new Node(2);
		t.root1.left.left=new Node(3);
		t.root1.left.right=new Node(4);
		t.root1.right.left=new Node(4);
		t.root1.right.right=new Node(3);
		System.out.println(t.symmetricTree(t.root1));
		System.out.println("Left view of the tree");
		t.leftViewTree(t.root);
		System.out.println(" ");
		System.out.println("Right view of the tree");
		t.rightViewTree(t.root);
		
		
	}
}


/***

Output:
20 , 39 , 4 , 10 , 45 , 88 , 100 ,  
20 , 39 , 10 , 45 , 4 , 88 , 100 ,  
10 39 45 20 88 4 100  
20 39 10 45 4 88 100  
10 45 39 88 100 4 20  
20 , 39 , 4 , 10 , 45 , 88 , 100 ,  
Height of the tree is 3
is the tree symmetric
true
Left view of the tree
39->10->88-> 
Right view of the tree
39->39->10->10->88->88->

***/




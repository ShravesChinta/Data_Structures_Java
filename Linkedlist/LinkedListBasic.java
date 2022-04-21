/**

Program to perform basic operations in Linked list

1) Insert at Beginning
2) Insert at End
3) Insert at some given position
4) Delete at Beginning
5) Delete at End
6) Delete at some given position
7) Delete by given value
8) Print the list in reverse order
9) Display the List 
10) Rempove duplicates from the list
11) Reverse the list iteratively



**/

class Node{
    int data;
    Node next;
    Node(){
        this.data=0;
        this.next=null;
    }
    
}

class LinkedList{
    Node root;
    
    
    
public void deleteAtBeg(){
    if(root==null)
    return;
    
    root=root.next;

}   

public void deleteAtEnd(){
    Node temp=root;
    Node prev=root;
    if(root==null)
    return;
    
    while(temp.next!=null){
        prev=temp;
        temp=temp.next;
    }
    
    prev.next=null;
    
    
}

public void deleteAtRandom(int pos){

Node temp=root;
Node prev=root;
int count=0;
if(root==null)
return;

while(temp.next!=null&& count< (pos-1))
{
    prev=temp;
    temp=temp.next;
    count++;
    
}
prev.next=temp.next;

}

public void deleteByValue(int val){
   Node temp=root;
   Node prev=root;
   if(root==null)
   return;
   
   while(temp!=null){
       if(temp.data==val)
       {
           System.out.println("Element found");
           break;
       }
       prev=temp;
       temp=temp.next;
   }
   
   prev.next=temp.next;
    
}

public void insertAtBeg(int val){
    if(root.data==0)
    root=null;
    
    Node new_node=new Node();
    new_node.data=val;
    
    if(root==null)
    {
        new_node.next=null;
        root=new_node;
    }
    else
    {   
        new_node.next=root;
        root=new_node;
    }
    
}

public void insertAtEnd(int val){
    Node new_node=new Node();
    Node temp=root;
    new_node.data=val;
    new_node.next=null;
    
    
    if(root==null)
    {
        root=new_node;
    }
    
    else
    {
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        
        temp.next=new_node;
        
    }
}

public void insertAtRandom(int val, int pos){
    
    Node temp=root;
    Node new_node=new Node();
    new_node.data=val;
    new_node.next=null;
    
    int count=0;
    
    if(pos<0)
    return;
    
    else if(root==null&&pos>1)
    return;
    
    else{
        while(temp!=null&&count<(pos-2))
        {
            temp=temp.next;
            count++;
        }
        new_node.next=temp.next;
        temp.next=new_node;
        
    }
    
  
}

public void reversePrint(Node root){
    if(root==null)
    return;
    
    reversePrint(root.next);
    System.out.print(root.data + " - >");
}

public void removeDuplicates()
{
    Node temp=root;
if(root==null|| root.next==null)
return;

else{
    while(temp.next!=null)
    {
        if(temp.data==temp.next.data)
        {
            temp.next=temp.next.next;
        }
        
        else{
            temp=temp.next;
        }
    }
}

    
}

public void display(Node root)
{
    Node temp=root;
    if(root==null)
    {
    return;
    }
    
    else{

        while(temp!=null)
        {
            //System.out.println("hello");
            System.out.print(temp.data+" - >");
            temp=temp.next;
        }
        System.out.println(" ");
    }
}


public  Node reverseListI(Node root)
{
    Node next=null;
    Node curr=root;
    Node prev=null;
    if(root==null)
    return prev;
    
    while(curr!=null)
    {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        
    }
    return prev;
}


}
public class Main
{
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.root=new Node();
		l.insertAtBeg(1);
		l.insertAtBeg(2);
		l.insertAtBeg(2);
		l.insertAtBeg(3);
		l.insertAtBeg(4);
		l.insertAtBeg(5);
		l.insertAtBeg(8);
		l.insertAtBeg(8);
		l.insertAtBeg(8);
		l.insertAtEnd(25);
		System.out.println("Linked List display");
		l.display(l.root);
		System.out.println("Linked List  reverse display");
		l.reversePrint(l.root);
		System.out.println(" ");
	    System.out.println("Linked List before removing duplicates");
	    l.display(l.root);
		System.out.println("Linked List after removing duplicates");
		l.removeDuplicates();
		l.display(l.root);
		System.out.println("Insert at some pos");
		l.insertAtRandom(66, 5);
		l.display(l.root);
		System.out.println("Insert at some pos");
		l.insertAtRandom(100, 9);
		l.display(l.root);
		System.out.println("Delete at Beg");
		l.deleteAtBeg();
		l.display(l.root);
		System.out.println("Delete at the end");
		l.deleteAtEnd();
		l.display(l.root);
		System.out.println("Delete at some position");
		l.deleteAtRandom(5);
		l.display(l.root);
		System.out.println("Delete by some particular value");
		l.deleteByValue(66);
		l.display(l.root);
		System.out.println("Element after reversing the list iterative method");
		l.display(l.reverseListI(l.root));
	
	
		
		
	}
}

/**

Output:

Linked List display
8 - >8 - >8 - >5 - >4 - >3 - >2 - >2 - >1 - >25 - > 
Linked List  reverse display
25 - >1 - >2 - >2 - >3 - >4 - >5 - >8 - >8 - >8 - > 
Linked List before removing duplicates
8 - >8 - >8 - >5 - >4 - >3 - >2 - >2 - >1 - >25 - > 
Linked List after removing duplicates
8 - >5 - >4 - >3 - >2 - >1 - >25 - > 
Insert at some pos
8 - >5 - >4 - >3 - >66 - >2 - >1 - >25 - > 
Insert at some pos
8 - >5 - >4 - >3 - >66 - >2 - >1 - >25 - >100 - > 
Delete at Beg
5 - >4 - >3 - >66 - >2 - >1 - >25 - >100 - > 
Delete at the end
5 - >4 - >3 - >66 - >2 - >1 - >25 - > 
Delete at some position
5 - >4 - >3 - >66 - >1 - >25 - > 
Delete by some particular value
Element found
5 - >4 - >3 - >1 - >25 - > 
Element after reversing the list iterative method
25 - >1 - >3 - >4 - >5 - > 

**/

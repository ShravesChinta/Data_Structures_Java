//Program to find Bottom view of Binary tree
class Pair
{
    int key;
    Node n;
    Pair(Node n, int key)
    {
        this.n=n;
        this.key=key;
    }
}
class Node
{
  int data;
  Node next;
  Node(int data, Node next)
  {
    this.data=data;
    this.next=next;
  }
  
class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
       ArrayList<Integer> a=new ArrayList<>();
       Map<Integer, Integer> map=new TreeMap<>();
       Queue<Pair> q=new LinkedList<>();
       
       if(root==null)
       return a;
       
       q.add(new Pair(root, 0));
       while(q.size()>0)
       {
           Pair s=q.remove();
           Node node_new=s.n;
           map.put(s.key, node_new.data);
           if(node_new.left!=null)
           {
               q.add(new Pair(node_new.left,s.key-1));
           }
           if(node_new.right!=null)
           {
               q.add(new Pair(node_new.right, s.key+1));
           }
           
       }
       for(int p:map.keySet())
       {
           a.add(map.get(p));
       }
       
       return a;
    }
}

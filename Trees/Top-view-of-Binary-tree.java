//program to get top view of binary tree in java, passed 5/105 test cases only...need to optimise the code


/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
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
class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        
        if(root==null)
        return ans; 
        
        Queue<Pair> q=new LinkedList<>();
        Map<Integer, Integer> map=new TreeMap<>();
        q.add(new Pair(root,0));
        while(q.size()>0)
        {
         Pair p=q.remove();
         int data=p.key;
         Node ele=p.n;
         if(!map.containsKey(data))
         {
             map.put(data, ele.data);
         }
         
         if(ele.left!=null)
         q.add(new Pair(root.left,data-1));
         
         if(ele.right!=null)
         q.add(new Pair(root.right, data+1));
            
        }
        
        
        for(int a:map.keySet())
        {
            ans.add(map.get(a));
        }
        
        return ans;
    }
}


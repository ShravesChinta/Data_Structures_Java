import java.util.*;
import java.io.*;


class Graph
{
  Map<String,List<String>> graphnodes=new HashMap<>();
  Queue<String> q=new LinkedList<>();
  Stack<String> s=new Stack<>();
  ArrayList<String> visited=new ArrayList<>();
  
  public void BFS(String node){
      String visited_node="";
      q.add(node);
      while(q.size()!=0)
      {
      visited_node=q.remove();
      visited.add(visited_node);
        if(graphnodes.get(visited_node)==null)
        {
            
        }
        else{
            for(int i =0;i<graphnodes.get(visited_node).size();i++)
            {
                q.add(graphnodes.get(visited_node).get(i));
            }
            
        }
        
      }
      System.out.println(visited);
        visited.clear();
  }
  
  public void DFS(String node){
      String visited_node="";
      s.push(node);
      while(s.size()!=0)
      {
      visited_node=s.pop();
      visited.add(visited_node);
      if(graphnodes.get(visited_node)==null)
      {
                  
      }
      else{
          for(int i =0;i<graphnodes.get(visited_node).size();i++)
            {
                s.push(graphnodes.get(visited_node).get(i));
            }
      }
      }
      System.out.println(visited);
        visited.clear();
  }
  
  public void addEdge(String x, String y)
  {
    graphnodes.putIfAbsent(x, new ArrayList<>());  
    graphnodes.get(x).add(y);
  }
    
}
public class Main
{
	public static void main(String[] args) {
		Graph g =new Graph();
		 g.addEdge("A", "C");
        g.addEdge("A", "B");
        g.addEdge("B", "D");
        g.addEdge("D", "E");
        g.addEdge("D", "F");
        g.addEdge("D", "G");
        g.addEdge("E", "H");
        g.BFS("A");
        g.DFS("A");
	}
}

/***
[A, C, B, D, E, F, G, H]
[A, B, D, G, F, E, H, C]
***/

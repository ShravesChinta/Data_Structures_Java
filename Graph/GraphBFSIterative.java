import java.util.*;

class Graph {
    Map<String, List<String>> graph_nodes = new HashMap<>();
    Queue<String> q = new LinkedList<>();
    List<String> visited = new ArrayList<>();

    public void insertNE(String node1, String node2) {
        graph_nodes.putIfAbsent(node1, new ArrayList<>());
        graph_nodes.get(node1).add(node2);
    }

    public void BFSGraph(String vertex1) {
        q.add(vertex1);
        while (q.size() > 0) {
            String vertex = q.remove();
            visited.add(vertex);
            if (graph_nodes.get(vertex) != null) {
                for (int i = 0; i < graph_nodes.get(vertex).size(); i++) {
                    if (!visited.contains(graph_nodes.get(vertex).get(i)))
                        q.add(graph_nodes.get(vertex).get(i));

                }

            }
            System.out.println(visited);

        }

    }

public class GraphBFSIterative
{
	public static void main(String[] args) {
	Graph g =new Graph();
	g.insertNE("a","b");
	g.insertNE("a","c");
	g.insertNE("a","d");
	g.insertNE("c","e");
	g.insertNE("e","f");
	g.insertNE("c","g");
	g.insertNE("g","h");
	g.insertNE("f","i");
	g.insertNE("i","j");
	g.insertNE("j","k");
	g.BFSGraph("a");
	}
}

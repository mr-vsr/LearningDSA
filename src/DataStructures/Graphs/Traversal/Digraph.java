package DataStructures.Graphs.Traversal;

import java.util.*;

public class Digraph {
    private int V;
    private List<Integer>[] adjList;
    public Digraph(int V){
        this.V = V;
        adjList = new ArrayList[V+1];
        for(int i=1;i<=V;i++){
            adjList[i] = new ArrayList<Integer>();
        }
    }
    public void addEdge(int from , int to){
        adjList[from].add(to);
    }
    public List<Integer> getAdjacentNodes(int node){
        return adjList[node];
    }
    public int getNumVertices() {
        return V;
    }
}

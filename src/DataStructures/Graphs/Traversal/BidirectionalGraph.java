package DataStructures.Graphs.Traversal;

import java.util.*;

public class BidirectionalGraph {
    private int vertices;
    private LinkedList<Integer>[] adjacencyList;
    public BidirectionalGraph(int vertices){
     this.vertices = vertices;
     adjacencyList = new LinkedList[vertices+1];
     for(int i=1;i<=vertices;i++){
        adjacencyList[i] = new LinkedList<>();
        }
    }
    void addEdge(int src , int dest){
        adjacencyList[src].add(dest);
        adjacencyList[dest].add(src);
    }
    public int getVertices(){
        return this.vertices;
    }
    public List<Integer> getAdjacencyList(int vertex){
        return adjacencyList[vertex];
    }


}

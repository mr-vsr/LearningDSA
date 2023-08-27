package DataStructures.Graphs.Traversal;

import java.util.*;

public class BidirectionalGraphUsingDfs {
    private int vertices;
    private List<Integer>[] adjacencyList;
    public BidirectionalGraphUsingDfs(int vertices){
     this.vertices = vertices;
     adjacencyList = new LinkedList[vertices];
     for(int i=0;i<vertices;i++){
        adjacencyList[i] = new LinkedList<>();
        }
    }
    void addEdge(int src , int dest){
        adjacencyList[src].add(dest);
        adjacencyList[dest].add(src);
    }
    void dfs(int vertex,boolean[] visited){
        visited[vertex] = true;
        for(int neighbour : adjacencyList[vertex]){
            if(!visited[neighbour]){
                dfs(neighbour,visited);
            }
        }
    }

    boolean isConnected(){
        boolean[] visited = new boolean[vertices];
        dfs(0,visited);
        for(boolean v : visited){
            if(!v){
                return false;
            }
        }
        return true;
    }

}

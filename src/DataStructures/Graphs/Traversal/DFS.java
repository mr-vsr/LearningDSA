package DataStructures.Graphs.Traversal;

import java.util.List;
public class DFS {
    void dfs(int vertex, boolean[] visited, BidirectionalGraph graph){
        visited[vertex] = true;
        List<Integer> Neighbours = graph.getAdjacencyList(vertex);
        for(int neighbour : Neighbours){
            if(!visited[neighbour]){
                dfs(neighbour,visited,graph);
            }
        }
    }

    boolean isConnected(BidirectionalGraph graph){
        boolean[] visited = new boolean[graph.getVertices()+1];
        visited[0] = true;
        dfs(1,visited,graph);
        for(boolean v : visited){
            if(!v){
                return false;
            }
        }
        return true;
    }
}

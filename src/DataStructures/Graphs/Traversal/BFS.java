package DataStructures.Graphs.Traversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS{
    public static void bfs(Digraph graph , int startNode){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[graph.getNumVertices()+1];

        queue.add(startNode);
        visited[startNode] = true;

        while(!queue.isEmpty()){

            int currentNode = queue.poll();
            System.out.println(currentNode + " ");
            List<Integer> adjacentNodes = graph.getAdjacentNodes(currentNode);

            for(int adjacentNode : adjacentNodes){
                if(!visited[adjacentNode]){
                    queue.add(adjacentNode);
                    visited[adjacentNode] = true;
                }
            }
        }
     }
}


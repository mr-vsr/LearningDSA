package DataStructures.Graphs.Traversal;
import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter the number of Nodes in your digraph");
////        int numNodes = sc.nextInt();
//
//        Digraph graph = new Digraph(5);
//
////        boolean nodesLeft = true,addingEdge;
////        while(nodesLeft) {
////
////            System.out.println("Enter the node ");
////            int node = sc.nextInt();
////            addingEdge = true;
////
////            while (addingEdge) {
////
////                System.out.println("Enter the neighbours of " + node);
////                int neighbour = sc.nextInt();
////                graph.addEdge(node, neighbour);
////                System.out.println("More edges required?");
////                addingEdge = sc.nextBoolean();
////            }
////            System.out.println("More Nodes required?");
////            nodesLeft = sc.nextBoolean();
////        }
//
//        graph.addEdge(1,2);
////        graph.addEdge(1,6);
//        graph.addEdge(2,3);
//        graph.addEdge(3,4);
//        graph.addEdge(5,4);
//        graph.addEdge(5,1);
//        graph.addEdge(3,5);
//        graph.addEdge(5,2);
////        graph.addEdge(5,8);
//
//
//
////        System.out.println("Enter a start Node");
////        int startNode = sc.nextInt();
//
//        System.out.println("Nodes reachable from node " + 1 + ":");
//        BFS.bfs(graph,1);
//    }
//}

// Main function for dfs using main

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        int vertices = sc.nextInt();
        BidirectionalGraphUsingDfs graph = new BidirectionalGraphUsingDfs(vertices);
        System.out.println("Enter the number of edges");
        int edges = sc.nextInt();
        for(int i=0;i<edges;i++){
            int src = sc.nextInt();
            int dest = sc.nextInt();
            graph.addEdge(src,dest);
        }
        boolean isConnected = graph.isConnected();
        if(isConnected){
            System.out.println("The graph is connected");
        }
        else{
            System.out.println("The graph is not connected");
        }
    }
}

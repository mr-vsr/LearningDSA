package DataStructures.Graphs.Algorithm;
    import java.util.*;

    class Graph {
        private int V;
        private List<List<Edge>> adj;

        Graph(int V) {
            this.V = V;
            adj = new ArrayList<>(V);
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
        }

        void addEdge(int u, int v, int weight) {
            adj.get(u).add(new Edge(v, weight));
            adj.get(v).add(new Edge(u, weight)); // If the graph is undirected
        }

        int[] dijkstra(int source) {
            int[] dist = new int[V];
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[source] = 0;

            PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.dist));
            pq.offer(new Node(source, 0));

            while (!pq.isEmpty()) {
                Node curr = pq.poll();

                for (Edge edge : adj.get(curr.vertex)) {
                    int newDist = curr.dist + edge.weight;
                    if (newDist < dist[edge.destination]) {
                        dist[edge.destination] = newDist;
                        pq.offer(new Node(edge.destination, newDist));
                    }
                }
            }

            return dist;
        }

        static class Edge {
            int destination, weight;

            Edge(int destination, int weight) {
                this.destination = destination;
                this.weight = weight;
            }
        }

        static class Node {
            int vertex, dist;

            Node(int vertex, int dist) {
                this.vertex = vertex;
                this.dist = dist;
            }
        }
    }

    public class Dijkstras {
        public static void main(String[] args) {
            int V = 5; // Number of vertices
            Graph graph = new Graph(V);

            graph.addEdge(0, 1, 4);
            graph.addEdge(0, 2, 1);
            graph.addEdge(2, 1, 2);
            graph.addEdge(1, 3, 5);
            graph.addEdge(2, 3, 2);
            graph.addEdge(3, 4, 1);

            int source = 0; // Source vertex
            int[] shortestDistances = graph.dijkstra(source);

            System.out.println("Shortest distances from vertex " + source + " to all other vertices:");
            for (int i = 0; i < V; i++) {
                System.out.println("Vertex " + i + ": " + shortestDistances[i]);
            }
        }
    }

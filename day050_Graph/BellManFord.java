import java.util.*;

class Edge {
    int source, destination, weight;

    public Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
}

public class BellManFord {
    static final int INF = Integer.MAX_VALUE;

    public static void bellmanFord(List<Edge> edges, int numVertices, int start) {
        int[] distances = new int[numVertices];
        Arrays.fill(distances, INF);
        distances[start] = 0;

        for (int i = 0; i < numVertices - 1; i++) {
            for (Edge edge : edges) {
                if (distances[edge.source] != INF && distances[edge.source] + edge.weight < distances[edge.destination]) {
                    distances[edge.destination] = distances[edge.source] + edge.weight;
                }
            }
        }

        // Check for negative weight cycles
        for (Edge edge : edges) {
            if (distances[edge.source] != INF && distances[edge.source] + edge.weight < distances[edge.destination]) {
                System.out.println("Graph contains negative weight cycle.");
                return;
            }
        }

        // Print the distances from the start vertex
        System.out.println("Vertex \t Distance from Source");
        for (int i = 0; i < numVertices; i++) {
            System.out.println(i + "\t\t" + distances[i]);
        }
    }

    public static void main(String[] args) {
        int numVertices = 5;
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0, 1, -1));
        edges.add(new Edge(0, 2, 4));
        edges.add(new Edge(1, 2, 3));
        edges.add(new Edge(1, 3, 2));
        edges.add(new Edge(1, 4, 2));
        edges.add(new Edge(3, 2, 5));
        edges.add(new Edge(3, 1, 1));
        edges.add(new Edge(4, 3, -3));
        bellmanFord(edges, numVertices, 0);
    }
}

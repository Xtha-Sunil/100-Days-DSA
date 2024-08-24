import java.util.LinkedList;
import java.util.Queue;

class Graph {
    private int V; // Number of vertices
    private LinkedList<Integer>[] adj; // Adjacency list representation

    // Constructor
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

    // Add an edge to the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // Breadth-First Search starting from a given source vertex
    void BFS(int s) {
        boolean[] visited = new boolean[V]; // Mark all vertices as not visited
        Queue<Integer> queue = new LinkedList<>(); // Create a queue for BFS

        visited[s] = true; // Mark the current node as visited and enqueue it
        queue.add(s);

        while (!queue.isEmpty()) {
            s = queue.poll(); // Dequeue a vertex from the queue and print it
            System.out.print(s + " ");

            // Get all adjacent vertices of the dequeued vertex s. If an adjacent
            // has not been visited, then mark it visited and enqueue it.
            for (Integer neighbor : adj[s]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);

        System.out.println("Breadth-First Traversal (starting from vertex 0):");
        graph.BFS(0);
    }
}

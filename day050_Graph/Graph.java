import java.util.*;

class Graph {
    private int V;
    private LinkedList<Integer>[] adj;
    private int time;

    Graph(int V) {
        this.V = V;
        adj = new LinkedList[V];
        for (int i = 0; i < V; ++i)
            adj[i] = new LinkedList();
        time = 0;
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    void bridgeUtil(int u, boolean visited[], int disc[], int low[], int parent[]) {
        visited[u] = true;
        disc[u] = low[u] = ++time;

        for (Integer v : adj[u]) {
            if (!visited[v]) {
                parent[v] = u;
                bridgeUtil(v, visited, disc, low, parent);
                low[u] = Math.min(low[u], low[v]);

                if (low[v] > disc[u])
                    System.out.println(u + " " + v);
            } else if (v != parent[u])
                low[u] = Math.min(low[u], disc[v]);
        }
    }

    void bridge() {
        boolean[] visited = new boolean[V];
        int[] disc = new int[V];
        int[] low = new int[V];
        int[] parent = new int[V];

        for (int i = 0; i < V; i++) {
            parent[i] = -1;
            visited[i] = false;
        }

        for (int i = 0; i < V; i++)
            if (!visited[i])
                bridgeUtil(i, visited, disc, low, parent);
    }

    public static void main(String args[]) {
        System.out.println("Bridges in the graph:");
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(3, 4);
        g.bridge();
    }
}
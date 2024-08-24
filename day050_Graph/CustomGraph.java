import java.util.*;

class CustomGraph {
    private int V;
    private LinkedList<Integer>[] adj;
    private int time;

    CustomGraph(int V) {
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

    void APUtil(int u, boolean[] visited, int[] disc, int[] low, int[] parent, boolean[] ap) {
        int children = 0;
        visited[u] = true;
        disc[u] = low[u] = ++time;

        for (Integer v : adj[u]) {
            if (!visited[v]) {
                children++;
                parent[v] = u;
                APUtil(v, visited, disc, low, parent, ap);
                low[u] = Math.min(low[u], low[v]);

                if (parent[u] == -1 && children > 1)
                    ap[u] = true;

                if (parent[u] != -1 && low[v] >= disc[u])
                    ap[u] = true;
            } else if (v != parent[u])
                low[u] = Math.min(low[u], disc[v]);
        }
    }

    void articulationPoints() {
        boolean[] visited = new boolean[V];
        int[] disc = new int[V];
        int[] low = new int[V];
        int[] parent = new int[V];
        boolean[] ap = new boolean[V];

        for (int i = 0; i < V; i++) {
            parent[i] = -1;
            visited[i] = false;
            ap[i] = false;
        }

        for (int i = 0; i < V; i++)
            if (!visited[i])
                APUtil(i, visited, disc, low, parent, ap);

        System.out.println("Articulation points in the graph:");
        for (int i = 0; i < V; i++)
            if (ap[i])
                System.out.print(i + " ");
    }

    public static void main(String args[]) {
        CustomGraph g = new CustomGraph(7);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(1, 6);
        g.addEdge(3, 5);
        g.addEdge(4, 5);
        g.articulationPoints();
    }
}
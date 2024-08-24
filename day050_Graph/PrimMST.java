import java.util.*;

class PrimMST {
    static int V;
    static List<List<Edge>> graph;

    static class Edge {
        int to, weight;

        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static void addEdge(int u, int v, int weight) {
        graph.get(u).add(new Edge(v, weight));
        graph.get(v).add(new Edge(u, weight));
    }

    static int primMST() {
        boolean[] inMST = new boolean[V];
        int[] key = new int[V];
        int[] parent = new int[V];

        Arrays.fill(key, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);

        key[0] = 0;

        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));
        pq.add(new Edge(0, 0));

        int mstWeight = 0;

        while (!pq.isEmpty()) {
            int u = pq.poll().to;
            inMST[u] = true;

            for (Edge e : graph.get(u)) {
                int v = e.to;
                int weight = e.weight;

                if (!inMST[v] && weight < key[v]) {
                    pq.add(new Edge(v, weight));
                    parent[v] = u;
                    key[v] = weight;
                }
            }
        }

        for (int i = 1; i < V; i++) {
            mstWeight += key[i];
        }

        return mstWeight;
    }

    public static void main(String[] args) {
        V = 5;  // Number of vertices
        graph = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        addEdge(0, 1, 2);
        addEdge(0, 3, 6);
        addEdge(1, 2, 3);
        addEdge(1, 3, 8);
        addEdge(1, 4, 5);
        addEdge(2, 4, 7);
        addEdge(3, 4, 9);

        int mstWeight = primMST();
        System.out.println("Minimum Spanning Tree Weight: " + mstWeight);
    }
}

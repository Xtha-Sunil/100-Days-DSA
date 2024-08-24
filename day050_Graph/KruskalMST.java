import java.util.*;

class KruskalMST {
    static class Edge implements Comparable<Edge> {
        int src, dest, weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }

        public int compareTo(Edge other) {
            return Integer.compare(this.weight, other.weight);
        }
    }

    static class Subset {
        int parent, rank;

        Subset(int parent, int rank) {
            this.parent = parent;
            this.rank = rank;
        }
    }

    static int V, E;  // Number of vertices and edges
    static List<Edge> edges;

    static void addEdge(int src, int dest, int weight) {
        edges.add(new Edge(src, dest, weight));
    }

    static int find(Subset[] subsets, int i) {
        if (subsets[i].parent != i)
            subsets[i].parent = find(subsets, subsets[i].parent);
        return subsets[i].parent;
    }

    static void union(Subset[] subsets, int x, int y) {
        int xRoot = find(subsets, x);
        int yRoot = find(subsets, y);

        if (subsets[xRoot].rank < subsets[yRoot].rank)
            subsets[xRoot].parent = yRoot;
        else if (subsets[xRoot].rank > subsets[yRoot].rank)
            subsets[yRoot].parent = xRoot;
        else {
            subsets[yRoot].parent = xRoot;
            subsets[xRoot].rank++;
        }
    }

    static void kruskalMST() {
        List<Edge> result = new ArrayList<>();
        Collections.sort(edges);

        Subset[] subsets = new Subset[V];
        for (int i = 0; i < V; i++) {
            subsets[i] = new Subset(i, 0);
        }

        int e = 0;
        int i = 0;

        while (e < V - 1 && i < E) {
            Edge nextEdge = edges.get(i);
            i++;

            int x = find(subsets, nextEdge.src);
            int y = find(subsets, nextEdge.dest);

            if (x != y) {
                result.add(nextEdge);
                union(subsets, x, y);
                e++;
            }
        }

        System.out.println("Minimum Spanning Tree:");
        for (Edge edge : result) {
            System.out.println(edge.src + " - " + edge.dest + " : " + edge.weight);
        }
    }

    public static void main(String[] args) {
        V = 4;  // Number of vertices
        E = 5;  // Number of edges
        edges = new ArrayList<>();

        addEdge(0, 1, 10);
        addEdge(0, 2, 6);
        addEdge(0, 3, 5);
        addEdge(1, 3, 15);
        addEdge(2, 3, 4);

        kruskalMST();
    }
}

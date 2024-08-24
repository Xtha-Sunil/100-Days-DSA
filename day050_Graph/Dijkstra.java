import java.util.*;

public class Dijkstra {
    private static final int INF = Integer.MAX_VALUE;

    public static void dijkstra(int[][] graph, int start) {
        int numVertices = graph.length;
        int[] distances = new int[numVertices];
        boolean[] visited = new boolean[numVertices];

        Arrays.fill(distances, INF);
        distances[start] = 0;

        for (int i = 0; i < numVertices - 1; i++) {
            int minVertex = findMinVertex(distances, visited);
            visited[minVertex] = true;

            for (int j = 0; j < numVertices; j++) {
                if (!visited[j] && graph[minVertex][j] != 0 && distances[minVertex] != INF
                        && distances[minVertex] + graph[minVertex][j] < distances[j]) {
                    distances[j] = distances[minVertex] + graph[minVertex][j];
                }
            }
        }

        // Print the distances from the start vertex
        System.out.println("Vertex \t Distance from Source");
        for (int i = 0; i < numVertices; i++) {
            System.out.println(i + "\t\t" + distances[i]);
        }
    }

    private static int findMinVertex(int[] distances, boolean[] visited) {
        int minVertex = -1;
        for (int i = 0; i < distances.length; i++) {
            if (!visited[i] && (minVertex == -1 || distances[i] < distances[minVertex])) {
                minVertex = i;
            }
        }
        return minVertex;
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 14, 10, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 1, 6},
            {8, 11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        dijkstra(graph, 0);
    }
}

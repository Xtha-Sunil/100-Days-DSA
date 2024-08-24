import java.util.*;

class Vertex {
    String label;
    Map<Vertex, Integer> neighbors; 

    public Vertex(String label) {
        this.label = label;
        neighbors = new HashMap<>();
    }

    public void addNeighbor(Vertex neighbor, int weight) {
        neighbors.put(neighbor, weight);
    }

    public String toString() {
        return label;
    }
}

class Graph {
    private Map<String, Vertex> vertices;

    public Graph() {
        vertices = new HashMap<>();
    }

    public void addVertex(String label) {
        if (!vertices.containsKey(label)) {
            Vertex vertex = new Vertex(label);
            vertices.put(label, vertex);
        }
    }

    public void addEdge(String label1, String label2, int weight) {
        if (vertices.containsKey(label1) && vertices.containsKey(label2)) {
            Vertex vertex1 = vertices.get(label1);
            Vertex vertex2 = vertices.get(label2);

            vertex1.addNeighbor(vertex2, weight);
            vertex2.addNeighbor(vertex1, weight);
        }
    }

    public List<Vertex> getNeighbors(String label) {
        if (vertices.containsKey(label)) {
            return new ArrayList<>(vertices.get(label).neighbors.keySet());
        }
        return new ArrayList<>();
    }

    public void printGraph() {
        for (Vertex vertex : vertices.values()) {
            System.out.print("Vertex " + vertex.label + ": ");
            for (Map.Entry<Vertex, Integer> entry : vertex.neighbors.entrySet()) {
                System.out.print("(" + entry.getKey().label + ", " + entry.getValue() + ") ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph();
        g.addVertex("A");
        g.addVertex("B");
        g.addVertex("C");
        g.addEdge("A", "B", 3);
        g.addEdge("A", "C", 2);
        g.addEdge("B", "C", 5);

        g.printGraph();
    }
}

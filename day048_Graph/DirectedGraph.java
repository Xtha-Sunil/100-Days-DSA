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

class DirectedWeightedGraph {
    private Map<String, Vertex> vertices;

    public DirectedWeightedGraph() {
        vertices = new HashMap<>();
    }

    public void addVertex(String label) {
        if (!vertices.containsKey(label)) {
            Vertex vertex = new Vertex(label);
            vertices.put(label, vertex);
        }
    }

    public void addEdge(String fromLabel, String toLabel, int weight) {
        if (vertices.containsKey(fromLabel) && vertices.containsKey(toLabel)) {
            Vertex fromVertex = vertices.get(fromLabel);
            Vertex toVertex = vertices.get(toLabel);

            fromVertex.addNeighbor(toVertex, weight);
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

public class DirectedGraph {
    public static void main(String[] args) {
        DirectedWeightedGraph g = new DirectedWeightedGraph();
        g.addVertex("A");
        g.addVertex("B");
        g.addVertex("C");
        g.addEdge("A", "B", 3);
        g.addEdge("A", "C", 2);
        g.addEdge("B", "C", 5);

        g.printGraph();
    }
}

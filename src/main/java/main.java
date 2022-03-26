public class main {
    public static void main(String[] args) {
            int V =57;
            Graph graph = new Graph(V);
            graph.addEdge(0, 1);
            graph.addEdge(0, 4);
            graph.addEdge(1, 2);
            graph.addEdge(1, 3);
            graph.addEdge(1, 1);
            graph.addEdge(2, 3);
            graph.addEdge(3, 4);
            graph.printGraph(graph);
    }
}

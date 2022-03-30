public class main {
    public static void main(String[] args) {
        int V = 5;
        Graph g1 = new Graph(V);
        g1.addEdge(0, 1);
        g1.addEdge(0, 4);
        g1.addEdge(1, 2);
        g1.addEdge(1, 3);

        g1.printGraph(g1);

        int Max = 4;
        DirectedGraph d1 = new DirectedGraph(Max, true);
        for (int i = 0; i < Max; i++) {
            d1.insertarVertice();
        }
        d1.insertarArista(0, 2);
        d1.insertarArista(4, 3);
        d1.insertarArista(3, 2);
        d1.insertarArista(1, 0);

        d1.mostrar();

        WeightedGraph w1 = new WeightedGraph(4);
        w1.vertices();
        w1.insertarValor(2, 3, 4);
        w1.printAll();

        Graph g2 = new Graph(5);

        g2.addEdge(1, 1);
        g2.addEdge(2, 3);
        g2.addEdge(3, 4);
        g2.addEdge(4, 0);

        int nodo1 = 3;
        int nodo2 = 2;

        System.out.println("BFS del grafo1 en el nodo --> " + nodo1);
        g1.BFS(nodo1);
        System.out.println("\nBFS del grafo2 en el nodo --> " + nodo2);
        g2.BFS(nodo2);
        System.out.println("\n");

        Graph geje5 = new Graph(8);
        geje5.addEdge(6, 0);
        geje5.addEdge(0, 2);
        geje5.addEdge(0, 4);
        geje5.addEdge(4, 7);
        geje5.addEdge(7, 3);
        geje5.addEdge(4, 5);
        geje5.addEdge(5, 1);
        geje5.addEdge(5, 7);

        System.out.println("primer resultado:");
        geje5.DFS(1);
        System.out.println("\nsegundo resultado:");
        geje5.DFS(3);
        System.out.println("\ntercer resultado:");
        geje5.DFS(6);

    }
}

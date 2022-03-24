import java.util.LinkedList;

public class Graph {
    int V;
    LinkedList<Integer> adjArray[];

    Graph(int v){
        V = v;
        adjArray = new LinkedList[v];
        for(int i=0;i<V;i++){
            adjArray[i]=new LinkedList();
        }
    }

    void addEdge(int v, int w){
        adjArray[v].add(w);
        adjArray[w].add(v);
    }

    void printGraph(Graph graph){
        System.out.println("1");
        for(int v=0;v<graph.V;v++){
            System.out.println("Lista de Adyaciencia del vertice "+v);
            System.out.println(v);
            for(Integer node:graph.adjArray[v]){
                System.out.println("->"+node);
            }
            System.out.println("\n");
        }
    }
}

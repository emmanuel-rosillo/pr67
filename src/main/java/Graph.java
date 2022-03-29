import java.util.Iterator;
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
        for(int v=0;v<graph.V;v++){
            System.out.println("Lista de Adyaciencia del vertice "+v);
            System.out.println(v);
            for(Integer node:graph.adjArray[v]){
                System.out.println("->"+node);
            }
            System.out.println("\n");
        }
        System.out.println(adjArray);
    }
    void BFS(int s) {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s]=true;
        queue.add(s) ;
        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print (s+" ");
            Iterator<Integer> i = adjArray[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n) ;
                }
            }
        }
    }

}

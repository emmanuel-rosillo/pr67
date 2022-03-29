import java.util.Arrays;

public class WeightedGraph {
    private final int ranmin = 0;
    private int maxran;
    private int x[][];

    public WeightedGraph(int maxran) {
        this.maxran = maxran;
        this.x = new int[maxran][maxran];
    }

    public WeightedGraph() {

    }

    public void vertices(){
        for (int i = 0; i < maxran; i++) {
            for (int j = 0; j < maxran; j++) {
                x[i][j] = 0;
            }
        }
    }
    public void insertarValor(int origen, int destino, int valor){
        x[origen][destino] = valor;
    }
    public void eliminarValor(int origen, int destino){
        x[origen][destino] = 0;
    }
    public void printAll(){
        for (int i = 0; i < maxran; i++) {
            System.out.println(Arrays.toString(x[i]));
        }
    }
}

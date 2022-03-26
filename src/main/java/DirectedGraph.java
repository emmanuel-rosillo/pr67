public class DirectedGraph {
   private final int maxVertices;
   private int numVertices;
   private boolean direct;
   private boolean[][]matrizAdy;

    public DirectedGraph(int maxVertices, int numVertices, boolean direct, boolean[][] matrizAdy) {
        this.maxVertices = maxVertices;
        numVertices = 0;
        this.direct = direct;
        this.matrizAdy = new boolean[maxVertices][maxVertices];
    }

    public int getMaxVertices() {
        return maxVertices;
    }

    public int getNumVertices() {
        return numVertices;
    }

    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }

    public boolean isDirect() {
        return direct;
    }

    public void setDirect(boolean direct) {
        this.direct = direct;
    }

    public boolean[][] getMatrizAdy() {
        return matrizAdy;
    }

    public void setMatrizAdy(boolean[][] matrizAdy) {
        this.matrizAdy = matrizAdy;
    }
}

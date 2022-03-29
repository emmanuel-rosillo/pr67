public class DirectedGraph {
    private final int maxVertices;
    private int numVertices;
    private boolean direct;
    private boolean[][] matrizAdy;

    public DirectedGraph(int maxVertices, int numVertices, boolean direct, boolean[][] matrizAdy) {
        this.maxVertices = maxVertices;
        numVertices = 0;
        this.direct = direct;
        this.matrizAdy = new boolean[maxVertices][maxVertices];
    }

    public DirectedGraph(int max, boolean b) {
        this.maxVertices = max;
        this.direct =b;
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

    public void insertarVertice() {
        if (maxVertices == numVertices) {
            System.out.println("supera el numero de nodos");
        } else {
            for (int i = 0; i < numVertices; i++) {
                matrizAdy[i][numVertices] = false;
            }
            for (int i = 0; i < numVertices; i++) {
                matrizAdy[numVertices][i] = false;
            }
            numVertices++;
        }
    }

    public void insertarArista(int a, int b) {
        if ((a < numVertices) && (a >= 0) && (b < numVertices) && (b >= 0)) {
            matrizAdy[a][b] = true;
        }
    }

    public void eliminarArista(int a, int b) {
        if ((a < numVertices) && (a >= 0) && (b < numVertices) && (b >= 0)) {
            matrizAdy[a][b] = false;
        }
    }

    public boolean search(int a, int b) {
        if ((a < numVertices) && (a >= 0) && (b < numVertices) && (b >= 0)) {
            return matrizAdy[a][b];
        } else {
            return false;
        }
    }

    public int columna(int a) {
        int resultado = 0;
        if ((a < numVertices) && (a >= 0)) {
            for (int i = 0; i < numVertices; i++) {
                if (matrizAdy[i][a]) {
                    resultado++;
                }
            }
        }
        return resultado;
    }

    public int fila(int a) {
        int resultado = 0;
        if ((a < numVertices) && (a >= 0)) {
            for (int c = 0; c < numVertices; c++) {
                if (matrizAdy[a][c]) {
                    resultado++;
                }
            }
        }
        return resultado;
    }

    public int incidencia(int a) {
        int resultado = 0;
        if ((a < numVertices) && (a >= 0)) {
            if (!direct) {
                resultado = columna(a);
            } else {
                resultado = columna(a) + fila(a);
            }
        }
        return resultado;
    }

    public int tamaño() {
        int resultado = 0;
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if (matrizAdy[i][j]) {
                    if (direct || i >= j) {
                        resultado++;
                    }
                }
            }

        }
        return resultado;

    }

    public void mostrar() {
        System.out.println("matriz -> " + numVertices + " vertices ");
        if (direct) {
            System.out.println("es un grafo dirigido");
        } else {
            System.out.println("no es un grafo dirigido");
        }
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if (matrizAdy[i][j]) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            }
            System.out.println();
        }
    }
}

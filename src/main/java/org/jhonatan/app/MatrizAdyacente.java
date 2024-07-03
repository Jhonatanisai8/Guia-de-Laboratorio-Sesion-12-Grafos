package org.jhonatan.app;
public class MatrizAdyacente {

    private int n;
    private int[][] matriz;

    public MatrizAdyacente(int n) {
        this.n = n;
        matriz = new int[this.n][this.n];
        //se inicializa la matrix en o 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = 0;
            }
        }
    }

    public void agregar(int i, int j) {
        matriz[i][j] += 1;
    }

    public void remover(int i, int j) {
        if (matriz[i][j] > 0) {
            matriz[i][j] -= 1;
        }
    }

    public void imprimir() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}

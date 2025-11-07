package org.model.matriz;

public class MatrizNumerica {
    private String nomeMatriz;
    private int[][] matrizNumeros;

    // Construtor padrão
    public MatrizNumerica() {
        this.nomeMatriz = "Matriz Desconhecida";
        this.matrizNumeros = new int[3][3]; // inicializada com zeros
    }

    // Construtor com parâmetros
    public MatrizNumerica(String nomeMatriz, int[][] matrizNumeros) {
        this.nomeMatriz = nomeMatriz;
        this.matrizNumeros = matrizNumeros;
    }

    public void imprimirMatriz() {
        System.out.println("Matriz: " + nomeMatriz);
        for (int[] linha : matrizNumeros) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public boolean verificarDiagonal(int valorMinimo) {
        for (int i = 0; i < matrizNumeros.length; i++) {
            if (matrizNumeros[i][i] <= valorMinimo) return false;
        }
        return true;
    }
}


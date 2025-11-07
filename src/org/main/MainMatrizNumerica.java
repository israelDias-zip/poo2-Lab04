package org.main;

import org.model.matriz.MatrizNumerica;

public class MainMatrizNumerica {
    public static void main(String[] args) {
        int[][] matriz = {
                {5, 1, 2},
                {0, 8, 3},
                {4, 2, 9}
        };

        MatrizNumerica mn = new MatrizNumerica("Matriz A", matriz);
        mn.imprimirMatriz();
        System.out.println("Diagonal principal > 4? " + mn.verificarDiagonal(4));
    }
}

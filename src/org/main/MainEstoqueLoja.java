package org.main;

import org.model.estoque.EstoqueLoja;

public class MainEstoqueLoja {
    public static void main(String[] args) {
        int[][] lotes = {
                {100, 50},
                {80, 90},
                {120, 30},
                {200, 180}
        };

        EstoqueLoja estoque = new EstoqueLoja("Notebook", lotes);
        estoque.imprimirEstoque();
        System.out.println("Algum lote crítico (>100 vendidos)? " + estoque.verificarLoteCritico(100));
    }
}


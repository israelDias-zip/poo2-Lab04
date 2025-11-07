package org.model.cinema;

public class Cinema {
    private String nomeCinema;
    private boolean[][] assentos;

    // Construtor padrão
    public Cinema() {
        this.nomeCinema = "Cinema Desconhecido";
        this.assentos = new boolean[5][5]; // 5 fileiras, 5 assentos cada
    }

    // Construtor com parâmetros
    public Cinema(String nomeCinema, boolean[][] assentos) {
        this.nomeCinema = nomeCinema;
        this.assentos = assentos;
    }

    public void imprimirAssentos() {
        System.out.println("Cinema: " + nomeCinema);
        for (int i = 0; i < assentos.length; i++) {
            System.out.print("Fileira " + (i + 1) + ": ");
            for (boolean ocupado : assentos[i]) {
                System.out.print((ocupado ? "[X]" : "[ ]") + " ");
            }
            System.out.println();
        }
    }

    public boolean verificarLotacaoFileira(int numFileira, int limiteOcupacao) {
        if (numFileira < 1 || numFileira > assentos.length) {
            System.out.println("Número de fileira inválido!");
            return false;
        }

        int ocupados = 0;
        for (boolean ocupado : assentos[numFileira - 1]) {
            if (ocupado) ocupados++;
        }

        return ocupados > limiteOcupacao;
    }
}

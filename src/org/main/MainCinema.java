package org.main;

import org.model.cinema.Cinema;

public class MainCinema {
    public static void main(String[] args) {
        boolean[][] assentos = {
                {true, false, true, false, true},
                {true, true, true, true, true},
                {false, false, false, false, false},
                {true, false, true, false, false},
                {false, true, true, false, false}
        };

        Cinema cinema = new Cinema("CineTop", assentos);
        cinema.imprimirAssentos();
        System.out.println("Fileira 2 está acima do limite (3)? " + cinema.verificarLotacaoFileira(2, 3));
    }
}


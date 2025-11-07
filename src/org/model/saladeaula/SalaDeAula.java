package org.model.saladeaula;

public class SalaDeAula {
    private String nomeTurma;
    private int[][] notasAlunos;

    // Construtor padrão
    public SalaDeAula() {
        this.nomeTurma = "Turma Desconhecida";
        this.notasAlunos = new int[5][3]; // 5 alunos, 3 notas cada
    }

    // Construtor com parâmetros
    public SalaDeAula(String nomeTurma, int[][] notasAlunos) {
        this.nomeTurma = nomeTurma;
        this.notasAlunos = notasAlunos;
    }

    public void imprimirInformacoes() {
        System.out.println("Turma: " + nomeTurma);
        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            for (int nota : notasAlunos[i]) {
                System.out.print(nota + " ");
            }
            System.out.println();
        }
    }

    public boolean verificarNotasAcima(int valorMinimo) {
        for (int[] aluno : notasAlunos) {
            for (int nota : aluno) {
                if (nota < valorMinimo) return false;
            }
        }
        return true;
    }
}


package PesquisaOrdenacao;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

/**
 * Classe principal para ordenar uma lista de alunos
 */
public class PrincipalOrdenaAlunos {
    public static void main(String[] args) {
        ArrayList<Aluno> lista = new ArrayList<>();
        Random gerador = new Random();

        // Loop para adicionar 60000 alunos na lista
        for (int i = 0; i < 60000; i++) {
            lista.add(new Aluno(Util.gerarPalavra(3), gerador.nextInt(18, 70)));
        }

        // Testes de ordenacao da lista de alunos em diferentes Threads

        // Ordena pelo sort do java
        new Thread() {
            public void run() {
                Collections.sort(lista);
                System.out.println("Feito.... sort java");
            }
        }.start();

        // Ordena pelo metodo bolha
        new Thread() {
            public void run() {
                Ordenacao.bolhaAluno(lista);
                System.out.println("Feito.... Bolha");
            }
        }.start();

        // Ordena pelo metodo selecao
        new Thread() {
            public void run() {
                Ordenacao.selecaoAluno(lista);
                System.out.println("Feito.... Selecao");
            }
        }.start();

        // Ordena pelo metodo insercao
        new Thread() {
            public void run() {
                Ordenacao.insercaoAluno(lista);
                System.out.println("Feito.... Insercao");
            }
        }.start();
    }
}

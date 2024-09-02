package PesquisaOrdenacao;

import java.util.ArrayList;

public class PrincipalOrdenaNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        PesquisaOrdenacao.Util.gerarNumerosLista(lista, 100, 20);
        PesquisaOrdenacao.Util.exibirDados(lista);

        // System.out.println("=======================");
        // Ordenacao.bolha(lista);
        // Util.exibirDados(lista);

        // System.out.println("=======================");
        // Ordenacao.selecao(lista);
        // Util.exibirDados(lista);

        System.out.println("========================");
        Ordenacao.selecao(lista);
        Util.exibirDados(lista);
    }

}

package PesquisaOrdenacao;

import java.util.ArrayList;

public class PrincipalOrdenaPalavras {
    public static void main(String[] args) {
        ArrayList<String> listaPalavra = new ArrayList<>();

        Util.inserePalavraLista(listaPalavra, 5, 20);
        Util.exibirDados(listaPalavra);
        System.out.println("=====================");
        // Ordenacao.bolhaPalavra(listaPalavra);
        // Util.exibirDados(listaPalavra);

        // Ordenacao.selecaoPalavra(listaPalavra);
        // Util.exibirDados(listaPalavra);

        Ordenacao.insercaoPalavra(listaPalavra);
        Util.exibirDados(listaPalavra);
    }
}

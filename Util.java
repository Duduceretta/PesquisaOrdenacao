package PesquisaOrdenacao;

import java.util.Random;
import java.util.ArrayList;

/**
 * Classe que contem metodos com diversas funcionalidades
 */
public class Util {

    /**
     * Metodo que gera numeros aleatorios e adiciona em uma lista
     * 
     * @param lista      - Lista que irá conter os numeros gerados
     * @param tamanho    - Intervalo que os numeros serao gerados
     * @param quantidade - Quantidade de numeros gerados
     */
    public static void gerarNumerosLista(ArrayList<Integer> lista, int tamanho, int quantidade) {
        Random aleatorio = new Random();
        for (int i = 0; i < quantidade; i++) {
            lista.add(aleatorio.nextInt(tamanho));
        }
    }

    /**
     * Metodo que gera palavras aleatoriamente
     * 
     * @param tamanho - Tamanho da palavra
     * @return - Retorna a palavra em forma de String
     */
    public static String gerarPalavra(int tamanho) {
        StringBuilder alfabeto = new StringBuilder("abcdefghijklmnopqrstuvwxyz ");
        Random aleatorio = new Random();
        StringBuilder palavra = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            palavra.append(alfabeto.charAt(aleatorio.nextInt(alfabeto.length())));
        }
        return palavra.toString();
    }

    /**
     * Metodo que insere as palavras geradas em uma lista
     * 
     * @param lista      - Lista que ira conter as palavras geradas
     * @param tamanho    - Tamanho da Palavra
     * @param quantidade - Quantidade de palavras a serem geradas
     */
    public static void inserePalavraLista(ArrayList<String> lista, int tamanho, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            lista.add(gerarPalavra(tamanho));
        }
    }

    /**
     * Metodo estatico para mostrar elementos de qualquer lista
     * 
     * @param lista - Guarda numeros ou palavras
     */
    @SuppressWarnings("rawtypes")
    public static void exibirDados(ArrayList lista) {
        for (Object item : lista) {
            System.out.println(item);
        }
    }

}

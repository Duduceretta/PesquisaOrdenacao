package PesquisaOrdenacao;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Classe que contem os principais metodos de ordenacao
 */
public class Ordenacao {

    /**
     * Metodo estatico que implementa a ordenacao por bolha para numeros
     * 
     * @param lista - Lista que contem os numeros a serem ordenados
     */
    public static void bolha(ArrayList<Integer> lista) {
        boolean houveTroca = true;
        int auxiliar;
        do {
            houveTroca = false;
            for (int i = 0; i < lista.size() - 1; i++) {
                if (lista.get(i) > lista.get(i + 1)) {
                    houveTroca = true;
                    auxiliar = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, auxiliar);
                }
            }
        } while (houveTroca);
    }

    /**
     * Metodo estatico que implementa a ordenacao por bolha para palavras
     * 
     * @param lista - Lista que contem as palavras a serem ordenadas
     */
    public static void bolhaPalavra(ArrayList<String> lista) {
        boolean houveTroca = true;
        String auxiliar;
        do {
            houveTroca = false;
            for (int i = 0; i < lista.size() - 1; i++) {
                if (lista.get(i).compareTo(lista.get(i + 1)) > 0) {
                    houveTroca = true;
                    auxiliar = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, auxiliar);
                }
            }
        } while (houveTroca);
    }

    /**
     * Metodo estatico que implementa a ordenacao por bolha para objetos do tipo
     * Aluno
     * 
     * @param lista - Lista com os objetos do tipo Aluno
     */
    public static void bolhaAluno(ArrayList<Aluno> lista) {
        boolean houveTroca = true;
        // Aluno auxiliar;
        do {
            houveTroca = false;
            for (int i = 0; i < lista.size() - 1; i++) {
                Aluno aluno1 = lista.get(i);
                Aluno aluno2 = lista.get(i + 1);

                if (aluno1.getNome().compareTo(aluno2.getNome()) == 0) {
                    if (aluno1.getIdade() > aluno2.getIdade()) {
                        // auxiliar = lista.get(i);
                        // lista.set(i, lista.get(i + 1));
                        // lista.set(i + 1, auxiliar);
                        Collections.swap(lista, i, i + 1);
                        houveTroca = true;
                    }
                } else if (aluno1.getNome().compareTo(aluno2.getNome()) > 0) {
                    // auxiliar = lista.get(i);
                    // lista.set(i, lista.get(i + 1));
                    // lista.set(i + 1, auxiliar);

                    Collections.swap(lista, i, i + 1);
                    houveTroca = true;
                }
            }
        } while (houveTroca);
    }

    /**
     * Metodo estatico que implementa a ordenacao por selecao para numeros
     * 
     * @param lista - Lista que contem os numeros a serem ordernados
     */
    public static void selecao(ArrayList<Integer> lista) {
        int i, j, posicaoMenor, auxiliar;

        for (i = 0; i < lista.size(); i++) {
            posicaoMenor = i;
            for (j = i + 1; j < lista.size(); j++) {
                if (lista.get(j) < lista.get(posicaoMenor)) {
                    posicaoMenor = j;
                }
            }

            if (posicaoMenor != i) {
                auxiliar = lista.get(i);
                lista.set(i, lista.get(posicaoMenor));
                lista.set(posicaoMenor, auxiliar);
            }
        }
    }

    /**
     * Metodo estatico que implementa a ordenacao por selecao para palavras
     * 
     * @param lista - Lista que contem as palavras a serem ordenadas
     */
    public static void selecaoPalavra(ArrayList<String> lista) {
        int i, j, posicaoMenor;
        String auxiliar;

        for (i = 0; i < lista.size(); i++) {
            posicaoMenor = i;
            for (j = i + 1; j < lista.size(); j++) {
                if (lista.get(j).compareTo(lista.get(posicaoMenor)) < 0) {
                    posicaoMenor = j;
                }
            }
            if (posicaoMenor != i) {
                auxiliar = lista.get(i);
                lista.set(i, lista.get(posicaoMenor));
                lista.set(posicaoMenor, auxiliar);
            }
        }

    }

    /**
     * Metodo estatico que implementa a ordenacao por selecao para objetos do tipo
     * Aluno
     * 
     * @param lista - Lista que contem os objetos do tipo Aluno
     */
    public static void selecaoAluno(ArrayList<Aluno> lista) {
        int i, j, posicaoMenor;
        Aluno auxiliar, aluno1, aluno2;

        // Loop externo que inicializa a variavel posicaoMenor
        for (i = 0; i < lista.size(); i++) {
            posicaoMenor = i;
            aluno1 = lista.get(posicaoMenor);
            // Loop interno para achar a posicao do menor aluno
            for (j = i + 1; j < lista.size(); j++) {
                aluno2 = lista.get(j);
                // Compara os nomes e caso forem iguais compara pelas idades
                if (aluno2.getNome().compareTo(aluno1.getNome()) == 0) {
                    if (aluno2.getIdade() < aluno1.getIdade()) {
                        posicaoMenor = j;
                        aluno1 = lista.get(posicaoMenor);
                    }
                } else if (aluno2.getNome().compareTo(aluno1.getNome()) < 0) {
                    posicaoMenor = j;
                    aluno1 = lista.get(posicaoMenor);
                }
            }

            // Se a posicao do menor elemento for diferente de i, faz - se a troca
            if (posicaoMenor != i) {
                auxiliar = lista.get(i);
                lista.set(i, lista.get(posicaoMenor));
                lista.set(posicaoMenor, auxiliar);
            }
        }
    }

    /**
     * Metodo estatico que implementa a ordenacao por insercao para numeros
     * 
     * @param lista - Lista que contem os numeros a serem ordenados
     */
    public static void insercao(ArrayList<Integer> lista) {
        int i, j, chave;
        for (i = 1; i < lista.size(); i++) {
            chave = lista.get(i);
            for (j = i - 1; j >= 0 && chave < lista.get(j); j--) {
                lista.set(j + 1, lista.get(j));
            }
            lista.set(j + 1, chave);
        }
    }

    /**
     * Metodo estatico que implementa a ordenacao por insercao para palavras
     * 
     * @param lista - Lista que contem as palavras a serem ordenadas
     */
    public static void insercaoPalavra(ArrayList<String> lista) {
        int i, j;
        String chave;
        for (i = 1; i < lista.size(); i++) {
            chave = lista.get(i);
            for (j = i - 1; j >= 0 && chave.compareTo(lista.get(j)) < 0; j--) {
                lista.set(j + 1, lista.get(j));
            }
            lista.set(j + 1, chave);
        }

    }

    /**
     * Metodo estatico que implementa a ordenacao por insercao para objetos do tipo
     * Aluno
     * 
     * @param lista - Lista com os objetos do tipo Aluno
     */
    public static void insercaoAluno(ArrayList<Aluno> lista) {
        int i, j;
        Aluno chave, aluno2;
        for (i = 1; i < lista.size(); i++) {
            chave = lista.get(i);
            for (j = i - 1; j >= 0; j--) {
                aluno2 = lista.get(j);
                if (chave.getNome().compareTo(aluno2.getNome()) < 0) {
                    lista.set(j + 1, aluno2);
                } else if (chave.getNome().compareTo(aluno2.getNome()) == 0) {
                    if (chave.getIdade() < aluno2.getIdade()) {
                        lista.set(j + 1, aluno2);
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
            lista.set(j + 1, chave);
        }
    }
}

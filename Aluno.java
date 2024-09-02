package PesquisaOrdenacao;

/**
 * Classe Aluno para gerar objetos com nome e idade
 */
public class Aluno implements Comparable<Aluno> {
    private String nome;
    private int idade;

    /**
     * Construtor do aluno
     * 
     * @param nome  - Nome do aluno
     * @param idade - Idade do aluno
     */
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString() {
        return "Aluno [nome = " + nome + ", idade = " + idade + "]";
    }

    /**
     * Metodo que compara o nome e a idade dos alunos
     * 
     * @param outroAluno - Outro aluno a ser comparado
     * @return - Retorna um int, -1 se o nome do aluno for menor, 1 caso for maior;
     *         Se forem iguais retorna 0, e entao compara as idades seguindo a mesma
     *         logica
     */
    public int compareTo(Aluno outroAluno) {
        // Compara os nomes e verifica qual e o maior
        int comparaNome = this.nome.compareTo(outroAluno.nome);
        if (comparaNome != 0) {
            return comparaNome;
        }
        // Caso os nome forem iguais compara as idades
        return Integer.compare(this.idade, outroAluno.idade);
    }

}

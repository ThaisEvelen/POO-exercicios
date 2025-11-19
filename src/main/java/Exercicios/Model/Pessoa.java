package Exercicios.Model;

public class Pessoa {
    private String nome;
    private Livro[] livros;

    public Pessoa(String nome) {
        this.nome = nome;
        this.livros = new Livro[0]; // começa vazio
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Livro[] getLivros() {
        return livros;
    }
    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }
}

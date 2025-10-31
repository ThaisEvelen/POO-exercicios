package Exercicios;

public class Usuario extends Pessoa {
    private int idade;
    private Emprestimo[] historicoEmprestimos;

    public Usuario(String nome, int idade, Emprestimo[] historicoEmprestimos, Livro[] livros) {
        super(nome, livros);
        this.idade = idade;
        this.historicoEmprestimos = historicoEmprestimos;
    }

    public int getIdade() {
        return idade;
    }

    public Emprestimo[] getHistoricoEmprestimos() {
        return historicoEmprestimos;
    }
}
package Exercicios.Model;

import Exercicios.Interfaces.AutorInterface;

public class Usuario extends Pessoa implements AutorInterface {

    private int idade;
    private Emprestimo[] historicoEmprestimos;

    public Usuario(String nome, int idade, Emprestimo[] historicoEmprestimos, Livro[] livros) {
        super(nome);
        this.idade = idade;
        this.historicoEmprestimos = historicoEmprestimos;

        this.setLivros(livros);
    }

    @Override
    public void publicar() {
        System.out.println("Usuario publicado");
    }

    public void setHistoricoEmprestimos(Emprestimo[] historicoEmprestimos) {
        this.historicoEmprestimos = historicoEmprestimos;
    }

    public int getIdade() {
        return idade;
    }

    public Emprestimo[] getHistoricoEmprestimos() {
        return historicoEmprestimos;
    }
}

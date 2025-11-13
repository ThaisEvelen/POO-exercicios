package Exercicios.Model;


import Exercicios.Interfaces.AutorInterface;

import java.sql.SQLOutput;

public class Usuario extends Pessoa implements AutorInterface {
    @Override
    public void publicar() {
        System.out.println("Usuario publicado");
    }

    private int idade;
    private Emprestimo[] historicoEmprestimos;

    public Usuario(String nome, int idade, Emprestimo[] historicoEmprestimos, Livro[] livros) {
    super(nome, livros);
        this.idade = idade;
        this.historicoEmprestimos = historicoEmprestimos;
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
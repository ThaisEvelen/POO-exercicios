package Exercicios;



import Exercicios.Model.Autor;
import Exercicios.Model.Emprestimo;
import Exercicios.Model.Livro;
import Exercicios.Model.Usuario;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor("Jessica Felix", "Brasileira", new Livro[0]);
        String nome = autor.getNome();

        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia");
        livro.setDisponivel(false);

        Usuario usuario = new Usuario("Lucas Rafael", 25, new Emprestimo[0], new Livro[]{livro});

        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);

        livro.validarDisponibilidade();
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + autor.getNome());
        System.out.println("Gênero: " + livro.getGenero());
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolução: " + emprestimo.getDataDevolucao());
    }
}

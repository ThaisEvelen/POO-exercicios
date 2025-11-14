package Exercicios;

import Exercicios.Model.*;
import Exercicios.Model.TipoAutor;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor("Jessica Felix", "Brasileira", TipoAutor.Usuario, new Livro[0]) {
            @Override
            public void publicar() {
                System.out.println("Publicando artigo...");
            }
        };

        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);
        System.out.println("Artigo: " + artigo.getTitulo());
        System.out.println("Gênero do Artigo: " + artigo.getGenero());
        System.out.println("Publicado: " + artigo.isPublicado());

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
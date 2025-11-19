package Exercicios.Model;

import Exercicios.Interfaces.Publicavel;


public class EstrategiaPublicacaoLivro implements Publicavel {
    @Override
    public void publicar() {
        System.out.println("Publicando um livro...");
    }
}

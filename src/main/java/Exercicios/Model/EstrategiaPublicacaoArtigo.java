package Exercicios.Model;

import Exercicios.Interfaces.Publicavel;

public class EstrategiaPublicacaoArtigo implements Publicavel {
    @Override
    public void publicar() {
        System.out.println("Publicando um artigo ...");
    }
}

package Exercicios.Model;

import Exercicios.Interfaces.Publicavel;

public class Autor extends Pessoa implements Publicavel {
    private String nacionalidade;
    private TipoAutor tipo;

    // estratégia de publicação
    private Publicavel estrategiaPublicacao;

    public Autor(String nome, String nacionalidade, TipoAutor tipo) {
        super(nome);
        this.nacionalidade = nacionalidade;
        this.tipo = tipo;
    }


    public String getNacionalidade() {
        return nacionalidade;
    }

    public TipoAutor getTipo() {
        return tipo;
    }

    public boolean isUsuario() {
        return this.tipo == TipoAutor.Usuario;
    }

    public Livro[] getObrasPublicadas() {
        return getLivros();
    }

    public Livro[] getObrasPublicadasPorGenero(String genero) {
        Livro[] obras = getLivros();
        int count = 0;

        for (Livro livro : obras) {
            if (livro.getGenero().equalsIgnoreCase(genero)) {
                count++;
            }
        }

        Livro[] filtrados = new Livro[count];
        int index = 0;

        for (Livro livro : obras) {
            if (livro.getGenero().equalsIgnoreCase(genero)) {
                filtrados[index++] = livro;
            }
        }

        return filtrados;
    }

    public void setEstrategiaPublicacao(Publicavel estrategia) {
        this.estrategiaPublicacao = estrategia;
    }

    @Override
    public void publicar() {
        if (estrategiaPublicacao == null) {
            throw new IllegalStateException(
                    "Nenhuma estratégia de publicação foi definida para este autor."
            );
        }

        estrategiaPublicacao.publicar();
    }
}

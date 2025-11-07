package Exercicios.Model;


public class Livro {
    private String titulo;
    private Autor autor;
    private String genero;
    private boolean disponivel = true;

    public Livro(String titulo, Autor autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void validarDisponibilidade() {
        if (disponivel) {
            System.out.println("O livro está disponível");
        } else {
            System.out.println("O livro não está disponível");
        }
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}


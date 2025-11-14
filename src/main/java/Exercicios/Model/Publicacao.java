package Exercicios.Model;

public abstract class Publicacao {
    private String titulo;
    private Autor autor;

    public Publicacao(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
   public Autor getAutor() {
        return autor;
   }

    public abstract void validarPublicacao();
}



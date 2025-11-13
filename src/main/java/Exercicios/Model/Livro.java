package Exercicios.Model;


public class Livro extends Publicacao{


    private String genero;
    private boolean disponivel = true;

    public Livro(String titulo, Autor autor, String genero) {
        super(titulo,autor);
        this.genero = genero;
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

    @Override
    public void validadarPublicacao(){
        System.out.println("Validando publicacao de Livro");
    }
}


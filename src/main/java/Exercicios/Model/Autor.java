package Exercicios.Model;
import Exercicios.Model.TipoAutor;

public abstract class Autor extends Pessoa {
    private String nacionalidade;
    private TipoAutor tipo;

    public Autor(String nome, String nacionalidade, Livro[] livros, TipoAutor tipo) {
        super(nome, livros);
        this.nacionalidade = nacionalidade;
        this.tipo = tipo;
    }

    public String getNacionalidade() {
        return nacionalidade;
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
    public TipoAutor getTipo(){
        return tipo;
    }
    public boolean isUsuario(){
        return this.tipo == TipoAutor.Usuario;
    }
    @Override
    public String getNome() {
        return super.getNome();
    }
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    public abstract void publicar();
}
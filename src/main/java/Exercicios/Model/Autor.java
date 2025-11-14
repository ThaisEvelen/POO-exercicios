package Exercicios.Model;

public abstract class Autor extends Pessoa {
    private String nacionalidade;
    private TipoAutor tipo;

    public Autor(String nome, String nacionalidade, TipoAutor tipo, Livro[] livros) {
        super(nome, livros);
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
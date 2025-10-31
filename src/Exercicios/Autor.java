package Exercicios;

public class Autor extends Pessoa {
    private String nacionalidade;

    public Autor(String nome, String nacionalidade, Livro[] livros) {
        super(nome, livros);
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public Livro[] getObrasPublicadas() {
        return getLivros();
    }

    public Livro[] getObrasPublicadasPorGenero(String genero) {
        // Filtra os livros do autor por gênero
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
}
package com.mycompany.app;
import Exercicios.Autor;
import Exercicios.Livro;
import Exercicios.Pessoa;
import org.junit.Test;
import static org.junit.Assert.*;
public class PessoaTest {
    @Test
    public void testGetNome() {
        // Cria uma instância da classe Pessoa
        Autor autor = new Autor("JGeorge Orwell", "Americano", new Livro[0]);

        Livro[] meusLivros = { new Livro("1984", autor,"Distopia")};

        Pessoa pessoa = new Pessoa("Jess", meusLivros);

        assertEquals("Jess", pessoa.getNome());
        assertEquals("1984", pessoa.getLivros()[0].getTitulo());


    }
}
package com.mycompany.app;


import Exercicios.Model.*;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class PessoaTest {
    @Test
    public void testGetNome() {

        Autor autor = new Autor("JGeorge Orwell", "Americano", new Livro[0]);

        Livro[] meusLivros = { new Livro("1984", autor,"Distopia")};

        Pessoa pessoa = new Pessoa("Jess", meusLivros);

        assertEquals("Jess", pessoa.getNome());
        assertEquals("1984", pessoa.getLivros()[0].getTitulo());


    }
    @Test
    public void testLivro() {
        Autor autor = new Autor("George Orwell", "Inglês", new Livro[1]);
        Livro livro = new Livro("1984", autor, "Ficção");
        assertEquals("1984", livro.getTitulo());
        assertEquals(autor, livro.getAutor());
    }

    @Test
    public void testUsuarioComEmprestimoAtualizadoDepois() throws Exception {

        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");


        Autor autor = new Autor("J.K. Rowling", "Britânica", new Livro[2]);
        Livro livro = new Livro("Harry Potter", autor, "Fantasia");
        Livro[] livros = { livro };


        Usuario usuario = new Usuario("Thais", 33, new Emprestimo[0], livros);


        Date retirada = fmt.parse("2025-10-01");
        Date devolucao = fmt.parse("2025-10-10");
        Emprestimo emprestimo = new Emprestimo(retirada, devolucao, livro, usuario);


        usuario.setHistoricoEmprestimos(new Emprestimo[]{ emprestimo });


        assertEquals("Thais", usuario.getNome());
        assertEquals(33, usuario.getIdade());
        assertArrayEquals(livros, usuario.getLivros());
        assertEquals(1, usuario.getHistoricoEmprestimos().length);
        assertEquals(emprestimo, usuario.getHistoricoEmprestimos()[0]);


        assertEquals(livro, emprestimo.getLivro());
        assertEquals(usuario, emprestimo.getUsuario());
        assertEquals(retirada, emprestimo.getDataRetirada());
        assertEquals(devolucao, emprestimo.getDataDevolucao());
    }
}


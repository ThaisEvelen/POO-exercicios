package com.mycompany.app;
import Exercicios.Model.*;
import Exercicios.Model.Artigo;
import Exercicios.Model.TipoAutor;
import org.junit.Test;
import static org.junit.Assert.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class PessoaTest {
    @Test
    public void testGetNome() {

        Autor autor = new Autor("George Orwell", "Americano", TipoAutor.Tradicional, new Livro[0]) {
            @Override
            public void publicar() {

            }
        };

        Livro[] meusLivros = { new Livro("1984", autor,"Distopia")};

        Pessoa pessoa = new Pessoa("Jess", meusLivros);

        assertEquals("Jess", pessoa.getNome());
        assertEquals("1984", pessoa.getLivros()[0].getTitulo());


    }
    @Test
    public void testLivro() {
        Autor autor = new Autor("George Orwell", "Inglês", TipoAutor.Tradicional, new Livro[1]) {
            @Override
            public void publicar() {

            }
        };
        Livro livro = new Livro("1984", autor, "Ficção");
        assertEquals("1984", livro.getTitulo());
        assertEquals(autor, livro.getAutor());
    }

    @Test
    public void testUsuarioComEmprestimoAtualizadoDepois() throws Exception {

        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");


        Autor autor = new Autor("J.K. Rowling", "Britânica", TipoAutor.Tradicional, new Livro[2]) {
            @Override
            public void publicar() {

            }
        };
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
    @Test
    public void deveCriarArtigoCorretamente() {

        Autor autor = new Autor("Jessica", "Brasileira", TipoAutor.Usuario, new Livro[0]) {
            @Override
            public void publicar() {}
        };

        Artigo artigo = new Artigo(
                "Entendendo Compiladores",
                autor,
                "tecnologia",
                true
        );

        assertEquals("Entendendo Compiladores", artigo.getTitulo());
        assertEquals(autor, artigo.getAutor());
        assertEquals("tecnologia", artigo.getGenero());
        assertTrue(artigo.isPublicado());
    }


    @Test
    public void deveValidarPublicacaoSemErro() {

        Autor autor = new Autor("Mario", "Brasileiro", TipoAutor.Tradicional, new Livro[0]) {
            @Override
            public void publicar() {}
        };

        Artigo artigo = new Artigo("Testando", autor, "educacao", false);

        artigo.validarPublicacao();
    }
}


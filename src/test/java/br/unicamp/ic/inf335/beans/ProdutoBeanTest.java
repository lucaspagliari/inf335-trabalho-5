package br.unicamp.ic.inf335.beans;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class ProdutoBeanTest {

    @Test
    public void testGetCodigo() {
        ProdutoBean produto = new ProdutoBean();
        produto.setCodigo("123");
        assertEquals("123", produto.getCodigo());
    }

    @Test
    public void testGetNome() {
        ProdutoBean produto = new ProdutoBean();
        produto.setNome("Produto 1");
        assertEquals("Produto 1", produto.getNome());
    }

    @Test
    public void testGetDescricao() {
        ProdutoBean produto = new ProdutoBean();
        produto.setDescricao("Descrição do produto");
        assertEquals("Descrição do produto", produto.getDescricao());
    }

    @Test
    public void testGetValor() {
        ProdutoBean produto = new ProdutoBean();
        produto.setValor(100.0);
        assertEquals(100.0, produto.getValor(), 0.01);
    }

    @Test
    public void testGetEstado() {
        ProdutoBean produto = new ProdutoBean();
        produto.setEstado("Novo");
        assertEquals("Novo", produto.getEstado());
    }
}
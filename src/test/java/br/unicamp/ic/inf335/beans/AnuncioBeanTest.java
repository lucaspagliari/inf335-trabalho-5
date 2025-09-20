package br.unicamp.ic.inf335.beans;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class AnuncioBeanTest {

    @Test
    public void testGetProduto() {
        AnuncioBean anuncio = new AnuncioBean();
        ProdutoBean produto = new ProdutoBean();
        anuncio.setProduto(produto);
        assertEquals(produto, anuncio.getProduto());
    }

    @Test
    public void testGetDesconto() {
        AnuncioBean anuncio = new AnuncioBean();
        anuncio.setDesconto(10.0);
        assertEquals(10.0, anuncio.getDesconto(), 0.01);
    }

    @Test
    public void testGetValor() {
        AnuncioBean anuncio = new AnuncioBean();
        ProdutoBean produto = new ProdutoBean();
        produto.setValor(100.0);
        anuncio.setProduto(produto);
        anuncio.setDesconto(10.0);
        assertEquals(90.0, anuncio.getValor(), 0.01);
    }
}

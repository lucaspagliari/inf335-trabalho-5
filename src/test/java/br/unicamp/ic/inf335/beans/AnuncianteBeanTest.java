package br.unicamp.ic.inf335.beans;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


import java.util.ArrayList;

public class AnuncianteBeanTest {

    @Test
    public void testGetNome() {
        AnuncianteBean anunciante = new AnuncianteBean();
        anunciante.setNome("João");
        assertEquals("João", anunciante.getNome());
    }

    @Test
    public void testGetCPF() {
        AnuncianteBean anunciante = new AnuncianteBean();
        anunciante.setCPF("123456789");
        assertEquals("123456789", anunciante.getCPF());
    }

    @Test
    public void testGetAnuncios() {
        AnuncianteBean anunciante = new AnuncianteBean();
        ArrayList<AnuncioBean> anuncios = new ArrayList<>();
        anunciante.setAnuncios(anuncios);
        assertEquals(anuncios, anunciante.getAnuncios());
    }

    @Test
    public void testAddAnuncio() {
        AnuncianteBean anunciante = new AnuncianteBean();
        AnuncioBean anuncio = new AnuncioBean();
        anunciante.addAnuncio(anuncio);
        assertTrue(anunciante.getAnuncios().contains(anuncio));
    }

    @Test
    public void testRemoveAnuncio() {
        AnuncianteBean anunciante = new AnuncianteBean();
        AnuncioBean anuncio = new AnuncioBean();
        anunciante.addAnuncio(anuncio);
        anunciante.removeAnuncio(0);
        assertFalse(anunciante.getAnuncios().contains(anuncio));
    }
}

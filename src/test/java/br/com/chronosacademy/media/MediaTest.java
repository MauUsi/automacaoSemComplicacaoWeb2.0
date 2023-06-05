package br.com.chronosacademy.media;

import org.junit.Test;

import static org.junit.Assert.*;

public class MediaTest {
    @Test
    public void validaAprovado(){
        Media media = new Media();
        String resultado = media.calculaMedia(5.0,5.0);
        assertEquals("Aprovado",resultado);
    }

    @Test
    public void validaReprovado(){
        Media media = new Media();
        String resultado = media.calculaMedia(4.9,5.0);
        assertEquals("Reprovado",resultado);
    }

    @Test
    public void validaNegativo(){
        Media media = new Media();
        String resultado = media.calculaMedia(-1.0,0);
        assertEquals("Valor Negativo",resultado);
    }
}
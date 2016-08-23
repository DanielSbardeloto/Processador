/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uricer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class SequenciaTest {
    
    private int numero[] = {6, 9, 15, -2, 92, 11};
    
    Sequencia processo = new Sequencia(numero);
    
    
    @Test
    public void testValorMinimo() {
        int saida = -2;
        int resultado = processo.valorMinimo();
        assertEquals(resultado, saida);
        
    }
    @Test
    public void testValorMaximo() {
        int saida = 92;
        int resultado = processo.valorMaximo();
        assertEquals(resultado, saida);
        
    }
    @Test
    public void testNumeroDeElementos() {
        int saida = 6;
        int resultado = processo.numeroDeElementos();
        assertEquals(resultado, saida);
        
    }

    
}

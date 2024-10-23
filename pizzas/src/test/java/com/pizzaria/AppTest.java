package com.pizzaria;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        int esperado=2;
        int resultadoReal=App.soma(1, 1);
        assertTrue( esperado == resultadoReal );
    }
}

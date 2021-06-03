package com.mycompany.introdjunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author barbara
 */
class MathUtilTest {
    
    @Test
    void testMdcAParP1() {
        final int a = 6;
        final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcAImparP1(){
        final int a = 9;
        final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcParesP2(){
        final int a = 16;
        final int b = 8;
        final int divisor = 4;
        final int obtido = MathUtil.mdc(a, b);
        //assertEquals(esperado, obtido % divisor);
        assertTrue(obtido % divisor == 0);
    }
    
    @Test
    void testMdcAPositivoP3(){
        final int a = 15;
        final int b = 0;
        final int esperado = 15;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcANegativoP3(){
        final int a = -30;
        final int b = 0;
        final int esperado = 30;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcMParP4(){
        final int a = 9;
        final int b = 3;
        final int m = 2;
        final int esperado = MathUtil.mdc(a*m, b*m);
        final int obtido = m * MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcP5(){
        //se mdc(a,b) == 1, entao mdc(a*b, c) == mdc(b,c)
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int esperado = MathUtil.mdc(a*b, c);
        final int obtido = MathUtil.mdc(b, c);
        System.out.println("Esperado: " + esperado + 
                " Obtido: " + obtido);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcP5Resultado1(){
        //se mdc(a,b) == 1, entao mdc(a*b, c) == mdc(b,c)
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int esperado = 1;
        final int obtido = MathUtil.mdc(b, c);
        System.out.println("Esperado: " + esperado + 
                " Obtido: " + obtido);
        assertEquals(esperado, 1);
    }
    
    @Test
    void testMdcP6(){
        final int a = 8;
        final int b = 2;
        //mdc(a,b) == mdc(b,a)
        final int esperado = MathUtil.mdc(a, b);
        final int obtido = MathUtil.mdc(b, a);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcP7TudoNegativo(){
        final int a = -12;
        final int b = -6;
        final int esperado = 6;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcGeralIndivisiveis(){
        final int a = 30;
        final int b = 12;
        final int esperado = 6;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcMultiplosValores(){
        final int a = 30;
        final int b = 12;
        final int c = 4;
        final int esperado = 2;
        final int obtido = MathUtil.mdc(a, b, c);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcNenhumParametro(){
        assertThrows(IllegalArgumentException.class, () -> MathUtil.mdc());
    }
    
    @Test
    void testMdcNulo(){
        assertThrows(NullPointerException.class, () -> MathUtil.mdc(null));
    }
}

package com.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void sumar_debeRetornarSuma() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    void restar_debeRetornarResta() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.restar(3, 2));
    }
}
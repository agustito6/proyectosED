package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCalculadora extends Main {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sumar() {
        System.out.println("sumar");
        int a = 17;
        int b = 73;
        Calculadora instance = new Calculadora(a, b);
        int expResult = 90;
        int result = instance.sumar(a , b);
        assertEquals(expResult, result);
    }

    @Test
    void restar() {
        fail("Not implemented yet");
    }

    @Test
    void multiplicar() {
        fail("Not implemented yet");
    }

    @Test
    void dividirTest() {
        try{
            int a = 5;
            int b = 0;
            Calculadora calc = new Calculadora(a, b);
            int expResult = 1;
            int result = calc.dividir(a, b);
            assertEquals(expResult, result);
            fail("Deberia haber lanzado una excepción");
        } catch (ArithmeticException e){
            //Prueba satisfactoria
        }
    }
}
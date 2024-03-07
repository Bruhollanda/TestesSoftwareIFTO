package com.example.AtvMDC;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.example.AtvMDC.MathUtil.mdc;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MathUtilTest {

    @ParameterizedTest
    @CsvSource(
            {
                    "4, 2, 2",
                    "8, 4, 4",
                    "3, 1, 1",
                    "6, 3, 3"
            }
    )
    void mdcP1(final int a, final int b, final int esperado) {
        final int resultado = mdc(a, b);
        assertEquals(esperado, resultado);
    }

    @Test
    void mdcP2() {
        final int divisor = 3;
        final int a = 12, b = 6, esperado = 6;
        final int resultado = mdc(a, b);
        assertEquals(esperado, resultado);
        assertEquals(0, resultado % divisor);
    }

    @Test
    void mdcP3Positivo() {
        final int a = 7, b = 0, esperado = 7;
        final int resultado = mdc(a, b);
        assertEquals(esperado, resultado);
    }

    @Test
    void mdcP3Negativo() {
        final int a = -7, b = 0, esperado = 7;
        final int resultado = mdc(a, b);
        assertEquals(esperado, resultado);
    }

    @Test
    void mdcP4() {
        final int m = 7, a = 1, b = 1;
        final int esperado = mdc(m*a, m*b);
        final int resultado = m*mdc(a, b);
        assertEquals(esperado, resultado);
    }

    @Test
    void mdcP6() {
        final int a = 6, b = 2, esperado = mdc(2, 6);
        final int resultado = mdc(a, b);
        assertEquals(esperado, resultado);
    }

    @ParameterizedTest
    @CsvSource(
            {
                    "-4, -2",
                    "4, -2",
                    "-4, 2",
                    "4, 2"
            }
    )
    void mdcP7(final int a, final int b) {
        final int esperado = 2;
        final int resultado = mdc(a, b);
        assertEquals(esperado, resultado);
    }

    @Test
    void mdcP8() {
        final int a = 2, esperado = a;
        final int resultado = mdc(a, a);
        assertEquals(esperado, resultado);
    }

    @ParameterizedTest
    @CsvSource(
            {
                    "7, 3, 1",
                    "7, 7, 7",
            }
    )
    void mdcP12(final int a, final int b, final int esperado) {
        final int resultado = mdc(a, b);
        assertEquals(esperado, resultado);
    }

}
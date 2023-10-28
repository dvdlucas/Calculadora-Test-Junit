package com.mycompany.calculadoratestjunit;
/**
 * Classe que representa uma calculadora simples com operações matemáticas básicas.
 */
public class Calculadora {

    /**
     * Realiza a operação de soma.
     *
     * @param a O primeiro operando.
     * @param b O segundo operando.
     * @return O resultado da soma de a e b.
     */
    public int Soma(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a operação de subtração.
     *
     * @param a O primeiro operando.
     * @param b O segundo operando.
     * @return O resultado da subtração de a e b.
     */
    public int Subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a operação de divisão.
     *
     * @param a O primeiro operando.
     * @param b O segundo operando.
     * @return O resultado da divisão de a por b.
     */
    public int Divisao(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    /**
     * Realiza a operação de multiplicação.
     *
     * @param a O primeiro operando.
     * @param b O segundo operando.
     * @return O resultado da multiplicação de a e b.
     */
    public int Multiplicacao(int a, int b) {
        return a * b;
    }
}

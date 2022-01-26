package com.company;

public class Calculadora {
    private int operando1, operando2;

    public Calculadora (int a, int b){
        this.operando1 = a;
        this.operando2 = b;
    }

    public int sumar (int a, int b){
        return (a + b);
    }

    public int restar (int a, int b){
        return (a + b);
    }
    public int multiplicar (int a, int b){
        if (a == 0 || b == 0){
            return 0;
        }
        if (a == 1){
            return b;
        } else {
            return b + multiplicar (a - 1, b);
        }
    }

    public int dividir(int a, int b){
        if (a == 0) {
            return 0;
        }
        if (b == 0) {
            return 0;
        } else {
            return (a / b);
        }
    }
}
